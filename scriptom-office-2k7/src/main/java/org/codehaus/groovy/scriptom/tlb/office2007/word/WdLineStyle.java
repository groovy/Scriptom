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
public final class WdLineStyle
{
  private WdLineStyle()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdLineStyleNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdLineStyleSingle = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdLineStyleDot = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdLineStyleDashSmallGap = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdLineStyleDashLargeGap = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdLineStyleDashDot = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdLineStyleDashDotDot = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdLineStyleDouble = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdLineStyleTriple = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdLineStyleThinThickSmallGap = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdLineStyleThickThinSmallGap = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdLineStyleThinThickThinSmallGap = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdLineStyleThinThickMedGap = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdLineStyleThickThinMedGap = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdLineStyleThinThickThinMedGap = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wdLineStyleThinThickLargeGap = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdLineStyleThickThinLargeGap = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdLineStyleThinThickThinLargeGap = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdLineStyleSingleWavy = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdLineStyleDoubleWavy = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdLineStyleDashDotStroked = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wdLineStyleEmboss3D = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdLineStyleEngrave3D = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdLineStyleOutset = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdLineStyleInset = Integer.valueOf(24);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdLineStyleNone", wdLineStyleNone);
    v.put("wdLineStyleSingle", wdLineStyleSingle);
    v.put("wdLineStyleDot", wdLineStyleDot);
    v.put("wdLineStyleDashSmallGap", wdLineStyleDashSmallGap);
    v.put("wdLineStyleDashLargeGap", wdLineStyleDashLargeGap);
    v.put("wdLineStyleDashDot", wdLineStyleDashDot);
    v.put("wdLineStyleDashDotDot", wdLineStyleDashDotDot);
    v.put("wdLineStyleDouble", wdLineStyleDouble);
    v.put("wdLineStyleTriple", wdLineStyleTriple);
    v.put("wdLineStyleThinThickSmallGap", wdLineStyleThinThickSmallGap);
    v.put("wdLineStyleThickThinSmallGap", wdLineStyleThickThinSmallGap);
    v.put("wdLineStyleThinThickThinSmallGap", wdLineStyleThinThickThinSmallGap);
    v.put("wdLineStyleThinThickMedGap", wdLineStyleThinThickMedGap);
    v.put("wdLineStyleThickThinMedGap", wdLineStyleThickThinMedGap);
    v.put("wdLineStyleThinThickThinMedGap", wdLineStyleThinThickThinMedGap);
    v.put("wdLineStyleThinThickLargeGap", wdLineStyleThinThickLargeGap);
    v.put("wdLineStyleThickThinLargeGap", wdLineStyleThickThinLargeGap);
    v.put("wdLineStyleThinThickThinLargeGap", wdLineStyleThinThickThinLargeGap);
    v.put("wdLineStyleSingleWavy", wdLineStyleSingleWavy);
    v.put("wdLineStyleDoubleWavy", wdLineStyleDoubleWavy);
    v.put("wdLineStyleDashDotStroked", wdLineStyleDashDotStroked);
    v.put("wdLineStyleEmboss3D", wdLineStyleEmboss3D);
    v.put("wdLineStyleEngrave3D", wdLineStyleEngrave3D);
    v.put("wdLineStyleOutset", wdLineStyleOutset);
    v.put("wdLineStyleInset", wdLineStyleInset);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
