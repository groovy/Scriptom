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
package org.codehaus.groovy.scriptom.tlb.sapi;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class SpeechPartOfSpeech
{
  private SpeechPartOfSpeech()
  {
  }

  /**
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer SPSNotOverriden = Integer.valueOf(-1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer SPSUnknown = Integer.valueOf(0);

  /**
   * Value is 4096 (0x1000)
   */
  public static final Integer SPSNoun = Integer.valueOf(4096);

  /**
   * Value is 8192 (0x2000)
   */
  public static final Integer SPSVerb = Integer.valueOf(8192);

  /**
   * Value is 12288 (0x3000)
   */
  public static final Integer SPSModifier = Integer.valueOf(12288);

  /**
   * Value is 16384 (0x4000)
   */
  public static final Integer SPSFunction = Integer.valueOf(16384);

  /**
   * Value is 20480 (0x5000)
   */
  public static final Integer SPSInterjection = Integer.valueOf(20480);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SPSNotOverriden", SPSNotOverriden);
    v.put("SPSUnknown", SPSUnknown);
    v.put("SPSNoun", SPSNoun);
    v.put("SPSVerb", SPSVerb);
    v.put("SPSModifier", SPSModifier);
    v.put("SPSFunction", SPSFunction);
    v.put("SPSInterjection", SPSInterjection);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
