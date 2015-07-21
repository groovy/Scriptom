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
public final class SpeechAudioFormatType
{
  private SpeechAudioFormatType()
  {
  }

  /**
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer SAFTDefault = Integer.valueOf(-1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer SAFTNoAssignedFormat = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer SAFTText = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer SAFTNonStandardFormat = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer SAFTExtendedAudioFormat = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer SAFT8kHz8BitMono = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer SAFT8kHz8BitStereo = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer SAFT8kHz16BitMono = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer SAFT8kHz16BitStereo = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer SAFT11kHz8BitMono = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer SAFT11kHz8BitStereo = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer SAFT11kHz16BitMono = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer SAFT11kHz16BitStereo = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer SAFT12kHz8BitMono = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer SAFT12kHz8BitStereo = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer SAFT12kHz16BitMono = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer SAFT12kHz16BitStereo = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer SAFT16kHz8BitMono = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer SAFT16kHz8BitStereo = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer SAFT16kHz16BitMono = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer SAFT16kHz16BitStereo = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer SAFT22kHz8BitMono = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer SAFT22kHz8BitStereo = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer SAFT22kHz16BitMono = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer SAFT22kHz16BitStereo = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer SAFT24kHz8BitMono = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer SAFT24kHz8BitStereo = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer SAFT24kHz16BitMono = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer SAFT24kHz16BitStereo = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer SAFT32kHz8BitMono = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer SAFT32kHz8BitStereo = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer SAFT32kHz16BitMono = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer SAFT32kHz16BitStereo = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer SAFT44kHz8BitMono = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer SAFT44kHz8BitStereo = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer SAFT44kHz16BitMono = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer SAFT44kHz16BitStereo = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer SAFT48kHz8BitMono = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer SAFT48kHz8BitStereo = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer SAFT48kHz16BitMono = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer SAFT48kHz16BitStereo = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer SAFTTrueSpeech_8kHz1BitMono = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer SAFTCCITT_ALaw_8kHzMono = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer SAFTCCITT_ALaw_8kHzStereo = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer SAFTCCITT_ALaw_11kHzMono = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer SAFTCCITT_ALaw_11kHzStereo = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer SAFTCCITT_ALaw_22kHzMono = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer SAFTCCITT_ALaw_22kHzStereo = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer SAFTCCITT_ALaw_44kHzMono = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer SAFTCCITT_ALaw_44kHzStereo = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer SAFTCCITT_uLaw_8kHzMono = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer SAFTCCITT_uLaw_8kHzStereo = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer SAFTCCITT_uLaw_11kHzMono = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer SAFTCCITT_uLaw_11kHzStereo = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer SAFTCCITT_uLaw_22kHzMono = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer SAFTCCITT_uLaw_22kHzStereo = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer SAFTCCITT_uLaw_44kHzMono = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer SAFTCCITT_uLaw_44kHzStereo = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer SAFTADPCM_8kHzMono = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer SAFTADPCM_8kHzStereo = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer SAFTADPCM_11kHzMono = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer SAFTADPCM_11kHzStereo = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer SAFTADPCM_22kHzMono = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer SAFTADPCM_22kHzStereo = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer SAFTADPCM_44kHzMono = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer SAFTADPCM_44kHzStereo = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer SAFTGSM610_8kHzMono = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer SAFTGSM610_11kHzMono = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer SAFTGSM610_22kHzMono = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer SAFTGSM610_44kHzMono = Integer.valueOf(68);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SAFTDefault", SAFTDefault);
    v.put("SAFTNoAssignedFormat", SAFTNoAssignedFormat);
    v.put("SAFTText", SAFTText);
    v.put("SAFTNonStandardFormat", SAFTNonStandardFormat);
    v.put("SAFTExtendedAudioFormat", SAFTExtendedAudioFormat);
    v.put("SAFT8kHz8BitMono", SAFT8kHz8BitMono);
    v.put("SAFT8kHz8BitStereo", SAFT8kHz8BitStereo);
    v.put("SAFT8kHz16BitMono", SAFT8kHz16BitMono);
    v.put("SAFT8kHz16BitStereo", SAFT8kHz16BitStereo);
    v.put("SAFT11kHz8BitMono", SAFT11kHz8BitMono);
    v.put("SAFT11kHz8BitStereo", SAFT11kHz8BitStereo);
    v.put("SAFT11kHz16BitMono", SAFT11kHz16BitMono);
    v.put("SAFT11kHz16BitStereo", SAFT11kHz16BitStereo);
    v.put("SAFT12kHz8BitMono", SAFT12kHz8BitMono);
    v.put("SAFT12kHz8BitStereo", SAFT12kHz8BitStereo);
    v.put("SAFT12kHz16BitMono", SAFT12kHz16BitMono);
    v.put("SAFT12kHz16BitStereo", SAFT12kHz16BitStereo);
    v.put("SAFT16kHz8BitMono", SAFT16kHz8BitMono);
    v.put("SAFT16kHz8BitStereo", SAFT16kHz8BitStereo);
    v.put("SAFT16kHz16BitMono", SAFT16kHz16BitMono);
    v.put("SAFT16kHz16BitStereo", SAFT16kHz16BitStereo);
    v.put("SAFT22kHz8BitMono", SAFT22kHz8BitMono);
    v.put("SAFT22kHz8BitStereo", SAFT22kHz8BitStereo);
    v.put("SAFT22kHz16BitMono", SAFT22kHz16BitMono);
    v.put("SAFT22kHz16BitStereo", SAFT22kHz16BitStereo);
    v.put("SAFT24kHz8BitMono", SAFT24kHz8BitMono);
    v.put("SAFT24kHz8BitStereo", SAFT24kHz8BitStereo);
    v.put("SAFT24kHz16BitMono", SAFT24kHz16BitMono);
    v.put("SAFT24kHz16BitStereo", SAFT24kHz16BitStereo);
    v.put("SAFT32kHz8BitMono", SAFT32kHz8BitMono);
    v.put("SAFT32kHz8BitStereo", SAFT32kHz8BitStereo);
    v.put("SAFT32kHz16BitMono", SAFT32kHz16BitMono);
    v.put("SAFT32kHz16BitStereo", SAFT32kHz16BitStereo);
    v.put("SAFT44kHz8BitMono", SAFT44kHz8BitMono);
    v.put("SAFT44kHz8BitStereo", SAFT44kHz8BitStereo);
    v.put("SAFT44kHz16BitMono", SAFT44kHz16BitMono);
    v.put("SAFT44kHz16BitStereo", SAFT44kHz16BitStereo);
    v.put("SAFT48kHz8BitMono", SAFT48kHz8BitMono);
    v.put("SAFT48kHz8BitStereo", SAFT48kHz8BitStereo);
    v.put("SAFT48kHz16BitMono", SAFT48kHz16BitMono);
    v.put("SAFT48kHz16BitStereo", SAFT48kHz16BitStereo);
    v.put("SAFTTrueSpeech_8kHz1BitMono", SAFTTrueSpeech_8kHz1BitMono);
    v.put("SAFTCCITT_ALaw_8kHzMono", SAFTCCITT_ALaw_8kHzMono);
    v.put("SAFTCCITT_ALaw_8kHzStereo", SAFTCCITT_ALaw_8kHzStereo);
    v.put("SAFTCCITT_ALaw_11kHzMono", SAFTCCITT_ALaw_11kHzMono);
    v.put("SAFTCCITT_ALaw_11kHzStereo", SAFTCCITT_ALaw_11kHzStereo);
    v.put("SAFTCCITT_ALaw_22kHzMono", SAFTCCITT_ALaw_22kHzMono);
    v.put("SAFTCCITT_ALaw_22kHzStereo", SAFTCCITT_ALaw_22kHzStereo);
    v.put("SAFTCCITT_ALaw_44kHzMono", SAFTCCITT_ALaw_44kHzMono);
    v.put("SAFTCCITT_ALaw_44kHzStereo", SAFTCCITT_ALaw_44kHzStereo);
    v.put("SAFTCCITT_uLaw_8kHzMono", SAFTCCITT_uLaw_8kHzMono);
    v.put("SAFTCCITT_uLaw_8kHzStereo", SAFTCCITT_uLaw_8kHzStereo);
    v.put("SAFTCCITT_uLaw_11kHzMono", SAFTCCITT_uLaw_11kHzMono);
    v.put("SAFTCCITT_uLaw_11kHzStereo", SAFTCCITT_uLaw_11kHzStereo);
    v.put("SAFTCCITT_uLaw_22kHzMono", SAFTCCITT_uLaw_22kHzMono);
    v.put("SAFTCCITT_uLaw_22kHzStereo", SAFTCCITT_uLaw_22kHzStereo);
    v.put("SAFTCCITT_uLaw_44kHzMono", SAFTCCITT_uLaw_44kHzMono);
    v.put("SAFTCCITT_uLaw_44kHzStereo", SAFTCCITT_uLaw_44kHzStereo);
    v.put("SAFTADPCM_8kHzMono", SAFTADPCM_8kHzMono);
    v.put("SAFTADPCM_8kHzStereo", SAFTADPCM_8kHzStereo);
    v.put("SAFTADPCM_11kHzMono", SAFTADPCM_11kHzMono);
    v.put("SAFTADPCM_11kHzStereo", SAFTADPCM_11kHzStereo);
    v.put("SAFTADPCM_22kHzMono", SAFTADPCM_22kHzMono);
    v.put("SAFTADPCM_22kHzStereo", SAFTADPCM_22kHzStereo);
    v.put("SAFTADPCM_44kHzMono", SAFTADPCM_44kHzMono);
    v.put("SAFTADPCM_44kHzStereo", SAFTADPCM_44kHzStereo);
    v.put("SAFTGSM610_8kHzMono", SAFTGSM610_8kHzMono);
    v.put("SAFTGSM610_11kHzMono", SAFTGSM610_11kHzMono);
    v.put("SAFTGSM610_22kHzMono", SAFTGSM610_22kHzMono);
    v.put("SAFTGSM610_44kHzMono", SAFTGSM610_44kHzMono);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
