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
 * Symbolic values for certain cells.
 * @author Jason Smith
 */
public final class VisCellVals
{
  private VisCellVals()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visXFormResizeDontCare = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visXFormResizeSpread = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visXFormResizeScale = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visArrowSizeVerySmall = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visArrowSizeSmall = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visArrowSizeMedium = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visArrowSizeLarge = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visArrowSizeVeryLarge = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visArrowSizeJumbo = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visArrowSizeColossal = Integer.valueOf(6);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visNoFill = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visSolid = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visWideUpDiagonal = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visWideCross = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visWideDiagonalCross = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visWideDownDiagonal = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visWideHorz = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visWideVert = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visBackDotsMini = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visHalfAndHalf = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer visForeDotsMini = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer visForeDotsNarrow = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer visForeDotsWide = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer visThickHorz = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer visThickVertical = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer visThickDownDiagonal = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visThickUpDiagonal = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer visThickDiagonalCross = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer visBackDotsWide = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer visThinHorz = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer visThinVert = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer visThinDownDiagonal = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer visThinUpDiagonal = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer visThinCross = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer visThinDiagonalCross = Integer.valueOf(24);

  /**
   * Obsolete starting with Visio 2000. Guides now represented by XFormOut and geometry.<p>
   * Value is 1024 (0x400)
   */
  public static final Integer visGuideXActive = Integer.valueOf(1024);

  /**
   * Obsolete starting with Visio 2000. Guides now represented by XFormOut and geometry.<p>
   * Value is 2048 (0x800)
   */
  public static final Integer visGuideYActive = Integer.valueOf(2048);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visPrintSetup = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visTight = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visStandard = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visCustom = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visLogical = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visDSMetric = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visDSEngr = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visDSArch = Integer.valueOf(7);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visNoScale = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visArchitectural = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visEngineering = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visScaleCustom = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visScaleMetric = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visScaleMechanical = Integer.valueOf(5);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visVertTop = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visVertMiddle = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visVertBottom = Integer.valueOf(2);

  /**
   * Value is 255 (0xFF)
   */
  public static final Integer visTxtBlkOpaque = Integer.valueOf(255);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visTxtBlkLeftToRight = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visTxtBlkTopToBottom = Integer.valueOf(1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visDynFBDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visDynFBUCon3Leg = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visDynFBUCon5Leg = Integer.valueOf(2);

  /**
   * Only static glue can be established from this shape.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visGlueTypeDefault = Integer.valueOf(0);

  /**
   * Obsolete. Used in old style Universal connectors.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visGlueTypeTrigger = Integer.valueOf(1);

  /**
   * Walking glue can be established from this shape.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visGlueTypeWalking = Integer.valueOf(2);

  /**
   * Walking glue cannot be established from this shape.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visGlueTypeNoWalking = Integer.valueOf(4);

  /**
   * Walking glue cannot be established to this shape.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visGlueTypeNoWalkingTo = Integer.valueOf(8);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visWalkPrefBegNS = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visWalkPrefEndNS = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visLOFlagsVisDecides = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visLOFlagsPlacable = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visLOFlagsRoutable = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visLOFlagsDont = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visLOFlagsPNRGroup = Integer.valueOf(8);

  /**
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visLOIPlaceNormal = Integer.valueOf(0);

  /**
   * Added starting with 5.0b. Starting with Visio 2000 use visSLOPermX cell instead.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visLOIPlaceXPermeable = Integer.valueOf(2);

  /**
   * Added starting with 5.0b. Starting with Visio 2000 use visSLOPermX cell instead.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visLOIPlaceYPermeable = Integer.valueOf(4);

  /**
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visLOIRouteNormal = Integer.valueOf(0);

  /**
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visLOBPlaceNormal = Integer.valueOf(0);

  /**
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visLOBRouteNormal = Integer.valueOf(0);

  /**
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visLOBRouteRightAng = Integer.valueOf(1);

  /**
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visLOBRouteStraight = Integer.valueOf(2);

  /**
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 5 (0x5)
   */
  public static final Integer visLOBRouteFlowNS = Integer.valueOf(5);

  /**
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 6 (0x6)
   */
  public static final Integer visLOBRouteFlowWE = Integer.valueOf(6);

  /**
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 7 (0x7)
   */
  public static final Integer visLOBRouteTreeNS = Integer.valueOf(7);

  /**
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visLOBRouteTreeWE = Integer.valueOf(8);

  /**
   * Added starting with 5.0b. Starting with Visio 2000 use visSLOConFixedCode cell instead.<p>
   * Value is 1024 (0x400)
   */
  public static final Integer visLOBRouteManual = Integer.valueOf(1024);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer visRulerFine = Integer.valueOf(32);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visRulerNormal = Integer.valueOf(16);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visRulerCoarse = Integer.valueOf(8);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visRulerFixed = Integer.valueOf(0);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visGridFine = Integer.valueOf(8);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visGridNormal = Integer.valueOf(4);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visGridCoarse = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visGridFixed = Integer.valueOf(0);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visDocPreviewQualityDraft = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visDocPreviewQualityDetailed = Integer.valueOf(1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visDocPreviewScope1stPage = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visDocPreviewScopeNone = Integer.valueOf(1);

  /**
   * Obsolete starting with Visio 2003.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visDocPreviewScopeAllPages = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visPPOSameAsPrinter = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visPPOPortrait = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visPPOLandscape = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visGrpSelModeGroupOnly = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visGrpSelModeGroup1st = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visGrpSelModeMembers1st = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visGrpDispModeNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visGrpDispModeBack = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visGrpDispModeFront = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visLORouteDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visLORouteRightAngle = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visLORouteStraight = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visLORouteOrgChartNS = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visLORouteOrgChartWE = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visLORouteFlowchartNS = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visLORouteFlowchartWE = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visLORouteTreeNS = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visLORouteTreeWE = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visLORouteNetwork = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer visLORouteOrgChartSN = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer visLORouteOrgChartEW = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer visLORouteFlowchartSN = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer visLORouteFlowchartEW = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer visLORouteTreeSN = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer visLORouteTreeEW = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visLORouteCenterToCenter = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer visLORouteSimpleNS = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer visLORouteSimpleWE = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer visLORouteSimpleSN = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer visLORouteSimpleEW = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer visLORouteSimpleHV = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer visLORouteSimpleVH = Integer.valueOf(22);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visLOJumpStyleDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visLOJumpStyleArc = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visLOJumpStyleGap = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visLOJumpStyleSquare = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visLOJumpStyleTriangle = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visLOJumpStyle2Point = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visLOJumpStyle3Point = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visLOJumpStyle4Point = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visLOJumpStyle5Point = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visLOJumpStyle6Point = Integer.valueOf(9);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visLOJumpDirXDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visLOJumpDirXUp = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visLOJumpDirXDown = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visLOJumpDirYDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visLOJumpDirYLeft = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visLOJumpDirYRight = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visLOFlipDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visLOFlipX = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visLOFlipY = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visLOFlipRotate = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visLOFlipNone = Integer.valueOf(8);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visLORouteExtDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visLORouteExtStraight = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visLORouteExtNURBS = Integer.valueOf(2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visSLOFixedPlacement = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visSLOFixedPlow = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visSLOFixedPermeablePlow = Integer.valueOf(4);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer visSLOFixedConnPtsIgnore = Integer.valueOf(32);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer visSLOFixedConnPtsOnly = Integer.valueOf(64);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer visSLOFixedNoFoldToShape = Integer.valueOf(128);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visSLOPlowDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visSLOPlowNever = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visSLOPlowAlways = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visSLOConFixedRerouteFreely = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visSLOConFixedRerouteAsNeeded = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visSLOConFixedRerouteNever = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visSLOConFixedRerouteOnCrossover = Integer.valueOf(3);

  /**
   * For internal use only.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visSLOConFixedByAlgFrom = Integer.valueOf(4);

  /**
   * For internal use only.<p>
   * Value is 5 (0x5)
   */
  public static final Integer visSLOConFixedByAlgTo = Integer.valueOf(5);

  /**
   * For internal use only.<p>
   * Value is 6 (0x6)
   */
  public static final Integer visSLOConFixedByAlgFromTo = Integer.valueOf(6);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visSLOJumpDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visSLOJumpNever = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visSLOJumpAlways = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visSLOJumpOther = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visSLOJumpNeither = Integer.valueOf(4);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visPLOPlaceDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visPLOPlaceTopToBottom = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visPLOPlaceLeftToRight = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visPLOPlaceRadial = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visPLOPlaceBottomToTop = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visPLOPlaceRightToLeft = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visPLOPlaceCircular = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visPLOPlaceCompactDownRight = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visPLOPlaceCompactRightDown = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visPLOPlaceCompactRightUp = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer visPLOPlaceCompactUpRight = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer visPLOPlaceCompactUpLeft = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer visPLOPlaceCompactLeftUp = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer visPLOPlaceCompactLeftDown = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer visPLOPlaceCompactDownLeft = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer visPLOPlaceParentDefault = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visPLOPlaceHierarchyTopToBottomLeft = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer visPLOPlaceHierarchyTopToBottomCenter = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer visPLOPlaceHierarchyTopToBottomRight = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer visPLOPlaceHierarchyBottomToTopLeft = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer visPLOPlaceHierarchyBottomToTopCenter = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer visPLOPlaceHierarchyBottomToTopRight = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer visPLOPlaceHierarchyLeftToRightTop = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer visPLOPlaceHierarchyLeftToRightMiddle = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer visPLOPlaceHierarchyLeftToRightBottom = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer visPLOPlaceHierarchyRightToLeftTop = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer visPLOPlaceHierarchyRightToLeftMiddle = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer visPLOPlaceHierarchyRightToLeftBottom = Integer.valueOf(27);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visLOPlaceDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visLOPlaceTopToBottom = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visLOPlaceLeftToRight = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visLOPlaceRadial = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visLOPlaceBottomToTop = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visLOPlaceRightToLeft = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visLOPlaceCircular = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visLOPlaceCompactDownRight = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visLOPlaceCompactRightDown = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visLOPlaceCompactRightUp = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer visLOPlaceCompactUpRight = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer visLOPlaceCompactUpLeft = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer visLOPlaceCompactLeftUp = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer visLOPlaceCompactLeftDown = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer visLOPlaceCompactDownLeft = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer visLOPlaceParentDefault = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visLOPlaceHierarchyTopToBottomLeft = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer visLOPlaceHierarchyTopToBottomCenter = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer visLOPlaceHierarchyTopToBottomRight = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer visLOPlaceHierarchyBottomToTopLeft = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer visLOPlaceHierarchyBottomToTopCenter = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer visLOPlaceHierarchyBottomToTopRight = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer visLOPlaceHierarchyLeftToRightTop = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer visLOPlaceHierarchyLeftToRightMiddle = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer visLOPlaceHierarchyLeftToRightBottom = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer visLOPlaceHierarchyRightToLeftTop = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer visLOPlaceHierarchyRightToLeftMiddle = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer visLOPlaceHierarchyRightToLeftBottom = Integer.valueOf(27);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visPLOPlaceDepthDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visPLOPlaceDepthMedium = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visPLOPlaceDepthDeep = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visPLOPlaceDepthShallow = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visPLOPlowNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visPLOPlowAll = Integer.valueOf(1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visPLOJumpNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visPLOJumpHorizontal = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visPLOJumpVertical = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visPLOJumpLastRouted = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visPLOJumpDisplayOrder = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visPLOJumpReverseDisplayOrder = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visPLOJumpProhibitAll = Integer.valueOf(6);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visPLOLineAdjustFromNotRelated = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visPLOLineAdjustFromAll = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visPLOLineAdjustFromNone = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visPLOLineAdjustFromRoutingDefault = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visPLOLineAdjustToDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visPLOLineAdjustToAll = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visPLOLineAdjustToNone = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visPLOLineAdjustToRelated = Integer.valueOf(3);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visBold = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visItalic = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visUnderLine = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visSmallCaps = Integer.valueOf(8);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visComplexBold = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer visComplexItalic = Integer.valueOf(32);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visCaseNormal = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visCaseAllCaps = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visCaseInitialCaps = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visPosNormal = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visPosSuper = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visPosSub = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visHorzLeft = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visHorzCenter = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visHorzRight = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visHorzJustify = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visHorzForce = Integer.valueOf(4);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visHorzDistribute = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visHorzJustifyLow = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visHorzJustifyMedium = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visHorzJustifyHigh = Integer.valueOf(7);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visTabStopLeft = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visTabStopCenter = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visTabStopRight = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visTabStopDecimal = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visTabStopComma = Integer.valueOf(4);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visCnnctTypeInward = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visCnnctTypeOutward = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visCnnctTypeInwardOutward = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visCtlProportional = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visCtlLocked = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visCtlOffsetMin = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visCtlOffsetMid = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visCtlOffsetMax = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visCtlProportionalHidden = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visCtlLockedHidden = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visCtlOffsetMinHidden = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visCtlOffsetMidHidden = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visCtlOffsetMaxHidden = Integer.valueOf(9);

  /**
   * Value is 255 (0xFF)
   */
  public static final Integer visNoLayerColor = Integer.valueOf(255);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visLayerValid = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visLayerDeleted = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visLayerAvailable = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visPropTypeString = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visPropTypeListFix = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visPropTypeNumber = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visPropTypeBool = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visPropTypeListVar = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visPropTypeDate = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visPropTypeDuration = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visPropTypeCurrency = Integer.valueOf(7);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visCalWestern = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visCalArabicHijri = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visCalHebrewLunar = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visCalChineseTaiwan = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visCalJapaneseEmperor = Integer.valueOf(4);

  /**
   * Synonym of visCalThaiBuddhist<p>
   * Value is 5 (0x5)
   */
  public static final Integer visCalThaiBuddhism = Integer.valueOf(5);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visCalThaiBuddhist = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visCalKoreanDanki = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visCalSakaEra = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visCalTranslitEnglish = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visCalTranslitFrench = Integer.valueOf(9);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visPLOSplitNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visPLOSplitAllow = Integer.valueOf(1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visSLOSplitNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visSLOSplitAllow = Integer.valueOf(1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visSLOSplittableNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visSLOSplittableAllow = Integer.valueOf(1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visFSTPageDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visFSTSimple = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visFSTOblique = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visUIVNormal = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visUIVHidden = Integer.valueOf(1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visLocFontIfArialOrSym = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visLocFontAlways = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visLocFontNever = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visSmartTagXJustifyLeft = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visSmartTagXJustifyCenter = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visSmartTagXJustifyRight = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visSmartTagYJustifyTop = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visSmartTagYJustifyMiddle = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visSmartTagYJustifyBottom = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visSmartTagDispModeMouseOver = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visSmartTagDispModeShapeSelected = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visSmartTagDispModeAlways = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visTFOKStandard = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visTFOKHorizontalInVertical = Integer.valueOf(1);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visPPFlagsRTLText = Integer.valueOf(1);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visXFormResizeDontCare", visXFormResizeDontCare);
    v.put("visXFormResizeSpread", visXFormResizeSpread);
    v.put("visXFormResizeScale", visXFormResizeScale);
    v.put("visArrowSizeVerySmall", visArrowSizeVerySmall);
    v.put("visArrowSizeSmall", visArrowSizeSmall);
    v.put("visArrowSizeMedium", visArrowSizeMedium);
    v.put("visArrowSizeLarge", visArrowSizeLarge);
    v.put("visArrowSizeVeryLarge", visArrowSizeVeryLarge);
    v.put("visArrowSizeJumbo", visArrowSizeJumbo);
    v.put("visArrowSizeColossal", visArrowSizeColossal);
    v.put("visNoFill", visNoFill);
    v.put("visSolid", visSolid);
    v.put("visWideUpDiagonal", visWideUpDiagonal);
    v.put("visWideCross", visWideCross);
    v.put("visWideDiagonalCross", visWideDiagonalCross);
    v.put("visWideDownDiagonal", visWideDownDiagonal);
    v.put("visWideHorz", visWideHorz);
    v.put("visWideVert", visWideVert);
    v.put("visBackDotsMini", visBackDotsMini);
    v.put("visHalfAndHalf", visHalfAndHalf);
    v.put("visForeDotsMini", visForeDotsMini);
    v.put("visForeDotsNarrow", visForeDotsNarrow);
    v.put("visForeDotsWide", visForeDotsWide);
    v.put("visThickHorz", visThickHorz);
    v.put("visThickVertical", visThickVertical);
    v.put("visThickDownDiagonal", visThickDownDiagonal);
    v.put("visThickUpDiagonal", visThickUpDiagonal);
    v.put("visThickDiagonalCross", visThickDiagonalCross);
    v.put("visBackDotsWide", visBackDotsWide);
    v.put("visThinHorz", visThinHorz);
    v.put("visThinVert", visThinVert);
    v.put("visThinDownDiagonal", visThinDownDiagonal);
    v.put("visThinUpDiagonal", visThinUpDiagonal);
    v.put("visThinCross", visThinCross);
    v.put("visThinDiagonalCross", visThinDiagonalCross);
    v.put("visGuideXActive", visGuideXActive);
    v.put("visGuideYActive", visGuideYActive);
    v.put("visPrintSetup", visPrintSetup);
    v.put("visTight", visTight);
    v.put("visStandard", visStandard);
    v.put("visCustom", visCustom);
    v.put("visLogical", visLogical);
    v.put("visDSMetric", visDSMetric);
    v.put("visDSEngr", visDSEngr);
    v.put("visDSArch", visDSArch);
    v.put("visNoScale", visNoScale);
    v.put("visArchitectural", visArchitectural);
    v.put("visEngineering", visEngineering);
    v.put("visScaleCustom", visScaleCustom);
    v.put("visScaleMetric", visScaleMetric);
    v.put("visScaleMechanical", visScaleMechanical);
    v.put("visVertTop", visVertTop);
    v.put("visVertMiddle", visVertMiddle);
    v.put("visVertBottom", visVertBottom);
    v.put("visTxtBlkOpaque", visTxtBlkOpaque);
    v.put("visTxtBlkLeftToRight", visTxtBlkLeftToRight);
    v.put("visTxtBlkTopToBottom", visTxtBlkTopToBottom);
    v.put("visDynFBDefault", visDynFBDefault);
    v.put("visDynFBUCon3Leg", visDynFBUCon3Leg);
    v.put("visDynFBUCon5Leg", visDynFBUCon5Leg);
    v.put("visGlueTypeDefault", visGlueTypeDefault);
    v.put("visGlueTypeTrigger", visGlueTypeTrigger);
    v.put("visGlueTypeWalking", visGlueTypeWalking);
    v.put("visGlueTypeNoWalking", visGlueTypeNoWalking);
    v.put("visGlueTypeNoWalkingTo", visGlueTypeNoWalkingTo);
    v.put("visWalkPrefBegNS", visWalkPrefBegNS);
    v.put("visWalkPrefEndNS", visWalkPrefEndNS);
    v.put("visLOFlagsVisDecides", visLOFlagsVisDecides);
    v.put("visLOFlagsPlacable", visLOFlagsPlacable);
    v.put("visLOFlagsRoutable", visLOFlagsRoutable);
    v.put("visLOFlagsDont", visLOFlagsDont);
    v.put("visLOFlagsPNRGroup", visLOFlagsPNRGroup);
    v.put("visLOIPlaceNormal", visLOIPlaceNormal);
    v.put("visLOIPlaceXPermeable", visLOIPlaceXPermeable);
    v.put("visLOIPlaceYPermeable", visLOIPlaceYPermeable);
    v.put("visLOIRouteNormal", visLOIRouteNormal);
    v.put("visLOBPlaceNormal", visLOBPlaceNormal);
    v.put("visLOBRouteNormal", visLOBRouteNormal);
    v.put("visLOBRouteRightAng", visLOBRouteRightAng);
    v.put("visLOBRouteStraight", visLOBRouteStraight);
    v.put("visLOBRouteFlowNS", visLOBRouteFlowNS);
    v.put("visLOBRouteFlowWE", visLOBRouteFlowWE);
    v.put("visLOBRouteTreeNS", visLOBRouteTreeNS);
    v.put("visLOBRouteTreeWE", visLOBRouteTreeWE);
    v.put("visLOBRouteManual", visLOBRouteManual);
    v.put("visRulerFine", visRulerFine);
    v.put("visRulerNormal", visRulerNormal);
    v.put("visRulerCoarse", visRulerCoarse);
    v.put("visRulerFixed", visRulerFixed);
    v.put("visGridFine", visGridFine);
    v.put("visGridNormal", visGridNormal);
    v.put("visGridCoarse", visGridCoarse);
    v.put("visGridFixed", visGridFixed);
    v.put("visDocPreviewQualityDraft", visDocPreviewQualityDraft);
    v.put("visDocPreviewQualityDetailed", visDocPreviewQualityDetailed);
    v.put("visDocPreviewScope1stPage", visDocPreviewScope1stPage);
    v.put("visDocPreviewScopeNone", visDocPreviewScopeNone);
    v.put("visDocPreviewScopeAllPages", visDocPreviewScopeAllPages);
    v.put("visPPOSameAsPrinter", visPPOSameAsPrinter);
    v.put("visPPOPortrait", visPPOPortrait);
    v.put("visPPOLandscape", visPPOLandscape);
    v.put("visGrpSelModeGroupOnly", visGrpSelModeGroupOnly);
    v.put("visGrpSelModeGroup1st", visGrpSelModeGroup1st);
    v.put("visGrpSelModeMembers1st", visGrpSelModeMembers1st);
    v.put("visGrpDispModeNone", visGrpDispModeNone);
    v.put("visGrpDispModeBack", visGrpDispModeBack);
    v.put("visGrpDispModeFront", visGrpDispModeFront);
    v.put("visLORouteDefault", visLORouteDefault);
    v.put("visLORouteRightAngle", visLORouteRightAngle);
    v.put("visLORouteStraight", visLORouteStraight);
    v.put("visLORouteOrgChartNS", visLORouteOrgChartNS);
    v.put("visLORouteOrgChartWE", visLORouteOrgChartWE);
    v.put("visLORouteFlowchartNS", visLORouteFlowchartNS);
    v.put("visLORouteFlowchartWE", visLORouteFlowchartWE);
    v.put("visLORouteTreeNS", visLORouteTreeNS);
    v.put("visLORouteTreeWE", visLORouteTreeWE);
    v.put("visLORouteNetwork", visLORouteNetwork);
    v.put("visLORouteOrgChartSN", visLORouteOrgChartSN);
    v.put("visLORouteOrgChartEW", visLORouteOrgChartEW);
    v.put("visLORouteFlowchartSN", visLORouteFlowchartSN);
    v.put("visLORouteFlowchartEW", visLORouteFlowchartEW);
    v.put("visLORouteTreeSN", visLORouteTreeSN);
    v.put("visLORouteTreeEW", visLORouteTreeEW);
    v.put("visLORouteCenterToCenter", visLORouteCenterToCenter);
    v.put("visLORouteSimpleNS", visLORouteSimpleNS);
    v.put("visLORouteSimpleWE", visLORouteSimpleWE);
    v.put("visLORouteSimpleSN", visLORouteSimpleSN);
    v.put("visLORouteSimpleEW", visLORouteSimpleEW);
    v.put("visLORouteSimpleHV", visLORouteSimpleHV);
    v.put("visLORouteSimpleVH", visLORouteSimpleVH);
    v.put("visLOJumpStyleDefault", visLOJumpStyleDefault);
    v.put("visLOJumpStyleArc", visLOJumpStyleArc);
    v.put("visLOJumpStyleGap", visLOJumpStyleGap);
    v.put("visLOJumpStyleSquare", visLOJumpStyleSquare);
    v.put("visLOJumpStyleTriangle", visLOJumpStyleTriangle);
    v.put("visLOJumpStyle2Point", visLOJumpStyle2Point);
    v.put("visLOJumpStyle3Point", visLOJumpStyle3Point);
    v.put("visLOJumpStyle4Point", visLOJumpStyle4Point);
    v.put("visLOJumpStyle5Point", visLOJumpStyle5Point);
    v.put("visLOJumpStyle6Point", visLOJumpStyle6Point);
    v.put("visLOJumpDirXDefault", visLOJumpDirXDefault);
    v.put("visLOJumpDirXUp", visLOJumpDirXUp);
    v.put("visLOJumpDirXDown", visLOJumpDirXDown);
    v.put("visLOJumpDirYDefault", visLOJumpDirYDefault);
    v.put("visLOJumpDirYLeft", visLOJumpDirYLeft);
    v.put("visLOJumpDirYRight", visLOJumpDirYRight);
    v.put("visLOFlipDefault", visLOFlipDefault);
    v.put("visLOFlipX", visLOFlipX);
    v.put("visLOFlipY", visLOFlipY);
    v.put("visLOFlipRotate", visLOFlipRotate);
    v.put("visLOFlipNone", visLOFlipNone);
    v.put("visLORouteExtDefault", visLORouteExtDefault);
    v.put("visLORouteExtStraight", visLORouteExtStraight);
    v.put("visLORouteExtNURBS", visLORouteExtNURBS);
    v.put("visSLOFixedPlacement", visSLOFixedPlacement);
    v.put("visSLOFixedPlow", visSLOFixedPlow);
    v.put("visSLOFixedPermeablePlow", visSLOFixedPermeablePlow);
    v.put("visSLOFixedConnPtsIgnore", visSLOFixedConnPtsIgnore);
    v.put("visSLOFixedConnPtsOnly", visSLOFixedConnPtsOnly);
    v.put("visSLOFixedNoFoldToShape", visSLOFixedNoFoldToShape);
    v.put("visSLOPlowDefault", visSLOPlowDefault);
    v.put("visSLOPlowNever", visSLOPlowNever);
    v.put("visSLOPlowAlways", visSLOPlowAlways);
    v.put("visSLOConFixedRerouteFreely", visSLOConFixedRerouteFreely);
    v.put("visSLOConFixedRerouteAsNeeded", visSLOConFixedRerouteAsNeeded);
    v.put("visSLOConFixedRerouteNever", visSLOConFixedRerouteNever);
    v.put("visSLOConFixedRerouteOnCrossover", visSLOConFixedRerouteOnCrossover);
    v.put("visSLOConFixedByAlgFrom", visSLOConFixedByAlgFrom);
    v.put("visSLOConFixedByAlgTo", visSLOConFixedByAlgTo);
    v.put("visSLOConFixedByAlgFromTo", visSLOConFixedByAlgFromTo);
    v.put("visSLOJumpDefault", visSLOJumpDefault);
    v.put("visSLOJumpNever", visSLOJumpNever);
    v.put("visSLOJumpAlways", visSLOJumpAlways);
    v.put("visSLOJumpOther", visSLOJumpOther);
    v.put("visSLOJumpNeither", visSLOJumpNeither);
    v.put("visPLOPlaceDefault", visPLOPlaceDefault);
    v.put("visPLOPlaceTopToBottom", visPLOPlaceTopToBottom);
    v.put("visPLOPlaceLeftToRight", visPLOPlaceLeftToRight);
    v.put("visPLOPlaceRadial", visPLOPlaceRadial);
    v.put("visPLOPlaceBottomToTop", visPLOPlaceBottomToTop);
    v.put("visPLOPlaceRightToLeft", visPLOPlaceRightToLeft);
    v.put("visPLOPlaceCircular", visPLOPlaceCircular);
    v.put("visPLOPlaceCompactDownRight", visPLOPlaceCompactDownRight);
    v.put("visPLOPlaceCompactRightDown", visPLOPlaceCompactRightDown);
    v.put("visPLOPlaceCompactRightUp", visPLOPlaceCompactRightUp);
    v.put("visPLOPlaceCompactUpRight", visPLOPlaceCompactUpRight);
    v.put("visPLOPlaceCompactUpLeft", visPLOPlaceCompactUpLeft);
    v.put("visPLOPlaceCompactLeftUp", visPLOPlaceCompactLeftUp);
    v.put("visPLOPlaceCompactLeftDown", visPLOPlaceCompactLeftDown);
    v.put("visPLOPlaceCompactDownLeft", visPLOPlaceCompactDownLeft);
    v.put("visPLOPlaceParentDefault", visPLOPlaceParentDefault);
    v.put("visPLOPlaceHierarchyTopToBottomLeft", visPLOPlaceHierarchyTopToBottomLeft);
    v.put("visPLOPlaceHierarchyTopToBottomCenter", visPLOPlaceHierarchyTopToBottomCenter);
    v.put("visPLOPlaceHierarchyTopToBottomRight", visPLOPlaceHierarchyTopToBottomRight);
    v.put("visPLOPlaceHierarchyBottomToTopLeft", visPLOPlaceHierarchyBottomToTopLeft);
    v.put("visPLOPlaceHierarchyBottomToTopCenter", visPLOPlaceHierarchyBottomToTopCenter);
    v.put("visPLOPlaceHierarchyBottomToTopRight", visPLOPlaceHierarchyBottomToTopRight);
    v.put("visPLOPlaceHierarchyLeftToRightTop", visPLOPlaceHierarchyLeftToRightTop);
    v.put("visPLOPlaceHierarchyLeftToRightMiddle", visPLOPlaceHierarchyLeftToRightMiddle);
    v.put("visPLOPlaceHierarchyLeftToRightBottom", visPLOPlaceHierarchyLeftToRightBottom);
    v.put("visPLOPlaceHierarchyRightToLeftTop", visPLOPlaceHierarchyRightToLeftTop);
    v.put("visPLOPlaceHierarchyRightToLeftMiddle", visPLOPlaceHierarchyRightToLeftMiddle);
    v.put("visPLOPlaceHierarchyRightToLeftBottom", visPLOPlaceHierarchyRightToLeftBottom);
    v.put("visLOPlaceDefault", visLOPlaceDefault);
    v.put("visLOPlaceTopToBottom", visLOPlaceTopToBottom);
    v.put("visLOPlaceLeftToRight", visLOPlaceLeftToRight);
    v.put("visLOPlaceRadial", visLOPlaceRadial);
    v.put("visLOPlaceBottomToTop", visLOPlaceBottomToTop);
    v.put("visLOPlaceRightToLeft", visLOPlaceRightToLeft);
    v.put("visLOPlaceCircular", visLOPlaceCircular);
    v.put("visLOPlaceCompactDownRight", visLOPlaceCompactDownRight);
    v.put("visLOPlaceCompactRightDown", visLOPlaceCompactRightDown);
    v.put("visLOPlaceCompactRightUp", visLOPlaceCompactRightUp);
    v.put("visLOPlaceCompactUpRight", visLOPlaceCompactUpRight);
    v.put("visLOPlaceCompactUpLeft", visLOPlaceCompactUpLeft);
    v.put("visLOPlaceCompactLeftUp", visLOPlaceCompactLeftUp);
    v.put("visLOPlaceCompactLeftDown", visLOPlaceCompactLeftDown);
    v.put("visLOPlaceCompactDownLeft", visLOPlaceCompactDownLeft);
    v.put("visLOPlaceParentDefault", visLOPlaceParentDefault);
    v.put("visLOPlaceHierarchyTopToBottomLeft", visLOPlaceHierarchyTopToBottomLeft);
    v.put("visLOPlaceHierarchyTopToBottomCenter", visLOPlaceHierarchyTopToBottomCenter);
    v.put("visLOPlaceHierarchyTopToBottomRight", visLOPlaceHierarchyTopToBottomRight);
    v.put("visLOPlaceHierarchyBottomToTopLeft", visLOPlaceHierarchyBottomToTopLeft);
    v.put("visLOPlaceHierarchyBottomToTopCenter", visLOPlaceHierarchyBottomToTopCenter);
    v.put("visLOPlaceHierarchyBottomToTopRight", visLOPlaceHierarchyBottomToTopRight);
    v.put("visLOPlaceHierarchyLeftToRightTop", visLOPlaceHierarchyLeftToRightTop);
    v.put("visLOPlaceHierarchyLeftToRightMiddle", visLOPlaceHierarchyLeftToRightMiddle);
    v.put("visLOPlaceHierarchyLeftToRightBottom", visLOPlaceHierarchyLeftToRightBottom);
    v.put("visLOPlaceHierarchyRightToLeftTop", visLOPlaceHierarchyRightToLeftTop);
    v.put("visLOPlaceHierarchyRightToLeftMiddle", visLOPlaceHierarchyRightToLeftMiddle);
    v.put("visLOPlaceHierarchyRightToLeftBottom", visLOPlaceHierarchyRightToLeftBottom);
    v.put("visPLOPlaceDepthDefault", visPLOPlaceDepthDefault);
    v.put("visPLOPlaceDepthMedium", visPLOPlaceDepthMedium);
    v.put("visPLOPlaceDepthDeep", visPLOPlaceDepthDeep);
    v.put("visPLOPlaceDepthShallow", visPLOPlaceDepthShallow);
    v.put("visPLOPlowNone", visPLOPlowNone);
    v.put("visPLOPlowAll", visPLOPlowAll);
    v.put("visPLOJumpNone", visPLOJumpNone);
    v.put("visPLOJumpHorizontal", visPLOJumpHorizontal);
    v.put("visPLOJumpVertical", visPLOJumpVertical);
    v.put("visPLOJumpLastRouted", visPLOJumpLastRouted);
    v.put("visPLOJumpDisplayOrder", visPLOJumpDisplayOrder);
    v.put("visPLOJumpReverseDisplayOrder", visPLOJumpReverseDisplayOrder);
    v.put("visPLOJumpProhibitAll", visPLOJumpProhibitAll);
    v.put("visPLOLineAdjustFromNotRelated", visPLOLineAdjustFromNotRelated);
    v.put("visPLOLineAdjustFromAll", visPLOLineAdjustFromAll);
    v.put("visPLOLineAdjustFromNone", visPLOLineAdjustFromNone);
    v.put("visPLOLineAdjustFromRoutingDefault", visPLOLineAdjustFromRoutingDefault);
    v.put("visPLOLineAdjustToDefault", visPLOLineAdjustToDefault);
    v.put("visPLOLineAdjustToAll", visPLOLineAdjustToAll);
    v.put("visPLOLineAdjustToNone", visPLOLineAdjustToNone);
    v.put("visPLOLineAdjustToRelated", visPLOLineAdjustToRelated);
    v.put("visBold", visBold);
    v.put("visItalic", visItalic);
    v.put("visUnderLine", visUnderLine);
    v.put("visSmallCaps", visSmallCaps);
    v.put("visComplexBold", visComplexBold);
    v.put("visComplexItalic", visComplexItalic);
    v.put("visCaseNormal", visCaseNormal);
    v.put("visCaseAllCaps", visCaseAllCaps);
    v.put("visCaseInitialCaps", visCaseInitialCaps);
    v.put("visPosNormal", visPosNormal);
    v.put("visPosSuper", visPosSuper);
    v.put("visPosSub", visPosSub);
    v.put("visHorzLeft", visHorzLeft);
    v.put("visHorzCenter", visHorzCenter);
    v.put("visHorzRight", visHorzRight);
    v.put("visHorzJustify", visHorzJustify);
    v.put("visHorzForce", visHorzForce);
    v.put("visHorzDistribute", visHorzDistribute);
    v.put("visHorzJustifyLow", visHorzJustifyLow);
    v.put("visHorzJustifyMedium", visHorzJustifyMedium);
    v.put("visHorzJustifyHigh", visHorzJustifyHigh);
    v.put("visTabStopLeft", visTabStopLeft);
    v.put("visTabStopCenter", visTabStopCenter);
    v.put("visTabStopRight", visTabStopRight);
    v.put("visTabStopDecimal", visTabStopDecimal);
    v.put("visTabStopComma", visTabStopComma);
    v.put("visCnnctTypeInward", visCnnctTypeInward);
    v.put("visCnnctTypeOutward", visCnnctTypeOutward);
    v.put("visCnnctTypeInwardOutward", visCnnctTypeInwardOutward);
    v.put("visCtlProportional", visCtlProportional);
    v.put("visCtlLocked", visCtlLocked);
    v.put("visCtlOffsetMin", visCtlOffsetMin);
    v.put("visCtlOffsetMid", visCtlOffsetMid);
    v.put("visCtlOffsetMax", visCtlOffsetMax);
    v.put("visCtlProportionalHidden", visCtlProportionalHidden);
    v.put("visCtlLockedHidden", visCtlLockedHidden);
    v.put("visCtlOffsetMinHidden", visCtlOffsetMinHidden);
    v.put("visCtlOffsetMidHidden", visCtlOffsetMidHidden);
    v.put("visCtlOffsetMaxHidden", visCtlOffsetMaxHidden);
    v.put("visNoLayerColor", visNoLayerColor);
    v.put("visLayerValid", visLayerValid);
    v.put("visLayerDeleted", visLayerDeleted);
    v.put("visLayerAvailable", visLayerAvailable);
    v.put("visPropTypeString", visPropTypeString);
    v.put("visPropTypeListFix", visPropTypeListFix);
    v.put("visPropTypeNumber", visPropTypeNumber);
    v.put("visPropTypeBool", visPropTypeBool);
    v.put("visPropTypeListVar", visPropTypeListVar);
    v.put("visPropTypeDate", visPropTypeDate);
    v.put("visPropTypeDuration", visPropTypeDuration);
    v.put("visPropTypeCurrency", visPropTypeCurrency);
    v.put("visCalWestern", visCalWestern);
    v.put("visCalArabicHijri", visCalArabicHijri);
    v.put("visCalHebrewLunar", visCalHebrewLunar);
    v.put("visCalChineseTaiwan", visCalChineseTaiwan);
    v.put("visCalJapaneseEmperor", visCalJapaneseEmperor);
    v.put("visCalThaiBuddhism", visCalThaiBuddhism);
    v.put("visCalThaiBuddhist", visCalThaiBuddhist);
    v.put("visCalKoreanDanki", visCalKoreanDanki);
    v.put("visCalSakaEra", visCalSakaEra);
    v.put("visCalTranslitEnglish", visCalTranslitEnglish);
    v.put("visCalTranslitFrench", visCalTranslitFrench);
    v.put("visPLOSplitNone", visPLOSplitNone);
    v.put("visPLOSplitAllow", visPLOSplitAllow);
    v.put("visSLOSplitNone", visSLOSplitNone);
    v.put("visSLOSplitAllow", visSLOSplitAllow);
    v.put("visSLOSplittableNone", visSLOSplittableNone);
    v.put("visSLOSplittableAllow", visSLOSplittableAllow);
    v.put("visFSTPageDefault", visFSTPageDefault);
    v.put("visFSTSimple", visFSTSimple);
    v.put("visFSTOblique", visFSTOblique);
    v.put("visUIVNormal", visUIVNormal);
    v.put("visUIVHidden", visUIVHidden);
    v.put("visLocFontIfArialOrSym", visLocFontIfArialOrSym);
    v.put("visLocFontAlways", visLocFontAlways);
    v.put("visLocFontNever", visLocFontNever);
    v.put("visSmartTagXJustifyLeft", visSmartTagXJustifyLeft);
    v.put("visSmartTagXJustifyCenter", visSmartTagXJustifyCenter);
    v.put("visSmartTagXJustifyRight", visSmartTagXJustifyRight);
    v.put("visSmartTagYJustifyTop", visSmartTagYJustifyTop);
    v.put("visSmartTagYJustifyMiddle", visSmartTagYJustifyMiddle);
    v.put("visSmartTagYJustifyBottom", visSmartTagYJustifyBottom);
    v.put("visSmartTagDispModeMouseOver", visSmartTagDispModeMouseOver);
    v.put("visSmartTagDispModeShapeSelected", visSmartTagDispModeShapeSelected);
    v.put("visSmartTagDispModeAlways", visSmartTagDispModeAlways);
    v.put("visTFOKStandard", visTFOKStandard);
    v.put("visTFOKHorizontalInVertical", visTFOKHorizontalInVertical);
    v.put("visPPFlagsRTLText", visPPFlagsRTLText);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
