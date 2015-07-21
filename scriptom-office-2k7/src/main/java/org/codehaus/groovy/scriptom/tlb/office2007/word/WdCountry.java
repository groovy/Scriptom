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
public final class WdCountry
{
  private WdCountry()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdUS = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdCanada = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdLatinAmerica = Integer.valueOf(3);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer wdNetherlands = Integer.valueOf(31);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer wdFrance = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdSpain = Integer.valueOf(34);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer wdItaly = Integer.valueOf(39);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer wdUK = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer wdDenmark = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer wdSweden = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer wdNorway = Integer.valueOf(47);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer wdGermany = Integer.valueOf(49);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer wdPeru = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer wdMexico = Integer.valueOf(52);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer wdArgentina = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer wdBrazil = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer wdChile = Integer.valueOf(56);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer wdVenezuela = Integer.valueOf(58);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer wdJapan = Integer.valueOf(81);

  /**
   * Value is 886 (0x376)
   */
  public static final Integer wdTaiwan = Integer.valueOf(886);

  /**
   * Value is 86 (0x56)
   */
  public static final Integer wdChina = Integer.valueOf(86);

  /**
   * Value is 82 (0x52)
   */
  public static final Integer wdKorea = Integer.valueOf(82);

  /**
   * Value is 358 (0x166)
   */
  public static final Integer wdFinland = Integer.valueOf(358);

  /**
   * Value is 354 (0x162)
   */
  public static final Integer wdIceland = Integer.valueOf(354);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdUS", wdUS);
    v.put("wdCanada", wdCanada);
    v.put("wdLatinAmerica", wdLatinAmerica);
    v.put("wdNetherlands", wdNetherlands);
    v.put("wdFrance", wdFrance);
    v.put("wdSpain", wdSpain);
    v.put("wdItaly", wdItaly);
    v.put("wdUK", wdUK);
    v.put("wdDenmark", wdDenmark);
    v.put("wdSweden", wdSweden);
    v.put("wdNorway", wdNorway);
    v.put("wdGermany", wdGermany);
    v.put("wdPeru", wdPeru);
    v.put("wdMexico", wdMexico);
    v.put("wdArgentina", wdArgentina);
    v.put("wdBrazil", wdBrazil);
    v.put("wdChile", wdChile);
    v.put("wdVenezuela", wdVenezuela);
    v.put("wdJapan", wdJapan);
    v.put("wdTaiwan", wdTaiwan);
    v.put("wdChina", wdChina);
    v.put("wdKorea", wdKorea);
    v.put("wdFinland", wdFinland);
    v.put("wdIceland", wdIceland);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
