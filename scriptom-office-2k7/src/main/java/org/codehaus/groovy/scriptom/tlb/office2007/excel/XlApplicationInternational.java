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
public final class XlApplicationInternational
{
  private XlApplicationInternational()
  {
  }

  /**
   * Value is 33 (0x21)
   */
  public static final Integer xl24HourClock = Integer.valueOf(33);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer xl4DigitYears = Integer.valueOf(43);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlAlternateArraySeparator = Integer.valueOf(16);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlColumnSeparator = Integer.valueOf(14);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlCountryCode = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlCountrySetting = Integer.valueOf(2);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer xlCurrencyBefore = Integer.valueOf(37);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer xlCurrencyCode = Integer.valueOf(25);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer xlCurrencyDigits = Integer.valueOf(27);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer xlCurrencyLeadingZeros = Integer.valueOf(40);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer xlCurrencyMinusSign = Integer.valueOf(38);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer xlCurrencyNegative = Integer.valueOf(28);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer xlCurrencySpaceBefore = Integer.valueOf(36);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer xlCurrencyTrailingZeros = Integer.valueOf(39);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer xlDateOrder = Integer.valueOf(32);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlDateSeparator = Integer.valueOf(17);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer xlDayCode = Integer.valueOf(21);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer xlDayLeadingZero = Integer.valueOf(42);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlDecimalSeparator = Integer.valueOf(3);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer xlGeneralFormatName = Integer.valueOf(26);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer xlHourCode = Integer.valueOf(22);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlLeftBrace = Integer.valueOf(12);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer xlLeftBracket = Integer.valueOf(10);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlListSeparator = Integer.valueOf(5);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlLowerCaseColumnLetter = Integer.valueOf(9);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlLowerCaseRowLetter = Integer.valueOf(8);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer xlMDY = Integer.valueOf(44);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer xlMetric = Integer.valueOf(35);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer xlMinuteCode = Integer.valueOf(23);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer xlMonthCode = Integer.valueOf(20);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer xlMonthLeadingZero = Integer.valueOf(41);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer xlMonthNameChars = Integer.valueOf(30);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer xlNoncurrencyDigits = Integer.valueOf(29);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer xlNonEnglishFunctions = Integer.valueOf(34);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlRightBrace = Integer.valueOf(13);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlRightBracket = Integer.valueOf(11);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlRowSeparator = Integer.valueOf(15);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer xlSecondCode = Integer.valueOf(24);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlThousandsSeparator = Integer.valueOf(4);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer xlTimeLeadingZero = Integer.valueOf(45);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer xlTimeSeparator = Integer.valueOf(18);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlUpperCaseColumnLetter = Integer.valueOf(7);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlUpperCaseRowLetter = Integer.valueOf(6);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer xlWeekdayNameChars = Integer.valueOf(31);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer xlYearCode = Integer.valueOf(19);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xl24HourClock", xl24HourClock);
    v.put("xl4DigitYears", xl4DigitYears);
    v.put("xlAlternateArraySeparator", xlAlternateArraySeparator);
    v.put("xlColumnSeparator", xlColumnSeparator);
    v.put("xlCountryCode", xlCountryCode);
    v.put("xlCountrySetting", xlCountrySetting);
    v.put("xlCurrencyBefore", xlCurrencyBefore);
    v.put("xlCurrencyCode", xlCurrencyCode);
    v.put("xlCurrencyDigits", xlCurrencyDigits);
    v.put("xlCurrencyLeadingZeros", xlCurrencyLeadingZeros);
    v.put("xlCurrencyMinusSign", xlCurrencyMinusSign);
    v.put("xlCurrencyNegative", xlCurrencyNegative);
    v.put("xlCurrencySpaceBefore", xlCurrencySpaceBefore);
    v.put("xlCurrencyTrailingZeros", xlCurrencyTrailingZeros);
    v.put("xlDateOrder", xlDateOrder);
    v.put("xlDateSeparator", xlDateSeparator);
    v.put("xlDayCode", xlDayCode);
    v.put("xlDayLeadingZero", xlDayLeadingZero);
    v.put("xlDecimalSeparator", xlDecimalSeparator);
    v.put("xlGeneralFormatName", xlGeneralFormatName);
    v.put("xlHourCode", xlHourCode);
    v.put("xlLeftBrace", xlLeftBrace);
    v.put("xlLeftBracket", xlLeftBracket);
    v.put("xlListSeparator", xlListSeparator);
    v.put("xlLowerCaseColumnLetter", xlLowerCaseColumnLetter);
    v.put("xlLowerCaseRowLetter", xlLowerCaseRowLetter);
    v.put("xlMDY", xlMDY);
    v.put("xlMetric", xlMetric);
    v.put("xlMinuteCode", xlMinuteCode);
    v.put("xlMonthCode", xlMonthCode);
    v.put("xlMonthLeadingZero", xlMonthLeadingZero);
    v.put("xlMonthNameChars", xlMonthNameChars);
    v.put("xlNoncurrencyDigits", xlNoncurrencyDigits);
    v.put("xlNonEnglishFunctions", xlNonEnglishFunctions);
    v.put("xlRightBrace", xlRightBrace);
    v.put("xlRightBracket", xlRightBracket);
    v.put("xlRowSeparator", xlRowSeparator);
    v.put("xlSecondCode", xlSecondCode);
    v.put("xlThousandsSeparator", xlThousandsSeparator);
    v.put("xlTimeLeadingZero", xlTimeLeadingZero);
    v.put("xlTimeSeparator", xlTimeSeparator);
    v.put("xlUpperCaseColumnLetter", xlUpperCaseColumnLetter);
    v.put("xlUpperCaseRowLetter", xlUpperCaseRowLetter);
    v.put("xlWeekdayNameChars", xlWeekdayNameChars);
    v.put("xlYearCode", xlYearCode);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
