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
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class Word
{
  private Word()
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
   *   <li><b>Application</b> = Word.Application</li>
   *   <li><b>Document</b> = Word.Document</li>
   * </ul>
   */
  public final static Map<String,String> progIds;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Application", "Word.Application");
    v.put("Document", "Word.Document");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

 /** GUID for this type library. */
  public static final String GUID = "{00020905-0000-0000-C000-000000000046}";

  /**
   * CoClass: Application
   */
  public final static String Application = "{00020970-0000-0000-C000-000000000046}";

  /**
   * CoClass: Document
   */
  public final static String Document = "{0002096B-0000-0000-C000-000000000046}";

  /**
   * CoClass: Font
   */
  public final static String Font = "{00020952-0000-0000-C000-000000000046}";

  /**
   * CoClass: Global
   */
  public final static String Global = "{000209B9-0000-0000-C000-000000000046}";

  /**
   * CoClass: LetterContent
   */
  public final static String LetterContent = "{000209A1-0000-0000-C000-000000000046}";

  /**
   * CoClass: OLEControl
   */
  public final static String OLEControl = "{000209A4-0000-0000-C000-000000000046}";

  /**
   * CoClass: ParagraphFormat
   */
  public final static String ParagraphFormat = "{00020953-0000-0000-C000-000000000046}";

  /**
   * A {@code Map} of CoClass names to default interface GUIDs for this type library.
   */
  public final static Map<String,String> coClasses;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Application", Application);
    v.put("Document", Document);
    v.put("Font", Font);
    v.put("Global", Global);
    v.put("LetterContent", LetterContent);
    v.put("OLEControl", OLEControl);
    v.put("ParagraphFormat", ParagraphFormat);
    coClasses = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: AddIn
   */
  public final static String AddIn = "{0002097E-0000-0000-C000-000000000046}";

  /**
   * Interface: AddIns
   */
  public final static String AddIns = "{0002097F-0000-0000-C000-000000000046}";

  /**
   * Interface: Adjustments
   */
  public final static String Adjustments = "{000209C4-0000-0000-C000-000000000046}";

  /**
   * Interface: ApplicationEvents
   */
  public final static String ApplicationEvents = "{000209F7-0000-0000-C000-000000000046}";

  /**
   * Interface: ApplicationEvents2
   */
  public final static String ApplicationEvents2 = "{000209FE-0000-0000-C000-000000000046}";

  /**
   * Interface: ApplicationEvents3
   */
  public final static String ApplicationEvents3 = "{00020A00-0000-0000-C000-000000000046}";

  /**
   * Interface: ApplicationEvents4
   */
  public final static String ApplicationEvents4 = "{00020A01-0000-0000-C000-000000000046}";

  /**
   * Interface: AutoCaption
   */
  public final static String AutoCaption = "{0002097B-0000-0000-C000-000000000046}";

  /**
   * Interface: AutoCaptions
   */
  public final static String AutoCaptions = "{0002097A-0000-0000-C000-000000000046}";

  /**
   * Interface: AutoCorrect
   */
  public final static String AutoCorrect = "{00020949-0000-0000-C000-000000000046}";

  /**
   * Interface: AutoCorrectEntries
   */
  public final static String AutoCorrectEntries = "{00020948-0000-0000-C000-000000000046}";

  /**
   * Interface: AutoCorrectEntry
   */
  public final static String AutoCorrectEntry = "{00020947-0000-0000-C000-000000000046}";

  /**
   * Interface: AutoTextEntries
   */
  public final static String AutoTextEntries = "{00020937-0000-0000-C000-000000000046}";

  /**
   * Interface: AutoTextEntry
   */
  public final static String AutoTextEntry = "{00020936-0000-0000-C000-000000000046}";

  /**
   * Interface: Bookmark
   */
  public final static String Bookmark = "{00020968-0000-0000-C000-000000000046}";

  /**
   * Interface: Bookmarks
   */
  public final static String Bookmarks = "{00020967-0000-0000-C000-000000000046}";

  /**
   * Interface: Border
   */
  public final static String Border = "{0002093B-0000-0000-C000-000000000046}";

  /**
   * Interface: Borders
   */
  public final static String Borders = "{0002093C-0000-0000-C000-000000000046}";

  /**
   * Interface: Break
   */
  public final static String Break = "{79635BF1-BD1D-4B3F-A520-C1106F1AAAD8}";

  /**
   * Interface: Breaks
   */
  public final static String Breaks = "{16BE9309-D708-4322-BB1A-B056F58D17EA}";

  /**
   * Interface: Browser
   */
  public final static String Browser = "{0002092E-0000-0000-C000-000000000046}";

  /**
   * Interface: CalloutFormat
   */
  public final static String CalloutFormat = "{000209C5-0000-0000-C000-000000000046}";

  /**
   * Interface: CanvasShapes
   */
  public final static String CanvasShapes = "{396F9073-F9FD-11D3-8EA0-0050049A1A01}";

  /**
   * Interface: CaptionLabel
   */
  public final static String CaptionLabel = "{00020979-0000-0000-C000-000000000046}";

  /**
   * Interface: CaptionLabels
   */
  public final static String CaptionLabels = "{00020978-0000-0000-C000-000000000046}";

  /**
   * Interface: Cell
   */
  public final static String Cell = "{0002094E-0000-0000-C000-000000000046}";

  /**
   * Interface: Cells
   */
  public final static String Cells = "{0002094A-0000-0000-C000-000000000046}";

  /**
   * Interface: Characters
   */
  public final static String Characters = "{0002095D-0000-0000-C000-000000000046}";

  /**
   * Interface: CheckBox
   */
  public final static String CheckBox = "{00020926-0000-0000-C000-000000000046}";

  /**
   * Interface: ColorFormat
   */
  public final static String ColorFormat = "{000209C6-0000-0000-C000-000000000046}";

  /**
   * Interface: Column
   */
  public final static String Column = "{0002094F-0000-0000-C000-000000000046}";

  /**
   * Interface: Columns
   */
  public final static String Columns = "{0002094B-0000-0000-C000-000000000046}";

  /**
   * Interface: Comment
   */
  public final static String Comment = "{0002093D-0000-0000-C000-000000000046}";

  /**
   * Interface: Comments
   */
  public final static String Comments = "{00020940-0000-0000-C000-000000000046}";

  /**
   * Interface: ConditionalStyle
   */
  public final static String ConditionalStyle = "{1498F56D-ED33-41F9-B37B-EF30E50B08AC}";

  /**
   * Interface: ConnectorFormat
   */
  public final static String ConnectorFormat = "{000209C7-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomLabel
   */
  public final static String CustomLabel = "{00020915-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomLabels
   */
  public final static String CustomLabels = "{00020916-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomProperties
   */
  public final static String CustomProperties = "{B923FDE1-F08C-11D3-91B0-00105A0A19FD}";

  /**
   * Interface: CustomProperty
   */
  public final static String CustomProperty = "{B923FDE0-F08C-11D3-91B0-00105A0A19FD}";

  /**
   * Interface: DefaultWebOptions
   */
  public final static String DefaultWebOptions = "{000209E3-0000-0000-C000-000000000046}";

  /**
   * Interface: Diagram
   */
  public final static String Diagram = "{000209EC-0000-0000-C000-000000000046}";

  /**
   * Interface: DiagramNode
   */
  public final static String DiagramNode = "{000209E9-0000-0000-C000-000000000046}";

  /**
   * Interface: DiagramNodeChildren
   */
  public final static String DiagramNodeChildren = "{000209EA-0000-0000-C000-000000000046}";

  /**
   * Interface: DiagramNodes
   */
  public final static String DiagramNodes = "{000209EB-0000-0000-C000-000000000046}";

  /**
   * Interface: Dialog
   */
  public final static String Dialog = "{000209B8-0000-0000-C000-000000000046}";

  /**
   * Interface: Dialogs
   */
  public final static String Dialogs = "{00020910-0000-0000-C000-000000000046}";

  /**
   * Interface: Dictionaries
   */
  public final static String Dictionaries = "{000209AC-0000-0000-C000-000000000046}";

  /**
   * Interface: Dictionary
   */
  public final static String Dictionary = "{000209AD-0000-0000-C000-000000000046}";

  /**
   * Interface: DocumentEvents
   */
  public final static String DocumentEvents = "{000209F6-0000-0000-C000-000000000046}";

  /**
   * Interface: DocumentEvents2
   */
  public final static String DocumentEvents2 = "{00020A02-0000-0000-C000-000000000046}";

  /**
   * Interface: Documents
   */
  public final static String Documents = "{0002096C-0000-0000-C000-000000000046}";

  /**
   * Interface: DropCap
   */
  public final static String DropCap = "{00020956-0000-0000-C000-000000000046}";

  /**
   * Interface: DropDown
   */
  public final static String DropDown = "{00020925-0000-0000-C000-000000000046}";

  /**
   * Interface: Editor
   */
  public final static String Editor = "{DD947D72-F33C-4198-9BDF-F86181D05E41}";

  /**
   * Interface: Editors
   */
  public final static String Editors = "{AED7E08C-14F0-4F33-921D-4C5353137BF6}";

  /**
   * Interface: Email
   */
  public final static String Email = "{000209DD-0000-0000-C000-000000000046}";

  /**
   * Interface: EmailAuthor
   */
  public final static String EmailAuthor = "{000209D7-0000-0000-C000-000000000046}";

  /**
   * Interface: EmailOptions
   */
  public final static String EmailOptions = "{000209DB-0000-0000-C000-000000000046}";

  /**
   * Interface: EmailSignature
   */
  public final static String EmailSignature = "{000209DC-0000-0000-C000-000000000046}";

  /**
   * Interface: EmailSignatureEntries
   */
  public final static String EmailSignatureEntries = "{000209E5-0000-0000-C000-000000000046}";

  /**
   * Interface: EmailSignatureEntry
   */
  public final static String EmailSignatureEntry = "{000209E6-0000-0000-C000-000000000046}";

  /**
   * Interface: Endnote
   */
  public final static String Endnote = "{0002093E-0000-0000-C000-000000000046}";

  /**
   * Interface: EndnoteOptions
   */
  public final static String EndnoteOptions = "{BF043168-F4DE-4E7C-B206-741A8B3EF71A}";

  /**
   * Interface: Endnotes
   */
  public final static String Endnotes = "{00020941-0000-0000-C000-000000000046}";

  /**
   * Interface: Envelope
   */
  public final static String Envelope = "{00020918-0000-0000-C000-000000000046}";

  /**
   * Interface: Field
   */
  public final static String Field = "{0002092F-0000-0000-C000-000000000046}";

  /**
   * Interface: Fields
   */
  public final static String Fields = "{00020930-0000-0000-C000-000000000046}";

  /**
   * Interface: FileConverter
   */
  public final static String FileConverter = "{00020999-0000-0000-C000-000000000046}";

  /**
   * Interface: FileConverters
   */
  public final static String FileConverters = "{0002099A-0000-0000-C000-000000000046}";

  /**
   * Interface: FillFormat
   */
  public final static String FillFormat = "{000209C8-0000-0000-C000-000000000046}";

  /**
   * Interface: Find
   */
  public final static String Find = "{000209B0-0000-0000-C000-000000000046}";

  /**
   * Interface: FirstLetterException
   */
  public final static String FirstLetterException = "{00020945-0000-0000-C000-000000000046}";

  /**
   * Interface: FirstLetterExceptions
   */
  public final static String FirstLetterExceptions = "{00020946-0000-0000-C000-000000000046}";

  /**
   * Interface: FontNames
   */
  public final static String FontNames = "{0002096F-0000-0000-C000-000000000046}";

  /**
   * Interface: Footnote
   */
  public final static String Footnote = "{0002093F-0000-0000-C000-000000000046}";

  /**
   * Interface: FootnoteOptions
   */
  public final static String FootnoteOptions = "{BEA85A24-D7DA-4F3D-B58C-ED90FB01D615}";

  /**
   * Interface: Footnotes
   */
  public final static String Footnotes = "{00020942-0000-0000-C000-000000000046}";

  /**
   * Interface: FormField
   */
  public final static String FormField = "{00020928-0000-0000-C000-000000000046}";

  /**
   * Interface: FormFields
   */
  public final static String FormFields = "{00020929-0000-0000-C000-000000000046}";

  /**
   * Interface: Frame
   */
  public final static String Frame = "{0002092A-0000-0000-C000-000000000046}";

  /**
   * Interface: Frames
   */
  public final static String Frames = "{0002092B-0000-0000-C000-000000000046}";

  /**
   * Interface: Frameset
   */
  public final static String Frameset = "{000209E2-0000-0000-C000-000000000046}";

  /**
   * Interface: FreeformBuilder
   */
  public final static String FreeformBuilder = "{000209C9-0000-0000-C000-000000000046}";

  /**
   * Interface: GroupShapes
   */
  public final static String GroupShapes = "{000209B6-0000-0000-C000-000000000046}";

  /**
   * Interface: HTMLDivision
   */
  public final static String HTMLDivision = "{000209E7-0000-0000-C000-000000000046}";

  /**
   * Interface: HTMLDivisions
   */
  public final static String HTMLDivisions = "{000209E8-0000-0000-C000-000000000046}";

  /**
   * Interface: HangulAndAlphabetException
   */
  public final static String HangulAndAlphabetException = "{000209D2-0000-0000-C000-000000000046}";

  /**
   * Interface: HangulAndAlphabetExceptions
   */
  public final static String HangulAndAlphabetExceptions = "{000209D1-0000-0000-C000-000000000046}";

  /**
   * Interface: HangulHanjaConversionDictionaries
   */
  public final static String HangulHanjaConversionDictionaries = "{000209E0-0000-0000-C000-000000000046}";

  /**
   * Interface: HeaderFooter
   */
  public final static String HeaderFooter = "{00020985-0000-0000-C000-000000000046}";

  /**
   * Interface: HeadersFooters
   */
  public final static String HeadersFooters = "{00020984-0000-0000-C000-000000000046}";

  /**
   * Interface: HeadingStyle
   */
  public final static String HeadingStyle = "{0002098B-0000-0000-C000-000000000046}";

  /**
   * Interface: HeadingStyles
   */
  public final static String HeadingStyles = "{0002098A-0000-0000-C000-000000000046}";

  /**
   * Interface: HorizontalLineFormat
   */
  public final static String HorizontalLineFormat = "{000209DE-0000-0000-C000-000000000046}";

  /**
   * Interface: Hyperlink
   */
  public final static String Hyperlink = "{0002099D-0000-0000-C000-000000000046}";

  /**
   * Interface: Hyperlinks
   */
  public final static String Hyperlinks = "{0002099C-0000-0000-C000-000000000046}";

  /**
   * Interface: IApplicationEvents
   */
  public final static String IApplicationEvents = "{000209F7-0001-0000-C000-000000000046}";

  /**
   * Interface: IApplicationEvents2
   */
  public final static String IApplicationEvents2 = "{000209FE-0001-0000-C000-000000000046}";

  /**
   * Interface: IApplicationEvents3
   */
  public final static String IApplicationEvents3 = "{00020A00-0001-0000-C000-000000000046}";

  /**
   * Interface: IApplicationEvents4
   */
  public final static String IApplicationEvents4 = "{00020A01-0001-0000-C000-000000000046}";

  /**
   * Interface: Index
   */
  public final static String Index = "{0002097D-0000-0000-C000-000000000046}";

  /**
   * Interface: Indexes
   */
  public final static String Indexes = "{0002097C-0000-0000-C000-000000000046}";

  /**
   * Interface: InlineShape
   */
  public final static String InlineShape = "{000209A8-0000-0000-C000-000000000046}";

  /**
   * Interface: InlineShapes
   */
  public final static String InlineShapes = "{000209A9-0000-0000-C000-000000000046}";

  /**
   * Interface: KeyBinding
   */
  public final static String KeyBinding = "{00020998-0000-0000-C000-000000000046}";

  /**
   * Interface: KeyBindings
   */
  public final static String KeyBindings = "{00020996-0000-0000-C000-000000000046}";

  /**
   * Interface: KeysBoundTo
   */
  public final static String KeysBoundTo = "{00020997-0000-0000-C000-000000000046}";

  /**
   * Interface: Language
   */
  public final static String Language = "{0002096D-0000-0000-C000-000000000046}";

  /**
   * Interface: Languages
   */
  public final static String Languages = "{0002096E-0000-0000-C000-000000000046}";

  /**
   * Interface: Line
   */
  public final static String Line = "{AE6CE2F5-B9D3-407D-85A8-0F10C63289A4}";

  /**
   * Interface: LineFormat
   */
  public final static String LineFormat = "{000209CA-0000-0000-C000-000000000046}";

  /**
   * Interface: LineNumbering
   */
  public final static String LineNumbering = "{00020972-0000-0000-C000-000000000046}";

  /**
   * Interface: Lines
   */
  public final static String Lines = "{E2E8A400-0615-427D-ADCC-CAD39FFEBD42}";

  /**
   * Interface: LinkFormat
   */
  public final static String LinkFormat = "{00020931-0000-0000-C000-000000000046}";

  /**
   * Interface: List
   */
  public final static String List = "{00020992-0000-0000-C000-000000000046}";

  /**
   * Interface: ListEntries
   */
  public final static String ListEntries = "{00020924-0000-0000-C000-000000000046}";

  /**
   * Interface: ListEntry
   */
  public final static String ListEntry = "{00020923-0000-0000-C000-000000000046}";

  /**
   * Interface: ListFormat
   */
  public final static String ListFormat = "{000209C0-0000-0000-C000-000000000046}";

  /**
   * Interface: ListGalleries
   */
  public final static String ListGalleries = "{00020995-0000-0000-C000-000000000046}";

  /**
   * Interface: ListGallery
   */
  public final static String ListGallery = "{00020994-0000-0000-C000-000000000046}";

  /**
   * Interface: ListLevel
   */
  public final static String ListLevel = "{0002098D-0000-0000-C000-000000000046}";

  /**
   * Interface: ListLevels
   */
  public final static String ListLevels = "{0002098E-0000-0000-C000-000000000046}";

  /**
   * Interface: ListParagraphs
   */
  public final static String ListParagraphs = "{00020991-0000-0000-C000-000000000046}";

  /**
   * Interface: ListTemplate
   */
  public final static String ListTemplate = "{0002098F-0000-0000-C000-000000000046}";

  /**
   * Interface: ListTemplates
   */
  public final static String ListTemplates = "{00020990-0000-0000-C000-000000000046}";

  /**
   * Interface: Lists
   */
  public final static String Lists = "{00020993-0000-0000-C000-000000000046}";

  /**
   * Interface: MailMerge
   */
  public final static String MailMerge = "{00020920-0000-0000-C000-000000000046}";

  /**
   * Interface: MailMergeDataField
   */
  public final static String MailMergeDataField = "{00020919-0000-0000-C000-000000000046}";

  /**
   * Interface: MailMergeDataFields
   */
  public final static String MailMergeDataFields = "{0002091A-0000-0000-C000-000000000046}";

  /**
   * Interface: MailMergeDataSource
   */
  public final static String MailMergeDataSource = "{0002091D-0000-0000-C000-000000000046}";

  /**
   * Interface: MailMergeField
   */
  public final static String MailMergeField = "{0002091E-0000-0000-C000-000000000046}";

  /**
   * Interface: MailMergeFieldName
   */
  public final static String MailMergeFieldName = "{0002091B-0000-0000-C000-000000000046}";

  /**
   * Interface: MailMergeFieldNames
   */
  public final static String MailMergeFieldNames = "{0002091C-0000-0000-C000-000000000046}";

  /**
   * Interface: MailMergeFields
   */
  public final static String MailMergeFields = "{0002091F-0000-0000-C000-000000000046}";

  /**
   * Interface: MailMessage
   */
  public final static String MailMessage = "{000209BA-0000-0000-C000-000000000046}";

  /**
   * Interface: Mailer
   */
  public final static String Mailer = "{000209BD-0000-0000-C000-000000000046}";

  /**
   * Interface: MailingLabel
   */
  public final static String MailingLabel = "{00020917-0000-0000-C000-000000000046}";

  /**
   * Interface: MappedDataField
   */
  public final static String MappedDataField = "{5D311669-EA51-11D3-87CC-00105AA31A34}";

  /**
   * Interface: MappedDataFields
   */
  public final static String MappedDataFields = "{799A6814-EA41-11D3-87CC-00105AA31A34}";

  /**
   * Interface: OCXEvents
   */
  public final static String OCXEvents = "{000209F3-0000-0000-C000-000000000046}";

  /**
   * Interface: OLEFormat
   */
  public final static String OLEFormat = "{00020933-0000-0000-C000-000000000046}";

  /**
   * Interface: Options
   */
  public final static String Options = "{000209B7-0000-0000-C000-000000000046}";

  /**
   * Interface: OtherCorrectionsException
   */
  public final static String OtherCorrectionsException = "{000209E1-0000-0000-C000-000000000046}";

  /**
   * Interface: OtherCorrectionsExceptions
   */
  public final static String OtherCorrectionsExceptions = "{000209DF-0000-0000-C000-000000000046}";

  /**
   * Interface: Page
   */
  public final static String Page = "{352840A9-AF7D-4CA4-87FC-21C68FDAB3E4}";

  /**
   * Interface: PageNumber
   */
  public final static String PageNumber = "{00020987-0000-0000-C000-000000000046}";

  /**
   * Interface: PageNumbers
   */
  public final static String PageNumbers = "{00020986-0000-0000-C000-000000000046}";

  /**
   * Interface: PageSetup
   */
  public final static String PageSetup = "{00020971-0000-0000-C000-000000000046}";

  /**
   * Interface: Pages
   */
  public final static String Pages = "{91807402-6C6F-47CD-B8FA-C42FEE8EE924}";

  /**
   * Interface: Pane
   */
  public final static String Pane = "{00020960-0000-0000-C000-000000000046}";

  /**
   * Interface: Panes
   */
  public final static String Panes = "{0002095F-0000-0000-C000-000000000046}";

  /**
   * Interface: Paragraph
   */
  public final static String Paragraph = "{00020957-0000-0000-C000-000000000046}";

  /**
   * Interface: Paragraphs
   */
  public final static String Paragraphs = "{00020958-0000-0000-C000-000000000046}";

  /**
   * Interface: PictureFormat
   */
  public final static String PictureFormat = "{000209CB-0000-0000-C000-000000000046}";

  /**
   * Interface: ProofreadingErrors
   */
  public final static String ProofreadingErrors = "{000209BB-0000-0000-C000-000000000046}";

  /**
   * Interface: Range
   */
  public final static String Range = "{0002095E-0000-0000-C000-000000000046}";

  /**
   * Interface: ReadabilityStatistic
   */
  public final static String ReadabilityStatistic = "{000209AF-0000-0000-C000-000000000046}";

  /**
   * Interface: ReadabilityStatistics
   */
  public final static String ReadabilityStatistics = "{000209AE-0000-0000-C000-000000000046}";

  /**
   * Interface: RecentFile
   */
  public final static String RecentFile = "{00020964-0000-0000-C000-000000000046}";

  /**
   * Interface: RecentFiles
   */
  public final static String RecentFiles = "{00020963-0000-0000-C000-000000000046}";

  /**
   * Interface: Rectangle
   */
  public final static String Rectangle = "{ADD4EDF3-2F33-4734-9CE6-D476097C5ADA}";

  /**
   * Interface: Rectangles
   */
  public final static String Rectangles = "{7D0F7985-68D9-4D93-91CB-8109280E76CC}";

  /**
   * Interface: Replacement
   */
  public final static String Replacement = "{000209B1-0000-0000-C000-000000000046}";

  /**
   * Interface: Reviewer
   */
  public final static String Reviewer = "{47CEF4AE-DC32-4220-8AA5-19CCC0E6633A}";

  /**
   * Interface: Reviewers
   */
  public final static String Reviewers = "{12DCDC9A-5418-48A3-BBE6-EB57BAE275E8}";

  /**
   * Interface: Revision
   */
  public final static String Revision = "{00020981-0000-0000-C000-000000000046}";

  /**
   * Interface: Revisions
   */
  public final static String Revisions = "{00020980-0000-0000-C000-000000000046}";

  /**
   * Interface: RoutingSlip
   */
  public final static String RoutingSlip = "{00020969-0000-0000-C000-000000000046}";

  /**
   * Interface: Row
   */
  public final static String Row = "{00020950-0000-0000-C000-000000000046}";

  /**
   * Interface: Rows
   */
  public final static String Rows = "{0002094C-0000-0000-C000-000000000046}";

  /**
   * Interface: Section
   */
  public final static String Section = "{00020959-0000-0000-C000-000000000046}";

  /**
   * Interface: Sections
   */
  public final static String Sections = "{0002095A-0000-0000-C000-000000000046}";

  /**
   * Interface: Selection
   */
  public final static String Selection = "{00020975-0000-0000-C000-000000000046}";

  /**
   * Interface: Sentences
   */
  public final static String Sentences = "{0002095B-0000-0000-C000-000000000046}";

  /**
   * Interface: Shading
   */
  public final static String Shading = "{0002093A-0000-0000-C000-000000000046}";

  /**
   * Interface: ShadowFormat
   */
  public final static String ShadowFormat = "{000209CC-0000-0000-C000-000000000046}";

  /**
   * Interface: Shape
   */
  public final static String Shape = "{000209A0-0000-0000-C000-000000000046}";

  /**
   * Interface: ShapeNode
   */
  public final static String ShapeNode = "{000209CD-0000-0000-C000-000000000046}";

  /**
   * Interface: ShapeNodes
   */
  public final static String ShapeNodes = "{000209CE-0000-0000-C000-000000000046}";

  /**
   * Interface: ShapeRange
   */
  public final static String ShapeRange = "{000209B5-0000-0000-C000-000000000046}";

  /**
   * Interface: Shapes
   */
  public final static String Shapes = "{0002099F-0000-0000-C000-000000000046}";

  /**
   * Interface: SmartTag
   */
  public final static String SmartTag = "{000209ED-0000-0000-C000-000000000046}";

  /**
   * Interface: SmartTagAction
   */
  public final static String SmartTagAction = "{DFB6AA6C-1068-420F-969D-01280FCC1630}";

  /**
   * Interface: SmartTagActions
   */
  public final static String SmartTagActions = "{CDE12CD8-767B-4757-8A31-13029A086305}";

  /**
   * Interface: SmartTagRecognizer
   */
  public final static String SmartTagRecognizer = "{15EBE471-0182-4CCE-98D0-B6614D1C32A1}";

  /**
   * Interface: SmartTagRecognizers
   */
  public final static String SmartTagRecognizers = "{F2B60A10-DED5-46FB-A914-3C6F4EBB6451}";

  /**
   * Interface: SmartTagType
   */
  public final static String SmartTagType = "{5E9A888C-E5DC-4DCB-8308-3C91FB61E6F4}";

  /**
   * Interface: SmartTagTypes
   */
  public final static String SmartTagTypes = "{DB8E3072-E106-4453-8E7C-53056F1D30DC}";

  /**
   * Interface: SmartTags
   */
  public final static String SmartTags = "{000209EE-0000-0000-C000-000000000046}";

  /**
   * Interface: SpellingSuggestion
   */
  public final static String SpellingSuggestion = "{000209AB-0000-0000-C000-000000000046}";

  /**
   * Interface: SpellingSuggestions
   */
  public final static String SpellingSuggestions = "{000209AA-0000-0000-C000-000000000046}";

  /**
   * Interface: StoryRanges
   */
  public final static String StoryRanges = "{0002098C-0000-0000-C000-000000000046}";

  /**
   * Interface: Style
   */
  public final static String Style = "{0002092C-0000-0000-C000-000000000046}";

  /**
   * Interface: StyleSheet
   */
  public final static String StyleSheet = "{000209EF-0000-0000-C000-000000000046}";

  /**
   * Interface: StyleSheets
   */
  public final static String StyleSheets = "{07B7CC7E-E66C-11D3-9454-00105AA31A08}";

  /**
   * Interface: Styles
   */
  public final static String Styles = "{0002092D-0000-0000-C000-000000000046}";

  /**
   * Interface: Subdocument
   */
  public final static String Subdocument = "{00020989-0000-0000-C000-000000000046}";

  /**
   * Interface: Subdocuments
   */
  public final static String Subdocuments = "{00020988-0000-0000-C000-000000000046}";

  /**
   * Interface: SynonymInfo
   */
  public final static String SynonymInfo = "{0002099B-0000-0000-C000-000000000046}";

  /**
   * Interface: System
   */
  public final static String System = "{00020935-0000-0000-C000-000000000046}";

  /**
   * Interface: TabStop
   */
  public final static String TabStop = "{00020954-0000-0000-C000-000000000046}";

  /**
   * Interface: TabStops
   */
  public final static String TabStops = "{00020955-0000-0000-C000-000000000046}";

  /**
   * Interface: Table
   */
  public final static String Table = "{00020951-0000-0000-C000-000000000046}";

  /**
   * Interface: TableOfAuthorities
   */
  public final static String TableOfAuthorities = "{00020911-0000-0000-C000-000000000046}";

  /**
   * Interface: TableOfAuthoritiesCategory
   */
  public final static String TableOfAuthoritiesCategory = "{00020977-0000-0000-C000-000000000046}";

  /**
   * Interface: TableOfContents
   */
  public final static String TableOfContents = "{00020913-0000-0000-C000-000000000046}";

  /**
   * Interface: TableOfFigures
   */
  public final static String TableOfFigures = "{00020921-0000-0000-C000-000000000046}";

  /**
   * Interface: TableStyle
   */
  public final static String TableStyle = "{B7564E97-0519-4C68-B400-3803E7C63242}";

  /**
   * Interface: Tables
   */
  public final static String Tables = "{0002094D-0000-0000-C000-000000000046}";

  /**
   * Interface: TablesOfAuthorities
   */
  public final static String TablesOfAuthorities = "{00020912-0000-0000-C000-000000000046}";

  /**
   * Interface: TablesOfAuthoritiesCategories
   */
  public final static String TablesOfAuthoritiesCategories = "{00020976-0000-0000-C000-000000000046}";

  /**
   * Interface: TablesOfContents
   */
  public final static String TablesOfContents = "{00020914-0000-0000-C000-000000000046}";

  /**
   * Interface: TablesOfFigures
   */
  public final static String TablesOfFigures = "{00020922-0000-0000-C000-000000000046}";

  /**
   * Interface: Task
   */
  public final static String Task = "{00020982-0000-0000-C000-000000000046}";

  /**
   * Interface: TaskPane
   */
  public final static String TaskPane = "{B9F1A4E2-0D0A-43B7-8495-139E7ACBD840}";

  /**
   * Interface: TaskPanes
   */
  public final static String TaskPanes = "{E6AAEC05-E543-4085-BA92-9BF7D2474F5C}";

  /**
   * Interface: Tasks
   */
  public final static String Tasks = "{00020983-0000-0000-C000-000000000046}";

  /**
   * Interface: Template
   */
  public final static String Template = "{0002096A-0000-0000-C000-000000000046}";

  /**
   * Interface: Templates
   */
  public final static String Templates = "{000209A2-0000-0000-C000-000000000046}";

  /**
   * Interface: TextColumn
   */
  public final static String TextColumn = "{00020974-0000-0000-C000-000000000046}";

  /**
   * Interface: TextColumns
   */
  public final static String TextColumns = "{00020973-0000-0000-C000-000000000046}";

  /**
   * Interface: TextEffectFormat
   */
  public final static String TextEffectFormat = "{000209CF-0000-0000-C000-000000000046}";

  /**
   * Interface: TextFrame
   */
  public final static String TextFrame = "{000209B2-0000-0000-C000-000000000046}";

  /**
   * Interface: TextInput
   */
  public final static String TextInput = "{00020927-0000-0000-C000-000000000046}";

  /**
   * Interface: TextRetrievalMode
   */
  public final static String TextRetrievalMode = "{00020939-0000-0000-C000-000000000046}";

  /**
   * Interface: ThreeDFormat
   */
  public final static String ThreeDFormat = "{000209D0-0000-0000-C000-000000000046}";

  /**
   * Interface: TwoInitialCapsException
   */
  public final static String TwoInitialCapsException = "{00020943-0000-0000-C000-000000000046}";

  /**
   * Interface: TwoInitialCapsExceptions
   */
  public final static String TwoInitialCapsExceptions = "{00020944-0000-0000-C000-000000000046}";

  /**
   * Interface: Variable
   */
  public final static String Variable = "{00020966-0000-0000-C000-000000000046}";

  /**
   * Interface: Variables
   */
  public final static String Variables = "{00020965-0000-0000-C000-000000000046}";

  /**
   * Interface: Version
   */
  public final static String Version = "{000209B4-0000-0000-C000-000000000046}";

  /**
   * Interface: Versions
   */
  public final static String Versions = "{000209B3-0000-0000-C000-000000000046}";

  /**
   * Interface: View
   */
  public final static String View = "{000209A5-0000-0000-C000-000000000046}";

  /**
   * Interface: WebOptions
   */
  public final static String WebOptions = "{000209E4-0000-0000-C000-000000000046}";

  /**
   * Interface: Window
   */
  public final static String Window = "{00020962-0000-0000-C000-000000000046}";

  /**
   * Interface: Windows
   */
  public final static String Windows = "{00020961-0000-0000-C000-000000000046}";

  /**
   * Interface: Words
   */
  public final static String Words = "{0002095C-0000-0000-C000-000000000046}";

  /**
   * Interface: WrapFormat
   */
  public final static String WrapFormat = "{000209C3-0000-0000-C000-000000000046}";

  /**
   * Interface: XMLChildNodeSuggestion
   */
  public final static String XMLChildNodeSuggestion = "{A87E00E9-3AC3-4B53-ABE3-7379653D0E82}";

  /**
   * Interface: XMLChildNodeSuggestions
   */
  public final static String XMLChildNodeSuggestions = "{DE63B5AC-CA4F-46FE-9184-A5719AB9ED5B}";

  /**
   * Interface: XMLNamespace
   */
  public final static String XMLNamespace = "{B140A023-4850-4DA6-BC5F-CC459C4507BC}";

  /**
   * Interface: XMLNamespaces
   */
  public final static String XMLNamespaces = "{656BBED7-E82D-4B0A-8F97-EC742BA11FFA}";

  /**
   * Interface: XMLNode
   */
  public final static String XMLNode = "{09760240-0B89-49F7-A79D-479F24723F56}";

  /**
   * Interface: XMLNodes
   */
  public final static String XMLNodes = "{D36C1F42-7044-4B9E-9CA3-85919454DB04}";

  /**
   * Interface: XMLSchemaReference
   */
  public final static String XMLSchemaReference = "{FE0971F0-5E60-4985-BCDA-95CB0B8E0308}";

  /**
   * Interface: XMLSchemaReferences
   */
  public final static String XMLSchemaReferences = "{356B06EC-4908-42A4-81FC-4B5A51F3483B}";

  /**
   * Interface: XSLTransform
   */
  public final static String XSLTransform = "{E3124493-7D6A-410F-9A48-CC822C033CEC}";

  /**
   * Interface: XSLTransforms
   */
  public final static String XSLTransforms = "{C774F5EA-A539-4284-A1BE-30AEC052D899}";

  /**
   * Interface: Zoom
   */
  public final static String Zoom = "{000209A6-0000-0000-C000-000000000046}";

  /**
   * Interface: Zooms
   */
  public final static String Zooms = "{000209A7-0000-0000-C000-000000000046}";

  /**
   * Interface: _Application
   */
  public final static String _Application = "{00020970-0000-0000-C000-000000000046}";

  /**
   * Interface: _Document
   */
  public final static String _Document = "{0002096B-0000-0000-C000-000000000046}";

  /**
   * Interface: _Font
   */
  public final static String _Font = "{00020952-0000-0000-C000-000000000046}";

  /**
   * Interface: _Global
   */
  public final static String _Global = "{000209B9-0000-0000-C000-000000000046}";

  /**
   * Interface: _LetterContent
   */
  public final static String _LetterContent = "{000209A1-0000-0000-C000-000000000046}";

  /**
   * Interface: _OLEControl
   */
  public final static String _OLEControl = "{000209A4-0000-0000-C000-000000000046}";

  /**
   * Interface: _ParagraphFormat
   */
  public final static String _ParagraphFormat = "{00020953-0000-0000-C000-000000000046}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map<String,String> interfaces;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("AddIn", AddIn);
    v.put("AddIns", AddIns);
    v.put("Adjustments", Adjustments);
    v.put("ApplicationEvents", ApplicationEvents);
    v.put("ApplicationEvents2", ApplicationEvents2);
    v.put("ApplicationEvents3", ApplicationEvents3);
    v.put("ApplicationEvents4", ApplicationEvents4);
    v.put("AutoCaption", AutoCaption);
    v.put("AutoCaptions", AutoCaptions);
    v.put("AutoCorrect", AutoCorrect);
    v.put("AutoCorrectEntries", AutoCorrectEntries);
    v.put("AutoCorrectEntry", AutoCorrectEntry);
    v.put("AutoTextEntries", AutoTextEntries);
    v.put("AutoTextEntry", AutoTextEntry);
    v.put("Bookmark", Bookmark);
    v.put("Bookmarks", Bookmarks);
    v.put("Border", Border);
    v.put("Borders", Borders);
    v.put("Break", Break);
    v.put("Breaks", Breaks);
    v.put("Browser", Browser);
    v.put("CalloutFormat", CalloutFormat);
    v.put("CanvasShapes", CanvasShapes);
    v.put("CaptionLabel", CaptionLabel);
    v.put("CaptionLabels", CaptionLabels);
    v.put("Cell", Cell);
    v.put("Cells", Cells);
    v.put("Characters", Characters);
    v.put("CheckBox", CheckBox);
    v.put("ColorFormat", ColorFormat);
    v.put("Column", Column);
    v.put("Columns", Columns);
    v.put("Comment", Comment);
    v.put("Comments", Comments);
    v.put("ConditionalStyle", ConditionalStyle);
    v.put("ConnectorFormat", ConnectorFormat);
    v.put("CustomLabel", CustomLabel);
    v.put("CustomLabels", CustomLabels);
    v.put("CustomProperties", CustomProperties);
    v.put("CustomProperty", CustomProperty);
    v.put("DefaultWebOptions", DefaultWebOptions);
    v.put("Diagram", Diagram);
    v.put("DiagramNode", DiagramNode);
    v.put("DiagramNodeChildren", DiagramNodeChildren);
    v.put("DiagramNodes", DiagramNodes);
    v.put("Dialog", Dialog);
    v.put("Dialogs", Dialogs);
    v.put("Dictionaries", Dictionaries);
    v.put("Dictionary", Dictionary);
    v.put("DocumentEvents", DocumentEvents);
    v.put("DocumentEvents2", DocumentEvents2);
    v.put("Documents", Documents);
    v.put("DropCap", DropCap);
    v.put("DropDown", DropDown);
    v.put("Editor", Editor);
    v.put("Editors", Editors);
    v.put("Email", Email);
    v.put("EmailAuthor", EmailAuthor);
    v.put("EmailOptions", EmailOptions);
    v.put("EmailSignature", EmailSignature);
    v.put("EmailSignatureEntries", EmailSignatureEntries);
    v.put("EmailSignatureEntry", EmailSignatureEntry);
    v.put("Endnote", Endnote);
    v.put("EndnoteOptions", EndnoteOptions);
    v.put("Endnotes", Endnotes);
    v.put("Envelope", Envelope);
    v.put("Field", Field);
    v.put("Fields", Fields);
    v.put("FileConverter", FileConverter);
    v.put("FileConverters", FileConverters);
    v.put("FillFormat", FillFormat);
    v.put("Find", Find);
    v.put("FirstLetterException", FirstLetterException);
    v.put("FirstLetterExceptions", FirstLetterExceptions);
    v.put("FontNames", FontNames);
    v.put("Footnote", Footnote);
    v.put("FootnoteOptions", FootnoteOptions);
    v.put("Footnotes", Footnotes);
    v.put("FormField", FormField);
    v.put("FormFields", FormFields);
    v.put("Frame", Frame);
    v.put("Frames", Frames);
    v.put("Frameset", Frameset);
    v.put("FreeformBuilder", FreeformBuilder);
    v.put("GroupShapes", GroupShapes);
    v.put("HTMLDivision", HTMLDivision);
    v.put("HTMLDivisions", HTMLDivisions);
    v.put("HangulAndAlphabetException", HangulAndAlphabetException);
    v.put("HangulAndAlphabetExceptions", HangulAndAlphabetExceptions);
    v.put("HangulHanjaConversionDictionaries", HangulHanjaConversionDictionaries);
    v.put("HeaderFooter", HeaderFooter);
    v.put("HeadersFooters", HeadersFooters);
    v.put("HeadingStyle", HeadingStyle);
    v.put("HeadingStyles", HeadingStyles);
    v.put("HorizontalLineFormat", HorizontalLineFormat);
    v.put("Hyperlink", Hyperlink);
    v.put("Hyperlinks", Hyperlinks);
    v.put("IApplicationEvents", IApplicationEvents);
    v.put("IApplicationEvents2", IApplicationEvents2);
    v.put("IApplicationEvents3", IApplicationEvents3);
    v.put("IApplicationEvents4", IApplicationEvents4);
    v.put("Index", Index);
    v.put("Indexes", Indexes);
    v.put("InlineShape", InlineShape);
    v.put("InlineShapes", InlineShapes);
    v.put("KeyBinding", KeyBinding);
    v.put("KeyBindings", KeyBindings);
    v.put("KeysBoundTo", KeysBoundTo);
    v.put("Language", Language);
    v.put("Languages", Languages);
    v.put("Line", Line);
    v.put("LineFormat", LineFormat);
    v.put("LineNumbering", LineNumbering);
    v.put("Lines", Lines);
    v.put("LinkFormat", LinkFormat);
    v.put("List", List);
    v.put("ListEntries", ListEntries);
    v.put("ListEntry", ListEntry);
    v.put("ListFormat", ListFormat);
    v.put("ListGalleries", ListGalleries);
    v.put("ListGallery", ListGallery);
    v.put("ListLevel", ListLevel);
    v.put("ListLevels", ListLevels);
    v.put("ListParagraphs", ListParagraphs);
    v.put("ListTemplate", ListTemplate);
    v.put("ListTemplates", ListTemplates);
    v.put("Lists", Lists);
    v.put("MailMerge", MailMerge);
    v.put("MailMergeDataField", MailMergeDataField);
    v.put("MailMergeDataFields", MailMergeDataFields);
    v.put("MailMergeDataSource", MailMergeDataSource);
    v.put("MailMergeField", MailMergeField);
    v.put("MailMergeFieldName", MailMergeFieldName);
    v.put("MailMergeFieldNames", MailMergeFieldNames);
    v.put("MailMergeFields", MailMergeFields);
    v.put("MailMessage", MailMessage);
    v.put("Mailer", Mailer);
    v.put("MailingLabel", MailingLabel);
    v.put("MappedDataField", MappedDataField);
    v.put("MappedDataFields", MappedDataFields);
    v.put("OCXEvents", OCXEvents);
    v.put("OLEFormat", OLEFormat);
    v.put("Options", Options);
    v.put("OtherCorrectionsException", OtherCorrectionsException);
    v.put("OtherCorrectionsExceptions", OtherCorrectionsExceptions);
    v.put("Page", Page);
    v.put("PageNumber", PageNumber);
    v.put("PageNumbers", PageNumbers);
    v.put("PageSetup", PageSetup);
    v.put("Pages", Pages);
    v.put("Pane", Pane);
    v.put("Panes", Panes);
    v.put("Paragraph", Paragraph);
    v.put("Paragraphs", Paragraphs);
    v.put("PictureFormat", PictureFormat);
    v.put("ProofreadingErrors", ProofreadingErrors);
    v.put("Range", Range);
    v.put("ReadabilityStatistic", ReadabilityStatistic);
    v.put("ReadabilityStatistics", ReadabilityStatistics);
    v.put("RecentFile", RecentFile);
    v.put("RecentFiles", RecentFiles);
    v.put("Rectangle", Rectangle);
    v.put("Rectangles", Rectangles);
    v.put("Replacement", Replacement);
    v.put("Reviewer", Reviewer);
    v.put("Reviewers", Reviewers);
    v.put("Revision", Revision);
    v.put("Revisions", Revisions);
    v.put("RoutingSlip", RoutingSlip);
    v.put("Row", Row);
    v.put("Rows", Rows);
    v.put("Section", Section);
    v.put("Sections", Sections);
    v.put("Selection", Selection);
    v.put("Sentences", Sentences);
    v.put("Shading", Shading);
    v.put("ShadowFormat", ShadowFormat);
    v.put("Shape", Shape);
    v.put("ShapeNode", ShapeNode);
    v.put("ShapeNodes", ShapeNodes);
    v.put("ShapeRange", ShapeRange);
    v.put("Shapes", Shapes);
    v.put("SmartTag", SmartTag);
    v.put("SmartTagAction", SmartTagAction);
    v.put("SmartTagActions", SmartTagActions);
    v.put("SmartTagRecognizer", SmartTagRecognizer);
    v.put("SmartTagRecognizers", SmartTagRecognizers);
    v.put("SmartTagType", SmartTagType);
    v.put("SmartTagTypes", SmartTagTypes);
    v.put("SmartTags", SmartTags);
    v.put("SpellingSuggestion", SpellingSuggestion);
    v.put("SpellingSuggestions", SpellingSuggestions);
    v.put("StoryRanges", StoryRanges);
    v.put("Style", Style);
    v.put("StyleSheet", StyleSheet);
    v.put("StyleSheets", StyleSheets);
    v.put("Styles", Styles);
    v.put("Subdocument", Subdocument);
    v.put("Subdocuments", Subdocuments);
    v.put("SynonymInfo", SynonymInfo);
    v.put("System", System);
    v.put("TabStop", TabStop);
    v.put("TabStops", TabStops);
    v.put("Table", Table);
    v.put("TableOfAuthorities", TableOfAuthorities);
    v.put("TableOfAuthoritiesCategory", TableOfAuthoritiesCategory);
    v.put("TableOfContents", TableOfContents);
    v.put("TableOfFigures", TableOfFigures);
    v.put("TableStyle", TableStyle);
    v.put("Tables", Tables);
    v.put("TablesOfAuthorities", TablesOfAuthorities);
    v.put("TablesOfAuthoritiesCategories", TablesOfAuthoritiesCategories);
    v.put("TablesOfContents", TablesOfContents);
    v.put("TablesOfFigures", TablesOfFigures);
    v.put("Task", Task);
    v.put("TaskPane", TaskPane);
    v.put("TaskPanes", TaskPanes);
    v.put("Tasks", Tasks);
    v.put("Template", Template);
    v.put("Templates", Templates);
    v.put("TextColumn", TextColumn);
    v.put("TextColumns", TextColumns);
    v.put("TextEffectFormat", TextEffectFormat);
    v.put("TextFrame", TextFrame);
    v.put("TextInput", TextInput);
    v.put("TextRetrievalMode", TextRetrievalMode);
    v.put("ThreeDFormat", ThreeDFormat);
    v.put("TwoInitialCapsException", TwoInitialCapsException);
    v.put("TwoInitialCapsExceptions", TwoInitialCapsExceptions);
    v.put("Variable", Variable);
    v.put("Variables", Variables);
    v.put("Version", Version);
    v.put("Versions", Versions);
    v.put("View", View);
    v.put("WebOptions", WebOptions);
    v.put("Window", Window);
    v.put("Windows", Windows);
    v.put("Words", Words);
    v.put("WrapFormat", WrapFormat);
    v.put("XMLChildNodeSuggestion", XMLChildNodeSuggestion);
    v.put("XMLChildNodeSuggestions", XMLChildNodeSuggestions);
    v.put("XMLNamespace", XMLNamespace);
    v.put("XMLNamespaces", XMLNamespaces);
    v.put("XMLNode", XMLNode);
    v.put("XMLNodes", XMLNodes);
    v.put("XMLSchemaReference", XMLSchemaReference);
    v.put("XMLSchemaReferences", XMLSchemaReferences);
    v.put("XSLTransform", XSLTransform);
    v.put("XSLTransforms", XSLTransforms);
    v.put("Zoom", Zoom);
    v.put("Zooms", Zooms);
    v.put("_Application", _Application);
    v.put("_Document", _Document);
    v.put("_Font", _Font);
    v.put("_Global", _Global);
    v.put("_LetterContent", _LetterContent);
    v.put("_OLEControl", _OLEControl);
    v.put("_ParagraphFormat", _ParagraphFormat);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
