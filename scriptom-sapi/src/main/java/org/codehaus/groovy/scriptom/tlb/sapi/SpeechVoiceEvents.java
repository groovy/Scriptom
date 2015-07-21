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
public final class SpeechVoiceEvents
{
  private SpeechVoiceEvents()
  {
  }

  /**
   * Value is 2 (0x2)
   */
  public static final Integer SVEStartInputStream = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer SVEEndInputStream = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer SVEVoiceChange = Integer.valueOf(8);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer SVEBookmark = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer SVEWordBoundary = Integer.valueOf(32);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer SVEPhoneme = Integer.valueOf(64);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer SVESentenceBoundary = Integer.valueOf(128);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer SVEViseme = Integer.valueOf(256);

  /**
   * Value is 512 (0x200)
   */
  public static final Integer SVEAudioLevel = Integer.valueOf(512);

  /**
   * Value is 32768 (0x8000)
   */
  public static final Integer SVEPrivate = Integer.valueOf(32768);

  /**
   * Value is 33790 (0x83FE)
   */
  public static final Integer SVEAllEvents = Integer.valueOf(33790);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SVEStartInputStream", SVEStartInputStream);
    v.put("SVEEndInputStream", SVEEndInputStream);
    v.put("SVEVoiceChange", SVEVoiceChange);
    v.put("SVEBookmark", SVEBookmark);
    v.put("SVEWordBoundary", SVEWordBoundary);
    v.put("SVEPhoneme", SVEPhoneme);
    v.put("SVESentenceBoundary", SVESentenceBoundary);
    v.put("SVEViseme", SVEViseme);
    v.put("SVEAudioLevel", SVEAudioLevel);
    v.put("SVEPrivate", SVEPrivate);
    v.put("SVEAllEvents", SVEAllEvents);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
