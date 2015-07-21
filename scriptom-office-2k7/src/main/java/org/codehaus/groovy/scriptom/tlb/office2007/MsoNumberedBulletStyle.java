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
public final class MsoNumberedBulletStyle
{
  private MsoNumberedBulletStyle()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer msoBulletStyleMixed = Integer.valueOf(-2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer msoBulletAlphaLCPeriod = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoBulletAlphaUCPeriod = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoBulletArabicParenRight = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoBulletArabicPeriod = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoBulletRomanLCParenBoth = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoBulletRomanLCParenRight = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoBulletRomanLCPeriod = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoBulletRomanUCPeriod = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoBulletAlphaLCParenBoth = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoBulletAlphaLCParenRight = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoBulletAlphaUCParenBoth = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoBulletAlphaUCParenRight = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoBulletArabicParenBoth = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoBulletArabicPlain = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoBulletRomanUCParenBoth = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoBulletRomanUCParenRight = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoBulletSimpChinPlain = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoBulletSimpChinPeriod = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoBulletCircleNumDBPlain = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoBulletCircleNumWDWhitePlain = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoBulletCircleNumWDBlackPlain = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoBulletTradChinPlain = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoBulletTradChinPeriod = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoBulletArabicAlphaDash = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoBulletArabicAbjadDash = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoBulletHebrewAlphaDash = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoBulletKanjiKoreanPlain = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer msoBulletKanjiKoreanPeriod = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer msoBulletArabicDBPlain = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer msoBulletArabicDBPeriod = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer msoBulletThaiAlphaPeriod = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer msoBulletThaiAlphaParenRight = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer msoBulletThaiAlphaParenBoth = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer msoBulletThaiNumPeriod = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer msoBulletThaiNumParenRight = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer msoBulletThaiNumParenBoth = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer msoBulletHindiAlphaPeriod = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer msoBulletHindiNumPeriod = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer msoBulletKanjiSimpChinDBPeriod = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer msoBulletHindiNumParenRight = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer msoBulletHindiAlpha1Period = Integer.valueOf(40);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoBulletStyleMixed", msoBulletStyleMixed);
    v.put("msoBulletAlphaLCPeriod", msoBulletAlphaLCPeriod);
    v.put("msoBulletAlphaUCPeriod", msoBulletAlphaUCPeriod);
    v.put("msoBulletArabicParenRight", msoBulletArabicParenRight);
    v.put("msoBulletArabicPeriod", msoBulletArabicPeriod);
    v.put("msoBulletRomanLCParenBoth", msoBulletRomanLCParenBoth);
    v.put("msoBulletRomanLCParenRight", msoBulletRomanLCParenRight);
    v.put("msoBulletRomanLCPeriod", msoBulletRomanLCPeriod);
    v.put("msoBulletRomanUCPeriod", msoBulletRomanUCPeriod);
    v.put("msoBulletAlphaLCParenBoth", msoBulletAlphaLCParenBoth);
    v.put("msoBulletAlphaLCParenRight", msoBulletAlphaLCParenRight);
    v.put("msoBulletAlphaUCParenBoth", msoBulletAlphaUCParenBoth);
    v.put("msoBulletAlphaUCParenRight", msoBulletAlphaUCParenRight);
    v.put("msoBulletArabicParenBoth", msoBulletArabicParenBoth);
    v.put("msoBulletArabicPlain", msoBulletArabicPlain);
    v.put("msoBulletRomanUCParenBoth", msoBulletRomanUCParenBoth);
    v.put("msoBulletRomanUCParenRight", msoBulletRomanUCParenRight);
    v.put("msoBulletSimpChinPlain", msoBulletSimpChinPlain);
    v.put("msoBulletSimpChinPeriod", msoBulletSimpChinPeriod);
    v.put("msoBulletCircleNumDBPlain", msoBulletCircleNumDBPlain);
    v.put("msoBulletCircleNumWDWhitePlain", msoBulletCircleNumWDWhitePlain);
    v.put("msoBulletCircleNumWDBlackPlain", msoBulletCircleNumWDBlackPlain);
    v.put("msoBulletTradChinPlain", msoBulletTradChinPlain);
    v.put("msoBulletTradChinPeriod", msoBulletTradChinPeriod);
    v.put("msoBulletArabicAlphaDash", msoBulletArabicAlphaDash);
    v.put("msoBulletArabicAbjadDash", msoBulletArabicAbjadDash);
    v.put("msoBulletHebrewAlphaDash", msoBulletHebrewAlphaDash);
    v.put("msoBulletKanjiKoreanPlain", msoBulletKanjiKoreanPlain);
    v.put("msoBulletKanjiKoreanPeriod", msoBulletKanjiKoreanPeriod);
    v.put("msoBulletArabicDBPlain", msoBulletArabicDBPlain);
    v.put("msoBulletArabicDBPeriod", msoBulletArabicDBPeriod);
    v.put("msoBulletThaiAlphaPeriod", msoBulletThaiAlphaPeriod);
    v.put("msoBulletThaiAlphaParenRight", msoBulletThaiAlphaParenRight);
    v.put("msoBulletThaiAlphaParenBoth", msoBulletThaiAlphaParenBoth);
    v.put("msoBulletThaiNumPeriod", msoBulletThaiNumPeriod);
    v.put("msoBulletThaiNumParenRight", msoBulletThaiNumParenRight);
    v.put("msoBulletThaiNumParenBoth", msoBulletThaiNumParenBoth);
    v.put("msoBulletHindiAlphaPeriod", msoBulletHindiAlphaPeriod);
    v.put("msoBulletHindiNumPeriod", msoBulletHindiNumPeriod);
    v.put("msoBulletKanjiSimpChinDBPeriod", msoBulletKanjiSimpChinDBPeriod);
    v.put("msoBulletHindiNumParenRight", msoBulletHindiNumParenRight);
    v.put("msoBulletHindiAlpha1Period", msoBulletHindiAlpha1Period);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
