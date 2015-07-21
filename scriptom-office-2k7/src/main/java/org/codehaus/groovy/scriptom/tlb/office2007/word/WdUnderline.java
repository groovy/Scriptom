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
public final class WdUnderline
{
  private WdUnderline()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdUnderlineNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdUnderlineSingle = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdUnderlineWords = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdUnderlineDouble = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdUnderlineDotted = Integer.valueOf(4);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdUnderlineThick = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdUnderlineDash = Integer.valueOf(7);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdUnderlineDotDash = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdUnderlineDotDotDash = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdUnderlineWavy = Integer.valueOf(11);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer wdUnderlineWavyHeavy = Integer.valueOf(27);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdUnderlineDottedHeavy = Integer.valueOf(20);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdUnderlineDashHeavy = Integer.valueOf(23);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdUnderlineDotDashHeavy = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wdUnderlineDotDotDashHeavy = Integer.valueOf(26);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer wdUnderlineDashLong = Integer.valueOf(39);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer wdUnderlineDashLongHeavy = Integer.valueOf(55);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer wdUnderlineWavyDouble = Integer.valueOf(43);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdUnderlineNone", wdUnderlineNone);
    v.put("wdUnderlineSingle", wdUnderlineSingle);
    v.put("wdUnderlineWords", wdUnderlineWords);
    v.put("wdUnderlineDouble", wdUnderlineDouble);
    v.put("wdUnderlineDotted", wdUnderlineDotted);
    v.put("wdUnderlineThick", wdUnderlineThick);
    v.put("wdUnderlineDash", wdUnderlineDash);
    v.put("wdUnderlineDotDash", wdUnderlineDotDash);
    v.put("wdUnderlineDotDotDash", wdUnderlineDotDotDash);
    v.put("wdUnderlineWavy", wdUnderlineWavy);
    v.put("wdUnderlineWavyHeavy", wdUnderlineWavyHeavy);
    v.put("wdUnderlineDottedHeavy", wdUnderlineDottedHeavy);
    v.put("wdUnderlineDashHeavy", wdUnderlineDashHeavy);
    v.put("wdUnderlineDotDashHeavy", wdUnderlineDotDashHeavy);
    v.put("wdUnderlineDotDotDashHeavy", wdUnderlineDotDotDashHeavy);
    v.put("wdUnderlineDashLong", wdUnderlineDashLong);
    v.put("wdUnderlineDashLongHeavy", wdUnderlineDashLongHeavy);
    v.put("wdUnderlineWavyDouble", wdUnderlineWavyDouble);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
