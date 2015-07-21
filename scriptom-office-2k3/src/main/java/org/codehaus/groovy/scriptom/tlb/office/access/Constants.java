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
 * Predefined constants
 * @author Jason Smith
 */
public final class Constants
{
  private Constants()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acDataErrContinue = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acDataErrDisplay = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acDataErrAdded = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acDeleteOK = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acDeleteCancel = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acDeleteUserCancel = Integer.valueOf(2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acObjStateOpen = Integer.valueOf(1);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acObjStateNew = Integer.valueOf(4);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acObjStateDirty = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acLBInitialize = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acLBOpen = Integer.valueOf(1);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acLBGetRowCount = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acLBGetColumnCount = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer acLBGetColumnWidth = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer acLBGetValue = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer acLBGetFormat = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer acLBClose = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer acLBEnd = Integer.valueOf(9);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acPropCatNA = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acPropCatLayout = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acPropCatData = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acPropCatEvent = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer acPropCatOther = Integer.valueOf(8);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acPrompt = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acSave = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acExit = Integer.valueOf(2);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acOLEEither = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acOLECreateEmbed = Integer.valueOf(0);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acOLECreateNew = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acOLECreateLink = Integer.valueOf(1);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acOLECreateFromFile = Integer.valueOf(1);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acOLECopy = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer acOLEPaste = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer acOLEUpdate = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer acOLEActivate = Integer.valueOf(7);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer acOLEClose = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer acOLEDelete = Integer.valueOf(10);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer acOLEInsertObjDlg = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer acOLEPasteSpecialDlg = Integer.valueOf(15);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer acOLEFetchVerbs = Integer.valueOf(17);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acOLEDisplayContent = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acOLEDisplayIcon = Integer.valueOf(1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acOLELinked = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acOLEEmbedded = Integer.valueOf(1);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acOLENone = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acOLESizeClip = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acOLESizeStretch = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acOLESizeAutoSize = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acOLESizeZoom = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acOLEUpdateAutomatic = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acOLEUpdateFrozen = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acOLEUpdateManual = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acOLEActivateManual = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acOLEActivateGetFocus = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acOLEActivateDoubleClick = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acOLEVerbPrimary = Integer.valueOf(0);

  /**
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer acOLEVerbShow = Integer.valueOf(-1);

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer acOLEVerbOpen = Integer.valueOf(-2);

  /**
   * Value is -3 (0xFFFFFFFD)
   */
  public static final Integer acOLEVerbHide = Integer.valueOf(-3);

  /**
   * Value is -4 (0xFFFFFFFC)
   */
  public static final Integer acOLEVerbInPlaceUIActivate = Integer.valueOf(-4);

  /**
   * Value is -5 (0xFFFFFFFB)
   */
  public static final Integer acOLEVerbInPlaceActivate = Integer.valueOf(-5);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer acMenuVer1X = Integer.valueOf(11);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer acMenuVer20 = Integer.valueOf(20);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer acMenuVer70 = Integer.valueOf(70);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acFormBar = Integer.valueOf(0);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acFile = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acEditMenu = Integer.valueOf(1);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer acRecordsMenu = Integer.valueOf(5);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acNew = Integer.valueOf(0);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acSaveForm = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer acSaveFormAs = Integer.valueOf(5);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acSaveRecord = Integer.valueOf(4);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acUndo = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acCut = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acCopy = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acPaste = Integer.valueOf(3);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer acDelete = Integer.valueOf(6);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer acSelectRecord = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer acSelectAllRecords = Integer.valueOf(9);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer acObject = Integer.valueOf(14);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer acRefresh = Integer.valueOf(5);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acObjectVerb = Integer.valueOf(0);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acObjectUpdate = Integer.valueOf(3);

  /**
   * Value is Rich Text Format (*.rtf) 
   */
  public static final String acFormatRTF = "Rich Text Format (*.rtf)";

  /**
   * Value is Microsoft Excel (*.xls) 
   */
  public static final String acFormatXLS = "Microsoft Excel (*.xls)";

  /**
   * Value is MS-DOS Text (*.txt) 
   */
  public static final String acFormatTXT = "MS-DOS Text (*.txt)";

  /**
   * Value is HTML (*.html) 
   */
  public static final String acFormatHTML = "HTML (*.html)";

  /**
   * Value is Microsoft IIS (*.htx; *.idc) 
   */
  public static final String acFormatIIS = "Microsoft IIS (*.htx; *.idc)";

  /**
   * Value is Microsoft Active Server Pages (*.asp) 
   */
  public static final String acFormatASP = "Microsoft Active Server Pages (*.asp)";

  /**
   * Value is Microsoft Access Data Access Page (*.htm; *.html) 
   */
  public static final String acFormatDAP = "Microsoft Access Data Access Page (*.htm; *.html)";

  /**
   * Value is Snapshot Format (*.snp) 
   */
  public static final String acFormatSNP = "Snapshot Format (*.snp)";

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acSecFrmRptReadDef = Integer.valueOf(4);

  /**
   * Value is 65548 (0x1000C)
   */
  public static final Integer acSecFrmRptWriteDef = Integer.valueOf(65548);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer acSecFrmRptExecute = Integer.valueOf(256);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer acSecMacReadDef = Integer.valueOf(10);

  /**
   * Value is 65542 (0x10006)
   */
  public static final Integer acSecMacWriteDef = Integer.valueOf(65542);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer acSecMacExecute = Integer.valueOf(8);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acSecModReadDef = Integer.valueOf(2);

  /**
   * Value is 65542 (0x10006)
   */
  public static final Integer acSecModWriteDef = Integer.valueOf(65542);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acMenuUngray = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acMenuGray = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acMenuUncheck = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acMenuCheck = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acEffectNormal = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acEffectRaised = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acEffectSunken = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acEffectEtched = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acEffectShadow = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer acEffectChisel = Integer.valueOf(5);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acGridlinesNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acGridlinesHoriz = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acGridlinesVert = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acGridlinesBoth = Integer.valueOf(3);

  /**
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer acGridlinesBothV2 = Integer.valueOf(-1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acFilterByForm = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acFilterAdvanced = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acServerFilterByForm = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acShowAllRecords = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acApplyFilter = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acCloseFilterWindow = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acApplyServerFilter = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acCloseServerFilterWindow = Integer.valueOf(4);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acShiftMask = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acCtrlMask = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acAltMask = Integer.valueOf(4);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acLeftButton = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acRightButton = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acMiddleButton = Integer.valueOf(4);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer acOLEChanged = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acOLESaved = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acOLEClosed = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acOLERenamed = Integer.valueOf(3);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer vbKeyLButton = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer vbKeyRButton = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer vbKeyCancel = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer vbKeyMButton = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer vbKeyBack = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer vbKeyTab = Integer.valueOf(9);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer vbKeyClear = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer vbKeyReturn = Integer.valueOf(13);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer vbKeyShift = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer vbKeyControl = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer vbKeyMenu = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer vbKeyPause = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer vbKeyCapital = Integer.valueOf(20);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer vbKeyEscape = Integer.valueOf(27);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer vbKeySpace = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer vbKeyPageUp = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer vbKeyPageDown = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer vbKeyEnd = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer vbKeyHome = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer vbKeyLeft = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer vbKeyUp = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer vbKeyRight = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer vbKeyDown = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer vbKeySelect = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer vbKeyPrint = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer vbKeyExecute = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer vbKeySnapshot = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer vbKeyInsert = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer vbKeyDelete = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer vbKeyHelp = Integer.valueOf(47);

  /**
   * Value is 144 (0x90)
   */
  public static final Integer vbKeyNumlock = Integer.valueOf(144);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer vbKeyA = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer vbKeyB = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer vbKeyC = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer vbKeyD = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer vbKeyE = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer vbKeyF = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer vbKeyG = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer vbKeyH = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer vbKeyI = Integer.valueOf(73);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer vbKeyJ = Integer.valueOf(74);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer vbKeyK = Integer.valueOf(75);

  /**
   * Value is 76 (0x4C)
   */
  public static final Integer vbKeyL = Integer.valueOf(76);

  /**
   * Value is 77 (0x4D)
   */
  public static final Integer vbKeyM = Integer.valueOf(77);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer vbKeyN = Integer.valueOf(78);

  /**
   * Value is 79 (0x4F)
   */
  public static final Integer vbKeyO = Integer.valueOf(79);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer vbKeyP = Integer.valueOf(80);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer vbKeyQ = Integer.valueOf(81);

  /**
   * Value is 82 (0x52)
   */
  public static final Integer vbKeyR = Integer.valueOf(82);

  /**
   * Value is 83 (0x53)
   */
  public static final Integer vbKeyS = Integer.valueOf(83);

  /**
   * Value is 84 (0x54)
   */
  public static final Integer vbKeyT = Integer.valueOf(84);

  /**
   * Value is 85 (0x55)
   */
  public static final Integer vbKeyU = Integer.valueOf(85);

  /**
   * Value is 86 (0x56)
   */
  public static final Integer vbKeyV = Integer.valueOf(86);

  /**
   * Value is 87 (0x57)
   */
  public static final Integer vbKeyW = Integer.valueOf(87);

  /**
   * Value is 88 (0x58)
   */
  public static final Integer vbKeyX = Integer.valueOf(88);

  /**
   * Value is 89 (0x59)
   */
  public static final Integer vbKeyY = Integer.valueOf(89);

  /**
   * Value is 90 (0x5A)
   */
  public static final Integer vbKeyZ = Integer.valueOf(90);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer vbKey0 = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer vbKey1 = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer vbKey2 = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer vbKey3 = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer vbKey4 = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer vbKey5 = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer vbKey6 = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer vbKey7 = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer vbKey8 = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer vbKey9 = Integer.valueOf(57);

  /**
   * Value is 96 (0x60)
   */
  public static final Integer vbKeyNumpad0 = Integer.valueOf(96);

  /**
   * Value is 97 (0x61)
   */
  public static final Integer vbKeyNumpad1 = Integer.valueOf(97);

  /**
   * Value is 98 (0x62)
   */
  public static final Integer vbKeyNumpad2 = Integer.valueOf(98);

  /**
   * Value is 99 (0x63)
   */
  public static final Integer vbKeyNumpad3 = Integer.valueOf(99);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer vbKeyNumpad4 = Integer.valueOf(100);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer vbKeyNumpad5 = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer vbKeyNumpad6 = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer vbKeyNumpad7 = Integer.valueOf(103);

  /**
   * Value is 104 (0x68)
   */
  public static final Integer vbKeyNumpad8 = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer vbKeyNumpad9 = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer vbKeyMultiply = Integer.valueOf(106);

  /**
   * Value is 107 (0x6B)
   */
  public static final Integer vbKeyAdd = Integer.valueOf(107);

  /**
   * Value is 108 (0x6C)
   */
  public static final Integer vbKeySeparator = Integer.valueOf(108);

  /**
   * Value is 109 (0x6D)
   */
  public static final Integer vbKeySubtract = Integer.valueOf(109);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer vbKeyDecimal = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer vbKeyDivide = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer vbKeyF1 = Integer.valueOf(112);

  /**
   * Value is 113 (0x71)
   */
  public static final Integer vbKeyF2 = Integer.valueOf(113);

  /**
   * Value is 114 (0x72)
   */
  public static final Integer vbKeyF3 = Integer.valueOf(114);

  /**
   * Value is 115 (0x73)
   */
  public static final Integer vbKeyF4 = Integer.valueOf(115);

  /**
   * Value is 116 (0x74)
   */
  public static final Integer vbKeyF5 = Integer.valueOf(116);

  /**
   * Value is 117 (0x75)
   */
  public static final Integer vbKeyF6 = Integer.valueOf(117);

  /**
   * Value is 118 (0x76)
   */
  public static final Integer vbKeyF7 = Integer.valueOf(118);

  /**
   * Value is 119 (0x77)
   */
  public static final Integer vbKeyF8 = Integer.valueOf(119);

  /**
   * Value is 120 (0x78)
   */
  public static final Integer vbKeyF9 = Integer.valueOf(120);

  /**
   * Value is 121 (0x79)
   */
  public static final Integer vbKeyF10 = Integer.valueOf(121);

  /**
   * Value is 122 (0x7A)
   */
  public static final Integer vbKeyF11 = Integer.valueOf(122);

  /**
   * Value is 123 (0x7B)
   */
  public static final Integer vbKeyF12 = Integer.valueOf(123);

  /**
   * Value is 124 (0x7C)
   */
  public static final Integer vbKeyF13 = Integer.valueOf(124);

  /**
   * Value is 125 (0x7D)
   */
  public static final Integer vbKeyF14 = Integer.valueOf(125);

  /**
   * Value is 126 (0x7E)
   */
  public static final Integer vbKeyF15 = Integer.valueOf(126);

  /**
   * Value is 127 (0x7F)
   */
  public static final Integer vbKeyF16 = Integer.valueOf(127);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("acDataErrContinue", acDataErrContinue);
    v.put("acDataErrDisplay", acDataErrDisplay);
    v.put("acDataErrAdded", acDataErrAdded);
    v.put("acDeleteOK", acDeleteOK);
    v.put("acDeleteCancel", acDeleteCancel);
    v.put("acDeleteUserCancel", acDeleteUserCancel);
    v.put("acObjStateOpen", acObjStateOpen);
    v.put("acObjStateNew", acObjStateNew);
    v.put("acObjStateDirty", acObjStateDirty);
    v.put("acLBInitialize", acLBInitialize);
    v.put("acLBOpen", acLBOpen);
    v.put("acLBGetRowCount", acLBGetRowCount);
    v.put("acLBGetColumnCount", acLBGetColumnCount);
    v.put("acLBGetColumnWidth", acLBGetColumnWidth);
    v.put("acLBGetValue", acLBGetValue);
    v.put("acLBGetFormat", acLBGetFormat);
    v.put("acLBClose", acLBClose);
    v.put("acLBEnd", acLBEnd);
    v.put("acPropCatNA", acPropCatNA);
    v.put("acPropCatLayout", acPropCatLayout);
    v.put("acPropCatData", acPropCatData);
    v.put("acPropCatEvent", acPropCatEvent);
    v.put("acPropCatOther", acPropCatOther);
    v.put("acPrompt", acPrompt);
    v.put("acSave", acSave);
    v.put("acExit", acExit);
    v.put("acOLEEither", acOLEEither);
    v.put("acOLECreateEmbed", acOLECreateEmbed);
    v.put("acOLECreateNew", acOLECreateNew);
    v.put("acOLECreateLink", acOLECreateLink);
    v.put("acOLECreateFromFile", acOLECreateFromFile);
    v.put("acOLECopy", acOLECopy);
    v.put("acOLEPaste", acOLEPaste);
    v.put("acOLEUpdate", acOLEUpdate);
    v.put("acOLEActivate", acOLEActivate);
    v.put("acOLEClose", acOLEClose);
    v.put("acOLEDelete", acOLEDelete);
    v.put("acOLEInsertObjDlg", acOLEInsertObjDlg);
    v.put("acOLEPasteSpecialDlg", acOLEPasteSpecialDlg);
    v.put("acOLEFetchVerbs", acOLEFetchVerbs);
    v.put("acOLEDisplayContent", acOLEDisplayContent);
    v.put("acOLEDisplayIcon", acOLEDisplayIcon);
    v.put("acOLELinked", acOLELinked);
    v.put("acOLEEmbedded", acOLEEmbedded);
    v.put("acOLENone", acOLENone);
    v.put("acOLESizeClip", acOLESizeClip);
    v.put("acOLESizeStretch", acOLESizeStretch);
    v.put("acOLESizeAutoSize", acOLESizeAutoSize);
    v.put("acOLESizeZoom", acOLESizeZoom);
    v.put("acOLEUpdateAutomatic", acOLEUpdateAutomatic);
    v.put("acOLEUpdateFrozen", acOLEUpdateFrozen);
    v.put("acOLEUpdateManual", acOLEUpdateManual);
    v.put("acOLEActivateManual", acOLEActivateManual);
    v.put("acOLEActivateGetFocus", acOLEActivateGetFocus);
    v.put("acOLEActivateDoubleClick", acOLEActivateDoubleClick);
    v.put("acOLEVerbPrimary", acOLEVerbPrimary);
    v.put("acOLEVerbShow", acOLEVerbShow);
    v.put("acOLEVerbOpen", acOLEVerbOpen);
    v.put("acOLEVerbHide", acOLEVerbHide);
    v.put("acOLEVerbInPlaceUIActivate", acOLEVerbInPlaceUIActivate);
    v.put("acOLEVerbInPlaceActivate", acOLEVerbInPlaceActivate);
    v.put("acMenuVer1X", acMenuVer1X);
    v.put("acMenuVer20", acMenuVer20);
    v.put("acMenuVer70", acMenuVer70);
    v.put("acFormBar", acFormBar);
    v.put("acFile", acFile);
    v.put("acEditMenu", acEditMenu);
    v.put("acRecordsMenu", acRecordsMenu);
    v.put("acNew", acNew);
    v.put("acSaveForm", acSaveForm);
    v.put("acSaveFormAs", acSaveFormAs);
    v.put("acSaveRecord", acSaveRecord);
    v.put("acUndo", acUndo);
    v.put("acCut", acCut);
    v.put("acCopy", acCopy);
    v.put("acPaste", acPaste);
    v.put("acDelete", acDelete);
    v.put("acSelectRecord", acSelectRecord);
    v.put("acSelectAllRecords", acSelectAllRecords);
    v.put("acObject", acObject);
    v.put("acRefresh", acRefresh);
    v.put("acObjectVerb", acObjectVerb);
    v.put("acObjectUpdate", acObjectUpdate);
    v.put("acFormatRTF", acFormatRTF);
    v.put("acFormatXLS", acFormatXLS);
    v.put("acFormatTXT", acFormatTXT);
    v.put("acFormatHTML", acFormatHTML);
    v.put("acFormatIIS", acFormatIIS);
    v.put("acFormatASP", acFormatASP);
    v.put("acFormatDAP", acFormatDAP);
    v.put("acFormatSNP", acFormatSNP);
    v.put("acSecFrmRptReadDef", acSecFrmRptReadDef);
    v.put("acSecFrmRptWriteDef", acSecFrmRptWriteDef);
    v.put("acSecFrmRptExecute", acSecFrmRptExecute);
    v.put("acSecMacReadDef", acSecMacReadDef);
    v.put("acSecMacWriteDef", acSecMacWriteDef);
    v.put("acSecMacExecute", acSecMacExecute);
    v.put("acSecModReadDef", acSecModReadDef);
    v.put("acSecModWriteDef", acSecModWriteDef);
    v.put("acMenuUngray", acMenuUngray);
    v.put("acMenuGray", acMenuGray);
    v.put("acMenuUncheck", acMenuUncheck);
    v.put("acMenuCheck", acMenuCheck);
    v.put("acEffectNormal", acEffectNormal);
    v.put("acEffectRaised", acEffectRaised);
    v.put("acEffectSunken", acEffectSunken);
    v.put("acEffectEtched", acEffectEtched);
    v.put("acEffectShadow", acEffectShadow);
    v.put("acEffectChisel", acEffectChisel);
    v.put("acGridlinesNone", acGridlinesNone);
    v.put("acGridlinesHoriz", acGridlinesHoriz);
    v.put("acGridlinesVert", acGridlinesVert);
    v.put("acGridlinesBoth", acGridlinesBoth);
    v.put("acGridlinesBothV2", acGridlinesBothV2);
    v.put("acFilterByForm", acFilterByForm);
    v.put("acFilterAdvanced", acFilterAdvanced);
    v.put("acServerFilterByForm", acServerFilterByForm);
    v.put("acShowAllRecords", acShowAllRecords);
    v.put("acApplyFilter", acApplyFilter);
    v.put("acCloseFilterWindow", acCloseFilterWindow);
    v.put("acApplyServerFilter", acApplyServerFilter);
    v.put("acCloseServerFilterWindow", acCloseServerFilterWindow);
    v.put("acShiftMask", acShiftMask);
    v.put("acCtrlMask", acCtrlMask);
    v.put("acAltMask", acAltMask);
    v.put("acLeftButton", acLeftButton);
    v.put("acRightButton", acRightButton);
    v.put("acMiddleButton", acMiddleButton);
    v.put("acOLEChanged", acOLEChanged);
    v.put("acOLESaved", acOLESaved);
    v.put("acOLEClosed", acOLEClosed);
    v.put("acOLERenamed", acOLERenamed);
    v.put("vbKeyLButton", vbKeyLButton);
    v.put("vbKeyRButton", vbKeyRButton);
    v.put("vbKeyCancel", vbKeyCancel);
    v.put("vbKeyMButton", vbKeyMButton);
    v.put("vbKeyBack", vbKeyBack);
    v.put("vbKeyTab", vbKeyTab);
    v.put("vbKeyClear", vbKeyClear);
    v.put("vbKeyReturn", vbKeyReturn);
    v.put("vbKeyShift", vbKeyShift);
    v.put("vbKeyControl", vbKeyControl);
    v.put("vbKeyMenu", vbKeyMenu);
    v.put("vbKeyPause", vbKeyPause);
    v.put("vbKeyCapital", vbKeyCapital);
    v.put("vbKeyEscape", vbKeyEscape);
    v.put("vbKeySpace", vbKeySpace);
    v.put("vbKeyPageUp", vbKeyPageUp);
    v.put("vbKeyPageDown", vbKeyPageDown);
    v.put("vbKeyEnd", vbKeyEnd);
    v.put("vbKeyHome", vbKeyHome);
    v.put("vbKeyLeft", vbKeyLeft);
    v.put("vbKeyUp", vbKeyUp);
    v.put("vbKeyRight", vbKeyRight);
    v.put("vbKeyDown", vbKeyDown);
    v.put("vbKeySelect", vbKeySelect);
    v.put("vbKeyPrint", vbKeyPrint);
    v.put("vbKeyExecute", vbKeyExecute);
    v.put("vbKeySnapshot", vbKeySnapshot);
    v.put("vbKeyInsert", vbKeyInsert);
    v.put("vbKeyDelete", vbKeyDelete);
    v.put("vbKeyHelp", vbKeyHelp);
    v.put("vbKeyNumlock", vbKeyNumlock);
    v.put("vbKeyA", vbKeyA);
    v.put("vbKeyB", vbKeyB);
    v.put("vbKeyC", vbKeyC);
    v.put("vbKeyD", vbKeyD);
    v.put("vbKeyE", vbKeyE);
    v.put("vbKeyF", vbKeyF);
    v.put("vbKeyG", vbKeyG);
    v.put("vbKeyH", vbKeyH);
    v.put("vbKeyI", vbKeyI);
    v.put("vbKeyJ", vbKeyJ);
    v.put("vbKeyK", vbKeyK);
    v.put("vbKeyL", vbKeyL);
    v.put("vbKeyM", vbKeyM);
    v.put("vbKeyN", vbKeyN);
    v.put("vbKeyO", vbKeyO);
    v.put("vbKeyP", vbKeyP);
    v.put("vbKeyQ", vbKeyQ);
    v.put("vbKeyR", vbKeyR);
    v.put("vbKeyS", vbKeyS);
    v.put("vbKeyT", vbKeyT);
    v.put("vbKeyU", vbKeyU);
    v.put("vbKeyV", vbKeyV);
    v.put("vbKeyW", vbKeyW);
    v.put("vbKeyX", vbKeyX);
    v.put("vbKeyY", vbKeyY);
    v.put("vbKeyZ", vbKeyZ);
    v.put("vbKey0", vbKey0);
    v.put("vbKey1", vbKey1);
    v.put("vbKey2", vbKey2);
    v.put("vbKey3", vbKey3);
    v.put("vbKey4", vbKey4);
    v.put("vbKey5", vbKey5);
    v.put("vbKey6", vbKey6);
    v.put("vbKey7", vbKey7);
    v.put("vbKey8", vbKey8);
    v.put("vbKey9", vbKey9);
    v.put("vbKeyNumpad0", vbKeyNumpad0);
    v.put("vbKeyNumpad1", vbKeyNumpad1);
    v.put("vbKeyNumpad2", vbKeyNumpad2);
    v.put("vbKeyNumpad3", vbKeyNumpad3);
    v.put("vbKeyNumpad4", vbKeyNumpad4);
    v.put("vbKeyNumpad5", vbKeyNumpad5);
    v.put("vbKeyNumpad6", vbKeyNumpad6);
    v.put("vbKeyNumpad7", vbKeyNumpad7);
    v.put("vbKeyNumpad8", vbKeyNumpad8);
    v.put("vbKeyNumpad9", vbKeyNumpad9);
    v.put("vbKeyMultiply", vbKeyMultiply);
    v.put("vbKeyAdd", vbKeyAdd);
    v.put("vbKeySeparator", vbKeySeparator);
    v.put("vbKeySubtract", vbKeySubtract);
    v.put("vbKeyDecimal", vbKeyDecimal);
    v.put("vbKeyDivide", vbKeyDivide);
    v.put("vbKeyF1", vbKeyF1);
    v.put("vbKeyF2", vbKeyF2);
    v.put("vbKeyF3", vbKeyF3);
    v.put("vbKeyF4", vbKeyF4);
    v.put("vbKeyF5", vbKeyF5);
    v.put("vbKeyF6", vbKeyF6);
    v.put("vbKeyF7", vbKeyF7);
    v.put("vbKeyF8", vbKeyF8);
    v.put("vbKeyF9", vbKeyF9);
    v.put("vbKeyF10", vbKeyF10);
    v.put("vbKeyF11", vbKeyF11);
    v.put("vbKeyF12", vbKeyF12);
    v.put("vbKeyF13", vbKeyF13);
    v.put("vbKeyF14", vbKeyF14);
    v.put("vbKeyF15", vbKeyF15);
    v.put("vbKeyF16", vbKeyF16);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
