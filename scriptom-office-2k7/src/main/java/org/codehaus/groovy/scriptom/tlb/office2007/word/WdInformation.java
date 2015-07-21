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
public final class WdInformation
{
  private WdInformation()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdActiveEndAdjustedPageNumber = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdActiveEndSectionNumber = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdActiveEndPageNumber = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdNumberOfPagesInDocument = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdHorizontalPositionRelativeToPage = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdVerticalPositionRelativeToPage = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdHorizontalPositionRelativeToTextBoundary = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdVerticalPositionRelativeToTextBoundary = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdFirstCharacterColumnNumber = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdFirstCharacterLineNumber = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdFrameIsSelected = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdWithInTable = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdStartOfRangeRowNumber = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdEndOfRangeRowNumber = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wdMaximumNumberOfRows = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdStartOfRangeColumnNumber = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdEndOfRangeColumnNumber = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdMaximumNumberOfColumns = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdZoomPercentage = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdSelectionMode = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wdCapsLock = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdNumLock = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdOverType = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdRevisionMarking = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdInFootnoteEndnotePane = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wdInCommentPane = Integer.valueOf(26);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer wdInHeaderFooter = Integer.valueOf(28);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer wdAtEndOfRowMarker = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer wdReferenceOfType = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer wdHeaderFooterType = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdInMasterDocument = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer wdInFootnote = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer wdInEndnote = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer wdInWordMail = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer wdInClipboard = Integer.valueOf(38);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdActiveEndAdjustedPageNumber", wdActiveEndAdjustedPageNumber);
    v.put("wdActiveEndSectionNumber", wdActiveEndSectionNumber);
    v.put("wdActiveEndPageNumber", wdActiveEndPageNumber);
    v.put("wdNumberOfPagesInDocument", wdNumberOfPagesInDocument);
    v.put("wdHorizontalPositionRelativeToPage", wdHorizontalPositionRelativeToPage);
    v.put("wdVerticalPositionRelativeToPage", wdVerticalPositionRelativeToPage);
    v.put("wdHorizontalPositionRelativeToTextBoundary", wdHorizontalPositionRelativeToTextBoundary);
    v.put("wdVerticalPositionRelativeToTextBoundary", wdVerticalPositionRelativeToTextBoundary);
    v.put("wdFirstCharacterColumnNumber", wdFirstCharacterColumnNumber);
    v.put("wdFirstCharacterLineNumber", wdFirstCharacterLineNumber);
    v.put("wdFrameIsSelected", wdFrameIsSelected);
    v.put("wdWithInTable", wdWithInTable);
    v.put("wdStartOfRangeRowNumber", wdStartOfRangeRowNumber);
    v.put("wdEndOfRangeRowNumber", wdEndOfRangeRowNumber);
    v.put("wdMaximumNumberOfRows", wdMaximumNumberOfRows);
    v.put("wdStartOfRangeColumnNumber", wdStartOfRangeColumnNumber);
    v.put("wdEndOfRangeColumnNumber", wdEndOfRangeColumnNumber);
    v.put("wdMaximumNumberOfColumns", wdMaximumNumberOfColumns);
    v.put("wdZoomPercentage", wdZoomPercentage);
    v.put("wdSelectionMode", wdSelectionMode);
    v.put("wdCapsLock", wdCapsLock);
    v.put("wdNumLock", wdNumLock);
    v.put("wdOverType", wdOverType);
    v.put("wdRevisionMarking", wdRevisionMarking);
    v.put("wdInFootnoteEndnotePane", wdInFootnoteEndnotePane);
    v.put("wdInCommentPane", wdInCommentPane);
    v.put("wdInHeaderFooter", wdInHeaderFooter);
    v.put("wdAtEndOfRowMarker", wdAtEndOfRowMarker);
    v.put("wdReferenceOfType", wdReferenceOfType);
    v.put("wdHeaderFooterType", wdHeaderFooterType);
    v.put("wdInMasterDocument", wdInMasterDocument);
    v.put("wdInFootnote", wdInFootnote);
    v.put("wdInEndnote", wdInEndnote);
    v.put("wdInWordMail", wdInWordMail);
    v.put("wdInClipboard", wdInClipboard);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
