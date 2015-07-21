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
public final class WdLineWidth
{
  private WdLineWidth()
  {
  }

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdLineWidth025pt = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdLineWidth050pt = Integer.valueOf(4);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdLineWidth075pt = Integer.valueOf(6);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdLineWidth100pt = Integer.valueOf(8);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdLineWidth150pt = Integer.valueOf(12);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdLineWidth225pt = Integer.valueOf(18);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdLineWidth300pt = Integer.valueOf(24);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer wdLineWidth450pt = Integer.valueOf(36);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer wdLineWidth600pt = Integer.valueOf(48);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdLineWidth025pt", wdLineWidth025pt);
    v.put("wdLineWidth050pt", wdLineWidth050pt);
    v.put("wdLineWidth075pt", wdLineWidth075pt);
    v.put("wdLineWidth100pt", wdLineWidth100pt);
    v.put("wdLineWidth150pt", wdLineWidth150pt);
    v.put("wdLineWidth225pt", wdLineWidth225pt);
    v.put("wdLineWidth300pt", wdLineWidth300pt);
    v.put("wdLineWidth450pt", wdLineWidth450pt);
    v.put("wdLineWidth600pt", wdLineWidth600pt);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
