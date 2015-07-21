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
public final class SPEVENTENUM
{
  private SPEVENTENUM()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer SPEI_UNDEFINED = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer SPEI_START_INPUT_STREAM = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer SPEI_END_INPUT_STREAM = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer SPEI_VOICE_CHANGE = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer SPEI_TTS_BOOKMARK = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer SPEI_WORD_BOUNDARY = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer SPEI_PHONEME = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer SPEI_SENTENCE_BOUNDARY = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer SPEI_VISEME = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer SPEI_TTS_AUDIO_LEVEL = Integer.valueOf(9);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer SPEI_TTS_PRIVATE = Integer.valueOf(15);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer SPEI_MIN_TTS = Integer.valueOf(1);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer SPEI_MAX_TTS = Integer.valueOf(15);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer SPEI_END_SR_STREAM = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer SPEI_SOUND_START = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer SPEI_SOUND_END = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer SPEI_PHRASE_START = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer SPEI_RECOGNITION = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer SPEI_HYPOTHESIS = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer SPEI_SR_BOOKMARK = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer SPEI_PROPERTY_NUM_CHANGE = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer SPEI_PROPERTY_STRING_CHANGE = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer SPEI_FALSE_RECOGNITION = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer SPEI_INTERFERENCE = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer SPEI_REQUEST_UI = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer SPEI_RECO_STATE_CHANGE = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer SPEI_ADAPTATION = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer SPEI_START_SR_STREAM = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer SPEI_RECO_OTHER_CONTEXT = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer SPEI_SR_AUDIO_LEVEL = Integer.valueOf(50);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer SPEI_SR_PRIVATE = Integer.valueOf(52);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer SPEI_MIN_SR = Integer.valueOf(34);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer SPEI_MAX_SR = Integer.valueOf(52);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer SPEI_RESERVED1 = Integer.valueOf(30);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer SPEI_RESERVED2 = Integer.valueOf(33);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer SPEI_RESERVED3 = Integer.valueOf(63);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SPEI_UNDEFINED", SPEI_UNDEFINED);
    v.put("SPEI_START_INPUT_STREAM", SPEI_START_INPUT_STREAM);
    v.put("SPEI_END_INPUT_STREAM", SPEI_END_INPUT_STREAM);
    v.put("SPEI_VOICE_CHANGE", SPEI_VOICE_CHANGE);
    v.put("SPEI_TTS_BOOKMARK", SPEI_TTS_BOOKMARK);
    v.put("SPEI_WORD_BOUNDARY", SPEI_WORD_BOUNDARY);
    v.put("SPEI_PHONEME", SPEI_PHONEME);
    v.put("SPEI_SENTENCE_BOUNDARY", SPEI_SENTENCE_BOUNDARY);
    v.put("SPEI_VISEME", SPEI_VISEME);
    v.put("SPEI_TTS_AUDIO_LEVEL", SPEI_TTS_AUDIO_LEVEL);
    v.put("SPEI_TTS_PRIVATE", SPEI_TTS_PRIVATE);
    v.put("SPEI_MIN_TTS", SPEI_MIN_TTS);
    v.put("SPEI_MAX_TTS", SPEI_MAX_TTS);
    v.put("SPEI_END_SR_STREAM", SPEI_END_SR_STREAM);
    v.put("SPEI_SOUND_START", SPEI_SOUND_START);
    v.put("SPEI_SOUND_END", SPEI_SOUND_END);
    v.put("SPEI_PHRASE_START", SPEI_PHRASE_START);
    v.put("SPEI_RECOGNITION", SPEI_RECOGNITION);
    v.put("SPEI_HYPOTHESIS", SPEI_HYPOTHESIS);
    v.put("SPEI_SR_BOOKMARK", SPEI_SR_BOOKMARK);
    v.put("SPEI_PROPERTY_NUM_CHANGE", SPEI_PROPERTY_NUM_CHANGE);
    v.put("SPEI_PROPERTY_STRING_CHANGE", SPEI_PROPERTY_STRING_CHANGE);
    v.put("SPEI_FALSE_RECOGNITION", SPEI_FALSE_RECOGNITION);
    v.put("SPEI_INTERFERENCE", SPEI_INTERFERENCE);
    v.put("SPEI_REQUEST_UI", SPEI_REQUEST_UI);
    v.put("SPEI_RECO_STATE_CHANGE", SPEI_RECO_STATE_CHANGE);
    v.put("SPEI_ADAPTATION", SPEI_ADAPTATION);
    v.put("SPEI_START_SR_STREAM", SPEI_START_SR_STREAM);
    v.put("SPEI_RECO_OTHER_CONTEXT", SPEI_RECO_OTHER_CONTEXT);
    v.put("SPEI_SR_AUDIO_LEVEL", SPEI_SR_AUDIO_LEVEL);
    v.put("SPEI_SR_PRIVATE", SPEI_SR_PRIVATE);
    v.put("SPEI_MIN_SR", SPEI_MIN_SR);
    v.put("SPEI_MAX_SR", SPEI_MAX_SR);
    v.put("SPEI_RESERVED1", SPEI_RESERVED1);
    v.put("SPEI_RESERVED2", SPEI_RESERVED2);
    v.put("SPEI_RESERVED3", SPEI_RESERVED3);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
