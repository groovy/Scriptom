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
public final class tagVisSnapSettings
{
  private tagVisSnapSettings()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visSnapToNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visSnapToRulerSubdivisions = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visSnapToGrid = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visSnapToGuides = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visSnapToHandles = Integer.valueOf(8);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visSnapToVertices = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer visSnapToConnectionPoints = Integer.valueOf(32);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer visSnapToGeometry = Integer.valueOf(256);

  /**
   * Value is 512 (0x200)
   */
  public static final Integer visSnapToAlignmentBox = Integer.valueOf(512);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer visSnapToExtensions = Integer.valueOf(1024);

  /**
   * Same as Doc.SnapEnabled=FALSE.<p>
   * Value is 32768 (0x8000)
   */
  public static final Integer visSnapToDisabled = Integer.valueOf(32768);

  /**
   * Value is 65536 (0x10000)
   */
  public static final Integer visSnapToIntersections = Integer.valueOf(65536);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visSnapToNone", visSnapToNone);
    v.put("visSnapToRulerSubdivisions", visSnapToRulerSubdivisions);
    v.put("visSnapToGrid", visSnapToGrid);
    v.put("visSnapToGuides", visSnapToGuides);
    v.put("visSnapToHandles", visSnapToHandles);
    v.put("visSnapToVertices", visSnapToVertices);
    v.put("visSnapToConnectionPoints", visSnapToConnectionPoints);
    v.put("visSnapToGeometry", visSnapToGeometry);
    v.put("visSnapToAlignmentBox", visSnapToAlignmentBox);
    v.put("visSnapToExtensions", visSnapToExtensions);
    v.put("visSnapToDisabled", visSnapToDisabled);
    v.put("visSnapToIntersections", visSnapToIntersections);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
