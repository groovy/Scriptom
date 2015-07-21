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
public final class PpEntryEffect
{
  private PpEntryEffect()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer ppEffectMixed = Integer.valueOf(-2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer ppEffectNone = Integer.valueOf(0);

  /**
   * Value is 257 (0x101)
   */
  public static final Integer ppEffectCut = Integer.valueOf(257);

  /**
   * Value is 258 (0x102)
   */
  public static final Integer ppEffectCutThroughBlack = Integer.valueOf(258);

  /**
   * Value is 513 (0x201)
   */
  public static final Integer ppEffectRandom = Integer.valueOf(513);

  /**
   * Value is 769 (0x301)
   */
  public static final Integer ppEffectBlindsHorizontal = Integer.valueOf(769);

  /**
   * Value is 770 (0x302)
   */
  public static final Integer ppEffectBlindsVertical = Integer.valueOf(770);

  /**
   * Value is 1025 (0x401)
   */
  public static final Integer ppEffectCheckerboardAcross = Integer.valueOf(1025);

  /**
   * Value is 1026 (0x402)
   */
  public static final Integer ppEffectCheckerboardDown = Integer.valueOf(1026);

  /**
   * Value is 1281 (0x501)
   */
  public static final Integer ppEffectCoverLeft = Integer.valueOf(1281);

  /**
   * Value is 1282 (0x502)
   */
  public static final Integer ppEffectCoverUp = Integer.valueOf(1282);

  /**
   * Value is 1283 (0x503)
   */
  public static final Integer ppEffectCoverRight = Integer.valueOf(1283);

  /**
   * Value is 1284 (0x504)
   */
  public static final Integer ppEffectCoverDown = Integer.valueOf(1284);

  /**
   * Value is 1285 (0x505)
   */
  public static final Integer ppEffectCoverLeftUp = Integer.valueOf(1285);

  /**
   * Value is 1286 (0x506)
   */
  public static final Integer ppEffectCoverRightUp = Integer.valueOf(1286);

  /**
   * Value is 1287 (0x507)
   */
  public static final Integer ppEffectCoverLeftDown = Integer.valueOf(1287);

  /**
   * Value is 1288 (0x508)
   */
  public static final Integer ppEffectCoverRightDown = Integer.valueOf(1288);

  /**
   * Value is 1537 (0x601)
   */
  public static final Integer ppEffectDissolve = Integer.valueOf(1537);

  /**
   * Value is 1793 (0x701)
   */
  public static final Integer ppEffectFade = Integer.valueOf(1793);

  /**
   * Value is 2049 (0x801)
   */
  public static final Integer ppEffectUncoverLeft = Integer.valueOf(2049);

  /**
   * Value is 2050 (0x802)
   */
  public static final Integer ppEffectUncoverUp = Integer.valueOf(2050);

  /**
   * Value is 2051 (0x803)
   */
  public static final Integer ppEffectUncoverRight = Integer.valueOf(2051);

  /**
   * Value is 2052 (0x804)
   */
  public static final Integer ppEffectUncoverDown = Integer.valueOf(2052);

  /**
   * Value is 2053 (0x805)
   */
  public static final Integer ppEffectUncoverLeftUp = Integer.valueOf(2053);

  /**
   * Value is 2054 (0x806)
   */
  public static final Integer ppEffectUncoverRightUp = Integer.valueOf(2054);

  /**
   * Value is 2055 (0x807)
   */
  public static final Integer ppEffectUncoverLeftDown = Integer.valueOf(2055);

  /**
   * Value is 2056 (0x808)
   */
  public static final Integer ppEffectUncoverRightDown = Integer.valueOf(2056);

  /**
   * Value is 2305 (0x901)
   */
  public static final Integer ppEffectRandomBarsHorizontal = Integer.valueOf(2305);

  /**
   * Value is 2306 (0x902)
   */
  public static final Integer ppEffectRandomBarsVertical = Integer.valueOf(2306);

  /**
   * Value is 2561 (0xA01)
   */
  public static final Integer ppEffectStripsUpLeft = Integer.valueOf(2561);

  /**
   * Value is 2562 (0xA02)
   */
  public static final Integer ppEffectStripsUpRight = Integer.valueOf(2562);

  /**
   * Value is 2563 (0xA03)
   */
  public static final Integer ppEffectStripsDownLeft = Integer.valueOf(2563);

  /**
   * Value is 2564 (0xA04)
   */
  public static final Integer ppEffectStripsDownRight = Integer.valueOf(2564);

  /**
   * Value is 2565 (0xA05)
   */
  public static final Integer ppEffectStripsLeftUp = Integer.valueOf(2565);

  /**
   * Value is 2566 (0xA06)
   */
  public static final Integer ppEffectStripsRightUp = Integer.valueOf(2566);

  /**
   * Value is 2567 (0xA07)
   */
  public static final Integer ppEffectStripsLeftDown = Integer.valueOf(2567);

  /**
   * Value is 2568 (0xA08)
   */
  public static final Integer ppEffectStripsRightDown = Integer.valueOf(2568);

  /**
   * Value is 2817 (0xB01)
   */
  public static final Integer ppEffectWipeLeft = Integer.valueOf(2817);

  /**
   * Value is 2818 (0xB02)
   */
  public static final Integer ppEffectWipeUp = Integer.valueOf(2818);

  /**
   * Value is 2819 (0xB03)
   */
  public static final Integer ppEffectWipeRight = Integer.valueOf(2819);

  /**
   * Value is 2820 (0xB04)
   */
  public static final Integer ppEffectWipeDown = Integer.valueOf(2820);

  /**
   * Value is 3073 (0xC01)
   */
  public static final Integer ppEffectBoxOut = Integer.valueOf(3073);

  /**
   * Value is 3074 (0xC02)
   */
  public static final Integer ppEffectBoxIn = Integer.valueOf(3074);

  /**
   * Value is 3329 (0xD01)
   */
  public static final Integer ppEffectFlyFromLeft = Integer.valueOf(3329);

  /**
   * Value is 3330 (0xD02)
   */
  public static final Integer ppEffectFlyFromTop = Integer.valueOf(3330);

  /**
   * Value is 3331 (0xD03)
   */
  public static final Integer ppEffectFlyFromRight = Integer.valueOf(3331);

  /**
   * Value is 3332 (0xD04)
   */
  public static final Integer ppEffectFlyFromBottom = Integer.valueOf(3332);

  /**
   * Value is 3333 (0xD05)
   */
  public static final Integer ppEffectFlyFromTopLeft = Integer.valueOf(3333);

  /**
   * Value is 3334 (0xD06)
   */
  public static final Integer ppEffectFlyFromTopRight = Integer.valueOf(3334);

  /**
   * Value is 3335 (0xD07)
   */
  public static final Integer ppEffectFlyFromBottomLeft = Integer.valueOf(3335);

  /**
   * Value is 3336 (0xD08)
   */
  public static final Integer ppEffectFlyFromBottomRight = Integer.valueOf(3336);

  /**
   * Value is 3337 (0xD09)
   */
  public static final Integer ppEffectPeekFromLeft = Integer.valueOf(3337);

  /**
   * Value is 3338 (0xD0A)
   */
  public static final Integer ppEffectPeekFromDown = Integer.valueOf(3338);

  /**
   * Value is 3339 (0xD0B)
   */
  public static final Integer ppEffectPeekFromRight = Integer.valueOf(3339);

  /**
   * Value is 3340 (0xD0C)
   */
  public static final Integer ppEffectPeekFromUp = Integer.valueOf(3340);

  /**
   * Value is 3341 (0xD0D)
   */
  public static final Integer ppEffectCrawlFromLeft = Integer.valueOf(3341);

  /**
   * Value is 3342 (0xD0E)
   */
  public static final Integer ppEffectCrawlFromUp = Integer.valueOf(3342);

  /**
   * Value is 3343 (0xD0F)
   */
  public static final Integer ppEffectCrawlFromRight = Integer.valueOf(3343);

  /**
   * Value is 3344 (0xD10)
   */
  public static final Integer ppEffectCrawlFromDown = Integer.valueOf(3344);

  /**
   * Value is 3345 (0xD11)
   */
  public static final Integer ppEffectZoomIn = Integer.valueOf(3345);

  /**
   * Value is 3346 (0xD12)
   */
  public static final Integer ppEffectZoomInSlightly = Integer.valueOf(3346);

  /**
   * Value is 3347 (0xD13)
   */
  public static final Integer ppEffectZoomOut = Integer.valueOf(3347);

  /**
   * Value is 3348 (0xD14)
   */
  public static final Integer ppEffectZoomOutSlightly = Integer.valueOf(3348);

  /**
   * Value is 3349 (0xD15)
   */
  public static final Integer ppEffectZoomCenter = Integer.valueOf(3349);

  /**
   * Value is 3350 (0xD16)
   */
  public static final Integer ppEffectZoomBottom = Integer.valueOf(3350);

  /**
   * Value is 3351 (0xD17)
   */
  public static final Integer ppEffectStretchAcross = Integer.valueOf(3351);

  /**
   * Value is 3352 (0xD18)
   */
  public static final Integer ppEffectStretchLeft = Integer.valueOf(3352);

  /**
   * Value is 3353 (0xD19)
   */
  public static final Integer ppEffectStretchUp = Integer.valueOf(3353);

  /**
   * Value is 3354 (0xD1A)
   */
  public static final Integer ppEffectStretchRight = Integer.valueOf(3354);

  /**
   * Value is 3355 (0xD1B)
   */
  public static final Integer ppEffectStretchDown = Integer.valueOf(3355);

  /**
   * Value is 3356 (0xD1C)
   */
  public static final Integer ppEffectSwivel = Integer.valueOf(3356);

  /**
   * Value is 3357 (0xD1D)
   */
  public static final Integer ppEffectSpiral = Integer.valueOf(3357);

  /**
   * Value is 3585 (0xE01)
   */
  public static final Integer ppEffectSplitHorizontalOut = Integer.valueOf(3585);

  /**
   * Value is 3586 (0xE02)
   */
  public static final Integer ppEffectSplitHorizontalIn = Integer.valueOf(3586);

  /**
   * Value is 3587 (0xE03)
   */
  public static final Integer ppEffectSplitVerticalOut = Integer.valueOf(3587);

  /**
   * Value is 3588 (0xE04)
   */
  public static final Integer ppEffectSplitVerticalIn = Integer.valueOf(3588);

  /**
   * Value is 3841 (0xF01)
   */
  public static final Integer ppEffectFlashOnceFast = Integer.valueOf(3841);

  /**
   * Value is 3842 (0xF02)
   */
  public static final Integer ppEffectFlashOnceMedium = Integer.valueOf(3842);

  /**
   * Value is 3843 (0xF03)
   */
  public static final Integer ppEffectFlashOnceSlow = Integer.valueOf(3843);

  /**
   * Value is 3844 (0xF04)
   */
  public static final Integer ppEffectAppear = Integer.valueOf(3844);

  /**
   * Value is 3845 (0xF05)
   */
  public static final Integer ppEffectCircleOut = Integer.valueOf(3845);

  /**
   * Value is 3846 (0xF06)
   */
  public static final Integer ppEffectDiamondOut = Integer.valueOf(3846);

  /**
   * Value is 3847 (0xF07)
   */
  public static final Integer ppEffectCombHorizontal = Integer.valueOf(3847);

  /**
   * Value is 3848 (0xF08)
   */
  public static final Integer ppEffectCombVertical = Integer.valueOf(3848);

  /**
   * Value is 3849 (0xF09)
   */
  public static final Integer ppEffectFadeSmoothly = Integer.valueOf(3849);

  /**
   * Value is 3850 (0xF0A)
   */
  public static final Integer ppEffectNewsflash = Integer.valueOf(3850);

  /**
   * Value is 3851 (0xF0B)
   */
  public static final Integer ppEffectPlusOut = Integer.valueOf(3851);

  /**
   * Value is 3852 (0xF0C)
   */
  public static final Integer ppEffectPushDown = Integer.valueOf(3852);

  /**
   * Value is 3853 (0xF0D)
   */
  public static final Integer ppEffectPushLeft = Integer.valueOf(3853);

  /**
   * Value is 3854 (0xF0E)
   */
  public static final Integer ppEffectPushRight = Integer.valueOf(3854);

  /**
   * Value is 3855 (0xF0F)
   */
  public static final Integer ppEffectPushUp = Integer.valueOf(3855);

  /**
   * Value is 3856 (0xF10)
   */
  public static final Integer ppEffectWedge = Integer.valueOf(3856);

  /**
   * Value is 3857 (0xF11)
   */
  public static final Integer ppEffectWheel1Spoke = Integer.valueOf(3857);

  /**
   * Value is 3858 (0xF12)
   */
  public static final Integer ppEffectWheel2Spokes = Integer.valueOf(3858);

  /**
   * Value is 3859 (0xF13)
   */
  public static final Integer ppEffectWheel3Spokes = Integer.valueOf(3859);

  /**
   * Value is 3860 (0xF14)
   */
  public static final Integer ppEffectWheel4Spokes = Integer.valueOf(3860);

  /**
   * Value is 3861 (0xF15)
   */
  public static final Integer ppEffectWheel8Spokes = Integer.valueOf(3861);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("ppEffectMixed", ppEffectMixed);
    v.put("ppEffectNone", ppEffectNone);
    v.put("ppEffectCut", ppEffectCut);
    v.put("ppEffectCutThroughBlack", ppEffectCutThroughBlack);
    v.put("ppEffectRandom", ppEffectRandom);
    v.put("ppEffectBlindsHorizontal", ppEffectBlindsHorizontal);
    v.put("ppEffectBlindsVertical", ppEffectBlindsVertical);
    v.put("ppEffectCheckerboardAcross", ppEffectCheckerboardAcross);
    v.put("ppEffectCheckerboardDown", ppEffectCheckerboardDown);
    v.put("ppEffectCoverLeft", ppEffectCoverLeft);
    v.put("ppEffectCoverUp", ppEffectCoverUp);
    v.put("ppEffectCoverRight", ppEffectCoverRight);
    v.put("ppEffectCoverDown", ppEffectCoverDown);
    v.put("ppEffectCoverLeftUp", ppEffectCoverLeftUp);
    v.put("ppEffectCoverRightUp", ppEffectCoverRightUp);
    v.put("ppEffectCoverLeftDown", ppEffectCoverLeftDown);
    v.put("ppEffectCoverRightDown", ppEffectCoverRightDown);
    v.put("ppEffectDissolve", ppEffectDissolve);
    v.put("ppEffectFade", ppEffectFade);
    v.put("ppEffectUncoverLeft", ppEffectUncoverLeft);
    v.put("ppEffectUncoverUp", ppEffectUncoverUp);
    v.put("ppEffectUncoverRight", ppEffectUncoverRight);
    v.put("ppEffectUncoverDown", ppEffectUncoverDown);
    v.put("ppEffectUncoverLeftUp", ppEffectUncoverLeftUp);
    v.put("ppEffectUncoverRightUp", ppEffectUncoverRightUp);
    v.put("ppEffectUncoverLeftDown", ppEffectUncoverLeftDown);
    v.put("ppEffectUncoverRightDown", ppEffectUncoverRightDown);
    v.put("ppEffectRandomBarsHorizontal", ppEffectRandomBarsHorizontal);
    v.put("ppEffectRandomBarsVertical", ppEffectRandomBarsVertical);
    v.put("ppEffectStripsUpLeft", ppEffectStripsUpLeft);
    v.put("ppEffectStripsUpRight", ppEffectStripsUpRight);
    v.put("ppEffectStripsDownLeft", ppEffectStripsDownLeft);
    v.put("ppEffectStripsDownRight", ppEffectStripsDownRight);
    v.put("ppEffectStripsLeftUp", ppEffectStripsLeftUp);
    v.put("ppEffectStripsRightUp", ppEffectStripsRightUp);
    v.put("ppEffectStripsLeftDown", ppEffectStripsLeftDown);
    v.put("ppEffectStripsRightDown", ppEffectStripsRightDown);
    v.put("ppEffectWipeLeft", ppEffectWipeLeft);
    v.put("ppEffectWipeUp", ppEffectWipeUp);
    v.put("ppEffectWipeRight", ppEffectWipeRight);
    v.put("ppEffectWipeDown", ppEffectWipeDown);
    v.put("ppEffectBoxOut", ppEffectBoxOut);
    v.put("ppEffectBoxIn", ppEffectBoxIn);
    v.put("ppEffectFlyFromLeft", ppEffectFlyFromLeft);
    v.put("ppEffectFlyFromTop", ppEffectFlyFromTop);
    v.put("ppEffectFlyFromRight", ppEffectFlyFromRight);
    v.put("ppEffectFlyFromBottom", ppEffectFlyFromBottom);
    v.put("ppEffectFlyFromTopLeft", ppEffectFlyFromTopLeft);
    v.put("ppEffectFlyFromTopRight", ppEffectFlyFromTopRight);
    v.put("ppEffectFlyFromBottomLeft", ppEffectFlyFromBottomLeft);
    v.put("ppEffectFlyFromBottomRight", ppEffectFlyFromBottomRight);
    v.put("ppEffectPeekFromLeft", ppEffectPeekFromLeft);
    v.put("ppEffectPeekFromDown", ppEffectPeekFromDown);
    v.put("ppEffectPeekFromRight", ppEffectPeekFromRight);
    v.put("ppEffectPeekFromUp", ppEffectPeekFromUp);
    v.put("ppEffectCrawlFromLeft", ppEffectCrawlFromLeft);
    v.put("ppEffectCrawlFromUp", ppEffectCrawlFromUp);
    v.put("ppEffectCrawlFromRight", ppEffectCrawlFromRight);
    v.put("ppEffectCrawlFromDown", ppEffectCrawlFromDown);
    v.put("ppEffectZoomIn", ppEffectZoomIn);
    v.put("ppEffectZoomInSlightly", ppEffectZoomInSlightly);
    v.put("ppEffectZoomOut", ppEffectZoomOut);
    v.put("ppEffectZoomOutSlightly", ppEffectZoomOutSlightly);
    v.put("ppEffectZoomCenter", ppEffectZoomCenter);
    v.put("ppEffectZoomBottom", ppEffectZoomBottom);
    v.put("ppEffectStretchAcross", ppEffectStretchAcross);
    v.put("ppEffectStretchLeft", ppEffectStretchLeft);
    v.put("ppEffectStretchUp", ppEffectStretchUp);
    v.put("ppEffectStretchRight", ppEffectStretchRight);
    v.put("ppEffectStretchDown", ppEffectStretchDown);
    v.put("ppEffectSwivel", ppEffectSwivel);
    v.put("ppEffectSpiral", ppEffectSpiral);
    v.put("ppEffectSplitHorizontalOut", ppEffectSplitHorizontalOut);
    v.put("ppEffectSplitHorizontalIn", ppEffectSplitHorizontalIn);
    v.put("ppEffectSplitVerticalOut", ppEffectSplitVerticalOut);
    v.put("ppEffectSplitVerticalIn", ppEffectSplitVerticalIn);
    v.put("ppEffectFlashOnceFast", ppEffectFlashOnceFast);
    v.put("ppEffectFlashOnceMedium", ppEffectFlashOnceMedium);
    v.put("ppEffectFlashOnceSlow", ppEffectFlashOnceSlow);
    v.put("ppEffectAppear", ppEffectAppear);
    v.put("ppEffectCircleOut", ppEffectCircleOut);
    v.put("ppEffectDiamondOut", ppEffectDiamondOut);
    v.put("ppEffectCombHorizontal", ppEffectCombHorizontal);
    v.put("ppEffectCombVertical", ppEffectCombVertical);
    v.put("ppEffectFadeSmoothly", ppEffectFadeSmoothly);
    v.put("ppEffectNewsflash", ppEffectNewsflash);
    v.put("ppEffectPlusOut", ppEffectPlusOut);
    v.put("ppEffectPushDown", ppEffectPushDown);
    v.put("ppEffectPushLeft", ppEffectPushLeft);
    v.put("ppEffectPushRight", ppEffectPushRight);
    v.put("ppEffectPushUp", ppEffectPushUp);
    v.put("ppEffectWedge", ppEffectWedge);
    v.put("ppEffectWheel1Spoke", ppEffectWheel1Spoke);
    v.put("ppEffectWheel2Spokes", ppEffectWheel2Spokes);
    v.put("ppEffectWheel3Spokes", ppEffectWheel3Spokes);
    v.put("ppEffectWheel4Spokes", ppEffectWheel4Spokes);
    v.put("ppEffectWheel8Spokes", ppEffectWheel8Spokes);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
