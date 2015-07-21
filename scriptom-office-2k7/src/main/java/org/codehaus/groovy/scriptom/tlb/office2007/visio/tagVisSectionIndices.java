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
public final class tagVisSectionIndices
{
  private tagVisSectionIndices()
  {
  }

  /**
   * An index no section will ever have.<p>
   * Value is 255 (0xFF)
   */
  public static final Integer visSectionInval = Integer.valueOf(255);

  /**
   * Index that every actual section index exceeds.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visSectionFirst = Integer.valueOf(0);

  /**
   * Index that exceeds every actual section index.<p>
   * Value is 252 (0xFC)
   */
  public static final Integer visSectionLast = Integer.valueOf(252);

  /**
   * Connotes unspecified section.<p>
   * Value is 255 (0xFF)
   */
  public static final Integer visSectionNone = Integer.valueOf(255);

  /**
   * Index of section that stores general non-repeated properties of an object. Appears as many sections in sheet window.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visSectionObject = Integer.valueOf(1);

  /**
   * Index of section Visio uses internally to represent an object's display list. For internal use only.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visSectionMember = Integer.valueOf(2);

  /**
   * Index of section that stores character properties such as font and text color.<p>
   * Value is 3 (0x3)
   */
  public static final Integer visSectionCharacter = Integer.valueOf(3);

  /**
   * Index of section that stores paragraph properties such as indent and horizontal text alignment.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visSectionParagraph = Integer.valueOf(4);

  /**
   * Index of section that stores positions and alignments of tab stops.<p>
   * Value is 5 (0x5)
   */
  public static final Integer visSectionTab = Integer.valueOf(5);

  /**
   * Index of section with cells used to hold temporary or intermediate results.<p>
   * Value is 6 (0x6)
   */
  public static final Integer visSectionScratch = Integer.valueOf(6);

  /**
   * Index of section whose rows represent an object's connection points. Connection point rows are namable.<p>
   * Value is 7 (0x7)
   */
  public static final Integer visSectionConnectionPts = Integer.valueOf(7);

  /**
   * Synonym of visSectionConnectionPts<p>
   * Value is 7 (0x7)
   */
  public static final Integer visSectionExport = Integer.valueOf(7);

  /**
   * Index of section that describes an object's text fields.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visSectionTextField = Integer.valueOf(8);

  /**
   * Index of section whose rows represent an object's control handles.<p>
   * Value is 9 (0x9)
   */
  public static final Integer visSectionControls = Integer.valueOf(9);

  /**
   * Index of an object's 1st geometry section. Additional sections have indices visSectionFirstComponent+i.<p>
   * Value is 10 (0xA)
   */
  public static final Integer visSectionFirstComponent = Integer.valueOf(10);

  /**
   * Highest possible index of an object's last geometry section.<p>
   * Value is 239 (0xEF)
   */
  public static final Integer visSectionLastComponent = Integer.valueOf(239);

  /**
   * Index of section whose rows represent actions that appear on an object's right mouse menu.<p>
   * Value is 240 (0xF0)
   */
  public static final Integer visSectionAction = Integer.valueOf(240);

  /**
   * Index of section whose rows represent a page's or master's layers.<p>
   * Value is 241 (0xF1)
   */
  public static final Integer visSectionLayer = Integer.valueOf(241);

  /**
   * Index of section with cells created and used by external solutions. User section rows are named.<p>
   * Value is 242 (0xF2)
   */
  public static final Integer visSectionUser = Integer.valueOf(242);

  /**
   * Index of section that stores custom database-like properties of an object. Property section rows are named.<p>
   * Value is 243 (0xF3)
   */
  public static final Integer visSectionProp = Integer.valueOf(243);

  /**
   * Index of section whose rows represent links to another object. Hyperlink section rows are named.<p>
   * Value is 244 (0xF4)
   */
  public static final Integer visSectionHyperlink = Integer.valueOf(244);

  /**
   * Index of section whose rows represent reviewers.<p>
   * Value is 245 (0xF5)
   */
  public static final Integer visSectionReviewer = Integer.valueOf(245);

  /**
   * Index of section whose rows represent annotations.<p>
   * Value is 246 (0xF6)
   */
  public static final Integer visSectionAnnotation = Integer.valueOf(246);

  /**
   * Index of section whose rows represent smart tags.<p>
   * Value is 247 (0xF7)
   */
  public static final Integer visSectionSmartTag = Integer.valueOf(247);

  /**
   * Highest possible actual section index. Was 243 in Visio 5.0 and prior.<p>
   * Value is 247 (0xF7)
   */
  public static final Integer visSectionLastReal = Integer.valueOf(247);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visSectionInval", visSectionInval);
    v.put("visSectionFirst", visSectionFirst);
    v.put("visSectionLast", visSectionLast);
    v.put("visSectionNone", visSectionNone);
    v.put("visSectionObject", visSectionObject);
    v.put("visSectionMember", visSectionMember);
    v.put("visSectionCharacter", visSectionCharacter);
    v.put("visSectionParagraph", visSectionParagraph);
    v.put("visSectionTab", visSectionTab);
    v.put("visSectionScratch", visSectionScratch);
    v.put("visSectionConnectionPts", visSectionConnectionPts);
    v.put("visSectionExport", visSectionExport);
    v.put("visSectionTextField", visSectionTextField);
    v.put("visSectionControls", visSectionControls);
    v.put("visSectionFirstComponent", visSectionFirstComponent);
    v.put("visSectionLastComponent", visSectionLastComponent);
    v.put("visSectionAction", visSectionAction);
    v.put("visSectionLayer", visSectionLayer);
    v.put("visSectionUser", visSectionUser);
    v.put("visSectionProp", visSectionProp);
    v.put("visSectionHyperlink", visSectionHyperlink);
    v.put("visSectionReviewer", visSectionReviewer);
    v.put("visSectionAnnotation", visSectionAnnotation);
    v.put("visSectionSmartTag", visSectionSmartTag);
    v.put("visSectionLastReal", visSectionLastReal);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
