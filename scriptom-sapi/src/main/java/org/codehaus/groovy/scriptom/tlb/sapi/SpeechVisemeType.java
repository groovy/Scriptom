/*
 * Copyright 2007 (C) Guillaume Laforge. All Rights Reserved.
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
package org.codehaus.groovy.scriptom.tlb.sapi;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class SpeechVisemeType
{
  private SpeechVisemeType()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer SVP_0 = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer SVP_1 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer SVP_2 = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer SVP_3 = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer SVP_4 = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer SVP_5 = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer SVP_6 = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer SVP_7 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer SVP_8 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer SVP_9 = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer SVP_10 = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer SVP_11 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer SVP_12 = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer SVP_13 = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer SVP_14 = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer SVP_15 = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer SVP_16 = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer SVP_17 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer SVP_18 = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer SVP_19 = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer SVP_20 = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer SVP_21 = Integer.valueOf(21);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SVP_0", SVP_0);
    v.put("SVP_1", SVP_1);
    v.put("SVP_2", SVP_2);
    v.put("SVP_3", SVP_3);
    v.put("SVP_4", SVP_4);
    v.put("SVP_5", SVP_5);
    v.put("SVP_6", SVP_6);
    v.put("SVP_7", SVP_7);
    v.put("SVP_8", SVP_8);
    v.put("SVP_9", SVP_9);
    v.put("SVP_10", SVP_10);
    v.put("SVP_11", SVP_11);
    v.put("SVP_12", SVP_12);
    v.put("SVP_13", SVP_13);
    v.put("SVP_14", SVP_14);
    v.put("SVP_15", SVP_15);
    v.put("SVP_16", SVP_16);
    v.put("SVP_17", SVP_17);
    v.put("SVP_18", SVP_18);
    v.put("SVP_19", SVP_19);
    v.put("SVP_20", SVP_20);
    v.put("SVP_21", SVP_21);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
