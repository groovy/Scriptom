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
public final class WdInternationalIndex
{
  private WdInternationalIndex()
  {
  }

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdListSeparator = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdDecimalSeparator = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdThousandsSeparator = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdCurrencyCode = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wd24HourClock = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdInternationalAM = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdInternationalPM = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdTimeSeparator = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdDateSeparator = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wdProductLanguageID = Integer.valueOf(26);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdListSeparator", wdListSeparator);
    v.put("wdDecimalSeparator", wdDecimalSeparator);
    v.put("wdThousandsSeparator", wdThousandsSeparator);
    v.put("wdCurrencyCode", wdCurrencyCode);
    v.put("wd24HourClock", wd24HourClock);
    v.put("wdInternationalAM", wdInternationalAM);
    v.put("wdInternationalPM", wdInternationalPM);
    v.put("wdTimeSeparator", wdTimeSeparator);
    v.put("wdDateSeparator", wdDateSeparator);
    v.put("wdProductLanguageID", wdProductLanguageID);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
