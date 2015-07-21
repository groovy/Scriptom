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
package org.codehaus.groovy.scriptom.tlb.office;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class MsoPresetTexture
{
  private MsoPresetTexture()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer msoPresetTextureMixed = Integer.valueOf(-2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoTexturePapyrus = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoTextureCanvas = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoTextureDenim = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoTextureWovenMat = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoTextureWaterDroplets = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoTexturePaperBag = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoTextureFishFossil = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoTextureSand = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoTextureGreenMarble = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoTextureWhiteMarble = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoTextureBrownMarble = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoTextureGranite = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoTextureNewsprint = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoTextureRecycledPaper = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoTextureParchment = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoTextureStationery = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoTextureBlueTissuePaper = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoTexturePinkTissuePaper = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoTexturePurpleMesh = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoTextureBouquet = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoTextureCork = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoTextureWalnut = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoTextureOak = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoTextureMediumWood = Integer.valueOf(24);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoPresetTextureMixed", msoPresetTextureMixed);
    v.put("msoTexturePapyrus", msoTexturePapyrus);
    v.put("msoTextureCanvas", msoTextureCanvas);
    v.put("msoTextureDenim", msoTextureDenim);
    v.put("msoTextureWovenMat", msoTextureWovenMat);
    v.put("msoTextureWaterDroplets", msoTextureWaterDroplets);
    v.put("msoTexturePaperBag", msoTexturePaperBag);
    v.put("msoTextureFishFossil", msoTextureFishFossil);
    v.put("msoTextureSand", msoTextureSand);
    v.put("msoTextureGreenMarble", msoTextureGreenMarble);
    v.put("msoTextureWhiteMarble", msoTextureWhiteMarble);
    v.put("msoTextureBrownMarble", msoTextureBrownMarble);
    v.put("msoTextureGranite", msoTextureGranite);
    v.put("msoTextureNewsprint", msoTextureNewsprint);
    v.put("msoTextureRecycledPaper", msoTextureRecycledPaper);
    v.put("msoTextureParchment", msoTextureParchment);
    v.put("msoTextureStationery", msoTextureStationery);
    v.put("msoTextureBlueTissuePaper", msoTextureBlueTissuePaper);
    v.put("msoTexturePinkTissuePaper", msoTexturePinkTissuePaper);
    v.put("msoTexturePurpleMesh", msoTexturePurpleMesh);
    v.put("msoTextureBouquet", msoTextureBouquet);
    v.put("msoTextureCork", msoTextureCork);
    v.put("msoTextureWalnut", msoTextureWalnut);
    v.put("msoTextureOak", msoTextureOak);
    v.put("msoTextureMediumWood", msoTextureMediumWood);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
