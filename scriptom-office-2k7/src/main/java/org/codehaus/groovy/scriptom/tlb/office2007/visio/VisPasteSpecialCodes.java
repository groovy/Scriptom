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
 * Format codes to be passed to PasteSpecial.
 * @author Jason Smith
 */
public final class VisPasteSpecialCodes
{
  private VisPasteSpecialCodes()
  {
  }

  /**
   * Paste ANSI text (CF_TEXT)<p>
   * Value is 1 (0x1)
   */
  public static final Integer visPasteText = Integer.valueOf(1);

  /**
   * Paste bitmap (CF_BITMAP)<p>
   * Value is 2 (0x2)
   */
  public static final Integer visPasteBitmap = Integer.valueOf(2);

  /**
   * Paste metafile (CF_METAFILEPICT)<p>
   * Value is 3 (0x3)
   */
  public static final Integer visPasteMetafile = Integer.valueOf(3);

  /**
   * Paste OEM text (CF_OEMTEXT)<p>
   * Value is 7 (0x7)
   */
  public static final Integer visPasteOEMText = Integer.valueOf(7);

  /**
   * Paste device independent bitmap (CF_DIB)<p>
   * Value is 8 (0x8)
   */
  public static final Integer visPasteDIB = Integer.valueOf(8);

  /**
   * Paste enhanced metafile (CF_ENHMETAFILE)<p>
   * Value is 14 (0xE)
   */
  public static final Integer visPasteEMF = Integer.valueOf(14);

  /**
   * Paste OLE object<p>
   * Value is 65536 (0x10000)
   */
  public static final Integer visPasteOLEObject = Integer.valueOf(65536);

  /**
   * Paste rich text<p>
   * Value is 65537 (0x10001)
   */
  public static final Integer visPasteRichText = Integer.valueOf(65537);

  /**
   * Paste hyperlink<p>
   * Value is 65538 (0x10002)
   */
  public static final Integer visPasteHyperlink = Integer.valueOf(65538);

  /**
   * Paste Uniform Resource Locator<p>
   * Value is 65539 (0x10003)
   */
  public static final Integer visPasteURL = Integer.valueOf(65539);

  /**
   * Paste Visio Shapes<p>
   * Value is 65540 (0x10004)
   */
  public static final Integer visPasteVisioShapes = Integer.valueOf(65540);

  /**
   * Paste Visio Masters<p>
   * Value is 65541 (0x10005)
   */
  public static final Integer visPasteVisioMasters = Integer.valueOf(65541);

  /**
   * Paste Visio Text<p>
   * Value is 65542 (0x10006)
   */
  public static final Integer visPasteVisioText = Integer.valueOf(65542);

  /**
   * Paste Visio Icon<p>
   * Value is 65543 (0x10007)
   */
  public static final Integer visPasteVisioIcon = Integer.valueOf(65543);

  /**
   * Paste Ink Data<p>
   * Value is 65544 (0x10008)
   */
  public static final Integer visPasteInk = Integer.valueOf(65544);

  /**
   * Paste Visio Shapes XML<p>
   * Value is 65545 (0x10009)
   */
  public static final Integer visPasteVisioShapesXML = Integer.valueOf(65545);

  /**
   * Paste Visio Masters XML<p>
   * Value is 65546 (0x1000A)
   */
  public static final Integer visPasteVisioMastersXML = Integer.valueOf(65546);

  /**
   * Paste Visio Drawing Data without External Data Links<p>
   * Value is 65548 (0x1000C)
   */
  public static final Integer visPasteVisioShapesWithoutDataLinks = Integer.valueOf(65548);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visPasteText", visPasteText);
    v.put("visPasteBitmap", visPasteBitmap);
    v.put("visPasteMetafile", visPasteMetafile);
    v.put("visPasteOEMText", visPasteOEMText);
    v.put("visPasteDIB", visPasteDIB);
    v.put("visPasteEMF", visPasteEMF);
    v.put("visPasteOLEObject", visPasteOLEObject);
    v.put("visPasteRichText", visPasteRichText);
    v.put("visPasteHyperlink", visPasteHyperlink);
    v.put("visPasteURL", visPasteURL);
    v.put("visPasteVisioShapes", visPasteVisioShapes);
    v.put("visPasteVisioMasters", visPasteVisioMasters);
    v.put("visPasteVisioText", visPasteVisioText);
    v.put("visPasteVisioIcon", visPasteVisioIcon);
    v.put("visPasteInk", visPasteInk);
    v.put("visPasteVisioShapesXML", visPasteVisioShapesXML);
    v.put("visPasteVisioMastersXML", visPasteVisioMastersXML);
    v.put("visPasteVisioShapesWithoutDataLinks", visPasteVisioShapesWithoutDataLinks);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
