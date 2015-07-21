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
public final class WdSaveFormat
{
  private WdSaveFormat()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdFormatDocument = Integer.valueOf(0);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wdFormatDocument97 = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdFormatTemplate = Integer.valueOf(1);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdFormatTemplate97 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdFormatText = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdFormatTextLineBreaks = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdFormatDOSText = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdFormatDOSTextLineBreaks = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdFormatRTF = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdFormatUnicodeText = Integer.valueOf(7);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdFormatEncodedText = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdFormatHTML = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdFormatWebArchive = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdFormatFilteredHTML = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdFormatXML = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdFormatXMLDocument = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdFormatXMLDocumentMacroEnabled = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdFormatXMLTemplate = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wdFormatXMLTemplateMacroEnabled = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdFormatDocumentDefault = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdFormatPDF = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdFormatXPS = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdFormatFlatXML = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdFormatFlatXMLMacroEnabled = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wdFormatFlatXMLTemplate = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdFormatFlatXMLTemplateMacroEnabled = Integer.valueOf(22);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdFormatDocument", wdFormatDocument);
    v.put("wdFormatDocument97", wdFormatDocument97);
    v.put("wdFormatTemplate", wdFormatTemplate);
    v.put("wdFormatTemplate97", wdFormatTemplate97);
    v.put("wdFormatText", wdFormatText);
    v.put("wdFormatTextLineBreaks", wdFormatTextLineBreaks);
    v.put("wdFormatDOSText", wdFormatDOSText);
    v.put("wdFormatDOSTextLineBreaks", wdFormatDOSTextLineBreaks);
    v.put("wdFormatRTF", wdFormatRTF);
    v.put("wdFormatUnicodeText", wdFormatUnicodeText);
    v.put("wdFormatEncodedText", wdFormatEncodedText);
    v.put("wdFormatHTML", wdFormatHTML);
    v.put("wdFormatWebArchive", wdFormatWebArchive);
    v.put("wdFormatFilteredHTML", wdFormatFilteredHTML);
    v.put("wdFormatXML", wdFormatXML);
    v.put("wdFormatXMLDocument", wdFormatXMLDocument);
    v.put("wdFormatXMLDocumentMacroEnabled", wdFormatXMLDocumentMacroEnabled);
    v.put("wdFormatXMLTemplate", wdFormatXMLTemplate);
    v.put("wdFormatXMLTemplateMacroEnabled", wdFormatXMLTemplateMacroEnabled);
    v.put("wdFormatDocumentDefault", wdFormatDocumentDefault);
    v.put("wdFormatPDF", wdFormatPDF);
    v.put("wdFormatXPS", wdFormatXPS);
    v.put("wdFormatFlatXML", wdFormatFlatXML);
    v.put("wdFormatFlatXMLMacroEnabled", wdFormatFlatXMLMacroEnabled);
    v.put("wdFormatFlatXMLTemplate", wdFormatFlatXMLTemplate);
    v.put("wdFormatFlatXMLTemplateMacroEnabled", wdFormatFlatXMLTemplateMacroEnabled);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
