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
package org.codehaus.groovy.scriptom.tlb.office2007.visio;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * Codes returned by object.ObjectType.
 * @author Jason Smith
 */
public final class VisObjectTypes
{
  private VisObjectTypes()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visObjTypeUnknown = Integer.valueOf(1);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visObjTypeApp = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visObjTypeCell = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visObjTypeChars = Integer.valueOf(5);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visObjTypeConnect = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visObjTypeConnects = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer visObjTypeDoc = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer visObjTypeDocs = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer visObjTypeMaster = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer visObjTypeMasters = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer visObjTypePage = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer visObjTypePages = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visObjTypeSelection = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer visObjTypeShape = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer visObjTypeShapes = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer visObjTypeStyle = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer visObjTypeStyles = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer visObjTypeWindow = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer visObjTypeWindows = Integer.valueOf(22);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer visObjTypeLayer = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer visObjTypeLayers = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer visObjTypeFont = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer visObjTypeFonts = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer visObjTypeColor = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer visObjTypeColors = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer visObjTypeAddon = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer visObjTypeAddons = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer visObjTypeEvent = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer visObjTypeEventList = Integer.valueOf(34);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer visObjTypeGlobal = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer visObjTypeHyperlink = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer visObjTypeOLEObjects = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer visObjTypeOLEObject = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer visObjTypePaths = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer visObjTypePath = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer visObjTypeCurve = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer visObjTypeHyperlinks = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer visObjTypeSection = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer visObjTypeRow = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer visObjTypeMasterShortcuts = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer visObjTypeMasterShortcut = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer visObjTypeMSGWrap = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer visObjTypeMouseEvent = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer visObjTypeKeyboardEvent = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer visObjTypeApplicationSettings = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer visObjTypeDataRecordsets = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer visObjTypeDataRecordset = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer visObjTypeDataConnection = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer visObjTypeDataColumns = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer visObjTypeDataColumn = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer visObjTypeDataRecordsetChangedEvent = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer visObjTypeGraphicItems = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer visObjTypeGraphicItem = Integer.valueOf(59);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visObjTypeUnknown", visObjTypeUnknown);
    v.put("visObjTypeApp", visObjTypeApp);
    v.put("visObjTypeCell", visObjTypeCell);
    v.put("visObjTypeChars", visObjTypeChars);
    v.put("visObjTypeConnect", visObjTypeConnect);
    v.put("visObjTypeConnects", visObjTypeConnects);
    v.put("visObjTypeDoc", visObjTypeDoc);
    v.put("visObjTypeDocs", visObjTypeDocs);
    v.put("visObjTypeMaster", visObjTypeMaster);
    v.put("visObjTypeMasters", visObjTypeMasters);
    v.put("visObjTypePage", visObjTypePage);
    v.put("visObjTypePages", visObjTypePages);
    v.put("visObjTypeSelection", visObjTypeSelection);
    v.put("visObjTypeShape", visObjTypeShape);
    v.put("visObjTypeShapes", visObjTypeShapes);
    v.put("visObjTypeStyle", visObjTypeStyle);
    v.put("visObjTypeStyles", visObjTypeStyles);
    v.put("visObjTypeWindow", visObjTypeWindow);
    v.put("visObjTypeWindows", visObjTypeWindows);
    v.put("visObjTypeLayer", visObjTypeLayer);
    v.put("visObjTypeLayers", visObjTypeLayers);
    v.put("visObjTypeFont", visObjTypeFont);
    v.put("visObjTypeFonts", visObjTypeFonts);
    v.put("visObjTypeColor", visObjTypeColor);
    v.put("visObjTypeColors", visObjTypeColors);
    v.put("visObjTypeAddon", visObjTypeAddon);
    v.put("visObjTypeAddons", visObjTypeAddons);
    v.put("visObjTypeEvent", visObjTypeEvent);
    v.put("visObjTypeEventList", visObjTypeEventList);
    v.put("visObjTypeGlobal", visObjTypeGlobal);
    v.put("visObjTypeHyperlink", visObjTypeHyperlink);
    v.put("visObjTypeOLEObjects", visObjTypeOLEObjects);
    v.put("visObjTypeOLEObject", visObjTypeOLEObject);
    v.put("visObjTypePaths", visObjTypePaths);
    v.put("visObjTypePath", visObjTypePath);
    v.put("visObjTypeCurve", visObjTypeCurve);
    v.put("visObjTypeHyperlinks", visObjTypeHyperlinks);
    v.put("visObjTypeSection", visObjTypeSection);
    v.put("visObjTypeRow", visObjTypeRow);
    v.put("visObjTypeMasterShortcuts", visObjTypeMasterShortcuts);
    v.put("visObjTypeMasterShortcut", visObjTypeMasterShortcut);
    v.put("visObjTypeMSGWrap", visObjTypeMSGWrap);
    v.put("visObjTypeMouseEvent", visObjTypeMouseEvent);
    v.put("visObjTypeKeyboardEvent", visObjTypeKeyboardEvent);
    v.put("visObjTypeApplicationSettings", visObjTypeApplicationSettings);
    v.put("visObjTypeDataRecordsets", visObjTypeDataRecordsets);
    v.put("visObjTypeDataRecordset", visObjTypeDataRecordset);
    v.put("visObjTypeDataConnection", visObjTypeDataConnection);
    v.put("visObjTypeDataColumns", visObjTypeDataColumns);
    v.put("visObjTypeDataColumn", visObjTypeDataColumn);
    v.put("visObjTypeDataRecordsetChangedEvent", visObjTypeDataRecordsetChangedEvent);
    v.put("visObjTypeGraphicItems", visObjTypeGraphicItems);
    v.put("visObjTypeGraphicItem", visObjTypeGraphicItem);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
