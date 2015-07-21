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
package org.codehaus.groovy.scriptom.tlb.office.access;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class AcPrintPaperSize
{
  private AcPrintPaperSize()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer acPRPSLetter = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer acPRPSLetterSmall = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer acPRPSTabloid = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer acPRPSLedger = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer acPRPSLegal = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer acPRPSStatement = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer acPRPSExecutive = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer acPRPSA3 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer acPRPSA4 = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer acPRPSA4Small = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer acPRPSA5 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer acPRPSB4 = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer acPRPSB5 = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer acPRPSFolio = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer acPRPSQuarto = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer acPRPS10x14 = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer acPRPS11x17 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer acPRPSNote = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer acPRPSEnv9 = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer acPRPSEnv10 = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer acPRPSEnv11 = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer acPRPSEnv12 = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer acPRPSEnv14 = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer acPRPSCSheet = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer acPRPSDSheet = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer acPRPSESheet = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer acPRPSEnvDL = Integer.valueOf(27);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer acPRPSEnvC3 = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer acPRPSEnvC4 = Integer.valueOf(30);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer acPRPSEnvC5 = Integer.valueOf(28);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer acPRPSEnvC6 = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer acPRPSEnvC65 = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer acPRPSEnvB4 = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer acPRPSEnvB5 = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer acPRPSEnvB6 = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer acPRPSEnvItaly = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer acPRPSEnvMonarch = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer acPRPSEnvPersonal = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer acPRPSFanfoldUS = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer acPRPSFanfoldStdGerman = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer acPRPSFanfoldLglGerman = Integer.valueOf(41);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer acPRPSUser = Integer.valueOf(256);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("acPRPSLetter", acPRPSLetter);
    v.put("acPRPSLetterSmall", acPRPSLetterSmall);
    v.put("acPRPSTabloid", acPRPSTabloid);
    v.put("acPRPSLedger", acPRPSLedger);
    v.put("acPRPSLegal", acPRPSLegal);
    v.put("acPRPSStatement", acPRPSStatement);
    v.put("acPRPSExecutive", acPRPSExecutive);
    v.put("acPRPSA3", acPRPSA3);
    v.put("acPRPSA4", acPRPSA4);
    v.put("acPRPSA4Small", acPRPSA4Small);
    v.put("acPRPSA5", acPRPSA5);
    v.put("acPRPSB4", acPRPSB4);
    v.put("acPRPSB5", acPRPSB5);
    v.put("acPRPSFolio", acPRPSFolio);
    v.put("acPRPSQuarto", acPRPSQuarto);
    v.put("acPRPS10x14", acPRPS10x14);
    v.put("acPRPS11x17", acPRPS11x17);
    v.put("acPRPSNote", acPRPSNote);
    v.put("acPRPSEnv9", acPRPSEnv9);
    v.put("acPRPSEnv10", acPRPSEnv10);
    v.put("acPRPSEnv11", acPRPSEnv11);
    v.put("acPRPSEnv12", acPRPSEnv12);
    v.put("acPRPSEnv14", acPRPSEnv14);
    v.put("acPRPSCSheet", acPRPSCSheet);
    v.put("acPRPSDSheet", acPRPSDSheet);
    v.put("acPRPSESheet", acPRPSESheet);
    v.put("acPRPSEnvDL", acPRPSEnvDL);
    v.put("acPRPSEnvC3", acPRPSEnvC3);
    v.put("acPRPSEnvC4", acPRPSEnvC4);
    v.put("acPRPSEnvC5", acPRPSEnvC5);
    v.put("acPRPSEnvC6", acPRPSEnvC6);
    v.put("acPRPSEnvC65", acPRPSEnvC65);
    v.put("acPRPSEnvB4", acPRPSEnvB4);
    v.put("acPRPSEnvB5", acPRPSEnvB5);
    v.put("acPRPSEnvB6", acPRPSEnvB6);
    v.put("acPRPSEnvItaly", acPRPSEnvItaly);
    v.put("acPRPSEnvMonarch", acPRPSEnvMonarch);
    v.put("acPRPSEnvPersonal", acPRPSEnvPersonal);
    v.put("acPRPSFanfoldUS", acPRPSFanfoldUS);
    v.put("acPRPSFanfoldStdGerman", acPRPSFanfoldStdGerman);
    v.put("acPRPSFanfoldLglGerman", acPRPSFanfoldLglGerman);
    v.put("acPRPSUser", acPRPSUser);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
