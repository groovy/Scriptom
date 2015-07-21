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
public final class XlPivotFilterType
{
  private XlPivotFilterType()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlTopCount = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlBottomCount = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlTopPercent = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlBottomPercent = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlTopSum = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlBottomSum = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlValueEquals = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlValueDoesNotEqual = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlValueIsGreaterThan = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer xlValueIsGreaterThanOrEqualTo = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlValueIsLessThan = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlValueIsLessThanOrEqualTo = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlValueIsBetween = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlValueIsNotBetween = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlCaptionEquals = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlCaptionDoesNotEqual = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlCaptionBeginsWith = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer xlCaptionDoesNotBeginWith = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer xlCaptionEndsWith = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer xlCaptionDoesNotEndWith = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer xlCaptionContains = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer xlCaptionDoesNotContain = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer xlCaptionIsGreaterThan = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer xlCaptionIsGreaterThanOrEqualTo = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer xlCaptionIsLessThan = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer xlCaptionIsLessThanOrEqualTo = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer xlCaptionIsBetween = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer xlCaptionIsNotBetween = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer xlSpecificDate = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer xlNotSpecificDate = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer xlBefore = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer xlBeforeOrEqualTo = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer xlAfter = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer xlAfterOrEqualTo = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer xlDateBetween = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer xlDateNotBetween = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer xlDateTomorrow = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer xlDateToday = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer xlDateYesterday = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer xlDateNextWeek = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer xlDateThisWeek = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer xlDateLastWeek = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer xlDateNextMonth = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer xlDateThisMonth = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer xlDateLastMonth = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer xlDateNextQuarter = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer xlDateThisQuarter = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer xlDateLastQuarter = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer xlDateNextYear = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer xlDateThisYear = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer xlDateLastYear = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer xlYearToDate = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer xlAllDatesInPeriodQuarter1 = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer xlAllDatesInPeriodQuarter2 = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer xlAllDatesInPeriodQuarter3 = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer xlAllDatesInPeriodQuarter4 = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer xlAllDatesInPeriodJanuary = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer xlAllDatesInPeriodFebruary = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer xlAllDatesInPeriodMarch = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer xlAllDatesInPeriodApril = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer xlAllDatesInPeriodMay = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer xlAllDatesInPeriodJune = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer xlAllDatesInPeriodJuly = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer xlAllDatesInPeriodAugust = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer xlAllDatesInPeriodSeptember = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer xlAllDatesInPeriodOctober = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer xlAllDatesInPeriodNovember = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer xlAllDatesInPeriodDecember = Integer.valueOf(68);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlTopCount", xlTopCount);
    v.put("xlBottomCount", xlBottomCount);
    v.put("xlTopPercent", xlTopPercent);
    v.put("xlBottomPercent", xlBottomPercent);
    v.put("xlTopSum", xlTopSum);
    v.put("xlBottomSum", xlBottomSum);
    v.put("xlValueEquals", xlValueEquals);
    v.put("xlValueDoesNotEqual", xlValueDoesNotEqual);
    v.put("xlValueIsGreaterThan", xlValueIsGreaterThan);
    v.put("xlValueIsGreaterThanOrEqualTo", xlValueIsGreaterThanOrEqualTo);
    v.put("xlValueIsLessThan", xlValueIsLessThan);
    v.put("xlValueIsLessThanOrEqualTo", xlValueIsLessThanOrEqualTo);
    v.put("xlValueIsBetween", xlValueIsBetween);
    v.put("xlValueIsNotBetween", xlValueIsNotBetween);
    v.put("xlCaptionEquals", xlCaptionEquals);
    v.put("xlCaptionDoesNotEqual", xlCaptionDoesNotEqual);
    v.put("xlCaptionBeginsWith", xlCaptionBeginsWith);
    v.put("xlCaptionDoesNotBeginWith", xlCaptionDoesNotBeginWith);
    v.put("xlCaptionEndsWith", xlCaptionEndsWith);
    v.put("xlCaptionDoesNotEndWith", xlCaptionDoesNotEndWith);
    v.put("xlCaptionContains", xlCaptionContains);
    v.put("xlCaptionDoesNotContain", xlCaptionDoesNotContain);
    v.put("xlCaptionIsGreaterThan", xlCaptionIsGreaterThan);
    v.put("xlCaptionIsGreaterThanOrEqualTo", xlCaptionIsGreaterThanOrEqualTo);
    v.put("xlCaptionIsLessThan", xlCaptionIsLessThan);
    v.put("xlCaptionIsLessThanOrEqualTo", xlCaptionIsLessThanOrEqualTo);
    v.put("xlCaptionIsBetween", xlCaptionIsBetween);
    v.put("xlCaptionIsNotBetween", xlCaptionIsNotBetween);
    v.put("xlSpecificDate", xlSpecificDate);
    v.put("xlNotSpecificDate", xlNotSpecificDate);
    v.put("xlBefore", xlBefore);
    v.put("xlBeforeOrEqualTo", xlBeforeOrEqualTo);
    v.put("xlAfter", xlAfter);
    v.put("xlAfterOrEqualTo", xlAfterOrEqualTo);
    v.put("xlDateBetween", xlDateBetween);
    v.put("xlDateNotBetween", xlDateNotBetween);
    v.put("xlDateTomorrow", xlDateTomorrow);
    v.put("xlDateToday", xlDateToday);
    v.put("xlDateYesterday", xlDateYesterday);
    v.put("xlDateNextWeek", xlDateNextWeek);
    v.put("xlDateThisWeek", xlDateThisWeek);
    v.put("xlDateLastWeek", xlDateLastWeek);
    v.put("xlDateNextMonth", xlDateNextMonth);
    v.put("xlDateThisMonth", xlDateThisMonth);
    v.put("xlDateLastMonth", xlDateLastMonth);
    v.put("xlDateNextQuarter", xlDateNextQuarter);
    v.put("xlDateThisQuarter", xlDateThisQuarter);
    v.put("xlDateLastQuarter", xlDateLastQuarter);
    v.put("xlDateNextYear", xlDateNextYear);
    v.put("xlDateThisYear", xlDateThisYear);
    v.put("xlDateLastYear", xlDateLastYear);
    v.put("xlYearToDate", xlYearToDate);
    v.put("xlAllDatesInPeriodQuarter1", xlAllDatesInPeriodQuarter1);
    v.put("xlAllDatesInPeriodQuarter2", xlAllDatesInPeriodQuarter2);
    v.put("xlAllDatesInPeriodQuarter3", xlAllDatesInPeriodQuarter3);
    v.put("xlAllDatesInPeriodQuarter4", xlAllDatesInPeriodQuarter4);
    v.put("xlAllDatesInPeriodJanuary", xlAllDatesInPeriodJanuary);
    v.put("xlAllDatesInPeriodFebruary", xlAllDatesInPeriodFebruary);
    v.put("xlAllDatesInPeriodMarch", xlAllDatesInPeriodMarch);
    v.put("xlAllDatesInPeriodApril", xlAllDatesInPeriodApril);
    v.put("xlAllDatesInPeriodMay", xlAllDatesInPeriodMay);
    v.put("xlAllDatesInPeriodJune", xlAllDatesInPeriodJune);
    v.put("xlAllDatesInPeriodJuly", xlAllDatesInPeriodJuly);
    v.put("xlAllDatesInPeriodAugust", xlAllDatesInPeriodAugust);
    v.put("xlAllDatesInPeriodSeptember", xlAllDatesInPeriodSeptember);
    v.put("xlAllDatesInPeriodOctober", xlAllDatesInPeriodOctober);
    v.put("xlAllDatesInPeriodNovember", xlAllDatesInPeriodNovember);
    v.put("xlAllDatesInPeriodDecember", xlAllDatesInPeriodDecember);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
