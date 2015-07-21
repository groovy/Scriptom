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
 * Values used in conjunction with Selection.IterationMode.
 * @author Jason Smith
 */
public final class VisSelectMode
{
  private VisSelectMode()
  {
  }

  /**
   * Don't enumerate selected sheets that have sub-selections.<p>
   * Value is 256 (0x100)
   */
  public static final Integer visSelModeSkipSuper = Integer.valueOf(256);

  /**
   * Only enumerate selected sheets that have sub-selections.<p>
   * Value is 512 (0x200)
   */
  public static final Integer visSelModeOnlySuper = Integer.valueOf(512);

  /**
   * Don't enumerate selected sheets that are sub-selections.<p>
   * Value is 1024 (0x400)
   */
  public static final Integer visSelModeSkipSub = Integer.valueOf(1024);

  /**
   * Only enumerate selected sheets that are sub-selections.<p>
   * Value is 2048 (0x800)
   */
  public static final Integer visSelModeOnlySub = Integer.valueOf(2048);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visSelModeSkipSuper", visSelModeSkipSuper);
    v.put("visSelModeOnlySuper", visSelModeOnlySuper);
    v.put("visSelModeSkipSub", visSelModeSkipSub);
    v.put("visSelModeOnlySub", visSelModeOnlySub);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
