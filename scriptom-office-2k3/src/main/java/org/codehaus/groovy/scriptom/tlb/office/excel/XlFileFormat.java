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
public final class XlFileFormat
{
  private XlFileFormat()
  {
  }

  /**
   * Value is 18 (0x12)
   */
  public static final Integer xlAddIn = Integer.valueOf(18);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlCSV = Integer.valueOf(6);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer xlCSVMac = Integer.valueOf(22);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer xlCSVMSDOS = Integer.valueOf(24);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer xlCSVWindows = Integer.valueOf(23);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlDBF2 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlDBF3 = Integer.valueOf(8);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlDBF4 = Integer.valueOf(11);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlDIF = Integer.valueOf(9);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlExcel2 = Integer.valueOf(16);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer xlExcel2FarEast = Integer.valueOf(27);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer xlExcel3 = Integer.valueOf(29);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer xlExcel4 = Integer.valueOf(33);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer xlExcel5 = Integer.valueOf(39);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer xlExcel7 = Integer.valueOf(39);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer xlExcel9795 = Integer.valueOf(43);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer xlExcel4Workbook = Integer.valueOf(35);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer xlIntlAddIn = Integer.valueOf(26);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer xlIntlMacro = Integer.valueOf(25);

  /**
   * Value is -4143 (0xFFFFEFD1)
   */
  public static final Integer xlWorkbookNormal = Integer.valueOf(-4143);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlSYLK = Integer.valueOf(2);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlTemplate = Integer.valueOf(17);

  /**
   * Value is -4158 (0xFFFFEFC2)
   */
  public static final Integer xlCurrentPlatformText = Integer.valueOf(-4158);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer xlTextMac = Integer.valueOf(19);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer xlTextMSDOS = Integer.valueOf(21);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer xlTextPrinter = Integer.valueOf(36);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer xlTextWindows = Integer.valueOf(20);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlWJ2WD1 = Integer.valueOf(14);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlWK1 = Integer.valueOf(5);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer xlWK1ALL = Integer.valueOf(31);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer xlWK1FMT = Integer.valueOf(30);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlWK3 = Integer.valueOf(15);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer xlWK4 = Integer.valueOf(38);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer xlWK3FM3 = Integer.valueOf(32);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlWKS = Integer.valueOf(4);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer xlWorks2FarEast = Integer.valueOf(28);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer xlWQ1 = Integer.valueOf(34);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer xlWJ3 = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer xlWJ3FJ3 = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer xlUnicodeText = Integer.valueOf(42);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer xlHtml = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer xlWebArchive = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer xlXMLSpreadsheet = Integer.valueOf(46);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlAddIn", xlAddIn);
    v.put("xlCSV", xlCSV);
    v.put("xlCSVMac", xlCSVMac);
    v.put("xlCSVMSDOS", xlCSVMSDOS);
    v.put("xlCSVWindows", xlCSVWindows);
    v.put("xlDBF2", xlDBF2);
    v.put("xlDBF3", xlDBF3);
    v.put("xlDBF4", xlDBF4);
    v.put("xlDIF", xlDIF);
    v.put("xlExcel2", xlExcel2);
    v.put("xlExcel2FarEast", xlExcel2FarEast);
    v.put("xlExcel3", xlExcel3);
    v.put("xlExcel4", xlExcel4);
    v.put("xlExcel5", xlExcel5);
    v.put("xlExcel7", xlExcel7);
    v.put("xlExcel9795", xlExcel9795);
    v.put("xlExcel4Workbook", xlExcel4Workbook);
    v.put("xlIntlAddIn", xlIntlAddIn);
    v.put("xlIntlMacro", xlIntlMacro);
    v.put("xlWorkbookNormal", xlWorkbookNormal);
    v.put("xlSYLK", xlSYLK);
    v.put("xlTemplate", xlTemplate);
    v.put("xlCurrentPlatformText", xlCurrentPlatformText);
    v.put("xlTextMac", xlTextMac);
    v.put("xlTextMSDOS", xlTextMSDOS);
    v.put("xlTextPrinter", xlTextPrinter);
    v.put("xlTextWindows", xlTextWindows);
    v.put("xlWJ2WD1", xlWJ2WD1);
    v.put("xlWK1", xlWK1);
    v.put("xlWK1ALL", xlWK1ALL);
    v.put("xlWK1FMT", xlWK1FMT);
    v.put("xlWK3", xlWK3);
    v.put("xlWK4", xlWK4);
    v.put("xlWK3FM3", xlWK3FM3);
    v.put("xlWKS", xlWKS);
    v.put("xlWorks2FarEast", xlWorks2FarEast);
    v.put("xlWQ1", xlWQ1);
    v.put("xlWJ3", xlWJ3);
    v.put("xlWJ3FJ3", xlWJ3FJ3);
    v.put("xlUnicodeText", xlUnicodeText);
    v.put("xlHtml", xlHtml);
    v.put("xlWebArchive", xlWebArchive);
    v.put("xlXMLSpreadsheet", xlXMLSpreadsheet);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
