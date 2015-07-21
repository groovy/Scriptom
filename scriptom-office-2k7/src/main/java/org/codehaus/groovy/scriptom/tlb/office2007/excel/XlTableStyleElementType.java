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
public final class XlTableStyleElementType
{
  private XlTableStyleElementType()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer xlWholeTable = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlHeaderRow = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlTotalRow = Integer.valueOf(2);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlGrandTotalRow = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlFirstColumn = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlLastColumn = Integer.valueOf(4);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlGrandTotalColumn = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlRowStripe1 = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlRowStripe2 = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlColumnStripe1 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlColumnStripe2 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlFirstHeaderCell = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer xlLastHeaderCell = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlFirstTotalCell = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlLastTotalCell = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlSubtotalColumn1 = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlSubtotalColumn2 = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlSubtotalColumn3 = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlSubtotalRow1 = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlSubtotalRow2 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer xlSubtotalRow3 = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer xlBlankRow = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer xlColumnSubheading1 = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer xlColumnSubheading2 = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer xlColumnSubheading3 = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer xlRowSubheading1 = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer xlRowSubheading2 = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer xlRowSubheading3 = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer xlPageFieldLabels = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer xlPageFieldValues = Integer.valueOf(27);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlWholeTable", xlWholeTable);
    v.put("xlHeaderRow", xlHeaderRow);
    v.put("xlTotalRow", xlTotalRow);
    v.put("xlGrandTotalRow", xlGrandTotalRow);
    v.put("xlFirstColumn", xlFirstColumn);
    v.put("xlLastColumn", xlLastColumn);
    v.put("xlGrandTotalColumn", xlGrandTotalColumn);
    v.put("xlRowStripe1", xlRowStripe1);
    v.put("xlRowStripe2", xlRowStripe2);
    v.put("xlColumnStripe1", xlColumnStripe1);
    v.put("xlColumnStripe2", xlColumnStripe2);
    v.put("xlFirstHeaderCell", xlFirstHeaderCell);
    v.put("xlLastHeaderCell", xlLastHeaderCell);
    v.put("xlFirstTotalCell", xlFirstTotalCell);
    v.put("xlLastTotalCell", xlLastTotalCell);
    v.put("xlSubtotalColumn1", xlSubtotalColumn1);
    v.put("xlSubtotalColumn2", xlSubtotalColumn2);
    v.put("xlSubtotalColumn3", xlSubtotalColumn3);
    v.put("xlSubtotalRow1", xlSubtotalRow1);
    v.put("xlSubtotalRow2", xlSubtotalRow2);
    v.put("xlSubtotalRow3", xlSubtotalRow3);
    v.put("xlBlankRow", xlBlankRow);
    v.put("xlColumnSubheading1", xlColumnSubheading1);
    v.put("xlColumnSubheading2", xlColumnSubheading2);
    v.put("xlColumnSubheading3", xlColumnSubheading3);
    v.put("xlRowSubheading1", xlRowSubheading1);
    v.put("xlRowSubheading2", xlRowSubheading2);
    v.put("xlRowSubheading3", xlRowSubheading3);
    v.put("xlPageFieldLabels", xlPageFieldLabels);
    v.put("xlPageFieldValues", xlPageFieldValues);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
