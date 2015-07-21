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
package org.codehaus.groovy.scriptom.tlb.office2007;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class MsoPresetTextEffectShape
{
  private MsoPresetTextEffectShape()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer msoTextEffectShapeMixed = Integer.valueOf(-2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoTextEffectShapePlainText = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoTextEffectShapeStop = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoTextEffectShapeTriangleUp = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoTextEffectShapeTriangleDown = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoTextEffectShapeChevronUp = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoTextEffectShapeChevronDown = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoTextEffectShapeRingInside = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoTextEffectShapeRingOutside = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoTextEffectShapeArchUpCurve = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoTextEffectShapeArchDownCurve = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoTextEffectShapeCircleCurve = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoTextEffectShapeButtonCurve = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoTextEffectShapeArchUpPour = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoTextEffectShapeArchDownPour = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoTextEffectShapeCirclePour = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoTextEffectShapeButtonPour = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoTextEffectShapeCurveUp = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoTextEffectShapeCurveDown = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoTextEffectShapeCanUp = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoTextEffectShapeCanDown = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoTextEffectShapeWave1 = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoTextEffectShapeWave2 = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoTextEffectShapeDoubleWave1 = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoTextEffectShapeDoubleWave2 = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoTextEffectShapeInflate = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoTextEffectShapeDeflate = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer msoTextEffectShapeInflateBottom = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer msoTextEffectShapeDeflateBottom = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer msoTextEffectShapeInflateTop = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer msoTextEffectShapeDeflateTop = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer msoTextEffectShapeDeflateInflate = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer msoTextEffectShapeDeflateInflateDeflate = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer msoTextEffectShapeFadeRight = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer msoTextEffectShapeFadeLeft = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer msoTextEffectShapeFadeUp = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer msoTextEffectShapeFadeDown = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer msoTextEffectShapeSlantUp = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer msoTextEffectShapeSlantDown = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer msoTextEffectShapeCascadeUp = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer msoTextEffectShapeCascadeDown = Integer.valueOf(40);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoTextEffectShapeMixed", msoTextEffectShapeMixed);
    v.put("msoTextEffectShapePlainText", msoTextEffectShapePlainText);
    v.put("msoTextEffectShapeStop", msoTextEffectShapeStop);
    v.put("msoTextEffectShapeTriangleUp", msoTextEffectShapeTriangleUp);
    v.put("msoTextEffectShapeTriangleDown", msoTextEffectShapeTriangleDown);
    v.put("msoTextEffectShapeChevronUp", msoTextEffectShapeChevronUp);
    v.put("msoTextEffectShapeChevronDown", msoTextEffectShapeChevronDown);
    v.put("msoTextEffectShapeRingInside", msoTextEffectShapeRingInside);
    v.put("msoTextEffectShapeRingOutside", msoTextEffectShapeRingOutside);
    v.put("msoTextEffectShapeArchUpCurve", msoTextEffectShapeArchUpCurve);
    v.put("msoTextEffectShapeArchDownCurve", msoTextEffectShapeArchDownCurve);
    v.put("msoTextEffectShapeCircleCurve", msoTextEffectShapeCircleCurve);
    v.put("msoTextEffectShapeButtonCurve", msoTextEffectShapeButtonCurve);
    v.put("msoTextEffectShapeArchUpPour", msoTextEffectShapeArchUpPour);
    v.put("msoTextEffectShapeArchDownPour", msoTextEffectShapeArchDownPour);
    v.put("msoTextEffectShapeCirclePour", msoTextEffectShapeCirclePour);
    v.put("msoTextEffectShapeButtonPour", msoTextEffectShapeButtonPour);
    v.put("msoTextEffectShapeCurveUp", msoTextEffectShapeCurveUp);
    v.put("msoTextEffectShapeCurveDown", msoTextEffectShapeCurveDown);
    v.put("msoTextEffectShapeCanUp", msoTextEffectShapeCanUp);
    v.put("msoTextEffectShapeCanDown", msoTextEffectShapeCanDown);
    v.put("msoTextEffectShapeWave1", msoTextEffectShapeWave1);
    v.put("msoTextEffectShapeWave2", msoTextEffectShapeWave2);
    v.put("msoTextEffectShapeDoubleWave1", msoTextEffectShapeDoubleWave1);
    v.put("msoTextEffectShapeDoubleWave2", msoTextEffectShapeDoubleWave2);
    v.put("msoTextEffectShapeInflate", msoTextEffectShapeInflate);
    v.put("msoTextEffectShapeDeflate", msoTextEffectShapeDeflate);
    v.put("msoTextEffectShapeInflateBottom", msoTextEffectShapeInflateBottom);
    v.put("msoTextEffectShapeDeflateBottom", msoTextEffectShapeDeflateBottom);
    v.put("msoTextEffectShapeInflateTop", msoTextEffectShapeInflateTop);
    v.put("msoTextEffectShapeDeflateTop", msoTextEffectShapeDeflateTop);
    v.put("msoTextEffectShapeDeflateInflate", msoTextEffectShapeDeflateInflate);
    v.put("msoTextEffectShapeDeflateInflateDeflate", msoTextEffectShapeDeflateInflateDeflate);
    v.put("msoTextEffectShapeFadeRight", msoTextEffectShapeFadeRight);
    v.put("msoTextEffectShapeFadeLeft", msoTextEffectShapeFadeLeft);
    v.put("msoTextEffectShapeFadeUp", msoTextEffectShapeFadeUp);
    v.put("msoTextEffectShapeFadeDown", msoTextEffectShapeFadeDown);
    v.put("msoTextEffectShapeSlantUp", msoTextEffectShapeSlantUp);
    v.put("msoTextEffectShapeSlantDown", msoTextEffectShapeSlantDown);
    v.put("msoTextEffectShapeCascadeUp", msoTextEffectShapeCascadeUp);
    v.put("msoTextEffectShapeCascadeDown", msoTextEffectShapeCascadeDown);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
