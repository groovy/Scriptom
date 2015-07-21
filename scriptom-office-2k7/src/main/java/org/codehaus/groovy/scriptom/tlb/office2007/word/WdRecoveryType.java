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
public final class WdRecoveryType
{
  private WdRecoveryType()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdPasteDefault = Integer.valueOf(0);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdSingleCellText = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdSingleCellTable = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdListContinueNumbering = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdListRestartNumbering = Integer.valueOf(8);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdTableInsertAsRows = Integer.valueOf(11);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdTableAppendTable = Integer.valueOf(10);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdTableOriginalFormatting = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdChartPicture = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdChart = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wdChartLinked = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdFormatOriginalFormatting = Integer.valueOf(16);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdFormatSurroundingFormattingWithEmphasis = Integer.valueOf(20);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdFormatPlainText = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdTableOverwriteCells = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdListCombineWithExistingList = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdListDontMerge = Integer.valueOf(25);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdUseDestinationStylesRecovery = Integer.valueOf(19);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdPasteDefault", wdPasteDefault);
    v.put("wdSingleCellText", wdSingleCellText);
    v.put("wdSingleCellTable", wdSingleCellTable);
    v.put("wdListContinueNumbering", wdListContinueNumbering);
    v.put("wdListRestartNumbering", wdListRestartNumbering);
    v.put("wdTableInsertAsRows", wdTableInsertAsRows);
    v.put("wdTableAppendTable", wdTableAppendTable);
    v.put("wdTableOriginalFormatting", wdTableOriginalFormatting);
    v.put("wdChartPicture", wdChartPicture);
    v.put("wdChart", wdChart);
    v.put("wdChartLinked", wdChartLinked);
    v.put("wdFormatOriginalFormatting", wdFormatOriginalFormatting);
    v.put("wdFormatSurroundingFormattingWithEmphasis", wdFormatSurroundingFormattingWithEmphasis);
    v.put("wdFormatPlainText", wdFormatPlainText);
    v.put("wdTableOverwriteCells", wdTableOverwriteCells);
    v.put("wdListCombineWithExistingList", wdListCombineWithExistingList);
    v.put("wdListDontMerge", wdListDontMerge);
    v.put("wdUseDestinationStylesRecovery", wdUseDestinationStylesRecovery);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
