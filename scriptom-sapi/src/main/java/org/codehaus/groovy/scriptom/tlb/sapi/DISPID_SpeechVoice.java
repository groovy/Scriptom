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
public final class DISPID_SpeechVoice
{
  private DISPID_SpeechVoice()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DISPID_SVStatus = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DISPID_SVVoice = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer DISPID_SVAudioOutput = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DISPID_SVAudioOutputStream = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer DISPID_SVRate = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer DISPID_SVVolume = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer DISPID_SVAllowAudioOuputFormatChangesOnNextSet = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer DISPID_SVEventInterests = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer DISPID_SVPriority = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer DISPID_SVAlertBoundary = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer DISPID_SVSyncronousSpeakTimeout = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer DISPID_SVSpeak = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer DISPID_SVSpeakStream = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer DISPID_SVPause = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer DISPID_SVResume = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer DISPID_SVSkip = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer DISPID_SVGetVoices = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer DISPID_SVGetAudioOutputs = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer DISPID_SVWaitUntilDone = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer DISPID_SVSpeakCompleteEvent = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer DISPID_SVIsUISupported = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer DISPID_SVDisplayUI = Integer.valueOf(22);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("DISPID_SVStatus", DISPID_SVStatus);
    v.put("DISPID_SVVoice", DISPID_SVVoice);
    v.put("DISPID_SVAudioOutput", DISPID_SVAudioOutput);
    v.put("DISPID_SVAudioOutputStream", DISPID_SVAudioOutputStream);
    v.put("DISPID_SVRate", DISPID_SVRate);
    v.put("DISPID_SVVolume", DISPID_SVVolume);
    v.put("DISPID_SVAllowAudioOuputFormatChangesOnNextSet", DISPID_SVAllowAudioOuputFormatChangesOnNextSet);
    v.put("DISPID_SVEventInterests", DISPID_SVEventInterests);
    v.put("DISPID_SVPriority", DISPID_SVPriority);
    v.put("DISPID_SVAlertBoundary", DISPID_SVAlertBoundary);
    v.put("DISPID_SVSyncronousSpeakTimeout", DISPID_SVSyncronousSpeakTimeout);
    v.put("DISPID_SVSpeak", DISPID_SVSpeak);
    v.put("DISPID_SVSpeakStream", DISPID_SVSpeakStream);
    v.put("DISPID_SVPause", DISPID_SVPause);
    v.put("DISPID_SVResume", DISPID_SVResume);
    v.put("DISPID_SVSkip", DISPID_SVSkip);
    v.put("DISPID_SVGetVoices", DISPID_SVGetVoices);
    v.put("DISPID_SVGetAudioOutputs", DISPID_SVGetAudioOutputs);
    v.put("DISPID_SVWaitUntilDone", DISPID_SVWaitUntilDone);
    v.put("DISPID_SVSpeakCompleteEvent", DISPID_SVSpeakCompleteEvent);
    v.put("DISPID_SVIsUISupported", DISPID_SVIsUISupported);
    v.put("DISPID_SVDisplayUI", DISPID_SVDisplayUI);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
