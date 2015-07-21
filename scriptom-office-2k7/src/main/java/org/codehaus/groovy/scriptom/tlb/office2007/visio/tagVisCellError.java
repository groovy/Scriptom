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
package org.codehaus.groovy.scriptom.tlb.office2007.visio;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class tagVisCellError
{
  private tagVisCellError()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visErrorSuccess = Integer.valueOf(0);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer visErrorDivideByZero = Integer.valueOf(39);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer visErrorValue = Integer.valueOf(47);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer visErrorReference = Integer.valueOf(55);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer visErrorName = Integer.valueOf(61);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer visErrorNumber = Integer.valueOf(68);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer visErrorNotAvailable = Integer.valueOf(74);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visErrorSuccess", visErrorSuccess);
    v.put("visErrorDivideByZero", visErrorDivideByZero);
    v.put("visErrorValue", visErrorValue);
    v.put("visErrorReference", visErrorReference);
    v.put("visErrorName", visErrorName);
    v.put("visErrorNumber", visErrorNumber);
    v.put("visErrorNotAvailable", visErrorNotAvailable);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
