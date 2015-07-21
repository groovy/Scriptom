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
public final class WdPageNumberStyle
{
  private WdPageNumberStyle()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdPageNumberStyleArabic = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdPageNumberStyleUppercaseRoman = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdPageNumberStyleLowercaseRoman = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdPageNumberStyleUppercaseLetter = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdPageNumberStyleLowercaseLetter = Integer.valueOf(4);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdPageNumberStyleArabicFullWidth = Integer.valueOf(14);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdPageNumberStyleKanji = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdPageNumberStyleKanjiDigit = Integer.valueOf(11);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdPageNumberStyleKanjiTraditional = Integer.valueOf(16);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdPageNumberStyleNumberInCircle = Integer.valueOf(18);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer wdPageNumberStyleHanjaRead = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer wdPageNumberStyleHanjaReadDigit = Integer.valueOf(42);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer wdPageNumberStyleTradChinNum1 = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdPageNumberStyleTradChinNum2 = Integer.valueOf(34);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer wdPageNumberStyleSimpChinNum1 = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer wdPageNumberStyleSimpChinNum2 = Integer.valueOf(38);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer wdPageNumberStyleHebrewLetter1 = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer wdPageNumberStyleArabicLetter1 = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer wdPageNumberStyleHebrewLetter2 = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer wdPageNumberStyleArabicLetter2 = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer wdPageNumberStyleHindiLetter1 = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer wdPageNumberStyleHindiLetter2 = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer wdPageNumberStyleHindiArabic = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer wdPageNumberStyleHindiCardinalText = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer wdPageNumberStyleThaiLetter = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer wdPageNumberStyleThaiArabic = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer wdPageNumberStyleThaiCardinalText = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer wdPageNumberStyleVietCardinalText = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer wdPageNumberStyleNumberInDash = Integer.valueOf(57);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdPageNumberStyleArabic", wdPageNumberStyleArabic);
    v.put("wdPageNumberStyleUppercaseRoman", wdPageNumberStyleUppercaseRoman);
    v.put("wdPageNumberStyleLowercaseRoman", wdPageNumberStyleLowercaseRoman);
    v.put("wdPageNumberStyleUppercaseLetter", wdPageNumberStyleUppercaseLetter);
    v.put("wdPageNumberStyleLowercaseLetter", wdPageNumberStyleLowercaseLetter);
    v.put("wdPageNumberStyleArabicFullWidth", wdPageNumberStyleArabicFullWidth);
    v.put("wdPageNumberStyleKanji", wdPageNumberStyleKanji);
    v.put("wdPageNumberStyleKanjiDigit", wdPageNumberStyleKanjiDigit);
    v.put("wdPageNumberStyleKanjiTraditional", wdPageNumberStyleKanjiTraditional);
    v.put("wdPageNumberStyleNumberInCircle", wdPageNumberStyleNumberInCircle);
    v.put("wdPageNumberStyleHanjaRead", wdPageNumberStyleHanjaRead);
    v.put("wdPageNumberStyleHanjaReadDigit", wdPageNumberStyleHanjaReadDigit);
    v.put("wdPageNumberStyleTradChinNum1", wdPageNumberStyleTradChinNum1);
    v.put("wdPageNumberStyleTradChinNum2", wdPageNumberStyleTradChinNum2);
    v.put("wdPageNumberStyleSimpChinNum1", wdPageNumberStyleSimpChinNum1);
    v.put("wdPageNumberStyleSimpChinNum2", wdPageNumberStyleSimpChinNum2);
    v.put("wdPageNumberStyleHebrewLetter1", wdPageNumberStyleHebrewLetter1);
    v.put("wdPageNumberStyleArabicLetter1", wdPageNumberStyleArabicLetter1);
    v.put("wdPageNumberStyleHebrewLetter2", wdPageNumberStyleHebrewLetter2);
    v.put("wdPageNumberStyleArabicLetter2", wdPageNumberStyleArabicLetter2);
    v.put("wdPageNumberStyleHindiLetter1", wdPageNumberStyleHindiLetter1);
    v.put("wdPageNumberStyleHindiLetter2", wdPageNumberStyleHindiLetter2);
    v.put("wdPageNumberStyleHindiArabic", wdPageNumberStyleHindiArabic);
    v.put("wdPageNumberStyleHindiCardinalText", wdPageNumberStyleHindiCardinalText);
    v.put("wdPageNumberStyleThaiLetter", wdPageNumberStyleThaiLetter);
    v.put("wdPageNumberStyleThaiArabic", wdPageNumberStyleThaiArabic);
    v.put("wdPageNumberStyleThaiCardinalText", wdPageNumberStyleThaiCardinalText);
    v.put("wdPageNumberStyleVietCardinalText", wdPageNumberStyleVietCardinalText);
    v.put("wdPageNumberStyleNumberInDash", wdPageNumberStyleNumberInDash);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
