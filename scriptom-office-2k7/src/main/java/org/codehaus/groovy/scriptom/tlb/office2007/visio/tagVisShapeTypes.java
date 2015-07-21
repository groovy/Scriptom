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
public final class tagVisShapeTypes
{
  private tagVisShapeTypes()
  {
  }

  /**
   * The type of no shape. Means all types when used as filter code.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visTypeInval = Integer.valueOf(0);

  /**
   * Page's or master's PageSheet.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visTypePage = Integer.valueOf(1);

  /**
   * Shape that contains shapes.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visTypeGroup = Integer.valueOf(2);

  /**
   * Native Visio shape.<p>
   * Value is 3 (0x3)
   */
  public static final Integer visTypeShape = Integer.valueOf(3);

  /**
   * Imported shape.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visTypeForeignObject = Integer.valueOf(4);

  /**
   * Shape that is a guide.<p>
   * Value is 5 (0x5)
   */
  public static final Integer visTypeGuide = Integer.valueOf(5);

  /**
   * Document's DocumentSheet.<p>
   * Value is 6 (0x6)
   */
  public static final Integer visTypeDoc = Integer.valueOf(6);

  /**
   * Returned by shape.ForeignType if shape is metafile.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visTypeMetafile = Integer.valueOf(16);

  /**
   * Returned by shape.ForeignType if shape is bitmap.<p>
   * Value is 32 (0x20)
   */
  public static final Integer visTypeBitmap = Integer.valueOf(32);

  /**
   * Returned by shape.ForeignType if shape is link.<p>
   * Value is 256 (0x100)
   */
  public static final Integer visTypeIsLinked = Integer.valueOf(256);

  /**
   * Returned by shape.ForeignType if shape is embed.<p>
   * Value is 512 (0x200)
   */
  public static final Integer visTypeIsEmbedded = Integer.valueOf(512);

  /**
   * Returned by shape.ForeignType if shape is control.<p>
   * Value is 1024 (0x400)
   */
  public static final Integer visTypeIsControl = Integer.valueOf(1024);

  /**
   * Returned by shape.ForeignType if shape is link, embed or control.<p>
   * Value is 32768 (0x8000)
   */
  public static final Integer visTypeIsOLE2 = Integer.valueOf(32768);

  /**
   * Returned by shape.ForeignType if shape is ink.<p>
   * Value is 64 (0x40)
   */
  public static final Integer visTypeInk = Integer.valueOf(64);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visTypeInval", visTypeInval);
    v.put("visTypePage", visTypePage);
    v.put("visTypeGroup", visTypeGroup);
    v.put("visTypeShape", visTypeShape);
    v.put("visTypeForeignObject", visTypeForeignObject);
    v.put("visTypeGuide", visTypeGuide);
    v.put("visTypeDoc", visTypeDoc);
    v.put("visTypeMetafile", visTypeMetafile);
    v.put("visTypeBitmap", visTypeBitmap);
    v.put("visTypeIsLinked", visTypeIsLinked);
    v.put("visTypeIsEmbedded", visTypeIsEmbedded);
    v.put("visTypeIsControl", visTypeIsControl);
    v.put("visTypeIsOLE2", visTypeIsOLE2);
    v.put("visTypeInk", visTypeInk);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
