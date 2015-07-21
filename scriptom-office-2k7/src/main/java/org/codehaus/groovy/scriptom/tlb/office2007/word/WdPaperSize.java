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
public final class WdPaperSize
{
  private WdPaperSize()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdPaper10x14 = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdPaper11x17 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdPaperLetter = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdPaperLetterSmall = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdPaperLegal = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdPaperExecutive = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdPaperA3 = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdPaperA4 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdPaperA4Small = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdPaperA5 = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdPaperB4 = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdPaperB5 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdPaperCSheet = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdPaperDSheet = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdPaperESheet = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wdPaperFanfoldLegalGerman = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdPaperFanfoldStdGerman = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdPaperFanfoldUS = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdPaperFolio = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdPaperLedger = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdPaperNote = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wdPaperQuarto = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdPaperStatement = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdPaperTabloid = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdPaperEnvelope9 = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdPaperEnvelope10 = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wdPaperEnvelope11 = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer wdPaperEnvelope12 = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer wdPaperEnvelope14 = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer wdPaperEnvelopeB4 = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer wdPaperEnvelopeB5 = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer wdPaperEnvelopeB6 = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer wdPaperEnvelopeC3 = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer wdPaperEnvelopeC4 = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdPaperEnvelopeC5 = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer wdPaperEnvelopeC6 = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer wdPaperEnvelopeC65 = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer wdPaperEnvelopeDL = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer wdPaperEnvelopeItaly = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer wdPaperEnvelopeMonarch = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer wdPaperEnvelopePersonal = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer wdPaperCustom = Integer.valueOf(41);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdPaper10x14", wdPaper10x14);
    v.put("wdPaper11x17", wdPaper11x17);
    v.put("wdPaperLetter", wdPaperLetter);
    v.put("wdPaperLetterSmall", wdPaperLetterSmall);
    v.put("wdPaperLegal", wdPaperLegal);
    v.put("wdPaperExecutive", wdPaperExecutive);
    v.put("wdPaperA3", wdPaperA3);
    v.put("wdPaperA4", wdPaperA4);
    v.put("wdPaperA4Small", wdPaperA4Small);
    v.put("wdPaperA5", wdPaperA5);
    v.put("wdPaperB4", wdPaperB4);
    v.put("wdPaperB5", wdPaperB5);
    v.put("wdPaperCSheet", wdPaperCSheet);
    v.put("wdPaperDSheet", wdPaperDSheet);
    v.put("wdPaperESheet", wdPaperESheet);
    v.put("wdPaperFanfoldLegalGerman", wdPaperFanfoldLegalGerman);
    v.put("wdPaperFanfoldStdGerman", wdPaperFanfoldStdGerman);
    v.put("wdPaperFanfoldUS", wdPaperFanfoldUS);
    v.put("wdPaperFolio", wdPaperFolio);
    v.put("wdPaperLedger", wdPaperLedger);
    v.put("wdPaperNote", wdPaperNote);
    v.put("wdPaperQuarto", wdPaperQuarto);
    v.put("wdPaperStatement", wdPaperStatement);
    v.put("wdPaperTabloid", wdPaperTabloid);
    v.put("wdPaperEnvelope9", wdPaperEnvelope9);
    v.put("wdPaperEnvelope10", wdPaperEnvelope10);
    v.put("wdPaperEnvelope11", wdPaperEnvelope11);
    v.put("wdPaperEnvelope12", wdPaperEnvelope12);
    v.put("wdPaperEnvelope14", wdPaperEnvelope14);
    v.put("wdPaperEnvelopeB4", wdPaperEnvelopeB4);
    v.put("wdPaperEnvelopeB5", wdPaperEnvelopeB5);
    v.put("wdPaperEnvelopeB6", wdPaperEnvelopeB6);
    v.put("wdPaperEnvelopeC3", wdPaperEnvelopeC3);
    v.put("wdPaperEnvelopeC4", wdPaperEnvelopeC4);
    v.put("wdPaperEnvelopeC5", wdPaperEnvelopeC5);
    v.put("wdPaperEnvelopeC6", wdPaperEnvelopeC6);
    v.put("wdPaperEnvelopeC65", wdPaperEnvelopeC65);
    v.put("wdPaperEnvelopeDL", wdPaperEnvelopeDL);
    v.put("wdPaperEnvelopeItaly", wdPaperEnvelopeItaly);
    v.put("wdPaperEnvelopeMonarch", wdPaperEnvelopeMonarch);
    v.put("wdPaperEnvelopePersonal", wdPaperEnvelopePersonal);
    v.put("wdPaperCustom", wdPaperCustom);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
