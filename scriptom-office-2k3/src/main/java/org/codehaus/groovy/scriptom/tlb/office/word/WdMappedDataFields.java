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
package org.codehaus.groovy.scriptom.tlb.office.word;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class WdMappedDataFields
{
  private WdMappedDataFields()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdUniqueIdentifier = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdCourtesyTitle = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdFirstName = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdMiddleName = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdLastName = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdSuffix = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdNickname = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdJobTitle = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdCompany = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdAddress1 = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdAddress2 = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdCity = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdState = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdPostalCode = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wdCountryRegion = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdBusinessPhone = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdBusinessFax = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdHomePhone = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdHomeFax = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdEmailAddress = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wdWebPageURL = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdSpouseCourtesyTitle = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdSpouseFirstName = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdSpouseMiddleName = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdSpouseLastName = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wdSpouseNickname = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer wdRubyFirstName = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer wdRubyLastName = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer wdAddress3 = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer wdDepartment = Integer.valueOf(30);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdUniqueIdentifier", wdUniqueIdentifier);
    v.put("wdCourtesyTitle", wdCourtesyTitle);
    v.put("wdFirstName", wdFirstName);
    v.put("wdMiddleName", wdMiddleName);
    v.put("wdLastName", wdLastName);
    v.put("wdSuffix", wdSuffix);
    v.put("wdNickname", wdNickname);
    v.put("wdJobTitle", wdJobTitle);
    v.put("wdCompany", wdCompany);
    v.put("wdAddress1", wdAddress1);
    v.put("wdAddress2", wdAddress2);
    v.put("wdCity", wdCity);
    v.put("wdState", wdState);
    v.put("wdPostalCode", wdPostalCode);
    v.put("wdCountryRegion", wdCountryRegion);
    v.put("wdBusinessPhone", wdBusinessPhone);
    v.put("wdBusinessFax", wdBusinessFax);
    v.put("wdHomePhone", wdHomePhone);
    v.put("wdHomeFax", wdHomeFax);
    v.put("wdEmailAddress", wdEmailAddress);
    v.put("wdWebPageURL", wdWebPageURL);
    v.put("wdSpouseCourtesyTitle", wdSpouseCourtesyTitle);
    v.put("wdSpouseFirstName", wdSpouseFirstName);
    v.put("wdSpouseMiddleName", wdSpouseMiddleName);
    v.put("wdSpouseLastName", wdSpouseLastName);
    v.put("wdSpouseNickname", wdSpouseNickname);
    v.put("wdRubyFirstName", wdRubyFirstName);
    v.put("wdRubyLastName", wdRubyLastName);
    v.put("wdAddress3", wdAddress3);
    v.put("wdDepartment", wdDepartment);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
