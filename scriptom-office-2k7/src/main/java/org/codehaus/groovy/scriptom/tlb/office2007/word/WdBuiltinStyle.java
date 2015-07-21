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
public final class WdBuiltinStyle
{
  private WdBuiltinStyle()
  {
  }

  /**
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer wdStyleNormal = Integer.valueOf(-1);

  /**
   * Value is -37 (0xFFFFFFDB)
   */
  public static final Integer wdStyleEnvelopeAddress = Integer.valueOf(-37);

  /**
   * Value is -38 (0xFFFFFFDA)
   */
  public static final Integer wdStyleEnvelopeReturn = Integer.valueOf(-38);

  /**
   * Value is -67 (0xFFFFFFBD)
   */
  public static final Integer wdStyleBodyText = Integer.valueOf(-67);

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer wdStyleHeading1 = Integer.valueOf(-2);

  /**
   * Value is -3 (0xFFFFFFFD)
   */
  public static final Integer wdStyleHeading2 = Integer.valueOf(-3);

  /**
   * Value is -4 (0xFFFFFFFC)
   */
  public static final Integer wdStyleHeading3 = Integer.valueOf(-4);

  /**
   * Value is -5 (0xFFFFFFFB)
   */
  public static final Integer wdStyleHeading4 = Integer.valueOf(-5);

  /**
   * Value is -6 (0xFFFFFFFA)
   */
  public static final Integer wdStyleHeading5 = Integer.valueOf(-6);

  /**
   * Value is -7 (0xFFFFFFF9)
   */
  public static final Integer wdStyleHeading6 = Integer.valueOf(-7);

  /**
   * Value is -8 (0xFFFFFFF8)
   */
  public static final Integer wdStyleHeading7 = Integer.valueOf(-8);

  /**
   * Value is -9 (0xFFFFFFF7)
   */
  public static final Integer wdStyleHeading8 = Integer.valueOf(-9);

  /**
   * Value is -10 (0xFFFFFFF6)
   */
  public static final Integer wdStyleHeading9 = Integer.valueOf(-10);

  /**
   * Value is -11 (0xFFFFFFF5)
   */
  public static final Integer wdStyleIndex1 = Integer.valueOf(-11);

  /**
   * Value is -12 (0xFFFFFFF4)
   */
  public static final Integer wdStyleIndex2 = Integer.valueOf(-12);

  /**
   * Value is -13 (0xFFFFFFF3)
   */
  public static final Integer wdStyleIndex3 = Integer.valueOf(-13);

  /**
   * Value is -14 (0xFFFFFFF2)
   */
  public static final Integer wdStyleIndex4 = Integer.valueOf(-14);

  /**
   * Value is -15 (0xFFFFFFF1)
   */
  public static final Integer wdStyleIndex5 = Integer.valueOf(-15);

  /**
   * Value is -16 (0xFFFFFFF0)
   */
  public static final Integer wdStyleIndex6 = Integer.valueOf(-16);

  /**
   * Value is -17 (0xFFFFFFEF)
   */
  public static final Integer wdStyleIndex7 = Integer.valueOf(-17);

  /**
   * Value is -18 (0xFFFFFFEE)
   */
  public static final Integer wdStyleIndex8 = Integer.valueOf(-18);

  /**
   * Value is -19 (0xFFFFFFED)
   */
  public static final Integer wdStyleIndex9 = Integer.valueOf(-19);

  /**
   * Value is -20 (0xFFFFFFEC)
   */
  public static final Integer wdStyleTOC1 = Integer.valueOf(-20);

  /**
   * Value is -21 (0xFFFFFFEB)
   */
  public static final Integer wdStyleTOC2 = Integer.valueOf(-21);

  /**
   * Value is -22 (0xFFFFFFEA)
   */
  public static final Integer wdStyleTOC3 = Integer.valueOf(-22);

  /**
   * Value is -23 (0xFFFFFFE9)
   */
  public static final Integer wdStyleTOC4 = Integer.valueOf(-23);

  /**
   * Value is -24 (0xFFFFFFE8)
   */
  public static final Integer wdStyleTOC5 = Integer.valueOf(-24);

  /**
   * Value is -25 (0xFFFFFFE7)
   */
  public static final Integer wdStyleTOC6 = Integer.valueOf(-25);

  /**
   * Value is -26 (0xFFFFFFE6)
   */
  public static final Integer wdStyleTOC7 = Integer.valueOf(-26);

  /**
   * Value is -27 (0xFFFFFFE5)
   */
  public static final Integer wdStyleTOC8 = Integer.valueOf(-27);

  /**
   * Value is -28 (0xFFFFFFE4)
   */
  public static final Integer wdStyleTOC9 = Integer.valueOf(-28);

  /**
   * Value is -29 (0xFFFFFFE3)
   */
  public static final Integer wdStyleNormalIndent = Integer.valueOf(-29);

  /**
   * Value is -30 (0xFFFFFFE2)
   */
  public static final Integer wdStyleFootnoteText = Integer.valueOf(-30);

  /**
   * Value is -31 (0xFFFFFFE1)
   */
  public static final Integer wdStyleCommentText = Integer.valueOf(-31);

  /**
   * Value is -32 (0xFFFFFFE0)
   */
  public static final Integer wdStyleHeader = Integer.valueOf(-32);

  /**
   * Value is -33 (0xFFFFFFDF)
   */
  public static final Integer wdStyleFooter = Integer.valueOf(-33);

  /**
   * Value is -34 (0xFFFFFFDE)
   */
  public static final Integer wdStyleIndexHeading = Integer.valueOf(-34);

  /**
   * Value is -35 (0xFFFFFFDD)
   */
  public static final Integer wdStyleCaption = Integer.valueOf(-35);

  /**
   * Value is -36 (0xFFFFFFDC)
   */
  public static final Integer wdStyleTableOfFigures = Integer.valueOf(-36);

  /**
   * Value is -39 (0xFFFFFFD9)
   */
  public static final Integer wdStyleFootnoteReference = Integer.valueOf(-39);

  /**
   * Value is -40 (0xFFFFFFD8)
   */
  public static final Integer wdStyleCommentReference = Integer.valueOf(-40);

  /**
   * Value is -41 (0xFFFFFFD7)
   */
  public static final Integer wdStyleLineNumber = Integer.valueOf(-41);

  /**
   * Value is -42 (0xFFFFFFD6)
   */
  public static final Integer wdStylePageNumber = Integer.valueOf(-42);

  /**
   * Value is -43 (0xFFFFFFD5)
   */
  public static final Integer wdStyleEndnoteReference = Integer.valueOf(-43);

  /**
   * Value is -44 (0xFFFFFFD4)
   */
  public static final Integer wdStyleEndnoteText = Integer.valueOf(-44);

  /**
   * Value is -45 (0xFFFFFFD3)
   */
  public static final Integer wdStyleTableOfAuthorities = Integer.valueOf(-45);

  /**
   * Value is -46 (0xFFFFFFD2)
   */
  public static final Integer wdStyleMacroText = Integer.valueOf(-46);

  /**
   * Value is -47 (0xFFFFFFD1)
   */
  public static final Integer wdStyleTOAHeading = Integer.valueOf(-47);

  /**
   * Value is -48 (0xFFFFFFD0)
   */
  public static final Integer wdStyleList = Integer.valueOf(-48);

  /**
   * Value is -49 (0xFFFFFFCF)
   */
  public static final Integer wdStyleListBullet = Integer.valueOf(-49);

  /**
   * Value is -50 (0xFFFFFFCE)
   */
  public static final Integer wdStyleListNumber = Integer.valueOf(-50);

  /**
   * Value is -51 (0xFFFFFFCD)
   */
  public static final Integer wdStyleList2 = Integer.valueOf(-51);

  /**
   * Value is -52 (0xFFFFFFCC)
   */
  public static final Integer wdStyleList3 = Integer.valueOf(-52);

  /**
   * Value is -53 (0xFFFFFFCB)
   */
  public static final Integer wdStyleList4 = Integer.valueOf(-53);

  /**
   * Value is -54 (0xFFFFFFCA)
   */
  public static final Integer wdStyleList5 = Integer.valueOf(-54);

  /**
   * Value is -55 (0xFFFFFFC9)
   */
  public static final Integer wdStyleListBullet2 = Integer.valueOf(-55);

  /**
   * Value is -56 (0xFFFFFFC8)
   */
  public static final Integer wdStyleListBullet3 = Integer.valueOf(-56);

  /**
   * Value is -57 (0xFFFFFFC7)
   */
  public static final Integer wdStyleListBullet4 = Integer.valueOf(-57);

  /**
   * Value is -58 (0xFFFFFFC6)
   */
  public static final Integer wdStyleListBullet5 = Integer.valueOf(-58);

  /**
   * Value is -59 (0xFFFFFFC5)
   */
  public static final Integer wdStyleListNumber2 = Integer.valueOf(-59);

  /**
   * Value is -60 (0xFFFFFFC4)
   */
  public static final Integer wdStyleListNumber3 = Integer.valueOf(-60);

  /**
   * Value is -61 (0xFFFFFFC3)
   */
  public static final Integer wdStyleListNumber4 = Integer.valueOf(-61);

  /**
   * Value is -62 (0xFFFFFFC2)
   */
  public static final Integer wdStyleListNumber5 = Integer.valueOf(-62);

  /**
   * Value is -63 (0xFFFFFFC1)
   */
  public static final Integer wdStyleTitle = Integer.valueOf(-63);

  /**
   * Value is -64 (0xFFFFFFC0)
   */
  public static final Integer wdStyleClosing = Integer.valueOf(-64);

  /**
   * Value is -65 (0xFFFFFFBF)
   */
  public static final Integer wdStyleSignature = Integer.valueOf(-65);

  /**
   * Value is -66 (0xFFFFFFBE)
   */
  public static final Integer wdStyleDefaultParagraphFont = Integer.valueOf(-66);

  /**
   * Value is -68 (0xFFFFFFBC)
   */
  public static final Integer wdStyleBodyTextIndent = Integer.valueOf(-68);

  /**
   * Value is -69 (0xFFFFFFBB)
   */
  public static final Integer wdStyleListContinue = Integer.valueOf(-69);

  /**
   * Value is -70 (0xFFFFFFBA)
   */
  public static final Integer wdStyleListContinue2 = Integer.valueOf(-70);

  /**
   * Value is -71 (0xFFFFFFB9)
   */
  public static final Integer wdStyleListContinue3 = Integer.valueOf(-71);

  /**
   * Value is -72 (0xFFFFFFB8)
   */
  public static final Integer wdStyleListContinue4 = Integer.valueOf(-72);

  /**
   * Value is -73 (0xFFFFFFB7)
   */
  public static final Integer wdStyleListContinue5 = Integer.valueOf(-73);

  /**
   * Value is -74 (0xFFFFFFB6)
   */
  public static final Integer wdStyleMessageHeader = Integer.valueOf(-74);

  /**
   * Value is -75 (0xFFFFFFB5)
   */
  public static final Integer wdStyleSubtitle = Integer.valueOf(-75);

  /**
   * Value is -76 (0xFFFFFFB4)
   */
  public static final Integer wdStyleSalutation = Integer.valueOf(-76);

  /**
   * Value is -77 (0xFFFFFFB3)
   */
  public static final Integer wdStyleDate = Integer.valueOf(-77);

  /**
   * Value is -78 (0xFFFFFFB2)
   */
  public static final Integer wdStyleBodyTextFirstIndent = Integer.valueOf(-78);

  /**
   * Value is -79 (0xFFFFFFB1)
   */
  public static final Integer wdStyleBodyTextFirstIndent2 = Integer.valueOf(-79);

  /**
   * Value is -80 (0xFFFFFFB0)
   */
  public static final Integer wdStyleNoteHeading = Integer.valueOf(-80);

  /**
   * Value is -81 (0xFFFFFFAF)
   */
  public static final Integer wdStyleBodyText2 = Integer.valueOf(-81);

  /**
   * Value is -82 (0xFFFFFFAE)
   */
  public static final Integer wdStyleBodyText3 = Integer.valueOf(-82);

  /**
   * Value is -83 (0xFFFFFFAD)
   */
  public static final Integer wdStyleBodyTextIndent2 = Integer.valueOf(-83);

  /**
   * Value is -84 (0xFFFFFFAC)
   */
  public static final Integer wdStyleBodyTextIndent3 = Integer.valueOf(-84);

  /**
   * Value is -85 (0xFFFFFFAB)
   */
  public static final Integer wdStyleBlockQuotation = Integer.valueOf(-85);

  /**
   * Value is -86 (0xFFFFFFAA)
   */
  public static final Integer wdStyleHyperlink = Integer.valueOf(-86);

  /**
   * Value is -87 (0xFFFFFFA9)
   */
  public static final Integer wdStyleHyperlinkFollowed = Integer.valueOf(-87);

  /**
   * Value is -88 (0xFFFFFFA8)
   */
  public static final Integer wdStyleStrong = Integer.valueOf(-88);

  /**
   * Value is -89 (0xFFFFFFA7)
   */
  public static final Integer wdStyleEmphasis = Integer.valueOf(-89);

  /**
   * Value is -90 (0xFFFFFFA6)
   */
  public static final Integer wdStyleNavPane = Integer.valueOf(-90);

  /**
   * Value is -91 (0xFFFFFFA5)
   */
  public static final Integer wdStylePlainText = Integer.valueOf(-91);

  /**
   * Value is -95 (0xFFFFFFA1)
   */
  public static final Integer wdStyleHtmlNormal = Integer.valueOf(-95);

  /**
   * Value is -96 (0xFFFFFFA0)
   */
  public static final Integer wdStyleHtmlAcronym = Integer.valueOf(-96);

  /**
   * Value is -97 (0xFFFFFF9F)
   */
  public static final Integer wdStyleHtmlAddress = Integer.valueOf(-97);

  /**
   * Value is -98 (0xFFFFFF9E)
   */
  public static final Integer wdStyleHtmlCite = Integer.valueOf(-98);

  /**
   * Value is -99 (0xFFFFFF9D)
   */
  public static final Integer wdStyleHtmlCode = Integer.valueOf(-99);

  /**
   * Value is -100 (0xFFFFFF9C)
   */
  public static final Integer wdStyleHtmlDfn = Integer.valueOf(-100);

  /**
   * Value is -101 (0xFFFFFF9B)
   */
  public static final Integer wdStyleHtmlKbd = Integer.valueOf(-101);

  /**
   * Value is -102 (0xFFFFFF9A)
   */
  public static final Integer wdStyleHtmlPre = Integer.valueOf(-102);

  /**
   * Value is -103 (0xFFFFFF99)
   */
  public static final Integer wdStyleHtmlSamp = Integer.valueOf(-103);

  /**
   * Value is -104 (0xFFFFFF98)
   */
  public static final Integer wdStyleHtmlTt = Integer.valueOf(-104);

  /**
   * Value is -105 (0xFFFFFF97)
   */
  public static final Integer wdStyleHtmlVar = Integer.valueOf(-105);

  /**
   * Value is -106 (0xFFFFFF96)
   */
  public static final Integer wdStyleNormalTable = Integer.valueOf(-106);

  /**
   * Value is -158 (0xFFFFFF62)
   */
  public static final Integer wdStyleNormalObject = Integer.valueOf(-158);

  /**
   * Value is -159 (0xFFFFFF61)
   */
  public static final Integer wdStyleTableLightShading = Integer.valueOf(-159);

  /**
   * Value is -160 (0xFFFFFF60)
   */
  public static final Integer wdStyleTableLightList = Integer.valueOf(-160);

  /**
   * Value is -161 (0xFFFFFF5F)
   */
  public static final Integer wdStyleTableLightGrid = Integer.valueOf(-161);

  /**
   * Value is -162 (0xFFFFFF5E)
   */
  public static final Integer wdStyleTableMediumShading1 = Integer.valueOf(-162);

  /**
   * Value is -163 (0xFFFFFF5D)
   */
  public static final Integer wdStyleTableMediumShading2 = Integer.valueOf(-163);

  /**
   * Value is -164 (0xFFFFFF5C)
   */
  public static final Integer wdStyleTableMediumList1 = Integer.valueOf(-164);

  /**
   * Value is -165 (0xFFFFFF5B)
   */
  public static final Integer wdStyleTableMediumList2 = Integer.valueOf(-165);

  /**
   * Value is -166 (0xFFFFFF5A)
   */
  public static final Integer wdStyleTableMediumGrid1 = Integer.valueOf(-166);

  /**
   * Value is -167 (0xFFFFFF59)
   */
  public static final Integer wdStyleTableMediumGrid2 = Integer.valueOf(-167);

  /**
   * Value is -168 (0xFFFFFF58)
   */
  public static final Integer wdStyleTableMediumGrid3 = Integer.valueOf(-168);

  /**
   * Value is -169 (0xFFFFFF57)
   */
  public static final Integer wdStyleTableDarkList = Integer.valueOf(-169);

  /**
   * Value is -170 (0xFFFFFF56)
   */
  public static final Integer wdStyleTableColorfulShading = Integer.valueOf(-170);

  /**
   * Value is -171 (0xFFFFFF55)
   */
  public static final Integer wdStyleTableColorfulList = Integer.valueOf(-171);

  /**
   * Value is -172 (0xFFFFFF54)
   */
  public static final Integer wdStyleTableColorfulGrid = Integer.valueOf(-172);

  /**
   * Value is -173 (0xFFFFFF53)
   */
  public static final Integer wdStyleTableLightShadingAccent1 = Integer.valueOf(-173);

  /**
   * Value is -174 (0xFFFFFF52)
   */
  public static final Integer wdStyleTableLightListAccent1 = Integer.valueOf(-174);

  /**
   * Value is -175 (0xFFFFFF51)
   */
  public static final Integer wdStyleTableLightGridAccent1 = Integer.valueOf(-175);

  /**
   * Value is -176 (0xFFFFFF50)
   */
  public static final Integer wdStyleTableMediumShading1Accent1 = Integer.valueOf(-176);

  /**
   * Value is -177 (0xFFFFFF4F)
   */
  public static final Integer wdStyleTableMediumShading2Accent1 = Integer.valueOf(-177);

  /**
   * Value is -178 (0xFFFFFF4E)
   */
  public static final Integer wdStyleTableMediumList1Accent1 = Integer.valueOf(-178);

  /**
   * Value is -180 (0xFFFFFF4C)
   */
  public static final Integer wdStyleListParagraph = Integer.valueOf(-180);

  /**
   * Value is -181 (0xFFFFFF4B)
   */
  public static final Integer wdStyleQuote = Integer.valueOf(-181);

  /**
   * Value is -182 (0xFFFFFF4A)
   */
  public static final Integer wdStyleIntenseQuote = Integer.valueOf(-182);

  /**
   * Value is -261 (0xFFFFFEFB)
   */
  public static final Integer wdStyleSubtleEmphasis = Integer.valueOf(-261);

  /**
   * Value is -262 (0xFFFFFEFA)
   */
  public static final Integer wdStyleIntenseEmphasis = Integer.valueOf(-262);

  /**
   * Value is -263 (0xFFFFFEF9)
   */
  public static final Integer wdStyleSubtleReference = Integer.valueOf(-263);

  /**
   * Value is -264 (0xFFFFFEF8)
   */
  public static final Integer wdStyleIntenseReference = Integer.valueOf(-264);

  /**
   * Value is -265 (0xFFFFFEF7)
   */
  public static final Integer wdStyleBookTitle = Integer.valueOf(-265);

  /**
   * Value is -266 (0xFFFFFEF6)
   */
  public static final Integer wdStyleBibliography = Integer.valueOf(-266);

  /**
   * Value is -267 (0xFFFFFEF5)
   */
  public static final Integer wdStyleTocHeading = Integer.valueOf(-267);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdStyleNormal", wdStyleNormal);
    v.put("wdStyleEnvelopeAddress", wdStyleEnvelopeAddress);
    v.put("wdStyleEnvelopeReturn", wdStyleEnvelopeReturn);
    v.put("wdStyleBodyText", wdStyleBodyText);
    v.put("wdStyleHeading1", wdStyleHeading1);
    v.put("wdStyleHeading2", wdStyleHeading2);
    v.put("wdStyleHeading3", wdStyleHeading3);
    v.put("wdStyleHeading4", wdStyleHeading4);
    v.put("wdStyleHeading5", wdStyleHeading5);
    v.put("wdStyleHeading6", wdStyleHeading6);
    v.put("wdStyleHeading7", wdStyleHeading7);
    v.put("wdStyleHeading8", wdStyleHeading8);
    v.put("wdStyleHeading9", wdStyleHeading9);
    v.put("wdStyleIndex1", wdStyleIndex1);
    v.put("wdStyleIndex2", wdStyleIndex2);
    v.put("wdStyleIndex3", wdStyleIndex3);
    v.put("wdStyleIndex4", wdStyleIndex4);
    v.put("wdStyleIndex5", wdStyleIndex5);
    v.put("wdStyleIndex6", wdStyleIndex6);
    v.put("wdStyleIndex7", wdStyleIndex7);
    v.put("wdStyleIndex8", wdStyleIndex8);
    v.put("wdStyleIndex9", wdStyleIndex9);
    v.put("wdStyleTOC1", wdStyleTOC1);
    v.put("wdStyleTOC2", wdStyleTOC2);
    v.put("wdStyleTOC3", wdStyleTOC3);
    v.put("wdStyleTOC4", wdStyleTOC4);
    v.put("wdStyleTOC5", wdStyleTOC5);
    v.put("wdStyleTOC6", wdStyleTOC6);
    v.put("wdStyleTOC7", wdStyleTOC7);
    v.put("wdStyleTOC8", wdStyleTOC8);
    v.put("wdStyleTOC9", wdStyleTOC9);
    v.put("wdStyleNormalIndent", wdStyleNormalIndent);
    v.put("wdStyleFootnoteText", wdStyleFootnoteText);
    v.put("wdStyleCommentText", wdStyleCommentText);
    v.put("wdStyleHeader", wdStyleHeader);
    v.put("wdStyleFooter", wdStyleFooter);
    v.put("wdStyleIndexHeading", wdStyleIndexHeading);
    v.put("wdStyleCaption", wdStyleCaption);
    v.put("wdStyleTableOfFigures", wdStyleTableOfFigures);
    v.put("wdStyleFootnoteReference", wdStyleFootnoteReference);
    v.put("wdStyleCommentReference", wdStyleCommentReference);
    v.put("wdStyleLineNumber", wdStyleLineNumber);
    v.put("wdStylePageNumber", wdStylePageNumber);
    v.put("wdStyleEndnoteReference", wdStyleEndnoteReference);
    v.put("wdStyleEndnoteText", wdStyleEndnoteText);
    v.put("wdStyleTableOfAuthorities", wdStyleTableOfAuthorities);
    v.put("wdStyleMacroText", wdStyleMacroText);
    v.put("wdStyleTOAHeading", wdStyleTOAHeading);
    v.put("wdStyleList", wdStyleList);
    v.put("wdStyleListBullet", wdStyleListBullet);
    v.put("wdStyleListNumber", wdStyleListNumber);
    v.put("wdStyleList2", wdStyleList2);
    v.put("wdStyleList3", wdStyleList3);
    v.put("wdStyleList4", wdStyleList4);
    v.put("wdStyleList5", wdStyleList5);
    v.put("wdStyleListBullet2", wdStyleListBullet2);
    v.put("wdStyleListBullet3", wdStyleListBullet3);
    v.put("wdStyleListBullet4", wdStyleListBullet4);
    v.put("wdStyleListBullet5", wdStyleListBullet5);
    v.put("wdStyleListNumber2", wdStyleListNumber2);
    v.put("wdStyleListNumber3", wdStyleListNumber3);
    v.put("wdStyleListNumber4", wdStyleListNumber4);
    v.put("wdStyleListNumber5", wdStyleListNumber5);
    v.put("wdStyleTitle", wdStyleTitle);
    v.put("wdStyleClosing", wdStyleClosing);
    v.put("wdStyleSignature", wdStyleSignature);
    v.put("wdStyleDefaultParagraphFont", wdStyleDefaultParagraphFont);
    v.put("wdStyleBodyTextIndent", wdStyleBodyTextIndent);
    v.put("wdStyleListContinue", wdStyleListContinue);
    v.put("wdStyleListContinue2", wdStyleListContinue2);
    v.put("wdStyleListContinue3", wdStyleListContinue3);
    v.put("wdStyleListContinue4", wdStyleListContinue4);
    v.put("wdStyleListContinue5", wdStyleListContinue5);
    v.put("wdStyleMessageHeader", wdStyleMessageHeader);
    v.put("wdStyleSubtitle", wdStyleSubtitle);
    v.put("wdStyleSalutation", wdStyleSalutation);
    v.put("wdStyleDate", wdStyleDate);
    v.put("wdStyleBodyTextFirstIndent", wdStyleBodyTextFirstIndent);
    v.put("wdStyleBodyTextFirstIndent2", wdStyleBodyTextFirstIndent2);
    v.put("wdStyleNoteHeading", wdStyleNoteHeading);
    v.put("wdStyleBodyText2", wdStyleBodyText2);
    v.put("wdStyleBodyText3", wdStyleBodyText3);
    v.put("wdStyleBodyTextIndent2", wdStyleBodyTextIndent2);
    v.put("wdStyleBodyTextIndent3", wdStyleBodyTextIndent3);
    v.put("wdStyleBlockQuotation", wdStyleBlockQuotation);
    v.put("wdStyleHyperlink", wdStyleHyperlink);
    v.put("wdStyleHyperlinkFollowed", wdStyleHyperlinkFollowed);
    v.put("wdStyleStrong", wdStyleStrong);
    v.put("wdStyleEmphasis", wdStyleEmphasis);
    v.put("wdStyleNavPane", wdStyleNavPane);
    v.put("wdStylePlainText", wdStylePlainText);
    v.put("wdStyleHtmlNormal", wdStyleHtmlNormal);
    v.put("wdStyleHtmlAcronym", wdStyleHtmlAcronym);
    v.put("wdStyleHtmlAddress", wdStyleHtmlAddress);
    v.put("wdStyleHtmlCite", wdStyleHtmlCite);
    v.put("wdStyleHtmlCode", wdStyleHtmlCode);
    v.put("wdStyleHtmlDfn", wdStyleHtmlDfn);
    v.put("wdStyleHtmlKbd", wdStyleHtmlKbd);
    v.put("wdStyleHtmlPre", wdStyleHtmlPre);
    v.put("wdStyleHtmlSamp", wdStyleHtmlSamp);
    v.put("wdStyleHtmlTt", wdStyleHtmlTt);
    v.put("wdStyleHtmlVar", wdStyleHtmlVar);
    v.put("wdStyleNormalTable", wdStyleNormalTable);
    v.put("wdStyleNormalObject", wdStyleNormalObject);
    v.put("wdStyleTableLightShading", wdStyleTableLightShading);
    v.put("wdStyleTableLightList", wdStyleTableLightList);
    v.put("wdStyleTableLightGrid", wdStyleTableLightGrid);
    v.put("wdStyleTableMediumShading1", wdStyleTableMediumShading1);
    v.put("wdStyleTableMediumShading2", wdStyleTableMediumShading2);
    v.put("wdStyleTableMediumList1", wdStyleTableMediumList1);
    v.put("wdStyleTableMediumList2", wdStyleTableMediumList2);
    v.put("wdStyleTableMediumGrid1", wdStyleTableMediumGrid1);
    v.put("wdStyleTableMediumGrid2", wdStyleTableMediumGrid2);
    v.put("wdStyleTableMediumGrid3", wdStyleTableMediumGrid3);
    v.put("wdStyleTableDarkList", wdStyleTableDarkList);
    v.put("wdStyleTableColorfulShading", wdStyleTableColorfulShading);
    v.put("wdStyleTableColorfulList", wdStyleTableColorfulList);
    v.put("wdStyleTableColorfulGrid", wdStyleTableColorfulGrid);
    v.put("wdStyleTableLightShadingAccent1", wdStyleTableLightShadingAccent1);
    v.put("wdStyleTableLightListAccent1", wdStyleTableLightListAccent1);
    v.put("wdStyleTableLightGridAccent1", wdStyleTableLightGridAccent1);
    v.put("wdStyleTableMediumShading1Accent1", wdStyleTableMediumShading1Accent1);
    v.put("wdStyleTableMediumShading2Accent1", wdStyleTableMediumShading2Accent1);
    v.put("wdStyleTableMediumList1Accent1", wdStyleTableMediumList1Accent1);
    v.put("wdStyleListParagraph", wdStyleListParagraph);
    v.put("wdStyleQuote", wdStyleQuote);
    v.put("wdStyleIntenseQuote", wdStyleIntenseQuote);
    v.put("wdStyleSubtleEmphasis", wdStyleSubtleEmphasis);
    v.put("wdStyleIntenseEmphasis", wdStyleIntenseEmphasis);
    v.put("wdStyleSubtleReference", wdStyleSubtleReference);
    v.put("wdStyleIntenseReference", wdStyleIntenseReference);
    v.put("wdStyleBookTitle", wdStyleBookTitle);
    v.put("wdStyleBibliography", wdStyleBibliography);
    v.put("wdStyleTocHeading", wdStyleTocHeading);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
