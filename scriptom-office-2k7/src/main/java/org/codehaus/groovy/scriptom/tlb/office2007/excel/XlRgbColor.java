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
package org.codehaus.groovy.scriptom.tlb.office2007.excel;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class XlRgbColor
{
  private XlRgbColor()
  {
  }

  /**
   * Value is 16775408 (0xFFF8F0)
   */
  public static final Integer rgbAliceBlue = Integer.valueOf(16775408);

  /**
   * Value is 14150650 (0xD7EBFA)
   */
  public static final Integer rgbAntiqueWhite = Integer.valueOf(14150650);

  /**
   * Value is 16776960 (0xFFFF00)
   */
  public static final Integer rgbAqua = Integer.valueOf(16776960);

  /**
   * Value is 13959039 (0xD4FF7F)
   */
  public static final Integer rgbAquamarine = Integer.valueOf(13959039);

  /**
   * Value is 16777200 (0xFFFFF0)
   */
  public static final Integer rgbAzure = Integer.valueOf(16777200);

  /**
   * Value is 14480885 (0xDCF5F5)
   */
  public static final Integer rgbBeige = Integer.valueOf(14480885);

  /**
   * Value is 12903679 (0xC4E4FF)
   */
  public static final Integer rgbBisque = Integer.valueOf(12903679);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer rgbBlack = Integer.valueOf(0);

  /**
   * Value is 13495295 (0xCDEBFF)
   */
  public static final Integer rgbBlanchedAlmond = Integer.valueOf(13495295);

  /**
   * Value is 16711680 (0xFF0000)
   */
  public static final Integer rgbBlue = Integer.valueOf(16711680);

  /**
   * Value is 14822282 (0xE22B8A)
   */
  public static final Integer rgbBlueViolet = Integer.valueOf(14822282);

  /**
   * Value is 2763429 (0x2A2AA5)
   */
  public static final Integer rgbBrown = Integer.valueOf(2763429);

  /**
   * Value is 8894686 (0x87B8DE)
   */
  public static final Integer rgbBurlyWood = Integer.valueOf(8894686);

  /**
   * Value is 10526303 (0xA09E5F)
   */
  public static final Integer rgbCadetBlue = Integer.valueOf(10526303);

  /**
   * Value is 65407 (0xFF7F)
   */
  public static final Integer rgbChartreuse = Integer.valueOf(65407);

  /**
   * Value is 5275647 (0x507FFF)
   */
  public static final Integer rgbCoral = Integer.valueOf(5275647);

  /**
   * Value is 15570276 (0xED9564)
   */
  public static final Integer rgbCornflowerBlue = Integer.valueOf(15570276);

  /**
   * Value is 14481663 (0xDCF8FF)
   */
  public static final Integer rgbCornsilk = Integer.valueOf(14481663);

  /**
   * Value is 3937500 (0x3C14DC)
   */
  public static final Integer rgbCrimson = Integer.valueOf(3937500);

  /**
   * Value is 9109504 (0x8B0000)
   */
  public static final Integer rgbDarkBlue = Integer.valueOf(9109504);

  /**
   * Value is 9145088 (0x8B8B00)
   */
  public static final Integer rgbDarkCyan = Integer.valueOf(9145088);

  /**
   * Value is 755384 (0xB86B8)
   */
  public static final Integer rgbDarkGoldenrod = Integer.valueOf(755384);

  /**
   * Value is 25600 (0x6400)
   */
  public static final Integer rgbDarkGreen = Integer.valueOf(25600);

  /**
   * Value is 11119017 (0xA9A9A9)
   */
  public static final Integer rgbDarkGray = Integer.valueOf(11119017);

  /**
   * Value is 11119017 (0xA9A9A9)
   */
  public static final Integer rgbDarkGrey = Integer.valueOf(11119017);

  /**
   * Value is 7059389 (0x6BB7BD)
   */
  public static final Integer rgbDarkKhaki = Integer.valueOf(7059389);

  /**
   * Value is 9109643 (0x8B008B)
   */
  public static final Integer rgbDarkMagenta = Integer.valueOf(9109643);

  /**
   * Value is 3107669 (0x2F6B55)
   */
  public static final Integer rgbDarkOliveGreen = Integer.valueOf(3107669);

  /**
   * Value is 36095 (0x8CFF)
   */
  public static final Integer rgbDarkOrange = Integer.valueOf(36095);

  /**
   * Value is 13382297 (0xCC3299)
   */
  public static final Integer rgbDarkOrchid = Integer.valueOf(13382297);

  /**
   * Value is 139 (0x8B)
   */
  public static final Integer rgbDarkRed = Integer.valueOf(139);

  /**
   * Value is 8034025 (0x7A96E9)
   */
  public static final Integer rgbDarkSalmon = Integer.valueOf(8034025);

  /**
   * Value is 9419919 (0x8FBC8F)
   */
  public static final Integer rgbDarkSeaGreen = Integer.valueOf(9419919);

  /**
   * Value is 9125192 (0x8B3D48)
   */
  public static final Integer rgbDarkSlateBlue = Integer.valueOf(9125192);

  /**
   * Value is 5197615 (0x4F4F2F)
   */
  public static final Integer rgbDarkSlateGray = Integer.valueOf(5197615);

  /**
   * Value is 5197615 (0x4F4F2F)
   */
  public static final Integer rgbDarkSlateGrey = Integer.valueOf(5197615);

  /**
   * Value is 13749760 (0xD1CE00)
   */
  public static final Integer rgbDarkTurquoise = Integer.valueOf(13749760);

  /**
   * Value is 13828244 (0xD30094)
   */
  public static final Integer rgbDarkViolet = Integer.valueOf(13828244);

  /**
   * Value is 9639167 (0x9314FF)
   */
  public static final Integer rgbDeepPink = Integer.valueOf(9639167);

  /**
   * Value is 16760576 (0xFFBF00)
   */
  public static final Integer rgbDeepSkyBlue = Integer.valueOf(16760576);

  /**
   * Value is 6908265 (0x696969)
   */
  public static final Integer rgbDimGray = Integer.valueOf(6908265);

  /**
   * Value is 6908265 (0x696969)
   */
  public static final Integer rgbDimGrey = Integer.valueOf(6908265);

  /**
   * Value is 16748574 (0xFF901E)
   */
  public static final Integer rgbDodgerBlue = Integer.valueOf(16748574);

  /**
   * Value is 2237106 (0x2222B2)
   */
  public static final Integer rgbFireBrick = Integer.valueOf(2237106);

  /**
   * Value is 15792895 (0xF0FAFF)
   */
  public static final Integer rgbFloralWhite = Integer.valueOf(15792895);

  /**
   * Value is 2263842 (0x228B22)
   */
  public static final Integer rgbForestGreen = Integer.valueOf(2263842);

  /**
   * Value is 16711935 (0xFF00FF)
   */
  public static final Integer rgbFuchsia = Integer.valueOf(16711935);

  /**
   * Value is 14474460 (0xDCDCDC)
   */
  public static final Integer rgbGainsboro = Integer.valueOf(14474460);

  /**
   * Value is 16775416 (0xFFF8F8)
   */
  public static final Integer rgbGhostWhite = Integer.valueOf(16775416);

  /**
   * Value is 55295 (0xD7FF)
   */
  public static final Integer rgbGold = Integer.valueOf(55295);

  /**
   * Value is 2139610 (0x20A5DA)
   */
  public static final Integer rgbGoldenrod = Integer.valueOf(2139610);

  /**
   * Value is 8421504 (0x808080)
   */
  public static final Integer rgbGray = Integer.valueOf(8421504);

  /**
   * Value is 32768 (0x8000)
   */
  public static final Integer rgbGreen = Integer.valueOf(32768);

  /**
   * Value is 8421504 (0x808080)
   */
  public static final Integer rgbGrey = Integer.valueOf(8421504);

  /**
   * Value is 3145645 (0x2FFFAD)
   */
  public static final Integer rgbGreenYellow = Integer.valueOf(3145645);

  /**
   * Value is 15794160 (0xF0FFF0)
   */
  public static final Integer rgbHoneydew = Integer.valueOf(15794160);

  /**
   * Value is 11823615 (0xB469FF)
   */
  public static final Integer rgbHotPink = Integer.valueOf(11823615);

  /**
   * Value is 6053069 (0x5C5CCD)
   */
  public static final Integer rgbIndianRed = Integer.valueOf(6053069);

  /**
   * Value is 8519755 (0x82004B)
   */
  public static final Integer rgbIndigo = Integer.valueOf(8519755);

  /**
   * Value is 15794175 (0xF0FFFF)
   */
  public static final Integer rgbIvory = Integer.valueOf(15794175);

  /**
   * Value is 9234160 (0x8CE6F0)
   */
  public static final Integer rgbKhaki = Integer.valueOf(9234160);

  /**
   * Value is 16443110 (0xFAE6E6)
   */
  public static final Integer rgbLavender = Integer.valueOf(16443110);

  /**
   * Value is 16118015 (0xF5F0FF)
   */
  public static final Integer rgbLavenderBlush = Integer.valueOf(16118015);

  /**
   * Value is 64636 (0xFC7C)
   */
  public static final Integer rgbLawnGreen = Integer.valueOf(64636);

  /**
   * Value is 13499135 (0xCDFAFF)
   */
  public static final Integer rgbLemonChiffon = Integer.valueOf(13499135);

  /**
   * Value is 15128749 (0xE6D8AD)
   */
  public static final Integer rgbLightBlue = Integer.valueOf(15128749);

  /**
   * Value is 8421616 (0x8080F0)
   */
  public static final Integer rgbLightCoral = Integer.valueOf(8421616);

  /**
   * Value is 9145088 (0x8B8B00)
   */
  public static final Integer rgbLightCyan = Integer.valueOf(9145088);

  /**
   * Value is 13826810 (0xD2FAFA)
   */
  public static final Integer rgbLightGoldenrodYellow = Integer.valueOf(13826810);

  /**
   * Value is 13882323 (0xD3D3D3)
   */
  public static final Integer rgbLightGray = Integer.valueOf(13882323);

  /**
   * Value is 9498256 (0x90EE90)
   */
  public static final Integer rgbLightGreen = Integer.valueOf(9498256);

  /**
   * Value is 13882323 (0xD3D3D3)
   */
  public static final Integer rgbLightGrey = Integer.valueOf(13882323);

  /**
   * Value is 12695295 (0xC1B6FF)
   */
  public static final Integer rgbLightPink = Integer.valueOf(12695295);

  /**
   * Value is 8036607 (0x7AA0FF)
   */
  public static final Integer rgbLightSalmon = Integer.valueOf(8036607);

  /**
   * Value is 11186720 (0xAAB220)
   */
  public static final Integer rgbLightSeaGreen = Integer.valueOf(11186720);

  /**
   * Value is 16436871 (0xFACE87)
   */
  public static final Integer rgbLightSkyBlue = Integer.valueOf(16436871);

  /**
   * Value is 10061943 (0x998877)
   */
  public static final Integer rgbLightSlateGray = Integer.valueOf(10061943);

  /**
   * Value is 10061943 (0x998877)
   */
  public static final Integer rgbLightSlateGrey = Integer.valueOf(10061943);

  /**
   * Value is 14599344 (0xDEC4B0)
   */
  public static final Integer rgbLightSteelBlue = Integer.valueOf(14599344);

  /**
   * Value is 14745599 (0xE0FFFF)
   */
  public static final Integer rgbLightYellow = Integer.valueOf(14745599);

  /**
   * Value is 65280 (0xFF00)
   */
  public static final Integer rgbLime = Integer.valueOf(65280);

  /**
   * Value is 3329330 (0x32CD32)
   */
  public static final Integer rgbLimeGreen = Integer.valueOf(3329330);

  /**
   * Value is 15134970 (0xE6F0FA)
   */
  public static final Integer rgbLinen = Integer.valueOf(15134970);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer rgbMaroon = Integer.valueOf(128);

  /**
   * Value is 11206502 (0xAAFF66)
   */
  public static final Integer rgbMediumAquamarine = Integer.valueOf(11206502);

  /**
   * Value is 13434880 (0xCD0000)
   */
  public static final Integer rgbMediumBlue = Integer.valueOf(13434880);

  /**
   * Value is 13850042 (0xD355BA)
   */
  public static final Integer rgbMediumOrchid = Integer.valueOf(13850042);

  /**
   * Value is 14381203 (0xDB7093)
   */
  public static final Integer rgbMediumPurple = Integer.valueOf(14381203);

  /**
   * Value is 7451452 (0x71B33C)
   */
  public static final Integer rgbMediumSeaGreen = Integer.valueOf(7451452);

  /**
   * Value is 15624315 (0xEE687B)
   */
  public static final Integer rgbMediumSlateBlue = Integer.valueOf(15624315);

  /**
   * Value is 10156544 (0x9AFA00)
   */
  public static final Integer rgbMediumSpringGreen = Integer.valueOf(10156544);

  /**
   * Value is 13422920 (0xCCD148)
   */
  public static final Integer rgbMediumTurquoise = Integer.valueOf(13422920);

  /**
   * Value is 8721863 (0x8515C7)
   */
  public static final Integer rgbMediumVioletRed = Integer.valueOf(8721863);

  /**
   * Value is 7346457 (0x701919)
   */
  public static final Integer rgbMidnightBlue = Integer.valueOf(7346457);

  /**
   * Value is 16449525 (0xFAFFF5)
   */
  public static final Integer rgbMintCream = Integer.valueOf(16449525);

  /**
   * Value is 14804223 (0xE1E4FF)
   */
  public static final Integer rgbMistyRose = Integer.valueOf(14804223);

  /**
   * Value is 11920639 (0xB5E4FF)
   */
  public static final Integer rgbMoccasin = Integer.valueOf(11920639);

  /**
   * Value is 11394815 (0xADDEFF)
   */
  public static final Integer rgbNavajoWhite = Integer.valueOf(11394815);

  /**
   * Value is 8388608 (0x800000)
   */
  public static final Integer rgbNavy = Integer.valueOf(8388608);

  /**
   * Value is 8388608 (0x800000)
   */
  public static final Integer rgbNavyBlue = Integer.valueOf(8388608);

  /**
   * Value is 15136253 (0xE6F5FD)
   */
  public static final Integer rgbOldLace = Integer.valueOf(15136253);

  /**
   * Value is 32896 (0x8080)
   */
  public static final Integer rgbOlive = Integer.valueOf(32896);

  /**
   * Value is 2330219 (0x238E6B)
   */
  public static final Integer rgbOliveDrab = Integer.valueOf(2330219);

  /**
   * Value is 42495 (0xA5FF)
   */
  public static final Integer rgbOrange = Integer.valueOf(42495);

  /**
   * Value is 17919 (0x45FF)
   */
  public static final Integer rgbOrangeRed = Integer.valueOf(17919);

  /**
   * Value is 14053594 (0xD670DA)
   */
  public static final Integer rgbOrchid = Integer.valueOf(14053594);

  /**
   * Value is 7071982 (0x6BE8EE)
   */
  public static final Integer rgbPaleGoldenrod = Integer.valueOf(7071982);

  /**
   * Value is 10025880 (0x98FB98)
   */
  public static final Integer rgbPaleGreen = Integer.valueOf(10025880);

  /**
   * Value is 15658671 (0xEEEEAF)
   */
  public static final Integer rgbPaleTurquoise = Integer.valueOf(15658671);

  /**
   * Value is 9662683 (0x9370DB)
   */
  public static final Integer rgbPaleVioletRed = Integer.valueOf(9662683);

  /**
   * Value is 14020607 (0xD5EFFF)
   */
  public static final Integer rgbPapayaWhip = Integer.valueOf(14020607);

  /**
   * Value is 12180223 (0xB9DAFF)
   */
  public static final Integer rgbPeachPuff = Integer.valueOf(12180223);

  /**
   * Value is 4163021 (0x3F85CD)
   */
  public static final Integer rgbPeru = Integer.valueOf(4163021);

  /**
   * Value is 13353215 (0xCBC0FF)
   */
  public static final Integer rgbPink = Integer.valueOf(13353215);

  /**
   * Value is 14524637 (0xDDA0DD)
   */
  public static final Integer rgbPlum = Integer.valueOf(14524637);

  /**
   * Value is 15130800 (0xE6E0B0)
   */
  public static final Integer rgbPowderBlue = Integer.valueOf(15130800);

  /**
   * Value is 8388736 (0x800080)
   */
  public static final Integer rgbPurple = Integer.valueOf(8388736);

  /**
   * Value is 255 (0xFF)
   */
  public static final Integer rgbRed = Integer.valueOf(255);

  /**
   * Value is 9408444 (0x8F8FBC)
   */
  public static final Integer rgbRosyBrown = Integer.valueOf(9408444);

  /**
   * Value is 14772545 (0xE16941)
   */
  public static final Integer rgbRoyalBlue = Integer.valueOf(14772545);

  /**
   * Value is 7504122 (0x7280FA)
   */
  public static final Integer rgbSalmon = Integer.valueOf(7504122);

  /**
   * Value is 6333684 (0x60A4F4)
   */
  public static final Integer rgbSandyBrown = Integer.valueOf(6333684);

  /**
   * Value is 5737262 (0x578B2E)
   */
  public static final Integer rgbSeaGreen = Integer.valueOf(5737262);

  /**
   * Value is 15660543 (0xEEF5FF)
   */
  public static final Integer rgbSeashell = Integer.valueOf(15660543);

  /**
   * Value is 2970272 (0x2D52A0)
   */
  public static final Integer rgbSienna = Integer.valueOf(2970272);

  /**
   * Value is 12632256 (0xC0C0C0)
   */
  public static final Integer rgbSilver = Integer.valueOf(12632256);

  /**
   * Value is 15453831 (0xEBCE87)
   */
  public static final Integer rgbSkyBlue = Integer.valueOf(15453831);

  /**
   * Value is 13458026 (0xCD5A6A)
   */
  public static final Integer rgbSlateBlue = Integer.valueOf(13458026);

  /**
   * Value is 9470064 (0x908070)
   */
  public static final Integer rgbSlateGray = Integer.valueOf(9470064);

  /**
   * Value is 9470064 (0x908070)
   */
  public static final Integer rgbSlateGrey = Integer.valueOf(9470064);

  /**
   * Value is 16448255 (0xFAFAFF)
   */
  public static final Integer rgbSnow = Integer.valueOf(16448255);

  /**
   * Value is 8388352 (0x7FFF00)
   */
  public static final Integer rgbSpringGreen = Integer.valueOf(8388352);

  /**
   * Value is 11829830 (0xB48246)
   */
  public static final Integer rgbSteelBlue = Integer.valueOf(11829830);

  /**
   * Value is 9221330 (0x8CB4D2)
   */
  public static final Integer rgbTan = Integer.valueOf(9221330);

  /**
   * Value is 8421376 (0x808000)
   */
  public static final Integer rgbTeal = Integer.valueOf(8421376);

  /**
   * Value is 14204888 (0xD8BFD8)
   */
  public static final Integer rgbThistle = Integer.valueOf(14204888);

  /**
   * Value is 4678655 (0x4763FF)
   */
  public static final Integer rgbTomato = Integer.valueOf(4678655);

  /**
   * Value is 13688896 (0xD0E040)
   */
  public static final Integer rgbTurquoise = Integer.valueOf(13688896);

  /**
   * Value is 65535 (0xFFFF)
   */
  public static final Integer rgbYellow = Integer.valueOf(65535);

  /**
   * Value is 3329434 (0x32CD9A)
   */
  public static final Integer rgbYellowGreen = Integer.valueOf(3329434);

  /**
   * Value is 15631086 (0xEE82EE)
   */
  public static final Integer rgbViolet = Integer.valueOf(15631086);

  /**
   * Value is 11788021 (0xB3DEF5)
   */
  public static final Integer rgbWheat = Integer.valueOf(11788021);

  /**
   * Value is 16777215 (0xFFFFFF)
   */
  public static final Integer rgbWhite = Integer.valueOf(16777215);

  /**
   * Value is 16119285 (0xF5F5F5)
   */
  public static final Integer rgbWhiteSmoke = Integer.valueOf(16119285);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("rgbAliceBlue", rgbAliceBlue);
    v.put("rgbAntiqueWhite", rgbAntiqueWhite);
    v.put("rgbAqua", rgbAqua);
    v.put("rgbAquamarine", rgbAquamarine);
    v.put("rgbAzure", rgbAzure);
    v.put("rgbBeige", rgbBeige);
    v.put("rgbBisque", rgbBisque);
    v.put("rgbBlack", rgbBlack);
    v.put("rgbBlanchedAlmond", rgbBlanchedAlmond);
    v.put("rgbBlue", rgbBlue);
    v.put("rgbBlueViolet", rgbBlueViolet);
    v.put("rgbBrown", rgbBrown);
    v.put("rgbBurlyWood", rgbBurlyWood);
    v.put("rgbCadetBlue", rgbCadetBlue);
    v.put("rgbChartreuse", rgbChartreuse);
    v.put("rgbCoral", rgbCoral);
    v.put("rgbCornflowerBlue", rgbCornflowerBlue);
    v.put("rgbCornsilk", rgbCornsilk);
    v.put("rgbCrimson", rgbCrimson);
    v.put("rgbDarkBlue", rgbDarkBlue);
    v.put("rgbDarkCyan", rgbDarkCyan);
    v.put("rgbDarkGoldenrod", rgbDarkGoldenrod);
    v.put("rgbDarkGreen", rgbDarkGreen);
    v.put("rgbDarkGray", rgbDarkGray);
    v.put("rgbDarkGrey", rgbDarkGrey);
    v.put("rgbDarkKhaki", rgbDarkKhaki);
    v.put("rgbDarkMagenta", rgbDarkMagenta);
    v.put("rgbDarkOliveGreen", rgbDarkOliveGreen);
    v.put("rgbDarkOrange", rgbDarkOrange);
    v.put("rgbDarkOrchid", rgbDarkOrchid);
    v.put("rgbDarkRed", rgbDarkRed);
    v.put("rgbDarkSalmon", rgbDarkSalmon);
    v.put("rgbDarkSeaGreen", rgbDarkSeaGreen);
    v.put("rgbDarkSlateBlue", rgbDarkSlateBlue);
    v.put("rgbDarkSlateGray", rgbDarkSlateGray);
    v.put("rgbDarkSlateGrey", rgbDarkSlateGrey);
    v.put("rgbDarkTurquoise", rgbDarkTurquoise);
    v.put("rgbDarkViolet", rgbDarkViolet);
    v.put("rgbDeepPink", rgbDeepPink);
    v.put("rgbDeepSkyBlue", rgbDeepSkyBlue);
    v.put("rgbDimGray", rgbDimGray);
    v.put("rgbDimGrey", rgbDimGrey);
    v.put("rgbDodgerBlue", rgbDodgerBlue);
    v.put("rgbFireBrick", rgbFireBrick);
    v.put("rgbFloralWhite", rgbFloralWhite);
    v.put("rgbForestGreen", rgbForestGreen);
    v.put("rgbFuchsia", rgbFuchsia);
    v.put("rgbGainsboro", rgbGainsboro);
    v.put("rgbGhostWhite", rgbGhostWhite);
    v.put("rgbGold", rgbGold);
    v.put("rgbGoldenrod", rgbGoldenrod);
    v.put("rgbGray", rgbGray);
    v.put("rgbGreen", rgbGreen);
    v.put("rgbGrey", rgbGrey);
    v.put("rgbGreenYellow", rgbGreenYellow);
    v.put("rgbHoneydew", rgbHoneydew);
    v.put("rgbHotPink", rgbHotPink);
    v.put("rgbIndianRed", rgbIndianRed);
    v.put("rgbIndigo", rgbIndigo);
    v.put("rgbIvory", rgbIvory);
    v.put("rgbKhaki", rgbKhaki);
    v.put("rgbLavender", rgbLavender);
    v.put("rgbLavenderBlush", rgbLavenderBlush);
    v.put("rgbLawnGreen", rgbLawnGreen);
    v.put("rgbLemonChiffon", rgbLemonChiffon);
    v.put("rgbLightBlue", rgbLightBlue);
    v.put("rgbLightCoral", rgbLightCoral);
    v.put("rgbLightCyan", rgbLightCyan);
    v.put("rgbLightGoldenrodYellow", rgbLightGoldenrodYellow);
    v.put("rgbLightGray", rgbLightGray);
    v.put("rgbLightGreen", rgbLightGreen);
    v.put("rgbLightGrey", rgbLightGrey);
    v.put("rgbLightPink", rgbLightPink);
    v.put("rgbLightSalmon", rgbLightSalmon);
    v.put("rgbLightSeaGreen", rgbLightSeaGreen);
    v.put("rgbLightSkyBlue", rgbLightSkyBlue);
    v.put("rgbLightSlateGray", rgbLightSlateGray);
    v.put("rgbLightSlateGrey", rgbLightSlateGrey);
    v.put("rgbLightSteelBlue", rgbLightSteelBlue);
    v.put("rgbLightYellow", rgbLightYellow);
    v.put("rgbLime", rgbLime);
    v.put("rgbLimeGreen", rgbLimeGreen);
    v.put("rgbLinen", rgbLinen);
    v.put("rgbMaroon", rgbMaroon);
    v.put("rgbMediumAquamarine", rgbMediumAquamarine);
    v.put("rgbMediumBlue", rgbMediumBlue);
    v.put("rgbMediumOrchid", rgbMediumOrchid);
    v.put("rgbMediumPurple", rgbMediumPurple);
    v.put("rgbMediumSeaGreen", rgbMediumSeaGreen);
    v.put("rgbMediumSlateBlue", rgbMediumSlateBlue);
    v.put("rgbMediumSpringGreen", rgbMediumSpringGreen);
    v.put("rgbMediumTurquoise", rgbMediumTurquoise);
    v.put("rgbMediumVioletRed", rgbMediumVioletRed);
    v.put("rgbMidnightBlue", rgbMidnightBlue);
    v.put("rgbMintCream", rgbMintCream);
    v.put("rgbMistyRose", rgbMistyRose);
    v.put("rgbMoccasin", rgbMoccasin);
    v.put("rgbNavajoWhite", rgbNavajoWhite);
    v.put("rgbNavy", rgbNavy);
    v.put("rgbNavyBlue", rgbNavyBlue);
    v.put("rgbOldLace", rgbOldLace);
    v.put("rgbOlive", rgbOlive);
    v.put("rgbOliveDrab", rgbOliveDrab);
    v.put("rgbOrange", rgbOrange);
    v.put("rgbOrangeRed", rgbOrangeRed);
    v.put("rgbOrchid", rgbOrchid);
    v.put("rgbPaleGoldenrod", rgbPaleGoldenrod);
    v.put("rgbPaleGreen", rgbPaleGreen);
    v.put("rgbPaleTurquoise", rgbPaleTurquoise);
    v.put("rgbPaleVioletRed", rgbPaleVioletRed);
    v.put("rgbPapayaWhip", rgbPapayaWhip);
    v.put("rgbPeachPuff", rgbPeachPuff);
    v.put("rgbPeru", rgbPeru);
    v.put("rgbPink", rgbPink);
    v.put("rgbPlum", rgbPlum);
    v.put("rgbPowderBlue", rgbPowderBlue);
    v.put("rgbPurple", rgbPurple);
    v.put("rgbRed", rgbRed);
    v.put("rgbRosyBrown", rgbRosyBrown);
    v.put("rgbRoyalBlue", rgbRoyalBlue);
    v.put("rgbSalmon", rgbSalmon);
    v.put("rgbSandyBrown", rgbSandyBrown);
    v.put("rgbSeaGreen", rgbSeaGreen);
    v.put("rgbSeashell", rgbSeashell);
    v.put("rgbSienna", rgbSienna);
    v.put("rgbSilver", rgbSilver);
    v.put("rgbSkyBlue", rgbSkyBlue);
    v.put("rgbSlateBlue", rgbSlateBlue);
    v.put("rgbSlateGray", rgbSlateGray);
    v.put("rgbSlateGrey", rgbSlateGrey);
    v.put("rgbSnow", rgbSnow);
    v.put("rgbSpringGreen", rgbSpringGreen);
    v.put("rgbSteelBlue", rgbSteelBlue);
    v.put("rgbTan", rgbTan);
    v.put("rgbTeal", rgbTeal);
    v.put("rgbThistle", rgbThistle);
    v.put("rgbTomato", rgbTomato);
    v.put("rgbTurquoise", rgbTurquoise);
    v.put("rgbYellow", rgbYellow);
    v.put("rgbYellowGreen", rgbYellowGreen);
    v.put("rgbViolet", rgbViolet);
    v.put("rgbWheat", rgbWheat);
    v.put("rgbWhite", rgbWhite);
    v.put("rgbWhiteSmoke", rgbWhiteSmoke);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
