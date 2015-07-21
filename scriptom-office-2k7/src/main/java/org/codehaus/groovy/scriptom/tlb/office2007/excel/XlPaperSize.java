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
public final class XlPaperSize
{
  private XlPaperSize()
  {
  }

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlPaper10x14 = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlPaper11x17 = Integer.valueOf(17);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlPaperA3 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlPaperA4 = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer xlPaperA4Small = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlPaperA5 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlPaperB4 = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlPaperB5 = Integer.valueOf(13);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer xlPaperCsheet = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer xlPaperDsheet = Integer.valueOf(25);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer xlPaperEnvelope10 = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer xlPaperEnvelope11 = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer xlPaperEnvelope12 = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer xlPaperEnvelope14 = Integer.valueOf(23);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer xlPaperEnvelope9 = Integer.valueOf(19);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer xlPaperEnvelopeB4 = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer xlPaperEnvelopeB5 = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer xlPaperEnvelopeB6 = Integer.valueOf(35);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer xlPaperEnvelopeC3 = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer xlPaperEnvelopeC4 = Integer.valueOf(30);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer xlPaperEnvelopeC5 = Integer.valueOf(28);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer xlPaperEnvelopeC6 = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer xlPaperEnvelopeC65 = Integer.valueOf(32);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer xlPaperEnvelopeDL = Integer.valueOf(27);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer xlPaperEnvelopeItaly = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer xlPaperEnvelopeMonarch = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer xlPaperEnvelopePersonal = Integer.valueOf(38);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer xlPaperEsheet = Integer.valueOf(26);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlPaperExecutive = Integer.valueOf(7);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer xlPaperFanfoldLegalGerman = Integer.valueOf(41);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer xlPaperFanfoldStdGerman = Integer.valueOf(40);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer xlPaperFanfoldUS = Integer.valueOf(39);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlPaperFolio = Integer.valueOf(14);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlPaperLedger = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlPaperLegal = Integer.valueOf(5);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlPaperLetter = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlPaperLetterSmall = Integer.valueOf(2);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer xlPaperNote = Integer.valueOf(18);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlPaperQuarto = Integer.valueOf(15);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlPaperStatement = Integer.valueOf(6);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlPaperTabloid = Integer.valueOf(3);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer xlPaperUser = Integer.valueOf(256);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlPaper10x14", xlPaper10x14);
    v.put("xlPaper11x17", xlPaper11x17);
    v.put("xlPaperA3", xlPaperA3);
    v.put("xlPaperA4", xlPaperA4);
    v.put("xlPaperA4Small", xlPaperA4Small);
    v.put("xlPaperA5", xlPaperA5);
    v.put("xlPaperB4", xlPaperB4);
    v.put("xlPaperB5", xlPaperB5);
    v.put("xlPaperCsheet", xlPaperCsheet);
    v.put("xlPaperDsheet", xlPaperDsheet);
    v.put("xlPaperEnvelope10", xlPaperEnvelope10);
    v.put("xlPaperEnvelope11", xlPaperEnvelope11);
    v.put("xlPaperEnvelope12", xlPaperEnvelope12);
    v.put("xlPaperEnvelope14", xlPaperEnvelope14);
    v.put("xlPaperEnvelope9", xlPaperEnvelope9);
    v.put("xlPaperEnvelopeB4", xlPaperEnvelopeB4);
    v.put("xlPaperEnvelopeB5", xlPaperEnvelopeB5);
    v.put("xlPaperEnvelopeB6", xlPaperEnvelopeB6);
    v.put("xlPaperEnvelopeC3", xlPaperEnvelopeC3);
    v.put("xlPaperEnvelopeC4", xlPaperEnvelopeC4);
    v.put("xlPaperEnvelopeC5", xlPaperEnvelopeC5);
    v.put("xlPaperEnvelopeC6", xlPaperEnvelopeC6);
    v.put("xlPaperEnvelopeC65", xlPaperEnvelopeC65);
    v.put("xlPaperEnvelopeDL", xlPaperEnvelopeDL);
    v.put("xlPaperEnvelopeItaly", xlPaperEnvelopeItaly);
    v.put("xlPaperEnvelopeMonarch", xlPaperEnvelopeMonarch);
    v.put("xlPaperEnvelopePersonal", xlPaperEnvelopePersonal);
    v.put("xlPaperEsheet", xlPaperEsheet);
    v.put("xlPaperExecutive", xlPaperExecutive);
    v.put("xlPaperFanfoldLegalGerman", xlPaperFanfoldLegalGerman);
    v.put("xlPaperFanfoldStdGerman", xlPaperFanfoldStdGerman);
    v.put("xlPaperFanfoldUS", xlPaperFanfoldUS);
    v.put("xlPaperFolio", xlPaperFolio);
    v.put("xlPaperLedger", xlPaperLedger);
    v.put("xlPaperLegal", xlPaperLegal);
    v.put("xlPaperLetter", xlPaperLetter);
    v.put("xlPaperLetterSmall", xlPaperLetterSmall);
    v.put("xlPaperNote", xlPaperNote);
    v.put("xlPaperQuarto", xlPaperQuarto);
    v.put("xlPaperStatement", xlPaperStatement);
    v.put("xlPaperTabloid", xlPaperTabloid);
    v.put("xlPaperUser", xlPaperUser);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
