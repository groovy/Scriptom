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
package org.codehaus.groovy.scriptom.tlb.office2007.word;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class WdColor
{
  private WdColor()
  {
  }

  /**
   * Value is -16777216 (0xFF000000)
   */
  public static final Integer wdColorAutomatic = Integer.valueOf(-16777216);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdColorBlack = Integer.valueOf(0);

  /**
   * Value is 16711680 (0xFF0000)
   */
  public static final Integer wdColorBlue = Integer.valueOf(16711680);

  /**
   * Value is 16776960 (0xFFFF00)
   */
  public static final Integer wdColorTurquoise = Integer.valueOf(16776960);

  /**
   * Value is 65280 (0xFF00)
   */
  public static final Integer wdColorBrightGreen = Integer.valueOf(65280);

  /**
   * Value is 16711935 (0xFF00FF)
   */
  public static final Integer wdColorPink = Integer.valueOf(16711935);

  /**
   * Value is 255 (0xFF)
   */
  public static final Integer wdColorRed = Integer.valueOf(255);

  /**
   * Value is 65535 (0xFFFF)
   */
  public static final Integer wdColorYellow = Integer.valueOf(65535);

  /**
   * Value is 16777215 (0xFFFFFF)
   */
  public static final Integer wdColorWhite = Integer.valueOf(16777215);

  /**
   * Value is 8388608 (0x800000)
   */
  public static final Integer wdColorDarkBlue = Integer.valueOf(8388608);

  /**
   * Value is 8421376 (0x808000)
   */
  public static final Integer wdColorTeal = Integer.valueOf(8421376);

  /**
   * Value is 32768 (0x8000)
   */
  public static final Integer wdColorGreen = Integer.valueOf(32768);

  /**
   * Value is 8388736 (0x800080)
   */
  public static final Integer wdColorViolet = Integer.valueOf(8388736);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer wdColorDarkRed = Integer.valueOf(128);

  /**
   * Value is 32896 (0x8080)
   */
  public static final Integer wdColorDarkYellow = Integer.valueOf(32896);

  /**
   * Value is 13209 (0x3399)
   */
  public static final Integer wdColorBrown = Integer.valueOf(13209);

  /**
   * Value is 13107 (0x3333)
   */
  public static final Integer wdColorOliveGreen = Integer.valueOf(13107);

  /**
   * Value is 13056 (0x3300)
   */
  public static final Integer wdColorDarkGreen = Integer.valueOf(13056);

  /**
   * Value is 6697728 (0x663300)
   */
  public static final Integer wdColorDarkTeal = Integer.valueOf(6697728);

  /**
   * Value is 10040115 (0x993333)
   */
  public static final Integer wdColorIndigo = Integer.valueOf(10040115);

  /**
   * Value is 26367 (0x66FF)
   */
  public static final Integer wdColorOrange = Integer.valueOf(26367);

  /**
   * Value is 10053222 (0x996666)
   */
  public static final Integer wdColorBlueGray = Integer.valueOf(10053222);

  /**
   * Value is 39423 (0x99FF)
   */
  public static final Integer wdColorLightOrange = Integer.valueOf(39423);

  /**
   * Value is 52377 (0xCC99)
   */
  public static final Integer wdColorLime = Integer.valueOf(52377);

  /**
   * Value is 6723891 (0x669933)
   */
  public static final Integer wdColorSeaGreen = Integer.valueOf(6723891);

  /**
   * Value is 13421619 (0xCCCC33)
   */
  public static final Integer wdColorAqua = Integer.valueOf(13421619);

  /**
   * Value is 16737843 (0xFF6633)
   */
  public static final Integer wdColorLightBlue = Integer.valueOf(16737843);

  /**
   * Value is 52479 (0xCCFF)
   */
  public static final Integer wdColorGold = Integer.valueOf(52479);

  /**
   * Value is 16763904 (0xFFCC00)
   */
  public static final Integer wdColorSkyBlue = Integer.valueOf(16763904);

  /**
   * Value is 6697881 (0x663399)
   */
  public static final Integer wdColorPlum = Integer.valueOf(6697881);

  /**
   * Value is 13408767 (0xCC99FF)
   */
  public static final Integer wdColorRose = Integer.valueOf(13408767);

  /**
   * Value is 10079487 (0x99CCFF)
   */
  public static final Integer wdColorTan = Integer.valueOf(10079487);

  /**
   * Value is 10092543 (0x99FFFF)
   */
  public static final Integer wdColorLightYellow = Integer.valueOf(10092543);

  /**
   * Value is 13434828 (0xCCFFCC)
   */
  public static final Integer wdColorLightGreen = Integer.valueOf(13434828);

  /**
   * Value is 16777164 (0xFFFFCC)
   */
  public static final Integer wdColorLightTurquoise = Integer.valueOf(16777164);

  /**
   * Value is 16764057 (0xFFCC99)
   */
  public static final Integer wdColorPaleBlue = Integer.valueOf(16764057);

  /**
   * Value is 16751052 (0xFF99CC)
   */
  public static final Integer wdColorLavender = Integer.valueOf(16751052);

  /**
   * Value is 15987699 (0xF3F3F3)
   */
  public static final Integer wdColorGray05 = Integer.valueOf(15987699);

  /**
   * Value is 15132390 (0xE6E6E6)
   */
  public static final Integer wdColorGray10 = Integer.valueOf(15132390);

  /**
   * Value is 14737632 (0xE0E0E0)
   */
  public static final Integer wdColorGray125 = Integer.valueOf(14737632);

  /**
   * Value is 14277081 (0xD9D9D9)
   */
  public static final Integer wdColorGray15 = Integer.valueOf(14277081);

  /**
   * Value is 13421772 (0xCCCCCC)
   */
  public static final Integer wdColorGray20 = Integer.valueOf(13421772);

  /**
   * Value is 12632256 (0xC0C0C0)
   */
  public static final Integer wdColorGray25 = Integer.valueOf(12632256);

  /**
   * Value is 11776947 (0xB3B3B3)
   */
  public static final Integer wdColorGray30 = Integer.valueOf(11776947);

  /**
   * Value is 10921638 (0xA6A6A6)
   */
  public static final Integer wdColorGray35 = Integer.valueOf(10921638);

  /**
   * Value is 10526880 (0xA0A0A0)
   */
  public static final Integer wdColorGray375 = Integer.valueOf(10526880);

  /**
   * Value is 10066329 (0x999999)
   */
  public static final Integer wdColorGray40 = Integer.valueOf(10066329);

  /**
   * Value is 9211020 (0x8C8C8C)
   */
  public static final Integer wdColorGray45 = Integer.valueOf(9211020);

  /**
   * Value is 8421504 (0x808080)
   */
  public static final Integer wdColorGray50 = Integer.valueOf(8421504);

  /**
   * Value is 7566195 (0x737373)
   */
  public static final Integer wdColorGray55 = Integer.valueOf(7566195);

  /**
   * Value is 6710886 (0x666666)
   */
  public static final Integer wdColorGray60 = Integer.valueOf(6710886);

  /**
   * Value is 6316128 (0x606060)
   */
  public static final Integer wdColorGray625 = Integer.valueOf(6316128);

  /**
   * Value is 5855577 (0x595959)
   */
  public static final Integer wdColorGray65 = Integer.valueOf(5855577);

  /**
   * Value is 5000268 (0x4C4C4C)
   */
  public static final Integer wdColorGray70 = Integer.valueOf(5000268);

  /**
   * Value is 4210752 (0x404040)
   */
  public static final Integer wdColorGray75 = Integer.valueOf(4210752);

  /**
   * Value is 3355443 (0x333333)
   */
  public static final Integer wdColorGray80 = Integer.valueOf(3355443);

  /**
   * Value is 2500134 (0x262626)
   */
  public static final Integer wdColorGray85 = Integer.valueOf(2500134);

  /**
   * Value is 2105376 (0x202020)
   */
  public static final Integer wdColorGray875 = Integer.valueOf(2105376);

  /**
   * Value is 1644825 (0x191919)
   */
  public static final Integer wdColorGray90 = Integer.valueOf(1644825);

  /**
   * Value is 789516 (0xC0C0C)
   */
  public static final Integer wdColorGray95 = Integer.valueOf(789516);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdColorAutomatic", wdColorAutomatic);
    v.put("wdColorBlack", wdColorBlack);
    v.put("wdColorBlue", wdColorBlue);
    v.put("wdColorTurquoise", wdColorTurquoise);
    v.put("wdColorBrightGreen", wdColorBrightGreen);
    v.put("wdColorPink", wdColorPink);
    v.put("wdColorRed", wdColorRed);
    v.put("wdColorYellow", wdColorYellow);
    v.put("wdColorWhite", wdColorWhite);
    v.put("wdColorDarkBlue", wdColorDarkBlue);
    v.put("wdColorTeal", wdColorTeal);
    v.put("wdColorGreen", wdColorGreen);
    v.put("wdColorViolet", wdColorViolet);
    v.put("wdColorDarkRed", wdColorDarkRed);
    v.put("wdColorDarkYellow", wdColorDarkYellow);
    v.put("wdColorBrown", wdColorBrown);
    v.put("wdColorOliveGreen", wdColorOliveGreen);
    v.put("wdColorDarkGreen", wdColorDarkGreen);
    v.put("wdColorDarkTeal", wdColorDarkTeal);
    v.put("wdColorIndigo", wdColorIndigo);
    v.put("wdColorOrange", wdColorOrange);
    v.put("wdColorBlueGray", wdColorBlueGray);
    v.put("wdColorLightOrange", wdColorLightOrange);
    v.put("wdColorLime", wdColorLime);
    v.put("wdColorSeaGreen", wdColorSeaGreen);
    v.put("wdColorAqua", wdColorAqua);
    v.put("wdColorLightBlue", wdColorLightBlue);
    v.put("wdColorGold", wdColorGold);
    v.put("wdColorSkyBlue", wdColorSkyBlue);
    v.put("wdColorPlum", wdColorPlum);
    v.put("wdColorRose", wdColorRose);
    v.put("wdColorTan", wdColorTan);
    v.put("wdColorLightYellow", wdColorLightYellow);
    v.put("wdColorLightGreen", wdColorLightGreen);
    v.put("wdColorLightTurquoise", wdColorLightTurquoise);
    v.put("wdColorPaleBlue", wdColorPaleBlue);
    v.put("wdColorLavender", wdColorLavender);
    v.put("wdColorGray05", wdColorGray05);
    v.put("wdColorGray10", wdColorGray10);
    v.put("wdColorGray125", wdColorGray125);
    v.put("wdColorGray15", wdColorGray15);
    v.put("wdColorGray20", wdColorGray20);
    v.put("wdColorGray25", wdColorGray25);
    v.put("wdColorGray30", wdColorGray30);
    v.put("wdColorGray35", wdColorGray35);
    v.put("wdColorGray375", wdColorGray375);
    v.put("wdColorGray40", wdColorGray40);
    v.put("wdColorGray45", wdColorGray45);
    v.put("wdColorGray50", wdColorGray50);
    v.put("wdColorGray55", wdColorGray55);
    v.put("wdColorGray60", wdColorGray60);
    v.put("wdColorGray625", wdColorGray625);
    v.put("wdColorGray65", wdColorGray65);
    v.put("wdColorGray70", wdColorGray70);
    v.put("wdColorGray75", wdColorGray75);
    v.put("wdColorGray80", wdColorGray80);
    v.put("wdColorGray85", wdColorGray85);
    v.put("wdColorGray875", wdColorGray875);
    v.put("wdColorGray90", wdColorGray90);
    v.put("wdColorGray95", wdColorGray95);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
