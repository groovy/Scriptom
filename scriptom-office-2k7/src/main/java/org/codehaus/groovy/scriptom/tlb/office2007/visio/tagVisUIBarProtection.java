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
 * @author Jason Smith
 */
public final class tagVisUIBarProtection
{
  private tagVisUIBarProtection()
  {
  }

  /**
   * No protection.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visBarNoProtection = Integer.valueOf(0);

  /**
   * Bar may not be customized.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visBarNoCustomize = Integer.valueOf(1);

  /**
   * Bar may not be resized.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visBarNoResize = Integer.valueOf(2);

  /**
   * Bar may not be moved.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visBarNoMove = Integer.valueOf(4);

  /**
   * Bar may not be docked/undocked.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visBarNoChangeDock = Integer.valueOf(16);

  /**
   * Bar may not be docked vertically.<p>
   * Value is 32 (0x20)
   */
  public static final Integer visBarNoVerticalDock = Integer.valueOf(32);

  /**
   * Bar may not be docked horizontally.<p>
   * Value is 64 (0x40)
   */
  public static final Integer visBarNoHorizontalDock = Integer.valueOf(64);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visBarNoProtection", visBarNoProtection);
    v.put("visBarNoCustomize", visBarNoCustomize);
    v.put("visBarNoResize", visBarNoResize);
    v.put("visBarNoMove", visBarNoMove);
    v.put("visBarNoChangeDock", visBarNoChangeDock);
    v.put("visBarNoVerticalDock", visBarNoVerticalDock);
    v.put("visBarNoHorizontalDock", visBarNoHorizontalDock);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
