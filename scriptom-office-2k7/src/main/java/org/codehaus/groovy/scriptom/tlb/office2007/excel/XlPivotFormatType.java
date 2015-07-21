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
public final class XlPivotFormatType
{
  private XlPivotFormatType()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer xlReport1 = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlReport2 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlReport3 = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlReport4 = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlReport5 = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlReport6 = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlReport7 = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlReport8 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlReport9 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlReport10 = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer xlTable1 = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlTable2 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlTable3 = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlTable4 = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlTable5 = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlTable6 = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlTable7 = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlTable8 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer xlTable9 = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer xlTable10 = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer xlPTClassic = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer xlPTNone = Integer.valueOf(21);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlReport1", xlReport1);
    v.put("xlReport2", xlReport2);
    v.put("xlReport3", xlReport3);
    v.put("xlReport4", xlReport4);
    v.put("xlReport5", xlReport5);
    v.put("xlReport6", xlReport6);
    v.put("xlReport7", xlReport7);
    v.put("xlReport8", xlReport8);
    v.put("xlReport9", xlReport9);
    v.put("xlReport10", xlReport10);
    v.put("xlTable1", xlTable1);
    v.put("xlTable2", xlTable2);
    v.put("xlTable3", xlTable3);
    v.put("xlTable4", xlTable4);
    v.put("xlTable5", xlTable5);
    v.put("xlTable6", xlTable6);
    v.put("xlTable7", xlTable7);
    v.put("xlTable8", xlTable8);
    v.put("xlTable9", xlTable9);
    v.put("xlTable10", xlTable10);
    v.put("xlPTClassic", xlPTClassic);
    v.put("xlPTNone", xlPTNone);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
