/*
 * Copyright 2007 (C) Guillaume Laforge. All Rights Reserved.
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
package org.codehaus.groovy.scriptom.tlb.wbemscripting;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * Defines behavior of various interface calls
 * @author Jason Smith
 */
public final class WbemFlagEnum
{
  private WbemFlagEnum()
  {
  }

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wbemFlagReturnImmediately = Integer.valueOf(16);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wbemFlagReturnWhenComplete = Integer.valueOf(0);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wbemFlagBidirectional = Integer.valueOf(0);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer wbemFlagForwardOnly = Integer.valueOf(32);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer wbemFlagNoErrorObject = Integer.valueOf(64);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wbemFlagReturnErrorObject = Integer.valueOf(0);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer wbemFlagSendStatus = Integer.valueOf(128);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wbemFlagDontSendStatus = Integer.valueOf(0);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer wbemFlagEnsureLocatable = Integer.valueOf(256);

  /**
   * Value is 512 (0x200)
   */
  public static final Integer wbemFlagDirectRead = Integer.valueOf(512);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wbemFlagSendOnlySelected = Integer.valueOf(0);

  /**
   * Value is 131072 (0x20000)
   */
  public static final Integer wbemFlagUseAmendedQualifiers = Integer.valueOf(131072);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wbemFlagGetDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wbemFlagSpawnInstance = Integer.valueOf(1);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wbemFlagUseCurrentTime = Integer.valueOf(1);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("wbemFlagReturnImmediately", wbemFlagReturnImmediately);
    v.put("wbemFlagReturnWhenComplete", wbemFlagReturnWhenComplete);
    v.put("wbemFlagBidirectional", wbemFlagBidirectional);
    v.put("wbemFlagForwardOnly", wbemFlagForwardOnly);
    v.put("wbemFlagNoErrorObject", wbemFlagNoErrorObject);
    v.put("wbemFlagReturnErrorObject", wbemFlagReturnErrorObject);
    v.put("wbemFlagSendStatus", wbemFlagSendStatus);
    v.put("wbemFlagDontSendStatus", wbemFlagDontSendStatus);
    v.put("wbemFlagEnsureLocatable", wbemFlagEnsureLocatable);
    v.put("wbemFlagDirectRead", wbemFlagDirectRead);
    v.put("wbemFlagSendOnlySelected", wbemFlagSendOnlySelected);
    v.put("wbemFlagUseAmendedQualifiers", wbemFlagUseAmendedQualifiers);
    v.put("wbemFlagGetDefault", wbemFlagGetDefault);
    v.put("wbemFlagSpawnInstance", wbemFlagSpawnInstance);
    v.put("wbemFlagUseCurrentTime", wbemFlagUseCurrentTime);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
