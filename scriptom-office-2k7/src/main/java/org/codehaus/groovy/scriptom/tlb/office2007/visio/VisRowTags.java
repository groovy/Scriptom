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
 * Row tags to be used with shape.rowtype and similar methods.
 * @author Jason Smith
 */
public final class VisRowTags
{
  private VisRowTags()
  {
  }

  /**
   * Connotes row of default type to AddRow, AddNamedRow or AddRows.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visTagDefault = Integer.valueOf(0);

  /**
   * Lowest row tag value<p>
   * Value is 130 (0x82)
   */
  public static final Integer visTagBase = Integer.valueOf(130);

  /**
   * The rowtype of rows in visSectionUser. Reserved for future use.<p>
   * Value is 180 (0xB4)
   */
  public static final Integer visTagRowVoid = Integer.valueOf(180);

  /**
   * A tag no row will ever have.<p>
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer visTagInvalid = Integer.valueOf(-1);

  /**
   * The rowtype of the component properties row in a geometry section.<p>
   * Value is 137 (0x89)
   */
  public static final Integer visTagComponent = Integer.valueOf(137);

  /**
   * The rowtype of a MoveTo row in a geometry section.<p>
   * Value is 138 (0x8A)
   */
  public static final Integer visTagMoveTo = Integer.valueOf(138);

  /**
   * The rowtype of a LineTo row in a geometry section.<p>
   * Value is 139 (0x8B)
   */
  public static final Integer visTagLineTo = Integer.valueOf(139);

  /**
   * The rowtype of an ArcTo row in a geometry section.<p>
   * Value is 140 (0x8C)
   */
  public static final Integer visTagArcTo = Integer.valueOf(140);

  /**
   * The rowtype of an InfiniteLine row in a geometry section.<p>
   * Value is 141 (0x8D)
   */
  public static final Integer visTagInfiniteLine = Integer.valueOf(141);

  /**
   * The rowtype of an Ellipse row in a geometry section.<p>
   * Value is 143 (0x8F)
   */
  public static final Integer visTagEllipse = Integer.valueOf(143);

  /**
   * The rowtype of an EllipticalArcTo row in a geometry section.<p>
   * Value is 144 (0x90)
   */
  public static final Integer visTagEllipticalArcTo = Integer.valueOf(144);

  /**
   * The rowtype of a SplineStart row in a geometry section.<p>
   * Value is 165 (0xA5)
   */
  public static final Integer visTagSplineBeg = Integer.valueOf(165);

  /**
   * The rowtype of a SplineKnot row in a geometry section.<p>
   * Value is 166 (0xA6)
   */
  public static final Integer visTagSplineSpan = Integer.valueOf(166);

  /**
   * The rowtype of a PolyLineTo row in a geometry section.<p>
   * Value is 193 (0xC1)
   */
  public static final Integer visTagPolylineTo = Integer.valueOf(193);

  /**
   * The rowtype of a NURBSTo row in a geometry section.<p>
   * Value is 195 (0xC3)
   */
  public static final Integer visTagNURBSTo = Integer.valueOf(195);

  /**
   * The rowtype of a row in visSectionTab that defines 0 tab stops.<p>
   * Value is 136 (0x88)
   */
  public static final Integer visTagTab0 = Integer.valueOf(136);

  /**
   * The rowtype of a row in visSectionTab that defines up to 2 tab stops.<p>
   * Value is 150 (0x96)
   */
  public static final Integer visTagTab2 = Integer.valueOf(150);

  /**
   * The rowtype of a row in visSectionTab that defines up to 10 tab stops.<p>
   * Value is 151 (0x97)
   */
  public static final Integer visTagTab10 = Integer.valueOf(151);

  /**
   * The rowtype of a row in visSectionTab that defines up to 60 tab stops.<p>
   * Value is 181 (0xB5)
   */
  public static final Integer visTagTab60 = Integer.valueOf(181);

  /**
   * The rowtype of a row in a visSectionConnectionPts with unnamed rows.<p>
   * Value is 153 (0x99)
   */
  public static final Integer visTagCnnctPt = Integer.valueOf(153);

  /**
   * The rowtype of a row in a visSectionConnectionPts with named rows.<p>
   * Value is 185 (0xB9)
   */
  public static final Integer visTagCnnctNamed = Integer.valueOf(185);

  /**
   * The rowtype of an extended row in a visSectionConnectionPts with unnamed rows. Seldom used in practice.<p>
   * Value is 186 (0xBA)
   */
  public static final Integer visTagCnnctPtABCD = Integer.valueOf(186);

  /**
   * The rowtype of an extended row in a visSectionConnectionPts with named rows. Seldom used in practice.<p>
   * Value is 187 (0xBB)
   */
  public static final Integer visTagCnnctNamedABCD = Integer.valueOf(187);

  /**
   * The rowtype of a row in visSectionControls that doesn't supply a tooltip.<p>
   * Value is 162 (0xA2)
   */
  public static final Integer visTagCtlPt = Integer.valueOf(162);

  /**
   * The rowtype of a row in visSectionControls that does supply a tooltip.<p>
   * Value is 170 (0xAA)
   */
  public static final Integer visTagCtlPtTip = Integer.valueOf(170);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visTagDefault", visTagDefault);
    v.put("visTagBase", visTagBase);
    v.put("visTagRowVoid", visTagRowVoid);
    v.put("visTagInvalid", visTagInvalid);
    v.put("visTagComponent", visTagComponent);
    v.put("visTagMoveTo", visTagMoveTo);
    v.put("visTagLineTo", visTagLineTo);
    v.put("visTagArcTo", visTagArcTo);
    v.put("visTagInfiniteLine", visTagInfiniteLine);
    v.put("visTagEllipse", visTagEllipse);
    v.put("visTagEllipticalArcTo", visTagEllipticalArcTo);
    v.put("visTagSplineBeg", visTagSplineBeg);
    v.put("visTagSplineSpan", visTagSplineSpan);
    v.put("visTagPolylineTo", visTagPolylineTo);
    v.put("visTagNURBSTo", visTagNURBSTo);
    v.put("visTagTab0", visTagTab0);
    v.put("visTagTab2", visTagTab2);
    v.put("visTagTab10", visTagTab10);
    v.put("visTagTab60", visTagTab60);
    v.put("visTagCnnctPt", visTagCnnctPt);
    v.put("visTagCnnctNamed", visTagCnnctNamed);
    v.put("visTagCnnctPtABCD", visTagCnnctPtABCD);
    v.put("visTagCnnctNamedABCD", visTagCnnctNamedABCD);
    v.put("visTagCtlPt", visTagCtlPt);
    v.put("visTagCtlPtTip", visTagCtlPtTip);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
