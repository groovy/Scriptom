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
public final class XlPasteType
{
  private XlPasteType()
  {
  }

  /**
   * Value is -4104 (0xFFFFEFF8)
   */
  public static final Integer xlPasteAll = Integer.valueOf(-4104);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlPasteAllUsingSourceTheme = Integer.valueOf(13);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlPasteAllExceptBorders = Integer.valueOf(7);

  /**
   * Value is -4122 (0xFFFFEFE6)
   */
  public static final Integer xlPasteFormats = Integer.valueOf(-4122);

  /**
   * Value is -4123 (0xFFFFEFE5)
   */
  public static final Integer xlPasteFormulas = Integer.valueOf(-4123);

  /**
   * Value is -4144 (0xFFFFEFD0)
   */
  public static final Integer xlPasteComments = Integer.valueOf(-4144);

  /**
   * Value is -4163 (0xFFFFEFBD)
   */
  public static final Integer xlPasteValues = Integer.valueOf(-4163);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlPasteColumnWidths = Integer.valueOf(8);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlPasteValidation = Integer.valueOf(6);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlPasteFormulasAndNumberFormats = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlPasteValuesAndNumberFormats = Integer.valueOf(12);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlPasteAll", xlPasteAll);
    v.put("xlPasteAllUsingSourceTheme", xlPasteAllUsingSourceTheme);
    v.put("xlPasteAllExceptBorders", xlPasteAllExceptBorders);
    v.put("xlPasteFormats", xlPasteFormats);
    v.put("xlPasteFormulas", xlPasteFormulas);
    v.put("xlPasteComments", xlPasteComments);
    v.put("xlPasteValues", xlPasteValues);
    v.put("xlPasteColumnWidths", xlPasteColumnWidths);
    v.put("xlPasteValidation", xlPasteValidation);
    v.put("xlPasteFormulasAndNumberFormats", xlPasteFormulasAndNumberFormats);
    v.put("xlPasteValuesAndNumberFormats", xlPasteValuesAndNumberFormats);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
