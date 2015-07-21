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
public final class WdNoteNumberStyle
{
  private WdNoteNumberStyle()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdNoteNumberStyleArabic = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdNoteNumberStyleUppercaseRoman = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdNoteNumberStyleLowercaseRoman = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdNoteNumberStyleUppercaseLetter = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdNoteNumberStyleLowercaseLetter = Integer.valueOf(4);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdNoteNumberStyleSymbol = Integer.valueOf(9);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdNoteNumberStyleArabicFullWidth = Integer.valueOf(14);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdNoteNumberStyleKanji = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdNoteNumberStyleKanjiDigit = Integer.valueOf(11);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdNoteNumberStyleKanjiTraditional = Integer.valueOf(16);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdNoteNumberStyleNumberInCircle = Integer.valueOf(18);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer wdNoteNumberStyleHanjaRead = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer wdNoteNumberStyleHanjaReadDigit = Integer.valueOf(42);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer wdNoteNumberStyleTradChinNum1 = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdNoteNumberStyleTradChinNum2 = Integer.valueOf(34);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer wdNoteNumberStyleSimpChinNum1 = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer wdNoteNumberStyleSimpChinNum2 = Integer.valueOf(38);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer wdNoteNumberStyleHebrewLetter1 = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer wdNoteNumberStyleArabicLetter1 = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer wdNoteNumberStyleHebrewLetter2 = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer wdNoteNumberStyleArabicLetter2 = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer wdNoteNumberStyleHindiLetter1 = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer wdNoteNumberStyleHindiLetter2 = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer wdNoteNumberStyleHindiArabic = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer wdNoteNumberStyleHindiCardinalText = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer wdNoteNumberStyleThaiLetter = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer wdNoteNumberStyleThaiArabic = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer wdNoteNumberStyleThaiCardinalText = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer wdNoteNumberStyleVietCardinalText = Integer.valueOf(56);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdNoteNumberStyleArabic", wdNoteNumberStyleArabic);
    v.put("wdNoteNumberStyleUppercaseRoman", wdNoteNumberStyleUppercaseRoman);
    v.put("wdNoteNumberStyleLowercaseRoman", wdNoteNumberStyleLowercaseRoman);
    v.put("wdNoteNumberStyleUppercaseLetter", wdNoteNumberStyleUppercaseLetter);
    v.put("wdNoteNumberStyleLowercaseLetter", wdNoteNumberStyleLowercaseLetter);
    v.put("wdNoteNumberStyleSymbol", wdNoteNumberStyleSymbol);
    v.put("wdNoteNumberStyleArabicFullWidth", wdNoteNumberStyleArabicFullWidth);
    v.put("wdNoteNumberStyleKanji", wdNoteNumberStyleKanji);
    v.put("wdNoteNumberStyleKanjiDigit", wdNoteNumberStyleKanjiDigit);
    v.put("wdNoteNumberStyleKanjiTraditional", wdNoteNumberStyleKanjiTraditional);
    v.put("wdNoteNumberStyleNumberInCircle", wdNoteNumberStyleNumberInCircle);
    v.put("wdNoteNumberStyleHanjaRead", wdNoteNumberStyleHanjaRead);
    v.put("wdNoteNumberStyleHanjaReadDigit", wdNoteNumberStyleHanjaReadDigit);
    v.put("wdNoteNumberStyleTradChinNum1", wdNoteNumberStyleTradChinNum1);
    v.put("wdNoteNumberStyleTradChinNum2", wdNoteNumberStyleTradChinNum2);
    v.put("wdNoteNumberStyleSimpChinNum1", wdNoteNumberStyleSimpChinNum1);
    v.put("wdNoteNumberStyleSimpChinNum2", wdNoteNumberStyleSimpChinNum2);
    v.put("wdNoteNumberStyleHebrewLetter1", wdNoteNumberStyleHebrewLetter1);
    v.put("wdNoteNumberStyleArabicLetter1", wdNoteNumberStyleArabicLetter1);
    v.put("wdNoteNumberStyleHebrewLetter2", wdNoteNumberStyleHebrewLetter2);
    v.put("wdNoteNumberStyleArabicLetter2", wdNoteNumberStyleArabicLetter2);
    v.put("wdNoteNumberStyleHindiLetter1", wdNoteNumberStyleHindiLetter1);
    v.put("wdNoteNumberStyleHindiLetter2", wdNoteNumberStyleHindiLetter2);
    v.put("wdNoteNumberStyleHindiArabic", wdNoteNumberStyleHindiArabic);
    v.put("wdNoteNumberStyleHindiCardinalText", wdNoteNumberStyleHindiCardinalText);
    v.put("wdNoteNumberStyleThaiLetter", wdNoteNumberStyleThaiLetter);
    v.put("wdNoteNumberStyleThaiArabic", wdNoteNumberStyleThaiArabic);
    v.put("wdNoteNumberStyleThaiCardinalText", wdNoteNumberStyleThaiCardinalText);
    v.put("wdNoteNumberStyleVietCardinalText", wdNoteNumberStyleVietCardinalText);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
