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
package org.codehaus.groovy.scriptom.tlb.office2007.outlook;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class OlUserPropertyType
{
  private OlUserPropertyType()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer olOutlookInternal = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer olText = Integer.valueOf(1);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer olNumber = Integer.valueOf(3);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer olDateTime = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer olYesNo = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer olDuration = Integer.valueOf(7);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer olKeywords = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer olPercent = Integer.valueOf(12);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer olCurrency = Integer.valueOf(14);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer olFormula = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer olCombination = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer olInteger = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer olEnumeration = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer olSmartFrom = Integer.valueOf(22);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("olOutlookInternal", olOutlookInternal);
    v.put("olText", olText);
    v.put("olNumber", olNumber);
    v.put("olDateTime", olDateTime);
    v.put("olYesNo", olYesNo);
    v.put("olDuration", olDuration);
    v.put("olKeywords", olKeywords);
    v.put("olPercent", olPercent);
    v.put("olCurrency", olCurrency);
    v.put("olFormula", olFormula);
    v.put("olCombination", olCombination);
    v.put("olInteger", olInteger);
    v.put("olEnumeration", olEnumeration);
    v.put("olSmartFrom", olSmartFrom);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
