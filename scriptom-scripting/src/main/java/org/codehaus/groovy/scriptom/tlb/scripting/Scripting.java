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
package org.codehaus.groovy.scriptom.tlb.scripting;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class Scripting
{
  private Scripting()
  {
  }

  /**
   * CoClass: Scripting.Dictionary
   */
  public final static String Dictionary = "{42C642C1-97E1-11CF-978F-00A02463E06F}";

  /**
   * CoClass: Drive Object
   */
  public final static String Drive = "{C7C3F5A0-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: Collection of drives associated with drive letters
   */
  public final static String Drives = "{C7C3F5A1-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: Script Encoder Object
   */
  public final static String Encoder = "{AADC65F6-CFF1-11D1-B747-00C04FC2B085}";

  /**
   * CoClass: File object
   */
  public final static String File = "{C7C3F5A4-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: FileSystem Object
   */
  public final static String FileSystemObject = "{2A0B9D10-4B87-11D3-A97A-00104B365C9F}";

  /**
   * CoClass: Collection of files in a folder
   */
  public final static String Files = "{C7C3F5A5-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: Folder object
   */
  public final static String Folder = "{C7C3F5A2-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: Collection of subfolders in a folder
   */
  public final static String Folders = "{C7C3F5A3-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * CoClass: TextStream object
   */
  public final static String TextStream = "{53BAD8C1-E718-11CF-893D-00A0C9054228}";

  /**
   * A {@code Map} of CoClass names to default interface GUIDs for this type library.
   */
  public final static Map coClasses;
  static
  {
    TreeMap v = new TreeMap();
    v.put("Dictionary", Dictionary);
    v.put("Drive", Drive);
    v.put("Drives", Drives);
    v.put("Encoder", Encoder);
    v.put("File", File);
    v.put("FileSystemObject", FileSystemObject);
    v.put("Files", Files);
    v.put("Folder", Folder);
    v.put("Folders", Folders);
    v.put("TextStream", TextStream);
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
   *   <li><b>Dictionary</b> = Scripting.Dictionary</li>
   *   <li><b>Encoder</b> = Scripting.Encoder</li>
   *   <li><b>FileSystemObject</b> = Scripting.FileSystemObject</li>
   * </ul>
   */
  public final static Map progIds;
  static
  {
    TreeMap v = new TreeMap();
    v.put("Dictionary", "Scripting.Dictionary");
    v.put("Encoder", "Scripting.Encoder");
    v.put("FileSystemObject", "Scripting.FileSystemObject");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: Scripting.Dictionary Interface
   */
  public final static String IDictionary = "{42C642C1-97E1-11CF-978F-00A02463E06F}";

  /**
   * Interface: Drive Interface
   */
  public final static String IDrive = "{C7C3F5A0-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: Drive Collection Interface
   */
  public final static String IDriveCollection = "{C7C3F5A1-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: File Interface
   */
  public final static String IFile = "{C7C3F5A4-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: File Collection Interface
   */
  public final static String IFileCollection = "{C7C3F5A5-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: FileSystemObject
   */
  public final static String IFileSystem = "{0AB5A3D0-E5B6-11D0-ABF5-00A0C90FFFC0}";

  /**
   * Interface: FileSystemObject
   */
  public final static String IFileSystem3 = "{2A0B9D10-4B87-11D3-A97A-00104B365C9F}";

  /**
   * Interface: Folder Interface
   */
  public final static String IFolder = "{C7C3F5A2-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: Folder Collection Interface
   */
  public final static String IFolderCollection = "{C7C3F5A3-88A3-11D0-ABCB-00A0C90FFFC0}";

  /**
   * Interface: Script Encoder Interface
   */
  public final static String IScriptEncoder = "{AADC65F6-CFF1-11D1-B747-00C04FC2B085}";

  /**
   * Interface: Scripting.TextStream Interface
   */
  public final static String ITextStream = "{53BAD8C1-E718-11CF-893D-00A0C9054228}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map interfaces;
  static
  {
    TreeMap v = new TreeMap();
    v.put("IDictionary", IDictionary);
    v.put("IDrive", IDrive);
    v.put("IDriveCollection", IDriveCollection);
    v.put("IFile", IFile);
    v.put("IFileCollection", IFileCollection);
    v.put("IFileSystem", IFileSystem);
    v.put("IFileSystem3", IFileSystem3);
    v.put("IFolder", IFolder);
    v.put("IFolderCollection", IFolderCollection);
    v.put("IScriptEncoder", IScriptEncoder);
    v.put("ITextStream", ITextStream);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
