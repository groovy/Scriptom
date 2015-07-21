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
package org.codehaus.groovy.scriptom.tlb.office.excel;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class XlPattern
{
  private XlPattern()
  {
  }

  /**
   * Value is -4105 (0xFFFFEFF7)
   */
  public static final Integer xlPatternAutomatic = Integer.valueOf(-4105);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlPatternChecker = Integer.valueOf(9);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlPatternCrissCross = Integer.valueOf(16);

  /**
   * Value is -4121 (0xFFFFEFE7)
   */
  public static final Integer xlPatternDown = Integer.valueOf(-4121);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlPatternGray16 = Integer.valueOf(17);

  /**
   * Value is -4124 (0xFFFFEFE4)
   */
  public static final Integer xlPatternGray25 = Integer.valueOf(-4124);

  /**
   * Value is -4125 (0xFFFFEFE3)
   */
  public static final Integer xlPatternGray50 = Integer.valueOf(-4125);

  /**
   * Value is -4126 (0xFFFFEFE2)
   */
  public static final Integer xlPatternGray75 = Integer.valueOf(-4126);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer xlPatternGray8 = Integer.valueOf(18);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlPatternGrid = Integer.valueOf(15);

  /**
   * Value is -4128 (0xFFFFEFE0)
   */
  public static final Integer xlPatternHorizontal = Integer.valueOf(-4128);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlPatternLightDown = Integer.valueOf(13);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlPatternLightHorizontal = Integer.valueOf(11);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlPatternLightUp = Integer.valueOf(14);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlPatternLightVertical = Integer.valueOf(12);

  /**
   * Value is -4142 (0xFFFFEFD2)
   */
  public static final Integer xlPatternNone = Integer.valueOf(-4142);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer xlPatternSemiGray75 = Integer.valueOf(10);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlPatternSolid = Integer.valueOf(1);

  /**
   * Value is -4162 (0xFFFFEFBE)
   */
  public static final Integer xlPatternUp = Integer.valueOf(-4162);

  /**
   * Value is -4166 (0xFFFFEFBA)
   */
  public static final Integer xlPatternVertical = Integer.valueOf(-4166);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlPatternAutomatic", xlPatternAutomatic);
    v.put("xlPatternChecker", xlPatternChecker);
    v.put("xlPatternCrissCross", xlPatternCrissCross);
    v.put("xlPatternDown", xlPatternDown);
    v.put("xlPatternGray16", xlPatternGray16);
    v.put("xlPatternGray25", xlPatternGray25);
    v.put("xlPatternGray50", xlPatternGray50);
    v.put("xlPatternGray75", xlPatternGray75);
    v.put("xlPatternGray8", xlPatternGray8);
    v.put("xlPatternGrid", xlPatternGrid);
    v.put("xlPatternHorizontal", xlPatternHorizontal);
    v.put("xlPatternLightDown", xlPatternLightDown);
    v.put("xlPatternLightHorizontal", xlPatternLightHorizontal);
    v.put("xlPatternLightUp", xlPatternLightUp);
    v.put("xlPatternLightVertical", xlPatternLightVertical);
    v.put("xlPatternNone", xlPatternNone);
    v.put("xlPatternSemiGray75", xlPatternSemiGray75);
    v.put("xlPatternSolid", xlPatternSolid);
    v.put("xlPatternUp", xlPatternUp);
    v.put("xlPatternVertical", xlPatternVertical);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
