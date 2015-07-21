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
package org.codehaus.groovy.scriptom.tlb.office2007;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class MsoWarpFormat
{
  private MsoWarpFormat()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer msoWarpFormatMixed = Integer.valueOf(-2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer msoWarpFormat1 = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoWarpFormat2 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoWarpFormat3 = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoWarpFormat4 = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoWarpFormat5 = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoWarpFormat6 = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoWarpFormat7 = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoWarpFormat8 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoWarpFormat9 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoWarpFormat10 = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoWarpFormat11 = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoWarpFormat12 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoWarpFormat13 = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoWarpFormat14 = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoWarpFormat15 = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoWarpFormat16 = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoWarpFormat17 = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoWarpFormat18 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoWarpFormat19 = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoWarpFormat20 = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoWarpFormat21 = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoWarpFormat22 = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoWarpFormat23 = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoWarpFormat24 = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoWarpFormat25 = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoWarpFormat26 = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoWarpFormat27 = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer msoWarpFormat28 = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer msoWarpFormat29 = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer msoWarpFormat30 = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer msoWarpFormat31 = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer msoWarpFormat32 = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer msoWarpFormat33 = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer msoWarpFormat34 = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer msoWarpFormat35 = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer msoWarpFormat36 = Integer.valueOf(35);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoWarpFormatMixed", msoWarpFormatMixed);
    v.put("msoWarpFormat1", msoWarpFormat1);
    v.put("msoWarpFormat2", msoWarpFormat2);
    v.put("msoWarpFormat3", msoWarpFormat3);
    v.put("msoWarpFormat4", msoWarpFormat4);
    v.put("msoWarpFormat5", msoWarpFormat5);
    v.put("msoWarpFormat6", msoWarpFormat6);
    v.put("msoWarpFormat7", msoWarpFormat7);
    v.put("msoWarpFormat8", msoWarpFormat8);
    v.put("msoWarpFormat9", msoWarpFormat9);
    v.put("msoWarpFormat10", msoWarpFormat10);
    v.put("msoWarpFormat11", msoWarpFormat11);
    v.put("msoWarpFormat12", msoWarpFormat12);
    v.put("msoWarpFormat13", msoWarpFormat13);
    v.put("msoWarpFormat14", msoWarpFormat14);
    v.put("msoWarpFormat15", msoWarpFormat15);
    v.put("msoWarpFormat16", msoWarpFormat16);
    v.put("msoWarpFormat17", msoWarpFormat17);
    v.put("msoWarpFormat18", msoWarpFormat18);
    v.put("msoWarpFormat19", msoWarpFormat19);
    v.put("msoWarpFormat20", msoWarpFormat20);
    v.put("msoWarpFormat21", msoWarpFormat21);
    v.put("msoWarpFormat22", msoWarpFormat22);
    v.put("msoWarpFormat23", msoWarpFormat23);
    v.put("msoWarpFormat24", msoWarpFormat24);
    v.put("msoWarpFormat25", msoWarpFormat25);
    v.put("msoWarpFormat26", msoWarpFormat26);
    v.put("msoWarpFormat27", msoWarpFormat27);
    v.put("msoWarpFormat28", msoWarpFormat28);
    v.put("msoWarpFormat29", msoWarpFormat29);
    v.put("msoWarpFormat30", msoWarpFormat30);
    v.put("msoWarpFormat31", msoWarpFormat31);
    v.put("msoWarpFormat32", msoWarpFormat32);
    v.put("msoWarpFormat33", msoWarpFormat33);
    v.put("msoWarpFormat34", msoWarpFormat34);
    v.put("msoWarpFormat35", msoWarpFormat35);
    v.put("msoWarpFormat36", msoWarpFormat36);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
