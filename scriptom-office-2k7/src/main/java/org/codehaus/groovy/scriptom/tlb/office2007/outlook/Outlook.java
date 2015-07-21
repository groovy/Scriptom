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
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class Outlook
{
  private Outlook()
  {
  }

  /**
   * A {@code Map} of CoClass names to prog-ids for this type library.<p>
   *
   * Note that some objects that support events do not publish a prog-id.
   * This is a known limitation of this library that we hope to resolve in
   * a future release.<p>
   *
   * Supported prog-ids:
   * <ul>
   *   <li><b>Application</b> = Outlook.Application.12</li>
   *   <li><b>OlkBusinessCardControl</b> = Outlook.OlkBusinessCardControl</li>
   *   <li><b>OlkCategory</b> = Outlook.OlkCategoryStrip</li>
   *   <li><b>OlkCheckBox</b> = Outlook.OlkCheckBox</li>
   *   <li><b>OlkComboBox</b> = Outlook.OlkComboBox</li>
   *   <li><b>OlkCommandButton</b> = Outlook.OlkCommandButton</li>
   *   <li><b>OlkContactPhoto</b> = Outlook.OlkContactPhoto</li>
   *   <li><b>OlkDateControl</b> = Outlook.OlkDateControl</li>
   *   <li><b>OlkFrameHeader</b> = Outlook.OlkFrameHeader</li>
   *   <li><b>OlkInfoBar</b> = Outlook.OlkInfoBar</li>
   *   <li><b>OlkLabel</b> = Outlook.OlkLabel</li>
   *   <li><b>OlkListBox</b> = Outlook.OlkListBox</li>
   *   <li><b>OlkOptionButton</b> = Outlook.OlkOptionButton</li>
   *   <li><b>OlkPageControl</b> = Outlook.OlkPageControl</li>
   *   <li><b>OlkSenderPhoto</b> = Outlook.OlkSenderPhoto</li>
   *   <li><b>OlkTextBox</b> = Outlook.OlkTextBox</li>
   *   <li><b>OlkTimeControl</b> = Outlook.OlkTimeControl</li>
   *   <li><b>OlkTimeZoneControl</b> = Outlook.OlkTimeZone</li>
   *   <li><b>_DocSiteControl</b> = DOCSITE.DocSiteControl.1</li>
   *   <li><b>_RecipientControl</b> = RECIP.RecipCtl.1</li>
   * </ul>
   */
  public final static Map<String,String> progIds;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Application", "Outlook.Application.12");
    v.put("OlkBusinessCardControl", "Outlook.OlkBusinessCardControl");
    v.put("OlkCategory", "Outlook.OlkCategoryStrip");
    v.put("OlkCheckBox", "Outlook.OlkCheckBox");
    v.put("OlkComboBox", "Outlook.OlkComboBox");
    v.put("OlkCommandButton", "Outlook.OlkCommandButton");
    v.put("OlkContactPhoto", "Outlook.OlkContactPhoto");
    v.put("OlkDateControl", "Outlook.OlkDateControl");
    v.put("OlkFrameHeader", "Outlook.OlkFrameHeader");
    v.put("OlkInfoBar", "Outlook.OlkInfoBar");
    v.put("OlkLabel", "Outlook.OlkLabel");
    v.put("OlkListBox", "Outlook.OlkListBox");
    v.put("OlkOptionButton", "Outlook.OlkOptionButton");
    v.put("OlkPageControl", "Outlook.OlkPageControl");
    v.put("OlkSenderPhoto", "Outlook.OlkSenderPhoto");
    v.put("OlkTextBox", "Outlook.OlkTextBox");
    v.put("OlkTimeControl", "Outlook.OlkTimeControl");
    v.put("OlkTimeZoneControl", "Outlook.OlkTimeZone");
    v.put("_DocSiteControl", "DOCSITE.DocSiteControl.1");
    v.put("_RecipientControl", "RECIP.RecipCtl.1");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

 /** GUID for this type library. */
  public static final String GUID = "{00062FFF-0000-0000-C000-000000000046}";

  /**
   * CoClass: Account
   */
  public final static String Account = "{000630C5-0000-0000-C000-000000000046}";

  /**
   * CoClass: AccountRuleCondition
   */
  public final static String AccountRuleCondition = "{000630DB-0000-0000-C000-000000000046}";

  /**
   * CoClass: Accounts
   */
  public final static String Accounts = "{000630C4-0000-0000-C000-000000000046}";

  /**
   * CoClass: AddressRuleCondition
   */
  public final static String AddressRuleCondition = "{000630FA-0000-0000-C000-000000000046}";

  /**
   * CoClass: Application
   */
  public final static String Application = "{00063001-0000-0000-C000-000000000046}";

  /**
   * CoClass: AppointmentItem
   */
  public final static String AppointmentItem = "{00063033-0000-0000-C000-000000000046}";

  /**
   * CoClass: AssignToCategoryRuleAction
   */
  public final static String AssignToCategoryRuleAction = "{000630D4-0000-0000-C000-000000000046}";

  /**
   * CoClass: AttachmentSelection
   */
  public final static String AttachmentSelection = "{000630F9-0000-0000-C000-000000000046}";

  /**
   * CoClass: AutoFormatRule
   */
  public final static String AutoFormatRule = "{00063093-0000-0000-C000-000000000046}";

  /**
   * CoClass: AutoFormatRules
   */
  public final static String AutoFormatRules = "{00063094-0000-0000-C000-000000000046}";

  /**
   * CoClass: BusinessCardView
   */
  public final static String BusinessCardView = "{000630A2-0000-0000-C000-000000000046}";

  /**
   * CoClass: CalendarModule
   */
  public final static String CalendarModule = "{000630EA-0000-0000-C000-000000000046}";

  /**
   * CoClass: CalendarSharing
   */
  public final static String CalendarSharing = "{000630E2-0000-0000-C000-000000000046}";

  /**
   * CoClass: CalendarView
   */
  public final static String CalendarView = "{00063099-0000-0000-C000-000000000046}";

  /**
   * CoClass: CardView
   */
  public final static String CardView = "{00063098-0000-0000-C000-000000000046}";

  /**
   * CoClass: Categories
   */
  public final static String Categories = "{000630E4-0000-0000-C000-000000000046}";

  /**
   * CoClass: Category
   */
  public final static String Category = "{000630E3-0000-0000-C000-000000000046}";

  /**
   * CoClass: CategoryRuleCondition
   */
  public final static String CategoryRuleCondition = "{000630DC-0000-0000-C000-000000000046}";

  /**
   * CoClass: Column
   */
  public final static String Column = "{000630E5-0000-0000-C000-000000000046}";

  /**
   * CoClass: ColumnFormat
   */
  public final static String ColumnFormat = "{0006309E-0000-0000-C000-000000000046}";

  /**
   * CoClass: Columns
   */
  public final static String Columns = "{000630E1-0000-0000-C000-000000000046}";

  /**
   * CoClass: ContactItem
   */
  public final static String ContactItem = "{00063021-0000-0000-C000-000000000046}";

  /**
   * CoClass: ContactsModule
   */
  public final static String ContactsModule = "{000630EB-0000-0000-C000-000000000046}";

  /**
   * CoClass: DistListItem
   */
  public final static String DistListItem = "{00063081-0000-0000-C000-000000000046}";

  /**
   * CoClass: DoNotUseMeFolder
   */
  public final static String DoNotUseMeFolder = "{00063006-0000-0000-C000-000000000046}";

  /**
   * CoClass: DocumentItem
   */
  public final static String DocumentItem = "{00063020-0000-0000-C000-000000000046}";

  /**
   * CoClass: ExchangeDistributionList
   */
  public final static String ExchangeDistributionList = "{000630CA-0000-0000-C000-000000000046}";

  /**
   * CoClass: ExchangeUser
   */
  public final static String ExchangeUser = "{000630C9-0000-0000-C000-000000000046}";

  /**
   * CoClass: Explorer
   */
  public final static String Explorer = "{00063003-0000-0000-C000-000000000046}";

  /**
   * CoClass: Explorers
   */
  public final static String Explorers = "{0006300A-0000-0000-C000-000000000046}";

  /**
   * CoClass: Folder
   */
  public final static String Folder = "{00063006-0000-0000-C000-000000000046}";

  /**
   * CoClass: Folders
   */
  public final static String Folders = "{00063040-0000-0000-C000-000000000046}";

  /**
   * CoClass: FormNameRuleCondition
   */
  public final static String FormNameRuleCondition = "{000630DD-0000-0000-C000-000000000046}";

  /**
   * CoClass: FormRegion
   */
  public final static String FormRegion = "{0006305A-0000-0000-C000-000000000046}";

  /**
   * CoClass: FormRegionStartup
   */
  public final static String FormRegionStartup = "{00063059-0000-0000-C000-000000000046}";

  /**
   * CoClass: FromRssFeedRuleCondition
   */
  public final static String FromRssFeedRuleCondition = "{000630FB-0000-0000-C000-000000000046}";

  /**
   * CoClass: IconView
   */
  public final static String IconView = "{00063097-0000-0000-C000-000000000046}";

  /**
   * CoClass: ImportanceRuleCondition
   */
  public final static String ImportanceRuleCondition = "{000630DA-0000-0000-C000-000000000046}";

  /**
   * CoClass: Inspector
   */
  public final static String Inspector = "{00063005-0000-0000-C000-000000000046}";

  /**
   * CoClass: Inspectors
   */
  public final static String Inspectors = "{00063008-0000-0000-C000-000000000046}";

  /**
   * CoClass: Items
   */
  public final static String Items = "{00063041-0000-0000-C000-000000000046}";

  /**
   * CoClass: JournalItem
   */
  public final static String JournalItem = "{00063022-0000-0000-C000-000000000046}";

  /**
   * CoClass: JournalModule
   */
  public final static String JournalModule = "{000630ED-0000-0000-C000-000000000046}";

  /**
   * CoClass: MailItem
   */
  public final static String MailItem = "{00063034-0000-0000-C000-000000000046}";

  /**
   * CoClass: MailModule
   */
  public final static String MailModule = "{000630E9-0000-0000-C000-000000000046}";

  /**
   * CoClass: MarkAsTaskRuleAction
   */
  public final static String MarkAsTaskRuleAction = "{000630D6-0000-0000-C000-000000000046}";

  /**
   * CoClass: MeetingItem
   */
  public final static String MeetingItem = "{00063062-0000-0000-C000-000000000046}";

  /**
   * CoClass: MoveOrCopyRuleAction
   */
  public final static String MoveOrCopyRuleAction = "{000630D0-0000-0000-C000-000000000046}";

  /**
   * CoClass: NameSpace
   */
  public final static String NameSpace = "{00063002-0000-0000-C000-000000000046}";

  /**
   * CoClass: NavigationFolder
   */
  public final static String NavigationFolder = "{000630F2-0000-0000-C000-000000000046}";

  /**
   * CoClass: NavigationFolders
   */
  public final static String NavigationFolders = "{000630F1-0000-0000-C000-000000000046}";

  /**
   * CoClass: NavigationGroup
   */
  public final static String NavigationGroup = "{000630F0-0000-0000-C000-000000000046}";

  /**
   * CoClass: NavigationGroups
   */
  public final static String NavigationGroups = "{000630EF-0000-0000-C000-000000000046}";

  /**
   * CoClass: NavigationModule
   */
  public final static String NavigationModule = "{000630E8-0000-0000-C000-000000000046}";

  /**
   * CoClass: NavigationModules
   */
  public final static String NavigationModules = "{000630E7-0000-0000-C000-000000000046}";

  /**
   * CoClass: NavigationPane
   */
  public final static String NavigationPane = "{000630E6-0000-0000-C000-000000000046}";

  /**
   * CoClass: NewItemAlertRuleAction
   */
  public final static String NewItemAlertRuleAction = "{000630D7-0000-0000-C000-000000000046}";

  /**
   * CoClass: NoteItem
   */
  public final static String NoteItem = "{00063025-0000-0000-C000-000000000046}";

  /**
   * CoClass: NotesModule
   */
  public final static String NotesModule = "{000630EE-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkBusinessCardControl
   */
  public final static String OlkBusinessCardControl = "{000672ED-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkCategory
   */
  public final static String OlkCategory = "{000672F4-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkCheckBox
   */
  public final static String OlkCheckBox = "{000672DD-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkComboBox
   */
  public final static String OlkComboBox = "{000672DE-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkCommandButton
   */
  public final static String OlkCommandButton = "{000672DB-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkContactPhoto
   */
  public final static String OlkContactPhoto = "{000672EB-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkDateControl
   */
  public final static String OlkDateControl = "{000672FA-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkFrameHeader
   */
  public final static String OlkFrameHeader = "{00067352-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkInfoBar
   */
  public final static String OlkInfoBar = "{000672F6-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkLabel
   */
  public final static String OlkLabel = "{000672D9-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkListBox
   */
  public final static String OlkListBox = "{000672DF-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkOptionButton
   */
  public final static String OlkOptionButton = "{000672DC-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkPageControl
   */
  public final static String OlkPageControl = "{000672F8-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkSenderPhoto
   */
  public final static String OlkSenderPhoto = "{00067355-0000-0000-C000-000000000046}";

  /**
   * CoClass: Outlook TextBox
   */
  public final static String OlkTextBox = "{000672DA-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkTimeControl
   */
  public final static String OlkTimeControl = "{000672EF-0000-0000-C000-000000000046}";

  /**
   * CoClass: OlkTimeZoneControl
   */
  public final static String OlkTimeZoneControl = "{00067367-0000-0000-C000-000000000046}";

  /**
   * CoClass: OrderField
   */
  public final static String OrderField = "{0006309B-0000-0000-C000-000000000046}";

  /**
   * CoClass: OrderFields
   */
  public final static String OrderFields = "{0006309A-0000-0000-C000-000000000046}";

  /**
   * CoClass: OutlookBarGroups
   */
  public final static String OutlookBarGroups = "{00063072-0000-0000-C000-000000000046}";

  /**
   * CoClass: OutlookBarPane
   */
  public final static String OutlookBarPane = "{00063070-0000-0000-C000-000000000046}";

  /**
   * CoClass: OutlookBarShortcuts
   */
  public final static String OutlookBarShortcuts = "{00063074-0000-0000-C000-000000000046}";

  /**
   * CoClass: PlaySoundRuleAction
   */
  public final static String PlaySoundRuleAction = "{000630D5-0000-0000-C000-000000000046}";

  /**
   * CoClass: PostItem
   */
  public final static String PostItem = "{00063024-0000-0000-C000-000000000046}";

  /**
   * CoClass: PropertyAccessor
   */
  public final static String PropertyAccessor = "{0006302D-0000-0000-C000-000000000046}";

  /**
   * CoClass: Reminder
   */
  public final static String Reminder = "{000630B0-0000-0000-C000-000000000046}";

  /**
   * CoClass: Reminders
   */
  public final static String Reminders = "{000630B1-0000-0000-C000-000000000046}";

  /**
   * CoClass: RemoteItem
   */
  public final static String RemoteItem = "{00063023-0000-0000-C000-000000000046}";

  /**
   * CoClass: ReportItem
   */
  public final static String ReportItem = "{00063026-0000-0000-C000-000000000046}";

  /**
   * CoClass: Results
   */
  public final static String Results = "{0006300C-0000-0000-C000-000000000046}";

  /**
   * CoClass: Row
   */
  public final static String Row = "{000630D3-0000-0000-C000-000000000046}";

  /**
   * CoClass: Rule
   */
  public final static String Rule = "{000630CD-0000-0000-C000-000000000046}";

  /**
   * CoClass: RuleAction
   */
  public final static String RuleAction = "{000630CF-0000-0000-C000-000000000046}";

  /**
   * CoClass: RuleActions
   */
  public final static String RuleActions = "{000630CE-0000-0000-C000-000000000046}";

  /**
   * CoClass: RuleCondition
   */
  public final static String RuleCondition = "{000630D9-0000-0000-C000-000000000046}";

  /**
   * CoClass: RuleConditions
   */
  public final static String RuleConditions = "{000630D8-0000-0000-C000-000000000046}";

  /**
   * CoClass: Rules
   */
  public final static String Rules = "{000630CC-0000-0000-C000-000000000046}";

  /**
   * CoClass: SelectNamesDialog
   */
  public final static String SelectNamesDialog = "{000630C8-0000-0000-C000-000000000046}";

  /**
   * CoClass: SendRuleAction
   */
  public final static String SendRuleAction = "{000630D1-0000-0000-C000-000000000046}";

  /**
   * CoClass: SenderInAddressListRuleCondition
   */
  public final static String SenderInAddressListRuleCondition = "{000630DF-0000-0000-C000-000000000046}";

  /**
   * CoClass: SharingItem
   */
  public final static String SharingItem = "{0006302F-0000-0000-C000-000000000046}";

  /**
   * CoClass: StorageItem
   */
  public final static String StorageItem = "{000630CB-0000-0000-C000-000000000046}";

  /**
   * CoClass: Store
   */
  public final static String Store = "{000630C7-0000-0000-C000-000000000046}";

  /**
   * CoClass: Stores
   */
  public final static String Stores = "{000630C6-0000-0000-C000-000000000046}";

  /**
   * CoClass: SyncObject
   */
  public final static String SyncObject = "{00063083-0000-0000-C000-000000000046}";

  /**
   * CoClass: Table
   */
  public final static String Table = "{000630D2-0000-0000-C000-000000000046}";

  /**
   * CoClass: TableView
   */
  public final static String TableView = "{00063096-0000-0000-C000-000000000046}";

  /**
   * CoClass: TaskItem
   */
  public final static String TaskItem = "{00063035-0000-0000-C000-000000000046}";

  /**
   * CoClass: TaskRequestAcceptItem
   */
  public final static String TaskRequestAcceptItem = "{00063038-0000-0000-C000-000000000046}";

  /**
   * CoClass: TaskRequestDeclineItem
   */
  public final static String TaskRequestDeclineItem = "{00063039-0000-0000-C000-000000000046}";

  /**
   * CoClass: TaskRequestItem
   */
  public final static String TaskRequestItem = "{00063036-0000-0000-C000-000000000046}";

  /**
   * CoClass: TaskRequestUpdateItem
   */
  public final static String TaskRequestUpdateItem = "{00063037-0000-0000-C000-000000000046}";

  /**
   * CoClass: TasksModule
   */
  public final static String TasksModule = "{000630EC-0000-0000-C000-000000000046}";

  /**
   * CoClass: TextRuleCondition
   */
  public final static String TextRuleCondition = "{000630E0-0000-0000-C000-000000000046}";

  /**
   * CoClass: TimeZone
   */
  public final static String TimeZone = "{000630FD-0000-0000-C000-000000000046}";

  /**
   * CoClass: TimeZones
   */
  public final static String TimeZones = "{000630FC-0000-0000-C000-000000000046}";

  /**
   * CoClass: TimelineView
   */
  public final static String TimelineView = "{0006309C-0000-0000-C000-000000000046}";

  /**
   * CoClass: ToOrFromRuleCondition
   */
  public final static String ToOrFromRuleCondition = "{000630DE-0000-0000-C000-000000000046}";

  /**
   * CoClass: UserDefinedProperties
   */
  public final static String UserDefinedProperties = "{00063047-0000-0000-C000-000000000046}";

  /**
   * CoClass: UserDefinedProperty
   */
  public final static String UserDefinedProperty = "{0006305C-0000-0000-C000-000000000046}";

  /**
   * CoClass: ViewField
   */
  public final static String ViewField = "{000630A0-0000-0000-C000-000000000046}";

  /**
   * CoClass: ViewFields
   */
  public final static String ViewFields = "{000630A1-0000-0000-C000-000000000046}";

  /**
   * CoClass: ViewFont
   */
  public final static String ViewFont = "{0006309D-0000-0000-C000-000000000046}";

  /**
   * CoClass: Views
   */
  public final static String Views = "{0006308D-0000-0000-C000-000000000046}";

  /**
   * CoClass: _DocSiteControl
   */
  public final static String _DocSiteControl = "{0006F026-0000-0000-C000-000000000046}";

  /**
   * CoClass: _RecipientControl
   */
  public final static String _RecipientControl = "{0006F025-0000-0000-C000-000000000046}";

  /**
   * A {@code Map} of CoClass names to default interface GUIDs for this type library.
   */
  public final static Map<String,String> coClasses;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Account", Account);
    v.put("AccountRuleCondition", AccountRuleCondition);
    v.put("Accounts", Accounts);
    v.put("AddressRuleCondition", AddressRuleCondition);
    v.put("Application", Application);
    v.put("AppointmentItem", AppointmentItem);
    v.put("AssignToCategoryRuleAction", AssignToCategoryRuleAction);
    v.put("AttachmentSelection", AttachmentSelection);
    v.put("AutoFormatRule", AutoFormatRule);
    v.put("AutoFormatRules", AutoFormatRules);
    v.put("BusinessCardView", BusinessCardView);
    v.put("CalendarModule", CalendarModule);
    v.put("CalendarSharing", CalendarSharing);
    v.put("CalendarView", CalendarView);
    v.put("CardView", CardView);
    v.put("Categories", Categories);
    v.put("Category", Category);
    v.put("CategoryRuleCondition", CategoryRuleCondition);
    v.put("Column", Column);
    v.put("ColumnFormat", ColumnFormat);
    v.put("Columns", Columns);
    v.put("ContactItem", ContactItem);
    v.put("ContactsModule", ContactsModule);
    v.put("DistListItem", DistListItem);
    v.put("DoNotUseMeFolder", DoNotUseMeFolder);
    v.put("DocumentItem", DocumentItem);
    v.put("ExchangeDistributionList", ExchangeDistributionList);
    v.put("ExchangeUser", ExchangeUser);
    v.put("Explorer", Explorer);
    v.put("Explorers", Explorers);
    v.put("Folder", Folder);
    v.put("Folders", Folders);
    v.put("FormNameRuleCondition", FormNameRuleCondition);
    v.put("FormRegion", FormRegion);
    v.put("FormRegionStartup", FormRegionStartup);
    v.put("FromRssFeedRuleCondition", FromRssFeedRuleCondition);
    v.put("IconView", IconView);
    v.put("ImportanceRuleCondition", ImportanceRuleCondition);
    v.put("Inspector", Inspector);
    v.put("Inspectors", Inspectors);
    v.put("Items", Items);
    v.put("JournalItem", JournalItem);
    v.put("JournalModule", JournalModule);
    v.put("MailItem", MailItem);
    v.put("MailModule", MailModule);
    v.put("MarkAsTaskRuleAction", MarkAsTaskRuleAction);
    v.put("MeetingItem", MeetingItem);
    v.put("MoveOrCopyRuleAction", MoveOrCopyRuleAction);
    v.put("NameSpace", NameSpace);
    v.put("NavigationFolder", NavigationFolder);
    v.put("NavigationFolders", NavigationFolders);
    v.put("NavigationGroup", NavigationGroup);
    v.put("NavigationGroups", NavigationGroups);
    v.put("NavigationModule", NavigationModule);
    v.put("NavigationModules", NavigationModules);
    v.put("NavigationPane", NavigationPane);
    v.put("NewItemAlertRuleAction", NewItemAlertRuleAction);
    v.put("NoteItem", NoteItem);
    v.put("NotesModule", NotesModule);
    v.put("OlkBusinessCardControl", OlkBusinessCardControl);
    v.put("OlkCategory", OlkCategory);
    v.put("OlkCheckBox", OlkCheckBox);
    v.put("OlkComboBox", OlkComboBox);
    v.put("OlkCommandButton", OlkCommandButton);
    v.put("OlkContactPhoto", OlkContactPhoto);
    v.put("OlkDateControl", OlkDateControl);
    v.put("OlkFrameHeader", OlkFrameHeader);
    v.put("OlkInfoBar", OlkInfoBar);
    v.put("OlkLabel", OlkLabel);
    v.put("OlkListBox", OlkListBox);
    v.put("OlkOptionButton", OlkOptionButton);
    v.put("OlkPageControl", OlkPageControl);
    v.put("OlkSenderPhoto", OlkSenderPhoto);
    v.put("OlkTextBox", OlkTextBox);
    v.put("OlkTimeControl", OlkTimeControl);
    v.put("OlkTimeZoneControl", OlkTimeZoneControl);
    v.put("OrderField", OrderField);
    v.put("OrderFields", OrderFields);
    v.put("OutlookBarGroups", OutlookBarGroups);
    v.put("OutlookBarPane", OutlookBarPane);
    v.put("OutlookBarShortcuts", OutlookBarShortcuts);
    v.put("PlaySoundRuleAction", PlaySoundRuleAction);
    v.put("PostItem", PostItem);
    v.put("PropertyAccessor", PropertyAccessor);
    v.put("Reminder", Reminder);
    v.put("Reminders", Reminders);
    v.put("RemoteItem", RemoteItem);
    v.put("ReportItem", ReportItem);
    v.put("Results", Results);
    v.put("Row", Row);
    v.put("Rule", Rule);
    v.put("RuleAction", RuleAction);
    v.put("RuleActions", RuleActions);
    v.put("RuleCondition", RuleCondition);
    v.put("RuleConditions", RuleConditions);
    v.put("Rules", Rules);
    v.put("SelectNamesDialog", SelectNamesDialog);
    v.put("SendRuleAction", SendRuleAction);
    v.put("SenderInAddressListRuleCondition", SenderInAddressListRuleCondition);
    v.put("SharingItem", SharingItem);
    v.put("StorageItem", StorageItem);
    v.put("Store", Store);
    v.put("Stores", Stores);
    v.put("SyncObject", SyncObject);
    v.put("Table", Table);
    v.put("TableView", TableView);
    v.put("TaskItem", TaskItem);
    v.put("TaskRequestAcceptItem", TaskRequestAcceptItem);
    v.put("TaskRequestDeclineItem", TaskRequestDeclineItem);
    v.put("TaskRequestItem", TaskRequestItem);
    v.put("TaskRequestUpdateItem", TaskRequestUpdateItem);
    v.put("TasksModule", TasksModule);
    v.put("TextRuleCondition", TextRuleCondition);
    v.put("TimeZone", TimeZone);
    v.put("TimeZones", TimeZones);
    v.put("TimelineView", TimelineView);
    v.put("ToOrFromRuleCondition", ToOrFromRuleCondition);
    v.put("UserDefinedProperties", UserDefinedProperties);
    v.put("UserDefinedProperty", UserDefinedProperty);
    v.put("ViewField", ViewField);
    v.put("ViewFields", ViewFields);
    v.put("ViewFont", ViewFont);
    v.put("Views", Views);
    v.put("_DocSiteControl", _DocSiteControl);
    v.put("_RecipientControl", _RecipientControl);
    coClasses = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: Action
   */
  public final static String Action = "{00063043-0000-0000-C000-000000000046}";

  /**
   * Interface: Actions
   */
  public final static String Actions = "{0006303E-0000-0000-C000-000000000046}";

  /**
   * Interface: AddressEntries
   */
  public final static String AddressEntries = "{0006304A-0000-0000-C000-000000000046}";

  /**
   * Interface: AddressEntry
   */
  public final static String AddressEntry = "{0006304B-0000-0000-C000-000000000046}";

  /**
   * Interface: AddressList
   */
  public final static String AddressList = "{00063049-0000-0000-C000-000000000046}";

  /**
   * Interface: AddressLists
   */
  public final static String AddressLists = "{00063048-0000-0000-C000-000000000046}";

  /**
   * Interface: ApplicationEvents
   */
  public final static String ApplicationEvents = "{0006304E-0000-0000-C000-000000000046}";

  /**
   * Interface: ApplicationEvents_10
   */
  public final static String ApplicationEvents_10 = "{0006300E-0000-0000-C000-000000000046}";

  /**
   * Interface: ApplicationEvents_11
   */
  public final static String ApplicationEvents_11 = "{0006302C-0000-0000-C000-000000000046}";

  /**
   * Interface: Attachment
   */
  public final static String Attachment = "{00063007-0000-0000-C000-000000000046}";

  /**
   * Interface: Attachments
   */
  public final static String Attachments = "{0006303C-0000-0000-C000-000000000046}";

  /**
   * Interface: Conflict
   */
  public final static String Conflict = "{000630C3-0000-0000-C000-000000000046}";

  /**
   * Interface: Conflicts
   */
  public final static String Conflicts = "{000630C2-0000-0000-C000-000000000046}";

  /**
   * Interface: Exception
   */
  public final static String Exception = "{0006304D-0000-0000-C000-000000000046}";

  /**
   * Interface: Exceptions
   */
  public final static String Exceptions = "{0006304C-0000-0000-C000-000000000046}";

  /**
   * Interface: ExplorerEvents
   */
  public final static String ExplorerEvents = "{0006304F-0000-0000-C000-000000000046}";

  /**
   * Interface: ExplorerEvents_10
   */
  public final static String ExplorerEvents_10 = "{0006300F-0000-0000-C000-000000000046}";

  /**
   * Interface: ExplorersEvents
   */
  public final static String ExplorersEvents = "{00063078-0000-0000-C000-000000000046}";

  /**
   * Interface: FoldersEvents
   */
  public final static String FoldersEvents = "{00063076-0000-0000-C000-000000000046}";

  /**
   * Interface: FormDescription
   */
  public final static String FormDescription = "{00063046-0000-0000-C000-000000000046}";

  /**
   * Interface: FormRegionEvents
   */
  public final static String FormRegionEvents = "{0006305B-0000-0000-C000-000000000046}";

  /**
   * Interface: InspectorEvents
   */
  public final static String InspectorEvents = "{0006307D-0000-0000-C000-000000000046}";

  /**
   * Interface: InspectorEvents_10
   */
  public final static String InspectorEvents_10 = "{0006302A-0000-0000-C000-000000000046}";

  /**
   * Interface: InspectorsEvents
   */
  public final static String InspectorsEvents = "{00063079-0000-0000-C000-000000000046}";

  /**
   * Interface: ItemEvents
   */
  public final static String ItemEvents = "{0006303A-0000-0000-C000-000000000046}";

  /**
   * Interface: ItemEvents_10
   */
  public final static String ItemEvents_10 = "{0006302B-0000-0000-C000-000000000046}";

  /**
   * Interface: ItemProperties
   */
  public final static String ItemProperties = "{000630A8-0000-0000-C000-000000000046}";

  /**
   * Interface: ItemProperty
   */
  public final static String ItemProperty = "{000630A7-0000-0000-C000-000000000046}";

  /**
   * Interface: ItemsEvents
   */
  public final static String ItemsEvents = "{00063077-0000-0000-C000-000000000046}";

  /**
   * Interface: Link
   */
  public final static String Link = "{00063089-0000-0000-C000-000000000046}";

  /**
   * Interface: Links
   */
  public final static String Links = "{0006308A-0000-0000-C000-000000000046}";

  /**
   * Interface: MAPIFolder
   */
  public final static String MAPIFolder = "{00063006-0000-0000-C000-000000000046}";

  /**
   * Interface: MAPIFolderEvents_12
   */
  public final static String MAPIFolderEvents_12 = "{000630F7-0000-0000-C000-000000000046}";

  /**
   * Interface: NameSpaceEvents
   */
  public final static String NameSpaceEvents = "{0006308C-0000-0000-C000-000000000046}";

  /**
   * Interface: NavigationGroupsEvents_12
   */
  public final static String NavigationGroupsEvents_12 = "{000630F4-0000-0000-C000-000000000046}";

  /**
   * Interface: NavigationPaneEvents_12
   */
  public final static String NavigationPaneEvents_12 = "{000630F3-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkBusinessCardControlEvents
   */
  public final static String OlkBusinessCardControlEvents = "{000672EE-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkCategoryEvents
   */
  public final static String OlkCategoryEvents = "{000672F5-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkCheckBoxEvents
   */
  public final static String OlkCheckBoxEvents = "{000672E2-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkComboBoxEvents
   */
  public final static String OlkComboBoxEvents = "{000672E3-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkCommandButtonEvents
   */
  public final static String OlkCommandButtonEvents = "{000672E0-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkContactPhotoEvents
   */
  public final static String OlkContactPhotoEvents = "{000672EC-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkControl
   */
  public final static String OlkControl = "{00067366-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkDateControlEvents
   */
  public final static String OlkDateControlEvents = "{000672FB-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkFrameHeaderEvents
   */
  public final static String OlkFrameHeaderEvents = "{00067353-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkInfoBarEvents
   */
  public final static String OlkInfoBarEvents = "{000672F7-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkLabelEvents
   */
  public final static String OlkLabelEvents = "{000672E5-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkListBoxEvents
   */
  public final static String OlkListBoxEvents = "{000672E4-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkOptionButtonEvents
   */
  public final static String OlkOptionButtonEvents = "{000672E1-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkPageControlEvents
   */
  public final static String OlkPageControlEvents = "{000672F9-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkSenderPhotoEvents
   */
  public final static String OlkSenderPhotoEvents = "{00067356-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkTextBoxEvents
   */
  public final static String OlkTextBoxEvents = "{000672E6-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkTimeControlEvents
   */
  public final static String OlkTimeControlEvents = "{000672F0-0000-0000-C000-000000000046}";

  /**
   * Interface: OlkTimeZoneControlEvents
   */
  public final static String OlkTimeZoneControlEvents = "{00067368-0000-0000-C000-000000000046}";

  /**
   * Interface: OutlookBarGroup
   */
  public final static String OutlookBarGroup = "{00063073-0000-0000-C000-000000000046}";

  /**
   * Interface: OutlookBarGroupsEvents
   */
  public final static String OutlookBarGroupsEvents = "{0006307B-0000-0000-C000-000000000046}";

  /**
   * Interface: OutlookBarPaneEvents
   */
  public final static String OutlookBarPaneEvents = "{0006307A-0000-0000-C000-000000000046}";

  /**
   * Interface: OutlookBarShortcut
   */
  public final static String OutlookBarShortcut = "{00063075-0000-0000-C000-000000000046}";

  /**
   * Interface: OutlookBarShortcutsEvents
   */
  public final static String OutlookBarShortcutsEvents = "{0006307C-0000-0000-C000-000000000046}";

  /**
   * Interface: OutlookBarStorage
   */
  public final static String OutlookBarStorage = "{00063071-0000-0000-C000-000000000046}";

  /**
   * Interface: Pages
   */
  public final static String Pages = "{0006303F-0000-0000-C000-000000000046}";

  /**
   * Interface: Panes
   */
  public final static String Panes = "{00063009-0000-0000-C000-000000000046}";

  /**
   * Interface: PropertyPage
   */
  public final static String PropertyPage = "{0006307E-0000-0000-C000-000000000046}";

  /**
   * Interface: PropertyPageSite
   */
  public final static String PropertyPageSite = "{0006307F-0000-0000-C000-000000000046}";

  /**
   * Interface: PropertyPages
   */
  public final static String PropertyPages = "{00063080-0000-0000-C000-000000000046}";

  /**
   * Interface: Recipient
   */
  public final static String Recipient = "{00063045-0000-0000-C000-000000000046}";

  /**
   * Interface: Recipients
   */
  public final static String Recipients = "{0006303B-0000-0000-C000-000000000046}";

  /**
   * Interface: RecurrencePattern
   */
  public final static String RecurrencePattern = "{00063044-0000-0000-C000-000000000046}";

  /**
   * Interface: ReminderCollectionEvents
   */
  public final static String ReminderCollectionEvents = "{000630B2-0000-0000-C000-000000000046}";

  /**
   * Interface: ResultsEvents
   */
  public final static String ResultsEvents = "{0006300D-0000-0000-C000-000000000046}";

  /**
   * Interface: Search
   */
  public final static String Search = "{0006300B-0000-0000-C000-000000000046}";

  /**
   * Interface: Selection
   */
  public final static String Selection = "{00063087-0000-0000-C000-000000000046}";

  /**
   * Interface: StoresEvents_12
   */
  public final static String StoresEvents_12 = "{000630F8-0000-0000-C000-000000000046}";

  /**
   * Interface: SyncObjectEvents
   */
  public final static String SyncObjectEvents = "{00063085-0000-0000-C000-000000000046}";

  /**
   * Interface: SyncObjects
   */
  public final static String SyncObjects = "{00063086-0000-0000-C000-000000000046}";

  /**
   * Interface: UserProperties
   */
  public final static String UserProperties = "{0006303D-0000-0000-C000-000000000046}";

  /**
   * Interface: UserProperty
   */
  public final static String UserProperty = "{00063042-0000-0000-C000-000000000046}";

  /**
   * Interface: View
   */
  public final static String View = "{00063095-0000-0000-C000-000000000046}";

  /**
   * Interface: _Account
   */
  public final static String _Account = "{000630C5-0000-0000-C000-000000000046}";

  /**
   * Interface: _AccountRuleCondition
   */
  public final static String _AccountRuleCondition = "{000630DB-0000-0000-C000-000000000046}";

  /**
   * Interface: _Accounts
   */
  public final static String _Accounts = "{000630C4-0000-0000-C000-000000000046}";

  /**
   * Interface: _AddressRuleCondition
   */
  public final static String _AddressRuleCondition = "{000630FA-0000-0000-C000-000000000046}";

  /**
   * Interface: _Application
   */
  public final static String _Application = "{00063001-0000-0000-C000-000000000046}";

  /**
   * Interface: _AppointmentItem
   */
  public final static String _AppointmentItem = "{00063033-0000-0000-C000-000000000046}";

  /**
   * Interface: _AssignToCategoryRuleAction
   */
  public final static String _AssignToCategoryRuleAction = "{000630D4-0000-0000-C000-000000000046}";

  /**
   * Interface: _AttachmentSelection
   */
  public final static String _AttachmentSelection = "{000630F9-0000-0000-C000-000000000046}";

  /**
   * Interface: _AutoFormatRule
   */
  public final static String _AutoFormatRule = "{00063093-0000-0000-C000-000000000046}";

  /**
   * Interface: _AutoFormatRules
   */
  public final static String _AutoFormatRules = "{00063094-0000-0000-C000-000000000046}";

  /**
   * Interface: _BusinessCardView
   */
  public final static String _BusinessCardView = "{000630A2-0000-0000-C000-000000000046}";

  /**
   * Interface: _CalendarModule
   */
  public final static String _CalendarModule = "{000630EA-0000-0000-C000-000000000046}";

  /**
   * Interface: _CalendarSharing
   */
  public final static String _CalendarSharing = "{000630E2-0000-0000-C000-000000000046}";

  /**
   * Interface: _CalendarView
   */
  public final static String _CalendarView = "{00063099-0000-0000-C000-000000000046}";

  /**
   * Interface: _CardView
   */
  public final static String _CardView = "{00063098-0000-0000-C000-000000000046}";

  /**
   * Interface: _Categories
   */
  public final static String _Categories = "{000630E4-0000-0000-C000-000000000046}";

  /**
   * Interface: _Category
   */
  public final static String _Category = "{000630E3-0000-0000-C000-000000000046}";

  /**
   * Interface: _CategoryRuleCondition
   */
  public final static String _CategoryRuleCondition = "{000630DC-0000-0000-C000-000000000046}";

  /**
   * Interface: _Column
   */
  public final static String _Column = "{000630E5-0000-0000-C000-000000000046}";

  /**
   * Interface: _ColumnFormat
   */
  public final static String _ColumnFormat = "{0006309E-0000-0000-C000-000000000046}";

  /**
   * Interface: _Columns
   */
  public final static String _Columns = "{000630E1-0000-0000-C000-000000000046}";

  /**
   * Interface: _ContactItem
   */
  public final static String _ContactItem = "{00063021-0000-0000-C000-000000000046}";

  /**
   * Interface: _ContactsModule
   */
  public final static String _ContactsModule = "{000630EB-0000-0000-C000-000000000046}";

  /**
   * Interface: _DDocSiteControl
   */
  public final static String _DDocSiteControl = "{0006F026-0000-0000-C000-000000000046}";

  /**
   * Interface: _DDocSiteControlEvents
   */
  public final static String _DDocSiteControlEvents = "{50BB9B50-811D-11CE-B565-00AA00608FAA}";

  /**
   * Interface: _DRecipientControl
   */
  public final static String _DRecipientControl = "{0006F025-0000-0000-C000-000000000046}";

  /**
   * Interface: _DRecipientControlEvents
   */
  public final static String _DRecipientControlEvents = "{D87E7E17-6897-11CE-A6C0-00AA00608FAA}";

  /**
   * Interface: _DistListItem
   */
  public final static String _DistListItem = "{00063081-0000-0000-C000-000000000046}";

  /**
   * Interface: _DocumentItem
   */
  public final static String _DocumentItem = "{00063020-0000-0000-C000-000000000046}";

  /**
   * Interface: _ExchangeDistributionList
   */
  public final static String _ExchangeDistributionList = "{000630CA-0000-0000-C000-000000000046}";

  /**
   * Interface: _ExchangeUser
   */
  public final static String _ExchangeUser = "{000630C9-0000-0000-C000-000000000046}";

  /**
   * Interface: _Explorer
   */
  public final static String _Explorer = "{00063003-0000-0000-C000-000000000046}";

  /**
   * Interface: _Explorers
   */
  public final static String _Explorers = "{0006300A-0000-0000-C000-000000000046}";

  /**
   * Interface: _Folders
   */
  public final static String _Folders = "{00063040-0000-0000-C000-000000000046}";

  /**
   * Interface: _FormNameRuleCondition
   */
  public final static String _FormNameRuleCondition = "{000630DD-0000-0000-C000-000000000046}";

  /**
   * Interface: _FormRegion
   */
  public final static String _FormRegion = "{0006305A-0000-0000-C000-000000000046}";

  /**
   * Interface: _FormRegionStartup
   */
  public final static String _FormRegionStartup = "{00063059-0000-0000-C000-000000000046}";

  /**
   * Interface: _FromRssFeedRuleCondition
   */
  public final static String _FromRssFeedRuleCondition = "{000630FB-0000-0000-C000-000000000046}";

  /**
   * Interface: _IDocSiteControl
   */
  public final static String _IDocSiteControl = "{43507DD0-811D-11CE-B565-00AA00608FAA}";

  /**
   * Interface: _IRecipientControl
   */
  public final static String _IRecipientControl = "{D87E7E16-6897-11CE-A6C0-00AA00608FAA}";

  /**
   * Interface: _IconView
   */
  public final static String _IconView = "{00063097-0000-0000-C000-000000000046}";

  /**
   * Interface: _ImportanceRuleCondition
   */
  public final static String _ImportanceRuleCondition = "{000630DA-0000-0000-C000-000000000046}";

  /**
   * Interface: _Inspector
   */
  public final static String _Inspector = "{00063005-0000-0000-C000-000000000046}";

  /**
   * Interface: _Inspectors
   */
  public final static String _Inspectors = "{00063008-0000-0000-C000-000000000046}";

  /**
   * Interface: _Items
   */
  public final static String _Items = "{00063041-0000-0000-C000-000000000046}";

  /**
   * Interface: _JournalItem
   */
  public final static String _JournalItem = "{00063022-0000-0000-C000-000000000046}";

  /**
   * Interface: _JournalModule
   */
  public final static String _JournalModule = "{000630ED-0000-0000-C000-000000000046}";

  /**
   * Interface: _MailItem
   */
  public final static String _MailItem = "{00063034-0000-0000-C000-000000000046}";

  /**
   * Interface: _MailModule
   */
  public final static String _MailModule = "{000630E9-0000-0000-C000-000000000046}";

  /**
   * Interface: _MarkAsTaskRuleAction
   */
  public final static String _MarkAsTaskRuleAction = "{000630D6-0000-0000-C000-000000000046}";

  /**
   * Interface: _MeetingItem
   */
  public final static String _MeetingItem = "{00063062-0000-0000-C000-000000000046}";

  /**
   * Interface: _MoveOrCopyRuleAction
   */
  public final static String _MoveOrCopyRuleAction = "{000630D0-0000-0000-C000-000000000046}";

  /**
   * Interface: _NameSpace
   */
  public final static String _NameSpace = "{00063002-0000-0000-C000-000000000046}";

  /**
   * Interface: _NavigationFolder
   */
  public final static String _NavigationFolder = "{000630F2-0000-0000-C000-000000000046}";

  /**
   * Interface: _NavigationFolders
   */
  public final static String _NavigationFolders = "{000630F1-0000-0000-C000-000000000046}";

  /**
   * Interface: _NavigationGroup
   */
  public final static String _NavigationGroup = "{000630F0-0000-0000-C000-000000000046}";

  /**
   * Interface: _NavigationGroups
   */
  public final static String _NavigationGroups = "{000630EF-0000-0000-C000-000000000046}";

  /**
   * Interface: _NavigationModule
   */
  public final static String _NavigationModule = "{000630E8-0000-0000-C000-000000000046}";

  /**
   * Interface: _NavigationModules
   */
  public final static String _NavigationModules = "{000630E7-0000-0000-C000-000000000046}";

  /**
   * Interface: _NavigationPane
   */
  public final static String _NavigationPane = "{000630E6-0000-0000-C000-000000000046}";

  /**
   * Interface: _NewItemAlertRuleAction
   */
  public final static String _NewItemAlertRuleAction = "{000630D7-0000-0000-C000-000000000046}";

  /**
   * Interface: _NoteItem
   */
  public final static String _NoteItem = "{00063025-0000-0000-C000-000000000046}";

  /**
   * Interface: _NotesModule
   */
  public final static String _NotesModule = "{000630EE-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkBusinessCardControl
   */
  public final static String _OlkBusinessCardControl = "{000672ED-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkCategory
   */
  public final static String _OlkCategory = "{000672F4-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkCheckBox
   */
  public final static String _OlkCheckBox = "{000672DD-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkComboBox
   */
  public final static String _OlkComboBox = "{000672DE-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkCommandButton
   */
  public final static String _OlkCommandButton = "{000672DB-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkContactPhoto
   */
  public final static String _OlkContactPhoto = "{000672EB-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkDateControl
   */
  public final static String _OlkDateControl = "{000672FA-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkFrameHeader
   */
  public final static String _OlkFrameHeader = "{00067352-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkInfoBar
   */
  public final static String _OlkInfoBar = "{000672F6-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkLabel
   */
  public final static String _OlkLabel = "{000672D9-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkListBox
   */
  public final static String _OlkListBox = "{000672DF-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkOptionButton
   */
  public final static String _OlkOptionButton = "{000672DC-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkPageControl
   */
  public final static String _OlkPageControl = "{000672F8-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkSenderPhoto
   */
  public final static String _OlkSenderPhoto = "{00067355-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkTextBox
   */
  public final static String _OlkTextBox = "{000672DA-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkTimeControl
   */
  public final static String _OlkTimeControl = "{000672EF-0000-0000-C000-000000000046}";

  /**
   * Interface: _OlkTimeZoneControl
   */
  public final static String _OlkTimeZoneControl = "{00067367-0000-0000-C000-000000000046}";

  /**
   * Interface: _OrderField
   */
  public final static String _OrderField = "{0006309B-0000-0000-C000-000000000046}";

  /**
   * Interface: _OrderFields
   */
  public final static String _OrderFields = "{0006309A-0000-0000-C000-000000000046}";

  /**
   * Interface: _OutlookBarGroups
   */
  public final static String _OutlookBarGroups = "{00063072-0000-0000-C000-000000000046}";

  /**
   * Interface: _OutlookBarPane
   */
  public final static String _OutlookBarPane = "{00063070-0000-0000-C000-000000000046}";

  /**
   * Interface: _OutlookBarShortcuts
   */
  public final static String _OutlookBarShortcuts = "{00063074-0000-0000-C000-000000000046}";

  /**
   * Interface: _PlaySoundRuleAction
   */
  public final static String _PlaySoundRuleAction = "{000630D5-0000-0000-C000-000000000046}";

  /**
   * Interface: _PostItem
   */
  public final static String _PostItem = "{00063024-0000-0000-C000-000000000046}";

  /**
   * Interface: _PropertyAccessor
   */
  public final static String _PropertyAccessor = "{0006302D-0000-0000-C000-000000000046}";

  /**
   * Interface: _Reminder
   */
  public final static String _Reminder = "{000630B0-0000-0000-C000-000000000046}";

  /**
   * Interface: _Reminders
   */
  public final static String _Reminders = "{000630B1-0000-0000-C000-000000000046}";

  /**
   * Interface: _RemoteItem
   */
  public final static String _RemoteItem = "{00063023-0000-0000-C000-000000000046}";

  /**
   * Interface: _ReportItem
   */
  public final static String _ReportItem = "{00063026-0000-0000-C000-000000000046}";

  /**
   * Interface: _Results
   */
  public final static String _Results = "{0006300C-0000-0000-C000-000000000046}";

  /**
   * Interface: _Row
   */
  public final static String _Row = "{000630D3-0000-0000-C000-000000000046}";

  /**
   * Interface: _Rule
   */
  public final static String _Rule = "{000630CD-0000-0000-C000-000000000046}";

  /**
   * Interface: _RuleAction
   */
  public final static String _RuleAction = "{000630CF-0000-0000-C000-000000000046}";

  /**
   * Interface: _RuleActions
   */
  public final static String _RuleActions = "{000630CE-0000-0000-C000-000000000046}";

  /**
   * Interface: _RuleCondition
   */
  public final static String _RuleCondition = "{000630D9-0000-0000-C000-000000000046}";

  /**
   * Interface: _RuleConditions
   */
  public final static String _RuleConditions = "{000630D8-0000-0000-C000-000000000046}";

  /**
   * Interface: _Rules
   */
  public final static String _Rules = "{000630CC-0000-0000-C000-000000000046}";

  /**
   * Interface: _SelectNamesDialog
   */
  public final static String _SelectNamesDialog = "{000630C8-0000-0000-C000-000000000046}";

  /**
   * Interface: _SendRuleAction
   */
  public final static String _SendRuleAction = "{000630D1-0000-0000-C000-000000000046}";

  /**
   * Interface: _SenderInAddressListRuleCondition
   */
  public final static String _SenderInAddressListRuleCondition = "{000630DF-0000-0000-C000-000000000046}";

  /**
   * Interface: _SharingItem
   */
  public final static String _SharingItem = "{0006302F-0000-0000-C000-000000000046}";

  /**
   * Interface: _StorageItem
   */
  public final static String _StorageItem = "{000630CB-0000-0000-C000-000000000046}";

  /**
   * Interface: _Store
   */
  public final static String _Store = "{000630C7-0000-0000-C000-000000000046}";

  /**
   * Interface: _Stores
   */
  public final static String _Stores = "{000630C6-0000-0000-C000-000000000046}";

  /**
   * Interface: _SyncObject
   */
  public final static String _SyncObject = "{00063083-0000-0000-C000-000000000046}";

  /**
   * Interface: _Table
   */
  public final static String _Table = "{000630D2-0000-0000-C000-000000000046}";

  /**
   * Interface: _TableView
   */
  public final static String _TableView = "{00063096-0000-0000-C000-000000000046}";

  /**
   * Interface: _TaskItem
   */
  public final static String _TaskItem = "{00063035-0000-0000-C000-000000000046}";

  /**
   * Interface: _TaskRequestAcceptItem
   */
  public final static String _TaskRequestAcceptItem = "{00063038-0000-0000-C000-000000000046}";

  /**
   * Interface: _TaskRequestDeclineItem
   */
  public final static String _TaskRequestDeclineItem = "{00063039-0000-0000-C000-000000000046}";

  /**
   * Interface: _TaskRequestItem
   */
  public final static String _TaskRequestItem = "{00063036-0000-0000-C000-000000000046}";

  /**
   * Interface: _TaskRequestUpdateItem
   */
  public final static String _TaskRequestUpdateItem = "{00063037-0000-0000-C000-000000000046}";

  /**
   * Interface: _TasksModule
   */
  public final static String _TasksModule = "{000630EC-0000-0000-C000-000000000046}";

  /**
   * Interface: _TextRuleCondition
   */
  public final static String _TextRuleCondition = "{000630E0-0000-0000-C000-000000000046}";

  /**
   * Interface: _TimeZone
   */
  public final static String _TimeZone = "{000630FD-0000-0000-C000-000000000046}";

  /**
   * Interface: _TimeZones
   */
  public final static String _TimeZones = "{000630FC-0000-0000-C000-000000000046}";

  /**
   * Interface: _TimelineView
   */
  public final static String _TimelineView = "{0006309C-0000-0000-C000-000000000046}";

  /**
   * Interface: _ToOrFromRuleCondition
   */
  public final static String _ToOrFromRuleCondition = "{000630DE-0000-0000-C000-000000000046}";

  /**
   * Interface: _UserDefinedProperties
   */
  public final static String _UserDefinedProperties = "{00063047-0000-0000-C000-000000000046}";

  /**
   * Interface: _UserDefinedProperty
   */
  public final static String _UserDefinedProperty = "{0006305C-0000-0000-C000-000000000046}";

  /**
   * Interface: _ViewField
   */
  public final static String _ViewField = "{000630A0-0000-0000-C000-000000000046}";

  /**
   * Interface: _ViewFields
   */
  public final static String _ViewFields = "{000630A1-0000-0000-C000-000000000046}";

  /**
   * Interface: _ViewFont
   */
  public final static String _ViewFont = "{0006309D-0000-0000-C000-000000000046}";

  /**
   * Interface: _Views
   */
  public final static String _Views = "{0006308D-0000-0000-C000-000000000046}";

  /**
   * Interface: _ViewsEvents
   */
  public final static String _ViewsEvents = "{000630A5-0000-0000-C000-000000000046}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map<String,String> interfaces;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Action", Action);
    v.put("Actions", Actions);
    v.put("AddressEntries", AddressEntries);
    v.put("AddressEntry", AddressEntry);
    v.put("AddressList", AddressList);
    v.put("AddressLists", AddressLists);
    v.put("ApplicationEvents", ApplicationEvents);
    v.put("ApplicationEvents_10", ApplicationEvents_10);
    v.put("ApplicationEvents_11", ApplicationEvents_11);
    v.put("Attachment", Attachment);
    v.put("Attachments", Attachments);
    v.put("Conflict", Conflict);
    v.put("Conflicts", Conflicts);
    v.put("Exception", Exception);
    v.put("Exceptions", Exceptions);
    v.put("ExplorerEvents", ExplorerEvents);
    v.put("ExplorerEvents_10", ExplorerEvents_10);
    v.put("ExplorersEvents", ExplorersEvents);
    v.put("FoldersEvents", FoldersEvents);
    v.put("FormDescription", FormDescription);
    v.put("FormRegionEvents", FormRegionEvents);
    v.put("InspectorEvents", InspectorEvents);
    v.put("InspectorEvents_10", InspectorEvents_10);
    v.put("InspectorsEvents", InspectorsEvents);
    v.put("ItemEvents", ItemEvents);
    v.put("ItemEvents_10", ItemEvents_10);
    v.put("ItemProperties", ItemProperties);
    v.put("ItemProperty", ItemProperty);
    v.put("ItemsEvents", ItemsEvents);
    v.put("Link", Link);
    v.put("Links", Links);
    v.put("MAPIFolder", MAPIFolder);
    v.put("MAPIFolderEvents_12", MAPIFolderEvents_12);
    v.put("NameSpaceEvents", NameSpaceEvents);
    v.put("NavigationGroupsEvents_12", NavigationGroupsEvents_12);
    v.put("NavigationPaneEvents_12", NavigationPaneEvents_12);
    v.put("OlkBusinessCardControlEvents", OlkBusinessCardControlEvents);
    v.put("OlkCategoryEvents", OlkCategoryEvents);
    v.put("OlkCheckBoxEvents", OlkCheckBoxEvents);
    v.put("OlkComboBoxEvents", OlkComboBoxEvents);
    v.put("OlkCommandButtonEvents", OlkCommandButtonEvents);
    v.put("OlkContactPhotoEvents", OlkContactPhotoEvents);
    v.put("OlkControl", OlkControl);
    v.put("OlkDateControlEvents", OlkDateControlEvents);
    v.put("OlkFrameHeaderEvents", OlkFrameHeaderEvents);
    v.put("OlkInfoBarEvents", OlkInfoBarEvents);
    v.put("OlkLabelEvents", OlkLabelEvents);
    v.put("OlkListBoxEvents", OlkListBoxEvents);
    v.put("OlkOptionButtonEvents", OlkOptionButtonEvents);
    v.put("OlkPageControlEvents", OlkPageControlEvents);
    v.put("OlkSenderPhotoEvents", OlkSenderPhotoEvents);
    v.put("OlkTextBoxEvents", OlkTextBoxEvents);
    v.put("OlkTimeControlEvents", OlkTimeControlEvents);
    v.put("OlkTimeZoneControlEvents", OlkTimeZoneControlEvents);
    v.put("OutlookBarGroup", OutlookBarGroup);
    v.put("OutlookBarGroupsEvents", OutlookBarGroupsEvents);
    v.put("OutlookBarPaneEvents", OutlookBarPaneEvents);
    v.put("OutlookBarShortcut", OutlookBarShortcut);
    v.put("OutlookBarShortcutsEvents", OutlookBarShortcutsEvents);
    v.put("OutlookBarStorage", OutlookBarStorage);
    v.put("Pages", Pages);
    v.put("Panes", Panes);
    v.put("PropertyPage", PropertyPage);
    v.put("PropertyPageSite", PropertyPageSite);
    v.put("PropertyPages", PropertyPages);
    v.put("Recipient", Recipient);
    v.put("Recipients", Recipients);
    v.put("RecurrencePattern", RecurrencePattern);
    v.put("ReminderCollectionEvents", ReminderCollectionEvents);
    v.put("ResultsEvents", ResultsEvents);
    v.put("Search", Search);
    v.put("Selection", Selection);
    v.put("StoresEvents_12", StoresEvents_12);
    v.put("SyncObjectEvents", SyncObjectEvents);
    v.put("SyncObjects", SyncObjects);
    v.put("UserProperties", UserProperties);
    v.put("UserProperty", UserProperty);
    v.put("View", View);
    v.put("_Account", _Account);
    v.put("_AccountRuleCondition", _AccountRuleCondition);
    v.put("_Accounts", _Accounts);
    v.put("_AddressRuleCondition", _AddressRuleCondition);
    v.put("_Application", _Application);
    v.put("_AppointmentItem", _AppointmentItem);
    v.put("_AssignToCategoryRuleAction", _AssignToCategoryRuleAction);
    v.put("_AttachmentSelection", _AttachmentSelection);
    v.put("_AutoFormatRule", _AutoFormatRule);
    v.put("_AutoFormatRules", _AutoFormatRules);
    v.put("_BusinessCardView", _BusinessCardView);
    v.put("_CalendarModule", _CalendarModule);
    v.put("_CalendarSharing", _CalendarSharing);
    v.put("_CalendarView", _CalendarView);
    v.put("_CardView", _CardView);
    v.put("_Categories", _Categories);
    v.put("_Category", _Category);
    v.put("_CategoryRuleCondition", _CategoryRuleCondition);
    v.put("_Column", _Column);
    v.put("_ColumnFormat", _ColumnFormat);
    v.put("_Columns", _Columns);
    v.put("_ContactItem", _ContactItem);
    v.put("_ContactsModule", _ContactsModule);
    v.put("_DDocSiteControl", _DDocSiteControl);
    v.put("_DDocSiteControlEvents", _DDocSiteControlEvents);
    v.put("_DRecipientControl", _DRecipientControl);
    v.put("_DRecipientControlEvents", _DRecipientControlEvents);
    v.put("_DistListItem", _DistListItem);
    v.put("_DocumentItem", _DocumentItem);
    v.put("_ExchangeDistributionList", _ExchangeDistributionList);
    v.put("_ExchangeUser", _ExchangeUser);
    v.put("_Explorer", _Explorer);
    v.put("_Explorers", _Explorers);
    v.put("_Folders", _Folders);
    v.put("_FormNameRuleCondition", _FormNameRuleCondition);
    v.put("_FormRegion", _FormRegion);
    v.put("_FormRegionStartup", _FormRegionStartup);
    v.put("_FromRssFeedRuleCondition", _FromRssFeedRuleCondition);
    v.put("_IDocSiteControl", _IDocSiteControl);
    v.put("_IRecipientControl", _IRecipientControl);
    v.put("_IconView", _IconView);
    v.put("_ImportanceRuleCondition", _ImportanceRuleCondition);
    v.put("_Inspector", _Inspector);
    v.put("_Inspectors", _Inspectors);
    v.put("_Items", _Items);
    v.put("_JournalItem", _JournalItem);
    v.put("_JournalModule", _JournalModule);
    v.put("_MailItem", _MailItem);
    v.put("_MailModule", _MailModule);
    v.put("_MarkAsTaskRuleAction", _MarkAsTaskRuleAction);
    v.put("_MeetingItem", _MeetingItem);
    v.put("_MoveOrCopyRuleAction", _MoveOrCopyRuleAction);
    v.put("_NameSpace", _NameSpace);
    v.put("_NavigationFolder", _NavigationFolder);
    v.put("_NavigationFolders", _NavigationFolders);
    v.put("_NavigationGroup", _NavigationGroup);
    v.put("_NavigationGroups", _NavigationGroups);
    v.put("_NavigationModule", _NavigationModule);
    v.put("_NavigationModules", _NavigationModules);
    v.put("_NavigationPane", _NavigationPane);
    v.put("_NewItemAlertRuleAction", _NewItemAlertRuleAction);
    v.put("_NoteItem", _NoteItem);
    v.put("_NotesModule", _NotesModule);
    v.put("_OlkBusinessCardControl", _OlkBusinessCardControl);
    v.put("_OlkCategory", _OlkCategory);
    v.put("_OlkCheckBox", _OlkCheckBox);
    v.put("_OlkComboBox", _OlkComboBox);
    v.put("_OlkCommandButton", _OlkCommandButton);
    v.put("_OlkContactPhoto", _OlkContactPhoto);
    v.put("_OlkDateControl", _OlkDateControl);
    v.put("_OlkFrameHeader", _OlkFrameHeader);
    v.put("_OlkInfoBar", _OlkInfoBar);
    v.put("_OlkLabel", _OlkLabel);
    v.put("_OlkListBox", _OlkListBox);
    v.put("_OlkOptionButton", _OlkOptionButton);
    v.put("_OlkPageControl", _OlkPageControl);
    v.put("_OlkSenderPhoto", _OlkSenderPhoto);
    v.put("_OlkTextBox", _OlkTextBox);
    v.put("_OlkTimeControl", _OlkTimeControl);
    v.put("_OlkTimeZoneControl", _OlkTimeZoneControl);
    v.put("_OrderField", _OrderField);
    v.put("_OrderFields", _OrderFields);
    v.put("_OutlookBarGroups", _OutlookBarGroups);
    v.put("_OutlookBarPane", _OutlookBarPane);
    v.put("_OutlookBarShortcuts", _OutlookBarShortcuts);
    v.put("_PlaySoundRuleAction", _PlaySoundRuleAction);
    v.put("_PostItem", _PostItem);
    v.put("_PropertyAccessor", _PropertyAccessor);
    v.put("_Reminder", _Reminder);
    v.put("_Reminders", _Reminders);
    v.put("_RemoteItem", _RemoteItem);
    v.put("_ReportItem", _ReportItem);
    v.put("_Results", _Results);
    v.put("_Row", _Row);
    v.put("_Rule", _Rule);
    v.put("_RuleAction", _RuleAction);
    v.put("_RuleActions", _RuleActions);
    v.put("_RuleCondition", _RuleCondition);
    v.put("_RuleConditions", _RuleConditions);
    v.put("_Rules", _Rules);
    v.put("_SelectNamesDialog", _SelectNamesDialog);
    v.put("_SendRuleAction", _SendRuleAction);
    v.put("_SenderInAddressListRuleCondition", _SenderInAddressListRuleCondition);
    v.put("_SharingItem", _SharingItem);
    v.put("_StorageItem", _StorageItem);
    v.put("_Store", _Store);
    v.put("_Stores", _Stores);
    v.put("_SyncObject", _SyncObject);
    v.put("_Table", _Table);
    v.put("_TableView", _TableView);
    v.put("_TaskItem", _TaskItem);
    v.put("_TaskRequestAcceptItem", _TaskRequestAcceptItem);
    v.put("_TaskRequestDeclineItem", _TaskRequestDeclineItem);
    v.put("_TaskRequestItem", _TaskRequestItem);
    v.put("_TaskRequestUpdateItem", _TaskRequestUpdateItem);
    v.put("_TasksModule", _TasksModule);
    v.put("_TextRuleCondition", _TextRuleCondition);
    v.put("_TimeZone", _TimeZone);
    v.put("_TimeZones", _TimeZones);
    v.put("_TimelineView", _TimelineView);
    v.put("_ToOrFromRuleCondition", _ToOrFromRuleCondition);
    v.put("_UserDefinedProperties", _UserDefinedProperties);
    v.put("_UserDefinedProperty", _UserDefinedProperty);
    v.put("_ViewField", _ViewField);
    v.put("_ViewFields", _ViewFields);
    v.put("_ViewFont", _ViewFont);
    v.put("_Views", _Views);
    v.put("_ViewsEvents", _ViewsEvents);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
