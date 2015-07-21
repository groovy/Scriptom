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
package org.codehaus.groovy.scriptom.tlb.office2007.outlook;

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
   * Value is 104 (0x68)
   */
  public static final Integer olSharing = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer olAccount = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer olAccounts = Integer.valueOf(106);

  /**
   * Value is 107 (0x6B)
   */
  public static final Integer olStore = Integer.valueOf(107);

  /**
   * Value is 108 (0x6C)
   */
  public static final Integer olStores = Integer.valueOf(108);

  /**
   * Value is 109 (0x6D)
   */
  public static final Integer olSelectNamesDialog = Integer.valueOf(109);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer olExchangeUser = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer olExchangeDistributionList = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer olPropertyAccessor = Integer.valueOf(112);

  /**
   * Value is 113 (0x71)
   */
  public static final Integer olStorageItem = Integer.valueOf(113);

  /**
   * Value is 114 (0x72)
   */
  public static final Integer olRules = Integer.valueOf(114);

  /**
   * Value is 115 (0x73)
   */
  public static final Integer olRule = Integer.valueOf(115);

  /**
   * Value is 116 (0x74)
   */
  public static final Integer olRuleActions = Integer.valueOf(116);

  /**
   * Value is 117 (0x75)
   */
  public static final Integer olRuleAction = Integer.valueOf(117);

  /**
   * Value is 118 (0x76)
   */
  public static final Integer olMoveOrCopyRuleAction = Integer.valueOf(118);

  /**
   * Value is 119 (0x77)
   */
  public static final Integer olSendRuleAction = Integer.valueOf(119);

  /**
   * Value is 120 (0x78)
   */
  public static final Integer olTable = Integer.valueOf(120);

  /**
   * Value is 121 (0x79)
   */
  public static final Integer olRow = Integer.valueOf(121);

  /**
   * Value is 122 (0x7A)
   */
  public static final Integer olAssignToCategoryRuleAction = Integer.valueOf(122);

  /**
   * Value is 123 (0x7B)
   */
  public static final Integer olPlaySoundRuleAction = Integer.valueOf(123);

  /**
   * Value is 124 (0x7C)
   */
  public static final Integer olMarkAsTaskRuleAction = Integer.valueOf(124);

  /**
   * Value is 125 (0x7D)
   */
  public static final Integer olNewItemAlertRuleAction = Integer.valueOf(125);

  /**
   * Value is 126 (0x7E)
   */
  public static final Integer olRuleConditions = Integer.valueOf(126);

  /**
   * Value is 127 (0x7F)
   */
  public static final Integer olRuleCondition = Integer.valueOf(127);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer olImportanceRuleCondition = Integer.valueOf(128);

  /**
   * Value is 129 (0x81)
   */
  public static final Integer olFormRegion = Integer.valueOf(129);

  /**
   * Value is 130 (0x82)
   */
  public static final Integer olCategoryRuleCondition = Integer.valueOf(130);

  /**
   * Value is 131 (0x83)
   */
  public static final Integer olFormNameRuleCondition = Integer.valueOf(131);

  /**
   * Value is 132 (0x84)
   */
  public static final Integer olFromRuleCondition = Integer.valueOf(132);

  /**
   * Value is 133 (0x85)
   */
  public static final Integer olSenderInAddressListRuleCondition = Integer.valueOf(133);

  /**
   * Value is 134 (0x86)
   */
  public static final Integer olTextRuleCondition = Integer.valueOf(134);

  /**
   * Value is 135 (0x87)
   */
  public static final Integer olAccountRuleCondition = Integer.valueOf(135);

  /**
   * Value is 136 (0x88)
   */
  public static final Integer olClassTableView = Integer.valueOf(136);

  /**
   * Value is 137 (0x89)
   */
  public static final Integer olClassIconView = Integer.valueOf(137);

  /**
   * Value is 138 (0x8A)
   */
  public static final Integer olClassCardView = Integer.valueOf(138);

  /**
   * Value is 139 (0x8B)
   */
  public static final Integer olClassCalendarView = Integer.valueOf(139);

  /**
   * Value is 140 (0x8C)
   */
  public static final Integer olClassTimeLineView = Integer.valueOf(140);

  /**
   * Value is 141 (0x8D)
   */
  public static final Integer olViewFields = Integer.valueOf(141);

  /**
   * Value is 142 (0x8E)
   */
  public static final Integer olViewField = Integer.valueOf(142);

  /**
   * Value is 144 (0x90)
   */
  public static final Integer olOrderField = Integer.valueOf(144);

  /**
   * Value is 145 (0x91)
   */
  public static final Integer olOrderFields = Integer.valueOf(145);

  /**
   * Value is 146 (0x92)
   */
  public static final Integer olViewFont = Integer.valueOf(146);

  /**
   * Value is 147 (0x93)
   */
  public static final Integer olAutoFormatRule = Integer.valueOf(147);

  /**
   * Value is 148 (0x94)
   */
  public static final Integer olAutoFormatRules = Integer.valueOf(148);

  /**
   * Value is 149 (0x95)
   */
  public static final Integer olColumnFormat = Integer.valueOf(149);

  /**
   * Value is 150 (0x96)
   */
  public static final Integer olColumns = Integer.valueOf(150);

  /**
   * Value is 151 (0x97)
   */
  public static final Integer olCalendarSharing = Integer.valueOf(151);

  /**
   * Value is 152 (0x98)
   */
  public static final Integer olCategory = Integer.valueOf(152);

  /**
   * Value is 153 (0x99)
   */
  public static final Integer olCategories = Integer.valueOf(153);

  /**
   * Value is 154 (0x9A)
   */
  public static final Integer olColumn = Integer.valueOf(154);

  /**
   * Value is 155 (0x9B)
   */
  public static final Integer olClassNavigationPane = Integer.valueOf(155);

  /**
   * Value is 156 (0x9C)
   */
  public static final Integer olNavigationModules = Integer.valueOf(156);

  /**
   * Value is 157 (0x9D)
   */
  public static final Integer olNavigationModule = Integer.valueOf(157);

  /**
   * Value is 158 (0x9E)
   */
  public static final Integer olMailModule = Integer.valueOf(158);

  /**
   * Value is 159 (0x9F)
   */
  public static final Integer olCalendarModule = Integer.valueOf(159);

  /**
   * Value is 160 (0xA0)
   */
  public static final Integer olContactsModule = Integer.valueOf(160);

  /**
   * Value is 161 (0xA1)
   */
  public static final Integer olTasksModule = Integer.valueOf(161);

  /**
   * Value is 162 (0xA2)
   */
  public static final Integer olJournalModule = Integer.valueOf(162);

  /**
   * Value is 163 (0xA3)
   */
  public static final Integer olNotesModule = Integer.valueOf(163);

  /**
   * Value is 164 (0xA4)
   */
  public static final Integer olNavigationGroups = Integer.valueOf(164);

  /**
   * Value is 165 (0xA5)
   */
  public static final Integer olNavigationGroup = Integer.valueOf(165);

  /**
   * Value is 166 (0xA6)
   */
  public static final Integer olNavigationFolders = Integer.valueOf(166);

  /**
   * Value is 167 (0xA7)
   */
  public static final Integer olNavigationFolder = Integer.valueOf(167);

  /**
   * Value is 168 (0xA8)
   */
  public static final Integer olClassBusinessCardView = Integer.valueOf(168);

  /**
   * Value is 169 (0xA9)
   */
  public static final Integer olAttachmentSelection = Integer.valueOf(169);

  /**
   * Value is 170 (0xAA)
   */
  public static final Integer olAddressRuleCondition = Integer.valueOf(170);

  /**
   * Value is 171 (0xAB)
   */
  public static final Integer olUserDefinedProperty = Integer.valueOf(171);

  /**
   * Value is 172 (0xAC)
   */
  public static final Integer olUserDefinedProperties = Integer.valueOf(172);

  /**
   * Value is 173 (0xAD)
   */
  public static final Integer olFromRssFeedRuleCondition = Integer.valueOf(173);

  /**
   * Value is 174 (0xAE)
   */
  public static final Integer olClassTimeZone = Integer.valueOf(174);

  /**
   * Value is 175 (0xAF)
   */
  public static final Integer olClassTimeZones = Integer.valueOf(175);

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
    v.put("olSharing", olSharing);
    v.put("olAccount", olAccount);
    v.put("olAccounts", olAccounts);
    v.put("olStore", olStore);
    v.put("olStores", olStores);
    v.put("olSelectNamesDialog", olSelectNamesDialog);
    v.put("olExchangeUser", olExchangeUser);
    v.put("olExchangeDistributionList", olExchangeDistributionList);
    v.put("olPropertyAccessor", olPropertyAccessor);
    v.put("olStorageItem", olStorageItem);
    v.put("olRules", olRules);
    v.put("olRule", olRule);
    v.put("olRuleActions", olRuleActions);
    v.put("olRuleAction", olRuleAction);
    v.put("olMoveOrCopyRuleAction", olMoveOrCopyRuleAction);
    v.put("olSendRuleAction", olSendRuleAction);
    v.put("olTable", olTable);
    v.put("olRow", olRow);
    v.put("olAssignToCategoryRuleAction", olAssignToCategoryRuleAction);
    v.put("olPlaySoundRuleAction", olPlaySoundRuleAction);
    v.put("olMarkAsTaskRuleAction", olMarkAsTaskRuleAction);
    v.put("olNewItemAlertRuleAction", olNewItemAlertRuleAction);
    v.put("olRuleConditions", olRuleConditions);
    v.put("olRuleCondition", olRuleCondition);
    v.put("olImportanceRuleCondition", olImportanceRuleCondition);
    v.put("olFormRegion", olFormRegion);
    v.put("olCategoryRuleCondition", olCategoryRuleCondition);
    v.put("olFormNameRuleCondition", olFormNameRuleCondition);
    v.put("olFromRuleCondition", olFromRuleCondition);
    v.put("olSenderInAddressListRuleCondition", olSenderInAddressListRuleCondition);
    v.put("olTextRuleCondition", olTextRuleCondition);
    v.put("olAccountRuleCondition", olAccountRuleCondition);
    v.put("olClassTableView", olClassTableView);
    v.put("olClassIconView", olClassIconView);
    v.put("olClassCardView", olClassCardView);
    v.put("olClassCalendarView", olClassCalendarView);
    v.put("olClassTimeLineView", olClassTimeLineView);
    v.put("olViewFields", olViewFields);
    v.put("olViewField", olViewField);
    v.put("olOrderField", olOrderField);
    v.put("olOrderFields", olOrderFields);
    v.put("olViewFont", olViewFont);
    v.put("olAutoFormatRule", olAutoFormatRule);
    v.put("olAutoFormatRules", olAutoFormatRules);
    v.put("olColumnFormat", olColumnFormat);
    v.put("olColumns", olColumns);
    v.put("olCalendarSharing", olCalendarSharing);
    v.put("olCategory", olCategory);
    v.put("olCategories", olCategories);
    v.put("olColumn", olColumn);
    v.put("olClassNavigationPane", olClassNavigationPane);
    v.put("olNavigationModules", olNavigationModules);
    v.put("olNavigationModule", olNavigationModule);
    v.put("olMailModule", olMailModule);
    v.put("olCalendarModule", olCalendarModule);
    v.put("olContactsModule", olContactsModule);
    v.put("olTasksModule", olTasksModule);
    v.put("olJournalModule", olJournalModule);
    v.put("olNotesModule", olNotesModule);
    v.put("olNavigationGroups", olNavigationGroups);
    v.put("olNavigationGroup", olNavigationGroup);
    v.put("olNavigationFolders", olNavigationFolders);
    v.put("olNavigationFolder", olNavigationFolder);
    v.put("olClassBusinessCardView", olClassBusinessCardView);
    v.put("olAttachmentSelection", olAttachmentSelection);
    v.put("olAddressRuleCondition", olAddressRuleCondition);
    v.put("olUserDefinedProperty", olUserDefinedProperty);
    v.put("olUserDefinedProperties", olUserDefinedProperties);
    v.put("olFromRssFeedRuleCondition", olFromRssFeedRuleCondition);
    v.put("olClassTimeZone", olClassTimeZone);
    v.put("olClassTimeZones", olClassTimeZones);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
