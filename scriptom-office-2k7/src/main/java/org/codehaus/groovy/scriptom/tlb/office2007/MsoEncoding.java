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
public final class MsoEncoding
{
  private MsoEncoding()
  {
  }

  /**
   * Value is 874 (0x36A)
   */
  public static final Integer msoEncodingThai = Integer.valueOf(874);

  /**
   * Value is 932 (0x3A4)
   */
  public static final Integer msoEncodingJapaneseShiftJIS = Integer.valueOf(932);

  /**
   * Value is 936 (0x3A8)
   */
  public static final Integer msoEncodingSimplifiedChineseGBK = Integer.valueOf(936);

  /**
   * Value is 949 (0x3B5)
   */
  public static final Integer msoEncodingKorean = Integer.valueOf(949);

  /**
   * Value is 950 (0x3B6)
   */
  public static final Integer msoEncodingTraditionalChineseBig5 = Integer.valueOf(950);

  /**
   * Value is 1200 (0x4B0)
   */
  public static final Integer msoEncodingUnicodeLittleEndian = Integer.valueOf(1200);

  /**
   * Value is 1201 (0x4B1)
   */
  public static final Integer msoEncodingUnicodeBigEndian = Integer.valueOf(1201);

  /**
   * Value is 1250 (0x4E2)
   */
  public static final Integer msoEncodingCentralEuropean = Integer.valueOf(1250);

  /**
   * Value is 1251 (0x4E3)
   */
  public static final Integer msoEncodingCyrillic = Integer.valueOf(1251);

  /**
   * Value is 1252 (0x4E4)
   */
  public static final Integer msoEncodingWestern = Integer.valueOf(1252);

  /**
   * Value is 1253 (0x4E5)
   */
  public static final Integer msoEncodingGreek = Integer.valueOf(1253);

  /**
   * Value is 1254 (0x4E6)
   */
  public static final Integer msoEncodingTurkish = Integer.valueOf(1254);

  /**
   * Value is 1255 (0x4E7)
   */
  public static final Integer msoEncodingHebrew = Integer.valueOf(1255);

  /**
   * Value is 1256 (0x4E8)
   */
  public static final Integer msoEncodingArabic = Integer.valueOf(1256);

  /**
   * Value is 1257 (0x4E9)
   */
  public static final Integer msoEncodingBaltic = Integer.valueOf(1257);

  /**
   * Value is 1258 (0x4EA)
   */
  public static final Integer msoEncodingVietnamese = Integer.valueOf(1258);

  /**
   * Value is 50001 (0xC351)
   */
  public static final Integer msoEncodingAutoDetect = Integer.valueOf(50001);

  /**
   * Value is 50932 (0xC6F4)
   */
  public static final Integer msoEncodingJapaneseAutoDetect = Integer.valueOf(50932);

  /**
   * Value is 50936 (0xC6F8)
   */
  public static final Integer msoEncodingSimplifiedChineseAutoDetect = Integer.valueOf(50936);

  /**
   * Value is 50949 (0xC705)
   */
  public static final Integer msoEncodingKoreanAutoDetect = Integer.valueOf(50949);

  /**
   * Value is 50950 (0xC706)
   */
  public static final Integer msoEncodingTraditionalChineseAutoDetect = Integer.valueOf(50950);

  /**
   * Value is 51251 (0xC833)
   */
  public static final Integer msoEncodingCyrillicAutoDetect = Integer.valueOf(51251);

  /**
   * Value is 51253 (0xC835)
   */
  public static final Integer msoEncodingGreekAutoDetect = Integer.valueOf(51253);

  /**
   * Value is 51256 (0xC838)
   */
  public static final Integer msoEncodingArabicAutoDetect = Integer.valueOf(51256);

  /**
   * Value is 28591 (0x6FAF)
   */
  public static final Integer msoEncodingISO88591Latin1 = Integer.valueOf(28591);

  /**
   * Value is 28592 (0x6FB0)
   */
  public static final Integer msoEncodingISO88592CentralEurope = Integer.valueOf(28592);

  /**
   * Value is 28593 (0x6FB1)
   */
  public static final Integer msoEncodingISO88593Latin3 = Integer.valueOf(28593);

  /**
   * Value is 28594 (0x6FB2)
   */
  public static final Integer msoEncodingISO88594Baltic = Integer.valueOf(28594);

  /**
   * Value is 28595 (0x6FB3)
   */
  public static final Integer msoEncodingISO88595Cyrillic = Integer.valueOf(28595);

  /**
   * Value is 28596 (0x6FB4)
   */
  public static final Integer msoEncodingISO88596Arabic = Integer.valueOf(28596);

  /**
   * Value is 28597 (0x6FB5)
   */
  public static final Integer msoEncodingISO88597Greek = Integer.valueOf(28597);

  /**
   * Value is 28598 (0x6FB6)
   */
  public static final Integer msoEncodingISO88598Hebrew = Integer.valueOf(28598);

  /**
   * Value is 28599 (0x6FB7)
   */
  public static final Integer msoEncodingISO88599Turkish = Integer.valueOf(28599);

  /**
   * Value is 28605 (0x6FBD)
   */
  public static final Integer msoEncodingISO885915Latin9 = Integer.valueOf(28605);

  /**
   * Value is 38598 (0x96C6)
   */
  public static final Integer msoEncodingISO88598HebrewLogical = Integer.valueOf(38598);

  /**
   * Value is 50220 (0xC42C)
   */
  public static final Integer msoEncodingISO2022JPNoHalfwidthKatakana = Integer.valueOf(50220);

  /**
   * Value is 50221 (0xC42D)
   */
  public static final Integer msoEncodingISO2022JPJISX02021984 = Integer.valueOf(50221);

  /**
   * Value is 50222 (0xC42E)
   */
  public static final Integer msoEncodingISO2022JPJISX02011989 = Integer.valueOf(50222);

  /**
   * Value is 50225 (0xC431)
   */
  public static final Integer msoEncodingISO2022KR = Integer.valueOf(50225);

  /**
   * Value is 50227 (0xC433)
   */
  public static final Integer msoEncodingISO2022CNTraditionalChinese = Integer.valueOf(50227);

  /**
   * Value is 50229 (0xC435)
   */
  public static final Integer msoEncodingISO2022CNSimplifiedChinese = Integer.valueOf(50229);

  /**
   * Value is 10000 (0x2710)
   */
  public static final Integer msoEncodingMacRoman = Integer.valueOf(10000);

  /**
   * Value is 10001 (0x2711)
   */
  public static final Integer msoEncodingMacJapanese = Integer.valueOf(10001);

  /**
   * Value is 10002 (0x2712)
   */
  public static final Integer msoEncodingMacTraditionalChineseBig5 = Integer.valueOf(10002);

  /**
   * Value is 10003 (0x2713)
   */
  public static final Integer msoEncodingMacKorean = Integer.valueOf(10003);

  /**
   * Value is 10004 (0x2714)
   */
  public static final Integer msoEncodingMacArabic = Integer.valueOf(10004);

  /**
   * Value is 10005 (0x2715)
   */
  public static final Integer msoEncodingMacHebrew = Integer.valueOf(10005);

  /**
   * Value is 10006 (0x2716)
   */
  public static final Integer msoEncodingMacGreek1 = Integer.valueOf(10006);

  /**
   * Value is 10007 (0x2717)
   */
  public static final Integer msoEncodingMacCyrillic = Integer.valueOf(10007);

  /**
   * Value is 10008 (0x2718)
   */
  public static final Integer msoEncodingMacSimplifiedChineseGB2312 = Integer.valueOf(10008);

  /**
   * Value is 10010 (0x271A)
   */
  public static final Integer msoEncodingMacRomania = Integer.valueOf(10010);

  /**
   * Value is 10017 (0x2721)
   */
  public static final Integer msoEncodingMacUkraine = Integer.valueOf(10017);

  /**
   * Value is 10029 (0x272D)
   */
  public static final Integer msoEncodingMacLatin2 = Integer.valueOf(10029);

  /**
   * Value is 10079 (0x275F)
   */
  public static final Integer msoEncodingMacIcelandic = Integer.valueOf(10079);

  /**
   * Value is 10081 (0x2761)
   */
  public static final Integer msoEncodingMacTurkish = Integer.valueOf(10081);

  /**
   * Value is 10082 (0x2762)
   */
  public static final Integer msoEncodingMacCroatia = Integer.valueOf(10082);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer msoEncodingEBCDICUSCanada = Integer.valueOf(37);

  /**
   * Value is 500 (0x1F4)
   */
  public static final Integer msoEncodingEBCDICInternational = Integer.valueOf(500);

  /**
   * Value is 870 (0x366)
   */
  public static final Integer msoEncodingEBCDICMultilingualROECELatin2 = Integer.valueOf(870);

  /**
   * Value is 875 (0x36B)
   */
  public static final Integer msoEncodingEBCDICGreekModern = Integer.valueOf(875);

  /**
   * Value is 1026 (0x402)
   */
  public static final Integer msoEncodingEBCDICTurkishLatin5 = Integer.valueOf(1026);

  /**
   * Value is 20273 (0x4F31)
   */
  public static final Integer msoEncodingEBCDICGermany = Integer.valueOf(20273);

  /**
   * Value is 20277 (0x4F35)
   */
  public static final Integer msoEncodingEBCDICDenmarkNorway = Integer.valueOf(20277);

  /**
   * Value is 20278 (0x4F36)
   */
  public static final Integer msoEncodingEBCDICFinlandSweden = Integer.valueOf(20278);

  /**
   * Value is 20280 (0x4F38)
   */
  public static final Integer msoEncodingEBCDICItaly = Integer.valueOf(20280);

  /**
   * Value is 20284 (0x4F3C)
   */
  public static final Integer msoEncodingEBCDICLatinAmericaSpain = Integer.valueOf(20284);

  /**
   * Value is 20285 (0x4F3D)
   */
  public static final Integer msoEncodingEBCDICUnitedKingdom = Integer.valueOf(20285);

  /**
   * Value is 20290 (0x4F42)
   */
  public static final Integer msoEncodingEBCDICJapaneseKatakanaExtended = Integer.valueOf(20290);

  /**
   * Value is 20297 (0x4F49)
   */
  public static final Integer msoEncodingEBCDICFrance = Integer.valueOf(20297);

  /**
   * Value is 20420 (0x4FC4)
   */
  public static final Integer msoEncodingEBCDICArabic = Integer.valueOf(20420);

  /**
   * Value is 20423 (0x4FC7)
   */
  public static final Integer msoEncodingEBCDICGreek = Integer.valueOf(20423);

  /**
   * Value is 20424 (0x4FC8)
   */
  public static final Integer msoEncodingEBCDICHebrew = Integer.valueOf(20424);

  /**
   * Value is 20833 (0x5161)
   */
  public static final Integer msoEncodingEBCDICKoreanExtended = Integer.valueOf(20833);

  /**
   * Value is 20838 (0x5166)
   */
  public static final Integer msoEncodingEBCDICThai = Integer.valueOf(20838);

  /**
   * Value is 20871 (0x5187)
   */
  public static final Integer msoEncodingEBCDICIcelandic = Integer.valueOf(20871);

  /**
   * Value is 20905 (0x51A9)
   */
  public static final Integer msoEncodingEBCDICTurkish = Integer.valueOf(20905);

  /**
   * Value is 20880 (0x5190)
   */
  public static final Integer msoEncodingEBCDICRussian = Integer.valueOf(20880);

  /**
   * Value is 21025 (0x5221)
   */
  public static final Integer msoEncodingEBCDICSerbianBulgarian = Integer.valueOf(21025);

  /**
   * Value is 50930 (0xC6F2)
   */
  public static final Integer msoEncodingEBCDICJapaneseKatakanaExtendedAndJapanese = Integer.valueOf(50930);

  /**
   * Value is 50931 (0xC6F3)
   */
  public static final Integer msoEncodingEBCDICUSCanadaAndJapanese = Integer.valueOf(50931);

  /**
   * Value is 50933 (0xC6F5)
   */
  public static final Integer msoEncodingEBCDICKoreanExtendedAndKorean = Integer.valueOf(50933);

  /**
   * Value is 50935 (0xC6F7)
   */
  public static final Integer msoEncodingEBCDICSimplifiedChineseExtendedAndSimplifiedChinese = Integer.valueOf(50935);

  /**
   * Value is 50937 (0xC6F9)
   */
  public static final Integer msoEncodingEBCDICUSCanadaAndTraditionalChinese = Integer.valueOf(50937);

  /**
   * Value is 50939 (0xC6FB)
   */
  public static final Integer msoEncodingEBCDICJapaneseLatinExtendedAndJapanese = Integer.valueOf(50939);

  /**
   * Value is 437 (0x1B5)
   */
  public static final Integer msoEncodingOEMUnitedStates = Integer.valueOf(437);

  /**
   * Value is 737 (0x2E1)
   */
  public static final Integer msoEncodingOEMGreek437G = Integer.valueOf(737);

  /**
   * Value is 775 (0x307)
   */
  public static final Integer msoEncodingOEMBaltic = Integer.valueOf(775);

  /**
   * Value is 850 (0x352)
   */
  public static final Integer msoEncodingOEMMultilingualLatinI = Integer.valueOf(850);

  /**
   * Value is 852 (0x354)
   */
  public static final Integer msoEncodingOEMMultilingualLatinII = Integer.valueOf(852);

  /**
   * Value is 855 (0x357)
   */
  public static final Integer msoEncodingOEMCyrillic = Integer.valueOf(855);

  /**
   * Value is 857 (0x359)
   */
  public static final Integer msoEncodingOEMTurkish = Integer.valueOf(857);

  /**
   * Value is 860 (0x35C)
   */
  public static final Integer msoEncodingOEMPortuguese = Integer.valueOf(860);

  /**
   * Value is 861 (0x35D)
   */
  public static final Integer msoEncodingOEMIcelandic = Integer.valueOf(861);

  /**
   * Value is 862 (0x35E)
   */
  public static final Integer msoEncodingOEMHebrew = Integer.valueOf(862);

  /**
   * Value is 863 (0x35F)
   */
  public static final Integer msoEncodingOEMCanadianFrench = Integer.valueOf(863);

  /**
   * Value is 864 (0x360)
   */
  public static final Integer msoEncodingOEMArabic = Integer.valueOf(864);

  /**
   * Value is 865 (0x361)
   */
  public static final Integer msoEncodingOEMNordic = Integer.valueOf(865);

  /**
   * Value is 866 (0x362)
   */
  public static final Integer msoEncodingOEMCyrillicII = Integer.valueOf(866);

  /**
   * Value is 869 (0x365)
   */
  public static final Integer msoEncodingOEMModernGreek = Integer.valueOf(869);

  /**
   * Value is 51932 (0xCADC)
   */
  public static final Integer msoEncodingEUCJapanese = Integer.valueOf(51932);

  /**
   * Value is 51936 (0xCAE0)
   */
  public static final Integer msoEncodingEUCChineseSimplifiedChinese = Integer.valueOf(51936);

  /**
   * Value is 51949 (0xCAED)
   */
  public static final Integer msoEncodingEUCKorean = Integer.valueOf(51949);

  /**
   * Value is 51950 (0xCAEE)
   */
  public static final Integer msoEncodingEUCTaiwaneseTraditionalChinese = Integer.valueOf(51950);

  /**
   * Value is 57002 (0xDEAA)
   */
  public static final Integer msoEncodingISCIIDevanagari = Integer.valueOf(57002);

  /**
   * Value is 57003 (0xDEAB)
   */
  public static final Integer msoEncodingISCIIBengali = Integer.valueOf(57003);

  /**
   * Value is 57004 (0xDEAC)
   */
  public static final Integer msoEncodingISCIITamil = Integer.valueOf(57004);

  /**
   * Value is 57005 (0xDEAD)
   */
  public static final Integer msoEncodingISCIITelugu = Integer.valueOf(57005);

  /**
   * Value is 57006 (0xDEAE)
   */
  public static final Integer msoEncodingISCIIAssamese = Integer.valueOf(57006);

  /**
   * Value is 57007 (0xDEAF)
   */
  public static final Integer msoEncodingISCIIOriya = Integer.valueOf(57007);

  /**
   * Value is 57008 (0xDEB0)
   */
  public static final Integer msoEncodingISCIIKannada = Integer.valueOf(57008);

  /**
   * Value is 57009 (0xDEB1)
   */
  public static final Integer msoEncodingISCIIMalayalam = Integer.valueOf(57009);

  /**
   * Value is 57010 (0xDEB2)
   */
  public static final Integer msoEncodingISCIIGujarati = Integer.valueOf(57010);

  /**
   * Value is 57011 (0xDEB3)
   */
  public static final Integer msoEncodingISCIIPunjabi = Integer.valueOf(57011);

  /**
   * Value is 708 (0x2C4)
   */
  public static final Integer msoEncodingArabicASMO = Integer.valueOf(708);

  /**
   * Value is 720 (0x2D0)
   */
  public static final Integer msoEncodingArabicTransparentASMO = Integer.valueOf(720);

  /**
   * Value is 1361 (0x551)
   */
  public static final Integer msoEncodingKoreanJohab = Integer.valueOf(1361);

  /**
   * Value is 20000 (0x4E20)
   */
  public static final Integer msoEncodingTaiwanCNS = Integer.valueOf(20000);

  /**
   * Value is 20001 (0x4E21)
   */
  public static final Integer msoEncodingTaiwanTCA = Integer.valueOf(20001);

  /**
   * Value is 20002 (0x4E22)
   */
  public static final Integer msoEncodingTaiwanEten = Integer.valueOf(20002);

  /**
   * Value is 20003 (0x4E23)
   */
  public static final Integer msoEncodingTaiwanIBM5550 = Integer.valueOf(20003);

  /**
   * Value is 20004 (0x4E24)
   */
  public static final Integer msoEncodingTaiwanTeleText = Integer.valueOf(20004);

  /**
   * Value is 20005 (0x4E25)
   */
  public static final Integer msoEncodingTaiwanWang = Integer.valueOf(20005);

  /**
   * Value is 20105 (0x4E89)
   */
  public static final Integer msoEncodingIA5IRV = Integer.valueOf(20105);

  /**
   * Value is 20106 (0x4E8A)
   */
  public static final Integer msoEncodingIA5German = Integer.valueOf(20106);

  /**
   * Value is 20107 (0x4E8B)
   */
  public static final Integer msoEncodingIA5Swedish = Integer.valueOf(20107);

  /**
   * Value is 20108 (0x4E8C)
   */
  public static final Integer msoEncodingIA5Norwegian = Integer.valueOf(20108);

  /**
   * Value is 20127 (0x4E9F)
   */
  public static final Integer msoEncodingUSASCII = Integer.valueOf(20127);

  /**
   * Value is 20261 (0x4F25)
   */
  public static final Integer msoEncodingT61 = Integer.valueOf(20261);

  /**
   * Value is 20269 (0x4F2D)
   */
  public static final Integer msoEncodingISO6937NonSpacingAccent = Integer.valueOf(20269);

  /**
   * Value is 20866 (0x5182)
   */
  public static final Integer msoEncodingKOI8R = Integer.valueOf(20866);

  /**
   * Value is 21027 (0x5223)
   */
  public static final Integer msoEncodingExtAlphaLowercase = Integer.valueOf(21027);

  /**
   * Value is 21866 (0x556A)
   */
  public static final Integer msoEncodingKOI8U = Integer.valueOf(21866);

  /**
   * Value is 29001 (0x7149)
   */
  public static final Integer msoEncodingEuropa3 = Integer.valueOf(29001);

  /**
   * Value is 52936 (0xCEC8)
   */
  public static final Integer msoEncodingHZGBSimplifiedChinese = Integer.valueOf(52936);

  /**
   * Value is 54936 (0xD698)
   */
  public static final Integer msoEncodingSimplifiedChineseGB18030 = Integer.valueOf(54936);

  /**
   * Value is 65000 (0xFDE8)
   */
  public static final Integer msoEncodingUTF7 = Integer.valueOf(65000);

  /**
   * Value is 65001 (0xFDE9)
   */
  public static final Integer msoEncodingUTF8 = Integer.valueOf(65001);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoEncodingThai", msoEncodingThai);
    v.put("msoEncodingJapaneseShiftJIS", msoEncodingJapaneseShiftJIS);
    v.put("msoEncodingSimplifiedChineseGBK", msoEncodingSimplifiedChineseGBK);
    v.put("msoEncodingKorean", msoEncodingKorean);
    v.put("msoEncodingTraditionalChineseBig5", msoEncodingTraditionalChineseBig5);
    v.put("msoEncodingUnicodeLittleEndian", msoEncodingUnicodeLittleEndian);
    v.put("msoEncodingUnicodeBigEndian", msoEncodingUnicodeBigEndian);
    v.put("msoEncodingCentralEuropean", msoEncodingCentralEuropean);
    v.put("msoEncodingCyrillic", msoEncodingCyrillic);
    v.put("msoEncodingWestern", msoEncodingWestern);
    v.put("msoEncodingGreek", msoEncodingGreek);
    v.put("msoEncodingTurkish", msoEncodingTurkish);
    v.put("msoEncodingHebrew", msoEncodingHebrew);
    v.put("msoEncodingArabic", msoEncodingArabic);
    v.put("msoEncodingBaltic", msoEncodingBaltic);
    v.put("msoEncodingVietnamese", msoEncodingVietnamese);
    v.put("msoEncodingAutoDetect", msoEncodingAutoDetect);
    v.put("msoEncodingJapaneseAutoDetect", msoEncodingJapaneseAutoDetect);
    v.put("msoEncodingSimplifiedChineseAutoDetect", msoEncodingSimplifiedChineseAutoDetect);
    v.put("msoEncodingKoreanAutoDetect", msoEncodingKoreanAutoDetect);
    v.put("msoEncodingTraditionalChineseAutoDetect", msoEncodingTraditionalChineseAutoDetect);
    v.put("msoEncodingCyrillicAutoDetect", msoEncodingCyrillicAutoDetect);
    v.put("msoEncodingGreekAutoDetect", msoEncodingGreekAutoDetect);
    v.put("msoEncodingArabicAutoDetect", msoEncodingArabicAutoDetect);
    v.put("msoEncodingISO88591Latin1", msoEncodingISO88591Latin1);
    v.put("msoEncodingISO88592CentralEurope", msoEncodingISO88592CentralEurope);
    v.put("msoEncodingISO88593Latin3", msoEncodingISO88593Latin3);
    v.put("msoEncodingISO88594Baltic", msoEncodingISO88594Baltic);
    v.put("msoEncodingISO88595Cyrillic", msoEncodingISO88595Cyrillic);
    v.put("msoEncodingISO88596Arabic", msoEncodingISO88596Arabic);
    v.put("msoEncodingISO88597Greek", msoEncodingISO88597Greek);
    v.put("msoEncodingISO88598Hebrew", msoEncodingISO88598Hebrew);
    v.put("msoEncodingISO88599Turkish", msoEncodingISO88599Turkish);
    v.put("msoEncodingISO885915Latin9", msoEncodingISO885915Latin9);
    v.put("msoEncodingISO88598HebrewLogical", msoEncodingISO88598HebrewLogical);
    v.put("msoEncodingISO2022JPNoHalfwidthKatakana", msoEncodingISO2022JPNoHalfwidthKatakana);
    v.put("msoEncodingISO2022JPJISX02021984", msoEncodingISO2022JPJISX02021984);
    v.put("msoEncodingISO2022JPJISX02011989", msoEncodingISO2022JPJISX02011989);
    v.put("msoEncodingISO2022KR", msoEncodingISO2022KR);
    v.put("msoEncodingISO2022CNTraditionalChinese", msoEncodingISO2022CNTraditionalChinese);
    v.put("msoEncodingISO2022CNSimplifiedChinese", msoEncodingISO2022CNSimplifiedChinese);
    v.put("msoEncodingMacRoman", msoEncodingMacRoman);
    v.put("msoEncodingMacJapanese", msoEncodingMacJapanese);
    v.put("msoEncodingMacTraditionalChineseBig5", msoEncodingMacTraditionalChineseBig5);
    v.put("msoEncodingMacKorean", msoEncodingMacKorean);
    v.put("msoEncodingMacArabic", msoEncodingMacArabic);
    v.put("msoEncodingMacHebrew", msoEncodingMacHebrew);
    v.put("msoEncodingMacGreek1", msoEncodingMacGreek1);
    v.put("msoEncodingMacCyrillic", msoEncodingMacCyrillic);
    v.put("msoEncodingMacSimplifiedChineseGB2312", msoEncodingMacSimplifiedChineseGB2312);
    v.put("msoEncodingMacRomania", msoEncodingMacRomania);
    v.put("msoEncodingMacUkraine", msoEncodingMacUkraine);
    v.put("msoEncodingMacLatin2", msoEncodingMacLatin2);
    v.put("msoEncodingMacIcelandic", msoEncodingMacIcelandic);
    v.put("msoEncodingMacTurkish", msoEncodingMacTurkish);
    v.put("msoEncodingMacCroatia", msoEncodingMacCroatia);
    v.put("msoEncodingEBCDICUSCanada", msoEncodingEBCDICUSCanada);
    v.put("msoEncodingEBCDICInternational", msoEncodingEBCDICInternational);
    v.put("msoEncodingEBCDICMultilingualROECELatin2", msoEncodingEBCDICMultilingualROECELatin2);
    v.put("msoEncodingEBCDICGreekModern", msoEncodingEBCDICGreekModern);
    v.put("msoEncodingEBCDICTurkishLatin5", msoEncodingEBCDICTurkishLatin5);
    v.put("msoEncodingEBCDICGermany", msoEncodingEBCDICGermany);
    v.put("msoEncodingEBCDICDenmarkNorway", msoEncodingEBCDICDenmarkNorway);
    v.put("msoEncodingEBCDICFinlandSweden", msoEncodingEBCDICFinlandSweden);
    v.put("msoEncodingEBCDICItaly", msoEncodingEBCDICItaly);
    v.put("msoEncodingEBCDICLatinAmericaSpain", msoEncodingEBCDICLatinAmericaSpain);
    v.put("msoEncodingEBCDICUnitedKingdom", msoEncodingEBCDICUnitedKingdom);
    v.put("msoEncodingEBCDICJapaneseKatakanaExtended", msoEncodingEBCDICJapaneseKatakanaExtended);
    v.put("msoEncodingEBCDICFrance", msoEncodingEBCDICFrance);
    v.put("msoEncodingEBCDICArabic", msoEncodingEBCDICArabic);
    v.put("msoEncodingEBCDICGreek", msoEncodingEBCDICGreek);
    v.put("msoEncodingEBCDICHebrew", msoEncodingEBCDICHebrew);
    v.put("msoEncodingEBCDICKoreanExtended", msoEncodingEBCDICKoreanExtended);
    v.put("msoEncodingEBCDICThai", msoEncodingEBCDICThai);
    v.put("msoEncodingEBCDICIcelandic", msoEncodingEBCDICIcelandic);
    v.put("msoEncodingEBCDICTurkish", msoEncodingEBCDICTurkish);
    v.put("msoEncodingEBCDICRussian", msoEncodingEBCDICRussian);
    v.put("msoEncodingEBCDICSerbianBulgarian", msoEncodingEBCDICSerbianBulgarian);
    v.put("msoEncodingEBCDICJapaneseKatakanaExtendedAndJapanese", msoEncodingEBCDICJapaneseKatakanaExtendedAndJapanese);
    v.put("msoEncodingEBCDICUSCanadaAndJapanese", msoEncodingEBCDICUSCanadaAndJapanese);
    v.put("msoEncodingEBCDICKoreanExtendedAndKorean", msoEncodingEBCDICKoreanExtendedAndKorean);
    v.put("msoEncodingEBCDICSimplifiedChineseExtendedAndSimplifiedChinese", msoEncodingEBCDICSimplifiedChineseExtendedAndSimplifiedChinese);
    v.put("msoEncodingEBCDICUSCanadaAndTraditionalChinese", msoEncodingEBCDICUSCanadaAndTraditionalChinese);
    v.put("msoEncodingEBCDICJapaneseLatinExtendedAndJapanese", msoEncodingEBCDICJapaneseLatinExtendedAndJapanese);
    v.put("msoEncodingOEMUnitedStates", msoEncodingOEMUnitedStates);
    v.put("msoEncodingOEMGreek437G", msoEncodingOEMGreek437G);
    v.put("msoEncodingOEMBaltic", msoEncodingOEMBaltic);
    v.put("msoEncodingOEMMultilingualLatinI", msoEncodingOEMMultilingualLatinI);
    v.put("msoEncodingOEMMultilingualLatinII", msoEncodingOEMMultilingualLatinII);
    v.put("msoEncodingOEMCyrillic", msoEncodingOEMCyrillic);
    v.put("msoEncodingOEMTurkish", msoEncodingOEMTurkish);
    v.put("msoEncodingOEMPortuguese", msoEncodingOEMPortuguese);
    v.put("msoEncodingOEMIcelandic", msoEncodingOEMIcelandic);
    v.put("msoEncodingOEMHebrew", msoEncodingOEMHebrew);
    v.put("msoEncodingOEMCanadianFrench", msoEncodingOEMCanadianFrench);
    v.put("msoEncodingOEMArabic", msoEncodingOEMArabic);
    v.put("msoEncodingOEMNordic", msoEncodingOEMNordic);
    v.put("msoEncodingOEMCyrillicII", msoEncodingOEMCyrillicII);
    v.put("msoEncodingOEMModernGreek", msoEncodingOEMModernGreek);
    v.put("msoEncodingEUCJapanese", msoEncodingEUCJapanese);
    v.put("msoEncodingEUCChineseSimplifiedChinese", msoEncodingEUCChineseSimplifiedChinese);
    v.put("msoEncodingEUCKorean", msoEncodingEUCKorean);
    v.put("msoEncodingEUCTaiwaneseTraditionalChinese", msoEncodingEUCTaiwaneseTraditionalChinese);
    v.put("msoEncodingISCIIDevanagari", msoEncodingISCIIDevanagari);
    v.put("msoEncodingISCIIBengali", msoEncodingISCIIBengali);
    v.put("msoEncodingISCIITamil", msoEncodingISCIITamil);
    v.put("msoEncodingISCIITelugu", msoEncodingISCIITelugu);
    v.put("msoEncodingISCIIAssamese", msoEncodingISCIIAssamese);
    v.put("msoEncodingISCIIOriya", msoEncodingISCIIOriya);
    v.put("msoEncodingISCIIKannada", msoEncodingISCIIKannada);
    v.put("msoEncodingISCIIMalayalam", msoEncodingISCIIMalayalam);
    v.put("msoEncodingISCIIGujarati", msoEncodingISCIIGujarati);
    v.put("msoEncodingISCIIPunjabi", msoEncodingISCIIPunjabi);
    v.put("msoEncodingArabicASMO", msoEncodingArabicASMO);
    v.put("msoEncodingArabicTransparentASMO", msoEncodingArabicTransparentASMO);
    v.put("msoEncodingKoreanJohab", msoEncodingKoreanJohab);
    v.put("msoEncodingTaiwanCNS", msoEncodingTaiwanCNS);
    v.put("msoEncodingTaiwanTCA", msoEncodingTaiwanTCA);
    v.put("msoEncodingTaiwanEten", msoEncodingTaiwanEten);
    v.put("msoEncodingTaiwanIBM5550", msoEncodingTaiwanIBM5550);
    v.put("msoEncodingTaiwanTeleText", msoEncodingTaiwanTeleText);
    v.put("msoEncodingTaiwanWang", msoEncodingTaiwanWang);
    v.put("msoEncodingIA5IRV", msoEncodingIA5IRV);
    v.put("msoEncodingIA5German", msoEncodingIA5German);
    v.put("msoEncodingIA5Swedish", msoEncodingIA5Swedish);
    v.put("msoEncodingIA5Norwegian", msoEncodingIA5Norwegian);
    v.put("msoEncodingUSASCII", msoEncodingUSASCII);
    v.put("msoEncodingT61", msoEncodingT61);
    v.put("msoEncodingISO6937NonSpacingAccent", msoEncodingISO6937NonSpacingAccent);
    v.put("msoEncodingKOI8R", msoEncodingKOI8R);
    v.put("msoEncodingExtAlphaLowercase", msoEncodingExtAlphaLowercase);
    v.put("msoEncodingKOI8U", msoEncodingKOI8U);
    v.put("msoEncodingEuropa3", msoEncodingEuropa3);
    v.put("msoEncodingHZGBSimplifiedChinese", msoEncodingHZGBSimplifiedChinese);
    v.put("msoEncodingSimplifiedChineseGB18030", msoEncodingSimplifiedChineseGB18030);
    v.put("msoEncodingUTF7", msoEncodingUTF7);
    v.put("msoEncodingUTF8", msoEncodingUTF8);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
