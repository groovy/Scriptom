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
public final class WdWordDialogTab
{
  private WdWordDialogTab()
  {
  }

  /**
   * Value is 204 (0xCC)
   */
  public static final Integer wdDialogToolsOptionsTabView = Integer.valueOf(204);

  /**
   * Value is 203 (0xCB)
   */
  public static final Integer wdDialogToolsOptionsTabGeneral = Integer.valueOf(203);

  /**
   * Value is 224 (0xE0)
   */
  public static final Integer wdDialogToolsOptionsTabEdit = Integer.valueOf(224);

  /**
   * Value is 208 (0xD0)
   */
  public static final Integer wdDialogToolsOptionsTabPrint = Integer.valueOf(208);

  /**
   * Value is 209 (0xD1)
   */
  public static final Integer wdDialogToolsOptionsTabSave = Integer.valueOf(209);

  /**
   * Value is 211 (0xD3)
   */
  public static final Integer wdDialogToolsOptionsTabProofread = Integer.valueOf(211);

  /**
   * Value is 386 (0x182)
   */
  public static final Integer wdDialogToolsOptionsTabTrackChanges = Integer.valueOf(386);

  /**
   * Value is 213 (0xD5)
   */
  public static final Integer wdDialogToolsOptionsTabUserInfo = Integer.valueOf(213);

  /**
   * Value is 525 (0x20D)
   */
  public static final Integer wdDialogToolsOptionsTabCompatibility = Integer.valueOf(525);

  /**
   * Value is 739 (0x2E3)
   */
  public static final Integer wdDialogToolsOptionsTabTypography = Integer.valueOf(739);

  /**
   * Value is 225 (0xE1)
   */
  public static final Integer wdDialogToolsOptionsTabFileLocations = Integer.valueOf(225);

  /**
   * Value is 790 (0x316)
   */
  public static final Integer wdDialogToolsOptionsTabFuzzy = Integer.valueOf(790);

  /**
   * Value is 786 (0x312)
   */
  public static final Integer wdDialogToolsOptionsTabHangulHanjaConversion = Integer.valueOf(786);

  /**
   * Value is 1029 (0x405)
   */
  public static final Integer wdDialogToolsOptionsTabBidi = Integer.valueOf(1029);

  /**
   * Value is 1361 (0x551)
   */
  public static final Integer wdDialogToolsOptionsTabSecurity = Integer.valueOf(1361);

  /**
   * Value is 150000 (0x249F0)
   */
  public static final Integer wdDialogFilePageSetupTabMargins = Integer.valueOf(150000);

  /**
   * Value is 150001 (0x249F1)
   */
  public static final Integer wdDialogFilePageSetupTabPaper = Integer.valueOf(150001);

  /**
   * Value is 150003 (0x249F3)
   */
  public static final Integer wdDialogFilePageSetupTabLayout = Integer.valueOf(150003);

  /**
   * Value is 150004 (0x249F4)
   */
  public static final Integer wdDialogFilePageSetupTabCharsLines = Integer.valueOf(150004);

  /**
   * Value is 200000 (0x30D40)
   */
  public static final Integer wdDialogInsertSymbolTabSymbols = Integer.valueOf(200000);

  /**
   * Value is 200001 (0x30D41)
   */
  public static final Integer wdDialogInsertSymbolTabSpecialCharacters = Integer.valueOf(200001);

  /**
   * Value is 300000 (0x493E0)
   */
  public static final Integer wdDialogNoteOptionsTabAllFootnotes = Integer.valueOf(300000);

  /**
   * Value is 300001 (0x493E1)
   */
  public static final Integer wdDialogNoteOptionsTabAllEndnotes = Integer.valueOf(300001);

  /**
   * Value is 400000 (0x61A80)
   */
  public static final Integer wdDialogInsertIndexAndTablesTabIndex = Integer.valueOf(400000);

  /**
   * Value is 400001 (0x61A81)
   */
  public static final Integer wdDialogInsertIndexAndTablesTabTableOfContents = Integer.valueOf(400001);

  /**
   * Value is 400002 (0x61A82)
   */
  public static final Integer wdDialogInsertIndexAndTablesTabTableOfFigures = Integer.valueOf(400002);

  /**
   * Value is 400003 (0x61A83)
   */
  public static final Integer wdDialogInsertIndexAndTablesTabTableOfAuthorities = Integer.valueOf(400003);

  /**
   * Value is 500000 (0x7A120)
   */
  public static final Integer wdDialogOrganizerTabStyles = Integer.valueOf(500000);

  /**
   * Value is 500001 (0x7A121)
   */
  public static final Integer wdDialogOrganizerTabAutoText = Integer.valueOf(500001);

  /**
   * Value is 500002 (0x7A122)
   */
  public static final Integer wdDialogOrganizerTabCommandBars = Integer.valueOf(500002);

  /**
   * Value is 500003 (0x7A123)
   */
  public static final Integer wdDialogOrganizerTabMacros = Integer.valueOf(500003);

  /**
   * Value is 600000 (0x927C0)
   */
  public static final Integer wdDialogFormatFontTabFont = Integer.valueOf(600000);

  /**
   * Value is 600001 (0x927C1)
   */
  public static final Integer wdDialogFormatFontTabCharacterSpacing = Integer.valueOf(600001);

  /**
   * Value is 600002 (0x927C2)
   */
  public static final Integer wdDialogFormatFontTabAnimation = Integer.valueOf(600002);

  /**
   * Value is 700000 (0xAAE60)
   */
  public static final Integer wdDialogFormatBordersAndShadingTabBorders = Integer.valueOf(700000);

  /**
   * Value is 700001 (0xAAE61)
   */
  public static final Integer wdDialogFormatBordersAndShadingTabPageBorder = Integer.valueOf(700001);

  /**
   * Value is 700002 (0xAAE62)
   */
  public static final Integer wdDialogFormatBordersAndShadingTabShading = Integer.valueOf(700002);

  /**
   * Value is 800000 (0xC3500)
   */
  public static final Integer wdDialogToolsEnvelopesAndLabelsTabEnvelopes = Integer.valueOf(800000);

  /**
   * Value is 800001 (0xC3501)
   */
  public static final Integer wdDialogToolsEnvelopesAndLabelsTabLabels = Integer.valueOf(800001);

  /**
   * Value is 1000000 (0xF4240)
   */
  public static final Integer wdDialogFormatParagraphTabIndentsAndSpacing = Integer.valueOf(1000000);

  /**
   * Value is 1000001 (0xF4241)
   */
  public static final Integer wdDialogFormatParagraphTabTextFlow = Integer.valueOf(1000001);

  /**
   * Value is 1000002 (0xF4242)
   */
  public static final Integer wdDialogFormatParagraphTabTeisai = Integer.valueOf(1000002);

  /**
   * Value is 1200000 (0x124F80)
   */
  public static final Integer wdDialogFormatDrawingObjectTabColorsAndLines = Integer.valueOf(1200000);

  /**
   * Value is 1200001 (0x124F81)
   */
  public static final Integer wdDialogFormatDrawingObjectTabSize = Integer.valueOf(1200001);

  /**
   * Value is 1200002 (0x124F82)
   */
  public static final Integer wdDialogFormatDrawingObjectTabPosition = Integer.valueOf(1200002);

  /**
   * Value is 1200003 (0x124F83)
   */
  public static final Integer wdDialogFormatDrawingObjectTabWrapping = Integer.valueOf(1200003);

  /**
   * Value is 1200004 (0x124F84)
   */
  public static final Integer wdDialogFormatDrawingObjectTabPicture = Integer.valueOf(1200004);

  /**
   * Value is 1200005 (0x124F85)
   */
  public static final Integer wdDialogFormatDrawingObjectTabTextbox = Integer.valueOf(1200005);

  /**
   * Value is 1200006 (0x124F86)
   */
  public static final Integer wdDialogFormatDrawingObjectTabWeb = Integer.valueOf(1200006);

  /**
   * Value is 1200007 (0x124F87)
   */
  public static final Integer wdDialogFormatDrawingObjectTabHR = Integer.valueOf(1200007);

  /**
   * Value is 1400000 (0x155CC0)
   */
  public static final Integer wdDialogToolsAutoCorrectExceptionsTabFirstLetter = Integer.valueOf(1400000);

  /**
   * Value is 1400001 (0x155CC1)
   */
  public static final Integer wdDialogToolsAutoCorrectExceptionsTabInitialCaps = Integer.valueOf(1400001);

  /**
   * Value is 1400002 (0x155CC2)
   */
  public static final Integer wdDialogToolsAutoCorrectExceptionsTabHangulAndAlphabet = Integer.valueOf(1400002);

  /**
   * Value is 1400003 (0x155CC3)
   */
  public static final Integer wdDialogToolsAutoCorrectExceptionsTabIac = Integer.valueOf(1400003);

  /**
   * Value is 1500000 (0x16E360)
   */
  public static final Integer wdDialogFormatBulletsAndNumberingTabBulleted = Integer.valueOf(1500000);

  /**
   * Value is 1500001 (0x16E361)
   */
  public static final Integer wdDialogFormatBulletsAndNumberingTabNumbered = Integer.valueOf(1500001);

  /**
   * Value is 1500002 (0x16E362)
   */
  public static final Integer wdDialogFormatBulletsAndNumberingTabOutlineNumbered = Integer.valueOf(1500002);

  /**
   * Value is 1600000 (0x186A00)
   */
  public static final Integer wdDialogLetterWizardTabLetterFormat = Integer.valueOf(1600000);

  /**
   * Value is 1600001 (0x186A01)
   */
  public static final Integer wdDialogLetterWizardTabRecipientInfo = Integer.valueOf(1600001);

  /**
   * Value is 1600002 (0x186A02)
   */
  public static final Integer wdDialogLetterWizardTabOtherElements = Integer.valueOf(1600002);

  /**
   * Value is 1600003 (0x186A03)
   */
  public static final Integer wdDialogLetterWizardTabSenderInfo = Integer.valueOf(1600003);

  /**
   * Value is 1700000 (0x19F0A0)
   */
  public static final Integer wdDialogToolsAutoManagerTabAutoCorrect = Integer.valueOf(1700000);

  /**
   * Value is 1700001 (0x19F0A1)
   */
  public static final Integer wdDialogToolsAutoManagerTabAutoFormatAsYouType = Integer.valueOf(1700001);

  /**
   * Value is 1700002 (0x19F0A2)
   */
  public static final Integer wdDialogToolsAutoManagerTabAutoText = Integer.valueOf(1700002);

  /**
   * Value is 1700003 (0x19F0A3)
   */
  public static final Integer wdDialogToolsAutoManagerTabAutoFormat = Integer.valueOf(1700003);

  /**
   * Value is 1700004 (0x19F0A4)
   */
  public static final Integer wdDialogToolsAutoManagerTabSmartTags = Integer.valueOf(1700004);

  /**
   * Value is 1800000 (0x1B7740)
   */
  public static final Integer wdDialogTablePropertiesTabTable = Integer.valueOf(1800000);

  /**
   * Value is 1800001 (0x1B7741)
   */
  public static final Integer wdDialogTablePropertiesTabRow = Integer.valueOf(1800001);

  /**
   * Value is 1800002 (0x1B7742)
   */
  public static final Integer wdDialogTablePropertiesTabColumn = Integer.valueOf(1800002);

  /**
   * Value is 1800003 (0x1B7743)
   */
  public static final Integer wdDialogTablePropertiesTabCell = Integer.valueOf(1800003);

  /**
   * Value is 1900000 (0x1CFDE0)
   */
  public static final Integer wdDialogEmailOptionsTabSignature = Integer.valueOf(1900000);

  /**
   * Value is 1900001 (0x1CFDE1)
   */
  public static final Integer wdDialogEmailOptionsTabStationary = Integer.valueOf(1900001);

  /**
   * Value is 1900002 (0x1CFDE2)
   */
  public static final Integer wdDialogEmailOptionsTabQuoting = Integer.valueOf(1900002);

  /**
   * Value is 2000000 (0x1E8480)
   */
  public static final Integer wdDialogWebOptionsBrowsers = Integer.valueOf(2000000);

  /**
   * Value is 2000000 (0x1E8480)
   */
  public static final Integer wdDialogWebOptionsGeneral = Integer.valueOf(2000000);

  /**
   * Value is 2000001 (0x1E8481)
   */
  public static final Integer wdDialogWebOptionsFiles = Integer.valueOf(2000001);

  /**
   * Value is 2000002 (0x1E8482)
   */
  public static final Integer wdDialogWebOptionsPictures = Integer.valueOf(2000002);

  /**
   * Value is 2000003 (0x1E8483)
   */
  public static final Integer wdDialogWebOptionsEncoding = Integer.valueOf(2000003);

  /**
   * Value is 2000004 (0x1E8484)
   */
  public static final Integer wdDialogWebOptionsFonts = Integer.valueOf(2000004);

  /**
   * Value is 1266 (0x4F2)
   */
  public static final Integer wdDialogToolsOptionsTabAcetate = Integer.valueOf(1266);

  /**
   * Value is 2100000 (0x200B20)
   */
  public static final Integer wdDialogTemplates = Integer.valueOf(2100000);

  /**
   * Value is 2100001 (0x200B21)
   */
  public static final Integer wdDialogTemplatesXMLSchema = Integer.valueOf(2100001);

  /**
   * Value is 2100002 (0x200B22)
   */
  public static final Integer wdDialogTemplatesXMLExpansionPacks = Integer.valueOf(2100002);

  /**
   * Value is 2100003 (0x200B23)
   */
  public static final Integer wdDialogTemplatesLinkedCSS = Integer.valueOf(2100003);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdDialogToolsOptionsTabView", wdDialogToolsOptionsTabView);
    v.put("wdDialogToolsOptionsTabGeneral", wdDialogToolsOptionsTabGeneral);
    v.put("wdDialogToolsOptionsTabEdit", wdDialogToolsOptionsTabEdit);
    v.put("wdDialogToolsOptionsTabPrint", wdDialogToolsOptionsTabPrint);
    v.put("wdDialogToolsOptionsTabSave", wdDialogToolsOptionsTabSave);
    v.put("wdDialogToolsOptionsTabProofread", wdDialogToolsOptionsTabProofread);
    v.put("wdDialogToolsOptionsTabTrackChanges", wdDialogToolsOptionsTabTrackChanges);
    v.put("wdDialogToolsOptionsTabUserInfo", wdDialogToolsOptionsTabUserInfo);
    v.put("wdDialogToolsOptionsTabCompatibility", wdDialogToolsOptionsTabCompatibility);
    v.put("wdDialogToolsOptionsTabTypography", wdDialogToolsOptionsTabTypography);
    v.put("wdDialogToolsOptionsTabFileLocations", wdDialogToolsOptionsTabFileLocations);
    v.put("wdDialogToolsOptionsTabFuzzy", wdDialogToolsOptionsTabFuzzy);
    v.put("wdDialogToolsOptionsTabHangulHanjaConversion", wdDialogToolsOptionsTabHangulHanjaConversion);
    v.put("wdDialogToolsOptionsTabBidi", wdDialogToolsOptionsTabBidi);
    v.put("wdDialogToolsOptionsTabSecurity", wdDialogToolsOptionsTabSecurity);
    v.put("wdDialogFilePageSetupTabMargins", wdDialogFilePageSetupTabMargins);
    v.put("wdDialogFilePageSetupTabPaper", wdDialogFilePageSetupTabPaper);
    v.put("wdDialogFilePageSetupTabLayout", wdDialogFilePageSetupTabLayout);
    v.put("wdDialogFilePageSetupTabCharsLines", wdDialogFilePageSetupTabCharsLines);
    v.put("wdDialogInsertSymbolTabSymbols", wdDialogInsertSymbolTabSymbols);
    v.put("wdDialogInsertSymbolTabSpecialCharacters", wdDialogInsertSymbolTabSpecialCharacters);
    v.put("wdDialogNoteOptionsTabAllFootnotes", wdDialogNoteOptionsTabAllFootnotes);
    v.put("wdDialogNoteOptionsTabAllEndnotes", wdDialogNoteOptionsTabAllEndnotes);
    v.put("wdDialogInsertIndexAndTablesTabIndex", wdDialogInsertIndexAndTablesTabIndex);
    v.put("wdDialogInsertIndexAndTablesTabTableOfContents", wdDialogInsertIndexAndTablesTabTableOfContents);
    v.put("wdDialogInsertIndexAndTablesTabTableOfFigures", wdDialogInsertIndexAndTablesTabTableOfFigures);
    v.put("wdDialogInsertIndexAndTablesTabTableOfAuthorities", wdDialogInsertIndexAndTablesTabTableOfAuthorities);
    v.put("wdDialogOrganizerTabStyles", wdDialogOrganizerTabStyles);
    v.put("wdDialogOrganizerTabAutoText", wdDialogOrganizerTabAutoText);
    v.put("wdDialogOrganizerTabCommandBars", wdDialogOrganizerTabCommandBars);
    v.put("wdDialogOrganizerTabMacros", wdDialogOrganizerTabMacros);
    v.put("wdDialogFormatFontTabFont", wdDialogFormatFontTabFont);
    v.put("wdDialogFormatFontTabCharacterSpacing", wdDialogFormatFontTabCharacterSpacing);
    v.put("wdDialogFormatFontTabAnimation", wdDialogFormatFontTabAnimation);
    v.put("wdDialogFormatBordersAndShadingTabBorders", wdDialogFormatBordersAndShadingTabBorders);
    v.put("wdDialogFormatBordersAndShadingTabPageBorder", wdDialogFormatBordersAndShadingTabPageBorder);
    v.put("wdDialogFormatBordersAndShadingTabShading", wdDialogFormatBordersAndShadingTabShading);
    v.put("wdDialogToolsEnvelopesAndLabelsTabEnvelopes", wdDialogToolsEnvelopesAndLabelsTabEnvelopes);
    v.put("wdDialogToolsEnvelopesAndLabelsTabLabels", wdDialogToolsEnvelopesAndLabelsTabLabels);
    v.put("wdDialogFormatParagraphTabIndentsAndSpacing", wdDialogFormatParagraphTabIndentsAndSpacing);
    v.put("wdDialogFormatParagraphTabTextFlow", wdDialogFormatParagraphTabTextFlow);
    v.put("wdDialogFormatParagraphTabTeisai", wdDialogFormatParagraphTabTeisai);
    v.put("wdDialogFormatDrawingObjectTabColorsAndLines", wdDialogFormatDrawingObjectTabColorsAndLines);
    v.put("wdDialogFormatDrawingObjectTabSize", wdDialogFormatDrawingObjectTabSize);
    v.put("wdDialogFormatDrawingObjectTabPosition", wdDialogFormatDrawingObjectTabPosition);
    v.put("wdDialogFormatDrawingObjectTabWrapping", wdDialogFormatDrawingObjectTabWrapping);
    v.put("wdDialogFormatDrawingObjectTabPicture", wdDialogFormatDrawingObjectTabPicture);
    v.put("wdDialogFormatDrawingObjectTabTextbox", wdDialogFormatDrawingObjectTabTextbox);
    v.put("wdDialogFormatDrawingObjectTabWeb", wdDialogFormatDrawingObjectTabWeb);
    v.put("wdDialogFormatDrawingObjectTabHR", wdDialogFormatDrawingObjectTabHR);
    v.put("wdDialogToolsAutoCorrectExceptionsTabFirstLetter", wdDialogToolsAutoCorrectExceptionsTabFirstLetter);
    v.put("wdDialogToolsAutoCorrectExceptionsTabInitialCaps", wdDialogToolsAutoCorrectExceptionsTabInitialCaps);
    v.put("wdDialogToolsAutoCorrectExceptionsTabHangulAndAlphabet", wdDialogToolsAutoCorrectExceptionsTabHangulAndAlphabet);
    v.put("wdDialogToolsAutoCorrectExceptionsTabIac", wdDialogToolsAutoCorrectExceptionsTabIac);
    v.put("wdDialogFormatBulletsAndNumberingTabBulleted", wdDialogFormatBulletsAndNumberingTabBulleted);
    v.put("wdDialogFormatBulletsAndNumberingTabNumbered", wdDialogFormatBulletsAndNumberingTabNumbered);
    v.put("wdDialogFormatBulletsAndNumberingTabOutlineNumbered", wdDialogFormatBulletsAndNumberingTabOutlineNumbered);
    v.put("wdDialogLetterWizardTabLetterFormat", wdDialogLetterWizardTabLetterFormat);
    v.put("wdDialogLetterWizardTabRecipientInfo", wdDialogLetterWizardTabRecipientInfo);
    v.put("wdDialogLetterWizardTabOtherElements", wdDialogLetterWizardTabOtherElements);
    v.put("wdDialogLetterWizardTabSenderInfo", wdDialogLetterWizardTabSenderInfo);
    v.put("wdDialogToolsAutoManagerTabAutoCorrect", wdDialogToolsAutoManagerTabAutoCorrect);
    v.put("wdDialogToolsAutoManagerTabAutoFormatAsYouType", wdDialogToolsAutoManagerTabAutoFormatAsYouType);
    v.put("wdDialogToolsAutoManagerTabAutoText", wdDialogToolsAutoManagerTabAutoText);
    v.put("wdDialogToolsAutoManagerTabAutoFormat", wdDialogToolsAutoManagerTabAutoFormat);
    v.put("wdDialogToolsAutoManagerTabSmartTags", wdDialogToolsAutoManagerTabSmartTags);
    v.put("wdDialogTablePropertiesTabTable", wdDialogTablePropertiesTabTable);
    v.put("wdDialogTablePropertiesTabRow", wdDialogTablePropertiesTabRow);
    v.put("wdDialogTablePropertiesTabColumn", wdDialogTablePropertiesTabColumn);
    v.put("wdDialogTablePropertiesTabCell", wdDialogTablePropertiesTabCell);
    v.put("wdDialogEmailOptionsTabSignature", wdDialogEmailOptionsTabSignature);
    v.put("wdDialogEmailOptionsTabStationary", wdDialogEmailOptionsTabStationary);
    v.put("wdDialogEmailOptionsTabQuoting", wdDialogEmailOptionsTabQuoting);
    v.put("wdDialogWebOptionsBrowsers", wdDialogWebOptionsBrowsers);
    v.put("wdDialogWebOptionsGeneral", wdDialogWebOptionsGeneral);
    v.put("wdDialogWebOptionsFiles", wdDialogWebOptionsFiles);
    v.put("wdDialogWebOptionsPictures", wdDialogWebOptionsPictures);
    v.put("wdDialogWebOptionsEncoding", wdDialogWebOptionsEncoding);
    v.put("wdDialogWebOptionsFonts", wdDialogWebOptionsFonts);
    v.put("wdDialogToolsOptionsTabAcetate", wdDialogToolsOptionsTabAcetate);
    v.put("wdDialogTemplates", wdDialogTemplates);
    v.put("wdDialogTemplatesXMLSchema", wdDialogTemplatesXMLSchema);
    v.put("wdDialogTemplatesXMLExpansionPacks", wdDialogTemplatesXMLExpansionPacks);
    v.put("wdDialogTemplatesLinkedCSS", wdDialogTemplatesLinkedCSS);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
