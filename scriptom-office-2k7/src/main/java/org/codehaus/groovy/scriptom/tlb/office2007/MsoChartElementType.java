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
package org.codehaus.groovy.scriptom.tlb.office2007;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class MsoChartElementType
{
  private MsoChartElementType()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer msoElementChartTitleNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoElementChartTitleCenteredOverlay = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoElementChartTitleAboveChart = Integer.valueOf(2);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer msoElementLegendNone = Integer.valueOf(100);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer msoElementLegendRight = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer msoElementLegendTop = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer msoElementLegendLeft = Integer.valueOf(103);

  /**
   * Value is 104 (0x68)
   */
  public static final Integer msoElementLegendBottom = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer msoElementLegendRightOverlay = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer msoElementLegendLeftOverlay = Integer.valueOf(106);

  /**
   * Value is 200 (0xC8)
   */
  public static final Integer msoElementDataLabelNone = Integer.valueOf(200);

  /**
   * Value is 201 (0xC9)
   */
  public static final Integer msoElementDataLabelShow = Integer.valueOf(201);

  /**
   * Value is 202 (0xCA)
   */
  public static final Integer msoElementDataLabelCenter = Integer.valueOf(202);

  /**
   * Value is 203 (0xCB)
   */
  public static final Integer msoElementDataLabelInsideEnd = Integer.valueOf(203);

  /**
   * Value is 204 (0xCC)
   */
  public static final Integer msoElementDataLabelInsideBase = Integer.valueOf(204);

  /**
   * Value is 205 (0xCD)
   */
  public static final Integer msoElementDataLabelOutSideEnd = Integer.valueOf(205);

  /**
   * Value is 206 (0xCE)
   */
  public static final Integer msoElementDataLabelLeft = Integer.valueOf(206);

  /**
   * Value is 207 (0xCF)
   */
  public static final Integer msoElementDataLabelRight = Integer.valueOf(207);

  /**
   * Value is 208 (0xD0)
   */
  public static final Integer msoElementDataLabelTop = Integer.valueOf(208);

  /**
   * Value is 209 (0xD1)
   */
  public static final Integer msoElementDataLabelBottom = Integer.valueOf(209);

  /**
   * Value is 210 (0xD2)
   */
  public static final Integer msoElementDataLabelBestFit = Integer.valueOf(210);

  /**
   * Value is 300 (0x12C)
   */
  public static final Integer msoElementPrimaryCategoryAxisTitleNone = Integer.valueOf(300);

  /**
   * Value is 301 (0x12D)
   */
  public static final Integer msoElementPrimaryCategoryAxisTitleAdjacentToAxis = Integer.valueOf(301);

  /**
   * Value is 302 (0x12E)
   */
  public static final Integer msoElementPrimaryCategoryAxisTitleBelowAxis = Integer.valueOf(302);

  /**
   * Value is 303 (0x12F)
   */
  public static final Integer msoElementPrimaryCategoryAxisTitleRotated = Integer.valueOf(303);

  /**
   * Value is 304 (0x130)
   */
  public static final Integer msoElementPrimaryCategoryAxisTitleVertical = Integer.valueOf(304);

  /**
   * Value is 305 (0x131)
   */
  public static final Integer msoElementPrimaryCategoryAxisTitleHorizontal = Integer.valueOf(305);

  /**
   * Value is 306 (0x132)
   */
  public static final Integer msoElementPrimaryValueAxisTitleNone = Integer.valueOf(306);

  /**
   * Value is 306 (0x132)
   */
  public static final Integer msoElementPrimaryValueAxisTitleAdjacentToAxis = Integer.valueOf(306);

  /**
   * Value is 308 (0x134)
   */
  public static final Integer msoElementPrimaryValueAxisTitleBelowAxis = Integer.valueOf(308);

  /**
   * Value is 309 (0x135)
   */
  public static final Integer msoElementPrimaryValueAxisTitleRotated = Integer.valueOf(309);

  /**
   * Value is 310 (0x136)
   */
  public static final Integer msoElementPrimaryValueAxisTitleVertical = Integer.valueOf(310);

  /**
   * Value is 311 (0x137)
   */
  public static final Integer msoElementPrimaryValueAxisTitleHorizontal = Integer.valueOf(311);

  /**
   * Value is 312 (0x138)
   */
  public static final Integer msoElementSecondaryCategoryAxisTitleNone = Integer.valueOf(312);

  /**
   * Value is 313 (0x139)
   */
  public static final Integer msoElementSecondaryCategoryAxisTitleAdjacentToAxis = Integer.valueOf(313);

  /**
   * Value is 314 (0x13A)
   */
  public static final Integer msoElementSecondaryCategoryAxisTitleBelowAxis = Integer.valueOf(314);

  /**
   * Value is 315 (0x13B)
   */
  public static final Integer msoElementSecondaryCategoryAxisTitleRotated = Integer.valueOf(315);

  /**
   * Value is 316 (0x13C)
   */
  public static final Integer msoElementSecondaryCategoryAxisTitleVertical = Integer.valueOf(316);

  /**
   * Value is 317 (0x13D)
   */
  public static final Integer msoElementSecondaryCategoryAxisTitleHorizontal = Integer.valueOf(317);

  /**
   * Value is 318 (0x13E)
   */
  public static final Integer msoElementSecondaryValueAxisTitleNone = Integer.valueOf(318);

  /**
   * Value is 319 (0x13F)
   */
  public static final Integer msoElementSecondaryValueAxisTitleAdjacentToAxis = Integer.valueOf(319);

  /**
   * Value is 320 (0x140)
   */
  public static final Integer msoElementSecondaryValueAxisTitleBelowAxis = Integer.valueOf(320);

  /**
   * Value is 321 (0x141)
   */
  public static final Integer msoElementSecondaryValueAxisTitleRotated = Integer.valueOf(321);

  /**
   * Value is 322 (0x142)
   */
  public static final Integer msoElementSecondaryValueAxisTitleVertical = Integer.valueOf(322);

  /**
   * Value is 323 (0x143)
   */
  public static final Integer msoElementSecondaryValueAxisTitleHorizontal = Integer.valueOf(323);

  /**
   * Value is 324 (0x144)
   */
  public static final Integer msoElementSeriesAxisTitleNone = Integer.valueOf(324);

  /**
   * Value is 325 (0x145)
   */
  public static final Integer msoElementSeriesAxisTitleRotated = Integer.valueOf(325);

  /**
   * Value is 326 (0x146)
   */
  public static final Integer msoElementSeriesAxisTitleVertical = Integer.valueOf(326);

  /**
   * Value is 327 (0x147)
   */
  public static final Integer msoElementSeriesAxisTitleHorizontal = Integer.valueOf(327);

  /**
   * Value is 328 (0x148)
   */
  public static final Integer msoElementPrimaryValueGridLinesNone = Integer.valueOf(328);

  /**
   * Value is 329 (0x149)
   */
  public static final Integer msoElementPrimaryValueGridLinesMinor = Integer.valueOf(329);

  /**
   * Value is 330 (0x14A)
   */
  public static final Integer msoElementPrimaryValueGridLinesMajor = Integer.valueOf(330);

  /**
   * Value is 331 (0x14B)
   */
  public static final Integer msoElementPrimaryValueGridLinesMinorMajor = Integer.valueOf(331);

  /**
   * Value is 332 (0x14C)
   */
  public static final Integer msoElementPrimaryCategoryGridLinesNone = Integer.valueOf(332);

  /**
   * Value is 333 (0x14D)
   */
  public static final Integer msoElementPrimaryCategoryGridLinesMinor = Integer.valueOf(333);

  /**
   * Value is 334 (0x14E)
   */
  public static final Integer msoElementPrimaryCategoryGridLinesMajor = Integer.valueOf(334);

  /**
   * Value is 335 (0x14F)
   */
  public static final Integer msoElementPrimaryCategoryGridLinesMinorMajor = Integer.valueOf(335);

  /**
   * Value is 336 (0x150)
   */
  public static final Integer msoElementSecondaryValueGridLinesNone = Integer.valueOf(336);

  /**
   * Value is 337 (0x151)
   */
  public static final Integer msoElementSecondaryValueGridLinesMinor = Integer.valueOf(337);

  /**
   * Value is 338 (0x152)
   */
  public static final Integer msoElementSecondaryValueGridLinesMajor = Integer.valueOf(338);

  /**
   * Value is 339 (0x153)
   */
  public static final Integer msoElementSecondaryValueGridLinesMinorMajor = Integer.valueOf(339);

  /**
   * Value is 340 (0x154)
   */
  public static final Integer msoElementSecondaryCategoryGridLinesNone = Integer.valueOf(340);

  /**
   * Value is 341 (0x155)
   */
  public static final Integer msoElementSecondaryCategoryGridLinesMinor = Integer.valueOf(341);

  /**
   * Value is 342 (0x156)
   */
  public static final Integer msoElementSecondaryCategoryGridLinesMajor = Integer.valueOf(342);

  /**
   * Value is 343 (0x157)
   */
  public static final Integer msoElementSecondaryCategoryGridLinesMinorMajor = Integer.valueOf(343);

  /**
   * Value is 344 (0x158)
   */
  public static final Integer msoElementSeriesAxisGridLinesNone = Integer.valueOf(344);

  /**
   * Value is 345 (0x159)
   */
  public static final Integer msoElementSeriesAxisGridLinesMinor = Integer.valueOf(345);

  /**
   * Value is 346 (0x15A)
   */
  public static final Integer msoElementSeriesAxisGridLinesMajor = Integer.valueOf(346);

  /**
   * Value is 347 (0x15B)
   */
  public static final Integer msoElementSeriesAxisGridLinesMinorMajor = Integer.valueOf(347);

  /**
   * Value is 348 (0x15C)
   */
  public static final Integer msoElementPrimaryCategoryAxisNone = Integer.valueOf(348);

  /**
   * Value is 349 (0x15D)
   */
  public static final Integer msoElementPrimaryCategoryAxisShow = Integer.valueOf(349);

  /**
   * Value is 350 (0x15E)
   */
  public static final Integer msoElementPrimaryCategoryAxisWithoutLabels = Integer.valueOf(350);

  /**
   * Value is 351 (0x15F)
   */
  public static final Integer msoElementPrimaryCategoryAxisReverse = Integer.valueOf(351);

  /**
   * Value is 352 (0x160)
   */
  public static final Integer msoElementPrimaryValueAxisNone = Integer.valueOf(352);

  /**
   * Value is 353 (0x161)
   */
  public static final Integer msoElementPrimaryValueAxisShow = Integer.valueOf(353);

  /**
   * Value is 354 (0x162)
   */
  public static final Integer msoElementPrimaryValueAxisThousands = Integer.valueOf(354);

  /**
   * Value is 355 (0x163)
   */
  public static final Integer msoElementPrimaryValueAxisMillions = Integer.valueOf(355);

  /**
   * Value is 356 (0x164)
   */
  public static final Integer msoElementPrimaryValueAxisBillions = Integer.valueOf(356);

  /**
   * Value is 357 (0x165)
   */
  public static final Integer msoElementPrimaryValueAxisLogScale = Integer.valueOf(357);

  /**
   * Value is 358 (0x166)
   */
  public static final Integer msoElementSecondaryCategoryAxisNone = Integer.valueOf(358);

  /**
   * Value is 359 (0x167)
   */
  public static final Integer msoElementSecondaryCategoryAxisShow = Integer.valueOf(359);

  /**
   * Value is 360 (0x168)
   */
  public static final Integer msoElementSecondaryCategoryAxisWithoutLabels = Integer.valueOf(360);

  /**
   * Value is 361 (0x169)
   */
  public static final Integer msoElementSecondaryCategoryAxisReverse = Integer.valueOf(361);

  /**
   * Value is 362 (0x16A)
   */
  public static final Integer msoElementSecondaryValueAxisNone = Integer.valueOf(362);

  /**
   * Value is 363 (0x16B)
   */
  public static final Integer msoElementSecondaryValueAxisShow = Integer.valueOf(363);

  /**
   * Value is 364 (0x16C)
   */
  public static final Integer msoElementSecondaryValueAxisThousands = Integer.valueOf(364);

  /**
   * Value is 365 (0x16D)
   */
  public static final Integer msoElementSecondaryValueAxisMillions = Integer.valueOf(365);

  /**
   * Value is 366 (0x16E)
   */
  public static final Integer msoElementSecondaryValueAxisBillions = Integer.valueOf(366);

  /**
   * Value is 367 (0x16F)
   */
  public static final Integer msoElementSecondaryValueAxisLogScale = Integer.valueOf(367);

  /**
   * Value is 368 (0x170)
   */
  public static final Integer msoElementSeriesAxisNone = Integer.valueOf(368);

  /**
   * Value is 369 (0x171)
   */
  public static final Integer msoElementSeriesAxisShow = Integer.valueOf(369);

  /**
   * Value is 370 (0x172)
   */
  public static final Integer msoElementSeriesAxisWithoutLabeling = Integer.valueOf(370);

  /**
   * Value is 371 (0x173)
   */
  public static final Integer msoElementSeriesAxisReverse = Integer.valueOf(371);

  /**
   * Value is 372 (0x174)
   */
  public static final Integer msoElementPrimaryCategoryAxisThousands = Integer.valueOf(372);

  /**
   * Value is 373 (0x175)
   */
  public static final Integer msoElementPrimaryCategoryAxisMillions = Integer.valueOf(373);

  /**
   * Value is 374 (0x176)
   */
  public static final Integer msoElementPrimaryCategoryAxisBillions = Integer.valueOf(374);

  /**
   * Value is 375 (0x177)
   */
  public static final Integer msoElementPrimaryCategoryAxisLogScale = Integer.valueOf(375);

  /**
   * Value is 376 (0x178)
   */
  public static final Integer msoElementSecondaryCategoryAxisThousands = Integer.valueOf(376);

  /**
   * Value is 377 (0x179)
   */
  public static final Integer msoElementSecondaryCategoryAxisMillions = Integer.valueOf(377);

  /**
   * Value is 378 (0x17A)
   */
  public static final Integer msoElementSecondaryCategoryAxisBillions = Integer.valueOf(378);

  /**
   * Value is 379 (0x17B)
   */
  public static final Integer msoElementSecondaryCategoryAxisLogScale = Integer.valueOf(379);

  /**
   * Value is 500 (0x1F4)
   */
  public static final Integer msoElementDataTableNone = Integer.valueOf(500);

  /**
   * Value is 501 (0x1F5)
   */
  public static final Integer msoElementDataTableShow = Integer.valueOf(501);

  /**
   * Value is 502 (0x1F6)
   */
  public static final Integer msoElementDataTableWithLegendKeys = Integer.valueOf(502);

  /**
   * Value is 600 (0x258)
   */
  public static final Integer msoElementTrendlineNone = Integer.valueOf(600);

  /**
   * Value is 601 (0x259)
   */
  public static final Integer msoElementTrendlineAddLinear = Integer.valueOf(601);

  /**
   * Value is 602 (0x25A)
   */
  public static final Integer msoElementTrendlineAddExponential = Integer.valueOf(602);

  /**
   * Value is 603 (0x25B)
   */
  public static final Integer msoElementTrendlineAddLinearForecast = Integer.valueOf(603);

  /**
   * Value is 604 (0x25C)
   */
  public static final Integer msoElementTrendlineAddTwoPeriodMovingAverage = Integer.valueOf(604);

  /**
   * Value is 700 (0x2BC)
   */
  public static final Integer msoElementErrorBarNone = Integer.valueOf(700);

  /**
   * Value is 701 (0x2BD)
   */
  public static final Integer msoElementErrorBarStandardError = Integer.valueOf(701);

  /**
   * Value is 702 (0x2BE)
   */
  public static final Integer msoElementErrorBarPercentage = Integer.valueOf(702);

  /**
   * Value is 703 (0x2BF)
   */
  public static final Integer msoElementErrorBarStandardDeviation = Integer.valueOf(703);

  /**
   * Value is 800 (0x320)
   */
  public static final Integer msoElementLineNone = Integer.valueOf(800);

  /**
   * Value is 801 (0x321)
   */
  public static final Integer msoElementLineDropLine = Integer.valueOf(801);

  /**
   * Value is 802 (0x322)
   */
  public static final Integer msoElementLineHiLoLine = Integer.valueOf(802);

  /**
   * Value is 803 (0x323)
   */
  public static final Integer msoElementLineSeriesLine = Integer.valueOf(803);

  /**
   * Value is 804 (0x324)
   */
  public static final Integer msoElementLineDropHiLoLine = Integer.valueOf(804);

  /**
   * Value is 900 (0x384)
   */
  public static final Integer msoElementUpDownBarsNone = Integer.valueOf(900);

  /**
   * Value is 901 (0x385)
   */
  public static final Integer msoElementUpDownBarsShow = Integer.valueOf(901);

  /**
   * Value is 1000 (0x3E8)
   */
  public static final Integer msoElementPlotAreaNone = Integer.valueOf(1000);

  /**
   * Value is 1001 (0x3E9)
   */
  public static final Integer msoElementPlotAreaShow = Integer.valueOf(1001);

  /**
   * Value is 1100 (0x44C)
   */
  public static final Integer msoElementChartWallNone = Integer.valueOf(1100);

  /**
   * Value is 1101 (0x44D)
   */
  public static final Integer msoElementChartWallShow = Integer.valueOf(1101);

  /**
   * Value is 1200 (0x4B0)
   */
  public static final Integer msoElementChartFloorNone = Integer.valueOf(1200);

  /**
   * Value is 1201 (0x4B1)
   */
  public static final Integer msoElementChartFloorShow = Integer.valueOf(1201);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoElementChartTitleNone", msoElementChartTitleNone);
    v.put("msoElementChartTitleCenteredOverlay", msoElementChartTitleCenteredOverlay);
    v.put("msoElementChartTitleAboveChart", msoElementChartTitleAboveChart);
    v.put("msoElementLegendNone", msoElementLegendNone);
    v.put("msoElementLegendRight", msoElementLegendRight);
    v.put("msoElementLegendTop", msoElementLegendTop);
    v.put("msoElementLegendLeft", msoElementLegendLeft);
    v.put("msoElementLegendBottom", msoElementLegendBottom);
    v.put("msoElementLegendRightOverlay", msoElementLegendRightOverlay);
    v.put("msoElementLegendLeftOverlay", msoElementLegendLeftOverlay);
    v.put("msoElementDataLabelNone", msoElementDataLabelNone);
    v.put("msoElementDataLabelShow", msoElementDataLabelShow);
    v.put("msoElementDataLabelCenter", msoElementDataLabelCenter);
    v.put("msoElementDataLabelInsideEnd", msoElementDataLabelInsideEnd);
    v.put("msoElementDataLabelInsideBase", msoElementDataLabelInsideBase);
    v.put("msoElementDataLabelOutSideEnd", msoElementDataLabelOutSideEnd);
    v.put("msoElementDataLabelLeft", msoElementDataLabelLeft);
    v.put("msoElementDataLabelRight", msoElementDataLabelRight);
    v.put("msoElementDataLabelTop", msoElementDataLabelTop);
    v.put("msoElementDataLabelBottom", msoElementDataLabelBottom);
    v.put("msoElementDataLabelBestFit", msoElementDataLabelBestFit);
    v.put("msoElementPrimaryCategoryAxisTitleNone", msoElementPrimaryCategoryAxisTitleNone);
    v.put("msoElementPrimaryCategoryAxisTitleAdjacentToAxis", msoElementPrimaryCategoryAxisTitleAdjacentToAxis);
    v.put("msoElementPrimaryCategoryAxisTitleBelowAxis", msoElementPrimaryCategoryAxisTitleBelowAxis);
    v.put("msoElementPrimaryCategoryAxisTitleRotated", msoElementPrimaryCategoryAxisTitleRotated);
    v.put("msoElementPrimaryCategoryAxisTitleVertical", msoElementPrimaryCategoryAxisTitleVertical);
    v.put("msoElementPrimaryCategoryAxisTitleHorizontal", msoElementPrimaryCategoryAxisTitleHorizontal);
    v.put("msoElementPrimaryValueAxisTitleNone", msoElementPrimaryValueAxisTitleNone);
    v.put("msoElementPrimaryValueAxisTitleAdjacentToAxis", msoElementPrimaryValueAxisTitleAdjacentToAxis);
    v.put("msoElementPrimaryValueAxisTitleBelowAxis", msoElementPrimaryValueAxisTitleBelowAxis);
    v.put("msoElementPrimaryValueAxisTitleRotated", msoElementPrimaryValueAxisTitleRotated);
    v.put("msoElementPrimaryValueAxisTitleVertical", msoElementPrimaryValueAxisTitleVertical);
    v.put("msoElementPrimaryValueAxisTitleHorizontal", msoElementPrimaryValueAxisTitleHorizontal);
    v.put("msoElementSecondaryCategoryAxisTitleNone", msoElementSecondaryCategoryAxisTitleNone);
    v.put("msoElementSecondaryCategoryAxisTitleAdjacentToAxis", msoElementSecondaryCategoryAxisTitleAdjacentToAxis);
    v.put("msoElementSecondaryCategoryAxisTitleBelowAxis", msoElementSecondaryCategoryAxisTitleBelowAxis);
    v.put("msoElementSecondaryCategoryAxisTitleRotated", msoElementSecondaryCategoryAxisTitleRotated);
    v.put("msoElementSecondaryCategoryAxisTitleVertical", msoElementSecondaryCategoryAxisTitleVertical);
    v.put("msoElementSecondaryCategoryAxisTitleHorizontal", msoElementSecondaryCategoryAxisTitleHorizontal);
    v.put("msoElementSecondaryValueAxisTitleNone", msoElementSecondaryValueAxisTitleNone);
    v.put("msoElementSecondaryValueAxisTitleAdjacentToAxis", msoElementSecondaryValueAxisTitleAdjacentToAxis);
    v.put("msoElementSecondaryValueAxisTitleBelowAxis", msoElementSecondaryValueAxisTitleBelowAxis);
    v.put("msoElementSecondaryValueAxisTitleRotated", msoElementSecondaryValueAxisTitleRotated);
    v.put("msoElementSecondaryValueAxisTitleVertical", msoElementSecondaryValueAxisTitleVertical);
    v.put("msoElementSecondaryValueAxisTitleHorizontal", msoElementSecondaryValueAxisTitleHorizontal);
    v.put("msoElementSeriesAxisTitleNone", msoElementSeriesAxisTitleNone);
    v.put("msoElementSeriesAxisTitleRotated", msoElementSeriesAxisTitleRotated);
    v.put("msoElementSeriesAxisTitleVertical", msoElementSeriesAxisTitleVertical);
    v.put("msoElementSeriesAxisTitleHorizontal", msoElementSeriesAxisTitleHorizontal);
    v.put("msoElementPrimaryValueGridLinesNone", msoElementPrimaryValueGridLinesNone);
    v.put("msoElementPrimaryValueGridLinesMinor", msoElementPrimaryValueGridLinesMinor);
    v.put("msoElementPrimaryValueGridLinesMajor", msoElementPrimaryValueGridLinesMajor);
    v.put("msoElementPrimaryValueGridLinesMinorMajor", msoElementPrimaryValueGridLinesMinorMajor);
    v.put("msoElementPrimaryCategoryGridLinesNone", msoElementPrimaryCategoryGridLinesNone);
    v.put("msoElementPrimaryCategoryGridLinesMinor", msoElementPrimaryCategoryGridLinesMinor);
    v.put("msoElementPrimaryCategoryGridLinesMajor", msoElementPrimaryCategoryGridLinesMajor);
    v.put("msoElementPrimaryCategoryGridLinesMinorMajor", msoElementPrimaryCategoryGridLinesMinorMajor);
    v.put("msoElementSecondaryValueGridLinesNone", msoElementSecondaryValueGridLinesNone);
    v.put("msoElementSecondaryValueGridLinesMinor", msoElementSecondaryValueGridLinesMinor);
    v.put("msoElementSecondaryValueGridLinesMajor", msoElementSecondaryValueGridLinesMajor);
    v.put("msoElementSecondaryValueGridLinesMinorMajor", msoElementSecondaryValueGridLinesMinorMajor);
    v.put("msoElementSecondaryCategoryGridLinesNone", msoElementSecondaryCategoryGridLinesNone);
    v.put("msoElementSecondaryCategoryGridLinesMinor", msoElementSecondaryCategoryGridLinesMinor);
    v.put("msoElementSecondaryCategoryGridLinesMajor", msoElementSecondaryCategoryGridLinesMajor);
    v.put("msoElementSecondaryCategoryGridLinesMinorMajor", msoElementSecondaryCategoryGridLinesMinorMajor);
    v.put("msoElementSeriesAxisGridLinesNone", msoElementSeriesAxisGridLinesNone);
    v.put("msoElementSeriesAxisGridLinesMinor", msoElementSeriesAxisGridLinesMinor);
    v.put("msoElementSeriesAxisGridLinesMajor", msoElementSeriesAxisGridLinesMajor);
    v.put("msoElementSeriesAxisGridLinesMinorMajor", msoElementSeriesAxisGridLinesMinorMajor);
    v.put("msoElementPrimaryCategoryAxisNone", msoElementPrimaryCategoryAxisNone);
    v.put("msoElementPrimaryCategoryAxisShow", msoElementPrimaryCategoryAxisShow);
    v.put("msoElementPrimaryCategoryAxisWithoutLabels", msoElementPrimaryCategoryAxisWithoutLabels);
    v.put("msoElementPrimaryCategoryAxisReverse", msoElementPrimaryCategoryAxisReverse);
    v.put("msoElementPrimaryValueAxisNone", msoElementPrimaryValueAxisNone);
    v.put("msoElementPrimaryValueAxisShow", msoElementPrimaryValueAxisShow);
    v.put("msoElementPrimaryValueAxisThousands", msoElementPrimaryValueAxisThousands);
    v.put("msoElementPrimaryValueAxisMillions", msoElementPrimaryValueAxisMillions);
    v.put("msoElementPrimaryValueAxisBillions", msoElementPrimaryValueAxisBillions);
    v.put("msoElementPrimaryValueAxisLogScale", msoElementPrimaryValueAxisLogScale);
    v.put("msoElementSecondaryCategoryAxisNone", msoElementSecondaryCategoryAxisNone);
    v.put("msoElementSecondaryCategoryAxisShow", msoElementSecondaryCategoryAxisShow);
    v.put("msoElementSecondaryCategoryAxisWithoutLabels", msoElementSecondaryCategoryAxisWithoutLabels);
    v.put("msoElementSecondaryCategoryAxisReverse", msoElementSecondaryCategoryAxisReverse);
    v.put("msoElementSecondaryValueAxisNone", msoElementSecondaryValueAxisNone);
    v.put("msoElementSecondaryValueAxisShow", msoElementSecondaryValueAxisShow);
    v.put("msoElementSecondaryValueAxisThousands", msoElementSecondaryValueAxisThousands);
    v.put("msoElementSecondaryValueAxisMillions", msoElementSecondaryValueAxisMillions);
    v.put("msoElementSecondaryValueAxisBillions", msoElementSecondaryValueAxisBillions);
    v.put("msoElementSecondaryValueAxisLogScale", msoElementSecondaryValueAxisLogScale);
    v.put("msoElementSeriesAxisNone", msoElementSeriesAxisNone);
    v.put("msoElementSeriesAxisShow", msoElementSeriesAxisShow);
    v.put("msoElementSeriesAxisWithoutLabeling", msoElementSeriesAxisWithoutLabeling);
    v.put("msoElementSeriesAxisReverse", msoElementSeriesAxisReverse);
    v.put("msoElementPrimaryCategoryAxisThousands", msoElementPrimaryCategoryAxisThousands);
    v.put("msoElementPrimaryCategoryAxisMillions", msoElementPrimaryCategoryAxisMillions);
    v.put("msoElementPrimaryCategoryAxisBillions", msoElementPrimaryCategoryAxisBillions);
    v.put("msoElementPrimaryCategoryAxisLogScale", msoElementPrimaryCategoryAxisLogScale);
    v.put("msoElementSecondaryCategoryAxisThousands", msoElementSecondaryCategoryAxisThousands);
    v.put("msoElementSecondaryCategoryAxisMillions", msoElementSecondaryCategoryAxisMillions);
    v.put("msoElementSecondaryCategoryAxisBillions", msoElementSecondaryCategoryAxisBillions);
    v.put("msoElementSecondaryCategoryAxisLogScale", msoElementSecondaryCategoryAxisLogScale);
    v.put("msoElementDataTableNone", msoElementDataTableNone);
    v.put("msoElementDataTableShow", msoElementDataTableShow);
    v.put("msoElementDataTableWithLegendKeys", msoElementDataTableWithLegendKeys);
    v.put("msoElementTrendlineNone", msoElementTrendlineNone);
    v.put("msoElementTrendlineAddLinear", msoElementTrendlineAddLinear);
    v.put("msoElementTrendlineAddExponential", msoElementTrendlineAddExponential);
    v.put("msoElementTrendlineAddLinearForecast", msoElementTrendlineAddLinearForecast);
    v.put("msoElementTrendlineAddTwoPeriodMovingAverage", msoElementTrendlineAddTwoPeriodMovingAverage);
    v.put("msoElementErrorBarNone", msoElementErrorBarNone);
    v.put("msoElementErrorBarStandardError", msoElementErrorBarStandardError);
    v.put("msoElementErrorBarPercentage", msoElementErrorBarPercentage);
    v.put("msoElementErrorBarStandardDeviation", msoElementErrorBarStandardDeviation);
    v.put("msoElementLineNone", msoElementLineNone);
    v.put("msoElementLineDropLine", msoElementLineDropLine);
    v.put("msoElementLineHiLoLine", msoElementLineHiLoLine);
    v.put("msoElementLineSeriesLine", msoElementLineSeriesLine);
    v.put("msoElementLineDropHiLoLine", msoElementLineDropHiLoLine);
    v.put("msoElementUpDownBarsNone", msoElementUpDownBarsNone);
    v.put("msoElementUpDownBarsShow", msoElementUpDownBarsShow);
    v.put("msoElementPlotAreaNone", msoElementPlotAreaNone);
    v.put("msoElementPlotAreaShow", msoElementPlotAreaShow);
    v.put("msoElementChartWallNone", msoElementChartWallNone);
    v.put("msoElementChartWallShow", msoElementChartWallShow);
    v.put("msoElementChartFloorNone", msoElementChartFloorNone);
    v.put("msoElementChartFloorShow", msoElementChartFloorShow);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
