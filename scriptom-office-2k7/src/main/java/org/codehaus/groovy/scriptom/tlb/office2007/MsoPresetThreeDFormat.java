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
public final class MsoPresetThreeDFormat
{
  private MsoPresetThreeDFormat()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer msoPresetThreeDFormatMixed = Integer.valueOf(-2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoThreeD1 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoThreeD2 = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoThreeD3 = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoThreeD4 = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoThreeD5 = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoThreeD6 = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoThreeD7 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoThreeD8 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoThreeD9 = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoThreeD10 = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoThreeD11 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoThreeD12 = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoThreeD13 = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoThreeD14 = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoThreeD15 = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoThreeD16 = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoThreeD17 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoThreeD18 = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoThreeD19 = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoThreeD20 = Integer.valueOf(20);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoPresetThreeDFormatMixed", msoPresetThreeDFormatMixed);
    v.put("msoThreeD1", msoThreeD1);
    v.put("msoThreeD2", msoThreeD2);
    v.put("msoThreeD3", msoThreeD3);
    v.put("msoThreeD4", msoThreeD4);
    v.put("msoThreeD5", msoThreeD5);
    v.put("msoThreeD6", msoThreeD6);
    v.put("msoThreeD7", msoThreeD7);
    v.put("msoThreeD8", msoThreeD8);
    v.put("msoThreeD9", msoThreeD9);
    v.put("msoThreeD10", msoThreeD10);
    v.put("msoThreeD11", msoThreeD11);
    v.put("msoThreeD12", msoThreeD12);
    v.put("msoThreeD13", msoThreeD13);
    v.put("msoThreeD14", msoThreeD14);
    v.put("msoThreeD15", msoThreeD15);
    v.put("msoThreeD16", msoThreeD16);
    v.put("msoThreeD17", msoThreeD17);
    v.put("msoThreeD18", msoThreeD18);
    v.put("msoThreeD19", msoThreeD19);
    v.put("msoThreeD20", msoThreeD20);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
