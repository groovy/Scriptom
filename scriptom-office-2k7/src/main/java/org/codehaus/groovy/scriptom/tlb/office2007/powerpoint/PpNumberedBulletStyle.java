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
public final class PpNumberedBulletStyle
{
  private PpNumberedBulletStyle()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer ppBulletStyleMixed = Integer.valueOf(-2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer ppBulletAlphaLCPeriod = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer ppBulletAlphaUCPeriod = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer ppBulletArabicParenRight = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer ppBulletArabicPeriod = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer ppBulletRomanLCParenBoth = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer ppBulletRomanLCParenRight = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer ppBulletRomanLCPeriod = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer ppBulletRomanUCPeriod = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer ppBulletAlphaLCParenBoth = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer ppBulletAlphaLCParenRight = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer ppBulletAlphaUCParenBoth = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer ppBulletAlphaUCParenRight = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer ppBulletArabicParenBoth = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer ppBulletArabicPlain = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer ppBulletRomanUCParenBoth = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer ppBulletRomanUCParenRight = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer ppBulletSimpChinPlain = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer ppBulletSimpChinPeriod = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer ppBulletCircleNumDBPlain = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer ppBulletCircleNumWDWhitePlain = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer ppBulletCircleNumWDBlackPlain = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer ppBulletTradChinPlain = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer ppBulletTradChinPeriod = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer ppBulletArabicAlphaDash = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer ppBulletArabicAbjadDash = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer ppBulletHebrewAlphaDash = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer ppBulletKanjiKoreanPlain = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer ppBulletKanjiKoreanPeriod = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer ppBulletArabicDBPlain = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer ppBulletArabicDBPeriod = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer ppBulletThaiAlphaPeriod = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer ppBulletThaiAlphaParenRight = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer ppBulletThaiAlphaParenBoth = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer ppBulletThaiNumPeriod = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer ppBulletThaiNumParenRight = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer ppBulletThaiNumParenBoth = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer ppBulletHindiAlphaPeriod = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer ppBulletHindiNumPeriod = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer ppBulletKanjiSimpChinDBPeriod = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer ppBulletHindiNumParenRight = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer ppBulletHindiAlpha1Period = Integer.valueOf(40);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("ppBulletStyleMixed", ppBulletStyleMixed);
    v.put("ppBulletAlphaLCPeriod", ppBulletAlphaLCPeriod);
    v.put("ppBulletAlphaUCPeriod", ppBulletAlphaUCPeriod);
    v.put("ppBulletArabicParenRight", ppBulletArabicParenRight);
    v.put("ppBulletArabicPeriod", ppBulletArabicPeriod);
    v.put("ppBulletRomanLCParenBoth", ppBulletRomanLCParenBoth);
    v.put("ppBulletRomanLCParenRight", ppBulletRomanLCParenRight);
    v.put("ppBulletRomanLCPeriod", ppBulletRomanLCPeriod);
    v.put("ppBulletRomanUCPeriod", ppBulletRomanUCPeriod);
    v.put("ppBulletAlphaLCParenBoth", ppBulletAlphaLCParenBoth);
    v.put("ppBulletAlphaLCParenRight", ppBulletAlphaLCParenRight);
    v.put("ppBulletAlphaUCParenBoth", ppBulletAlphaUCParenBoth);
    v.put("ppBulletAlphaUCParenRight", ppBulletAlphaUCParenRight);
    v.put("ppBulletArabicParenBoth", ppBulletArabicParenBoth);
    v.put("ppBulletArabicPlain", ppBulletArabicPlain);
    v.put("ppBulletRomanUCParenBoth", ppBulletRomanUCParenBoth);
    v.put("ppBulletRomanUCParenRight", ppBulletRomanUCParenRight);
    v.put("ppBulletSimpChinPlain", ppBulletSimpChinPlain);
    v.put("ppBulletSimpChinPeriod", ppBulletSimpChinPeriod);
    v.put("ppBulletCircleNumDBPlain", ppBulletCircleNumDBPlain);
    v.put("ppBulletCircleNumWDWhitePlain", ppBulletCircleNumWDWhitePlain);
    v.put("ppBulletCircleNumWDBlackPlain", ppBulletCircleNumWDBlackPlain);
    v.put("ppBulletTradChinPlain", ppBulletTradChinPlain);
    v.put("ppBulletTradChinPeriod", ppBulletTradChinPeriod);
    v.put("ppBulletArabicAlphaDash", ppBulletArabicAlphaDash);
    v.put("ppBulletArabicAbjadDash", ppBulletArabicAbjadDash);
    v.put("ppBulletHebrewAlphaDash", ppBulletHebrewAlphaDash);
    v.put("ppBulletKanjiKoreanPlain", ppBulletKanjiKoreanPlain);
    v.put("ppBulletKanjiKoreanPeriod", ppBulletKanjiKoreanPeriod);
    v.put("ppBulletArabicDBPlain", ppBulletArabicDBPlain);
    v.put("ppBulletArabicDBPeriod", ppBulletArabicDBPeriod);
    v.put("ppBulletThaiAlphaPeriod", ppBulletThaiAlphaPeriod);
    v.put("ppBulletThaiAlphaParenRight", ppBulletThaiAlphaParenRight);
    v.put("ppBulletThaiAlphaParenBoth", ppBulletThaiAlphaParenBoth);
    v.put("ppBulletThaiNumPeriod", ppBulletThaiNumPeriod);
    v.put("ppBulletThaiNumParenRight", ppBulletThaiNumParenRight);
    v.put("ppBulletThaiNumParenBoth", ppBulletThaiNumParenBoth);
    v.put("ppBulletHindiAlphaPeriod", ppBulletHindiAlphaPeriod);
    v.put("ppBulletHindiNumPeriod", ppBulletHindiNumPeriod);
    v.put("ppBulletKanjiSimpChinDBPeriod", ppBulletKanjiSimpChinDBPeriod);
    v.put("ppBulletHindiNumParenRight", ppBulletHindiNumParenRight);
    v.put("ppBulletHindiAlpha1Period", ppBulletHindiAlpha1Period);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
