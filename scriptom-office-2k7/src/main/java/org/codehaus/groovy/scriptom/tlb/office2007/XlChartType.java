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
public final class XlChartType
{
  private XlChartType()
  {
  }

  /**
   * Value is 51 (0x33)
   */
  public static final Integer xlColumnClustered = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer xlColumnStacked = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer xlColumnStacked100 = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer xl3DColumnClustered = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer xl3DColumnStacked = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer xl3DColumnStacked100 = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer xlBarClustered = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer xlBarStacked = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer xlBarStacked100 = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer xl3DBarClustered = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer xl3DBarStacked = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer xl3DBarStacked100 = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer xlLineStacked = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer xlLineStacked100 = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer xlLineMarkers = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer xlLineMarkersStacked = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer xlLineMarkersStacked100 = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer xlPieOfPie = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer xlPieExploded = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer xl3DPieExploded = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer xlBarOfPie = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer xlXYScatterSmooth = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer xlXYScatterSmoothNoMarkers = Integer.valueOf(73);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer xlXYScatterLines = Integer.valueOf(74);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer xlXYScatterLinesNoMarkers = Integer.valueOf(75);

  /**
   * Value is 76 (0x4C)
   */
  public static final Integer xlAreaStacked = Integer.valueOf(76);

  /**
   * Value is 77 (0x4D)
   */
  public static final Integer xlAreaStacked100 = Integer.valueOf(77);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer xl3DAreaStacked = Integer.valueOf(78);

  /**
   * Value is 79 (0x4F)
   */
  public static final Integer xl3DAreaStacked100 = Integer.valueOf(79);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer xlDoughnutExploded = Integer.valueOf(80);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer xlRadarMarkers = Integer.valueOf(81);

  /**
   * Value is 82 (0x52)
   */
  public static final Integer xlRadarFilled = Integer.valueOf(82);

  /**
   * Value is 83 (0x53)
   */
  public static final Integer xlSurface = Integer.valueOf(83);

  /**
   * Value is 84 (0x54)
   */
  public static final Integer xlSurfaceWireframe = Integer.valueOf(84);

  /**
   * Value is 85 (0x55)
   */
  public static final Integer xlSurfaceTopView = Integer.valueOf(85);

  /**
   * Value is 86 (0x56)
   */
  public static final Integer xlSurfaceTopViewWireframe = Integer.valueOf(86);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlBubble = Integer.valueOf(15);

  /**
   * Value is 87 (0x57)
   */
  public static final Integer xlBubble3DEffect = Integer.valueOf(87);

  /**
   * Value is 88 (0x58)
   */
  public static final Integer xlStockHLC = Integer.valueOf(88);

  /**
   * Value is 89 (0x59)
   */
  public static final Integer xlStockOHLC = Integer.valueOf(89);

  /**
   * Value is 90 (0x5A)
   */
  public static final Integer xlStockVHLC = Integer.valueOf(90);

  /**
   * Value is 91 (0x5B)
   */
  public static final Integer xlStockVOHLC = Integer.valueOf(91);

  /**
   * Value is 92 (0x5C)
   */
  public static final Integer xlCylinderColClustered = Integer.valueOf(92);

  /**
   * Value is 93 (0x5D)
   */
  public static final Integer xlCylinderColStacked = Integer.valueOf(93);

  /**
   * Value is 94 (0x5E)
   */
  public static final Integer xlCylinderColStacked100 = Integer.valueOf(94);

  /**
   * Value is 95 (0x5F)
   */
  public static final Integer xlCylinderBarClustered = Integer.valueOf(95);

  /**
   * Value is 96 (0x60)
   */
  public static final Integer xlCylinderBarStacked = Integer.valueOf(96);

  /**
   * Value is 97 (0x61)
   */
  public static final Integer xlCylinderBarStacked100 = Integer.valueOf(97);

  /**
   * Value is 98 (0x62)
   */
  public static final Integer xlCylinderCol = Integer.valueOf(98);

  /**
   * Value is 99 (0x63)
   */
  public static final Integer xlConeColClustered = Integer.valueOf(99);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer xlConeColStacked = Integer.valueOf(100);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer xlConeColStacked100 = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer xlConeBarClustered = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer xlConeBarStacked = Integer.valueOf(103);

  /**
   * Value is 104 (0x68)
   */
  public static final Integer xlConeBarStacked100 = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer xlConeCol = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer xlPyramidColClustered = Integer.valueOf(106);

  /**
   * Value is 107 (0x6B)
   */
  public static final Integer xlPyramidColStacked = Integer.valueOf(107);

  /**
   * Value is 108 (0x6C)
   */
  public static final Integer xlPyramidColStacked100 = Integer.valueOf(108);

  /**
   * Value is 109 (0x6D)
   */
  public static final Integer xlPyramidBarClustered = Integer.valueOf(109);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer xlPyramidBarStacked = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer xlPyramidBarStacked100 = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer xlPyramidCol = Integer.valueOf(112);

  /**
   * Value is -4100 (0xFFFFEFFC)
   */
  public static final Integer xl3DColumn = Integer.valueOf(-4100);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlLine = Integer.valueOf(4);

  /**
   * Value is -4101 (0xFFFFEFFB)
   */
  public static final Integer xl3DLine = Integer.valueOf(-4101);

  /**
   * Value is -4102 (0xFFFFEFFA)
   */
  public static final Integer xl3DPie = Integer.valueOf(-4102);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlPie = Integer.valueOf(5);

  /**
   * Value is -4169 (0xFFFFEFB7)
   */
  public static final Integer xlXYScatter = Integer.valueOf(-4169);

  /**
   * Value is -4098 (0xFFFFEFFE)
   */
  public static final Integer xl3DArea = Integer.valueOf(-4098);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlArea = Integer.valueOf(1);

  /**
   * Value is -4120 (0xFFFFEFE8)
   */
  public static final Integer xlDoughnut = Integer.valueOf(-4120);

  /**
   * Value is -4151 (0xFFFFEFC9)
   */
  public static final Integer xlRadar = Integer.valueOf(-4151);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlColumnClustered", xlColumnClustered);
    v.put("xlColumnStacked", xlColumnStacked);
    v.put("xlColumnStacked100", xlColumnStacked100);
    v.put("xl3DColumnClustered", xl3DColumnClustered);
    v.put("xl3DColumnStacked", xl3DColumnStacked);
    v.put("xl3DColumnStacked100", xl3DColumnStacked100);
    v.put("xlBarClustered", xlBarClustered);
    v.put("xlBarStacked", xlBarStacked);
    v.put("xlBarStacked100", xlBarStacked100);
    v.put("xl3DBarClustered", xl3DBarClustered);
    v.put("xl3DBarStacked", xl3DBarStacked);
    v.put("xl3DBarStacked100", xl3DBarStacked100);
    v.put("xlLineStacked", xlLineStacked);
    v.put("xlLineStacked100", xlLineStacked100);
    v.put("xlLineMarkers", xlLineMarkers);
    v.put("xlLineMarkersStacked", xlLineMarkersStacked);
    v.put("xlLineMarkersStacked100", xlLineMarkersStacked100);
    v.put("xlPieOfPie", xlPieOfPie);
    v.put("xlPieExploded", xlPieExploded);
    v.put("xl3DPieExploded", xl3DPieExploded);
    v.put("xlBarOfPie", xlBarOfPie);
    v.put("xlXYScatterSmooth", xlXYScatterSmooth);
    v.put("xlXYScatterSmoothNoMarkers", xlXYScatterSmoothNoMarkers);
    v.put("xlXYScatterLines", xlXYScatterLines);
    v.put("xlXYScatterLinesNoMarkers", xlXYScatterLinesNoMarkers);
    v.put("xlAreaStacked", xlAreaStacked);
    v.put("xlAreaStacked100", xlAreaStacked100);
    v.put("xl3DAreaStacked", xl3DAreaStacked);
    v.put("xl3DAreaStacked100", xl3DAreaStacked100);
    v.put("xlDoughnutExploded", xlDoughnutExploded);
    v.put("xlRadarMarkers", xlRadarMarkers);
    v.put("xlRadarFilled", xlRadarFilled);
    v.put("xlSurface", xlSurface);
    v.put("xlSurfaceWireframe", xlSurfaceWireframe);
    v.put("xlSurfaceTopView", xlSurfaceTopView);
    v.put("xlSurfaceTopViewWireframe", xlSurfaceTopViewWireframe);
    v.put("xlBubble", xlBubble);
    v.put("xlBubble3DEffect", xlBubble3DEffect);
    v.put("xlStockHLC", xlStockHLC);
    v.put("xlStockOHLC", xlStockOHLC);
    v.put("xlStockVHLC", xlStockVHLC);
    v.put("xlStockVOHLC", xlStockVOHLC);
    v.put("xlCylinderColClustered", xlCylinderColClustered);
    v.put("xlCylinderColStacked", xlCylinderColStacked);
    v.put("xlCylinderColStacked100", xlCylinderColStacked100);
    v.put("xlCylinderBarClustered", xlCylinderBarClustered);
    v.put("xlCylinderBarStacked", xlCylinderBarStacked);
    v.put("xlCylinderBarStacked100", xlCylinderBarStacked100);
    v.put("xlCylinderCol", xlCylinderCol);
    v.put("xlConeColClustered", xlConeColClustered);
    v.put("xlConeColStacked", xlConeColStacked);
    v.put("xlConeColStacked100", xlConeColStacked100);
    v.put("xlConeBarClustered", xlConeBarClustered);
    v.put("xlConeBarStacked", xlConeBarStacked);
    v.put("xlConeBarStacked100", xlConeBarStacked100);
    v.put("xlConeCol", xlConeCol);
    v.put("xlPyramidColClustered", xlPyramidColClustered);
    v.put("xlPyramidColStacked", xlPyramidColStacked);
    v.put("xlPyramidColStacked100", xlPyramidColStacked100);
    v.put("xlPyramidBarClustered", xlPyramidBarClustered);
    v.put("xlPyramidBarStacked", xlPyramidBarStacked);
    v.put("xlPyramidBarStacked100", xlPyramidBarStacked100);
    v.put("xlPyramidCol", xlPyramidCol);
    v.put("xl3DColumn", xl3DColumn);
    v.put("xlLine", xlLine);
    v.put("xl3DLine", xl3DLine);
    v.put("xl3DPie", xl3DPie);
    v.put("xlPie", xlPie);
    v.put("xlXYScatter", xlXYScatter);
    v.put("xl3DArea", xl3DArea);
    v.put("xlArea", xlArea);
    v.put("xlDoughnut", xlDoughnut);
    v.put("xlRadar", xlRadar);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
