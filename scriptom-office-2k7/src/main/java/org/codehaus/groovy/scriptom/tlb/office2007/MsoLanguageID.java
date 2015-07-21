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
public final class MsoLanguageID
{
  private MsoLanguageID()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer msoLanguageIDMixed = Integer.valueOf(-2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer msoLanguageIDNone = Integer.valueOf(0);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer msoLanguageIDNoProofing = Integer.valueOf(1024);

  /**
   * Value is 1078 (0x436)
   */
  public static final Integer msoLanguageIDAfrikaans = Integer.valueOf(1078);

  /**
   * Value is 1052 (0x41C)
   */
  public static final Integer msoLanguageIDAlbanian = Integer.valueOf(1052);

  /**
   * Value is 1118 (0x45E)
   */
  public static final Integer msoLanguageIDAmharic = Integer.valueOf(1118);

  /**
   * Value is 5121 (0x1401)
   */
  public static final Integer msoLanguageIDArabicAlgeria = Integer.valueOf(5121);

  /**
   * Value is 15361 (0x3C01)
   */
  public static final Integer msoLanguageIDArabicBahrain = Integer.valueOf(15361);

  /**
   * Value is 3073 (0xC01)
   */
  public static final Integer msoLanguageIDArabicEgypt = Integer.valueOf(3073);

  /**
   * Value is 2049 (0x801)
   */
  public static final Integer msoLanguageIDArabicIraq = Integer.valueOf(2049);

  /**
   * Value is 11265 (0x2C01)
   */
  public static final Integer msoLanguageIDArabicJordan = Integer.valueOf(11265);

  /**
   * Value is 13313 (0x3401)
   */
  public static final Integer msoLanguageIDArabicKuwait = Integer.valueOf(13313);

  /**
   * Value is 12289 (0x3001)
   */
  public static final Integer msoLanguageIDArabicLebanon = Integer.valueOf(12289);

  /**
   * Value is 4097 (0x1001)
   */
  public static final Integer msoLanguageIDArabicLibya = Integer.valueOf(4097);

  /**
   * Value is 6145 (0x1801)
   */
  public static final Integer msoLanguageIDArabicMorocco = Integer.valueOf(6145);

  /**
   * Value is 8193 (0x2001)
   */
  public static final Integer msoLanguageIDArabicOman = Integer.valueOf(8193);

  /**
   * Value is 16385 (0x4001)
   */
  public static final Integer msoLanguageIDArabicQatar = Integer.valueOf(16385);

  /**
   * Value is 1025 (0x401)
   */
  public static final Integer msoLanguageIDArabic = Integer.valueOf(1025);

  /**
   * Value is 10241 (0x2801)
   */
  public static final Integer msoLanguageIDArabicSyria = Integer.valueOf(10241);

  /**
   * Value is 7169 (0x1C01)
   */
  public static final Integer msoLanguageIDArabicTunisia = Integer.valueOf(7169);

  /**
   * Value is 14337 (0x3801)
   */
  public static final Integer msoLanguageIDArabicUAE = Integer.valueOf(14337);

  /**
   * Value is 9217 (0x2401)
   */
  public static final Integer msoLanguageIDArabicYemen = Integer.valueOf(9217);

  /**
   * Value is 1067 (0x42B)
   */
  public static final Integer msoLanguageIDArmenian = Integer.valueOf(1067);

  /**
   * Value is 1101 (0x44D)
   */
  public static final Integer msoLanguageIDAssamese = Integer.valueOf(1101);

  /**
   * Value is 2092 (0x82C)
   */
  public static final Integer msoLanguageIDAzeriCyrillic = Integer.valueOf(2092);

  /**
   * Value is 1068 (0x42C)
   */
  public static final Integer msoLanguageIDAzeriLatin = Integer.valueOf(1068);

  /**
   * Value is 1069 (0x42D)
   */
  public static final Integer msoLanguageIDBasque = Integer.valueOf(1069);

  /**
   * Value is 1059 (0x423)
   */
  public static final Integer msoLanguageIDByelorussian = Integer.valueOf(1059);

  /**
   * Value is 1093 (0x445)
   */
  public static final Integer msoLanguageIDBengali = Integer.valueOf(1093);

  /**
   * Value is 4122 (0x101A)
   */
  public static final Integer msoLanguageIDBosnian = Integer.valueOf(4122);

  /**
   * Value is 8218 (0x201A)
   */
  public static final Integer msoLanguageIDBosnianBosniaHerzegovinaCyrillic = Integer.valueOf(8218);

  /**
   * Value is 5146 (0x141A)
   */
  public static final Integer msoLanguageIDBosnianBosniaHerzegovinaLatin = Integer.valueOf(5146);

  /**
   * Value is 1026 (0x402)
   */
  public static final Integer msoLanguageIDBulgarian = Integer.valueOf(1026);

  /**
   * Value is 1109 (0x455)
   */
  public static final Integer msoLanguageIDBurmese = Integer.valueOf(1109);

  /**
   * Value is 1027 (0x403)
   */
  public static final Integer msoLanguageIDCatalan = Integer.valueOf(1027);

  /**
   * Value is 3076 (0xC04)
   */
  public static final Integer msoLanguageIDChineseHongKongSAR = Integer.valueOf(3076);

  /**
   * Value is 5124 (0x1404)
   */
  public static final Integer msoLanguageIDChineseMacaoSAR = Integer.valueOf(5124);

  /**
   * Value is 2052 (0x804)
   */
  public static final Integer msoLanguageIDSimplifiedChinese = Integer.valueOf(2052);

  /**
   * Value is 4100 (0x1004)
   */
  public static final Integer msoLanguageIDChineseSingapore = Integer.valueOf(4100);

  /**
   * Value is 1028 (0x404)
   */
  public static final Integer msoLanguageIDTraditionalChinese = Integer.valueOf(1028);

  /**
   * Value is 1116 (0x45C)
   */
  public static final Integer msoLanguageIDCherokee = Integer.valueOf(1116);

  /**
   * Value is 1050 (0x41A)
   */
  public static final Integer msoLanguageIDCroatian = Integer.valueOf(1050);

  /**
   * Value is 1029 (0x405)
   */
  public static final Integer msoLanguageIDCzech = Integer.valueOf(1029);

  /**
   * Value is 1030 (0x406)
   */
  public static final Integer msoLanguageIDDanish = Integer.valueOf(1030);

  /**
   * Value is 1125 (0x465)
   */
  public static final Integer msoLanguageIDDivehi = Integer.valueOf(1125);

  /**
   * Value is 2067 (0x813)
   */
  public static final Integer msoLanguageIDBelgianDutch = Integer.valueOf(2067);

  /**
   * Value is 1043 (0x413)
   */
  public static final Integer msoLanguageIDDutch = Integer.valueOf(1043);

  /**
   * Value is 2129 (0x851)
   */
  public static final Integer msoLanguageIDDzongkhaBhutan = Integer.valueOf(2129);

  /**
   * Value is 1126 (0x466)
   */
  public static final Integer msoLanguageIDEdo = Integer.valueOf(1126);

  /**
   * Value is 3081 (0xC09)
   */
  public static final Integer msoLanguageIDEnglishAUS = Integer.valueOf(3081);

  /**
   * Value is 10249 (0x2809)
   */
  public static final Integer msoLanguageIDEnglishBelize = Integer.valueOf(10249);

  /**
   * Value is 4105 (0x1009)
   */
  public static final Integer msoLanguageIDEnglishCanadian = Integer.valueOf(4105);

  /**
   * Value is 9225 (0x2409)
   */
  public static final Integer msoLanguageIDEnglishCaribbean = Integer.valueOf(9225);

  /**
   * Value is 14345 (0x3809)
   */
  public static final Integer msoLanguageIDEnglishIndonesia = Integer.valueOf(14345);

  /**
   * Value is 6153 (0x1809)
   */
  public static final Integer msoLanguageIDEnglishIreland = Integer.valueOf(6153);

  /**
   * Value is 8201 (0x2009)
   */
  public static final Integer msoLanguageIDEnglishJamaica = Integer.valueOf(8201);

  /**
   * Value is 5129 (0x1409)
   */
  public static final Integer msoLanguageIDEnglishNewZealand = Integer.valueOf(5129);

  /**
   * Value is 13321 (0x3409)
   */
  public static final Integer msoLanguageIDEnglishPhilippines = Integer.valueOf(13321);

  /**
   * Value is 7177 (0x1C09)
   */
  public static final Integer msoLanguageIDEnglishSouthAfrica = Integer.valueOf(7177);

  /**
   * Value is 11273 (0x2C09)
   */
  public static final Integer msoLanguageIDEnglishTrinidadTobago = Integer.valueOf(11273);

  /**
   * Value is 2057 (0x809)
   */
  public static final Integer msoLanguageIDEnglishUK = Integer.valueOf(2057);

  /**
   * Value is 1033 (0x409)
   */
  public static final Integer msoLanguageIDEnglishUS = Integer.valueOf(1033);

  /**
   * Value is 12297 (0x3009)
   */
  public static final Integer msoLanguageIDEnglishZimbabwe = Integer.valueOf(12297);

  /**
   * Value is 1061 (0x425)
   */
  public static final Integer msoLanguageIDEstonian = Integer.valueOf(1061);

  /**
   * Value is 1080 (0x438)
   */
  public static final Integer msoLanguageIDFaeroese = Integer.valueOf(1080);

  /**
   * Value is 1065 (0x429)
   */
  public static final Integer msoLanguageIDFarsi = Integer.valueOf(1065);

  /**
   * Value is 1124 (0x464)
   */
  public static final Integer msoLanguageIDFilipino = Integer.valueOf(1124);

  /**
   * Value is 1035 (0x40B)
   */
  public static final Integer msoLanguageIDFinnish = Integer.valueOf(1035);

  /**
   * Value is 2060 (0x80C)
   */
  public static final Integer msoLanguageIDBelgianFrench = Integer.valueOf(2060);

  /**
   * Value is 11276 (0x2C0C)
   */
  public static final Integer msoLanguageIDFrenchCameroon = Integer.valueOf(11276);

  /**
   * Value is 3084 (0xC0C)
   */
  public static final Integer msoLanguageIDFrenchCanadian = Integer.valueOf(3084);

  /**
   * Value is 12300 (0x300C)
   */
  public static final Integer msoLanguageIDFrenchCotedIvoire = Integer.valueOf(12300);

  /**
   * Value is 1036 (0x40C)
   */
  public static final Integer msoLanguageIDFrench = Integer.valueOf(1036);

  /**
   * Value is 15372 (0x3C0C)
   */
  public static final Integer msoLanguageIDFrenchHaiti = Integer.valueOf(15372);

  /**
   * Value is 5132 (0x140C)
   */
  public static final Integer msoLanguageIDFrenchLuxembourg = Integer.valueOf(5132);

  /**
   * Value is 13324 (0x340C)
   */
  public static final Integer msoLanguageIDFrenchMali = Integer.valueOf(13324);

  /**
   * Value is 6156 (0x180C)
   */
  public static final Integer msoLanguageIDFrenchMonaco = Integer.valueOf(6156);

  /**
   * Value is 14348 (0x380C)
   */
  public static final Integer msoLanguageIDFrenchMorocco = Integer.valueOf(14348);

  /**
   * Value is 8204 (0x200C)
   */
  public static final Integer msoLanguageIDFrenchReunion = Integer.valueOf(8204);

  /**
   * Value is 10252 (0x280C)
   */
  public static final Integer msoLanguageIDFrenchSenegal = Integer.valueOf(10252);

  /**
   * Value is 4108 (0x100C)
   */
  public static final Integer msoLanguageIDSwissFrench = Integer.valueOf(4108);

  /**
   * Value is 7180 (0x1C0C)
   */
  public static final Integer msoLanguageIDFrenchWestIndies = Integer.valueOf(7180);

  /**
   * Value is 9228 (0x240C)
   */
  public static final Integer msoLanguageIDFrenchZaire = Integer.valueOf(9228);

  /**
   * Value is 9228 (0x240C)
   */
  public static final Integer msoLanguageIDFrenchCongoDRC = Integer.valueOf(9228);

  /**
   * Value is 1122 (0x462)
   */
  public static final Integer msoLanguageIDFrisianNetherlands = Integer.valueOf(1122);

  /**
   * Value is 1127 (0x467)
   */
  public static final Integer msoLanguageIDFulfulde = Integer.valueOf(1127);

  /**
   * Value is 2108 (0x83C)
   */
  public static final Integer msoLanguageIDGaelicIreland = Integer.valueOf(2108);

  /**
   * Value is 1084 (0x43C)
   */
  public static final Integer msoLanguageIDGaelicScotland = Integer.valueOf(1084);

  /**
   * Value is 1110 (0x456)
   */
  public static final Integer msoLanguageIDGalician = Integer.valueOf(1110);

  /**
   * Value is 1079 (0x437)
   */
  public static final Integer msoLanguageIDGeorgian = Integer.valueOf(1079);

  /**
   * Value is 3079 (0xC07)
   */
  public static final Integer msoLanguageIDGermanAustria = Integer.valueOf(3079);

  /**
   * Value is 1031 (0x407)
   */
  public static final Integer msoLanguageIDGerman = Integer.valueOf(1031);

  /**
   * Value is 5127 (0x1407)
   */
  public static final Integer msoLanguageIDGermanLiechtenstein = Integer.valueOf(5127);

  /**
   * Value is 4103 (0x1007)
   */
  public static final Integer msoLanguageIDGermanLuxembourg = Integer.valueOf(4103);

  /**
   * Value is 2055 (0x807)
   */
  public static final Integer msoLanguageIDSwissGerman = Integer.valueOf(2055);

  /**
   * Value is 1032 (0x408)
   */
  public static final Integer msoLanguageIDGreek = Integer.valueOf(1032);

  /**
   * Value is 1140 (0x474)
   */
  public static final Integer msoLanguageIDGuarani = Integer.valueOf(1140);

  /**
   * Value is 1095 (0x447)
   */
  public static final Integer msoLanguageIDGujarati = Integer.valueOf(1095);

  /**
   * Value is 1128 (0x468)
   */
  public static final Integer msoLanguageIDHausa = Integer.valueOf(1128);

  /**
   * Value is 1141 (0x475)
   */
  public static final Integer msoLanguageIDHawaiian = Integer.valueOf(1141);

  /**
   * Value is 1037 (0x40D)
   */
  public static final Integer msoLanguageIDHebrew = Integer.valueOf(1037);

  /**
   * Value is 1081 (0x439)
   */
  public static final Integer msoLanguageIDHindi = Integer.valueOf(1081);

  /**
   * Value is 1038 (0x40E)
   */
  public static final Integer msoLanguageIDHungarian = Integer.valueOf(1038);

  /**
   * Value is 1129 (0x469)
   */
  public static final Integer msoLanguageIDIbibio = Integer.valueOf(1129);

  /**
   * Value is 1039 (0x40F)
   */
  public static final Integer msoLanguageIDIcelandic = Integer.valueOf(1039);

  /**
   * Value is 1136 (0x470)
   */
  public static final Integer msoLanguageIDIgbo = Integer.valueOf(1136);

  /**
   * Value is 1057 (0x421)
   */
  public static final Integer msoLanguageIDIndonesian = Integer.valueOf(1057);

  /**
   * Value is 1117 (0x45D)
   */
  public static final Integer msoLanguageIDInuktitut = Integer.valueOf(1117);

  /**
   * Value is 1040 (0x410)
   */
  public static final Integer msoLanguageIDItalian = Integer.valueOf(1040);

  /**
   * Value is 2064 (0x810)
   */
  public static final Integer msoLanguageIDSwissItalian = Integer.valueOf(2064);

  /**
   * Value is 1041 (0x411)
   */
  public static final Integer msoLanguageIDJapanese = Integer.valueOf(1041);

  /**
   * Value is 1099 (0x44B)
   */
  public static final Integer msoLanguageIDKannada = Integer.valueOf(1099);

  /**
   * Value is 1137 (0x471)
   */
  public static final Integer msoLanguageIDKanuri = Integer.valueOf(1137);

  /**
   * Value is 1120 (0x460)
   */
  public static final Integer msoLanguageIDKashmiri = Integer.valueOf(1120);

  /**
   * Value is 2144 (0x860)
   */
  public static final Integer msoLanguageIDKashmiriDevanagari = Integer.valueOf(2144);

  /**
   * Value is 1087 (0x43F)
   */
  public static final Integer msoLanguageIDKazakh = Integer.valueOf(1087);

  /**
   * Value is 1107 (0x453)
   */
  public static final Integer msoLanguageIDKhmer = Integer.valueOf(1107);

  /**
   * Value is 1088 (0x440)
   */
  public static final Integer msoLanguageIDKirghiz = Integer.valueOf(1088);

  /**
   * Value is 1111 (0x457)
   */
  public static final Integer msoLanguageIDKonkani = Integer.valueOf(1111);

  /**
   * Value is 1042 (0x412)
   */
  public static final Integer msoLanguageIDKorean = Integer.valueOf(1042);

  /**
   * Value is 1088 (0x440)
   */
  public static final Integer msoLanguageIDKyrgyz = Integer.valueOf(1088);

  /**
   * Value is 1142 (0x476)
   */
  public static final Integer msoLanguageIDLatin = Integer.valueOf(1142);

  /**
   * Value is 1108 (0x454)
   */
  public static final Integer msoLanguageIDLao = Integer.valueOf(1108);

  /**
   * Value is 1062 (0x426)
   */
  public static final Integer msoLanguageIDLatvian = Integer.valueOf(1062);

  /**
   * Value is 1063 (0x427)
   */
  public static final Integer msoLanguageIDLithuanian = Integer.valueOf(1063);

  /**
   * Value is 1071 (0x42F)
   */
  public static final Integer msoLanguageIDMacedonian = Integer.valueOf(1071);

  /**
   * Value is 1071 (0x42F)
   */
  public static final Integer msoLanguageIDMacedonianFYROM = Integer.valueOf(1071);

  /**
   * Value is 1086 (0x43E)
   */
  public static final Integer msoLanguageIDMalaysian = Integer.valueOf(1086);

  /**
   * Value is 2110 (0x83E)
   */
  public static final Integer msoLanguageIDMalayBruneiDarussalam = Integer.valueOf(2110);

  /**
   * Value is 1100 (0x44C)
   */
  public static final Integer msoLanguageIDMalayalam = Integer.valueOf(1100);

  /**
   * Value is 1082 (0x43A)
   */
  public static final Integer msoLanguageIDMaltese = Integer.valueOf(1082);

  /**
   * Value is 1112 (0x458)
   */
  public static final Integer msoLanguageIDManipuri = Integer.valueOf(1112);

  /**
   * Value is 1153 (0x481)
   */
  public static final Integer msoLanguageIDMaori = Integer.valueOf(1153);

  /**
   * Value is 1102 (0x44E)
   */
  public static final Integer msoLanguageIDMarathi = Integer.valueOf(1102);

  /**
   * Value is 1104 (0x450)
   */
  public static final Integer msoLanguageIDMongolian = Integer.valueOf(1104);

  /**
   * Value is 1121 (0x461)
   */
  public static final Integer msoLanguageIDNepali = Integer.valueOf(1121);

  /**
   * Value is 1044 (0x414)
   */
  public static final Integer msoLanguageIDNorwegianBokmol = Integer.valueOf(1044);

  /**
   * Value is 2068 (0x814)
   */
  public static final Integer msoLanguageIDNorwegianNynorsk = Integer.valueOf(2068);

  /**
   * Value is 1096 (0x448)
   */
  public static final Integer msoLanguageIDOriya = Integer.valueOf(1096);

  /**
   * Value is 1138 (0x472)
   */
  public static final Integer msoLanguageIDOromo = Integer.valueOf(1138);

  /**
   * Value is 1123 (0x463)
   */
  public static final Integer msoLanguageIDPashto = Integer.valueOf(1123);

  /**
   * Value is 1045 (0x415)
   */
  public static final Integer msoLanguageIDPolish = Integer.valueOf(1045);

  /**
   * Value is 1046 (0x416)
   */
  public static final Integer msoLanguageIDBrazilianPortuguese = Integer.valueOf(1046);

  /**
   * Value is 2070 (0x816)
   */
  public static final Integer msoLanguageIDPortuguese = Integer.valueOf(2070);

  /**
   * Value is 1094 (0x446)
   */
  public static final Integer msoLanguageIDPunjabi = Integer.valueOf(1094);

  /**
   * Value is 1131 (0x46B)
   */
  public static final Integer msoLanguageIDQuechuaBolivia = Integer.valueOf(1131);

  /**
   * Value is 2155 (0x86B)
   */
  public static final Integer msoLanguageIDQuechuaEcuador = Integer.valueOf(2155);

  /**
   * Value is 3179 (0xC6B)
   */
  public static final Integer msoLanguageIDQuechuaPeru = Integer.valueOf(3179);

  /**
   * Value is 1047 (0x417)
   */
  public static final Integer msoLanguageIDRhaetoRomanic = Integer.valueOf(1047);

  /**
   * Value is 2072 (0x818)
   */
  public static final Integer msoLanguageIDRomanianMoldova = Integer.valueOf(2072);

  /**
   * Value is 1048 (0x418)
   */
  public static final Integer msoLanguageIDRomanian = Integer.valueOf(1048);

  /**
   * Value is 2073 (0x819)
   */
  public static final Integer msoLanguageIDRussianMoldova = Integer.valueOf(2073);

  /**
   * Value is 1049 (0x419)
   */
  public static final Integer msoLanguageIDRussian = Integer.valueOf(1049);

  /**
   * Value is 1083 (0x43B)
   */
  public static final Integer msoLanguageIDSamiLappish = Integer.valueOf(1083);

  /**
   * Value is 1103 (0x44F)
   */
  public static final Integer msoLanguageIDSanskrit = Integer.valueOf(1103);

  /**
   * Value is 1132 (0x46C)
   */
  public static final Integer msoLanguageIDSepedi = Integer.valueOf(1132);

  /**
   * Value is 7194 (0x1C1A)
   */
  public static final Integer msoLanguageIDSerbianBosniaHerzegovinaCyrillic = Integer.valueOf(7194);

  /**
   * Value is 6170 (0x181A)
   */
  public static final Integer msoLanguageIDSerbianBosniaHerzegovinaLatin = Integer.valueOf(6170);

  /**
   * Value is 3098 (0xC1A)
   */
  public static final Integer msoLanguageIDSerbianCyrillic = Integer.valueOf(3098);

  /**
   * Value is 2074 (0x81A)
   */
  public static final Integer msoLanguageIDSerbianLatin = Integer.valueOf(2074);

  /**
   * Value is 1072 (0x430)
   */
  public static final Integer msoLanguageIDSesotho = Integer.valueOf(1072);

  /**
   * Value is 1113 (0x459)
   */
  public static final Integer msoLanguageIDSindhi = Integer.valueOf(1113);

  /**
   * Value is 2137 (0x859)
   */
  public static final Integer msoLanguageIDSindhiPakistan = Integer.valueOf(2137);

  /**
   * Value is 1115 (0x45B)
   */
  public static final Integer msoLanguageIDSinhalese = Integer.valueOf(1115);

  /**
   * Value is 1051 (0x41B)
   */
  public static final Integer msoLanguageIDSlovak = Integer.valueOf(1051);

  /**
   * Value is 1060 (0x424)
   */
  public static final Integer msoLanguageIDSlovenian = Integer.valueOf(1060);

  /**
   * Value is 1143 (0x477)
   */
  public static final Integer msoLanguageIDSomali = Integer.valueOf(1143);

  /**
   * Value is 1070 (0x42E)
   */
  public static final Integer msoLanguageIDSorbian = Integer.valueOf(1070);

  /**
   * Value is 11274 (0x2C0A)
   */
  public static final Integer msoLanguageIDSpanishArgentina = Integer.valueOf(11274);

  /**
   * Value is 16394 (0x400A)
   */
  public static final Integer msoLanguageIDSpanishBolivia = Integer.valueOf(16394);

  /**
   * Value is 13322 (0x340A)
   */
  public static final Integer msoLanguageIDSpanishChile = Integer.valueOf(13322);

  /**
   * Value is 9226 (0x240A)
   */
  public static final Integer msoLanguageIDSpanishColombia = Integer.valueOf(9226);

  /**
   * Value is 5130 (0x140A)
   */
  public static final Integer msoLanguageIDSpanishCostaRica = Integer.valueOf(5130);

  /**
   * Value is 7178 (0x1C0A)
   */
  public static final Integer msoLanguageIDSpanishDominicanRepublic = Integer.valueOf(7178);

  /**
   * Value is 12298 (0x300A)
   */
  public static final Integer msoLanguageIDSpanishEcuador = Integer.valueOf(12298);

  /**
   * Value is 17418 (0x440A)
   */
  public static final Integer msoLanguageIDSpanishElSalvador = Integer.valueOf(17418);

  /**
   * Value is 4106 (0x100A)
   */
  public static final Integer msoLanguageIDSpanishGuatemala = Integer.valueOf(4106);

  /**
   * Value is 18442 (0x480A)
   */
  public static final Integer msoLanguageIDSpanishHonduras = Integer.valueOf(18442);

  /**
   * Value is 2058 (0x80A)
   */
  public static final Integer msoLanguageIDMexicanSpanish = Integer.valueOf(2058);

  /**
   * Value is 19466 (0x4C0A)
   */
  public static final Integer msoLanguageIDSpanishNicaragua = Integer.valueOf(19466);

  /**
   * Value is 6154 (0x180A)
   */
  public static final Integer msoLanguageIDSpanishPanama = Integer.valueOf(6154);

  /**
   * Value is 15370 (0x3C0A)
   */
  public static final Integer msoLanguageIDSpanishParaguay = Integer.valueOf(15370);

  /**
   * Value is 10250 (0x280A)
   */
  public static final Integer msoLanguageIDSpanishPeru = Integer.valueOf(10250);

  /**
   * Value is 20490 (0x500A)
   */
  public static final Integer msoLanguageIDSpanishPuertoRico = Integer.valueOf(20490);

  /**
   * Value is 3082 (0xC0A)
   */
  public static final Integer msoLanguageIDSpanishModernSort = Integer.valueOf(3082);

  /**
   * Value is 1034 (0x40A)
   */
  public static final Integer msoLanguageIDSpanish = Integer.valueOf(1034);

  /**
   * Value is 14346 (0x380A)
   */
  public static final Integer msoLanguageIDSpanishUruguay = Integer.valueOf(14346);

  /**
   * Value is 8202 (0x200A)
   */
  public static final Integer msoLanguageIDSpanishVenezuela = Integer.valueOf(8202);

  /**
   * Value is 1072 (0x430)
   */
  public static final Integer msoLanguageIDSutu = Integer.valueOf(1072);

  /**
   * Value is 1089 (0x441)
   */
  public static final Integer msoLanguageIDSwahili = Integer.valueOf(1089);

  /**
   * Value is 2077 (0x81D)
   */
  public static final Integer msoLanguageIDSwedishFinland = Integer.valueOf(2077);

  /**
   * Value is 1053 (0x41D)
   */
  public static final Integer msoLanguageIDSwedish = Integer.valueOf(1053);

  /**
   * Value is 1114 (0x45A)
   */
  public static final Integer msoLanguageIDSyriac = Integer.valueOf(1114);

  /**
   * Value is 1064 (0x428)
   */
  public static final Integer msoLanguageIDTajik = Integer.valueOf(1064);

  /**
   * Value is 1097 (0x449)
   */
  public static final Integer msoLanguageIDTamil = Integer.valueOf(1097);

  /**
   * Value is 1119 (0x45F)
   */
  public static final Integer msoLanguageIDTamazight = Integer.valueOf(1119);

  /**
   * Value is 2143 (0x85F)
   */
  public static final Integer msoLanguageIDTamazightLatin = Integer.valueOf(2143);

  /**
   * Value is 1092 (0x444)
   */
  public static final Integer msoLanguageIDTatar = Integer.valueOf(1092);

  /**
   * Value is 1098 (0x44A)
   */
  public static final Integer msoLanguageIDTelugu = Integer.valueOf(1098);

  /**
   * Value is 1054 (0x41E)
   */
  public static final Integer msoLanguageIDThai = Integer.valueOf(1054);

  /**
   * Value is 1105 (0x451)
   */
  public static final Integer msoLanguageIDTibetan = Integer.valueOf(1105);

  /**
   * Value is 1139 (0x473)
   */
  public static final Integer msoLanguageIDTigrignaEthiopic = Integer.valueOf(1139);

  /**
   * Value is 2163 (0x873)
   */
  public static final Integer msoLanguageIDTigrignaEritrea = Integer.valueOf(2163);

  /**
   * Value is 1073 (0x431)
   */
  public static final Integer msoLanguageIDTsonga = Integer.valueOf(1073);

  /**
   * Value is 1074 (0x432)
   */
  public static final Integer msoLanguageIDTswana = Integer.valueOf(1074);

  /**
   * Value is 1055 (0x41F)
   */
  public static final Integer msoLanguageIDTurkish = Integer.valueOf(1055);

  /**
   * Value is 1090 (0x442)
   */
  public static final Integer msoLanguageIDTurkmen = Integer.valueOf(1090);

  /**
   * Value is 1058 (0x422)
   */
  public static final Integer msoLanguageIDUkrainian = Integer.valueOf(1058);

  /**
   * Value is 1056 (0x420)
   */
  public static final Integer msoLanguageIDUrdu = Integer.valueOf(1056);

  /**
   * Value is 2115 (0x843)
   */
  public static final Integer msoLanguageIDUzbekCyrillic = Integer.valueOf(2115);

  /**
   * Value is 1091 (0x443)
   */
  public static final Integer msoLanguageIDUzbekLatin = Integer.valueOf(1091);

  /**
   * Value is 1075 (0x433)
   */
  public static final Integer msoLanguageIDVenda = Integer.valueOf(1075);

  /**
   * Value is 1066 (0x42A)
   */
  public static final Integer msoLanguageIDVietnamese = Integer.valueOf(1066);

  /**
   * Value is 1106 (0x452)
   */
  public static final Integer msoLanguageIDWelsh = Integer.valueOf(1106);

  /**
   * Value is 1076 (0x434)
   */
  public static final Integer msoLanguageIDXhosa = Integer.valueOf(1076);

  /**
   * Value is 1144 (0x478)
   */
  public static final Integer msoLanguageIDYi = Integer.valueOf(1144);

  /**
   * Value is 1085 (0x43D)
   */
  public static final Integer msoLanguageIDYiddish = Integer.valueOf(1085);

  /**
   * Value is 1130 (0x46A)
   */
  public static final Integer msoLanguageIDYoruba = Integer.valueOf(1130);

  /**
   * Value is 1077 (0x435)
   */
  public static final Integer msoLanguageIDZulu = Integer.valueOf(1077);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoLanguageIDMixed", msoLanguageIDMixed);
    v.put("msoLanguageIDNone", msoLanguageIDNone);
    v.put("msoLanguageIDNoProofing", msoLanguageIDNoProofing);
    v.put("msoLanguageIDAfrikaans", msoLanguageIDAfrikaans);
    v.put("msoLanguageIDAlbanian", msoLanguageIDAlbanian);
    v.put("msoLanguageIDAmharic", msoLanguageIDAmharic);
    v.put("msoLanguageIDArabicAlgeria", msoLanguageIDArabicAlgeria);
    v.put("msoLanguageIDArabicBahrain", msoLanguageIDArabicBahrain);
    v.put("msoLanguageIDArabicEgypt", msoLanguageIDArabicEgypt);
    v.put("msoLanguageIDArabicIraq", msoLanguageIDArabicIraq);
    v.put("msoLanguageIDArabicJordan", msoLanguageIDArabicJordan);
    v.put("msoLanguageIDArabicKuwait", msoLanguageIDArabicKuwait);
    v.put("msoLanguageIDArabicLebanon", msoLanguageIDArabicLebanon);
    v.put("msoLanguageIDArabicLibya", msoLanguageIDArabicLibya);
    v.put("msoLanguageIDArabicMorocco", msoLanguageIDArabicMorocco);
    v.put("msoLanguageIDArabicOman", msoLanguageIDArabicOman);
    v.put("msoLanguageIDArabicQatar", msoLanguageIDArabicQatar);
    v.put("msoLanguageIDArabic", msoLanguageIDArabic);
    v.put("msoLanguageIDArabicSyria", msoLanguageIDArabicSyria);
    v.put("msoLanguageIDArabicTunisia", msoLanguageIDArabicTunisia);
    v.put("msoLanguageIDArabicUAE", msoLanguageIDArabicUAE);
    v.put("msoLanguageIDArabicYemen", msoLanguageIDArabicYemen);
    v.put("msoLanguageIDArmenian", msoLanguageIDArmenian);
    v.put("msoLanguageIDAssamese", msoLanguageIDAssamese);
    v.put("msoLanguageIDAzeriCyrillic", msoLanguageIDAzeriCyrillic);
    v.put("msoLanguageIDAzeriLatin", msoLanguageIDAzeriLatin);
    v.put("msoLanguageIDBasque", msoLanguageIDBasque);
    v.put("msoLanguageIDByelorussian", msoLanguageIDByelorussian);
    v.put("msoLanguageIDBengali", msoLanguageIDBengali);
    v.put("msoLanguageIDBosnian", msoLanguageIDBosnian);
    v.put("msoLanguageIDBosnianBosniaHerzegovinaCyrillic", msoLanguageIDBosnianBosniaHerzegovinaCyrillic);
    v.put("msoLanguageIDBosnianBosniaHerzegovinaLatin", msoLanguageIDBosnianBosniaHerzegovinaLatin);
    v.put("msoLanguageIDBulgarian", msoLanguageIDBulgarian);
    v.put("msoLanguageIDBurmese", msoLanguageIDBurmese);
    v.put("msoLanguageIDCatalan", msoLanguageIDCatalan);
    v.put("msoLanguageIDChineseHongKongSAR", msoLanguageIDChineseHongKongSAR);
    v.put("msoLanguageIDChineseMacaoSAR", msoLanguageIDChineseMacaoSAR);
    v.put("msoLanguageIDSimplifiedChinese", msoLanguageIDSimplifiedChinese);
    v.put("msoLanguageIDChineseSingapore", msoLanguageIDChineseSingapore);
    v.put("msoLanguageIDTraditionalChinese", msoLanguageIDTraditionalChinese);
    v.put("msoLanguageIDCherokee", msoLanguageIDCherokee);
    v.put("msoLanguageIDCroatian", msoLanguageIDCroatian);
    v.put("msoLanguageIDCzech", msoLanguageIDCzech);
    v.put("msoLanguageIDDanish", msoLanguageIDDanish);
    v.put("msoLanguageIDDivehi", msoLanguageIDDivehi);
    v.put("msoLanguageIDBelgianDutch", msoLanguageIDBelgianDutch);
    v.put("msoLanguageIDDutch", msoLanguageIDDutch);
    v.put("msoLanguageIDDzongkhaBhutan", msoLanguageIDDzongkhaBhutan);
    v.put("msoLanguageIDEdo", msoLanguageIDEdo);
    v.put("msoLanguageIDEnglishAUS", msoLanguageIDEnglishAUS);
    v.put("msoLanguageIDEnglishBelize", msoLanguageIDEnglishBelize);
    v.put("msoLanguageIDEnglishCanadian", msoLanguageIDEnglishCanadian);
    v.put("msoLanguageIDEnglishCaribbean", msoLanguageIDEnglishCaribbean);
    v.put("msoLanguageIDEnglishIndonesia", msoLanguageIDEnglishIndonesia);
    v.put("msoLanguageIDEnglishIreland", msoLanguageIDEnglishIreland);
    v.put("msoLanguageIDEnglishJamaica", msoLanguageIDEnglishJamaica);
    v.put("msoLanguageIDEnglishNewZealand", msoLanguageIDEnglishNewZealand);
    v.put("msoLanguageIDEnglishPhilippines", msoLanguageIDEnglishPhilippines);
    v.put("msoLanguageIDEnglishSouthAfrica", msoLanguageIDEnglishSouthAfrica);
    v.put("msoLanguageIDEnglishTrinidadTobago", msoLanguageIDEnglishTrinidadTobago);
    v.put("msoLanguageIDEnglishUK", msoLanguageIDEnglishUK);
    v.put("msoLanguageIDEnglishUS", msoLanguageIDEnglishUS);
    v.put("msoLanguageIDEnglishZimbabwe", msoLanguageIDEnglishZimbabwe);
    v.put("msoLanguageIDEstonian", msoLanguageIDEstonian);
    v.put("msoLanguageIDFaeroese", msoLanguageIDFaeroese);
    v.put("msoLanguageIDFarsi", msoLanguageIDFarsi);
    v.put("msoLanguageIDFilipino", msoLanguageIDFilipino);
    v.put("msoLanguageIDFinnish", msoLanguageIDFinnish);
    v.put("msoLanguageIDBelgianFrench", msoLanguageIDBelgianFrench);
    v.put("msoLanguageIDFrenchCameroon", msoLanguageIDFrenchCameroon);
    v.put("msoLanguageIDFrenchCanadian", msoLanguageIDFrenchCanadian);
    v.put("msoLanguageIDFrenchCotedIvoire", msoLanguageIDFrenchCotedIvoire);
    v.put("msoLanguageIDFrench", msoLanguageIDFrench);
    v.put("msoLanguageIDFrenchHaiti", msoLanguageIDFrenchHaiti);
    v.put("msoLanguageIDFrenchLuxembourg", msoLanguageIDFrenchLuxembourg);
    v.put("msoLanguageIDFrenchMali", msoLanguageIDFrenchMali);
    v.put("msoLanguageIDFrenchMonaco", msoLanguageIDFrenchMonaco);
    v.put("msoLanguageIDFrenchMorocco", msoLanguageIDFrenchMorocco);
    v.put("msoLanguageIDFrenchReunion", msoLanguageIDFrenchReunion);
    v.put("msoLanguageIDFrenchSenegal", msoLanguageIDFrenchSenegal);
    v.put("msoLanguageIDSwissFrench", msoLanguageIDSwissFrench);
    v.put("msoLanguageIDFrenchWestIndies", msoLanguageIDFrenchWestIndies);
    v.put("msoLanguageIDFrenchZaire", msoLanguageIDFrenchZaire);
    v.put("msoLanguageIDFrenchCongoDRC", msoLanguageIDFrenchCongoDRC);
    v.put("msoLanguageIDFrisianNetherlands", msoLanguageIDFrisianNetherlands);
    v.put("msoLanguageIDFulfulde", msoLanguageIDFulfulde);
    v.put("msoLanguageIDGaelicIreland", msoLanguageIDGaelicIreland);
    v.put("msoLanguageIDGaelicScotland", msoLanguageIDGaelicScotland);
    v.put("msoLanguageIDGalician", msoLanguageIDGalician);
    v.put("msoLanguageIDGeorgian", msoLanguageIDGeorgian);
    v.put("msoLanguageIDGermanAustria", msoLanguageIDGermanAustria);
    v.put("msoLanguageIDGerman", msoLanguageIDGerman);
    v.put("msoLanguageIDGermanLiechtenstein", msoLanguageIDGermanLiechtenstein);
    v.put("msoLanguageIDGermanLuxembourg", msoLanguageIDGermanLuxembourg);
    v.put("msoLanguageIDSwissGerman", msoLanguageIDSwissGerman);
    v.put("msoLanguageIDGreek", msoLanguageIDGreek);
    v.put("msoLanguageIDGuarani", msoLanguageIDGuarani);
    v.put("msoLanguageIDGujarati", msoLanguageIDGujarati);
    v.put("msoLanguageIDHausa", msoLanguageIDHausa);
    v.put("msoLanguageIDHawaiian", msoLanguageIDHawaiian);
    v.put("msoLanguageIDHebrew", msoLanguageIDHebrew);
    v.put("msoLanguageIDHindi", msoLanguageIDHindi);
    v.put("msoLanguageIDHungarian", msoLanguageIDHungarian);
    v.put("msoLanguageIDIbibio", msoLanguageIDIbibio);
    v.put("msoLanguageIDIcelandic", msoLanguageIDIcelandic);
    v.put("msoLanguageIDIgbo", msoLanguageIDIgbo);
    v.put("msoLanguageIDIndonesian", msoLanguageIDIndonesian);
    v.put("msoLanguageIDInuktitut", msoLanguageIDInuktitut);
    v.put("msoLanguageIDItalian", msoLanguageIDItalian);
    v.put("msoLanguageIDSwissItalian", msoLanguageIDSwissItalian);
    v.put("msoLanguageIDJapanese", msoLanguageIDJapanese);
    v.put("msoLanguageIDKannada", msoLanguageIDKannada);
    v.put("msoLanguageIDKanuri", msoLanguageIDKanuri);
    v.put("msoLanguageIDKashmiri", msoLanguageIDKashmiri);
    v.put("msoLanguageIDKashmiriDevanagari", msoLanguageIDKashmiriDevanagari);
    v.put("msoLanguageIDKazakh", msoLanguageIDKazakh);
    v.put("msoLanguageIDKhmer", msoLanguageIDKhmer);
    v.put("msoLanguageIDKirghiz", msoLanguageIDKirghiz);
    v.put("msoLanguageIDKonkani", msoLanguageIDKonkani);
    v.put("msoLanguageIDKorean", msoLanguageIDKorean);
    v.put("msoLanguageIDKyrgyz", msoLanguageIDKyrgyz);
    v.put("msoLanguageIDLatin", msoLanguageIDLatin);
    v.put("msoLanguageIDLao", msoLanguageIDLao);
    v.put("msoLanguageIDLatvian", msoLanguageIDLatvian);
    v.put("msoLanguageIDLithuanian", msoLanguageIDLithuanian);
    v.put("msoLanguageIDMacedonian", msoLanguageIDMacedonian);
    v.put("msoLanguageIDMacedonianFYROM", msoLanguageIDMacedonianFYROM);
    v.put("msoLanguageIDMalaysian", msoLanguageIDMalaysian);
    v.put("msoLanguageIDMalayBruneiDarussalam", msoLanguageIDMalayBruneiDarussalam);
    v.put("msoLanguageIDMalayalam", msoLanguageIDMalayalam);
    v.put("msoLanguageIDMaltese", msoLanguageIDMaltese);
    v.put("msoLanguageIDManipuri", msoLanguageIDManipuri);
    v.put("msoLanguageIDMaori", msoLanguageIDMaori);
    v.put("msoLanguageIDMarathi", msoLanguageIDMarathi);
    v.put("msoLanguageIDMongolian", msoLanguageIDMongolian);
    v.put("msoLanguageIDNepali", msoLanguageIDNepali);
    v.put("msoLanguageIDNorwegianBokmol", msoLanguageIDNorwegianBokmol);
    v.put("msoLanguageIDNorwegianNynorsk", msoLanguageIDNorwegianNynorsk);
    v.put("msoLanguageIDOriya", msoLanguageIDOriya);
    v.put("msoLanguageIDOromo", msoLanguageIDOromo);
    v.put("msoLanguageIDPashto", msoLanguageIDPashto);
    v.put("msoLanguageIDPolish", msoLanguageIDPolish);
    v.put("msoLanguageIDBrazilianPortuguese", msoLanguageIDBrazilianPortuguese);
    v.put("msoLanguageIDPortuguese", msoLanguageIDPortuguese);
    v.put("msoLanguageIDPunjabi", msoLanguageIDPunjabi);
    v.put("msoLanguageIDQuechuaBolivia", msoLanguageIDQuechuaBolivia);
    v.put("msoLanguageIDQuechuaEcuador", msoLanguageIDQuechuaEcuador);
    v.put("msoLanguageIDQuechuaPeru", msoLanguageIDQuechuaPeru);
    v.put("msoLanguageIDRhaetoRomanic", msoLanguageIDRhaetoRomanic);
    v.put("msoLanguageIDRomanianMoldova", msoLanguageIDRomanianMoldova);
    v.put("msoLanguageIDRomanian", msoLanguageIDRomanian);
    v.put("msoLanguageIDRussianMoldova", msoLanguageIDRussianMoldova);
    v.put("msoLanguageIDRussian", msoLanguageIDRussian);
    v.put("msoLanguageIDSamiLappish", msoLanguageIDSamiLappish);
    v.put("msoLanguageIDSanskrit", msoLanguageIDSanskrit);
    v.put("msoLanguageIDSepedi", msoLanguageIDSepedi);
    v.put("msoLanguageIDSerbianBosniaHerzegovinaCyrillic", msoLanguageIDSerbianBosniaHerzegovinaCyrillic);
    v.put("msoLanguageIDSerbianBosniaHerzegovinaLatin", msoLanguageIDSerbianBosniaHerzegovinaLatin);
    v.put("msoLanguageIDSerbianCyrillic", msoLanguageIDSerbianCyrillic);
    v.put("msoLanguageIDSerbianLatin", msoLanguageIDSerbianLatin);
    v.put("msoLanguageIDSesotho", msoLanguageIDSesotho);
    v.put("msoLanguageIDSindhi", msoLanguageIDSindhi);
    v.put("msoLanguageIDSindhiPakistan", msoLanguageIDSindhiPakistan);
    v.put("msoLanguageIDSinhalese", msoLanguageIDSinhalese);
    v.put("msoLanguageIDSlovak", msoLanguageIDSlovak);
    v.put("msoLanguageIDSlovenian", msoLanguageIDSlovenian);
    v.put("msoLanguageIDSomali", msoLanguageIDSomali);
    v.put("msoLanguageIDSorbian", msoLanguageIDSorbian);
    v.put("msoLanguageIDSpanishArgentina", msoLanguageIDSpanishArgentina);
    v.put("msoLanguageIDSpanishBolivia", msoLanguageIDSpanishBolivia);
    v.put("msoLanguageIDSpanishChile", msoLanguageIDSpanishChile);
    v.put("msoLanguageIDSpanishColombia", msoLanguageIDSpanishColombia);
    v.put("msoLanguageIDSpanishCostaRica", msoLanguageIDSpanishCostaRica);
    v.put("msoLanguageIDSpanishDominicanRepublic", msoLanguageIDSpanishDominicanRepublic);
    v.put("msoLanguageIDSpanishEcuador", msoLanguageIDSpanishEcuador);
    v.put("msoLanguageIDSpanishElSalvador", msoLanguageIDSpanishElSalvador);
    v.put("msoLanguageIDSpanishGuatemala", msoLanguageIDSpanishGuatemala);
    v.put("msoLanguageIDSpanishHonduras", msoLanguageIDSpanishHonduras);
    v.put("msoLanguageIDMexicanSpanish", msoLanguageIDMexicanSpanish);
    v.put("msoLanguageIDSpanishNicaragua", msoLanguageIDSpanishNicaragua);
    v.put("msoLanguageIDSpanishPanama", msoLanguageIDSpanishPanama);
    v.put("msoLanguageIDSpanishParaguay", msoLanguageIDSpanishParaguay);
    v.put("msoLanguageIDSpanishPeru", msoLanguageIDSpanishPeru);
    v.put("msoLanguageIDSpanishPuertoRico", msoLanguageIDSpanishPuertoRico);
    v.put("msoLanguageIDSpanishModernSort", msoLanguageIDSpanishModernSort);
    v.put("msoLanguageIDSpanish", msoLanguageIDSpanish);
    v.put("msoLanguageIDSpanishUruguay", msoLanguageIDSpanishUruguay);
    v.put("msoLanguageIDSpanishVenezuela", msoLanguageIDSpanishVenezuela);
    v.put("msoLanguageIDSutu", msoLanguageIDSutu);
    v.put("msoLanguageIDSwahili", msoLanguageIDSwahili);
    v.put("msoLanguageIDSwedishFinland", msoLanguageIDSwedishFinland);
    v.put("msoLanguageIDSwedish", msoLanguageIDSwedish);
    v.put("msoLanguageIDSyriac", msoLanguageIDSyriac);
    v.put("msoLanguageIDTajik", msoLanguageIDTajik);
    v.put("msoLanguageIDTamil", msoLanguageIDTamil);
    v.put("msoLanguageIDTamazight", msoLanguageIDTamazight);
    v.put("msoLanguageIDTamazightLatin", msoLanguageIDTamazightLatin);
    v.put("msoLanguageIDTatar", msoLanguageIDTatar);
    v.put("msoLanguageIDTelugu", msoLanguageIDTelugu);
    v.put("msoLanguageIDThai", msoLanguageIDThai);
    v.put("msoLanguageIDTibetan", msoLanguageIDTibetan);
    v.put("msoLanguageIDTigrignaEthiopic", msoLanguageIDTigrignaEthiopic);
    v.put("msoLanguageIDTigrignaEritrea", msoLanguageIDTigrignaEritrea);
    v.put("msoLanguageIDTsonga", msoLanguageIDTsonga);
    v.put("msoLanguageIDTswana", msoLanguageIDTswana);
    v.put("msoLanguageIDTurkish", msoLanguageIDTurkish);
    v.put("msoLanguageIDTurkmen", msoLanguageIDTurkmen);
    v.put("msoLanguageIDUkrainian", msoLanguageIDUkrainian);
    v.put("msoLanguageIDUrdu", msoLanguageIDUrdu);
    v.put("msoLanguageIDUzbekCyrillic", msoLanguageIDUzbekCyrillic);
    v.put("msoLanguageIDUzbekLatin", msoLanguageIDUzbekLatin);
    v.put("msoLanguageIDVenda", msoLanguageIDVenda);
    v.put("msoLanguageIDVietnamese", msoLanguageIDVietnamese);
    v.put("msoLanguageIDWelsh", msoLanguageIDWelsh);
    v.put("msoLanguageIDXhosa", msoLanguageIDXhosa);
    v.put("msoLanguageIDYi", msoLanguageIDYi);
    v.put("msoLanguageIDYiddish", msoLanguageIDYiddish);
    v.put("msoLanguageIDYoruba", msoLanguageIDYoruba);
    v.put("msoLanguageIDZulu", msoLanguageIDZulu);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
