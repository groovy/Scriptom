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
public final class WdFieldType
{
  private WdFieldType()
  {
  }

  /**
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer wdFieldEmpty = Integer.valueOf(-1);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wdFieldRef = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wdFieldIndexEntry = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wdFieldFootnoteRef = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wdFieldSet = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wdFieldIf = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wdFieldIndex = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wdFieldTOCEntry = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wdFieldStyleRef = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wdFieldRefDoc = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wdFieldSequence = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wdFieldTOC = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wdFieldInfo = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wdFieldTitle = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wdFieldSubject = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wdFieldAuthor = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wdFieldKeyWord = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wdFieldComments = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wdFieldLastSavedBy = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wdFieldCreateDate = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wdFieldSaveDate = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wdFieldPrintDate = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wdFieldRevisionNum = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wdFieldEditTime = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wdFieldNumPages = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer wdFieldNumWords = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer wdFieldNumChars = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer wdFieldFileName = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer wdFieldTemplate = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer wdFieldDate = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer wdFieldTime = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer wdFieldPage = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer wdFieldExpression = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer wdFieldQuote = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer wdFieldInclude = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer wdFieldPageRef = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer wdFieldAsk = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer wdFieldFillIn = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer wdFieldData = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer wdFieldNext = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer wdFieldNextIf = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer wdFieldSkipIf = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer wdFieldMergeRec = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer wdFieldDDE = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer wdFieldDDEAuto = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer wdFieldGlossary = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer wdFieldPrint = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer wdFieldFormula = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer wdFieldGoToButton = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer wdFieldMacroButton = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer wdFieldAutoNumOutline = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer wdFieldAutoNumLegal = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer wdFieldAutoNum = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer wdFieldImport = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer wdFieldLink = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer wdFieldSymbol = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer wdFieldEmbed = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer wdFieldMergeField = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer wdFieldUserName = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer wdFieldUserInitials = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer wdFieldUserAddress = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer wdFieldBarCode = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer wdFieldDocVariable = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer wdFieldSection = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer wdFieldSectionPages = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer wdFieldIncludePicture = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer wdFieldIncludeText = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer wdFieldFileSize = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer wdFieldFormTextInput = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer wdFieldFormCheckBox = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer wdFieldNoteRef = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer wdFieldTOA = Integer.valueOf(73);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer wdFieldTOAEntry = Integer.valueOf(74);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer wdFieldMergeSeq = Integer.valueOf(75);

  /**
   * Value is 77 (0x4D)
   */
  public static final Integer wdFieldPrivate = Integer.valueOf(77);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer wdFieldDatabase = Integer.valueOf(78);

  /**
   * Value is 79 (0x4F)
   */
  public static final Integer wdFieldAutoText = Integer.valueOf(79);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer wdFieldCompare = Integer.valueOf(80);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer wdFieldAddin = Integer.valueOf(81);

  /**
   * Value is 82 (0x52)
   */
  public static final Integer wdFieldSubscriber = Integer.valueOf(82);

  /**
   * Value is 83 (0x53)
   */
  public static final Integer wdFieldFormDropDown = Integer.valueOf(83);

  /**
   * Value is 84 (0x54)
   */
  public static final Integer wdFieldAdvance = Integer.valueOf(84);

  /**
   * Value is 85 (0x55)
   */
  public static final Integer wdFieldDocProperty = Integer.valueOf(85);

  /**
   * Value is 87 (0x57)
   */
  public static final Integer wdFieldOCX = Integer.valueOf(87);

  /**
   * Value is 88 (0x58)
   */
  public static final Integer wdFieldHyperlink = Integer.valueOf(88);

  /**
   * Value is 89 (0x59)
   */
  public static final Integer wdFieldAutoTextList = Integer.valueOf(89);

  /**
   * Value is 90 (0x5A)
   */
  public static final Integer wdFieldListNum = Integer.valueOf(90);

  /**
   * Value is 91 (0x5B)
   */
  public static final Integer wdFieldHTMLActiveX = Integer.valueOf(91);

  /**
   * Value is 92 (0x5C)
   */
  public static final Integer wdFieldBidiOutline = Integer.valueOf(92);

  /**
   * Value is 93 (0x5D)
   */
  public static final Integer wdFieldAddressBlock = Integer.valueOf(93);

  /**
   * Value is 94 (0x5E)
   */
  public static final Integer wdFieldGreetingLine = Integer.valueOf(94);

  /**
   * Value is 95 (0x5F)
   */
  public static final Integer wdFieldShape = Integer.valueOf(95);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("wdFieldEmpty", wdFieldEmpty);
    v.put("wdFieldRef", wdFieldRef);
    v.put("wdFieldIndexEntry", wdFieldIndexEntry);
    v.put("wdFieldFootnoteRef", wdFieldFootnoteRef);
    v.put("wdFieldSet", wdFieldSet);
    v.put("wdFieldIf", wdFieldIf);
    v.put("wdFieldIndex", wdFieldIndex);
    v.put("wdFieldTOCEntry", wdFieldTOCEntry);
    v.put("wdFieldStyleRef", wdFieldStyleRef);
    v.put("wdFieldRefDoc", wdFieldRefDoc);
    v.put("wdFieldSequence", wdFieldSequence);
    v.put("wdFieldTOC", wdFieldTOC);
    v.put("wdFieldInfo", wdFieldInfo);
    v.put("wdFieldTitle", wdFieldTitle);
    v.put("wdFieldSubject", wdFieldSubject);
    v.put("wdFieldAuthor", wdFieldAuthor);
    v.put("wdFieldKeyWord", wdFieldKeyWord);
    v.put("wdFieldComments", wdFieldComments);
    v.put("wdFieldLastSavedBy", wdFieldLastSavedBy);
    v.put("wdFieldCreateDate", wdFieldCreateDate);
    v.put("wdFieldSaveDate", wdFieldSaveDate);
    v.put("wdFieldPrintDate", wdFieldPrintDate);
    v.put("wdFieldRevisionNum", wdFieldRevisionNum);
    v.put("wdFieldEditTime", wdFieldEditTime);
    v.put("wdFieldNumPages", wdFieldNumPages);
    v.put("wdFieldNumWords", wdFieldNumWords);
    v.put("wdFieldNumChars", wdFieldNumChars);
    v.put("wdFieldFileName", wdFieldFileName);
    v.put("wdFieldTemplate", wdFieldTemplate);
    v.put("wdFieldDate", wdFieldDate);
    v.put("wdFieldTime", wdFieldTime);
    v.put("wdFieldPage", wdFieldPage);
    v.put("wdFieldExpression", wdFieldExpression);
    v.put("wdFieldQuote", wdFieldQuote);
    v.put("wdFieldInclude", wdFieldInclude);
    v.put("wdFieldPageRef", wdFieldPageRef);
    v.put("wdFieldAsk", wdFieldAsk);
    v.put("wdFieldFillIn", wdFieldFillIn);
    v.put("wdFieldData", wdFieldData);
    v.put("wdFieldNext", wdFieldNext);
    v.put("wdFieldNextIf", wdFieldNextIf);
    v.put("wdFieldSkipIf", wdFieldSkipIf);
    v.put("wdFieldMergeRec", wdFieldMergeRec);
    v.put("wdFieldDDE", wdFieldDDE);
    v.put("wdFieldDDEAuto", wdFieldDDEAuto);
    v.put("wdFieldGlossary", wdFieldGlossary);
    v.put("wdFieldPrint", wdFieldPrint);
    v.put("wdFieldFormula", wdFieldFormula);
    v.put("wdFieldGoToButton", wdFieldGoToButton);
    v.put("wdFieldMacroButton", wdFieldMacroButton);
    v.put("wdFieldAutoNumOutline", wdFieldAutoNumOutline);
    v.put("wdFieldAutoNumLegal", wdFieldAutoNumLegal);
    v.put("wdFieldAutoNum", wdFieldAutoNum);
    v.put("wdFieldImport", wdFieldImport);
    v.put("wdFieldLink", wdFieldLink);
    v.put("wdFieldSymbol", wdFieldSymbol);
    v.put("wdFieldEmbed", wdFieldEmbed);
    v.put("wdFieldMergeField", wdFieldMergeField);
    v.put("wdFieldUserName", wdFieldUserName);
    v.put("wdFieldUserInitials", wdFieldUserInitials);
    v.put("wdFieldUserAddress", wdFieldUserAddress);
    v.put("wdFieldBarCode", wdFieldBarCode);
    v.put("wdFieldDocVariable", wdFieldDocVariable);
    v.put("wdFieldSection", wdFieldSection);
    v.put("wdFieldSectionPages", wdFieldSectionPages);
    v.put("wdFieldIncludePicture", wdFieldIncludePicture);
    v.put("wdFieldIncludeText", wdFieldIncludeText);
    v.put("wdFieldFileSize", wdFieldFileSize);
    v.put("wdFieldFormTextInput", wdFieldFormTextInput);
    v.put("wdFieldFormCheckBox", wdFieldFormCheckBox);
    v.put("wdFieldNoteRef", wdFieldNoteRef);
    v.put("wdFieldTOA", wdFieldTOA);
    v.put("wdFieldTOAEntry", wdFieldTOAEntry);
    v.put("wdFieldMergeSeq", wdFieldMergeSeq);
    v.put("wdFieldPrivate", wdFieldPrivate);
    v.put("wdFieldDatabase", wdFieldDatabase);
    v.put("wdFieldAutoText", wdFieldAutoText);
    v.put("wdFieldCompare", wdFieldCompare);
    v.put("wdFieldAddin", wdFieldAddin);
    v.put("wdFieldSubscriber", wdFieldSubscriber);
    v.put("wdFieldFormDropDown", wdFieldFormDropDown);
    v.put("wdFieldAdvance", wdFieldAdvance);
    v.put("wdFieldDocProperty", wdFieldDocProperty);
    v.put("wdFieldOCX", wdFieldOCX);
    v.put("wdFieldHyperlink", wdFieldHyperlink);
    v.put("wdFieldAutoTextList", wdFieldAutoTextList);
    v.put("wdFieldListNum", wdFieldListNum);
    v.put("wdFieldHTMLActiveX", wdFieldHTMLActiveX);
    v.put("wdFieldBidiOutline", wdFieldBidiOutline);
    v.put("wdFieldAddressBlock", wdFieldAddressBlock);
    v.put("wdFieldGreetingLine", wdFieldGreetingLine);
    v.put("wdFieldShape", wdFieldShape);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
