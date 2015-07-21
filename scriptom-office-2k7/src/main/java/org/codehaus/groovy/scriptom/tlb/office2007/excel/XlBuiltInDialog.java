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
public final class XlBuiltInDialog
{
  private XlBuiltInDialog()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlDialogOpen = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlDialogOpenLinks = Integer.valueOf(2);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlDialogSaveAs = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlDialogFileDelete = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlDialogPageSetup = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlDialogPrint = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlDialogPrinterSetup = Integer.valueOf(9);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlDialogArrangeAll = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlDialogWindowSize = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlDialogWindowMove = Integer.valueOf(14);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlDialogRun = Integer.valueOf(17);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer xlDialogSetPrintTitles = Integer.valueOf(23);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer xlDialogFont = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer xlDialogDisplay = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer xlDialogProtectDocument = Integer.valueOf(28);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer xlDialogCalculation = Integer.valueOf(32);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer xlDialogExtract = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer xlDialogDataDelete = Integer.valueOf(36);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer xlDialogSort = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer xlDialogDataSeries = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer xlDialogTable = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer xlDialogFormatNumber = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer xlDialogAlignment = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer xlDialogStyle = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer xlDialogBorder = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer xlDialogCellProtection = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer xlDialogColumnWidth = Integer.valueOf(47);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer xlDialogClear = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer xlDialogPasteSpecial = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer xlDialogEditDelete = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer xlDialogInsert = Integer.valueOf(55);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer xlDialogPasteNames = Integer.valueOf(58);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer xlDialogDefineName = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer xlDialogCreateNames = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer xlDialogFormulaGoto = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer xlDialogFormulaFind = Integer.valueOf(64);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer xlDialogGalleryArea = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer xlDialogGalleryBar = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer xlDialogGalleryColumn = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer xlDialogGalleryLine = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer xlDialogGalleryPie = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer xlDialogGalleryScatter = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer xlDialogCombination = Integer.valueOf(73);

  /**
   * Value is 76 (0x4C)
   */
  public static final Integer xlDialogGridlines = Integer.valueOf(76);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer xlDialogAxes = Integer.valueOf(78);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer xlDialogAttachText = Integer.valueOf(80);

  /**
   * Value is 84 (0x54)
   */
  public static final Integer xlDialogPatterns = Integer.valueOf(84);

  /**
   * Value is 85 (0x55)
   */
  public static final Integer xlDialogMainChart = Integer.valueOf(85);

  /**
   * Value is 86 (0x56)
   */
  public static final Integer xlDialogOverlay = Integer.valueOf(86);

  /**
   * Value is 87 (0x57)
   */
  public static final Integer xlDialogScale = Integer.valueOf(87);

  /**
   * Value is 88 (0x58)
   */
  public static final Integer xlDialogFormatLegend = Integer.valueOf(88);

  /**
   * Value is 89 (0x59)
   */
  public static final Integer xlDialogFormatText = Integer.valueOf(89);

  /**
   * Value is 91 (0x5B)
   */
  public static final Integer xlDialogParse = Integer.valueOf(91);

  /**
   * Value is 94 (0x5E)
   */
  public static final Integer xlDialogUnhide = Integer.valueOf(94);

  /**
   * Value is 95 (0x5F)
   */
  public static final Integer xlDialogWorkspace = Integer.valueOf(95);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer xlDialogActivate = Integer.valueOf(103);

  /**
   * Value is 108 (0x6C)
   */
  public static final Integer xlDialogCopyPicture = Integer.valueOf(108);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer xlDialogDeleteName = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer xlDialogDeleteFormat = Integer.valueOf(111);

  /**
   * Value is 119 (0x77)
   */
  public static final Integer xlDialogNew = Integer.valueOf(119);

  /**
   * Value is 127 (0x7F)
   */
  public static final Integer xlDialogRowHeight = Integer.valueOf(127);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer xlDialogFormatMove = Integer.valueOf(128);

  /**
   * Value is 129 (0x81)
   */
  public static final Integer xlDialogFormatSize = Integer.valueOf(129);

  /**
   * Value is 130 (0x82)
   */
  public static final Integer xlDialogFormulaReplace = Integer.valueOf(130);

  /**
   * Value is 132 (0x84)
   */
  public static final Integer xlDialogSelectSpecial = Integer.valueOf(132);

  /**
   * Value is 133 (0x85)
   */
  public static final Integer xlDialogApplyNames = Integer.valueOf(133);

  /**
   * Value is 134 (0x86)
   */
  public static final Integer xlDialogReplaceFont = Integer.valueOf(134);

  /**
   * Value is 137 (0x89)
   */
  public static final Integer xlDialogSplit = Integer.valueOf(137);

  /**
   * Value is 142 (0x8E)
   */
  public static final Integer xlDialogOutline = Integer.valueOf(142);

  /**
   * Value is 145 (0x91)
   */
  public static final Integer xlDialogSaveWorkbook = Integer.valueOf(145);

  /**
   * Value is 147 (0x93)
   */
  public static final Integer xlDialogCopyChart = Integer.valueOf(147);

  /**
   * Value is 150 (0x96)
   */
  public static final Integer xlDialogFormatFont = Integer.valueOf(150);

  /**
   * Value is 154 (0x9A)
   */
  public static final Integer xlDialogNote = Integer.valueOf(154);

  /**
   * Value is 159 (0x9F)
   */
  public static final Integer xlDialogSetUpdateStatus = Integer.valueOf(159);

  /**
   * Value is 161 (0xA1)
   */
  public static final Integer xlDialogColorPalette = Integer.valueOf(161);

  /**
   * Value is 166 (0xA6)
   */
  public static final Integer xlDialogChangeLink = Integer.valueOf(166);

  /**
   * Value is 170 (0xAA)
   */
  public static final Integer xlDialogAppMove = Integer.valueOf(170);

  /**
   * Value is 171 (0xAB)
   */
  public static final Integer xlDialogAppSize = Integer.valueOf(171);

  /**
   * Value is 185 (0xB9)
   */
  public static final Integer xlDialogMainChartType = Integer.valueOf(185);

  /**
   * Value is 186 (0xBA)
   */
  public static final Integer xlDialogOverlayChartType = Integer.valueOf(186);

  /**
   * Value is 188 (0xBC)
   */
  public static final Integer xlDialogOpenMail = Integer.valueOf(188);

  /**
   * Value is 189 (0xBD)
   */
  public static final Integer xlDialogSendMail = Integer.valueOf(189);

  /**
   * Value is 190 (0xBE)
   */
  public static final Integer xlDialogStandardFont = Integer.valueOf(190);

  /**
   * Value is 191 (0xBF)
   */
  public static final Integer xlDialogConsolidate = Integer.valueOf(191);

  /**
   * Value is 192 (0xC0)
   */
  public static final Integer xlDialogSortSpecial = Integer.valueOf(192);

  /**
   * Value is 193 (0xC1)
   */
  public static final Integer xlDialogGallery3dArea = Integer.valueOf(193);

  /**
   * Value is 194 (0xC2)
   */
  public static final Integer xlDialogGallery3dColumn = Integer.valueOf(194);

  /**
   * Value is 195 (0xC3)
   */
  public static final Integer xlDialogGallery3dLine = Integer.valueOf(195);

  /**
   * Value is 196 (0xC4)
   */
  public static final Integer xlDialogGallery3dPie = Integer.valueOf(196);

  /**
   * Value is 197 (0xC5)
   */
  public static final Integer xlDialogView3d = Integer.valueOf(197);

  /**
   * Value is 198 (0xC6)
   */
  public static final Integer xlDialogGoalSeek = Integer.valueOf(198);

  /**
   * Value is 199 (0xC7)
   */
  public static final Integer xlDialogWorkgroup = Integer.valueOf(199);

  /**
   * Value is 200 (0xC8)
   */
  public static final Integer xlDialogFillGroup = Integer.valueOf(200);

  /**
   * Value is 201 (0xC9)
   */
  public static final Integer xlDialogUpdateLink = Integer.valueOf(201);

  /**
   * Value is 202 (0xCA)
   */
  public static final Integer xlDialogPromote = Integer.valueOf(202);

  /**
   * Value is 203 (0xCB)
   */
  public static final Integer xlDialogDemote = Integer.valueOf(203);

  /**
   * Value is 204 (0xCC)
   */
  public static final Integer xlDialogShowDetail = Integer.valueOf(204);

  /**
   * Value is 207 (0xCF)
   */
  public static final Integer xlDialogObjectProperties = Integer.valueOf(207);

  /**
   * Value is 208 (0xD0)
   */
  public static final Integer xlDialogSaveNewObject = Integer.valueOf(208);

  /**
   * Value is 212 (0xD4)
   */
  public static final Integer xlDialogApplyStyle = Integer.valueOf(212);

  /**
   * Value is 213 (0xD5)
   */
  public static final Integer xlDialogAssignToObject = Integer.valueOf(213);

  /**
   * Value is 214 (0xD6)
   */
  public static final Integer xlDialogObjectProtection = Integer.valueOf(214);

  /**
   * Value is 217 (0xD9)
   */
  public static final Integer xlDialogCreatePublisher = Integer.valueOf(217);

  /**
   * Value is 218 (0xDA)
   */
  public static final Integer xlDialogSubscribeTo = Integer.valueOf(218);

  /**
   * Value is 220 (0xDC)
   */
  public static final Integer xlDialogShowToolbar = Integer.valueOf(220);

  /**
   * Value is 222 (0xDE)
   */
  public static final Integer xlDialogPrintPreview = Integer.valueOf(222);

  /**
   * Value is 223 (0xDF)
   */
  public static final Integer xlDialogEditColor = Integer.valueOf(223);

  /**
   * Value is 225 (0xE1)
   */
  public static final Integer xlDialogFormatMain = Integer.valueOf(225);

  /**
   * Value is 226 (0xE2)
   */
  public static final Integer xlDialogFormatOverlay = Integer.valueOf(226);

  /**
   * Value is 228 (0xE4)
   */
  public static final Integer xlDialogEditSeries = Integer.valueOf(228);

  /**
   * Value is 229 (0xE5)
   */
  public static final Integer xlDialogDefineStyle = Integer.valueOf(229);

  /**
   * Value is 249 (0xF9)
   */
  public static final Integer xlDialogGalleryRadar = Integer.valueOf(249);

  /**
   * Value is 251 (0xFB)
   */
  public static final Integer xlDialogEditionOptions = Integer.valueOf(251);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer xlDialogZoom = Integer.valueOf(256);

  /**
   * Value is 259 (0x103)
   */
  public static final Integer xlDialogInsertObject = Integer.valueOf(259);

  /**
   * Value is 261 (0x105)
   */
  public static final Integer xlDialogSize = Integer.valueOf(261);

  /**
   * Value is 262 (0x106)
   */
  public static final Integer xlDialogMove = Integer.valueOf(262);

  /**
   * Value is 269 (0x10D)
   */
  public static final Integer xlDialogFormatAuto = Integer.valueOf(269);

  /**
   * Value is 272 (0x110)
   */
  public static final Integer xlDialogGallery3dBar = Integer.valueOf(272);

  /**
   * Value is 273 (0x111)
   */
  public static final Integer xlDialogGallery3dSurface = Integer.valueOf(273);

  /**
   * Value is 276 (0x114)
   */
  public static final Integer xlDialogCustomizeToolbar = Integer.valueOf(276);

  /**
   * Value is 281 (0x119)
   */
  public static final Integer xlDialogWorkbookAdd = Integer.valueOf(281);

  /**
   * Value is 282 (0x11A)
   */
  public static final Integer xlDialogWorkbookMove = Integer.valueOf(282);

  /**
   * Value is 283 (0x11B)
   */
  public static final Integer xlDialogWorkbookCopy = Integer.valueOf(283);

  /**
   * Value is 284 (0x11C)
   */
  public static final Integer xlDialogWorkbookOptions = Integer.valueOf(284);

  /**
   * Value is 285 (0x11D)
   */
  public static final Integer xlDialogSaveWorkspace = Integer.valueOf(285);

  /**
   * Value is 288 (0x120)
   */
  public static final Integer xlDialogChartWizard = Integer.valueOf(288);

  /**
   * Value is 293 (0x125)
   */
  public static final Integer xlDialogAssignToTool = Integer.valueOf(293);

  /**
   * Value is 300 (0x12C)
   */
  public static final Integer xlDialogPlacement = Integer.valueOf(300);

  /**
   * Value is 301 (0x12D)
   */
  public static final Integer xlDialogFillWorkgroup = Integer.valueOf(301);

  /**
   * Value is 302 (0x12E)
   */
  public static final Integer xlDialogWorkbookNew = Integer.valueOf(302);

  /**
   * Value is 305 (0x131)
   */
  public static final Integer xlDialogScenarioCells = Integer.valueOf(305);

  /**
   * Value is 307 (0x133)
   */
  public static final Integer xlDialogScenarioAdd = Integer.valueOf(307);

  /**
   * Value is 308 (0x134)
   */
  public static final Integer xlDialogScenarioEdit = Integer.valueOf(308);

  /**
   * Value is 311 (0x137)
   */
  public static final Integer xlDialogScenarioSummary = Integer.valueOf(311);

  /**
   * Value is 312 (0x138)
   */
  public static final Integer xlDialogPivotTableWizard = Integer.valueOf(312);

  /**
   * Value is 313 (0x139)
   */
  public static final Integer xlDialogPivotFieldProperties = Integer.valueOf(313);

  /**
   * Value is 318 (0x13E)
   */
  public static final Integer xlDialogOptionsCalculation = Integer.valueOf(318);

  /**
   * Value is 319 (0x13F)
   */
  public static final Integer xlDialogOptionsEdit = Integer.valueOf(319);

  /**
   * Value is 320 (0x140)
   */
  public static final Integer xlDialogOptionsView = Integer.valueOf(320);

  /**
   * Value is 321 (0x141)
   */
  public static final Integer xlDialogAddinManager = Integer.valueOf(321);

  /**
   * Value is 322 (0x142)
   */
  public static final Integer xlDialogMenuEditor = Integer.valueOf(322);

  /**
   * Value is 323 (0x143)
   */
  public static final Integer xlDialogAttachToolbars = Integer.valueOf(323);

  /**
   * Value is 325 (0x145)
   */
  public static final Integer xlDialogOptionsChart = Integer.valueOf(325);

  /**
   * Value is 328 (0x148)
   */
  public static final Integer xlDialogVbaInsertFile = Integer.valueOf(328);

  /**
   * Value is 330 (0x14A)
   */
  public static final Integer xlDialogVbaProcedureDefinition = Integer.valueOf(330);

  /**
   * Value is 336 (0x150)
   */
  public static final Integer xlDialogRoutingSlip = Integer.valueOf(336);

  /**
   * Value is 339 (0x153)
   */
  public static final Integer xlDialogMailLogon = Integer.valueOf(339);

  /**
   * Value is 342 (0x156)
   */
  public static final Integer xlDialogInsertPicture = Integer.valueOf(342);

  /**
   * Value is 344 (0x158)
   */
  public static final Integer xlDialogGalleryDoughnut = Integer.valueOf(344);

  /**
   * Value is 350 (0x15E)
   */
  public static final Integer xlDialogChartTrend = Integer.valueOf(350);

  /**
   * Value is 354 (0x162)
   */
  public static final Integer xlDialogWorkbookInsert = Integer.valueOf(354);

  /**
   * Value is 355 (0x163)
   */
  public static final Integer xlDialogOptionsTransition = Integer.valueOf(355);

  /**
   * Value is 356 (0x164)
   */
  public static final Integer xlDialogOptionsGeneral = Integer.valueOf(356);

  /**
   * Value is 370 (0x172)
   */
  public static final Integer xlDialogFilterAdvanced = Integer.valueOf(370);

  /**
   * Value is 378 (0x17A)
   */
  public static final Integer xlDialogMailNextLetter = Integer.valueOf(378);

  /**
   * Value is 379 (0x17B)
   */
  public static final Integer xlDialogDataLabel = Integer.valueOf(379);

  /**
   * Value is 380 (0x17C)
   */
  public static final Integer xlDialogInsertTitle = Integer.valueOf(380);

  /**
   * Value is 381 (0x17D)
   */
  public static final Integer xlDialogFontProperties = Integer.valueOf(381);

  /**
   * Value is 382 (0x17E)
   */
  public static final Integer xlDialogMacroOptions = Integer.valueOf(382);

  /**
   * Value is 384 (0x180)
   */
  public static final Integer xlDialogWorkbookUnhide = Integer.valueOf(384);

  /**
   * Value is 386 (0x182)
   */
  public static final Integer xlDialogWorkbookName = Integer.valueOf(386);

  /**
   * Value is 388 (0x184)
   */
  public static final Integer xlDialogGalleryCustom = Integer.valueOf(388);

  /**
   * Value is 390 (0x186)
   */
  public static final Integer xlDialogAddChartAutoformat = Integer.valueOf(390);

  /**
   * Value is 392 (0x188)
   */
  public static final Integer xlDialogChartAddData = Integer.valueOf(392);

  /**
   * Value is 394 (0x18A)
   */
  public static final Integer xlDialogTabOrder = Integer.valueOf(394);

  /**
   * Value is 398 (0x18E)
   */
  public static final Integer xlDialogSubtotalCreate = Integer.valueOf(398);

  /**
   * Value is 415 (0x19F)
   */
  public static final Integer xlDialogWorkbookTabSplit = Integer.valueOf(415);

  /**
   * Value is 417 (0x1A1)
   */
  public static final Integer xlDialogWorkbookProtect = Integer.valueOf(417);

  /**
   * Value is 420 (0x1A4)
   */
  public static final Integer xlDialogScrollbarProperties = Integer.valueOf(420);

  /**
   * Value is 421 (0x1A5)
   */
  public static final Integer xlDialogPivotShowPages = Integer.valueOf(421);

  /**
   * Value is 422 (0x1A6)
   */
  public static final Integer xlDialogTextToColumns = Integer.valueOf(422);

  /**
   * Value is 423 (0x1A7)
   */
  public static final Integer xlDialogFormatCharttype = Integer.valueOf(423);

  /**
   * Value is 433 (0x1B1)
   */
  public static final Integer xlDialogPivotFieldGroup = Integer.valueOf(433);

  /**
   * Value is 434 (0x1B2)
   */
  public static final Integer xlDialogPivotFieldUngroup = Integer.valueOf(434);

  /**
   * Value is 435 (0x1B3)
   */
  public static final Integer xlDialogCheckboxProperties = Integer.valueOf(435);

  /**
   * Value is 436 (0x1B4)
   */
  public static final Integer xlDialogLabelProperties = Integer.valueOf(436);

  /**
   * Value is 437 (0x1B5)
   */
  public static final Integer xlDialogListboxProperties = Integer.valueOf(437);

  /**
   * Value is 438 (0x1B6)
   */
  public static final Integer xlDialogEditboxProperties = Integer.valueOf(438);

  /**
   * Value is 441 (0x1B9)
   */
  public static final Integer xlDialogOpenText = Integer.valueOf(441);

  /**
   * Value is 445 (0x1BD)
   */
  public static final Integer xlDialogPushbuttonProperties = Integer.valueOf(445);

  /**
   * Value is 447 (0x1BF)
   */
  public static final Integer xlDialogFilter = Integer.valueOf(447);

  /**
   * Value is 450 (0x1C2)
   */
  public static final Integer xlDialogFunctionWizard = Integer.valueOf(450);

  /**
   * Value is 456 (0x1C8)
   */
  public static final Integer xlDialogSaveCopyAs = Integer.valueOf(456);

  /**
   * Value is 458 (0x1CA)
   */
  public static final Integer xlDialogOptionsListsAdd = Integer.valueOf(458);

  /**
   * Value is 460 (0x1CC)
   */
  public static final Integer xlDialogSeriesAxes = Integer.valueOf(460);

  /**
   * Value is 461 (0x1CD)
   */
  public static final Integer xlDialogSeriesX = Integer.valueOf(461);

  /**
   * Value is 462 (0x1CE)
   */
  public static final Integer xlDialogSeriesY = Integer.valueOf(462);

  /**
   * Value is 463 (0x1CF)
   */
  public static final Integer xlDialogErrorbarX = Integer.valueOf(463);

  /**
   * Value is 464 (0x1D0)
   */
  public static final Integer xlDialogErrorbarY = Integer.valueOf(464);

  /**
   * Value is 465 (0x1D1)
   */
  public static final Integer xlDialogFormatChart = Integer.valueOf(465);

  /**
   * Value is 466 (0x1D2)
   */
  public static final Integer xlDialogSeriesOrder = Integer.valueOf(466);

  /**
   * Value is 470 (0x1D6)
   */
  public static final Integer xlDialogMailEditMailer = Integer.valueOf(470);

  /**
   * Value is 472 (0x1D8)
   */
  public static final Integer xlDialogStandardWidth = Integer.valueOf(472);

  /**
   * Value is 473 (0x1D9)
   */
  public static final Integer xlDialogScenarioMerge = Integer.valueOf(473);

  /**
   * Value is 474 (0x1DA)
   */
  public static final Integer xlDialogProperties = Integer.valueOf(474);

  /**
   * Value is 474 (0x1DA)
   */
  public static final Integer xlDialogSummaryInfo = Integer.valueOf(474);

  /**
   * Value is 475 (0x1DB)
   */
  public static final Integer xlDialogFindFile = Integer.valueOf(475);

  /**
   * Value is 476 (0x1DC)
   */
  public static final Integer xlDialogActiveCellFont = Integer.valueOf(476);

  /**
   * Value is 478 (0x1DE)
   */
  public static final Integer xlDialogVbaMakeAddin = Integer.valueOf(478);

  /**
   * Value is 481 (0x1E1)
   */
  public static final Integer xlDialogFileSharing = Integer.valueOf(481);

  /**
   * Value is 485 (0x1E5)
   */
  public static final Integer xlDialogAutoCorrect = Integer.valueOf(485);

  /**
   * Value is 493 (0x1ED)
   */
  public static final Integer xlDialogCustomViews = Integer.valueOf(493);

  /**
   * Value is 496 (0x1F0)
   */
  public static final Integer xlDialogInsertNameLabel = Integer.valueOf(496);

  /**
   * Value is 504 (0x1F8)
   */
  public static final Integer xlDialogSeriesShape = Integer.valueOf(504);

  /**
   * Value is 505 (0x1F9)
   */
  public static final Integer xlDialogChartOptionsDataLabels = Integer.valueOf(505);

  /**
   * Value is 506 (0x1FA)
   */
  public static final Integer xlDialogChartOptionsDataTable = Integer.valueOf(506);

  /**
   * Value is 509 (0x1FD)
   */
  public static final Integer xlDialogSetBackgroundPicture = Integer.valueOf(509);

  /**
   * Value is 525 (0x20D)
   */
  public static final Integer xlDialogDataValidation = Integer.valueOf(525);

  /**
   * Value is 526 (0x20E)
   */
  public static final Integer xlDialogChartType = Integer.valueOf(526);

  /**
   * Value is 527 (0x20F)
   */
  public static final Integer xlDialogChartLocation = Integer.valueOf(527);

  /**
   * Value is 538 (0x21A)
   */
  public static final Integer _xlDialogPhonetic = Integer.valueOf(538);

  /**
   * Value is 540 (0x21C)
   */
  public static final Integer xlDialogChartSourceData = Integer.valueOf(540);

  /**
   * Value is 541 (0x21D)
   */
  public static final Integer _xlDialogChartSourceData = Integer.valueOf(541);

  /**
   * Value is 557 (0x22D)
   */
  public static final Integer xlDialogSeriesOptions = Integer.valueOf(557);

  /**
   * Value is 567 (0x237)
   */
  public static final Integer xlDialogPivotTableOptions = Integer.valueOf(567);

  /**
   * Value is 568 (0x238)
   */
  public static final Integer xlDialogPivotSolveOrder = Integer.valueOf(568);

  /**
   * Value is 570 (0x23A)
   */
  public static final Integer xlDialogPivotCalculatedField = Integer.valueOf(570);

  /**
   * Value is 572 (0x23C)
   */
  public static final Integer xlDialogPivotCalculatedItem = Integer.valueOf(572);

  /**
   * Value is 583 (0x247)
   */
  public static final Integer xlDialogConditionalFormatting = Integer.valueOf(583);

  /**
   * Value is 596 (0x254)
   */
  public static final Integer xlDialogInsertHyperlink = Integer.valueOf(596);

  /**
   * Value is 620 (0x26C)
   */
  public static final Integer xlDialogProtectSharing = Integer.valueOf(620);

  /**
   * Value is 647 (0x287)
   */
  public static final Integer xlDialogOptionsME = Integer.valueOf(647);

  /**
   * Value is 653 (0x28D)
   */
  public static final Integer xlDialogPublishAsWebPage = Integer.valueOf(653);

  /**
   * Value is 656 (0x290)
   */
  public static final Integer xlDialogPhonetic = Integer.valueOf(656);

  /**
   * Value is 667 (0x29B)
   */
  public static final Integer xlDialogNewWebQuery = Integer.valueOf(667);

  /**
   * Value is 666 (0x29A)
   */
  public static final Integer xlDialogImportTextFile = Integer.valueOf(666);

  /**
   * Value is 530 (0x212)
   */
  public static final Integer xlDialogExternalDataProperties = Integer.valueOf(530);

  /**
   * Value is 683 (0x2AB)
   */
  public static final Integer xlDialogWebOptionsGeneral = Integer.valueOf(683);

  /**
   * Value is 684 (0x2AC)
   */
  public static final Integer xlDialogWebOptionsFiles = Integer.valueOf(684);

  /**
   * Value is 685 (0x2AD)
   */
  public static final Integer xlDialogWebOptionsPictures = Integer.valueOf(685);

  /**
   * Value is 686 (0x2AE)
   */
  public static final Integer xlDialogWebOptionsEncoding = Integer.valueOf(686);

  /**
   * Value is 687 (0x2AF)
   */
  public static final Integer xlDialogWebOptionsFonts = Integer.valueOf(687);

  /**
   * Value is 689 (0x2B1)
   */
  public static final Integer xlDialogPivotClientServerSet = Integer.valueOf(689);

  /**
   * Value is 754 (0x2F2)
   */
  public static final Integer xlDialogPropertyFields = Integer.valueOf(754);

  /**
   * Value is 731 (0x2DB)
   */
  public static final Integer xlDialogSearch = Integer.valueOf(731);

  /**
   * Value is 709 (0x2C5)
   */
  public static final Integer xlDialogEvaluateFormula = Integer.valueOf(709);

  /**
   * Value is 723 (0x2D3)
   */
  public static final Integer xlDialogDataLabelMultiple = Integer.valueOf(723);

  /**
   * Value is 724 (0x2D4)
   */
  public static final Integer xlDialogChartOptionsDataLabelMultiple = Integer.valueOf(724);

  /**
   * Value is 732 (0x2DC)
   */
  public static final Integer xlDialogErrorChecking = Integer.valueOf(732);

  /**
   * Value is 773 (0x305)
   */
  public static final Integer xlDialogWebOptionsBrowsers = Integer.valueOf(773);

  /**
   * Value is 796 (0x31C)
   */
  public static final Integer xlDialogCreateList = Integer.valueOf(796);

  /**
   * Value is 832 (0x340)
   */
  public static final Integer xlDialogPermission = Integer.valueOf(832);

  /**
   * Value is 834 (0x342)
   */
  public static final Integer xlDialogMyPermission = Integer.valueOf(834);

  /**
   * Value is 862 (0x35E)
   */
  public static final Integer xlDialogDocumentInspector = Integer.valueOf(862);

  /**
   * Value is 977 (0x3D1)
   */
  public static final Integer xlDialogNameManager = Integer.valueOf(977);

  /**
   * Value is 978 (0x3D2)
   */
  public static final Integer xlDialogNewName = Integer.valueOf(978);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlDialogOpen", xlDialogOpen);
    v.put("xlDialogOpenLinks", xlDialogOpenLinks);
    v.put("xlDialogSaveAs", xlDialogSaveAs);
    v.put("xlDialogFileDelete", xlDialogFileDelete);
    v.put("xlDialogPageSetup", xlDialogPageSetup);
    v.put("xlDialogPrint", xlDialogPrint);
    v.put("xlDialogPrinterSetup", xlDialogPrinterSetup);
    v.put("xlDialogArrangeAll", xlDialogArrangeAll);
    v.put("xlDialogWindowSize", xlDialogWindowSize);
    v.put("xlDialogWindowMove", xlDialogWindowMove);
    v.put("xlDialogRun", xlDialogRun);
    v.put("xlDialogSetPrintTitles", xlDialogSetPrintTitles);
    v.put("xlDialogFont", xlDialogFont);
    v.put("xlDialogDisplay", xlDialogDisplay);
    v.put("xlDialogProtectDocument", xlDialogProtectDocument);
    v.put("xlDialogCalculation", xlDialogCalculation);
    v.put("xlDialogExtract", xlDialogExtract);
    v.put("xlDialogDataDelete", xlDialogDataDelete);
    v.put("xlDialogSort", xlDialogSort);
    v.put("xlDialogDataSeries", xlDialogDataSeries);
    v.put("xlDialogTable", xlDialogTable);
    v.put("xlDialogFormatNumber", xlDialogFormatNumber);
    v.put("xlDialogAlignment", xlDialogAlignment);
    v.put("xlDialogStyle", xlDialogStyle);
    v.put("xlDialogBorder", xlDialogBorder);
    v.put("xlDialogCellProtection", xlDialogCellProtection);
    v.put("xlDialogColumnWidth", xlDialogColumnWidth);
    v.put("xlDialogClear", xlDialogClear);
    v.put("xlDialogPasteSpecial", xlDialogPasteSpecial);
    v.put("xlDialogEditDelete", xlDialogEditDelete);
    v.put("xlDialogInsert", xlDialogInsert);
    v.put("xlDialogPasteNames", xlDialogPasteNames);
    v.put("xlDialogDefineName", xlDialogDefineName);
    v.put("xlDialogCreateNames", xlDialogCreateNames);
    v.put("xlDialogFormulaGoto", xlDialogFormulaGoto);
    v.put("xlDialogFormulaFind", xlDialogFormulaFind);
    v.put("xlDialogGalleryArea", xlDialogGalleryArea);
    v.put("xlDialogGalleryBar", xlDialogGalleryBar);
    v.put("xlDialogGalleryColumn", xlDialogGalleryColumn);
    v.put("xlDialogGalleryLine", xlDialogGalleryLine);
    v.put("xlDialogGalleryPie", xlDialogGalleryPie);
    v.put("xlDialogGalleryScatter", xlDialogGalleryScatter);
    v.put("xlDialogCombination", xlDialogCombination);
    v.put("xlDialogGridlines", xlDialogGridlines);
    v.put("xlDialogAxes", xlDialogAxes);
    v.put("xlDialogAttachText", xlDialogAttachText);
    v.put("xlDialogPatterns", xlDialogPatterns);
    v.put("xlDialogMainChart", xlDialogMainChart);
    v.put("xlDialogOverlay", xlDialogOverlay);
    v.put("xlDialogScale", xlDialogScale);
    v.put("xlDialogFormatLegend", xlDialogFormatLegend);
    v.put("xlDialogFormatText", xlDialogFormatText);
    v.put("xlDialogParse", xlDialogParse);
    v.put("xlDialogUnhide", xlDialogUnhide);
    v.put("xlDialogWorkspace", xlDialogWorkspace);
    v.put("xlDialogActivate", xlDialogActivate);
    v.put("xlDialogCopyPicture", xlDialogCopyPicture);
    v.put("xlDialogDeleteName", xlDialogDeleteName);
    v.put("xlDialogDeleteFormat", xlDialogDeleteFormat);
    v.put("xlDialogNew", xlDialogNew);
    v.put("xlDialogRowHeight", xlDialogRowHeight);
    v.put("xlDialogFormatMove", xlDialogFormatMove);
    v.put("xlDialogFormatSize", xlDialogFormatSize);
    v.put("xlDialogFormulaReplace", xlDialogFormulaReplace);
    v.put("xlDialogSelectSpecial", xlDialogSelectSpecial);
    v.put("xlDialogApplyNames", xlDialogApplyNames);
    v.put("xlDialogReplaceFont", xlDialogReplaceFont);
    v.put("xlDialogSplit", xlDialogSplit);
    v.put("xlDialogOutline", xlDialogOutline);
    v.put("xlDialogSaveWorkbook", xlDialogSaveWorkbook);
    v.put("xlDialogCopyChart", xlDialogCopyChart);
    v.put("xlDialogFormatFont", xlDialogFormatFont);
    v.put("xlDialogNote", xlDialogNote);
    v.put("xlDialogSetUpdateStatus", xlDialogSetUpdateStatus);
    v.put("xlDialogColorPalette", xlDialogColorPalette);
    v.put("xlDialogChangeLink", xlDialogChangeLink);
    v.put("xlDialogAppMove", xlDialogAppMove);
    v.put("xlDialogAppSize", xlDialogAppSize);
    v.put("xlDialogMainChartType", xlDialogMainChartType);
    v.put("xlDialogOverlayChartType", xlDialogOverlayChartType);
    v.put("xlDialogOpenMail", xlDialogOpenMail);
    v.put("xlDialogSendMail", xlDialogSendMail);
    v.put("xlDialogStandardFont", xlDialogStandardFont);
    v.put("xlDialogConsolidate", xlDialogConsolidate);
    v.put("xlDialogSortSpecial", xlDialogSortSpecial);
    v.put("xlDialogGallery3dArea", xlDialogGallery3dArea);
    v.put("xlDialogGallery3dColumn", xlDialogGallery3dColumn);
    v.put("xlDialogGallery3dLine", xlDialogGallery3dLine);
    v.put("xlDialogGallery3dPie", xlDialogGallery3dPie);
    v.put("xlDialogView3d", xlDialogView3d);
    v.put("xlDialogGoalSeek", xlDialogGoalSeek);
    v.put("xlDialogWorkgroup", xlDialogWorkgroup);
    v.put("xlDialogFillGroup", xlDialogFillGroup);
    v.put("xlDialogUpdateLink", xlDialogUpdateLink);
    v.put("xlDialogPromote", xlDialogPromote);
    v.put("xlDialogDemote", xlDialogDemote);
    v.put("xlDialogShowDetail", xlDialogShowDetail);
    v.put("xlDialogObjectProperties", xlDialogObjectProperties);
    v.put("xlDialogSaveNewObject", xlDialogSaveNewObject);
    v.put("xlDialogApplyStyle", xlDialogApplyStyle);
    v.put("xlDialogAssignToObject", xlDialogAssignToObject);
    v.put("xlDialogObjectProtection", xlDialogObjectProtection);
    v.put("xlDialogCreatePublisher", xlDialogCreatePublisher);
    v.put("xlDialogSubscribeTo", xlDialogSubscribeTo);
    v.put("xlDialogShowToolbar", xlDialogShowToolbar);
    v.put("xlDialogPrintPreview", xlDialogPrintPreview);
    v.put("xlDialogEditColor", xlDialogEditColor);
    v.put("xlDialogFormatMain", xlDialogFormatMain);
    v.put("xlDialogFormatOverlay", xlDialogFormatOverlay);
    v.put("xlDialogEditSeries", xlDialogEditSeries);
    v.put("xlDialogDefineStyle", xlDialogDefineStyle);
    v.put("xlDialogGalleryRadar", xlDialogGalleryRadar);
    v.put("xlDialogEditionOptions", xlDialogEditionOptions);
    v.put("xlDialogZoom", xlDialogZoom);
    v.put("xlDialogInsertObject", xlDialogInsertObject);
    v.put("xlDialogSize", xlDialogSize);
    v.put("xlDialogMove", xlDialogMove);
    v.put("xlDialogFormatAuto", xlDialogFormatAuto);
    v.put("xlDialogGallery3dBar", xlDialogGallery3dBar);
    v.put("xlDialogGallery3dSurface", xlDialogGallery3dSurface);
    v.put("xlDialogCustomizeToolbar", xlDialogCustomizeToolbar);
    v.put("xlDialogWorkbookAdd", xlDialogWorkbookAdd);
    v.put("xlDialogWorkbookMove", xlDialogWorkbookMove);
    v.put("xlDialogWorkbookCopy", xlDialogWorkbookCopy);
    v.put("xlDialogWorkbookOptions", xlDialogWorkbookOptions);
    v.put("xlDialogSaveWorkspace", xlDialogSaveWorkspace);
    v.put("xlDialogChartWizard", xlDialogChartWizard);
    v.put("xlDialogAssignToTool", xlDialogAssignToTool);
    v.put("xlDialogPlacement", xlDialogPlacement);
    v.put("xlDialogFillWorkgroup", xlDialogFillWorkgroup);
    v.put("xlDialogWorkbookNew", xlDialogWorkbookNew);
    v.put("xlDialogScenarioCells", xlDialogScenarioCells);
    v.put("xlDialogScenarioAdd", xlDialogScenarioAdd);
    v.put("xlDialogScenarioEdit", xlDialogScenarioEdit);
    v.put("xlDialogScenarioSummary", xlDialogScenarioSummary);
    v.put("xlDialogPivotTableWizard", xlDialogPivotTableWizard);
    v.put("xlDialogPivotFieldProperties", xlDialogPivotFieldProperties);
    v.put("xlDialogOptionsCalculation", xlDialogOptionsCalculation);
    v.put("xlDialogOptionsEdit", xlDialogOptionsEdit);
    v.put("xlDialogOptionsView", xlDialogOptionsView);
    v.put("xlDialogAddinManager", xlDialogAddinManager);
    v.put("xlDialogMenuEditor", xlDialogMenuEditor);
    v.put("xlDialogAttachToolbars", xlDialogAttachToolbars);
    v.put("xlDialogOptionsChart", xlDialogOptionsChart);
    v.put("xlDialogVbaInsertFile", xlDialogVbaInsertFile);
    v.put("xlDialogVbaProcedureDefinition", xlDialogVbaProcedureDefinition);
    v.put("xlDialogRoutingSlip", xlDialogRoutingSlip);
    v.put("xlDialogMailLogon", xlDialogMailLogon);
    v.put("xlDialogInsertPicture", xlDialogInsertPicture);
    v.put("xlDialogGalleryDoughnut", xlDialogGalleryDoughnut);
    v.put("xlDialogChartTrend", xlDialogChartTrend);
    v.put("xlDialogWorkbookInsert", xlDialogWorkbookInsert);
    v.put("xlDialogOptionsTransition", xlDialogOptionsTransition);
    v.put("xlDialogOptionsGeneral", xlDialogOptionsGeneral);
    v.put("xlDialogFilterAdvanced", xlDialogFilterAdvanced);
    v.put("xlDialogMailNextLetter", xlDialogMailNextLetter);
    v.put("xlDialogDataLabel", xlDialogDataLabel);
    v.put("xlDialogInsertTitle", xlDialogInsertTitle);
    v.put("xlDialogFontProperties", xlDialogFontProperties);
    v.put("xlDialogMacroOptions", xlDialogMacroOptions);
    v.put("xlDialogWorkbookUnhide", xlDialogWorkbookUnhide);
    v.put("xlDialogWorkbookName", xlDialogWorkbookName);
    v.put("xlDialogGalleryCustom", xlDialogGalleryCustom);
    v.put("xlDialogAddChartAutoformat", xlDialogAddChartAutoformat);
    v.put("xlDialogChartAddData", xlDialogChartAddData);
    v.put("xlDialogTabOrder", xlDialogTabOrder);
    v.put("xlDialogSubtotalCreate", xlDialogSubtotalCreate);
    v.put("xlDialogWorkbookTabSplit", xlDialogWorkbookTabSplit);
    v.put("xlDialogWorkbookProtect", xlDialogWorkbookProtect);
    v.put("xlDialogScrollbarProperties", xlDialogScrollbarProperties);
    v.put("xlDialogPivotShowPages", xlDialogPivotShowPages);
    v.put("xlDialogTextToColumns", xlDialogTextToColumns);
    v.put("xlDialogFormatCharttype", xlDialogFormatCharttype);
    v.put("xlDialogPivotFieldGroup", xlDialogPivotFieldGroup);
    v.put("xlDialogPivotFieldUngroup", xlDialogPivotFieldUngroup);
    v.put("xlDialogCheckboxProperties", xlDialogCheckboxProperties);
    v.put("xlDialogLabelProperties", xlDialogLabelProperties);
    v.put("xlDialogListboxProperties", xlDialogListboxProperties);
    v.put("xlDialogEditboxProperties", xlDialogEditboxProperties);
    v.put("xlDialogOpenText", xlDialogOpenText);
    v.put("xlDialogPushbuttonProperties", xlDialogPushbuttonProperties);
    v.put("xlDialogFilter", xlDialogFilter);
    v.put("xlDialogFunctionWizard", xlDialogFunctionWizard);
    v.put("xlDialogSaveCopyAs", xlDialogSaveCopyAs);
    v.put("xlDialogOptionsListsAdd", xlDialogOptionsListsAdd);
    v.put("xlDialogSeriesAxes", xlDialogSeriesAxes);
    v.put("xlDialogSeriesX", xlDialogSeriesX);
    v.put("xlDialogSeriesY", xlDialogSeriesY);
    v.put("xlDialogErrorbarX", xlDialogErrorbarX);
    v.put("xlDialogErrorbarY", xlDialogErrorbarY);
    v.put("xlDialogFormatChart", xlDialogFormatChart);
    v.put("xlDialogSeriesOrder", xlDialogSeriesOrder);
    v.put("xlDialogMailEditMailer", xlDialogMailEditMailer);
    v.put("xlDialogStandardWidth", xlDialogStandardWidth);
    v.put("xlDialogScenarioMerge", xlDialogScenarioMerge);
    v.put("xlDialogProperties", xlDialogProperties);
    v.put("xlDialogSummaryInfo", xlDialogSummaryInfo);
    v.put("xlDialogFindFile", xlDialogFindFile);
    v.put("xlDialogActiveCellFont", xlDialogActiveCellFont);
    v.put("xlDialogVbaMakeAddin", xlDialogVbaMakeAddin);
    v.put("xlDialogFileSharing", xlDialogFileSharing);
    v.put("xlDialogAutoCorrect", xlDialogAutoCorrect);
    v.put("xlDialogCustomViews", xlDialogCustomViews);
    v.put("xlDialogInsertNameLabel", xlDialogInsertNameLabel);
    v.put("xlDialogSeriesShape", xlDialogSeriesShape);
    v.put("xlDialogChartOptionsDataLabels", xlDialogChartOptionsDataLabels);
    v.put("xlDialogChartOptionsDataTable", xlDialogChartOptionsDataTable);
    v.put("xlDialogSetBackgroundPicture", xlDialogSetBackgroundPicture);
    v.put("xlDialogDataValidation", xlDialogDataValidation);
    v.put("xlDialogChartType", xlDialogChartType);
    v.put("xlDialogChartLocation", xlDialogChartLocation);
    v.put("_xlDialogPhonetic", _xlDialogPhonetic);
    v.put("xlDialogChartSourceData", xlDialogChartSourceData);
    v.put("_xlDialogChartSourceData", _xlDialogChartSourceData);
    v.put("xlDialogSeriesOptions", xlDialogSeriesOptions);
    v.put("xlDialogPivotTableOptions", xlDialogPivotTableOptions);
    v.put("xlDialogPivotSolveOrder", xlDialogPivotSolveOrder);
    v.put("xlDialogPivotCalculatedField", xlDialogPivotCalculatedField);
    v.put("xlDialogPivotCalculatedItem", xlDialogPivotCalculatedItem);
    v.put("xlDialogConditionalFormatting", xlDialogConditionalFormatting);
    v.put("xlDialogInsertHyperlink", xlDialogInsertHyperlink);
    v.put("xlDialogProtectSharing", xlDialogProtectSharing);
    v.put("xlDialogOptionsME", xlDialogOptionsME);
    v.put("xlDialogPublishAsWebPage", xlDialogPublishAsWebPage);
    v.put("xlDialogPhonetic", xlDialogPhonetic);
    v.put("xlDialogNewWebQuery", xlDialogNewWebQuery);
    v.put("xlDialogImportTextFile", xlDialogImportTextFile);
    v.put("xlDialogExternalDataProperties", xlDialogExternalDataProperties);
    v.put("xlDialogWebOptionsGeneral", xlDialogWebOptionsGeneral);
    v.put("xlDialogWebOptionsFiles", xlDialogWebOptionsFiles);
    v.put("xlDialogWebOptionsPictures", xlDialogWebOptionsPictures);
    v.put("xlDialogWebOptionsEncoding", xlDialogWebOptionsEncoding);
    v.put("xlDialogWebOptionsFonts", xlDialogWebOptionsFonts);
    v.put("xlDialogPivotClientServerSet", xlDialogPivotClientServerSet);
    v.put("xlDialogPropertyFields", xlDialogPropertyFields);
    v.put("xlDialogSearch", xlDialogSearch);
    v.put("xlDialogEvaluateFormula", xlDialogEvaluateFormula);
    v.put("xlDialogDataLabelMultiple", xlDialogDataLabelMultiple);
    v.put("xlDialogChartOptionsDataLabelMultiple", xlDialogChartOptionsDataLabelMultiple);
    v.put("xlDialogErrorChecking", xlDialogErrorChecking);
    v.put("xlDialogWebOptionsBrowsers", xlDialogWebOptionsBrowsers);
    v.put("xlDialogCreateList", xlDialogCreateList);
    v.put("xlDialogPermission", xlDialogPermission);
    v.put("xlDialogMyPermission", xlDialogMyPermission);
    v.put("xlDialogDocumentInspector", xlDialogDocumentInspector);
    v.put("xlDialogNameManager", xlDialogNameManager);
    v.put("xlDialogNewName", xlDialogNewName);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
