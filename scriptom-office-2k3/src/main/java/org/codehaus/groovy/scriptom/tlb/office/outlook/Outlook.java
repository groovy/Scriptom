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
   *   <li><b>Application</b> = Outlook.Application.11</li>
   *   <li><b>_DocSiteControl</b> = DOCSITE.DocSiteControl.1</li>
   *   <li><b>_RecipientControl</b> = RECIP.RecipCtl.1</li>
   * </ul>
   */
  public final static Map<String,String> progIds;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Application", "Outlook.Application.11");
    v.put("_DocSiteControl", "DOCSITE.DocSiteControl.1");
    v.put("_RecipientControl", "RECIP.RecipCtl.1");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

 /** GUID for this type library. */
  public static final String GUID = "{00062FFF-0000-0000-C000-000000000046}";

  /**
   * CoClass: Application
   */
  public final static String Application = "{00063001-0000-0000-C000-000000000046}";

  /**
   * CoClass: AppointmentItem
   */
  public final static String AppointmentItem = "{00063033-0000-0000-C000-000000000046}";

  /**
   * CoClass: ContactItem
   */
  public final static String ContactItem = "{00063021-0000-0000-C000-000000000046}";

  /**
   * CoClass: DistListItem
   */
  public final static String DistListItem = "{00063081-0000-0000-C000-000000000046}";

  /**
   * CoClass: DocumentItem
   */
  public final static String DocumentItem = "{00063020-0000-0000-C000-000000000046}";

  /**
   * CoClass: Explorer
   */
  public final static String Explorer = "{00063003-0000-0000-C000-000000000046}";

  /**
   * CoClass: Explorers
   */
  public final static String Explorers = "{0006300A-0000-0000-C000-000000000046}";

  /**
   * CoClass: Folders
   */
  public final static String Folders = "{00063040-0000-0000-C000-000000000046}";

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
   * CoClass: MailItem
   */
  public final static String MailItem = "{00063034-0000-0000-C000-000000000046}";

  /**
   * CoClass: MeetingItem
   */
  public final static String MeetingItem = "{00063062-0000-0000-C000-000000000046}";

  /**
   * CoClass: NameSpace
   */
  public final static String NameSpace = "{00063002-0000-0000-C000-000000000046}";

  /**
   * CoClass: NoteItem
   */
  public final static String NoteItem = "{00063025-0000-0000-C000-000000000046}";

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
   * CoClass: PostItem
   */
  public final static String PostItem = "{00063024-0000-0000-C000-000000000046}";

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
   * CoClass: SyncObject
   */
  public final static String SyncObject = "{00063083-0000-0000-C000-000000000046}";

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
    v.put("Application", Application);
    v.put("AppointmentItem", AppointmentItem);
    v.put("ContactItem", ContactItem);
    v.put("DistListItem", DistListItem);
    v.put("DocumentItem", DocumentItem);
    v.put("Explorer", Explorer);
    v.put("Explorers", Explorers);
    v.put("Folders", Folders);
    v.put("Inspector", Inspector);
    v.put("Inspectors", Inspectors);
    v.put("Items", Items);
    v.put("JournalItem", JournalItem);
    v.put("MailItem", MailItem);
    v.put("MeetingItem", MeetingItem);
    v.put("NameSpace", NameSpace);
    v.put("NoteItem", NoteItem);
    v.put("OutlookBarGroups", OutlookBarGroups);
    v.put("OutlookBarPane", OutlookBarPane);
    v.put("OutlookBarShortcuts", OutlookBarShortcuts);
    v.put("PostItem", PostItem);
    v.put("Reminder", Reminder);
    v.put("Reminders", Reminders);
    v.put("RemoteItem", RemoteItem);
    v.put("ReportItem", ReportItem);
    v.put("Results", Results);
    v.put("SyncObject", SyncObject);
    v.put("TaskItem", TaskItem);
    v.put("TaskRequestAcceptItem", TaskRequestAcceptItem);
    v.put("TaskRequestDeclineItem", TaskRequestDeclineItem);
    v.put("TaskRequestItem", TaskRequestItem);
    v.put("TaskRequestUpdateItem", TaskRequestUpdateItem);
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
   * Interface: NameSpaceEvents
   */
  public final static String NameSpaceEvents = "{0006308C-0000-0000-C000-000000000046}";

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
   * Interface: _Application
   */
  public final static String _Application = "{00063001-0000-0000-C000-000000000046}";

  /**
   * Interface: _AppointmentItem
   */
  public final static String _AppointmentItem = "{00063033-0000-0000-C000-000000000046}";

  /**
   * Interface: _ContactItem
   */
  public final static String _ContactItem = "{00063021-0000-0000-C000-000000000046}";

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
   * Interface: _IDocSiteControl
   */
  public final static String _IDocSiteControl = "{43507DD0-811D-11CE-B565-00AA00608FAA}";

  /**
   * Interface: _IRecipientControl
   */
  public final static String _IRecipientControl = "{D87E7E16-6897-11CE-A6C0-00AA00608FAA}";

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
   * Interface: _MailItem
   */
  public final static String _MailItem = "{00063034-0000-0000-C000-000000000046}";

  /**
   * Interface: _MeetingItem
   */
  public final static String _MeetingItem = "{00063062-0000-0000-C000-000000000046}";

  /**
   * Interface: _NameSpace
   */
  public final static String _NameSpace = "{00063002-0000-0000-C000-000000000046}";

  /**
   * Interface: _NoteItem
   */
  public final static String _NoteItem = "{00063025-0000-0000-C000-000000000046}";

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
   * Interface: _PostItem
   */
  public final static String _PostItem = "{00063024-0000-0000-C000-000000000046}";

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
   * Interface: _SyncObject
   */
  public final static String _SyncObject = "{00063083-0000-0000-C000-000000000046}";

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
    v.put("NameSpaceEvents", NameSpaceEvents);
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
    v.put("SyncObjectEvents", SyncObjectEvents);
    v.put("SyncObjects", SyncObjects);
    v.put("UserProperties", UserProperties);
    v.put("UserProperty", UserProperty);
    v.put("View", View);
    v.put("_Application", _Application);
    v.put("_AppointmentItem", _AppointmentItem);
    v.put("_ContactItem", _ContactItem);
    v.put("_DDocSiteControl", _DDocSiteControl);
    v.put("_DDocSiteControlEvents", _DDocSiteControlEvents);
    v.put("_DRecipientControl", _DRecipientControl);
    v.put("_DRecipientControlEvents", _DRecipientControlEvents);
    v.put("_DistListItem", _DistListItem);
    v.put("_DocumentItem", _DocumentItem);
    v.put("_Explorer", _Explorer);
    v.put("_Explorers", _Explorers);
    v.put("_Folders", _Folders);
    v.put("_IDocSiteControl", _IDocSiteControl);
    v.put("_IRecipientControl", _IRecipientControl);
    v.put("_Inspector", _Inspector);
    v.put("_Inspectors", _Inspectors);
    v.put("_Items", _Items);
    v.put("_JournalItem", _JournalItem);
    v.put("_MailItem", _MailItem);
    v.put("_MeetingItem", _MeetingItem);
    v.put("_NameSpace", _NameSpace);
    v.put("_NoteItem", _NoteItem);
    v.put("_OutlookBarGroups", _OutlookBarGroups);
    v.put("_OutlookBarPane", _OutlookBarPane);
    v.put("_OutlookBarShortcuts", _OutlookBarShortcuts);
    v.put("_PostItem", _PostItem);
    v.put("_Reminder", _Reminder);
    v.put("_Reminders", _Reminders);
    v.put("_RemoteItem", _RemoteItem);
    v.put("_ReportItem", _ReportItem);
    v.put("_Results", _Results);
    v.put("_SyncObject", _SyncObject);
    v.put("_TaskItem", _TaskItem);
    v.put("_TaskRequestAcceptItem", _TaskRequestAcceptItem);
    v.put("_TaskRequestDeclineItem", _TaskRequestDeclineItem);
    v.put("_TaskRequestItem", _TaskRequestItem);
    v.put("_TaskRequestUpdateItem", _TaskRequestUpdateItem);
    v.put("_Views", _Views);
    v.put("_ViewsEvents", _ViewsEvents);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
