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
 * State codes returned by Window.WindowState.
 * @author Jason Smith
 */
public final class VisWindowStates
{
  private VisWindowStates()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visWSNone = Integer.valueOf(0);

  /**
   * Value is 1073741824 (0x40000000)
   */
  public static final Integer visWSMaximized = Integer.valueOf(1073741824);

  /**
   * Value is 536870912 (0x20000000)
   */
  public static final Integer visWSMinimized = Integer.valueOf(536870912);

  /**
   * Value is 268435456 (0x10000000)
   */
  public static final Integer visWSRestored = Integer.valueOf(268435456);

  /**
   * Value is 134217728 (0x8000000)
   */
  public static final Integer visWSVisible = Integer.valueOf(134217728);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visWSDockedLeft = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visWSDockedTop = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visWSDockedRight = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visWSDockedBottom = Integer.valueOf(8);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visWSFloating = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer visWSAnchorLeft = Integer.valueOf(32);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer visWSAnchorTop = Integer.valueOf(64);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer visWSAnchorRight = Integer.valueOf(128);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer visWSAnchorBottom = Integer.valueOf(256);

  /**
   * Value is 512 (0x200)
   */
  public static final Integer visWSAnchorAutoHide = Integer.valueOf(512);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer visWSAnchorMerged = Integer.valueOf(1024);

  /**
   * Value is 67108864 (0x4000000)
   */
  public static final Integer visWSActive = Integer.valueOf(67108864);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visWSNone", visWSNone);
    v.put("visWSMaximized", visWSMaximized);
    v.put("visWSMinimized", visWSMinimized);
    v.put("visWSRestored", visWSRestored);
    v.put("visWSVisible", visWSVisible);
    v.put("visWSDockedLeft", visWSDockedLeft);
    v.put("visWSDockedTop", visWSDockedTop);
    v.put("visWSDockedRight", visWSDockedRight);
    v.put("visWSDockedBottom", visWSDockedBottom);
    v.put("visWSFloating", visWSFloating);
    v.put("visWSAnchorLeft", visWSAnchorLeft);
    v.put("visWSAnchorTop", visWSAnchorTop);
    v.put("visWSAnchorRight", visWSAnchorRight);
    v.put("visWSAnchorBottom", visWSAnchorBottom);
    v.put("visWSAnchorAutoHide", visWSAnchorAutoHide);
    v.put("visWSAnchorMerged", visWSAnchorMerged);
    v.put("visWSActive", visWSActive);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
