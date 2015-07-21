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
public final class XlCellType
{
  private XlCellType()
  {
  }

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlCellTypeBlanks = Integer.valueOf(4);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlCellTypeConstants = Integer.valueOf(2);

  /**
   * Value is -4123 (0xFFFFEFE5)
   */
  public static final Integer xlCellTypeFormulas = Integer.valueOf(-4123);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlCellTypeLastCell = Integer.valueOf(11);

  /**
   * Value is -4144 (0xFFFFEFD0)
   */
  public static final Integer xlCellTypeComments = Integer.valueOf(-4144);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlCellTypeVisible = Integer.valueOf(12);

  /**
   * Value is -4172 (0xFFFFEFB4)
   */
  public static final Integer xlCellTypeAllFormatConditions = Integer.valueOf(-4172);

  /**
   * Value is -4173 (0xFFFFEFB3)
   */
  public static final Integer xlCellTypeSameFormatConditions = Integer.valueOf(-4173);

  /**
   * Value is -4174 (0xFFFFEFB2)
   */
  public static final Integer xlCellTypeAllValidation = Integer.valueOf(-4174);

  /**
   * Value is -4175 (0xFFFFEFB1)
   */
  public static final Integer xlCellTypeSameValidation = Integer.valueOf(-4175);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlCellTypeBlanks", xlCellTypeBlanks);
    v.put("xlCellTypeConstants", xlCellTypeConstants);
    v.put("xlCellTypeFormulas", xlCellTypeFormulas);
    v.put("xlCellTypeLastCell", xlCellTypeLastCell);
    v.put("xlCellTypeComments", xlCellTypeComments);
    v.put("xlCellTypeVisible", xlCellTypeVisible);
    v.put("xlCellTypeAllFormatConditions", xlCellTypeAllFormatConditions);
    v.put("xlCellTypeSameFormatConditions", xlCellTypeSameFormatConditions);
    v.put("xlCellTypeAllValidation", xlCellTypeAllValidation);
    v.put("xlCellTypeSameValidation", xlCellTypeSameValidation);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
