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
public final class tagVisWinTypes
{
  private tagVisWinTypes()
  {
  }

  /**
   * The window's type is not known to Visio.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visWinOther = Integer.valueOf(0);

  /**
   * The window is a drawing window. Use subtype to determine what kind of drawing window.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visDrawing = Integer.valueOf(1);

  /**
   * The window is a stencil window.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visStencil = Integer.valueOf(2);

  /**
   * The window is a sheet window.<p>
   * Value is 3 (0x3)
   */
  public static final Integer visSheet = Integer.valueOf(3);

  /**
   * The window is an icon window.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visIcon = Integer.valueOf(4);

  /**
   * The window is the application window.<p>
   * Value is 5 (0x5)
   */
  public static final Integer visApplication = Integer.valueOf(5);

  /**
   * A built in anchor bar in a drawing window. Use ID to determine what kind of anchor bar.<p>
   * Value is 6 (0x6)
   */
  public static final Integer visAnchorBarBuiltIn = Integer.valueOf(6);

  /**
   * A stencil window docked in a drawing window.<p>
   * Value is 7 (0x7)
   */
  public static final Integer visDockedStencilBuiltIn = Integer.valueOf(7);

  /**
   * An Add-on window with drawing window behavior.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visDrawingAddon = Integer.valueOf(8);

  /**
   * An Add-on window with stencil window behavior.<p>
   * Value is 9 (0x9)
   */
  public static final Integer visStencilAddon = Integer.valueOf(9);

  /**
   * An Add-on window with anchor bar behavior.<p>
   * Value is 10 (0xA)
   */
  public static final Integer visAnchorBarAddon = Integer.valueOf(10);

  /**
   * An Add-on window with docked stencil behavior.<p>
   * Value is 11 (0xB)
   */
  public static final Integer visDockedStencilAddon = Integer.valueOf(11);

  /**
   * Returned by Window.SubType if type is visDrawing and window is showing a page.<p>
   * Value is 128 (0x80)
   */
  public static final Integer visPageWin = Integer.valueOf(128);

  /**
   * Returned by Window.SubType if type is visDrawing and window is showing a group of a page.<p>
   * Value is 160 (0xA0)
   */
  public static final Integer visPageGroupWin = Integer.valueOf(160);

  /**
   * Returned by Window.SubType if type is visDrawing and window is showing a master.<p>
   * Value is 64 (0x40)
   */
  public static final Integer visMasterWin = Integer.valueOf(64);

  /**
   * Returned by Window.SubType if type is visDrawing and window is showing a group of a master.<p>
   * Value is 96 (0x60)
   */
  public static final Integer visMasterGroupWin = Integer.valueOf(96);

  /**
   * The value Window.ID returns if it has no ID.<p>
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer visInvalWinID = Integer.valueOf(-1);

  /**
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is custom properties window.<p>
   * Value is 1658 (0x67A)
   */
  public static final Integer visWinIDCustProp = Integer.valueOf(1658);

  /**
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is pan/zoom window.<p>
   * Value is 1653 (0x675)
   */
  public static final Integer visWinIDPanZoom = Integer.valueOf(1653);

  /**
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is size and position window.<p>
   * Value is 1670 (0x686)
   */
  public static final Integer visWinIDSizePos = Integer.valueOf(1670);

  /**
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is drawing explorer window.<p>
   * Value is 1721 (0x6B9)
   */
  public static final Integer visWinIDDrawingExplorer = Integer.valueOf(1721);

  /**
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is ShapeSheet formula tracing window.<p>
   * Value is 1781 (0x6F5)
   */
  public static final Integer visWinIDFormulaTracing = Integer.valueOf(1781);

  /**
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is drawing explorer window in MDI stencil window.<p>
   * Value is 1796 (0x704)
   */
  public static final Integer visWinIDStencilExplorer = Integer.valueOf(1796);

  /**
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is master explorer window in master edit window.<p>
   * Value is 1916 (0x77C)
   */
  public static final Integer visWinIDMasterExplorer = Integer.valueOf(1916);

  /**
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is shape search window.<p>
   * Value is 1669 (0x685)
   */
  public static final Integer visWinIDShapeSearch = Integer.valueOf(1669);

  /**
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is data explorer window.<p>
   * Value is 2044 (0x7FC)
   */
  public static final Integer visWinIDExternalData = Integer.valueOf(2044);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visWinOther", visWinOther);
    v.put("visDrawing", visDrawing);
    v.put("visStencil", visStencil);
    v.put("visSheet", visSheet);
    v.put("visIcon", visIcon);
    v.put("visApplication", visApplication);
    v.put("visAnchorBarBuiltIn", visAnchorBarBuiltIn);
    v.put("visDockedStencilBuiltIn", visDockedStencilBuiltIn);
    v.put("visDrawingAddon", visDrawingAddon);
    v.put("visStencilAddon", visStencilAddon);
    v.put("visAnchorBarAddon", visAnchorBarAddon);
    v.put("visDockedStencilAddon", visDockedStencilAddon);
    v.put("visPageWin", visPageWin);
    v.put("visPageGroupWin", visPageGroupWin);
    v.put("visMasterWin", visMasterWin);
    v.put("visMasterGroupWin", visMasterGroupWin);
    v.put("visInvalWinID", visInvalWinID);
    v.put("visWinIDCustProp", visWinIDCustProp);
    v.put("visWinIDPanZoom", visWinIDPanZoom);
    v.put("visWinIDSizePos", visWinIDSizePos);
    v.put("visWinIDDrawingExplorer", visWinIDDrawingExplorer);
    v.put("visWinIDFormulaTracing", visWinIDFormulaTracing);
    v.put("visWinIDStencilExplorer", visWinIDStencilExplorer);
    v.put("visWinIDMasterExplorer", visWinIDMasterExplorer);
    v.put("visWinIDShapeSearch", visWinIDShapeSearch);
    v.put("visWinIDExternalData", visWinIDExternalData);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
