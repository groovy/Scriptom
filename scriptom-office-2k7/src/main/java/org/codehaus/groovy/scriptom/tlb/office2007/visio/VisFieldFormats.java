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
package org.codehaus.groovy.scriptom.tlb.office2007.visio;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * Text field formats.
 * @author Jason Smith
 */
public final class VisFieldFormats
{
  private VisFieldFormats()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visFmtNumGenNoUnits = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visFmtNumGenDefUnits = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visFmt0PlNoUnits = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visFmt0PlDefUnits = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visFmt1PlNoUnits = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visFmt1PlDefUnits = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visFmt2PlNoUnits = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visFmt2PlDefUnits = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visFmt3PlNoUnits = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visFmt3PlDefUnits = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer visFmtFeetAndInches = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer visFmtRadians = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer visFmtDegrees = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer visFmtFeetAndInches1Pl = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer visFmtFeetAndInches2Pl = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer visFmtFraction1PlNoUnits = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visFmtFraction1PlDefUnits = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer visFmtFraction2PlNoUnits = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer visFmtFraction2PlDefUnits = Integer.valueOf(18);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer visFmtDateShort = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer visFmtDateLong = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer visFmtDateMDYY = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer visFmtDateMMDDYY = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer visFmtDateMmmDYYYY = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer visFmtDateMmmmDYYYY = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer visFmtDateDMYY = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer visFmtDateDDMMYY = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer visFmtDateDMMMYYYY = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer visFmtDateDMMMMYYYY = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer visFmtTimeGen = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer visFmtTimeHMM = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer visFmtTimeHHMM = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer visFmtTimeHMM24 = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer visFmtTimeHHMM24 = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer visFmtTimeHMMAMPM = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer visFmtTimeHHMMAMPM = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer visFmtStrNormal = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer visFmtStrLower = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer visFmtStrUpper = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer visFmtJDategggeXmXdXww = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer visFmtJDateyyyyXmXdXww = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer visFmtJDategggeXmXdX = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer visFmtJDateyyyyXmXdX = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer visFmtJDateyyyymd = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer visFmtJDateyymmdd = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer visFmtJDatehmmaxpx = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer visFmtJDateaxpxhmm = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer visFmtJDateaxpxhXmmX = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer visFmtJDatehXmmX = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer visFmtCDateiiieXmmmmXdddd = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer visFmtCDateiieXmmmmXdddd = Integer.valueOf(51);

  /**
   * Added starting with 5.0c.<p>
   * Value is 52 (0x34)
   */
  public static final Integer visFmtCDateieXmmmmXddddXww = Integer.valueOf(52);

  /**
   * Changed value from 52 to 53 starting with 5.0c.<p>
   * Value is 53 (0x35)
   */
  public static final Integer visFmtCDateieXmmmmXdddd = Integer.valueOf(53);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer visFmtDateyyyymd = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer visFmtDateyymmdd = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer visFmtTimeAMPMhmm_J = Integer.valueOf(46);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer visFmtDateTWNfYYYYMMDDD_C = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer visFmtDateTWNsYYYYMMDDD_C = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer visFmtDateTWNfyyyymmddww_C = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer visFmtDateTWNfyyyymmdd_C = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer visFmtDategggemdww_J = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer visFmtDateyyyymdww_J = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer visFmtDategggemd_J = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer visFmtDateyyyymd_J = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer visFmtDateYYYYMMMDDDWWW_C = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer visFmtDateYYYYMMMDDD_C = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer visFmtDategeMMMMddddww_K = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer visFmtDateyyyymdww_K = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer visFmtDategeMMMMddd_K = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer visFmtDateyyyymd_K = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer visFmtDateyyyy_m_d = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer visFmtDateyy_mm_dd = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer visFmtTimeAMPMhmm_C = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer visFmtTimeAMPMhmm_K = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer visFmtTimeAMPM_hmm_J = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer visFmtTimehmm_J = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer visFmtTimeAMPM_hmm_C = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer visFmtTimehmm_C = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer visFmtTimeAMPM_hmm_K = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer visFmtTimehmm_K = Integer.valueOf(73);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer visFmtTimeHMMAMPM_E = Integer.valueOf(74);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer visFmtTimeHHMMAMPM_E = Integer.valueOf(75);

  /**
   * Value is 76 (0x4C)
   */
  public static final Integer visFmtDateyyyymd_S = Integer.valueOf(76);

  /**
   * Value is 77 (0x4D)
   */
  public static final Integer visFmtDateyyyymmdd_S = Integer.valueOf(77);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer visFmtDatewwyyyymmdd_S = Integer.valueOf(78);

  /**
   * Value is 79 (0x4F)
   */
  public static final Integer visFmtDatewwyyyymd_S = Integer.valueOf(79);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer visFmtTimeAMPMhmm_S = Integer.valueOf(80);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer visFmtTimeAMPMhhmm_S = Integer.valueOf(81);

  /**
   * Value is 200 (0xC8)
   */
  public static final Integer visFmtMsoDateShort = Integer.valueOf(200);

  /**
   * Value is 201 (0xC9)
   */
  public static final Integer visFmtMsoDateLongDay = Integer.valueOf(201);

  /**
   * Value is 202 (0xCA)
   */
  public static final Integer visFmtMsoDateLong = Integer.valueOf(202);

  /**
   * Value is 203 (0xCB)
   */
  public static final Integer visFmtMsoDateShortAlt = Integer.valueOf(203);

  /**
   * Value is 204 (0xCC)
   */
  public static final Integer visFmtMsoDateISO = Integer.valueOf(204);

  /**
   * Value is 205 (0xCD)
   */
  public static final Integer visFmtMsoDateShortMon = Integer.valueOf(205);

  /**
   * Value is 206 (0xCE)
   */
  public static final Integer visFmtMsoDateShortSlash = Integer.valueOf(206);

  /**
   * Value is 207 (0xCF)
   */
  public static final Integer visFmtMsoDateShortAbb = Integer.valueOf(207);

  /**
   * Value is 208 (0xD0)
   */
  public static final Integer visFmtMsoDateEnglish = Integer.valueOf(208);

  /**
   * Value is 209 (0xD1)
   */
  public static final Integer visFmtMsoDateMonthYr = Integer.valueOf(209);

  /**
   * Value is 210 (0xD2)
   */
  public static final Integer visFmtMsoDateMon_Yr = Integer.valueOf(210);

  /**
   * Value is 211 (0xD3)
   */
  public static final Integer visFmtMsoTimeDatePM = Integer.valueOf(211);

  /**
   * Value is 212 (0xD4)
   */
  public static final Integer visFmtMsoTimeDateSecPM = Integer.valueOf(212);

  /**
   * Value is 213 (0xD5)
   */
  public static final Integer visFmtMsoTimePM = Integer.valueOf(213);

  /**
   * Value is 214 (0xD6)
   */
  public static final Integer visFmtMsoTimeSecPM = Integer.valueOf(214);

  /**
   * Value is 215 (0xD7)
   */
  public static final Integer visFmtMsoTime24 = Integer.valueOf(215);

  /**
   * Value is 216 (0xD8)
   */
  public static final Integer visFmtMsoTimeSec24 = Integer.valueOf(216);

  /**
   * Value is 217 (0xD9)
   */
  public static final Integer visFmtMsoFEExtra1 = Integer.valueOf(217);

  /**
   * Value is 218 (0xDA)
   */
  public static final Integer visFmtMsoFEExtra2 = Integer.valueOf(218);

  /**
   * Value is 219 (0xDB)
   */
  public static final Integer visFmtMsoFEExtra3 = Integer.valueOf(219);

  /**
   * Value is 220 (0xDC)
   */
  public static final Integer visFmtMsoFEExtra4 = Integer.valueOf(220);

  /**
   * Value is 221 (0xDD)
   */
  public static final Integer visFmtMsoFEExtra5 = Integer.valueOf(221);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visFmtNumGenNoUnits", visFmtNumGenNoUnits);
    v.put("visFmtNumGenDefUnits", visFmtNumGenDefUnits);
    v.put("visFmt0PlNoUnits", visFmt0PlNoUnits);
    v.put("visFmt0PlDefUnits", visFmt0PlDefUnits);
    v.put("visFmt1PlNoUnits", visFmt1PlNoUnits);
    v.put("visFmt1PlDefUnits", visFmt1PlDefUnits);
    v.put("visFmt2PlNoUnits", visFmt2PlNoUnits);
    v.put("visFmt2PlDefUnits", visFmt2PlDefUnits);
    v.put("visFmt3PlNoUnits", visFmt3PlNoUnits);
    v.put("visFmt3PlDefUnits", visFmt3PlDefUnits);
    v.put("visFmtFeetAndInches", visFmtFeetAndInches);
    v.put("visFmtRadians", visFmtRadians);
    v.put("visFmtDegrees", visFmtDegrees);
    v.put("visFmtFeetAndInches1Pl", visFmtFeetAndInches1Pl);
    v.put("visFmtFeetAndInches2Pl", visFmtFeetAndInches2Pl);
    v.put("visFmtFraction1PlNoUnits", visFmtFraction1PlNoUnits);
    v.put("visFmtFraction1PlDefUnits", visFmtFraction1PlDefUnits);
    v.put("visFmtFraction2PlNoUnits", visFmtFraction2PlNoUnits);
    v.put("visFmtFraction2PlDefUnits", visFmtFraction2PlDefUnits);
    v.put("visFmtDateShort", visFmtDateShort);
    v.put("visFmtDateLong", visFmtDateLong);
    v.put("visFmtDateMDYY", visFmtDateMDYY);
    v.put("visFmtDateMMDDYY", visFmtDateMMDDYY);
    v.put("visFmtDateMmmDYYYY", visFmtDateMmmDYYYY);
    v.put("visFmtDateMmmmDYYYY", visFmtDateMmmmDYYYY);
    v.put("visFmtDateDMYY", visFmtDateDMYY);
    v.put("visFmtDateDDMMYY", visFmtDateDDMMYY);
    v.put("visFmtDateDMMMYYYY", visFmtDateDMMMYYYY);
    v.put("visFmtDateDMMMMYYYY", visFmtDateDMMMMYYYY);
    v.put("visFmtTimeGen", visFmtTimeGen);
    v.put("visFmtTimeHMM", visFmtTimeHMM);
    v.put("visFmtTimeHHMM", visFmtTimeHHMM);
    v.put("visFmtTimeHMM24", visFmtTimeHMM24);
    v.put("visFmtTimeHHMM24", visFmtTimeHHMM24);
    v.put("visFmtTimeHMMAMPM", visFmtTimeHMMAMPM);
    v.put("visFmtTimeHHMMAMPM", visFmtTimeHHMMAMPM);
    v.put("visFmtStrNormal", visFmtStrNormal);
    v.put("visFmtStrLower", visFmtStrLower);
    v.put("visFmtStrUpper", visFmtStrUpper);
    v.put("visFmtJDategggeXmXdXww", visFmtJDategggeXmXdXww);
    v.put("visFmtJDateyyyyXmXdXww", visFmtJDateyyyyXmXdXww);
    v.put("visFmtJDategggeXmXdX", visFmtJDategggeXmXdX);
    v.put("visFmtJDateyyyyXmXdX", visFmtJDateyyyyXmXdX);
    v.put("visFmtJDateyyyymd", visFmtJDateyyyymd);
    v.put("visFmtJDateyymmdd", visFmtJDateyymmdd);
    v.put("visFmtJDatehmmaxpx", visFmtJDatehmmaxpx);
    v.put("visFmtJDateaxpxhmm", visFmtJDateaxpxhmm);
    v.put("visFmtJDateaxpxhXmmX", visFmtJDateaxpxhXmmX);
    v.put("visFmtJDatehXmmX", visFmtJDatehXmmX);
    v.put("visFmtCDateiiieXmmmmXdddd", visFmtCDateiiieXmmmmXdddd);
    v.put("visFmtCDateiieXmmmmXdddd", visFmtCDateiieXmmmmXdddd);
    v.put("visFmtCDateieXmmmmXddddXww", visFmtCDateieXmmmmXddddXww);
    v.put("visFmtCDateieXmmmmXdddd", visFmtCDateieXmmmmXdddd);
    v.put("visFmtDateyyyymd", visFmtDateyyyymd);
    v.put("visFmtDateyymmdd", visFmtDateyymmdd);
    v.put("visFmtTimeAMPMhmm_J", visFmtTimeAMPMhmm_J);
    v.put("visFmtDateTWNfYYYYMMDDD_C", visFmtDateTWNfYYYYMMDDD_C);
    v.put("visFmtDateTWNsYYYYMMDDD_C", visFmtDateTWNsYYYYMMDDD_C);
    v.put("visFmtDateTWNfyyyymmddww_C", visFmtDateTWNfyyyymmddww_C);
    v.put("visFmtDateTWNfyyyymmdd_C", visFmtDateTWNfyyyymmdd_C);
    v.put("visFmtDategggemdww_J", visFmtDategggemdww_J);
    v.put("visFmtDateyyyymdww_J", visFmtDateyyyymdww_J);
    v.put("visFmtDategggemd_J", visFmtDategggemd_J);
    v.put("visFmtDateyyyymd_J", visFmtDateyyyymd_J);
    v.put("visFmtDateYYYYMMMDDDWWW_C", visFmtDateYYYYMMMDDDWWW_C);
    v.put("visFmtDateYYYYMMMDDD_C", visFmtDateYYYYMMMDDD_C);
    v.put("visFmtDategeMMMMddddww_K", visFmtDategeMMMMddddww_K);
    v.put("visFmtDateyyyymdww_K", visFmtDateyyyymdww_K);
    v.put("visFmtDategeMMMMddd_K", visFmtDategeMMMMddd_K);
    v.put("visFmtDateyyyymd_K", visFmtDateyyyymd_K);
    v.put("visFmtDateyyyy_m_d", visFmtDateyyyy_m_d);
    v.put("visFmtDateyy_mm_dd", visFmtDateyy_mm_dd);
    v.put("visFmtTimeAMPMhmm_C", visFmtTimeAMPMhmm_C);
    v.put("visFmtTimeAMPMhmm_K", visFmtTimeAMPMhmm_K);
    v.put("visFmtTimeAMPM_hmm_J", visFmtTimeAMPM_hmm_J);
    v.put("visFmtTimehmm_J", visFmtTimehmm_J);
    v.put("visFmtTimeAMPM_hmm_C", visFmtTimeAMPM_hmm_C);
    v.put("visFmtTimehmm_C", visFmtTimehmm_C);
    v.put("visFmtTimeAMPM_hmm_K", visFmtTimeAMPM_hmm_K);
    v.put("visFmtTimehmm_K", visFmtTimehmm_K);
    v.put("visFmtTimeHMMAMPM_E", visFmtTimeHMMAMPM_E);
    v.put("visFmtTimeHHMMAMPM_E", visFmtTimeHHMMAMPM_E);
    v.put("visFmtDateyyyymd_S", visFmtDateyyyymd_S);
    v.put("visFmtDateyyyymmdd_S", visFmtDateyyyymmdd_S);
    v.put("visFmtDatewwyyyymmdd_S", visFmtDatewwyyyymmdd_S);
    v.put("visFmtDatewwyyyymd_S", visFmtDatewwyyyymd_S);
    v.put("visFmtTimeAMPMhmm_S", visFmtTimeAMPMhmm_S);
    v.put("visFmtTimeAMPMhhmm_S", visFmtTimeAMPMhhmm_S);
    v.put("visFmtMsoDateShort", visFmtMsoDateShort);
    v.put("visFmtMsoDateLongDay", visFmtMsoDateLongDay);
    v.put("visFmtMsoDateLong", visFmtMsoDateLong);
    v.put("visFmtMsoDateShortAlt", visFmtMsoDateShortAlt);
    v.put("visFmtMsoDateISO", visFmtMsoDateISO);
    v.put("visFmtMsoDateShortMon", visFmtMsoDateShortMon);
    v.put("visFmtMsoDateShortSlash", visFmtMsoDateShortSlash);
    v.put("visFmtMsoDateShortAbb", visFmtMsoDateShortAbb);
    v.put("visFmtMsoDateEnglish", visFmtMsoDateEnglish);
    v.put("visFmtMsoDateMonthYr", visFmtMsoDateMonthYr);
    v.put("visFmtMsoDateMon_Yr", visFmtMsoDateMon_Yr);
    v.put("visFmtMsoTimeDatePM", visFmtMsoTimeDatePM);
    v.put("visFmtMsoTimeDateSecPM", visFmtMsoTimeDateSecPM);
    v.put("visFmtMsoTimePM", visFmtMsoTimePM);
    v.put("visFmtMsoTimeSecPM", visFmtMsoTimeSecPM);
    v.put("visFmtMsoTime24", visFmtMsoTime24);
    v.put("visFmtMsoTimeSec24", visFmtMsoTimeSec24);
    v.put("visFmtMsoFEExtra1", visFmtMsoFEExtra1);
    v.put("visFmtMsoFEExtra2", visFmtMsoFEExtra2);
    v.put("visFmtMsoFEExtra3", visFmtMsoFEExtra3);
    v.put("visFmtMsoFEExtra4", visFmtMsoFEExtra4);
    v.put("visFmtMsoFEExtra5", visFmtMsoFEExtra5);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
