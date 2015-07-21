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
package org.codehaus.groovy.scriptom.tlb.office.powerpoint;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class MsoAnimateByLevel
{
  private MsoAnimateByLevel()
  {
  }

  /**
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer msoAnimateLevelMixed = Integer.valueOf(-1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer msoAnimateLevelNone = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoAnimateTextByAllLevels = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoAnimateTextByFirstLevel = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoAnimateTextBySecondLevel = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoAnimateTextByThirdLevel = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoAnimateTextByFourthLevel = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoAnimateTextByFifthLevel = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoAnimateChartAllAtOnce = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoAnimateChartByCategory = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoAnimateChartByCategoryElements = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoAnimateChartBySeries = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoAnimateChartBySeriesElements = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoAnimateDiagramAllAtOnce = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoAnimateDiagramDepthByNode = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoAnimateDiagramDepthByBranch = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoAnimateDiagramBreadthByNode = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoAnimateDiagramBreadthByLevel = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoAnimateDiagramClockwise = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoAnimateDiagramClockwiseIn = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoAnimateDiagramClockwiseOut = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoAnimateDiagramCounterClockwise = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoAnimateDiagramCounterClockwiseIn = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoAnimateDiagramCounterClockwiseOut = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoAnimateDiagramInByRing = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoAnimateDiagramOutByRing = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoAnimateDiagramUp = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoAnimateDiagramDown = Integer.valueOf(26);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoAnimateLevelMixed", msoAnimateLevelMixed);
    v.put("msoAnimateLevelNone", msoAnimateLevelNone);
    v.put("msoAnimateTextByAllLevels", msoAnimateTextByAllLevels);
    v.put("msoAnimateTextByFirstLevel", msoAnimateTextByFirstLevel);
    v.put("msoAnimateTextBySecondLevel", msoAnimateTextBySecondLevel);
    v.put("msoAnimateTextByThirdLevel", msoAnimateTextByThirdLevel);
    v.put("msoAnimateTextByFourthLevel", msoAnimateTextByFourthLevel);
    v.put("msoAnimateTextByFifthLevel", msoAnimateTextByFifthLevel);
    v.put("msoAnimateChartAllAtOnce", msoAnimateChartAllAtOnce);
    v.put("msoAnimateChartByCategory", msoAnimateChartByCategory);
    v.put("msoAnimateChartByCategoryElements", msoAnimateChartByCategoryElements);
    v.put("msoAnimateChartBySeries", msoAnimateChartBySeries);
    v.put("msoAnimateChartBySeriesElements", msoAnimateChartBySeriesElements);
    v.put("msoAnimateDiagramAllAtOnce", msoAnimateDiagramAllAtOnce);
    v.put("msoAnimateDiagramDepthByNode", msoAnimateDiagramDepthByNode);
    v.put("msoAnimateDiagramDepthByBranch", msoAnimateDiagramDepthByBranch);
    v.put("msoAnimateDiagramBreadthByNode", msoAnimateDiagramBreadthByNode);
    v.put("msoAnimateDiagramBreadthByLevel", msoAnimateDiagramBreadthByLevel);
    v.put("msoAnimateDiagramClockwise", msoAnimateDiagramClockwise);
    v.put("msoAnimateDiagramClockwiseIn", msoAnimateDiagramClockwiseIn);
    v.put("msoAnimateDiagramClockwiseOut", msoAnimateDiagramClockwiseOut);
    v.put("msoAnimateDiagramCounterClockwise", msoAnimateDiagramCounterClockwise);
    v.put("msoAnimateDiagramCounterClockwiseIn", msoAnimateDiagramCounterClockwiseIn);
    v.put("msoAnimateDiagramCounterClockwiseOut", msoAnimateDiagramCounterClockwiseOut);
    v.put("msoAnimateDiagramInByRing", msoAnimateDiagramInByRing);
    v.put("msoAnimateDiagramOutByRing", msoAnimateDiagramOutByRing);
    v.put("msoAnimateDiagramUp", msoAnimateDiagramUp);
    v.put("msoAnimateDiagramDown", msoAnimateDiagramDown);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
