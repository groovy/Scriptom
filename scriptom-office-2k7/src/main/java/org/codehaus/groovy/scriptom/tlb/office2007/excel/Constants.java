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
public final class Constants
{
  private Constants()
  {
  }

  /**
   * Value is -4104 (0xFFFFEFF8)
   */
  public static final Integer xlAll = Integer.valueOf(-4104);

  /**
   * Value is -4105 (0xFFFFEFF7)
   */
  public static final Integer xlAutomatic = Integer.valueOf(-4105);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlBoth = Integer.valueOf(1);

  /**
   * Value is -4108 (0xFFFFEFF4)
   */
  public static final Integer xlCenter = Integer.valueOf(-4108);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlChecker = Integer.valueOf(9);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlCircle = Integer.valueOf(8);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlCorner = Integer.valueOf(2);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlCrissCross = Integer.valueOf(16);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlCross = Integer.valueOf(4);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlDiamond = Integer.valueOf(2);

  /**
   * Value is -4117 (0xFFFFEFEB)
   */
  public static final Integer xlDistributed = Integer.valueOf(-4117);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlDoubleAccounting = Integer.valueOf(5);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlFixedValue = Integer.valueOf(1);

  /**
   * Value is -4122 (0xFFFFEFE6)
   */
  public static final Integer xlFormats = Integer.valueOf(-4122);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlGray16 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer xlGray8 = Integer.valueOf(18);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlGrid = Integer.valueOf(15);

  /**
   * Value is -4127 (0xFFFFEFE1)
   */
  public static final Integer xlHigh = Integer.valueOf(-4127);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlInside = Integer.valueOf(2);

  /**
   * Value is -4130 (0xFFFFEFDE)
   */
  public static final Integer xlJustify = Integer.valueOf(-4130);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlLightDown = Integer.valueOf(13);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlLightHorizontal = Integer.valueOf(11);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlLightUp = Integer.valueOf(14);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlLightVertical = Integer.valueOf(12);

  /**
   * Value is -4134 (0xFFFFEFDA)
   */
  public static final Integer xlLow = Integer.valueOf(-4134);

  /**
   * Value is -4135 (0xFFFFEFD9)
   */
  public static final Integer xlManual = Integer.valueOf(-4135);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlMinusValues = Integer.valueOf(3);

  /**
   * Value is -4141 (0xFFFFEFD3)
   */
  public static final Integer xlModule = Integer.valueOf(-4141);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlNextToAxis = Integer.valueOf(4);

  /**
   * Value is -4142 (0xFFFFEFD2)
   */
  public static final Integer xlNone = Integer.valueOf(-4142);

  /**
   * Value is -4144 (0xFFFFEFD0)
   */
  public static final Integer xlNotes = Integer.valueOf(-4144);

  /**
   * Value is -4146 (0xFFFFEFCE)
   */
  public static final Integer xlOff = Integer.valueOf(-4146);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlOn = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlPercent = Integer.valueOf(2);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlPlus = Integer.valueOf(9);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlPlusValues = Integer.valueOf(2);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer xlSemiGray75 = Integer.valueOf(10);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlShowLabel = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlShowLabelAndPercent = Integer.valueOf(5);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlShowPercent = Integer.valueOf(3);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlShowValue = Integer.valueOf(2);

  /**
   * Value is -4154 (0xFFFFEFC6)
   */
  public static final Integer xlSimple = Integer.valueOf(-4154);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlSingle = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlSingleAccounting = Integer.valueOf(4);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlSolid = Integer.valueOf(1);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlSquare = Integer.valueOf(1);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlStar = Integer.valueOf(5);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlStError = Integer.valueOf(4);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlToolbarButton = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlTriangle = Integer.valueOf(3);

  /**
   * Value is -4124 (0xFFFFEFE4)
   */
  public static final Integer xlGray25 = Integer.valueOf(-4124);

  /**
   * Value is -4125 (0xFFFFEFE3)
   */
  public static final Integer xlGray50 = Integer.valueOf(-4125);

  /**
   * Value is -4126 (0xFFFFEFE2)
   */
  public static final Integer xlGray75 = Integer.valueOf(-4126);

  /**
   * Value is -4107 (0xFFFFEFF5)
   */
  public static final Integer xlBottom = Integer.valueOf(-4107);

  /**
   * Value is -4131 (0xFFFFEFDD)
   */
  public static final Integer xlLeft = Integer.valueOf(-4131);

  /**
   * Value is -4152 (0xFFFFEFC8)
   */
  public static final Integer xlRight = Integer.valueOf(-4152);

  /**
   * Value is -4160 (0xFFFFEFC0)
   */
  public static final Integer xlTop = Integer.valueOf(-4160);

  /**
   * Value is -4099 (0xFFFFEFFD)
   */
  public static final Integer xl3DBar = Integer.valueOf(-4099);

  /**
   * Value is -4103 (0xFFFFEFF9)
   */
  public static final Integer xl3DSurface = Integer.valueOf(-4103);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlBar = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlColumn = Integer.valueOf(3);

  /**
   * Value is -4111 (0xFFFFEFF1)
   */
  public static final Integer xlCombination = Integer.valueOf(-4111);

  /**
   * Value is -4114 (0xFFFFEFEE)
   */
  public static final Integer xlCustom = Integer.valueOf(-4114);

  /**
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer xlDefaultAutoFormat = Integer.valueOf(-1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlMaximum = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlMinimum = Integer.valueOf(4);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlOpaque = Integer.valueOf(3);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlTransparent = Integer.valueOf(2);

  /**
   * Value is -5000 (0xFFFFEC78)
   */
  public static final Integer xlBidi = Integer.valueOf(-5000);

  /**
   * Value is -5001 (0xFFFFEC77)
   */
  public static final Integer xlLatin = Integer.valueOf(-5001);

  /**
   * Value is -5002 (0xFFFFEC76)
   */
  public static final Integer xlContext = Integer.valueOf(-5002);

  /**
   * Value is -5003 (0xFFFFEC75)
   */
  public static final Integer xlLTR = Integer.valueOf(-5003);

  /**
   * Value is -5004 (0xFFFFEC74)
   */
  public static final Integer xlRTL = Integer.valueOf(-5004);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlFullScript = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlPartialScript = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlMixedScript = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlMixedAuthorizedScript = Integer.valueOf(4);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlVisualCursor = Integer.valueOf(2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlLogicalCursor = Integer.valueOf(1);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlSystem = Integer.valueOf(1);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlPartial = Integer.valueOf(3);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlHindiNumerals = Integer.valueOf(3);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlBidiCalendar = Integer.valueOf(3);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlGregorian = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlComplete = Integer.valueOf(4);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlScale = Integer.valueOf(3);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlClosed = Integer.valueOf(3);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlColor1 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlColor2 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlColor3 = Integer.valueOf(9);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlConstants = Integer.valueOf(2);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlContents = Integer.valueOf(2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlBelow = Integer.valueOf(1);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlCascade = Integer.valueOf(7);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlCenterAcrossSelection = Integer.valueOf(7);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlChart4 = Integer.valueOf(2);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlChartSeries = Integer.valueOf(17);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlChartShort = Integer.valueOf(6);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer xlChartTitles = Integer.valueOf(18);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlClassic1 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlClassic2 = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlClassic3 = Integer.valueOf(3);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xl3DEffects1 = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xl3DEffects2 = Integer.valueOf(14);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer xlAbove = Integer.valueOf(0);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlAccounting1 = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlAccounting2 = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlAccounting3 = Integer.valueOf(6);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlAccounting4 = Integer.valueOf(17);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlAdd = Integer.valueOf(2);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlDebugCodePane = Integer.valueOf(13);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlDesktop = Integer.valueOf(9);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlDirect = Integer.valueOf(1);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlDivide = Integer.valueOf(5);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlDoubleClosed = Integer.valueOf(5);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlDoubleOpen = Integer.valueOf(4);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlDoubleQuote = Integer.valueOf(1);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer xlEntireChart = Integer.valueOf(20);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlExcelMenus = Integer.valueOf(1);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlExtended = Integer.valueOf(3);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlFill = Integer.valueOf(5);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer xlFirst = Integer.valueOf(0);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlFloating = Integer.valueOf(5);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlFormula = Integer.valueOf(5);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlGeneral = Integer.valueOf(1);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer xlGridline = Integer.valueOf(22);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlIcons = Integer.valueOf(1);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlImmediatePane = Integer.valueOf(12);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlInteger = Integer.valueOf(2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlLast = Integer.valueOf(1);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlLastCell = Integer.valueOf(11);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer xlList1 = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlList2 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlList3 = Integer.valueOf(12);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlLocalFormat1 = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlLocalFormat2 = Integer.valueOf(16);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlLong = Integer.valueOf(3);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlLotusHelp = Integer.valueOf(2);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlMacrosheetCell = Integer.valueOf(7);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlMixed = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlMultiply = Integer.valueOf(4);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlNarrow = Integer.valueOf(1);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlNoDocuments = Integer.valueOf(3);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlOpen = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlOutside = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlReference = Integer.valueOf(4);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlSemiautomatic = Integer.valueOf(2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlShort = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlSingleQuote = Integer.valueOf(2);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlStrict = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlSubtract = Integer.valueOf(3);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlTextBox = Integer.valueOf(16);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlTiled = Integer.valueOf(1);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlTitleBar = Integer.valueOf(8);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlToolbar = Integer.valueOf(1);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlVisible = Integer.valueOf(12);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlWatchPane = Integer.valueOf(11);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlWide = Integer.valueOf(3);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlWorkbookTab = Integer.valueOf(6);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlWorksheet4 = Integer.valueOf(1);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlWorksheetCell = Integer.valueOf(3);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlWorksheetShort = Integer.valueOf(5);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlAllExceptBorders = Integer.valueOf(7);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlLeftToRight = Integer.valueOf(2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlTopToBottom = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlVeryHidden = Integer.valueOf(2);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlDrawingObject = Integer.valueOf(14);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlAll", xlAll);
    v.put("xlAutomatic", xlAutomatic);
    v.put("xlBoth", xlBoth);
    v.put("xlCenter", xlCenter);
    v.put("xlChecker", xlChecker);
    v.put("xlCircle", xlCircle);
    v.put("xlCorner", xlCorner);
    v.put("xlCrissCross", xlCrissCross);
    v.put("xlCross", xlCross);
    v.put("xlDiamond", xlDiamond);
    v.put("xlDistributed", xlDistributed);
    v.put("xlDoubleAccounting", xlDoubleAccounting);
    v.put("xlFixedValue", xlFixedValue);
    v.put("xlFormats", xlFormats);
    v.put("xlGray16", xlGray16);
    v.put("xlGray8", xlGray8);
    v.put("xlGrid", xlGrid);
    v.put("xlHigh", xlHigh);
    v.put("xlInside", xlInside);
    v.put("xlJustify", xlJustify);
    v.put("xlLightDown", xlLightDown);
    v.put("xlLightHorizontal", xlLightHorizontal);
    v.put("xlLightUp", xlLightUp);
    v.put("xlLightVertical", xlLightVertical);
    v.put("xlLow", xlLow);
    v.put("xlManual", xlManual);
    v.put("xlMinusValues", xlMinusValues);
    v.put("xlModule", xlModule);
    v.put("xlNextToAxis", xlNextToAxis);
    v.put("xlNone", xlNone);
    v.put("xlNotes", xlNotes);
    v.put("xlOff", xlOff);
    v.put("xlOn", xlOn);
    v.put("xlPercent", xlPercent);
    v.put("xlPlus", xlPlus);
    v.put("xlPlusValues", xlPlusValues);
    v.put("xlSemiGray75", xlSemiGray75);
    v.put("xlShowLabel", xlShowLabel);
    v.put("xlShowLabelAndPercent", xlShowLabelAndPercent);
    v.put("xlShowPercent", xlShowPercent);
    v.put("xlShowValue", xlShowValue);
    v.put("xlSimple", xlSimple);
    v.put("xlSingle", xlSingle);
    v.put("xlSingleAccounting", xlSingleAccounting);
    v.put("xlSolid", xlSolid);
    v.put("xlSquare", xlSquare);
    v.put("xlStar", xlStar);
    v.put("xlStError", xlStError);
    v.put("xlToolbarButton", xlToolbarButton);
    v.put("xlTriangle", xlTriangle);
    v.put("xlGray25", xlGray25);
    v.put("xlGray50", xlGray50);
    v.put("xlGray75", xlGray75);
    v.put("xlBottom", xlBottom);
    v.put("xlLeft", xlLeft);
    v.put("xlRight", xlRight);
    v.put("xlTop", xlTop);
    v.put("xl3DBar", xl3DBar);
    v.put("xl3DSurface", xl3DSurface);
    v.put("xlBar", xlBar);
    v.put("xlColumn", xlColumn);
    v.put("xlCombination", xlCombination);
    v.put("xlCustom", xlCustom);
    v.put("xlDefaultAutoFormat", xlDefaultAutoFormat);
    v.put("xlMaximum", xlMaximum);
    v.put("xlMinimum", xlMinimum);
    v.put("xlOpaque", xlOpaque);
    v.put("xlTransparent", xlTransparent);
    v.put("xlBidi", xlBidi);
    v.put("xlLatin", xlLatin);
    v.put("xlContext", xlContext);
    v.put("xlLTR", xlLTR);
    v.put("xlRTL", xlRTL);
    v.put("xlFullScript", xlFullScript);
    v.put("xlPartialScript", xlPartialScript);
    v.put("xlMixedScript", xlMixedScript);
    v.put("xlMixedAuthorizedScript", xlMixedAuthorizedScript);
    v.put("xlVisualCursor", xlVisualCursor);
    v.put("xlLogicalCursor", xlLogicalCursor);
    v.put("xlSystem", xlSystem);
    v.put("xlPartial", xlPartial);
    v.put("xlHindiNumerals", xlHindiNumerals);
    v.put("xlBidiCalendar", xlBidiCalendar);
    v.put("xlGregorian", xlGregorian);
    v.put("xlComplete", xlComplete);
    v.put("xlScale", xlScale);
    v.put("xlClosed", xlClosed);
    v.put("xlColor1", xlColor1);
    v.put("xlColor2", xlColor2);
    v.put("xlColor3", xlColor3);
    v.put("xlConstants", xlConstants);
    v.put("xlContents", xlContents);
    v.put("xlBelow", xlBelow);
    v.put("xlCascade", xlCascade);
    v.put("xlCenterAcrossSelection", xlCenterAcrossSelection);
    v.put("xlChart4", xlChart4);
    v.put("xlChartSeries", xlChartSeries);
    v.put("xlChartShort", xlChartShort);
    v.put("xlChartTitles", xlChartTitles);
    v.put("xlClassic1", xlClassic1);
    v.put("xlClassic2", xlClassic2);
    v.put("xlClassic3", xlClassic3);
    v.put("xl3DEffects1", xl3DEffects1);
    v.put("xl3DEffects2", xl3DEffects2);
    v.put("xlAbove", xlAbove);
    v.put("xlAccounting1", xlAccounting1);
    v.put("xlAccounting2", xlAccounting2);
    v.put("xlAccounting3", xlAccounting3);
    v.put("xlAccounting4", xlAccounting4);
    v.put("xlAdd", xlAdd);
    v.put("xlDebugCodePane", xlDebugCodePane);
    v.put("xlDesktop", xlDesktop);
    v.put("xlDirect", xlDirect);
    v.put("xlDivide", xlDivide);
    v.put("xlDoubleClosed", xlDoubleClosed);
    v.put("xlDoubleOpen", xlDoubleOpen);
    v.put("xlDoubleQuote", xlDoubleQuote);
    v.put("xlEntireChart", xlEntireChart);
    v.put("xlExcelMenus", xlExcelMenus);
    v.put("xlExtended", xlExtended);
    v.put("xlFill", xlFill);
    v.put("xlFirst", xlFirst);
    v.put("xlFloating", xlFloating);
    v.put("xlFormula", xlFormula);
    v.put("xlGeneral", xlGeneral);
    v.put("xlGridline", xlGridline);
    v.put("xlIcons", xlIcons);
    v.put("xlImmediatePane", xlImmediatePane);
    v.put("xlInteger", xlInteger);
    v.put("xlLast", xlLast);
    v.put("xlLastCell", xlLastCell);
    v.put("xlList1", xlList1);
    v.put("xlList2", xlList2);
    v.put("xlList3", xlList3);
    v.put("xlLocalFormat1", xlLocalFormat1);
    v.put("xlLocalFormat2", xlLocalFormat2);
    v.put("xlLong", xlLong);
    v.put("xlLotusHelp", xlLotusHelp);
    v.put("xlMacrosheetCell", xlMacrosheetCell);
    v.put("xlMixed", xlMixed);
    v.put("xlMultiply", xlMultiply);
    v.put("xlNarrow", xlNarrow);
    v.put("xlNoDocuments", xlNoDocuments);
    v.put("xlOpen", xlOpen);
    v.put("xlOutside", xlOutside);
    v.put("xlReference", xlReference);
    v.put("xlSemiautomatic", xlSemiautomatic);
    v.put("xlShort", xlShort);
    v.put("xlSingleQuote", xlSingleQuote);
    v.put("xlStrict", xlStrict);
    v.put("xlSubtract", xlSubtract);
    v.put("xlTextBox", xlTextBox);
    v.put("xlTiled", xlTiled);
    v.put("xlTitleBar", xlTitleBar);
    v.put("xlToolbar", xlToolbar);
    v.put("xlVisible", xlVisible);
    v.put("xlWatchPane", xlWatchPane);
    v.put("xlWide", xlWide);
    v.put("xlWorkbookTab", xlWorkbookTab);
    v.put("xlWorksheet4", xlWorksheet4);
    v.put("xlWorksheetCell", xlWorksheetCell);
    v.put("xlWorksheetShort", xlWorksheetShort);
    v.put("xlAllExceptBorders", xlAllExceptBorders);
    v.put("xlLeftToRight", xlLeftToRight);
    v.put("xlTopToBottom", xlTopToBottom);
    v.put("xlVeryHidden", xlVeryHidden);
    v.put("xlDrawingObject", xlDrawingObject);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
