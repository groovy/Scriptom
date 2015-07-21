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
public final class MsoPresetCamera
{
  private MsoPresetCamera()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer msoPresetCameraMixed = Integer.valueOf(-2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoCameraLegacyObliqueTopLeft = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoCameraLegacyObliqueTop = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoCameraLegacyObliqueTopRight = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoCameraLegacyObliqueLeft = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoCameraLegacyObliqueFront = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoCameraLegacyObliqueRight = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoCameraLegacyObliqueBottomLeft = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoCameraLegacyObliqueBottom = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoCameraLegacyObliqueBottomRight = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoCameraLegacyPerspectiveTopLeft = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoCameraLegacyPerspectiveTop = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoCameraLegacyPerspectiveTopRight = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoCameraLegacyPerspectiveLeft = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoCameraLegacyPerspectiveFront = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoCameraLegacyPerspectiveRight = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoCameraLegacyPerspectiveBottomLeft = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoCameraLegacyPerspectiveBottom = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoCameraLegacyPerspectiveBottomRight = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoCameraOrthographicFront = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoCameraIsometricTopUp = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoCameraIsometricTopDown = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoCameraIsometricBottomUp = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoCameraIsometricBottomDown = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoCameraIsometricLeftUp = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoCameraIsometricLeftDown = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoCameraIsometricRightUp = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer msoCameraIsometricRightDown = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer msoCameraIsometricOffAxis1Left = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer msoCameraIsometricOffAxis1Right = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer msoCameraIsometricOffAxis1Top = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer msoCameraIsometricOffAxis2Left = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer msoCameraIsometricOffAxis2Right = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer msoCameraIsometricOffAxis2Top = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer msoCameraIsometricOffAxis3Left = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer msoCameraIsometricOffAxis3Right = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer msoCameraIsometricOffAxis3Bottom = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer msoCameraIsometricOffAxis4Left = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer msoCameraIsometricOffAxis4Right = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer msoCameraIsometricOffAxis4Bottom = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer msoCameraObliqueTopLeft = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer msoCameraObliqueTop = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer msoCameraObliqueTopRight = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer msoCameraObliqueLeft = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer msoCameraObliqueRight = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer msoCameraObliqueBottomLeft = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer msoCameraObliqueBottom = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer msoCameraObliqueBottomRight = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer msoCameraPerspectiveFront = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer msoCameraPerspectiveLeft = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer msoCameraPerspectiveRight = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer msoCameraPerspectiveAbove = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer msoCameraPerspectiveBelow = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer msoCameraPerspectiveAboveLeftFacing = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer msoCameraPerspectiveAboveRightFacing = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer msoCameraPerspectiveContrastingLeftFacing = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer msoCameraPerspectiveContrastingRightFacing = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer msoCameraPerspectiveHeroicLeftFacing = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer msoCameraPerspectiveHeroicRightFacing = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer msoCameraPerspectiveHeroicExtremeLeftFacing = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer msoCameraPerspectiveHeroicExtremeRightFacing = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer msoCameraPerspectiveRelaxed = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer msoCameraPerspectiveRelaxedModerately = Integer.valueOf(62);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoPresetCameraMixed", msoPresetCameraMixed);
    v.put("msoCameraLegacyObliqueTopLeft", msoCameraLegacyObliqueTopLeft);
    v.put("msoCameraLegacyObliqueTop", msoCameraLegacyObliqueTop);
    v.put("msoCameraLegacyObliqueTopRight", msoCameraLegacyObliqueTopRight);
    v.put("msoCameraLegacyObliqueLeft", msoCameraLegacyObliqueLeft);
    v.put("msoCameraLegacyObliqueFront", msoCameraLegacyObliqueFront);
    v.put("msoCameraLegacyObliqueRight", msoCameraLegacyObliqueRight);
    v.put("msoCameraLegacyObliqueBottomLeft", msoCameraLegacyObliqueBottomLeft);
    v.put("msoCameraLegacyObliqueBottom", msoCameraLegacyObliqueBottom);
    v.put("msoCameraLegacyObliqueBottomRight", msoCameraLegacyObliqueBottomRight);
    v.put("msoCameraLegacyPerspectiveTopLeft", msoCameraLegacyPerspectiveTopLeft);
    v.put("msoCameraLegacyPerspectiveTop", msoCameraLegacyPerspectiveTop);
    v.put("msoCameraLegacyPerspectiveTopRight", msoCameraLegacyPerspectiveTopRight);
    v.put("msoCameraLegacyPerspectiveLeft", msoCameraLegacyPerspectiveLeft);
    v.put("msoCameraLegacyPerspectiveFront", msoCameraLegacyPerspectiveFront);
    v.put("msoCameraLegacyPerspectiveRight", msoCameraLegacyPerspectiveRight);
    v.put("msoCameraLegacyPerspectiveBottomLeft", msoCameraLegacyPerspectiveBottomLeft);
    v.put("msoCameraLegacyPerspectiveBottom", msoCameraLegacyPerspectiveBottom);
    v.put("msoCameraLegacyPerspectiveBottomRight", msoCameraLegacyPerspectiveBottomRight);
    v.put("msoCameraOrthographicFront", msoCameraOrthographicFront);
    v.put("msoCameraIsometricTopUp", msoCameraIsometricTopUp);
    v.put("msoCameraIsometricTopDown", msoCameraIsometricTopDown);
    v.put("msoCameraIsometricBottomUp", msoCameraIsometricBottomUp);
    v.put("msoCameraIsometricBottomDown", msoCameraIsometricBottomDown);
    v.put("msoCameraIsometricLeftUp", msoCameraIsometricLeftUp);
    v.put("msoCameraIsometricLeftDown", msoCameraIsometricLeftDown);
    v.put("msoCameraIsometricRightUp", msoCameraIsometricRightUp);
    v.put("msoCameraIsometricRightDown", msoCameraIsometricRightDown);
    v.put("msoCameraIsometricOffAxis1Left", msoCameraIsometricOffAxis1Left);
    v.put("msoCameraIsometricOffAxis1Right", msoCameraIsometricOffAxis1Right);
    v.put("msoCameraIsometricOffAxis1Top", msoCameraIsometricOffAxis1Top);
    v.put("msoCameraIsometricOffAxis2Left", msoCameraIsometricOffAxis2Left);
    v.put("msoCameraIsometricOffAxis2Right", msoCameraIsometricOffAxis2Right);
    v.put("msoCameraIsometricOffAxis2Top", msoCameraIsometricOffAxis2Top);
    v.put("msoCameraIsometricOffAxis3Left", msoCameraIsometricOffAxis3Left);
    v.put("msoCameraIsometricOffAxis3Right", msoCameraIsometricOffAxis3Right);
    v.put("msoCameraIsometricOffAxis3Bottom", msoCameraIsometricOffAxis3Bottom);
    v.put("msoCameraIsometricOffAxis4Left", msoCameraIsometricOffAxis4Left);
    v.put("msoCameraIsometricOffAxis4Right", msoCameraIsometricOffAxis4Right);
    v.put("msoCameraIsometricOffAxis4Bottom", msoCameraIsometricOffAxis4Bottom);
    v.put("msoCameraObliqueTopLeft", msoCameraObliqueTopLeft);
    v.put("msoCameraObliqueTop", msoCameraObliqueTop);
    v.put("msoCameraObliqueTopRight", msoCameraObliqueTopRight);
    v.put("msoCameraObliqueLeft", msoCameraObliqueLeft);
    v.put("msoCameraObliqueRight", msoCameraObliqueRight);
    v.put("msoCameraObliqueBottomLeft", msoCameraObliqueBottomLeft);
    v.put("msoCameraObliqueBottom", msoCameraObliqueBottom);
    v.put("msoCameraObliqueBottomRight", msoCameraObliqueBottomRight);
    v.put("msoCameraPerspectiveFront", msoCameraPerspectiveFront);
    v.put("msoCameraPerspectiveLeft", msoCameraPerspectiveLeft);
    v.put("msoCameraPerspectiveRight", msoCameraPerspectiveRight);
    v.put("msoCameraPerspectiveAbove", msoCameraPerspectiveAbove);
    v.put("msoCameraPerspectiveBelow", msoCameraPerspectiveBelow);
    v.put("msoCameraPerspectiveAboveLeftFacing", msoCameraPerspectiveAboveLeftFacing);
    v.put("msoCameraPerspectiveAboveRightFacing", msoCameraPerspectiveAboveRightFacing);
    v.put("msoCameraPerspectiveContrastingLeftFacing", msoCameraPerspectiveContrastingLeftFacing);
    v.put("msoCameraPerspectiveContrastingRightFacing", msoCameraPerspectiveContrastingRightFacing);
    v.put("msoCameraPerspectiveHeroicLeftFacing", msoCameraPerspectiveHeroicLeftFacing);
    v.put("msoCameraPerspectiveHeroicRightFacing", msoCameraPerspectiveHeroicRightFacing);
    v.put("msoCameraPerspectiveHeroicExtremeLeftFacing", msoCameraPerspectiveHeroicExtremeLeftFacing);
    v.put("msoCameraPerspectiveHeroicExtremeRightFacing", msoCameraPerspectiveHeroicExtremeRightFacing);
    v.put("msoCameraPerspectiveRelaxed", msoCameraPerspectiveRelaxed);
    v.put("msoCameraPerspectiveRelaxedModerately", msoCameraPerspectiveRelaxedModerately);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
