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
package org.codehaus.groovy.scriptom.tlb.office2007.powerpoint;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class MsoAnimProperty
{
  private MsoAnimProperty()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer msoAnimNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoAnimX = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoAnimY = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoAnimWidth = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoAnimHeight = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoAnimOpacity = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoAnimRotation = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoAnimColor = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoAnimVisibility = Integer.valueOf(8);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer msoAnimTextFontBold = Integer.valueOf(100);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer msoAnimTextFontColor = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer msoAnimTextFontEmboss = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer msoAnimTextFontItalic = Integer.valueOf(103);

  /**
   * Value is 104 (0x68)
   */
  public static final Integer msoAnimTextFontName = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer msoAnimTextFontShadow = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer msoAnimTextFontSize = Integer.valueOf(106);

  /**
   * Value is 107 (0x6B)
   */
  public static final Integer msoAnimTextFontSubscript = Integer.valueOf(107);

  /**
   * Value is 108 (0x6C)
   */
  public static final Integer msoAnimTextFontSuperscript = Integer.valueOf(108);

  /**
   * Value is 109 (0x6D)
   */
  public static final Integer msoAnimTextFontUnderline = Integer.valueOf(109);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer msoAnimTextFontStrikeThrough = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer msoAnimTextBulletCharacter = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer msoAnimTextBulletFontName = Integer.valueOf(112);

  /**
   * Value is 113 (0x71)
   */
  public static final Integer msoAnimTextBulletNumber = Integer.valueOf(113);

  /**
   * Value is 114 (0x72)
   */
  public static final Integer msoAnimTextBulletColor = Integer.valueOf(114);

  /**
   * Value is 115 (0x73)
   */
  public static final Integer msoAnimTextBulletRelativeSize = Integer.valueOf(115);

  /**
   * Value is 116 (0x74)
   */
  public static final Integer msoAnimTextBulletStyle = Integer.valueOf(116);

  /**
   * Value is 117 (0x75)
   */
  public static final Integer msoAnimTextBulletType = Integer.valueOf(117);

  /**
   * Value is 1000 (0x3E8)
   */
  public static final Integer msoAnimShapePictureContrast = Integer.valueOf(1000);

  /**
   * Value is 1001 (0x3E9)
   */
  public static final Integer msoAnimShapePictureBrightness = Integer.valueOf(1001);

  /**
   * Value is 1002 (0x3EA)
   */
  public static final Integer msoAnimShapePictureGamma = Integer.valueOf(1002);

  /**
   * Value is 1003 (0x3EB)
   */
  public static final Integer msoAnimShapePictureGrayscale = Integer.valueOf(1003);

  /**
   * Value is 1004 (0x3EC)
   */
  public static final Integer msoAnimShapeFillOn = Integer.valueOf(1004);

  /**
   * Value is 1005 (0x3ED)
   */
  public static final Integer msoAnimShapeFillColor = Integer.valueOf(1005);

  /**
   * Value is 1006 (0x3EE)
   */
  public static final Integer msoAnimShapeFillOpacity = Integer.valueOf(1006);

  /**
   * Value is 1007 (0x3EF)
   */
  public static final Integer msoAnimShapeFillBackColor = Integer.valueOf(1007);

  /**
   * Value is 1008 (0x3F0)
   */
  public static final Integer msoAnimShapeLineOn = Integer.valueOf(1008);

  /**
   * Value is 1009 (0x3F1)
   */
  public static final Integer msoAnimShapeLineColor = Integer.valueOf(1009);

  /**
   * Value is 1010 (0x3F2)
   */
  public static final Integer msoAnimShapeShadowOn = Integer.valueOf(1010);

  /**
   * Value is 1011 (0x3F3)
   */
  public static final Integer msoAnimShapeShadowType = Integer.valueOf(1011);

  /**
   * Value is 1012 (0x3F4)
   */
  public static final Integer msoAnimShapeShadowColor = Integer.valueOf(1012);

  /**
   * Value is 1013 (0x3F5)
   */
  public static final Integer msoAnimShapeShadowOpacity = Integer.valueOf(1013);

  /**
   * Value is 1014 (0x3F6)
   */
  public static final Integer msoAnimShapeShadowOffsetX = Integer.valueOf(1014);

  /**
   * Value is 1015 (0x3F7)
   */
  public static final Integer msoAnimShapeShadowOffsetY = Integer.valueOf(1015);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoAnimNone", msoAnimNone);
    v.put("msoAnimX", msoAnimX);
    v.put("msoAnimY", msoAnimY);
    v.put("msoAnimWidth", msoAnimWidth);
    v.put("msoAnimHeight", msoAnimHeight);
    v.put("msoAnimOpacity", msoAnimOpacity);
    v.put("msoAnimRotation", msoAnimRotation);
    v.put("msoAnimColor", msoAnimColor);
    v.put("msoAnimVisibility", msoAnimVisibility);
    v.put("msoAnimTextFontBold", msoAnimTextFontBold);
    v.put("msoAnimTextFontColor", msoAnimTextFontColor);
    v.put("msoAnimTextFontEmboss", msoAnimTextFontEmboss);
    v.put("msoAnimTextFontItalic", msoAnimTextFontItalic);
    v.put("msoAnimTextFontName", msoAnimTextFontName);
    v.put("msoAnimTextFontShadow", msoAnimTextFontShadow);
    v.put("msoAnimTextFontSize", msoAnimTextFontSize);
    v.put("msoAnimTextFontSubscript", msoAnimTextFontSubscript);
    v.put("msoAnimTextFontSuperscript", msoAnimTextFontSuperscript);
    v.put("msoAnimTextFontUnderline", msoAnimTextFontUnderline);
    v.put("msoAnimTextFontStrikeThrough", msoAnimTextFontStrikeThrough);
    v.put("msoAnimTextBulletCharacter", msoAnimTextBulletCharacter);
    v.put("msoAnimTextBulletFontName", msoAnimTextBulletFontName);
    v.put("msoAnimTextBulletNumber", msoAnimTextBulletNumber);
    v.put("msoAnimTextBulletColor", msoAnimTextBulletColor);
    v.put("msoAnimTextBulletRelativeSize", msoAnimTextBulletRelativeSize);
    v.put("msoAnimTextBulletStyle", msoAnimTextBulletStyle);
    v.put("msoAnimTextBulletType", msoAnimTextBulletType);
    v.put("msoAnimShapePictureContrast", msoAnimShapePictureContrast);
    v.put("msoAnimShapePictureBrightness", msoAnimShapePictureBrightness);
    v.put("msoAnimShapePictureGamma", msoAnimShapePictureGamma);
    v.put("msoAnimShapePictureGrayscale", msoAnimShapePictureGrayscale);
    v.put("msoAnimShapeFillOn", msoAnimShapeFillOn);
    v.put("msoAnimShapeFillColor", msoAnimShapeFillColor);
    v.put("msoAnimShapeFillOpacity", msoAnimShapeFillOpacity);
    v.put("msoAnimShapeFillBackColor", msoAnimShapeFillBackColor);
    v.put("msoAnimShapeLineOn", msoAnimShapeLineOn);
    v.put("msoAnimShapeLineColor", msoAnimShapeLineColor);
    v.put("msoAnimShapeShadowOn", msoAnimShapeShadowOn);
    v.put("msoAnimShapeShadowType", msoAnimShapeShadowType);
    v.put("msoAnimShapeShadowColor", msoAnimShapeShadowColor);
    v.put("msoAnimShapeShadowOpacity", msoAnimShapeShadowOpacity);
    v.put("msoAnimShapeShadowOffsetX", msoAnimShapeShadowOffsetX);
    v.put("msoAnimShapeShadowOffsetY", msoAnimShapeShadowOffsetY);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
