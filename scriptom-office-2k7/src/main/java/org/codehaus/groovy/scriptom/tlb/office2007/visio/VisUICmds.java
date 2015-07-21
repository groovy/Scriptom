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
package org.codehaus.groovy.scriptom.tlb.office2007.visio;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * Command numbers to be used with CmdNum property. These also correspond to scope id's passed with EnterScope and ExitScope events, and pass command ranges to Get/SetFilterCommands.
 * @author Jason Smith
 */
public final class VisUICmds
{
  private VisUICmds()
  {
  }

  /**
   * A value <= the id of any command.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visCmdFirst = Integer.valueOf(0);

  /**
   * A value >= the id of any command.<p>
   * Value is 65535 (0xFFFF)
   */
  public static final Integer visCmdLast = Integer.valueOf(65535);

  /**
   * This will be the CmdNum of a MenuItem representing a submenu.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visCmdHierarchical = Integer.valueOf(0);

  /**
   * Value is 1001 (0x3E9)
   */
  public static final Integer visCmdFileNew = Integer.valueOf(1001);

  /**
   * Value is 1002 (0x3EA)
   */
  public static final Integer visCmdFileOpen = Integer.valueOf(1002);

  /**
   * Value is 1003 (0x3EB)
   */
  public static final Integer visCmdFileClose = Integer.valueOf(1003);

  /**
   * Value is 1004 (0x3EC)
   */
  public static final Integer visCmdFileSave = Integer.valueOf(1004);

  /**
   * Value is 1005 (0x3ED)
   */
  public static final Integer visCmdFileSaveAs = Integer.valueOf(1005);

  /**
   * Value is 1006 (0x3EE)
   */
  public static final Integer visCmdFileSaveWorkspace = Integer.valueOf(1006);

  /**
   * Value is 1007 (0x3EF)
   */
  public static final Integer visCmdFileImport = Integer.valueOf(1007);

  /**
   * Value is 1009 (0x3F1)
   */
  public static final Integer visCmdFileSummaryInfoDlg = Integer.valueOf(1009);

  /**
   * Value is 1010 (0x3F2)
   */
  public static final Integer visCmdFilePrint = Integer.valueOf(1010);

  /**
   * Value is 1012 (0x3F4)
   */
  public static final Integer visCmdFileLastFile1 = Integer.valueOf(1012);

  /**
   * Value is 1013 (0x3F5)
   */
  public static final Integer visCmdFileLastFile2 = Integer.valueOf(1013);

  /**
   * Value is 1014 (0x3F6)
   */
  public static final Integer visCmdFileLastFile3 = Integer.valueOf(1014);

  /**
   * Value is 1015 (0x3F7)
   */
  public static final Integer visCmdFileLastFile4 = Integer.valueOf(1015);

  /**
   * Value is 1016 (0x3F8)
   */
  public static final Integer visCmdFileExit = Integer.valueOf(1016);

  /**
   * Value is 1017 (0x3F9)
   */
  public static final Integer visCmdEditUndo = Integer.valueOf(1017);

  /**
   * Value is 1018 (0x3FA)
   */
  public static final Integer visCmdEditRedo = Integer.valueOf(1018);

  /**
   * Value is 1019 (0x3FB)
   */
  public static final Integer visCmdEditRepeat = Integer.valueOf(1019);

  /**
   * Value is 1020 (0x3FC)
   */
  public static final Integer visCmdUFEditCut = Integer.valueOf(1020);

  /**
   * Value is 1021 (0x3FD)
   */
  public static final Integer visCmdUFEditCopy = Integer.valueOf(1021);

  /**
   * Value is 1022 (0x3FE)
   */
  public static final Integer visCmdUFEditPaste = Integer.valueOf(1022);

  /**
   * Value is 1023 (0x3FF)
   */
  public static final Integer visCmdUFEditClear = Integer.valueOf(1023);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer visCmdUFEditDuplicate = Integer.valueOf(1024);

  /**
   * Value is 1025 (0x401)
   */
  public static final Integer visCmdUFEditSelectAll = Integer.valueOf(1025);

  /**
   * Value is 1026 (0x402)
   */
  public static final Integer visCmdEditSelectSpecial = Integer.valueOf(1026);

  /**
   * Value is 1027 (0x403)
   */
  public static final Integer visCmdEditPasteSpecial = Integer.valueOf(1027);

  /**
   * Value is 1028 (0x404)
   */
  public static final Integer visCmdEditPasteLink = Integer.valueOf(1028);

  /**
   * Value is 1029 (0x405)
   */
  public static final Integer visCmdEditOpenObject = Integer.valueOf(1029);

  /**
   * Value is 1030 (0x406)
   */
  public static final Integer visCmdEditLinks = Integer.valueOf(1030);

  /**
   * Value is 1031 (0x407)
   */
  public static final Integer visCmdEditInsertObject = Integer.valueOf(1031);

  /**
   * Value is 1032 (0x408)
   */
  public static final Integer visCmdEditInsertField = Integer.valueOf(1032);

  /**
   * Value is 1033 (0x409)
   */
  public static final Integer visCmdViewFitInWindow = Integer.valueOf(1033);

  /**
   * Value is 1034 (0x40A)
   */
  public static final Integer visCmdView75 = Integer.valueOf(1034);

  /**
   * Value is 1035 (0x40B)
   */
  public static final Integer visCmdView100 = Integer.valueOf(1035);

  /**
   * Value is 1036 (0x40C)
   */
  public static final Integer visCmdView150 = Integer.valueOf(1036);

  /**
   * Value is 1037 (0x40D)
   */
  public static final Integer visCmdView200 = Integer.valueOf(1037);

  /**
   * Value is 1038 (0x40E)
   */
  public static final Integer visCmdViewCustom = Integer.valueOf(1038);

  /**
   * Value is 1039 (0x40F)
   */
  public static final Integer visCmdViewRulers = Integer.valueOf(1039);

  /**
   * Value is 1040 (0x410)
   */
  public static final Integer visCmdViewGrid = Integer.valueOf(1040);

  /**
   * Value is 1041 (0x411)
   */
  public static final Integer visCmdViewGuides = Integer.valueOf(1041);

  /**
   * Value is 1042 (0x412)
   */
  public static final Integer visCmdViewConnections = Integer.valueOf(1042);

  /**
   * Value is 1043 (0x413)
   */
  public static final Integer visCmdEditFind = Integer.valueOf(1043);

  /**
   * Value is 1044 (0x414)
   */
  public static final Integer visCmdViewStatusBar = Integer.valueOf(1044);

  /**
   * Value is 1045 (0x415)
   */
  public static final Integer visCmdObjectBringForward = Integer.valueOf(1045);

  /**
   * Value is 1046 (0x416)
   */
  public static final Integer visCmdObjectBringToFront = Integer.valueOf(1046);

  /**
   * Value is 1047 (0x417)
   */
  public static final Integer visCmdObjectSendBackward = Integer.valueOf(1047);

  /**
   * Value is 1048 (0x418)
   */
  public static final Integer visCmdObjectSendToBack = Integer.valueOf(1048);

  /**
   * Value is 1049 (0x419)
   */
  public static final Integer visCmdObjectAlignObjects = Integer.valueOf(1049);

  /**
   * Value is 1050 (0x41A)
   */
  public static final Integer visCmdObjectConnectObjects = Integer.valueOf(1050);

  /**
   * Value is 1051 (0x41B)
   */
  public static final Integer visCmdObjectGroup = Integer.valueOf(1051);

  /**
   * Value is 1052 (0x41C)
   */
  public static final Integer visCmdObjectUngroup = Integer.valueOf(1052);

  /**
   * Value is 1053 (0x41D)
   */
  public static final Integer visCmdObjectAddToGroup = Integer.valueOf(1053);

  /**
   * Value is 1054 (0x41E)
   */
  public static final Integer visCmdObjectRemoveFromGroup = Integer.valueOf(1054);

  /**
   * Value is 1055 (0x41F)
   */
  public static final Integer visCmdObjectConvertToGroup = Integer.valueOf(1055);

  /**
   * Value is 1056 (0x420)
   */
  public static final Integer visCmdObjectRotate90 = Integer.valueOf(1056);

  /**
   * Value is 1057 (0x421)
   */
  public static final Integer visCmdObjectFlipVertical = Integer.valueOf(1057);

  /**
   * Value is 1058 (0x422)
   */
  public static final Integer visCmdObjectFlipHorizontal = Integer.valueOf(1058);

  /**
   * Value is 1059 (0x423)
   */
  public static final Integer visCmdObjectReverse = Integer.valueOf(1059);

  /**
   * Value is 1060 (0x424)
   */
  public static final Integer visCmdObjectUnion = Integer.valueOf(1060);

  /**
   * Value is 1061 (0x425)
   */
  public static final Integer visCmdObjectCombine = Integer.valueOf(1061);

  /**
   * Value is 1062 (0x426)
   */
  public static final Integer visCmdObjectFragment = Integer.valueOf(1062);

  /**
   * Value is 1063 (0x427)
   */
  public static final Integer visCmdFormatStyle = Integer.valueOf(1063);

  /**
   * Value is 1064 (0x428)
   */
  public static final Integer visCmdFormatDefineStyles = Integer.valueOf(1064);

  /**
   * Value is 1065 (0x429)
   */
  public static final Integer visCmdFormatLine = Integer.valueOf(1065);

  /**
   * Value is 1066 (0x42A)
   */
  public static final Integer visCmdFormatFill = Integer.valueOf(1066);

  /**
   * Value is 1067 (0x42B)
   */
  public static final Integer visCmdFormatText = Integer.valueOf(1067);

  /**
   * Value is 1068 (0x42C)
   */
  public static final Integer visCmdFormatParagraph = Integer.valueOf(1068);

  /**
   * Value is 1069 (0x42D)
   */
  public static final Integer visCmdFormatTabs = Integer.valueOf(1069);

  /**
   * Value is 1070 (0x42E)
   */
  public static final Integer visCmdFormatBlock = Integer.valueOf(1070);

  /**
   * Value is 1071 (0x42F)
   */
  public static final Integer visCmdFormatBehavior = Integer.valueOf(1071);

  /**
   * Value is 1072 (0x430)
   */
  public static final Integer visCmdFormatProtection = Integer.valueOf(1072);

  /**
   * Value is 1073 (0x431)
   */
  public static final Integer visCmdFormatSpecial = Integer.valueOf(1073);

  /**
   * Value is 1074 (0x432)
   */
  public static final Integer visCmdOptionsEditDrawing = Integer.valueOf(1074);

  /**
   * Value is 1075 (0x433)
   */
  public static final Integer visCmdOptionsEditBackground = Integer.valueOf(1075);

  /**
   * Value is 1076 (0x434)
   */
  public static final Integer visCmdOptionsPageSetup = Integer.valueOf(1076);

  /**
   * Value is 1077 (0x435)
   */
  public static final Integer visCmdOptionsGoToDrawing = Integer.valueOf(1077);

  /**
   * Value is 1078 (0x436)
   */
  public static final Integer visCmdOptionsNewPage = Integer.valueOf(1078);

  /**
   * Value is 1079 (0x437)
   */
  public static final Integer visCmdOptionsDeletePages = Integer.valueOf(1079);

  /**
   * Value is 1080 (0x438)
   */
  public static final Integer visCmdOptionsReorderPages = Integer.valueOf(1080);

  /**
   * Value is 1081 (0x439)
   */
  public static final Integer visCmdOptionsPreferences = Integer.valueOf(1081);

  /**
   * Value is 1082 (0x43A)
   */
  public static final Integer visCmdOptionsColorPaletteDlg = Integer.valueOf(1082);

  /**
   * Value is 1083 (0x43B)
   */
  public static final Integer visCmdOptionsProtectDocument = Integer.valueOf(1083);

  /**
   * Value is 1084 (0x43C)
   */
  public static final Integer visCmdOptionsSnapGlueSetup = Integer.valueOf(1084);

  /**
   * Value is 1085 (0x43D)
   */
  public static final Integer visCmdWindowNewWindow = Integer.valueOf(1085);

  /**
   * Value is 1086 (0x43E)
   */
  public static final Integer visCmdWindowCascadeAll = Integer.valueOf(1086);

  /**
   * Value is 1087 (0x43F)
   */
  public static final Integer visCmdWindowTileAll = Integer.valueOf(1087);

  /**
   * Value is 1088 (0x440)
   */
  public static final Integer visCmdWindowShowShapeSheet = Integer.valueOf(1088);

  /**
   * Value is 1089 (0x441)
   */
  public static final Integer visCmdWindowShowMasterObjects = Integer.valueOf(1089);

  /**
   * Value is 1090 (0x442)
   */
  public static final Integer visCmdRunAddOnMenu = Integer.valueOf(1090);

  /**
   * Value is 1091 (0x443)
   */
  public static final Integer visCmdWindowShowDrawPage = Integer.valueOf(1091);

  /**
   * Value is 1092 (0x444)
   */
  public static final Integer visCmdHelpContents = Integer.valueOf(1092);

  /**
   * Value is 1093 (0x445)
   */
  public static final Integer visCmdDecreaseIndent = Integer.valueOf(1093);

  /**
   * Value is 1094 (0x446)
   */
  public static final Integer visCmdIncreaseIndent = Integer.valueOf(1094);

  /**
   * Value is 1095 (0x447)
   */
  public static final Integer visCmdDecreaseParaSpacing = Integer.valueOf(1095);

  /**
   * Value is 1096 (0x448)
   */
  public static final Integer visCmdIncreaseParaSpacing = Integer.valueOf(1096);

  /**
   * Value is 1097 (0x449)
   */
  public static final Integer visCmdHelpStencil = Integer.valueOf(1097);

  /**
   * Value is 1098 (0x44A)
   */
  public static final Integer visCmdTextRotate90 = Integer.valueOf(1098);

  /**
   * Value is 1099 (0x44B)
   */
  public static final Integer visCmdHelpQuickTour = Integer.valueOf(1099);

  /**
   * Value is 1100 (0x44C)
   */
  public static final Integer visCmdHelpAboutVisio = Integer.valueOf(1100);

  /**
   * Value is 1101 (0x44D)
   */
  public static final Integer visCmdStenEditIcon = Integer.valueOf(1101);

  /**
   * Value is 1102 (0x44E)
   */
  public static final Integer visCmdStenEditDrawing = Integer.valueOf(1102);

  /**
   * Value is 1103 (0x44F)
   */
  public static final Integer visCmdStenNameMaster = Integer.valueOf(1103);

  /**
   * Value is 1104 (0x450)
   */
  public static final Integer visCmdStenNewMaster = Integer.valueOf(1104);

  /**
   * Value is 1105 (0x451)
   */
  public static final Integer visCmdStenImageMaster = Integer.valueOf(1105);

  /**
   * Value is 1106 (0x452)
   */
  public static final Integer visCmdStenCleanup = Integer.valueOf(1106);

  /**
   * Value is 1107 (0x453)
   */
  public static final Integer visCmdSWShowValues = Integer.valueOf(1107);

  /**
   * Value is 1108 (0x454)
   */
  public static final Integer visCmdSWShowFormulas = Integer.valueOf(1108);

  /**
   * Value is 1109 (0x455)
   */
  public static final Integer visCmdSWShowSectionsDlg = Integer.valueOf(1109);

  /**
   * Value is 1110 (0x456)
   */
  public static final Integer visCmdSWPasteNameDlg = Integer.valueOf(1110);

  /**
   * Value is 1111 (0x457)
   */
  public static final Integer visCmdSWPasteFunctionDlg = Integer.valueOf(1111);

  /**
   * Value is 1112 (0x458)
   */
  public static final Integer visCmdSWInsertRow = Integer.valueOf(1112);

  /**
   * Value is 1113 (0x459)
   */
  public static final Integer visCmdSWInsertRowAfter = Integer.valueOf(1113);

  /**
   * Value is 1114 (0x45A)
   */
  public static final Integer visCmdSWChangeRowTypeDlg = Integer.valueOf(1114);

  /**
   * Value is 1115 (0x45B)
   */
  public static final Integer visCmdSWDeleteRow = Integer.valueOf(1115);

  /**
   * Value is 1116 (0x45C)
   */
  public static final Integer visCmdSWAddSectionDlg = Integer.valueOf(1116);

  /**
   * Value is 1117 (0x45D)
   */
  public static final Integer visCmdSWDeleteSection = Integer.valueOf(1117);

  /**
   * Value is 1118 (0x45E)
   */
  public static final Integer visCmdFormatDoubleClick = Integer.valueOf(1118);

  /**
   * Value is 1121 (0x461)
   */
  public static final Integer visCmdDrawTextStyle = Integer.valueOf(1121);

  /**
   * Value is 1122 (0x462)
   */
  public static final Integer visCmdDrawLineStyle = Integer.valueOf(1122);

  /**
   * Value is 1123 (0x463)
   */
  public static final Integer visCmdDrawFillStyle = Integer.valueOf(1123);

  /**
   * Value is 1124 (0x464)
   */
  public static final Integer visCmdDrawSnap = Integer.valueOf(1124);

  /**
   * Value is 1125 (0x465)
   */
  public static final Integer visCmdDrawGlue = Integer.valueOf(1125);

  /**
   * Value is 1126 (0x466)
   */
  public static final Integer visCmdDrawZoom = Integer.valueOf(1126);

  /**
   * Value is 1128 (0x468)
   */
  public static final Integer visCmdTextStyle = Integer.valueOf(1128);

  /**
   * Value is 1129 (0x469)
   */
  public static final Integer visCmdTextFont = Integer.valueOf(1129);

  /**
   * Value is 1130 (0x46A)
   */
  public static final Integer visCmdTextSize = Integer.valueOf(1130);

  /**
   * Value is 1131 (0x46B)
   */
  public static final Integer visCmdTextBold = Integer.valueOf(1131);

  /**
   * Value is 1132 (0x46C)
   */
  public static final Integer visCmdTextItalic = Integer.valueOf(1132);

  /**
   * Value is 1133 (0x46D)
   */
  public static final Integer visCmdTextSmallCaps = Integer.valueOf(1133);

  /**
   * Value is 1134 (0x46E)
   */
  public static final Integer visCmdTextSuperscript = Integer.valueOf(1134);

  /**
   * Value is 1135 (0x46F)
   */
  public static final Integer visCmdTextSubscript = Integer.valueOf(1135);

  /**
   * Value is 1136 (0x470)
   */
  public static final Integer visCmdTextUline = Integer.valueOf(1136);

  /**
   * Value is 1139 (0x473)
   */
  public static final Integer visCmdSWCancel = Integer.valueOf(1139);

  /**
   * Value is 1140 (0x474)
   */
  public static final Integer visCmdSWAccept = Integer.valueOf(1140);

  /**
   * Value is 1141 (0x475)
   */
  public static final Integer visCmdSWFormula = Integer.valueOf(1141);

  /**
   * Value is 1142 (0x476)
   */
  public static final Integer visCmdSWShowToggle = Integer.valueOf(1142);

  /**
   * Value is 1143 (0x477)
   */
  public static final Integer visCmdIconLeftColor = Integer.valueOf(1143);

  /**
   * Value is 1144 (0x478)
   */
  public static final Integer visCmdIconRightColor = Integer.valueOf(1144);

  /**
   * Value is 1145 (0x479)
   */
  public static final Integer visCmdIconPencilTool = Integer.valueOf(1145);

  /**
   * Value is 1146 (0x47A)
   */
  public static final Integer visCmdRecalcObjectWH = Integer.valueOf(1146);

  /**
   * Value is 1147 (0x47B)
   */
  public static final Integer visCmdTurnToPrevPage = Integer.valueOf(1147);

  /**
   * Value is 1148 (0x47C)
   */
  public static final Integer visCmdTurnToNextPage = Integer.valueOf(1148);

  /**
   * Value is 1179 (0x49B)
   */
  public static final Integer visCmdEditReplace = Integer.valueOf(1179);

  /**
   * Value is 1180 (0x49C)
   */
  public static final Integer visCmdDrawAddGuide = Integer.valueOf(1180);

  /**
   * Value is 1181 (0x49D)
   */
  public static final Integer visCmdAddTextShape = Integer.valueOf(1181);

  /**
   * Value is 1182 (0x49E)
   */
  public static final Integer visCmdDrawRect = Integer.valueOf(1182);

  /**
   * Value is 1183 (0x49F)
   */
  public static final Integer visCmdDrawOval = Integer.valueOf(1183);

  /**
   * Value is 1184 (0x4A0)
   */
  public static final Integer visCmdDragDuplicate = Integer.valueOf(1184);

  /**
   * Value is 1185 (0x4A1)
   */
  public static final Integer visCmdMoveObject = Integer.valueOf(1185);

  /**
   * Value is 1186 (0x4A2)
   */
  public static final Integer visCmdMove1D = Integer.valueOf(1186);

  /**
   * Value is 1187 (0x4A3)
   */
  public static final Integer visCmdMove2D = Integer.valueOf(1187);

  /**
   * Value is 1188 (0x4A4)
   */
  public static final Integer visCmdSize1D = Integer.valueOf(1188);

  /**
   * Value is 1189 (0x4A5)
   */
  public static final Integer visCmdSize2D = Integer.valueOf(1189);

  /**
   * Value is 1190 (0x4A6)
   */
  public static final Integer visCmdRotateObject = Integer.valueOf(1190);

  /**
   * Value is 1192 (0x4A8)
   */
  public static final Integer visCmdCropObject = Integer.valueOf(1192);

  /**
   * Value is 1193 (0x4A9)
   */
  public static final Integer visCmdPanObject = Integer.valueOf(1193);

  /**
   * Value is 1194 (0x4AA)
   */
  public static final Integer visCmdSizeTextBlock = Integer.valueOf(1194);

  /**
   * Value is 1196 (0x4AC)
   */
  public static final Integer visCmdAlignObjectLeft = Integer.valueOf(1196);

  /**
   * Value is 1197 (0x4AD)
   */
  public static final Integer visCmdAlignObjectCenter = Integer.valueOf(1197);

  /**
   * Value is 1198 (0x4AE)
   */
  public static final Integer visCmdAlignObjectRight = Integer.valueOf(1198);

  /**
   * Value is 1199 (0x4AF)
   */
  public static final Integer visCmdAlignObjectTop = Integer.valueOf(1199);

  /**
   * Value is 1200 (0x4B0)
   */
  public static final Integer visCmdAlignObjectMiddle = Integer.valueOf(1200);

  /**
   * Value is 1201 (0x4B1)
   */
  public static final Integer visCmdAlignObjectBottom = Integer.valueOf(1201);

  /**
   * Value is 1202 (0x4B2)
   */
  public static final Integer visCmdCenterDrawing = Integer.valueOf(1202);

  /**
   * Value is 1213 (0x4BD)
   */
  public static final Integer visCmdDeselectAll = Integer.valueOf(1213);

  /**
   * Value is 1214 (0x4BE)
   */
  public static final Integer visCmdTextEditState = Integer.valueOf(1214);

  /**
   * Value is 1215 (0x4BF)
   */
  public static final Integer visCmdZoomPt = Integer.valueOf(1215);

  /**
   * Value is 1216 (0x4C0)
   */
  public static final Integer visCmdZoomIn = Integer.valueOf(1216);

  /**
   * Value is 1217 (0x4C1)
   */
  public static final Integer visCmdZoomOut = Integer.valueOf(1217);

  /**
   * Value is 1218 (0x4C2)
   */
  public static final Integer visCmdZoomArea = Integer.valueOf(1218);

  /**
   * Value is 1219 (0x4C3)
   */
  public static final Integer visCmdDRPointerTool = Integer.valueOf(1219);

  /**
   * Value is 1220 (0x4C4)
   */
  public static final Integer visCmdDRPencilTool = Integer.valueOf(1220);

  /**
   * Value is 1221 (0x4C5)
   */
  public static final Integer visCmdDRLineTool = Integer.valueOf(1221);

  /**
   * Value is 1222 (0x4C6)
   */
  public static final Integer visCmdDRQtrArcTool = Integer.valueOf(1222);

  /**
   * Value is 1223 (0x4C7)
   */
  public static final Integer visCmdDRRectTool = Integer.valueOf(1223);

  /**
   * Value is 1224 (0x4C8)
   */
  public static final Integer visCmdDROvalTool = Integer.valueOf(1224);

  /**
   * Value is 1225 (0x4C9)
   */
  public static final Integer visCmdDRConnectorTool = Integer.valueOf(1225);

  /**
   * Value is 1226 (0x4CA)
   */
  public static final Integer visCmdDRConnectionTool = Integer.valueOf(1226);

  /**
   * Value is 1227 (0x4CB)
   */
  public static final Integer visCmdDRTextTool = Integer.valueOf(1227);

  /**
   * Value is 1228 (0x4CC)
   */
  public static final Integer visCmdDRRotateTool = Integer.valueOf(1228);

  /**
   * Value is 1230 (0x4CE)
   */
  public static final Integer visCmdObjectDistributeDlg = Integer.valueOf(1230);

  /**
   * Value is 1231 (0x4CF)
   */
  public static final Integer visCmdDistributeHSpace = Integer.valueOf(1231);

  /**
   * Value is 1232 (0x4D0)
   */
  public static final Integer visCmdDistributeLeft = Integer.valueOf(1232);

  /**
   * Value is 1233 (0x4D1)
   */
  public static final Integer visCmdDistributeCenter = Integer.valueOf(1233);

  /**
   * Value is 1234 (0x4D2)
   */
  public static final Integer visCmdDistributeRight = Integer.valueOf(1234);

  /**
   * Value is 1235 (0x4D3)
   */
  public static final Integer visCmdDistributeVSpace = Integer.valueOf(1235);

  /**
   * Value is 1236 (0x4D4)
   */
  public static final Integer visCmdDistributeTop = Integer.valueOf(1236);

  /**
   * Value is 1237 (0x4D5)
   */
  public static final Integer visCmdDistributeMiddle = Integer.valueOf(1237);

  /**
   * Value is 1238 (0x4D6)
   */
  public static final Integer visCmdDistributeBottom = Integer.valueOf(1238);

  /**
   * Id of scope in effect when content.dat updates.<p>
   * Value is 1241 (0x4D9)
   */
  public static final Integer visCmdUpdateContentCache = Integer.valueOf(1241);

  /**
   * Value is 1243 (0x4DB)
   */
  public static final Integer visCmdDropOnText = Integer.valueOf(1243);

  /**
   * Value is 1244 (0x4DC)
   */
  public static final Integer visCmdDropOnStencil = Integer.valueOf(1244);

  /**
   * Value is 1246 (0x4DE)
   */
  public static final Integer visCmdDropOnPage = Integer.valueOf(1246);

  /**
   * Value is 1250 (0x4E2)
   */
  public static final Integer visCmdSSWindowCollapse = Integer.valueOf(1250);

  /**
   * Value is 1251 (0x4E3)
   */
  public static final Integer visCmdSSWindowExpand = Integer.valueOf(1251);

  /**
   * Value is 1252 (0x4E4)
   */
  public static final Integer visCmdSSWindowSelect = Integer.valueOf(1252);

  /**
   * Value is 1253 (0x4E5)
   */
  public static final Integer visCmdSSWindowDeselect = Integer.valueOf(1253);

  /**
   * Value is 1263 (0x4EF)
   */
  public static final Integer visCmdAddConnectPt = Integer.valueOf(1263);

  /**
   * Value is 1264 (0x4F0)
   */
  public static final Integer visCmdModConnectPt = Integer.valueOf(1264);

  /**
   * Value is 1265 (0x4F1)
   */
  public static final Integer visCmdDelConnectPt = Integer.valueOf(1265);

  /**
   * Value is 1266 (0x4F2)
   */
  public static final Integer visCmdAddControlPt = Integer.valueOf(1266);

  /**
   * Value is 1267 (0x4F3)
   */
  public static final Integer visCmdModControlPt = Integer.valueOf(1267);

  /**
   * Value is 1268 (0x4F4)
   */
  public static final Integer visCmdDelControlPt = Integer.valueOf(1268);

  /**
   * Value is 1269 (0x4F5)
   */
  public static final Integer visCmdMovConnectPt = Integer.valueOf(1269);

  /**
   * Value is 1270 (0x4F6)
   */
  public static final Integer visCmdToolsSpelling = Integer.valueOf(1270);

  /**
   * Value is 1271 (0x4F7)
   */
  public static final Integer visCmdFormatPainter = Integer.valueOf(1271);

  /**
   * Value is 1274 (0x4FA)
   */
  public static final Integer visCmdPageMeasureUnitsDlg = Integer.valueOf(1274);

  /**
   * Value is 1279 (0x4FF)
   */
  public static final Integer visCmdView50 = Integer.valueOf(1279);

  /**
   * Value is 1280 (0x500)
   */
  public static final Integer visCmdView400 = Integer.valueOf(1280);

  /**
   * Value is 1282 (0x502)
   */
  public static final Integer visCmdInsertDataMap = Integer.valueOf(1282);

  /**
   * Value is 1292 (0x50C)
   */
  public static final Integer visCmdSendAsMail = Integer.valueOf(1292);

  /**
   * Value is 1309 (0x51D)
   */
  public static final Integer visCmdShapeActions = Integer.valueOf(1309);

  /**
   * Value is 1311 (0x51F)
   */
  public static final Integer visCmdDRSplineTool = Integer.valueOf(1311);

  /**
   * Value is 1312 (0x520)
   */
  public static final Integer visCmdFormatCustPropEdit = Integer.valueOf(1312);

  /**
   * Value is 1318 (0x526)
   */
  public static final Integer visCmdRulerGridDlg = Integer.valueOf(1318);

  /**
   * Value is 1333 (0x535)
   */
  public static final Integer visCmdFormatShadow = Integer.valueOf(1333);

  /**
   * Value is 1334 (0x536)
   */
  public static final Integer visCmdFormatCorners = Integer.valueOf(1334);

  /**
   * Value is 1335 (0x537)
   */
  public static final Integer visCmdToolsInventory = Integer.valueOf(1335);

  /**
   * Value is 1343 (0x53F)
   */
  public static final Integer visCmdMasterSetup = Integer.valueOf(1343);

  /**
   * Value is 1354 (0x54A)
   */
  public static final Integer visCmdToolsArrayShapesAddOn = Integer.valueOf(1354);

  /**
   * Value is 1355 (0x54B)
   */
  public static final Integer visCmdSetLineWeight = Integer.valueOf(1355);

  /**
   * Value is 1356 (0x54C)
   */
  public static final Integer visCmdSetLinePattern = Integer.valueOf(1356);

  /**
   * Value is 1357 (0x54D)
   */
  public static final Integer visCmdSetLineEnds = Integer.valueOf(1357);

  /**
   * Value is 1358 (0x54E)
   */
  public static final Integer visCmdSetLineCornerStyle = Integer.valueOf(1358);

  /**
   * Value is 1359 (0x54F)
   */
  public static final Integer visCmdSetLineColor = Integer.valueOf(1359);

  /**
   * Value is 1361 (0x551)
   */
  public static final Integer visCmdCloseWindow = Integer.valueOf(1361);

  /**
   * Value is 1379 (0x563)
   */
  public static final Integer visCmdSetFillShadow = Integer.valueOf(1379);

  /**
   * Value is 1380 (0x564)
   */
  public static final Integer visCmdSSWindowShowSection = Integer.valueOf(1380);

  /**
   * Value is 1381 (0x565)
   */
  public static final Integer visCmdSSWindowPasteName = Integer.valueOf(1381);

  /**
   * Value is 1382 (0x566)
   */
  public static final Integer visCmdSSWindowPasteFunction = Integer.valueOf(1382);

  /**
   * Value is 1383 (0x567)
   */
  public static final Integer visCmdSSWindowChangeRowType = Integer.valueOf(1383);

  /**
   * Value is 1384 (0x568)
   */
  public static final Integer visCmdSSWindowAddSection = Integer.valueOf(1384);

  /**
   * Value is 1385 (0x569)
   */
  public static final Integer visCmdSetFillColor = Integer.valueOf(1385);

  /**
   * Value is 1386 (0x56A)
   */
  public static final Integer visCmdHelpMode = Integer.valueOf(1386);

  /**
   * Value is 1387 (0x56B)
   */
  public static final Integer visCmdOffsetDlg = Integer.valueOf(1387);

  /**
   * Value is 1388 (0x56C)
   */
  public static final Integer visCmdDesignMode = Integer.valueOf(1388);

  /**
   * Value is 1389 (0x56D)
   */
  public static final Integer visCmdShapeExplorer = Integer.valueOf(1389);

  /**
   * Value is 1399 (0x577)
   */
  public static final Integer visCmdSetFillPattern = Integer.valueOf(1399);

  /**
   * Value is 1404 (0x57C)
   */
  public static final Integer visCmdSetCharColor = Integer.valueOf(1404);

  /**
   * Value is 1405 (0x57D)
   */
  public static final Integer visCmdSetCharSizeUp = Integer.valueOf(1405);

  /**
   * Value is 1406 (0x57E)
   */
  public static final Integer visCmdSetCharSizeDown = Integer.valueOf(1406);

  /**
   * Value is 1407 (0x57F)
   */
  public static final Integer visCmdTextHAlignLeft = Integer.valueOf(1407);

  /**
   * Value is 1408 (0x580)
   */
  public static final Integer visCmdTextHAlignCenter = Integer.valueOf(1408);

  /**
   * Value is 1409 (0x581)
   */
  public static final Integer visCmdTextHAlignRight = Integer.valueOf(1409);

  /**
   * Value is 1412 (0x584)
   */
  public static final Integer visCmdTextHAlignJustify = Integer.valueOf(1412);

  /**
   * Value is 1413 (0x585)
   */
  public static final Integer visCmdTextVAlignTop = Integer.valueOf(1413);

  /**
   * Value is 1414 (0x586)
   */
  public static final Integer visCmdTextVAlignMiddle = Integer.valueOf(1414);

  /**
   * Value is 1422 (0x58E)
   */
  public static final Integer visCmdTextVAlignBottom = Integer.valueOf(1422);

  /**
   * Value is 1424 (0x590)
   */
  public static final Integer visCmdStampTool = Integer.valueOf(1424);

  /**
   * Value is 1425 (0x591)
   */
  public static final Integer visCmdObjectInfoDlg = Integer.valueOf(1425);

  /**
   * Value is 1428 (0x594)
   */
  public static final Integer visCmdObjectHelp = Integer.valueOf(1428);

  /**
   * Value is 1439 (0x59F)
   */
  public static final Integer visCmdEditConvertObject = Integer.valueOf(1439);

  /**
   * Value is 1442 (0x5A2)
   */
  public static final Integer visCmdFileOpenStencil = Integer.valueOf(1442);

  /**
   * Value is 1443 (0x5A3)
   */
  public static final Integer visCmdPrintPage = Integer.valueOf(1443);

  /**
   * Value is 1444 (0x5A4)
   */
  public static final Integer visCmdSWShapeActionDlg = Integer.valueOf(1444);

  /**
   * Value is 1446 (0x5A6)
   */
  public static final Integer visCmdLayerDlg = Integer.valueOf(1446);

  /**
   * Value is 1448 (0x5A8)
   */
  public static final Integer visCmdLayerSetupDlg = Integer.valueOf(1448);

  /**
   * Value is 1449 (0x5A9)
   */
  public static final Integer visCmdCropTool = Integer.valueOf(1449);

  /**
   * Value is 1451 (0x5AB)
   */
  public static final Integer visCmdTextBlockTool = Integer.valueOf(1451);

  /**
   * Value is 1452 (0x5AC)
   */
  public static final Integer visCmdStenClose = Integer.valueOf(1452);

  /**
   * Value is 1453 (0x5AD)
   */
  public static final Integer visCmdIntersect = Integer.valueOf(1453);

  /**
   * Value is 1454 (0x5AE)
   */
  public static final Integer visCmdSubtract = Integer.valueOf(1454);

  /**
   * Value is 1458 (0x5B2)
   */
  public static final Integer visCmdStenActivate = Integer.valueOf(1458);

  /**
   * Value is 1480 (0x5C8)
   */
  public static final Integer visCmdStenIconAndName = Integer.valueOf(1480);

  /**
   * Value is 1481 (0x5C9)
   */
  public static final Integer visCmdStenIconOnly = Integer.valueOf(1481);

  /**
   * Value is 1482 (0x5CA)
   */
  public static final Integer visCmdStenNameOnly = Integer.valueOf(1482);

  /**
   * Value is 1483 (0x5CB)
   */
  public static final Integer visCmdStenAutoArrange = Integer.valueOf(1483);

  /**
   * Value is 1484 (0x5CC)
   */
  public static final Integer visCmdRunAddOnDlg = Integer.valueOf(1484);

  /**
   * Value is 1490 (0x5D2)
   */
  public static final Integer visCmdPrintPreview = Integer.valueOf(1490);

  /**
   * Value is 1491 (0x5D3)
   */
  public static final Integer visCmdOpenInVisio = Integer.valueOf(1491);

  /**
   * Value is 1492 (0x5D4)
   */
  public static final Integer visCmdFullScreenMode = Integer.valueOf(1492);

  /**
   * Value is 1493 (0x5D5)
   */
  public static final Integer visCmdLayoutDynamic = Integer.valueOf(1493);

  /**
   * Value is 1494 (0x5D6)
   */
  public static final Integer visCmdRotate90Clockwise = Integer.valueOf(1494);

  /**
   * Value is 1495 (0x5D7)
   */
  public static final Integer visCmdZoomLast = Integer.valueOf(1495);

  /**
   * Value is 1496 (0x5D8)
   */
  public static final Integer visCmdZoomPageWidth = Integer.valueOf(1496);

  /**
   * Value is 1497 (0x5D9)
   */
  public static final Integer visCmdInsertClipArt = Integer.valueOf(1497);

  /**
   * Value is 1498 (0x5DA)
   */
  public static final Integer visCmdInsertWordArt = Integer.valueOf(1498);

  /**
   * Value is 1499 (0x5DB)
   */
  public static final Integer visCmdInsertMicrosoftGraph = Integer.valueOf(1499);

  /**
   * Value is 1500 (0x5DC)
   */
  public static final Integer visCmdToolbarsDlg = Integer.valueOf(1500);

  /**
   * Value is 1501 (0x5DD)
   */
  public static final Integer visCmdInsertComment = Integer.valueOf(1501);

  /**
   * Value is 1502 (0x5DE)
   */
  public static final Integer visCmdMoveComment = Integer.valueOf(1502);

  /**
   * Value is 1503 (0x5DF)
   */
  public static final Integer visCmdOpenCommentForEdit = Integer.valueOf(1503);

  /**
   * Value is 1504 (0x5E0)
   */
  public static final Integer visCmdMSOInsertSymbol = Integer.valueOf(1504);

  /**
   * Value is 1505 (0x5E1)
   */
  public static final Integer visCmdMSOInsertSymbolDlg = Integer.valueOf(1505);

  /**
   * Value is 1506 (0x5E2)
   */
  public static final Integer visCmdINETAddToFavorites = Integer.valueOf(1506);

  /**
   * Value is 1509 (0x5E5)
   */
  public static final Integer visCmdViewPageBreaks = Integer.valueOf(1509);

  /**
   * Value is 1512 (0x5E8)
   */
  public static final Integer visCmdZoomSingleTile = Integer.valueOf(1512);

  /**
   * Value is 1513 (0x5E9)
   */
  public static final Integer visCmdPreviousTile = Integer.valueOf(1513);

  /**
   * Value is 1514 (0x5EA)
   */
  public static final Integer visCmdNextTile = Integer.valueOf(1514);

  /**
   * Value is 1515 (0x5EB)
   */
  public static final Integer visCmdFirstTile = Integer.valueOf(1515);

  /**
   * Value is 1516 (0x5EC)
   */
  public static final Integer visCmdLastTile = Integer.valueOf(1516);

  /**
   * Value is 1521 (0x5F1)
   */
  public static final Integer visCmdInsertAutoCADAddOn = Integer.valueOf(1521);

  /**
   * Value is 1522 (0x5F2)
   */
  public static final Integer visCmdInsertControlDlg = Integer.valueOf(1522);

  /**
   * Value is 1533 (0x5FD)
   */
  public static final Integer visCmdJoin = Integer.valueOf(1533);

  /**
   * Value is 1534 (0x5FE)
   */
  public static final Integer visCmdTrim = Integer.valueOf(1534);

  /**
   * Value is 1536 (0x600)
   */
  public static final Integer visCmdDlgCustomFit = Integer.valueOf(1536);

  /**
   * Value is 1538 (0x602)
   */
  public static final Integer visCmdFitCurve = Integer.valueOf(1538);

  /**
   * Value is 1543 (0x607)
   */
  public static final Integer visCmdIconBucketTool = Integer.valueOf(1543);

  /**
   * Value is 1544 (0x608)
   */
  public static final Integer visCmdIconLassoTool = Integer.valueOf(1544);

  /**
   * Value is 1545 (0x609)
   */
  public static final Integer visCmdIconSelectNet = Integer.valueOf(1545);

  /**
   * Value is 1561 (0x619)
   */
  public static final Integer visCmdFileLastFile5 = Integer.valueOf(1561);

  /**
   * Value is 1569 (0x621)
   */
  public static final Integer visCmdFileLastFile6 = Integer.valueOf(1569);

  /**
   * Value is 1570 (0x622)
   */
  public static final Integer visCmdFileLastFile7 = Integer.valueOf(1570);

  /**
   * Value is 1571 (0x623)
   */
  public static final Integer visCmdFileLastFile8 = Integer.valueOf(1571);

  /**
   * Value is 1572 (0x624)
   */
  public static final Integer visCmdFileLastFile9 = Integer.valueOf(1572);

  /**
   * Value is 1574 (0x626)
   */
  public static final Integer visCmdToolsLayoutShapesDlg = Integer.valueOf(1574);

  /**
   * Value is 1576 (0x628)
   */
  public static final Integer visCmdToolsRunVBE = Integer.valueOf(1576);

  /**
   * Value is 1577 (0x629)
   */
  public static final Integer visCmdToolsMacroDlg = Integer.valueOf(1577);

  /**
   * Value is 1579 (0x62B)
   */
  public static final Integer visCmdFileNewBlankDrawing = Integer.valueOf(1579);

  /**
   * Value is 1580 (0x62C)
   */
  public static final Integer visCmdFileNewStencilDlg = Integer.valueOf(1580);

  /**
   * Value is 1582 (0x62E)
   */
  public static final Integer visCmdFileNewBlankStencil = Integer.valueOf(1582);

  /**
   * Value is 1583 (0x62F)
   */
  public static final Integer visCmdFileChooseTemplates = Integer.valueOf(1583);

  /**
   * Value is 1584 (0x630)
   */
  public static final Integer visCmdProgRefHelp = Integer.valueOf(1584);

  /**
   * Value is 1585 (0x631)
   */
  public static final Integer visCmdInsertHyperLink = Integer.valueOf(1585);

  /**
   * Value is 1586 (0x632)
   */
  public static final Integer visCmdHelpTemplates = Integer.valueOf(1586);

  /**
   * Value is 1588 (0x634)
   */
  public static final Integer visCmdEmailRouting = Integer.valueOf(1588);

  /**
   * Value is 1589 (0x635)
   */
  public static final Integer visCmdSendToExchange = Integer.valueOf(1589);

  /**
   * Removes VBA project from active document. Use when VBA is disabled - with caution.<p>
   * Value is 1590 (0x636)
   */
  public static final Integer visCmdRemoveVBAFromActiveDoc = Integer.valueOf(1590);

  /**
   * Value is 1595 (0x63B)
   */
  public static final Integer visCmdINETUserSearchPage = Integer.valueOf(1595);

  /**
   * Value is 1596 (0x63C)
   */
  public static final Integer visCmdINETVisioHomePage = Integer.valueOf(1596);

  /**
   * Value is 1598 (0x63E)
   */
  public static final Integer visCmdINETGoForward = Integer.valueOf(1598);

  /**
   * Value is 1599 (0x63F)
   */
  public static final Integer visCmdINETGoBack = Integer.valueOf(1599);

  /**
   * Value is 1601 (0x641)
   */
  public static final Integer visCmdOpenActiveObject = Integer.valueOf(1601);

  /**
   * Value is 1602 (0x642)
   */
  public static final Integer visCmdCancelInPlaceEditing = Integer.valueOf(1602);

  /**
   * Value is 1604 (0x644)
   */
  public static final Integer visCmdINETVisioSolutionsLibrary = Integer.valueOf(1604);

  /**
   * Value is 1605 (0x645)
   */
  public static final Integer visCmdINETKnowledgeBase = Integer.valueOf(1605);

  /**
   * Value is 1606 (0x646)
   */
  public static final Integer visCmdINETDiagrammingResources = Integer.valueOf(1606);

  /**
   * Value is 1607 (0x647)
   */
  public static final Integer visCmdINETOpenHlink = Integer.valueOf(1607);

  /**
   * Value is 1608 (0x648)
   */
  public static final Integer visCmdINETOpenHlinkNewWnd = Integer.valueOf(1608);

  /**
   * Value is 1609 (0x649)
   */
  public static final Integer visCmdINETDeleteHlink = Integer.valueOf(1609);

  /**
   * Value is 1610 (0x64A)
   */
  public static final Integer visCmdINETCopyHyperlink = Integer.valueOf(1610);

  /**
   * Value is 1611 (0x64B)
   */
  public static final Integer visCmdHyperlinkHier = Integer.valueOf(1611);

  /**
   * Value is 1619 (0x653)
   */
  public static final Integer visCmdINETEditHyperlink = Integer.valueOf(1619);

  /**
   * Value is 1620 (0x654)
   */
  public static final Integer visCmdINETPasteAsHyperlink = Integer.valueOf(1620);

  /**
   * Value is 1633 (0x661)
   */
  public static final Integer visCmdBullets = Integer.valueOf(1633);

  /**
   * Value is 1634 (0x662)
   */
  public static final Integer visCmdShapeLayerToolbar = Integer.valueOf(1634);

  /**
   * Value is 1635 (0x663)
   */
  public static final Integer visCmdGoToPageToolbar = Integer.valueOf(1635);

  /**
   * Value is 1642 (0x66A)
   */
  public static final Integer visCmdFormatAllTextProps = Integer.valueOf(1642);

  /**
   * Value is 1645 (0x66D)
   */
  public static final Integer visCmdBrowseSampleDrawings = Integer.valueOf(1645);

  /**
   * Value is 1646 (0x66E)
   */
  public static final Integer visCmdMSOInsertEquation = Integer.valueOf(1646);

  /**
   * Value is 1650 (0x672)
   */
  public static final Integer visCmdABarHide = Integer.valueOf(1650);

  /**
   * Value is 1651 (0x673)
   */
  public static final Integer visCmdABarToggleFloat = Integer.valueOf(1651);

  /**
   * Value is 1652 (0x674)
   */
  public static final Integer visCmdABarAutohide = Integer.valueOf(1652);

  /**
   * Value is 1653 (0x675)
   */
  public static final Integer visCmdPanZoom = Integer.valueOf(1653);

  /**
   * Value is 1654 (0x676)
   */
  public static final Integer visCmdPagesList = Integer.valueOf(1654);

  /**
   * Value is 1658 (0x67A)
   */
  public static final Integer visCmdCustProp = Integer.valueOf(1658);

  /**
   * Value is 1661 (0x67D)
   */
  public static final Integer visCmdInkTool = Integer.valueOf(1661);

  /**
   * Value is 1664 (0x680)
   */
  public static final Integer visCmdInkCustomizePen = Integer.valueOf(1664);

  /**
   * Value is 1669 (0x685)
   */
  public static final Integer visCmdShapesWindow = Integer.valueOf(1669);

  /**
   * Value is 1670 (0x686)
   */
  public static final Integer visCmdSizePos = Integer.valueOf(1670);

  /**
   * Value is 1671 (0x687)
   */
  public static final Integer visCmdFileNewBlankDrawingMetric = Integer.valueOf(1671);

  /**
   * Value is 1672 (0x688)
   */
  public static final Integer visCmdFileNewBlankDrawingUS = Integer.valueOf(1672);

  /**
   * Value is 1673 (0x689)
   */
  public static final Integer visCmdFileNewBlankStencilMetric = Integer.valueOf(1673);

  /**
   * Value is 1674 (0x68A)
   */
  public static final Integer visCmdFileNewBlankStencilUS = Integer.valueOf(1674);

  /**
   * Value is 1675 (0x68B)
   */
  public static final Integer visCmdCustomPropertySets = Integer.valueOf(1675);

  /**
   * Value is 1676 (0x68C)
   */
  public static final Integer visCmdStenSave = Integer.valueOf(1676);

  /**
   * Value is 1677 (0x68D)
   */
  public static final Integer visCmdStenSaveAs = Integer.valueOf(1677);

  /**
   * Value is 1678 (0x68E)
   */
  public static final Integer visCmdStenProperties = Integer.valueOf(1678);

  /**
   * Value is 1679 (0x68F)
   */
  public static final Integer visCmdStenEditToggle = Integer.valueOf(1679);

  /**
   * Value is 1680 (0x690)
   */
  public static final Integer visCmdStenEditOn = Integer.valueOf(1680);

  /**
   * Value is 1681 (0x691)
   */
  public static final Integer visCmdStenEditOff = Integer.valueOf(1681);

  /**
   * Value is 1682 (0x692)
   */
  public static final Integer visCmdEditUndoMultiple = Integer.valueOf(1682);

  /**
   * Value is 1683 (0x693)
   */
  public static final Integer visCmdEditRedoMultiple = Integer.valueOf(1683);

  /**
   * Value is 1684 (0x694)
   */
  public static final Integer visCmdABarAutoHeight = Integer.valueOf(1684);

  /**
   * Value is 1685 (0x695)
   */
  public static final Integer visCmdShapeCommentDlg = Integer.valueOf(1685);

  /**
   * Value is 1686 (0x696)
   */
  public static final Integer visCmdShapeComment = Integer.valueOf(1686);

  /**
   * Value is 1687 (0x697)
   */
  public static final Integer visCmdFormatCustPropDef = Integer.valueOf(1687);

  /**
   * Value is 1688 (0x698)
   */
  public static final Integer visCmdShapeCommentDelete = Integer.valueOf(1688);

  /**
   * Value is 1689 (0x699)
   */
  public static final Integer visCmdHideDocumentStencil = Integer.valueOf(1689);

  /**
   * Value is 1690 (0x69A)
   */
  public static final Integer visCmdToggleDocumentStencil = Integer.valueOf(1690);

  /**
   * Value is 1695 (0x69F)
   */
  public static final Integer visCmdCustPropDefine = Integer.valueOf(1695);

  /**
   * Value is 1696 (0x6A0)
   */
  public static final Integer visCmdSetDynConnRerouteFreely = Integer.valueOf(1696);

  /**
   * Value is 1697 (0x6A1)
   */
  public static final Integer visCmdSetDynConnRerouteAsNeeded = Integer.valueOf(1697);

  /**
   * Value is 1698 (0x6A2)
   */
  public static final Integer visCmdSetDynConnRerouteNever = Integer.valueOf(1698);

  /**
   * Value is 1699 (0x6A3)
   */
  public static final Integer visCmdSetPagePlow = Integer.valueOf(1699);

  /**
   * Value is 1700 (0x6A4)
   */
  public static final Integer visCmdSetDynConnRoutingStyle = Integer.valueOf(1700);

  /**
   * Value is 1702 (0x6A6)
   */
  public static final Integer visCmdSetPlaceableShapeBehavior = Integer.valueOf(1702);

  /**
   * Value is 1703 (0x6A7)
   */
  public static final Integer visCmdSetPageLineJumpCode_Disp = Integer.valueOf(1703);

  /**
   * Value is 1704 (0x6A8)
   */
  public static final Integer visCmdSetPageLineJumpCode_None = Integer.valueOf(1704);

  /**
   * Value is 1705 (0x6A9)
   */
  public static final Integer visCmdSetPageLineJumpCode_Horz = Integer.valueOf(1705);

  /**
   * Value is 1706 (0x6AA)
   */
  public static final Integer visCmdSetPageLineJumpCode_Vert = Integer.valueOf(1706);

  /**
   * Value is 1707 (0x6AB)
   */
  public static final Integer visCmdSetPageLineJumpCode_Last = Integer.valueOf(1707);

  /**
   * Value is 1708 (0x6AC)
   */
  public static final Integer visCmdSetDynConnLineJumpStyle_Page = Integer.valueOf(1708);

  /**
   * Value is 1709 (0x6AD)
   */
  public static final Integer visCmdSetDynConnLineJumpStyle_Arc = Integer.valueOf(1709);

  /**
   * Value is 1710 (0x6AE)
   */
  public static final Integer visCmdSetDynConnLineJumpStyle_Gap = Integer.valueOf(1710);

  /**
   * Value is 1711 (0x6AF)
   */
  public static final Integer visCmdSetDynConnLineJumpStyle_Square = Integer.valueOf(1711);

  /**
   * Value is 1712 (0x6B0)
   */
  public static final Integer visCmdSetDynConnLineJumpStyle_Triangle = Integer.valueOf(1712);

  /**
   * Value is 1713 (0x6B1)
   */
  public static final Integer visCmdSetDynConnLineJumpStyle_2pt = Integer.valueOf(1713);

  /**
   * Value is 1714 (0x6B2)
   */
  public static final Integer visCmdSetDynConnLineJumpStyle_3pt = Integer.valueOf(1714);

  /**
   * Value is 1715 (0x6B3)
   */
  public static final Integer visCmdSetDynConnLineJumpStyle_4pt = Integer.valueOf(1715);

  /**
   * Value is 1716 (0x6B4)
   */
  public static final Integer visCmdSetDynConnLineJumpStyle_5pt = Integer.valueOf(1716);

  /**
   * Value is 1717 (0x6B5)
   */
  public static final Integer visCmdSetDynConnLineJumpStyle_6pt = Integer.valueOf(1717);

  /**
   * Value is 1718 (0x6B6)
   */
  public static final Integer visCmdSWExpandRow = Integer.valueOf(1718);

  /**
   * Value is 1719 (0x6B7)
   */
  public static final Integer visCmdHyperlinkList = Integer.valueOf(1719);

  /**
   * Value is 1720 (0x6B8)
   */
  public static final Integer visCmdHeaderFooter = Integer.valueOf(1720);

  /**
   * Value is 1721 (0x6B9)
   */
  public static final Integer visCmdDrawingExplorer = Integer.valueOf(1721);

  /**
   * Value is 1726 (0x6BE)
   */
  public static final Integer visCmdHideAllToolbars = Integer.valueOf(1726);

  /**
   * Value is 1741 (0x6CD)
   */
  public static final Integer visCmdTextStrikethrough = Integer.valueOf(1741);

  /**
   * Value is 1742 (0x6CE)
   */
  public static final Integer visCmdDrawRegion = Integer.valueOf(1742);

  /**
   * Value is 1744 (0x6D0)
   */
  public static final Integer visCmdSetAddMarkup = Integer.valueOf(1744);

  /**
   * Value is 1765 (0x6E5)
   */
  public static final Integer visCmdDynamicGrid = Integer.valueOf(1765);

  /**
   * Value is 1766 (0x6E6)
   */
  public static final Integer visCmdRulSub = Integer.valueOf(1766);

  /**
   * Value is 1767 (0x6E7)
   */
  public static final Integer visCmdGrid = Integer.valueOf(1767);

  /**
   * Value is 1768 (0x6E8)
   */
  public static final Integer visCmdAlignBox = Integer.valueOf(1768);

  /**
   * Value is 1769 (0x6E9)
   */
  public static final Integer visCmdShapeGeo = Integer.valueOf(1769);

  /**
   * Value is 1771 (0x6EB)
   */
  public static final Integer visCmdGuides = Integer.valueOf(1771);

  /**
   * Value is 1772 (0x6EC)
   */
  public static final Integer visCmdShapeHand = Integer.valueOf(1772);

  /**
   * Value is 1773 (0x6ED)
   */
  public static final Integer visCmdShapeVert = Integer.valueOf(1773);

  /**
   * Value is 1774 (0x6EE)
   */
  public static final Integer visCmdConnPoints = Integer.valueOf(1774);

  /**
   * Value is 1775 (0x6EF)
   */
  public static final Integer visCmdRecordNewMacro = Integer.valueOf(1775);

  /**
   * Value is 1776 (0x6F0)
   */
  public static final Integer visCmdStartRecordingMacro = Integer.valueOf(1776);

  /**
   * Value is 1777 (0x6F1)
   */
  public static final Integer visCmdStopRecordingMacro = Integer.valueOf(1777);

  /**
   * Value is 1778 (0x6F2)
   */
  public static final Integer visCmdPauseRecordingMacro = Integer.valueOf(1778);

  /**
   * Value is 1779 (0x6F3)
   */
  public static final Integer visCmdResumeRecordingMacro = Integer.valueOf(1779);

  /**
   * Value is 1781 (0x6F5)
   */
  public static final Integer visCmdSSWindowShowTraceWindow = Integer.valueOf(1781);

  /**
   * Value is 1785 (0x6F9)
   */
  public static final Integer visCmdFileSaveAsWebPage = Integer.valueOf(1785);

  /**
   * Value is 1787 (0x6FB)
   */
  public static final Integer visCmdFileCheckIn = Integer.valueOf(1787);

  /**
   * Value is 1788 (0x6FC)
   */
  public static final Integer visCmdFileCheckOut = Integer.valueOf(1788);

  /**
   * Value is 1790 (0x6FE)
   */
  public static final Integer visCmdPasteShortcut = Integer.valueOf(1790);

  /**
   * Value is 1791 (0x6FF)
   */
  public static final Integer visCmdCreateShortcut = Integer.valueOf(1791);

  /**
   * Value is 1795 (0x703)
   */
  public static final Integer visCmdReOrderPage = Integer.valueOf(1795);

  /**
   * Value is 1796 (0x704)
   */
  public static final Integer visCmdStenDrawingExplorer = Integer.valueOf(1796);

  /**
   * Value is 1802 (0x70A)
   */
  public static final Integer visCmdINETOfficeOnTheWeb = Integer.valueOf(1802);

  /**
   * Value is 1807 (0x70F)
   */
  public static final Integer visCmdToolSnapLines = Integer.valueOf(1807);

  /**
   * Value is 1809 (0x711)
   */
  public static final Integer visCmdHelpSearch = Integer.valueOf(1809);

  /**
   * Value is 1810 (0x712)
   */
  public static final Integer visCmdTextEditRuler = Integer.valueOf(1810);

  /**
   * Value is 1812 (0x714)
   */
  public static final Integer visCmdCreateNewDrawing = Integer.valueOf(1812);

  /**
   * Value is 1822 (0x71E)
   */
  public static final Integer visCmdHelpShapeBasics = Integer.valueOf(1822);

  /**
   * Value is 1829 (0x725)
   */
  public static final Integer visCmdDynConnReroute = Integer.valueOf(1829);

  /**
   * Value is 1830 (0x726)
   */
  public static final Integer visCmdShapeIntersect = Integer.valueOf(1830);

  /**
   * Value is 1831 (0x727)
   */
  public static final Integer visCmdINETVisioOnTheWeb = Integer.valueOf(1831);

  /**
   * Value is 1836 (0x72C)
   */
  public static final Integer visCmdReviewerVisibilityAll = Integer.valueOf(1836);

  /**
   * Value is 1837 (0x72D)
   */
  public static final Integer visCmdSetDynConnRerouteOnCrossover = Integer.valueOf(1837);

  /**
   * Value is 1857 (0x741)
   */
  public static final Integer visCmdSaveForAutoRecover = Integer.valueOf(1857);

  /**
   * Value is 1858 (0x742)
   */
  public static final Integer visCmdSetHeaderFooter = Integer.valueOf(1858);

  /**
   * Value is 1859 (0x743)
   */
  public static final Integer visCmdMsoClipboard = Integer.valueOf(1859);

  /**
   * Value is 1860 (0x744)
   */
  public static final Integer visCmdMsoSearch = Integer.valueOf(1860);

  /**
   * Value is 1862 (0x746)
   */
  public static final Integer visCmdTextAllCaps = Integer.valueOf(1862);

  /**
   * Value is 1863 (0x747)
   */
  public static final Integer visCmdTextDoubleUline = Integer.valueOf(1863);

  /**
   * Value is 1864 (0x748)
   */
  public static final Integer visCmdAppMaximize = Integer.valueOf(1864);

  /**
   * Value is 1865 (0x749)
   */
  public static final Integer visCmdAppMinimize = Integer.valueOf(1865);

  /**
   * Value is 1866 (0x74A)
   */
  public static final Integer visCmdMsoAutoCorrectDlg = Integer.valueOf(1866);

  /**
   * Value is 1867 (0x74B)
   */
  public static final Integer visCmdShapeGalleryAddOn = Integer.valueOf(1867);

  /**
   * Value is 1868 (0x74C)
   */
  public static final Integer visCmdAcquireImages = Integer.valueOf(1868);

  /**
   * Value is 1869 (0x74D)
   */
  public static final Integer visCmdDropManyOnPage = Integer.valueOf(1869);

  /**
   * Value is 1870 (0x74E)
   */
  public static final Integer visCmdObjectSwapEnds = Integer.valueOf(1870);

  /**
   * Value is 1871 (0x74F)
   */
  public static final Integer visCmdSetIndexInStencil = Integer.valueOf(1871);

  /**
   * Value is 1872 (0x750)
   */
  public static final Integer visCmdMsoAutoCorrect = Integer.valueOf(1872);

  /**
   * Value is 1873 (0x751)
   */
  public static final Integer visCmdMsoAutoFormat = Integer.valueOf(1873);

  /**
   * Value is 1874 (0x752)
   */
  public static final Integer visCmdShapeTransparencyDlg = Integer.valueOf(1874);

  /**
   * Value is 1875 (0x753)
   */
  public static final Integer visCmdShapeTransparency = Integer.valueOf(1875);

  /**
   * Value is 1876 (0x754)
   */
  public static final Integer visCmdToolsShowAddins = Integer.valueOf(1876);

  /**
   * Value is 1877 (0x755)
   */
  public static final Integer visCmdLicenseVerification = Integer.valueOf(1877);

  /**
   * Value is 1878 (0x756)
   */
  public static final Integer visCmdRightDragMove = Integer.valueOf(1878);

  /**
   * Value is 1879 (0x757)
   */
  public static final Integer visCmdRightDragCopy = Integer.valueOf(1879);

  /**
   * Value is 1880 (0x758)
   */
  public static final Integer visCmdRightDragLink = Integer.valueOf(1880);

  /**
   * Value is 1881 (0x759)
   */
  public static final Integer visCmdRightDragCancel = Integer.valueOf(1881);

  /**
   * Value is 1882 (0x75A)
   */
  public static final Integer visCmdNMMeetNow = Integer.valueOf(1882);

  /**
   * Value is 1883 (0x75B)
   */
  public static final Integer visCmdImagePropertiesDlg = Integer.valueOf(1883);

  /**
   * Value is 1884 (0x75C)
   */
  public static final Integer visCmdToolsSecurity = Integer.valueOf(1884);

  /**
   * Value is 1885 (0x75D)
   */
  public static final Integer visCmdMsoMediaGallery = Integer.valueOf(1885);

  /**
   * Value is 1886 (0x75E)
   */
  public static final Integer visCmdNextWindow = Integer.valueOf(1886);

  /**
   * Value is 1887 (0x75F)
   */
  public static final Integer visCmdImageProperties = Integer.valueOf(1887);

  /**
   * Value is 1888 (0x760)
   */
  public static final Integer visCmdSetLanguageDlg = Integer.valueOf(1888);

  /**
   * Value is 1889 (0x761)
   */
  public static final Integer visCmdSpellingChange = Integer.valueOf(1889);

  /**
   * Value is 1890 (0x762)
   */
  public static final Integer visCmdDetectAndRepair = Integer.valueOf(1890);

  /**
   * Value is 1891 (0x763)
   */
  public static final Integer visCmdExportDatabaseAddOn = Integer.valueOf(1891);

  /**
   * Value is 1892 (0x764)
   */
  public static final Integer visCmdStenIconAndDetail = Integer.valueOf(1892);

  /**
   * Value is 1893 (0x765)
   */
  public static final Integer visCmdSetDynConnAppearanceDefault = Integer.valueOf(1893);

  /**
   * Value is 1894 (0x766)
   */
  public static final Integer visCmdSetDynConnAppearanceStraight = Integer.valueOf(1894);

  /**
   * Value is 1895 (0x767)
   */
  public static final Integer visCmdSetDynConnAppearanceCurved = Integer.valueOf(1895);

  /**
   * Superseded by visCmdTaskPane.<p>
   * Value is 1896 (0x768)
   */
  public static final Integer visCmdTaskPaneToggle = Integer.valueOf(1896);

  /**
   * Value is 1897 (0x769)
   */
  public static final Integer visCmdNewFromExisting = Integer.valueOf(1897);

  /**
   * Value is 1898 (0x76A)
   */
  public static final Integer visCmdMsoCustomItem = Integer.valueOf(1898);

  /**
   * Value is 1899 (0x76B)
   */
  public static final Integer visCmdCreateEditMaster = Integer.valueOf(1899);

  /**
   * Value is 1900 (0x76C)
   */
  public static final Integer visCmdBreakOLELink = Integer.valueOf(1900);

  /**
   * Value is 1901 (0x76D)
   */
  public static final Integer visCmdMDIMaximize = Integer.valueOf(1901);

  /**
   * Value is 1902 (0x76E)
   */
  public static final Integer visCmdMDIMinimize = Integer.valueOf(1902);

  /**
   * Value is 1903 (0x76F)
   */
  public static final Integer visCmdMDIRestore = Integer.valueOf(1903);

  /**
   * Value is 1904 (0x770)
   */
  public static final Integer visCmdAppRestore = Integer.valueOf(1904);

  /**
   * Value is 1905 (0x771)
   */
  public static final Integer visCmdDeleteBackWord = Integer.valueOf(1905);

  /**
   * Value is 1906 (0x772)
   */
  public static final Integer visCmdNewDefDocBlankDrawing = Integer.valueOf(1906);

  /**
   * Value is 1907 (0x773)
   */
  public static final Integer visCmdSelectionModeRect = Integer.valueOf(1907);

  /**
   * Value is 1908 (0x774)
   */
  public static final Integer visCmdSelectionModeLasso = Integer.valueOf(1908);

  /**
   * Value is 1909 (0x775)
   */
  public static final Integer visCmdSelectionModeExtend = Integer.valueOf(1909);

  /**
   * Value is 1914 (0x77A)
   */
  public static final Integer visCmdNextMarkup = Integer.valueOf(1914);

  /**
   * Value is 1915 (0x77B)
   */
  public static final Integer visCmdPreviousMarkup = Integer.valueOf(1915);

  /**
   * Value is 1916 (0x77C)
   */
  public static final Integer visCmdMasterExplorer = Integer.valueOf(1916);

  /**
   * Value is 1917 (0x77D)
   */
  public static final Integer visCmdZoomInIgnoreSel = Integer.valueOf(1917);

  /**
   * Value is 1918 (0x77E)
   */
  public static final Integer visCmdZoomOutIgnoreSel = Integer.valueOf(1918);

  /**
   * Value is 1919 (0x77F)
   */
  public static final Integer visCmdReviewerVisibilityNone = Integer.valueOf(1919);

  /**
   * Value is 1920 (0x780)
   */
  public static final Integer visCmdDeleteComment = Integer.valueOf(1920);

  /**
   * Value is 1925 (0x785)
   */
  public static final Integer visCmdSizeObjects = Integer.valueOf(1925);

  /**
   * Superseded by visCmdTaskPaneReviewer.<p>
   * Value is 1939 (0x793)
   */
  public static final Integer visCmdReviewerPaneToggle = Integer.valueOf(1939);

  /**
   * Value is 1943 (0x797)
   */
  public static final Integer visCmdConnectorEffectRightAngle = Integer.valueOf(1943);

  /**
   * Value is 1944 (0x798)
   */
  public static final Integer visCmdConnectorEffectStraight = Integer.valueOf(1944);

  /**
   * Value is 1945 (0x799)
   */
  public static final Integer visCmdConnectorEffectCurved = Integer.valueOf(1945);

  /**
   * Value is 1946 (0x79A)
   */
  public static final Integer visCmdDrawingTools = Integer.valueOf(1946);

  /**
   * Value is 1951 (0x79F)
   */
  public static final Integer visCmdTextDoubleStrikethrough = Integer.valueOf(1951);

  /**
   * Value is 1952 (0x7A0)
   */
  public static final Integer visCmdTextHAlignDistribute = Integer.valueOf(1952);

  /**
   * Value is 1955 (0x7A3)
   */
  public static final Integer visCmdFormatInkDlg = Integer.valueOf(1955);

  /**
   * Value is 1962 (0x7AA)
   */
  public static final Integer visCmdCheckForUpdates = Integer.valueOf(1962);

  /**
   * Value is 1963 (0x7AB)
   */
  public static final Integer visCmdPrivacySettings = Integer.valueOf(1963);

  /**
   * Value is 1964 (0x7AC)
   */
  public static final Integer visCmdContactUs = Integer.valueOf(1964);

  /**
   * Value is 1967 (0x7AF)
   */
  public static final Integer visCmdResearchLookUp = Integer.valueOf(1967);

  /**
   * Value is 1968 (0x7B0)
   */
  public static final Integer visCmdResearchTranslate = Integer.valueOf(1968);

  /**
   * Superseded by visCmdTaskPaneResearch.<p>
   * Value is 1969 (0x7B1)
   */
  public static final Integer visCmdResearchPaneToggle = Integer.valueOf(1969);

  /**
   * Value is 1970 (0x7B2)
   */
  public static final Integer visCmdInkEraser = Integer.valueOf(1970);

  /**
   * Value is 1971 (0x7B3)
   */
  public static final Integer visCmdInkReviewPen = Integer.valueOf(1971);

  /**
   * Superseded by visCmdTaskPaneDocumentManagement.<p>
   * Value is 1972 (0x7B4)
   */
  public static final Integer visCmdSharedWorkspacePaneToggle = Integer.valueOf(1972);

  /**
   * Value is 1973 (0x7B5)
   */
  public static final Integer visCmdInkStockPen0 = Integer.valueOf(1973);

  /**
   * Value is 1974 (0x7B6)
   */
  public static final Integer visCmdInkStockPen1 = Integer.valueOf(1974);

  /**
   * Value is 1975 (0x7B7)
   */
  public static final Integer visCmdInkStockPen2 = Integer.valueOf(1975);

  /**
   * Value is 1976 (0x7B8)
   */
  public static final Integer visCmdInkStockPen3 = Integer.valueOf(1976);

  /**
   * Value is 1977 (0x7B9)
   */
  public static final Integer visCmdInkStockPen4 = Integer.valueOf(1977);

  /**
   * Value is 1982 (0x7BE)
   */
  public static final Integer visCmdDiagramGallery = Integer.valueOf(1982);

  /**
   * Value is 1985 (0x7C1)
   */
  public static final Integer visCmdShapeStudioAddon = Integer.valueOf(1985);

  /**
   * Value is 1997 (0x7CD)
   */
  public static final Integer visCmdLinkRowToShape = Integer.valueOf(1997);

  /**
   * Value is 1998 (0x7CE)
   */
  public static final Integer visCmdAddDataRecordset = Integer.valueOf(1998);

  /**
   * Value is 1999 (0x7CF)
   */
  public static final Integer visCmdDeleteDataRecordset = Integer.valueOf(1999);

  /**
   * Value is 2005 (0x7D5)
   */
  public static final Integer visCmdStenNamesUnderIcons = Integer.valueOf(2005);

  /**
   * Value is 2006 (0x7D6)
   */
  public static final Integer visCmdInsertTextBox = Integer.valueOf(2006);

  /**
   * Value is 2007 (0x7D7)
   */
  public static final Integer visCmdInsertVertTextBox = Integer.valueOf(2007);

  /**
   * Value is 2009 (0x7D9)
   */
  public static final Integer visCmdRHI = Integer.valueOf(2009);

  /**
   * Value is 2010 (0x7DA)
   */
  public static final Integer visCmdRHIDlg = Integer.valueOf(2010);

  /**
   * Value is 2011 (0x7DB)
   */
  public static final Integer visCmdDataSelectorDlg = Integer.valueOf(2011);

  /**
   * Value is 2012 (0x7DC)
   */
  public static final Integer visCmdViewDirectionToggle = Integer.valueOf(2012);

  /**
   * Value is 2013 (0x7DD)
   */
  public static final Integer visCmdViewLeftToRight = Integer.valueOf(2013);

  /**
   * Value is 2014 (0x7DE)
   */
  public static final Integer visCmdViewRightToLeft = Integer.valueOf(2014);

  /**
   * Value is 2017 (0x7E1)
   */
  public static final Integer visCmdApplyDataGraphic = Integer.valueOf(2017);

  /**
   * Value is 2019 (0x7E3)
   */
  public static final Integer visCmdDataRefreshDlg = Integer.valueOf(2019);

  /**
   * Value is 2021 (0x7E5)
   */
  public static final Integer visCmdDataRefresh = Integer.valueOf(2021);

  /**
   * Value is 2022 (0x7E6)
   */
  public static final Integer visCmdDataRefreshConfigDlg = Integer.valueOf(2022);

  /**
   * Value is 2024 (0x7E8)
   */
  public static final Integer visCmdTaskPaneDataGraphic = Integer.valueOf(2024);

  /**
   * Value is 2037 (0x7F5)
   */
  public static final Integer visCmdDataRecordsetSetCommand = Integer.valueOf(2037);

  /**
   * Value is 2038 (0x7F6)
   */
  public static final Integer visCmdDataRecordsetSetPrimaryKey = Integer.valueOf(2038);

  /**
   * Value is 2042 (0x7FA)
   */
  public static final Integer visCmdSpellingOptionsDlg = Integer.valueOf(2042);

  /**
   * Value is 2043 (0x7FB)
   */
  public static final Integer visCmdDataColumnSettingsDlg = Integer.valueOf(2043);

  /**
   * Value is 2044 (0x7FC)
   */
  public static final Integer visCmdDataExplorerWindow = Integer.valueOf(2044);

  /**
   * Value is 2045 (0x7FD)
   */
  public static final Integer visCmdDataAutoLinkWiz = Integer.valueOf(2045);

  /**
   * Value is 2046 (0x7FE)
   */
  public static final Integer visCmdDataAutoLink = Integer.valueOf(2046);

  /**
   * Value is 2047 (0x7FF)
   */
  public static final Integer visCmdApplyThemeToPage = Integer.valueOf(2047);

  /**
   * Value is 2048 (0x800)
   */
  public static final Integer visCmdApplyThemeToDoc = Integer.valueOf(2048);

  /**
   * Value is 2049 (0x801)
   */
  public static final Integer visCmdEditTheme = Integer.valueOf(2049);

  /**
   * Value is 2050 (0x802)
   */
  public static final Integer visCmdDuplicateTheme = Integer.valueOf(2050);

  /**
   * Value is 2052 (0x804)
   */
  public static final Integer visCmdDeleteTheme = Integer.valueOf(2052);

  /**
   * Value is 2053 (0x805)
   */
  public static final Integer visCmdTaskTogglePreviewSize = Integer.valueOf(2053);

  /**
   * Value is 2054 (0x806)
   */
  public static final Integer visCmdTaskPaneThemeColors = Integer.valueOf(2054);

  /**
   * Value is 2055 (0x807)
   */
  public static final Integer visCmdTaskPaneThemeEffects = Integer.valueOf(2055);

  /**
   * Value is 2056 (0x808)
   */
  public static final Integer visCmdAllowThemes = Integer.valueOf(2056);

  /**
   * Value is 2057 (0x809)
   */
  public static final Integer visCmdDataUnlinkShape = Integer.valueOf(2057);

  /**
   * Value is 2058 (0x80A)
   */
  public static final Integer visCmdDataUnlinkRow = Integer.valueOf(2058);

  /**
   * Value is 2061 (0x80D)
   */
  public static final Integer visCmdUpdateColumnsInLinkedShapes = Integer.valueOf(2061);

  /**
   * Value is 2064 (0x810)
   */
  public static final Integer visCmdNewThemeEffects = Integer.valueOf(2064);

  /**
   * Value is 2065 (0x811)
   */
  public static final Integer visCmdNewThemeColors = Integer.valueOf(2065);

  /**
   * Value is 2067 (0x813)
   */
  public static final Integer visCmdDeleteDataGraphic = Integer.valueOf(2067);

  /**
   * Value is 2068 (0x814)
   */
  public static final Integer visCmdRelayoutShapes = Integer.valueOf(2068);

  /**
   * Value is 2072 (0x818)
   */
  public static final Integer visCmdDataRecordsetProperties = Integer.valueOf(2072);

  /**
   * Value is 2091 (0x82B)
   */
  public static final Integer visCmdAutoConnectToggle = Integer.valueOf(2091);

  /**
   * Value is 2092 (0x82C)
   */
  public static final Integer visCmdApplyDataGraphicAfterLink = Integer.valueOf(2092);

  /**
   * Value is 2094 (0x82E)
   */
  public static final Integer visCmdDataRefreshAddConflict = Integer.valueOf(2094);

  /**
   * Value is 2095 (0x82F)
   */
  public static final Integer visCmdDataRefreshDeleteConflict = Integer.valueOf(2095);

  /**
   * Value is 2098 (0x832)
   */
  public static final Integer visCmdDataAutoConnect = Integer.valueOf(2098);

  /**
   * Value is 2103 (0x837)
   */
  public static final Integer visCmdDataRefreshResolveConflict = Integer.valueOf(2103);

  /**
   * Value is 2104 (0x838)
   */
  public static final Integer visCmdTrustCenterDlg = Integer.valueOf(2104);

  /**
   * Value is 2105 (0x839)
   */
  public static final Integer visCmdAutoGenerateDataGraphics = Integer.valueOf(2105);

  /**
   * Value is 2106 (0x83A)
   */
  public static final Integer visCmdDuplicateDataGraphic = Integer.valueOf(2106);

  /**
   * Value is 2107 (0x83B)
   */
  public static final Integer visCmdRemoveDataGraphicFromSel = Integer.valueOf(2107);

  /**
   * Value is 2108 (0x83C)
   */
  public static final Integer visCmdDropManyLinked = Integer.valueOf(2108);

  /**
   * Value is 2109 (0x83D)
   */
  public static final Integer visCmdFileUndoCheckout = Integer.valueOf(2109);

  /**
   * Value is 2114 (0x842)
   */
  public static final Integer visCmdDeleteForwardWord = Integer.valueOf(2114);

  /**
   * Value is 2117 (0x845)
   */
  public static final Integer visCmdSaveAsFixedFormatDlg = Integer.valueOf(2117);

  /**
   * Value is 2119 (0x847)
   */
  public static final Integer visCmdRemoveThemeFromSel = Integer.valueOf(2119);

  /**
   * Value is 1896 (0x768)
   */
  public static final Integer visCmdTaskPane = Integer.valueOf(1896);

  /**
   * Value is 1939 (0x793)
   */
  public static final Integer visCmdTaskPaneReviewer = Integer.valueOf(1939);

  /**
   * Value is 1969 (0x7B1)
   */
  public static final Integer visCmdTaskPaneResearch = Integer.valueOf(1969);

  /**
   * Value is 1972 (0x7B4)
   */
  public static final Integer visCmdTaskPaneDocumentManagement = Integer.valueOf(1972);

  /**
   * Value is 1890 (0x762)
   */
  public static final Integer visCmdOfficeDiagnostics = Integer.valueOf(1890);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visCmdFirst", visCmdFirst);
    v.put("visCmdLast", visCmdLast);
    v.put("visCmdHierarchical", visCmdHierarchical);
    v.put("visCmdFileNew", visCmdFileNew);
    v.put("visCmdFileOpen", visCmdFileOpen);
    v.put("visCmdFileClose", visCmdFileClose);
    v.put("visCmdFileSave", visCmdFileSave);
    v.put("visCmdFileSaveAs", visCmdFileSaveAs);
    v.put("visCmdFileSaveWorkspace", visCmdFileSaveWorkspace);
    v.put("visCmdFileImport", visCmdFileImport);
    v.put("visCmdFileSummaryInfoDlg", visCmdFileSummaryInfoDlg);
    v.put("visCmdFilePrint", visCmdFilePrint);
    v.put("visCmdFileLastFile1", visCmdFileLastFile1);
    v.put("visCmdFileLastFile2", visCmdFileLastFile2);
    v.put("visCmdFileLastFile3", visCmdFileLastFile3);
    v.put("visCmdFileLastFile4", visCmdFileLastFile4);
    v.put("visCmdFileExit", visCmdFileExit);
    v.put("visCmdEditUndo", visCmdEditUndo);
    v.put("visCmdEditRedo", visCmdEditRedo);
    v.put("visCmdEditRepeat", visCmdEditRepeat);
    v.put("visCmdUFEditCut", visCmdUFEditCut);
    v.put("visCmdUFEditCopy", visCmdUFEditCopy);
    v.put("visCmdUFEditPaste", visCmdUFEditPaste);
    v.put("visCmdUFEditClear", visCmdUFEditClear);
    v.put("visCmdUFEditDuplicate", visCmdUFEditDuplicate);
    v.put("visCmdUFEditSelectAll", visCmdUFEditSelectAll);
    v.put("visCmdEditSelectSpecial", visCmdEditSelectSpecial);
    v.put("visCmdEditPasteSpecial", visCmdEditPasteSpecial);
    v.put("visCmdEditPasteLink", visCmdEditPasteLink);
    v.put("visCmdEditOpenObject", visCmdEditOpenObject);
    v.put("visCmdEditLinks", visCmdEditLinks);
    v.put("visCmdEditInsertObject", visCmdEditInsertObject);
    v.put("visCmdEditInsertField", visCmdEditInsertField);
    v.put("visCmdViewFitInWindow", visCmdViewFitInWindow);
    v.put("visCmdView75", visCmdView75);
    v.put("visCmdView100", visCmdView100);
    v.put("visCmdView150", visCmdView150);
    v.put("visCmdView200", visCmdView200);
    v.put("visCmdViewCustom", visCmdViewCustom);
    v.put("visCmdViewRulers", visCmdViewRulers);
    v.put("visCmdViewGrid", visCmdViewGrid);
    v.put("visCmdViewGuides", visCmdViewGuides);
    v.put("visCmdViewConnections", visCmdViewConnections);
    v.put("visCmdEditFind", visCmdEditFind);
    v.put("visCmdViewStatusBar", visCmdViewStatusBar);
    v.put("visCmdObjectBringForward", visCmdObjectBringForward);
    v.put("visCmdObjectBringToFront", visCmdObjectBringToFront);
    v.put("visCmdObjectSendBackward", visCmdObjectSendBackward);
    v.put("visCmdObjectSendToBack", visCmdObjectSendToBack);
    v.put("visCmdObjectAlignObjects", visCmdObjectAlignObjects);
    v.put("visCmdObjectConnectObjects", visCmdObjectConnectObjects);
    v.put("visCmdObjectGroup", visCmdObjectGroup);
    v.put("visCmdObjectUngroup", visCmdObjectUngroup);
    v.put("visCmdObjectAddToGroup", visCmdObjectAddToGroup);
    v.put("visCmdObjectRemoveFromGroup", visCmdObjectRemoveFromGroup);
    v.put("visCmdObjectConvertToGroup", visCmdObjectConvertToGroup);
    v.put("visCmdObjectRotate90", visCmdObjectRotate90);
    v.put("visCmdObjectFlipVertical", visCmdObjectFlipVertical);
    v.put("visCmdObjectFlipHorizontal", visCmdObjectFlipHorizontal);
    v.put("visCmdObjectReverse", visCmdObjectReverse);
    v.put("visCmdObjectUnion", visCmdObjectUnion);
    v.put("visCmdObjectCombine", visCmdObjectCombine);
    v.put("visCmdObjectFragment", visCmdObjectFragment);
    v.put("visCmdFormatStyle", visCmdFormatStyle);
    v.put("visCmdFormatDefineStyles", visCmdFormatDefineStyles);
    v.put("visCmdFormatLine", visCmdFormatLine);
    v.put("visCmdFormatFill", visCmdFormatFill);
    v.put("visCmdFormatText", visCmdFormatText);
    v.put("visCmdFormatParagraph", visCmdFormatParagraph);
    v.put("visCmdFormatTabs", visCmdFormatTabs);
    v.put("visCmdFormatBlock", visCmdFormatBlock);
    v.put("visCmdFormatBehavior", visCmdFormatBehavior);
    v.put("visCmdFormatProtection", visCmdFormatProtection);
    v.put("visCmdFormatSpecial", visCmdFormatSpecial);
    v.put("visCmdOptionsEditDrawing", visCmdOptionsEditDrawing);
    v.put("visCmdOptionsEditBackground", visCmdOptionsEditBackground);
    v.put("visCmdOptionsPageSetup", visCmdOptionsPageSetup);
    v.put("visCmdOptionsGoToDrawing", visCmdOptionsGoToDrawing);
    v.put("visCmdOptionsNewPage", visCmdOptionsNewPage);
    v.put("visCmdOptionsDeletePages", visCmdOptionsDeletePages);
    v.put("visCmdOptionsReorderPages", visCmdOptionsReorderPages);
    v.put("visCmdOptionsPreferences", visCmdOptionsPreferences);
    v.put("visCmdOptionsColorPaletteDlg", visCmdOptionsColorPaletteDlg);
    v.put("visCmdOptionsProtectDocument", visCmdOptionsProtectDocument);
    v.put("visCmdOptionsSnapGlueSetup", visCmdOptionsSnapGlueSetup);
    v.put("visCmdWindowNewWindow", visCmdWindowNewWindow);
    v.put("visCmdWindowCascadeAll", visCmdWindowCascadeAll);
    v.put("visCmdWindowTileAll", visCmdWindowTileAll);
    v.put("visCmdWindowShowShapeSheet", visCmdWindowShowShapeSheet);
    v.put("visCmdWindowShowMasterObjects", visCmdWindowShowMasterObjects);
    v.put("visCmdRunAddOnMenu", visCmdRunAddOnMenu);
    v.put("visCmdWindowShowDrawPage", visCmdWindowShowDrawPage);
    v.put("visCmdHelpContents", visCmdHelpContents);
    v.put("visCmdDecreaseIndent", visCmdDecreaseIndent);
    v.put("visCmdIncreaseIndent", visCmdIncreaseIndent);
    v.put("visCmdDecreaseParaSpacing", visCmdDecreaseParaSpacing);
    v.put("visCmdIncreaseParaSpacing", visCmdIncreaseParaSpacing);
    v.put("visCmdHelpStencil", visCmdHelpStencil);
    v.put("visCmdTextRotate90", visCmdTextRotate90);
    v.put("visCmdHelpQuickTour", visCmdHelpQuickTour);
    v.put("visCmdHelpAboutVisio", visCmdHelpAboutVisio);
    v.put("visCmdStenEditIcon", visCmdStenEditIcon);
    v.put("visCmdStenEditDrawing", visCmdStenEditDrawing);
    v.put("visCmdStenNameMaster", visCmdStenNameMaster);
    v.put("visCmdStenNewMaster", visCmdStenNewMaster);
    v.put("visCmdStenImageMaster", visCmdStenImageMaster);
    v.put("visCmdStenCleanup", visCmdStenCleanup);
    v.put("visCmdSWShowValues", visCmdSWShowValues);
    v.put("visCmdSWShowFormulas", visCmdSWShowFormulas);
    v.put("visCmdSWShowSectionsDlg", visCmdSWShowSectionsDlg);
    v.put("visCmdSWPasteNameDlg", visCmdSWPasteNameDlg);
    v.put("visCmdSWPasteFunctionDlg", visCmdSWPasteFunctionDlg);
    v.put("visCmdSWInsertRow", visCmdSWInsertRow);
    v.put("visCmdSWInsertRowAfter", visCmdSWInsertRowAfter);
    v.put("visCmdSWChangeRowTypeDlg", visCmdSWChangeRowTypeDlg);
    v.put("visCmdSWDeleteRow", visCmdSWDeleteRow);
    v.put("visCmdSWAddSectionDlg", visCmdSWAddSectionDlg);
    v.put("visCmdSWDeleteSection", visCmdSWDeleteSection);
    v.put("visCmdFormatDoubleClick", visCmdFormatDoubleClick);
    v.put("visCmdDrawTextStyle", visCmdDrawTextStyle);
    v.put("visCmdDrawLineStyle", visCmdDrawLineStyle);
    v.put("visCmdDrawFillStyle", visCmdDrawFillStyle);
    v.put("visCmdDrawSnap", visCmdDrawSnap);
    v.put("visCmdDrawGlue", visCmdDrawGlue);
    v.put("visCmdDrawZoom", visCmdDrawZoom);
    v.put("visCmdTextStyle", visCmdTextStyle);
    v.put("visCmdTextFont", visCmdTextFont);
    v.put("visCmdTextSize", visCmdTextSize);
    v.put("visCmdTextBold", visCmdTextBold);
    v.put("visCmdTextItalic", visCmdTextItalic);
    v.put("visCmdTextSmallCaps", visCmdTextSmallCaps);
    v.put("visCmdTextSuperscript", visCmdTextSuperscript);
    v.put("visCmdTextSubscript", visCmdTextSubscript);
    v.put("visCmdTextUline", visCmdTextUline);
    v.put("visCmdSWCancel", visCmdSWCancel);
    v.put("visCmdSWAccept", visCmdSWAccept);
    v.put("visCmdSWFormula", visCmdSWFormula);
    v.put("visCmdSWShowToggle", visCmdSWShowToggle);
    v.put("visCmdIconLeftColor", visCmdIconLeftColor);
    v.put("visCmdIconRightColor", visCmdIconRightColor);
    v.put("visCmdIconPencilTool", visCmdIconPencilTool);
    v.put("visCmdRecalcObjectWH", visCmdRecalcObjectWH);
    v.put("visCmdTurnToPrevPage", visCmdTurnToPrevPage);
    v.put("visCmdTurnToNextPage", visCmdTurnToNextPage);
    v.put("visCmdEditReplace", visCmdEditReplace);
    v.put("visCmdDrawAddGuide", visCmdDrawAddGuide);
    v.put("visCmdAddTextShape", visCmdAddTextShape);
    v.put("visCmdDrawRect", visCmdDrawRect);
    v.put("visCmdDrawOval", visCmdDrawOval);
    v.put("visCmdDragDuplicate", visCmdDragDuplicate);
    v.put("visCmdMoveObject", visCmdMoveObject);
    v.put("visCmdMove1D", visCmdMove1D);
    v.put("visCmdMove2D", visCmdMove2D);
    v.put("visCmdSize1D", visCmdSize1D);
    v.put("visCmdSize2D", visCmdSize2D);
    v.put("visCmdRotateObject", visCmdRotateObject);
    v.put("visCmdCropObject", visCmdCropObject);
    v.put("visCmdPanObject", visCmdPanObject);
    v.put("visCmdSizeTextBlock", visCmdSizeTextBlock);
    v.put("visCmdAlignObjectLeft", visCmdAlignObjectLeft);
    v.put("visCmdAlignObjectCenter", visCmdAlignObjectCenter);
    v.put("visCmdAlignObjectRight", visCmdAlignObjectRight);
    v.put("visCmdAlignObjectTop", visCmdAlignObjectTop);
    v.put("visCmdAlignObjectMiddle", visCmdAlignObjectMiddle);
    v.put("visCmdAlignObjectBottom", visCmdAlignObjectBottom);
    v.put("visCmdCenterDrawing", visCmdCenterDrawing);
    v.put("visCmdDeselectAll", visCmdDeselectAll);
    v.put("visCmdTextEditState", visCmdTextEditState);
    v.put("visCmdZoomPt", visCmdZoomPt);
    v.put("visCmdZoomIn", visCmdZoomIn);
    v.put("visCmdZoomOut", visCmdZoomOut);
    v.put("visCmdZoomArea", visCmdZoomArea);
    v.put("visCmdDRPointerTool", visCmdDRPointerTool);
    v.put("visCmdDRPencilTool", visCmdDRPencilTool);
    v.put("visCmdDRLineTool", visCmdDRLineTool);
    v.put("visCmdDRQtrArcTool", visCmdDRQtrArcTool);
    v.put("visCmdDRRectTool", visCmdDRRectTool);
    v.put("visCmdDROvalTool", visCmdDROvalTool);
    v.put("visCmdDRConnectorTool", visCmdDRConnectorTool);
    v.put("visCmdDRConnectionTool", visCmdDRConnectionTool);
    v.put("visCmdDRTextTool", visCmdDRTextTool);
    v.put("visCmdDRRotateTool", visCmdDRRotateTool);
    v.put("visCmdObjectDistributeDlg", visCmdObjectDistributeDlg);
    v.put("visCmdDistributeHSpace", visCmdDistributeHSpace);
    v.put("visCmdDistributeLeft", visCmdDistributeLeft);
    v.put("visCmdDistributeCenter", visCmdDistributeCenter);
    v.put("visCmdDistributeRight", visCmdDistributeRight);
    v.put("visCmdDistributeVSpace", visCmdDistributeVSpace);
    v.put("visCmdDistributeTop", visCmdDistributeTop);
    v.put("visCmdDistributeMiddle", visCmdDistributeMiddle);
    v.put("visCmdDistributeBottom", visCmdDistributeBottom);
    v.put("visCmdUpdateContentCache", visCmdUpdateContentCache);
    v.put("visCmdDropOnText", visCmdDropOnText);
    v.put("visCmdDropOnStencil", visCmdDropOnStencil);
    v.put("visCmdDropOnPage", visCmdDropOnPage);
    v.put("visCmdSSWindowCollapse", visCmdSSWindowCollapse);
    v.put("visCmdSSWindowExpand", visCmdSSWindowExpand);
    v.put("visCmdSSWindowSelect", visCmdSSWindowSelect);
    v.put("visCmdSSWindowDeselect", visCmdSSWindowDeselect);
    v.put("visCmdAddConnectPt", visCmdAddConnectPt);
    v.put("visCmdModConnectPt", visCmdModConnectPt);
    v.put("visCmdDelConnectPt", visCmdDelConnectPt);
    v.put("visCmdAddControlPt", visCmdAddControlPt);
    v.put("visCmdModControlPt", visCmdModControlPt);
    v.put("visCmdDelControlPt", visCmdDelControlPt);
    v.put("visCmdMovConnectPt", visCmdMovConnectPt);
    v.put("visCmdToolsSpelling", visCmdToolsSpelling);
    v.put("visCmdFormatPainter", visCmdFormatPainter);
    v.put("visCmdPageMeasureUnitsDlg", visCmdPageMeasureUnitsDlg);
    v.put("visCmdView50", visCmdView50);
    v.put("visCmdView400", visCmdView400);
    v.put("visCmdInsertDataMap", visCmdInsertDataMap);
    v.put("visCmdSendAsMail", visCmdSendAsMail);
    v.put("visCmdShapeActions", visCmdShapeActions);
    v.put("visCmdDRSplineTool", visCmdDRSplineTool);
    v.put("visCmdFormatCustPropEdit", visCmdFormatCustPropEdit);
    v.put("visCmdRulerGridDlg", visCmdRulerGridDlg);
    v.put("visCmdFormatShadow", visCmdFormatShadow);
    v.put("visCmdFormatCorners", visCmdFormatCorners);
    v.put("visCmdToolsInventory", visCmdToolsInventory);
    v.put("visCmdMasterSetup", visCmdMasterSetup);
    v.put("visCmdToolsArrayShapesAddOn", visCmdToolsArrayShapesAddOn);
    v.put("visCmdSetLineWeight", visCmdSetLineWeight);
    v.put("visCmdSetLinePattern", visCmdSetLinePattern);
    v.put("visCmdSetLineEnds", visCmdSetLineEnds);
    v.put("visCmdSetLineCornerStyle", visCmdSetLineCornerStyle);
    v.put("visCmdSetLineColor", visCmdSetLineColor);
    v.put("visCmdCloseWindow", visCmdCloseWindow);
    v.put("visCmdSetFillShadow", visCmdSetFillShadow);
    v.put("visCmdSSWindowShowSection", visCmdSSWindowShowSection);
    v.put("visCmdSSWindowPasteName", visCmdSSWindowPasteName);
    v.put("visCmdSSWindowPasteFunction", visCmdSSWindowPasteFunction);
    v.put("visCmdSSWindowChangeRowType", visCmdSSWindowChangeRowType);
    v.put("visCmdSSWindowAddSection", visCmdSSWindowAddSection);
    v.put("visCmdSetFillColor", visCmdSetFillColor);
    v.put("visCmdHelpMode", visCmdHelpMode);
    v.put("visCmdOffsetDlg", visCmdOffsetDlg);
    v.put("visCmdDesignMode", visCmdDesignMode);
    v.put("visCmdShapeExplorer", visCmdShapeExplorer);
    v.put("visCmdSetFillPattern", visCmdSetFillPattern);
    v.put("visCmdSetCharColor", visCmdSetCharColor);
    v.put("visCmdSetCharSizeUp", visCmdSetCharSizeUp);
    v.put("visCmdSetCharSizeDown", visCmdSetCharSizeDown);
    v.put("visCmdTextHAlignLeft", visCmdTextHAlignLeft);
    v.put("visCmdTextHAlignCenter", visCmdTextHAlignCenter);
    v.put("visCmdTextHAlignRight", visCmdTextHAlignRight);
    v.put("visCmdTextHAlignJustify", visCmdTextHAlignJustify);
    v.put("visCmdTextVAlignTop", visCmdTextVAlignTop);
    v.put("visCmdTextVAlignMiddle", visCmdTextVAlignMiddle);
    v.put("visCmdTextVAlignBottom", visCmdTextVAlignBottom);
    v.put("visCmdStampTool", visCmdStampTool);
    v.put("visCmdObjectInfoDlg", visCmdObjectInfoDlg);
    v.put("visCmdObjectHelp", visCmdObjectHelp);
    v.put("visCmdEditConvertObject", visCmdEditConvertObject);
    v.put("visCmdFileOpenStencil", visCmdFileOpenStencil);
    v.put("visCmdPrintPage", visCmdPrintPage);
    v.put("visCmdSWShapeActionDlg", visCmdSWShapeActionDlg);
    v.put("visCmdLayerDlg", visCmdLayerDlg);
    v.put("visCmdLayerSetupDlg", visCmdLayerSetupDlg);
    v.put("visCmdCropTool", visCmdCropTool);
    v.put("visCmdTextBlockTool", visCmdTextBlockTool);
    v.put("visCmdStenClose", visCmdStenClose);
    v.put("visCmdIntersect", visCmdIntersect);
    v.put("visCmdSubtract", visCmdSubtract);
    v.put("visCmdStenActivate", visCmdStenActivate);
    v.put("visCmdStenIconAndName", visCmdStenIconAndName);
    v.put("visCmdStenIconOnly", visCmdStenIconOnly);
    v.put("visCmdStenNameOnly", visCmdStenNameOnly);
    v.put("visCmdStenAutoArrange", visCmdStenAutoArrange);
    v.put("visCmdRunAddOnDlg", visCmdRunAddOnDlg);
    v.put("visCmdPrintPreview", visCmdPrintPreview);
    v.put("visCmdOpenInVisio", visCmdOpenInVisio);
    v.put("visCmdFullScreenMode", visCmdFullScreenMode);
    v.put("visCmdLayoutDynamic", visCmdLayoutDynamic);
    v.put("visCmdRotate90Clockwise", visCmdRotate90Clockwise);
    v.put("visCmdZoomLast", visCmdZoomLast);
    v.put("visCmdZoomPageWidth", visCmdZoomPageWidth);
    v.put("visCmdInsertClipArt", visCmdInsertClipArt);
    v.put("visCmdInsertWordArt", visCmdInsertWordArt);
    v.put("visCmdInsertMicrosoftGraph", visCmdInsertMicrosoftGraph);
    v.put("visCmdToolbarsDlg", visCmdToolbarsDlg);
    v.put("visCmdInsertComment", visCmdInsertComment);
    v.put("visCmdMoveComment", visCmdMoveComment);
    v.put("visCmdOpenCommentForEdit", visCmdOpenCommentForEdit);
    v.put("visCmdMSOInsertSymbol", visCmdMSOInsertSymbol);
    v.put("visCmdMSOInsertSymbolDlg", visCmdMSOInsertSymbolDlg);
    v.put("visCmdINETAddToFavorites", visCmdINETAddToFavorites);
    v.put("visCmdViewPageBreaks", visCmdViewPageBreaks);
    v.put("visCmdZoomSingleTile", visCmdZoomSingleTile);
    v.put("visCmdPreviousTile", visCmdPreviousTile);
    v.put("visCmdNextTile", visCmdNextTile);
    v.put("visCmdFirstTile", visCmdFirstTile);
    v.put("visCmdLastTile", visCmdLastTile);
    v.put("visCmdInsertAutoCADAddOn", visCmdInsertAutoCADAddOn);
    v.put("visCmdInsertControlDlg", visCmdInsertControlDlg);
    v.put("visCmdJoin", visCmdJoin);
    v.put("visCmdTrim", visCmdTrim);
    v.put("visCmdDlgCustomFit", visCmdDlgCustomFit);
    v.put("visCmdFitCurve", visCmdFitCurve);
    v.put("visCmdIconBucketTool", visCmdIconBucketTool);
    v.put("visCmdIconLassoTool", visCmdIconLassoTool);
    v.put("visCmdIconSelectNet", visCmdIconSelectNet);
    v.put("visCmdFileLastFile5", visCmdFileLastFile5);
    v.put("visCmdFileLastFile6", visCmdFileLastFile6);
    v.put("visCmdFileLastFile7", visCmdFileLastFile7);
    v.put("visCmdFileLastFile8", visCmdFileLastFile8);
    v.put("visCmdFileLastFile9", visCmdFileLastFile9);
    v.put("visCmdToolsLayoutShapesDlg", visCmdToolsLayoutShapesDlg);
    v.put("visCmdToolsRunVBE", visCmdToolsRunVBE);
    v.put("visCmdToolsMacroDlg", visCmdToolsMacroDlg);
    v.put("visCmdFileNewBlankDrawing", visCmdFileNewBlankDrawing);
    v.put("visCmdFileNewStencilDlg", visCmdFileNewStencilDlg);
    v.put("visCmdFileNewBlankStencil", visCmdFileNewBlankStencil);
    v.put("visCmdFileChooseTemplates", visCmdFileChooseTemplates);
    v.put("visCmdProgRefHelp", visCmdProgRefHelp);
    v.put("visCmdInsertHyperLink", visCmdInsertHyperLink);
    v.put("visCmdHelpTemplates", visCmdHelpTemplates);
    v.put("visCmdEmailRouting", visCmdEmailRouting);
    v.put("visCmdSendToExchange", visCmdSendToExchange);
    v.put("visCmdRemoveVBAFromActiveDoc", visCmdRemoveVBAFromActiveDoc);
    v.put("visCmdINETUserSearchPage", visCmdINETUserSearchPage);
    v.put("visCmdINETVisioHomePage", visCmdINETVisioHomePage);
    v.put("visCmdINETGoForward", visCmdINETGoForward);
    v.put("visCmdINETGoBack", visCmdINETGoBack);
    v.put("visCmdOpenActiveObject", visCmdOpenActiveObject);
    v.put("visCmdCancelInPlaceEditing", visCmdCancelInPlaceEditing);
    v.put("visCmdINETVisioSolutionsLibrary", visCmdINETVisioSolutionsLibrary);
    v.put("visCmdINETKnowledgeBase", visCmdINETKnowledgeBase);
    v.put("visCmdINETDiagrammingResources", visCmdINETDiagrammingResources);
    v.put("visCmdINETOpenHlink", visCmdINETOpenHlink);
    v.put("visCmdINETOpenHlinkNewWnd", visCmdINETOpenHlinkNewWnd);
    v.put("visCmdINETDeleteHlink", visCmdINETDeleteHlink);
    v.put("visCmdINETCopyHyperlink", visCmdINETCopyHyperlink);
    v.put("visCmdHyperlinkHier", visCmdHyperlinkHier);
    v.put("visCmdINETEditHyperlink", visCmdINETEditHyperlink);
    v.put("visCmdINETPasteAsHyperlink", visCmdINETPasteAsHyperlink);
    v.put("visCmdBullets", visCmdBullets);
    v.put("visCmdShapeLayerToolbar", visCmdShapeLayerToolbar);
    v.put("visCmdGoToPageToolbar", visCmdGoToPageToolbar);
    v.put("visCmdFormatAllTextProps", visCmdFormatAllTextProps);
    v.put("visCmdBrowseSampleDrawings", visCmdBrowseSampleDrawings);
    v.put("visCmdMSOInsertEquation", visCmdMSOInsertEquation);
    v.put("visCmdABarHide", visCmdABarHide);
    v.put("visCmdABarToggleFloat", visCmdABarToggleFloat);
    v.put("visCmdABarAutohide", visCmdABarAutohide);
    v.put("visCmdPanZoom", visCmdPanZoom);
    v.put("visCmdPagesList", visCmdPagesList);
    v.put("visCmdCustProp", visCmdCustProp);
    v.put("visCmdInkTool", visCmdInkTool);
    v.put("visCmdInkCustomizePen", visCmdInkCustomizePen);
    v.put("visCmdShapesWindow", visCmdShapesWindow);
    v.put("visCmdSizePos", visCmdSizePos);
    v.put("visCmdFileNewBlankDrawingMetric", visCmdFileNewBlankDrawingMetric);
    v.put("visCmdFileNewBlankDrawingUS", visCmdFileNewBlankDrawingUS);
    v.put("visCmdFileNewBlankStencilMetric", visCmdFileNewBlankStencilMetric);
    v.put("visCmdFileNewBlankStencilUS", visCmdFileNewBlankStencilUS);
    v.put("visCmdCustomPropertySets", visCmdCustomPropertySets);
    v.put("visCmdStenSave", visCmdStenSave);
    v.put("visCmdStenSaveAs", visCmdStenSaveAs);
    v.put("visCmdStenProperties", visCmdStenProperties);
    v.put("visCmdStenEditToggle", visCmdStenEditToggle);
    v.put("visCmdStenEditOn", visCmdStenEditOn);
    v.put("visCmdStenEditOff", visCmdStenEditOff);
    v.put("visCmdEditUndoMultiple", visCmdEditUndoMultiple);
    v.put("visCmdEditRedoMultiple", visCmdEditRedoMultiple);
    v.put("visCmdABarAutoHeight", visCmdABarAutoHeight);
    v.put("visCmdShapeCommentDlg", visCmdShapeCommentDlg);
    v.put("visCmdShapeComment", visCmdShapeComment);
    v.put("visCmdFormatCustPropDef", visCmdFormatCustPropDef);
    v.put("visCmdShapeCommentDelete", visCmdShapeCommentDelete);
    v.put("visCmdHideDocumentStencil", visCmdHideDocumentStencil);
    v.put("visCmdToggleDocumentStencil", visCmdToggleDocumentStencil);
    v.put("visCmdCustPropDefine", visCmdCustPropDefine);
    v.put("visCmdSetDynConnRerouteFreely", visCmdSetDynConnRerouteFreely);
    v.put("visCmdSetDynConnRerouteAsNeeded", visCmdSetDynConnRerouteAsNeeded);
    v.put("visCmdSetDynConnRerouteNever", visCmdSetDynConnRerouteNever);
    v.put("visCmdSetPagePlow", visCmdSetPagePlow);
    v.put("visCmdSetDynConnRoutingStyle", visCmdSetDynConnRoutingStyle);
    v.put("visCmdSetPlaceableShapeBehavior", visCmdSetPlaceableShapeBehavior);
    v.put("visCmdSetPageLineJumpCode_Disp", visCmdSetPageLineJumpCode_Disp);
    v.put("visCmdSetPageLineJumpCode_None", visCmdSetPageLineJumpCode_None);
    v.put("visCmdSetPageLineJumpCode_Horz", visCmdSetPageLineJumpCode_Horz);
    v.put("visCmdSetPageLineJumpCode_Vert", visCmdSetPageLineJumpCode_Vert);
    v.put("visCmdSetPageLineJumpCode_Last", visCmdSetPageLineJumpCode_Last);
    v.put("visCmdSetDynConnLineJumpStyle_Page", visCmdSetDynConnLineJumpStyle_Page);
    v.put("visCmdSetDynConnLineJumpStyle_Arc", visCmdSetDynConnLineJumpStyle_Arc);
    v.put("visCmdSetDynConnLineJumpStyle_Gap", visCmdSetDynConnLineJumpStyle_Gap);
    v.put("visCmdSetDynConnLineJumpStyle_Square", visCmdSetDynConnLineJumpStyle_Square);
    v.put("visCmdSetDynConnLineJumpStyle_Triangle", visCmdSetDynConnLineJumpStyle_Triangle);
    v.put("visCmdSetDynConnLineJumpStyle_2pt", visCmdSetDynConnLineJumpStyle_2pt);
    v.put("visCmdSetDynConnLineJumpStyle_3pt", visCmdSetDynConnLineJumpStyle_3pt);
    v.put("visCmdSetDynConnLineJumpStyle_4pt", visCmdSetDynConnLineJumpStyle_4pt);
    v.put("visCmdSetDynConnLineJumpStyle_5pt", visCmdSetDynConnLineJumpStyle_5pt);
    v.put("visCmdSetDynConnLineJumpStyle_6pt", visCmdSetDynConnLineJumpStyle_6pt);
    v.put("visCmdSWExpandRow", visCmdSWExpandRow);
    v.put("visCmdHyperlinkList", visCmdHyperlinkList);
    v.put("visCmdHeaderFooter", visCmdHeaderFooter);
    v.put("visCmdDrawingExplorer", visCmdDrawingExplorer);
    v.put("visCmdHideAllToolbars", visCmdHideAllToolbars);
    v.put("visCmdTextStrikethrough", visCmdTextStrikethrough);
    v.put("visCmdDrawRegion", visCmdDrawRegion);
    v.put("visCmdSetAddMarkup", visCmdSetAddMarkup);
    v.put("visCmdDynamicGrid", visCmdDynamicGrid);
    v.put("visCmdRulSub", visCmdRulSub);
    v.put("visCmdGrid", visCmdGrid);
    v.put("visCmdAlignBox", visCmdAlignBox);
    v.put("visCmdShapeGeo", visCmdShapeGeo);
    v.put("visCmdGuides", visCmdGuides);
    v.put("visCmdShapeHand", visCmdShapeHand);
    v.put("visCmdShapeVert", visCmdShapeVert);
    v.put("visCmdConnPoints", visCmdConnPoints);
    v.put("visCmdRecordNewMacro", visCmdRecordNewMacro);
    v.put("visCmdStartRecordingMacro", visCmdStartRecordingMacro);
    v.put("visCmdStopRecordingMacro", visCmdStopRecordingMacro);
    v.put("visCmdPauseRecordingMacro", visCmdPauseRecordingMacro);
    v.put("visCmdResumeRecordingMacro", visCmdResumeRecordingMacro);
    v.put("visCmdSSWindowShowTraceWindow", visCmdSSWindowShowTraceWindow);
    v.put("visCmdFileSaveAsWebPage", visCmdFileSaveAsWebPage);
    v.put("visCmdFileCheckIn", visCmdFileCheckIn);
    v.put("visCmdFileCheckOut", visCmdFileCheckOut);
    v.put("visCmdPasteShortcut", visCmdPasteShortcut);
    v.put("visCmdCreateShortcut", visCmdCreateShortcut);
    v.put("visCmdReOrderPage", visCmdReOrderPage);
    v.put("visCmdStenDrawingExplorer", visCmdStenDrawingExplorer);
    v.put("visCmdINETOfficeOnTheWeb", visCmdINETOfficeOnTheWeb);
    v.put("visCmdToolSnapLines", visCmdToolSnapLines);
    v.put("visCmdHelpSearch", visCmdHelpSearch);
    v.put("visCmdTextEditRuler", visCmdTextEditRuler);
    v.put("visCmdCreateNewDrawing", visCmdCreateNewDrawing);
    v.put("visCmdHelpShapeBasics", visCmdHelpShapeBasics);
    v.put("visCmdDynConnReroute", visCmdDynConnReroute);
    v.put("visCmdShapeIntersect", visCmdShapeIntersect);
    v.put("visCmdINETVisioOnTheWeb", visCmdINETVisioOnTheWeb);
    v.put("visCmdReviewerVisibilityAll", visCmdReviewerVisibilityAll);
    v.put("visCmdSetDynConnRerouteOnCrossover", visCmdSetDynConnRerouteOnCrossover);
    v.put("visCmdSaveForAutoRecover", visCmdSaveForAutoRecover);
    v.put("visCmdSetHeaderFooter", visCmdSetHeaderFooter);
    v.put("visCmdMsoClipboard", visCmdMsoClipboard);
    v.put("visCmdMsoSearch", visCmdMsoSearch);
    v.put("visCmdTextAllCaps", visCmdTextAllCaps);
    v.put("visCmdTextDoubleUline", visCmdTextDoubleUline);
    v.put("visCmdAppMaximize", visCmdAppMaximize);
    v.put("visCmdAppMinimize", visCmdAppMinimize);
    v.put("visCmdMsoAutoCorrectDlg", visCmdMsoAutoCorrectDlg);
    v.put("visCmdShapeGalleryAddOn", visCmdShapeGalleryAddOn);
    v.put("visCmdAcquireImages", visCmdAcquireImages);
    v.put("visCmdDropManyOnPage", visCmdDropManyOnPage);
    v.put("visCmdObjectSwapEnds", visCmdObjectSwapEnds);
    v.put("visCmdSetIndexInStencil", visCmdSetIndexInStencil);
    v.put("visCmdMsoAutoCorrect", visCmdMsoAutoCorrect);
    v.put("visCmdMsoAutoFormat", visCmdMsoAutoFormat);
    v.put("visCmdShapeTransparencyDlg", visCmdShapeTransparencyDlg);
    v.put("visCmdShapeTransparency", visCmdShapeTransparency);
    v.put("visCmdToolsShowAddins", visCmdToolsShowAddins);
    v.put("visCmdLicenseVerification", visCmdLicenseVerification);
    v.put("visCmdRightDragMove", visCmdRightDragMove);
    v.put("visCmdRightDragCopy", visCmdRightDragCopy);
    v.put("visCmdRightDragLink", visCmdRightDragLink);
    v.put("visCmdRightDragCancel", visCmdRightDragCancel);
    v.put("visCmdNMMeetNow", visCmdNMMeetNow);
    v.put("visCmdImagePropertiesDlg", visCmdImagePropertiesDlg);
    v.put("visCmdToolsSecurity", visCmdToolsSecurity);
    v.put("visCmdMsoMediaGallery", visCmdMsoMediaGallery);
    v.put("visCmdNextWindow", visCmdNextWindow);
    v.put("visCmdImageProperties", visCmdImageProperties);
    v.put("visCmdSetLanguageDlg", visCmdSetLanguageDlg);
    v.put("visCmdSpellingChange", visCmdSpellingChange);
    v.put("visCmdDetectAndRepair", visCmdDetectAndRepair);
    v.put("visCmdExportDatabaseAddOn", visCmdExportDatabaseAddOn);
    v.put("visCmdStenIconAndDetail", visCmdStenIconAndDetail);
    v.put("visCmdSetDynConnAppearanceDefault", visCmdSetDynConnAppearanceDefault);
    v.put("visCmdSetDynConnAppearanceStraight", visCmdSetDynConnAppearanceStraight);
    v.put("visCmdSetDynConnAppearanceCurved", visCmdSetDynConnAppearanceCurved);
    v.put("visCmdTaskPaneToggle", visCmdTaskPaneToggle);
    v.put("visCmdNewFromExisting", visCmdNewFromExisting);
    v.put("visCmdMsoCustomItem", visCmdMsoCustomItem);
    v.put("visCmdCreateEditMaster", visCmdCreateEditMaster);
    v.put("visCmdBreakOLELink", visCmdBreakOLELink);
    v.put("visCmdMDIMaximize", visCmdMDIMaximize);
    v.put("visCmdMDIMinimize", visCmdMDIMinimize);
    v.put("visCmdMDIRestore", visCmdMDIRestore);
    v.put("visCmdAppRestore", visCmdAppRestore);
    v.put("visCmdDeleteBackWord", visCmdDeleteBackWord);
    v.put("visCmdNewDefDocBlankDrawing", visCmdNewDefDocBlankDrawing);
    v.put("visCmdSelectionModeRect", visCmdSelectionModeRect);
    v.put("visCmdSelectionModeLasso", visCmdSelectionModeLasso);
    v.put("visCmdSelectionModeExtend", visCmdSelectionModeExtend);
    v.put("visCmdNextMarkup", visCmdNextMarkup);
    v.put("visCmdPreviousMarkup", visCmdPreviousMarkup);
    v.put("visCmdMasterExplorer", visCmdMasterExplorer);
    v.put("visCmdZoomInIgnoreSel", visCmdZoomInIgnoreSel);
    v.put("visCmdZoomOutIgnoreSel", visCmdZoomOutIgnoreSel);
    v.put("visCmdReviewerVisibilityNone", visCmdReviewerVisibilityNone);
    v.put("visCmdDeleteComment", visCmdDeleteComment);
    v.put("visCmdSizeObjects", visCmdSizeObjects);
    v.put("visCmdReviewerPaneToggle", visCmdReviewerPaneToggle);
    v.put("visCmdConnectorEffectRightAngle", visCmdConnectorEffectRightAngle);
    v.put("visCmdConnectorEffectStraight", visCmdConnectorEffectStraight);
    v.put("visCmdConnectorEffectCurved", visCmdConnectorEffectCurved);
    v.put("visCmdDrawingTools", visCmdDrawingTools);
    v.put("visCmdTextDoubleStrikethrough", visCmdTextDoubleStrikethrough);
    v.put("visCmdTextHAlignDistribute", visCmdTextHAlignDistribute);
    v.put("visCmdFormatInkDlg", visCmdFormatInkDlg);
    v.put("visCmdCheckForUpdates", visCmdCheckForUpdates);
    v.put("visCmdPrivacySettings", visCmdPrivacySettings);
    v.put("visCmdContactUs", visCmdContactUs);
    v.put("visCmdResearchLookUp", visCmdResearchLookUp);
    v.put("visCmdResearchTranslate", visCmdResearchTranslate);
    v.put("visCmdResearchPaneToggle", visCmdResearchPaneToggle);
    v.put("visCmdInkEraser", visCmdInkEraser);
    v.put("visCmdInkReviewPen", visCmdInkReviewPen);
    v.put("visCmdSharedWorkspacePaneToggle", visCmdSharedWorkspacePaneToggle);
    v.put("visCmdInkStockPen0", visCmdInkStockPen0);
    v.put("visCmdInkStockPen1", visCmdInkStockPen1);
    v.put("visCmdInkStockPen2", visCmdInkStockPen2);
    v.put("visCmdInkStockPen3", visCmdInkStockPen3);
    v.put("visCmdInkStockPen4", visCmdInkStockPen4);
    v.put("visCmdDiagramGallery", visCmdDiagramGallery);
    v.put("visCmdShapeStudioAddon", visCmdShapeStudioAddon);
    v.put("visCmdLinkRowToShape", visCmdLinkRowToShape);
    v.put("visCmdAddDataRecordset", visCmdAddDataRecordset);
    v.put("visCmdDeleteDataRecordset", visCmdDeleteDataRecordset);
    v.put("visCmdStenNamesUnderIcons", visCmdStenNamesUnderIcons);
    v.put("visCmdInsertTextBox", visCmdInsertTextBox);
    v.put("visCmdInsertVertTextBox", visCmdInsertVertTextBox);
    v.put("visCmdRHI", visCmdRHI);
    v.put("visCmdRHIDlg", visCmdRHIDlg);
    v.put("visCmdDataSelectorDlg", visCmdDataSelectorDlg);
    v.put("visCmdViewDirectionToggle", visCmdViewDirectionToggle);
    v.put("visCmdViewLeftToRight", visCmdViewLeftToRight);
    v.put("visCmdViewRightToLeft", visCmdViewRightToLeft);
    v.put("visCmdApplyDataGraphic", visCmdApplyDataGraphic);
    v.put("visCmdDataRefreshDlg", visCmdDataRefreshDlg);
    v.put("visCmdDataRefresh", visCmdDataRefresh);
    v.put("visCmdDataRefreshConfigDlg", visCmdDataRefreshConfigDlg);
    v.put("visCmdTaskPaneDataGraphic", visCmdTaskPaneDataGraphic);
    v.put("visCmdDataRecordsetSetCommand", visCmdDataRecordsetSetCommand);
    v.put("visCmdDataRecordsetSetPrimaryKey", visCmdDataRecordsetSetPrimaryKey);
    v.put("visCmdSpellingOptionsDlg", visCmdSpellingOptionsDlg);
    v.put("visCmdDataColumnSettingsDlg", visCmdDataColumnSettingsDlg);
    v.put("visCmdDataExplorerWindow", visCmdDataExplorerWindow);
    v.put("visCmdDataAutoLinkWiz", visCmdDataAutoLinkWiz);
    v.put("visCmdDataAutoLink", visCmdDataAutoLink);
    v.put("visCmdApplyThemeToPage", visCmdApplyThemeToPage);
    v.put("visCmdApplyThemeToDoc", visCmdApplyThemeToDoc);
    v.put("visCmdEditTheme", visCmdEditTheme);
    v.put("visCmdDuplicateTheme", visCmdDuplicateTheme);
    v.put("visCmdDeleteTheme", visCmdDeleteTheme);
    v.put("visCmdTaskTogglePreviewSize", visCmdTaskTogglePreviewSize);
    v.put("visCmdTaskPaneThemeColors", visCmdTaskPaneThemeColors);
    v.put("visCmdTaskPaneThemeEffects", visCmdTaskPaneThemeEffects);
    v.put("visCmdAllowThemes", visCmdAllowThemes);
    v.put("visCmdDataUnlinkShape", visCmdDataUnlinkShape);
    v.put("visCmdDataUnlinkRow", visCmdDataUnlinkRow);
    v.put("visCmdUpdateColumnsInLinkedShapes", visCmdUpdateColumnsInLinkedShapes);
    v.put("visCmdNewThemeEffects", visCmdNewThemeEffects);
    v.put("visCmdNewThemeColors", visCmdNewThemeColors);
    v.put("visCmdDeleteDataGraphic", visCmdDeleteDataGraphic);
    v.put("visCmdRelayoutShapes", visCmdRelayoutShapes);
    v.put("visCmdDataRecordsetProperties", visCmdDataRecordsetProperties);
    v.put("visCmdAutoConnectToggle", visCmdAutoConnectToggle);
    v.put("visCmdApplyDataGraphicAfterLink", visCmdApplyDataGraphicAfterLink);
    v.put("visCmdDataRefreshAddConflict", visCmdDataRefreshAddConflict);
    v.put("visCmdDataRefreshDeleteConflict", visCmdDataRefreshDeleteConflict);
    v.put("visCmdDataAutoConnect", visCmdDataAutoConnect);
    v.put("visCmdDataRefreshResolveConflict", visCmdDataRefreshResolveConflict);
    v.put("visCmdTrustCenterDlg", visCmdTrustCenterDlg);
    v.put("visCmdAutoGenerateDataGraphics", visCmdAutoGenerateDataGraphics);
    v.put("visCmdDuplicateDataGraphic", visCmdDuplicateDataGraphic);
    v.put("visCmdRemoveDataGraphicFromSel", visCmdRemoveDataGraphicFromSel);
    v.put("visCmdDropManyLinked", visCmdDropManyLinked);
    v.put("visCmdFileUndoCheckout", visCmdFileUndoCheckout);
    v.put("visCmdDeleteForwardWord", visCmdDeleteForwardWord);
    v.put("visCmdSaveAsFixedFormatDlg", visCmdSaveAsFixedFormatDlg);
    v.put("visCmdRemoveThemeFromSel", visCmdRemoveThemeFromSel);
    v.put("visCmdTaskPane", visCmdTaskPane);
    v.put("visCmdTaskPaneReviewer", visCmdTaskPaneReviewer);
    v.put("visCmdTaskPaneResearch", visCmdTaskPaneResearch);
    v.put("visCmdTaskPaneDocumentManagement", visCmdTaskPaneDocumentManagement);
    v.put("visCmdOfficeDiagnostics", visCmdOfficeDiagnostics);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
