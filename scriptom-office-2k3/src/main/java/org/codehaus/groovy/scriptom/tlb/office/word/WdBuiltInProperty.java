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
package org.codehaus.groovy.scriptom.tlb.office.word;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class WdBuiltInProperty
{
  private WdBuiltInProperty()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdPropertyTitle = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wdPropertySubject = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdPropertyAuthor = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdPropertyKeywords = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdPropertyComments = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdPropertyTemplate = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdPropertyLastAuthor = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdPropertyRevision = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdPropertyAppName = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdPropertyTimeLastPrinted = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdPropertyTimeCreated = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdPropertyTimeLastSaved = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdPropertyVBATotalEdit = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdPropertyPages = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wdPropertyWords = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdPropertyCharacters = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdPropertySecurity = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdPropertyCategory = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdPropertyFormat = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdPropertyManager = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wdPropertyCompany = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdPropertyBytes = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdPropertyLines = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdPropertyParas = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdPropertySlides = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wdPropertyNotes = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer wdPropertyHiddenSlides = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer wdPropertyMMClips = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer wdPropertyHyperlinkBase = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer wdPropertyCharsWSpaces = Integer.valueOf(30);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdPropertyTitle", wdPropertyTitle);
    v.put("wdPropertySubject", wdPropertySubject);
    v.put("wdPropertyAuthor", wdPropertyAuthor);
    v.put("wdPropertyKeywords", wdPropertyKeywords);
    v.put("wdPropertyComments", wdPropertyComments);
    v.put("wdPropertyTemplate", wdPropertyTemplate);
    v.put("wdPropertyLastAuthor", wdPropertyLastAuthor);
    v.put("wdPropertyRevision", wdPropertyRevision);
    v.put("wdPropertyAppName", wdPropertyAppName);
    v.put("wdPropertyTimeLastPrinted", wdPropertyTimeLastPrinted);
    v.put("wdPropertyTimeCreated", wdPropertyTimeCreated);
    v.put("wdPropertyTimeLastSaved", wdPropertyTimeLastSaved);
    v.put("wdPropertyVBATotalEdit", wdPropertyVBATotalEdit);
    v.put("wdPropertyPages", wdPropertyPages);
    v.put("wdPropertyWords", wdPropertyWords);
    v.put("wdPropertyCharacters", wdPropertyCharacters);
    v.put("wdPropertySecurity", wdPropertySecurity);
    v.put("wdPropertyCategory", wdPropertyCategory);
    v.put("wdPropertyFormat", wdPropertyFormat);
    v.put("wdPropertyManager", wdPropertyManager);
    v.put("wdPropertyCompany", wdPropertyCompany);
    v.put("wdPropertyBytes", wdPropertyBytes);
    v.put("wdPropertyLines", wdPropertyLines);
    v.put("wdPropertyParas", wdPropertyParas);
    v.put("wdPropertySlides", wdPropertySlides);
    v.put("wdPropertyNotes", wdPropertyNotes);
    v.put("wdPropertyHiddenSlides", wdPropertyHiddenSlides);
    v.put("wdPropertyMMClips", wdPropertyMMClips);
    v.put("wdPropertyHyperlinkBase", wdPropertyHyperlinkBase);
    v.put("wdPropertyCharsWSpaces", wdPropertyCharsWSpaces);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
