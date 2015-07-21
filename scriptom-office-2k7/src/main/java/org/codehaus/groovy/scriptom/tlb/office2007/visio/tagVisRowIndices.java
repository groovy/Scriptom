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
public final class tagVisRowIndices
{
  private tagVisRowIndices()
  {
  }

  /**
   * An index no row will ever have.<p>
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer visRowInval = Integer.valueOf(-1);

  /**
   * Row logically at or before every other row in a section.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowFirst = Integer.valueOf(0);

  /**
   * Row logically after every other row in a section.<p>
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer visRowLast = Integer.valueOf(-2);

  /**
   * Connotes unspecified row.<p>
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer visRowNone = Integer.valueOf(-1);

  /**
   * Index of row in Shape's visSectionObject that defines its transform. Appears as Shape Transform 'section' in sheet window.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visRowXFormOut = Integer.valueOf(1);

  /**
   * Synonym of visRowXFormOut<p>
   * Value is 1 (0x1)
   */
  public static final Integer visRowXFormIn = Integer.valueOf(1);

  /**
   * Index of row in Shape or Style's visSectionObject that defines line properties. Appears as Line Format 'section' in sheet window.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visRowLine = Integer.valueOf(2);

  /**
   * Index of row in Shape or Style's visSectionObject that defines fill properties. Appears as Fill Format 'section' in sheet window.<p>
   * Value is 3 (0x3)
   */
  public static final Integer visRowFill = Integer.valueOf(3);

  /**
   * Index of row in 1D Shape's visSectionObject that defines its end-points. Appears as 1-D Endpoints 'section' in sheet window.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visRowXForm1D = Integer.valueOf(4);

  /**
   * Index of row in Shape's visSectionObject that defines the Shape's reactions to certain events. Events 'section' in sheet window.<p>
   * Value is 5 (0x5)
   */
  public static final Integer visRowEvent = Integer.valueOf(5);

  /**
   * Index of row in Shape's visSectionObject that defines what layers it belongs to. Layer Membership 'section' in sheet window.<p>
   * Value is 6 (0x6)
   */
  public static final Integer visRowLayerMem = Integer.valueOf(6);

  /**
   * Obsolete starting with Visio 2000. Guides now represented by XFormOut and geometry.<p>
   * Value is 7 (0x7)
   */
  public static final Integer visRowGuide = Integer.valueOf(7);

  /**
   * Index of row in Style's visSectionObject that defines style specific properties. Style Properties 'section' in sheet window.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visRowStyle = Integer.valueOf(8);

  /**
   * Index of row in visSectionObject of Shape of ForeignType visTypeForeignObject that defines foreign properties. Foreign Image Info 'section' in sheet window.<p>
   * Value is 9 (0x9)
   */
  public static final Integer visRowForeign = Integer.valueOf(9);

  /**
   * Index of row in visSectionObject of Shape of type visTypePage that defines page/master specific properties. Page Properties Info 'section' in sheet window.<p>
   * Value is 10 (0xA)
   */
  public static final Integer visRowPage = Integer.valueOf(10);

  /**
   * Index of row in Shape or Style's visSectionObject that defines text block properties. Character 'section' in sheet window.<p>
   * Value is 11 (0xB)
   */
  public static final Integer visRowText = Integer.valueOf(11);

  /**
   * Index of row in Shape's visSectionObject that defines its text transform. Text Transform 'section' in sheet window.<p>
   * Value is 12 (0xC)
   */
  public static final Integer visRowTextXForm = Integer.valueOf(12);

  /**
   * Index of row in Shape's visSectionObject that defines what Shape is aligned with. Alignment 'section' in sheet window.<p>
   * Value is 14 (0xE)
   */
  public static final Integer visRowAlign = Integer.valueOf(14);

  /**
   * Index of row in Shape's visSectionObject indicating operations it is protected against. Protection 'section' in sheet window.<p>
   * Value is 15 (0xF)
   */
  public static final Integer visRowLock = Integer.valueOf(15);

  /**
   * Index of row in Shape's visSectionObject that defines help and copyright properties. Not shown in sheet window.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visRowHelpCopyright = Integer.valueOf(16);

  /**
   * Synonym of visRowHelpCopyright<p>
   * Value is 16 (0x10)
   */
  public static final Integer visRowData123 = Integer.valueOf(16);

  /**
   * Index of row in Shape's visSectionObject that defines various behavioral properties. Miscellaneous 'section' in sheet window.<p>
   * Value is 17 (0x11)
   */
  public static final Integer visRowMisc = Integer.valueOf(17);

  /**
   * Index of row in Page or Master's visSectionObject that defines ruler and grid settings. Ruler & Grid 'section' in sheet window.<p>
   * Value is 18 (0x12)
   */
  public static final Integer visRowRulerGrid = Integer.valueOf(18);

  /**
   * Obsolete starting with Visio 2000. Hyperlinks are now rows in visSectionHyperlink.<p>
   * Value is 19 (0x13)
   */
  public static final Integer visRowHyperlink = Integer.valueOf(19);

  /**
   * Index of row in visSectionObject of Shape of type visTypeDoc that defines document properties. Document 'section' in sheet window.<p>
   * Value is 20 (0x14)
   */
  public static final Integer visRowDoc = Integer.valueOf(20);

  /**
   * Index of row in visSectionObject of Shape of ForeignType visTypeBitMap that defines image properties. Image 'section' in sheet window.<p>
   * Value is 21 (0x15)
   */
  public static final Integer visRowImage = Integer.valueOf(21);

  /**
   * Index of row in visSectionObject of Shape of type visTypeGroup that defines group properties. Group 'section' in sheet window.<p>
   * Value is 22 (0x16)
   */
  public static final Integer visRowGroup = Integer.valueOf(22);

  /**
   * Index of row in visSectionObject of Shape that defines its placement and routing behavior. Shape Layout 'section' in sheet window.<p>
   * Value is 23 (0x17)
   */
  public static final Integer visRowShapeLayout = Integer.valueOf(23);

  /**
   * Index of row in visSectionObject of Page or Master that defines how its Shapes place and route. Page Layout 'section' in sheet window.<p>
   * Value is 24 (0x18)
   */
  public static final Integer visRowPageLayout = Integer.valueOf(24);

  /**
   * Index of row in visSectionObject of Document that defines printing properties. Print Properties 'section' in sheet window.<p>
   * Value is 25 (0x19)
   */
  public static final Integer visRowPrintProperties = Integer.valueOf(25);

  /**
   * Index of component properties row in a geometry section (visSectionFirstComponent+i).<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowComponent = Integer.valueOf(0);

  /**
   * Index of 1st vertex row in a geometry section (visSectionFirstComponent+i).<p>
   * Value is 1 (0x1)
   */
  public static final Integer visRowVertex = Integer.valueOf(1);

  /**
   * Index of 1st row in visSectionMember. For internal use only.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowMember = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionCharacter.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowCharacter = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionParagraph.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowParagraph = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionTab.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowTab = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionScratch.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowScratch = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionConnectionPts.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowConnectionPts = Integer.valueOf(0);

  /**
   * Synonym of visRowConnectionPts<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowExport = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionTextField.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowField = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionControls.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowControl = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionAction.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowAction = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionLayer.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowLayer = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionUser.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowUser = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionProp.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowProp = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionHyperlink.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRow1stHyperlink = Integer.valueOf(0);

  /**
   * Generic index of 1st row in non-object/geometry section.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowFormat = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionReviewer.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowReviewer = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionAnnotation.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowAnnotation = Integer.valueOf(0);

  /**
   * Index of 1st row in visSectionSmartTag.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visRowSmartTag = Integer.valueOf(0);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visRowInval", visRowInval);
    v.put("visRowFirst", visRowFirst);
    v.put("visRowLast", visRowLast);
    v.put("visRowNone", visRowNone);
    v.put("visRowXFormOut", visRowXFormOut);
    v.put("visRowXFormIn", visRowXFormIn);
    v.put("visRowLine", visRowLine);
    v.put("visRowFill", visRowFill);
    v.put("visRowXForm1D", visRowXForm1D);
    v.put("visRowEvent", visRowEvent);
    v.put("visRowLayerMem", visRowLayerMem);
    v.put("visRowGuide", visRowGuide);
    v.put("visRowStyle", visRowStyle);
    v.put("visRowForeign", visRowForeign);
    v.put("visRowPage", visRowPage);
    v.put("visRowText", visRowText);
    v.put("visRowTextXForm", visRowTextXForm);
    v.put("visRowAlign", visRowAlign);
    v.put("visRowLock", visRowLock);
    v.put("visRowHelpCopyright", visRowHelpCopyright);
    v.put("visRowData123", visRowData123);
    v.put("visRowMisc", visRowMisc);
    v.put("visRowRulerGrid", visRowRulerGrid);
    v.put("visRowHyperlink", visRowHyperlink);
    v.put("visRowDoc", visRowDoc);
    v.put("visRowImage", visRowImage);
    v.put("visRowGroup", visRowGroup);
    v.put("visRowShapeLayout", visRowShapeLayout);
    v.put("visRowPageLayout", visRowPageLayout);
    v.put("visRowPrintProperties", visRowPrintProperties);
    v.put("visRowComponent", visRowComponent);
    v.put("visRowVertex", visRowVertex);
    v.put("visRowMember", visRowMember);
    v.put("visRowCharacter", visRowCharacter);
    v.put("visRowParagraph", visRowParagraph);
    v.put("visRowTab", visRowTab);
    v.put("visRowScratch", visRowScratch);
    v.put("visRowConnectionPts", visRowConnectionPts);
    v.put("visRowExport", visRowExport);
    v.put("visRowField", visRowField);
    v.put("visRowControl", visRowControl);
    v.put("visRowAction", visRowAction);
    v.put("visRowLayer", visRowLayer);
    v.put("visRowUser", visRowUser);
    v.put("visRowProp", visRowProp);
    v.put("visRow1stHyperlink", visRow1stHyperlink);
    v.put("visRowFormat", visRowFormat);
    v.put("visRowReviewer", visRowReviewer);
    v.put("visRowAnnotation", visRowAnnotation);
    v.put("visRowSmartTag", visRowSmartTag);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
