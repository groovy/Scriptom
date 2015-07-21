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
public final class WdLanguageID
{
  private WdLanguageID()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdLanguageNone = Integer.valueOf(0);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer wdNoProofing = Integer.valueOf(1024);

  /**
   * Value is 1078 (0x436)
   */
  public static final Integer wdAfrikaans = Integer.valueOf(1078);

  /**
   * Value is 1052 (0x41C)
   */
  public static final Integer wdAlbanian = Integer.valueOf(1052);

  /**
   * Value is 1118 (0x45E)
   */
  public static final Integer wdAmharic = Integer.valueOf(1118);

  /**
   * Value is 5121 (0x1401)
   */
  public static final Integer wdArabicAlgeria = Integer.valueOf(5121);

  /**
   * Value is 15361 (0x3C01)
   */
  public static final Integer wdArabicBahrain = Integer.valueOf(15361);

  /**
   * Value is 3073 (0xC01)
   */
  public static final Integer wdArabicEgypt = Integer.valueOf(3073);

  /**
   * Value is 2049 (0x801)
   */
  public static final Integer wdArabicIraq = Integer.valueOf(2049);

  /**
   * Value is 11265 (0x2C01)
   */
  public static final Integer wdArabicJordan = Integer.valueOf(11265);

  /**
   * Value is 13313 (0x3401)
   */
  public static final Integer wdArabicKuwait = Integer.valueOf(13313);

  /**
   * Value is 12289 (0x3001)
   */
  public static final Integer wdArabicLebanon = Integer.valueOf(12289);

  /**
   * Value is 4097 (0x1001)
   */
  public static final Integer wdArabicLibya = Integer.valueOf(4097);

  /**
   * Value is 6145 (0x1801)
   */
  public static final Integer wdArabicMorocco = Integer.valueOf(6145);

  /**
   * Value is 8193 (0x2001)
   */
  public static final Integer wdArabicOman = Integer.valueOf(8193);

  /**
   * Value is 16385 (0x4001)
   */
  public static final Integer wdArabicQatar = Integer.valueOf(16385);

  /**
   * Value is 1025 (0x401)
   */
  public static final Integer wdArabic = Integer.valueOf(1025);

  /**
   * Value is 10241 (0x2801)
   */
  public static final Integer wdArabicSyria = Integer.valueOf(10241);

  /**
   * Value is 7169 (0x1C01)
   */
  public static final Integer wdArabicTunisia = Integer.valueOf(7169);

  /**
   * Value is 14337 (0x3801)
   */
  public static final Integer wdArabicUAE = Integer.valueOf(14337);

  /**
   * Value is 9217 (0x2401)
   */
  public static final Integer wdArabicYemen = Integer.valueOf(9217);

  /**
   * Value is 1067 (0x42B)
   */
  public static final Integer wdArmenian = Integer.valueOf(1067);

  /**
   * Value is 1101 (0x44D)
   */
  public static final Integer wdAssamese = Integer.valueOf(1101);

  /**
   * Value is 2092 (0x82C)
   */
  public static final Integer wdAzeriCyrillic = Integer.valueOf(2092);

  /**
   * Value is 1068 (0x42C)
   */
  public static final Integer wdAzeriLatin = Integer.valueOf(1068);

  /**
   * Value is 1069 (0x42D)
   */
  public static final Integer wdBasque = Integer.valueOf(1069);

  /**
   * Value is 1059 (0x423)
   */
  public static final Integer wdByelorussian = Integer.valueOf(1059);

  /**
   * Value is 1093 (0x445)
   */
  public static final Integer wdBengali = Integer.valueOf(1093);

  /**
   * Value is 1026 (0x402)
   */
  public static final Integer wdBulgarian = Integer.valueOf(1026);

  /**
   * Value is 1109 (0x455)
   */
  public static final Integer wdBurmese = Integer.valueOf(1109);

  /**
   * Value is 1027 (0x403)
   */
  public static final Integer wdCatalan = Integer.valueOf(1027);

  /**
   * Value is 1116 (0x45C)
   */
  public static final Integer wdCherokee = Integer.valueOf(1116);

  /**
   * Value is 3076 (0xC04)
   */
  public static final Integer wdChineseHongKongSAR = Integer.valueOf(3076);

  /**
   * Value is 5124 (0x1404)
   */
  public static final Integer wdChineseMacaoSAR = Integer.valueOf(5124);

  /**
   * Value is 2052 (0x804)
   */
  public static final Integer wdSimplifiedChinese = Integer.valueOf(2052);

  /**
   * Value is 4100 (0x1004)
   */
  public static final Integer wdChineseSingapore = Integer.valueOf(4100);

  /**
   * Value is 1028 (0x404)
   */
  public static final Integer wdTraditionalChinese = Integer.valueOf(1028);

  /**
   * Value is 1050 (0x41A)
   */
  public static final Integer wdCroatian = Integer.valueOf(1050);

  /**
   * Value is 1029 (0x405)
   */
  public static final Integer wdCzech = Integer.valueOf(1029);

  /**
   * Value is 1030 (0x406)
   */
  public static final Integer wdDanish = Integer.valueOf(1030);

  /**
   * Value is 1125 (0x465)
   */
  public static final Integer wdDivehi = Integer.valueOf(1125);

  /**
   * Value is 2067 (0x813)
   */
  public static final Integer wdBelgianDutch = Integer.valueOf(2067);

  /**
   * Value is 1043 (0x413)
   */
  public static final Integer wdDutch = Integer.valueOf(1043);

  /**
   * Value is 2129 (0x851)
   */
  public static final Integer wdDzongkhaBhutan = Integer.valueOf(2129);

  /**
   * Value is 1126 (0x466)
   */
  public static final Integer wdEdo = Integer.valueOf(1126);

  /**
   * Value is 3081 (0xC09)
   */
  public static final Integer wdEnglishAUS = Integer.valueOf(3081);

  /**
   * Value is 10249 (0x2809)
   */
  public static final Integer wdEnglishBelize = Integer.valueOf(10249);

  /**
   * Value is 4105 (0x1009)
   */
  public static final Integer wdEnglishCanadian = Integer.valueOf(4105);

  /**
   * Value is 9225 (0x2409)
   */
  public static final Integer wdEnglishCaribbean = Integer.valueOf(9225);

  /**
   * Value is 6153 (0x1809)
   */
  public static final Integer wdEnglishIreland = Integer.valueOf(6153);

  /**
   * Value is 8201 (0x2009)
   */
  public static final Integer wdEnglishJamaica = Integer.valueOf(8201);

  /**
   * Value is 5129 (0x1409)
   */
  public static final Integer wdEnglishNewZealand = Integer.valueOf(5129);

  /**
   * Value is 13321 (0x3409)
   */
  public static final Integer wdEnglishPhilippines = Integer.valueOf(13321);

  /**
   * Value is 7177 (0x1C09)
   */
  public static final Integer wdEnglishSouthAfrica = Integer.valueOf(7177);

  /**
   * Value is 11273 (0x2C09)
   */
  public static final Integer wdEnglishTrinidadTobago = Integer.valueOf(11273);

  /**
   * Value is 2057 (0x809)
   */
  public static final Integer wdEnglishUK = Integer.valueOf(2057);

  /**
   * Value is 1033 (0x409)
   */
  public static final Integer wdEnglishUS = Integer.valueOf(1033);

  /**
   * Value is 12297 (0x3009)
   */
  public static final Integer wdEnglishZimbabwe = Integer.valueOf(12297);

  /**
   * Value is 14345 (0x3809)
   */
  public static final Integer wdEnglishIndonesia = Integer.valueOf(14345);

  /**
   * Value is 1061 (0x425)
   */
  public static final Integer wdEstonian = Integer.valueOf(1061);

  /**
   * Value is 1080 (0x438)
   */
  public static final Integer wdFaeroese = Integer.valueOf(1080);

  /**
   * Value is 1065 (0x429)
   */
  public static final Integer wdFarsi = Integer.valueOf(1065);

  /**
   * Value is 1124 (0x464)
   */
  public static final Integer wdFilipino = Integer.valueOf(1124);

  /**
   * Value is 1035 (0x40B)
   */
  public static final Integer wdFinnish = Integer.valueOf(1035);

  /**
   * Value is 1127 (0x467)
   */
  public static final Integer wdFulfulde = Integer.valueOf(1127);

  /**
   * Value is 2060 (0x80C)
   */
  public static final Integer wdBelgianFrench = Integer.valueOf(2060);

  /**
   * Value is 11276 (0x2C0C)
   */
  public static final Integer wdFrenchCameroon = Integer.valueOf(11276);

  /**
   * Value is 3084 (0xC0C)
   */
  public static final Integer wdFrenchCanadian = Integer.valueOf(3084);

  /**
   * Value is 12300 (0x300C)
   */
  public static final Integer wdFrenchCotedIvoire = Integer.valueOf(12300);

  /**
   * Value is 1036 (0x40C)
   */
  public static final Integer wdFrench = Integer.valueOf(1036);

  /**
   * Value is 5132 (0x140C)
   */
  public static final Integer wdFrenchLuxembourg = Integer.valueOf(5132);

  /**
   * Value is 13324 (0x340C)
   */
  public static final Integer wdFrenchMali = Integer.valueOf(13324);

  /**
   * Value is 6156 (0x180C)
   */
  public static final Integer wdFrenchMonaco = Integer.valueOf(6156);

  /**
   * Value is 8204 (0x200C)
   */
  public static final Integer wdFrenchReunion = Integer.valueOf(8204);

  /**
   * Value is 10252 (0x280C)
   */
  public static final Integer wdFrenchSenegal = Integer.valueOf(10252);

  /**
   * Value is 14348 (0x380C)
   */
  public static final Integer wdFrenchMorocco = Integer.valueOf(14348);

  /**
   * Value is 15372 (0x3C0C)
   */
  public static final Integer wdFrenchHaiti = Integer.valueOf(15372);

  /**
   * Value is 4108 (0x100C)
   */
  public static final Integer wdSwissFrench = Integer.valueOf(4108);

  /**
   * Value is 7180 (0x1C0C)
   */
  public static final Integer wdFrenchWestIndies = Integer.valueOf(7180);

  /**
   * Value is 9228 (0x240C)
   */
  public static final Integer wdFrenchZaire = Integer.valueOf(9228);

  /**
   * Value is 1122 (0x462)
   */
  public static final Integer wdFrisianNetherlands = Integer.valueOf(1122);

  /**
   * Value is 2108 (0x83C)
   */
  public static final Integer wdGaelicIreland = Integer.valueOf(2108);

  /**
   * Value is 1084 (0x43C)
   */
  public static final Integer wdGaelicScotland = Integer.valueOf(1084);

  /**
   * Value is 1110 (0x456)
   */
  public static final Integer wdGalician = Integer.valueOf(1110);

  /**
   * Value is 1079 (0x437)
   */
  public static final Integer wdGeorgian = Integer.valueOf(1079);

  /**
   * Value is 3079 (0xC07)
   */
  public static final Integer wdGermanAustria = Integer.valueOf(3079);

  /**
   * Value is 1031 (0x407)
   */
  public static final Integer wdGerman = Integer.valueOf(1031);

  /**
   * Value is 5127 (0x1407)
   */
  public static final Integer wdGermanLiechtenstein = Integer.valueOf(5127);

  /**
   * Value is 4103 (0x1007)
   */
  public static final Integer wdGermanLuxembourg = Integer.valueOf(4103);

  /**
   * Value is 2055 (0x807)
   */
  public static final Integer wdSwissGerman = Integer.valueOf(2055);

  /**
   * Value is 1032 (0x408)
   */
  public static final Integer wdGreek = Integer.valueOf(1032);

  /**
   * Value is 1140 (0x474)
   */
  public static final Integer wdGuarani = Integer.valueOf(1140);

  /**
   * Value is 1095 (0x447)
   */
  public static final Integer wdGujarati = Integer.valueOf(1095);

  /**
   * Value is 1128 (0x468)
   */
  public static final Integer wdHausa = Integer.valueOf(1128);

  /**
   * Value is 1141 (0x475)
   */
  public static final Integer wdHawaiian = Integer.valueOf(1141);

  /**
   * Value is 1037 (0x40D)
   */
  public static final Integer wdHebrew = Integer.valueOf(1037);

  /**
   * Value is 1081 (0x439)
   */
  public static final Integer wdHindi = Integer.valueOf(1081);

  /**
   * Value is 1038 (0x40E)
   */
  public static final Integer wdHungarian = Integer.valueOf(1038);

  /**
   * Value is 1129 (0x469)
   */
  public static final Integer wdIbibio = Integer.valueOf(1129);

  /**
   * Value is 1039 (0x40F)
   */
  public static final Integer wdIcelandic = Integer.valueOf(1039);

  /**
   * Value is 1136 (0x470)
   */
  public static final Integer wdIgbo = Integer.valueOf(1136);

  /**
   * Value is 1057 (0x421)
   */
  public static final Integer wdIndonesian = Integer.valueOf(1057);

  /**
   * Value is 1117 (0x45D)
   */
  public static final Integer wdInuktitut = Integer.valueOf(1117);

  /**
   * Value is 1040 (0x410)
   */
  public static final Integer wdItalian = Integer.valueOf(1040);

  /**
   * Value is 2064 (0x810)
   */
  public static final Integer wdSwissItalian = Integer.valueOf(2064);

  /**
   * Value is 1041 (0x411)
   */
  public static final Integer wdJapanese = Integer.valueOf(1041);

  /**
   * Value is 1099 (0x44B)
   */
  public static final Integer wdKannada = Integer.valueOf(1099);

  /**
   * Value is 1137 (0x471)
   */
  public static final Integer wdKanuri = Integer.valueOf(1137);

  /**
   * Value is 1120 (0x460)
   */
  public static final Integer wdKashmiri = Integer.valueOf(1120);

  /**
   * Value is 1087 (0x43F)
   */
  public static final Integer wdKazakh = Integer.valueOf(1087);

  /**
   * Value is 1107 (0x453)
   */
  public static final Integer wdKhmer = Integer.valueOf(1107);

  /**
   * Value is 1088 (0x440)
   */
  public static final Integer wdKirghiz = Integer.valueOf(1088);

  /**
   * Value is 1111 (0x457)
   */
  public static final Integer wdKonkani = Integer.valueOf(1111);

  /**
   * Value is 1042 (0x412)
   */
  public static final Integer wdKorean = Integer.valueOf(1042);

  /**
   * Value is 1088 (0x440)
   */
  public static final Integer wdKyrgyz = Integer.valueOf(1088);

  /**
   * Value is 1108 (0x454)
   */
  public static final Integer wdLao = Integer.valueOf(1108);

  /**
   * Value is 1142 (0x476)
   */
  public static final Integer wdLatin = Integer.valueOf(1142);

  /**
   * Value is 1062 (0x426)
   */
  public static final Integer wdLatvian = Integer.valueOf(1062);

  /**
   * Value is 1063 (0x427)
   */
  public static final Integer wdLithuanian = Integer.valueOf(1063);

  /**
   * Value is 1071 (0x42F)
   */
  public static final Integer wdMacedonian = Integer.valueOf(1071);

  /**
   * Value is 1086 (0x43E)
   */
  public static final Integer wdMalaysian = Integer.valueOf(1086);

  /**
   * Value is 2110 (0x83E)
   */
  public static final Integer wdMalayBruneiDarussalam = Integer.valueOf(2110);

  /**
   * Value is 1100 (0x44C)
   */
  public static final Integer wdMalayalam = Integer.valueOf(1100);

  /**
   * Value is 1082 (0x43A)
   */
  public static final Integer wdMaltese = Integer.valueOf(1082);

  /**
   * Value is 1112 (0x458)
   */
  public static final Integer wdManipuri = Integer.valueOf(1112);

  /**
   * Value is 1102 (0x44E)
   */
  public static final Integer wdMarathi = Integer.valueOf(1102);

  /**
   * Value is 1104 (0x450)
   */
  public static final Integer wdMongolian = Integer.valueOf(1104);

  /**
   * Value is 1121 (0x461)
   */
  public static final Integer wdNepali = Integer.valueOf(1121);

  /**
   * Value is 1044 (0x414)
   */
  public static final Integer wdNorwegianBokmol = Integer.valueOf(1044);

  /**
   * Value is 2068 (0x814)
   */
  public static final Integer wdNorwegianNynorsk = Integer.valueOf(2068);

  /**
   * Value is 1096 (0x448)
   */
  public static final Integer wdOriya = Integer.valueOf(1096);

  /**
   * Value is 1138 (0x472)
   */
  public static final Integer wdOromo = Integer.valueOf(1138);

  /**
   * Value is 1123 (0x463)
   */
  public static final Integer wdPashto = Integer.valueOf(1123);

  /**
   * Value is 1045 (0x415)
   */
  public static final Integer wdPolish = Integer.valueOf(1045);

  /**
   * Value is 1046 (0x416)
   */
  public static final Integer wdBrazilianPortuguese = Integer.valueOf(1046);

  /**
   * Value is 2070 (0x816)
   */
  public static final Integer wdPortuguese = Integer.valueOf(2070);

  /**
   * Value is 1094 (0x446)
   */
  public static final Integer wdPunjabi = Integer.valueOf(1094);

  /**
   * Value is 1047 (0x417)
   */
  public static final Integer wdRhaetoRomanic = Integer.valueOf(1047);

  /**
   * Value is 2072 (0x818)
   */
  public static final Integer wdRomanianMoldova = Integer.valueOf(2072);

  /**
   * Value is 1048 (0x418)
   */
  public static final Integer wdRomanian = Integer.valueOf(1048);

  /**
   * Value is 2073 (0x819)
   */
  public static final Integer wdRussianMoldova = Integer.valueOf(2073);

  /**
   * Value is 1049 (0x419)
   */
  public static final Integer wdRussian = Integer.valueOf(1049);

  /**
   * Value is 1083 (0x43B)
   */
  public static final Integer wdSamiLappish = Integer.valueOf(1083);

  /**
   * Value is 1103 (0x44F)
   */
  public static final Integer wdSanskrit = Integer.valueOf(1103);

  /**
   * Value is 3098 (0xC1A)
   */
  public static final Integer wdSerbianCyrillic = Integer.valueOf(3098);

  /**
   * Value is 2074 (0x81A)
   */
  public static final Integer wdSerbianLatin = Integer.valueOf(2074);

  /**
   * Value is 1115 (0x45B)
   */
  public static final Integer wdSinhalese = Integer.valueOf(1115);

  /**
   * Value is 1113 (0x459)
   */
  public static final Integer wdSindhi = Integer.valueOf(1113);

  /**
   * Value is 2137 (0x859)
   */
  public static final Integer wdSindhiPakistan = Integer.valueOf(2137);

  /**
   * Value is 1051 (0x41B)
   */
  public static final Integer wdSlovak = Integer.valueOf(1051);

  /**
   * Value is 1060 (0x424)
   */
  public static final Integer wdSlovenian = Integer.valueOf(1060);

  /**
   * Value is 1143 (0x477)
   */
  public static final Integer wdSomali = Integer.valueOf(1143);

  /**
   * Value is 1070 (0x42E)
   */
  public static final Integer wdSorbian = Integer.valueOf(1070);

  /**
   * Value is 11274 (0x2C0A)
   */
  public static final Integer wdSpanishArgentina = Integer.valueOf(11274);

  /**
   * Value is 16394 (0x400A)
   */
  public static final Integer wdSpanishBolivia = Integer.valueOf(16394);

  /**
   * Value is 13322 (0x340A)
   */
  public static final Integer wdSpanishChile = Integer.valueOf(13322);

  /**
   * Value is 9226 (0x240A)
   */
  public static final Integer wdSpanishColombia = Integer.valueOf(9226);

  /**
   * Value is 5130 (0x140A)
   */
  public static final Integer wdSpanishCostaRica = Integer.valueOf(5130);

  /**
   * Value is 7178 (0x1C0A)
   */
  public static final Integer wdSpanishDominicanRepublic = Integer.valueOf(7178);

  /**
   * Value is 12298 (0x300A)
   */
  public static final Integer wdSpanishEcuador = Integer.valueOf(12298);

  /**
   * Value is 17418 (0x440A)
   */
  public static final Integer wdSpanishElSalvador = Integer.valueOf(17418);

  /**
   * Value is 4106 (0x100A)
   */
  public static final Integer wdSpanishGuatemala = Integer.valueOf(4106);

  /**
   * Value is 18442 (0x480A)
   */
  public static final Integer wdSpanishHonduras = Integer.valueOf(18442);

  /**
   * Value is 2058 (0x80A)
   */
  public static final Integer wdMexicanSpanish = Integer.valueOf(2058);

  /**
   * Value is 19466 (0x4C0A)
   */
  public static final Integer wdSpanishNicaragua = Integer.valueOf(19466);

  /**
   * Value is 6154 (0x180A)
   */
  public static final Integer wdSpanishPanama = Integer.valueOf(6154);

  /**
   * Value is 15370 (0x3C0A)
   */
  public static final Integer wdSpanishParaguay = Integer.valueOf(15370);

  /**
   * Value is 10250 (0x280A)
   */
  public static final Integer wdSpanishPeru = Integer.valueOf(10250);

  /**
   * Value is 20490 (0x500A)
   */
  public static final Integer wdSpanishPuertoRico = Integer.valueOf(20490);

  /**
   * Value is 3082 (0xC0A)
   */
  public static final Integer wdSpanishModernSort = Integer.valueOf(3082);

  /**
   * Value is 1034 (0x40A)
   */
  public static final Integer wdSpanish = Integer.valueOf(1034);

  /**
   * Value is 14346 (0x380A)
   */
  public static final Integer wdSpanishUruguay = Integer.valueOf(14346);

  /**
   * Value is 8202 (0x200A)
   */
  public static final Integer wdSpanishVenezuela = Integer.valueOf(8202);

  /**
   * Value is 1072 (0x430)
   */
  public static final Integer wdSesotho = Integer.valueOf(1072);

  /**
   * Value is 1072 (0x430)
   */
  public static final Integer wdSutu = Integer.valueOf(1072);

  /**
   * Value is 1089 (0x441)
   */
  public static final Integer wdSwahili = Integer.valueOf(1089);

  /**
   * Value is 2077 (0x81D)
   */
  public static final Integer wdSwedishFinland = Integer.valueOf(2077);

  /**
   * Value is 1053 (0x41D)
   */
  public static final Integer wdSwedish = Integer.valueOf(1053);

  /**
   * Value is 1114 (0x45A)
   */
  public static final Integer wdSyriac = Integer.valueOf(1114);

  /**
   * Value is 1064 (0x428)
   */
  public static final Integer wdTajik = Integer.valueOf(1064);

  /**
   * Value is 1119 (0x45F)
   */
  public static final Integer wdTamazight = Integer.valueOf(1119);

  /**
   * Value is 2143 (0x85F)
   */
  public static final Integer wdTamazightLatin = Integer.valueOf(2143);

  /**
   * Value is 1097 (0x449)
   */
  public static final Integer wdTamil = Integer.valueOf(1097);

  /**
   * Value is 1092 (0x444)
   */
  public static final Integer wdTatar = Integer.valueOf(1092);

  /**
   * Value is 1098 (0x44A)
   */
  public static final Integer wdTelugu = Integer.valueOf(1098);

  /**
   * Value is 1054 (0x41E)
   */
  public static final Integer wdThai = Integer.valueOf(1054);

  /**
   * Value is 1105 (0x451)
   */
  public static final Integer wdTibetan = Integer.valueOf(1105);

  /**
   * Value is 1139 (0x473)
   */
  public static final Integer wdTigrignaEthiopic = Integer.valueOf(1139);

  /**
   * Value is 2163 (0x873)
   */
  public static final Integer wdTigrignaEritrea = Integer.valueOf(2163);

  /**
   * Value is 1073 (0x431)
   */
  public static final Integer wdTsonga = Integer.valueOf(1073);

  /**
   * Value is 1074 (0x432)
   */
  public static final Integer wdTswana = Integer.valueOf(1074);

  /**
   * Value is 1055 (0x41F)
   */
  public static final Integer wdTurkish = Integer.valueOf(1055);

  /**
   * Value is 1090 (0x442)
   */
  public static final Integer wdTurkmen = Integer.valueOf(1090);

  /**
   * Value is 1058 (0x422)
   */
  public static final Integer wdUkrainian = Integer.valueOf(1058);

  /**
   * Value is 1056 (0x420)
   */
  public static final Integer wdUrdu = Integer.valueOf(1056);

  /**
   * Value is 2115 (0x843)
   */
  public static final Integer wdUzbekCyrillic = Integer.valueOf(2115);

  /**
   * Value is 1091 (0x443)
   */
  public static final Integer wdUzbekLatin = Integer.valueOf(1091);

  /**
   * Value is 1075 (0x433)
   */
  public static final Integer wdVenda = Integer.valueOf(1075);

  /**
   * Value is 1066 (0x42A)
   */
  public static final Integer wdVietnamese = Integer.valueOf(1066);

  /**
   * Value is 1106 (0x452)
   */
  public static final Integer wdWelsh = Integer.valueOf(1106);

  /**
   * Value is 1076 (0x434)
   */
  public static final Integer wdXhosa = Integer.valueOf(1076);

  /**
   * Value is 1144 (0x478)
   */
  public static final Integer wdYi = Integer.valueOf(1144);

  /**
   * Value is 1085 (0x43D)
   */
  public static final Integer wdYiddish = Integer.valueOf(1085);

  /**
   * Value is 1130 (0x46A)
   */
  public static final Integer wdYoruba = Integer.valueOf(1130);

  /**
   * Value is 1077 (0x435)
   */
  public static final Integer wdZulu = Integer.valueOf(1077);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdLanguageNone", wdLanguageNone);
    v.put("wdNoProofing", wdNoProofing);
    v.put("wdAfrikaans", wdAfrikaans);
    v.put("wdAlbanian", wdAlbanian);
    v.put("wdAmharic", wdAmharic);
    v.put("wdArabicAlgeria", wdArabicAlgeria);
    v.put("wdArabicBahrain", wdArabicBahrain);
    v.put("wdArabicEgypt", wdArabicEgypt);
    v.put("wdArabicIraq", wdArabicIraq);
    v.put("wdArabicJordan", wdArabicJordan);
    v.put("wdArabicKuwait", wdArabicKuwait);
    v.put("wdArabicLebanon", wdArabicLebanon);
    v.put("wdArabicLibya", wdArabicLibya);
    v.put("wdArabicMorocco", wdArabicMorocco);
    v.put("wdArabicOman", wdArabicOman);
    v.put("wdArabicQatar", wdArabicQatar);
    v.put("wdArabic", wdArabic);
    v.put("wdArabicSyria", wdArabicSyria);
    v.put("wdArabicTunisia", wdArabicTunisia);
    v.put("wdArabicUAE", wdArabicUAE);
    v.put("wdArabicYemen", wdArabicYemen);
    v.put("wdArmenian", wdArmenian);
    v.put("wdAssamese", wdAssamese);
    v.put("wdAzeriCyrillic", wdAzeriCyrillic);
    v.put("wdAzeriLatin", wdAzeriLatin);
    v.put("wdBasque", wdBasque);
    v.put("wdByelorussian", wdByelorussian);
    v.put("wdBengali", wdBengali);
    v.put("wdBulgarian", wdBulgarian);
    v.put("wdBurmese", wdBurmese);
    v.put("wdCatalan", wdCatalan);
    v.put("wdCherokee", wdCherokee);
    v.put("wdChineseHongKongSAR", wdChineseHongKongSAR);
    v.put("wdChineseMacaoSAR", wdChineseMacaoSAR);
    v.put("wdSimplifiedChinese", wdSimplifiedChinese);
    v.put("wdChineseSingapore", wdChineseSingapore);
    v.put("wdTraditionalChinese", wdTraditionalChinese);
    v.put("wdCroatian", wdCroatian);
    v.put("wdCzech", wdCzech);
    v.put("wdDanish", wdDanish);
    v.put("wdDivehi", wdDivehi);
    v.put("wdBelgianDutch", wdBelgianDutch);
    v.put("wdDutch", wdDutch);
    v.put("wdDzongkhaBhutan", wdDzongkhaBhutan);
    v.put("wdEdo", wdEdo);
    v.put("wdEnglishAUS", wdEnglishAUS);
    v.put("wdEnglishBelize", wdEnglishBelize);
    v.put("wdEnglishCanadian", wdEnglishCanadian);
    v.put("wdEnglishCaribbean", wdEnglishCaribbean);
    v.put("wdEnglishIreland", wdEnglishIreland);
    v.put("wdEnglishJamaica", wdEnglishJamaica);
    v.put("wdEnglishNewZealand", wdEnglishNewZealand);
    v.put("wdEnglishPhilippines", wdEnglishPhilippines);
    v.put("wdEnglishSouthAfrica", wdEnglishSouthAfrica);
    v.put("wdEnglishTrinidadTobago", wdEnglishTrinidadTobago);
    v.put("wdEnglishUK", wdEnglishUK);
    v.put("wdEnglishUS", wdEnglishUS);
    v.put("wdEnglishZimbabwe", wdEnglishZimbabwe);
    v.put("wdEnglishIndonesia", wdEnglishIndonesia);
    v.put("wdEstonian", wdEstonian);
    v.put("wdFaeroese", wdFaeroese);
    v.put("wdFarsi", wdFarsi);
    v.put("wdFilipino", wdFilipino);
    v.put("wdFinnish", wdFinnish);
    v.put("wdFulfulde", wdFulfulde);
    v.put("wdBelgianFrench", wdBelgianFrench);
    v.put("wdFrenchCameroon", wdFrenchCameroon);
    v.put("wdFrenchCanadian", wdFrenchCanadian);
    v.put("wdFrenchCotedIvoire", wdFrenchCotedIvoire);
    v.put("wdFrench", wdFrench);
    v.put("wdFrenchLuxembourg", wdFrenchLuxembourg);
    v.put("wdFrenchMali", wdFrenchMali);
    v.put("wdFrenchMonaco", wdFrenchMonaco);
    v.put("wdFrenchReunion", wdFrenchReunion);
    v.put("wdFrenchSenegal", wdFrenchSenegal);
    v.put("wdFrenchMorocco", wdFrenchMorocco);
    v.put("wdFrenchHaiti", wdFrenchHaiti);
    v.put("wdSwissFrench", wdSwissFrench);
    v.put("wdFrenchWestIndies", wdFrenchWestIndies);
    v.put("wdFrenchZaire", wdFrenchZaire);
    v.put("wdFrisianNetherlands", wdFrisianNetherlands);
    v.put("wdGaelicIreland", wdGaelicIreland);
    v.put("wdGaelicScotland", wdGaelicScotland);
    v.put("wdGalician", wdGalician);
    v.put("wdGeorgian", wdGeorgian);
    v.put("wdGermanAustria", wdGermanAustria);
    v.put("wdGerman", wdGerman);
    v.put("wdGermanLiechtenstein", wdGermanLiechtenstein);
    v.put("wdGermanLuxembourg", wdGermanLuxembourg);
    v.put("wdSwissGerman", wdSwissGerman);
    v.put("wdGreek", wdGreek);
    v.put("wdGuarani", wdGuarani);
    v.put("wdGujarati", wdGujarati);
    v.put("wdHausa", wdHausa);
    v.put("wdHawaiian", wdHawaiian);
    v.put("wdHebrew", wdHebrew);
    v.put("wdHindi", wdHindi);
    v.put("wdHungarian", wdHungarian);
    v.put("wdIbibio", wdIbibio);
    v.put("wdIcelandic", wdIcelandic);
    v.put("wdIgbo", wdIgbo);
    v.put("wdIndonesian", wdIndonesian);
    v.put("wdInuktitut", wdInuktitut);
    v.put("wdItalian", wdItalian);
    v.put("wdSwissItalian", wdSwissItalian);
    v.put("wdJapanese", wdJapanese);
    v.put("wdKannada", wdKannada);
    v.put("wdKanuri", wdKanuri);
    v.put("wdKashmiri", wdKashmiri);
    v.put("wdKazakh", wdKazakh);
    v.put("wdKhmer", wdKhmer);
    v.put("wdKirghiz", wdKirghiz);
    v.put("wdKonkani", wdKonkani);
    v.put("wdKorean", wdKorean);
    v.put("wdKyrgyz", wdKyrgyz);
    v.put("wdLao", wdLao);
    v.put("wdLatin", wdLatin);
    v.put("wdLatvian", wdLatvian);
    v.put("wdLithuanian", wdLithuanian);
    v.put("wdMacedonian", wdMacedonian);
    v.put("wdMalaysian", wdMalaysian);
    v.put("wdMalayBruneiDarussalam", wdMalayBruneiDarussalam);
    v.put("wdMalayalam", wdMalayalam);
    v.put("wdMaltese", wdMaltese);
    v.put("wdManipuri", wdManipuri);
    v.put("wdMarathi", wdMarathi);
    v.put("wdMongolian", wdMongolian);
    v.put("wdNepali", wdNepali);
    v.put("wdNorwegianBokmol", wdNorwegianBokmol);
    v.put("wdNorwegianNynorsk", wdNorwegianNynorsk);
    v.put("wdOriya", wdOriya);
    v.put("wdOromo", wdOromo);
    v.put("wdPashto", wdPashto);
    v.put("wdPolish", wdPolish);
    v.put("wdBrazilianPortuguese", wdBrazilianPortuguese);
    v.put("wdPortuguese", wdPortuguese);
    v.put("wdPunjabi", wdPunjabi);
    v.put("wdRhaetoRomanic", wdRhaetoRomanic);
    v.put("wdRomanianMoldova", wdRomanianMoldova);
    v.put("wdRomanian", wdRomanian);
    v.put("wdRussianMoldova", wdRussianMoldova);
    v.put("wdRussian", wdRussian);
    v.put("wdSamiLappish", wdSamiLappish);
    v.put("wdSanskrit", wdSanskrit);
    v.put("wdSerbianCyrillic", wdSerbianCyrillic);
    v.put("wdSerbianLatin", wdSerbianLatin);
    v.put("wdSinhalese", wdSinhalese);
    v.put("wdSindhi", wdSindhi);
    v.put("wdSindhiPakistan", wdSindhiPakistan);
    v.put("wdSlovak", wdSlovak);
    v.put("wdSlovenian", wdSlovenian);
    v.put("wdSomali", wdSomali);
    v.put("wdSorbian", wdSorbian);
    v.put("wdSpanishArgentina", wdSpanishArgentina);
    v.put("wdSpanishBolivia", wdSpanishBolivia);
    v.put("wdSpanishChile", wdSpanishChile);
    v.put("wdSpanishColombia", wdSpanishColombia);
    v.put("wdSpanishCostaRica", wdSpanishCostaRica);
    v.put("wdSpanishDominicanRepublic", wdSpanishDominicanRepublic);
    v.put("wdSpanishEcuador", wdSpanishEcuador);
    v.put("wdSpanishElSalvador", wdSpanishElSalvador);
    v.put("wdSpanishGuatemala", wdSpanishGuatemala);
    v.put("wdSpanishHonduras", wdSpanishHonduras);
    v.put("wdMexicanSpanish", wdMexicanSpanish);
    v.put("wdSpanishNicaragua", wdSpanishNicaragua);
    v.put("wdSpanishPanama", wdSpanishPanama);
    v.put("wdSpanishParaguay", wdSpanishParaguay);
    v.put("wdSpanishPeru", wdSpanishPeru);
    v.put("wdSpanishPuertoRico", wdSpanishPuertoRico);
    v.put("wdSpanishModernSort", wdSpanishModernSort);
    v.put("wdSpanish", wdSpanish);
    v.put("wdSpanishUruguay", wdSpanishUruguay);
    v.put("wdSpanishVenezuela", wdSpanishVenezuela);
    v.put("wdSesotho", wdSesotho);
    v.put("wdSutu", wdSutu);
    v.put("wdSwahili", wdSwahili);
    v.put("wdSwedishFinland", wdSwedishFinland);
    v.put("wdSwedish", wdSwedish);
    v.put("wdSyriac", wdSyriac);
    v.put("wdTajik", wdTajik);
    v.put("wdTamazight", wdTamazight);
    v.put("wdTamazightLatin", wdTamazightLatin);
    v.put("wdTamil", wdTamil);
    v.put("wdTatar", wdTatar);
    v.put("wdTelugu", wdTelugu);
    v.put("wdThai", wdThai);
    v.put("wdTibetan", wdTibetan);
    v.put("wdTigrignaEthiopic", wdTigrignaEthiopic);
    v.put("wdTigrignaEritrea", wdTigrignaEritrea);
    v.put("wdTsonga", wdTsonga);
    v.put("wdTswana", wdTswana);
    v.put("wdTurkish", wdTurkish);
    v.put("wdTurkmen", wdTurkmen);
    v.put("wdUkrainian", wdUkrainian);
    v.put("wdUrdu", wdUrdu);
    v.put("wdUzbekCyrillic", wdUzbekCyrillic);
    v.put("wdUzbekLatin", wdUzbekLatin);
    v.put("wdVenda", wdVenda);
    v.put("wdVietnamese", wdVietnamese);
    v.put("wdWelsh", wdWelsh);
    v.put("wdXhosa", wdXhosa);
    v.put("wdYi", wdYi);
    v.put("wdYiddish", wdYiddish);
    v.put("wdYoruba", wdYoruba);
    v.put("wdZulu", wdZulu);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
