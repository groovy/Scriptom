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
public final class WdTextureIndex
{
  private WdTextureIndex()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdTextureNone = Integer.valueOf(0);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdTexture2Pt5Percent = Integer.valueOf(25);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer wdTexture5Percent = Integer.valueOf(50);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer wdTexture7Pt5Percent = Integer.valueOf(75);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer wdTexture10Percent = Integer.valueOf(100);

  /**
   * Value is 125 (0x7D)
   */
  public static final Integer wdTexture12Pt5Percent = Integer.valueOf(125);

  /**
   * Value is 150 (0x96)
   */
  public static final Integer wdTexture15Percent = Integer.valueOf(150);

  /**
   * Value is 175 (0xAF)
   */
  public static final Integer wdTexture17Pt5Percent = Integer.valueOf(175);

  /**
   * Value is 200 (0xC8)
   */
  public static final Integer wdTexture20Percent = Integer.valueOf(200);

  /**
   * Value is 225 (0xE1)
   */
  public static final Integer wdTexture22Pt5Percent = Integer.valueOf(225);

  /**
   * Value is 250 (0xFA)
   */
  public static final Integer wdTexture25Percent = Integer.valueOf(250);

  /**
   * Value is 275 (0x113)
   */
  public static final Integer wdTexture27Pt5Percent = Integer.valueOf(275);

  /**
   * Value is 300 (0x12C)
   */
  public static final Integer wdTexture30Percent = Integer.valueOf(300);

  /**
   * Value is 325 (0x145)
   */
  public static final Integer wdTexture32Pt5Percent = Integer.valueOf(325);

  /**
   * Value is 350 (0x15E)
   */
  public static final Integer wdTexture35Percent = Integer.valueOf(350);

  /**
   * Value is 375 (0x177)
   */
  public static final Integer wdTexture37Pt5Percent = Integer.valueOf(375);

  /**
   * Value is 400 (0x190)
   */
  public static final Integer wdTexture40Percent = Integer.valueOf(400);

  /**
   * Value is 425 (0x1A9)
   */
  public static final Integer wdTexture42Pt5Percent = Integer.valueOf(425);

  /**
   * Value is 450 (0x1C2)
   */
  public static final Integer wdTexture45Percent = Integer.valueOf(450);

  /**
   * Value is 475 (0x1DB)
   */
  public static final Integer wdTexture47Pt5Percent = Integer.valueOf(475);

  /**
   * Value is 500 (0x1F4)
   */
  public static final Integer wdTexture50Percent = Integer.valueOf(500);

  /**
   * Value is 525 (0x20D)
   */
  public static final Integer wdTexture52Pt5Percent = Integer.valueOf(525);

  /**
   * Value is 550 (0x226)
   */
  public static final Integer wdTexture55Percent = Integer.valueOf(550);

  /**
   * Value is 575 (0x23F)
   */
  public static final Integer wdTexture57Pt5Percent = Integer.valueOf(575);

  /**
   * Value is 600 (0x258)
   */
  public static final Integer wdTexture60Percent = Integer.valueOf(600);

  /**
   * Value is 625 (0x271)
   */
  public static final Integer wdTexture62Pt5Percent = Integer.valueOf(625);

  /**
   * Value is 650 (0x28A)
   */
  public static final Integer wdTexture65Percent = Integer.valueOf(650);

  /**
   * Value is 675 (0x2A3)
   */
  public static final Integer wdTexture67Pt5Percent = Integer.valueOf(675);

  /**
   * Value is 700 (0x2BC)
   */
  public static final Integer wdTexture70Percent = Integer.valueOf(700);

  /**
   * Value is 725 (0x2D5)
   */
  public static final Integer wdTexture72Pt5Percent = Integer.valueOf(725);

  /**
   * Value is 750 (0x2EE)
   */
  public static final Integer wdTexture75Percent = Integer.valueOf(750);

  /**
   * Value is 775 (0x307)
   */
  public static final Integer wdTexture77Pt5Percent = Integer.valueOf(775);

  /**
   * Value is 800 (0x320)
   */
  public static final Integer wdTexture80Percent = Integer.valueOf(800);

  /**
   * Value is 825 (0x339)
   */
  public static final Integer wdTexture82Pt5Percent = Integer.valueOf(825);

  /**
   * Value is 850 (0x352)
   */
  public static final Integer wdTexture85Percent = Integer.valueOf(850);

  /**
   * Value is 875 (0x36B)
   */
  public static final Integer wdTexture87Pt5Percent = Integer.valueOf(875);

  /**
   * Value is 900 (0x384)
   */
  public static final Integer wdTexture90Percent = Integer.valueOf(900);

  /**
   * Value is 925 (0x39D)
   */
  public static final Integer wdTexture92Pt5Percent = Integer.valueOf(925);

  /**
   * Value is 950 (0x3B6)
   */
  public static final Integer wdTexture95Percent = Integer.valueOf(950);

  /**
   * Value is 975 (0x3CF)
   */
  public static final Integer wdTexture97Pt5Percent = Integer.valueOf(975);

  /**
   * Value is 1000 (0x3E8)
   */
  public static final Integer wdTextureSolid = Integer.valueOf(1000);

  /**
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer wdTextureDarkHorizontal = Integer.valueOf(-1);

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer wdTextureDarkVertical = Integer.valueOf(-2);

  /**
   * Value is -3 (0xFFFFFFFD)
   */
  public static final Integer wdTextureDarkDiagonalDown = Integer.valueOf(-3);

  /**
   * Value is -4 (0xFFFFFFFC)
   */
  public static final Integer wdTextureDarkDiagonalUp = Integer.valueOf(-4);

  /**
   * Value is -5 (0xFFFFFFFB)
   */
  public static final Integer wdTextureDarkCross = Integer.valueOf(-5);

  /**
   * Value is -6 (0xFFFFFFFA)
   */
  public static final Integer wdTextureDarkDiagonalCross = Integer.valueOf(-6);

  /**
   * Value is -7 (0xFFFFFFF9)
   */
  public static final Integer wdTextureHorizontal = Integer.valueOf(-7);

  /**
   * Value is -8 (0xFFFFFFF8)
   */
  public static final Integer wdTextureVertical = Integer.valueOf(-8);

  /**
   * Value is -9 (0xFFFFFFF7)
   */
  public static final Integer wdTextureDiagonalDown = Integer.valueOf(-9);

  /**
   * Value is -10 (0xFFFFFFF6)
   */
  public static final Integer wdTextureDiagonalUp = Integer.valueOf(-10);

  /**
   * Value is -11 (0xFFFFFFF5)
   */
  public static final Integer wdTextureCross = Integer.valueOf(-11);

  /**
   * Value is -12 (0xFFFFFFF4)
   */
  public static final Integer wdTextureDiagonalCross = Integer.valueOf(-12);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdTextureNone", wdTextureNone);
    v.put("wdTexture2Pt5Percent", wdTexture2Pt5Percent);
    v.put("wdTexture5Percent", wdTexture5Percent);
    v.put("wdTexture7Pt5Percent", wdTexture7Pt5Percent);
    v.put("wdTexture10Percent", wdTexture10Percent);
    v.put("wdTexture12Pt5Percent", wdTexture12Pt5Percent);
    v.put("wdTexture15Percent", wdTexture15Percent);
    v.put("wdTexture17Pt5Percent", wdTexture17Pt5Percent);
    v.put("wdTexture20Percent", wdTexture20Percent);
    v.put("wdTexture22Pt5Percent", wdTexture22Pt5Percent);
    v.put("wdTexture25Percent", wdTexture25Percent);
    v.put("wdTexture27Pt5Percent", wdTexture27Pt5Percent);
    v.put("wdTexture30Percent", wdTexture30Percent);
    v.put("wdTexture32Pt5Percent", wdTexture32Pt5Percent);
    v.put("wdTexture35Percent", wdTexture35Percent);
    v.put("wdTexture37Pt5Percent", wdTexture37Pt5Percent);
    v.put("wdTexture40Percent", wdTexture40Percent);
    v.put("wdTexture42Pt5Percent", wdTexture42Pt5Percent);
    v.put("wdTexture45Percent", wdTexture45Percent);
    v.put("wdTexture47Pt5Percent", wdTexture47Pt5Percent);
    v.put("wdTexture50Percent", wdTexture50Percent);
    v.put("wdTexture52Pt5Percent", wdTexture52Pt5Percent);
    v.put("wdTexture55Percent", wdTexture55Percent);
    v.put("wdTexture57Pt5Percent", wdTexture57Pt5Percent);
    v.put("wdTexture60Percent", wdTexture60Percent);
    v.put("wdTexture62Pt5Percent", wdTexture62Pt5Percent);
    v.put("wdTexture65Percent", wdTexture65Percent);
    v.put("wdTexture67Pt5Percent", wdTexture67Pt5Percent);
    v.put("wdTexture70Percent", wdTexture70Percent);
    v.put("wdTexture72Pt5Percent", wdTexture72Pt5Percent);
    v.put("wdTexture75Percent", wdTexture75Percent);
    v.put("wdTexture77Pt5Percent", wdTexture77Pt5Percent);
    v.put("wdTexture80Percent", wdTexture80Percent);
    v.put("wdTexture82Pt5Percent", wdTexture82Pt5Percent);
    v.put("wdTexture85Percent", wdTexture85Percent);
    v.put("wdTexture87Pt5Percent", wdTexture87Pt5Percent);
    v.put("wdTexture90Percent", wdTexture90Percent);
    v.put("wdTexture92Pt5Percent", wdTexture92Pt5Percent);
    v.put("wdTexture95Percent", wdTexture95Percent);
    v.put("wdTexture97Pt5Percent", wdTexture97Pt5Percent);
    v.put("wdTextureSolid", wdTextureSolid);
    v.put("wdTextureDarkHorizontal", wdTextureDarkHorizontal);
    v.put("wdTextureDarkVertical", wdTextureDarkVertical);
    v.put("wdTextureDarkDiagonalDown", wdTextureDarkDiagonalDown);
    v.put("wdTextureDarkDiagonalUp", wdTextureDarkDiagonalUp);
    v.put("wdTextureDarkCross", wdTextureDarkCross);
    v.put("wdTextureDarkDiagonalCross", wdTextureDarkDiagonalCross);
    v.put("wdTextureHorizontal", wdTextureHorizontal);
    v.put("wdTextureVertical", wdTextureVertical);
    v.put("wdTextureDiagonalDown", wdTextureDiagonalDown);
    v.put("wdTextureDiagonalUp", wdTextureDiagonalUp);
    v.put("wdTextureCross", wdTextureCross);
    v.put("wdTextureDiagonalCross", wdTextureDiagonalCross);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
