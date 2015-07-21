/*
 * Copyright 2007 (C) Guillaume Laforge. All Rights Reserved.
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
 */
package org.codehaus.groovy.scriptom.tlb.wscript;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class IWshRuntimeLibrary
{
  private IWshRuntimeLibrary()
  {
  }

  /**
   * CoClass: Drive
   */
  public final static String Drive = "{C7C3F5A0-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: Drives
   */
  public final static String Drives = "{C7C3F5A1-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: File
   */
  public final static String File = "{C7C3F5A4-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: FileSystemObject
   */
  public final static String FileSystemObject = "{2A0B9D10-4B87-11D3-A97A-00104B365C9F}";

  /**
   * CoClass: Files
   */
  public final static String Files = "{C7C3F5A5-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: Folder
   */
  public final static String Folder = "{C7C3F5A2-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: Folders
   */
  public final static String Folders = "{C7C3F5A3-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: Generic Collection Object
   */
  public final static String IWshCollection_Class = "{F935DC27-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * CoClass: Environment Variables Collection Object
   */
  public final static String IWshEnvironment_Class = "{F935DC29-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * CoClass: Network Object
   */
  public final static String IWshNetwork_Class = "{24BE5A31-EDFE-11D2-B933-00104B365C9F}";

  /**
   * CoClass: Shell Object
   */
  public final static String IWshShell_Class = "{41904400-BE18-11D3-A28B-00104BD35090}";

  /**
   * CoClass: Shortcut Object
   */
  public final static String IWshShortcut_Class = "{F935DC23-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * CoClass: URLShortcut Object
   */
  public final static String IWshURLShortcut_Class = "{F935DC2B-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * CoClass: TextStream
   */
  public final static String TextStream = "{53BAD8C1-E718-11CF-893D-00A0C9054228}";

  /**
   * CoClass: Generic Collection Object
   */
  public final static String WshCollection = "{F935DC27-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * CoClass: Environment Variables Collection Object
   */
  public final static String WshEnvironment = "{F935DC29-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * CoClass: WSHExec object
   */
  public final static String WshExec = "{08FED190-BE19-11D3-A28B-00104BD35090}";

  /**
   * CoClass: Network Object
   */
  public final static String WshNetwork = "{24BE5A31-EDFE-11D2-B933-00104B365C9F}";

  /**
   * CoClass: Shell Object
   */
  public final static String WshShell = "{41904400-BE18-11D3-A28B-00104BD35090}";

  /**
   * CoClass: Shortcut Object
   */
  public final static String WshShortcut = "{F935DC23-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * CoClass: URLShortcut Object
   */
  public final static String WshURLShortcut = "{F935DC2B-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * A {@code Map} of CoClass names to default interface GUIDs for this type library.
   */
  public final static Map coClasses;
  static
  {
    TreeMap v = new TreeMap();
    v.put("Drive", Drive);
    v.put("Drives", Drives);
    v.put("File", File);
    v.put("FileSystemObject", FileSystemObject);
    v.put("Files", Files);
    v.put("Folder", Folder);
    v.put("Folders", Folders);
    v.put("IWshCollection_Class", IWshCollection_Class);
    v.put("IWshEnvironment_Class", IWshEnvironment_Class);
    v.put("IWshNetwork_Class", IWshNetwork_Class);
    v.put("IWshShell_Class", IWshShell_Class);
    v.put("IWshShortcut_Class", IWshShortcut_Class);
    v.put("IWshURLShortcut_Class", IWshURLShortcut_Class);
    v.put("TextStream", TextStream);
    v.put("WshCollection", WshCollection);
    v.put("WshEnvironment", WshEnvironment);
    v.put("WshExec", WshExec);
    v.put("WshNetwork", WshNetwork);
    v.put("WshShell", WshShell);
    v.put("WshShortcut", WshShortcut);
    v.put("WshURLShortcut", WshURLShortcut);
    coClasses = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * A {@code Map} of CoClass names to prog-ids for this type library.<p>
   *
   * Note that some objects that support events do not publish a prog-id.
   * This is a known limitation of this library that we hope to resolve in
   * a future release.<p>
   *
   * Supported prog-ids:
   * <ul>
   *   <li><b>FileSystemObject</b> = Scripting.FileSystemObject</li>
   *   <li><b>IWshNetwork_Class</b> = WScript.Network</li>
   *   <li><b>IWshShell_Class</b> = WScript.Shell</li>
   *   <li><b>WshNetwork</b> = WScript.Network</li>
   *   <li><b>WshShell</b> = WScript.Shell</li>
   * </ul>
   */
  public final static Map progIds;
  static
  {
    TreeMap v = new TreeMap();
    v.put("FileSystemObject", "Scripting.FileSystemObject");
    v.put("IWshNetwork_Class", "WScript.Network");
    v.put("IWshShell_Class", "WScript.Shell");
    v.put("WshNetwork", "WScript.Network");
    v.put("WshShell", "WScript.Shell");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: IDrive
   */
  public final static String IDrive = "{C7C3F5A0-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: IDriveCollection
   */
  public final static String IDriveCollection = "{C7C3F5A1-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: IFile
   */
  public final static String IFile = "{C7C3F5A4-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: IFileCollection
   */
  public final static String IFileCollection = "{C7C3F5A5-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: IFileSystem
   */
  public final static String IFileSystem = "{0AB5A3D0-E5B6-11D0-ABF5-00A0C90FFFC0}";

  /**
   * Interface: IFileSystem3
   */
  public final static String IFileSystem3 = "{2A0B9D10-4B87-11D3-A97A-00104B365C9F}";

  /**
   * Interface: IFolder
   */
  public final static String IFolder = "{C7C3F5A2-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: IFolderCollection
   */
  public final static String IFolderCollection = "{C7C3F5A3-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: ITextStream
   */
  public final static String ITextStream = "{53BAD8C1-E718-11CF-893D-00A0C9054228}";

  /**
   * Interface: Generic Collection Object
   */
  public final static String IWshCollection = "{F935DC27-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * Interface: Environment Variables Collection Object
   */
  public final static String IWshEnvironment = "{F935DC29-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * Interface: WSH Exec Object
   */
  public final static String IWshExec = "{08FED190-BE19-11D3-A28B-00104BD35090}";

  /**
   * Interface: Network Object
   */
  public final static String IWshNetwork = "{F935DC25-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * Interface: Network Object
   */
  public final static String IWshNetwork2 = "{24BE5A31-EDFE-11D2-B933-00104B365C9F}";

  /**
   * Interface: Shell Object Interface
   */
  public final static String IWshShell = "{F935DC21-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * Interface: Shell Object Interface
   */
  public final static String IWshShell2 = "{24BE5A30-EDFE-11D2-B933-00104B365C9F}";

  /**
   * Interface: Shell Object Interface
   */
  public final static String IWshShell3 = "{41904400-BE18-11D3-A28B-00104BD35090}";

  /**
   * Interface: Shortcut Object
   */
  public final static String IWshShortcut = "{F935DC23-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * Interface: URLShortcut Object
   */
  public final static String IWshURLShortcut = "{F935DC2B-1CF0-11D0-ADB9-00C04FD58A0B}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map interfaces;
  static
  {
    TreeMap v = new TreeMap();
    v.put("IDrive", IDrive);
    v.put("IDriveCollection", IDriveCollection);
    v.put("IFile", IFile);
    v.put("IFileCollection", IFileCollection);
    v.put("IFileSystem", IFileSystem);
    v.put("IFileSystem3", IFileSystem3);
    v.put("IFolder", IFolder);
    v.put("IFolderCollection", IFolderCollection);
    v.put("ITextStream", ITextStream);
    v.put("IWshCollection", IWshCollection);
    v.put("IWshEnvironment", IWshEnvironment);
    v.put("IWshExec", IWshExec);
    v.put("IWshNetwork", IWshNetwork);
    v.put("IWshNetwork2", IWshNetwork2);
    v.put("IWshShell", IWshShell);
    v.put("IWshShell2", IWshShell2);
    v.put("IWshShell3", IWshShell3);
    v.put("IWshShortcut", IWshShortcut);
    v.put("IWshURLShortcut", IWshURLShortcut);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
