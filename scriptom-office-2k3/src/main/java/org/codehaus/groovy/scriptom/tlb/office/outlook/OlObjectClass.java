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
package org.codehaus.groovy.scriptom.tlb.office.outlook;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class OlObjectClass
{
  private OlObjectClass()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer olApplication = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer olNamespace = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer olFolder = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer olRecipient = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer olAttachment = Integer.valueOf(5);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer olAddressList = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer olAddressEntry = Integer.valueOf(8);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer olFolders = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer olItems = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer olRecipients = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer olAttachments = Integer.valueOf(18);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer olAddressLists = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer olAddressEntries = Integer.valueOf(21);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer olAppointment = Integer.valueOf(26);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer olMeetingRequest = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer olMeetingCancellation = Integer.valueOf(54);

  /**
   * Value is 55 (0x37)
   */
  public static final Integer olMeetingResponseNegative = Integer.valueOf(55);

  /**
   * Value is 56 (0x38)
   */
  public static final Integer olMeetingResponsePositive = Integer.valueOf(56);

  /**
   * Value is 57 (0x39)
   */
  public static final Integer olMeetingResponseTentative = Integer.valueOf(57);

  /**
   * Value is 28 (0x1C)
   */
  public static final Integer olRecurrencePattern = Integer.valueOf(28);

  /**
   * Value is 29 (0x1D)
   */
  public static final Integer olExceptions = Integer.valueOf(29);

  /**
   * Value is 30 (0x1E)
   */
  public static final Integer olException = Integer.valueOf(30);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer olAction = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer olActions = Integer.valueOf(33);

  /**
   * Value is 34 (0x22)
   */
  public static final Integer olExplorer = Integer.valueOf(34);

  /**
   * Value is 35 (0x23)
   */
  public static final Integer olInspector = Integer.valueOf(35);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer olPages = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer olFormDescription = Integer.valueOf(37);

  /**
   * Value is 38 (0x26)
   */
  public static final Integer olUserProperties = Integer.valueOf(38);

  /**
   * Value is 39 (0x27)
   */
  public static final Integer olUserProperty = Integer.valueOf(39);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer olContact = Integer.valueOf(40);

  /**
   * Value is 41 (0x29)
   */
  public static final Integer olDocument = Integer.valueOf(41);

  /**
   * Value is 42 (0x2A)
   */
  public static final Integer olJournal = Integer.valueOf(42);

  /**
   * Value is 43 (0x2B)
   */
  public static final Integer olMail = Integer.valueOf(43);

  /**
   * Value is 44 (0x2C)
   */
  public static final Integer olNote = Integer.valueOf(44);

  /**
   * Value is 45 (0x2D)
   */
  public static final Integer olPost = Integer.valueOf(45);

  /**
   * Value is 46 (0x2E)
   */
  public static final Integer olReport = Integer.valueOf(46);

  /**
   * Value is 47 (0x2F)
   */
  public static final Integer olRemote = Integer.valueOf(47);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer olTask = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer olTaskRequest = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer olTaskRequestUpdate = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer olTaskRequestAccept = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer olTaskRequestDecline = Integer.valueOf(52);

  /**
   * Value is 60 (0x3C)
   */
  public static final Integer olExplorers = Integer.valueOf(60);

  /**
   * Value is 61 (0x3D)
   */
  public static final Integer olInspectors = Integer.valueOf(61);

  /**
   * Value is 62 (0x3E)
   */
  public static final Integer olPanes = Integer.valueOf(62);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer olOutlookBarPane = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer olOutlookBarStorage = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer olOutlookBarGroups = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer olOutlookBarGroup = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer olOutlookBarShortcuts = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer olOutlookBarShortcut = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer olDistributionList = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer olPropertyPageSite = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer olPropertyPages = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer olSyncObject = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer olSyncObjects = Integer.valueOf(73);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer olSelection = Integer.valueOf(74);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer olLink = Integer.valueOf(75);

  /**
   * Value is 76 (0x4C)
   */
  public static final Integer olLinks = Integer.valueOf(76);

  /**
   * Value is 77 (0x4D)
   */
  public static final Integer olSearch = Integer.valueOf(77);

  /**
   * Value is 78 (0x4E)
   */
  public static final Integer olResults = Integer.valueOf(78);

  /**
   * Value is 79 (0x4F)
   */
  public static final Integer olViews = Integer.valueOf(79);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer olView = Integer.valueOf(80);

  /**
   * Value is 98 (0x62)
   */
  public static final Integer olItemProperties = Integer.valueOf(98);

  /**
   * Value is 99 (0x63)
   */
  public static final Integer olItemProperty = Integer.valueOf(99);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer olReminders = Integer.valueOf(100);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer olReminder = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer olConflict = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer olConflicts = Integer.valueOf(103);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("olApplication", olApplication);
    v.put("olNamespace", olNamespace);
    v.put("olFolder", olFolder);
    v.put("olRecipient", olRecipient);
    v.put("olAttachment", olAttachment);
    v.put("olAddressList", olAddressList);
    v.put("olAddressEntry", olAddressEntry);
    v.put("olFolders", olFolders);
    v.put("olItems", olItems);
    v.put("olRecipients", olRecipients);
    v.put("olAttachments", olAttachments);
    v.put("olAddressLists", olAddressLists);
    v.put("olAddressEntries", olAddressEntries);
    v.put("olAppointment", olAppointment);
    v.put("olMeetingRequest", olMeetingRequest);
    v.put("olMeetingCancellation", olMeetingCancellation);
    v.put("olMeetingResponseNegative", olMeetingResponseNegative);
    v.put("olMeetingResponsePositive", olMeetingResponsePositive);
    v.put("olMeetingResponseTentative", olMeetingResponseTentative);
    v.put("olRecurrencePattern", olRecurrencePattern);
    v.put("olExceptions", olExceptions);
    v.put("olException", olException);
    v.put("olAction", olAction);
    v.put("olActions", olActions);
    v.put("olExplorer", olExplorer);
    v.put("olInspector", olInspector);
    v.put("olPages", olPages);
    v.put("olFormDescription", olFormDescription);
    v.put("olUserProperties", olUserProperties);
    v.put("olUserProperty", olUserProperty);
    v.put("olContact", olContact);
    v.put("olDocument", olDocument);
    v.put("olJournal", olJournal);
    v.put("olMail", olMail);
    v.put("olNote", olNote);
    v.put("olPost", olPost);
    v.put("olReport", olReport);
    v.put("olRemote", olRemote);
    v.put("olTask", olTask);
    v.put("olTaskRequest", olTaskRequest);
    v.put("olTaskRequestUpdate", olTaskRequestUpdate);
    v.put("olTaskRequestAccept", olTaskRequestAccept);
    v.put("olTaskRequestDecline", olTaskRequestDecline);
    v.put("olExplorers", olExplorers);
    v.put("olInspectors", olInspectors);
    v.put("olPanes", olPanes);
    v.put("olOutlookBarPane", olOutlookBarPane);
    v.put("olOutlookBarStorage", olOutlookBarStorage);
    v.put("olOutlookBarGroups", olOutlookBarGroups);
    v.put("olOutlookBarGroup", olOutlookBarGroup);
    v.put("olOutlookBarShortcuts", olOutlookBarShortcuts);
    v.put("olOutlookBarShortcut", olOutlookBarShortcut);
    v.put("olDistributionList", olDistributionList);
    v.put("olPropertyPageSite", olPropertyPageSite);
    v.put("olPropertyPages", olPropertyPages);
    v.put("olSyncObject", olSyncObject);
    v.put("olSyncObjects", olSyncObjects);
    v.put("olSelection", olSelection);
    v.put("olLink", olLink);
    v.put("olLinks", olLinks);
    v.put("olSearch", olSearch);
    v.put("olResults", olResults);
    v.put("olViews", olViews);
    v.put("olView", olView);
    v.put("olItemProperties", olItemProperties);
    v.put("olItemProperty", olItemProperty);
    v.put("olReminders", olReminders);
    v.put("olReminder", olReminder);
    v.put("olConflict", olConflict);
    v.put("olConflicts", olConflicts);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
