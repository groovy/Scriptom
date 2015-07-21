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
public final class DISPID_SpeechRecognizer
{
  private DISPID_SpeechRecognizer()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DISPID_SRRecognizer = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DISPID_SRAllowAudioInputFormatChangesOnNextSet = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer DISPID_SRAudioInput = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DISPID_SRAudioInputStream = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer DISPID_SRIsShared = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer DISPID_SRState = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer DISPID_SRStatus = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer DISPID_SRProfile = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer DISPID_SREmulateRecognition = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer DISPID_SRCreateRecoContext = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer DISPID_SRGetFormat = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer DISPID_SRSetPropertyNumber = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer DISPID_SRGetPropertyNumber = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer DISPID_SRSetPropertyString = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer DISPID_SRGetPropertyString = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer DISPID_SRIsUISupported = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer DISPID_SRDisplayUI = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer DISPID_SRGetRecognizers = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer DISPID_SVGetAudioInputs = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer DISPID_SVGetProfiles = Integer.valueOf(20);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("DISPID_SRRecognizer", DISPID_SRRecognizer);
    v.put("DISPID_SRAllowAudioInputFormatChangesOnNextSet", DISPID_SRAllowAudioInputFormatChangesOnNextSet);
    v.put("DISPID_SRAudioInput", DISPID_SRAudioInput);
    v.put("DISPID_SRAudioInputStream", DISPID_SRAudioInputStream);
    v.put("DISPID_SRIsShared", DISPID_SRIsShared);
    v.put("DISPID_SRState", DISPID_SRState);
    v.put("DISPID_SRStatus", DISPID_SRStatus);
    v.put("DISPID_SRProfile", DISPID_SRProfile);
    v.put("DISPID_SREmulateRecognition", DISPID_SREmulateRecognition);
    v.put("DISPID_SRCreateRecoContext", DISPID_SRCreateRecoContext);
    v.put("DISPID_SRGetFormat", DISPID_SRGetFormat);
    v.put("DISPID_SRSetPropertyNumber", DISPID_SRSetPropertyNumber);
    v.put("DISPID_SRGetPropertyNumber", DISPID_SRGetPropertyNumber);
    v.put("DISPID_SRSetPropertyString", DISPID_SRSetPropertyString);
    v.put("DISPID_SRGetPropertyString", DISPID_SRGetPropertyString);
    v.put("DISPID_SRIsUISupported", DISPID_SRIsUISupported);
    v.put("DISPID_SRDisplayUI", DISPID_SRDisplayUI);
    v.put("DISPID_SRGetRecognizers", DISPID_SRGetRecognizers);
    v.put("DISPID_SVGetAudioInputs", DISPID_SVGetAudioInputs);
    v.put("DISPID_SVGetProfiles", DISPID_SVGetProfiles);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
