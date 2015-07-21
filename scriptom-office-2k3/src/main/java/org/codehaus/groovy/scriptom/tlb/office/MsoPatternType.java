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
package org.codehaus.groovy.scriptom.tlb.office;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class MsoPatternType
{
  private MsoPatternType()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer msoPatternMixed = Integer.valueOf(-2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoPattern5Percent = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoPattern10Percent = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoPattern20Percent = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoPattern25Percent = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoPattern30Percent = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoPattern40Percent = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoPattern50Percent = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoPattern60Percent = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoPattern70Percent = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoPattern75Percent = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoPattern80Percent = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoPattern90Percent = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoPatternDarkHorizontal = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoPatternDarkVertical = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoPatternDarkDownwardDiagonal = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoPatternDarkUpwardDiagonal = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoPatternSmallCheckerBoard = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoPatternTrellis = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoPatternLightHorizontal = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoPatternLightVertical = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoPatternLightDownwardDiagonal = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoPatternLightUpwardDiagonal = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoPatternSmallGrid = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoPatternDottedDiamond = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoPatternWideDownwardDiagonal = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoPatternWideUpwardDiagonal = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer msoPatternDashedUpwardDiagonal = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer msoPatternDashedDownwardDiagonal = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer msoPatternNarrowVertical = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer msoPatternNarrowHorizontal = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer msoPatternDashedVertical = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer msoPatternDashedHorizontal = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer msoPatternLargeConfetti = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer msoPatternLargeGrid = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer msoPatternHorizontalBrick = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer msoPatternLargeCheckerBoard = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer msoPatternSmallConfetti = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer msoPatternZigZag = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer msoPatternSolidDiamond = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer msoPatternDiagonalBrick = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer msoPatternOutlinedDiamond = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer msoPatternPlaid = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer msoPatternSphere = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer msoPatternWeave = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer msoPatternDottedGrid = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer msoPatternDivot = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer msoPatternShingle = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer msoPatternWave = Integer.valueOf(48);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoPatternMixed", msoPatternMixed);
    v.put("msoPattern5Percent", msoPattern5Percent);
    v.put("msoPattern10Percent", msoPattern10Percent);
    v.put("msoPattern20Percent", msoPattern20Percent);
    v.put("msoPattern25Percent", msoPattern25Percent);
    v.put("msoPattern30Percent", msoPattern30Percent);
    v.put("msoPattern40Percent", msoPattern40Percent);
    v.put("msoPattern50Percent", msoPattern50Percent);
    v.put("msoPattern60Percent", msoPattern60Percent);
    v.put("msoPattern70Percent", msoPattern70Percent);
    v.put("msoPattern75Percent", msoPattern75Percent);
    v.put("msoPattern80Percent", msoPattern80Percent);
    v.put("msoPattern90Percent", msoPattern90Percent);
    v.put("msoPatternDarkHorizontal", msoPatternDarkHorizontal);
    v.put("msoPatternDarkVertical", msoPatternDarkVertical);
    v.put("msoPatternDarkDownwardDiagonal", msoPatternDarkDownwardDiagonal);
    v.put("msoPatternDarkUpwardDiagonal", msoPatternDarkUpwardDiagonal);
    v.put("msoPatternSmallCheckerBoard", msoPatternSmallCheckerBoard);
    v.put("msoPatternTrellis", msoPatternTrellis);
    v.put("msoPatternLightHorizontal", msoPatternLightHorizontal);
    v.put("msoPatternLightVertical", msoPatternLightVertical);
    v.put("msoPatternLightDownwardDiagonal", msoPatternLightDownwardDiagonal);
    v.put("msoPatternLightUpwardDiagonal", msoPatternLightUpwardDiagonal);
    v.put("msoPatternSmallGrid", msoPatternSmallGrid);
    v.put("msoPatternDottedDiamond", msoPatternDottedDiamond);
    v.put("msoPatternWideDownwardDiagonal", msoPatternWideDownwardDiagonal);
    v.put("msoPatternWideUpwardDiagonal", msoPatternWideUpwardDiagonal);
    v.put("msoPatternDashedUpwardDiagonal", msoPatternDashedUpwardDiagonal);
    v.put("msoPatternDashedDownwardDiagonal", msoPatternDashedDownwardDiagonal);
    v.put("msoPatternNarrowVertical", msoPatternNarrowVertical);
    v.put("msoPatternNarrowHorizontal", msoPatternNarrowHorizontal);
    v.put("msoPatternDashedVertical", msoPatternDashedVertical);
    v.put("msoPatternDashedHorizontal", msoPatternDashedHorizontal);
    v.put("msoPatternLargeConfetti", msoPatternLargeConfetti);
    v.put("msoPatternLargeGrid", msoPatternLargeGrid);
    v.put("msoPatternHorizontalBrick", msoPatternHorizontalBrick);
    v.put("msoPatternLargeCheckerBoard", msoPatternLargeCheckerBoard);
    v.put("msoPatternSmallConfetti", msoPatternSmallConfetti);
    v.put("msoPatternZigZag", msoPatternZigZag);
    v.put("msoPatternSolidDiamond", msoPatternSolidDiamond);
    v.put("msoPatternDiagonalBrick", msoPatternDiagonalBrick);
    v.put("msoPatternOutlinedDiamond", msoPatternOutlinedDiamond);
    v.put("msoPatternPlaid", msoPatternPlaid);
    v.put("msoPatternSphere", msoPatternSphere);
    v.put("msoPatternWeave", msoPatternWeave);
    v.put("msoPatternDottedGrid", msoPatternDottedGrid);
    v.put("msoPatternDivot", msoPatternDivot);
    v.put("msoPatternShingle", msoPatternShingle);
    v.put("msoPatternWave", msoPatternWave);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
