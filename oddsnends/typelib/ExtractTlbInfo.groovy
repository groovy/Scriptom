/**
 * This creates Java classes that correspond to the constant values from 
 * Windows type libraries.  The runtime parameters are too complex for the
 * command line, so they are defined in the script itself.<p>
 *
 * Type library constants are of three basic types: integer, String (rare),
 * and floating point (very rare). For simplicity's sake, all integer types
 * (byte, short, integer) are coerced to Integer and all floating point types
 * (float, double) are coerced to Double.  Strings are just strings.<p>
 *
 * Use VB6 or VBA to find the library file you need (Project -> References).
 * Name the package appropriately, since there are name collisions with 
 * various related libraries, and you can't depend on the major version
 * of the library to match that of the application.<p>
 *
 * This uses tlbinf32.dll, which ships with VB6.  If you don't have this
 * dll installed, you obviously won't be able to run this script!<p>
 *
 * <ul>
 *   <li>http://support.microsoft.com/kb/239930</li>
 *   <li>http://support.microsoft.com/kb/224331/EN-US/</li>
 * </ul>
 *
 * @author Jason Smith
 */

import org.codehaus.groovy.scriptom.*;
import com.jacob.com.ComFailException;

final PARENT_PACKAGE = 'org.codehaus.groovy.scriptom.tlb'
final SRC_ROOT_PATH  = new File('./src')
SRC_ROOT_PATH.mkdir()

assert PARENT_PACKAGE ==~ /[a-z0-9.]+/
assert SRC_ROOT_PATH.isDirectory()

assert args.size() > 0 
assert new File(args[0]).isFile()

/*
The first argument is a file containing names and locations of type libraries,
formatted as follows.  The locations will vary from machine to machine.
The file locations can be discovered using VBA or VB6.

[
  ['scripting',          'C:/WINDOWS/System32/scrrun.dll'],
  ['office2003',         'C:/Program Files/Common Files/Microsoft Shared/Office11/MSO.dll'],
  ['office2003.excel',   'C:/Program Files/Microsoft Office/OFFICE11/EXCEL.exe'],
  ['office2003.word',    'C:/Program Files/Microsoft Office/OFFICE11/MSWORD.olb'],
  ['office2003.outlook', 'C:/Program Files/Microsoft Office/OFFICE11/MSOutl.olb'],
  ['sapi',               'C:/Program Files/Common Files/Microsoft Shared/Speech/sapi.dll']
].each
*/

evaluate(new File(args[0]).canonicalFile.getText()).each
{lib ->
  assert lib[0] ==~ /[a-z0-9_.]+/
  assert new File(lib[1]).isFile(), "File not found: ${lib[1]}"
  
  File tlbFile = new File(lib[1]).canonicalFile
  
  Scriptom.withMTA
  {
    ActiveXObject application = new ActiveXObject('TLI.TLIApplication')
    def /*TypeLibInfo*/ tlbInfo = application.TypeLibInfoFromFile(tlbFile.path)
    
    println "$lib"
    println "\t${tlbInfo.Name} ${tlbInfo.MajorVersion}.${tlbInfo.MinorVersion}"
    println "\t'${tlbInfo.HelpString}'"
    println()
    
    def targetPath = new File(SRC_ROOT_PATH, "${"$PARENT_PACKAGE.${lib[0]}".replaceAll(/[.]/, '/')}")
    targetPath.mkdirs()
    
    //Delete all the files in the target folder, NOT recursively.
    targetPath.eachFile {file -> file.delete()}
    
    if(tlbInfo.HelpString != "")
      new File(targetPath, 'package.html').write("<html><body>${tlbInfo.HelpString}</body></html>")
  
    tlbInfo.Constants
    .findAll
    {/*ConstantInfo*/ constantInfo ->
      !(constantInfo.Name ==~ /^.*_MIDL_.*$/)
    }
    .each 
    {/*ConstantInfo*/ constantInfo ->
      PrintWriter p = new File(targetPath, "${constantInfo.Name}.java").newPrintWriter()
      try
      {
        printCopyright(p);
        p.println "package ${PARENT_PACKAGE}.${lib[0]};"
        p.println()
        p.println "import java.util.Map;"
        p.println "import java.util.TreeMap;"
        p.println "import java.util.Collections;"
        p.println()
        p.println "/**"
        if(constantInfo.HelpString != "")
          p.println " * ${constantInfo.HelpString}"
        p.println " * @author Jason Smith"
        p.println " */"
        p.println "public final class ${constantInfo.Name}"
        p.println "{"
        p.println "  private ${constantInfo.Name}()"
        p.println "  {"
        p.println "  }"
        
        constantInfo.Members.each
        {/*MemberInfo*/ memberInfo ->
          p.println()
        
          p.println "  /**"
          if(memberInfo.HelpString != "")
            p.println "   * ${memberInfo.HelpString}<p>"
          p.println "   * Value is ${memberInfo.Value.toString()} ${memberInfo.Value instanceof Number && isIntegerType(memberInfo.Value) ? "(0x${Long.toString(memberInfo.Value.longValue() & 0x00000000FFFFFFFFL, 16).toUpperCase()})" : ''}"
          p.println "   */"
             
          //println "${constantInfo.Name}.${memberInfo.Name}"
          if(memberInfo.Value instanceof Number)
          {
            if(isIntegerType(memberInfo.Value))
              p.println "  public static final Integer ${memberInfo.Name} = ${toJavaObject(memberInfo.Value)};"
            else
              p.println "  public static final Double ${memberInfo.Name} = ${toJavaObject(memberInfo.Value)};"              
          }
          else
            p.println "  public static final String ${memberInfo.Name} = ${toJavaString(memberInfo.Value)};"
        }
        
        p.println()
        p.println "  /**"
        p.println "   * A {@code Map} of the symbolic names to constant values."
        p.println "   */"
        p.println "  public static final Map<String,Object> values;"
        p.println "  static"
        p.println "  {"
        p.println "    TreeMap<String,Object> v = new TreeMap<String,Object>();"
        
        constantInfo.Members.each
        {/*MemberInfo*/ memberInfo ->
          p.println "    v.put(\"${memberInfo.Name}\", ${memberInfo.Name});"
        }
        
        p.println "    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));"
        p.println "  }"
        
        p.println "}"
      }
      finally
      {
        p.close()
      }
    }


    PrintWriter p = new File(targetPath, "${tlbInfo.Name}.java").newPrintWriter()
    try
    {
      printCopyright(p);
      p.println "package ${PARENT_PACKAGE}.${lib[0]};"
      p.println()
      p.println "import java.util.Map;"
      p.println "import java.util.TreeMap;"
      p.println "import java.util.Collections;"
      p.println "import org.codehaus.groovy.scriptom.ActiveXObject;"
      p.println()
      p.println "/**"
      p.println " * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}."
      p.println " * @author Jason Smith"
      p.println " */"
      p.println "public final class ${tlbInfo.Name}"
      p.println "{"
      p.println "  private ${tlbInfo.Name}()"
      p.println "  {"
      p.println "  }"


      def progIds = new TreeMap()
      tlbInfo.CoClasses
      .findAll {true}
      .sort {a, b -> a.Name <=> b.Name}
      .each
      {/*CoClassInfo*/ coClassInfo ->
        def wshShell = new ActiveXObject('WScript.Shell')
        
        def progId = null;
        try
        {
          progId = wshShell.RegRead("HKCR\\CLSID\\${coClassInfo.GUID}\\VersionIndependentProgID\\")
        }
        catch(ComFailException e)
        {
          try
          {
            progId = wshShell.RegRead("HKCR\\CLSID\\${coClassInfo.GUID}\\ProgID\\") 
            println "${coClassInfo.Name}: Version-independent ProgId not found.  Using ${progId}."
          }
          catch(ComFailException e2)
          {
            println "ProgID for ${coClassInfo.Name} (${coClassInfo.GUID})not found."
          }
        }
        
        if(progId != null)
          progIds[coClassInfo.Name] = progId  
      }
      

      p.println()
      p.println "  /**"
      p.println "   * A {@code Map} of CoClass names to prog-ids for this type library.<p>"
      p.println "   *"
      p.println "   * Note that some objects that support events do not publish a prog-id."
      p.println "   * This is a known limitation of this library that we hope to resolve in"
      p.println "   * a future release.<p>"
      p.println "   *"
      p.println "   * Supported prog-ids:"
      p.println "   * <ul>"
      progIds.each
      {key, value ->
        p.println "   *   <li><b>$key</b> = $value</li>"
      }
      p.println "   * </ul>"
      p.println "   */"
      p.println "  public final static Map<String,String> progIds;"
      p.println "  static"
      p.println "  {"
      p.println "    TreeMap<String,String> v = new TreeMap<String,String>();"
      
      progIds.each
      {key, value ->
        p.println "    v.put(\"$key\", \"$value\");" 
      }
      p.println "    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));"
      p.println "  }"
	  
	  p.println()
      p.println " /** GUID for this type library. */"
      p.println "  public static final String GUID = \"${tlbInfo.GUID}\";"
      
      tlbInfo.CoClasses
      .findAll {true}
      .sort {a, b -> a.Name <=> b.Name}
      .each
      {/*CoClassInfo*/ coClassInfo ->
        p.println()
        if(coClassInfo.HelpString != "")
        {
          p.println "  /**"
          p.println "   * CoClass: ${coClassInfo.HelpString}"
          p.println "   */"
        }
        else 
        {
          p.println "  /**"
          p.println "   * CoClass: ${coClassInfo.Name}"
          p.println "   */"
        }
        p.println "  public final static String ${coClassInfo.Name} = \"${coClassInfo.DefaultInterface.GUID}\";"
      }
      
      p.println()
      p.println "  /**"
      p.println "   * A {@code Map} of CoClass names to default interface GUIDs for this type library."
      p.println "   */"
      p.println "  public final static Map<String,String> coClasses;"
      p.println "  static"
      p.println "  {"
      p.println "    TreeMap<String,String> v = new TreeMap<String,String>();"
      
      tlbInfo.CoClasses
      .findAll {true}
      .sort {a, b -> a.Name <=> b.Name}
      .each
      {/*CoClassInfo*/ coClassInfo ->
        p.println "    v.put(\"${coClassInfo.Name}\", ${coClassInfo.Name});"  
      }
      
      p.println "    coClasses = Collections.synchronizedMap(Collections.unmodifiableMap(v));"
      p.println "  }"

	  
      tlbInfo.Interfaces
      .findAll {true}
      .sort {a, b -> a.Name <=> b.Name}
      .each
      {/*InterfaceInfo*/ interfaceInfo ->
        p.println()
        if(interfaceInfo.HelpString != "")
        {
          p.println "  /**"
          p.println "   * Interface: ${interfaceInfo.HelpString}"
          p.println "   */"
        }
        else 
        {
          p.println "  /**"
          p.println "   * Interface: ${interfaceInfo.Name}"
          p.println "   */"
        }
        p.println "  public final static String ${interfaceInfo.Name} = \"${interfaceInfo.GUID}\";"
      }
      
      p.println()
      p.println "  /**"
      p.println "   * A {@code Map} of interface names to GUIDs for this type library."
      p.println "   */"
      p.println "  public final static Map<String,String> interfaces;"
      p.println "  static"
      p.println "  {"
      p.println "    TreeMap<String,String> v = new TreeMap<String,String>();"
      
      tlbInfo.Interfaces
      .findAll {true}
      .sort {a, b -> a.Name <=> b.Name}
      .each
      {/*InterfaceInfo*/ interfaceInfo ->
        p.println "    v.put(\"${interfaceInfo.Name}\", ${interfaceInfo.Name});"  
      }
      
      p.println "    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));"
      p.println "  }"
 
      
      p.println "}"
    }
    finally
    {
      p.close()
    }
  }
}

String toJavaObject(Object value)
{
  assert value instanceof Number || value instanceof String
  if(value instanceof Number)
  {
    if(isIntegerType(value))
      return "Integer.valueOf(${toJavaString(value)})";
    else
      return "Double.valueOf(${toJavaString(value)})";
  }
  else 
  {
    return toJavaString(value)
  }
}

String toJavaString(Object value)
{
  //Note that we only deal with the numeric types that come from COM marshalling,
  //so no BigInteger, BigDecimal, or other numeric types.
  assert value instanceof Number || value instanceof String
  if(value instanceof Number)
  {
    if(isIntegerType(value))
    {
      assert value instanceof Byte || value instanceof Short || value instanceof Integer
      return "${value.intValue()}"
    }
    else
    {
      assert value instanceof Double || value instanceof Float
      return "${value.doubleValue()}"
    }
  }
  else
  {
    assert value instanceof String
    return "\"${value.replaceAll('[\\\\]', "\\\\\\\\").replaceAll('"', '\\\\"')}\"" 
  }
}

boolean isIntegerType(Number value)
{
  return !(value instanceof Double || value instanceof Float)
}

void printCopyright(PrintWriter p)
{
  p.println """/*
 * Copyright ${Calendar.getInstance().get(Calendar.YEAR)} (C) The Codehaus. All Rights Reserved.
 *
 * Redistribution and use of this software and associated documentation
 * ("Software"), with or without modification, are permitted provided that the
 * following conditions are met:
 *  1. Redistributions of source code must retain copyright statements and
 * notices. Redistributions must also contain a copy of this document.
 *  2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *  3. The name "groovy" must not be used to endorse or promote products
 * derived from this Software without prior written permission of The Codehaus.
 * For written permission, please contact info@codehaus.org.
 *  4. Products derived from this Software may not be called "groovy" nor may
 * "groovy" appear in their names without prior written permission of The
 * Codehaus. "groovy" is a registered trademark of The Codehaus.
 *  5. Due credit should be given to The Codehaus - http://groovy.codehaus.org/
 *
 * THIS SOFTWARE IS PROVIDED BY THE CODEHAUS AND CONTRIBUTORS ``AS IS'' AND ANY
 * EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE CODEHAUS OR ITS CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 * DAMAGE.
 */"""
}

