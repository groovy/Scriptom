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
 * Flags to be passed to BoundingBox.
 * @author Jason Smith
 */
public final class VisBoundingBoxArgs
{
  private VisBoundingBoxArgs()
  {
  }

  /**
   * Pass this to BoundingBox to include upright width/height box(es) in result.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visBBoxUprightWH = Integer.valueOf(1);

  /**
   * Pass this to BoundingBox to include upright text box(es) in result.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visBBoxUprightText = Integer.valueOf(2);

  /**
   * Pass this to BoundingBox to include geometric extents in result.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visBBoxExtents = Integer.valueOf(4);

  /**
   * If visBBoxExtents is also set this tells BoundingBox to consider hidden geometry.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visBBoxIncludeHidden = Integer.valueOf(16);

  /**
   * If visBBoxExtents is also set this tells BoundingBox to not consider visible geometry.<p>
   * Value is 32 (0x20)
   */
  public static final Integer visBBoxIgnoreVisible = Integer.valueOf(32);

  /**
   * Pass this to BoundingBox to include data graphic callout shapes in result.<p>
   * Value is 64 (0x40)
   */
  public static final Integer visBBoxIncludeDataGraphics = Integer.valueOf(64);

  /**
   * Pass this to BoundingBox to have it consider guides to have extent.<p>
   * Value is 4096 (0x1000)
   */
  public static final Integer visBBoxIncludeGuides = Integer.valueOf(4096);

  /**
   * Pass this to BoundingBox to have results reported in page/master coords rather than local coords of parent.<p>
   * Value is 8192 (0x2000)
   */
  public static final Integer visBBoxDrawingCoords = Integer.valueOf(8192);

  /**
   * Pass this to BoundingBox to have it consider non-printing shapes to have no extent.<p>
   * Value is 16384 (0x4000)
   */
  public static final Integer visBBoxNoNonPrint = Integer.valueOf(16384);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visBBoxUprightWH", visBBoxUprightWH);
    v.put("visBBoxUprightText", visBBoxUprightText);
    v.put("visBBoxExtents", visBBoxExtents);
    v.put("visBBoxIncludeHidden", visBBoxIncludeHidden);
    v.put("visBBoxIgnoreVisible", visBBoxIgnoreVisible);
    v.put("visBBoxIncludeDataGraphics", visBBoxIncludeDataGraphics);
    v.put("visBBoxIncludeGuides", visBBoxIncludeGuides);
    v.put("visBBoxDrawingCoords", visBBoxDrawingCoords);
    v.put("visBBoxNoNonPrint", visBBoxNoNonPrint);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
