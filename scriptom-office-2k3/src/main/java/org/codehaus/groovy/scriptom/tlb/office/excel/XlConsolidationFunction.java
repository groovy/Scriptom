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
public final class XlConsolidationFunction
{
  private XlConsolidationFunction()
  {
  }

  /**
   * Value is -4106 (0xFFFFEFF6)
   */
  public static final Integer xlAverage = Integer.valueOf(-4106);

  /**
   * Value is -4112 (0xFFFFEFF0)
   */
  public static final Integer xlCount = Integer.valueOf(-4112);

  /**
   * Value is -4113 (0xFFFFEFEF)
   */
  public static final Integer xlCountNums = Integer.valueOf(-4113);

  /**
   * Value is -4136 (0xFFFFEFD8)
   */
  public static final Integer xlMax = Integer.valueOf(-4136);

  /**
   * Value is -4139 (0xFFFFEFD5)
   */
  public static final Integer xlMin = Integer.valueOf(-4139);

  /**
   * Value is -4149 (0xFFFFEFCB)
   */
  public static final Integer xlProduct = Integer.valueOf(-4149);

  /**
   * Value is -4155 (0xFFFFEFC5)
   */
  public static final Integer xlStDev = Integer.valueOf(-4155);

  /**
   * Value is -4156 (0xFFFFEFC4)
   */
  public static final Integer xlStDevP = Integer.valueOf(-4156);

  /**
   * Value is -4157 (0xFFFFEFC3)
   */
  public static final Integer xlSum = Integer.valueOf(-4157);

  /**
   * Value is -4164 (0xFFFFEFBC)
   */
  public static final Integer xlVar = Integer.valueOf(-4164);

  /**
   * Value is -4165 (0xFFFFEFBB)
   */
  public static final Integer xlVarP = Integer.valueOf(-4165);

  /**
   * Value is 1000 (0x3E8)
   */
  public static final Integer xlUnknown = Integer.valueOf(1000);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlAverage", xlAverage);
    v.put("xlCount", xlCount);
    v.put("xlCountNums", xlCountNums);
    v.put("xlMax", xlMax);
    v.put("xlMin", xlMin);
    v.put("xlProduct", xlProduct);
    v.put("xlStDev", xlStDev);
    v.put("xlStDevP", xlStDevP);
    v.put("xlSum", xlSum);
    v.put("xlVar", xlVar);
    v.put("xlVarP", xlVarP);
    v.put("xlUnknown", xlUnknown);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
