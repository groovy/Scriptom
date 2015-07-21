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
public final class WdPageBorderArt
{
  private WdPageBorderArt()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdArtApples = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdArtMapleMuffins = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdArtCakeSlice = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdArtCandyCorn = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdArtIceCreamCones = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdArtChampagneBottle = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdArtPartyGlass = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdArtChristmasTree = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdArtTrees = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdArtPalmsColor = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdArtBalloons3Colors = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdArtBalloonsHotAir = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdArtPartyFavor = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdArtConfettiStreamers = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wdArtHearts = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdArtHeartBalloon = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdArtStars3D = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdArtStarsShadowed = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdArtStars = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdArtSun = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wdArtEarth2 = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdArtEarth1 = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdArtPeopleHats = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdArtSombrero = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdArtPencils = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wdArtPackages = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer wdArtClocks = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer wdArtFirecrackers = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer wdArtRings = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer wdArtMapPins = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer wdArtConfetti = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer wdArtCreaturesButterfly = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer wdArtCreaturesLadyBug = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdArtCreaturesFish = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer wdArtBirdsFlight = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer wdArtScaredCat = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer wdArtBats = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer wdArtFlowersRoses = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer wdArtFlowersRedRose = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer wdArtPoinsettias = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer wdArtHolly = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer wdArtFlowersTiny = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer wdArtFlowersPansy = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer wdArtFlowersModern2 = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer wdArtFlowersModern1 = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer wdArtWhiteFlowers = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer wdArtVine = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer wdArtFlowersDaisies = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer wdArtFlowersBlockPrint = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer wdArtDecoArchColor = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer wdArtFans = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer wdArtFilm = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer wdArtLightning1 = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer wdArtCompass = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer wdArtDoubleD = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer wdArtClassicalWave = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer wdArtShadowedSquares = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer wdArtTwistedLines1 = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer wdArtWaveline = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer wdArtQuadrants = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer wdArtCheckedBarColor = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer wdArtSwirligig = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer wdArtPushPinNote1 = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer wdArtPushPinNote2 = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer wdArtPumpkin1 = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer wdArtEggsBlack = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer wdArtCup = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer wdArtHeartGray = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer wdArtGingerbreadMan = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer wdArtBabyPacifier = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer wdArtBabyRattle = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer wdArtCabins = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer wdArtHouseFunky = Integer.valueOf(73);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer wdArtStarsBlack = Integer.valueOf(74);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer wdArtSnowflakes = Integer.valueOf(75);

  /**
   * Value is 76 (0x4C)
   */
  public static final Integer wdArtSnowflakeFancy = Integer.valueOf(76);

  /**
   * Value is 77 (0x4D)
   */
  public static final Integer wdArtSkyrocket = Integer.valueOf(77);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer wdArtSeattle = Integer.valueOf(78);

  /**
   * Value is 79 (0x4F)
   */
  public static final Integer wdArtMusicNotes = Integer.valueOf(79);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer wdArtPalmsBlack = Integer.valueOf(80);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer wdArtMapleLeaf = Integer.valueOf(81);

  /**
   * Value is 82 (0x52)
   */
  public static final Integer wdArtPaperClips = Integer.valueOf(82);

  /**
   * Value is 83 (0x53)
   */
  public static final Integer wdArtShorebirdTracks = Integer.valueOf(83);

  /**
   * Value is 84 (0x54)
   */
  public static final Integer wdArtPeople = Integer.valueOf(84);

  /**
   * Value is 85 (0x55)
   */
  public static final Integer wdArtPeopleWaving = Integer.valueOf(85);

  /**
   * Value is 86 (0x56)
   */
  public static final Integer wdArtEclipsingSquares2 = Integer.valueOf(86);

  /**
   * Value is 87 (0x57)
   */
  public static final Integer wdArtHypnotic = Integer.valueOf(87);

  /**
   * Value is 88 (0x58)
   */
  public static final Integer wdArtDiamondsGray = Integer.valueOf(88);

  /**
   * Value is 89 (0x59)
   */
  public static final Integer wdArtDecoArch = Integer.valueOf(89);

  /**
   * Value is 90 (0x5A)
   */
  public static final Integer wdArtDecoBlocks = Integer.valueOf(90);

  /**
   * Value is 91 (0x5B)
   */
  public static final Integer wdArtCirclesLines = Integer.valueOf(91);

  /**
   * Value is 92 (0x5C)
   */
  public static final Integer wdArtPapyrus = Integer.valueOf(92);

  /**
   * Value is 93 (0x5D)
   */
  public static final Integer wdArtWoodwork = Integer.valueOf(93);

  /**
   * Value is 94 (0x5E)
   */
  public static final Integer wdArtWeavingBraid = Integer.valueOf(94);

  /**
   * Value is 95 (0x5F)
   */
  public static final Integer wdArtWeavingRibbon = Integer.valueOf(95);

  /**
   * Value is 96 (0x60)
   */
  public static final Integer wdArtWeavingAngles = Integer.valueOf(96);

  /**
   * Value is 97 (0x61)
   */
  public static final Integer wdArtArchedScallops = Integer.valueOf(97);

  /**
   * Value is 98 (0x62)
   */
  public static final Integer wdArtSafari = Integer.valueOf(98);

  /**
   * Value is 99 (0x63)
   */
  public static final Integer wdArtCelticKnotwork = Integer.valueOf(99);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer wdArtCrazyMaze = Integer.valueOf(100);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer wdArtEclipsingSquares1 = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer wdArtBirds = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer wdArtFlowersTeacup = Integer.valueOf(103);

  /**
   * Value is 104 (0x68)
   */
  public static final Integer wdArtNorthwest = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer wdArtSouthwest = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer wdArtTribal6 = Integer.valueOf(106);

  /**
   * Value is 107 (0x6B)
   */
  public static final Integer wdArtTribal4 = Integer.valueOf(107);

  /**
   * Value is 108 (0x6C)
   */
  public static final Integer wdArtTribal3 = Integer.valueOf(108);

  /**
   * Value is 109 (0x6D)
   */
  public static final Integer wdArtTribal2 = Integer.valueOf(109);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer wdArtTribal5 = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer wdArtXIllusions = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer wdArtZanyTriangles = Integer.valueOf(112);

  /**
   * Value is 113 (0x71)
   */
  public static final Integer wdArtPyramids = Integer.valueOf(113);

  /**
   * Value is 114 (0x72)
   */
  public static final Integer wdArtPyramidsAbove = Integer.valueOf(114);

  /**
   * Value is 115 (0x73)
   */
  public static final Integer wdArtConfettiGrays = Integer.valueOf(115);

  /**
   * Value is 116 (0x74)
   */
  public static final Integer wdArtConfettiOutline = Integer.valueOf(116);

  /**
   * Value is 117 (0x75)
   */
  public static final Integer wdArtConfettiWhite = Integer.valueOf(117);

  /**
   * Value is 118 (0x76)
   */
  public static final Integer wdArtMosaic = Integer.valueOf(118);

  /**
   * Value is 119 (0x77)
   */
  public static final Integer wdArtLightning2 = Integer.valueOf(119);

  /**
   * Value is 120 (0x78)
   */
  public static final Integer wdArtHeebieJeebies = Integer.valueOf(120);

  /**
   * Value is 121 (0x79)
   */
  public static final Integer wdArtLightBulb = Integer.valueOf(121);

  /**
   * Value is 122 (0x7A)
   */
  public static final Integer wdArtGradient = Integer.valueOf(122);

  /**
   * Value is 123 (0x7B)
   */
  public static final Integer wdArtTriangleParty = Integer.valueOf(123);

  /**
   * Value is 124 (0x7C)
   */
  public static final Integer wdArtTwistedLines2 = Integer.valueOf(124);

  /**
   * Value is 125 (0x7D)
   */
  public static final Integer wdArtMoons = Integer.valueOf(125);

  /**
   * Value is 126 (0x7E)
   */
  public static final Integer wdArtOvals = Integer.valueOf(126);

  /**
   * Value is 127 (0x7F)
   */
  public static final Integer wdArtDoubleDiamonds = Integer.valueOf(127);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer wdArtChainLink = Integer.valueOf(128);

  /**
   * Value is 129 (0x81)
   */
  public static final Integer wdArtTriangles = Integer.valueOf(129);

  /**
   * Value is 130 (0x82)
   */
  public static final Integer wdArtTribal1 = Integer.valueOf(130);

  /**
   * Value is 131 (0x83)
   */
  public static final Integer wdArtMarqueeToothed = Integer.valueOf(131);

  /**
   * Value is 132 (0x84)
   */
  public static final Integer wdArtSharksTeeth = Integer.valueOf(132);

  /**
   * Value is 133 (0x85)
   */
  public static final Integer wdArtSawtooth = Integer.valueOf(133);

  /**
   * Value is 134 (0x86)
   */
  public static final Integer wdArtSawtoothGray = Integer.valueOf(134);

  /**
   * Value is 135 (0x87)
   */
  public static final Integer wdArtPostageStamp = Integer.valueOf(135);

  /**
   * Value is 136 (0x88)
   */
  public static final Integer wdArtWeavingStrips = Integer.valueOf(136);

  /**
   * Value is 137 (0x89)
   */
  public static final Integer wdArtZigZag = Integer.valueOf(137);

  /**
   * Value is 138 (0x8A)
   */
  public static final Integer wdArtCrossStitch = Integer.valueOf(138);

  /**
   * Value is 139 (0x8B)
   */
  public static final Integer wdArtGems = Integer.valueOf(139);

  /**
   * Value is 140 (0x8C)
   */
  public static final Integer wdArtCirclesRectangles = Integer.valueOf(140);

  /**
   * Value is 141 (0x8D)
   */
  public static final Integer wdArtCornerTriangles = Integer.valueOf(141);

  /**
   * Value is 142 (0x8E)
   */
  public static final Integer wdArtCreaturesInsects = Integer.valueOf(142);

  /**
   * Value is 143 (0x8F)
   */
  public static final Integer wdArtZigZagStitch = Integer.valueOf(143);

  /**
   * Value is 144 (0x90)
   */
  public static final Integer wdArtCheckered = Integer.valueOf(144);

  /**
   * Value is 145 (0x91)
   */
  public static final Integer wdArtCheckedBarBlack = Integer.valueOf(145);

  /**
   * Value is 146 (0x92)
   */
  public static final Integer wdArtMarquee = Integer.valueOf(146);

  /**
   * Value is 147 (0x93)
   */
  public static final Integer wdArtBasicWhiteDots = Integer.valueOf(147);

  /**
   * Value is 148 (0x94)
   */
  public static final Integer wdArtBasicWideMidline = Integer.valueOf(148);

  /**
   * Value is 149 (0x95)
   */
  public static final Integer wdArtBasicWideOutline = Integer.valueOf(149);

  /**
   * Value is 150 (0x96)
   */
  public static final Integer wdArtBasicWideInline = Integer.valueOf(150);

  /**
   * Value is 151 (0x97)
   */
  public static final Integer wdArtBasicThinLines = Integer.valueOf(151);

  /**
   * Value is 152 (0x98)
   */
  public static final Integer wdArtBasicWhiteDashes = Integer.valueOf(152);

  /**
   * Value is 153 (0x99)
   */
  public static final Integer wdArtBasicWhiteSquares = Integer.valueOf(153);

  /**
   * Value is 154 (0x9A)
   */
  public static final Integer wdArtBasicBlackSquares = Integer.valueOf(154);

  /**
   * Value is 155 (0x9B)
   */
  public static final Integer wdArtBasicBlackDashes = Integer.valueOf(155);

  /**
   * Value is 156 (0x9C)
   */
  public static final Integer wdArtBasicBlackDots = Integer.valueOf(156);

  /**
   * Value is 157 (0x9D)
   */
  public static final Integer wdArtStarsTop = Integer.valueOf(157);

  /**
   * Value is 158 (0x9E)
   */
  public static final Integer wdArtCertificateBanner = Integer.valueOf(158);

  /**
   * Value is 159 (0x9F)
   */
  public static final Integer wdArtHandmade1 = Integer.valueOf(159);

  /**
   * Value is 160 (0xA0)
   */
  public static final Integer wdArtHandmade2 = Integer.valueOf(160);

  /**
   * Value is 161 (0xA1)
   */
  public static final Integer wdArtTornPaper = Integer.valueOf(161);

  /**
   * Value is 162 (0xA2)
   */
  public static final Integer wdArtTornPaperBlack = Integer.valueOf(162);

  /**
   * Value is 163 (0xA3)
   */
  public static final Integer wdArtCouponCutoutDashes = Integer.valueOf(163);

  /**
   * Value is 164 (0xA4)
   */
  public static final Integer wdArtCouponCutoutDots = Integer.valueOf(164);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdArtApples", wdArtApples);
    v.put("wdArtMapleMuffins", wdArtMapleMuffins);
    v.put("wdArtCakeSlice", wdArtCakeSlice);
    v.put("wdArtCandyCorn", wdArtCandyCorn);
    v.put("wdArtIceCreamCones", wdArtIceCreamCones);
    v.put("wdArtChampagneBottle", wdArtChampagneBottle);
    v.put("wdArtPartyGlass", wdArtPartyGlass);
    v.put("wdArtChristmasTree", wdArtChristmasTree);
    v.put("wdArtTrees", wdArtTrees);
    v.put("wdArtPalmsColor", wdArtPalmsColor);
    v.put("wdArtBalloons3Colors", wdArtBalloons3Colors);
    v.put("wdArtBalloonsHotAir", wdArtBalloonsHotAir);
    v.put("wdArtPartyFavor", wdArtPartyFavor);
    v.put("wdArtConfettiStreamers", wdArtConfettiStreamers);
    v.put("wdArtHearts", wdArtHearts);
    v.put("wdArtHeartBalloon", wdArtHeartBalloon);
    v.put("wdArtStars3D", wdArtStars3D);
    v.put("wdArtStarsShadowed", wdArtStarsShadowed);
    v.put("wdArtStars", wdArtStars);
    v.put("wdArtSun", wdArtSun);
    v.put("wdArtEarth2", wdArtEarth2);
    v.put("wdArtEarth1", wdArtEarth1);
    v.put("wdArtPeopleHats", wdArtPeopleHats);
    v.put("wdArtSombrero", wdArtSombrero);
    v.put("wdArtPencils", wdArtPencils);
    v.put("wdArtPackages", wdArtPackages);
    v.put("wdArtClocks", wdArtClocks);
    v.put("wdArtFirecrackers", wdArtFirecrackers);
    v.put("wdArtRings", wdArtRings);
    v.put("wdArtMapPins", wdArtMapPins);
    v.put("wdArtConfetti", wdArtConfetti);
    v.put("wdArtCreaturesButterfly", wdArtCreaturesButterfly);
    v.put("wdArtCreaturesLadyBug", wdArtCreaturesLadyBug);
    v.put("wdArtCreaturesFish", wdArtCreaturesFish);
    v.put("wdArtBirdsFlight", wdArtBirdsFlight);
    v.put("wdArtScaredCat", wdArtScaredCat);
    v.put("wdArtBats", wdArtBats);
    v.put("wdArtFlowersRoses", wdArtFlowersRoses);
    v.put("wdArtFlowersRedRose", wdArtFlowersRedRose);
    v.put("wdArtPoinsettias", wdArtPoinsettias);
    v.put("wdArtHolly", wdArtHolly);
    v.put("wdArtFlowersTiny", wdArtFlowersTiny);
    v.put("wdArtFlowersPansy", wdArtFlowersPansy);
    v.put("wdArtFlowersModern2", wdArtFlowersModern2);
    v.put("wdArtFlowersModern1", wdArtFlowersModern1);
    v.put("wdArtWhiteFlowers", wdArtWhiteFlowers);
    v.put("wdArtVine", wdArtVine);
    v.put("wdArtFlowersDaisies", wdArtFlowersDaisies);
    v.put("wdArtFlowersBlockPrint", wdArtFlowersBlockPrint);
    v.put("wdArtDecoArchColor", wdArtDecoArchColor);
    v.put("wdArtFans", wdArtFans);
    v.put("wdArtFilm", wdArtFilm);
    v.put("wdArtLightning1", wdArtLightning1);
    v.put("wdArtCompass", wdArtCompass);
    v.put("wdArtDoubleD", wdArtDoubleD);
    v.put("wdArtClassicalWave", wdArtClassicalWave);
    v.put("wdArtShadowedSquares", wdArtShadowedSquares);
    v.put("wdArtTwistedLines1", wdArtTwistedLines1);
    v.put("wdArtWaveline", wdArtWaveline);
    v.put("wdArtQuadrants", wdArtQuadrants);
    v.put("wdArtCheckedBarColor", wdArtCheckedBarColor);
    v.put("wdArtSwirligig", wdArtSwirligig);
    v.put("wdArtPushPinNote1", wdArtPushPinNote1);
    v.put("wdArtPushPinNote2", wdArtPushPinNote2);
    v.put("wdArtPumpkin1", wdArtPumpkin1);
    v.put("wdArtEggsBlack", wdArtEggsBlack);
    v.put("wdArtCup", wdArtCup);
    v.put("wdArtHeartGray", wdArtHeartGray);
    v.put("wdArtGingerbreadMan", wdArtGingerbreadMan);
    v.put("wdArtBabyPacifier", wdArtBabyPacifier);
    v.put("wdArtBabyRattle", wdArtBabyRattle);
    v.put("wdArtCabins", wdArtCabins);
    v.put("wdArtHouseFunky", wdArtHouseFunky);
    v.put("wdArtStarsBlack", wdArtStarsBlack);
    v.put("wdArtSnowflakes", wdArtSnowflakes);
    v.put("wdArtSnowflakeFancy", wdArtSnowflakeFancy);
    v.put("wdArtSkyrocket", wdArtSkyrocket);
    v.put("wdArtSeattle", wdArtSeattle);
    v.put("wdArtMusicNotes", wdArtMusicNotes);
    v.put("wdArtPalmsBlack", wdArtPalmsBlack);
    v.put("wdArtMapleLeaf", wdArtMapleLeaf);
    v.put("wdArtPaperClips", wdArtPaperClips);
    v.put("wdArtShorebirdTracks", wdArtShorebirdTracks);
    v.put("wdArtPeople", wdArtPeople);
    v.put("wdArtPeopleWaving", wdArtPeopleWaving);
    v.put("wdArtEclipsingSquares2", wdArtEclipsingSquares2);
    v.put("wdArtHypnotic", wdArtHypnotic);
    v.put("wdArtDiamondsGray", wdArtDiamondsGray);
    v.put("wdArtDecoArch", wdArtDecoArch);
    v.put("wdArtDecoBlocks", wdArtDecoBlocks);
    v.put("wdArtCirclesLines", wdArtCirclesLines);
    v.put("wdArtPapyrus", wdArtPapyrus);
    v.put("wdArtWoodwork", wdArtWoodwork);
    v.put("wdArtWeavingBraid", wdArtWeavingBraid);
    v.put("wdArtWeavingRibbon", wdArtWeavingRibbon);
    v.put("wdArtWeavingAngles", wdArtWeavingAngles);
    v.put("wdArtArchedScallops", wdArtArchedScallops);
    v.put("wdArtSafari", wdArtSafari);
    v.put("wdArtCelticKnotwork", wdArtCelticKnotwork);
    v.put("wdArtCrazyMaze", wdArtCrazyMaze);
    v.put("wdArtEclipsingSquares1", wdArtEclipsingSquares1);
    v.put("wdArtBirds", wdArtBirds);
    v.put("wdArtFlowersTeacup", wdArtFlowersTeacup);
    v.put("wdArtNorthwest", wdArtNorthwest);
    v.put("wdArtSouthwest", wdArtSouthwest);
    v.put("wdArtTribal6", wdArtTribal6);
    v.put("wdArtTribal4", wdArtTribal4);
    v.put("wdArtTribal3", wdArtTribal3);
    v.put("wdArtTribal2", wdArtTribal2);
    v.put("wdArtTribal5", wdArtTribal5);
    v.put("wdArtXIllusions", wdArtXIllusions);
    v.put("wdArtZanyTriangles", wdArtZanyTriangles);
    v.put("wdArtPyramids", wdArtPyramids);
    v.put("wdArtPyramidsAbove", wdArtPyramidsAbove);
    v.put("wdArtConfettiGrays", wdArtConfettiGrays);
    v.put("wdArtConfettiOutline", wdArtConfettiOutline);
    v.put("wdArtConfettiWhite", wdArtConfettiWhite);
    v.put("wdArtMosaic", wdArtMosaic);
    v.put("wdArtLightning2", wdArtLightning2);
    v.put("wdArtHeebieJeebies", wdArtHeebieJeebies);
    v.put("wdArtLightBulb", wdArtLightBulb);
    v.put("wdArtGradient", wdArtGradient);
    v.put("wdArtTriangleParty", wdArtTriangleParty);
    v.put("wdArtTwistedLines2", wdArtTwistedLines2);
    v.put("wdArtMoons", wdArtMoons);
    v.put("wdArtOvals", wdArtOvals);
    v.put("wdArtDoubleDiamonds", wdArtDoubleDiamonds);
    v.put("wdArtChainLink", wdArtChainLink);
    v.put("wdArtTriangles", wdArtTriangles);
    v.put("wdArtTribal1", wdArtTribal1);
    v.put("wdArtMarqueeToothed", wdArtMarqueeToothed);
    v.put("wdArtSharksTeeth", wdArtSharksTeeth);
    v.put("wdArtSawtooth", wdArtSawtooth);
    v.put("wdArtSawtoothGray", wdArtSawtoothGray);
    v.put("wdArtPostageStamp", wdArtPostageStamp);
    v.put("wdArtWeavingStrips", wdArtWeavingStrips);
    v.put("wdArtZigZag", wdArtZigZag);
    v.put("wdArtCrossStitch", wdArtCrossStitch);
    v.put("wdArtGems", wdArtGems);
    v.put("wdArtCirclesRectangles", wdArtCirclesRectangles);
    v.put("wdArtCornerTriangles", wdArtCornerTriangles);
    v.put("wdArtCreaturesInsects", wdArtCreaturesInsects);
    v.put("wdArtZigZagStitch", wdArtZigZagStitch);
    v.put("wdArtCheckered", wdArtCheckered);
    v.put("wdArtCheckedBarBlack", wdArtCheckedBarBlack);
    v.put("wdArtMarquee", wdArtMarquee);
    v.put("wdArtBasicWhiteDots", wdArtBasicWhiteDots);
    v.put("wdArtBasicWideMidline", wdArtBasicWideMidline);
    v.put("wdArtBasicWideOutline", wdArtBasicWideOutline);
    v.put("wdArtBasicWideInline", wdArtBasicWideInline);
    v.put("wdArtBasicThinLines", wdArtBasicThinLines);
    v.put("wdArtBasicWhiteDashes", wdArtBasicWhiteDashes);
    v.put("wdArtBasicWhiteSquares", wdArtBasicWhiteSquares);
    v.put("wdArtBasicBlackSquares", wdArtBasicBlackSquares);
    v.put("wdArtBasicBlackDashes", wdArtBasicBlackDashes);
    v.put("wdArtBasicBlackDots", wdArtBasicBlackDots);
    v.put("wdArtStarsTop", wdArtStarsTop);
    v.put("wdArtCertificateBanner", wdArtCertificateBanner);
    v.put("wdArtHandmade1", wdArtHandmade1);
    v.put("wdArtHandmade2", wdArtHandmade2);
    v.put("wdArtTornPaper", wdArtTornPaper);
    v.put("wdArtTornPaperBlack", wdArtTornPaperBlack);
    v.put("wdArtCouponCutoutDashes", wdArtCouponCutoutDashes);
    v.put("wdArtCouponCutoutDots", wdArtCouponCutoutDots);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
