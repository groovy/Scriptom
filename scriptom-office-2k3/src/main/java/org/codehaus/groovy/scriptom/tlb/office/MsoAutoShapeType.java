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
public final class MsoAutoShapeType
{
  private MsoAutoShapeType()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer msoShapeMixed = Integer.valueOf(-2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoShapeRectangle = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoShapeParallelogram = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoShapeTrapezoid = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoShapeDiamond = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoShapeRoundedRectangle = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoShapeOctagon = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoShapeIsoscelesTriangle = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoShapeRightTriangle = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoShapeOval = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoShapeHexagon = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoShapeCross = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoShapeRegularPentagon = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoShapeCan = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoShapeCube = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoShapeBevel = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoShapeFoldedCorner = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoShapeSmileyFace = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoShapeDonut = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoShapeNoSymbol = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoShapeBlockArc = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoShapeHeart = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoShapeLightningBolt = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoShapeSun = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoShapeMoon = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoShapeArc = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoShapeDoubleBracket = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer msoShapeDoubleBrace = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer msoShapePlaque = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer msoShapeLeftBracket = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer msoShapeRightBracket = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer msoShapeLeftBrace = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer msoShapeRightBrace = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer msoShapeRightArrow = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer msoShapeLeftArrow = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer msoShapeUpArrow = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer msoShapeDownArrow = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer msoShapeLeftRightArrow = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer msoShapeUpDownArrow = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer msoShapeQuadArrow = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer msoShapeLeftRightUpArrow = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer msoShapeBentArrow = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer msoShapeUTurnArrow = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer msoShapeLeftUpArrow = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer msoShapeBentUpArrow = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer msoShapeCurvedRightArrow = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer msoShapeCurvedLeftArrow = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer msoShapeCurvedUpArrow = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer msoShapeCurvedDownArrow = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer msoShapeStripedRightArrow = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer msoShapeNotchedRightArrow = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer msoShapePentagon = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer msoShapeChevron = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer msoShapeRightArrowCallout = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer msoShapeLeftArrowCallout = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer msoShapeUpArrowCallout = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer msoShapeDownArrowCallout = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer msoShapeLeftRightArrowCallout = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer msoShapeUpDownArrowCallout = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer msoShapeQuadArrowCallout = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer msoShapeCircularArrow = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer msoShapeFlowchartProcess = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer msoShapeFlowchartAlternateProcess = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer msoShapeFlowchartDecision = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer msoShapeFlowchartData = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer msoShapeFlowchartPredefinedProcess = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer msoShapeFlowchartInternalStorage = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer msoShapeFlowchartDocument = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer msoShapeFlowchartMultidocument = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer msoShapeFlowchartTerminator = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer msoShapeFlowchartPreparation = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer msoShapeFlowchartManualInput = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer msoShapeFlowchartManualOperation = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer msoShapeFlowchartConnector = Integer.valueOf(73);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer msoShapeFlowchartOffpageConnector = Integer.valueOf(74);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer msoShapeFlowchartCard = Integer.valueOf(75);

  /**
   * Value is 76 (0x4C)
   */
  public static final Integer msoShapeFlowchartPunchedTape = Integer.valueOf(76);

  /**
   * Value is 77 (0x4D)
   */
  public static final Integer msoShapeFlowchartSummingJunction = Integer.valueOf(77);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer msoShapeFlowchartOr = Integer.valueOf(78);

  /**
   * Value is 79 (0x4F)
   */
  public static final Integer msoShapeFlowchartCollate = Integer.valueOf(79);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer msoShapeFlowchartSort = Integer.valueOf(80);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer msoShapeFlowchartExtract = Integer.valueOf(81);

  /**
   * Value is 82 (0x52)
   */
  public static final Integer msoShapeFlowchartMerge = Integer.valueOf(82);

  /**
   * Value is 83 (0x53)
   */
  public static final Integer msoShapeFlowchartStoredData = Integer.valueOf(83);

  /**
   * Value is 84 (0x54)
   */
  public static final Integer msoShapeFlowchartDelay = Integer.valueOf(84);

  /**
   * Value is 85 (0x55)
   */
  public static final Integer msoShapeFlowchartSequentialAccessStorage = Integer.valueOf(85);

  /**
   * Value is 86 (0x56)
   */
  public static final Integer msoShapeFlowchartMagneticDisk = Integer.valueOf(86);

  /**
   * Value is 87 (0x57)
   */
  public static final Integer msoShapeFlowchartDirectAccessStorage = Integer.valueOf(87);

  /**
   * Value is 88 (0x58)
   */
  public static final Integer msoShapeFlowchartDisplay = Integer.valueOf(88);

  /**
   * Value is 89 (0x59)
   */
  public static final Integer msoShapeExplosion1 = Integer.valueOf(89);

  /**
   * Value is 90 (0x5A)
   */
  public static final Integer msoShapeExplosion2 = Integer.valueOf(90);

  /**
   * Value is 91 (0x5B)
   */
  public static final Integer msoShape4pointStar = Integer.valueOf(91);

  /**
   * Value is 92 (0x5C)
   */
  public static final Integer msoShape5pointStar = Integer.valueOf(92);

  /**
   * Value is 93 (0x5D)
   */
  public static final Integer msoShape8pointStar = Integer.valueOf(93);

  /**
   * Value is 94 (0x5E)
   */
  public static final Integer msoShape16pointStar = Integer.valueOf(94);

  /**
   * Value is 95 (0x5F)
   */
  public static final Integer msoShape24pointStar = Integer.valueOf(95);

  /**
   * Value is 96 (0x60)
   */
  public static final Integer msoShape32pointStar = Integer.valueOf(96);

  /**
   * Value is 97 (0x61)
   */
  public static final Integer msoShapeUpRibbon = Integer.valueOf(97);

  /**
   * Value is 98 (0x62)
   */
  public static final Integer msoShapeDownRibbon = Integer.valueOf(98);

  /**
   * Value is 99 (0x63)
   */
  public static final Integer msoShapeCurvedUpRibbon = Integer.valueOf(99);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer msoShapeCurvedDownRibbon = Integer.valueOf(100);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer msoShapeVerticalScroll = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer msoShapeHorizontalScroll = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer msoShapeWave = Integer.valueOf(103);

  /**
   * Value is 104 (0x68)
   */
  public static final Integer msoShapeDoubleWave = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer msoShapeRectangularCallout = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer msoShapeRoundedRectangularCallout = Integer.valueOf(106);

  /**
   * Value is 107 (0x6B)
   */
  public static final Integer msoShapeOvalCallout = Integer.valueOf(107);

  /**
   * Value is 108 (0x6C)
   */
  public static final Integer msoShapeCloudCallout = Integer.valueOf(108);

  /**
   * Value is 109 (0x6D)
   */
  public static final Integer msoShapeLineCallout1 = Integer.valueOf(109);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer msoShapeLineCallout2 = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer msoShapeLineCallout3 = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer msoShapeLineCallout4 = Integer.valueOf(112);

  /**
   * Value is 113 (0x71)
   */
  public static final Integer msoShapeLineCallout1AccentBar = Integer.valueOf(113);

  /**
   * Value is 114 (0x72)
   */
  public static final Integer msoShapeLineCallout2AccentBar = Integer.valueOf(114);

  /**
   * Value is 115 (0x73)
   */
  public static final Integer msoShapeLineCallout3AccentBar = Integer.valueOf(115);

  /**
   * Value is 116 (0x74)
   */
  public static final Integer msoShapeLineCallout4AccentBar = Integer.valueOf(116);

  /**
   * Value is 117 (0x75)
   */
  public static final Integer msoShapeLineCallout1NoBorder = Integer.valueOf(117);

  /**
   * Value is 118 (0x76)
   */
  public static final Integer msoShapeLineCallout2NoBorder = Integer.valueOf(118);

  /**
   * Value is 119 (0x77)
   */
  public static final Integer msoShapeLineCallout3NoBorder = Integer.valueOf(119);

  /**
   * Value is 120 (0x78)
   */
  public static final Integer msoShapeLineCallout4NoBorder = Integer.valueOf(120);

  /**
   * Value is 121 (0x79)
   */
  public static final Integer msoShapeLineCallout1BorderandAccentBar = Integer.valueOf(121);

  /**
   * Value is 122 (0x7A)
   */
  public static final Integer msoShapeLineCallout2BorderandAccentBar = Integer.valueOf(122);

  /**
   * Value is 123 (0x7B)
   */
  public static final Integer msoShapeLineCallout3BorderandAccentBar = Integer.valueOf(123);

  /**
   * Value is 124 (0x7C)
   */
  public static final Integer msoShapeLineCallout4BorderandAccentBar = Integer.valueOf(124);

  /**
   * Value is 125 (0x7D)
   */
  public static final Integer msoShapeActionButtonCustom = Integer.valueOf(125);

  /**
   * Value is 126 (0x7E)
   */
  public static final Integer msoShapeActionButtonHome = Integer.valueOf(126);

  /**
   * Value is 127 (0x7F)
   */
  public static final Integer msoShapeActionButtonHelp = Integer.valueOf(127);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer msoShapeActionButtonInformation = Integer.valueOf(128);

  /**
   * Value is 129 (0x81)
   */
  public static final Integer msoShapeActionButtonBackorPrevious = Integer.valueOf(129);

  /**
   * Value is 130 (0x82)
   */
  public static final Integer msoShapeActionButtonForwardorNext = Integer.valueOf(130);

  /**
   * Value is 131 (0x83)
   */
  public static final Integer msoShapeActionButtonBeginning = Integer.valueOf(131);

  /**
   * Value is 132 (0x84)
   */
  public static final Integer msoShapeActionButtonEnd = Integer.valueOf(132);

  /**
   * Value is 133 (0x85)
   */
  public static final Integer msoShapeActionButtonReturn = Integer.valueOf(133);

  /**
   * Value is 134 (0x86)
   */
  public static final Integer msoShapeActionButtonDocument = Integer.valueOf(134);

  /**
   * Value is 135 (0x87)
   */
  public static final Integer msoShapeActionButtonSound = Integer.valueOf(135);

  /**
   * Value is 136 (0x88)
   */
  public static final Integer msoShapeActionButtonMovie = Integer.valueOf(136);

  /**
   * Value is 137 (0x89)
   */
  public static final Integer msoShapeBalloon = Integer.valueOf(137);

  /**
   * Value is 138 (0x8A)
   */
  public static final Integer msoShapeNotPrimitive = Integer.valueOf(138);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoShapeMixed", msoShapeMixed);
    v.put("msoShapeRectangle", msoShapeRectangle);
    v.put("msoShapeParallelogram", msoShapeParallelogram);
    v.put("msoShapeTrapezoid", msoShapeTrapezoid);
    v.put("msoShapeDiamond", msoShapeDiamond);
    v.put("msoShapeRoundedRectangle", msoShapeRoundedRectangle);
    v.put("msoShapeOctagon", msoShapeOctagon);
    v.put("msoShapeIsoscelesTriangle", msoShapeIsoscelesTriangle);
    v.put("msoShapeRightTriangle", msoShapeRightTriangle);
    v.put("msoShapeOval", msoShapeOval);
    v.put("msoShapeHexagon", msoShapeHexagon);
    v.put("msoShapeCross", msoShapeCross);
    v.put("msoShapeRegularPentagon", msoShapeRegularPentagon);
    v.put("msoShapeCan", msoShapeCan);
    v.put("msoShapeCube", msoShapeCube);
    v.put("msoShapeBevel", msoShapeBevel);
    v.put("msoShapeFoldedCorner", msoShapeFoldedCorner);
    v.put("msoShapeSmileyFace", msoShapeSmileyFace);
    v.put("msoShapeDonut", msoShapeDonut);
    v.put("msoShapeNoSymbol", msoShapeNoSymbol);
    v.put("msoShapeBlockArc", msoShapeBlockArc);
    v.put("msoShapeHeart", msoShapeHeart);
    v.put("msoShapeLightningBolt", msoShapeLightningBolt);
    v.put("msoShapeSun", msoShapeSun);
    v.put("msoShapeMoon", msoShapeMoon);
    v.put("msoShapeArc", msoShapeArc);
    v.put("msoShapeDoubleBracket", msoShapeDoubleBracket);
    v.put("msoShapeDoubleBrace", msoShapeDoubleBrace);
    v.put("msoShapePlaque", msoShapePlaque);
    v.put("msoShapeLeftBracket", msoShapeLeftBracket);
    v.put("msoShapeRightBracket", msoShapeRightBracket);
    v.put("msoShapeLeftBrace", msoShapeLeftBrace);
    v.put("msoShapeRightBrace", msoShapeRightBrace);
    v.put("msoShapeRightArrow", msoShapeRightArrow);
    v.put("msoShapeLeftArrow", msoShapeLeftArrow);
    v.put("msoShapeUpArrow", msoShapeUpArrow);
    v.put("msoShapeDownArrow", msoShapeDownArrow);
    v.put("msoShapeLeftRightArrow", msoShapeLeftRightArrow);
    v.put("msoShapeUpDownArrow", msoShapeUpDownArrow);
    v.put("msoShapeQuadArrow", msoShapeQuadArrow);
    v.put("msoShapeLeftRightUpArrow", msoShapeLeftRightUpArrow);
    v.put("msoShapeBentArrow", msoShapeBentArrow);
    v.put("msoShapeUTurnArrow", msoShapeUTurnArrow);
    v.put("msoShapeLeftUpArrow", msoShapeLeftUpArrow);
    v.put("msoShapeBentUpArrow", msoShapeBentUpArrow);
    v.put("msoShapeCurvedRightArrow", msoShapeCurvedRightArrow);
    v.put("msoShapeCurvedLeftArrow", msoShapeCurvedLeftArrow);
    v.put("msoShapeCurvedUpArrow", msoShapeCurvedUpArrow);
    v.put("msoShapeCurvedDownArrow", msoShapeCurvedDownArrow);
    v.put("msoShapeStripedRightArrow", msoShapeStripedRightArrow);
    v.put("msoShapeNotchedRightArrow", msoShapeNotchedRightArrow);
    v.put("msoShapePentagon", msoShapePentagon);
    v.put("msoShapeChevron", msoShapeChevron);
    v.put("msoShapeRightArrowCallout", msoShapeRightArrowCallout);
    v.put("msoShapeLeftArrowCallout", msoShapeLeftArrowCallout);
    v.put("msoShapeUpArrowCallout", msoShapeUpArrowCallout);
    v.put("msoShapeDownArrowCallout", msoShapeDownArrowCallout);
    v.put("msoShapeLeftRightArrowCallout", msoShapeLeftRightArrowCallout);
    v.put("msoShapeUpDownArrowCallout", msoShapeUpDownArrowCallout);
    v.put("msoShapeQuadArrowCallout", msoShapeQuadArrowCallout);
    v.put("msoShapeCircularArrow", msoShapeCircularArrow);
    v.put("msoShapeFlowchartProcess", msoShapeFlowchartProcess);
    v.put("msoShapeFlowchartAlternateProcess", msoShapeFlowchartAlternateProcess);
    v.put("msoShapeFlowchartDecision", msoShapeFlowchartDecision);
    v.put("msoShapeFlowchartData", msoShapeFlowchartData);
    v.put("msoShapeFlowchartPredefinedProcess", msoShapeFlowchartPredefinedProcess);
    v.put("msoShapeFlowchartInternalStorage", msoShapeFlowchartInternalStorage);
    v.put("msoShapeFlowchartDocument", msoShapeFlowchartDocument);
    v.put("msoShapeFlowchartMultidocument", msoShapeFlowchartMultidocument);
    v.put("msoShapeFlowchartTerminator", msoShapeFlowchartTerminator);
    v.put("msoShapeFlowchartPreparation", msoShapeFlowchartPreparation);
    v.put("msoShapeFlowchartManualInput", msoShapeFlowchartManualInput);
    v.put("msoShapeFlowchartManualOperation", msoShapeFlowchartManualOperation);
    v.put("msoShapeFlowchartConnector", msoShapeFlowchartConnector);
    v.put("msoShapeFlowchartOffpageConnector", msoShapeFlowchartOffpageConnector);
    v.put("msoShapeFlowchartCard", msoShapeFlowchartCard);
    v.put("msoShapeFlowchartPunchedTape", msoShapeFlowchartPunchedTape);
    v.put("msoShapeFlowchartSummingJunction", msoShapeFlowchartSummingJunction);
    v.put("msoShapeFlowchartOr", msoShapeFlowchartOr);
    v.put("msoShapeFlowchartCollate", msoShapeFlowchartCollate);
    v.put("msoShapeFlowchartSort", msoShapeFlowchartSort);
    v.put("msoShapeFlowchartExtract", msoShapeFlowchartExtract);
    v.put("msoShapeFlowchartMerge", msoShapeFlowchartMerge);
    v.put("msoShapeFlowchartStoredData", msoShapeFlowchartStoredData);
    v.put("msoShapeFlowchartDelay", msoShapeFlowchartDelay);
    v.put("msoShapeFlowchartSequentialAccessStorage", msoShapeFlowchartSequentialAccessStorage);
    v.put("msoShapeFlowchartMagneticDisk", msoShapeFlowchartMagneticDisk);
    v.put("msoShapeFlowchartDirectAccessStorage", msoShapeFlowchartDirectAccessStorage);
    v.put("msoShapeFlowchartDisplay", msoShapeFlowchartDisplay);
    v.put("msoShapeExplosion1", msoShapeExplosion1);
    v.put("msoShapeExplosion2", msoShapeExplosion2);
    v.put("msoShape4pointStar", msoShape4pointStar);
    v.put("msoShape5pointStar", msoShape5pointStar);
    v.put("msoShape8pointStar", msoShape8pointStar);
    v.put("msoShape16pointStar", msoShape16pointStar);
    v.put("msoShape24pointStar", msoShape24pointStar);
    v.put("msoShape32pointStar", msoShape32pointStar);
    v.put("msoShapeUpRibbon", msoShapeUpRibbon);
    v.put("msoShapeDownRibbon", msoShapeDownRibbon);
    v.put("msoShapeCurvedUpRibbon", msoShapeCurvedUpRibbon);
    v.put("msoShapeCurvedDownRibbon", msoShapeCurvedDownRibbon);
    v.put("msoShapeVerticalScroll", msoShapeVerticalScroll);
    v.put("msoShapeHorizontalScroll", msoShapeHorizontalScroll);
    v.put("msoShapeWave", msoShapeWave);
    v.put("msoShapeDoubleWave", msoShapeDoubleWave);
    v.put("msoShapeRectangularCallout", msoShapeRectangularCallout);
    v.put("msoShapeRoundedRectangularCallout", msoShapeRoundedRectangularCallout);
    v.put("msoShapeOvalCallout", msoShapeOvalCallout);
    v.put("msoShapeCloudCallout", msoShapeCloudCallout);
    v.put("msoShapeLineCallout1", msoShapeLineCallout1);
    v.put("msoShapeLineCallout2", msoShapeLineCallout2);
    v.put("msoShapeLineCallout3", msoShapeLineCallout3);
    v.put("msoShapeLineCallout4", msoShapeLineCallout4);
    v.put("msoShapeLineCallout1AccentBar", msoShapeLineCallout1AccentBar);
    v.put("msoShapeLineCallout2AccentBar", msoShapeLineCallout2AccentBar);
    v.put("msoShapeLineCallout3AccentBar", msoShapeLineCallout3AccentBar);
    v.put("msoShapeLineCallout4AccentBar", msoShapeLineCallout4AccentBar);
    v.put("msoShapeLineCallout1NoBorder", msoShapeLineCallout1NoBorder);
    v.put("msoShapeLineCallout2NoBorder", msoShapeLineCallout2NoBorder);
    v.put("msoShapeLineCallout3NoBorder", msoShapeLineCallout3NoBorder);
    v.put("msoShapeLineCallout4NoBorder", msoShapeLineCallout4NoBorder);
    v.put("msoShapeLineCallout1BorderandAccentBar", msoShapeLineCallout1BorderandAccentBar);
    v.put("msoShapeLineCallout2BorderandAccentBar", msoShapeLineCallout2BorderandAccentBar);
    v.put("msoShapeLineCallout3BorderandAccentBar", msoShapeLineCallout3BorderandAccentBar);
    v.put("msoShapeLineCallout4BorderandAccentBar", msoShapeLineCallout4BorderandAccentBar);
    v.put("msoShapeActionButtonCustom", msoShapeActionButtonCustom);
    v.put("msoShapeActionButtonHome", msoShapeActionButtonHome);
    v.put("msoShapeActionButtonHelp", msoShapeActionButtonHelp);
    v.put("msoShapeActionButtonInformation", msoShapeActionButtonInformation);
    v.put("msoShapeActionButtonBackorPrevious", msoShapeActionButtonBackorPrevious);
    v.put("msoShapeActionButtonForwardorNext", msoShapeActionButtonForwardorNext);
    v.put("msoShapeActionButtonBeginning", msoShapeActionButtonBeginning);
    v.put("msoShapeActionButtonEnd", msoShapeActionButtonEnd);
    v.put("msoShapeActionButtonReturn", msoShapeActionButtonReturn);
    v.put("msoShapeActionButtonDocument", msoShapeActionButtonDocument);
    v.put("msoShapeActionButtonSound", msoShapeActionButtonSound);
    v.put("msoShapeActionButtonMovie", msoShapeActionButtonMovie);
    v.put("msoShapeBalloon", msoShapeBalloon);
    v.put("msoShapeNotPrimitive", msoShapeNotPrimitive);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
