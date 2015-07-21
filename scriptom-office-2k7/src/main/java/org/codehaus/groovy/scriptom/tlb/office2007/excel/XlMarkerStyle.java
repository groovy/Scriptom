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
public final class XlMarkerStyle
{
  private XlMarkerStyle()
  {
  }

  /**
   * Value is -4105 (0xFFFFEFF7)
   */
  public static final Integer xlMarkerStyleAutomatic = Integer.valueOf(-4105);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlMarkerStyleCircle = Integer.valueOf(8);

  /**
   * Value is -4115 (0xFFFFEFED)
   */
  public static final Integer xlMarkerStyleDash = Integer.valueOf(-4115);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlMarkerStyleDiamond = Integer.valueOf(2);

  /**
   * Value is -4118 (0xFFFFEFEA)
   */
  public static final Integer xlMarkerStyleDot = Integer.valueOf(-4118);

  /**
   * Value is -4142 (0xFFFFEFD2)
   */
  public static final Integer xlMarkerStyleNone = Integer.valueOf(-4142);

  /**
   * Value is -4147 (0xFFFFEFCD)
   */
  public static final Integer xlMarkerStylePicture = Integer.valueOf(-4147);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlMarkerStylePlus = Integer.valueOf(9);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlMarkerStyleSquare = Integer.valueOf(1);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlMarkerStyleStar = Integer.valueOf(5);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlMarkerStyleTriangle = Integer.valueOf(3);

  /**
   * Value is -4168 (0xFFFFEFB8)
   */
  public static final Integer xlMarkerStyleX = Integer.valueOf(-4168);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlMarkerStyleAutomatic", xlMarkerStyleAutomatic);
    v.put("xlMarkerStyleCircle", xlMarkerStyleCircle);
    v.put("xlMarkerStyleDash", xlMarkerStyleDash);
    v.put("xlMarkerStyleDiamond", xlMarkerStyleDiamond);
    v.put("xlMarkerStyleDot", xlMarkerStyleDot);
    v.put("xlMarkerStyleNone", xlMarkerStyleNone);
    v.put("xlMarkerStylePicture", xlMarkerStylePicture);
    v.put("xlMarkerStylePlus", xlMarkerStylePlus);
    v.put("xlMarkerStyleSquare", xlMarkerStyleSquare);
    v.put("xlMarkerStyleStar", xlMarkerStyleStar);
    v.put("xlMarkerStyleTriangle", xlMarkerStyleTriangle);
    v.put("xlMarkerStyleX", xlMarkerStyleX);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
