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
 * Values for various properties of a Visio master.
 * @author Jason Smith
 */
public final class VisMasterProperties
{
  private VisMasterProperties()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visLeft = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visCenter = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visRight = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visIconFormatVisio = Integer.valueOf(0);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visIconFormatBMP = Integer.valueOf(2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visNormal = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visTall = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visWide = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visDouble = Integer.valueOf(4);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visAutomatic = Integer.valueOf(1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visManual = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visMasIsLinePat = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visMasIsLineEnd = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visMasIsFillPat = Integer.valueOf(4);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visMasLPTileDeform = Integer.valueOf(0);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visMasLPTile = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer visMasLPStretch = Integer.valueOf(32);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer visMasLPAnnotate = Integer.valueOf(48);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer visMasLPScale = Integer.valueOf(64);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visMasLEDefault = Integer.valueOf(0);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer visMasLEUpright = Integer.valueOf(256);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer visMasLEScale = Integer.valueOf(1024);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visMasFPTile = Integer.valueOf(0);

  /**
   * Value is 4096 (0x1000)
   */
  public static final Integer visMasFPCenter = Integer.valueOf(4096);

  /**
   * Value is 8192 (0x2000)
   */
  public static final Integer visMasFPStretch = Integer.valueOf(8192);

  /**
   * Value is 16384 (0x4000)
   */
  public static final Integer visMasFPScale = Integer.valueOf(16384);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visLeft", visLeft);
    v.put("visCenter", visCenter);
    v.put("visRight", visRight);
    v.put("visIconFormatVisio", visIconFormatVisio);
    v.put("visIconFormatBMP", visIconFormatBMP);
    v.put("visNormal", visNormal);
    v.put("visTall", visTall);
    v.put("visWide", visWide);
    v.put("visDouble", visDouble);
    v.put("visAutomatic", visAutomatic);
    v.put("visManual", visManual);
    v.put("visMasIsLinePat", visMasIsLinePat);
    v.put("visMasIsLineEnd", visMasIsLineEnd);
    v.put("visMasIsFillPat", visMasIsFillPat);
    v.put("visMasLPTileDeform", visMasLPTileDeform);
    v.put("visMasLPTile", visMasLPTile);
    v.put("visMasLPStretch", visMasLPStretch);
    v.put("visMasLPAnnotate", visMasLPAnnotate);
    v.put("visMasLPScale", visMasLPScale);
    v.put("visMasLEDefault", visMasLEDefault);
    v.put("visMasLEUpright", visMasLEUpright);
    v.put("visMasLEScale", visMasLEScale);
    v.put("visMasFPTile", visMasFPTile);
    v.put("visMasFPCenter", visMasFPCenter);
    v.put("visMasFPStretch", visMasFPStretch);
    v.put("visMasFPScale", visMasFPScale);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
