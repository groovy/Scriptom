/*
 * Copyright 2009 (C) The Codehaus. All Rights Reserved.
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
package org.codehaus.groovy.scriptom.tlb.vbtests;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class ScriptomTestVB
{
  private ScriptomTestVB()
  {
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
   *   <li><b>TestArrays</b> = ScriptomTestVB.TestArrays</li>
   *   <li><b>TestComObject</b> = ScriptomTestVB.TestComObject</li>
   *   <li><b>TestEvents</b> = ScriptomTestVB.TestEvents</li>
   *   <li><b>TestTypes</b> = ScriptomTestVB.TestTypes</li>
   *   <li><b>TestTypesByref</b> = ScriptomTestVB.TestTypesByref</li>
   * </ul>
   */
  public final static Map<String,String> progIds;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("TestArrays", "ScriptomTestVB.TestArrays");
    v.put("TestComObject", "ScriptomTestVB.TestComObject");
    v.put("TestEvents", "ScriptomTestVB.TestEvents");
    v.put("TestTypes", "ScriptomTestVB.TestTypes");
    v.put("TestTypesByref", "ScriptomTestVB.TestTypesByref");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: _OnPassBooleanByrefEventHandler
   */
  public final static String _OnPassBooleanByrefEventHandler = "{6C69B2DC-CFB0-3D88-BC16-C8F7C118DEF3}";

  /**
   * Interface: _OnPassDateByrefEventHandler
   */
  public final static String _OnPassDateByrefEventHandler = "{88A065DD-B253-37F8-B7C5-6BBBEC6D0744}";

  /**
   * Interface: _OnPassIntegerByrefEventHandler
   */
  public final static String _OnPassIntegerByrefEventHandler = "{91C786E0-A141-348B-9B92-CC930D075F20}";

  /**
   * Interface: _OnPassStringByrefEventHandler
   */
  public final static String _OnPassStringByrefEventHandler = "{B74932E0-9FC0-352E-B1C2-CD7CD40F664B}";

  /**
   * Interface: _TestArrays
   */
  public final static String _TestArrays = "{918860E3-89BF-362A-B986-235EA82F6A9B}";

  /**
   * Interface: _TestComObject
   */
  public final static String _TestComObject = "{03F1DAA4-C39D-3B5B-A972-C2DEEADD43A0}";

  /**
   * Interface: _TestEvents
   */
  public final static String _TestEvents = "{556C1365-2409-36BC-8C27-5413C61F91C3}";

  /**
   * Interface: _TestTypes
   */
  public final static String _TestTypes = "{02921A0F-6E55-37DA-887A-C8AF2A142F6E}";

  /**
   * Interface: _TestTypesByref
   */
  public final static String _TestTypesByref = "{AF10FB72-6EED-301E-A9EE-0D3B372AB259}";

  /**
   * Interface: __TestEvents
   */
  public final static String __TestEvents = "{E4CCEE34-5F92-38FC-B2B9-B394777214E5}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map<String,String> interfaces;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("_OnPassBooleanByrefEventHandler", _OnPassBooleanByrefEventHandler);
    v.put("_OnPassDateByrefEventHandler", _OnPassDateByrefEventHandler);
    v.put("_OnPassIntegerByrefEventHandler", _OnPassIntegerByrefEventHandler);
    v.put("_OnPassStringByrefEventHandler", _OnPassStringByrefEventHandler);
    v.put("_TestArrays", _TestArrays);
    v.put("_TestComObject", _TestComObject);
    v.put("_TestEvents", _TestEvents);
    v.put("_TestTypes", _TestTypes);
    v.put("_TestTypesByref", _TestTypesByref);
    v.put("__TestEvents", __TestEvents);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
