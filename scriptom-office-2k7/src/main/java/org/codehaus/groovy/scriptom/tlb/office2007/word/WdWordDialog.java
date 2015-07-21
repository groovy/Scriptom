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
public final class WdWordDialog
{
  private WdWordDialog()
  {
  }

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdDialogHelpAbout = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdDialogHelpWordPerfectHelp = Integer.valueOf(10);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer wdDialogDocumentStatistics = Integer.valueOf(78);

  /**
   * Value is 79 (0x4F)
   */
  public static final Integer wdDialogFileNew = Integer.valueOf(79);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer wdDialogFileOpen = Integer.valueOf(80);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer wdDialogMailMergeOpenDataSource = Integer.valueOf(81);

  /**
   * Value is 82 (0x52)
   */
  public static final Integer wdDialogMailMergeOpenHeaderSource = Integer.valueOf(82);

  /**
   * Value is 84 (0x54)
   */
  public static final Integer wdDialogFileSaveAs = Integer.valueOf(84);

  /**
   * Value is 86 (0x56)
   */
  public static final Integer wdDialogFileSummaryInfo = Integer.valueOf(86);

  /**
   * Value is 87 (0x57)
   */
  public static final Integer wdDialogToolsTemplates = Integer.valueOf(87);

  /**
   * Value is 88 (0x58)
   */
  public static final Integer wdDialogFilePrint = Integer.valueOf(88);

  /**
   * Value is 97 (0x61)
   */
  public static final Integer wdDialogFilePrintSetup = Integer.valueOf(97);

  /**
   * Value is 99 (0x63)
   */
  public static final Integer wdDialogFileFind = Integer.valueOf(99);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer wdDialogFormatAddrFonts = Integer.valueOf(103);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer wdDialogEditPasteSpecial = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer wdDialogEditFind = Integer.valueOf(112);

  /**
   * Value is 117 (0x75)
   */
  public static final Integer wdDialogEditReplace = Integer.valueOf(117);

  /**
   * Value is 120 (0x78)
   */
  public static final Integer wdDialogEditStyle = Integer.valueOf(120);

  /**
   * Value is 124 (0x7C)
   */
  public static final Integer wdDialogEditLinks = Integer.valueOf(124);

  /**
   * Value is 125 (0x7D)
   */
  public static final Integer wdDialogEditObject = Integer.valueOf(125);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer wdDialogTableToText = Integer.valueOf(128);

  /**
   * Value is 127 (0x7F)
   */
  public static final Integer wdDialogTextToTable = Integer.valueOf(127);

  /**
   * Value is 129 (0x81)
   */
  public static final Integer wdDialogTableInsertTable = Integer.valueOf(129);

  /**
   * Value is 130 (0x82)
   */
  public static final Integer wdDialogTableInsertCells = Integer.valueOf(130);

  /**
   * Value is 131 (0x83)
   */
  public static final Integer wdDialogTableInsertRow = Integer.valueOf(131);

  /**
   * Value is 133 (0x85)
   */
  public static final Integer wdDialogTableDeleteCells = Integer.valueOf(133);

  /**
   * Value is 137 (0x89)
   */
  public static final Integer wdDialogTableSplitCells = Integer.valueOf(137);

  /**
   * Value is 142 (0x8E)
   */
  public static final Integer wdDialogTableRowHeight = Integer.valueOf(142);

  /**
   * Value is 143 (0x8F)
   */
  public static final Integer wdDialogTableColumnWidth = Integer.valueOf(143);

  /**
   * Value is 152 (0x98)
   */
  public static final Integer wdDialogToolsCustomize = Integer.valueOf(152);

  /**
   * Value is 159 (0x9F)
   */
  public static final Integer wdDialogInsertBreak = Integer.valueOf(159);

  /**
   * Value is 162 (0xA2)
   */
  public static final Integer wdDialogInsertSymbol = Integer.valueOf(162);

  /**
   * Value is 163 (0xA3)
   */
  public static final Integer wdDialogInsertPicture = Integer.valueOf(163);

  /**
   * Value is 164 (0xA4)
   */
  public static final Integer wdDialogInsertFile = Integer.valueOf(164);

  /**
   * Value is 165 (0xA5)
   */
  public static final Integer wdDialogInsertDateTime = Integer.valueOf(165);

  /**
   * Value is 166 (0xA6)
   */
  public static final Integer wdDialogInsertField = Integer.valueOf(166);

  /**
   * Value is 167 (0xA7)
   */
  public static final Integer wdDialogInsertMergeField = Integer.valueOf(167);

  /**
   * Value is 168 (0xA8)
   */
  public static final Integer wdDialogInsertBookmark = Integer.valueOf(168);

  /**
   * Value is 169 (0xA9)
   */
  public static final Integer wdDialogMarkIndexEntry = Integer.valueOf(169);

  /**
   * Value is 170 (0xAA)
   */
  public static final Integer wdDialogInsertIndex = Integer.valueOf(170);

  /**
   * Value is 171 (0xAB)
   */
  public static final Integer wdDialogInsertTableOfContents = Integer.valueOf(171);

  /**
   * Value is 172 (0xAC)
   */
  public static final Integer wdDialogInsertObject = Integer.valueOf(172);

  /**
   * Value is 173 (0xAD)
   */
  public static final Integer wdDialogToolsCreateEnvelope = Integer.valueOf(173);

  /**
   * Value is 174 (0xAE)
   */
  public static final Integer wdDialogFormatFont = Integer.valueOf(174);

  /**
   * Value is 175 (0xAF)
   */
  public static final Integer wdDialogFormatParagraph = Integer.valueOf(175);

  /**
   * Value is 176 (0xB0)
   */
  public static final Integer wdDialogFormatSectionLayout = Integer.valueOf(176);

  /**
   * Value is 177 (0xB1)
   */
  public static final Integer wdDialogFormatColumns = Integer.valueOf(177);

  /**
   * Value is 178 (0xB2)
   */
  public static final Integer wdDialogFileDocumentLayout = Integer.valueOf(178);

  /**
   * Value is 178 (0xB2)
   */
  public static final Integer wdDialogFilePageSetup = Integer.valueOf(178);

  /**
   * Value is 179 (0xB3)
   */
  public static final Integer wdDialogFormatTabs = Integer.valueOf(179);

  /**
   * Value is 180 (0xB4)
   */
  public static final Integer wdDialogFormatStyle = Integer.valueOf(180);

  /**
   * Value is 181 (0xB5)
   */
  public static final Integer wdDialogFormatDefineStyleFont = Integer.valueOf(181);

  /**
   * Value is 182 (0xB6)
   */
  public static final Integer wdDialogFormatDefineStylePara = Integer.valueOf(182);

  /**
   * Value is 183 (0xB7)
   */
  public static final Integer wdDialogFormatDefineStyleTabs = Integer.valueOf(183);

  /**
   * Value is 184 (0xB8)
   */
  public static final Integer wdDialogFormatDefineStyleFrame = Integer.valueOf(184);

  /**
   * Value is 185 (0xB9)
   */
  public static final Integer wdDialogFormatDefineStyleBorders = Integer.valueOf(185);

  /**
   * Value is 186 (0xBA)
   */
  public static final Integer wdDialogFormatDefineStyleLang = Integer.valueOf(186);

  /**
   * Value is 187 (0xBB)
   */
  public static final Integer wdDialogFormatPicture = Integer.valueOf(187);

  /**
   * Value is 188 (0xBC)
   */
  public static final Integer wdDialogToolsLanguage = Integer.valueOf(188);

  /**
   * Value is 189 (0xBD)
   */
  public static final Integer wdDialogFormatBordersAndShading = Integer.valueOf(189);

  /**
   * Value is 190 (0xBE)
   */
  public static final Integer wdDialogFormatFrame = Integer.valueOf(190);

  /**
   * Value is 194 (0xC2)
   */
  public static final Integer wdDialogToolsThesaurus = Integer.valueOf(194);

  /**
   * Value is 195 (0xC3)
   */
  public static final Integer wdDialogToolsHyphenation = Integer.valueOf(195);

  /**
   * Value is 196 (0xC4)
   */
  public static final Integer wdDialogToolsBulletsNumbers = Integer.valueOf(196);

  /**
   * Value is 197 (0xC5)
   */
  public static final Integer wdDialogToolsHighlightChanges = Integer.valueOf(197);

  /**
   * Value is 197 (0xC5)
   */
  public static final Integer wdDialogToolsRevisions = Integer.valueOf(197);

  /**
   * Value is 198 (0xC6)
   */
  public static final Integer wdDialogToolsCompareDocuments = Integer.valueOf(198);

  /**
   * Value is 199 (0xC7)
   */
  public static final Integer wdDialogTableSort = Integer.valueOf(199);

  /**
   * Value is 203 (0xCB)
   */
  public static final Integer wdDialogToolsOptionsGeneral = Integer.valueOf(203);

  /**
   * Value is 204 (0xCC)
   */
  public static final Integer wdDialogToolsOptionsView = Integer.valueOf(204);

  /**
   * Value is 206 (0xCE)
   */
  public static final Integer wdDialogToolsAdvancedSettings = Integer.valueOf(206);

  /**
   * Value is 208 (0xD0)
   */
  public static final Integer wdDialogToolsOptionsPrint = Integer.valueOf(208);

  /**
   * Value is 209 (0xD1)
   */
  public static final Integer wdDialogToolsOptionsSave = Integer.valueOf(209);

  /**
   * Value is 211 (0xD3)
   */
  public static final Integer wdDialogToolsOptionsSpellingAndGrammar = Integer.valueOf(211);

  /**
   * Value is 213 (0xD5)
   */
  public static final Integer wdDialogToolsOptionsUserInfo = Integer.valueOf(213);

  /**
   * Value is 214 (0xD6)
   */
  public static final Integer wdDialogToolsMacroRecord = Integer.valueOf(214);

  /**
   * Value is 215 (0xD7)
   */
  public static final Integer wdDialogToolsMacro = Integer.valueOf(215);

  /**
   * Value is 220 (0xDC)
   */
  public static final Integer wdDialogWindowActivate = Integer.valueOf(220);

  /**
   * Value is 221 (0xDD)
   */
  public static final Integer wdDialogFormatRetAddrFonts = Integer.valueOf(221);

  /**
   * Value is 222 (0xDE)
   */
  public static final Integer wdDialogOrganizer = Integer.valueOf(222);

  /**
   * Value is 224 (0xE0)
   */
  public static final Integer wdDialogToolsOptionsEdit = Integer.valueOf(224);

  /**
   * Value is 225 (0xE1)
   */
  public static final Integer wdDialogToolsOptionsFileLocations = Integer.valueOf(225);

  /**
   * Value is 228 (0xE4)
   */
  public static final Integer wdDialogToolsWordCount = Integer.valueOf(228);

  /**
   * Value is 235 (0xEB)
   */
  public static final Integer wdDialogControlRun = Integer.valueOf(235);

  /**
   * Value is 294 (0x126)
   */
  public static final Integer wdDialogInsertPageNumbers = Integer.valueOf(294);

  /**
   * Value is 298 (0x12A)
   */
  public static final Integer wdDialogFormatPageNumber = Integer.valueOf(298);

  /**
   * Value is 300 (0x12C)
   */
  public static final Integer wdDialogCopyFile = Integer.valueOf(300);

  /**
   * Value is 322 (0x142)
   */
  public static final Integer wdDialogFormatChangeCase = Integer.valueOf(322);

  /**
   * Value is 331 (0x14B)
   */
  public static final Integer wdDialogUpdateTOC = Integer.valueOf(331);

  /**
   * Value is 341 (0x155)
   */
  public static final Integer wdDialogInsertDatabase = Integer.valueOf(341);

  /**
   * Value is 348 (0x15C)
   */
  public static final Integer wdDialogTableFormula = Integer.valueOf(348);

  /**
   * Value is 353 (0x161)
   */
  public static final Integer wdDialogFormFieldOptions = Integer.valueOf(353);

  /**
   * Value is 357 (0x165)
   */
  public static final Integer wdDialogInsertCaption = Integer.valueOf(357);

  /**
   * Value is 358 (0x166)
   */
  public static final Integer wdDialogInsertCaptionNumbering = Integer.valueOf(358);

  /**
   * Value is 359 (0x167)
   */
  public static final Integer wdDialogInsertAutoCaption = Integer.valueOf(359);

  /**
   * Value is 361 (0x169)
   */
  public static final Integer wdDialogFormFieldHelp = Integer.valueOf(361);

  /**
   * Value is 367 (0x16F)
   */
  public static final Integer wdDialogInsertCrossReference = Integer.valueOf(367);

  /**
   * Value is 370 (0x172)
   */
  public static final Integer wdDialogInsertFootnote = Integer.valueOf(370);

  /**
   * Value is 373 (0x175)
   */
  public static final Integer wdDialogNoteOptions = Integer.valueOf(373);

  /**
   * Value is 378 (0x17A)
   */
  public static final Integer wdDialogToolsAutoCorrect = Integer.valueOf(378);

  /**
   * Value is 386 (0x182)
   */
  public static final Integer wdDialogToolsOptionsTrackChanges = Integer.valueOf(386);

  /**
   * Value is 392 (0x188)
   */
  public static final Integer wdDialogConvertObject = Integer.valueOf(392);

  /**
   * Value is 402 (0x192)
   */
  public static final Integer wdDialogInsertAddCaption = Integer.valueOf(402);

  /**
   * Value is 420 (0x1A4)
   */
  public static final Integer wdDialogConnect = Integer.valueOf(420);

  /**
   * Value is 432 (0x1B0)
   */
  public static final Integer wdDialogToolsCustomizeKeyboard = Integer.valueOf(432);

  /**
   * Value is 433 (0x1B1)
   */
  public static final Integer wdDialogToolsCustomizeMenus = Integer.valueOf(433);

  /**
   * Value is 435 (0x1B3)
   */
  public static final Integer wdDialogToolsMergeDocuments = Integer.valueOf(435);

  /**
   * Value is 442 (0x1BA)
   */
  public static final Integer wdDialogMarkTableOfContentsEntry = Integer.valueOf(442);

  /**
   * Value is 444 (0x1BC)
   */
  public static final Integer wdDialogFileMacPageSetupGX = Integer.valueOf(444);

  /**
   * Value is 445 (0x1BD)
   */
  public static final Integer wdDialogFilePrintOneCopy = Integer.valueOf(445);

  /**
   * Value is 458 (0x1CA)
   */
  public static final Integer wdDialogEditFrame = Integer.valueOf(458);

  /**
   * Value is 463 (0x1CF)
   */
  public static final Integer wdDialogMarkCitation = Integer.valueOf(463);

  /**
   * Value is 470 (0x1D6)
   */
  public static final Integer wdDialogTableOfContentsOptions = Integer.valueOf(470);

  /**
   * Value is 471 (0x1D7)
   */
  public static final Integer wdDialogInsertTableOfAuthorities = Integer.valueOf(471);

  /**
   * Value is 472 (0x1D8)
   */
  public static final Integer wdDialogInsertTableOfFigures = Integer.valueOf(472);

  /**
   * Value is 473 (0x1D9)
   */
  public static final Integer wdDialogInsertIndexAndTables = Integer.valueOf(473);

  /**
   * Value is 483 (0x1E3)
   */
  public static final Integer wdDialogInsertFormField = Integer.valueOf(483);

  /**
   * Value is 488 (0x1E8)
   */
  public static final Integer wdDialogFormatDropCap = Integer.valueOf(488);

  /**
   * Value is 489 (0x1E9)
   */
  public static final Integer wdDialogToolsCreateLabels = Integer.valueOf(489);

  /**
   * Value is 503 (0x1F7)
   */
  public static final Integer wdDialogToolsProtectDocument = Integer.valueOf(503);

  /**
   * Value is 505 (0x1F9)
   */
  public static final Integer wdDialogFormatStyleGallery = Integer.valueOf(505);

  /**
   * Value is 506 (0x1FA)
   */
  public static final Integer wdDialogToolsAcceptRejectChanges = Integer.valueOf(506);

  /**
   * Value is 511 (0x1FF)
   */
  public static final Integer wdDialogHelpWordPerfectHelpOptions = Integer.valueOf(511);

  /**
   * Value is 521 (0x209)
   */
  public static final Integer wdDialogToolsUnprotectDocument = Integer.valueOf(521);

  /**
   * Value is 525 (0x20D)
   */
  public static final Integer wdDialogToolsOptionsCompatibility = Integer.valueOf(525);

  /**
   * Value is 551 (0x227)
   */
  public static final Integer wdDialogTableOfCaptionsOptions = Integer.valueOf(551);

  /**
   * Value is 563 (0x233)
   */
  public static final Integer wdDialogTableAutoFormat = Integer.valueOf(563);

  /**
   * Value is 569 (0x239)
   */
  public static final Integer wdDialogMailMergeFindRecord = Integer.valueOf(569);

  /**
   * Value is 570 (0x23A)
   */
  public static final Integer wdDialogReviewAfmtRevisions = Integer.valueOf(570);

  /**
   * Value is 577 (0x241)
   */
  public static final Integer wdDialogViewZoom = Integer.valueOf(577);

  /**
   * Value is 578 (0x242)
   */
  public static final Integer wdDialogToolsProtectSection = Integer.valueOf(578);

  /**
   * Value is 581 (0x245)
   */
  public static final Integer wdDialogFontSubstitution = Integer.valueOf(581);

  /**
   * Value is 583 (0x247)
   */
  public static final Integer wdDialogInsertSubdocument = Integer.valueOf(583);

  /**
   * Value is 586 (0x24A)
   */
  public static final Integer wdDialogNewToolbar = Integer.valueOf(586);

  /**
   * Value is 607 (0x25F)
   */
  public static final Integer wdDialogToolsEnvelopesAndLabels = Integer.valueOf(607);

  /**
   * Value is 610 (0x262)
   */
  public static final Integer wdDialogFormatCallout = Integer.valueOf(610);

  /**
   * Value is 612 (0x264)
   */
  public static final Integer wdDialogTableFormatCell = Integer.valueOf(612);

  /**
   * Value is 615 (0x267)
   */
  public static final Integer wdDialogToolsCustomizeMenuBar = Integer.valueOf(615);

  /**
   * Value is 624 (0x270)
   */
  public static final Integer wdDialogFileRoutingSlip = Integer.valueOf(624);

  /**
   * Value is 625 (0x271)
   */
  public static final Integer wdDialogEditTOACategory = Integer.valueOf(625);

  /**
   * Value is 631 (0x277)
   */
  public static final Integer wdDialogToolsManageFields = Integer.valueOf(631);

  /**
   * Value is 633 (0x279)
   */
  public static final Integer wdDialogDrawSnapToGrid = Integer.valueOf(633);

  /**
   * Value is 634 (0x27A)
   */
  public static final Integer wdDialogDrawAlign = Integer.valueOf(634);

  /**
   * Value is 642 (0x282)
   */
  public static final Integer wdDialogMailMergeCreateDataSource = Integer.valueOf(642);

  /**
   * Value is 643 (0x283)
   */
  public static final Integer wdDialogMailMergeCreateHeaderSource = Integer.valueOf(643);

  /**
   * Value is 676 (0x2A4)
   */
  public static final Integer wdDialogMailMerge = Integer.valueOf(676);

  /**
   * Value is 677 (0x2A5)
   */
  public static final Integer wdDialogMailMergeCheck = Integer.valueOf(677);

  /**
   * Value is 680 (0x2A8)
   */
  public static final Integer wdDialogMailMergeHelper = Integer.valueOf(680);

  /**
   * Value is 681 (0x2A9)
   */
  public static final Integer wdDialogMailMergeQueryOptions = Integer.valueOf(681);

  /**
   * Value is 685 (0x2AD)
   */
  public static final Integer wdDialogFileMacPageSetup = Integer.valueOf(685);

  /**
   * Value is 723 (0x2D3)
   */
  public static final Integer wdDialogListCommands = Integer.valueOf(723);

  /**
   * Value is 732 (0x2DC)
   */
  public static final Integer wdDialogEditCreatePublisher = Integer.valueOf(732);

  /**
   * Value is 733 (0x2DD)
   */
  public static final Integer wdDialogEditSubscribeTo = Integer.valueOf(733);

  /**
   * Value is 735 (0x2DF)
   */
  public static final Integer wdDialogEditPublishOptions = Integer.valueOf(735);

  /**
   * Value is 736 (0x2E0)
   */
  public static final Integer wdDialogEditSubscribeOptions = Integer.valueOf(736);

  /**
   * Value is 737 (0x2E1)
   */
  public static final Integer wdDialogFileMacCustomPageSetupGX = Integer.valueOf(737);

  /**
   * Value is 739 (0x2E3)
   */
  public static final Integer wdDialogToolsOptionsTypography = Integer.valueOf(739);

  /**
   * Value is 762 (0x2FA)
   */
  public static final Integer wdDialogToolsAutoCorrectExceptions = Integer.valueOf(762);

  /**
   * Value is 778 (0x30A)
   */
  public static final Integer wdDialogToolsOptionsAutoFormatAsYouType = Integer.valueOf(778);

  /**
   * Value is 779 (0x30B)
   */
  public static final Integer wdDialogMailMergeUseAddressBook = Integer.valueOf(779);

  /**
   * Value is 784 (0x310)
   */
  public static final Integer wdDialogToolsHangulHanjaConversion = Integer.valueOf(784);

  /**
   * Value is 790 (0x316)
   */
  public static final Integer wdDialogToolsOptionsFuzzy = Integer.valueOf(790);

  /**
   * Value is 811 (0x32B)
   */
  public static final Integer wdDialogEditGoToOld = Integer.valueOf(811);

  /**
   * Value is 812 (0x32C)
   */
  public static final Integer wdDialogInsertNumber = Integer.valueOf(812);

  /**
   * Value is 821 (0x335)
   */
  public static final Integer wdDialogLetterWizard = Integer.valueOf(821);

  /**
   * Value is 824 (0x338)
   */
  public static final Integer wdDialogFormatBulletsAndNumbering = Integer.valueOf(824);

  /**
   * Value is 828 (0x33C)
   */
  public static final Integer wdDialogToolsSpellingAndGrammar = Integer.valueOf(828);

  /**
   * Value is 833 (0x341)
   */
  public static final Integer wdDialogToolsCreateDirectory = Integer.valueOf(833);

  /**
   * Value is 854 (0x356)
   */
  public static final Integer wdDialogTableWrapping = Integer.valueOf(854);

  /**
   * Value is 855 (0x357)
   */
  public static final Integer wdDialogFormatTheme = Integer.valueOf(855);

  /**
   * Value is 861 (0x35D)
   */
  public static final Integer wdDialogTableProperties = Integer.valueOf(861);

  /**
   * Value is 863 (0x35F)
   */
  public static final Integer wdDialogEmailOptions = Integer.valueOf(863);

  /**
   * Value is 872 (0x368)
   */
  public static final Integer wdDialogCreateAutoText = Integer.valueOf(872);

  /**
   * Value is 874 (0x36A)
   */
  public static final Integer wdDialogToolsAutoSummarize = Integer.valueOf(874);

  /**
   * Value is 885 (0x375)
   */
  public static final Integer wdDialogToolsGrammarSettings = Integer.valueOf(885);

  /**
   * Value is 896 (0x380)
   */
  public static final Integer wdDialogEditGoTo = Integer.valueOf(896);

  /**
   * Value is 898 (0x382)
   */
  public static final Integer wdDialogWebOptions = Integer.valueOf(898);

  /**
   * Value is 925 (0x39D)
   */
  public static final Integer wdDialogInsertHyperlink = Integer.valueOf(925);

  /**
   * Value is 915 (0x393)
   */
  public static final Integer wdDialogToolsAutoManager = Integer.valueOf(915);

  /**
   * Value is 945 (0x3B1)
   */
  public static final Integer wdDialogFileVersions = Integer.valueOf(945);

  /**
   * Value is 959 (0x3BF)
   */
  public static final Integer wdDialogToolsOptionsAutoFormat = Integer.valueOf(959);

  /**
   * Value is 960 (0x3C0)
   */
  public static final Integer wdDialogFormatDrawingObject = Integer.valueOf(960);

  /**
   * Value is 974 (0x3CE)
   */
  public static final Integer wdDialogToolsOptions = Integer.valueOf(974);

  /**
   * Value is 983 (0x3D7)
   */
  public static final Integer wdDialogFitText = Integer.valueOf(983);

  /**
   * Value is 985 (0x3D9)
   */
  public static final Integer wdDialogEditAutoText = Integer.valueOf(985);

  /**
   * Value is 986 (0x3DA)
   */
  public static final Integer wdDialogPhoneticGuide = Integer.valueOf(986);

  /**
   * Value is 989 (0x3DD)
   */
  public static final Integer wdDialogToolsDictionary = Integer.valueOf(989);

  /**
   * Value is 1007 (0x3EF)
   */
  public static final Integer wdDialogFileSaveVersion = Integer.valueOf(1007);

  /**
   * Value is 1029 (0x405)
   */
  public static final Integer wdDialogToolsOptionsBidi = Integer.valueOf(1029);

  /**
   * Value is 1074 (0x432)
   */
  public static final Integer wdDialogFrameSetProperties = Integer.valueOf(1074);

  /**
   * Value is 1080 (0x438)
   */
  public static final Integer wdDialogTableTableOptions = Integer.valueOf(1080);

  /**
   * Value is 1081 (0x439)
   */
  public static final Integer wdDialogTableCellOptions = Integer.valueOf(1081);

  /**
   * Value is 1094 (0x446)
   */
  public static final Integer wdDialogIMESetDefault = Integer.valueOf(1094);

  /**
   * Value is 1156 (0x484)
   */
  public static final Integer wdDialogTCSCTranslator = Integer.valueOf(1156);

  /**
   * Value is 1160 (0x488)
   */
  public static final Integer wdDialogHorizontalInVertical = Integer.valueOf(1160);

  /**
   * Value is 1161 (0x489)
   */
  public static final Integer wdDialogTwoLinesInOne = Integer.valueOf(1161);

  /**
   * Value is 1162 (0x48A)
   */
  public static final Integer wdDialogFormatEncloseCharacters = Integer.valueOf(1162);

  /**
   * Value is 1121 (0x461)
   */
  public static final Integer wdDialogConsistencyChecker = Integer.valueOf(1121);

  /**
   * Value is 1395 (0x573)
   */
  public static final Integer wdDialogToolsOptionsSmartTag = Integer.valueOf(1395);

  /**
   * Value is 1248 (0x4E0)
   */
  public static final Integer wdDialogFormatStylesCustom = Integer.valueOf(1248);

  /**
   * Value is 1261 (0x4ED)
   */
  public static final Integer wdDialogCSSLinks = Integer.valueOf(1261);

  /**
   * Value is 1324 (0x52C)
   */
  public static final Integer wdDialogInsertWebComponent = Integer.valueOf(1324);

  /**
   * Value is 1356 (0x54C)
   */
  public static final Integer wdDialogToolsOptionsEditCopyPaste = Integer.valueOf(1356);

  /**
   * Value is 1361 (0x551)
   */
  public static final Integer wdDialogToolsOptionsSecurity = Integer.valueOf(1361);

  /**
   * Value is 1363 (0x553)
   */
  public static final Integer wdDialogSearch = Integer.valueOf(1363);

  /**
   * Value is 1381 (0x565)
   */
  public static final Integer wdDialogShowRepairs = Integer.valueOf(1381);

  /**
   * Value is 4047 (0xFCF)
   */
  public static final Integer wdDialogMailMergeInsertAsk = Integer.valueOf(4047);

  /**
   * Value is 4048 (0xFD0)
   */
  public static final Integer wdDialogMailMergeInsertFillIn = Integer.valueOf(4048);

  /**
   * Value is 4049 (0xFD1)
   */
  public static final Integer wdDialogMailMergeInsertIf = Integer.valueOf(4049);

  /**
   * Value is 4053 (0xFD5)
   */
  public static final Integer wdDialogMailMergeInsertNextIf = Integer.valueOf(4053);

  /**
   * Value is 4054 (0xFD6)
   */
  public static final Integer wdDialogMailMergeInsertSet = Integer.valueOf(4054);

  /**
   * Value is 4055 (0xFD7)
   */
  public static final Integer wdDialogMailMergeInsertSkipIf = Integer.valueOf(4055);

  /**
   * Value is 1304 (0x518)
   */
  public static final Integer wdDialogMailMergeFieldMapping = Integer.valueOf(1304);

  /**
   * Value is 1305 (0x519)
   */
  public static final Integer wdDialogMailMergeInsertAddressBlock = Integer.valueOf(1305);

  /**
   * Value is 1306 (0x51A)
   */
  public static final Integer wdDialogMailMergeInsertGreetingLine = Integer.valueOf(1306);

  /**
   * Value is 1307 (0x51B)
   */
  public static final Integer wdDialogMailMergeInsertFields = Integer.valueOf(1307);

  /**
   * Value is 1308 (0x51C)
   */
  public static final Integer wdDialogMailMergeRecipients = Integer.valueOf(1308);

  /**
   * Value is 1326 (0x52E)
   */
  public static final Integer wdDialogMailMergeFindRecipient = Integer.valueOf(1326);

  /**
   * Value is 1339 (0x53B)
   */
  public static final Integer wdDialogMailMergeSetDocumentType = Integer.valueOf(1339);

  /**
   * Value is 1367 (0x557)
   */
  public static final Integer wdDialogLabelOptions = Integer.valueOf(1367);

  /**
   * Value is 1460 (0x5B4)
   */
  public static final Integer wdDialogXMLElementAttributes = Integer.valueOf(1460);

  /**
   * Value is 1417 (0x589)
   */
  public static final Integer wdDialogSchemaLibrary = Integer.valueOf(1417);

  /**
   * Value is 1469 (0x5BD)
   */
  public static final Integer wdDialogPermission = Integer.valueOf(1469);

  /**
   * Value is 1437 (0x59D)
   */
  public static final Integer wdDialogMyPermission = Integer.valueOf(1437);

  /**
   * Value is 1425 (0x591)
   */
  public static final Integer wdDialogXMLOptions = Integer.valueOf(1425);

  /**
   * Value is 1427 (0x593)
   */
  public static final Integer wdDialogFormattingRestrictions = Integer.valueOf(1427);

  /**
   * Value is 1920 (0x780)
   */
  public static final Integer wdDialogSourceManager = Integer.valueOf(1920);

  /**
   * Value is 1922 (0x782)
   */
  public static final Integer wdDialogCreateSource = Integer.valueOf(1922);

  /**
   * Value is 1482 (0x5CA)
   */
  public static final Integer wdDialogDocumentInspector = Integer.valueOf(1482);

  /**
   * Value is 1948 (0x79C)
   */
  public static final Integer wdDialogStyleManagement = Integer.valueOf(1948);

  /**
   * Value is 2120 (0x848)
   */
  public static final Integer wdDialogInsertSource = Integer.valueOf(2120);

  /**
   * Value is 2165 (0x875)
   */
  public static final Integer wdDialogOMathRecognizedFunctions = Integer.valueOf(2165);

  /**
   * Value is 2348 (0x92C)
   */
  public static final Integer wdDialogInsertPlaceholder = Integer.valueOf(2348);

  /**
   * Value is 2067 (0x813)
   */
  public static final Integer wdDialogBuildingBlockOrganizer = Integer.valueOf(2067);

  /**
   * Value is 2394 (0x95A)
   */
  public static final Integer wdDialogContentControlProperties = Integer.valueOf(2394);

  /**
   * Value is 2439 (0x987)
   */
  public static final Integer wdDialogCompatibilityChecker = Integer.valueOf(2439);

  /**
   * Value is 2349 (0x92D)
   */
  public static final Integer wdDialogExportAsFixedFormat = Integer.valueOf(2349);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdDialogHelpAbout", wdDialogHelpAbout);
    v.put("wdDialogHelpWordPerfectHelp", wdDialogHelpWordPerfectHelp);
    v.put("wdDialogDocumentStatistics", wdDialogDocumentStatistics);
    v.put("wdDialogFileNew", wdDialogFileNew);
    v.put("wdDialogFileOpen", wdDialogFileOpen);
    v.put("wdDialogMailMergeOpenDataSource", wdDialogMailMergeOpenDataSource);
    v.put("wdDialogMailMergeOpenHeaderSource", wdDialogMailMergeOpenHeaderSource);
    v.put("wdDialogFileSaveAs", wdDialogFileSaveAs);
    v.put("wdDialogFileSummaryInfo", wdDialogFileSummaryInfo);
    v.put("wdDialogToolsTemplates", wdDialogToolsTemplates);
    v.put("wdDialogFilePrint", wdDialogFilePrint);
    v.put("wdDialogFilePrintSetup", wdDialogFilePrintSetup);
    v.put("wdDialogFileFind", wdDialogFileFind);
    v.put("wdDialogFormatAddrFonts", wdDialogFormatAddrFonts);
    v.put("wdDialogEditPasteSpecial", wdDialogEditPasteSpecial);
    v.put("wdDialogEditFind", wdDialogEditFind);
    v.put("wdDialogEditReplace", wdDialogEditReplace);
    v.put("wdDialogEditStyle", wdDialogEditStyle);
    v.put("wdDialogEditLinks", wdDialogEditLinks);
    v.put("wdDialogEditObject", wdDialogEditObject);
    v.put("wdDialogTableToText", wdDialogTableToText);
    v.put("wdDialogTextToTable", wdDialogTextToTable);
    v.put("wdDialogTableInsertTable", wdDialogTableInsertTable);
    v.put("wdDialogTableInsertCells", wdDialogTableInsertCells);
    v.put("wdDialogTableInsertRow", wdDialogTableInsertRow);
    v.put("wdDialogTableDeleteCells", wdDialogTableDeleteCells);
    v.put("wdDialogTableSplitCells", wdDialogTableSplitCells);
    v.put("wdDialogTableRowHeight", wdDialogTableRowHeight);
    v.put("wdDialogTableColumnWidth", wdDialogTableColumnWidth);
    v.put("wdDialogToolsCustomize", wdDialogToolsCustomize);
    v.put("wdDialogInsertBreak", wdDialogInsertBreak);
    v.put("wdDialogInsertSymbol", wdDialogInsertSymbol);
    v.put("wdDialogInsertPicture", wdDialogInsertPicture);
    v.put("wdDialogInsertFile", wdDialogInsertFile);
    v.put("wdDialogInsertDateTime", wdDialogInsertDateTime);
    v.put("wdDialogInsertField", wdDialogInsertField);
    v.put("wdDialogInsertMergeField", wdDialogInsertMergeField);
    v.put("wdDialogInsertBookmark", wdDialogInsertBookmark);
    v.put("wdDialogMarkIndexEntry", wdDialogMarkIndexEntry);
    v.put("wdDialogInsertIndex", wdDialogInsertIndex);
    v.put("wdDialogInsertTableOfContents", wdDialogInsertTableOfContents);
    v.put("wdDialogInsertObject", wdDialogInsertObject);
    v.put("wdDialogToolsCreateEnvelope", wdDialogToolsCreateEnvelope);
    v.put("wdDialogFormatFont", wdDialogFormatFont);
    v.put("wdDialogFormatParagraph", wdDialogFormatParagraph);
    v.put("wdDialogFormatSectionLayout", wdDialogFormatSectionLayout);
    v.put("wdDialogFormatColumns", wdDialogFormatColumns);
    v.put("wdDialogFileDocumentLayout", wdDialogFileDocumentLayout);
    v.put("wdDialogFilePageSetup", wdDialogFilePageSetup);
    v.put("wdDialogFormatTabs", wdDialogFormatTabs);
    v.put("wdDialogFormatStyle", wdDialogFormatStyle);
    v.put("wdDialogFormatDefineStyleFont", wdDialogFormatDefineStyleFont);
    v.put("wdDialogFormatDefineStylePara", wdDialogFormatDefineStylePara);
    v.put("wdDialogFormatDefineStyleTabs", wdDialogFormatDefineStyleTabs);
    v.put("wdDialogFormatDefineStyleFrame", wdDialogFormatDefineStyleFrame);
    v.put("wdDialogFormatDefineStyleBorders", wdDialogFormatDefineStyleBorders);
    v.put("wdDialogFormatDefineStyleLang", wdDialogFormatDefineStyleLang);
    v.put("wdDialogFormatPicture", wdDialogFormatPicture);
    v.put("wdDialogToolsLanguage", wdDialogToolsLanguage);
    v.put("wdDialogFormatBordersAndShading", wdDialogFormatBordersAndShading);
    v.put("wdDialogFormatFrame", wdDialogFormatFrame);
    v.put("wdDialogToolsThesaurus", wdDialogToolsThesaurus);
    v.put("wdDialogToolsHyphenation", wdDialogToolsHyphenation);
    v.put("wdDialogToolsBulletsNumbers", wdDialogToolsBulletsNumbers);
    v.put("wdDialogToolsHighlightChanges", wdDialogToolsHighlightChanges);
    v.put("wdDialogToolsRevisions", wdDialogToolsRevisions);
    v.put("wdDialogToolsCompareDocuments", wdDialogToolsCompareDocuments);
    v.put("wdDialogTableSort", wdDialogTableSort);
    v.put("wdDialogToolsOptionsGeneral", wdDialogToolsOptionsGeneral);
    v.put("wdDialogToolsOptionsView", wdDialogToolsOptionsView);
    v.put("wdDialogToolsAdvancedSettings", wdDialogToolsAdvancedSettings);
    v.put("wdDialogToolsOptionsPrint", wdDialogToolsOptionsPrint);
    v.put("wdDialogToolsOptionsSave", wdDialogToolsOptionsSave);
    v.put("wdDialogToolsOptionsSpellingAndGrammar", wdDialogToolsOptionsSpellingAndGrammar);
    v.put("wdDialogToolsOptionsUserInfo", wdDialogToolsOptionsUserInfo);
    v.put("wdDialogToolsMacroRecord", wdDialogToolsMacroRecord);
    v.put("wdDialogToolsMacro", wdDialogToolsMacro);
    v.put("wdDialogWindowActivate", wdDialogWindowActivate);
    v.put("wdDialogFormatRetAddrFonts", wdDialogFormatRetAddrFonts);
    v.put("wdDialogOrganizer", wdDialogOrganizer);
    v.put("wdDialogToolsOptionsEdit", wdDialogToolsOptionsEdit);
    v.put("wdDialogToolsOptionsFileLocations", wdDialogToolsOptionsFileLocations);
    v.put("wdDialogToolsWordCount", wdDialogToolsWordCount);
    v.put("wdDialogControlRun", wdDialogControlRun);
    v.put("wdDialogInsertPageNumbers", wdDialogInsertPageNumbers);
    v.put("wdDialogFormatPageNumber", wdDialogFormatPageNumber);
    v.put("wdDialogCopyFile", wdDialogCopyFile);
    v.put("wdDialogFormatChangeCase", wdDialogFormatChangeCase);
    v.put("wdDialogUpdateTOC", wdDialogUpdateTOC);
    v.put("wdDialogInsertDatabase", wdDialogInsertDatabase);
    v.put("wdDialogTableFormula", wdDialogTableFormula);
    v.put("wdDialogFormFieldOptions", wdDialogFormFieldOptions);
    v.put("wdDialogInsertCaption", wdDialogInsertCaption);
    v.put("wdDialogInsertCaptionNumbering", wdDialogInsertCaptionNumbering);
    v.put("wdDialogInsertAutoCaption", wdDialogInsertAutoCaption);
    v.put("wdDialogFormFieldHelp", wdDialogFormFieldHelp);
    v.put("wdDialogInsertCrossReference", wdDialogInsertCrossReference);
    v.put("wdDialogInsertFootnote", wdDialogInsertFootnote);
    v.put("wdDialogNoteOptions", wdDialogNoteOptions);
    v.put("wdDialogToolsAutoCorrect", wdDialogToolsAutoCorrect);
    v.put("wdDialogToolsOptionsTrackChanges", wdDialogToolsOptionsTrackChanges);
    v.put("wdDialogConvertObject", wdDialogConvertObject);
    v.put("wdDialogInsertAddCaption", wdDialogInsertAddCaption);
    v.put("wdDialogConnect", wdDialogConnect);
    v.put("wdDialogToolsCustomizeKeyboard", wdDialogToolsCustomizeKeyboard);
    v.put("wdDialogToolsCustomizeMenus", wdDialogToolsCustomizeMenus);
    v.put("wdDialogToolsMergeDocuments", wdDialogToolsMergeDocuments);
    v.put("wdDialogMarkTableOfContentsEntry", wdDialogMarkTableOfContentsEntry);
    v.put("wdDialogFileMacPageSetupGX", wdDialogFileMacPageSetupGX);
    v.put("wdDialogFilePrintOneCopy", wdDialogFilePrintOneCopy);
    v.put("wdDialogEditFrame", wdDialogEditFrame);
    v.put("wdDialogMarkCitation", wdDialogMarkCitation);
    v.put("wdDialogTableOfContentsOptions", wdDialogTableOfContentsOptions);
    v.put("wdDialogInsertTableOfAuthorities", wdDialogInsertTableOfAuthorities);
    v.put("wdDialogInsertTableOfFigures", wdDialogInsertTableOfFigures);
    v.put("wdDialogInsertIndexAndTables", wdDialogInsertIndexAndTables);
    v.put("wdDialogInsertFormField", wdDialogInsertFormField);
    v.put("wdDialogFormatDropCap", wdDialogFormatDropCap);
    v.put("wdDialogToolsCreateLabels", wdDialogToolsCreateLabels);
    v.put("wdDialogToolsProtectDocument", wdDialogToolsProtectDocument);
    v.put("wdDialogFormatStyleGallery", wdDialogFormatStyleGallery);
    v.put("wdDialogToolsAcceptRejectChanges", wdDialogToolsAcceptRejectChanges);
    v.put("wdDialogHelpWordPerfectHelpOptions", wdDialogHelpWordPerfectHelpOptions);
    v.put("wdDialogToolsUnprotectDocument", wdDialogToolsUnprotectDocument);
    v.put("wdDialogToolsOptionsCompatibility", wdDialogToolsOptionsCompatibility);
    v.put("wdDialogTableOfCaptionsOptions", wdDialogTableOfCaptionsOptions);
    v.put("wdDialogTableAutoFormat", wdDialogTableAutoFormat);
    v.put("wdDialogMailMergeFindRecord", wdDialogMailMergeFindRecord);
    v.put("wdDialogReviewAfmtRevisions", wdDialogReviewAfmtRevisions);
    v.put("wdDialogViewZoom", wdDialogViewZoom);
    v.put("wdDialogToolsProtectSection", wdDialogToolsProtectSection);
    v.put("wdDialogFontSubstitution", wdDialogFontSubstitution);
    v.put("wdDialogInsertSubdocument", wdDialogInsertSubdocument);
    v.put("wdDialogNewToolbar", wdDialogNewToolbar);
    v.put("wdDialogToolsEnvelopesAndLabels", wdDialogToolsEnvelopesAndLabels);
    v.put("wdDialogFormatCallout", wdDialogFormatCallout);
    v.put("wdDialogTableFormatCell", wdDialogTableFormatCell);
    v.put("wdDialogToolsCustomizeMenuBar", wdDialogToolsCustomizeMenuBar);
    v.put("wdDialogFileRoutingSlip", wdDialogFileRoutingSlip);
    v.put("wdDialogEditTOACategory", wdDialogEditTOACategory);
    v.put("wdDialogToolsManageFields", wdDialogToolsManageFields);
    v.put("wdDialogDrawSnapToGrid", wdDialogDrawSnapToGrid);
    v.put("wdDialogDrawAlign", wdDialogDrawAlign);
    v.put("wdDialogMailMergeCreateDataSource", wdDialogMailMergeCreateDataSource);
    v.put("wdDialogMailMergeCreateHeaderSource", wdDialogMailMergeCreateHeaderSource);
    v.put("wdDialogMailMerge", wdDialogMailMerge);
    v.put("wdDialogMailMergeCheck", wdDialogMailMergeCheck);
    v.put("wdDialogMailMergeHelper", wdDialogMailMergeHelper);
    v.put("wdDialogMailMergeQueryOptions", wdDialogMailMergeQueryOptions);
    v.put("wdDialogFileMacPageSetup", wdDialogFileMacPageSetup);
    v.put("wdDialogListCommands", wdDialogListCommands);
    v.put("wdDialogEditCreatePublisher", wdDialogEditCreatePublisher);
    v.put("wdDialogEditSubscribeTo", wdDialogEditSubscribeTo);
    v.put("wdDialogEditPublishOptions", wdDialogEditPublishOptions);
    v.put("wdDialogEditSubscribeOptions", wdDialogEditSubscribeOptions);
    v.put("wdDialogFileMacCustomPageSetupGX", wdDialogFileMacCustomPageSetupGX);
    v.put("wdDialogToolsOptionsTypography", wdDialogToolsOptionsTypography);
    v.put("wdDialogToolsAutoCorrectExceptions", wdDialogToolsAutoCorrectExceptions);
    v.put("wdDialogToolsOptionsAutoFormatAsYouType", wdDialogToolsOptionsAutoFormatAsYouType);
    v.put("wdDialogMailMergeUseAddressBook", wdDialogMailMergeUseAddressBook);
    v.put("wdDialogToolsHangulHanjaConversion", wdDialogToolsHangulHanjaConversion);
    v.put("wdDialogToolsOptionsFuzzy", wdDialogToolsOptionsFuzzy);
    v.put("wdDialogEditGoToOld", wdDialogEditGoToOld);
    v.put("wdDialogInsertNumber", wdDialogInsertNumber);
    v.put("wdDialogLetterWizard", wdDialogLetterWizard);
    v.put("wdDialogFormatBulletsAndNumbering", wdDialogFormatBulletsAndNumbering);
    v.put("wdDialogToolsSpellingAndGrammar", wdDialogToolsSpellingAndGrammar);
    v.put("wdDialogToolsCreateDirectory", wdDialogToolsCreateDirectory);
    v.put("wdDialogTableWrapping", wdDialogTableWrapping);
    v.put("wdDialogFormatTheme", wdDialogFormatTheme);
    v.put("wdDialogTableProperties", wdDialogTableProperties);
    v.put("wdDialogEmailOptions", wdDialogEmailOptions);
    v.put("wdDialogCreateAutoText", wdDialogCreateAutoText);
    v.put("wdDialogToolsAutoSummarize", wdDialogToolsAutoSummarize);
    v.put("wdDialogToolsGrammarSettings", wdDialogToolsGrammarSettings);
    v.put("wdDialogEditGoTo", wdDialogEditGoTo);
    v.put("wdDialogWebOptions", wdDialogWebOptions);
    v.put("wdDialogInsertHyperlink", wdDialogInsertHyperlink);
    v.put("wdDialogToolsAutoManager", wdDialogToolsAutoManager);
    v.put("wdDialogFileVersions", wdDialogFileVersions);
    v.put("wdDialogToolsOptionsAutoFormat", wdDialogToolsOptionsAutoFormat);
    v.put("wdDialogFormatDrawingObject", wdDialogFormatDrawingObject);
    v.put("wdDialogToolsOptions", wdDialogToolsOptions);
    v.put("wdDialogFitText", wdDialogFitText);
    v.put("wdDialogEditAutoText", wdDialogEditAutoText);
    v.put("wdDialogPhoneticGuide", wdDialogPhoneticGuide);
    v.put("wdDialogToolsDictionary", wdDialogToolsDictionary);
    v.put("wdDialogFileSaveVersion", wdDialogFileSaveVersion);
    v.put("wdDialogToolsOptionsBidi", wdDialogToolsOptionsBidi);
    v.put("wdDialogFrameSetProperties", wdDialogFrameSetProperties);
    v.put("wdDialogTableTableOptions", wdDialogTableTableOptions);
    v.put("wdDialogTableCellOptions", wdDialogTableCellOptions);
    v.put("wdDialogIMESetDefault", wdDialogIMESetDefault);
    v.put("wdDialogTCSCTranslator", wdDialogTCSCTranslator);
    v.put("wdDialogHorizontalInVertical", wdDialogHorizontalInVertical);
    v.put("wdDialogTwoLinesInOne", wdDialogTwoLinesInOne);
    v.put("wdDialogFormatEncloseCharacters", wdDialogFormatEncloseCharacters);
    v.put("wdDialogConsistencyChecker", wdDialogConsistencyChecker);
    v.put("wdDialogToolsOptionsSmartTag", wdDialogToolsOptionsSmartTag);
    v.put("wdDialogFormatStylesCustom", wdDialogFormatStylesCustom);
    v.put("wdDialogCSSLinks", wdDialogCSSLinks);
    v.put("wdDialogInsertWebComponent", wdDialogInsertWebComponent);
    v.put("wdDialogToolsOptionsEditCopyPaste", wdDialogToolsOptionsEditCopyPaste);
    v.put("wdDialogToolsOptionsSecurity", wdDialogToolsOptionsSecurity);
    v.put("wdDialogSearch", wdDialogSearch);
    v.put("wdDialogShowRepairs", wdDialogShowRepairs);
    v.put("wdDialogMailMergeInsertAsk", wdDialogMailMergeInsertAsk);
    v.put("wdDialogMailMergeInsertFillIn", wdDialogMailMergeInsertFillIn);
    v.put("wdDialogMailMergeInsertIf", wdDialogMailMergeInsertIf);
    v.put("wdDialogMailMergeInsertNextIf", wdDialogMailMergeInsertNextIf);
    v.put("wdDialogMailMergeInsertSet", wdDialogMailMergeInsertSet);
    v.put("wdDialogMailMergeInsertSkipIf", wdDialogMailMergeInsertSkipIf);
    v.put("wdDialogMailMergeFieldMapping", wdDialogMailMergeFieldMapping);
    v.put("wdDialogMailMergeInsertAddressBlock", wdDialogMailMergeInsertAddressBlock);
    v.put("wdDialogMailMergeInsertGreetingLine", wdDialogMailMergeInsertGreetingLine);
    v.put("wdDialogMailMergeInsertFields", wdDialogMailMergeInsertFields);
    v.put("wdDialogMailMergeRecipients", wdDialogMailMergeRecipients);
    v.put("wdDialogMailMergeFindRecipient", wdDialogMailMergeFindRecipient);
    v.put("wdDialogMailMergeSetDocumentType", wdDialogMailMergeSetDocumentType);
    v.put("wdDialogLabelOptions", wdDialogLabelOptions);
    v.put("wdDialogXMLElementAttributes", wdDialogXMLElementAttributes);
    v.put("wdDialogSchemaLibrary", wdDialogSchemaLibrary);
    v.put("wdDialogPermission", wdDialogPermission);
    v.put("wdDialogMyPermission", wdDialogMyPermission);
    v.put("wdDialogXMLOptions", wdDialogXMLOptions);
    v.put("wdDialogFormattingRestrictions", wdDialogFormattingRestrictions);
    v.put("wdDialogSourceManager", wdDialogSourceManager);
    v.put("wdDialogCreateSource", wdDialogCreateSource);
    v.put("wdDialogDocumentInspector", wdDialogDocumentInspector);
    v.put("wdDialogStyleManagement", wdDialogStyleManagement);
    v.put("wdDialogInsertSource", wdDialogInsertSource);
    v.put("wdDialogOMathRecognizedFunctions", wdDialogOMathRecognizedFunctions);
    v.put("wdDialogInsertPlaceholder", wdDialogInsertPlaceholder);
    v.put("wdDialogBuildingBlockOrganizer", wdDialogBuildingBlockOrganizer);
    v.put("wdDialogContentControlProperties", wdDialogContentControlProperties);
    v.put("wdDialogCompatibilityChecker", wdDialogCompatibilityChecker);
    v.put("wdDialogExportAsFixedFormat", wdDialogExportAsFixedFormat);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
