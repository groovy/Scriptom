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
public final class WdSummaryLength
{
  private WdSummaryLength()
  {
  }

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer wd10Sentences = Integer.valueOf(-2);

  /**
   * Value is -3 (0xFFFFFFFD)
   */
  public static final Integer wd20Sentences = Integer.valueOf(-3);

  /**
   * Value is -4 (0xFFFFFFFC)
   */
  public static final Integer wd100Words = Integer.valueOf(-4);

  /**
   * Value is -5 (0xFFFFFFFB)
   */
  public static final Integer wd500Words = Integer.valueOf(-5);

  /**
   * Value is -6 (0xFFFFFFFA)
   */
  public static final Integer wd10Percent = Integer.valueOf(-6);

  /**
   * Value is -7 (0xFFFFFFF9)
   */
  public static final Integer wd25Percent = Integer.valueOf(-7);

  /**
   * Value is -8 (0xFFFFFFF8)
   */
  public static final Integer wd50Percent = Integer.valueOf(-8);

  /**
   * Value is -9 (0xFFFFFFF7)
   */
  public static final Integer wd75Percent = Integer.valueOf(-9);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wd10Sentences", wd10Sentences);
    v.put("wd20Sentences", wd20Sentences);
    v.put("wd100Words", wd100Words);
    v.put("wd500Words", wd500Words);
    v.put("wd10Percent", wd10Percent);
    v.put("wd25Percent", wd25Percent);
    v.put("wd50Percent", wd50Percent);
    v.put("wd75Percent", wd75Percent);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
