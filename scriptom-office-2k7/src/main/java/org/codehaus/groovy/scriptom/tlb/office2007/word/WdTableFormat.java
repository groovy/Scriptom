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
public final class WdTableFormat
{
  private WdTableFormat()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdTableFormatNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdTableFormatSimple1 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdTableFormatSimple2 = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdTableFormatSimple3 = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdTableFormatClassic1 = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdTableFormatClassic2 = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdTableFormatClassic3 = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdTableFormatClassic4 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdTableFormatColorful1 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdTableFormatColorful2 = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdTableFormatColorful3 = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdTableFormatColumns1 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdTableFormatColumns2 = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdTableFormatColumns3 = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdTableFormatColumns4 = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wdTableFormatColumns5 = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdTableFormatGrid1 = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdTableFormatGrid2 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdTableFormatGrid3 = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdTableFormatGrid4 = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdTableFormatGrid5 = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wdTableFormatGrid6 = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdTableFormatGrid7 = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdTableFormatGrid8 = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdTableFormatList1 = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdTableFormatList2 = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wdTableFormatList3 = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer wdTableFormatList4 = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer wdTableFormatList5 = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer wdTableFormatList6 = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer wdTableFormatList7 = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer wdTableFormatList8 = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer wdTableFormat3DEffects1 = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer wdTableFormat3DEffects2 = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdTableFormat3DEffects3 = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer wdTableFormatContemporary = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer wdTableFormatElegant = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer wdTableFormatProfessional = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer wdTableFormatSubtle1 = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer wdTableFormatSubtle2 = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer wdTableFormatWeb1 = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer wdTableFormatWeb2 = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer wdTableFormatWeb3 = Integer.valueOf(42);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdTableFormatNone", wdTableFormatNone);
    v.put("wdTableFormatSimple1", wdTableFormatSimple1);
    v.put("wdTableFormatSimple2", wdTableFormatSimple2);
    v.put("wdTableFormatSimple3", wdTableFormatSimple3);
    v.put("wdTableFormatClassic1", wdTableFormatClassic1);
    v.put("wdTableFormatClassic2", wdTableFormatClassic2);
    v.put("wdTableFormatClassic3", wdTableFormatClassic3);
    v.put("wdTableFormatClassic4", wdTableFormatClassic4);
    v.put("wdTableFormatColorful1", wdTableFormatColorful1);
    v.put("wdTableFormatColorful2", wdTableFormatColorful2);
    v.put("wdTableFormatColorful3", wdTableFormatColorful3);
    v.put("wdTableFormatColumns1", wdTableFormatColumns1);
    v.put("wdTableFormatColumns2", wdTableFormatColumns2);
    v.put("wdTableFormatColumns3", wdTableFormatColumns3);
    v.put("wdTableFormatColumns4", wdTableFormatColumns4);
    v.put("wdTableFormatColumns5", wdTableFormatColumns5);
    v.put("wdTableFormatGrid1", wdTableFormatGrid1);
    v.put("wdTableFormatGrid2", wdTableFormatGrid2);
    v.put("wdTableFormatGrid3", wdTableFormatGrid3);
    v.put("wdTableFormatGrid4", wdTableFormatGrid4);
    v.put("wdTableFormatGrid5", wdTableFormatGrid5);
    v.put("wdTableFormatGrid6", wdTableFormatGrid6);
    v.put("wdTableFormatGrid7", wdTableFormatGrid7);
    v.put("wdTableFormatGrid8", wdTableFormatGrid8);
    v.put("wdTableFormatList1", wdTableFormatList1);
    v.put("wdTableFormatList2", wdTableFormatList2);
    v.put("wdTableFormatList3", wdTableFormatList3);
    v.put("wdTableFormatList4", wdTableFormatList4);
    v.put("wdTableFormatList5", wdTableFormatList5);
    v.put("wdTableFormatList6", wdTableFormatList6);
    v.put("wdTableFormatList7", wdTableFormatList7);
    v.put("wdTableFormatList8", wdTableFormatList8);
    v.put("wdTableFormat3DEffects1", wdTableFormat3DEffects1);
    v.put("wdTableFormat3DEffects2", wdTableFormat3DEffects2);
    v.put("wdTableFormat3DEffects3", wdTableFormat3DEffects3);
    v.put("wdTableFormatContemporary", wdTableFormatContemporary);
    v.put("wdTableFormatElegant", wdTableFormatElegant);
    v.put("wdTableFormatProfessional", wdTableFormatProfessional);
    v.put("wdTableFormatSubtle1", wdTableFormatSubtle1);
    v.put("wdTableFormatSubtle2", wdTableFormatSubtle2);
    v.put("wdTableFormatWeb1", wdTableFormatWeb1);
    v.put("wdTableFormatWeb2", wdTableFormatWeb2);
    v.put("wdTableFormatWeb3", wdTableFormatWeb3);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
