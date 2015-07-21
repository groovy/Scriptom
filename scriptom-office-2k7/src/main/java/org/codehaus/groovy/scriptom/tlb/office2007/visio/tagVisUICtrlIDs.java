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
 * @author Jason Smith
 */
public final class tagVisUICtrlIDs
{
  private tagVisUICtrlIDs()
  {
  }

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 8383 (0x20BF)
   */
  public static final Integer visCtrlIDNEW = Integer.valueOf(8383);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visCtrlIDOPEN = Integer.valueOf(1);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visCtrlIDOPENSTEN = Integer.valueOf(2);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 3 (0x3)
   */
  public static final Integer visCtrlIDSAVE = Integer.valueOf(3);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visCtrlIDPRINT = Integer.valueOf(4);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 5 (0x5)
   */
  public static final Integer visCtrlIDPREVIEW = Integer.valueOf(5);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 6 (0x6)
   */
  public static final Integer visCtrlIDCUT = Integer.valueOf(6);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 7 (0x7)
   */
  public static final Integer visCtrlIDCOPY = Integer.valueOf(7);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visCtrlIDPASTE = Integer.valueOf(8);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 9 (0x9)
   */
  public static final Integer visCtrlIDCLEAR = Integer.valueOf(9);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 10 (0xA)
   */
  public static final Integer visCtrlIDUNDO = Integer.valueOf(10);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 11 (0xB)
   */
  public static final Integer visCtrlIDREDO = Integer.valueOf(11);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 12 (0xC)
   */
  public static final Integer visCtrlIDREPEAT = Integer.valueOf(12);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 13 (0xD)
   */
  public static final Integer visCtrlIDPREVIOUSPAGE = Integer.valueOf(13);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 14 (0xE)
   */
  public static final Integer visCtrlIDNEXTPAGE = Integer.valueOf(14);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 15 (0xF)
   */
  public static final Integer visCtrlIDZOOMOUT = Integer.valueOf(15);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visCtrlIDZOOMIN = Integer.valueOf(16);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 17 (0x11)
   */
  public static final Integer visCtrlIDZOOM100 = Integer.valueOf(17);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 18 (0x12)
   */
  public static final Integer visCtrlIDFLIPHORZ = Integer.valueOf(18);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 19 (0x13)
   */
  public static final Integer visCtrlIDFLIPVERT = Integer.valueOf(19);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 20 (0x14)
   */
  public static final Integer visCtrlIDPOINTERTOOL = Integer.valueOf(20);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 21 (0x15)
   */
  public static final Integer visCtrlIDPENCILTOOL = Integer.valueOf(21);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 22 (0x16)
   */
  public static final Integer visCtrlIDLINETOOL = Integer.valueOf(22);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 23 (0x17)
   */
  public static final Integer visCtrlIDQTRARCTOOL = Integer.valueOf(23);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 24 (0x18)
   */
  public static final Integer visCtrlIDRECTTOOL = Integer.valueOf(24);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 25 (0x19)
   */
  public static final Integer visCtrlIDOVALTOOL = Integer.valueOf(25);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 26 (0x1A)
   */
  public static final Integer visCtrlIDSTAMPTOOL = Integer.valueOf(26);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 27 (0x1B)
   */
  public static final Integer visCtrlIDTEXTTOOL = Integer.valueOf(27);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 28 (0x1C)
   */
  public static final Integer visCtrlIDROTATETOOL = Integer.valueOf(28);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 29 (0x1D)
   */
  public static final Integer visCtrlIDCROPTOOL = Integer.valueOf(29);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 30 (0x1E)
   */
  public static final Integer visCtrlIDCONNECTIONPTTOOL = Integer.valueOf(30);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 31 (0x1F)
   */
  public static final Integer visCtrlIDSNAP = Integer.valueOf(31);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 32 (0x20)
   */
  public static final Integer visCtrlIDGLUE = Integer.valueOf(32);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 33 (0x21)
   */
  public static final Integer visCtrlIDRULER = Integer.valueOf(33);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 34 (0x22)
   */
  public static final Integer visCtrlIDGRID = Integer.valueOf(34);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 35 (0x23)
   */
  public static final Integer visCtrlIDGUIDE = Integer.valueOf(35);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 36 (0x24)
   */
  public static final Integer visCtrlIDCONNECT = Integer.valueOf(36);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 37 (0x25)
   */
  public static final Integer visCtrlIDROTATECLOCKWISE = Integer.valueOf(37);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 38 (0x26)
   */
  public static final Integer visCtrlIDROTATECOUNTER = Integer.valueOf(38);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 39 (0x27)
   */
  public static final Integer visCtrlIDNEWWINDOW = Integer.valueOf(39);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 40 (0x28)
   */
  public static final Integer visCtrlIDCORNERSTYLE = Integer.valueOf(40);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 41 (0x29)
   */
  public static final Integer visCtrlIDLINEEND = Integer.valueOf(41);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 42 (0x2A)
   */
  public static final Integer visCtrlIDSHADOWSTYLE = Integer.valueOf(42);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 43 (0x2B)
   */
  public static final Integer visCtrlIDFILLCOLOR = Integer.valueOf(43);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 44 (0x2C)
   */
  public static final Integer visCtrlIDLINECOLOR = Integer.valueOf(44);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 45 (0x2D)
   */
  public static final Integer visCtrlIDLINEWEIGHT = Integer.valueOf(45);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 46 (0x2E)
   */
  public static final Integer visCtrlIDLINEPATTERN = Integer.valueOf(46);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 47 (0x2F)
   */
  public static final Integer visCtrlIDFILLPATTERN = Integer.valueOf(47);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 48 (0x30)
   */
  public static final Integer visCtrlIDPOINTSIZEDOWN = Integer.valueOf(48);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 49 (0x31)
   */
  public static final Integer visCtrlIDPOINTSIZEUP = Integer.valueOf(49);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 50 (0x32)
   */
  public static final Integer visCtrlIDBOLD = Integer.valueOf(50);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 51 (0x33)
   */
  public static final Integer visCtrlIDITALIC = Integer.valueOf(51);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 52 (0x34)
   */
  public static final Integer visCtrlIDULINE = Integer.valueOf(52);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 53 (0x35)
   */
  public static final Integer visCtrlIDSUPERSCRIPT = Integer.valueOf(53);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 54 (0x36)
   */
  public static final Integer visCtrlIDSUBSCRIPT = Integer.valueOf(54);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 55 (0x37)
   */
  public static final Integer visCtrlIDTEXTCOLOR = Integer.valueOf(55);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 56 (0x38)
   */
  public static final Integer visCtrlIDTEXTLEFT = Integer.valueOf(56);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 57 (0x39)
   */
  public static final Integer visCtrlIDTEXTCENTER = Integer.valueOf(57);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 58 (0x3A)
   */
  public static final Integer visCtrlIDTEXTRIGHT = Integer.valueOf(58);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 59 (0x3B)
   */
  public static final Integer visCtrlIDTEXTJUSTIFY = Integer.valueOf(59);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 60 (0x3C)
   */
  public static final Integer visCtrlIDTEXTTOP = Integer.valueOf(60);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 61 (0x3D)
   */
  public static final Integer visCtrlIDTEXTMIDDLE = Integer.valueOf(61);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 62 (0x3E)
   */
  public static final Integer visCtrlIDTEXTBOTTOM = Integer.valueOf(62);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 63 (0x3F)
   */
  public static final Integer visCtrlIDALIGN = Integer.valueOf(63);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 64 (0x40)
   */
  public static final Integer visCtrlIDALIGNLEFT = Integer.valueOf(64);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 65 (0x41)
   */
  public static final Integer visCtrlIDALIGNCENTER = Integer.valueOf(65);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 66 (0x42)
   */
  public static final Integer visCtrlIDALIGNRIGHT = Integer.valueOf(66);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 67 (0x43)
   */
  public static final Integer visCtrlIDALIGNTOP = Integer.valueOf(67);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 68 (0x44)
   */
  public static final Integer visCtrlIDALIGNMIDDLE = Integer.valueOf(68);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 69 (0x45)
   */
  public static final Integer visCtrlIDALIGNBOTTOM = Integer.valueOf(69);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 70 (0x46)
   */
  public static final Integer visCtrlIDDISTRIBUTE = Integer.valueOf(70);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 71 (0x47)
   */
  public static final Integer visCtrlIDDHORZ_EQSPACE = Integer.valueOf(71);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 72 (0x48)
   */
  public static final Integer visCtrlIDDHORZ_CENTER = Integer.valueOf(72);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 73 (0x49)
   */
  public static final Integer visCtrlIDDVERT_EQSPACE = Integer.valueOf(73);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 74 (0x4A)
   */
  public static final Integer visCtrlIDDVERT_MIDDLE = Integer.valueOf(74);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 75 (0x4B)
   */
  public static final Integer visCtrlIDCONNECTSHAPES = Integer.valueOf(75);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 76 (0x4C)
   */
  public static final Integer visCtrlIDFIRSTPAGE = Integer.valueOf(76);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 77 (0x4D)
   */
  public static final Integer visCtrlIDLASTPAGE = Integer.valueOf(77);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 78 (0x4E)
   */
  public static final Integer visCtrlIDPAGEBREAKS = Integer.valueOf(78);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 80 (0x50)
   */
  public static final Integer visCtrlIDICONNAME = Integer.valueOf(80);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 81 (0x51)
   */
  public static final Integer visCtrlIDICONONLY = Integer.valueOf(81);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 82 (0x52)
   */
  public static final Integer visCtrlIDNAMEONLY = Integer.valueOf(82);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 83 (0x53)
   */
  public static final Integer visCtrlIDARRANGEICONS = Integer.valueOf(83);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 84 (0x54)
   */
  public static final Integer visCtrlIDCANCELFORMULA = Integer.valueOf(84);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 85 (0x55)
   */
  public static final Integer visCtrlIDACCEPTFORMULA = Integer.valueOf(85);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 86 (0x56)
   */
  public static final Integer visCtrlIDICONPENCIL = Integer.valueOf(86);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 87 (0x57)
   */
  public static final Integer visCtrlIDICONBUCKET = Integer.valueOf(87);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 88 (0x58)
   */
  public static final Integer visCtrlIDICONLASSO = Integer.valueOf(88);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 89 (0x59)
   */
  public static final Integer visCtrlIDICONSELNET = Integer.valueOf(89);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 90 (0x5A)
   */
  public static final Integer visCtrlIDBRINGFRONT = Integer.valueOf(90);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 91 (0x5B)
   */
  public static final Integer visCtrlIDSENDBACK = Integer.valueOf(91);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 92 (0x5C)
   */
  public static final Integer visCtrlIDGROUP = Integer.valueOf(92);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 93 (0x5D)
   */
  public static final Integer visCtrlIDUNGROUP = Integer.valueOf(93);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 94 (0x5E)
   */
  public static final Integer visCtrlIDCASCADE = Integer.valueOf(94);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 95 (0x5F)
   */
  public static final Integer visCtrlIDTILE = Integer.valueOf(95);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 96 (0x60)
   */
  public static final Integer visCtrlIDCONNECTORTOOL = Integer.valueOf(96);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 97 (0x61)
   */
  public static final Integer visCtrlIDTEXTBLOCKTOOL = Integer.valueOf(97);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 98 (0x62)
   */
  public static final Integer visCtrlIDWHOLEPAGE = Integer.valueOf(98);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 99 (0x63)
   */
  public static final Integer visCtrlIDSINGLETILE = Integer.valueOf(99);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 190 (0xBE)
   */
  public static final Integer visCtrlIDFORMULA = Integer.valueOf(190);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 191 (0xBF)
   */
  public static final Integer visCtrlIDSPACER = Integer.valueOf(191);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 200 (0xC8)
   */
  public static final Integer visCtrlIDALLSTYLESCOMBO = Integer.valueOf(200);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 201 (0xC9)
   */
  public static final Integer visCtrlIDTEXTSTYLECOMBO = Integer.valueOf(201);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 202 (0xCA)
   */
  public static final Integer visCtrlIDLINESTYLECOMBO = Integer.valueOf(202);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 203 (0xCB)
   */
  public static final Integer visCtrlIDFILLSTYLECOMBO = Integer.valueOf(203);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 204 (0xCC)
   */
  public static final Integer visCtrlIDZOOMCOMBO = Integer.valueOf(204);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 205 (0xCD)
   */
  public static final Integer visCtrlIDFONTCOMBO = Integer.valueOf(205);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 206 (0xCE)
   */
  public static final Integer visCtrlIDPOINTSIZECOMBO = Integer.valueOf(206);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 220 (0xDC)
   */
  public static final Integer visCtrlIDALLSTYLESLIST = Integer.valueOf(220);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 221 (0xDD)
   */
  public static final Integer visCtrlIDTEXTSTYLELIST = Integer.valueOf(221);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 222 (0xDE)
   */
  public static final Integer visCtrlIDLINESTYLELIST = Integer.valueOf(222);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 223 (0xDF)
   */
  public static final Integer visCtrlIDFILLSTYLELIST = Integer.valueOf(223);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 224 (0xE0)
   */
  public static final Integer visCtrlIDZOOMLIST = Integer.valueOf(224);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 225 (0xE1)
   */
  public static final Integer visCtrlIDFONTLIST = Integer.valueOf(225);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 226 (0xE2)
   */
  public static final Integer visCtrlIDPOINTSIZELIST = Integer.valueOf(226);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 227 (0xE3)
   */
  public static final Integer visCtrlIDGOTOPAGELIST = Integer.valueOf(227);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 240 (0xF0)
   */
  public static final Integer visCtrlIDCLOSE = Integer.valueOf(240);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 300 (0x12C)
   */
  public static final Integer visCtrlIDLEFTCOLORBOX = Integer.valueOf(300);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 301 (0x12D)
   */
  public static final Integer visCtrlIDRIGHTCOLORBOX = Integer.valueOf(301);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 302 (0x12E)
   */
  public static final Integer visCtrlIDCOLOR1 = Integer.valueOf(302);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 303 (0x12F)
   */
  public static final Integer visCtrlIDCOLOR2 = Integer.valueOf(303);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 304 (0x130)
   */
  public static final Integer visCtrlIDCOLOR3 = Integer.valueOf(304);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 305 (0x131)
   */
  public static final Integer visCtrlIDCOLOR4 = Integer.valueOf(305);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 306 (0x132)
   */
  public static final Integer visCtrlIDCOLOR5 = Integer.valueOf(306);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 307 (0x133)
   */
  public static final Integer visCtrlIDCOLOR6 = Integer.valueOf(307);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 308 (0x134)
   */
  public static final Integer visCtrlIDCOLOR7 = Integer.valueOf(308);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 309 (0x135)
   */
  public static final Integer visCtrlIDCOLOR8 = Integer.valueOf(309);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 310 (0x136)
   */
  public static final Integer visCtrlIDCOLOR9 = Integer.valueOf(310);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 311 (0x137)
   */
  public static final Integer visCtrlIDCOLOR10 = Integer.valueOf(311);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 312 (0x138)
   */
  public static final Integer visCtrlIDCOLOR11 = Integer.valueOf(312);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 313 (0x139)
   */
  public static final Integer visCtrlIDCOLOR12 = Integer.valueOf(313);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 314 (0x13A)
   */
  public static final Integer visCtrlIDCOLOR13 = Integer.valueOf(314);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 315 (0x13B)
   */
  public static final Integer visCtrlIDCOLOR14 = Integer.valueOf(315);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 316 (0x13C)
   */
  public static final Integer visCtrlIDCOLOR15 = Integer.valueOf(316);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 317 (0x13D)
   */
  public static final Integer visCtrlIDCOLOR16 = Integer.valueOf(317);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 318 (0x13E)
   */
  public static final Integer visCtrlIDTRANSPARENT = Integer.valueOf(318);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 400 (0x190)
   */
  public static final Integer visCtrlIDALLSTYLESLABEL = Integer.valueOf(400);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 401 (0x191)
   */
  public static final Integer visCtrlIDTEXTSTYLELABEL = Integer.valueOf(401);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 402 (0x192)
   */
  public static final Integer visCtrlIDLINESTYLELABEL = Integer.valueOf(402);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 403 (0x193)
   */
  public static final Integer visCtrlIDFILLSTYLELABEL = Integer.valueOf(403);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 404 (0x194)
   */
  public static final Integer visCtrlIDZOOMLABEL = Integer.valueOf(404);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 405 (0x195)
   */
  public static final Integer visCtrlIDFONTLABEL = Integer.valueOf(405);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 406 (0x196)
   */
  public static final Integer visCtrlIDPOINTSIZELABEL = Integer.valueOf(406);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 407 (0x197)
   */
  public static final Integer visCtrlIDLEFTCOLORLABEL = Integer.valueOf(407);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 408 (0x198)
   */
  public static final Integer visCtrlIDRIGHTCOLORLABEL = Integer.valueOf(408);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 409 (0x199)
   */
  public static final Integer visCtrlIDSTATUSLABEL = Integer.valueOf(409);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 410 (0x19A)
   */
  public static final Integer visCtrlIDPREVIEWLABEL = Integer.valueOf(410);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 500 (0x1F4)
   */
  public static final Integer visCtrlIDSTATUSREADOUT = Integer.valueOf(500);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 501 (0x1F5)
   */
  public static final Integer visCtrlIDSTATUSMSG_1 = Integer.valueOf(501);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 502 (0x1F6)
   */
  public static final Integer visCtrlIDSTATUSMSG_2 = Integer.valueOf(502);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 503 (0x1F7)
   */
  public static final Integer visCtrlIDSTATUSMSG_3 = Integer.valueOf(503);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 504 (0x1F8)
   */
  public static final Integer visCtrlIDSTATUSMSG_4 = Integer.valueOf(504);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 505 (0x1F9)
   */
  public static final Integer visCtrlIDSTATUSMSG_5 = Integer.valueOf(505);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 506 (0x1FA)
   */
  public static final Integer visCtrlIDSTATUSMSG_6 = Integer.valueOf(506);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 507 (0x1FB)
   */
  public static final Integer visCtrlIDSTATUSMSG_7 = Integer.valueOf(507);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 508 (0x1FC)
   */
  public static final Integer visCtrlIDSTATUSMSG_8 = Integer.valueOf(508);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 509 (0x1FD)
   */
  public static final Integer visCtrlIDSTATUSMSG_9 = Integer.valueOf(509);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 79 (0x4F)
   */
  public static final Integer visCtrlIDSPLINETOOL = Integer.valueOf(79);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 100 (0x64)
   */
  public static final Integer visCtrlIDSPELLING = Integer.valueOf(100);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 101 (0x65)
   */
  public static final Integer visCtrlIDFORMATPAINTER = Integer.valueOf(101);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 102 (0x66)
   */
  public static final Integer visCtrlIDHELPMODE = Integer.valueOf(102);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 103 (0x67)
   */
  public static final Integer visCtrlIDLAYERPROPERTIES = Integer.valueOf(103);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 104 (0x68)
   */
  public static final Integer visCtrlIDLAYOUTSHAPES = Integer.valueOf(104);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 105 (0x69)
   */
  public static final Integer visCtrlIDINSERTHYPERLINK = Integer.valueOf(105);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 106 (0x6A)
   */
  public static final Integer visCtrlIDSEARCHTHEWEB = Integer.valueOf(106);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 107 (0x6B)
   */
  public static final Integer visCtrlIDGOBACK = Integer.valueOf(107);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 108 (0x6C)
   */
  public static final Integer visCtrlIDGOFORWARD = Integer.valueOf(108);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 109 (0x6D)
   */
  public static final Integer visCtrlIDWEBTOOLBAR = Integer.valueOf(109);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 110 (0x6E)
   */
  public static final Integer visCtrlIDSHAPEEXPL = Integer.valueOf(110);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 111 (0x6F)
   */
  public static final Integer visCtrlIDCUSTPROP = Integer.valueOf(111);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 112 (0x70)
   */
  public static final Integer visCtrlIDROTATETEXT = Integer.valueOf(112);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 113 (0x71)
   */
  public static final Integer visCtrlIDBULLETS = Integer.valueOf(113);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 114 (0x72)
   */
  public static final Integer visCtrlIDDECRINDENT = Integer.valueOf(114);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 115 (0x73)
   */
  public static final Integer visCtrlIDINCRINDENT = Integer.valueOf(115);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 116 (0x74)
   */
  public static final Integer visCtrlIDDECRPARA = Integer.valueOf(116);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 117 (0x75)
   */
  public static final Integer visCtrlIDINCRPARA = Integer.valueOf(117);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 118 (0x76)
   */
  public static final Integer visCtrlIDINSERTCONTROL = Integer.valueOf(118);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 119 (0x77)
   */
  public static final Integer visCtrlIDDESIGNMODE = Integer.valueOf(119);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 120 (0x78)
   */
  public static final Integer visCtrlIDSHAPESHEET = Integer.valueOf(120);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 247 (0xF7)
   */
  public static final Integer visCtrlIDSHAPELAYER = Integer.valueOf(247);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 207 (0xCF)
   */
  public static final Integer visCtrlIDGOTOPAGE = Integer.valueOf(207);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 241 (0xF1)
   */
  public static final Integer visCtrlIDLINECOLORS = Integer.valueOf(241);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 242 (0xF2)
   */
  public static final Integer visCtrlIDLINEWEIGHTS = Integer.valueOf(242);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 243 (0xF3)
   */
  public static final Integer visCtrlIDLINEPATTERNS = Integer.valueOf(243);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 244 (0xF4)
   */
  public static final Integer visCtrlIDFILLCOLORS = Integer.valueOf(244);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 245 (0xF5)
   */
  public static final Integer visCtrlIDFILLPATTERNS = Integer.valueOf(245);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 246 (0xF6)
   */
  public static final Integer visCtrlIDTEXTCOLORS = Integer.valueOf(246);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 121 (0x79)
   */
  public static final Integer visCtrlIDMACROS = Integer.valueOf(121);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 122 (0x7A)
   */
  public static final Integer visCtrlIDVBEDITOR = Integer.valueOf(122);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 208 (0xD0)
   */
  public static final Integer visCtrlIDSHAPELAYERCOMBO = Integer.valueOf(208);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 228 (0xE4)
   */
  public static final Integer visCtrlIDSHAPELAYERLIST = Integer.valueOf(228);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 260 (0x104)
   */
  public static final Integer visCtrlIDALIGNSHAPES = Integer.valueOf(260);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 261 (0x105)
   */
  public static final Integer visCtrlIDDISTRIBUTESHAPES = Integer.valueOf(261);

  /**
   * Obsolete as of Visio 2003.<p>
   * Value is 510 (0x1FE)
   */
  public static final Integer visCtrlIDMSG_PAGES = Integer.valueOf(510);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visCtrlIDNEW", visCtrlIDNEW);
    v.put("visCtrlIDOPEN", visCtrlIDOPEN);
    v.put("visCtrlIDOPENSTEN", visCtrlIDOPENSTEN);
    v.put("visCtrlIDSAVE", visCtrlIDSAVE);
    v.put("visCtrlIDPRINT", visCtrlIDPRINT);
    v.put("visCtrlIDPREVIEW", visCtrlIDPREVIEW);
    v.put("visCtrlIDCUT", visCtrlIDCUT);
    v.put("visCtrlIDCOPY", visCtrlIDCOPY);
    v.put("visCtrlIDPASTE", visCtrlIDPASTE);
    v.put("visCtrlIDCLEAR", visCtrlIDCLEAR);
    v.put("visCtrlIDUNDO", visCtrlIDUNDO);
    v.put("visCtrlIDREDO", visCtrlIDREDO);
    v.put("visCtrlIDREPEAT", visCtrlIDREPEAT);
    v.put("visCtrlIDPREVIOUSPAGE", visCtrlIDPREVIOUSPAGE);
    v.put("visCtrlIDNEXTPAGE", visCtrlIDNEXTPAGE);
    v.put("visCtrlIDZOOMOUT", visCtrlIDZOOMOUT);
    v.put("visCtrlIDZOOMIN", visCtrlIDZOOMIN);
    v.put("visCtrlIDZOOM100", visCtrlIDZOOM100);
    v.put("visCtrlIDFLIPHORZ", visCtrlIDFLIPHORZ);
    v.put("visCtrlIDFLIPVERT", visCtrlIDFLIPVERT);
    v.put("visCtrlIDPOINTERTOOL", visCtrlIDPOINTERTOOL);
    v.put("visCtrlIDPENCILTOOL", visCtrlIDPENCILTOOL);
    v.put("visCtrlIDLINETOOL", visCtrlIDLINETOOL);
    v.put("visCtrlIDQTRARCTOOL", visCtrlIDQTRARCTOOL);
    v.put("visCtrlIDRECTTOOL", visCtrlIDRECTTOOL);
    v.put("visCtrlIDOVALTOOL", visCtrlIDOVALTOOL);
    v.put("visCtrlIDSTAMPTOOL", visCtrlIDSTAMPTOOL);
    v.put("visCtrlIDTEXTTOOL", visCtrlIDTEXTTOOL);
    v.put("visCtrlIDROTATETOOL", visCtrlIDROTATETOOL);
    v.put("visCtrlIDCROPTOOL", visCtrlIDCROPTOOL);
    v.put("visCtrlIDCONNECTIONPTTOOL", visCtrlIDCONNECTIONPTTOOL);
    v.put("visCtrlIDSNAP", visCtrlIDSNAP);
    v.put("visCtrlIDGLUE", visCtrlIDGLUE);
    v.put("visCtrlIDRULER", visCtrlIDRULER);
    v.put("visCtrlIDGRID", visCtrlIDGRID);
    v.put("visCtrlIDGUIDE", visCtrlIDGUIDE);
    v.put("visCtrlIDCONNECT", visCtrlIDCONNECT);
    v.put("visCtrlIDROTATECLOCKWISE", visCtrlIDROTATECLOCKWISE);
    v.put("visCtrlIDROTATECOUNTER", visCtrlIDROTATECOUNTER);
    v.put("visCtrlIDNEWWINDOW", visCtrlIDNEWWINDOW);
    v.put("visCtrlIDCORNERSTYLE", visCtrlIDCORNERSTYLE);
    v.put("visCtrlIDLINEEND", visCtrlIDLINEEND);
    v.put("visCtrlIDSHADOWSTYLE", visCtrlIDSHADOWSTYLE);
    v.put("visCtrlIDFILLCOLOR", visCtrlIDFILLCOLOR);
    v.put("visCtrlIDLINECOLOR", visCtrlIDLINECOLOR);
    v.put("visCtrlIDLINEWEIGHT", visCtrlIDLINEWEIGHT);
    v.put("visCtrlIDLINEPATTERN", visCtrlIDLINEPATTERN);
    v.put("visCtrlIDFILLPATTERN", visCtrlIDFILLPATTERN);
    v.put("visCtrlIDPOINTSIZEDOWN", visCtrlIDPOINTSIZEDOWN);
    v.put("visCtrlIDPOINTSIZEUP", visCtrlIDPOINTSIZEUP);
    v.put("visCtrlIDBOLD", visCtrlIDBOLD);
    v.put("visCtrlIDITALIC", visCtrlIDITALIC);
    v.put("visCtrlIDULINE", visCtrlIDULINE);
    v.put("visCtrlIDSUPERSCRIPT", visCtrlIDSUPERSCRIPT);
    v.put("visCtrlIDSUBSCRIPT", visCtrlIDSUBSCRIPT);
    v.put("visCtrlIDTEXTCOLOR", visCtrlIDTEXTCOLOR);
    v.put("visCtrlIDTEXTLEFT", visCtrlIDTEXTLEFT);
    v.put("visCtrlIDTEXTCENTER", visCtrlIDTEXTCENTER);
    v.put("visCtrlIDTEXTRIGHT", visCtrlIDTEXTRIGHT);
    v.put("visCtrlIDTEXTJUSTIFY", visCtrlIDTEXTJUSTIFY);
    v.put("visCtrlIDTEXTTOP", visCtrlIDTEXTTOP);
    v.put("visCtrlIDTEXTMIDDLE", visCtrlIDTEXTMIDDLE);
    v.put("visCtrlIDTEXTBOTTOM", visCtrlIDTEXTBOTTOM);
    v.put("visCtrlIDALIGN", visCtrlIDALIGN);
    v.put("visCtrlIDALIGNLEFT", visCtrlIDALIGNLEFT);
    v.put("visCtrlIDALIGNCENTER", visCtrlIDALIGNCENTER);
    v.put("visCtrlIDALIGNRIGHT", visCtrlIDALIGNRIGHT);
    v.put("visCtrlIDALIGNTOP", visCtrlIDALIGNTOP);
    v.put("visCtrlIDALIGNMIDDLE", visCtrlIDALIGNMIDDLE);
    v.put("visCtrlIDALIGNBOTTOM", visCtrlIDALIGNBOTTOM);
    v.put("visCtrlIDDISTRIBUTE", visCtrlIDDISTRIBUTE);
    v.put("visCtrlIDDHORZ_EQSPACE", visCtrlIDDHORZ_EQSPACE);
    v.put("visCtrlIDDHORZ_CENTER", visCtrlIDDHORZ_CENTER);
    v.put("visCtrlIDDVERT_EQSPACE", visCtrlIDDVERT_EQSPACE);
    v.put("visCtrlIDDVERT_MIDDLE", visCtrlIDDVERT_MIDDLE);
    v.put("visCtrlIDCONNECTSHAPES", visCtrlIDCONNECTSHAPES);
    v.put("visCtrlIDFIRSTPAGE", visCtrlIDFIRSTPAGE);
    v.put("visCtrlIDLASTPAGE", visCtrlIDLASTPAGE);
    v.put("visCtrlIDPAGEBREAKS", visCtrlIDPAGEBREAKS);
    v.put("visCtrlIDICONNAME", visCtrlIDICONNAME);
    v.put("visCtrlIDICONONLY", visCtrlIDICONONLY);
    v.put("visCtrlIDNAMEONLY", visCtrlIDNAMEONLY);
    v.put("visCtrlIDARRANGEICONS", visCtrlIDARRANGEICONS);
    v.put("visCtrlIDCANCELFORMULA", visCtrlIDCANCELFORMULA);
    v.put("visCtrlIDACCEPTFORMULA", visCtrlIDACCEPTFORMULA);
    v.put("visCtrlIDICONPENCIL", visCtrlIDICONPENCIL);
    v.put("visCtrlIDICONBUCKET", visCtrlIDICONBUCKET);
    v.put("visCtrlIDICONLASSO", visCtrlIDICONLASSO);
    v.put("visCtrlIDICONSELNET", visCtrlIDICONSELNET);
    v.put("visCtrlIDBRINGFRONT", visCtrlIDBRINGFRONT);
    v.put("visCtrlIDSENDBACK", visCtrlIDSENDBACK);
    v.put("visCtrlIDGROUP", visCtrlIDGROUP);
    v.put("visCtrlIDUNGROUP", visCtrlIDUNGROUP);
    v.put("visCtrlIDCASCADE", visCtrlIDCASCADE);
    v.put("visCtrlIDTILE", visCtrlIDTILE);
    v.put("visCtrlIDCONNECTORTOOL", visCtrlIDCONNECTORTOOL);
    v.put("visCtrlIDTEXTBLOCKTOOL", visCtrlIDTEXTBLOCKTOOL);
    v.put("visCtrlIDWHOLEPAGE", visCtrlIDWHOLEPAGE);
    v.put("visCtrlIDSINGLETILE", visCtrlIDSINGLETILE);
    v.put("visCtrlIDFORMULA", visCtrlIDFORMULA);
    v.put("visCtrlIDSPACER", visCtrlIDSPACER);
    v.put("visCtrlIDALLSTYLESCOMBO", visCtrlIDALLSTYLESCOMBO);
    v.put("visCtrlIDTEXTSTYLECOMBO", visCtrlIDTEXTSTYLECOMBO);
    v.put("visCtrlIDLINESTYLECOMBO", visCtrlIDLINESTYLECOMBO);
    v.put("visCtrlIDFILLSTYLECOMBO", visCtrlIDFILLSTYLECOMBO);
    v.put("visCtrlIDZOOMCOMBO", visCtrlIDZOOMCOMBO);
    v.put("visCtrlIDFONTCOMBO", visCtrlIDFONTCOMBO);
    v.put("visCtrlIDPOINTSIZECOMBO", visCtrlIDPOINTSIZECOMBO);
    v.put("visCtrlIDALLSTYLESLIST", visCtrlIDALLSTYLESLIST);
    v.put("visCtrlIDTEXTSTYLELIST", visCtrlIDTEXTSTYLELIST);
    v.put("visCtrlIDLINESTYLELIST", visCtrlIDLINESTYLELIST);
    v.put("visCtrlIDFILLSTYLELIST", visCtrlIDFILLSTYLELIST);
    v.put("visCtrlIDZOOMLIST", visCtrlIDZOOMLIST);
    v.put("visCtrlIDFONTLIST", visCtrlIDFONTLIST);
    v.put("visCtrlIDPOINTSIZELIST", visCtrlIDPOINTSIZELIST);
    v.put("visCtrlIDGOTOPAGELIST", visCtrlIDGOTOPAGELIST);
    v.put("visCtrlIDCLOSE", visCtrlIDCLOSE);
    v.put("visCtrlIDLEFTCOLORBOX", visCtrlIDLEFTCOLORBOX);
    v.put("visCtrlIDRIGHTCOLORBOX", visCtrlIDRIGHTCOLORBOX);
    v.put("visCtrlIDCOLOR1", visCtrlIDCOLOR1);
    v.put("visCtrlIDCOLOR2", visCtrlIDCOLOR2);
    v.put("visCtrlIDCOLOR3", visCtrlIDCOLOR3);
    v.put("visCtrlIDCOLOR4", visCtrlIDCOLOR4);
    v.put("visCtrlIDCOLOR5", visCtrlIDCOLOR5);
    v.put("visCtrlIDCOLOR6", visCtrlIDCOLOR6);
    v.put("visCtrlIDCOLOR7", visCtrlIDCOLOR7);
    v.put("visCtrlIDCOLOR8", visCtrlIDCOLOR8);
    v.put("visCtrlIDCOLOR9", visCtrlIDCOLOR9);
    v.put("visCtrlIDCOLOR10", visCtrlIDCOLOR10);
    v.put("visCtrlIDCOLOR11", visCtrlIDCOLOR11);
    v.put("visCtrlIDCOLOR12", visCtrlIDCOLOR12);
    v.put("visCtrlIDCOLOR13", visCtrlIDCOLOR13);
    v.put("visCtrlIDCOLOR14", visCtrlIDCOLOR14);
    v.put("visCtrlIDCOLOR15", visCtrlIDCOLOR15);
    v.put("visCtrlIDCOLOR16", visCtrlIDCOLOR16);
    v.put("visCtrlIDTRANSPARENT", visCtrlIDTRANSPARENT);
    v.put("visCtrlIDALLSTYLESLABEL", visCtrlIDALLSTYLESLABEL);
    v.put("visCtrlIDTEXTSTYLELABEL", visCtrlIDTEXTSTYLELABEL);
    v.put("visCtrlIDLINESTYLELABEL", visCtrlIDLINESTYLELABEL);
    v.put("visCtrlIDFILLSTYLELABEL", visCtrlIDFILLSTYLELABEL);
    v.put("visCtrlIDZOOMLABEL", visCtrlIDZOOMLABEL);
    v.put("visCtrlIDFONTLABEL", visCtrlIDFONTLABEL);
    v.put("visCtrlIDPOINTSIZELABEL", visCtrlIDPOINTSIZELABEL);
    v.put("visCtrlIDLEFTCOLORLABEL", visCtrlIDLEFTCOLORLABEL);
    v.put("visCtrlIDRIGHTCOLORLABEL", visCtrlIDRIGHTCOLORLABEL);
    v.put("visCtrlIDSTATUSLABEL", visCtrlIDSTATUSLABEL);
    v.put("visCtrlIDPREVIEWLABEL", visCtrlIDPREVIEWLABEL);
    v.put("visCtrlIDSTATUSREADOUT", visCtrlIDSTATUSREADOUT);
    v.put("visCtrlIDSTATUSMSG_1", visCtrlIDSTATUSMSG_1);
    v.put("visCtrlIDSTATUSMSG_2", visCtrlIDSTATUSMSG_2);
    v.put("visCtrlIDSTATUSMSG_3", visCtrlIDSTATUSMSG_3);
    v.put("visCtrlIDSTATUSMSG_4", visCtrlIDSTATUSMSG_4);
    v.put("visCtrlIDSTATUSMSG_5", visCtrlIDSTATUSMSG_5);
    v.put("visCtrlIDSTATUSMSG_6", visCtrlIDSTATUSMSG_6);
    v.put("visCtrlIDSTATUSMSG_7", visCtrlIDSTATUSMSG_7);
    v.put("visCtrlIDSTATUSMSG_8", visCtrlIDSTATUSMSG_8);
    v.put("visCtrlIDSTATUSMSG_9", visCtrlIDSTATUSMSG_9);
    v.put("visCtrlIDSPLINETOOL", visCtrlIDSPLINETOOL);
    v.put("visCtrlIDSPELLING", visCtrlIDSPELLING);
    v.put("visCtrlIDFORMATPAINTER", visCtrlIDFORMATPAINTER);
    v.put("visCtrlIDHELPMODE", visCtrlIDHELPMODE);
    v.put("visCtrlIDLAYERPROPERTIES", visCtrlIDLAYERPROPERTIES);
    v.put("visCtrlIDLAYOUTSHAPES", visCtrlIDLAYOUTSHAPES);
    v.put("visCtrlIDINSERTHYPERLINK", visCtrlIDINSERTHYPERLINK);
    v.put("visCtrlIDSEARCHTHEWEB", visCtrlIDSEARCHTHEWEB);
    v.put("visCtrlIDGOBACK", visCtrlIDGOBACK);
    v.put("visCtrlIDGOFORWARD", visCtrlIDGOFORWARD);
    v.put("visCtrlIDWEBTOOLBAR", visCtrlIDWEBTOOLBAR);
    v.put("visCtrlIDSHAPEEXPL", visCtrlIDSHAPEEXPL);
    v.put("visCtrlIDCUSTPROP", visCtrlIDCUSTPROP);
    v.put("visCtrlIDROTATETEXT", visCtrlIDROTATETEXT);
    v.put("visCtrlIDBULLETS", visCtrlIDBULLETS);
    v.put("visCtrlIDDECRINDENT", visCtrlIDDECRINDENT);
    v.put("visCtrlIDINCRINDENT", visCtrlIDINCRINDENT);
    v.put("visCtrlIDDECRPARA", visCtrlIDDECRPARA);
    v.put("visCtrlIDINCRPARA", visCtrlIDINCRPARA);
    v.put("visCtrlIDINSERTCONTROL", visCtrlIDINSERTCONTROL);
    v.put("visCtrlIDDESIGNMODE", visCtrlIDDESIGNMODE);
    v.put("visCtrlIDSHAPESHEET", visCtrlIDSHAPESHEET);
    v.put("visCtrlIDSHAPELAYER", visCtrlIDSHAPELAYER);
    v.put("visCtrlIDGOTOPAGE", visCtrlIDGOTOPAGE);
    v.put("visCtrlIDLINECOLORS", visCtrlIDLINECOLORS);
    v.put("visCtrlIDLINEWEIGHTS", visCtrlIDLINEWEIGHTS);
    v.put("visCtrlIDLINEPATTERNS", visCtrlIDLINEPATTERNS);
    v.put("visCtrlIDFILLCOLORS", visCtrlIDFILLCOLORS);
    v.put("visCtrlIDFILLPATTERNS", visCtrlIDFILLPATTERNS);
    v.put("visCtrlIDTEXTCOLORS", visCtrlIDTEXTCOLORS);
    v.put("visCtrlIDMACROS", visCtrlIDMACROS);
    v.put("visCtrlIDVBEDITOR", visCtrlIDVBEDITOR);
    v.put("visCtrlIDSHAPELAYERCOMBO", visCtrlIDSHAPELAYERCOMBO);
    v.put("visCtrlIDSHAPELAYERLIST", visCtrlIDSHAPELAYERLIST);
    v.put("visCtrlIDALIGNSHAPES", visCtrlIDALIGNSHAPES);
    v.put("visCtrlIDDISTRIBUTESHAPES", visCtrlIDDISTRIBUTESHAPES);
    v.put("visCtrlIDMSG_PAGES", visCtrlIDMSG_PAGES);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
