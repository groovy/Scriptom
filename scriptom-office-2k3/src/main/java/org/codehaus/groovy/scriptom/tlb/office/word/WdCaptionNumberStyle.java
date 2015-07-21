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
package org.codehaus.groovy.scriptom.tlb.office.word;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class WdCaptionNumberStyle
{
  private WdCaptionNumberStyle()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdCaptionNumberStyleArabic = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdCaptionNumberStyleUppercaseRoman = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdCaptionNumberStyleLowercaseRoman = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdCaptionNumberStyleUppercaseLetter = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdCaptionNumberStyleLowercaseLetter = Integer.valueOf(4);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdCaptionNumberStyleArabicFullWidth = Integer.valueOf(14);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdCaptionNumberStyleKanji = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdCaptionNumberStyleKanjiDigit = Integer.valueOf(11);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdCaptionNumberStyleKanjiTraditional = Integer.valueOf(16);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdCaptionNumberStyleNumberInCircle = Integer.valueOf(18);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdCaptionNumberStyleGanada = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdCaptionNumberStyleChosung = Integer.valueOf(25);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer wdCaptionNumberStyleZodiac1 = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer wdCaptionNumberStyleZodiac2 = Integer.valueOf(31);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer wdCaptionNumberStyleHanjaRead = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer wdCaptionNumberStyleHanjaReadDigit = Integer.valueOf(42);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdCaptionNumberStyleTradChinNum2 = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer wdCaptionNumberStyleTradChinNum3 = Integer.valueOf(35);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer wdCaptionNumberStyleSimpChinNum2 = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer wdCaptionNumberStyleSimpChinNum3 = Integer.valueOf(39);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer wdCaptionNumberStyleHebrewLetter1 = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer wdCaptionNumberStyleArabicLetter1 = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer wdCaptionNumberStyleHebrewLetter2 = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer wdCaptionNumberStyleArabicLetter2 = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer wdCaptionNumberStyleHindiLetter1 = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer wdCaptionNumberStyleHindiLetter2 = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer wdCaptionNumberStyleHindiArabic = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer wdCaptionNumberStyleHindiCardinalText = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer wdCaptionNumberStyleThaiLetter = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer wdCaptionNumberStyleThaiArabic = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer wdCaptionNumberStyleThaiCardinalText = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer wdCaptionNumberStyleVietCardinalText = Integer.valueOf(56);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdCaptionNumberStyleArabic", wdCaptionNumberStyleArabic);
    v.put("wdCaptionNumberStyleUppercaseRoman", wdCaptionNumberStyleUppercaseRoman);
    v.put("wdCaptionNumberStyleLowercaseRoman", wdCaptionNumberStyleLowercaseRoman);
    v.put("wdCaptionNumberStyleUppercaseLetter", wdCaptionNumberStyleUppercaseLetter);
    v.put("wdCaptionNumberStyleLowercaseLetter", wdCaptionNumberStyleLowercaseLetter);
    v.put("wdCaptionNumberStyleArabicFullWidth", wdCaptionNumberStyleArabicFullWidth);
    v.put("wdCaptionNumberStyleKanji", wdCaptionNumberStyleKanji);
    v.put("wdCaptionNumberStyleKanjiDigit", wdCaptionNumberStyleKanjiDigit);
    v.put("wdCaptionNumberStyleKanjiTraditional", wdCaptionNumberStyleKanjiTraditional);
    v.put("wdCaptionNumberStyleNumberInCircle", wdCaptionNumberStyleNumberInCircle);
    v.put("wdCaptionNumberStyleGanada", wdCaptionNumberStyleGanada);
    v.put("wdCaptionNumberStyleChosung", wdCaptionNumberStyleChosung);
    v.put("wdCaptionNumberStyleZodiac1", wdCaptionNumberStyleZodiac1);
    v.put("wdCaptionNumberStyleZodiac2", wdCaptionNumberStyleZodiac2);
    v.put("wdCaptionNumberStyleHanjaRead", wdCaptionNumberStyleHanjaRead);
    v.put("wdCaptionNumberStyleHanjaReadDigit", wdCaptionNumberStyleHanjaReadDigit);
    v.put("wdCaptionNumberStyleTradChinNum2", wdCaptionNumberStyleTradChinNum2);
    v.put("wdCaptionNumberStyleTradChinNum3", wdCaptionNumberStyleTradChinNum3);
    v.put("wdCaptionNumberStyleSimpChinNum2", wdCaptionNumberStyleSimpChinNum2);
    v.put("wdCaptionNumberStyleSimpChinNum3", wdCaptionNumberStyleSimpChinNum3);
    v.put("wdCaptionNumberStyleHebrewLetter1", wdCaptionNumberStyleHebrewLetter1);
    v.put("wdCaptionNumberStyleArabicLetter1", wdCaptionNumberStyleArabicLetter1);
    v.put("wdCaptionNumberStyleHebrewLetter2", wdCaptionNumberStyleHebrewLetter2);
    v.put("wdCaptionNumberStyleArabicLetter2", wdCaptionNumberStyleArabicLetter2);
    v.put("wdCaptionNumberStyleHindiLetter1", wdCaptionNumberStyleHindiLetter1);
    v.put("wdCaptionNumberStyleHindiLetter2", wdCaptionNumberStyleHindiLetter2);
    v.put("wdCaptionNumberStyleHindiArabic", wdCaptionNumberStyleHindiArabic);
    v.put("wdCaptionNumberStyleHindiCardinalText", wdCaptionNumberStyleHindiCardinalText);
    v.put("wdCaptionNumberStyleThaiLetter", wdCaptionNumberStyleThaiLetter);
    v.put("wdCaptionNumberStyleThaiArabic", wdCaptionNumberStyleThaiArabic);
    v.put("wdCaptionNumberStyleThaiCardinalText", wdCaptionNumberStyleThaiCardinalText);
    v.put("wdCaptionNumberStyleVietCardinalText", wdCaptionNumberStyleVietCardinalText);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
