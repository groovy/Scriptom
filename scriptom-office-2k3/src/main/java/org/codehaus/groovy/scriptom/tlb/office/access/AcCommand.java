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
package org.codehaus.groovy.scriptom.tlb.office.access;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class AcCommand
{
  private AcCommand()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acCmdWindowUnhide = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acCmdWindowHide = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acCmdExit = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acCmdCompactDatabase = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer acCmdEncryptDecryptDatabase = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer acCmdRepairDatabase = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer acCmdMakeMDEFile = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer acCmdMoreWindows = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer acCmdAppRestore = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer acCmdAppMaximize = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer acCmdAppMinimize = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer acCmdAppMove = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer acCmdAppSize = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer acCmdDocRestore = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer acCmdDocMaximize = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer acCmdDocMove = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer acCmdDocSize = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer acCmdRefresh = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer acCmdFont = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer acCmdSave = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer acCmdSaveAs = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer acCmdWindowCascade = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer acCmdTileVertically = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer acCmdWindowArrangeIcons = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer acCmdOpenDatabase = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer acCmdNewDatabase = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer acCmdOLEDDELinks = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer acCmdRecordsGoToNew = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer acCmdReplace = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer acCmdFind = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer acCmdRunMacro = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer acCmdPageSetup = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer acCmdInsertObject = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer acCmdDuplicate = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer acCmdAboutMicrosoftAccess = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer acCmdFormHdrFtr = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer acCmdReportHdrFtr = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer acCmdPasteAppend = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer acCmdInsertFile = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer acCmdSelectForm = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer acCmdTabOrder = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer acCmdFieldList = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer acCmdAlignLeft = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer acCmdAlignRight = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer acCmdAlignTop = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer acCmdAlignBottom = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer acCmdAlignToGrid = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer acCmdSizeToGrid = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer acCmdOptions = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer acCmdSelectRecord = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer acCmdSortingAndGrouping = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer acCmdBringToFront = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer acCmdSendToBack = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer acCmdPrintPreview = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer acCmdApplyDefault = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer acCmdSetControlDefaults = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer acCmdOLEObjectDefaultVerb = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer acCmdClose = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer acCmdSizeToFit = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer acCmdDocMinimize = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer acCmdViewRuler = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer acCmdSnapToGrid = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer acCmdViewGrid = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer acCmdPasteSpecial = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer acCmdRecordsGoToNext = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer acCmdRecordsGoToPrevious = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer acCmdRecordsGoToFirst = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer acCmdRecordsGoToLast = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer acCmdSizeToFitForm = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer acCmdEditingAllowed = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer acCmdClearGrid = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer acCmdJoinProperties = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer acCmdQueryTotals = Integer.valueOf(73);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer acCmdQueryTypeCrosstab = Integer.valueOf(74);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer acCmdTableNames = Integer.valueOf(75);

  /**
   * Value is 76 (0x4C)
   */
  public static final Integer acCmdQueryParameters = Integer.valueOf(76);

  /**
   * Value is 77 (0x4D)
   */
  public static final Integer acCmdFormatCells = Integer.valueOf(77);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer acCmdDataEntry = Integer.valueOf(78);

  /**
   * Value is 79 (0x4F)
   */
  public static final Integer acCmdHideColumns = Integer.valueOf(79);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer acCmdUnhideColumns = Integer.valueOf(80);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer acCmdDeleteQueryColumn = Integer.valueOf(81);

  /**
   * Value is 82 (0x52)
   */
  public static final Integer acCmdInsertQueryColumn = Integer.valueOf(82);

  /**
   * Value is 84 (0x54)
   */
  public static final Integer acCmdRemoveTable = Integer.valueOf(84);

  /**
   * Value is 85 (0x55)
   */
  public static final Integer acCmdViewToolbox = Integer.valueOf(85);

  /**
   * Value is 86 (0x56)
   */
  public static final Integer acCmdMacroNames = Integer.valueOf(86);

  /**
   * Value is 87 (0x57)
   */
  public static final Integer acCmdMacroConditions = Integer.valueOf(87);

  /**
   * Value is 88 (0x58)
   */
  public static final Integer acCmdSingleStep = Integer.valueOf(88);

  /**
   * Value is 89 (0x59)
   */
  public static final Integer acCmdQueryTypeSelect = Integer.valueOf(89);

  /**
   * Value is 90 (0x5A)
   */
  public static final Integer acCmdQueryTypeUpdate = Integer.valueOf(90);

  /**
   * Value is 91 (0x5B)
   */
  public static final Integer acCmdQueryTypeAppend = Integer.valueOf(91);

  /**
   * Value is 92 (0x5C)
   */
  public static final Integer acCmdQueryTypeDelete = Integer.valueOf(92);

  /**
   * Value is 93 (0x5D)
   */
  public static final Integer acCmdApplyFilterSort = Integer.valueOf(93);

  /**
   * Value is 94 (0x5E)
   */
  public static final Integer acCmdQueryTypeMakeTable = Integer.valueOf(94);

  /**
   * Value is 95 (0x5F)
   */
  public static final Integer acCmdLoadFromQuery = Integer.valueOf(95);

  /**
   * Value is 96 (0x60)
   */
  public static final Integer acCmdSaveAsQuery = Integer.valueOf(96);

  /**
   * Value is 97 (0x61)
   */
  public static final Integer acCmdSaveRecord = Integer.valueOf(97);

  /**
   * Value is 99 (0x63)
   */
  public static final Integer acCmdAdvancedFilterSort = Integer.valueOf(99);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer acCmdMicrosoftAccessHelpTopics = Integer.valueOf(100);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer acCmdLinkTables = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer acCmdUserAndGroupPermissions = Integer.valueOf(103);

  /**
   * Value is 104 (0x68)
   */
  public static final Integer acCmdUserAndGroupAccounts = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer acCmdFreezeColumn = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer acCmdUnfreezeAllColumns = Integer.valueOf(106);

  /**
   * Value is 107 (0x6B)
   */
  public static final Integer acCmdPrimaryKey = Integer.valueOf(107);

  /**
   * Value is 108 (0x6C)
   */
  public static final Integer acCmdSubformDatasheet = Integer.valueOf(108);

  /**
   * Value is 109 (0x6D)
   */
  public static final Integer acCmdSelectAllRecords = Integer.valueOf(109);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer acCmdViewTables = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer acCmdViewQueries = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer acCmdViewForms = Integer.valueOf(112);

  /**
   * Value is 113 (0x71)
   */
  public static final Integer acCmdViewReports = Integer.valueOf(113);

  /**
   * Value is 114 (0x72)
   */
  public static final Integer acCmdViewMacros = Integer.valueOf(114);

  /**
   * Value is 115 (0x73)
   */
  public static final Integer acCmdViewModules = Integer.valueOf(115);

  /**
   * Value is 116 (0x74)
   */
  public static final Integer acCmdRowHeight = Integer.valueOf(116);

  /**
   * Value is 117 (0x75)
   */
  public static final Integer acCmdColumnWidth = Integer.valueOf(117);

  /**
   * Value is 118 (0x76)
   */
  public static final Integer acCmdInsertFileIntoModule = Integer.valueOf(118);

  /**
   * Value is 119 (0x77)
   */
  public static final Integer acCmdSaveModuleAsText = Integer.valueOf(119);

  /**
   * Value is 120 (0x78)
   */
  public static final Integer acCmdFindPrevious = Integer.valueOf(120);

  /**
   * Value is 121 (0x79)
   */
  public static final Integer acCmdWindowSplit = Integer.valueOf(121);

  /**
   * Value is 122 (0x7A)
   */
  public static final Integer acCmdProcedureDefinition = Integer.valueOf(122);

  /**
   * Value is 123 (0x7B)
   */
  public static final Integer acCmdDebugWindow = Integer.valueOf(123);

  /**
   * Value is 124 (0x7C)
   */
  public static final Integer acCmdReset = Integer.valueOf(124);

  /**
   * Value is 125 (0x7D)
   */
  public static final Integer acCmdCompileAllModules = Integer.valueOf(125);

  /**
   * Value is 126 (0x7E)
   */
  public static final Integer acCmdCompileAndSaveAllModules = Integer.valueOf(126);

  /**
   * Value is 127 (0x7F)
   */
  public static final Integer acCmdGoContinue = Integer.valueOf(127);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer acCmdStepOver = Integer.valueOf(128);

  /**
   * Value is 129 (0x81)
   */
  public static final Integer acCmdSetNextStatement = Integer.valueOf(129);

  /**
   * Value is 130 (0x82)
   */
  public static final Integer acCmdShowNextStatement = Integer.valueOf(130);

  /**
   * Value is 131 (0x83)
   */
  public static final Integer acCmdToggleBreakpoint = Integer.valueOf(131);

  /**
   * Value is 132 (0x84)
   */
  public static final Integer acCmdClearAllBreakpoints = Integer.valueOf(132);

  /**
   * Value is 133 (0x85)
   */
  public static final Integer acCmdRelationships = Integer.valueOf(133);

  /**
   * Value is 134 (0x86)
   */
  public static final Integer acCmdNewObjectTable = Integer.valueOf(134);

  /**
   * Value is 135 (0x87)
   */
  public static final Integer acCmdNewObjectQuery = Integer.valueOf(135);

  /**
   * Value is 136 (0x88)
   */
  public static final Integer acCmdNewObjectForm = Integer.valueOf(136);

  /**
   * Value is 137 (0x89)
   */
  public static final Integer acCmdNewObjectReport = Integer.valueOf(137);

  /**
   * Value is 138 (0x8A)
   */
  public static final Integer acCmdNewObjectMacro = Integer.valueOf(138);

  /**
   * Value is 139 (0x8B)
   */
  public static final Integer acCmdNewObjectModule = Integer.valueOf(139);

  /**
   * Value is 140 (0x8C)
   */
  public static final Integer acCmdNewObjectClassModule = Integer.valueOf(140);

  /**
   * Value is 141 (0x8D)
   */
  public static final Integer acCmdLayoutPreview = Integer.valueOf(141);

  /**
   * Value is 142 (0x8E)
   */
  public static final Integer acCmdSaveAsReport = Integer.valueOf(142);

  /**
   * Value is 143 (0x8F)
   */
  public static final Integer acCmdRename = Integer.valueOf(143);

  /**
   * Value is 144 (0x90)
   */
  public static final Integer acCmdRemoveFilterSort = Integer.valueOf(144);

  /**
   * Value is 145 (0x91)
   */
  public static final Integer acCmdSaveLayout = Integer.valueOf(145);

  /**
   * Value is 146 (0x92)
   */
  public static final Integer acCmdClearAll = Integer.valueOf(146);

  /**
   * Value is 147 (0x93)
   */
  public static final Integer acCmdHideTable = Integer.valueOf(147);

  /**
   * Value is 148 (0x94)
   */
  public static final Integer acCmdShowDirectRelationships = Integer.valueOf(148);

  /**
   * Value is 149 (0x95)
   */
  public static final Integer acCmdShowAllRelationships = Integer.valueOf(149);

  /**
   * Value is 150 (0x96)
   */
  public static final Integer acCmdCreateRelationship = Integer.valueOf(150);

  /**
   * Value is 151 (0x97)
   */
  public static final Integer acCmdEditRelationship = Integer.valueOf(151);

  /**
   * Value is 152 (0x98)
   */
  public static final Integer acCmdIndexes = Integer.valueOf(152);

  /**
   * Value is 153 (0x99)
   */
  public static final Integer acCmdAlignToShortest = Integer.valueOf(153);

  /**
   * Value is 154 (0x9A)
   */
  public static final Integer acCmdAlignToTallest = Integer.valueOf(154);

  /**
   * Value is 155 (0x9B)
   */
  public static final Integer acCmdSizeToNarrowest = Integer.valueOf(155);

  /**
   * Value is 156 (0x9C)
   */
  public static final Integer acCmdSizeToWidest = Integer.valueOf(156);

  /**
   * Value is 157 (0x9D)
   */
  public static final Integer acCmdHorizontalSpacingMakeEqual = Integer.valueOf(157);

  /**
   * Value is 158 (0x9E)
   */
  public static final Integer acCmdHorizontalSpacingDecrease = Integer.valueOf(158);

  /**
   * Value is 159 (0x9F)
   */
  public static final Integer acCmdHorizontalSpacingIncrease = Integer.valueOf(159);

  /**
   * Value is 160 (0xA0)
   */
  public static final Integer acCmdVerticalSpacingMakeEqual = Integer.valueOf(160);

  /**
   * Value is 161 (0xA1)
   */
  public static final Integer acCmdVerticalSpacingDecrease = Integer.valueOf(161);

  /**
   * Value is 162 (0xA2)
   */
  public static final Integer acCmdVerticalSpacingIncrease = Integer.valueOf(162);

  /**
   * Value is 163 (0xA3)
   */
  public static final Integer acCmdSortAscending = Integer.valueOf(163);

  /**
   * Value is 164 (0xA4)
   */
  public static final Integer acCmdSortDescending = Integer.valueOf(164);

  /**
   * Value is 165 (0xA5)
   */
  public static final Integer acCmdToolbarsCustomize = Integer.valueOf(165);

  /**
   * Value is 167 (0xA7)
   */
  public static final Integer acCmdOLEObjectConvert = Integer.valueOf(167);

  /**
   * Value is 168 (0xA8)
   */
  public static final Integer acCmdQueryTypeSQLDataDefinition = Integer.valueOf(168);

  /**
   * Value is 169 (0xA9)
   */
  public static final Integer acCmdQueryTypeSQLPassThrough = Integer.valueOf(169);

  /**
   * Value is 170 (0xAA)
   */
  public static final Integer acCmdViewCode = Integer.valueOf(170);

  /**
   * Value is 171 (0xAB)
   */
  public static final Integer acCmdConvertDatabase = Integer.valueOf(171);

  /**
   * Value is 172 (0xAC)
   */
  public static final Integer acCmdCallStack = Integer.valueOf(172);

  /**
   * Value is 173 (0xAD)
   */
  public static final Integer acCmdSend = Integer.valueOf(173);

  /**
   * Value is 175 (0xAF)
   */
  public static final Integer acCmdOutputToExcel = Integer.valueOf(175);

  /**
   * Value is 176 (0xB0)
   */
  public static final Integer acCmdOutputToRTF = Integer.valueOf(176);

  /**
   * Value is 177 (0xB1)
   */
  public static final Integer acCmdOutputToText = Integer.valueOf(177);

  /**
   * Value is 178 (0xB2)
   */
  public static final Integer acCmdInvokeBuilder = Integer.valueOf(178);

  /**
   * Value is 179 (0xB3)
   */
  public static final Integer acCmdZoomBox = Integer.valueOf(179);

  /**
   * Value is 180 (0xB4)
   */
  public static final Integer acCmdQueryTypeSQLUnion = Integer.valueOf(180);

  /**
   * Value is 181 (0xB5)
   */
  public static final Integer acCmdRun = Integer.valueOf(181);

  /**
   * Value is 182 (0xB6)
   */
  public static final Integer acCmdPageHdrFtr = Integer.valueOf(182);

  /**
   * Value is 183 (0xB7)
   */
  public static final Integer acCmdDesignView = Integer.valueOf(183);

  /**
   * Value is 184 (0xB8)
   */
  public static final Integer acCmdSQLView = Integer.valueOf(184);

  /**
   * Value is 185 (0xB9)
   */
  public static final Integer acCmdShowTable = Integer.valueOf(185);

  /**
   * Value is 186 (0xBA)
   */
  public static final Integer acCmdCloseWindow = Integer.valueOf(186);

  /**
   * Value is 187 (0xBB)
   */
  public static final Integer acCmdInsertRows = Integer.valueOf(187);

  /**
   * Value is 188 (0xBC)
   */
  public static final Integer acCmdDeleteRows = Integer.valueOf(188);

  /**
   * Value is 189 (0xBD)
   */
  public static final Integer acCmdCut = Integer.valueOf(189);

  /**
   * Value is 190 (0xBE)
   */
  public static final Integer acCmdCopy = Integer.valueOf(190);

  /**
   * Value is 191 (0xBF)
   */
  public static final Integer acCmdPaste = Integer.valueOf(191);

  /**
   * Value is 192 (0xC0)
   */
  public static final Integer acCmdAutoDial = Integer.valueOf(192);

  /**
   * Value is 193 (0xC1)
   */
  public static final Integer acCmdNewObjectAutoForm = Integer.valueOf(193);

  /**
   * Value is 194 (0xC2)
   */
  public static final Integer acCmdNewObjectAutoReport = Integer.valueOf(194);

  /**
   * Value is 195 (0xC3)
   */
  public static final Integer acCmdWordMailMerge = Integer.valueOf(195);

  /**
   * Value is 196 (0xC4)
   */
  public static final Integer acCmdTestValidationRules = Integer.valueOf(196);

  /**
   * Value is 197 (0xC5)
   */
  public static final Integer acCmdControlWizardsToggle = Integer.valueOf(197);

  /**
   * Value is 198 (0xC6)
   */
  public static final Integer acCmdEnd = Integer.valueOf(198);

  /**
   * Value is 199 (0xC7)
   */
  public static final Integer acCmdRedo = Integer.valueOf(199);

  /**
   * Value is 200 (0xC8)
   */
  public static final Integer acCmdObjectBrowser = Integer.valueOf(200);

  /**
   * Value is 201 (0xC9)
   */
  public static final Integer acCmdAddWatch = Integer.valueOf(201);

  /**
   * Value is 202 (0xCA)
   */
  public static final Integer acCmdEditWatch = Integer.valueOf(202);

  /**
   * Value is 203 (0xCB)
   */
  public static final Integer acCmdQuickWatch = Integer.valueOf(203);

  /**
   * Value is 204 (0xCC)
   */
  public static final Integer acCmdStepToCursor = Integer.valueOf(204);

  /**
   * Value is 205 (0xCD)
   */
  public static final Integer acCmdIndent = Integer.valueOf(205);

  /**
   * Value is 206 (0xCE)
   */
  public static final Integer acCmdOutdent = Integer.valueOf(206);

  /**
   * Value is 207 (0xCF)
   */
  public static final Integer acCmdFilterByForm = Integer.valueOf(207);

  /**
   * Value is 208 (0xD0)
   */
  public static final Integer acCmdFilterBySelection = Integer.valueOf(208);

  /**
   * Value is 209 (0xD1)
   */
  public static final Integer acCmdViewLargeIcons = Integer.valueOf(209);

  /**
   * Value is 210 (0xD2)
   */
  public static final Integer acCmdViewDetails = Integer.valueOf(210);

  /**
   * Value is 211 (0xD3)
   */
  public static final Integer acCmdViewSmallIcons = Integer.valueOf(211);

  /**
   * Value is 212 (0xD4)
   */
  public static final Integer acCmdViewList = Integer.valueOf(212);

  /**
   * Value is 213 (0xD5)
   */
  public static final Integer acCmdLineUpIcons = Integer.valueOf(213);

  /**
   * Value is 214 (0xD6)
   */
  public static final Integer acCmdArrangeIconsByName = Integer.valueOf(214);

  /**
   * Value is 215 (0xD7)
   */
  public static final Integer acCmdArrangeIconsByType = Integer.valueOf(215);

  /**
   * Value is 216 (0xD8)
   */
  public static final Integer acCmdArrangeIconsByCreated = Integer.valueOf(216);

  /**
   * Value is 217 (0xD9)
   */
  public static final Integer acCmdArrangeIconsByModified = Integer.valueOf(217);

  /**
   * Value is 218 (0xDA)
   */
  public static final Integer acCmdArrangeIconsAuto = Integer.valueOf(218);

  /**
   * Value is 219 (0xDB)
   */
  public static final Integer acCmdCreateShortcut = Integer.valueOf(219);

  /**
   * Value is 220 (0xDC)
   */
  public static final Integer acCmdToggleFilter = Integer.valueOf(220);

  /**
   * Value is 221 (0xDD)
   */
  public static final Integer acCmdOpenTable = Integer.valueOf(221);

  /**
   * Value is 222 (0xDE)
   */
  public static final Integer acCmdInsertPicture = Integer.valueOf(222);

  /**
   * Value is 223 (0xDF)
   */
  public static final Integer acCmdDeleteRecord = Integer.valueOf(223);

  /**
   * Value is 224 (0xE0)
   */
  public static final Integer acCmdStartupProperties = Integer.valueOf(224);

  /**
   * Value is 225 (0xE1)
   */
  public static final Integer acCmdPageNumber = Integer.valueOf(225);

  /**
   * Value is 226 (0xE2)
   */
  public static final Integer acCmdDateAndTime = Integer.valueOf(226);

  /**
   * Value is 227 (0xE3)
   */
  public static final Integer acCmdChangeToTextBox = Integer.valueOf(227);

  /**
   * Value is 228 (0xE4)
   */
  public static final Integer acCmdChangeToLabel = Integer.valueOf(228);

  /**
   * Value is 229 (0xE5)
   */
  public static final Integer acCmdChangeToListBox = Integer.valueOf(229);

  /**
   * Value is 230 (0xE6)
   */
  public static final Integer acCmdChangeToComboBox = Integer.valueOf(230);

  /**
   * Value is 231 (0xE7)
   */
  public static final Integer acCmdChangeToCheckBox = Integer.valueOf(231);

  /**
   * Value is 232 (0xE8)
   */
  public static final Integer acCmdChangeToToggleButton = Integer.valueOf(232);

  /**
   * Value is 233 (0xE9)
   */
  public static final Integer acCmdChangeToOptionButton = Integer.valueOf(233);

  /**
   * Value is 234 (0xEA)
   */
  public static final Integer acCmdChangeToImage = Integer.valueOf(234);

  /**
   * Value is 235 (0xEB)
   */
  public static final Integer acCmdAnswerWizard = Integer.valueOf(235);

  /**
   * Value is 236 (0xEC)
   */
  public static final Integer acCmdMicrosoftOnTheWeb = Integer.valueOf(236);

  /**
   * Value is 237 (0xED)
   */
  public static final Integer acCmdClearItemDefaults = Integer.valueOf(237);

  /**
   * Value is 238 (0xEE)
   */
  public static final Integer acCmdZoom200 = Integer.valueOf(238);

  /**
   * Value is 239 (0xEF)
   */
  public static final Integer acCmdZoom150 = Integer.valueOf(239);

  /**
   * Value is 240 (0xF0)
   */
  public static final Integer acCmdZoom100 = Integer.valueOf(240);

  /**
   * Value is 241 (0xF1)
   */
  public static final Integer acCmdZoom75 = Integer.valueOf(241);

  /**
   * Value is 242 (0xF2)
   */
  public static final Integer acCmdZoom50 = Integer.valueOf(242);

  /**
   * Value is 243 (0xF3)
   */
  public static final Integer acCmdZoom25 = Integer.valueOf(243);

  /**
   * Value is 244 (0xF4)
   */
  public static final Integer acCmdZoom10 = Integer.valueOf(244);

  /**
   * Value is 245 (0xF5)
   */
  public static final Integer acCmdFitToWindow = Integer.valueOf(245);

  /**
   * Value is 246 (0xF6)
   */
  public static final Integer acCmdPreviewOnePage = Integer.valueOf(246);

  /**
   * Value is 247 (0xF7)
   */
  public static final Integer acCmdPreviewTwoPages = Integer.valueOf(247);

  /**
   * Value is 248 (0xF8)
   */
  public static final Integer acCmdPreviewFourPages = Integer.valueOf(248);

  /**
   * Value is 249 (0xF9)
   */
  public static final Integer acCmdPreviewEightPages = Integer.valueOf(249);

  /**
   * Value is 250 (0xFA)
   */
  public static final Integer acCmdPreviewTwelvePages = Integer.valueOf(250);

  /**
   * Value is 251 (0xFB)
   */
  public static final Integer acCmdOpenURL = Integer.valueOf(251);

  /**
   * Value is 252 (0xFC)
   */
  public static final Integer acCmdOpenStartPage = Integer.valueOf(252);

  /**
   * Value is 253 (0xFD)
   */
  public static final Integer acCmdOpenSearchPage = Integer.valueOf(253);

  /**
   * Value is 254 (0xFE)
   */
  public static final Integer acCmdRegisterActiveXControls = Integer.valueOf(254);

  /**
   * Value is 255 (0xFF)
   */
  public static final Integer acCmdDeleteTab = Integer.valueOf(255);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer acCmdDatabaseProperties = Integer.valueOf(256);

  /**
   * Value is 257 (0x101)
   */
  public static final Integer acCmdImport = Integer.valueOf(257);

  /**
   * Value is 258 (0x102)
   */
  public static final Integer acCmdInsertActiveXControl = Integer.valueOf(258);

  /**
   * Value is 259 (0x103)
   */
  public static final Integer acCmdInsertHyperlink = Integer.valueOf(259);

  /**
   * Value is 260 (0x104)
   */
  public static final Integer acCmdReferences = Integer.valueOf(260);

  /**
   * Value is 261 (0x105)
   */
  public static final Integer acCmdAutoCorrect = Integer.valueOf(261);

  /**
   * Value is 262 (0x106)
   */
  public static final Integer acCmdInsertProcedure = Integer.valueOf(262);

  /**
   * Value is 263 (0x107)
   */
  public static final Integer acCmdCreateReplica = Integer.valueOf(263);

  /**
   * Value is 264 (0x108)
   */
  public static final Integer acCmdSynchronizeNow = Integer.valueOf(264);

  /**
   * Value is 265 (0x109)
   */
  public static final Integer acCmdRecoverDesignMaster = Integer.valueOf(265);

  /**
   * Value is 266 (0x10A)
   */
  public static final Integer acCmdResolveConflicts = Integer.valueOf(266);

  /**
   * Value is 267 (0x10B)
   */
  public static final Integer acCmdDeleteWatch = Integer.valueOf(267);

  /**
   * Value is 269 (0x10D)
   */
  public static final Integer acCmdSpelling = Integer.valueOf(269);

  /**
   * Value is 270 (0x10E)
   */
  public static final Integer acCmdAutoFormat = Integer.valueOf(270);

  /**
   * Value is 271 (0x10F)
   */
  public static final Integer acCmdDeleteTableColumn = Integer.valueOf(271);

  /**
   * Value is 272 (0x110)
   */
  public static final Integer acCmdInsertTableColumn = Integer.valueOf(272);

  /**
   * Value is 273 (0x111)
   */
  public static final Integer acCmdInsertLookupColumn = Integer.valueOf(273);

  /**
   * Value is 274 (0x112)
   */
  public static final Integer acCmdRenameColumn = Integer.valueOf(274);

  /**
   * Value is 275 (0x113)
   */
  public static final Integer acCmdSetDatabasePassword = Integer.valueOf(275);

  /**
   * Value is 276 (0x114)
   */
  public static final Integer acCmdUserLevelSecurityWizard = Integer.valueOf(276);

  /**
   * Value is 277 (0x115)
   */
  public static final Integer acCmdFilterExcludingSelection = Integer.valueOf(277);

  /**
   * Value is 278 (0x116)
   */
  public static final Integer acCmdQuickPrint = Integer.valueOf(278);

  /**
   * Value is 279 (0x117)
   */
  public static final Integer acCmdConvertMacrosToVisualBasic = Integer.valueOf(279);

  /**
   * Value is 280 (0x118)
   */
  public static final Integer acCmdSaveAllModules = Integer.valueOf(280);

  /**
   * Value is 281 (0x119)
   */
  public static final Integer acCmdFormView = Integer.valueOf(281);

  /**
   * Value is 282 (0x11A)
   */
  public static final Integer acCmdDatasheetView = Integer.valueOf(282);

  /**
   * Value is 283 (0x11B)
   */
  public static final Integer acCmdAnalyzePerformance = Integer.valueOf(283);

  /**
   * Value is 284 (0x11C)
   */
  public static final Integer acCmdAnalyzeTable = Integer.valueOf(284);

  /**
   * Value is 285 (0x11D)
   */
  public static final Integer acCmdDocumenter = Integer.valueOf(285);

  /**
   * Value is 286 (0x11E)
   */
  public static final Integer acCmdTileHorizontally = Integer.valueOf(286);

  /**
   * Value is 287 (0x11F)
   */
  public static final Integer acCmdProperties = Integer.valueOf(287);

  /**
   * Value is 288 (0x120)
   */
  public static final Integer acCmdTransparentBackground = Integer.valueOf(288);

  /**
   * Value is 289 (0x121)
   */
  public static final Integer acCmdTransparentBorder = Integer.valueOf(289);

  /**
   * Value is 290 (0x122)
   */
  public static final Integer acCmdCompileLoadedModules = Integer.valueOf(290);

  /**
   * Value is 291 (0x123)
   */
  public static final Integer acCmdInsertLookupField = Integer.valueOf(291);

  /**
   * Value is 292 (0x124)
   */
  public static final Integer acCmdUndo = Integer.valueOf(292);

  /**
   * Value is 293 (0x125)
   */
  public static final Integer acCmdInsertChart = Integer.valueOf(293);

  /**
   * Value is 294 (0x126)
   */
  public static final Integer acCmdGoBack = Integer.valueOf(294);

  /**
   * Value is 295 (0x127)
   */
  public static final Integer acCmdGoForward = Integer.valueOf(295);

  /**
   * Value is 296 (0x128)
   */
  public static final Integer acCmdStopLoadingPage = Integer.valueOf(296);

  /**
   * Value is 297 (0x129)
   */
  public static final Integer acCmdRefreshPage = Integer.valueOf(297);

  /**
   * Value is 298 (0x12A)
   */
  public static final Integer acCmdFavoritesOpen = Integer.valueOf(298);

  /**
   * Value is 299 (0x12B)
   */
  public static final Integer acCmdFavoritesAddTo = Integer.valueOf(299);

  /**
   * Value is 300 (0x12C)
   */
  public static final Integer acCmdShowOnlyWebToolbar = Integer.valueOf(300);

  /**
   * Value is 301 (0x12D)
   */
  public static final Integer acCmdToolbarControlProperties = Integer.valueOf(301);

  /**
   * Value is 302 (0x12E)
   */
  public static final Integer acCmdShowMembers = Integer.valueOf(302);

  /**
   * Value is 303 (0x12F)
   */
  public static final Integer acCmdListConstants = Integer.valueOf(303);

  /**
   * Value is 304 (0x130)
   */
  public static final Integer acCmdQuickInfo = Integer.valueOf(304);

  /**
   * Value is 305 (0x131)
   */
  public static final Integer acCmdParameterInfo = Integer.valueOf(305);

  /**
   * Value is 306 (0x132)
   */
  public static final Integer acCmdCompleteWord = Integer.valueOf(306);

  /**
   * Value is 307 (0x133)
   */
  public static final Integer acCmdBookmarksToggle = Integer.valueOf(307);

  /**
   * Value is 308 (0x134)
   */
  public static final Integer acCmdBookmarksNext = Integer.valueOf(308);

  /**
   * Value is 309 (0x135)
   */
  public static final Integer acCmdBookmarksPrevious = Integer.valueOf(309);

  /**
   * Value is 310 (0x136)
   */
  public static final Integer acCmdBookmarksClearAll = Integer.valueOf(310);

  /**
   * Value is 311 (0x137)
   */
  public static final Integer acCmdStepOut = Integer.valueOf(311);

  /**
   * Value is 312 (0x138)
   */
  public static final Integer acCmdFindPrevWordUnderCursor = Integer.valueOf(312);

  /**
   * Value is 313 (0x139)
   */
  public static final Integer acCmdFindNextWordUnderCursor = Integer.valueOf(313);

  /**
   * Value is 314 (0x13A)
   */
  public static final Integer acCmdObjBrwFindWholeWordOnly = Integer.valueOf(314);

  /**
   * Value is 315 (0x13B)
   */
  public static final Integer acCmdObjBrwShowHiddenMembers = Integer.valueOf(315);

  /**
   * Value is 316 (0x13C)
   */
  public static final Integer acCmdObjBrwHelp = Integer.valueOf(316);

  /**
   * Value is 317 (0x13D)
   */
  public static final Integer acCmdObjBrwViewDefinition = Integer.valueOf(317);

  /**
   * Value is 318 (0x13E)
   */
  public static final Integer acCmdObjBrwGroupMembers = Integer.valueOf(318);

  /**
   * Value is 319 (0x13F)
   */
  public static final Integer acCmdSelectReport = Integer.valueOf(319);

  /**
   * Value is 321 (0x141)
   */
  public static final Integer acCmdSaveAsHTML = Integer.valueOf(321);

  /**
   * Value is 322 (0x142)
   */
  public static final Integer acCmdSaveAsIDC = Integer.valueOf(322);

  /**
   * Value is 323 (0x143)
   */
  public static final Integer acCmdSaveAsASP = Integer.valueOf(323);

  /**
   * Value is 324 (0x144)
   */
  public static final Integer acCmdPublishDefaults = Integer.valueOf(324);

  /**
   * Value is 325 (0x145)
   */
  public static final Integer acCmdEditHyperlink = Integer.valueOf(325);

  /**
   * Value is 326 (0x146)
   */
  public static final Integer acCmdOpenHyperlink = Integer.valueOf(326);

  /**
   * Value is 327 (0x147)
   */
  public static final Integer acCmdOpenNewHyperlink = Integer.valueOf(327);

  /**
   * Value is 328 (0x148)
   */
  public static final Integer acCmdCopyHyperlink = Integer.valueOf(328);

  /**
   * Value is 329 (0x149)
   */
  public static final Integer acCmdHyperlinkDisplayText = Integer.valueOf(329);

  /**
   * Value is 330 (0x14A)
   */
  public static final Integer acCmdTabControlPageOrder = Integer.valueOf(330);

  /**
   * Value is 331 (0x14B)
   */
  public static final Integer acCmdInsertPage = Integer.valueOf(331);

  /**
   * Value is 332 (0x14C)
   */
  public static final Integer acCmdDeletePage = Integer.valueOf(332);

  /**
   * Value is 333 (0x14D)
   */
  public static final Integer acCmdSelectAll = Integer.valueOf(333);

  /**
   * Value is 334 (0x14E)
   */
  public static final Integer acCmdCreateMenuFromMacro = Integer.valueOf(334);

  /**
   * Value is 335 (0x14F)
   */
  public static final Integer acCmdCreateToolbarFromMacro = Integer.valueOf(335);

  /**
   * Value is 336 (0x150)
   */
  public static final Integer acCmdCreateShortcutMenuFromMacro = Integer.valueOf(336);

  /**
   * Value is 337 (0x151)
   */
  public static final Integer acCmdDelete = Integer.valueOf(337);

  /**
   * Value is 338 (0x152)
   */
  public static final Integer acCmdRunOpenMacro = Integer.valueOf(338);

  /**
   * Value is 339 (0x153)
   */
  public static final Integer acCmdLastPosition = Integer.valueOf(339);

  /**
   * Value is 340 (0x154)
   */
  public static final Integer acCmdPrint = Integer.valueOf(340);

  /**
   * Value is 341 (0x155)
   */
  public static final Integer acCmdFindNext = Integer.valueOf(341);

  /**
   * Value is 342 (0x156)
   */
  public static final Integer acCmdStepInto = Integer.valueOf(342);

  /**
   * Value is 343 (0x157)
   */
  public static final Integer acCmdClearHyperlink = Integer.valueOf(343);

  /**
   * Value is 344 (0x158)
   */
  public static final Integer acCmdDataAccessPageBrowse = Integer.valueOf(344);

  /**
   * Value is 346 (0x15A)
   */
  public static final Integer acCmdNewObjectDataAccessPage = Integer.valueOf(346);

  /**
   * Value is 347 (0x15B)
   */
  public static final Integer acCmdSelectDataAccessPage = Integer.valueOf(347);

  /**
   * Value is 349 (0x15D)
   */
  public static final Integer acCmdViewDataAccessPages = Integer.valueOf(349);

  /**
   * Value is 350 (0x15E)
   */
  public static final Integer acCmdNewObjectView = Integer.valueOf(350);

  /**
   * Value is 351 (0x15F)
   */
  public static final Integer acCmdNewObjectStoredProcedure = Integer.valueOf(351);

  /**
   * Value is 352 (0x160)
   */
  public static final Integer acCmdNewObjectDiagram = Integer.valueOf(352);

  /**
   * Value is 353 (0x161)
   */
  public static final Integer acCmdViewFieldList = Integer.valueOf(353);

  /**
   * Value is 354 (0x162)
   */
  public static final Integer acCmdViewDiagrams = Integer.valueOf(354);

  /**
   * Value is 355 (0x163)
   */
  public static final Integer acCmdViewStoredProcedures = Integer.valueOf(355);

  /**
   * Value is 356 (0x164)
   */
  public static final Integer acCmdViewViews = Integer.valueOf(356);

  /**
   * Value is 357 (0x165)
   */
  public static final Integer acCmdViewShowPaneSQL = Integer.valueOf(357);

  /**
   * Value is 358 (0x166)
   */
  public static final Integer acCmdViewShowPaneDiagram = Integer.valueOf(358);

  /**
   * Value is 359 (0x167)
   */
  public static final Integer acCmdViewShowPaneGrid = Integer.valueOf(359);

  /**
   * Value is 360 (0x168)
   */
  public static final Integer acCmdViewVerifySQL = Integer.valueOf(360);

  /**
   * Value is 361 (0x169)
   */
  public static final Integer acCmdQueryGroupBy = Integer.valueOf(361);

  /**
   * Value is 362 (0x16A)
   */
  public static final Integer acCmdQueryAddToOutput = Integer.valueOf(362);

  /**
   * Value is 363 (0x16B)
   */
  public static final Integer acCmdViewTableColumnNames = Integer.valueOf(363);

  /**
   * Value is 364 (0x16C)
   */
  public static final Integer acCmdViewTableNameOnly = Integer.valueOf(364);

  /**
   * Value is 365 (0x16D)
   */
  public static final Integer acCmdHidePane = Integer.valueOf(365);

  /**
   * Value is 366 (0x16E)
   */
  public static final Integer acCmdRemove = Integer.valueOf(366);

  /**
   * Value is 368 (0x170)
   */
  public static final Integer acCmdViewTableColumnProperties = Integer.valueOf(368);

  /**
   * Value is 369 (0x171)
   */
  public static final Integer acCmdViewTableKeys = Integer.valueOf(369);

  /**
   * Value is 370 (0x172)
   */
  public static final Integer acCmdViewTableUserView = Integer.valueOf(370);

  /**
   * Value is 371 (0x173)
   */
  public static final Integer acCmdZoomSelection = Integer.valueOf(371);

  /**
   * Value is 372 (0x174)
   */
  public static final Integer acCmdDiagramNewLabel = Integer.valueOf(372);

  /**
   * Value is 373 (0x175)
   */
  public static final Integer acCmdDiagramAddRelatedTables = Integer.valueOf(373);

  /**
   * Value is 374 (0x176)
   */
  public static final Integer acCmdDiagramShowRelationshipLabels = Integer.valueOf(374);

  /**
   * Value is 375 (0x177)
   */
  public static final Integer acCmdDiagramModifyUserDefinedView = Integer.valueOf(375);

  /**
   * Value is 376 (0x178)
   */
  public static final Integer acCmdDiagramViewPageBreaks = Integer.valueOf(376);

  /**
   * Value is 377 (0x179)
   */
  public static final Integer acCmdDiagramRecalculatePageBreaks = Integer.valueOf(377);

  /**
   * Value is 378 (0x17A)
   */
  public static final Integer acCmdDiagramAutosizeSelectedTables = Integer.valueOf(378);

  /**
   * Value is 379 (0x17B)
   */
  public static final Integer acCmdDiagramLayoutSelection = Integer.valueOf(379);

  /**
   * Value is 380 (0x17C)
   */
  public static final Integer acCmdDiagramLayoutDiagram = Integer.valueOf(380);

  /**
   * Value is 381 (0x17D)
   */
  public static final Integer acCmdDiagramNewTable = Integer.valueOf(381);

  /**
   * Value is 382 (0x17E)
   */
  public static final Integer acCmdDiagramDeleteRelationship = Integer.valueOf(382);

  /**
   * Value is 383 (0x17F)
   */
  public static final Integer acCmdConnection = Integer.valueOf(383);

  /**
   * Value is 384 (0x180)
   */
  public static final Integer acCmdEditTriggers = Integer.valueOf(384);

  /**
   * Value is 385 (0x181)
   */
  public static final Integer acCmdDataAccessPageDesignView = Integer.valueOf(385);

  /**
   * Value is 386 (0x182)
   */
  public static final Integer acCmdPromote = Integer.valueOf(386);

  /**
   * Value is 387 (0x183)
   */
  public static final Integer acCmdGroupByTable = Integer.valueOf(387);

  /**
   * Value is 388 (0x184)
   */
  public static final Integer acCmdDemote = Integer.valueOf(388);

  /**
   * Value is 389 (0x185)
   */
  public static final Integer acCmdSaveAsDataAccessPage = Integer.valueOf(389);

  /**
   * Value is 390 (0x186)
   */
  public static final Integer acCmdMicrosoftScriptEditor = Integer.valueOf(390);

  /**
   * Value is 391 (0x187)
   */
  public static final Integer acCmdWorkgroupAdministrator = Integer.valueOf(391);

  /**
   * Value is 394 (0x18A)
   */
  public static final Integer acCmdNewObjectFunction = Integer.valueOf(394);

  /**
   * Value is 395 (0x18B)
   */
  public static final Integer acCmdViewFunctions = Integer.valueOf(395);

  /**
   * Value is 396 (0x18C)
   */
  public static final Integer acCmdPivotTableView = Integer.valueOf(396);

  /**
   * Value is 397 (0x18D)
   */
  public static final Integer acCmdPivotChartView = Integer.valueOf(397);

  /**
   * Value is 398 (0x18E)
   */
  public static final Integer acCmdPivotAutoFilter = Integer.valueOf(398);

  /**
   * Value is 399 (0x18F)
   */
  public static final Integer acCmdPivotTableSubtotal = Integer.valueOf(399);

  /**
   * Value is 400 (0x190)
   */
  public static final Integer acCmdPivotCollapse = Integer.valueOf(400);

  /**
   * Value is 401 (0x191)
   */
  public static final Integer acCmdPivotExpand = Integer.valueOf(401);

  /**
   * Value is 402 (0x192)
   */
  public static final Integer acCmdPivotTableHideDetails = Integer.valueOf(402);

  /**
   * Value is 403 (0x193)
   */
  public static final Integer acCmdPivotTableShowDetails = Integer.valueOf(403);

  /**
   * Value is 404 (0x194)
   */
  public static final Integer acCmdPivotRefresh = Integer.valueOf(404);

  /**
   * Value is 405 (0x195)
   */
  public static final Integer acCmdPivotTableExportToExcel = Integer.valueOf(405);

  /**
   * Value is 406 (0x196)
   */
  public static final Integer acCmdPivotTableMoveToRowArea = Integer.valueOf(406);

  /**
   * Value is 407 (0x197)
   */
  public static final Integer acCmdPivotTableMoveToColumnArea = Integer.valueOf(407);

  /**
   * Value is 408 (0x198)
   */
  public static final Integer acCmdPivotTableMoveToFilterArea = Integer.valueOf(408);

  /**
   * Value is 409 (0x199)
   */
  public static final Integer acCmdPivotTableMoveToDetailArea = Integer.valueOf(409);

  /**
   * Value is 410 (0x19A)
   */
  public static final Integer acCmdPivotTablePromote = Integer.valueOf(410);

  /**
   * Value is 411 (0x19B)
   */
  public static final Integer acCmdPivotTableDemote = Integer.valueOf(411);

  /**
   * Value is 412 (0x19C)
   */
  public static final Integer acCmdPivotAutoSum = Integer.valueOf(412);

  /**
   * Value is 413 (0x19D)
   */
  public static final Integer acCmdPivotAutoCount = Integer.valueOf(413);

  /**
   * Value is 414 (0x19E)
   */
  public static final Integer acCmdPivotAutoMin = Integer.valueOf(414);

  /**
   * Value is 415 (0x19F)
   */
  public static final Integer acCmdPivotAutoMax = Integer.valueOf(415);

  /**
   * Value is 416 (0x1A0)
   */
  public static final Integer acCmdPivotAutoAverage = Integer.valueOf(416);

  /**
   * Value is 417 (0x1A1)
   */
  public static final Integer acCmdPivotAutoStdDev = Integer.valueOf(417);

  /**
   * Value is 418 (0x1A2)
   */
  public static final Integer acCmdPivotAutoVar = Integer.valueOf(418);

  /**
   * Value is 419 (0x1A3)
   */
  public static final Integer acCmdPivotAutoStdDevP = Integer.valueOf(419);

  /**
   * Value is 420 (0x1A4)
   */
  public static final Integer acCmdPivotAutoVarP = Integer.valueOf(420);

  /**
   * Value is 421 (0x1A5)
   */
  public static final Integer acCmdPivotShowTop1 = Integer.valueOf(421);

  /**
   * Value is 422 (0x1A6)
   */
  public static final Integer acCmdPivotShowTop2 = Integer.valueOf(422);

  /**
   * Value is 423 (0x1A7)
   */
  public static final Integer acCmdPivotShowTop5 = Integer.valueOf(423);

  /**
   * Value is 424 (0x1A8)
   */
  public static final Integer acCmdPivotShowTop10 = Integer.valueOf(424);

  /**
   * Value is 425 (0x1A9)
   */
  public static final Integer acCmdPivotShowTop25 = Integer.valueOf(425);

  /**
   * Value is 426 (0x1AA)
   */
  public static final Integer acCmdPivotShowTop1Percent = Integer.valueOf(426);

  /**
   * Value is 427 (0x1AB)
   */
  public static final Integer acCmdPivotShowTop2Percent = Integer.valueOf(427);

  /**
   * Value is 428 (0x1AC)
   */
  public static final Integer acCmdPivotShowTop5Percent = Integer.valueOf(428);

  /**
   * Value is 429 (0x1AD)
   */
  public static final Integer acCmdPivotShowTop10Percent = Integer.valueOf(429);

  /**
   * Value is 430 (0x1AE)
   */
  public static final Integer acCmdPivotShowTop25Percent = Integer.valueOf(430);

  /**
   * Value is 431 (0x1AF)
   */
  public static final Integer acCmdPivotShowTopOther = Integer.valueOf(431);

  /**
   * Value is 432 (0x1B0)
   */
  public static final Integer acCmdPivotShowBottom1 = Integer.valueOf(432);

  /**
   * Value is 433 (0x1B1)
   */
  public static final Integer acCmdPivotShowBottom2 = Integer.valueOf(433);

  /**
   * Value is 434 (0x1B2)
   */
  public static final Integer acCmdPivotShowBottom5 = Integer.valueOf(434);

  /**
   * Value is 435 (0x1B3)
   */
  public static final Integer acCmdPivotShowBottom10 = Integer.valueOf(435);

  /**
   * Value is 436 (0x1B4)
   */
  public static final Integer acCmdPivotShowBottom25 = Integer.valueOf(436);

  /**
   * Value is 437 (0x1B5)
   */
  public static final Integer acCmdPivotShowBottom1Percent = Integer.valueOf(437);

  /**
   * Value is 438 (0x1B6)
   */
  public static final Integer acCmdPivotShowBottom2Percent = Integer.valueOf(438);

  /**
   * Value is 439 (0x1B7)
   */
  public static final Integer acCmdPivotShowBottom5Percent = Integer.valueOf(439);

  /**
   * Value is 440 (0x1B8)
   */
  public static final Integer acCmdPivotShowBottom10Percent = Integer.valueOf(440);

  /**
   * Value is 441 (0x1B9)
   */
  public static final Integer acCmdPivotShowBottom25Percent = Integer.valueOf(441);

  /**
   * Value is 442 (0x1BA)
   */
  public static final Integer acCmdPivotShowBottomOther = Integer.valueOf(442);

  /**
   * Value is 443 (0x1BB)
   */
  public static final Integer acCmdPivotTableCreateCalcTotal = Integer.valueOf(443);

  /**
   * Value is 444 (0x1BC)
   */
  public static final Integer acCmdPivotTableCreateCalcField = Integer.valueOf(444);

  /**
   * Value is 445 (0x1BD)
   */
  public static final Integer acCmdPivotTableShowAsNormal = Integer.valueOf(445);

  /**
   * Value is 446 (0x1BE)
   */
  public static final Integer acCmdPivotTablePercentRowTotal = Integer.valueOf(446);

  /**
   * Value is 447 (0x1BF)
   */
  public static final Integer acCmdPivotTablePercentColumnTotal = Integer.valueOf(447);

  /**
   * Value is 448 (0x1C0)
   */
  public static final Integer acCmdPivotTablePercentParentRowItem = Integer.valueOf(448);

  /**
   * Value is 449 (0x1C1)
   */
  public static final Integer acCmdPivotTablePercentParentColumnItem = Integer.valueOf(449);

  /**
   * Value is 450 (0x1C2)
   */
  public static final Integer acCmdPivotTablePercentGrandTotal = Integer.valueOf(450);

  /**
   * Value is 451 (0x1C3)
   */
  public static final Integer acCmdPivotTableExpandIndicators = Integer.valueOf(451);

  /**
   * Value is 452 (0x1C4)
   */
  public static final Integer acCmdPivotDropAreas = Integer.valueOf(452);

  /**
   * Value is 453 (0x1C5)
   */
  public static final Integer acCmdPivotChartType = Integer.valueOf(453);

  /**
   * Value is 454 (0x1C6)
   */
  public static final Integer acCmdPivotDelete = Integer.valueOf(454);

  /**
   * Value is 455 (0x1C7)
   */
  public static final Integer acCmdPivotChartShowLegend = Integer.valueOf(455);

  /**
   * Value is 456 (0x1C8)
   */
  public static final Integer acCmdPivotChartByRowByColumn = Integer.valueOf(456);

  /**
   * Value is 457 (0x1C9)
   */
  public static final Integer acCmdPivotChartDrillInto = Integer.valueOf(457);

  /**
   * Value is 458 (0x1CA)
   */
  public static final Integer acCmdPivotChartMultiplePlots = Integer.valueOf(458);

  /**
   * Value is 459 (0x1CB)
   */
  public static final Integer acCmdPivotChartMultiplePlotsUnifiedScale = Integer.valueOf(459);

  /**
   * Value is 460 (0x1CC)
   */
  public static final Integer acCmdPivotChartUndo = Integer.valueOf(460);

  /**
   * Value is 461 (0x1CD)
   */
  public static final Integer acCmdPivotShowAll = Integer.valueOf(461);

  /**
   * Value is 462 (0x1CE)
   */
  public static final Integer acCmdSubformFormView = Integer.valueOf(462);

  /**
   * Value is 463 (0x1CF)
   */
  public static final Integer acCmdSubformDatasheetView = Integer.valueOf(463);

  /**
   * Value is 464 (0x1D0)
   */
  public static final Integer acCmdSubformPivotTableView = Integer.valueOf(464);

  /**
   * Value is 465 (0x1D1)
   */
  public static final Integer acCmdSubformPivotChartView = Integer.valueOf(465);

  /**
   * Value is 466 (0x1D2)
   */
  public static final Integer acCmdWebPagePreview = Integer.valueOf(466);

  /**
   * Value is 467 (0x1D3)
   */
  public static final Integer acCmdPageProperties = Integer.valueOf(467);

  /**
   * Value is 468 (0x1D4)
   */
  public static final Integer acCmdDataOutline = Integer.valueOf(468);

  /**
   * Value is 469 (0x1D5)
   */
  public static final Integer acCmdInsertMovieFromFile = Integer.valueOf(469);

  /**
   * Value is 470 (0x1D6)
   */
  public static final Integer acCmdInsertPivotTable = Integer.valueOf(470);

  /**
   * Value is 471 (0x1D7)
   */
  public static final Integer acCmdInsertSpreadsheet = Integer.valueOf(471);

  /**
   * Value is 472 (0x1D8)
   */
  public static final Integer acCmdInsertUnboundSection = Integer.valueOf(472);

  /**
   * Value is 473 (0x1D9)
   */
  public static final Integer acCmdWebTheme = Integer.valueOf(473);

  /**
   * Value is 474 (0x1DA)
   */
  public static final Integer acCmdBackgroundPicture = Integer.valueOf(474);

  /**
   * Value is 475 (0x1DB)
   */
  public static final Integer acCmdBackgroundSound = Integer.valueOf(475);

  /**
   * Value is 476 (0x1DC)
   */
  public static final Integer acCmdAlignMiddle = Integer.valueOf(476);

  /**
   * Value is 477 (0x1DD)
   */
  public static final Integer acCmdAlignCenter = Integer.valueOf(477);

  /**
   * Value is 478 (0x1DE)
   */
  public static final Integer acCmdAlignmentAndSizing = Integer.valueOf(478);

  /**
   * Value is 479 (0x1DF)
   */
  public static final Integer acCmdDataAccessPageFieldListRefresh = Integer.valueOf(479);

  /**
   * Value is 480 (0x1E0)
   */
  public static final Integer acCmdDataAccessPageAddToPage = Integer.valueOf(480);

  /**
   * Value is 481 (0x1E1)
   */
  public static final Integer acCmdZoom500 = Integer.valueOf(481);

  /**
   * Value is 482 (0x1E2)
   */
  public static final Integer acCmdZoom1000 = Integer.valueOf(482);

  /**
   * Value is 483 (0x1E3)
   */
  public static final Integer acCmdPrintRelationships = Integer.valueOf(483);

  /**
   * Value is 484 (0x1E4)
   */
  public static final Integer acCmdGroupControls = Integer.valueOf(484);

  /**
   * Value is 485 (0x1E5)
   */
  public static final Integer acCmdUngroupControls = Integer.valueOf(485);

  /**
   * Value is 486 (0x1E6)
   */
  public static final Integer acCmdWebPageProperties = Integer.valueOf(486);

  /**
   * Value is 487 (0x1E7)
   */
  public static final Integer acCmdExport = Integer.valueOf(487);

  /**
   * Value is 488 (0x1E8)
   */
  public static final Integer acCmdOfficeClipboard = Integer.valueOf(488);

  /**
   * Value is 489 (0x1E9)
   */
  public static final Integer acCmdDeleteTable = Integer.valueOf(489);

  /**
   * Value is 490 (0x1EA)
   */
  public static final Integer acCmdPasteAsHyperlink = Integer.valueOf(490);

  /**
   * Value is 491 (0x1EB)
   */
  public static final Integer acCmdNewGroup = Integer.valueOf(491);

  /**
   * Value is 492 (0x1EC)
   */
  public static final Integer acCmdRenameGroup = Integer.valueOf(492);

  /**
   * Value is 493 (0x1ED)
   */
  public static final Integer acCmdDeleteGroup = Integer.valueOf(493);

  /**
   * Value is 494 (0x1EE)
   */
  public static final Integer acCmdAddToNewGroup = Integer.valueOf(494);

  /**
   * Value is 495 (0x1EF)
   */
  public static final Integer acCmdSubformInNewWindow = Integer.valueOf(495);

  /**
   * Value is 496 (0x1F0)
   */
  public static final Integer acCmdServerProperties = Integer.valueOf(496);

  /**
   * Value is 497 (0x1F1)
   */
  public static final Integer acCmdTableCustomView = Integer.valueOf(497);

  /**
   * Value is 498 (0x1F2)
   */
  public static final Integer acCmdTableAddTable = Integer.valueOf(498);

  /**
   * Value is 499 (0x1F3)
   */
  public static final Integer acCmdInsertSubdatasheet = Integer.valueOf(499);

  /**
   * Value is 500 (0x1F4)
   */
  public static final Integer acCmdConditionalFormatting = Integer.valueOf(500);

  /**
   * Value is 501 (0x1F5)
   */
  public static final Integer acCmdChangeToCommandButton = Integer.valueOf(501);

  /**
   * Value is 504 (0x1F8)
   */
  public static final Integer acCmdSubdatasheetExpandAll = Integer.valueOf(504);

  /**
   * Value is 505 (0x1F9)
   */
  public static final Integer acCmdSubdatasheetCollapseAll = Integer.valueOf(505);

  /**
   * Value is 506 (0x1FA)
   */
  public static final Integer acCmdSubdatasheetRemove = Integer.valueOf(506);

  /**
   * Value is 507 (0x1FB)
   */
  public static final Integer acCmdServerFilterByForm = Integer.valueOf(507);

  /**
   * Value is 508 (0x1FC)
   */
  public static final Integer acCmdMaximiumRecords = Integer.valueOf(508);

  /**
   * Value is 511 (0x1FF)
   */
  public static final Integer acCmdSpeech = Integer.valueOf(511);

  /**
   * Value is 513 (0x201)
   */
  public static final Integer acCmdBackup = Integer.valueOf(513);

  /**
   * Value is 514 (0x202)
   */
  public static final Integer acCmdRestore = Integer.valueOf(514);

  /**
   * Value is 515 (0x203)
   */
  public static final Integer acCmdTransferSQLDatabase = Integer.valueOf(515);

  /**
   * Value is 516 (0x204)
   */
  public static final Integer acCmdCopyDatabaseFile = Integer.valueOf(516);

  /**
   * Value is 517 (0x205)
   */
  public static final Integer acCmdDropSQLDatabase = Integer.valueOf(517);

  /**
   * Value is 519 (0x207)
   */
  public static final Integer acCmdLinkedTableManager = Integer.valueOf(519);

  /**
   * Value is 520 (0x208)
   */
  public static final Integer acCmdDatabaseSplitter = Integer.valueOf(520);

  /**
   * Value is 521 (0x209)
   */
  public static final Integer acCmdSwitchboardManager = Integer.valueOf(521);

  /**
   * Value is 522 (0x20A)
   */
  public static final Integer acCmdUpsizingWizard = Integer.valueOf(522);

  /**
   * Value is 524 (0x20C)
   */
  public static final Integer acCmdPartialReplicaWizard = Integer.valueOf(524);

  /**
   * Value is 525 (0x20D)
   */
  public static final Integer acCmdVisualBasicEditor = Integer.valueOf(525);

  /**
   * Value is 526 (0x20E)
   */
  public static final Integer acCmdAddInManager = Integer.valueOf(526);

  /**
   * Value is 527 (0x20F)
   */
  public static final Integer acCmdPivotTableClearCustomOrdering = Integer.valueOf(527);

  /**
   * Value is 528 (0x210)
   */
  public static final Integer acCmdPivotTableFilterBySelection = Integer.valueOf(528);

  /**
   * Value is 529 (0x211)
   */
  public static final Integer acCmdPivotTableRemove = Integer.valueOf(529);

  /**
   * Value is 530 (0x212)
   */
  public static final Integer acCmdPivotTableGroupItems = Integer.valueOf(530);

  /**
   * Value is 531 (0x213)
   */
  public static final Integer acCmdPivotTableUngroupItems = Integer.valueOf(531);

  /**
   * Value is 532 (0x214)
   */
  public static final Integer acCmdPivotChartDrillOut = Integer.valueOf(532);

  /**
   * Value is 533 (0x215)
   */
  public static final Integer acCmdShowEnvelope = Integer.valueOf(533);

  /**
   * Value is 534 (0x216)
   */
  public static final Integer acCmdPivotChartSortAscByTotal = Integer.valueOf(534);

  /**
   * Value is 535 (0x217)
   */
  public static final Integer acCmdPivotChartSortDescByTotal = Integer.valueOf(535);

  /**
   * Value is 536 (0x218)
   */
  public static final Integer acCmdViewObjectDependencies = Integer.valueOf(536);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("acCmdWindowUnhide", acCmdWindowUnhide);
    v.put("acCmdWindowHide", acCmdWindowHide);
    v.put("acCmdExit", acCmdExit);
    v.put("acCmdCompactDatabase", acCmdCompactDatabase);
    v.put("acCmdEncryptDecryptDatabase", acCmdEncryptDecryptDatabase);
    v.put("acCmdRepairDatabase", acCmdRepairDatabase);
    v.put("acCmdMakeMDEFile", acCmdMakeMDEFile);
    v.put("acCmdMoreWindows", acCmdMoreWindows);
    v.put("acCmdAppRestore", acCmdAppRestore);
    v.put("acCmdAppMaximize", acCmdAppMaximize);
    v.put("acCmdAppMinimize", acCmdAppMinimize);
    v.put("acCmdAppMove", acCmdAppMove);
    v.put("acCmdAppSize", acCmdAppSize);
    v.put("acCmdDocRestore", acCmdDocRestore);
    v.put("acCmdDocMaximize", acCmdDocMaximize);
    v.put("acCmdDocMove", acCmdDocMove);
    v.put("acCmdDocSize", acCmdDocSize);
    v.put("acCmdRefresh", acCmdRefresh);
    v.put("acCmdFont", acCmdFont);
    v.put("acCmdSave", acCmdSave);
    v.put("acCmdSaveAs", acCmdSaveAs);
    v.put("acCmdWindowCascade", acCmdWindowCascade);
    v.put("acCmdTileVertically", acCmdTileVertically);
    v.put("acCmdWindowArrangeIcons", acCmdWindowArrangeIcons);
    v.put("acCmdOpenDatabase", acCmdOpenDatabase);
    v.put("acCmdNewDatabase", acCmdNewDatabase);
    v.put("acCmdOLEDDELinks", acCmdOLEDDELinks);
    v.put("acCmdRecordsGoToNew", acCmdRecordsGoToNew);
    v.put("acCmdReplace", acCmdReplace);
    v.put("acCmdFind", acCmdFind);
    v.put("acCmdRunMacro", acCmdRunMacro);
    v.put("acCmdPageSetup", acCmdPageSetup);
    v.put("acCmdInsertObject", acCmdInsertObject);
    v.put("acCmdDuplicate", acCmdDuplicate);
    v.put("acCmdAboutMicrosoftAccess", acCmdAboutMicrosoftAccess);
    v.put("acCmdFormHdrFtr", acCmdFormHdrFtr);
    v.put("acCmdReportHdrFtr", acCmdReportHdrFtr);
    v.put("acCmdPasteAppend", acCmdPasteAppend);
    v.put("acCmdInsertFile", acCmdInsertFile);
    v.put("acCmdSelectForm", acCmdSelectForm);
    v.put("acCmdTabOrder", acCmdTabOrder);
    v.put("acCmdFieldList", acCmdFieldList);
    v.put("acCmdAlignLeft", acCmdAlignLeft);
    v.put("acCmdAlignRight", acCmdAlignRight);
    v.put("acCmdAlignTop", acCmdAlignTop);
    v.put("acCmdAlignBottom", acCmdAlignBottom);
    v.put("acCmdAlignToGrid", acCmdAlignToGrid);
    v.put("acCmdSizeToGrid", acCmdSizeToGrid);
    v.put("acCmdOptions", acCmdOptions);
    v.put("acCmdSelectRecord", acCmdSelectRecord);
    v.put("acCmdSortingAndGrouping", acCmdSortingAndGrouping);
    v.put("acCmdBringToFront", acCmdBringToFront);
    v.put("acCmdSendToBack", acCmdSendToBack);
    v.put("acCmdPrintPreview", acCmdPrintPreview);
    v.put("acCmdApplyDefault", acCmdApplyDefault);
    v.put("acCmdSetControlDefaults", acCmdSetControlDefaults);
    v.put("acCmdOLEObjectDefaultVerb", acCmdOLEObjectDefaultVerb);
    v.put("acCmdClose", acCmdClose);
    v.put("acCmdSizeToFit", acCmdSizeToFit);
    v.put("acCmdDocMinimize", acCmdDocMinimize);
    v.put("acCmdViewRuler", acCmdViewRuler);
    v.put("acCmdSnapToGrid", acCmdSnapToGrid);
    v.put("acCmdViewGrid", acCmdViewGrid);
    v.put("acCmdPasteSpecial", acCmdPasteSpecial);
    v.put("acCmdRecordsGoToNext", acCmdRecordsGoToNext);
    v.put("acCmdRecordsGoToPrevious", acCmdRecordsGoToPrevious);
    v.put("acCmdRecordsGoToFirst", acCmdRecordsGoToFirst);
    v.put("acCmdRecordsGoToLast", acCmdRecordsGoToLast);
    v.put("acCmdSizeToFitForm", acCmdSizeToFitForm);
    v.put("acCmdEditingAllowed", acCmdEditingAllowed);
    v.put("acCmdClearGrid", acCmdClearGrid);
    v.put("acCmdJoinProperties", acCmdJoinProperties);
    v.put("acCmdQueryTotals", acCmdQueryTotals);
    v.put("acCmdQueryTypeCrosstab", acCmdQueryTypeCrosstab);
    v.put("acCmdTableNames", acCmdTableNames);
    v.put("acCmdQueryParameters", acCmdQueryParameters);
    v.put("acCmdFormatCells", acCmdFormatCells);
    v.put("acCmdDataEntry", acCmdDataEntry);
    v.put("acCmdHideColumns", acCmdHideColumns);
    v.put("acCmdUnhideColumns", acCmdUnhideColumns);
    v.put("acCmdDeleteQueryColumn", acCmdDeleteQueryColumn);
    v.put("acCmdInsertQueryColumn", acCmdInsertQueryColumn);
    v.put("acCmdRemoveTable", acCmdRemoveTable);
    v.put("acCmdViewToolbox", acCmdViewToolbox);
    v.put("acCmdMacroNames", acCmdMacroNames);
    v.put("acCmdMacroConditions", acCmdMacroConditions);
    v.put("acCmdSingleStep", acCmdSingleStep);
    v.put("acCmdQueryTypeSelect", acCmdQueryTypeSelect);
    v.put("acCmdQueryTypeUpdate", acCmdQueryTypeUpdate);
    v.put("acCmdQueryTypeAppend", acCmdQueryTypeAppend);
    v.put("acCmdQueryTypeDelete", acCmdQueryTypeDelete);
    v.put("acCmdApplyFilterSort", acCmdApplyFilterSort);
    v.put("acCmdQueryTypeMakeTable", acCmdQueryTypeMakeTable);
    v.put("acCmdLoadFromQuery", acCmdLoadFromQuery);
    v.put("acCmdSaveAsQuery", acCmdSaveAsQuery);
    v.put("acCmdSaveRecord", acCmdSaveRecord);
    v.put("acCmdAdvancedFilterSort", acCmdAdvancedFilterSort);
    v.put("acCmdMicrosoftAccessHelpTopics", acCmdMicrosoftAccessHelpTopics);
    v.put("acCmdLinkTables", acCmdLinkTables);
    v.put("acCmdUserAndGroupPermissions", acCmdUserAndGroupPermissions);
    v.put("acCmdUserAndGroupAccounts", acCmdUserAndGroupAccounts);
    v.put("acCmdFreezeColumn", acCmdFreezeColumn);
    v.put("acCmdUnfreezeAllColumns", acCmdUnfreezeAllColumns);
    v.put("acCmdPrimaryKey", acCmdPrimaryKey);
    v.put("acCmdSubformDatasheet", acCmdSubformDatasheet);
    v.put("acCmdSelectAllRecords", acCmdSelectAllRecords);
    v.put("acCmdViewTables", acCmdViewTables);
    v.put("acCmdViewQueries", acCmdViewQueries);
    v.put("acCmdViewForms", acCmdViewForms);
    v.put("acCmdViewReports", acCmdViewReports);
    v.put("acCmdViewMacros", acCmdViewMacros);
    v.put("acCmdViewModules", acCmdViewModules);
    v.put("acCmdRowHeight", acCmdRowHeight);
    v.put("acCmdColumnWidth", acCmdColumnWidth);
    v.put("acCmdInsertFileIntoModule", acCmdInsertFileIntoModule);
    v.put("acCmdSaveModuleAsText", acCmdSaveModuleAsText);
    v.put("acCmdFindPrevious", acCmdFindPrevious);
    v.put("acCmdWindowSplit", acCmdWindowSplit);
    v.put("acCmdProcedureDefinition", acCmdProcedureDefinition);
    v.put("acCmdDebugWindow", acCmdDebugWindow);
    v.put("acCmdReset", acCmdReset);
    v.put("acCmdCompileAllModules", acCmdCompileAllModules);
    v.put("acCmdCompileAndSaveAllModules", acCmdCompileAndSaveAllModules);
    v.put("acCmdGoContinue", acCmdGoContinue);
    v.put("acCmdStepOver", acCmdStepOver);
    v.put("acCmdSetNextStatement", acCmdSetNextStatement);
    v.put("acCmdShowNextStatement", acCmdShowNextStatement);
    v.put("acCmdToggleBreakpoint", acCmdToggleBreakpoint);
    v.put("acCmdClearAllBreakpoints", acCmdClearAllBreakpoints);
    v.put("acCmdRelationships", acCmdRelationships);
    v.put("acCmdNewObjectTable", acCmdNewObjectTable);
    v.put("acCmdNewObjectQuery", acCmdNewObjectQuery);
    v.put("acCmdNewObjectForm", acCmdNewObjectForm);
    v.put("acCmdNewObjectReport", acCmdNewObjectReport);
    v.put("acCmdNewObjectMacro", acCmdNewObjectMacro);
    v.put("acCmdNewObjectModule", acCmdNewObjectModule);
    v.put("acCmdNewObjectClassModule", acCmdNewObjectClassModule);
    v.put("acCmdLayoutPreview", acCmdLayoutPreview);
    v.put("acCmdSaveAsReport", acCmdSaveAsReport);
    v.put("acCmdRename", acCmdRename);
    v.put("acCmdRemoveFilterSort", acCmdRemoveFilterSort);
    v.put("acCmdSaveLayout", acCmdSaveLayout);
    v.put("acCmdClearAll", acCmdClearAll);
    v.put("acCmdHideTable", acCmdHideTable);
    v.put("acCmdShowDirectRelationships", acCmdShowDirectRelationships);
    v.put("acCmdShowAllRelationships", acCmdShowAllRelationships);
    v.put("acCmdCreateRelationship", acCmdCreateRelationship);
    v.put("acCmdEditRelationship", acCmdEditRelationship);
    v.put("acCmdIndexes", acCmdIndexes);
    v.put("acCmdAlignToShortest", acCmdAlignToShortest);
    v.put("acCmdAlignToTallest", acCmdAlignToTallest);
    v.put("acCmdSizeToNarrowest", acCmdSizeToNarrowest);
    v.put("acCmdSizeToWidest", acCmdSizeToWidest);
    v.put("acCmdHorizontalSpacingMakeEqual", acCmdHorizontalSpacingMakeEqual);
    v.put("acCmdHorizontalSpacingDecrease", acCmdHorizontalSpacingDecrease);
    v.put("acCmdHorizontalSpacingIncrease", acCmdHorizontalSpacingIncrease);
    v.put("acCmdVerticalSpacingMakeEqual", acCmdVerticalSpacingMakeEqual);
    v.put("acCmdVerticalSpacingDecrease", acCmdVerticalSpacingDecrease);
    v.put("acCmdVerticalSpacingIncrease", acCmdVerticalSpacingIncrease);
    v.put("acCmdSortAscending", acCmdSortAscending);
    v.put("acCmdSortDescending", acCmdSortDescending);
    v.put("acCmdToolbarsCustomize", acCmdToolbarsCustomize);
    v.put("acCmdOLEObjectConvert", acCmdOLEObjectConvert);
    v.put("acCmdQueryTypeSQLDataDefinition", acCmdQueryTypeSQLDataDefinition);
    v.put("acCmdQueryTypeSQLPassThrough", acCmdQueryTypeSQLPassThrough);
    v.put("acCmdViewCode", acCmdViewCode);
    v.put("acCmdConvertDatabase", acCmdConvertDatabase);
    v.put("acCmdCallStack", acCmdCallStack);
    v.put("acCmdSend", acCmdSend);
    v.put("acCmdOutputToExcel", acCmdOutputToExcel);
    v.put("acCmdOutputToRTF", acCmdOutputToRTF);
    v.put("acCmdOutputToText", acCmdOutputToText);
    v.put("acCmdInvokeBuilder", acCmdInvokeBuilder);
    v.put("acCmdZoomBox", acCmdZoomBox);
    v.put("acCmdQueryTypeSQLUnion", acCmdQueryTypeSQLUnion);
    v.put("acCmdRun", acCmdRun);
    v.put("acCmdPageHdrFtr", acCmdPageHdrFtr);
    v.put("acCmdDesignView", acCmdDesignView);
    v.put("acCmdSQLView", acCmdSQLView);
    v.put("acCmdShowTable", acCmdShowTable);
    v.put("acCmdCloseWindow", acCmdCloseWindow);
    v.put("acCmdInsertRows", acCmdInsertRows);
    v.put("acCmdDeleteRows", acCmdDeleteRows);
    v.put("acCmdCut", acCmdCut);
    v.put("acCmdCopy", acCmdCopy);
    v.put("acCmdPaste", acCmdPaste);
    v.put("acCmdAutoDial", acCmdAutoDial);
    v.put("acCmdNewObjectAutoForm", acCmdNewObjectAutoForm);
    v.put("acCmdNewObjectAutoReport", acCmdNewObjectAutoReport);
    v.put("acCmdWordMailMerge", acCmdWordMailMerge);
    v.put("acCmdTestValidationRules", acCmdTestValidationRules);
    v.put("acCmdControlWizardsToggle", acCmdControlWizardsToggle);
    v.put("acCmdEnd", acCmdEnd);
    v.put("acCmdRedo", acCmdRedo);
    v.put("acCmdObjectBrowser", acCmdObjectBrowser);
    v.put("acCmdAddWatch", acCmdAddWatch);
    v.put("acCmdEditWatch", acCmdEditWatch);
    v.put("acCmdQuickWatch", acCmdQuickWatch);
    v.put("acCmdStepToCursor", acCmdStepToCursor);
    v.put("acCmdIndent", acCmdIndent);
    v.put("acCmdOutdent", acCmdOutdent);
    v.put("acCmdFilterByForm", acCmdFilterByForm);
    v.put("acCmdFilterBySelection", acCmdFilterBySelection);
    v.put("acCmdViewLargeIcons", acCmdViewLargeIcons);
    v.put("acCmdViewDetails", acCmdViewDetails);
    v.put("acCmdViewSmallIcons", acCmdViewSmallIcons);
    v.put("acCmdViewList", acCmdViewList);
    v.put("acCmdLineUpIcons", acCmdLineUpIcons);
    v.put("acCmdArrangeIconsByName", acCmdArrangeIconsByName);
    v.put("acCmdArrangeIconsByType", acCmdArrangeIconsByType);
    v.put("acCmdArrangeIconsByCreated", acCmdArrangeIconsByCreated);
    v.put("acCmdArrangeIconsByModified", acCmdArrangeIconsByModified);
    v.put("acCmdArrangeIconsAuto", acCmdArrangeIconsAuto);
    v.put("acCmdCreateShortcut", acCmdCreateShortcut);
    v.put("acCmdToggleFilter", acCmdToggleFilter);
    v.put("acCmdOpenTable", acCmdOpenTable);
    v.put("acCmdInsertPicture", acCmdInsertPicture);
    v.put("acCmdDeleteRecord", acCmdDeleteRecord);
    v.put("acCmdStartupProperties", acCmdStartupProperties);
    v.put("acCmdPageNumber", acCmdPageNumber);
    v.put("acCmdDateAndTime", acCmdDateAndTime);
    v.put("acCmdChangeToTextBox", acCmdChangeToTextBox);
    v.put("acCmdChangeToLabel", acCmdChangeToLabel);
    v.put("acCmdChangeToListBox", acCmdChangeToListBox);
    v.put("acCmdChangeToComboBox", acCmdChangeToComboBox);
    v.put("acCmdChangeToCheckBox", acCmdChangeToCheckBox);
    v.put("acCmdChangeToToggleButton", acCmdChangeToToggleButton);
    v.put("acCmdChangeToOptionButton", acCmdChangeToOptionButton);
    v.put("acCmdChangeToImage", acCmdChangeToImage);
    v.put("acCmdAnswerWizard", acCmdAnswerWizard);
    v.put("acCmdMicrosoftOnTheWeb", acCmdMicrosoftOnTheWeb);
    v.put("acCmdClearItemDefaults", acCmdClearItemDefaults);
    v.put("acCmdZoom200", acCmdZoom200);
    v.put("acCmdZoom150", acCmdZoom150);
    v.put("acCmdZoom100", acCmdZoom100);
    v.put("acCmdZoom75", acCmdZoom75);
    v.put("acCmdZoom50", acCmdZoom50);
    v.put("acCmdZoom25", acCmdZoom25);
    v.put("acCmdZoom10", acCmdZoom10);
    v.put("acCmdFitToWindow", acCmdFitToWindow);
    v.put("acCmdPreviewOnePage", acCmdPreviewOnePage);
    v.put("acCmdPreviewTwoPages", acCmdPreviewTwoPages);
    v.put("acCmdPreviewFourPages", acCmdPreviewFourPages);
    v.put("acCmdPreviewEightPages", acCmdPreviewEightPages);
    v.put("acCmdPreviewTwelvePages", acCmdPreviewTwelvePages);
    v.put("acCmdOpenURL", acCmdOpenURL);
    v.put("acCmdOpenStartPage", acCmdOpenStartPage);
    v.put("acCmdOpenSearchPage", acCmdOpenSearchPage);
    v.put("acCmdRegisterActiveXControls", acCmdRegisterActiveXControls);
    v.put("acCmdDeleteTab", acCmdDeleteTab);
    v.put("acCmdDatabaseProperties", acCmdDatabaseProperties);
    v.put("acCmdImport", acCmdImport);
    v.put("acCmdInsertActiveXControl", acCmdInsertActiveXControl);
    v.put("acCmdInsertHyperlink", acCmdInsertHyperlink);
    v.put("acCmdReferences", acCmdReferences);
    v.put("acCmdAutoCorrect", acCmdAutoCorrect);
    v.put("acCmdInsertProcedure", acCmdInsertProcedure);
    v.put("acCmdCreateReplica", acCmdCreateReplica);
    v.put("acCmdSynchronizeNow", acCmdSynchronizeNow);
    v.put("acCmdRecoverDesignMaster", acCmdRecoverDesignMaster);
    v.put("acCmdResolveConflicts", acCmdResolveConflicts);
    v.put("acCmdDeleteWatch", acCmdDeleteWatch);
    v.put("acCmdSpelling", acCmdSpelling);
    v.put("acCmdAutoFormat", acCmdAutoFormat);
    v.put("acCmdDeleteTableColumn", acCmdDeleteTableColumn);
    v.put("acCmdInsertTableColumn", acCmdInsertTableColumn);
    v.put("acCmdInsertLookupColumn", acCmdInsertLookupColumn);
    v.put("acCmdRenameColumn", acCmdRenameColumn);
    v.put("acCmdSetDatabasePassword", acCmdSetDatabasePassword);
    v.put("acCmdUserLevelSecurityWizard", acCmdUserLevelSecurityWizard);
    v.put("acCmdFilterExcludingSelection", acCmdFilterExcludingSelection);
    v.put("acCmdQuickPrint", acCmdQuickPrint);
    v.put("acCmdConvertMacrosToVisualBasic", acCmdConvertMacrosToVisualBasic);
    v.put("acCmdSaveAllModules", acCmdSaveAllModules);
    v.put("acCmdFormView", acCmdFormView);
    v.put("acCmdDatasheetView", acCmdDatasheetView);
    v.put("acCmdAnalyzePerformance", acCmdAnalyzePerformance);
    v.put("acCmdAnalyzeTable", acCmdAnalyzeTable);
    v.put("acCmdDocumenter", acCmdDocumenter);
    v.put("acCmdTileHorizontally", acCmdTileHorizontally);
    v.put("acCmdProperties", acCmdProperties);
    v.put("acCmdTransparentBackground", acCmdTransparentBackground);
    v.put("acCmdTransparentBorder", acCmdTransparentBorder);
    v.put("acCmdCompileLoadedModules", acCmdCompileLoadedModules);
    v.put("acCmdInsertLookupField", acCmdInsertLookupField);
    v.put("acCmdUndo", acCmdUndo);
    v.put("acCmdInsertChart", acCmdInsertChart);
    v.put("acCmdGoBack", acCmdGoBack);
    v.put("acCmdGoForward", acCmdGoForward);
    v.put("acCmdStopLoadingPage", acCmdStopLoadingPage);
    v.put("acCmdRefreshPage", acCmdRefreshPage);
    v.put("acCmdFavoritesOpen", acCmdFavoritesOpen);
    v.put("acCmdFavoritesAddTo", acCmdFavoritesAddTo);
    v.put("acCmdShowOnlyWebToolbar", acCmdShowOnlyWebToolbar);
    v.put("acCmdToolbarControlProperties", acCmdToolbarControlProperties);
    v.put("acCmdShowMembers", acCmdShowMembers);
    v.put("acCmdListConstants", acCmdListConstants);
    v.put("acCmdQuickInfo", acCmdQuickInfo);
    v.put("acCmdParameterInfo", acCmdParameterInfo);
    v.put("acCmdCompleteWord", acCmdCompleteWord);
    v.put("acCmdBookmarksToggle", acCmdBookmarksToggle);
    v.put("acCmdBookmarksNext", acCmdBookmarksNext);
    v.put("acCmdBookmarksPrevious", acCmdBookmarksPrevious);
    v.put("acCmdBookmarksClearAll", acCmdBookmarksClearAll);
    v.put("acCmdStepOut", acCmdStepOut);
    v.put("acCmdFindPrevWordUnderCursor", acCmdFindPrevWordUnderCursor);
    v.put("acCmdFindNextWordUnderCursor", acCmdFindNextWordUnderCursor);
    v.put("acCmdObjBrwFindWholeWordOnly", acCmdObjBrwFindWholeWordOnly);
    v.put("acCmdObjBrwShowHiddenMembers", acCmdObjBrwShowHiddenMembers);
    v.put("acCmdObjBrwHelp", acCmdObjBrwHelp);
    v.put("acCmdObjBrwViewDefinition", acCmdObjBrwViewDefinition);
    v.put("acCmdObjBrwGroupMembers", acCmdObjBrwGroupMembers);
    v.put("acCmdSelectReport", acCmdSelectReport);
    v.put("acCmdSaveAsHTML", acCmdSaveAsHTML);
    v.put("acCmdSaveAsIDC", acCmdSaveAsIDC);
    v.put("acCmdSaveAsASP", acCmdSaveAsASP);
    v.put("acCmdPublishDefaults", acCmdPublishDefaults);
    v.put("acCmdEditHyperlink", acCmdEditHyperlink);
    v.put("acCmdOpenHyperlink", acCmdOpenHyperlink);
    v.put("acCmdOpenNewHyperlink", acCmdOpenNewHyperlink);
    v.put("acCmdCopyHyperlink", acCmdCopyHyperlink);
    v.put("acCmdHyperlinkDisplayText", acCmdHyperlinkDisplayText);
    v.put("acCmdTabControlPageOrder", acCmdTabControlPageOrder);
    v.put("acCmdInsertPage", acCmdInsertPage);
    v.put("acCmdDeletePage", acCmdDeletePage);
    v.put("acCmdSelectAll", acCmdSelectAll);
    v.put("acCmdCreateMenuFromMacro", acCmdCreateMenuFromMacro);
    v.put("acCmdCreateToolbarFromMacro", acCmdCreateToolbarFromMacro);
    v.put("acCmdCreateShortcutMenuFromMacro", acCmdCreateShortcutMenuFromMacro);
    v.put("acCmdDelete", acCmdDelete);
    v.put("acCmdRunOpenMacro", acCmdRunOpenMacro);
    v.put("acCmdLastPosition", acCmdLastPosition);
    v.put("acCmdPrint", acCmdPrint);
    v.put("acCmdFindNext", acCmdFindNext);
    v.put("acCmdStepInto", acCmdStepInto);
    v.put("acCmdClearHyperlink", acCmdClearHyperlink);
    v.put("acCmdDataAccessPageBrowse", acCmdDataAccessPageBrowse);
    v.put("acCmdNewObjectDataAccessPage", acCmdNewObjectDataAccessPage);
    v.put("acCmdSelectDataAccessPage", acCmdSelectDataAccessPage);
    v.put("acCmdViewDataAccessPages", acCmdViewDataAccessPages);
    v.put("acCmdNewObjectView", acCmdNewObjectView);
    v.put("acCmdNewObjectStoredProcedure", acCmdNewObjectStoredProcedure);
    v.put("acCmdNewObjectDiagram", acCmdNewObjectDiagram);
    v.put("acCmdViewFieldList", acCmdViewFieldList);
    v.put("acCmdViewDiagrams", acCmdViewDiagrams);
    v.put("acCmdViewStoredProcedures", acCmdViewStoredProcedures);
    v.put("acCmdViewViews", acCmdViewViews);
    v.put("acCmdViewShowPaneSQL", acCmdViewShowPaneSQL);
    v.put("acCmdViewShowPaneDiagram", acCmdViewShowPaneDiagram);
    v.put("acCmdViewShowPaneGrid", acCmdViewShowPaneGrid);
    v.put("acCmdViewVerifySQL", acCmdViewVerifySQL);
    v.put("acCmdQueryGroupBy", acCmdQueryGroupBy);
    v.put("acCmdQueryAddToOutput", acCmdQueryAddToOutput);
    v.put("acCmdViewTableColumnNames", acCmdViewTableColumnNames);
    v.put("acCmdViewTableNameOnly", acCmdViewTableNameOnly);
    v.put("acCmdHidePane", acCmdHidePane);
    v.put("acCmdRemove", acCmdRemove);
    v.put("acCmdViewTableColumnProperties", acCmdViewTableColumnProperties);
    v.put("acCmdViewTableKeys", acCmdViewTableKeys);
    v.put("acCmdViewTableUserView", acCmdViewTableUserView);
    v.put("acCmdZoomSelection", acCmdZoomSelection);
    v.put("acCmdDiagramNewLabel", acCmdDiagramNewLabel);
    v.put("acCmdDiagramAddRelatedTables", acCmdDiagramAddRelatedTables);
    v.put("acCmdDiagramShowRelationshipLabels", acCmdDiagramShowRelationshipLabels);
    v.put("acCmdDiagramModifyUserDefinedView", acCmdDiagramModifyUserDefinedView);
    v.put("acCmdDiagramViewPageBreaks", acCmdDiagramViewPageBreaks);
    v.put("acCmdDiagramRecalculatePageBreaks", acCmdDiagramRecalculatePageBreaks);
    v.put("acCmdDiagramAutosizeSelectedTables", acCmdDiagramAutosizeSelectedTables);
    v.put("acCmdDiagramLayoutSelection", acCmdDiagramLayoutSelection);
    v.put("acCmdDiagramLayoutDiagram", acCmdDiagramLayoutDiagram);
    v.put("acCmdDiagramNewTable", acCmdDiagramNewTable);
    v.put("acCmdDiagramDeleteRelationship", acCmdDiagramDeleteRelationship);
    v.put("acCmdConnection", acCmdConnection);
    v.put("acCmdEditTriggers", acCmdEditTriggers);
    v.put("acCmdDataAccessPageDesignView", acCmdDataAccessPageDesignView);
    v.put("acCmdPromote", acCmdPromote);
    v.put("acCmdGroupByTable", acCmdGroupByTable);
    v.put("acCmdDemote", acCmdDemote);
    v.put("acCmdSaveAsDataAccessPage", acCmdSaveAsDataAccessPage);
    v.put("acCmdMicrosoftScriptEditor", acCmdMicrosoftScriptEditor);
    v.put("acCmdWorkgroupAdministrator", acCmdWorkgroupAdministrator);
    v.put("acCmdNewObjectFunction", acCmdNewObjectFunction);
    v.put("acCmdViewFunctions", acCmdViewFunctions);
    v.put("acCmdPivotTableView", acCmdPivotTableView);
    v.put("acCmdPivotChartView", acCmdPivotChartView);
    v.put("acCmdPivotAutoFilter", acCmdPivotAutoFilter);
    v.put("acCmdPivotTableSubtotal", acCmdPivotTableSubtotal);
    v.put("acCmdPivotCollapse", acCmdPivotCollapse);
    v.put("acCmdPivotExpand", acCmdPivotExpand);
    v.put("acCmdPivotTableHideDetails", acCmdPivotTableHideDetails);
    v.put("acCmdPivotTableShowDetails", acCmdPivotTableShowDetails);
    v.put("acCmdPivotRefresh", acCmdPivotRefresh);
    v.put("acCmdPivotTableExportToExcel", acCmdPivotTableExportToExcel);
    v.put("acCmdPivotTableMoveToRowArea", acCmdPivotTableMoveToRowArea);
    v.put("acCmdPivotTableMoveToColumnArea", acCmdPivotTableMoveToColumnArea);
    v.put("acCmdPivotTableMoveToFilterArea", acCmdPivotTableMoveToFilterArea);
    v.put("acCmdPivotTableMoveToDetailArea", acCmdPivotTableMoveToDetailArea);
    v.put("acCmdPivotTablePromote", acCmdPivotTablePromote);
    v.put("acCmdPivotTableDemote", acCmdPivotTableDemote);
    v.put("acCmdPivotAutoSum", acCmdPivotAutoSum);
    v.put("acCmdPivotAutoCount", acCmdPivotAutoCount);
    v.put("acCmdPivotAutoMin", acCmdPivotAutoMin);
    v.put("acCmdPivotAutoMax", acCmdPivotAutoMax);
    v.put("acCmdPivotAutoAverage", acCmdPivotAutoAverage);
    v.put("acCmdPivotAutoStdDev", acCmdPivotAutoStdDev);
    v.put("acCmdPivotAutoVar", acCmdPivotAutoVar);
    v.put("acCmdPivotAutoStdDevP", acCmdPivotAutoStdDevP);
    v.put("acCmdPivotAutoVarP", acCmdPivotAutoVarP);
    v.put("acCmdPivotShowTop1", acCmdPivotShowTop1);
    v.put("acCmdPivotShowTop2", acCmdPivotShowTop2);
    v.put("acCmdPivotShowTop5", acCmdPivotShowTop5);
    v.put("acCmdPivotShowTop10", acCmdPivotShowTop10);
    v.put("acCmdPivotShowTop25", acCmdPivotShowTop25);
    v.put("acCmdPivotShowTop1Percent", acCmdPivotShowTop1Percent);
    v.put("acCmdPivotShowTop2Percent", acCmdPivotShowTop2Percent);
    v.put("acCmdPivotShowTop5Percent", acCmdPivotShowTop5Percent);
    v.put("acCmdPivotShowTop10Percent", acCmdPivotShowTop10Percent);
    v.put("acCmdPivotShowTop25Percent", acCmdPivotShowTop25Percent);
    v.put("acCmdPivotShowTopOther", acCmdPivotShowTopOther);
    v.put("acCmdPivotShowBottom1", acCmdPivotShowBottom1);
    v.put("acCmdPivotShowBottom2", acCmdPivotShowBottom2);
    v.put("acCmdPivotShowBottom5", acCmdPivotShowBottom5);
    v.put("acCmdPivotShowBottom10", acCmdPivotShowBottom10);
    v.put("acCmdPivotShowBottom25", acCmdPivotShowBottom25);
    v.put("acCmdPivotShowBottom1Percent", acCmdPivotShowBottom1Percent);
    v.put("acCmdPivotShowBottom2Percent", acCmdPivotShowBottom2Percent);
    v.put("acCmdPivotShowBottom5Percent", acCmdPivotShowBottom5Percent);
    v.put("acCmdPivotShowBottom10Percent", acCmdPivotShowBottom10Percent);
    v.put("acCmdPivotShowBottom25Percent", acCmdPivotShowBottom25Percent);
    v.put("acCmdPivotShowBottomOther", acCmdPivotShowBottomOther);
    v.put("acCmdPivotTableCreateCalcTotal", acCmdPivotTableCreateCalcTotal);
    v.put("acCmdPivotTableCreateCalcField", acCmdPivotTableCreateCalcField);
    v.put("acCmdPivotTableShowAsNormal", acCmdPivotTableShowAsNormal);
    v.put("acCmdPivotTablePercentRowTotal", acCmdPivotTablePercentRowTotal);
    v.put("acCmdPivotTablePercentColumnTotal", acCmdPivotTablePercentColumnTotal);
    v.put("acCmdPivotTablePercentParentRowItem", acCmdPivotTablePercentParentRowItem);
    v.put("acCmdPivotTablePercentParentColumnItem", acCmdPivotTablePercentParentColumnItem);
    v.put("acCmdPivotTablePercentGrandTotal", acCmdPivotTablePercentGrandTotal);
    v.put("acCmdPivotTableExpandIndicators", acCmdPivotTableExpandIndicators);
    v.put("acCmdPivotDropAreas", acCmdPivotDropAreas);
    v.put("acCmdPivotChartType", acCmdPivotChartType);
    v.put("acCmdPivotDelete", acCmdPivotDelete);
    v.put("acCmdPivotChartShowLegend", acCmdPivotChartShowLegend);
    v.put("acCmdPivotChartByRowByColumn", acCmdPivotChartByRowByColumn);
    v.put("acCmdPivotChartDrillInto", acCmdPivotChartDrillInto);
    v.put("acCmdPivotChartMultiplePlots", acCmdPivotChartMultiplePlots);
    v.put("acCmdPivotChartMultiplePlotsUnifiedScale", acCmdPivotChartMultiplePlotsUnifiedScale);
    v.put("acCmdPivotChartUndo", acCmdPivotChartUndo);
    v.put("acCmdPivotShowAll", acCmdPivotShowAll);
    v.put("acCmdSubformFormView", acCmdSubformFormView);
    v.put("acCmdSubformDatasheetView", acCmdSubformDatasheetView);
    v.put("acCmdSubformPivotTableView", acCmdSubformPivotTableView);
    v.put("acCmdSubformPivotChartView", acCmdSubformPivotChartView);
    v.put("acCmdWebPagePreview", acCmdWebPagePreview);
    v.put("acCmdPageProperties", acCmdPageProperties);
    v.put("acCmdDataOutline", acCmdDataOutline);
    v.put("acCmdInsertMovieFromFile", acCmdInsertMovieFromFile);
    v.put("acCmdInsertPivotTable", acCmdInsertPivotTable);
    v.put("acCmdInsertSpreadsheet", acCmdInsertSpreadsheet);
    v.put("acCmdInsertUnboundSection", acCmdInsertUnboundSection);
    v.put("acCmdWebTheme", acCmdWebTheme);
    v.put("acCmdBackgroundPicture", acCmdBackgroundPicture);
    v.put("acCmdBackgroundSound", acCmdBackgroundSound);
    v.put("acCmdAlignMiddle", acCmdAlignMiddle);
    v.put("acCmdAlignCenter", acCmdAlignCenter);
    v.put("acCmdAlignmentAndSizing", acCmdAlignmentAndSizing);
    v.put("acCmdDataAccessPageFieldListRefresh", acCmdDataAccessPageFieldListRefresh);
    v.put("acCmdDataAccessPageAddToPage", acCmdDataAccessPageAddToPage);
    v.put("acCmdZoom500", acCmdZoom500);
    v.put("acCmdZoom1000", acCmdZoom1000);
    v.put("acCmdPrintRelationships", acCmdPrintRelationships);
    v.put("acCmdGroupControls", acCmdGroupControls);
    v.put("acCmdUngroupControls", acCmdUngroupControls);
    v.put("acCmdWebPageProperties", acCmdWebPageProperties);
    v.put("acCmdExport", acCmdExport);
    v.put("acCmdOfficeClipboard", acCmdOfficeClipboard);
    v.put("acCmdDeleteTable", acCmdDeleteTable);
    v.put("acCmdPasteAsHyperlink", acCmdPasteAsHyperlink);
    v.put("acCmdNewGroup", acCmdNewGroup);
    v.put("acCmdRenameGroup", acCmdRenameGroup);
    v.put("acCmdDeleteGroup", acCmdDeleteGroup);
    v.put("acCmdAddToNewGroup", acCmdAddToNewGroup);
    v.put("acCmdSubformInNewWindow", acCmdSubformInNewWindow);
    v.put("acCmdServerProperties", acCmdServerProperties);
    v.put("acCmdTableCustomView", acCmdTableCustomView);
    v.put("acCmdTableAddTable", acCmdTableAddTable);
    v.put("acCmdInsertSubdatasheet", acCmdInsertSubdatasheet);
    v.put("acCmdConditionalFormatting", acCmdConditionalFormatting);
    v.put("acCmdChangeToCommandButton", acCmdChangeToCommandButton);
    v.put("acCmdSubdatasheetExpandAll", acCmdSubdatasheetExpandAll);
    v.put("acCmdSubdatasheetCollapseAll", acCmdSubdatasheetCollapseAll);
    v.put("acCmdSubdatasheetRemove", acCmdSubdatasheetRemove);
    v.put("acCmdServerFilterByForm", acCmdServerFilterByForm);
    v.put("acCmdMaximiumRecords", acCmdMaximiumRecords);
    v.put("acCmdSpeech", acCmdSpeech);
    v.put("acCmdBackup", acCmdBackup);
    v.put("acCmdRestore", acCmdRestore);
    v.put("acCmdTransferSQLDatabase", acCmdTransferSQLDatabase);
    v.put("acCmdCopyDatabaseFile", acCmdCopyDatabaseFile);
    v.put("acCmdDropSQLDatabase", acCmdDropSQLDatabase);
    v.put("acCmdLinkedTableManager", acCmdLinkedTableManager);
    v.put("acCmdDatabaseSplitter", acCmdDatabaseSplitter);
    v.put("acCmdSwitchboardManager", acCmdSwitchboardManager);
    v.put("acCmdUpsizingWizard", acCmdUpsizingWizard);
    v.put("acCmdPartialReplicaWizard", acCmdPartialReplicaWizard);
    v.put("acCmdVisualBasicEditor", acCmdVisualBasicEditor);
    v.put("acCmdAddInManager", acCmdAddInManager);
    v.put("acCmdPivotTableClearCustomOrdering", acCmdPivotTableClearCustomOrdering);
    v.put("acCmdPivotTableFilterBySelection", acCmdPivotTableFilterBySelection);
    v.put("acCmdPivotTableRemove", acCmdPivotTableRemove);
    v.put("acCmdPivotTableGroupItems", acCmdPivotTableGroupItems);
    v.put("acCmdPivotTableUngroupItems", acCmdPivotTableUngroupItems);
    v.put("acCmdPivotChartDrillOut", acCmdPivotChartDrillOut);
    v.put("acCmdShowEnvelope", acCmdShowEnvelope);
    v.put("acCmdPivotChartSortAscByTotal", acCmdPivotChartSortAscByTotal);
    v.put("acCmdPivotChartSortDescByTotal", acCmdPivotChartSortDescByTotal);
    v.put("acCmdViewObjectDependencies", acCmdViewObjectDependencies);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
