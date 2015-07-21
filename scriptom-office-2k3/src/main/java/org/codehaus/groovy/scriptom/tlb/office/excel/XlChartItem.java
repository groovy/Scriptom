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
package org.codehaus.groovy.scriptom.tlb.office.excel;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class XlChartItem
{
  private XlChartItem()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer xlDataLabel = Integer.valueOf(0);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlChartArea = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlSeries = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlChartTitle = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlWalls = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlCorners = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlDataTable = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlTrendline = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer xlErrorBars = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer xlXErrorBars = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlYErrorBars = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlLegendEntry = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlLegendKey = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlShape = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlMajorGridlines = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlMinorGridlines = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer xlAxisTitle = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer xlUpBars = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer xlPlotArea = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer xlDownBars = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer xlAxis = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer xlSeriesLines = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer xlFloor = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer xlLegend = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer xlHiLoLines = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer xlDropLines = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer xlRadarAxisLabels = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer xlNothing = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer xlLeaderLines = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer xlDisplayUnitLabel = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer xlPivotChartFieldButton = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer xlPivotChartDropZone = Integer.valueOf(32);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlDataLabel", xlDataLabel);
    v.put("xlChartArea", xlChartArea);
    v.put("xlSeries", xlSeries);
    v.put("xlChartTitle", xlChartTitle);
    v.put("xlWalls", xlWalls);
    v.put("xlCorners", xlCorners);
    v.put("xlDataTable", xlDataTable);
    v.put("xlTrendline", xlTrendline);
    v.put("xlErrorBars", xlErrorBars);
    v.put("xlXErrorBars", xlXErrorBars);
    v.put("xlYErrorBars", xlYErrorBars);
    v.put("xlLegendEntry", xlLegendEntry);
    v.put("xlLegendKey", xlLegendKey);
    v.put("xlShape", xlShape);
    v.put("xlMajorGridlines", xlMajorGridlines);
    v.put("xlMinorGridlines", xlMinorGridlines);
    v.put("xlAxisTitle", xlAxisTitle);
    v.put("xlUpBars", xlUpBars);
    v.put("xlPlotArea", xlPlotArea);
    v.put("xlDownBars", xlDownBars);
    v.put("xlAxis", xlAxis);
    v.put("xlSeriesLines", xlSeriesLines);
    v.put("xlFloor", xlFloor);
    v.put("xlLegend", xlLegend);
    v.put("xlHiLoLines", xlHiLoLines);
    v.put("xlDropLines", xlDropLines);
    v.put("xlRadarAxisLabels", xlRadarAxisLabels);
    v.put("xlNothing", xlNothing);
    v.put("xlLeaderLines", xlLeaderLines);
    v.put("xlDisplayUnitLabel", xlDisplayUnitLabel);
    v.put("xlPivotChartFieldButton", xlPivotChartFieldButton);
    v.put("xlPivotChartDropZone", xlPivotChartDropZone);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
