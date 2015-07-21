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
public final class tagVisCellIndices
{
  private tagVisCellIndices()
  {
  }

  /**
   * An index no cell will ever have.<p>
   * Value is 255 (0xFF)
   */
  public static final Integer visCellInval = Integer.valueOf(255);

  /**
   * Cell logically at or before every other cell in a row.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visCellFirst = Integer.valueOf(0);

  /**
   * Connotes unspecified cell.<p>
   * Value is 255 (0xFF)
   */
  public static final Integer visCellNone = Integer.valueOf(255);

  /**
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormPinX  name:PinX|TxtPinX<p>
   * Value is 0 (0x0)
   */
  public static final Integer visXFormPinX = Integer.valueOf(0);

  /**
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormPinY  name:PinY|TxtPinY<p>
   * Value is 1 (0x1)
   */
  public static final Integer visXFormPinY = Integer.valueOf(1);

  /**
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormWidth  name:Width|TxtWidth<p>
   * Value is 2 (0x2)
   */
  public static final Integer visXFormWidth = Integer.valueOf(2);

  /**
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormHeight  name:Height|TxtHeight<p>
   * Value is 3 (0x3)
   */
  public static final Integer visXFormHeight = Integer.valueOf(3);

  /**
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormLocPinX  name:LocPinX|TxtLocPinX<p>
   * Value is 4 (0x4)
   */
  public static final Integer visXFormLocPinX = Integer.valueOf(4);

  /**
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormLocPinX  name:LocPinY|TxtLocPinY<p>
   * Value is 5 (0x5)
   */
  public static final Integer visXFormLocPinY = Integer.valueOf(5);

  /**
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormAngle  name:Angle|TxtAngle<p>
   * Value is 6 (0x6)
   */
  public static final Integer visXFormAngle = Integer.valueOf(6);

  /**
   * visSectionObject,visRowXFormOut,visXFormFlipX  name:FlipX<p>
   * Value is 7 (0x7)
   */
  public static final Integer visXFormFlipX = Integer.valueOf(7);

  /**
   * visSectionObject,visRowXFormOut,visXFormFlipY  name:FlipY<p>
   * Value is 8 (0x8)
   */
  public static final Integer visXFormFlipY = Integer.valueOf(8);

  /**
   * visSectionObject,visRowXFormOut,visXFormResizeMode  name:ResizeMode<p>
   * Value is 9 (0x9)
   */
  public static final Integer visXFormResizeMode = Integer.valueOf(9);

  /**
   * visSectionObject,visRowLine,visLineWeight  name:LineWeight<p>
   * Value is 0 (0x0)
   */
  public static final Integer visLineWeight = Integer.valueOf(0);

  /**
   * visSectionObject,visRowLine,visLineColor  name:LineColor<p>
   * Value is 1 (0x1)
   */
  public static final Integer visLineColor = Integer.valueOf(1);

  /**
   * visSectionObject,visRowLine,visLinePattern  name:LinePattern<p>
   * Value is 2 (0x2)
   */
  public static final Integer visLinePattern = Integer.valueOf(2);

  /**
   * visSectionObject,visRowLine,visLineRounding  name:Rounding<p>
   * Value is 3 (0x3)
   */
  public static final Integer visLineRounding = Integer.valueOf(3);

  /**
   * Synonym of visLineEndArrowSize<p>
   * Value is 4 (0x4)
   */
  public static final Integer visLineArrowSize = Integer.valueOf(4);

  /**
   * visSectionObject,visRowLine,visLineEndArrowSize  name:EndArrowSize<p>
   * Value is 4 (0x4)
   */
  public static final Integer visLineEndArrowSize = Integer.valueOf(4);

  /**
   * visSectionObject,visRowLine,visLineBeginArrow  name:BeginArrow<p>
   * Value is 5 (0x5)
   */
  public static final Integer visLineBeginArrow = Integer.valueOf(5);

  /**
   * visSectionObject,visRowLine,visLineEndArrow  name:EndArrow<p>
   * Value is 6 (0x6)
   */
  public static final Integer visLineEndArrow = Integer.valueOf(6);

  /**
   * visSectionObject,visRowLine,visLineEndCap  name:LineCap<p>
   * Value is 7 (0x7)
   */
  public static final Integer visLineEndCap = Integer.valueOf(7);

  /**
   * visSectionObject,visRowLine,visLineBeginArrowSize  name:BeginArrowSize<p>
   * Value is 8 (0x8)
   */
  public static final Integer visLineBeginArrowSize = Integer.valueOf(8);

  /**
   * visSectionObject,visRowLine,visLineColorTrans  name:LineColorTrans<p>
   * Value is 9 (0x9)
   */
  public static final Integer visLineColorTrans = Integer.valueOf(9);

  /**
   * visSectionObject,visRowFill,visFillForegnd  name:FillForegnd<p>
   * Value is 0 (0x0)
   */
  public static final Integer visFillForegnd = Integer.valueOf(0);

  /**
   * visSectionObject,visRowFill,visFillBkgnd  name:FillBkgnd<p>
   * Value is 1 (0x1)
   */
  public static final Integer visFillBkgnd = Integer.valueOf(1);

  /**
   * visSectionObject,visRowFill,visFillPattern  name:FillPattern<p>
   * Value is 2 (0x2)
   */
  public static final Integer visFillPattern = Integer.valueOf(2);

  /**
   * visSectionObject,visRowFill,visFillShdwForegnd  name:ShdwForegnd<p>
   * Value is 3 (0x3)
   */
  public static final Integer visFillShdwForegnd = Integer.valueOf(3);

  /**
   * visSectionObject,visRowFill,visFillShdwBkgnd  name:ShdwBkgnd<p>
   * Value is 4 (0x4)
   */
  public static final Integer visFillShdwBkgnd = Integer.valueOf(4);

  /**
   * visSectionObject,visRowFill,visFillShdwPattern  name:ShdwPattern<p>
   * Value is 5 (0x5)
   */
  public static final Integer visFillShdwPattern = Integer.valueOf(5);

  /**
   * visSectionObject,visRowFill,visFillForegndTrans  name:FillForegndTrans<p>
   * Value is 6 (0x6)
   */
  public static final Integer visFillForegndTrans = Integer.valueOf(6);

  /**
   * visSectionObject,visRowFill,visFillBkgndTrans  name:FillBkgndTrans<p>
   * Value is 7 (0x7)
   */
  public static final Integer visFillBkgndTrans = Integer.valueOf(7);

  /**
   * visSectionObject,visRowFill,visFillShdwForegndTrans  name:ShdwForegndTrans<p>
   * Value is 8 (0x8)
   */
  public static final Integer visFillShdwForegndTrans = Integer.valueOf(8);

  /**
   * visSectionObject,visRowFill,visFillShdwBkgndTrans  name:ShdwBkgndTrans<p>
   * Value is 9 (0x9)
   */
  public static final Integer visFillShdwBkgndTrans = Integer.valueOf(9);

  /**
   * visSectionObject,visRowFill,visFillShdwType  name:ShdwType<p>
   * Value is 10 (0xA)
   */
  public static final Integer visFillShdwType = Integer.valueOf(10);

  /**
   * visSectionObject,visRowFill,visFillShdwOffsetX  name:ShdwOffsetX<p>
   * Value is 11 (0xB)
   */
  public static final Integer visFillShdwOffsetX = Integer.valueOf(11);

  /**
   * visSectionObject,visRowFill,visFillShdwOffsetY  name:ShdwOffsetY<p>
   * Value is 12 (0xC)
   */
  public static final Integer visFillShdwOffsetY = Integer.valueOf(12);

  /**
   * visSectionObject,visRowFill,visFillShdwObliqueAngle  name:ShdwObliqueAngle<p>
   * Value is 13 (0xD)
   */
  public static final Integer visFillShdwObliqueAngle = Integer.valueOf(13);

  /**
   * visSectionObject,visRowFill,visFillShdwScaleFactor  name:ShdwScaleFactor<p>
   * Value is 14 (0xE)
   */
  public static final Integer visFillShdwScaleFactor = Integer.valueOf(14);

  /**
   * visSectionObject,visRowXForm1D,vis1DBeginX  name:BeginX<p>
   * Value is 0 (0x0)
   */
  public static final Integer vis1DBeginX = Integer.valueOf(0);

  /**
   * visSectionObject,visRowXForm1D,vis1DBeginY  name:BeginY<p>
   * Value is 1 (0x1)
   */
  public static final Integer vis1DBeginY = Integer.valueOf(1);

  /**
   * visSectionObject,visRowXForm1D,vis1DEndX  name:EndX<p>
   * Value is 2 (0x2)
   */
  public static final Integer vis1DEndX = Integer.valueOf(2);

  /**
   * visSectionObject,visRowXForm1D,vis1DEndY  name:EndY<p>
   * Value is 3 (0x3)
   */
  public static final Integer vis1DEndY = Integer.valueOf(3);

  /**
   * For internal use only.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visEvtCellTheData = Integer.valueOf(0);

  /**
   * visSectionObject,visRowEvent,visEvtCellTheText  name:TheText<p>
   * Value is 1 (0x1)
   */
  public static final Integer visEvtCellTheText = Integer.valueOf(1);

  /**
   * visSectionObject,visRowEvent,visEvtCellDblClick  name:EventDblClick<p>
   * Value is 2 (0x2)
   */
  public static final Integer visEvtCellDblClick = Integer.valueOf(2);

  /**
   * visSectionObject,visRowEvent,visEvtCellXFMod  name:EventXFMod<p>
   * Value is 3 (0x3)
   */
  public static final Integer visEvtCellXFMod = Integer.valueOf(3);

  /**
   * visSectionObject,visRowEvent,visEvtCellDrop  name:EventDrop<p>
   * Value is 4 (0x4)
   */
  public static final Integer visEvtCellDrop = Integer.valueOf(4);

  /**
   * visSectionObject,visRowLayerMem,visLayerMember  name:LayerMember<p>
   * Value is 0 (0x0)
   */
  public static final Integer visLayerMember = Integer.valueOf(0);

  /**
   * Obsolete starting with Visio 2000. Guides now represented by XFormOut and geometry.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visGuideFlags = Integer.valueOf(2);

  /**
   * visSectionObject,visRowStyle,visStyleIncludesLine  name:EnableLineProps<p>
   * Value is 0 (0x0)
   */
  public static final Integer visStyleIncludesLine = Integer.valueOf(0);

  /**
   * visSectionObject,visRowStyle,visStyleIncludesFill  name:EnableFillProps<p>
   * Value is 1 (0x1)
   */
  public static final Integer visStyleIncludesFill = Integer.valueOf(1);

  /**
   * visSectionObject,visRowStyle,visStyleIncludesText  name:EnableTextProps<p>
   * Value is 2 (0x2)
   */
  public static final Integer visStyleIncludesText = Integer.valueOf(2);

  /**
   * visSectionObject,visRowStyle,visStyleHidden  name:HideForApply<p>
   * Value is 3 (0x3)
   */
  public static final Integer visStyleHidden = Integer.valueOf(3);

  /**
   * visSectionObject,visRowForeign,visFrgnImgOffsetX  name:ImgOffsetX<p>
   * Value is 0 (0x0)
   */
  public static final Integer visFrgnImgOffsetX = Integer.valueOf(0);

  /**
   * visSectionObject,visRowForeign,visFrgnImgOffsetY  name:ImgOffsetY<p>
   * Value is 1 (0x1)
   */
  public static final Integer visFrgnImgOffsetY = Integer.valueOf(1);

  /**
   * visSectionObject,visRowForeign,visFrgnImgWidth  name:ImgWidth<p>
   * Value is 2 (0x2)
   */
  public static final Integer visFrgnImgWidth = Integer.valueOf(2);

  /**
   * visSectionObject,visRowForeign,visFrgnImgHeight  name:ImgHeight<p>
   * Value is 3 (0x3)
   */
  public static final Integer visFrgnImgHeight = Integer.valueOf(3);

  /**
   * visSectionObject,visRowPage,visPageWidth  name:PageWidth<p>
   * Value is 0 (0x0)
   */
  public static final Integer visPageWidth = Integer.valueOf(0);

  /**
   * visSectionObject,visRowPage,visPageHeight  name:PageHeight<p>
   * Value is 1 (0x1)
   */
  public static final Integer visPageHeight = Integer.valueOf(1);

  /**
   * visSectionObject,visRowPage,visPageShdwOffsetX  name:ShdwOffsetX<p>
   * Value is 2 (0x2)
   */
  public static final Integer visPageShdwOffsetX = Integer.valueOf(2);

  /**
   * visSectionObject,visRowPage,visPageShdwOffsetY  name:ShdwOffsetY<p>
   * Value is 3 (0x3)
   */
  public static final Integer visPageShdwOffsetY = Integer.valueOf(3);

  /**
   * visSectionObject,visRowPage,visPageScale  name:PageScale<p>
   * Value is 4 (0x4)
   */
  public static final Integer visPageScale = Integer.valueOf(4);

  /**
   * visSectionObject,visRowPage,visPageDrawingScale  name:DrawingScale<p>
   * Value is 5 (0x5)
   */
  public static final Integer visPageDrawingScale = Integer.valueOf(5);

  /**
   * visSectionObject,visRowPage,visPageDrawSizeType  name:DrawingSizeType<p>
   * Value is 6 (0x6)
   */
  public static final Integer visPageDrawSizeType = Integer.valueOf(6);

  /**
   * visSectionObject,visRowPage,visPageDrawScaleType  name:DrawingScaleType<p>
   * Value is 7 (0x7)
   */
  public static final Integer visPageDrawScaleType = Integer.valueOf(7);

  /**
   * visSectionObject,visRowPage,visPageInhibitSnap  name:InhibitSnap<p>
   * Value is 26 (0x1A)
   */
  public static final Integer visPageInhibitSnap = Integer.valueOf(26);

  /**
   * visSectionObject,visRowPage,visPageUIVisibility  name:UIVisibility<p>
   * Value is 34 (0x22)
   */
  public static final Integer visPageUIVisibility = Integer.valueOf(34);

  /**
   * visSectionObject,visRowPage,visPageShdwType  name:ShdwType<p>
   * Value is 35 (0x23)
   */
  public static final Integer visPageShdwType = Integer.valueOf(35);

  /**
   * visSectionObject,visRowPage,visPageShdwObliqueAngle  name:ShdwObliqueAngle<p>
   * Value is 36 (0x24)
   */
  public static final Integer visPageShdwObliqueAngle = Integer.valueOf(36);

  /**
   * visSectionObject,visRowPage,visPageShdwScaleFactor  name:ShdwScaleFactor<p>
   * Value is 37 (0x25)
   */
  public static final Integer visPageShdwScaleFactor = Integer.valueOf(37);

  /**
   * visSectionObject,visRowText,visTxtBlkLeftMargin  name:LeftMargin<p>
   * Value is 0 (0x0)
   */
  public static final Integer visTxtBlkLeftMargin = Integer.valueOf(0);

  /**
   * visSectionObject,visRowText,visTxtBlkRightMargin  name:RightMargin<p>
   * Value is 1 (0x1)
   */
  public static final Integer visTxtBlkRightMargin = Integer.valueOf(1);

  /**
   * visSectionObject,visRowText,visTxtBlkTopMargin  name:TopMargin<p>
   * Value is 2 (0x2)
   */
  public static final Integer visTxtBlkTopMargin = Integer.valueOf(2);

  /**
   * visSectionObject,visRowText,visTxtBlkBottomMargin  name:BottomMargin<p>
   * Value is 3 (0x3)
   */
  public static final Integer visTxtBlkBottomMargin = Integer.valueOf(3);

  /**
   * visSectionObject,visRowText,visTxtBlkVerticalAlign  name:VerticalAlign<p>
   * Value is 4 (0x4)
   */
  public static final Integer visTxtBlkVerticalAlign = Integer.valueOf(4);

  /**
   * visSectionObject,visRowText,visTxtBlkBkgnd  name:TextBkgnd  (value is one greater than other color cells)<p>
   * Value is 5 (0x5)
   */
  public static final Integer visTxtBlkBkgnd = Integer.valueOf(5);

  /**
   * visSectionObject,visRowText,visTxtBlkDefaultTabStop  name:DefaultTabStop<p>
   * Value is 6 (0x6)
   */
  public static final Integer visTxtBlkDefaultTabStop = Integer.valueOf(6);

  /**
   * visSectionObject,visRowText,visTxtBlkDirection  name:TextDirection<p>
   * Value is 10 (0xA)
   */
  public static final Integer visTxtBlkDirection = Integer.valueOf(10);

  /**
   * visSectionObject,visRowText,visTxtBlkBkgndTrans  name:TextBkgndTrans<p>
   * Value is 11 (0xB)
   */
  public static final Integer visTxtBlkBkgndTrans = Integer.valueOf(11);

  /**
   * visSectionObject,visRowAlign,visAlignLeft  name:AlignLeft<p>
   * Value is 0 (0x0)
   */
  public static final Integer visAlignLeft = Integer.valueOf(0);

  /**
   * visSectionObject,visRowAlign,visAlignCenter  name:AlignCenter<p>
   * Value is 1 (0x1)
   */
  public static final Integer visAlignCenter = Integer.valueOf(1);

  /**
   * visSectionObject,visRowAlign,visAlignRight  name:AlignRight<p>
   * Value is 2 (0x2)
   */
  public static final Integer visAlignRight = Integer.valueOf(2);

  /**
   * visSectionObject,visRowAlign,visAlignTop  name:AlignTop<p>
   * Value is 3 (0x3)
   */
  public static final Integer visAlignTop = Integer.valueOf(3);

  /**
   * visSectionObject,visRowAlign,visAlignMiddle  name:AlignMiddle<p>
   * Value is 4 (0x4)
   */
  public static final Integer visAlignMiddle = Integer.valueOf(4);

  /**
   * visSectionObject,visRowAlign,visAlignBottom  name:AlignBottom<p>
   * Value is 5 (0x5)
   */
  public static final Integer visAlignBottom = Integer.valueOf(5);

  /**
   * visSectionObject,visRowLock,visLockWidth  name:LockWidth<p>
   * Value is 0 (0x0)
   */
  public static final Integer visLockWidth = Integer.valueOf(0);

  /**
   * visSectionObject,visRowLock,visLockHeight  name:LockHeight<p>
   * Value is 1 (0x1)
   */
  public static final Integer visLockHeight = Integer.valueOf(1);

  /**
   * visSectionObject,visRowLock,visLockMoveX  name:LockMoveX<p>
   * Value is 2 (0x2)
   */
  public static final Integer visLockMoveX = Integer.valueOf(2);

  /**
   * visSectionObject,visRowLock,visLockMoveY  name:LockMoveY<p>
   * Value is 3 (0x3)
   */
  public static final Integer visLockMoveY = Integer.valueOf(3);

  /**
   * visSectionObject,visRowLock,visLockAspect  name:LockAspect<p>
   * Value is 4 (0x4)
   */
  public static final Integer visLockAspect = Integer.valueOf(4);

  /**
   * visSectionObject,visRowLock,visLockDelete  name:LockDelete<p>
   * Value is 5 (0x5)
   */
  public static final Integer visLockDelete = Integer.valueOf(5);

  /**
   * visSectionObject,visRowLock,visLockBegin  name:LockBegin<p>
   * Value is 6 (0x6)
   */
  public static final Integer visLockBegin = Integer.valueOf(6);

  /**
   * visSectionObject,visRowLock,visLockEnd  name:LockEnd<p>
   * Value is 7 (0x7)
   */
  public static final Integer visLockEnd = Integer.valueOf(7);

  /**
   * visSectionObject,visRowLock,visLockRotate  name:LockRotate<p>
   * Value is 8 (0x8)
   */
  public static final Integer visLockRotate = Integer.valueOf(8);

  /**
   * visSectionObject,visRowLock,visLockCrop  name:LockCrop<p>
   * Value is 9 (0x9)
   */
  public static final Integer visLockCrop = Integer.valueOf(9);

  /**
   * visSectionObject,visRowLock,visLockVtxEdit  name:LockVtxEdit<p>
   * Value is 10 (0xA)
   */
  public static final Integer visLockVtxEdit = Integer.valueOf(10);

  /**
   * visSectionObject,visRowLock,visLockTextEdit  name:LockTextEdit<p>
   * Value is 11 (0xB)
   */
  public static final Integer visLockTextEdit = Integer.valueOf(11);

  /**
   * visSectionObject,visRowLock,visLockFormat  name:LockFormat<p>
   * Value is 12 (0xC)
   */
  public static final Integer visLockFormat = Integer.valueOf(12);

  /**
   * visSectionObject,visRowLock,visLockGroup  name:LockGroup<p>
   * Value is 13 (0xD)
   */
  public static final Integer visLockGroup = Integer.valueOf(13);

  /**
   * visSectionObject,visRowLock,visLockCalcWH  name:LockCalcWH<p>
   * Value is 14 (0xE)
   */
  public static final Integer visLockCalcWH = Integer.valueOf(14);

  /**
   * visSectionObject,visRowLock,visLockSelect  name:LockSelect<p>
   * Value is 15 (0xF)
   */
  public static final Integer visLockSelect = Integer.valueOf(15);

  /**
   * visSectionObject,visRowLock,visLockCustProp  name:LockCustProp<p>
   * Value is 16 (0x10)
   */
  public static final Integer visLockCustProp = Integer.valueOf(16);

  /**
   * visSectionObject,visRowHelpCopyright,visObjHelp  name:HelpTopic<p>
   * Value is 0 (0x0)
   */
  public static final Integer visObjHelp = Integer.valueOf(0);

  /**
   * visSectionObject,visRowHelpCopyright,visCopyright  name:Copyright  [Write once cell.]<p>
   * Value is 1 (0x1)
   */
  public static final Integer visCopyright = Integer.valueOf(1);

  /**
   * visSectionObject,visRowMisc,visNoObjHandles  name:NoObjHandles<p>
   * Value is 0 (0x0)
   */
  public static final Integer visNoObjHandles = Integer.valueOf(0);

  /**
   * visSectionObject,visRowMisc,visNonPrinting  name:NonPrinting<p>
   * Value is 1 (0x1)
   */
  public static final Integer visNonPrinting = Integer.valueOf(1);

  /**
   * visSectionObject,visRowMisc,visNoCtlHandles  name:NoCtlHandles<p>
   * Value is 2 (0x2)
   */
  public static final Integer visNoCtlHandles = Integer.valueOf(2);

  /**
   * visSectionObject,visRowMisc,visNoAlignBox  name:NoAlignBox<p>
   * Value is 3 (0x3)
   */
  public static final Integer visNoAlignBox = Integer.valueOf(3);

  /**
   * visSectionObject,visRowMisc,visUpdateAlignBox  name:UpdateAlignBox<p>
   * Value is 4 (0x4)
   */
  public static final Integer visUpdateAlignBox = Integer.valueOf(4);

  /**
   * visSectionObject,visRowMisc,visHideText  name:HideText<p>
   * Value is 5 (0x5)
   */
  public static final Integer visHideText = Integer.valueOf(5);

  /**
   * Obsolete starting with Visio 2000. Text direction now in cell visTxtBlkDirection of row visRowText.<p>
   * Value is 6 (0x6)
   */
  public static final Integer visVerticalText = Integer.valueOf(6);

  /**
   * visSectionObject,visRowMisc,visDynFeedback  name:DynFeedback<p>
   * Value is 8 (0x8)
   */
  public static final Integer visDynFeedback = Integer.valueOf(8);

  /**
   * visSectionObject,visRowMisc,visGlueType  name:GlueType<p>
   * Value is 9 (0x9)
   */
  public static final Integer visGlueType = Integer.valueOf(9);

  /**
   * visSectionObject,visRowMisc,visWalkPref  name:WalkPreference<p>
   * Value is 10 (0xA)
   */
  public static final Integer visWalkPref = Integer.valueOf(10);

  /**
   * visSectionObject,visRowMisc,visBegTrigger  name:BegTrigger<p>
   * Value is 11 (0xB)
   */
  public static final Integer visBegTrigger = Integer.valueOf(11);

  /**
   * visSectionObject,visRowMisc,visEndTrigger  name:EndTrigger<p>
   * Value is 12 (0xC)
   */
  public static final Integer visEndTrigger = Integer.valueOf(12);

  /**
   * visSectionObject,visRowMisc,visLOFlags  name:ObjType<p>
   * Value is 13 (0xD)
   */
  public static final Integer visLOFlags = Integer.valueOf(13);

  /**
   * Obsolete starting with Visio 2000. Replaced by cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 14 (0xE)
   */
  public static final Integer visLOInteraction = Integer.valueOf(14);

  /**
   * Obsolete starting with Visio 2000. Replaced by cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 15 (0xF)
   */
  public static final Integer visLOBehavior = Integer.valueOf(15);

  /**
   * visSectionObject,visRowMisc,visComment  name:Comment<p>
   * Value is 16 (0x10)
   */
  public static final Integer visComment = Integer.valueOf(16);

  /**
   * visSectionObject,visRowMisc,visDropSource  name:IsDropSource<p>
   * Value is 17 (0x11)
   */
  public static final Integer visDropSource = Integer.valueOf(17);

  /**
   * visSectionObject,visRowMisc,visNoLiveDynamics  name:NoLiveDynamics<p>
   * Value is 18 (0x12)
   */
  public static final Integer visNoLiveDynamics = Integer.valueOf(18);

  /**
   * visSectionObject,visRowMisc,visObjLocalizeMerge  name:LocalizeMerge<p>
   * Value is 19 (0x13)
   */
  public static final Integer visObjLocalizeMerge = Integer.valueOf(19);

  /**
   * visSectionObject,visRowMisc,visObjCalendar  name:Calendar<p>
   * Value is 25 (0x19)
   */
  public static final Integer visObjCalendar = Integer.valueOf(25);

  /**
   * visSectionObject,visRowMisc,visObjLangID  name:LangID<p>
   * Value is 26 (0x1A)
   */
  public static final Integer visObjLangID = Integer.valueOf(26);

  /**
   * visSectionObject,visRowMisc,visObjKeywords  name:Keywords<p>
   * Value is 27 (0x1B)
   */
  public static final Integer visObjKeywords = Integer.valueOf(27);

  /**
   * visSectionObject,visRowMisc,visObjDropOnPageScale  name:DropOnPageScale<p>
   * Value is 28 (0x1C)
   */
  public static final Integer visObjDropOnPageScale = Integer.valueOf(28);

  /**
   * visSectionObject,visRowMisc,visObjTheme  name:ThemeTrigger<p>
   * Value is 29 (0x1D)
   */
  public static final Integer visObjTheme = Integer.valueOf(29);

  /**
   * visSectionObject,visRowRulerGrid,visXRulerDensity  name:XRulerDensity<p>
   * Value is 0 (0x0)
   */
  public static final Integer visXRulerDensity = Integer.valueOf(0);

  /**
   * visSectionObject,visRowRulerGrid,visYRulerDensity  name:YRulerDensity<p>
   * Value is 1 (0x1)
   */
  public static final Integer visYRulerDensity = Integer.valueOf(1);

  /**
   * visSectionObject,visRowRulerGrid,visXRulerOrigin  name:XRulerOrigin<p>
   * Value is 4 (0x4)
   */
  public static final Integer visXRulerOrigin = Integer.valueOf(4);

  /**
   * visSectionObject,visRowRulerGrid,visYRulerOrigin  name:YRulerOrigin<p>
   * Value is 5 (0x5)
   */
  public static final Integer visYRulerOrigin = Integer.valueOf(5);

  /**
   * visSectionObject,visRowRulerGrid,visXGridDensity  name:XGridDensity<p>
   * Value is 6 (0x6)
   */
  public static final Integer visXGridDensity = Integer.valueOf(6);

  /**
   * visSectionObject,visRowRulerGrid,visYGridDensity  name:YGridDensity<p>
   * Value is 7 (0x7)
   */
  public static final Integer visYGridDensity = Integer.valueOf(7);

  /**
   * visSectionObject,visRowRulerGrid,visXGridSpacing  name:XGridSpacing<p>
   * Value is 8 (0x8)
   */
  public static final Integer visXGridSpacing = Integer.valueOf(8);

  /**
   * visSectionObject,visRowRulerGrid,visYGridSpacing  name:YGridSpacing<p>
   * Value is 9 (0x9)
   */
  public static final Integer visYGridSpacing = Integer.valueOf(9);

  /**
   * visSectionObject,visRowRulerGrid,visXGridOrigin  name:XGridOrigin<p>
   * Value is 10 (0xA)
   */
  public static final Integer visXGridOrigin = Integer.valueOf(10);

  /**
   * visSectionObject,visRowRulerGrid,visYGridOrigin  name:YGridOrigin<p>
   * Value is 11 (0xB)
   */
  public static final Integer visYGridOrigin = Integer.valueOf(11);

  /**
   * visSectionObject,visRowDoc,visDocOutputFormat  name:OutputFormat<p>
   * Value is 0 (0x0)
   */
  public static final Integer visDocOutputFormat = Integer.valueOf(0);

  /**
   * visSectionObject,visRowDoc,visDocLockPreview  name:LockPreview<p>
   * Value is 1 (0x1)
   */
  public static final Integer visDocLockPreview = Integer.valueOf(1);

  /**
   * Reserved for future use.   visSectionObject,visRowDoc,visDocMetric  name:Metric<p>
   * Value is 2 (0x2)
   */
  public static final Integer visDocMetric = Integer.valueOf(2);

  /**
   * visSectionObject,visRowDoc,visDocAddMarkup  name:AddMarkup<p>
   * Value is 3 (0x3)
   */
  public static final Integer visDocAddMarkup = Integer.valueOf(3);

  /**
   * visSectionObject,visRowDoc,visDocViewMarkup  name:ViewMarkup<p>
   * Value is 4 (0x4)
   */
  public static final Integer visDocViewMarkup = Integer.valueOf(4);

  /**
   * visSectionObject,visRowDoc,visDocPreviewQuality  name:PreviewQuality<p>
   * Value is 9 (0x9)
   */
  public static final Integer visDocPreviewQuality = Integer.valueOf(9);

  /**
   * visSectionObject,visRowDoc,visDocPreviewScope  name:PreviewScope<p>
   * Value is 10 (0xA)
   */
  public static final Integer visDocPreviewScope = Integer.valueOf(10);

  /**
   * visSectionObject,visRowDoc,visDocLangID  name:LangID<p>
   * Value is 19 (0x13)
   */
  public static final Integer visDocLangID = Integer.valueOf(19);

  /**
   * visSectionObject,visRowImage,visImageGamma  name:Gamma<p>
   * Value is 0 (0x0)
   */
  public static final Integer visImageGamma = Integer.valueOf(0);

  /**
   * visSectionObject,visRowImage,visImageContrast  name:Contrast<p>
   * Value is 1 (0x1)
   */
  public static final Integer visImageContrast = Integer.valueOf(1);

  /**
   * visSectionObject,visRowImage,visImageBrightness  name:Brightness<p>
   * Value is 2 (0x2)
   */
  public static final Integer visImageBrightness = Integer.valueOf(2);

  /**
   * visSectionObject,visRowImage,visImageSharpen  name:Sharpen<p>
   * Value is 3 (0x3)
   */
  public static final Integer visImageSharpen = Integer.valueOf(3);

  /**
   * visSectionObject,visRowImage,visImageBlur  name:Blur<p>
   * Value is 4 (0x4)
   */
  public static final Integer visImageBlur = Integer.valueOf(4);

  /**
   * visSectionObject,visRowImage,visImageDenoise  name:Denoise<p>
   * Value is 5 (0x5)
   */
  public static final Integer visImageDenoise = Integer.valueOf(5);

  /**
   * visSectionObject,visRowImage,visImageTransparency  name:Transparency<p>
   * Value is 6 (0x6)
   */
  public static final Integer visImageTransparency = Integer.valueOf(6);

  /**
   * visSectionObject,visRowGroup,visGroupSelectMode  name:SelectMode<p>
   * Value is 0 (0x0)
   */
  public static final Integer visGroupSelectMode = Integer.valueOf(0);

  /**
   * visSectionObject,visRowGroup,visGroupDisplayMode  name:DisplayMode<p>
   * Value is 1 (0x1)
   */
  public static final Integer visGroupDisplayMode = Integer.valueOf(1);

  /**
   * visSectionObject,visRowGroup,visGroupIsDropTarget  name:IsDropTarget<p>
   * Value is 2 (0x2)
   */
  public static final Integer visGroupIsDropTarget = Integer.valueOf(2);

  /**
   * visSectionObject,visRowGroup,visGroupIsSnapTarget  name:IsSnapTarget<p>
   * Value is 3 (0x3)
   */
  public static final Integer visGroupIsSnapTarget = Integer.valueOf(3);

  /**
   * visSectionObject,visRowGroup,visGroupIsTextEditTarget  name:IsTextEditTarget<p>
   * Value is 4 (0x4)
   */
  public static final Integer visGroupIsTextEditTarget = Integer.valueOf(4);

  /**
   * visSectionObject,visRowGroup,visGroupDontMoveChildren  name:DontMoveChildren<p>
   * Value is 5 (0x5)
   */
  public static final Integer visGroupDontMoveChildren = Integer.valueOf(5);

  /**
   * visSectionObject,visRowShapeLayout,visSLOPermX  name:ShapePermeableX<p>
   * Value is 0 (0x0)
   */
  public static final Integer visSLOPermX = Integer.valueOf(0);

  /**
   * visSectionObject,visRowShapeLayout,visSLOPermY  name:ShapePermeableY<p>
   * Value is 1 (0x1)
   */
  public static final Integer visSLOPermY = Integer.valueOf(1);

  /**
   * visSectionObject,visRowShapeLayout,visSLOPermeablePlace  name:ShapePermeablePlace<p>
   * Value is 2 (0x2)
   */
  public static final Integer visSLOPermeablePlace = Integer.valueOf(2);

  /**
   * visSectionObject,visRowShapeLayout,visSLOFixedCode  name:ShapeFixedCode<p>
   * Value is 8 (0x8)
   */
  public static final Integer visSLOFixedCode = Integer.valueOf(8);

  /**
   * visSectionObject,visRowShapeLayout,visSLOPlowCode  name:ShapePlowCode<p>
   * Value is 9 (0x9)
   */
  public static final Integer visSLOPlowCode = Integer.valueOf(9);

  /**
   * visSectionObject,visRowShapeLayout,visSLORouteStyle  name:ShapeRouteStyle<p>
   * Value is 10 (0xA)
   */
  public static final Integer visSLORouteStyle = Integer.valueOf(10);

  /**
   * visSectionObject,visRowShapeLayout,visSLOPlaceStyle  name:ShapePlaceStyle<p>
   * Value is 11 (0xB)
   */
  public static final Integer visSLOPlaceStyle = Integer.valueOf(11);

  /**
   * visSectionObject,visRowShapeLayout,visSLOConFixedCode  name:ConFixedCode<p>
   * Value is 12 (0xC)
   */
  public static final Integer visSLOConFixedCode = Integer.valueOf(12);

  /**
   * visSectionObject,visRowShapeLayout,visSLOJumpCode  name:ConLineJumpCode<p>
   * Value is 13 (0xD)
   */
  public static final Integer visSLOJumpCode = Integer.valueOf(13);

  /**
   * visSectionObject,visRowShapeLayout,visSLOJumpStyle  name:ConLineJumpStyle<p>
   * Value is 14 (0xE)
   */
  public static final Integer visSLOJumpStyle = Integer.valueOf(14);

  /**
   * visSectionObject,visRowShapeLayout,visSLOJumpDirX  name:ConLineJumpDirX<p>
   * Value is 16 (0x10)
   */
  public static final Integer visSLOJumpDirX = Integer.valueOf(16);

  /**
   * visSectionObject,visRowShapeLayout,visSLOJumpDirY  name:ConLineJumpDirY<p>
   * Value is 17 (0x11)
   */
  public static final Integer visSLOJumpDirY = Integer.valueOf(17);

  /**
   * visSectionObject,visRowShapeLayout,visSLOPlaceFlip  name:ShapePlaceFlip<p>
   * Value is 18 (0x12)
   */
  public static final Integer visSLOPlaceFlip = Integer.valueOf(18);

  /**
   * visSectionObject,visRowShapeLayout,visSLOLineRouteExt  name:ConLineRouteExt<p>
   * Value is 19 (0x13)
   */
  public static final Integer visSLOLineRouteExt = Integer.valueOf(19);

  /**
   * visSectionObject,visRowShapeLayout,visSLOLineRouteExt  name:ShapeSplit<p>
   * Value is 20 (0x14)
   */
  public static final Integer visSLOSplit = Integer.valueOf(20);

  /**
   * visSectionObject,visRowShapeLayout,visSLOLineRouteExt  name:ShapeSplittable<p>
   * Value is 21 (0x15)
   */
  public static final Integer visSLOSplittable = Integer.valueOf(21);

  /**
   * visSectionObject,visRowPageLayout,visPLOResizePage  name:ResizePage<p>
   * Value is 0 (0x0)
   */
  public static final Integer visPLOResizePage = Integer.valueOf(0);

  /**
   * visSectionObject,visRowPageLayout,visPLOEnableGrid  name:EnableGrid<p>
   * Value is 1 (0x1)
   */
  public static final Integer visPLOEnableGrid = Integer.valueOf(1);

  /**
   * visSectionObject,visRowPageLayout,visPLODynamicsOff  name:DynamicsOff<p>
   * Value is 2 (0x2)
   */
  public static final Integer visPLODynamicsOff = Integer.valueOf(2);

  /**
   * visSectionObject,visRowPageLayout,visPLOCtrlAsInput  name:CtrlAsInput<p>
   * Value is 3 (0x3)
   */
  public static final Integer visPLOCtrlAsInput = Integer.valueOf(3);

  /**
   * visSectionObject,visRowPageLayout,visPLOPlaceStyle  name:PlaceStyle<p>
   * Value is 8 (0x8)
   */
  public static final Integer visPLOPlaceStyle = Integer.valueOf(8);

  /**
   * visSectionObject,visRowPageLayout,visPLORouteStyle  name:RouteStyle<p>
   * Value is 9 (0x9)
   */
  public static final Integer visPLORouteStyle = Integer.valueOf(9);

  /**
   * visSectionObject,visRowPageLayout,visPLOPlaceDepth  name:PlaceDepth<p>
   * Value is 10 (0xA)
   */
  public static final Integer visPLOPlaceDepth = Integer.valueOf(10);

  /**
   * visSectionObject,visRowPageLayout,visPLOPlowCode  name:PlowCode<p>
   * Value is 11 (0xB)
   */
  public static final Integer visPLOPlowCode = Integer.valueOf(11);

  /**
   * visSectionObject,visRowPageLayout,visPLOJumpCode  name:LineJumpCode<p>
   * Value is 12 (0xC)
   */
  public static final Integer visPLOJumpCode = Integer.valueOf(12);

  /**
   * visSectionObject,visRowPageLayout,visPLOJumpStyle  name:LineJumpStyle<p>
   * Value is 13 (0xD)
   */
  public static final Integer visPLOJumpStyle = Integer.valueOf(13);

  /**
   * visSectionObject,visRowPageLayout,visPLOJumpDirX  name:PageLineJumpDirX<p>
   * Value is 14 (0xE)
   */
  public static final Integer visPLOJumpDirX = Integer.valueOf(14);

  /**
   * visSectionObject,visRowPageLayout,visPLOJumpDirY  name:PageLineJumpDirY<p>
   * Value is 15 (0xF)
   */
  public static final Integer visPLOJumpDirY = Integer.valueOf(15);

  /**
   * visSectionObject,visRowPageLayout,visPLOLineToNodeX  name:LineToNodeX<p>
   * Value is 16 (0x10)
   */
  public static final Integer visPLOLineToNodeX = Integer.valueOf(16);

  /**
   * visSectionObject,visRowPageLayout,visPLOLineToNodeY  name:LineToNodeY<p>
   * Value is 17 (0x11)
   */
  public static final Integer visPLOLineToNodeY = Integer.valueOf(17);

  /**
   * visSectionObject,visRowPageLayout,visPLOBlockSizeX  name:BlockSizeX<p>
   * Value is 18 (0x12)
   */
  public static final Integer visPLOBlockSizeX = Integer.valueOf(18);

  /**
   * visSectionObject,visRowPageLayout,visPLOBlockSizeY  name:BlockSizeY<p>
   * Value is 19 (0x13)
   */
  public static final Integer visPLOBlockSizeY = Integer.valueOf(19);

  /**
   * visSectionObject,visRowPageLayout,visPLOAvenueSizeX  name:AvenueSizeX<p>
   * Value is 20 (0x14)
   */
  public static final Integer visPLOAvenueSizeX = Integer.valueOf(20);

  /**
   * visSectionObject,visRowPageLayout,visPLOAvenueSizeY  name:AvenueSizeY<p>
   * Value is 21 (0x15)
   */
  public static final Integer visPLOAvenueSizeY = Integer.valueOf(21);

  /**
   * visSectionObject,visRowPageLayout,visPLOLineToLineX  name:LineToLineX<p>
   * Value is 22 (0x16)
   */
  public static final Integer visPLOLineToLineX = Integer.valueOf(22);

  /**
   * visSectionObject,visRowPageLayout,visPLOLineToLineY  name:LineToLineY<p>
   * Value is 23 (0x17)
   */
  public static final Integer visPLOLineToLineY = Integer.valueOf(23);

  /**
   * visSectionObject,visRowPageLayout,visPLOJumpFactorX  name:LineJumpFactorX<p>
   * Value is 24 (0x18)
   */
  public static final Integer visPLOJumpFactorX = Integer.valueOf(24);

  /**
   * visSectionObject,visRowPageLayout,visPLOJumpFactorY  name:LineJumpFactorY<p>
   * Value is 25 (0x19)
   */
  public static final Integer visPLOJumpFactorY = Integer.valueOf(25);

  /**
   * visSectionObject,visRowPageLayout,visPLOLineAdjustFrom  name:LineAdjustFrom<p>
   * Value is 26 (0x1A)
   */
  public static final Integer visPLOLineAdjustFrom = Integer.valueOf(26);

  /**
   * visSectionObject,visRowPageLayout,visPLOLineAdjustTo  name:LineAdjustTo<p>
   * Value is 27 (0x1B)
   */
  public static final Integer visPLOLineAdjustTo = Integer.valueOf(27);

  /**
   * visSectionObject,visRowPageLayout,visPLOPlaceFlip  name:PlaceFlip<p>
   * Value is 28 (0x1C)
   */
  public static final Integer visPLOPlaceFlip = Integer.valueOf(28);

  /**
   * visSectionObject,visRowPageLayout,visPLOLineRouteExt  name:LineRouteExt<p>
   * Value is 29 (0x1D)
   */
  public static final Integer visPLOLineRouteExt = Integer.valueOf(29);

  /**
   * visSectionObject,visRowPageLayout,visPLOSplit  name:ShapeSplit<p>
   * Value is 30 (0x1E)
   */
  public static final Integer visPLOSplit = Integer.valueOf(30);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterFont  name:Char.Font[i] i=<1>,2,3,...<p>
   * Value is 0 (0x0)
   */
  public static final Integer visCharacterFont = Integer.valueOf(0);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterColor  name:Char.Color[i] i=<1>,2,3,...<p>
   * Value is 1 (0x1)
   */
  public static final Integer visCharacterColor = Integer.valueOf(1);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterStyle  name:Char.Style[i] i=<1>,2,3,...<p>
   * Value is 2 (0x2)
   */
  public static final Integer visCharacterStyle = Integer.valueOf(2);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterCase  name:Char.Case[i] i=<1>,2,3,...<p>
   * Value is 3 (0x3)
   */
  public static final Integer visCharacterCase = Integer.valueOf(3);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterPos  name:Char.Pos[i] i=<1>,2,3,...<p>
   * Value is 4 (0x4)
   */
  public static final Integer visCharacterPos = Integer.valueOf(4);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterFontScale  name:Char.FontScale[i] i=<1>,2,3,...<p>
   * Value is 5 (0x5)
   */
  public static final Integer visCharacterFontScale = Integer.valueOf(5);

  /**
   * Obsolete starting with Visio 2003.<p>
   * Value is 6 (0x6)
   */
  public static final Integer visCharacterLocale = Integer.valueOf(6);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterSize  name:Char.Size[i] i=<1>,2,3,...<p>
   * Value is 7 (0x7)
   */
  public static final Integer visCharacterSize = Integer.valueOf(7);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterDblUnderline  name:Char.DblUnderline[i] i=<1>,2,3,...<p>
   * Value is 8 (0x8)
   */
  public static final Integer visCharacterDblUnderline = Integer.valueOf(8);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterOverline  name:Char.Overline[i] i=<1>,2,3,...<p>
   * Value is 9 (0x9)
   */
  public static final Integer visCharacterOverline = Integer.valueOf(9);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterStrikethru  name:Char.Strikethru[i] i=<1>,2,3,...<p>
   * Value is 10 (0xA)
   */
  public static final Integer visCharacterStrikethru = Integer.valueOf(10);

  /**
   * Obsolete starting with Visio 2003.<p>
   * Value is 12 (0xC)
   */
  public static final Integer visCharacterPerpendicular = Integer.valueOf(12);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterDoubleStrikethrough  name:Char.DoubleStrikethrough[i] i=<1>,2,3,...<p>
   * Value is 13 (0xD)
   */
  public static final Integer visCharacterDoubleStrikethrough = Integer.valueOf(13);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterRTLText  name:Char.RTLText[i] i=<1>,2,3,...<p>
   * Value is 14 (0xE)
   */
  public static final Integer visCharacterRTLText = Integer.valueOf(14);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterUseVertical  name:Char.UseVertical[i] i=<1>,2,3,...<p>
   * Value is 15 (0xF)
   */
  public static final Integer visCharacterUseVertical = Integer.valueOf(15);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterLetterspace  name:Char.Letterspace[i] i=<1>,2,3,...<p>
   * Value is 16 (0x10)
   */
  public static final Integer visCharacterLetterspace = Integer.valueOf(16);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterColorTrans  name:Char.ColorTrans[i] i=<1>,2,3,...<p>
   * Value is 17 (0x11)
   */
  public static final Integer visCharacterColorTrans = Integer.valueOf(17);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterAsianFont  name:Char.AsianFont[i] i=<1>,2,3,...<p>
   * Value is 51 (0x33)
   */
  public static final Integer visCharacterAsianFont = Integer.valueOf(51);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterComplexScriptFont  name:Char.ComplexScriptFont[i] i=<1>,2,3,...<p>
   * Value is 52 (0x34)
   */
  public static final Integer visCharacterComplexScriptFont = Integer.valueOf(52);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterLocalizeFont  name:Char.LocalizeFont[i] i=<1>,2,3,...<p>
   * Value is 53 (0x35)
   */
  public static final Integer visCharacterLocalizeFont = Integer.valueOf(53);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterComplexScriptSize  name:Char.ComplexScriptSize[i] i=<1>,2,3,...<p>
   * Value is 54 (0x36)
   */
  public static final Integer visCharacterComplexScriptSize = Integer.valueOf(54);

  /**
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterLangID  name:Char.LangID[i] i=<1>,2,3,...<p>
   * Value is 57 (0x39)
   */
  public static final Integer visCharacterLangID = Integer.valueOf(57);

  /**
   * visSectionParagraph,visRowParagraph+(i-1),visIndentFirst  name:Para.IndFirst[i] i=<1>,2,3,...<p>
   * Value is 0 (0x0)
   */
  public static final Integer visIndentFirst = Integer.valueOf(0);

  /**
   * visSectionParagraph,visRowParagraph+(i-1),visIndentLeft  name:Para.IndLeft[i] i=<1>,2,3,...<p>
   * Value is 1 (0x1)
   */
  public static final Integer visIndentLeft = Integer.valueOf(1);

  /**
   * visSectionParagraph,visRowParagraph+(i-1),visIndentRight  name:Para.IndRight[i] i=<1>,2,3,...<p>
   * Value is 2 (0x2)
   */
  public static final Integer visIndentRight = Integer.valueOf(2);

  /**
   * visSectionParagraph,visRowParagraph+(i-1),visSpaceLine  name:Para.SpLine[i] i=<1>,2,3,...<p>
   * Value is 3 (0x3)
   */
  public static final Integer visSpaceLine = Integer.valueOf(3);

  /**
   * visSectionParagraph,visRowParagraph+(i-1),visSpaceBefore  name:Para.SpBefore[i] i=<1>,2,3,...<p>
   * Value is 4 (0x4)
   */
  public static final Integer visSpaceBefore = Integer.valueOf(4);

  /**
   * visSectionParagraph,visRowParagraph+(i-1),visSpaceAfter  name:Para.SpAfter[i] i=<1>,2,3,...<p>
   * Value is 5 (0x5)
   */
  public static final Integer visSpaceAfter = Integer.valueOf(5);

  /**
   * visSectionParagraph,visRowParagraph+(i-1),visHorzAlign  name:Para.HorzAlign[i] i=<1>,2,3,...<p>
   * Value is 6 (0x6)
   */
  public static final Integer visHorzAlign = Integer.valueOf(6);

  /**
   * visSectionParagraph,visRowParagraph+(i-1),visBulletIndex  name:Para.Bullet[i] i=<1>,2,3,...<p>
   * Value is 7 (0x7)
   */
  public static final Integer visBulletIndex = Integer.valueOf(7);

  /**
   * visSectionParagraph,visRowParagraph+(i-1),visBulletString  name:Para.BulletStr[i] i=<1>,2,3,...<p>
   * Value is 8 (0x8)
   */
  public static final Integer visBulletString = Integer.valueOf(8);

  /**
   * visSectionParagraph,visRowParagraph+(i=1),visBulletFont  name:Para.BulletFont[i] i=<1>,2,3,...<p>
   * Value is 9 (0x9)
   */
  public static final Integer visBulletFont = Integer.valueOf(9);

  /**
   * visSectionParagraph,visRowParagraph+(i=1),visLocalizeBulletFont  name:Para.LocalizeBulletFont[i] i=<1>,2,3,...<p>
   * Value is 10 (0xA)
   */
  public static final Integer visLocalizeBulletFont = Integer.valueOf(10);

  /**
   * visSectionParagraph,visRowParagraph+(i=1),visBulletFontSize  name:Para.BulletFontSize[i] i=<1>,2,3,...<p>
   * Value is 11 (0xB)
   */
  public static final Integer visBulletFontSize = Integer.valueOf(11);

  /**
   * visSectionParagraph,visRowParagraph+(i=1),visTextPosAfterBullet  name:Para.TextPosAfterBullet[i] i=<1>,2,3,...<p>
   * Value is 12 (0xC)
   */
  public static final Integer visTextPosAfterBullet = Integer.valueOf(12);

  /**
   * visSectionParagraph,visRowParagraph+(i=1),visFlags  name:Para.Flags[i] i=<1>,2,3,...<p>
   * Value is 13 (0xD)
   */
  public static final Integer visFlags = Integer.valueOf(13);

  /**
   * visSectionTab,visRowTab+i,visTabStopCount  # of stops in row i, i>0.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visTabStopCount = Integer.valueOf(0);

  /**
   * visSectionTab,visRowTab+i  Position of stop j in row i is in cell ((j-1)*3)+visTabPos.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visTabPos = Integer.valueOf(1);

  /**
   * visSectionTab,visRowTab+i  Alignment of stop j in row i is in cell ((j-1)*3)+visTabAlign.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visTabAlign = Integer.valueOf(2);

  /**
   * visSectionScratch,visRowScratch+(i-1),visScratchX  name:Scratch.Xi i>0<p>
   * Value is 0 (0x0)
   */
  public static final Integer visScratchX = Integer.valueOf(0);

  /**
   * visSectionScratch,visRowScratch+(i-1),visScratchY  name:Scratch.Yi i>0<p>
   * Value is 1 (0x1)
   */
  public static final Integer visScratchY = Integer.valueOf(1);

  /**
   * visSectionScratch,visRowScratch+(i-1),visScratchA  name:Scratch.Ai i>0<p>
   * Value is 2 (0x2)
   */
  public static final Integer visScratchA = Integer.valueOf(2);

  /**
   * visSectionScratch,visRowScratch+(i-1),visScratchB  name:Scratch.Bi i>0<p>
   * Value is 3 (0x3)
   */
  public static final Integer visScratchB = Integer.valueOf(3);

  /**
   * visSectionScratch,visRowScratch+(i-1),visScratchC  name:Scratch.Ci i>0<p>
   * Value is 4 (0x4)
   */
  public static final Integer visScratchC = Integer.valueOf(4);

  /**
   * visSectionScratch,visRowScratch+(i-1),visScratchD  name:Scratch.Di i>0<p>
   * Value is 5 (0x5)
   */
  public static final Integer visScratchD = Integer.valueOf(5);

  /**
   * visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctX  name:Connections.Xi i>0<p>
   * Value is 0 (0x0)
   */
  public static final Integer visCnnctX = Integer.valueOf(0);

  /**
   * visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctY  name:Connections.Yi i>0<p>
   * Value is 1 (0x1)
   */
  public static final Integer visCnnctY = Integer.valueOf(1);

  /**
   * rowtype:visTagCnnct[Pt|Named]  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctDirX  name:Connections.DirX[i] i=<1>,2,3,...<p>
   * Value is 2 (0x2)
   */
  public static final Integer visCnnctDirX = Integer.valueOf(2);

  /**
   * rowtype:visTagCnnct[Pt|Named]  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctDirY  name:Connections.DirY[i] i=<1>,2,3,...<p>
   * Value is 3 (0x3)
   */
  public static final Integer visCnnctDirY = Integer.valueOf(3);

  /**
   * rowtype:visTagCnnct[Pt|Named]  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctType  name:Connections.Type[i] i=<1>,2,3,...<p>
   * Value is 4 (0x4)
   */
  public static final Integer visCnnctType = Integer.valueOf(4);

  /**
   * rowtype:visTagCnnct[Pt|Named]  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctAutoGen  name:Connections.AutoGen[i] i=<1>,2,3,...<p>
   * Value is 5 (0x5)
   */
  public static final Integer visCnnctAutoGen = Integer.valueOf(5);

  /**
   * rowtype:visTagCnnct[Pt|Named]ABCD  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctA  name:Connections.Ai i>0  (Seldom used in practice)<p>
   * Value is 2 (0x2)
   */
  public static final Integer visCnnctA = Integer.valueOf(2);

  /**
   * rowtype:visTagCnnct[Pt|Named]ABCD  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctB  name:Connections.Bi i>0  (Seldom used in practice)<p>
   * Value is 3 (0x3)
   */
  public static final Integer visCnnctB = Integer.valueOf(3);

  /**
   * rowtype:visTagCnnct[Pt|Named]ABCD  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctC  name:Connections.Ci i>0  (Seldom used in practice)<p>
   * Value is 4 (0x4)
   */
  public static final Integer visCnnctC = Integer.valueOf(4);

  /**
   * rowtype:visTagCnnct[Pt|Named]ABCD  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctD  name:Connections.Di i>0  (Seldom used in practice)<p>
   * Value is 5 (0x5)
   */
  public static final Integer visCnnctD = Integer.valueOf(5);

  /**
   * visSectionTextField,visRowField+(i-1),visFieldCell  name:Fields.Value[i] i=<1>,2,3,...<p>
   * Value is 0 (0x0)
   */
  public static final Integer visFieldCell = Integer.valueOf(0);

  /**
   * visSectionTextField,visRowField+(i-1),visFieldEditMode  name:Fields.EditMode[i] i=<1>,2,3,...<p>
   * Value is 1 (0x1)
   */
  public static final Integer visFieldEditMode = Integer.valueOf(1);

  /**
   * visSectionTextField,visRowField+(i-1),visFieldFormat  name:Fields.Format[i] i=<1>,2,3,...<p>
   * Value is 2 (0x2)
   */
  public static final Integer visFieldFormat = Integer.valueOf(2);

  /**
   * visSectionTextField,visRowField+(i-1),visFieldType  name:Fields.Type[i] i=<1>,2,3,...<p>
   * Value is 3 (0x3)
   */
  public static final Integer visFieldType = Integer.valueOf(3);

  /**
   * visSectionTextField,visRowField+(i-1),visFieldUICategory  name:Fields.UICat[i] i=<1>,2,3,...<p>
   * Value is 4 (0x4)
   */
  public static final Integer visFieldUICategory = Integer.valueOf(4);

  /**
   * visSectionTextField,visRowField+(i-1),visFieldUICode  name:Fields.UICod[i] i=<1>,2,3,...<p>
   * Value is 5 (0x5)
   */
  public static final Integer visFieldUICode = Integer.valueOf(5);

  /**
   * visSectionTextField,visRowField+(i-1),visFieldUIFormat  name:Fields.UIFmt[i] i=<1>,2,3,...<p>
   * Value is 6 (0x6)
   */
  public static final Integer visFieldUIFormat = Integer.valueOf(6);

  /**
   * visSectionTextField,visRowField+(i-1),visFieldCalendar  name:Fields.Calendar[i] i=<1>,2,3,...<p>
   * Value is 7 (0x7)
   */
  public static final Integer visFieldCalendar = Integer.valueOf(7);

  /**
   * visSectionTextField,visRowField+(i-1),visFieldObjectKind  name:Fields.ObjectKind[i] i=<1>,2,3,...<p>
   * Value is 10 (0xA)
   */
  public static final Integer visFieldObjectKind = Integer.valueOf(10);

  /**
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlX  name:Controls.Xi i>0<p>
   * Value is 0 (0x0)
   */
  public static final Integer visCtlX = Integer.valueOf(0);

  /**
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlY  name:Controls.Yi i>0<p>
   * Value is 1 (0x1)
   */
  public static final Integer visCtlY = Integer.valueOf(1);

  /**
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlXDyn  name:Controls.XDyn[i] i=<1>,2,3,...<p>
   * Value is 2 (0x2)
   */
  public static final Integer visCtlXDyn = Integer.valueOf(2);

  /**
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlYDyn  name:Controls.YDyn[i] i=<1>,2,3,...<p>
   * Value is 3 (0x3)
   */
  public static final Integer visCtlYDyn = Integer.valueOf(3);

  /**
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlXCon  name:Controls.XCon[i] i=<1>,2,3,...<p>
   * Value is 4 (0x4)
   */
  public static final Integer visCtlXCon = Integer.valueOf(4);

  /**
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlYCon  name:Controls.YCon[i] i=<1>,2,3,...<p>
   * Value is 5 (0x5)
   */
  public static final Integer visCtlYCon = Integer.valueOf(5);

  /**
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlGlue  name:Controls.CanGlue[i] i=<1>,2,3,...<p>
   * Value is 6 (0x6)
   */
  public static final Integer visCtlGlue = Integer.valueOf(6);

  /**
   * Reserved for future use<p>
   * Value is 7 (0x7)
   */
  public static final Integer visCtlType = Integer.valueOf(7);

  /**
   * rowtype:visTagCtlPtTip  visSectionControls,visRowControl+(i-1),visCtlTip  name:Controls.Prompt[i] i=<1>,2,3,...<p>
   * Value is 8 (0x8)
   */
  public static final Integer visCtlTip = Integer.valueOf(8);

  /**
   * rowtype:visTagComponent  visSectionFirstComponent+(i-1),visRowComponent,visCompNoFill  name:Geometryi.NoFill i>0<p>
   * Value is 0 (0x0)
   */
  public static final Integer visCompNoFill = Integer.valueOf(0);

  /**
   * rowtype:visTagComponent  visSectionFirstComponent+(i-1),visRowComponent,visCompNoLine  name:Geometryi.NoLine i>0<p>
   * Value is 1 (0x1)
   */
  public static final Integer visCompNoLine = Integer.valueOf(1);

  /**
   * rowtype:visTagComponent  visSectionFirstComponent+(i-1),visRowComponent,visCompNoShow  name:Geometryi.NoShow i>0<p>
   * Value is 2 (0x2)
   */
  public static final Integer visCompNoShow = Integer.valueOf(2);

  /**
   * rowtype:visTagComponent  visSectionFirstComponent+(i-1),visRowComponent,visCompNoSnap  name:Geometryi.NoSnap i>0<p>
   * Value is 3 (0x3)
   */
  public static final Integer visCompNoSnap = Integer.valueOf(3);

  /**
   * rowtype:visTagComponent  visSectionFirstComponent+(i-1),visRowComponent,visCompPath  name:Geometryi.Path i>0<p>
   * Value is 4 (0x4)
   */
  public static final Integer visCompPath = Integer.valueOf(4);

  /**
   * visSectionFirstComponent+(i-1),j,visX  name:Geometryi.Xj i>0, j>=visRowVertex<p>
   * Value is 0 (0x0)
   */
  public static final Integer visX = Integer.valueOf(0);

  /**
   * visSectionFirstComponent+(i-1),j,visY  name:Geometryi.Yj i>0, j>=visRowVertex<p>
   * Value is 1 (0x1)
   */
  public static final Integer visY = Integer.valueOf(1);

  /**
   * rowtype:visTagArcTo  visSectionFirstComponent+(i-1),j,visBow  name:Geometryi.Aj i>0, j>visRowVertex<p>
   * Value is 2 (0x2)
   */
  public static final Integer visBow = Integer.valueOf(2);

  /**
   * rowtype:visTagInfiniteLine  visSectionFirstComponent+(i-1),visRowVertex,visInfiniteLineX1  name:Geometryi.X1 i>0<p>
   * Value is 0 (0x0)
   */
  public static final Integer visInfiniteLineX1 = Integer.valueOf(0);

  /**
   * rowtype:visTagInfiniteLine  visSectionFirstComponent+(i-1),visRowVertex,visInfiniteLineY1  name:Geometryi.Y1 i>0<p>
   * Value is 1 (0x1)
   */
  public static final Integer visInfiniteLineY1 = Integer.valueOf(1);

  /**
   * rowtype:visTagInfiniteLine  visSectionFirstComponent+(i-1),visRowVertex,visInfiniteLineX2  name:Geometryi.A1 i>0<p>
   * Value is 2 (0x2)
   */
  public static final Integer visInfiniteLineX2 = Integer.valueOf(2);

  /**
   * rowtype:visTagInfiniteLine  visSectionFirstComponent+(i-1),visRowVertex,visInfiniteLineY2  name:Geometryi.B1 i>0<p>
   * Value is 3 (0x3)
   */
  public static final Integer visInfiniteLineY2 = Integer.valueOf(3);

  /**
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseCenterX  name:Geometryi.X1 i>0<p>
   * Value is 0 (0x0)
   */
  public static final Integer visEllipseCenterX = Integer.valueOf(0);

  /**
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseCenterY  name:Geometryi.Y1 i>0<p>
   * Value is 1 (0x1)
   */
  public static final Integer visEllipseCenterY = Integer.valueOf(1);

  /**
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseMajorX  name:Geometryi.A1 i>0<p>
   * Value is 2 (0x2)
   */
  public static final Integer visEllipseMajorX = Integer.valueOf(2);

  /**
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseMajorY  name:Geometryi.B1 i>0<p>
   * Value is 3 (0x3)
   */
  public static final Integer visEllipseMajorY = Integer.valueOf(3);

  /**
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseMinorX  name:Geometryi.C1 i>0<p>
   * Value is 4 (0x4)
   */
  public static final Integer visEllipseMinorX = Integer.valueOf(4);

  /**
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseMinorY  name:Geometryi.D1 i>0<p>
   * Value is 5 (0x5)
   */
  public static final Integer visEllipseMinorY = Integer.valueOf(5);

  /**
   * rowtype:visTagEllipticalArcTo  visSectionFirstComponent+(i-1),j,visControlX  name:Geometryi.Aj i>0, j>visRowVertex<p>
   * Value is 2 (0x2)
   */
  public static final Integer visControlX = Integer.valueOf(2);

  /**
   * rowtype:visTagEllipticalArcTo  visSectionFirstComponent+(i-1),j,visControlY  name:Geometryi.Bj i>0, j>visRowVertex<p>
   * Value is 3 (0x3)
   */
  public static final Integer visControlY = Integer.valueOf(3);

  /**
   * rowtype:visTagEllipticalArcTo  visSectionFirstComponent+(i-1),j,visEccentricityAngle  name:Geometryi.Cj i>0, j>visRowVertex<p>
   * Value is 4 (0x4)
   */
  public static final Integer visEccentricityAngle = Integer.valueOf(4);

  /**
   * rowtype:visTagEllipticalArcTo  visSectionFirstComponent+(i-1),j,visAspectRatio  name:Geometryi.Dj i>0, j>visRowVertex<p>
   * Value is 5 (0x5)
   */
  public static final Integer visAspectRatio = Integer.valueOf(5);

  /**
   * rowtype:visTagSplineBeg|Span  visSectionFirstComponent+(i-1),j,visSplineKnot  name:Geometryi.Aj i>0, j>visRowVertex<p>
   * Value is 2 (0x2)
   */
  public static final Integer visSplineKnot = Integer.valueOf(2);

  /**
   * rowtype:visTagSplineBeg  visSectionFirstComponent+(i-1),j,visSplineKnot2  name:Geometryi.Bj i>0, j>visRowVertex<p>
   * Value is 3 (0x3)
   */
  public static final Integer visSplineKnot2 = Integer.valueOf(3);

  /**
   * rowtype:visTagSplineBeg  visSectionFirstComponent+(i-1),j,visSplineKnot3  name:Geometryi.Cj i>0, j>visRowVertex<p>
   * Value is 4 (0x4)
   */
  public static final Integer visSplineKnot3 = Integer.valueOf(4);

  /**
   * rowtype:visTagSplineBeg  visSectionFirstComponent+(i-1),j,visSplineDegree  name:Geometryi.Dj i>0, j>visRowVertex<p>
   * Value is 5 (0x5)
   */
  public static final Integer visSplineDegree = Integer.valueOf(5);

  /**
   * rowtype:visTagPolylineTo  visSectionFirstComponent+(i-1),j,visPolylineData  name:Geometryi.Aj i>0, j>visRowVertex<p>
   * Value is 2 (0x2)
   */
  public static final Integer visPolylineData = Integer.valueOf(2);

  /**
   * rowtype:visTagNURBSTo  visSectionFirstComponent+(i-1),j,visNURBSKnot  name:Geometryi.Aj i>0, j>visRowVertex<p>
   * Value is 2 (0x2)
   */
  public static final Integer visNURBSKnot = Integer.valueOf(2);

  /**
   * rowtype:visTagNURBSTo  visSectionFirstComponent+(i-1),j,visNURBSWeight  name:Geometryi.Bj i>0, j>visRowVertex<p>
   * Value is 3 (0x3)
   */
  public static final Integer visNURBSWeight = Integer.valueOf(3);

  /**
   * rowtype:visTagNURBSTo  visSectionFirstComponent+(i-1),j,visNURBSKnotPrev  name:Geometryi.Cj i>0, j>visRowVertex<p>
   * Value is 4 (0x4)
   */
  public static final Integer visNURBSKnotPrev = Integer.valueOf(4);

  /**
   * rowtype:visTagNURBSTo  visSectionFirstComponent+(i-1),j,visNURBSWeightPrev  name:Geometryi.Dj i>0, j>visRowVertex<p>
   * Value is 5 (0x5)
   */
  public static final Integer visNURBSWeightPrev = Integer.valueOf(5);

  /**
   * rowtype:visTagNURBSTo  visSectionFirstComponent+(i-1),j,visNURBSData  name:Geometryi.Ej i>0, j>visRowVertex<p>
   * Value is 6 (0x6)
   */
  public static final Integer visNURBSData = Integer.valueOf(6);

  /**
   * visSectionAction,visRowAction+(i-1),visActionMenu  name:Actions.Menu[i] i=<1>,2,3,...<p>
   * Value is 0 (0x0)
   */
  public static final Integer visActionMenu = Integer.valueOf(0);

  /**
   * Obsolete as of Visio 2002.   visSectionAction,visRowAction+(i-1),visActionPrompt  name:Actions.Prompt[i] i=<1>,2,3,...<p>
   * Value is 1 (0x1)
   */
  public static final Integer visActionPrompt = Integer.valueOf(1);

  /**
   * Reserved for future use<p>
   * Value is 2 (0x2)
   */
  public static final Integer visActionHelp = Integer.valueOf(2);

  /**
   * visSectionAction,visRowAction+(i-1),visActionAction  name:Actions.Action[i] i=<1>,2,3,...<p>
   * Value is 3 (0x3)
   */
  public static final Integer visActionAction = Integer.valueOf(3);

  /**
   * visSectionAction,visRowAction+(i-1),visActionChecked  name:Actions.Ci i>0<p>
   * Value is 4 (0x4)
   */
  public static final Integer visActionChecked = Integer.valueOf(4);

  /**
   * visSectionAction,visRowAction+(i-1),visActionDisabled  name:Actions.Di i>0<p>
   * Value is 5 (0x5)
   */
  public static final Integer visActionDisabled = Integer.valueOf(5);

  /**
   * visSectionAction,visRowAction+(i-1),visActionReadOnly  name:Actions.ReadOnly i>0<p>
   * Value is 6 (0x6)
   */
  public static final Integer visActionReadOnly = Integer.valueOf(6);

  /**
   * visSectionAction,visRowAction+(i-1),visActionInvisible  name:Actions.Invisible i>0<p>
   * Value is 7 (0x7)
   */
  public static final Integer visActionInvisible = Integer.valueOf(7);

  /**
   * visSectionAction,visRowAction+(i-1),visActionBeginGroup  name:Actions.BeginGroup i>0<p>
   * Value is 8 (0x8)
   */
  public static final Integer visActionBeginGroup = Integer.valueOf(8);

  /**
   * visSectionAction,visRowAction+(i-1),visActionTagName  name:Actions.TagName i>0<p>
   * Value is 14 (0xE)
   */
  public static final Integer visActionTagName = Integer.valueOf(14);

  /**
   * visSectionAction,visRowAction+(i-1),visActionButtonFace  name:Actions.ButtonFace i>0<p>
   * Value is 15 (0xF)
   */
  public static final Integer visActionButtonFace = Integer.valueOf(15);

  /**
   * visSectionAction,visRowAction+(i-1),visActionSortKey  name:Actions.SortKey i>0<p>
   * Value is 16 (0x10)
   */
  public static final Integer visActionSortKey = Integer.valueOf(16);

  /**
   * visSectionLayer,visRowLayer+(i-1),visLayerName  name:Layers.Name[i] i=<1>,2,3,...<p>
   * Value is 0 (0x0)
   */
  public static final Integer visLayerName = Integer.valueOf(0);

  /**
   * visSectionLayer,visRowLayer+(i-1),visLayerColor  name:Layers.Color[i] i=<1>,2,3,...<p>
   * Value is 2 (0x2)
   */
  public static final Integer visLayerColor = Integer.valueOf(2);

  /**
   * visSectionLayer,visRowLayer+(i-1),visLayerStatus  name:Layers.Status[i] i=<1>,2,3,...<p>
   * Value is 3 (0x3)
   */
  public static final Integer visLayerStatus = Integer.valueOf(3);

  /**
   * visSectionLayer,visRowLayer+(i-1),visLayerVisible  name:Layers.Visible[i] i=<1>,2,3,...<p>
   * Value is 4 (0x4)
   */
  public static final Integer visLayerVisible = Integer.valueOf(4);

  /**
   * visSectionLayer,visRowLayer+(i-1),visLayerPrint  name:Layers.Print[i] i=<1>,2,3,...<p>
   * Value is 5 (0x5)
   */
  public static final Integer visLayerPrint = Integer.valueOf(5);

  /**
   * visSectionLayer,visRowLayer+(i-1),visLayerActive  name:Layers.Active[i] i=<1>,2,3,...<p>
   * Value is 6 (0x6)
   */
  public static final Integer visLayerActive = Integer.valueOf(6);

  /**
   * visSectionLayer,visRowLayer+(i-1),visLayerLock  name:Layers.Locked[i] i=<1>,2,3,...<p>
   * Value is 7 (0x7)
   */
  public static final Integer visLayerLock = Integer.valueOf(7);

  /**
   * visSectionLayer,visRowLayer+(i-1),visLayerSnap  name:Layers.Snap[i] i=<1>,2,3,...<p>
   * Value is 8 (0x8)
   */
  public static final Integer visLayerSnap = Integer.valueOf(8);

  /**
   * visSectionLayer,visRowLayer+(i-1),visLayerGlue  name:Layers.Glue[i] i=<1>,2,3,...<p>
   * Value is 9 (0x9)
   */
  public static final Integer visLayerGlue = Integer.valueOf(9);

  /**
   * visSectionLayer,visRowLayer+(i-1),visLayerNameUniv  name:Layers.NameUniv[i] i=<1>,2,3,...<p>
   * Value is 10 (0xA)
   */
  public static final Integer visLayerNameUniv = Integer.valueOf(10);

  /**
   * visSectionLayer,visRowLayer+(i-1),visLayerColorTrans  name:Layers.ColorTrans[i] i=<1>,2,3,...<p>
   * Value is 11 (0xB)
   */
  public static final Integer visLayerColorTrans = Integer.valueOf(11);

  /**
   * visSectionUser,visRowUser+i,visUserValue  name:name:User.<rowname> i>=0<p>
   * Value is 0 (0x0)
   */
  public static final Integer visUserValue = Integer.valueOf(0);

  /**
   * visSectionUser,visRowUser+i,visUserPrompt  name:name:User.<rowname>.Prompt i>=0<p>
   * Value is 1 (0x1)
   */
  public static final Integer visUserPrompt = Integer.valueOf(1);

  /**
   * visSectionProp,visRowProp+i,visCustPropsValue  name:name:Prop.<rowname> i>=0<p>
   * Value is 0 (0x0)
   */
  public static final Integer visCustPropsValue = Integer.valueOf(0);

  /**
   * visSectionProp,visRowProp+i,visCustPropsPrompt  name:name:Prop.<rowname>.Prompt i>=0<p>
   * Value is 1 (0x1)
   */
  public static final Integer visCustPropsPrompt = Integer.valueOf(1);

  /**
   * visSectionProp,visRowProp+i,visCustPropsLabel  name:name:Prop.<rowname>.Label i>=0<p>
   * Value is 2 (0x2)
   */
  public static final Integer visCustPropsLabel = Integer.valueOf(2);

  /**
   * visSectionProp,visRowProp+i,visCustPropsFormat  name:name:Prop.<rowname>.Format i>=0<p>
   * Value is 3 (0x3)
   */
  public static final Integer visCustPropsFormat = Integer.valueOf(3);

  /**
   * visSectionProp,visRowProp+i,visCustPropsSortKey  name:name:Prop.<rowname>.SortKey i>=0<p>
   * Value is 4 (0x4)
   */
  public static final Integer visCustPropsSortKey = Integer.valueOf(4);

  /**
   * visSectionProp,visRowProp+i,visCustPropsType  name:name:Prop.<rowname>.Type i>=0<p>
   * Value is 5 (0x5)
   */
  public static final Integer visCustPropsType = Integer.valueOf(5);

  /**
   * visSectionProp,visRowProp+i,visCustPropsInvis  name:name:Prop.<rowname>.Invisible i>=0<p>
   * Value is 6 (0x6)
   */
  public static final Integer visCustPropsInvis = Integer.valueOf(6);

  /**
   * visSectionProp,visRowProp+i,visCustPropsAsk  name:name:Prop.<rowname>.Verify i>=0<p>
   * Value is 7 (0x7)
   */
  public static final Integer visCustPropsAsk = Integer.valueOf(7);

  /**
   * visSectionProp,visRowProp+i,visCustPropsLangID  name:name:Prop.<rowname>.LangID i>=0<p>
   * Value is 14 (0xE)
   */
  public static final Integer visCustPropsLangID = Integer.valueOf(14);

  /**
   * visSectionProp,visRowProp+i,visCustPropsCalendar  name:name:Prop.<rowname>.Calendar i>=0<p>
   * Value is 15 (0xF)
   */
  public static final Integer visCustPropsCalendar = Integer.valueOf(15);

  /**
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkDescription  name:name:Hyperlink.<rowname> i>=0<p>
   * Value is 0 (0x0)
   */
  public static final Integer visHLinkDescription = Integer.valueOf(0);

  /**
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkAddress  name:name:Hyperlink.<rowname>.Address i>=0<p>
   * Value is 1 (0x1)
   */
  public static final Integer visHLinkAddress = Integer.valueOf(1);

  /**
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkSubAddress  name:name:Hyperlink.<rowname>.SubAddress i>=0<p>
   * Value is 2 (0x2)
   */
  public static final Integer visHLinkSubAddress = Integer.valueOf(2);

  /**
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkExtraInfo  name:name:Hyperlink.<rowname>.ExtraInfo i>=0<p>
   * Value is 3 (0x3)
   */
  public static final Integer visHLinkExtraInfo = Integer.valueOf(3);

  /**
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkFrame  name:name:Hyperlink.<rowname>.Frame i>=0<p>
   * Value is 4 (0x4)
   */
  public static final Integer visHLinkFrame = Integer.valueOf(4);

  /**
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkNewWin  name:name:Hyperlink.<rowname>.NewWindow i>=0<p>
   * Value is 5 (0x5)
   */
  public static final Integer visHLinkNewWin = Integer.valueOf(5);

  /**
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkDefault  name:name:Hyperlink.<rowname>.Default i>=0<p>
   * Value is 7 (0x7)
   */
  public static final Integer visHLinkDefault = Integer.valueOf(7);

  /**
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkInvisible  name:name:Hyperlink.<rowname>.Invisible i>=0<p>
   * Value is 8 (0x8)
   */
  public static final Integer visHLinkInvisible = Integer.valueOf(8);

  /**
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkSortKey  name:name:Hyperlink.<rowname>.SortKey i>=0<p>
   * Value is 15 (0xF)
   */
  public static final Integer visHLinkSortKey = Integer.valueOf(15);

  /**
   * visSectionReviewer,visRowReviewer+(i-1),visReviewerName  name:Reviewer.Name[i] i=<1>,2,3,...<p>
   * Value is 0 (0x0)
   */
  public static final Integer visReviewerName = Integer.valueOf(0);

  /**
   * visSectionReviewer,visRowReviewer+(i-1),visReviewerInitials  name:Reviewer.Initials[i] i=<1>,2,3,...<p>
   * Value is 1 (0x1)
   */
  public static final Integer visReviewerInitials = Integer.valueOf(1);

  /**
   * visSectionReviewer,visRowReviewer+(i-1),visReviewerColor  name:Reviewer.Color[i] i=<1>,2,3,...<p>
   * Value is 2 (0x2)
   */
  public static final Integer visReviewerColor = Integer.valueOf(2);

  /**
   * visSectionReviewer,visRowReviewer+(i-1),visReviewerReviewerID  name:Reviewer.ReviewerID[i] i=<1>,2,3,...<p>
   * Value is 3 (0x3)
   */
  public static final Integer visReviewerReviewerID = Integer.valueOf(3);

  /**
   * visSectionReviewer,visRowReviewer+(i-1),visReviewerCurrentIndex  name:Reviewer.CurrentIndex[i] i=<1>,2,3,...<p>
   * Value is 4 (0x4)
   */
  public static final Integer visReviewerCurrentIndex = Integer.valueOf(4);

  /**
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationX  name:Annotation.X[i] i=<1>,2,3,...<p>
   * Value is 0 (0x0)
   */
  public static final Integer visAnnotationX = Integer.valueOf(0);

  /**
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationY  name:Annotation.Y[i] i=<1>,2,3,...<p>
   * Value is 1 (0x1)
   */
  public static final Integer visAnnotationY = Integer.valueOf(1);

  /**
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationReviewerID  name:Annotation.ReviewerID[i] i=<1>,2,3,...<p>
   * Value is 2 (0x2)
   */
  public static final Integer visAnnotationReviewerID = Integer.valueOf(2);

  /**
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationMarkerIndex  name:Annotation.MarkerIndex[i] i=<1>,2,3,...<p>
   * Value is 3 (0x3)
   */
  public static final Integer visAnnotationMarkerIndex = Integer.valueOf(3);

  /**
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationDate  name:Annotation.Date[i] i=<1>,2,3,...<p>
   * Value is 4 (0x4)
   */
  public static final Integer visAnnotationDate = Integer.valueOf(4);

  /**
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationComment  name:Annotation.Comment[i] i=<1>,2,3,...<p>
   * Value is 5 (0x5)
   */
  public static final Integer visAnnotationComment = Integer.valueOf(5);

  /**
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationLangID  name:Annotation.LangID[i] i=<1>,2,3,...<p>
   * Value is 6 (0x6)
   */
  public static final Integer visAnnotationLangID = Integer.valueOf(6);

  /**
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagX  name:SmartTag.X[i] i=<0>,1,2,...<p>
   * Value is 0 (0x0)
   */
  public static final Integer visSmartTagX = Integer.valueOf(0);

  /**
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagY  name:SmartTag.Y[i] i=<0>,1,2,...<p>
   * Value is 1 (0x1)
   */
  public static final Integer visSmartTagY = Integer.valueOf(1);

  /**
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagName  name:SmartTag.Y[i] i=<0>,1,2,...<p>
   * Value is 2 (0x2)
   */
  public static final Integer visSmartTagName = Integer.valueOf(2);

  /**
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagXJustify  name:SmartTag.XJustify[i] i=<0>,1,2,...<p>
   * Value is 3 (0x3)
   */
  public static final Integer visSmartTagXJustify = Integer.valueOf(3);

  /**
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagYJustify  name:SmartTag.YJustify[i] i=<0>,1,2,...<p>
   * Value is 4 (0x4)
   */
  public static final Integer visSmartTagYJustify = Integer.valueOf(4);

  /**
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagDisplayMode  name:SmartTag.DisplayMode[i] i=<0>,1,2,...<p>
   * Value is 5 (0x5)
   */
  public static final Integer visSmartTagDisplayMode = Integer.valueOf(5);

  /**
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagButtonFace  name:SmartTag.ButtonFace[i] i=<0>,1,2,...<p>
   * Value is 6 (0x6)
   */
  public static final Integer visSmartTagButtonFace = Integer.valueOf(6);

  /**
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagDisabled  name:SmartTag.Disabled[i] i=<0>,1,2,...<p>
   * Value is 7 (0x7)
   */
  public static final Integer visSmartTagDisabled = Integer.valueOf(7);

  /**
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagDescription  name:SmartTag.Description[i] i=<0>,1,2,...<p>
   * Value is 15 (0xF)
   */
  public static final Integer visSmartTagDescription = Integer.valueOf(15);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesLeftMargin  name:PrintProperties.LeftMargin<p>
   * Value is 0 (0x0)
   */
  public static final Integer visPrintPropertiesLeftMargin = Integer.valueOf(0);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesRightMargin  name:PrintProperties.RightMargin<p>
   * Value is 1 (0x1)
   */
  public static final Integer visPrintPropertiesRightMargin = Integer.valueOf(1);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesTopMargin  name:PrintProperties.TopMargin<p>
   * Value is 2 (0x2)
   */
  public static final Integer visPrintPropertiesTopMargin = Integer.valueOf(2);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesBottomMargin  name:PrintProperties.BottomMargin<p>
   * Value is 3 (0x3)
   */
  public static final Integer visPrintPropertiesBottomMargin = Integer.valueOf(3);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesScaleX  name:PrintProperties.ScaleX<p>
   * Value is 4 (0x4)
   */
  public static final Integer visPrintPropertiesScaleX = Integer.valueOf(4);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesScaleY  name:PrintProperties.ScaleY<p>
   * Value is 5 (0x5)
   */
  public static final Integer visPrintPropertiesScaleY = Integer.valueOf(5);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPagesX  name:PrintProperties.PagesX<p>
   * Value is 6 (0x6)
   */
  public static final Integer visPrintPropertiesPagesX = Integer.valueOf(6);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPagesY  name:PrintProperties.PagesY<p>
   * Value is 7 (0x7)
   */
  public static final Integer visPrintPropertiesPagesY = Integer.valueOf(7);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesCenterX  name:PrintProperties.CenterX<p>
   * Value is 8 (0x8)
   */
  public static final Integer visPrintPropertiesCenterX = Integer.valueOf(8);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesCenterY  name:PrintProperties.CenterY<p>
   * Value is 9 (0x9)
   */
  public static final Integer visPrintPropertiesCenterY = Integer.valueOf(9);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesOnPage  name:PrintProperties.OnPage<p>
   * Value is 10 (0xA)
   */
  public static final Integer visPrintPropertiesOnPage = Integer.valueOf(10);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPrintGrid  name:PrintProperties.PrintGrid<p>
   * Value is 11 (0xB)
   */
  public static final Integer visPrintPropertiesPrintGrid = Integer.valueOf(11);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPageOrientation  name:PrintProperties.PrintPageOrientation<p>
   * Value is 16 (0x10)
   */
  public static final Integer visPrintPropertiesPageOrientation = Integer.valueOf(16);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPaperKind  name:PrintProperties.PrintPaperKind<p>
   * Value is 17 (0x11)
   */
  public static final Integer visPrintPropertiesPaperKind = Integer.valueOf(17);

  /**
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPaperSource  name:PrintProperties.PrintPaperSource<p>
   * Value is 18 (0x12)
   */
  public static final Integer visPrintPropertiesPaperSource = Integer.valueOf(18);

  /**
   * visSectionObject,visRowLock,visLockFromGroupFormat  name:LockFromGroupFormat<p>
   * Value is 17 (0x11)
   */
  public static final Integer visLockFromGroupFormat = Integer.valueOf(17);

  /**
   * visSectionObject,visRowLock,visLockThemeColors  name:LockThemeColors<p>
   * Value is 18 (0x12)
   */
  public static final Integer visLockThemeColors = Integer.valueOf(18);

  /**
   * visSectionObject,visRowLock,visLockThemeEffects  name:LockThemeEffects<p>
   * Value is 19 (0x13)
   */
  public static final Integer visLockThemeEffects = Integer.valueOf(19);

  /**
   * visSectionObject,visRowEvent,visEvtCellMultiDrop  name:EventMultiDrop<p>
   * Value is 22 (0x16)
   */
  public static final Integer visEvtCellMultiDrop = Integer.valueOf(22);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visCellInval", visCellInval);
    v.put("visCellFirst", visCellFirst);
    v.put("visCellNone", visCellNone);
    v.put("visXFormPinX", visXFormPinX);
    v.put("visXFormPinY", visXFormPinY);
    v.put("visXFormWidth", visXFormWidth);
    v.put("visXFormHeight", visXFormHeight);
    v.put("visXFormLocPinX", visXFormLocPinX);
    v.put("visXFormLocPinY", visXFormLocPinY);
    v.put("visXFormAngle", visXFormAngle);
    v.put("visXFormFlipX", visXFormFlipX);
    v.put("visXFormFlipY", visXFormFlipY);
    v.put("visXFormResizeMode", visXFormResizeMode);
    v.put("visLineWeight", visLineWeight);
    v.put("visLineColor", visLineColor);
    v.put("visLinePattern", visLinePattern);
    v.put("visLineRounding", visLineRounding);
    v.put("visLineArrowSize", visLineArrowSize);
    v.put("visLineEndArrowSize", visLineEndArrowSize);
    v.put("visLineBeginArrow", visLineBeginArrow);
    v.put("visLineEndArrow", visLineEndArrow);
    v.put("visLineEndCap", visLineEndCap);
    v.put("visLineBeginArrowSize", visLineBeginArrowSize);
    v.put("visLineColorTrans", visLineColorTrans);
    v.put("visFillForegnd", visFillForegnd);
    v.put("visFillBkgnd", visFillBkgnd);
    v.put("visFillPattern", visFillPattern);
    v.put("visFillShdwForegnd", visFillShdwForegnd);
    v.put("visFillShdwBkgnd", visFillShdwBkgnd);
    v.put("visFillShdwPattern", visFillShdwPattern);
    v.put("visFillForegndTrans", visFillForegndTrans);
    v.put("visFillBkgndTrans", visFillBkgndTrans);
    v.put("visFillShdwForegndTrans", visFillShdwForegndTrans);
    v.put("visFillShdwBkgndTrans", visFillShdwBkgndTrans);
    v.put("visFillShdwType", visFillShdwType);
    v.put("visFillShdwOffsetX", visFillShdwOffsetX);
    v.put("visFillShdwOffsetY", visFillShdwOffsetY);
    v.put("visFillShdwObliqueAngle", visFillShdwObliqueAngle);
    v.put("visFillShdwScaleFactor", visFillShdwScaleFactor);
    v.put("vis1DBeginX", vis1DBeginX);
    v.put("vis1DBeginY", vis1DBeginY);
    v.put("vis1DEndX", vis1DEndX);
    v.put("vis1DEndY", vis1DEndY);
    v.put("visEvtCellTheData", visEvtCellTheData);
    v.put("visEvtCellTheText", visEvtCellTheText);
    v.put("visEvtCellDblClick", visEvtCellDblClick);
    v.put("visEvtCellXFMod", visEvtCellXFMod);
    v.put("visEvtCellDrop", visEvtCellDrop);
    v.put("visLayerMember", visLayerMember);
    v.put("visGuideFlags", visGuideFlags);
    v.put("visStyleIncludesLine", visStyleIncludesLine);
    v.put("visStyleIncludesFill", visStyleIncludesFill);
    v.put("visStyleIncludesText", visStyleIncludesText);
    v.put("visStyleHidden", visStyleHidden);
    v.put("visFrgnImgOffsetX", visFrgnImgOffsetX);
    v.put("visFrgnImgOffsetY", visFrgnImgOffsetY);
    v.put("visFrgnImgWidth", visFrgnImgWidth);
    v.put("visFrgnImgHeight", visFrgnImgHeight);
    v.put("visPageWidth", visPageWidth);
    v.put("visPageHeight", visPageHeight);
    v.put("visPageShdwOffsetX", visPageShdwOffsetX);
    v.put("visPageShdwOffsetY", visPageShdwOffsetY);
    v.put("visPageScale", visPageScale);
    v.put("visPageDrawingScale", visPageDrawingScale);
    v.put("visPageDrawSizeType", visPageDrawSizeType);
    v.put("visPageDrawScaleType", visPageDrawScaleType);
    v.put("visPageInhibitSnap", visPageInhibitSnap);
    v.put("visPageUIVisibility", visPageUIVisibility);
    v.put("visPageShdwType", visPageShdwType);
    v.put("visPageShdwObliqueAngle", visPageShdwObliqueAngle);
    v.put("visPageShdwScaleFactor", visPageShdwScaleFactor);
    v.put("visTxtBlkLeftMargin", visTxtBlkLeftMargin);
    v.put("visTxtBlkRightMargin", visTxtBlkRightMargin);
    v.put("visTxtBlkTopMargin", visTxtBlkTopMargin);
    v.put("visTxtBlkBottomMargin", visTxtBlkBottomMargin);
    v.put("visTxtBlkVerticalAlign", visTxtBlkVerticalAlign);
    v.put("visTxtBlkBkgnd", visTxtBlkBkgnd);
    v.put("visTxtBlkDefaultTabStop", visTxtBlkDefaultTabStop);
    v.put("visTxtBlkDirection", visTxtBlkDirection);
    v.put("visTxtBlkBkgndTrans", visTxtBlkBkgndTrans);
    v.put("visAlignLeft", visAlignLeft);
    v.put("visAlignCenter", visAlignCenter);
    v.put("visAlignRight", visAlignRight);
    v.put("visAlignTop", visAlignTop);
    v.put("visAlignMiddle", visAlignMiddle);
    v.put("visAlignBottom", visAlignBottom);
    v.put("visLockWidth", visLockWidth);
    v.put("visLockHeight", visLockHeight);
    v.put("visLockMoveX", visLockMoveX);
    v.put("visLockMoveY", visLockMoveY);
    v.put("visLockAspect", visLockAspect);
    v.put("visLockDelete", visLockDelete);
    v.put("visLockBegin", visLockBegin);
    v.put("visLockEnd", visLockEnd);
    v.put("visLockRotate", visLockRotate);
    v.put("visLockCrop", visLockCrop);
    v.put("visLockVtxEdit", visLockVtxEdit);
    v.put("visLockTextEdit", visLockTextEdit);
    v.put("visLockFormat", visLockFormat);
    v.put("visLockGroup", visLockGroup);
    v.put("visLockCalcWH", visLockCalcWH);
    v.put("visLockSelect", visLockSelect);
    v.put("visLockCustProp", visLockCustProp);
    v.put("visObjHelp", visObjHelp);
    v.put("visCopyright", visCopyright);
    v.put("visNoObjHandles", visNoObjHandles);
    v.put("visNonPrinting", visNonPrinting);
    v.put("visNoCtlHandles", visNoCtlHandles);
    v.put("visNoAlignBox", visNoAlignBox);
    v.put("visUpdateAlignBox", visUpdateAlignBox);
    v.put("visHideText", visHideText);
    v.put("visVerticalText", visVerticalText);
    v.put("visDynFeedback", visDynFeedback);
    v.put("visGlueType", visGlueType);
    v.put("visWalkPref", visWalkPref);
    v.put("visBegTrigger", visBegTrigger);
    v.put("visEndTrigger", visEndTrigger);
    v.put("visLOFlags", visLOFlags);
    v.put("visLOInteraction", visLOInteraction);
    v.put("visLOBehavior", visLOBehavior);
    v.put("visComment", visComment);
    v.put("visDropSource", visDropSource);
    v.put("visNoLiveDynamics", visNoLiveDynamics);
    v.put("visObjLocalizeMerge", visObjLocalizeMerge);
    v.put("visObjCalendar", visObjCalendar);
    v.put("visObjLangID", visObjLangID);
    v.put("visObjKeywords", visObjKeywords);
    v.put("visObjDropOnPageScale", visObjDropOnPageScale);
    v.put("visObjTheme", visObjTheme);
    v.put("visXRulerDensity", visXRulerDensity);
    v.put("visYRulerDensity", visYRulerDensity);
    v.put("visXRulerOrigin", visXRulerOrigin);
    v.put("visYRulerOrigin", visYRulerOrigin);
    v.put("visXGridDensity", visXGridDensity);
    v.put("visYGridDensity", visYGridDensity);
    v.put("visXGridSpacing", visXGridSpacing);
    v.put("visYGridSpacing", visYGridSpacing);
    v.put("visXGridOrigin", visXGridOrigin);
    v.put("visYGridOrigin", visYGridOrigin);
    v.put("visDocOutputFormat", visDocOutputFormat);
    v.put("visDocLockPreview", visDocLockPreview);
    v.put("visDocMetric", visDocMetric);
    v.put("visDocAddMarkup", visDocAddMarkup);
    v.put("visDocViewMarkup", visDocViewMarkup);
    v.put("visDocPreviewQuality", visDocPreviewQuality);
    v.put("visDocPreviewScope", visDocPreviewScope);
    v.put("visDocLangID", visDocLangID);
    v.put("visImageGamma", visImageGamma);
    v.put("visImageContrast", visImageContrast);
    v.put("visImageBrightness", visImageBrightness);
    v.put("visImageSharpen", visImageSharpen);
    v.put("visImageBlur", visImageBlur);
    v.put("visImageDenoise", visImageDenoise);
    v.put("visImageTransparency", visImageTransparency);
    v.put("visGroupSelectMode", visGroupSelectMode);
    v.put("visGroupDisplayMode", visGroupDisplayMode);
    v.put("visGroupIsDropTarget", visGroupIsDropTarget);
    v.put("visGroupIsSnapTarget", visGroupIsSnapTarget);
    v.put("visGroupIsTextEditTarget", visGroupIsTextEditTarget);
    v.put("visGroupDontMoveChildren", visGroupDontMoveChildren);
    v.put("visSLOPermX", visSLOPermX);
    v.put("visSLOPermY", visSLOPermY);
    v.put("visSLOPermeablePlace", visSLOPermeablePlace);
    v.put("visSLOFixedCode", visSLOFixedCode);
    v.put("visSLOPlowCode", visSLOPlowCode);
    v.put("visSLORouteStyle", visSLORouteStyle);
    v.put("visSLOPlaceStyle", visSLOPlaceStyle);
    v.put("visSLOConFixedCode", visSLOConFixedCode);
    v.put("visSLOJumpCode", visSLOJumpCode);
    v.put("visSLOJumpStyle", visSLOJumpStyle);
    v.put("visSLOJumpDirX", visSLOJumpDirX);
    v.put("visSLOJumpDirY", visSLOJumpDirY);
    v.put("visSLOPlaceFlip", visSLOPlaceFlip);
    v.put("visSLOLineRouteExt", visSLOLineRouteExt);
    v.put("visSLOSplit", visSLOSplit);
    v.put("visSLOSplittable", visSLOSplittable);
    v.put("visPLOResizePage", visPLOResizePage);
    v.put("visPLOEnableGrid", visPLOEnableGrid);
    v.put("visPLODynamicsOff", visPLODynamicsOff);
    v.put("visPLOCtrlAsInput", visPLOCtrlAsInput);
    v.put("visPLOPlaceStyle", visPLOPlaceStyle);
    v.put("visPLORouteStyle", visPLORouteStyle);
    v.put("visPLOPlaceDepth", visPLOPlaceDepth);
    v.put("visPLOPlowCode", visPLOPlowCode);
    v.put("visPLOJumpCode", visPLOJumpCode);
    v.put("visPLOJumpStyle", visPLOJumpStyle);
    v.put("visPLOJumpDirX", visPLOJumpDirX);
    v.put("visPLOJumpDirY", visPLOJumpDirY);
    v.put("visPLOLineToNodeX", visPLOLineToNodeX);
    v.put("visPLOLineToNodeY", visPLOLineToNodeY);
    v.put("visPLOBlockSizeX", visPLOBlockSizeX);
    v.put("visPLOBlockSizeY", visPLOBlockSizeY);
    v.put("visPLOAvenueSizeX", visPLOAvenueSizeX);
    v.put("visPLOAvenueSizeY", visPLOAvenueSizeY);
    v.put("visPLOLineToLineX", visPLOLineToLineX);
    v.put("visPLOLineToLineY", visPLOLineToLineY);
    v.put("visPLOJumpFactorX", visPLOJumpFactorX);
    v.put("visPLOJumpFactorY", visPLOJumpFactorY);
    v.put("visPLOLineAdjustFrom", visPLOLineAdjustFrom);
    v.put("visPLOLineAdjustTo", visPLOLineAdjustTo);
    v.put("visPLOPlaceFlip", visPLOPlaceFlip);
    v.put("visPLOLineRouteExt", visPLOLineRouteExt);
    v.put("visPLOSplit", visPLOSplit);
    v.put("visCharacterFont", visCharacterFont);
    v.put("visCharacterColor", visCharacterColor);
    v.put("visCharacterStyle", visCharacterStyle);
    v.put("visCharacterCase", visCharacterCase);
    v.put("visCharacterPos", visCharacterPos);
    v.put("visCharacterFontScale", visCharacterFontScale);
    v.put("visCharacterLocale", visCharacterLocale);
    v.put("visCharacterSize", visCharacterSize);
    v.put("visCharacterDblUnderline", visCharacterDblUnderline);
    v.put("visCharacterOverline", visCharacterOverline);
    v.put("visCharacterStrikethru", visCharacterStrikethru);
    v.put("visCharacterPerpendicular", visCharacterPerpendicular);
    v.put("visCharacterDoubleStrikethrough", visCharacterDoubleStrikethrough);
    v.put("visCharacterRTLText", visCharacterRTLText);
    v.put("visCharacterUseVertical", visCharacterUseVertical);
    v.put("visCharacterLetterspace", visCharacterLetterspace);
    v.put("visCharacterColorTrans", visCharacterColorTrans);
    v.put("visCharacterAsianFont", visCharacterAsianFont);
    v.put("visCharacterComplexScriptFont", visCharacterComplexScriptFont);
    v.put("visCharacterLocalizeFont", visCharacterLocalizeFont);
    v.put("visCharacterComplexScriptSize", visCharacterComplexScriptSize);
    v.put("visCharacterLangID", visCharacterLangID);
    v.put("visIndentFirst", visIndentFirst);
    v.put("visIndentLeft", visIndentLeft);
    v.put("visIndentRight", visIndentRight);
    v.put("visSpaceLine", visSpaceLine);
    v.put("visSpaceBefore", visSpaceBefore);
    v.put("visSpaceAfter", visSpaceAfter);
    v.put("visHorzAlign", visHorzAlign);
    v.put("visBulletIndex", visBulletIndex);
    v.put("visBulletString", visBulletString);
    v.put("visBulletFont", visBulletFont);
    v.put("visLocalizeBulletFont", visLocalizeBulletFont);
    v.put("visBulletFontSize", visBulletFontSize);
    v.put("visTextPosAfterBullet", visTextPosAfterBullet);
    v.put("visFlags", visFlags);
    v.put("visTabStopCount", visTabStopCount);
    v.put("visTabPos", visTabPos);
    v.put("visTabAlign", visTabAlign);
    v.put("visScratchX", visScratchX);
    v.put("visScratchY", visScratchY);
    v.put("visScratchA", visScratchA);
    v.put("visScratchB", visScratchB);
    v.put("visScratchC", visScratchC);
    v.put("visScratchD", visScratchD);
    v.put("visCnnctX", visCnnctX);
    v.put("visCnnctY", visCnnctY);
    v.put("visCnnctDirX", visCnnctDirX);
    v.put("visCnnctDirY", visCnnctDirY);
    v.put("visCnnctType", visCnnctType);
    v.put("visCnnctAutoGen", visCnnctAutoGen);
    v.put("visCnnctA", visCnnctA);
    v.put("visCnnctB", visCnnctB);
    v.put("visCnnctC", visCnnctC);
    v.put("visCnnctD", visCnnctD);
    v.put("visFieldCell", visFieldCell);
    v.put("visFieldEditMode", visFieldEditMode);
    v.put("visFieldFormat", visFieldFormat);
    v.put("visFieldType", visFieldType);
    v.put("visFieldUICategory", visFieldUICategory);
    v.put("visFieldUICode", visFieldUICode);
    v.put("visFieldUIFormat", visFieldUIFormat);
    v.put("visFieldCalendar", visFieldCalendar);
    v.put("visFieldObjectKind", visFieldObjectKind);
    v.put("visCtlX", visCtlX);
    v.put("visCtlY", visCtlY);
    v.put("visCtlXDyn", visCtlXDyn);
    v.put("visCtlYDyn", visCtlYDyn);
    v.put("visCtlXCon", visCtlXCon);
    v.put("visCtlYCon", visCtlYCon);
    v.put("visCtlGlue", visCtlGlue);
    v.put("visCtlType", visCtlType);
    v.put("visCtlTip", visCtlTip);
    v.put("visCompNoFill", visCompNoFill);
    v.put("visCompNoLine", visCompNoLine);
    v.put("visCompNoShow", visCompNoShow);
    v.put("visCompNoSnap", visCompNoSnap);
    v.put("visCompPath", visCompPath);
    v.put("visX", visX);
    v.put("visY", visY);
    v.put("visBow", visBow);
    v.put("visInfiniteLineX1", visInfiniteLineX1);
    v.put("visInfiniteLineY1", visInfiniteLineY1);
    v.put("visInfiniteLineX2", visInfiniteLineX2);
    v.put("visInfiniteLineY2", visInfiniteLineY2);
    v.put("visEllipseCenterX", visEllipseCenterX);
    v.put("visEllipseCenterY", visEllipseCenterY);
    v.put("visEllipseMajorX", visEllipseMajorX);
    v.put("visEllipseMajorY", visEllipseMajorY);
    v.put("visEllipseMinorX", visEllipseMinorX);
    v.put("visEllipseMinorY", visEllipseMinorY);
    v.put("visControlX", visControlX);
    v.put("visControlY", visControlY);
    v.put("visEccentricityAngle", visEccentricityAngle);
    v.put("visAspectRatio", visAspectRatio);
    v.put("visSplineKnot", visSplineKnot);
    v.put("visSplineKnot2", visSplineKnot2);
    v.put("visSplineKnot3", visSplineKnot3);
    v.put("visSplineDegree", visSplineDegree);
    v.put("visPolylineData", visPolylineData);
    v.put("visNURBSKnot", visNURBSKnot);
    v.put("visNURBSWeight", visNURBSWeight);
    v.put("visNURBSKnotPrev", visNURBSKnotPrev);
    v.put("visNURBSWeightPrev", visNURBSWeightPrev);
    v.put("visNURBSData", visNURBSData);
    v.put("visActionMenu", visActionMenu);
    v.put("visActionPrompt", visActionPrompt);
    v.put("visActionHelp", visActionHelp);
    v.put("visActionAction", visActionAction);
    v.put("visActionChecked", visActionChecked);
    v.put("visActionDisabled", visActionDisabled);
    v.put("visActionReadOnly", visActionReadOnly);
    v.put("visActionInvisible", visActionInvisible);
    v.put("visActionBeginGroup", visActionBeginGroup);
    v.put("visActionTagName", visActionTagName);
    v.put("visActionButtonFace", visActionButtonFace);
    v.put("visActionSortKey", visActionSortKey);
    v.put("visLayerName", visLayerName);
    v.put("visLayerColor", visLayerColor);
    v.put("visLayerStatus", visLayerStatus);
    v.put("visLayerVisible", visLayerVisible);
    v.put("visLayerPrint", visLayerPrint);
    v.put("visLayerActive", visLayerActive);
    v.put("visLayerLock", visLayerLock);
    v.put("visLayerSnap", visLayerSnap);
    v.put("visLayerGlue", visLayerGlue);
    v.put("visLayerNameUniv", visLayerNameUniv);
    v.put("visLayerColorTrans", visLayerColorTrans);
    v.put("visUserValue", visUserValue);
    v.put("visUserPrompt", visUserPrompt);
    v.put("visCustPropsValue", visCustPropsValue);
    v.put("visCustPropsPrompt", visCustPropsPrompt);
    v.put("visCustPropsLabel", visCustPropsLabel);
    v.put("visCustPropsFormat", visCustPropsFormat);
    v.put("visCustPropsSortKey", visCustPropsSortKey);
    v.put("visCustPropsType", visCustPropsType);
    v.put("visCustPropsInvis", visCustPropsInvis);
    v.put("visCustPropsAsk", visCustPropsAsk);
    v.put("visCustPropsLangID", visCustPropsLangID);
    v.put("visCustPropsCalendar", visCustPropsCalendar);
    v.put("visHLinkDescription", visHLinkDescription);
    v.put("visHLinkAddress", visHLinkAddress);
    v.put("visHLinkSubAddress", visHLinkSubAddress);
    v.put("visHLinkExtraInfo", visHLinkExtraInfo);
    v.put("visHLinkFrame", visHLinkFrame);
    v.put("visHLinkNewWin", visHLinkNewWin);
    v.put("visHLinkDefault", visHLinkDefault);
    v.put("visHLinkInvisible", visHLinkInvisible);
    v.put("visHLinkSortKey", visHLinkSortKey);
    v.put("visReviewerName", visReviewerName);
    v.put("visReviewerInitials", visReviewerInitials);
    v.put("visReviewerColor", visReviewerColor);
    v.put("visReviewerReviewerID", visReviewerReviewerID);
    v.put("visReviewerCurrentIndex", visReviewerCurrentIndex);
    v.put("visAnnotationX", visAnnotationX);
    v.put("visAnnotationY", visAnnotationY);
    v.put("visAnnotationReviewerID", visAnnotationReviewerID);
    v.put("visAnnotationMarkerIndex", visAnnotationMarkerIndex);
    v.put("visAnnotationDate", visAnnotationDate);
    v.put("visAnnotationComment", visAnnotationComment);
    v.put("visAnnotationLangID", visAnnotationLangID);
    v.put("visSmartTagX", visSmartTagX);
    v.put("visSmartTagY", visSmartTagY);
    v.put("visSmartTagName", visSmartTagName);
    v.put("visSmartTagXJustify", visSmartTagXJustify);
    v.put("visSmartTagYJustify", visSmartTagYJustify);
    v.put("visSmartTagDisplayMode", visSmartTagDisplayMode);
    v.put("visSmartTagButtonFace", visSmartTagButtonFace);
    v.put("visSmartTagDisabled", visSmartTagDisabled);
    v.put("visSmartTagDescription", visSmartTagDescription);
    v.put("visPrintPropertiesLeftMargin", visPrintPropertiesLeftMargin);
    v.put("visPrintPropertiesRightMargin", visPrintPropertiesRightMargin);
    v.put("visPrintPropertiesTopMargin", visPrintPropertiesTopMargin);
    v.put("visPrintPropertiesBottomMargin", visPrintPropertiesBottomMargin);
    v.put("visPrintPropertiesScaleX", visPrintPropertiesScaleX);
    v.put("visPrintPropertiesScaleY", visPrintPropertiesScaleY);
    v.put("visPrintPropertiesPagesX", visPrintPropertiesPagesX);
    v.put("visPrintPropertiesPagesY", visPrintPropertiesPagesY);
    v.put("visPrintPropertiesCenterX", visPrintPropertiesCenterX);
    v.put("visPrintPropertiesCenterY", visPrintPropertiesCenterY);
    v.put("visPrintPropertiesOnPage", visPrintPropertiesOnPage);
    v.put("visPrintPropertiesPrintGrid", visPrintPropertiesPrintGrid);
    v.put("visPrintPropertiesPageOrientation", visPrintPropertiesPageOrientation);
    v.put("visPrintPropertiesPaperKind", visPrintPropertiesPaperKind);
    v.put("visPrintPropertiesPaperSource", visPrintPropertiesPaperSource);
    v.put("visLockFromGroupFormat", visLockFromGroupFormat);
    v.put("visLockThemeColors", visLockThemeColors);
    v.put("visLockThemeEffects", visLockThemeEffects);
    v.put("visEvtCellMultiDrop", visEvtCellMultiDrop);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
