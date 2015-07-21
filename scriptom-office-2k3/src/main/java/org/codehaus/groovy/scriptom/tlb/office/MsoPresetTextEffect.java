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
package org.codehaus.groovy.scriptom.tlb.office;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class MsoPresetTextEffect
{
  private MsoPresetTextEffect()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer msoTextEffectMixed = Integer.valueOf(-2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer msoTextEffect1 = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoTextEffect2 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoTextEffect3 = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoTextEffect4 = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoTextEffect5 = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoTextEffect6 = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoTextEffect7 = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoTextEffect8 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoTextEffect9 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoTextEffect10 = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoTextEffect11 = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoTextEffect12 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoTextEffect13 = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoTextEffect14 = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoTextEffect15 = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoTextEffect16 = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoTextEffect17 = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoTextEffect18 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoTextEffect19 = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoTextEffect20 = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoTextEffect21 = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoTextEffect22 = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoTextEffect23 = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoTextEffect24 = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoTextEffect25 = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoTextEffect26 = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoTextEffect27 = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer msoTextEffect28 = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer msoTextEffect29 = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer msoTextEffect30 = Integer.valueOf(29);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoTextEffectMixed", msoTextEffectMixed);
    v.put("msoTextEffect1", msoTextEffect1);
    v.put("msoTextEffect2", msoTextEffect2);
    v.put("msoTextEffect3", msoTextEffect3);
    v.put("msoTextEffect4", msoTextEffect4);
    v.put("msoTextEffect5", msoTextEffect5);
    v.put("msoTextEffect6", msoTextEffect6);
    v.put("msoTextEffect7", msoTextEffect7);
    v.put("msoTextEffect8", msoTextEffect8);
    v.put("msoTextEffect9", msoTextEffect9);
    v.put("msoTextEffect10", msoTextEffect10);
    v.put("msoTextEffect11", msoTextEffect11);
    v.put("msoTextEffect12", msoTextEffect12);
    v.put("msoTextEffect13", msoTextEffect13);
    v.put("msoTextEffect14", msoTextEffect14);
    v.put("msoTextEffect15", msoTextEffect15);
    v.put("msoTextEffect16", msoTextEffect16);
    v.put("msoTextEffect17", msoTextEffect17);
    v.put("msoTextEffect18", msoTextEffect18);
    v.put("msoTextEffect19", msoTextEffect19);
    v.put("msoTextEffect20", msoTextEffect20);
    v.put("msoTextEffect21", msoTextEffect21);
    v.put("msoTextEffect22", msoTextEffect22);
    v.put("msoTextEffect23", msoTextEffect23);
    v.put("msoTextEffect24", msoTextEffect24);
    v.put("msoTextEffect25", msoTextEffect25);
    v.put("msoTextEffect26", msoTextEffect26);
    v.put("msoTextEffect27", msoTextEffect27);
    v.put("msoTextEffect28", msoTextEffect28);
    v.put("msoTextEffect29", msoTextEffect29);
    v.put("msoTextEffect30", msoTextEffect30);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
