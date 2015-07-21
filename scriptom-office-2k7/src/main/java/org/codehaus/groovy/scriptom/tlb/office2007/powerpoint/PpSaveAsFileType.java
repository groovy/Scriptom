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
package org.codehaus.groovy.scriptom.tlb.office2007.powerpoint;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class PpSaveAsFileType
{
  private PpSaveAsFileType()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer ppSaveAsPresentation = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer ppSaveAsPowerPoint7 = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer ppSaveAsPowerPoint4 = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer ppSaveAsPowerPoint3 = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer ppSaveAsTemplate = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer ppSaveAsRTF = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer ppSaveAsShow = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer ppSaveAsAddIn = Integer.valueOf(8);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer ppSaveAsPowerPoint4FarEast = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer ppSaveAsDefault = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer ppSaveAsHTML = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer ppSaveAsHTMLv3 = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer ppSaveAsHTMLDual = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer ppSaveAsMetaFile = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer ppSaveAsGIF = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer ppSaveAsJPG = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer ppSaveAsPNG = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer ppSaveAsBMP = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer ppSaveAsWebArchive = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer ppSaveAsTIF = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer ppSaveAsPresForReview = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer ppSaveAsEMF = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer ppSaveAsOpenXMLPresentation = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer ppSaveAsOpenXMLPresentationMacroEnabled = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer ppSaveAsOpenXMLTemplate = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer ppSaveAsOpenXMLTemplateMacroEnabled = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer ppSaveAsOpenXMLShow = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer ppSaveAsOpenXMLShowMacroEnabled = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer ppSaveAsOpenXMLAddin = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer ppSaveAsOpenXMLTheme = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer ppSaveAsPDF = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer ppSaveAsXPS = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer ppSaveAsXMLPresentation = Integer.valueOf(34);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("ppSaveAsPresentation", ppSaveAsPresentation);
    v.put("ppSaveAsPowerPoint7", ppSaveAsPowerPoint7);
    v.put("ppSaveAsPowerPoint4", ppSaveAsPowerPoint4);
    v.put("ppSaveAsPowerPoint3", ppSaveAsPowerPoint3);
    v.put("ppSaveAsTemplate", ppSaveAsTemplate);
    v.put("ppSaveAsRTF", ppSaveAsRTF);
    v.put("ppSaveAsShow", ppSaveAsShow);
    v.put("ppSaveAsAddIn", ppSaveAsAddIn);
    v.put("ppSaveAsPowerPoint4FarEast", ppSaveAsPowerPoint4FarEast);
    v.put("ppSaveAsDefault", ppSaveAsDefault);
    v.put("ppSaveAsHTML", ppSaveAsHTML);
    v.put("ppSaveAsHTMLv3", ppSaveAsHTMLv3);
    v.put("ppSaveAsHTMLDual", ppSaveAsHTMLDual);
    v.put("ppSaveAsMetaFile", ppSaveAsMetaFile);
    v.put("ppSaveAsGIF", ppSaveAsGIF);
    v.put("ppSaveAsJPG", ppSaveAsJPG);
    v.put("ppSaveAsPNG", ppSaveAsPNG);
    v.put("ppSaveAsBMP", ppSaveAsBMP);
    v.put("ppSaveAsWebArchive", ppSaveAsWebArchive);
    v.put("ppSaveAsTIF", ppSaveAsTIF);
    v.put("ppSaveAsPresForReview", ppSaveAsPresForReview);
    v.put("ppSaveAsEMF", ppSaveAsEMF);
    v.put("ppSaveAsOpenXMLPresentation", ppSaveAsOpenXMLPresentation);
    v.put("ppSaveAsOpenXMLPresentationMacroEnabled", ppSaveAsOpenXMLPresentationMacroEnabled);
    v.put("ppSaveAsOpenXMLTemplate", ppSaveAsOpenXMLTemplate);
    v.put("ppSaveAsOpenXMLTemplateMacroEnabled", ppSaveAsOpenXMLTemplateMacroEnabled);
    v.put("ppSaveAsOpenXMLShow", ppSaveAsOpenXMLShow);
    v.put("ppSaveAsOpenXMLShowMacroEnabled", ppSaveAsOpenXMLShowMacroEnabled);
    v.put("ppSaveAsOpenXMLAddin", ppSaveAsOpenXMLAddin);
    v.put("ppSaveAsOpenXMLTheme", ppSaveAsOpenXMLTheme);
    v.put("ppSaveAsPDF", ppSaveAsPDF);
    v.put("ppSaveAsXPS", ppSaveAsXPS);
    v.put("ppSaveAsXMLPresentation", ppSaveAsXMLPresentation);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
