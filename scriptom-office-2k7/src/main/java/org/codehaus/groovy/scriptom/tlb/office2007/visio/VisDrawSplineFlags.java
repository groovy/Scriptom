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
 * Flags to pass to DrawSpline or DrawPolyline.
 * @author Jason Smith
 */
public final class VisDrawSplineFlags
{
  private VisDrawSplineFlags()
  {
  }

  /**
   * A flag that if set allows generation of periodic splines.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visSplinePeriodic = Integer.valueOf(1);

  /**
   * A flag that if set allows generation of circular arcs instead of spline segments.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visSplineDoCircles = Integer.valueOf(2);

  /**
   * A flag that if set tells Visio to break splines when direction changes abruptly.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visSplineAbrupt = Integer.valueOf(4);

  /**
   * A flag that if set tells Visio to generate splines with 1D behavior.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visSpline1D = Integer.valueOf(8);

  /**
   * A flag that if set tells Visio to generate polylines with 1D behavior.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visPolyline1D = Integer.valueOf(8);

  /**
   * A flag that if set tells DrawPolyline to accept [x,y, {x,y,bow}] rather than {x,y}.<p>
   * Value is 256 (0x100)
   */
  public static final Integer visPolyarcs = Integer.valueOf(256);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visSplinePeriodic", visSplinePeriodic);
    v.put("visSplineDoCircles", visSplineDoCircles);
    v.put("visSplineAbrupt", visSplineAbrupt);
    v.put("visSpline1D", visSpline1D);
    v.put("visPolyline1D", visPolyline1D);
    v.put("visPolyarcs", visPolyarcs);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
