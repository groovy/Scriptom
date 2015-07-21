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
package org.codehaus.groovy.scriptom.tlb.office.powerpoint;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class MsoAnimDirection
{
  private MsoAnimDirection()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer msoAnimDirectionNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoAnimDirectionUp = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoAnimDirectionRight = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoAnimDirectionDown = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoAnimDirectionLeft = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoAnimDirectionOrdinalMask = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoAnimDirectionUpLeft = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoAnimDirectionUpRight = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoAnimDirectionDownRight = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoAnimDirectionDownLeft = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoAnimDirectionTop = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoAnimDirectionBottom = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoAnimDirectionTopLeft = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoAnimDirectionTopRight = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoAnimDirectionBottomRight = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoAnimDirectionBottomLeft = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoAnimDirectionHorizontal = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoAnimDirectionVertical = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoAnimDirectionAcross = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoAnimDirectionIn = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoAnimDirectionOut = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoAnimDirectionClockwise = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoAnimDirectionCounterclockwise = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoAnimDirectionHorizontalIn = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoAnimDirectionHorizontalOut = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoAnimDirectionVerticalIn = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoAnimDirectionVerticalOut = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer msoAnimDirectionSlightly = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer msoAnimDirectionCenter = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer msoAnimDirectionInSlightly = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer msoAnimDirectionInCenter = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer msoAnimDirectionInBottom = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer msoAnimDirectionOutSlightly = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer msoAnimDirectionOutCenter = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer msoAnimDirectionOutBottom = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer msoAnimDirectionFontBold = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer msoAnimDirectionFontItalic = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer msoAnimDirectionFontUnderline = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer msoAnimDirectionFontStrikethrough = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer msoAnimDirectionFontShadow = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer msoAnimDirectionFontAllCaps = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer msoAnimDirectionInstant = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer msoAnimDirectionGradual = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer msoAnimDirectionCycleClockwise = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer msoAnimDirectionCycleCounterclockwise = Integer.valueOf(44);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoAnimDirectionNone", msoAnimDirectionNone);
    v.put("msoAnimDirectionUp", msoAnimDirectionUp);
    v.put("msoAnimDirectionRight", msoAnimDirectionRight);
    v.put("msoAnimDirectionDown", msoAnimDirectionDown);
    v.put("msoAnimDirectionLeft", msoAnimDirectionLeft);
    v.put("msoAnimDirectionOrdinalMask", msoAnimDirectionOrdinalMask);
    v.put("msoAnimDirectionUpLeft", msoAnimDirectionUpLeft);
    v.put("msoAnimDirectionUpRight", msoAnimDirectionUpRight);
    v.put("msoAnimDirectionDownRight", msoAnimDirectionDownRight);
    v.put("msoAnimDirectionDownLeft", msoAnimDirectionDownLeft);
    v.put("msoAnimDirectionTop", msoAnimDirectionTop);
    v.put("msoAnimDirectionBottom", msoAnimDirectionBottom);
    v.put("msoAnimDirectionTopLeft", msoAnimDirectionTopLeft);
    v.put("msoAnimDirectionTopRight", msoAnimDirectionTopRight);
    v.put("msoAnimDirectionBottomRight", msoAnimDirectionBottomRight);
    v.put("msoAnimDirectionBottomLeft", msoAnimDirectionBottomLeft);
    v.put("msoAnimDirectionHorizontal", msoAnimDirectionHorizontal);
    v.put("msoAnimDirectionVertical", msoAnimDirectionVertical);
    v.put("msoAnimDirectionAcross", msoAnimDirectionAcross);
    v.put("msoAnimDirectionIn", msoAnimDirectionIn);
    v.put("msoAnimDirectionOut", msoAnimDirectionOut);
    v.put("msoAnimDirectionClockwise", msoAnimDirectionClockwise);
    v.put("msoAnimDirectionCounterclockwise", msoAnimDirectionCounterclockwise);
    v.put("msoAnimDirectionHorizontalIn", msoAnimDirectionHorizontalIn);
    v.put("msoAnimDirectionHorizontalOut", msoAnimDirectionHorizontalOut);
    v.put("msoAnimDirectionVerticalIn", msoAnimDirectionVerticalIn);
    v.put("msoAnimDirectionVerticalOut", msoAnimDirectionVerticalOut);
    v.put("msoAnimDirectionSlightly", msoAnimDirectionSlightly);
    v.put("msoAnimDirectionCenter", msoAnimDirectionCenter);
    v.put("msoAnimDirectionInSlightly", msoAnimDirectionInSlightly);
    v.put("msoAnimDirectionInCenter", msoAnimDirectionInCenter);
    v.put("msoAnimDirectionInBottom", msoAnimDirectionInBottom);
    v.put("msoAnimDirectionOutSlightly", msoAnimDirectionOutSlightly);
    v.put("msoAnimDirectionOutCenter", msoAnimDirectionOutCenter);
    v.put("msoAnimDirectionOutBottom", msoAnimDirectionOutBottom);
    v.put("msoAnimDirectionFontBold", msoAnimDirectionFontBold);
    v.put("msoAnimDirectionFontItalic", msoAnimDirectionFontItalic);
    v.put("msoAnimDirectionFontUnderline", msoAnimDirectionFontUnderline);
    v.put("msoAnimDirectionFontStrikethrough", msoAnimDirectionFontStrikethrough);
    v.put("msoAnimDirectionFontShadow", msoAnimDirectionFontShadow);
    v.put("msoAnimDirectionFontAllCaps", msoAnimDirectionFontAllCaps);
    v.put("msoAnimDirectionInstant", msoAnimDirectionInstant);
    v.put("msoAnimDirectionGradual", msoAnimDirectionGradual);
    v.put("msoAnimDirectionCycleClockwise", msoAnimDirectionCycleClockwise);
    v.put("msoAnimDirectionCycleCounterclockwise", msoAnimDirectionCycleCounterclockwise);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
