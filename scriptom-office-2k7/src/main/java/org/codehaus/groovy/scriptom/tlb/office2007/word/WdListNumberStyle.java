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
package org.codehaus.groovy.scriptom.tlb.office2007.word;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class WdListNumberStyle
{
  private WdListNumberStyle()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdListNumberStyleArabic = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdListNumberStyleUppercaseRoman = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdListNumberStyleLowercaseRoman = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdListNumberStyleUppercaseLetter = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdListNumberStyleLowercaseLetter = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdListNumberStyleOrdinal = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdListNumberStyleCardinalText = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdListNumberStyleOrdinalText = Integer.valueOf(7);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdListNumberStyleKanji = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdListNumberStyleKanjiDigit = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdListNumberStyleAiueoHalfWidth = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdListNumberStyleIrohaHalfWidth = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdListNumberStyleArabicFullWidth = Integer.valueOf(14);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdListNumberStyleKanjiTraditional = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdListNumberStyleKanjiTraditional2 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdListNumberStyleNumberInCircle = Integer.valueOf(18);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdListNumberStyleAiueo = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wdListNumberStyleIroha = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdListNumberStyleArabicLZ = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdListNumberStyleBullet = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdListNumberStyleGanada = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdListNumberStyleChosung = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wdListNumberStyleGBNum1 = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer wdListNumberStyleGBNum2 = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer wdListNumberStyleGBNum3 = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer wdListNumberStyleGBNum4 = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer wdListNumberStyleZodiac1 = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer wdListNumberStyleZodiac2 = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer wdListNumberStyleZodiac3 = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer wdListNumberStyleTradChinNum1 = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdListNumberStyleTradChinNum2 = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer wdListNumberStyleTradChinNum3 = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer wdListNumberStyleTradChinNum4 = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer wdListNumberStyleSimpChinNum1 = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer wdListNumberStyleSimpChinNum2 = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer wdListNumberStyleSimpChinNum3 = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer wdListNumberStyleSimpChinNum4 = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer wdListNumberStyleHanjaRead = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer wdListNumberStyleHanjaReadDigit = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer wdListNumberStyleHangul = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer wdListNumberStyleHanja = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer wdListNumberStyleHebrew1 = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer wdListNumberStyleArabic1 = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer wdListNumberStyleHebrew2 = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer wdListNumberStyleArabic2 = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer wdListNumberStyleHindiLetter1 = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer wdListNumberStyleHindiLetter2 = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer wdListNumberStyleHindiArabic = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer wdListNumberStyleHindiCardinalText = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer wdListNumberStyleThaiLetter = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer wdListNumberStyleThaiArabic = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer wdListNumberStyleThaiCardinalText = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer wdListNumberStyleVietCardinalText = Integer.valueOf(56);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer wdListNumberStyleLowercaseRussian = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer wdListNumberStyleUppercaseRussian = Integer.valueOf(59);

  /**
   * Value is 249 (0xF9)
   */
  public static final Integer wdListNumberStylePictureBullet = Integer.valueOf(249);

  /**
   * Value is 253 (0xFD)
   */
  public static final Integer wdListNumberStyleLegal = Integer.valueOf(253);

  /**
   * Value is 254 (0xFE)
   */
  public static final Integer wdListNumberStyleLegalLZ = Integer.valueOf(254);

  /**
   * Value is 255 (0xFF)
   */
  public static final Integer wdListNumberStyleNone = Integer.valueOf(255);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdListNumberStyleArabic", wdListNumberStyleArabic);
    v.put("wdListNumberStyleUppercaseRoman", wdListNumberStyleUppercaseRoman);
    v.put("wdListNumberStyleLowercaseRoman", wdListNumberStyleLowercaseRoman);
    v.put("wdListNumberStyleUppercaseLetter", wdListNumberStyleUppercaseLetter);
    v.put("wdListNumberStyleLowercaseLetter", wdListNumberStyleLowercaseLetter);
    v.put("wdListNumberStyleOrdinal", wdListNumberStyleOrdinal);
    v.put("wdListNumberStyleCardinalText", wdListNumberStyleCardinalText);
    v.put("wdListNumberStyleOrdinalText", wdListNumberStyleOrdinalText);
    v.put("wdListNumberStyleKanji", wdListNumberStyleKanji);
    v.put("wdListNumberStyleKanjiDigit", wdListNumberStyleKanjiDigit);
    v.put("wdListNumberStyleAiueoHalfWidth", wdListNumberStyleAiueoHalfWidth);
    v.put("wdListNumberStyleIrohaHalfWidth", wdListNumberStyleIrohaHalfWidth);
    v.put("wdListNumberStyleArabicFullWidth", wdListNumberStyleArabicFullWidth);
    v.put("wdListNumberStyleKanjiTraditional", wdListNumberStyleKanjiTraditional);
    v.put("wdListNumberStyleKanjiTraditional2", wdListNumberStyleKanjiTraditional2);
    v.put("wdListNumberStyleNumberInCircle", wdListNumberStyleNumberInCircle);
    v.put("wdListNumberStyleAiueo", wdListNumberStyleAiueo);
    v.put("wdListNumberStyleIroha", wdListNumberStyleIroha);
    v.put("wdListNumberStyleArabicLZ", wdListNumberStyleArabicLZ);
    v.put("wdListNumberStyleBullet", wdListNumberStyleBullet);
    v.put("wdListNumberStyleGanada", wdListNumberStyleGanada);
    v.put("wdListNumberStyleChosung", wdListNumberStyleChosung);
    v.put("wdListNumberStyleGBNum1", wdListNumberStyleGBNum1);
    v.put("wdListNumberStyleGBNum2", wdListNumberStyleGBNum2);
    v.put("wdListNumberStyleGBNum3", wdListNumberStyleGBNum3);
    v.put("wdListNumberStyleGBNum4", wdListNumberStyleGBNum4);
    v.put("wdListNumberStyleZodiac1", wdListNumberStyleZodiac1);
    v.put("wdListNumberStyleZodiac2", wdListNumberStyleZodiac2);
    v.put("wdListNumberStyleZodiac3", wdListNumberStyleZodiac3);
    v.put("wdListNumberStyleTradChinNum1", wdListNumberStyleTradChinNum1);
    v.put("wdListNumberStyleTradChinNum2", wdListNumberStyleTradChinNum2);
    v.put("wdListNumberStyleTradChinNum3", wdListNumberStyleTradChinNum3);
    v.put("wdListNumberStyleTradChinNum4", wdListNumberStyleTradChinNum4);
    v.put("wdListNumberStyleSimpChinNum1", wdListNumberStyleSimpChinNum1);
    v.put("wdListNumberStyleSimpChinNum2", wdListNumberStyleSimpChinNum2);
    v.put("wdListNumberStyleSimpChinNum3", wdListNumberStyleSimpChinNum3);
    v.put("wdListNumberStyleSimpChinNum4", wdListNumberStyleSimpChinNum4);
    v.put("wdListNumberStyleHanjaRead", wdListNumberStyleHanjaRead);
    v.put("wdListNumberStyleHanjaReadDigit", wdListNumberStyleHanjaReadDigit);
    v.put("wdListNumberStyleHangul", wdListNumberStyleHangul);
    v.put("wdListNumberStyleHanja", wdListNumberStyleHanja);
    v.put("wdListNumberStyleHebrew1", wdListNumberStyleHebrew1);
    v.put("wdListNumberStyleArabic1", wdListNumberStyleArabic1);
    v.put("wdListNumberStyleHebrew2", wdListNumberStyleHebrew2);
    v.put("wdListNumberStyleArabic2", wdListNumberStyleArabic2);
    v.put("wdListNumberStyleHindiLetter1", wdListNumberStyleHindiLetter1);
    v.put("wdListNumberStyleHindiLetter2", wdListNumberStyleHindiLetter2);
    v.put("wdListNumberStyleHindiArabic", wdListNumberStyleHindiArabic);
    v.put("wdListNumberStyleHindiCardinalText", wdListNumberStyleHindiCardinalText);
    v.put("wdListNumberStyleThaiLetter", wdListNumberStyleThaiLetter);
    v.put("wdListNumberStyleThaiArabic", wdListNumberStyleThaiArabic);
    v.put("wdListNumberStyleThaiCardinalText", wdListNumberStyleThaiCardinalText);
    v.put("wdListNumberStyleVietCardinalText", wdListNumberStyleVietCardinalText);
    v.put("wdListNumberStyleLowercaseRussian", wdListNumberStyleLowercaseRussian);
    v.put("wdListNumberStyleUppercaseRussian", wdListNumberStyleUppercaseRussian);
    v.put("wdListNumberStylePictureBullet", wdListNumberStylePictureBullet);
    v.put("wdListNumberStyleLegal", wdListNumberStyleLegal);
    v.put("wdListNumberStyleLegalLZ", wdListNumberStyleLegalLZ);
    v.put("wdListNumberStyleNone", wdListNumberStyleNone);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
