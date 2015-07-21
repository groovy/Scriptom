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
public final class MsoAnimEffect
{
  private MsoAnimEffect()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer msoAnimEffectCustom = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoAnimEffectAppear = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoAnimEffectFly = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoAnimEffectBlinds = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoAnimEffectBox = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoAnimEffectCheckerboard = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoAnimEffectCircle = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoAnimEffectCrawl = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoAnimEffectDiamond = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoAnimEffectDissolve = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoAnimEffectFade = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoAnimEffectFlashOnce = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoAnimEffectPeek = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoAnimEffectPlus = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoAnimEffectRandomBars = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoAnimEffectSpiral = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoAnimEffectSplit = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoAnimEffectStretch = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoAnimEffectStrips = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoAnimEffectSwivel = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoAnimEffectWedge = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoAnimEffectWheel = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoAnimEffectWipe = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoAnimEffectZoom = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoAnimEffectRandomEffects = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoAnimEffectBoomerang = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoAnimEffectBounce = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer msoAnimEffectColorReveal = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer msoAnimEffectCredits = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer msoAnimEffectEaseIn = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer msoAnimEffectFloat = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer msoAnimEffectGrowAndTurn = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer msoAnimEffectLightSpeed = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer msoAnimEffectPinwheel = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer msoAnimEffectRiseUp = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer msoAnimEffectSwish = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer msoAnimEffectThinLine = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer msoAnimEffectUnfold = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer msoAnimEffectWhip = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer msoAnimEffectAscend = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer msoAnimEffectCenterRevolve = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer msoAnimEffectFadedSwivel = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer msoAnimEffectDescend = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer msoAnimEffectSling = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer msoAnimEffectSpinner = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer msoAnimEffectStretchy = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer msoAnimEffectZip = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer msoAnimEffectArcUp = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer msoAnimEffectFadedZoom = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer msoAnimEffectGlide = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer msoAnimEffectExpand = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer msoAnimEffectFlip = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer msoAnimEffectShimmer = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer msoAnimEffectFold = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer msoAnimEffectChangeFillColor = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer msoAnimEffectChangeFont = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer msoAnimEffectChangeFontColor = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer msoAnimEffectChangeFontSize = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer msoAnimEffectChangeFontStyle = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer msoAnimEffectGrowShrink = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer msoAnimEffectChangeLineColor = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer msoAnimEffectSpin = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer msoAnimEffectTransparency = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer msoAnimEffectBoldFlash = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer msoAnimEffectBlast = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer msoAnimEffectBoldReveal = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer msoAnimEffectBrushOnColor = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer msoAnimEffectBrushOnUnderline = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer msoAnimEffectColorBlend = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer msoAnimEffectColorWave = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer msoAnimEffectComplementaryColor = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer msoAnimEffectComplementaryColor2 = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer msoAnimEffectContrastingColor = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer msoAnimEffectDarken = Integer.valueOf(73);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer msoAnimEffectDesaturate = Integer.valueOf(74);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer msoAnimEffectFlashBulb = Integer.valueOf(75);

  /**
   * Value is 76 (0x4C)
   */
  public static final Integer msoAnimEffectFlicker = Integer.valueOf(76);

  /**
   * Value is 77 (0x4D)
   */
  public static final Integer msoAnimEffectGrowWithColor = Integer.valueOf(77);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer msoAnimEffectLighten = Integer.valueOf(78);

  /**
   * Value is 79 (0x4F)
   */
  public static final Integer msoAnimEffectStyleEmphasis = Integer.valueOf(79);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer msoAnimEffectTeeter = Integer.valueOf(80);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer msoAnimEffectVerticalGrow = Integer.valueOf(81);

  /**
   * Value is 82 (0x52)
   */
  public static final Integer msoAnimEffectWave = Integer.valueOf(82);

  /**
   * Value is 83 (0x53)
   */
  public static final Integer msoAnimEffectMediaPlay = Integer.valueOf(83);

  /**
   * Value is 84 (0x54)
   */
  public static final Integer msoAnimEffectMediaPause = Integer.valueOf(84);

  /**
   * Value is 85 (0x55)
   */
  public static final Integer msoAnimEffectMediaStop = Integer.valueOf(85);

  /**
   * Value is 86 (0x56)
   */
  public static final Integer msoAnimEffectPathCircle = Integer.valueOf(86);

  /**
   * Value is 87 (0x57)
   */
  public static final Integer msoAnimEffectPathRightTriangle = Integer.valueOf(87);

  /**
   * Value is 88 (0x58)
   */
  public static final Integer msoAnimEffectPathDiamond = Integer.valueOf(88);

  /**
   * Value is 89 (0x59)
   */
  public static final Integer msoAnimEffectPathHexagon = Integer.valueOf(89);

  /**
   * Value is 90 (0x5A)
   */
  public static final Integer msoAnimEffectPath5PointStar = Integer.valueOf(90);

  /**
   * Value is 91 (0x5B)
   */
  public static final Integer msoAnimEffectPathCrescentMoon = Integer.valueOf(91);

  /**
   * Value is 92 (0x5C)
   */
  public static final Integer msoAnimEffectPathSquare = Integer.valueOf(92);

  /**
   * Value is 93 (0x5D)
   */
  public static final Integer msoAnimEffectPathTrapezoid = Integer.valueOf(93);

  /**
   * Value is 94 (0x5E)
   */
  public static final Integer msoAnimEffectPathHeart = Integer.valueOf(94);

  /**
   * Value is 95 (0x5F)
   */
  public static final Integer msoAnimEffectPathOctagon = Integer.valueOf(95);

  /**
   * Value is 96 (0x60)
   */
  public static final Integer msoAnimEffectPath6PointStar = Integer.valueOf(96);

  /**
   * Value is 97 (0x61)
   */
  public static final Integer msoAnimEffectPathFootball = Integer.valueOf(97);

  /**
   * Value is 98 (0x62)
   */
  public static final Integer msoAnimEffectPathEqualTriangle = Integer.valueOf(98);

  /**
   * Value is 99 (0x63)
   */
  public static final Integer msoAnimEffectPathParallelogram = Integer.valueOf(99);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer msoAnimEffectPathPentagon = Integer.valueOf(100);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer msoAnimEffectPath4PointStar = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer msoAnimEffectPath8PointStar = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer msoAnimEffectPathTeardrop = Integer.valueOf(103);

  /**
   * Value is 104 (0x68)
   */
  public static final Integer msoAnimEffectPathPointyStar = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer msoAnimEffectPathCurvedSquare = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer msoAnimEffectPathCurvedX = Integer.valueOf(106);

  /**
   * Value is 107 (0x6B)
   */
  public static final Integer msoAnimEffectPathVerticalFigure8 = Integer.valueOf(107);

  /**
   * Value is 108 (0x6C)
   */
  public static final Integer msoAnimEffectPathCurvyStar = Integer.valueOf(108);

  /**
   * Value is 109 (0x6D)
   */
  public static final Integer msoAnimEffectPathLoopdeLoop = Integer.valueOf(109);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer msoAnimEffectPathBuzzsaw = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer msoAnimEffectPathHorizontalFigure8 = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer msoAnimEffectPathPeanut = Integer.valueOf(112);

  /**
   * Value is 113 (0x71)
   */
  public static final Integer msoAnimEffectPathFigure8Four = Integer.valueOf(113);

  /**
   * Value is 114 (0x72)
   */
  public static final Integer msoAnimEffectPathNeutron = Integer.valueOf(114);

  /**
   * Value is 115 (0x73)
   */
  public static final Integer msoAnimEffectPathSwoosh = Integer.valueOf(115);

  /**
   * Value is 116 (0x74)
   */
  public static final Integer msoAnimEffectPathBean = Integer.valueOf(116);

  /**
   * Value is 117 (0x75)
   */
  public static final Integer msoAnimEffectPathPlus = Integer.valueOf(117);

  /**
   * Value is 118 (0x76)
   */
  public static final Integer msoAnimEffectPathInvertedTriangle = Integer.valueOf(118);

  /**
   * Value is 119 (0x77)
   */
  public static final Integer msoAnimEffectPathInvertedSquare = Integer.valueOf(119);

  /**
   * Value is 120 (0x78)
   */
  public static final Integer msoAnimEffectPathLeft = Integer.valueOf(120);

  /**
   * Value is 121 (0x79)
   */
  public static final Integer msoAnimEffectPathTurnRight = Integer.valueOf(121);

  /**
   * Value is 122 (0x7A)
   */
  public static final Integer msoAnimEffectPathArcDown = Integer.valueOf(122);

  /**
   * Value is 123 (0x7B)
   */
  public static final Integer msoAnimEffectPathZigzag = Integer.valueOf(123);

  /**
   * Value is 124 (0x7C)
   */
  public static final Integer msoAnimEffectPathSCurve2 = Integer.valueOf(124);

  /**
   * Value is 125 (0x7D)
   */
  public static final Integer msoAnimEffectPathSineWave = Integer.valueOf(125);

  /**
   * Value is 126 (0x7E)
   */
  public static final Integer msoAnimEffectPathBounceLeft = Integer.valueOf(126);

  /**
   * Value is 127 (0x7F)
   */
  public static final Integer msoAnimEffectPathDown = Integer.valueOf(127);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer msoAnimEffectPathTurnUp = Integer.valueOf(128);

  /**
   * Value is 129 (0x81)
   */
  public static final Integer msoAnimEffectPathArcUp = Integer.valueOf(129);

  /**
   * Value is 130 (0x82)
   */
  public static final Integer msoAnimEffectPathHeartbeat = Integer.valueOf(130);

  /**
   * Value is 131 (0x83)
   */
  public static final Integer msoAnimEffectPathSpiralRight = Integer.valueOf(131);

  /**
   * Value is 132 (0x84)
   */
  public static final Integer msoAnimEffectPathWave = Integer.valueOf(132);

  /**
   * Value is 133 (0x85)
   */
  public static final Integer msoAnimEffectPathCurvyLeft = Integer.valueOf(133);

  /**
   * Value is 134 (0x86)
   */
  public static final Integer msoAnimEffectPathDiagonalDownRight = Integer.valueOf(134);

  /**
   * Value is 135 (0x87)
   */
  public static final Integer msoAnimEffectPathTurnDown = Integer.valueOf(135);

  /**
   * Value is 136 (0x88)
   */
  public static final Integer msoAnimEffectPathArcLeft = Integer.valueOf(136);

  /**
   * Value is 137 (0x89)
   */
  public static final Integer msoAnimEffectPathFunnel = Integer.valueOf(137);

  /**
   * Value is 138 (0x8A)
   */
  public static final Integer msoAnimEffectPathSpring = Integer.valueOf(138);

  /**
   * Value is 139 (0x8B)
   */
  public static final Integer msoAnimEffectPathBounceRight = Integer.valueOf(139);

  /**
   * Value is 140 (0x8C)
   */
  public static final Integer msoAnimEffectPathSpiralLeft = Integer.valueOf(140);

  /**
   * Value is 141 (0x8D)
   */
  public static final Integer msoAnimEffectPathDiagonalUpRight = Integer.valueOf(141);

  /**
   * Value is 142 (0x8E)
   */
  public static final Integer msoAnimEffectPathTurnUpRight = Integer.valueOf(142);

  /**
   * Value is 143 (0x8F)
   */
  public static final Integer msoAnimEffectPathArcRight = Integer.valueOf(143);

  /**
   * Value is 144 (0x90)
   */
  public static final Integer msoAnimEffectPathSCurve1 = Integer.valueOf(144);

  /**
   * Value is 145 (0x91)
   */
  public static final Integer msoAnimEffectPathDecayingWave = Integer.valueOf(145);

  /**
   * Value is 146 (0x92)
   */
  public static final Integer msoAnimEffectPathCurvyRight = Integer.valueOf(146);

  /**
   * Value is 147 (0x93)
   */
  public static final Integer msoAnimEffectPathStairsDown = Integer.valueOf(147);

  /**
   * Value is 148 (0x94)
   */
  public static final Integer msoAnimEffectPathUp = Integer.valueOf(148);

  /**
   * Value is 149 (0x95)
   */
  public static final Integer msoAnimEffectPathRight = Integer.valueOf(149);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoAnimEffectCustom", msoAnimEffectCustom);
    v.put("msoAnimEffectAppear", msoAnimEffectAppear);
    v.put("msoAnimEffectFly", msoAnimEffectFly);
    v.put("msoAnimEffectBlinds", msoAnimEffectBlinds);
    v.put("msoAnimEffectBox", msoAnimEffectBox);
    v.put("msoAnimEffectCheckerboard", msoAnimEffectCheckerboard);
    v.put("msoAnimEffectCircle", msoAnimEffectCircle);
    v.put("msoAnimEffectCrawl", msoAnimEffectCrawl);
    v.put("msoAnimEffectDiamond", msoAnimEffectDiamond);
    v.put("msoAnimEffectDissolve", msoAnimEffectDissolve);
    v.put("msoAnimEffectFade", msoAnimEffectFade);
    v.put("msoAnimEffectFlashOnce", msoAnimEffectFlashOnce);
    v.put("msoAnimEffectPeek", msoAnimEffectPeek);
    v.put("msoAnimEffectPlus", msoAnimEffectPlus);
    v.put("msoAnimEffectRandomBars", msoAnimEffectRandomBars);
    v.put("msoAnimEffectSpiral", msoAnimEffectSpiral);
    v.put("msoAnimEffectSplit", msoAnimEffectSplit);
    v.put("msoAnimEffectStretch", msoAnimEffectStretch);
    v.put("msoAnimEffectStrips", msoAnimEffectStrips);
    v.put("msoAnimEffectSwivel", msoAnimEffectSwivel);
    v.put("msoAnimEffectWedge", msoAnimEffectWedge);
    v.put("msoAnimEffectWheel", msoAnimEffectWheel);
    v.put("msoAnimEffectWipe", msoAnimEffectWipe);
    v.put("msoAnimEffectZoom", msoAnimEffectZoom);
    v.put("msoAnimEffectRandomEffects", msoAnimEffectRandomEffects);
    v.put("msoAnimEffectBoomerang", msoAnimEffectBoomerang);
    v.put("msoAnimEffectBounce", msoAnimEffectBounce);
    v.put("msoAnimEffectColorReveal", msoAnimEffectColorReveal);
    v.put("msoAnimEffectCredits", msoAnimEffectCredits);
    v.put("msoAnimEffectEaseIn", msoAnimEffectEaseIn);
    v.put("msoAnimEffectFloat", msoAnimEffectFloat);
    v.put("msoAnimEffectGrowAndTurn", msoAnimEffectGrowAndTurn);
    v.put("msoAnimEffectLightSpeed", msoAnimEffectLightSpeed);
    v.put("msoAnimEffectPinwheel", msoAnimEffectPinwheel);
    v.put("msoAnimEffectRiseUp", msoAnimEffectRiseUp);
    v.put("msoAnimEffectSwish", msoAnimEffectSwish);
    v.put("msoAnimEffectThinLine", msoAnimEffectThinLine);
    v.put("msoAnimEffectUnfold", msoAnimEffectUnfold);
    v.put("msoAnimEffectWhip", msoAnimEffectWhip);
    v.put("msoAnimEffectAscend", msoAnimEffectAscend);
    v.put("msoAnimEffectCenterRevolve", msoAnimEffectCenterRevolve);
    v.put("msoAnimEffectFadedSwivel", msoAnimEffectFadedSwivel);
    v.put("msoAnimEffectDescend", msoAnimEffectDescend);
    v.put("msoAnimEffectSling", msoAnimEffectSling);
    v.put("msoAnimEffectSpinner", msoAnimEffectSpinner);
    v.put("msoAnimEffectStretchy", msoAnimEffectStretchy);
    v.put("msoAnimEffectZip", msoAnimEffectZip);
    v.put("msoAnimEffectArcUp", msoAnimEffectArcUp);
    v.put("msoAnimEffectFadedZoom", msoAnimEffectFadedZoom);
    v.put("msoAnimEffectGlide", msoAnimEffectGlide);
    v.put("msoAnimEffectExpand", msoAnimEffectExpand);
    v.put("msoAnimEffectFlip", msoAnimEffectFlip);
    v.put("msoAnimEffectShimmer", msoAnimEffectShimmer);
    v.put("msoAnimEffectFold", msoAnimEffectFold);
    v.put("msoAnimEffectChangeFillColor", msoAnimEffectChangeFillColor);
    v.put("msoAnimEffectChangeFont", msoAnimEffectChangeFont);
    v.put("msoAnimEffectChangeFontColor", msoAnimEffectChangeFontColor);
    v.put("msoAnimEffectChangeFontSize", msoAnimEffectChangeFontSize);
    v.put("msoAnimEffectChangeFontStyle", msoAnimEffectChangeFontStyle);
    v.put("msoAnimEffectGrowShrink", msoAnimEffectGrowShrink);
    v.put("msoAnimEffectChangeLineColor", msoAnimEffectChangeLineColor);
    v.put("msoAnimEffectSpin", msoAnimEffectSpin);
    v.put("msoAnimEffectTransparency", msoAnimEffectTransparency);
    v.put("msoAnimEffectBoldFlash", msoAnimEffectBoldFlash);
    v.put("msoAnimEffectBlast", msoAnimEffectBlast);
    v.put("msoAnimEffectBoldReveal", msoAnimEffectBoldReveal);
    v.put("msoAnimEffectBrushOnColor", msoAnimEffectBrushOnColor);
    v.put("msoAnimEffectBrushOnUnderline", msoAnimEffectBrushOnUnderline);
    v.put("msoAnimEffectColorBlend", msoAnimEffectColorBlend);
    v.put("msoAnimEffectColorWave", msoAnimEffectColorWave);
    v.put("msoAnimEffectComplementaryColor", msoAnimEffectComplementaryColor);
    v.put("msoAnimEffectComplementaryColor2", msoAnimEffectComplementaryColor2);
    v.put("msoAnimEffectContrastingColor", msoAnimEffectContrastingColor);
    v.put("msoAnimEffectDarken", msoAnimEffectDarken);
    v.put("msoAnimEffectDesaturate", msoAnimEffectDesaturate);
    v.put("msoAnimEffectFlashBulb", msoAnimEffectFlashBulb);
    v.put("msoAnimEffectFlicker", msoAnimEffectFlicker);
    v.put("msoAnimEffectGrowWithColor", msoAnimEffectGrowWithColor);
    v.put("msoAnimEffectLighten", msoAnimEffectLighten);
    v.put("msoAnimEffectStyleEmphasis", msoAnimEffectStyleEmphasis);
    v.put("msoAnimEffectTeeter", msoAnimEffectTeeter);
    v.put("msoAnimEffectVerticalGrow", msoAnimEffectVerticalGrow);
    v.put("msoAnimEffectWave", msoAnimEffectWave);
    v.put("msoAnimEffectMediaPlay", msoAnimEffectMediaPlay);
    v.put("msoAnimEffectMediaPause", msoAnimEffectMediaPause);
    v.put("msoAnimEffectMediaStop", msoAnimEffectMediaStop);
    v.put("msoAnimEffectPathCircle", msoAnimEffectPathCircle);
    v.put("msoAnimEffectPathRightTriangle", msoAnimEffectPathRightTriangle);
    v.put("msoAnimEffectPathDiamond", msoAnimEffectPathDiamond);
    v.put("msoAnimEffectPathHexagon", msoAnimEffectPathHexagon);
    v.put("msoAnimEffectPath5PointStar", msoAnimEffectPath5PointStar);
    v.put("msoAnimEffectPathCrescentMoon", msoAnimEffectPathCrescentMoon);
    v.put("msoAnimEffectPathSquare", msoAnimEffectPathSquare);
    v.put("msoAnimEffectPathTrapezoid", msoAnimEffectPathTrapezoid);
    v.put("msoAnimEffectPathHeart", msoAnimEffectPathHeart);
    v.put("msoAnimEffectPathOctagon", msoAnimEffectPathOctagon);
    v.put("msoAnimEffectPath6PointStar", msoAnimEffectPath6PointStar);
    v.put("msoAnimEffectPathFootball", msoAnimEffectPathFootball);
    v.put("msoAnimEffectPathEqualTriangle", msoAnimEffectPathEqualTriangle);
    v.put("msoAnimEffectPathParallelogram", msoAnimEffectPathParallelogram);
    v.put("msoAnimEffectPathPentagon", msoAnimEffectPathPentagon);
    v.put("msoAnimEffectPath4PointStar", msoAnimEffectPath4PointStar);
    v.put("msoAnimEffectPath8PointStar", msoAnimEffectPath8PointStar);
    v.put("msoAnimEffectPathTeardrop", msoAnimEffectPathTeardrop);
    v.put("msoAnimEffectPathPointyStar", msoAnimEffectPathPointyStar);
    v.put("msoAnimEffectPathCurvedSquare", msoAnimEffectPathCurvedSquare);
    v.put("msoAnimEffectPathCurvedX", msoAnimEffectPathCurvedX);
    v.put("msoAnimEffectPathVerticalFigure8", msoAnimEffectPathVerticalFigure8);
    v.put("msoAnimEffectPathCurvyStar", msoAnimEffectPathCurvyStar);
    v.put("msoAnimEffectPathLoopdeLoop", msoAnimEffectPathLoopdeLoop);
    v.put("msoAnimEffectPathBuzzsaw", msoAnimEffectPathBuzzsaw);
    v.put("msoAnimEffectPathHorizontalFigure8", msoAnimEffectPathHorizontalFigure8);
    v.put("msoAnimEffectPathPeanut", msoAnimEffectPathPeanut);
    v.put("msoAnimEffectPathFigure8Four", msoAnimEffectPathFigure8Four);
    v.put("msoAnimEffectPathNeutron", msoAnimEffectPathNeutron);
    v.put("msoAnimEffectPathSwoosh", msoAnimEffectPathSwoosh);
    v.put("msoAnimEffectPathBean", msoAnimEffectPathBean);
    v.put("msoAnimEffectPathPlus", msoAnimEffectPathPlus);
    v.put("msoAnimEffectPathInvertedTriangle", msoAnimEffectPathInvertedTriangle);
    v.put("msoAnimEffectPathInvertedSquare", msoAnimEffectPathInvertedSquare);
    v.put("msoAnimEffectPathLeft", msoAnimEffectPathLeft);
    v.put("msoAnimEffectPathTurnRight", msoAnimEffectPathTurnRight);
    v.put("msoAnimEffectPathArcDown", msoAnimEffectPathArcDown);
    v.put("msoAnimEffectPathZigzag", msoAnimEffectPathZigzag);
    v.put("msoAnimEffectPathSCurve2", msoAnimEffectPathSCurve2);
    v.put("msoAnimEffectPathSineWave", msoAnimEffectPathSineWave);
    v.put("msoAnimEffectPathBounceLeft", msoAnimEffectPathBounceLeft);
    v.put("msoAnimEffectPathDown", msoAnimEffectPathDown);
    v.put("msoAnimEffectPathTurnUp", msoAnimEffectPathTurnUp);
    v.put("msoAnimEffectPathArcUp", msoAnimEffectPathArcUp);
    v.put("msoAnimEffectPathHeartbeat", msoAnimEffectPathHeartbeat);
    v.put("msoAnimEffectPathSpiralRight", msoAnimEffectPathSpiralRight);
    v.put("msoAnimEffectPathWave", msoAnimEffectPathWave);
    v.put("msoAnimEffectPathCurvyLeft", msoAnimEffectPathCurvyLeft);
    v.put("msoAnimEffectPathDiagonalDownRight", msoAnimEffectPathDiagonalDownRight);
    v.put("msoAnimEffectPathTurnDown", msoAnimEffectPathTurnDown);
    v.put("msoAnimEffectPathArcLeft", msoAnimEffectPathArcLeft);
    v.put("msoAnimEffectPathFunnel", msoAnimEffectPathFunnel);
    v.put("msoAnimEffectPathSpring", msoAnimEffectPathSpring);
    v.put("msoAnimEffectPathBounceRight", msoAnimEffectPathBounceRight);
    v.put("msoAnimEffectPathSpiralLeft", msoAnimEffectPathSpiralLeft);
    v.put("msoAnimEffectPathDiagonalUpRight", msoAnimEffectPathDiagonalUpRight);
    v.put("msoAnimEffectPathTurnUpRight", msoAnimEffectPathTurnUpRight);
    v.put("msoAnimEffectPathArcRight", msoAnimEffectPathArcRight);
    v.put("msoAnimEffectPathSCurve1", msoAnimEffectPathSCurve1);
    v.put("msoAnimEffectPathDecayingWave", msoAnimEffectPathDecayingWave);
    v.put("msoAnimEffectPathCurvyRight", msoAnimEffectPathCurvyRight);
    v.put("msoAnimEffectPathStairsDown", msoAnimEffectPathStairsDown);
    v.put("msoAnimEffectPathUp", msoAnimEffectPathUp);
    v.put("msoAnimEffectPathRight", msoAnimEffectPathRight);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
