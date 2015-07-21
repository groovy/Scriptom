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
public final class WdShapePosition
{
  private WdShapePosition()
  {
  }

  /**
   * Value is -999999 (0xFFF0BDC1)
   */
  public static final Integer wdShapeTop = Integer.valueOf(-999999);

  /**
   * Value is -999998 (0xFFF0BDC2)
   */
  public static final Integer wdShapeLeft = Integer.valueOf(-999998);

  /**
   * Value is -999997 (0xFFF0BDC3)
   */
  public static final Integer wdShapeBottom = Integer.valueOf(-999997);

  /**
   * Value is -999996 (0xFFF0BDC4)
   */
  public static final Integer wdShapeRight = Integer.valueOf(-999996);

  /**
   * Value is -999995 (0xFFF0BDC5)
   */
  public static final Integer wdShapeCenter = Integer.valueOf(-999995);

  /**
   * Value is -999994 (0xFFF0BDC6)
   */
  public static final Integer wdShapeInside = Integer.valueOf(-999994);

  /**
   * Value is -999993 (0xFFF0BDC7)
   */
  public static final Integer wdShapeOutside = Integer.valueOf(-999993);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdShapeTop", wdShapeTop);
    v.put("wdShapeLeft", wdShapeLeft);
    v.put("wdShapeBottom", wdShapeBottom);
    v.put("wdShapeRight", wdShapeRight);
    v.put("wdShapeCenter", wdShapeCenter);
    v.put("wdShapeInside", wdShapeInside);
    v.put("wdShapeOutside", wdShapeOutside);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
