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
package org.codehaus.groovy.scriptom.tlb.office2007.word;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class WdKey
{
  private WdKey()
  {
  }

  /**
   * Value is 255 (0xFF)
   */
  public static final Integer wdNoKey = Integer.valueOf(255);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer wdKeyShift = Integer.valueOf(256);

  /**
   * Value is 512 (0x200)
   */
  public static final Integer wdKeyControl = Integer.valueOf(512);

  /**
   * Value is 512 (0x200)
   */
  public static final Integer wdKeyCommand = Integer.valueOf(512);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer wdKeyAlt = Integer.valueOf(1024);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer wdKeyOption = Integer.valueOf(1024);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer wdKeyA = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer wdKeyB = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer wdKeyC = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer wdKeyD = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer wdKeyE = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer wdKeyF = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer wdKeyG = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer wdKeyH = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer wdKeyI = Integer.valueOf(73);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer wdKeyJ = Integer.valueOf(74);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer wdKeyK = Integer.valueOf(75);

  /**
   * Value is 76 (0x4C)
   */
  public static final Integer wdKeyL = Integer.valueOf(76);

  /**
   * Value is 77 (0x4D)
   */
  public static final Integer wdKeyM = Integer.valueOf(77);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer wdKeyN = Integer.valueOf(78);

  /**
   * Value is 79 (0x4F)
   */
  public static final Integer wdKeyO = Integer.valueOf(79);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer wdKeyP = Integer.valueOf(80);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer wdKeyQ = Integer.valueOf(81);

  /**
   * Value is 82 (0x52)
   */
  public static final Integer wdKeyR = Integer.valueOf(82);

  /**
   * Value is 83 (0x53)
   */
  public static final Integer wdKeyS = Integer.valueOf(83);

  /**
   * Value is 84 (0x54)
   */
  public static final Integer wdKeyT = Integer.valueOf(84);

  /**
   * Value is 85 (0x55)
   */
  public static final Integer wdKeyU = Integer.valueOf(85);

  /**
   * Value is 86 (0x56)
   */
  public static final Integer wdKeyV = Integer.valueOf(86);

  /**
   * Value is 87 (0x57)
   */
  public static final Integer wdKeyW = Integer.valueOf(87);

  /**
   * Value is 88 (0x58)
   */
  public static final Integer wdKeyX = Integer.valueOf(88);

  /**
   * Value is 89 (0x59)
   */
  public static final Integer wdKeyY = Integer.valueOf(89);

  /**
   * Value is 90 (0x5A)
   */
  public static final Integer wdKeyZ = Integer.valueOf(90);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer wdKey0 = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer wdKey1 = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer wdKey2 = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer wdKey3 = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer wdKey4 = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer wdKey5 = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer wdKey6 = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer wdKey7 = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer wdKey8 = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer wdKey9 = Integer.valueOf(57);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdKeyBackspace = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdKeyTab = Integer.valueOf(9);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdKeyNumeric5Special = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdKeyReturn = Integer.valueOf(13);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdKeyPause = Integer.valueOf(19);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer wdKeyEsc = Integer.valueOf(27);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer wdKeySpacebar = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer wdKeyPageUp = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdKeyPageDown = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer wdKeyEnd = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer wdKeyHome = Integer.valueOf(36);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer wdKeyInsert = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer wdKeyDelete = Integer.valueOf(46);

  /**
   * Value is 96 (0x60)
   */
  public static final Integer wdKeyNumeric0 = Integer.valueOf(96);

  /**
   * Value is 97 (0x61)
   */
  public static final Integer wdKeyNumeric1 = Integer.valueOf(97);

  /**
   * Value is 98 (0x62)
   */
  public static final Integer wdKeyNumeric2 = Integer.valueOf(98);

  /**
   * Value is 99 (0x63)
   */
  public static final Integer wdKeyNumeric3 = Integer.valueOf(99);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer wdKeyNumeric4 = Integer.valueOf(100);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer wdKeyNumeric5 = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer wdKeyNumeric6 = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer wdKeyNumeric7 = Integer.valueOf(103);

  /**
   * Value is 104 (0x68)
   */
  public static final Integer wdKeyNumeric8 = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer wdKeyNumeric9 = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer wdKeyNumericMultiply = Integer.valueOf(106);

  /**
   * Value is 107 (0x6B)
   */
  public static final Integer wdKeyNumericAdd = Integer.valueOf(107);

  /**
   * Value is 109 (0x6D)
   */
  public static final Integer wdKeyNumericSubtract = Integer.valueOf(109);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer wdKeyNumericDecimal = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer wdKeyNumericDivide = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer wdKeyF1 = Integer.valueOf(112);

  /**
   * Value is 113 (0x71)
   */
  public static final Integer wdKeyF2 = Integer.valueOf(113);

  /**
   * Value is 114 (0x72)
   */
  public static final Integer wdKeyF3 = Integer.valueOf(114);

  /**
   * Value is 115 (0x73)
   */
  public static final Integer wdKeyF4 = Integer.valueOf(115);

  /**
   * Value is 116 (0x74)
   */
  public static final Integer wdKeyF5 = Integer.valueOf(116);

  /**
   * Value is 117 (0x75)
   */
  public static final Integer wdKeyF6 = Integer.valueOf(117);

  /**
   * Value is 118 (0x76)
   */
  public static final Integer wdKeyF7 = Integer.valueOf(118);

  /**
   * Value is 119 (0x77)
   */
  public static final Integer wdKeyF8 = Integer.valueOf(119);

  /**
   * Value is 120 (0x78)
   */
  public static final Integer wdKeyF9 = Integer.valueOf(120);

  /**
   * Value is 121 (0x79)
   */
  public static final Integer wdKeyF10 = Integer.valueOf(121);

  /**
   * Value is 122 (0x7A)
   */
  public static final Integer wdKeyF11 = Integer.valueOf(122);

  /**
   * Value is 123 (0x7B)
   */
  public static final Integer wdKeyF12 = Integer.valueOf(123);

  /**
   * Value is 124 (0x7C)
   */
  public static final Integer wdKeyF13 = Integer.valueOf(124);

  /**
   * Value is 125 (0x7D)
   */
  public static final Integer wdKeyF14 = Integer.valueOf(125);

  /**
   * Value is 126 (0x7E)
   */
  public static final Integer wdKeyF15 = Integer.valueOf(126);

  /**
   * Value is 127 (0x7F)
   */
  public static final Integer wdKeyF16 = Integer.valueOf(127);

  /**
   * Value is 145 (0x91)
   */
  public static final Integer wdKeyScrollLock = Integer.valueOf(145);

  /**
   * Value is 186 (0xBA)
   */
  public static final Integer wdKeySemiColon = Integer.valueOf(186);

  /**
   * Value is 187 (0xBB)
   */
  public static final Integer wdKeyEquals = Integer.valueOf(187);

  /**
   * Value is 188 (0xBC)
   */
  public static final Integer wdKeyComma = Integer.valueOf(188);

  /**
   * Value is 189 (0xBD)
   */
  public static final Integer wdKeyHyphen = Integer.valueOf(189);

  /**
   * Value is 190 (0xBE)
   */
  public static final Integer wdKeyPeriod = Integer.valueOf(190);

  /**
   * Value is 191 (0xBF)
   */
  public static final Integer wdKeySlash = Integer.valueOf(191);

  /**
   * Value is 192 (0xC0)
   */
  public static final Integer wdKeyBackSingleQuote = Integer.valueOf(192);

  /**
   * Value is 219 (0xDB)
   */
  public static final Integer wdKeyOpenSquareBrace = Integer.valueOf(219);

  /**
   * Value is 220 (0xDC)
   */
  public static final Integer wdKeyBackSlash = Integer.valueOf(220);

  /**
   * Value is 221 (0xDD)
   */
  public static final Integer wdKeyCloseSquareBrace = Integer.valueOf(221);

  /**
   * Value is 222 (0xDE)
   */
  public static final Integer wdKeySingleQuote = Integer.valueOf(222);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdNoKey", wdNoKey);
    v.put("wdKeyShift", wdKeyShift);
    v.put("wdKeyControl", wdKeyControl);
    v.put("wdKeyCommand", wdKeyCommand);
    v.put("wdKeyAlt", wdKeyAlt);
    v.put("wdKeyOption", wdKeyOption);
    v.put("wdKeyA", wdKeyA);
    v.put("wdKeyB", wdKeyB);
    v.put("wdKeyC", wdKeyC);
    v.put("wdKeyD", wdKeyD);
    v.put("wdKeyE", wdKeyE);
    v.put("wdKeyF", wdKeyF);
    v.put("wdKeyG", wdKeyG);
    v.put("wdKeyH", wdKeyH);
    v.put("wdKeyI", wdKeyI);
    v.put("wdKeyJ", wdKeyJ);
    v.put("wdKeyK", wdKeyK);
    v.put("wdKeyL", wdKeyL);
    v.put("wdKeyM", wdKeyM);
    v.put("wdKeyN", wdKeyN);
    v.put("wdKeyO", wdKeyO);
    v.put("wdKeyP", wdKeyP);
    v.put("wdKeyQ", wdKeyQ);
    v.put("wdKeyR", wdKeyR);
    v.put("wdKeyS", wdKeyS);
    v.put("wdKeyT", wdKeyT);
    v.put("wdKeyU", wdKeyU);
    v.put("wdKeyV", wdKeyV);
    v.put("wdKeyW", wdKeyW);
    v.put("wdKeyX", wdKeyX);
    v.put("wdKeyY", wdKeyY);
    v.put("wdKeyZ", wdKeyZ);
    v.put("wdKey0", wdKey0);
    v.put("wdKey1", wdKey1);
    v.put("wdKey2", wdKey2);
    v.put("wdKey3", wdKey3);
    v.put("wdKey4", wdKey4);
    v.put("wdKey5", wdKey5);
    v.put("wdKey6", wdKey6);
    v.put("wdKey7", wdKey7);
    v.put("wdKey8", wdKey8);
    v.put("wdKey9", wdKey9);
    v.put("wdKeyBackspace", wdKeyBackspace);
    v.put("wdKeyTab", wdKeyTab);
    v.put("wdKeyNumeric5Special", wdKeyNumeric5Special);
    v.put("wdKeyReturn", wdKeyReturn);
    v.put("wdKeyPause", wdKeyPause);
    v.put("wdKeyEsc", wdKeyEsc);
    v.put("wdKeySpacebar", wdKeySpacebar);
    v.put("wdKeyPageUp", wdKeyPageUp);
    v.put("wdKeyPageDown", wdKeyPageDown);
    v.put("wdKeyEnd", wdKeyEnd);
    v.put("wdKeyHome", wdKeyHome);
    v.put("wdKeyInsert", wdKeyInsert);
    v.put("wdKeyDelete", wdKeyDelete);
    v.put("wdKeyNumeric0", wdKeyNumeric0);
    v.put("wdKeyNumeric1", wdKeyNumeric1);
    v.put("wdKeyNumeric2", wdKeyNumeric2);
    v.put("wdKeyNumeric3", wdKeyNumeric3);
    v.put("wdKeyNumeric4", wdKeyNumeric4);
    v.put("wdKeyNumeric5", wdKeyNumeric5);
    v.put("wdKeyNumeric6", wdKeyNumeric6);
    v.put("wdKeyNumeric7", wdKeyNumeric7);
    v.put("wdKeyNumeric8", wdKeyNumeric8);
    v.put("wdKeyNumeric9", wdKeyNumeric9);
    v.put("wdKeyNumericMultiply", wdKeyNumericMultiply);
    v.put("wdKeyNumericAdd", wdKeyNumericAdd);
    v.put("wdKeyNumericSubtract", wdKeyNumericSubtract);
    v.put("wdKeyNumericDecimal", wdKeyNumericDecimal);
    v.put("wdKeyNumericDivide", wdKeyNumericDivide);
    v.put("wdKeyF1", wdKeyF1);
    v.put("wdKeyF2", wdKeyF2);
    v.put("wdKeyF3", wdKeyF3);
    v.put("wdKeyF4", wdKeyF4);
    v.put("wdKeyF5", wdKeyF5);
    v.put("wdKeyF6", wdKeyF6);
    v.put("wdKeyF7", wdKeyF7);
    v.put("wdKeyF8", wdKeyF8);
    v.put("wdKeyF9", wdKeyF9);
    v.put("wdKeyF10", wdKeyF10);
    v.put("wdKeyF11", wdKeyF11);
    v.put("wdKeyF12", wdKeyF12);
    v.put("wdKeyF13", wdKeyF13);
    v.put("wdKeyF14", wdKeyF14);
    v.put("wdKeyF15", wdKeyF15);
    v.put("wdKeyF16", wdKeyF16);
    v.put("wdKeyScrollLock", wdKeyScrollLock);
    v.put("wdKeySemiColon", wdKeySemiColon);
    v.put("wdKeyEquals", wdKeyEquals);
    v.put("wdKeyComma", wdKeyComma);
    v.put("wdKeyHyphen", wdKeyHyphen);
    v.put("wdKeyPeriod", wdKeyPeriod);
    v.put("wdKeySlash", wdKeySlash);
    v.put("wdKeyBackSingleQuote", wdKeyBackSingleQuote);
    v.put("wdKeyOpenSquareBrace", wdKeyOpenSquareBrace);
    v.put("wdKeyBackSlash", wdKeyBackSlash);
    v.put("wdKeyCloseSquareBrace", wdKeyCloseSquareBrace);
    v.put("wdKeySingleQuote", wdKeySingleQuote);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
