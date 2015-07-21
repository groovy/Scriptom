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
public final class WdCompatibility
{
  private WdCompatibility()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdNoTabHangIndent = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdNoSpaceRaiseLower = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdPrintColBlack = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdWrapTrailSpaces = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdNoColumnBalance = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdConvMailMergeEsc = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdSuppressSpBfAfterPgBrk = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdSuppressTopSpacing = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdOrigWordTableRules = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdTransparentMetafiles = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdShowBreaksInFrames = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdSwapBordersFacingPages = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdLeaveBackslashAlone = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdExpandShiftReturn = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wdDontULTrailSpace = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdDontBalanceSingleByteDoubleByteWidth = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdSuppressTopSpacingMac5 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdSpacingInWholePoints = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdPrintBodyTextBeforeHeader = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdNoLeading = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wdNoSpaceForUL = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdMWSmallCaps = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdNoExtraLineSpacing = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdTruncateFontHeight = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdSubFontBySize = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wdUsePrinterMetrics = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer wdWW6BorderRules = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer wdExactOnTop = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer wdSuppressBottomSpacing = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer wdWPSpaceWidth = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer wdWPJustification = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer wdLineWrapLikeWord6 = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer wdShapeLayoutLikeWW8 = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdFootnoteLayoutLikeWW8 = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer wdDontUseHTMLParagraphAutoSpacing = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer wdDontAdjustLineHeightInTable = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer wdForgetLastTabAlignment = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer wdAutospaceLikeWW7 = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer wdAlignTablesRowByRow = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer wdLayoutRawTableWidth = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer wdLayoutTableRowsApart = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer wdUseWord97LineBreakingRules = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer wdDontBreakWrappedTables = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer wdDontSnapTextToGridInTableWithObjects = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer wdSelectFieldWithFirstOrLastCharacter = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer wdApplyBreakingRules = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer wdDontWrapTextWithPunctuation = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer wdDontUseAsianBreakRulesInGrid = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer wdUseWord2002TableStyleRules = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer wdGrowAutofit = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer wdUseNormalStyleForList = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer wdDontUseIndentAsNumberingTabStop = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer wdFELineBreak11 = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer wdAllowSpaceOfSameStyleInTable = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer wdWW11IndentRules = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer wdDontAutofitConstrainedTables = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer wdAutofitLikeWW11 = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer wdUnderlineTabInNumList = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer wdHangulWidthLikeWW11 = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer wdSplitPgBreakAndParaMark = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer wdDontVertAlignCellWithShape = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer wdDontBreakConstrainedForcedTables = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer wdDontVertAlignInTextbox = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer wdWord11KerningPairs = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer wdCachedColBalance = Integer.valueOf(65);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdNoTabHangIndent", wdNoTabHangIndent);
    v.put("wdNoSpaceRaiseLower", wdNoSpaceRaiseLower);
    v.put("wdPrintColBlack", wdPrintColBlack);
    v.put("wdWrapTrailSpaces", wdWrapTrailSpaces);
    v.put("wdNoColumnBalance", wdNoColumnBalance);
    v.put("wdConvMailMergeEsc", wdConvMailMergeEsc);
    v.put("wdSuppressSpBfAfterPgBrk", wdSuppressSpBfAfterPgBrk);
    v.put("wdSuppressTopSpacing", wdSuppressTopSpacing);
    v.put("wdOrigWordTableRules", wdOrigWordTableRules);
    v.put("wdTransparentMetafiles", wdTransparentMetafiles);
    v.put("wdShowBreaksInFrames", wdShowBreaksInFrames);
    v.put("wdSwapBordersFacingPages", wdSwapBordersFacingPages);
    v.put("wdLeaveBackslashAlone", wdLeaveBackslashAlone);
    v.put("wdExpandShiftReturn", wdExpandShiftReturn);
    v.put("wdDontULTrailSpace", wdDontULTrailSpace);
    v.put("wdDontBalanceSingleByteDoubleByteWidth", wdDontBalanceSingleByteDoubleByteWidth);
    v.put("wdSuppressTopSpacingMac5", wdSuppressTopSpacingMac5);
    v.put("wdSpacingInWholePoints", wdSpacingInWholePoints);
    v.put("wdPrintBodyTextBeforeHeader", wdPrintBodyTextBeforeHeader);
    v.put("wdNoLeading", wdNoLeading);
    v.put("wdNoSpaceForUL", wdNoSpaceForUL);
    v.put("wdMWSmallCaps", wdMWSmallCaps);
    v.put("wdNoExtraLineSpacing", wdNoExtraLineSpacing);
    v.put("wdTruncateFontHeight", wdTruncateFontHeight);
    v.put("wdSubFontBySize", wdSubFontBySize);
    v.put("wdUsePrinterMetrics", wdUsePrinterMetrics);
    v.put("wdWW6BorderRules", wdWW6BorderRules);
    v.put("wdExactOnTop", wdExactOnTop);
    v.put("wdSuppressBottomSpacing", wdSuppressBottomSpacing);
    v.put("wdWPSpaceWidth", wdWPSpaceWidth);
    v.put("wdWPJustification", wdWPJustification);
    v.put("wdLineWrapLikeWord6", wdLineWrapLikeWord6);
    v.put("wdShapeLayoutLikeWW8", wdShapeLayoutLikeWW8);
    v.put("wdFootnoteLayoutLikeWW8", wdFootnoteLayoutLikeWW8);
    v.put("wdDontUseHTMLParagraphAutoSpacing", wdDontUseHTMLParagraphAutoSpacing);
    v.put("wdDontAdjustLineHeightInTable", wdDontAdjustLineHeightInTable);
    v.put("wdForgetLastTabAlignment", wdForgetLastTabAlignment);
    v.put("wdAutospaceLikeWW7", wdAutospaceLikeWW7);
    v.put("wdAlignTablesRowByRow", wdAlignTablesRowByRow);
    v.put("wdLayoutRawTableWidth", wdLayoutRawTableWidth);
    v.put("wdLayoutTableRowsApart", wdLayoutTableRowsApart);
    v.put("wdUseWord97LineBreakingRules", wdUseWord97LineBreakingRules);
    v.put("wdDontBreakWrappedTables", wdDontBreakWrappedTables);
    v.put("wdDontSnapTextToGridInTableWithObjects", wdDontSnapTextToGridInTableWithObjects);
    v.put("wdSelectFieldWithFirstOrLastCharacter", wdSelectFieldWithFirstOrLastCharacter);
    v.put("wdApplyBreakingRules", wdApplyBreakingRules);
    v.put("wdDontWrapTextWithPunctuation", wdDontWrapTextWithPunctuation);
    v.put("wdDontUseAsianBreakRulesInGrid", wdDontUseAsianBreakRulesInGrid);
    v.put("wdUseWord2002TableStyleRules", wdUseWord2002TableStyleRules);
    v.put("wdGrowAutofit", wdGrowAutofit);
    v.put("wdUseNormalStyleForList", wdUseNormalStyleForList);
    v.put("wdDontUseIndentAsNumberingTabStop", wdDontUseIndentAsNumberingTabStop);
    v.put("wdFELineBreak11", wdFELineBreak11);
    v.put("wdAllowSpaceOfSameStyleInTable", wdAllowSpaceOfSameStyleInTable);
    v.put("wdWW11IndentRules", wdWW11IndentRules);
    v.put("wdDontAutofitConstrainedTables", wdDontAutofitConstrainedTables);
    v.put("wdAutofitLikeWW11", wdAutofitLikeWW11);
    v.put("wdUnderlineTabInNumList", wdUnderlineTabInNumList);
    v.put("wdHangulWidthLikeWW11", wdHangulWidthLikeWW11);
    v.put("wdSplitPgBreakAndParaMark", wdSplitPgBreakAndParaMark);
    v.put("wdDontVertAlignCellWithShape", wdDontVertAlignCellWithShape);
    v.put("wdDontBreakConstrainedForcedTables", wdDontBreakConstrainedForcedTables);
    v.put("wdDontVertAlignInTextbox", wdDontVertAlignInTextbox);
    v.put("wdWord11KerningPairs", wdWord11KerningPairs);
    v.put("wdCachedColBalance", wdCachedColBalance);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
