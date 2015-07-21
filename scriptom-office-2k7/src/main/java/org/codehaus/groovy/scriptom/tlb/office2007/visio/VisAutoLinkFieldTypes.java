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
 * @author Jason Smith
 */
public final class VisAutoLinkFieldTypes
{
  private VisAutoLinkFieldTypes()
  {
  }

  /**
   * Field is Shape text<p>
   * Value is 1 (0x1)
   */
  public static final Integer visAutoLinkShapeText = Integer.valueOf(1);

  /**
   * Field is label for custom property (shape data), field name is label as is required<p>
   * Value is 2 (0x2)
   */
  public static final Integer visAutoLinkCustPropsLabel = Integer.valueOf(2);

  /**
   * Field is user cell local row name, field is name for user row and is required <p>
   * Value is 3 (0x3)
   */
  public static final Integer visAutoLinkUserRowName = Integer.valueOf(3);

  /**
   * Field is angle in geometry<p>
   * Value is 4 (0x4)
   */
  public static final Integer visAutoLinkGeometryAngle = Integer.valueOf(4);

  /**
   * Field is width of shape<p>
   * Value is 5 (0x5)
   */
  public static final Integer visAutoLinkGeometryWidth = Integer.valueOf(5);

  /**
   * Field is height of shape<p>
   * Value is 6 (0x6)
   */
  public static final Integer visAutoLinkGeometryHeight = Integer.valueOf(6);

  /**
   * Field is ID of shape<p>
   * Value is 7 (0x7)
   */
  public static final Integer visAutoLinkObjectID = Integer.valueOf(7);

  /**
   * Field is local name of the master for the shape<p>
   * Value is 8 (0x8)
   */
  public static final Integer visAutoLinkMasterName = Integer.valueOf(8);

  /**
   * Field is local name of the shape<p>
   * Value is 9 (0x9)
   */
  public static final Integer visAutoLinkObjectName = Integer.valueOf(9);

  /**
   * Field is type of shape object<p>
   * Value is 10 (0xA)
   */
  public static final Integer visAutoLinkObjectType = Integer.valueOf(10);

  /**
   * Field is Data1 property of shape object<p>
   * Value is 11 (0xB)
   */
  public static final Integer visAutoLinkObjectData1 = Integer.valueOf(11);

  /**
   * Field is Data2 property of shape object<p>
   * Value is 12 (0xC)
   */
  public static final Integer visAutoLinkObjectData2 = Integer.valueOf(12);

  /**
   * Field is Data3 property of shape object<p>
   * Value is 13 (0xD)
   */
  public static final Integer visAutoLinkObjectData3 = Integer.valueOf(13);

  /**
   * Field is Universal property row name, field name is rownameU and is required<p>
   * Value is 14 (0xE)
   */
  public static final Integer visAutoLinkPropRowNameU = Integer.valueOf(14);

  /**
   * Field is Universal user row name, field name is rownameU and is required<p>
   * Value is 15 (0xF)
   */
  public static final Integer visAutoLinkUserRowNameU = Integer.valueOf(15);

  /**
   * Field is universal name of the master for the shape<p>
   * Value is 16 (0x10)
   */
  public static final Integer visAutoLinkMasterNameU = Integer.valueOf(16);

  /**
   * Field is universal name of the shape<p>
   * Value is 17 (0x11)
   */
  public static final Integer visAutoLinkObjectNameU = Integer.valueOf(17);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visAutoLinkShapeText", visAutoLinkShapeText);
    v.put("visAutoLinkCustPropsLabel", visAutoLinkCustPropsLabel);
    v.put("visAutoLinkUserRowName", visAutoLinkUserRowName);
    v.put("visAutoLinkGeometryAngle", visAutoLinkGeometryAngle);
    v.put("visAutoLinkGeometryWidth", visAutoLinkGeometryWidth);
    v.put("visAutoLinkGeometryHeight", visAutoLinkGeometryHeight);
    v.put("visAutoLinkObjectID", visAutoLinkObjectID);
    v.put("visAutoLinkMasterName", visAutoLinkMasterName);
    v.put("visAutoLinkObjectName", visAutoLinkObjectName);
    v.put("visAutoLinkObjectType", visAutoLinkObjectType);
    v.put("visAutoLinkObjectData1", visAutoLinkObjectData1);
    v.put("visAutoLinkObjectData2", visAutoLinkObjectData2);
    v.put("visAutoLinkObjectData3", visAutoLinkObjectData3);
    v.put("visAutoLinkPropRowNameU", visAutoLinkPropRowNameU);
    v.put("visAutoLinkUserRowNameU", visAutoLinkUserRowNameU);
    v.put("visAutoLinkMasterNameU", visAutoLinkMasterNameU);
    v.put("visAutoLinkObjectNameU", visAutoLinkObjectNameU);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
