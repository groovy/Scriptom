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
package org.codehaus.groovy.scriptom.tlb.office;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class MsoCondition
{
  private MsoCondition()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoConditionFileTypeAllFiles = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoConditionFileTypeOfficeFiles = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoConditionFileTypeWordDocuments = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoConditionFileTypeExcelWorkbooks = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoConditionFileTypePowerPointPresentations = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoConditionFileTypeBinders = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer msoConditionFileTypeDatabases = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer msoConditionFileTypeTemplates = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer msoConditionIncludes = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer msoConditionIncludesPhrase = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoConditionBeginsWith = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoConditionEndsWith = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoConditionIncludesNearEachOther = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer msoConditionIsExactly = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer msoConditionIsNot = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer msoConditionYesterday = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer msoConditionToday = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoConditionTomorrow = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoConditionLastWeek = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer msoConditionThisWeek = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer msoConditionNextWeek = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoConditionLastMonth = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoConditionThisMonth = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoConditionNextMonth = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoConditionAnytime = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoConditionAnytimeBetween = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer msoConditionOn = Integer.valueOf(27);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer msoConditionOnOrAfter = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer msoConditionOnOrBefore = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer msoConditionInTheNext = Integer.valueOf(30);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer msoConditionInTheLast = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer msoConditionEquals = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer msoConditionDoesNotEqual = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer msoConditionAnyNumberBetween = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer msoConditionAtMost = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer msoConditionAtLeast = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer msoConditionMoreThan = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer msoConditionLessThan = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer msoConditionIsYes = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer msoConditionIsNo = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer msoConditionIncludesFormsOf = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer msoConditionFreeText = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer msoConditionFileTypeOutlookItems = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer msoConditionFileTypeMailItem = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer msoConditionFileTypeCalendarItem = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer msoConditionFileTypeContactItem = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer msoConditionFileTypeNoteItem = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer msoConditionFileTypeJournalItem = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer msoConditionFileTypeTaskItem = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer msoConditionFileTypePhotoDrawFiles = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer msoConditionFileTypeDataConnectionFiles = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer msoConditionFileTypePublisherFiles = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer msoConditionFileTypeProjectFiles = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer msoConditionFileTypeDocumentImagingFiles = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer msoConditionFileTypeVisioFiles = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer msoConditionFileTypeDesignerFiles = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer msoConditionFileTypeWebPages = Integer.valueOf(57);

  /**
   * Value is 58 (0x3A)
   */
  public static final Integer msoConditionEqualsLow = Integer.valueOf(58);

  /**
   * Value is 59 (0x3B)
   */
  public static final Integer msoConditionEqualsNormal = Integer.valueOf(59);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer msoConditionEqualsHigh = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer msoConditionNotEqualToLow = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer msoConditionNotEqualToNormal = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer msoConditionNotEqualToHigh = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer msoConditionEqualsNotStarted = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer msoConditionEqualsInProgress = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer msoConditionEqualsCompleted = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer msoConditionEqualsWaitingForSomeoneElse = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer msoConditionEqualsDeferred = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer msoConditionNotEqualToNotStarted = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer msoConditionNotEqualToInProgress = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer msoConditionNotEqualToCompleted = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer msoConditionNotEqualToWaitingForSomeoneElse = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer msoConditionNotEqualToDeferred = Integer.valueOf(73);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoConditionFileTypeAllFiles", msoConditionFileTypeAllFiles);
    v.put("msoConditionFileTypeOfficeFiles", msoConditionFileTypeOfficeFiles);
    v.put("msoConditionFileTypeWordDocuments", msoConditionFileTypeWordDocuments);
    v.put("msoConditionFileTypeExcelWorkbooks", msoConditionFileTypeExcelWorkbooks);
    v.put("msoConditionFileTypePowerPointPresentations", msoConditionFileTypePowerPointPresentations);
    v.put("msoConditionFileTypeBinders", msoConditionFileTypeBinders);
    v.put("msoConditionFileTypeDatabases", msoConditionFileTypeDatabases);
    v.put("msoConditionFileTypeTemplates", msoConditionFileTypeTemplates);
    v.put("msoConditionIncludes", msoConditionIncludes);
    v.put("msoConditionIncludesPhrase", msoConditionIncludesPhrase);
    v.put("msoConditionBeginsWith", msoConditionBeginsWith);
    v.put("msoConditionEndsWith", msoConditionEndsWith);
    v.put("msoConditionIncludesNearEachOther", msoConditionIncludesNearEachOther);
    v.put("msoConditionIsExactly", msoConditionIsExactly);
    v.put("msoConditionIsNot", msoConditionIsNot);
    v.put("msoConditionYesterday", msoConditionYesterday);
    v.put("msoConditionToday", msoConditionToday);
    v.put("msoConditionTomorrow", msoConditionTomorrow);
    v.put("msoConditionLastWeek", msoConditionLastWeek);
    v.put("msoConditionThisWeek", msoConditionThisWeek);
    v.put("msoConditionNextWeek", msoConditionNextWeek);
    v.put("msoConditionLastMonth", msoConditionLastMonth);
    v.put("msoConditionThisMonth", msoConditionThisMonth);
    v.put("msoConditionNextMonth", msoConditionNextMonth);
    v.put("msoConditionAnytime", msoConditionAnytime);
    v.put("msoConditionAnytimeBetween", msoConditionAnytimeBetween);
    v.put("msoConditionOn", msoConditionOn);
    v.put("msoConditionOnOrAfter", msoConditionOnOrAfter);
    v.put("msoConditionOnOrBefore", msoConditionOnOrBefore);
    v.put("msoConditionInTheNext", msoConditionInTheNext);
    v.put("msoConditionInTheLast", msoConditionInTheLast);
    v.put("msoConditionEquals", msoConditionEquals);
    v.put("msoConditionDoesNotEqual", msoConditionDoesNotEqual);
    v.put("msoConditionAnyNumberBetween", msoConditionAnyNumberBetween);
    v.put("msoConditionAtMost", msoConditionAtMost);
    v.put("msoConditionAtLeast", msoConditionAtLeast);
    v.put("msoConditionMoreThan", msoConditionMoreThan);
    v.put("msoConditionLessThan", msoConditionLessThan);
    v.put("msoConditionIsYes", msoConditionIsYes);
    v.put("msoConditionIsNo", msoConditionIsNo);
    v.put("msoConditionIncludesFormsOf", msoConditionIncludesFormsOf);
    v.put("msoConditionFreeText", msoConditionFreeText);
    v.put("msoConditionFileTypeOutlookItems", msoConditionFileTypeOutlookItems);
    v.put("msoConditionFileTypeMailItem", msoConditionFileTypeMailItem);
    v.put("msoConditionFileTypeCalendarItem", msoConditionFileTypeCalendarItem);
    v.put("msoConditionFileTypeContactItem", msoConditionFileTypeContactItem);
    v.put("msoConditionFileTypeNoteItem", msoConditionFileTypeNoteItem);
    v.put("msoConditionFileTypeJournalItem", msoConditionFileTypeJournalItem);
    v.put("msoConditionFileTypeTaskItem", msoConditionFileTypeTaskItem);
    v.put("msoConditionFileTypePhotoDrawFiles", msoConditionFileTypePhotoDrawFiles);
    v.put("msoConditionFileTypeDataConnectionFiles", msoConditionFileTypeDataConnectionFiles);
    v.put("msoConditionFileTypePublisherFiles", msoConditionFileTypePublisherFiles);
    v.put("msoConditionFileTypeProjectFiles", msoConditionFileTypeProjectFiles);
    v.put("msoConditionFileTypeDocumentImagingFiles", msoConditionFileTypeDocumentImagingFiles);
    v.put("msoConditionFileTypeVisioFiles", msoConditionFileTypeVisioFiles);
    v.put("msoConditionFileTypeDesignerFiles", msoConditionFileTypeDesignerFiles);
    v.put("msoConditionFileTypeWebPages", msoConditionFileTypeWebPages);
    v.put("msoConditionEqualsLow", msoConditionEqualsLow);
    v.put("msoConditionEqualsNormal", msoConditionEqualsNormal);
    v.put("msoConditionEqualsHigh", msoConditionEqualsHigh);
    v.put("msoConditionNotEqualToLow", msoConditionNotEqualToLow);
    v.put("msoConditionNotEqualToNormal", msoConditionNotEqualToNormal);
    v.put("msoConditionNotEqualToHigh", msoConditionNotEqualToHigh);
    v.put("msoConditionEqualsNotStarted", msoConditionEqualsNotStarted);
    v.put("msoConditionEqualsInProgress", msoConditionEqualsInProgress);
    v.put("msoConditionEqualsCompleted", msoConditionEqualsCompleted);
    v.put("msoConditionEqualsWaitingForSomeoneElse", msoConditionEqualsWaitingForSomeoneElse);
    v.put("msoConditionEqualsDeferred", msoConditionEqualsDeferred);
    v.put("msoConditionNotEqualToNotStarted", msoConditionNotEqualToNotStarted);
    v.put("msoConditionNotEqualToInProgress", msoConditionNotEqualToInProgress);
    v.put("msoConditionNotEqualToCompleted", msoConditionNotEqualToCompleted);
    v.put("msoConditionNotEqualToWaitingForSomeoneElse", msoConditionNotEqualToWaitingForSomeoneElse);
    v.put("msoConditionNotEqualToDeferred", msoConditionNotEqualToDeferred);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
