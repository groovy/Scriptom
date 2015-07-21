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
package org.codehaus.groovy.scriptom.tlb.office.outlook;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class OlExchangeConnectionMode
{
  private OlExchangeConnectionMode()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer olNoExchange = Integer.valueOf(0);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer olOffline = Integer.valueOf(100);

  /**
   * Value is 200 (0xC8)
   */
  public static final Integer olCachedOffline = Integer.valueOf(200);

  /**
   * Value is 300 (0x12C)
   */
  public static final Integer olDisconnected = Integer.valueOf(300);

  /**
   * Value is 400 (0x190)
   */
  public static final Integer olCachedDisconnected = Integer.valueOf(400);

  /**
   * Value is 500 (0x1F4)
   */
  public static final Integer olCachedConnectedHeaders = Integer.valueOf(500);

  /**
   * Value is 600 (0x258)
   */
  public static final Integer olCachedConnectedDrizzle = Integer.valueOf(600);

  /**
   * Value is 700 (0x2BC)
   */
  public static final Integer olCachedConnectedFull = Integer.valueOf(700);

  /**
   * Value is 800 (0x320)
   */
  public static final Integer olOnline = Integer.valueOf(800);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("olNoExchange", olNoExchange);
    v.put("olOffline", olOffline);
    v.put("olCachedOffline", olCachedOffline);
    v.put("olDisconnected", olDisconnected);
    v.put("olCachedDisconnected", olCachedDisconnected);
    v.put("olCachedConnectedHeaders", olCachedConnectedHeaders);
    v.put("olCachedConnectedDrizzle", olCachedConnectedDrizzle);
    v.put("olCachedConnectedFull", olCachedConnectedFull);
    v.put("olOnline", olOnline);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
