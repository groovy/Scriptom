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
 * UI Object Set identifiers.
 * @author Jason Smith
 */
public final class VisUIObjSets
{
  private VisUIObjSets()
  {
  }

  /**
   * Obsolete as of Visio 2000. Use visUIObjSetDrawing in lieu.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visUIObjSetNoDocument = Integer.valueOf(1);

  /**
   * Menus and toolbars when active window is Drawing window<p>
   * Value is 2 (0x2)
   */
  public static final Integer visUIObjSetDrawing = Integer.valueOf(2);

  /**
   * Menus and toolbars when active window is Stencil window<p>
   * Value is 3 (0x3)
   */
  public static final Integer visUIObjSetStencil = Integer.valueOf(3);

  /**
   * Menus and toolbars when active window is ShapeSheet window<p>
   * Value is 4 (0x4)
   */
  public static final Integer visUIObjSetShapeSheet = Integer.valueOf(4);

  /**
   * Menus and toolbars when active window is Icon Editor window<p>
   * Value is 5 (0x5)
   */
  public static final Integer visUIObjSetIcon = Integer.valueOf(5);

  /**
   * Use only for accelerators when Visio is running in-place.<p>
   * Value is 6 (0x6)
   */
  public static final Integer visUIObjSetInPlace = Integer.valueOf(6);

  /**
   * Menus and toolbars when Visio is in Print Preview mode<p>
   * Value is 7 (0x7)
   */
  public static final Integer visUIObjSetPrintPreview = Integer.valueOf(7);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visUIObjSetText = Integer.valueOf(8);

  /**
   * Context menu: Visio shape<p>
   * Value is 9 (0x9)
   */
  public static final Integer visUIObjSetCntx_DrawObjSel = Integer.valueOf(9);

  /**
   * Context menu: Foreign shape<p>
   * Value is 10 (0xA)
   */
  public static final Integer visUIObjSetCntx_DrawOleObjSel = Integer.valueOf(10);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 11 (0xB)
   */
  public static final Integer visUIObjSetCntx_DrawNoObjSel = Integer.valueOf(11);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 12 (0xC)
   */
  public static final Integer visUIObjSetCntx_InPlaceNoObj = Integer.valueOf(12);

  /**
   * Context menu: Editing text<p>
   * Value is 13 (0xD)
   */
  public static final Integer visUIObjSetCntx_TextEdit = Integer.valueOf(13);

  /**
   * Same as visUIObjSetCntx_Master<p>
   * Value is 14 (0xE)
   */
  public static final Integer visUIObjSetCntx_StencilRO = Integer.valueOf(14);

  /**
   * Context menu: ShapeSheet window<p>
   * Value is 15 (0xF)
   */
  public static final Integer visUIObjSetCntx_ShapeSheet = Integer.valueOf(15);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visUIObjSetCntx_Toolbar = Integer.valueOf(16);

  /**
   * Context menu: Full Screen mode<p>
   * Value is 17 (0x11)
   */
  public static final Integer visUIObjSetCntx_FullScreen = Integer.valueOf(17);

  /**
   * Same as visUIObjSetActiveXDoc.<p>
   * Value is 18 (0x12)
   */
  public static final Integer visUIObjSetBinderInPlace = Integer.valueOf(18);

  /**
   * Use only for accelerators when Visio is running as an ActiveX document.<p>
   * Value is 18 (0x12)
   */
  public static final Integer visUIObjSetActiveXDoc = Integer.valueOf(18);

  /**
   * Do not use.<p>
   * Value is 19 (0x13)
   */
  public static final Integer visUIObjSetCntx_Debug = Integer.valueOf(19);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 20 (0x14)
   */
  public static final Integer visUIObjSetCntx_StencilRW = Integer.valueOf(20);

  /**
   * Same as visUIObjSetCntx_Stencil<p>
   * Value is 21 (0x15)
   */
  public static final Integer visUIObjSetCntx_StencilDocked = Integer.valueOf(21);

  /**
   * Use only for accelerators when an object is active in Visio.<p>
   * Value is 22 (0x16)
   */
  public static final Integer visUIObjSetHostingInPlace = Integer.valueOf(22);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 23 (0x17)
   */
  public static final Integer visUIObjSetCntx_Hyperlink = Integer.valueOf(23);

  /**
   * Toolbar palette: Line color<p>
   * Value is 24 (0x18)
   */
  public static final Integer visUIObjSetPal_LineColors = Integer.valueOf(24);

  /**
   * Toolbar palette: Line weight<p>
   * Value is 25 (0x19)
   */
  public static final Integer visUIObjSetPal_LineWeights = Integer.valueOf(25);

  /**
   * Toolbar palette: Line pattern<p>
   * Value is 26 (0x1A)
   */
  public static final Integer visUIObjSetPal_LinePatterns = Integer.valueOf(26);

  /**
   * Toolbar palette: Fill color<p>
   * Value is 27 (0x1B)
   */
  public static final Integer visUIObjSetPal_FillColors = Integer.valueOf(27);

  /**
   * Toolbar palette: Fill pattern<p>
   * Value is 28 (0x1C)
   */
  public static final Integer visUIObjSetPal_FillPatterns = Integer.valueOf(28);

  /**
   * Toolbar palette: Text color<p>
   * Value is 29 (0x1D)
   */
  public static final Integer visUIObjSetPal_TextColors = Integer.valueOf(29);

  /**
   * Toolbar palette: Align shapes<p>
   * Value is 30 (0x1E)
   */
  public static final Integer visUIObjSetPal_AlignShapes = Integer.valueOf(30);

  /**
   * Toolbar palette: Distribute shapes<p>
   * Value is 31 (0x1F)
   */
  public static final Integer visUIObjSetPal_DistributeShapes = Integer.valueOf(31);

  /**
   * Toolbar palette: Shadow color<p>
   * Value is 32 (0x20)
   */
  public static final Integer visUIObjSetPal_Shadow = Integer.valueOf(32);

  /**
   * Toolbar palette: Line end<p>
   * Value is 33 (0x21)
   */
  public static final Integer visUIObjSetPal_LineEnds = Integer.valueOf(33);

  /**
   * Toolbar palette: Corner rounding<p>
   * Value is 34 (0x22)
   */
  public static final Integer visUIObjSetPal_CornerRounding = Integer.valueOf(34);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 35 (0x23)
   */
  public static final Integer visUIObjSetCntx_ToolbarInPlace = Integer.valueOf(35);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 36 (0x24)
   */
  public static final Integer visUIObjSetCntx_ToolbarHostingInPlace = Integer.valueOf(36);

  /**
   * Toolbar palette: Rectangle and ellipse drawing tools<p>
   * Value is 37 (0x25)
   */
  public static final Integer visUIObjSetPal_Rectangle_Tool = Integer.valueOf(37);

  /**
   * Toolbar palette: Add line jumps to<p>
   * Value is 38 (0x26)
   */
  public static final Integer visUIObjSetPopup_LineJumpCode = Integer.valueOf(38);

  /**
   * Toolbar palette: Line jump style<p>
   * Value is 39 (0x27)
   */
  public static final Integer visUIObjSetPopup_LineJumpStyle = Integer.valueOf(39);

  /**
   * Toolbar palette: Connector, Connection point and Stamp drawing tools<p>
   * Value is 40 (0x28)
   */
  public static final Integer visUIObjSetPal_ConnectorTool = Integer.valueOf(40);

  /**
   * Toolbar palette: Text and text block drawing tools<p>
   * Value is 41 (0x29)
   */
  public static final Integer visUIObjSetPal_TextTool = Integer.valueOf(41);

  /**
   * Toolbar palette: Line, Arc, Pencil and Freehand drawing tools<p>
   * Value is 42 (0x2A)
   */
  public static final Integer visUIObjSetPal_LineTool = Integer.valueOf(42);

  /**
   * Toolbar palette: Rotation and crop tools<p>
   * Value is 43 (0x2B)
   */
  public static final Integer visUIObjSetPal_RotationTool = Integer.valueOf(43);

  /**
   * Context menu: Connection point<p>
   * Value is 44 (0x2C)
   */
  public static final Integer visUIObjSetCntx_ConnectPtType = Integer.valueOf(44);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 45 (0x2D)
   */
  public static final Integer visUIObjSetPal_Undo = Integer.valueOf(45);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 46 (0x2E)
   */
  public static final Integer visUIObjSetPal_Redo = Integer.valueOf(46);

  /**
   * Context menu: Page tab<p>
   * Value is 47 (0x2F)
   */
  public static final Integer visUIObjSetCntx_PageTabs = Integer.valueOf(47);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 48 (0x30)
   */
  public static final Integer visUIObjSetPal_ShapeExt = Integer.valueOf(48);

  /**
   * Context menu: Drawing Explorer, root item<p>
   * Value is 49 (0x31)
   */
  public static final Integer visUIObjSetCntx_DEDocument = Integer.valueOf(49);

  /**
   * Context menu: Drawing Explorer, Pages folder<p>
   * Value is 50 (0x32)
   */
  public static final Integer visUIObjSetCntx_DEPages = Integer.valueOf(50);

  /**
   * Context menu: Drawing Explorer, Page item<p>
   * Value is 51 (0x33)
   */
  public static final Integer visUIObjSetCntx_DEPage = Integer.valueOf(51);

  /**
   * Context menu: Drawing Explorer, Shapes folder<p>
   * Value is 52 (0x34)
   */
  public static final Integer visUIObjSetCntx_DEShapes = Integer.valueOf(52);

  /**
   * Context menu: Drawing Explorer, Shape item<p>
   * Value is 53 (0x35)
   */
  public static final Integer visUIObjSetCntx_DEShape = Integer.valueOf(53);

  /**
   * Context menu: Drawing Explorer, Layers folder<p>
   * Value is 54 (0x36)
   */
  public static final Integer visUIObjSetCntx_DELayers = Integer.valueOf(54);

  /**
   * Context menu: Drawing Explorer, Layer item<p>
   * Value is 55 (0x37)
   */
  public static final Integer visUIObjSetCntx_DELayer = Integer.valueOf(55);

  /**
   * Context menu: Drawing Explorer, Styles folder<p>
   * Value is 56 (0x38)
   */
  public static final Integer visUIObjSetCntx_DEStyles = Integer.valueOf(56);

  /**
   * Context menu: Drawing Explorer, Style item<p>
   * Value is 57 (0x39)
   */
  public static final Integer visUIObjSetCntx_DEStyle = Integer.valueOf(57);

  /**
   * Context menu: Drawing Explorer, Masters folder<p>
   * Value is 58 (0x3A)
   */
  public static final Integer visUIObjSetCntx_DEMasters = Integer.valueOf(58);

  /**
   * Context menu: Drawing Explorer, Master item<p>
   * Value is 59 (0x3B)
   */
  public static final Integer visUIObjSetCntx_DEMaster = Integer.valueOf(59);

  /**
   * Context menu: Drawing Explorer, Patterns folder<p>
   * Value is 60 (0x3C)
   */
  public static final Integer visUIObjSetCntx_DEPatterns = Integer.valueOf(60);

  /**
   * Context menu: Anchored windows<p>
   * Value is 61 (0x3D)
   */
  public static final Integer visUIObjSetCntx_AnchorBar_Base = Integer.valueOf(61);

  /**
   * Context menu: Custom properties window<p>
   * Value is 62 (0x3E)
   */
  public static final Integer visUIObjSetCntx_AnchorBar_CustProp = Integer.valueOf(62);

  /**
   * Context menu: Size & Position window<p>
   * Value is 63 (0x3F)
   */
  public static final Integer visUIObjSetCntx_AnchorBar_SizePos = Integer.valueOf(63);

  /**
   * Context menu: Master<p>
   * Value is 14 (0xE)
   */
  public static final Integer visUIObjSetCntx_Master = Integer.valueOf(14);

  /**
   * Context menu: Stencil window<p>
   * Value is 21 (0x15)
   */
  public static final Integer visUIObjSetCntx_Stencil = Integer.valueOf(21);

  /**
   * Built-in commands available through the Customize dialog.<p>
   * Value is 1000 (0x3E8)
   */
  public static final Integer visUIObjSetCntx_AddCommands = Integer.valueOf(1000);

  /**
   * Built-in menus available through the Customize dialog.<p>
   * Value is 1010 (0x3F2)
   */
  public static final Integer visUIObjSetCntx_BuiltinMenus = Integer.valueOf(1010);

  /**
   * Reserved.<p>
   * Value is 1011 (0x3F3)
   */
  public static final Integer visUIObjSetCntx_ShortcutMenus = Integer.valueOf(1011);

  /**
   * Context menu: Master Explorer, root item<p>
   * Value is 66 (0x42)
   */
  public static final Integer visUIObjSetCntx_MEDocument = Integer.valueOf(66);

  /**
   * Context menu: Master Explorer, Masters folder<p>
   * Value is 67 (0x43)
   */
  public static final Integer visUIObjSetCntx_MEMasters = Integer.valueOf(67);

  /**
   * Context menu: Comment Marker<p>
   * Value is 68 (0x44)
   */
  public static final Integer visUIObjSetCntx_CommentMarker = Integer.valueOf(68);

  /**
   * Context menu: Shapes window<p>
   * Value is 69 (0x45)
   */
  public static final Integer visUIObjSetCntx_AnchorBar_Shapes = Integer.valueOf(69);

  /**
   * Context menu: Data Explorer Tabs<p>
   * Value is 70 (0x46)
   */
  public static final Integer visUIObjSetCntx_DataExplorerTabs = Integer.valueOf(70);

  /**
   * Context menu: Data Explorer List<p>
   * Value is 71 (0x47)
   */
  public static final Integer visUIObjSetCntx_DataExplorerList = Integer.valueOf(71);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visUIObjSetNoDocument", visUIObjSetNoDocument);
    v.put("visUIObjSetDrawing", visUIObjSetDrawing);
    v.put("visUIObjSetStencil", visUIObjSetStencil);
    v.put("visUIObjSetShapeSheet", visUIObjSetShapeSheet);
    v.put("visUIObjSetIcon", visUIObjSetIcon);
    v.put("visUIObjSetInPlace", visUIObjSetInPlace);
    v.put("visUIObjSetPrintPreview", visUIObjSetPrintPreview);
    v.put("visUIObjSetText", visUIObjSetText);
    v.put("visUIObjSetCntx_DrawObjSel", visUIObjSetCntx_DrawObjSel);
    v.put("visUIObjSetCntx_DrawOleObjSel", visUIObjSetCntx_DrawOleObjSel);
    v.put("visUIObjSetCntx_DrawNoObjSel", visUIObjSetCntx_DrawNoObjSel);
    v.put("visUIObjSetCntx_InPlaceNoObj", visUIObjSetCntx_InPlaceNoObj);
    v.put("visUIObjSetCntx_TextEdit", visUIObjSetCntx_TextEdit);
    v.put("visUIObjSetCntx_StencilRO", visUIObjSetCntx_StencilRO);
    v.put("visUIObjSetCntx_ShapeSheet", visUIObjSetCntx_ShapeSheet);
    v.put("visUIObjSetCntx_Toolbar", visUIObjSetCntx_Toolbar);
    v.put("visUIObjSetCntx_FullScreen", visUIObjSetCntx_FullScreen);
    v.put("visUIObjSetBinderInPlace", visUIObjSetBinderInPlace);
    v.put("visUIObjSetActiveXDoc", visUIObjSetActiveXDoc);
    v.put("visUIObjSetCntx_Debug", visUIObjSetCntx_Debug);
    v.put("visUIObjSetCntx_StencilRW", visUIObjSetCntx_StencilRW);
    v.put("visUIObjSetCntx_StencilDocked", visUIObjSetCntx_StencilDocked);
    v.put("visUIObjSetHostingInPlace", visUIObjSetHostingInPlace);
    v.put("visUIObjSetCntx_Hyperlink", visUIObjSetCntx_Hyperlink);
    v.put("visUIObjSetPal_LineColors", visUIObjSetPal_LineColors);
    v.put("visUIObjSetPal_LineWeights", visUIObjSetPal_LineWeights);
    v.put("visUIObjSetPal_LinePatterns", visUIObjSetPal_LinePatterns);
    v.put("visUIObjSetPal_FillColors", visUIObjSetPal_FillColors);
    v.put("visUIObjSetPal_FillPatterns", visUIObjSetPal_FillPatterns);
    v.put("visUIObjSetPal_TextColors", visUIObjSetPal_TextColors);
    v.put("visUIObjSetPal_AlignShapes", visUIObjSetPal_AlignShapes);
    v.put("visUIObjSetPal_DistributeShapes", visUIObjSetPal_DistributeShapes);
    v.put("visUIObjSetPal_Shadow", visUIObjSetPal_Shadow);
    v.put("visUIObjSetPal_LineEnds", visUIObjSetPal_LineEnds);
    v.put("visUIObjSetPal_CornerRounding", visUIObjSetPal_CornerRounding);
    v.put("visUIObjSetCntx_ToolbarInPlace", visUIObjSetCntx_ToolbarInPlace);
    v.put("visUIObjSetCntx_ToolbarHostingInPlace", visUIObjSetCntx_ToolbarHostingInPlace);
    v.put("visUIObjSetPal_Rectangle_Tool", visUIObjSetPal_Rectangle_Tool);
    v.put("visUIObjSetPopup_LineJumpCode", visUIObjSetPopup_LineJumpCode);
    v.put("visUIObjSetPopup_LineJumpStyle", visUIObjSetPopup_LineJumpStyle);
    v.put("visUIObjSetPal_ConnectorTool", visUIObjSetPal_ConnectorTool);
    v.put("visUIObjSetPal_TextTool", visUIObjSetPal_TextTool);
    v.put("visUIObjSetPal_LineTool", visUIObjSetPal_LineTool);
    v.put("visUIObjSetPal_RotationTool", visUIObjSetPal_RotationTool);
    v.put("visUIObjSetCntx_ConnectPtType", visUIObjSetCntx_ConnectPtType);
    v.put("visUIObjSetPal_Undo", visUIObjSetPal_Undo);
    v.put("visUIObjSetPal_Redo", visUIObjSetPal_Redo);
    v.put("visUIObjSetCntx_PageTabs", visUIObjSetCntx_PageTabs);
    v.put("visUIObjSetPal_ShapeExt", visUIObjSetPal_ShapeExt);
    v.put("visUIObjSetCntx_DEDocument", visUIObjSetCntx_DEDocument);
    v.put("visUIObjSetCntx_DEPages", visUIObjSetCntx_DEPages);
    v.put("visUIObjSetCntx_DEPage", visUIObjSetCntx_DEPage);
    v.put("visUIObjSetCntx_DEShapes", visUIObjSetCntx_DEShapes);
    v.put("visUIObjSetCntx_DEShape", visUIObjSetCntx_DEShape);
    v.put("visUIObjSetCntx_DELayers", visUIObjSetCntx_DELayers);
    v.put("visUIObjSetCntx_DELayer", visUIObjSetCntx_DELayer);
    v.put("visUIObjSetCntx_DEStyles", visUIObjSetCntx_DEStyles);
    v.put("visUIObjSetCntx_DEStyle", visUIObjSetCntx_DEStyle);
    v.put("visUIObjSetCntx_DEMasters", visUIObjSetCntx_DEMasters);
    v.put("visUIObjSetCntx_DEMaster", visUIObjSetCntx_DEMaster);
    v.put("visUIObjSetCntx_DEPatterns", visUIObjSetCntx_DEPatterns);
    v.put("visUIObjSetCntx_AnchorBar_Base", visUIObjSetCntx_AnchorBar_Base);
    v.put("visUIObjSetCntx_AnchorBar_CustProp", visUIObjSetCntx_AnchorBar_CustProp);
    v.put("visUIObjSetCntx_AnchorBar_SizePos", visUIObjSetCntx_AnchorBar_SizePos);
    v.put("visUIObjSetCntx_Master", visUIObjSetCntx_Master);
    v.put("visUIObjSetCntx_Stencil", visUIObjSetCntx_Stencil);
    v.put("visUIObjSetCntx_AddCommands", visUIObjSetCntx_AddCommands);
    v.put("visUIObjSetCntx_BuiltinMenus", visUIObjSetCntx_BuiltinMenus);
    v.put("visUIObjSetCntx_ShortcutMenus", visUIObjSetCntx_ShortcutMenus);
    v.put("visUIObjSetCntx_MEDocument", visUIObjSetCntx_MEDocument);
    v.put("visUIObjSetCntx_MEMasters", visUIObjSetCntx_MEMasters);
    v.put("visUIObjSetCntx_CommentMarker", visUIObjSetCntx_CommentMarker);
    v.put("visUIObjSetCntx_AnchorBar_Shapes", visUIObjSetCntx_AnchorBar_Shapes);
    v.put("visUIObjSetCntx_DataExplorerTabs", visUIObjSetCntx_DataExplorerTabs);
    v.put("visUIObjSetCntx_DataExplorerList", visUIObjSetCntx_DataExplorerList);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
