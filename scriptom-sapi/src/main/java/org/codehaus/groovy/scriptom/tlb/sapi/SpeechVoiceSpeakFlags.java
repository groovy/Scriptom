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
public final class SpeechVoiceSpeakFlags
{
  private SpeechVoiceSpeakFlags()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer SVSFDefault = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer SVSFlagsAsync = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer SVSFPurgeBeforeSpeak = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer SVSFIsFilename = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer SVSFIsXML = Integer.valueOf(8);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer SVSFIsNotXML = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer SVSFPersistXML = Integer.valueOf(32);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer SVSFNLPSpeakPunc = Integer.valueOf(64);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer SVSFNLPMask = Integer.valueOf(64);

  /**
   * Value is 127 (0x7F)
   */
  public static final Integer SVSFVoiceMask = Integer.valueOf(127);

  /**
   * Value is -128 (0xFFFFFF80)
   */
  public static final Integer SVSFUnusedFlags = Integer.valueOf(-128);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SVSFDefault", SVSFDefault);
    v.put("SVSFlagsAsync", SVSFlagsAsync);
    v.put("SVSFPurgeBeforeSpeak", SVSFPurgeBeforeSpeak);
    v.put("SVSFIsFilename", SVSFIsFilename);
    v.put("SVSFIsXML", SVSFIsXML);
    v.put("SVSFIsNotXML", SVSFIsNotXML);
    v.put("SVSFPersistXML", SVSFPersistXML);
    v.put("SVSFNLPSpeakPunc", SVSFNLPSpeakPunc);
    v.put("SVSFNLPMask", SVSFNLPMask);
    v.put("SVSFVoiceMask", SVSFVoiceMask);
    v.put("SVSFUnusedFlags", SVSFUnusedFlags);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
