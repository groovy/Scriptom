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
package org.codehaus.groovy.scriptom.tlb.office2007.powerpoint;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class PpDateTimeFormat
{
  private PpDateTimeFormat()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer ppDateTimeFormatMixed = Integer.valueOf(-2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer ppDateTimeMdyy = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer ppDateTimeddddMMMMddyyyy = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer ppDateTimedMMMMyyyy = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer ppDateTimeMMMMdyyyy = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer ppDateTimedMMMyy = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer ppDateTimeMMMMyy = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer ppDateTimeMMyy = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer ppDateTimeMMddyyHmm = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer ppDateTimeMMddyyhmmAMPM = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer ppDateTimeHmm = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer ppDateTimeHmmss = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer ppDateTimehmmAMPM = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer ppDateTimehmmssAMPM = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer ppDateTimeFigureOut = Integer.valueOf(14);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("ppDateTimeFormatMixed", ppDateTimeFormatMixed);
    v.put("ppDateTimeMdyy", ppDateTimeMdyy);
    v.put("ppDateTimeddddMMMMddyyyy", ppDateTimeddddMMMMddyyyy);
    v.put("ppDateTimedMMMMyyyy", ppDateTimedMMMMyyyy);
    v.put("ppDateTimeMMMMdyyyy", ppDateTimeMMMMdyyyy);
    v.put("ppDateTimedMMMyy", ppDateTimedMMMyy);
    v.put("ppDateTimeMMMMyy", ppDateTimeMMMMyy);
    v.put("ppDateTimeMMyy", ppDateTimeMMyy);
    v.put("ppDateTimeMMddyyHmm", ppDateTimeMMddyyHmm);
    v.put("ppDateTimeMMddyyhmmAMPM", ppDateTimeMMddyyhmmAMPM);
    v.put("ppDateTimeHmm", ppDateTimeHmm);
    v.put("ppDateTimeHmmss", ppDateTimeHmmss);
    v.put("ppDateTimehmmAMPM", ppDateTimehmmAMPM);
    v.put("ppDateTimehmmssAMPM", ppDateTimehmmssAMPM);
    v.put("ppDateTimeFigureOut", ppDateTimeFigureOut);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
