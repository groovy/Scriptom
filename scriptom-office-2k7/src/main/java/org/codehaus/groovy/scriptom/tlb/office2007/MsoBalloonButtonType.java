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
package org.codehaus.groovy.scriptom.tlb.office2007;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class MsoBalloonButtonType
{
  private MsoBalloonButtonType()
  {
  }

  /**
   * Value is -15 (0xFFFFFFF1)
   */
  public static final Integer msoBalloonButtonYesToAll = Integer.valueOf(-15);

  /**
   * Value is -14 (0xFFFFFFF2)
   */
  public static final Integer msoBalloonButtonOptions = Integer.valueOf(-14);

  /**
   * Value is -13 (0xFFFFFFF3)
   */
  public static final Integer msoBalloonButtonTips = Integer.valueOf(-13);

  /**
   * Value is -12 (0xFFFFFFF4)
   */
  public static final Integer msoBalloonButtonClose = Integer.valueOf(-12);

  /**
   * Value is -11 (0xFFFFFFF5)
   */
  public static final Integer msoBalloonButtonSnooze = Integer.valueOf(-11);

  /**
   * Value is -10 (0xFFFFFFF6)
   */
  public static final Integer msoBalloonButtonSearch = Integer.valueOf(-10);

  /**
   * Value is -9 (0xFFFFFFF7)
   */
  public static final Integer msoBalloonButtonIgnore = Integer.valueOf(-9);

  /**
   * Value is -8 (0xFFFFFFF8)
   */
  public static final Integer msoBalloonButtonAbort = Integer.valueOf(-8);

  /**
   * Value is -7 (0xFFFFFFF9)
   */
  public static final Integer msoBalloonButtonRetry = Integer.valueOf(-7);

  /**
   * Value is -6 (0xFFFFFFFA)
   */
  public static final Integer msoBalloonButtonNext = Integer.valueOf(-6);

  /**
   * Value is -5 (0xFFFFFFFB)
   */
  public static final Integer msoBalloonButtonBack = Integer.valueOf(-5);

  /**
   * Value is -4 (0xFFFFFFFC)
   */
  public static final Integer msoBalloonButtonNo = Integer.valueOf(-4);

  /**
   * Value is -3 (0xFFFFFFFD)
   */
  public static final Integer msoBalloonButtonYes = Integer.valueOf(-3);

  /**
   * Value is -2 (0xFFFFFFFE)
   */
  public static final Integer msoBalloonButtonCancel = Integer.valueOf(-2);

  /**
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer msoBalloonButtonOK = Integer.valueOf(-1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer msoBalloonButtonNull = Integer.valueOf(0);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoBalloonButtonYesToAll", msoBalloonButtonYesToAll);
    v.put("msoBalloonButtonOptions", msoBalloonButtonOptions);
    v.put("msoBalloonButtonTips", msoBalloonButtonTips);
    v.put("msoBalloonButtonClose", msoBalloonButtonClose);
    v.put("msoBalloonButtonSnooze", msoBalloonButtonSnooze);
    v.put("msoBalloonButtonSearch", msoBalloonButtonSearch);
    v.put("msoBalloonButtonIgnore", msoBalloonButtonIgnore);
    v.put("msoBalloonButtonAbort", msoBalloonButtonAbort);
    v.put("msoBalloonButtonRetry", msoBalloonButtonRetry);
    v.put("msoBalloonButtonNext", msoBalloonButtonNext);
    v.put("msoBalloonButtonBack", msoBalloonButtonBack);
    v.put("msoBalloonButtonNo", msoBalloonButtonNo);
    v.put("msoBalloonButtonYes", msoBalloonButtonYes);
    v.put("msoBalloonButtonCancel", msoBalloonButtonCancel);
    v.put("msoBalloonButtonOK", msoBalloonButtonOK);
    v.put("msoBalloonButtonNull", msoBalloonButtonNull);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
