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
public final class AcControlType
{
  private AcControlType()
  {
  }

  /**
   * Value is 100 (0x64)
   */
  public static final Integer acLabel = Integer.valueOf(100);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer acRectangle = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer acLine = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer acImage = Integer.valueOf(103);

  /**
   * Value is 104 (0x68)
   */
  public static final Integer acCommandButton = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer acOptionButton = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer acCheckBox = Integer.valueOf(106);

  /**
   * Value is 107 (0x6B)
   */
  public static final Integer acOptionGroup = Integer.valueOf(107);

  /**
   * Value is 108 (0x6C)
   */
  public static final Integer acBoundObjectFrame = Integer.valueOf(108);

  /**
   * Value is 109 (0x6D)
   */
  public static final Integer acTextBox = Integer.valueOf(109);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer acListBox = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer acComboBox = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer acSubform = Integer.valueOf(112);

  /**
   * Value is 114 (0x72)
   */
  public static final Integer acObjectFrame = Integer.valueOf(114);

  /**
   * Value is 118 (0x76)
   */
  public static final Integer acPageBreak = Integer.valueOf(118);

  /**
   * Value is 119 (0x77)
   */
  public static final Integer acCustomControl = Integer.valueOf(119);

  /**
   * Value is 122 (0x7A)
   */
  public static final Integer acToggleButton = Integer.valueOf(122);

  /**
   * Value is 123 (0x7B)
   */
  public static final Integer acTabCtl = Integer.valueOf(123);

  /**
   * Value is 124 (0x7C)
   */
  public static final Integer acPage = Integer.valueOf(124);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("acLabel", acLabel);
    v.put("acRectangle", acRectangle);
    v.put("acLine", acLine);
    v.put("acImage", acImage);
    v.put("acCommandButton", acCommandButton);
    v.put("acOptionButton", acOptionButton);
    v.put("acCheckBox", acCheckBox);
    v.put("acOptionGroup", acOptionGroup);
    v.put("acBoundObjectFrame", acBoundObjectFrame);
    v.put("acTextBox", acTextBox);
    v.put("acListBox", acListBox);
    v.put("acComboBox", acComboBox);
    v.put("acSubform", acSubform);
    v.put("acObjectFrame", acObjectFrame);
    v.put("acPageBreak", acPageBreak);
    v.put("acCustomControl", acCustomControl);
    v.put("acToggleButton", acToggleButton);
    v.put("acTabCtl", acTabCtl);
    v.put("acPage", acPage);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
