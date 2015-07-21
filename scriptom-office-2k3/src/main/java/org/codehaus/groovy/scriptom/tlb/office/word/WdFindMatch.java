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
public final class WdFindMatch
{
  private WdFindMatch()
  {
  }

  /**
   * Value is 65551 (0x1000F)
   */
  public static final Integer wdMatchParagraphMark = Integer.valueOf(65551);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdMatchTabCharacter = Integer.valueOf(9);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdMatchCommentMark = Integer.valueOf(5);

  /**
   * Value is 65599 (0x1003F)
   */
  public static final Integer wdMatchAnyCharacter = Integer.valueOf(65599);

  /**
   * Value is 65567 (0x1001F)
   */
  public static final Integer wdMatchAnyDigit = Integer.valueOf(65567);

  /**
   * Value is 65583 (0x1002F)
   */
  public static final Integer wdMatchAnyLetter = Integer.valueOf(65583);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdMatchCaretCharacter = Integer.valueOf(11);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdMatchColumnBreak = Integer.valueOf(14);

  /**
   * Value is 8212 (0x2014)
   */
  public static final Integer wdMatchEmDash = Integer.valueOf(8212);

  /**
   * Value is 8211 (0x2013)
   */
  public static final Integer wdMatchEnDash = Integer.valueOf(8211);

  /**
   * Value is 65555 (0x10013)
   */
  public static final Integer wdMatchEndnoteMark = Integer.valueOf(65555);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdMatchField = Integer.valueOf(19);

  /**
   * Value is 65554 (0x10012)
   */
  public static final Integer wdMatchFootnoteMark = Integer.valueOf(65554);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wdMatchGraphic = Integer.valueOf(1);

  /**
   * Value is 65551 (0x1000F)
   */
  public static final Integer wdMatchManualLineBreak = Integer.valueOf(65551);

  /**
   * Value is 65564 (0x1001C)
   */
  public static final Integer wdMatchManualPageBreak = Integer.valueOf(65564);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer wdMatchNonbreakingHyphen = Integer.valueOf(30);

  /**
   * Value is 160 (0xA0)
   */
  public static final Integer wdMatchNonbreakingSpace = Integer.valueOf(160);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer wdMatchOptionalHyphen = Integer.valueOf(31);

  /**
   * Value is 65580 (0x1002C)
   */
  public static final Integer wdMatchSectionBreak = Integer.valueOf(65580);

  /**
   * Value is 65655 (0x10077)
   */
  public static final Integer wdMatchWhiteSpace = Integer.valueOf(65655);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdMatchParagraphMark", wdMatchParagraphMark);
    v.put("wdMatchTabCharacter", wdMatchTabCharacter);
    v.put("wdMatchCommentMark", wdMatchCommentMark);
    v.put("wdMatchAnyCharacter", wdMatchAnyCharacter);
    v.put("wdMatchAnyDigit", wdMatchAnyDigit);
    v.put("wdMatchAnyLetter", wdMatchAnyLetter);
    v.put("wdMatchCaretCharacter", wdMatchCaretCharacter);
    v.put("wdMatchColumnBreak", wdMatchColumnBreak);
    v.put("wdMatchEmDash", wdMatchEmDash);
    v.put("wdMatchEnDash", wdMatchEnDash);
    v.put("wdMatchEndnoteMark", wdMatchEndnoteMark);
    v.put("wdMatchField", wdMatchField);
    v.put("wdMatchFootnoteMark", wdMatchFootnoteMark);
    v.put("wdMatchGraphic", wdMatchGraphic);
    v.put("wdMatchManualLineBreak", wdMatchManualLineBreak);
    v.put("wdMatchManualPageBreak", wdMatchManualPageBreak);
    v.put("wdMatchNonbreakingHyphen", wdMatchNonbreakingHyphen);
    v.put("wdMatchNonbreakingSpace", wdMatchNonbreakingSpace);
    v.put("wdMatchOptionalHyphen", wdMatchOptionalHyphen);
    v.put("wdMatchSectionBreak", wdMatchSectionBreak);
    v.put("wdMatchWhiteSpace", wdMatchWhiteSpace);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
