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
package org.codehaus.groovy.scriptom.tlb.wbemscripting;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class WbemScripting
{
  private WbemScripting()
  {
  }

  /**
   * CoClass: Date & Time
   */
  public final static String SWbemDateTime = "{5E97458A-CF77-11D3-B38F-00105A1F473A}";

  /**
   * CoClass: An Event source
   */
  public final static String SWbemEventSource = "{27D54D92-0EBE-11D2-8B22-00600806D9B6}";

  /**
   * CoClass: The last error on the current thread
   */
  public final static String SWbemLastError = "{D962DB84-D4BB-11D1-8B09-00600806D9B6}";

  /**
   * CoClass: Used to obtain Namespace connections
   */
  public final static String SWbemLocator = "{76A6415B-CB41-11D1-8B02-00600806D9B6}";

  /**
   * CoClass: A Method
   */
  public final static String SWbemMethod = "{422E8E90-D955-11D1-8B09-00600806D9B6}";

  /**
   * CoClass: A collection of Methods
   */
  public final static String SWbemMethodSet = "{C93BA292-D955-11D1-8B09-00600806D9B6}";

  /**
   * CoClass: A named value
   */
  public final static String SWbemNamedValue = "{76A64164-CB41-11D1-8B02-00600806D9B6}";

  /**
   * CoClass: A collection of Named Values
   */
  public final static String SWbemNamedValueSet = "{CF2376EA-CE8C-11D1-8B05-00600806D9B6}";

  /**
   * CoClass: A Class or Instance
   */
  public final static String SWbemObject = "{76A6415A-CB41-11D1-8B02-00600806D9B6}";

  /**
   * CoClass: A Class or Instance
   */
  public final static String SWbemObjectEx = "{269AD56A-8A67-4129-BC8C-0506DCFE9880}";

  /**
   * CoClass: Object Path
   */
  public final static String SWbemObjectPath = "{5791BC27-CE9C-11D1-97BF-0000F81E849C}";

  /**
   * CoClass: A collection of Classes or Instances
   */
  public final static String SWbemObjectSet = "{76A6415F-CB41-11D1-8B02-00600806D9B6}";

  /**
   * CoClass: A Privilege Override
   */
  public final static String SWbemPrivilege = "{26EE67BD-5804-11D2-8B4A-00600806D9B6}";

  /**
   * CoClass: A collection of Privilege Overrides
   */
  public final static String SWbemPrivilegeSet = "{26EE67BF-5804-11D2-8B4A-00600806D9B6}";

  /**
   * CoClass: A Property
   */
  public final static String SWbemProperty = "{1A388F98-D4BA-11D1-8B09-00600806D9B6}";

  /**
   * CoClass: A collection of Properties
   */
  public final static String SWbemPropertySet = "{DEA0A7B2-D4BA-11D1-8B09-00600806D9B6}";

  /**
   * CoClass: A Qualifier
   */
  public final static String SWbemQualifier = "{79B05932-D3B7-11D1-8B06-00600806D9B6}";

  /**
   * CoClass: A collection of Qualifiers
   */
  public final static String SWbemQualifierSet = "{9B16ED16-D3DF-11D1-8B08-00600806D9B6}";

  /**
   * CoClass: A single item from a Refresher
   */
  public final static String SWbemRefreshableItem = "{5AD4BF92-DAAB-11D3-B38F-00105A1F473A}";

  /**
   * CoClass: Refresher
   */
  public final static String SWbemRefresher = "{14D8250E-D9C2-11D3-B38F-00105A1F473A}";

  /**
   * CoClass: A Security Configurator
   */
  public final static String SWbemSecurity = "{B54D66E6-2287-11D2-8B33-00600806D9B6}";

  /**
   * CoClass: A connection to a Namespace
   */
  public final static String SWbemServices = "{76A6415C-CB41-11D1-8B02-00600806D9B6}";

  /**
   * CoClass: A connection to a Namespace
   */
  public final static String SWbemServicesEx = "{D2F68443-85DC-427E-91D8-366554CC754C}";

  /**
   * CoClass: A sink for events arising from asynchronous operations
   */
  public final static String SWbemSink = "{75718C9F-F029-11D1-A1AC-00C04FB6C223}";

  /**
   * A {@code Map} of CoClass names to default interface GUIDs for this type library.
   */
  public final static Map coClasses;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SWbemDateTime", SWbemDateTime);
    v.put("SWbemEventSource", SWbemEventSource);
    v.put("SWbemLastError", SWbemLastError);
    v.put("SWbemLocator", SWbemLocator);
    v.put("SWbemMethod", SWbemMethod);
    v.put("SWbemMethodSet", SWbemMethodSet);
    v.put("SWbemNamedValue", SWbemNamedValue);
    v.put("SWbemNamedValueSet", SWbemNamedValueSet);
    v.put("SWbemObject", SWbemObject);
    v.put("SWbemObjectEx", SWbemObjectEx);
    v.put("SWbemObjectPath", SWbemObjectPath);
    v.put("SWbemObjectSet", SWbemObjectSet);
    v.put("SWbemPrivilege", SWbemPrivilege);
    v.put("SWbemPrivilegeSet", SWbemPrivilegeSet);
    v.put("SWbemProperty", SWbemProperty);
    v.put("SWbemPropertySet", SWbemPropertySet);
    v.put("SWbemQualifier", SWbemQualifier);
    v.put("SWbemQualifierSet", SWbemQualifierSet);
    v.put("SWbemRefreshableItem", SWbemRefreshableItem);
    v.put("SWbemRefresher", SWbemRefresher);
    v.put("SWbemSecurity", SWbemSecurity);
    v.put("SWbemServices", SWbemServices);
    v.put("SWbemServicesEx", SWbemServicesEx);
    v.put("SWbemSink", SWbemSink);
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
   *   <li><b>SWbemDateTime</b> = WbemScripting.SWbemDateTime</li>
   *   <li><b>SWbemLastError</b> = WbemScripting.SWbemLastError</li>
   *   <li><b>SWbemLocator</b> = WbemScripting.SWbemLocator</li>
   *   <li><b>SWbemNamedValueSet</b> = WbemScripting.SWbemNamedValueSet</li>
   *   <li><b>SWbemObjectPath</b> = WbemScripting.SWbemObjectPath</li>
   *   <li><b>SWbemRefresher</b> = WbemScripting.SWbemRefresher</li>
   *   <li><b>SWbemSink</b> = WbemScripting.SWbemSink</li>
   * </ul>
   */
  public final static Map progIds;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SWbemDateTime", "WbemScripting.SWbemDateTime");
    v.put("SWbemLastError", "WbemScripting.SWbemLastError");
    v.put("SWbemLocator", "WbemScripting.SWbemLocator");
    v.put("SWbemNamedValueSet", "WbemScripting.SWbemNamedValueSet");
    v.put("SWbemObjectPath", "WbemScripting.SWbemObjectPath");
    v.put("SWbemRefresher", "WbemScripting.SWbemRefresher");
    v.put("SWbemSink", "WbemScripting.SWbemSink");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: A Datetime
   */
  public final static String ISWbemDateTime = "{5E97458A-CF77-11D3-B38F-00105A1F473A}";

  /**
   * Interface: An Event source
   */
  public final static String ISWbemEventSource = "{27D54D92-0EBE-11D2-8B22-00600806D9B6}";

  /**
   * Interface: The last error on the current thread
   */
  public final static String ISWbemLastError = "{D962DB84-D4BB-11D1-8B09-00600806D9B6}";

  /**
   * Interface: Used to obtain Namespace connections
   */
  public final static String ISWbemLocator = "{76A6415B-CB41-11D1-8B02-00600806D9B6}";

  /**
   * Interface: A Method
   */
  public final static String ISWbemMethod = "{422E8E90-D955-11D1-8B09-00600806D9B6}";

  /**
   * Interface: A collection of Methods
   */
  public final static String ISWbemMethodSet = "{C93BA292-D955-11D1-8B09-00600806D9B6}";

  /**
   * Interface: A named value
   */
  public final static String ISWbemNamedValue = "{76A64164-CB41-11D1-8B02-00600806D9B6}";

  /**
   * Interface: A collection of named values
   */
  public final static String ISWbemNamedValueSet = "{CF2376EA-CE8C-11D1-8B05-00600806D9B6}";

  /**
   * Interface: A Class or Instance
   */
  public final static String ISWbemObject = "{76A6415A-CB41-11D1-8B02-00600806D9B6}";

  /**
   * Interface: A Class or Instance
   */
  public final static String ISWbemObjectEx = "{269AD56A-8A67-4129-BC8C-0506DCFE9880}";

  /**
   * Interface: An Object path
   */
  public final static String ISWbemObjectPath = "{5791BC27-CE9C-11D1-97BF-0000F81E849C}";

  /**
   * Interface: A collection of Classes or Instances
   */
  public final static String ISWbemObjectSet = "{76A6415F-CB41-11D1-8B02-00600806D9B6}";

  /**
   * Interface: A Privilege Override
   */
  public final static String ISWbemPrivilege = "{26EE67BD-5804-11D2-8B4A-00600806D9B6}";

  /**
   * Interface: A collection of Privilege Overrides
   */
  public final static String ISWbemPrivilegeSet = "{26EE67BF-5804-11D2-8B4A-00600806D9B6}";

  /**
   * Interface: A Property
   */
  public final static String ISWbemProperty = "{1A388F98-D4BA-11D1-8B09-00600806D9B6}";

  /**
   * Interface: A collection of Properties
   */
  public final static String ISWbemPropertySet = "{DEA0A7B2-D4BA-11D1-8B09-00600806D9B6}";

  /**
   * Interface: A Qualifier
   */
  public final static String ISWbemQualifier = "{79B05932-D3B7-11D1-8B06-00600806D9B6}";

  /**
   * Interface: A collection of Qualifiers
   */
  public final static String ISWbemQualifierSet = "{9B16ED16-D3DF-11D1-8B08-00600806D9B6}";

  /**
   * Interface: A single item in a Refresher
   */
  public final static String ISWbemRefreshableItem = "{5AD4BF92-DAAB-11D3-B38F-00105A1F473A}";

  /**
   * Interface: A Collection of Refreshable Objects
   */
  public final static String ISWbemRefresher = "{14D8250E-D9C2-11D3-B38F-00105A1F473A}";

  /**
   * Interface: A Security Configurator
   */
  public final static String ISWbemSecurity = "{B54D66E6-2287-11D2-8B33-00600806D9B6}";

  /**
   * Interface: A connection to a Namespace
   */
  public final static String ISWbemServices = "{76A6415C-CB41-11D1-8B02-00600806D9B6}";

  /**
   * Interface: A connection to a Namespace
   */
  public final static String ISWbemServicesEx = "{D2F68443-85DC-427E-91D8-366554CC754C}";

  /**
   * Interface: Asynchronous operation control
   */
  public final static String ISWbemSink = "{75718C9F-F029-11D1-A1AC-00C04FB6C223}";

  /**
   * Interface: A sink for events arising from asynchronous operations
   */
  public final static String ISWbemSinkEvents = "{75718CA0-F029-11D1-A1AC-00C04FB6C223}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map interfaces;
  static
  {
    TreeMap v = new TreeMap();
    v.put("ISWbemDateTime", ISWbemDateTime);
    v.put("ISWbemEventSource", ISWbemEventSource);
    v.put("ISWbemLastError", ISWbemLastError);
    v.put("ISWbemLocator", ISWbemLocator);
    v.put("ISWbemMethod", ISWbemMethod);
    v.put("ISWbemMethodSet", ISWbemMethodSet);
    v.put("ISWbemNamedValue", ISWbemNamedValue);
    v.put("ISWbemNamedValueSet", ISWbemNamedValueSet);
    v.put("ISWbemObject", ISWbemObject);
    v.put("ISWbemObjectEx", ISWbemObjectEx);
    v.put("ISWbemObjectPath", ISWbemObjectPath);
    v.put("ISWbemObjectSet", ISWbemObjectSet);
    v.put("ISWbemPrivilege", ISWbemPrivilege);
    v.put("ISWbemPrivilegeSet", ISWbemPrivilegeSet);
    v.put("ISWbemProperty", ISWbemProperty);
    v.put("ISWbemPropertySet", ISWbemPropertySet);
    v.put("ISWbemQualifier", ISWbemQualifier);
    v.put("ISWbemQualifierSet", ISWbemQualifierSet);
    v.put("ISWbemRefreshableItem", ISWbemRefreshableItem);
    v.put("ISWbemRefresher", ISWbemRefresher);
    v.put("ISWbemSecurity", ISWbemSecurity);
    v.put("ISWbemServices", ISWbemServices);
    v.put("ISWbemServicesEx", ISWbemServicesEx);
    v.put("ISWbemSink", ISWbemSink);
    v.put("ISWbemSinkEvents", ISWbemSinkEvents);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
