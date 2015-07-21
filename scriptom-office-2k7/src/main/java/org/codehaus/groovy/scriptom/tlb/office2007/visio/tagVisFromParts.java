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
public final class tagVisFromParts
{
  private tagVisFromParts()
  {
  }

  /**
   * Connect.FromPart: Not known<p>
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer visConnectFromError = Integer.valueOf(-1);

  /**
   * Connect.FromPart: Connection is from nothing.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visFromNone = Integer.valueOf(0);

  /**
   * Connect.FromPart: Connection is from left edge of shape.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visLeftEdge = Integer.valueOf(1);

  /**
   * Connect.FromPart: Connection is from (x) center of shape.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visCenterEdge = Integer.valueOf(2);

  /**
   * Connect.FromPart: Connection is from right edge of shape.<p>
   * Value is 3 (0x3)
   */
  public static final Integer visRightEdge = Integer.valueOf(3);

  /**
   * Connect.FromPart: Connection is from bottom edge of shape.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visBottomEdge = Integer.valueOf(4);

  /**
   * Connect.FromPart: Connection is from (y) middle of shape.<p>
   * Value is 5 (0x5)
   */
  public static final Integer visMiddleEdge = Integer.valueOf(5);

  /**
   * Connect.FromPart: Connection is from top edge of shape.<p>
   * Value is 6 (0x6)
   */
  public static final Integer visTopEdge = Integer.valueOf(6);

  /**
   * Connect.FromPart: Connection is from begin x of 1-D shape.<p>
   * Value is 7 (0x7)
   */
  public static final Integer visBeginX = Integer.valueOf(7);

  /**
   * Connect.FromPart: Connection is from begin y of 1-D shape.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visBeginY = Integer.valueOf(8);

  /**
   * Connect.FromPart: Connection is from begin of 1-D shape.<p>
   * Value is 9 (0x9)
   */
  public static final Integer visBegin = Integer.valueOf(9);

  /**
   * Connect.FromPart: Connection is from end x of 1-D shape.<p>
   * Value is 10 (0xA)
   */
  public static final Integer visEndX = Integer.valueOf(10);

  /**
   * Connect.FromPart: Connection is from end y of 1-D shape.<p>
   * Value is 11 (0xB)
   */
  public static final Integer visEndY = Integer.valueOf(11);

  /**
   * Connect.FromPart: Connection is from end of 1-D shape.<p>
   * Value is 12 (0xC)
   */
  public static final Integer visEnd = Integer.valueOf(12);

  /**
   * Connect.FromPart: Connection is from the direction of a connection point.<p>
   * Value is 13 (0xD)
   */
  public static final Integer visFromAngle = Integer.valueOf(13);

  /**
   * Connect.FromPart: Connection is from the pin of a shape.<p>
   * Value is 14 (0xE)
   */
  public static final Integer visFromPin = Integer.valueOf(14);

  /**
   * Connect.FromPart: Connection is from control point (+ row index).<p>
   * Value is 100 (0x64)
   */
  public static final Integer visControlPoint = Integer.valueOf(100);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visConnectFromError", visConnectFromError);
    v.put("visFromNone", visFromNone);
    v.put("visLeftEdge", visLeftEdge);
    v.put("visCenterEdge", visCenterEdge);
    v.put("visRightEdge", visRightEdge);
    v.put("visBottomEdge", visBottomEdge);
    v.put("visMiddleEdge", visMiddleEdge);
    v.put("visTopEdge", visTopEdge);
    v.put("visBeginX", visBeginX);
    v.put("visBeginY", visBeginY);
    v.put("visBegin", visBegin);
    v.put("visEndX", visEndX);
    v.put("visEndY", visEndY);
    v.put("visEnd", visEnd);
    v.put("visFromAngle", visFromAngle);
    v.put("visFromPin", visFromPin);
    v.put("visControlPoint", visControlPoint);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
