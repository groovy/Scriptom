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
public final class SpeechRecoEvents
{
  private SpeechRecoEvents()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer SREStreamEnd = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer SRESoundStart = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer SRESoundEnd = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer SREPhraseStart = Integer.valueOf(8);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer SRERecognition = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer SREHypothesis = Integer.valueOf(32);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer SREBookmark = Integer.valueOf(64);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer SREPropertyNumChange = Integer.valueOf(128);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer SREPropertyStringChange = Integer.valueOf(256);

  /**
   * Value is 512 (0x200)
   */
  public static final Integer SREFalseRecognition = Integer.valueOf(512);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer SREInterference = Integer.valueOf(1024);

  /**
   * Value is 2048 (0x800)
   */
  public static final Integer SRERequestUI = Integer.valueOf(2048);

  /**
   * Value is 4096 (0x1000)
   */
  public static final Integer SREStateChange = Integer.valueOf(4096);

  /**
   * Value is 8192 (0x2000)
   */
  public static final Integer SREAdaptation = Integer.valueOf(8192);

  /**
   * Value is 16384 (0x4000)
   */
  public static final Integer SREStreamStart = Integer.valueOf(16384);

  /**
   * Value is 32768 (0x8000)
   */
  public static final Integer SRERecoOtherContext = Integer.valueOf(32768);

  /**
   * Value is 65536 (0x10000)
   */
  public static final Integer SREAudioLevel = Integer.valueOf(65536);

  /**
   * Value is 262144 (0x40000)
   */
  public static final Integer SREPrivate = Integer.valueOf(262144);

  /**
   * Value is 393215 (0x5FFFF)
   */
  public static final Integer SREAllEvents = Integer.valueOf(393215);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SREStreamEnd", SREStreamEnd);
    v.put("SRESoundStart", SRESoundStart);
    v.put("SRESoundEnd", SRESoundEnd);
    v.put("SREPhraseStart", SREPhraseStart);
    v.put("SRERecognition", SRERecognition);
    v.put("SREHypothesis", SREHypothesis);
    v.put("SREBookmark", SREBookmark);
    v.put("SREPropertyNumChange", SREPropertyNumChange);
    v.put("SREPropertyStringChange", SREPropertyStringChange);
    v.put("SREFalseRecognition", SREFalseRecognition);
    v.put("SREInterference", SREInterference);
    v.put("SRERequestUI", SRERequestUI);
    v.put("SREStateChange", SREStateChange);
    v.put("SREAdaptation", SREAdaptation);
    v.put("SREStreamStart", SREStreamStart);
    v.put("SRERecoOtherContext", SRERecoOtherContext);
    v.put("SREAudioLevel", SREAudioLevel);
    v.put("SREPrivate", SREPrivate);
    v.put("SREAllEvents", SREAllEvents);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
