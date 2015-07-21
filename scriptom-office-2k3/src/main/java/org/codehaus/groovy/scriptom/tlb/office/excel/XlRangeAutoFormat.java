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
package org.codehaus.groovy.scriptom.tlb.office.excel;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class XlRangeAutoFormat
{
  private XlRangeAutoFormat()
  {
  }

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlRangeAutoFormat3DEffects1 = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlRangeAutoFormat3DEffects2 = Integer.valueOf(14);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlRangeAutoFormatAccounting1 = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlRangeAutoFormatAccounting2 = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlRangeAutoFormatAccounting3 = Integer.valueOf(6);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlRangeAutoFormatAccounting4 = Integer.valueOf(17);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlRangeAutoFormatClassic1 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlRangeAutoFormatClassic2 = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlRangeAutoFormatClassic3 = Integer.valueOf(3);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlRangeAutoFormatColor1 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlRangeAutoFormatColor2 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlRangeAutoFormatColor3 = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer xlRangeAutoFormatList1 = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlRangeAutoFormatList2 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlRangeAutoFormatList3 = Integer.valueOf(12);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlRangeAutoFormatLocalFormat1 = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlRangeAutoFormatLocalFormat2 = Integer.valueOf(16);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer xlRangeAutoFormatLocalFormat3 = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer xlRangeAutoFormatLocalFormat4 = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer xlRangeAutoFormatReport1 = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer xlRangeAutoFormatReport2 = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer xlRangeAutoFormatReport3 = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer xlRangeAutoFormatReport4 = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer xlRangeAutoFormatReport5 = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer xlRangeAutoFormatReport6 = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer xlRangeAutoFormatReport7 = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer xlRangeAutoFormatReport8 = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer xlRangeAutoFormatReport9 = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer xlRangeAutoFormatReport10 = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer xlRangeAutoFormatClassicPivotTable = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer xlRangeAutoFormatTable1 = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer xlRangeAutoFormatTable2 = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer xlRangeAutoFormatTable3 = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer xlRangeAutoFormatTable4 = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer xlRangeAutoFormatTable5 = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer xlRangeAutoFormatTable6 = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer xlRangeAutoFormatTable7 = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer xlRangeAutoFormatTable8 = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer xlRangeAutoFormatTable9 = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer xlRangeAutoFormatTable10 = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer xlRangeAutoFormatPTNone = Integer.valueOf(42);

  /**
   * Value is -4142 (0xFFFFEFD2)
   */
  public static final Integer xlRangeAutoFormatNone = Integer.valueOf(-4142);

  /**
   * Value is -4154 (0xFFFFEFC6)
   */
  public static final Integer xlRangeAutoFormatSimple = Integer.valueOf(-4154);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlRangeAutoFormat3DEffects1", xlRangeAutoFormat3DEffects1);
    v.put("xlRangeAutoFormat3DEffects2", xlRangeAutoFormat3DEffects2);
    v.put("xlRangeAutoFormatAccounting1", xlRangeAutoFormatAccounting1);
    v.put("xlRangeAutoFormatAccounting2", xlRangeAutoFormatAccounting2);
    v.put("xlRangeAutoFormatAccounting3", xlRangeAutoFormatAccounting3);
    v.put("xlRangeAutoFormatAccounting4", xlRangeAutoFormatAccounting4);
    v.put("xlRangeAutoFormatClassic1", xlRangeAutoFormatClassic1);
    v.put("xlRangeAutoFormatClassic2", xlRangeAutoFormatClassic2);
    v.put("xlRangeAutoFormatClassic3", xlRangeAutoFormatClassic3);
    v.put("xlRangeAutoFormatColor1", xlRangeAutoFormatColor1);
    v.put("xlRangeAutoFormatColor2", xlRangeAutoFormatColor2);
    v.put("xlRangeAutoFormatColor3", xlRangeAutoFormatColor3);
    v.put("xlRangeAutoFormatList1", xlRangeAutoFormatList1);
    v.put("xlRangeAutoFormatList2", xlRangeAutoFormatList2);
    v.put("xlRangeAutoFormatList3", xlRangeAutoFormatList3);
    v.put("xlRangeAutoFormatLocalFormat1", xlRangeAutoFormatLocalFormat1);
    v.put("xlRangeAutoFormatLocalFormat2", xlRangeAutoFormatLocalFormat2);
    v.put("xlRangeAutoFormatLocalFormat3", xlRangeAutoFormatLocalFormat3);
    v.put("xlRangeAutoFormatLocalFormat4", xlRangeAutoFormatLocalFormat4);
    v.put("xlRangeAutoFormatReport1", xlRangeAutoFormatReport1);
    v.put("xlRangeAutoFormatReport2", xlRangeAutoFormatReport2);
    v.put("xlRangeAutoFormatReport3", xlRangeAutoFormatReport3);
    v.put("xlRangeAutoFormatReport4", xlRangeAutoFormatReport4);
    v.put("xlRangeAutoFormatReport5", xlRangeAutoFormatReport5);
    v.put("xlRangeAutoFormatReport6", xlRangeAutoFormatReport6);
    v.put("xlRangeAutoFormatReport7", xlRangeAutoFormatReport7);
    v.put("xlRangeAutoFormatReport8", xlRangeAutoFormatReport8);
    v.put("xlRangeAutoFormatReport9", xlRangeAutoFormatReport9);
    v.put("xlRangeAutoFormatReport10", xlRangeAutoFormatReport10);
    v.put("xlRangeAutoFormatClassicPivotTable", xlRangeAutoFormatClassicPivotTable);
    v.put("xlRangeAutoFormatTable1", xlRangeAutoFormatTable1);
    v.put("xlRangeAutoFormatTable2", xlRangeAutoFormatTable2);
    v.put("xlRangeAutoFormatTable3", xlRangeAutoFormatTable3);
    v.put("xlRangeAutoFormatTable4", xlRangeAutoFormatTable4);
    v.put("xlRangeAutoFormatTable5", xlRangeAutoFormatTable5);
    v.put("xlRangeAutoFormatTable6", xlRangeAutoFormatTable6);
    v.put("xlRangeAutoFormatTable7", xlRangeAutoFormatTable7);
    v.put("xlRangeAutoFormatTable8", xlRangeAutoFormatTable8);
    v.put("xlRangeAutoFormatTable9", xlRangeAutoFormatTable9);
    v.put("xlRangeAutoFormatTable10", xlRangeAutoFormatTable10);
    v.put("xlRangeAutoFormatPTNone", xlRangeAutoFormatPTNone);
    v.put("xlRangeAutoFormatNone", xlRangeAutoFormatNone);
    v.put("xlRangeAutoFormatSimple", xlRangeAutoFormatSimple);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
