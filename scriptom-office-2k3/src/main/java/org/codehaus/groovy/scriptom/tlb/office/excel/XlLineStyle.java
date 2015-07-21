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
public final class XlLineStyle
{
  private XlLineStyle()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlContinuous = Integer.valueOf(1);

  /**
   * Value is -4115 (0xFFFFEFED)
   */
  public static final Integer xlDash = Integer.valueOf(-4115);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlDashDot = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlDashDotDot = Integer.valueOf(5);

  /**
   * Value is -4118 (0xFFFFEFEA)
   */
  public static final Integer xlDot = Integer.valueOf(-4118);

  /**
   * Value is -4119 (0xFFFFEFE9)
   */
  public static final Integer xlDouble = Integer.valueOf(-4119);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlSlantDashDot = Integer.valueOf(13);

  /**
   * Value is -4142 (0xFFFFEFD2)
   */
  public static final Integer xlLineStyleNone = Integer.valueOf(-4142);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlContinuous", xlContinuous);
    v.put("xlDash", xlDash);
    v.put("xlDashDot", xlDashDot);
    v.put("xlDashDotDot", xlDashDotDot);
    v.put("xlDot", xlDot);
    v.put("xlDouble", xlDouble);
    v.put("xlSlantDashDot", xlSlantDashDot);
    v.put("xlLineStyleNone", xlLineStyleNone);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
