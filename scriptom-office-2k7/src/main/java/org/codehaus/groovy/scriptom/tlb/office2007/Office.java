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
package org.codehaus.groovy.scriptom.tlb.office2007;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class Office
{
  private Office()
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
   * </ul>
   */
  public final static Map<String,String> progIds;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

 /** GUID for this type library. */
  public static final String GUID = "{2DF8D04C-5BFA-101B-BDE5-00AA0044DE52}";

  /**
   * CoClass: CommandBarButton
   */
  public final static String CommandBarButton = "{000C030E-0000-0000-C000-000000000046}";

  /**
   * CoClass: CommandBarComboBox
   */
  public final static String CommandBarComboBox = "{000C030C-0000-0000-C000-000000000046}";

  /**
   * CoClass: CommandBars
   */
  public final static String CommandBars = "{000C0302-0000-0000-C000-000000000046}";

  /**
   * CoClass: CustomTaskPane
   */
  public final static String CustomTaskPane = "{000C033B-0000-0000-C000-000000000046}";

  /**
   * CoClass: CustomXMLPart
   */
  public final static String CustomXMLPart = "{000CDB05-0000-0000-C000-000000000046}";

  /**
   * CoClass: CustomXMLParts
   */
  public final static String CustomXMLParts = "{000CDB09-0000-0000-C000-000000000046}";

  /**
   * CoClass: CustomXMLSchemaCollection
   */
  public final static String CustomXMLSchemaCollection = "{000CDB02-0000-0000-C000-000000000046}";

  /**
   * CoClass: MsoEnvelope
   */
  public final static String MsoEnvelope = "{000672AC-0000-0000-C000-000000000046}";

  /**
   * A {@code Map} of CoClass names to default interface GUIDs for this type library.
   */
  public final static Map<String,String> coClasses;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("CommandBarButton", CommandBarButton);
    v.put("CommandBarComboBox", CommandBarComboBox);
    v.put("CommandBars", CommandBars);
    v.put("CustomTaskPane", CustomTaskPane);
    v.put("CustomXMLPart", CustomXMLPart);
    v.put("CustomXMLParts", CustomXMLParts);
    v.put("CustomXMLSchemaCollection", CustomXMLSchemaCollection);
    v.put("MsoEnvelope", MsoEnvelope);
    coClasses = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: Adjustments
   */
  public final static String Adjustments = "{000C0310-0000-0000-C000-000000000046}";

  /**
   * Interface: AnswerWizard
   */
  public final static String AnswerWizard = "{000C0360-0000-0000-C000-000000000046}";

  /**
   * Interface: AnswerWizardFiles
   */
  public final static String AnswerWizardFiles = "{000C0361-0000-0000-C000-000000000046}";

  /**
   * Interface: Assistant
   */
  public final static String Assistant = "{000C0322-0000-0000-C000-000000000046}";

  /**
   * Interface: Axes
   */
  public final static String Axes = "{000C1712-0000-0000-C000-000000000046}";

  /**
   * Interface: Balloon
   */
  public final static String Balloon = "{000C0324-0000-0000-C000-000000000046}";

  /**
   * Interface: BalloonCheckbox
   */
  public final static String BalloonCheckbox = "{000C0328-0000-0000-C000-000000000046}";

  /**
   * Interface: BalloonCheckboxes
   */
  public final static String BalloonCheckboxes = "{000C0326-0000-0000-C000-000000000046}";

  /**
   * Interface: BalloonLabel
   */
  public final static String BalloonLabel = "{000C0330-0000-0000-C000-000000000046}";

  /**
   * Interface: BalloonLabels
   */
  public final static String BalloonLabels = "{000C032E-0000-0000-C000-000000000046}";

  /**
   * Interface: BulletFormat2
   */
  public final static String BulletFormat2 = "{000C03B9-0000-0000-C000-000000000046}";

  /**
   * Interface: COMAddIn
   */
  public final static String COMAddIn = "{000C033A-0000-0000-C000-000000000046}";

  /**
   * Interface: COMAddIns
   */
  public final static String COMAddIns = "{000C0339-0000-0000-C000-000000000046}";

  /**
   * Interface: CalloutFormat
   */
  public final static String CalloutFormat = "{000C0311-0000-0000-C000-000000000046}";

  /**
   * Interface: CanvasShapes
   */
  public final static String CanvasShapes = "{000C0371-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartColorFormat
   */
  public final static String ChartColorFormat = "{000C171D-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartFillFormat
   */
  public final static String ChartFillFormat = "{000C171C-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartFont
   */
  public final static String ChartFont = "{000C1718-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartGroups
   */
  public final static String ChartGroups = "{000C172B-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartPoint
   */
  public final static String ChartPoint = "{000C170C-0000-0000-C000-000000000046}";

  /**
   * Interface: ColorFormat
   */
  public final static String ColorFormat = "{000C0312-0000-0000-C000-000000000046}";

  /**
   * Interface: CommandBar
   */
  public final static String CommandBar = "{000C0304-0000-0000-C000-000000000046}";

  /**
   * Interface: CommandBarControl
   */
  public final static String CommandBarControl = "{000C0308-0000-0000-C000-000000000046}";

  /**
   * Interface: CommandBarControls
   */
  public final static String CommandBarControls = "{000C0306-0000-0000-C000-000000000046}";

  /**
   * Interface: CommandBarPopup
   */
  public final static String CommandBarPopup = "{000C030A-0000-0000-C000-000000000046}";

  /**
   * Interface: ConnectorFormat
   */
  public final static String ConnectorFormat = "{000C0313-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomTaskPaneEvents
   */
  public final static String CustomTaskPaneEvents = "{8A64A872-FC6B-4D4A-926E-3A3689562C1C}";

  /**
   * Interface: CustomXMLNode
   */
  public final static String CustomXMLNode = "{000CDB04-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomXMLNodes
   */
  public final static String CustomXMLNodes = "{000CDB03-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomXMLPrefixMapping
   */
  public final static String CustomXMLPrefixMapping = "{000CDB10-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomXMLPrefixMappings
   */
  public final static String CustomXMLPrefixMappings = "{000CDB00-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomXMLSchema
   */
  public final static String CustomXMLSchema = "{000CDB01-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomXMLValidationError
   */
  public final static String CustomXMLValidationError = "{000CDB0E-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomXMLValidationErrors
   */
  public final static String CustomXMLValidationErrors = "{000CDB0F-0000-0000-C000-000000000046}";

  /**
   * Interface: DiagramNode
   */
  public final static String DiagramNode = "{000C0370-0000-0000-C000-000000000046}";

  /**
   * Interface: DiagramNodeChildren
   */
  public final static String DiagramNodeChildren = "{000C036F-0000-0000-C000-000000000046}";

  /**
   * Interface: DiagramNodes
   */
  public final static String DiagramNodes = "{000C036E-0000-0000-C000-000000000046}";

  /**
   * Interface: DocumentInspector
   */
  public final static String DocumentInspector = "{000C0393-0000-0000-C000-000000000046}";

  /**
   * Interface: DocumentInspectors
   */
  public final static String DocumentInspectors = "{000C0392-0000-0000-C000-000000000046}";

  /**
   * Interface: DocumentLibraryVersion
   */
  public final static String DocumentLibraryVersion = "{000C0387-0000-0000-C000-000000000046}";

  /**
   * Interface: DocumentLibraryVersions
   */
  public final static String DocumentLibraryVersions = "{000C0388-0000-0000-C000-000000000046}";

  /**
   * Interface: DocumentProperties
   */
  public final static String DocumentProperties = "{2DF8D04D-5BFA-101B-BDE5-00AA0044DE52}";

  /**
   * Interface: DocumentProperty
   */
  public final static String DocumentProperty = "{2DF8D04E-5BFA-101B-BDE5-00AA0044DE52}";

  /**
   * Interface: EncryptionProvider
   */
  public final static String EncryptionProvider = "{000CD809-0000-0000-C000-000000000046}";

  /**
   * Interface: FileDialog
   */
  public final static String FileDialog = "{000C0362-0000-0000-C000-000000000046}";

  /**
   * Interface: FileDialogFilter
   */
  public final static String FileDialogFilter = "{000C0364-0000-0000-C000-000000000046}";

  /**
   * Interface: FileDialogFilters
   */
  public final static String FileDialogFilters = "{000C0365-0000-0000-C000-000000000046}";

  /**
   * Interface: FileDialogSelectedItems
   */
  public final static String FileDialogSelectedItems = "{000C0363-0000-0000-C000-000000000046}";

  /**
   * Interface: FileSearch
   */
  public final static String FileSearch = "{000C0332-0000-0000-C000-000000000046}";

  /**
   * Interface: FileTypes
   */
  public final static String FileTypes = "{000C036C-0000-0000-C000-000000000046}";

  /**
   * Interface: FillFormat
   */
  public final static String FillFormat = "{000C0314-0000-0000-C000-000000000046}";

  /**
   * Interface: Font2
   */
  public final static String Font2 = "{000C039A-0000-0000-C000-000000000046}";

  /**
   * Interface: FoundFiles
   */
  public final static String FoundFiles = "{000C0331-0000-0000-C000-000000000046}";

  /**
   * Interface: FreeformBuilder
   */
  public final static String FreeformBuilder = "{000C0315-0000-0000-C000-000000000046}";

  /**
   * Interface: GlowFormat
   */
  public final static String GlowFormat = "{000C03BD-0000-0000-C000-000000000046}";

  /**
   * Interface: GradientStop
   */
  public final static String GradientStop = "{000C03BF-0000-0000-C000-000000000046}";

  /**
   * Interface: GradientStops
   */
  public final static String GradientStops = "{000C03C0-0000-0000-C000-000000000046}";

  /**
   * Interface: GridLines
   */
  public final static String GridLines = "{000C1725-0000-0000-C000-000000000046}";

  /**
   * Interface: GroupShapes
   */
  public final static String GroupShapes = "{000C0316-0000-0000-C000-000000000046}";

  /**
   * Interface: HTMLProject
   */
  public final static String HTMLProject = "{000C0356-0000-0000-C000-000000000046}";

  /**
   * Interface: HTMLProjectItem
   */
  public final static String HTMLProjectItem = "{000C0358-0000-0000-C000-000000000046}";

  /**
   * Interface: HTMLProjectItems
   */
  public final static String HTMLProjectItems = "{000C0357-0000-0000-C000-000000000046}";

  /**
   * Interface: IAccessible
   */
  public final static String IAccessible = "{618736E0-3C3D-11CF-810C-00AA00389B71}";

  /**
   * Interface: IAssistance
   */
  public final static String IAssistance = "{4291224C-DEFE-485B-8E69-6CF8AA85CB76}";

  /**
   * Interface: IBlogExtensibility
   */
  public final static String IBlogExtensibility = "{000C03C4-0000-0000-C000-000000000046}";

  /**
   * Interface: IBlogPictureExtensibility
   */
  public final static String IBlogPictureExtensibility = "{000C03C5-0000-0000-C000-000000000046}";

  /**
   * Interface: ICTPFactory
   */
  public final static String ICTPFactory = "{000C033D-0000-0000-C000-000000000046}";

  /**
   * Interface: ICommandBarButtonEvents
   */
  public final static String ICommandBarButtonEvents = "{55F88890-7708-11D1-ACEB-006008961DA5}";

  /**
   * Interface: ICommandBarComboBoxEvents
   */
  public final static String ICommandBarComboBoxEvents = "{55F88896-7708-11D1-ACEB-006008961DA5}";

  /**
   * Interface: ICommandBarsEvents
   */
  public final static String ICommandBarsEvents = "{55F88892-7708-11D1-ACEB-006008961DA5}";

  /**
   * Interface: ICustomTaskPaneConsumer
   */
  public final static String ICustomTaskPaneConsumer = "{000C033E-0000-0000-C000-000000000046}";

  /**
   * Interface: ICustomXMLPartEvents
   */
  public final static String ICustomXMLPartEvents = "{000CDB06-0000-0000-C000-000000000046}";

  /**
   * Interface: ICustomXMLPartsEvents
   */
  public final static String ICustomXMLPartsEvents = "{000CDB0A-0000-0000-C000-000000000046}";

  /**
   * Interface: IDocumentInspector
   */
  public final static String IDocumentInspector = "{000CD706-0000-0000-C000-000000000046}";

  /**
   * Interface: IFind
   */
  public final static String IFind = "{000C0337-0000-0000-C000-000000000046}";

  /**
   * Interface: IFoundFiles
   */
  public final static String IFoundFiles = "{000C0338-0000-0000-C000-000000000046}";

  /**
   * Interface: ILicAgent Interface
   */
  public final static String ILicAgent = "{00194002-D9C3-11D3-8D59-0050048384E3}";

  /**
   * Interface: ILicValidator
   */
  public final static String ILicValidator = "{919AA22C-B9AD-11D3-8D59-0050048384E3}";

  /**
   * Interface: ILicWizExternal
   */
  public final static String ILicWizExternal = "{4CAC6328-B9B0-11D3-8D59-0050048384E3}";

  /**
   * Interface: IMsoAxis
   */
  public final static String IMsoAxis = "{000C1713-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoAxisTitle
   */
  public final static String IMsoAxisTitle = "{ABFA087C-F703-4D53-946E-37FF82B2C994}";

  /**
   * Interface: IMsoBorder
   */
  public final static String IMsoBorder = "{000C1717-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoCharacters
   */
  public final static String IMsoCharacters = "{000C1731-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoChart
   */
  public final static String IMsoChart = "{000C1709-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoChartArea
   */
  public final static String IMsoChartArea = "{000C1728-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoChartData
   */
  public final static String IMsoChartData = "{000C172F-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoChartFormat
   */
  public final static String IMsoChartFormat = "{000C1730-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoChartGroup
   */
  public final static String IMsoChartGroup = "{000C1727-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoChartTitle
   */
  public final static String IMsoChartTitle = "{000C170F-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoCorners
   */
  public final static String IMsoCorners = "{000C1714-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoDataLabel
   */
  public final static String IMsoDataLabel = "{000C1720-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoDataLabels
   */
  public final static String IMsoDataLabels = "{000C171F-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoDataTable
   */
  public final static String IMsoDataTable = "{000C1711-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoDiagram
   */
  public final static String IMsoDiagram = "{000C036D-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoDispCagNotifySink
   */
  public final static String IMsoDispCagNotifySink = "{000C0359-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoDisplayUnitLabel
   */
  public final static String IMsoDisplayUnitLabel = "{6EA00553-9439-4D5A-B1E6-DC15A54DA8B2}";

  /**
   * Interface: IMsoDownBars
   */
  public final static String IMsoDownBars = "{000C172D-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoDropLines
   */
  public final static String IMsoDropLines = "{000C172C-0001-0000-C000-000000000046}";

  /**
   * Interface: IMsoEServicesDialog
   */
  public final static String IMsoEServicesDialog = "{000C0372-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoEnvelopeVB
   */
  public final static String IMsoEnvelopeVB = "{000672AC-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoEnvelopeVBEvents
   */
  public final static String IMsoEnvelopeVBEvents = "{000672AD-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoErrorBars
   */
  public final static String IMsoErrorBars = "{000C1721-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoFloor
   */
  public final static String IMsoFloor = "{000C1716-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoHiLoLines
   */
  public final static String IMsoHiLoLines = "{000C172E-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoHyperlinks
   */
  public final static String IMsoHyperlinks = "{A98639A1-CB0C-4A5C-A511-96547F752ACD}";

  /**
   * Interface: IMsoInterior
   */
  public final static String IMsoInterior = "{000C171B-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoLeaderLines
   */
  public final static String IMsoLeaderLines = "{000C1723-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoLegend
   */
  public final static String IMsoLegend = "{000C1710-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoLegendKey
   */
  public final static String IMsoLegendKey = "{000C171E-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoPlotArea
   */
  public final static String IMsoPlotArea = "{000C1724-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoSeries
   */
  public final static String IMsoSeries = "{000C170B-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoSeriesLines
   */
  public final static String IMsoSeriesLines = "{000C1729-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoTickLabels
   */
  public final static String IMsoTickLabels = "{000C1726-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoTrendline
   */
  public final static String IMsoTrendline = "{000C170E-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoUpBars
   */
  public final static String IMsoUpBars = "{000C172A-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoWalls
   */
  public final static String IMsoWalls = "{000C1715-0000-0000-C000-000000000046}";

  /**
   * Interface: IRibbonControl
   */
  public final static String IRibbonControl = "{000C0395-0000-0000-C000-000000000046}";

  /**
   * Interface: IRibbonExtensibility
   */
  public final static String IRibbonExtensibility = "{000C0396-0000-0000-C000-000000000046}";

  /**
   * Interface: IRibbonUI
   */
  public final static String IRibbonUI = "{000C03A7-0000-0000-C000-000000000046}";

  /**
   * Interface: LanguageSettings
   */
  public final static String LanguageSettings = "{000C0353-0000-0000-C000-000000000046}";

  /**
   * Interface: LegendEntries
   */
  public final static String LegendEntries = "{000C1719-0000-0000-C000-000000000046}";

  /**
   * Interface: LegendEntry
   */
  public final static String LegendEntry = "{000C171A-0000-0000-C000-000000000046}";

  /**
   * Interface: LineFormat
   */
  public final static String LineFormat = "{000C0317-0000-0000-C000-000000000046}";

  /**
   * Interface: MetaProperties
   */
  public final static String MetaProperties = "{000C038E-0000-0000-C000-000000000046}";

  /**
   * Interface: MetaProperty
   */
  public final static String MetaProperty = "{000C038F-0000-0000-C000-000000000046}";

  /**
   * Interface: MsoDebugOptions
   */
  public final static String MsoDebugOptions = "{000C035A-0000-0000-C000-000000000046}";

  /**
   * Interface: MsoDebugOptions_UT
   */
  public final static String MsoDebugOptions_UT = "{000C038B-0000-0000-C000-000000000046}";

  /**
   * Interface: MsoDebugOptions_UTManager
   */
  public final static String MsoDebugOptions_UTManager = "{000C0389-0000-0000-C000-000000000046}";

  /**
   * Interface: MsoDebugOptions_UTRunResult
   */
  public final static String MsoDebugOptions_UTRunResult = "{000C038C-0000-0000-C000-000000000046}";

  /**
   * Interface: MsoDebugOptions_UTs
   */
  public final static String MsoDebugOptions_UTs = "{000C038A-0000-0000-C000-000000000046}";

  /**
   * Interface: NewFile
   */
  public final static String NewFile = "{000C0936-0000-0000-C000-000000000046}";

  /**
   * Interface: ODSOColumn
   */
  public final static String ODSOColumn = "{000C1531-0000-0000-C000-000000000046}";

  /**
   * Interface: ODSOColumns
   */
  public final static String ODSOColumns = "{000C1532-0000-0000-C000-000000000046}";

  /**
   * Interface: ODSOFilter
   */
  public final static String ODSOFilter = "{000C1533-0000-0000-C000-000000000046}";

  /**
   * Interface: ODSOFilters
   */
  public final static String ODSOFilters = "{000C1534-0000-0000-C000-000000000046}";

  /**
   * Interface: OfficeDataSourceObject
   */
  public final static String OfficeDataSourceObject = "{000C1530-0000-0000-C000-000000000046}";

  /**
   * Interface: OfficeTheme
   */
  public final static String OfficeTheme = "{000C03A0-0000-0000-C000-000000000046}";

  /**
   * Interface: ParagraphFormat2
   */
  public final static String ParagraphFormat2 = "{000C0399-0000-0000-C000-000000000046}";

  /**
   * Interface: Permission
   */
  public final static String Permission = "{000C0376-0000-0000-C000-000000000046}";

  /**
   * Interface: PictureFormat
   */
  public final static String PictureFormat = "{000C031A-0000-0000-C000-000000000046}";

  /**
   * Interface: Points
   */
  public final static String Points = "{000C170D-0000-0000-C000-000000000046}";

  /**
   * Interface: PolicyItem
   */
  public final static String PolicyItem = "{000C0391-0000-0000-C000-000000000046}";

  /**
   * Interface: PropertyTest
   */
  public final static String PropertyTest = "{000C0333-0000-0000-C000-000000000046}";

  /**
   * Interface: PropertyTests
   */
  public final static String PropertyTests = "{000C0334-0000-0000-C000-000000000046}";

  /**
   * Interface: ReflectionFormat
   */
  public final static String ReflectionFormat = "{000C03BE-0000-0000-C000-000000000046}";

  /**
   * Interface: Ruler2
   */
  public final static String Ruler2 = "{000C03C1-0000-0000-C000-000000000046}";

  /**
   * Interface: RulerLevel2
   */
  public final static String RulerLevel2 = "{000C03C3-0000-0000-C000-000000000046}";

  /**
   * Interface: RulerLevels2
   */
  public final static String RulerLevels2 = "{000C03C2-0000-0000-C000-000000000046}";

  /**
   * Interface: ScopeFolder
   */
  public final static String ScopeFolder = "{000C0368-0000-0000-C000-000000000046}";

  /**
   * Interface: ScopeFolders
   */
  public final static String ScopeFolders = "{000C0369-0000-0000-C000-000000000046}";

  /**
   * Interface: Script
   */
  public final static String Script = "{000C0341-0000-0000-C000-000000000046}";

  /**
   * Interface: Scripts
   */
  public final static String Scripts = "{000C0340-0000-0000-C000-000000000046}";

  /**
   * Interface: SearchFolders
   */
  public final static String SearchFolders = "{000C036A-0000-0000-C000-000000000046}";

  /**
   * Interface: SearchScope
   */
  public final static String SearchScope = "{000C0367-0000-0000-C000-000000000046}";

  /**
   * Interface: SearchScopes
   */
  public final static String SearchScopes = "{000C0366-0000-0000-C000-000000000046}";

  /**
   * Interface: SeriesCollection
   */
  public final static String SeriesCollection = "{000C170A-0000-0000-C000-000000000046}";

  /**
   * Interface: ServerPolicy
   */
  public final static String ServerPolicy = "{000C0390-0000-0000-C000-000000000046}";

  /**
   * Interface: ShadowFormat
   */
  public final static String ShadowFormat = "{000C031B-0000-0000-C000-000000000046}";

  /**
   * Interface: Shape
   */
  public final static String Shape = "{000C031C-0000-0000-C000-000000000046}";

  /**
   * Interface: ShapeNode
   */
  public final static String ShapeNode = "{000C0318-0000-0000-C000-000000000046}";

  /**
   * Interface: ShapeNodes
   */
  public final static String ShapeNodes = "{000C0319-0000-0000-C000-000000000046}";

  /**
   * Interface: ShapeRange
   */
  public final static String ShapeRange = "{000C031D-0000-0000-C000-000000000046}";

  /**
   * Interface: Shapes
   */
  public final static String Shapes = "{000C031E-0000-0000-C000-000000000046}";

  /**
   * Interface: SharedWorkspace
   */
  public final static String SharedWorkspace = "{000C0385-0000-0000-C000-000000000046}";

  /**
   * Interface: SharedWorkspaceFile
   */
  public final static String SharedWorkspaceFile = "{000C037B-0000-0000-C000-000000000046}";

  /**
   * Interface: SharedWorkspaceFiles
   */
  public final static String SharedWorkspaceFiles = "{000C037C-0000-0000-C000-000000000046}";

  /**
   * Interface: SharedWorkspaceFolder
   */
  public final static String SharedWorkspaceFolder = "{000C037D-0000-0000-C000-000000000046}";

  /**
   * Interface: SharedWorkspaceFolders
   */
  public final static String SharedWorkspaceFolders = "{000C037E-0000-0000-C000-000000000046}";

  /**
   * Interface: SharedWorkspaceLink
   */
  public final static String SharedWorkspaceLink = "{000C037F-0000-0000-C000-000000000046}";

  /**
   * Interface: SharedWorkspaceLinks
   */
  public final static String SharedWorkspaceLinks = "{000C0380-0000-0000-C000-000000000046}";

  /**
   * Interface: SharedWorkspaceMember
   */
  public final static String SharedWorkspaceMember = "{000C0381-0000-0000-C000-000000000046}";

  /**
   * Interface: SharedWorkspaceMembers
   */
  public final static String SharedWorkspaceMembers = "{000C0382-0000-0000-C000-000000000046}";

  /**
   * Interface: SharedWorkspaceTask
   */
  public final static String SharedWorkspaceTask = "{000C0379-0000-0000-C000-000000000046}";

  /**
   * Interface: SharedWorkspaceTasks
   */
  public final static String SharedWorkspaceTasks = "{000C037A-0000-0000-C000-000000000046}";

  /**
   * Interface: Signature
   */
  public final static String Signature = "{000C0411-0000-0000-C000-000000000046}";

  /**
   * Interface: SignatureInfo
   */
  public final static String SignatureInfo = "{000CD6A2-0000-0000-C000-000000000046}";

  /**
   * Interface: SignatureProvider
   */
  public final static String SignatureProvider = "{000CD6A3-0000-0000-C000-000000000046}";

  /**
   * Interface: SignatureSet
   */
  public final static String SignatureSet = "{000C0410-0000-0000-C000-000000000046}";

  /**
   * Interface: SignatureSetup
   */
  public final static String SignatureSetup = "{000CD6A1-0000-0000-C000-000000000046}";

  /**
   * Interface: SmartDocument
   */
  public final static String SmartDocument = "{000C0377-0000-0000-C000-000000000046}";

  /**
   * Interface: SoftEdgeFormat
   */
  public final static String SoftEdgeFormat = "{000C03BC-0000-0000-C000-000000000046}";

  /**
   * Interface: Sync
   */
  public final static String Sync = "{000C0386-0000-0000-C000-000000000046}";

  /**
   * Interface: TabStop2
   */
  public final static String TabStop2 = "{000C03BB-0000-0000-C000-000000000046}";

  /**
   * Interface: TabStops2
   */
  public final static String TabStops2 = "{000C03BA-0000-0000-C000-000000000046}";

  /**
   * Interface: TextColumn2
   */
  public final static String TextColumn2 = "{000C03B2-0000-0000-C000-000000000046}";

  /**
   * Interface: TextEffectFormat
   */
  public final static String TextEffectFormat = "{000C031F-0000-0000-C000-000000000046}";

  /**
   * Interface: TextFrame
   */
  public final static String TextFrame = "{000C0320-0000-0000-C000-000000000046}";

  /**
   * Interface: TextFrame2
   */
  public final static String TextFrame2 = "{000C0398-0000-0000-C000-000000000046}";

  /**
   * Interface: TextRange2
   */
  public final static String TextRange2 = "{000C0397-0000-0000-C000-000000000046}";

  /**
   * Interface: ThemeColor
   */
  public final static String ThemeColor = "{000C03A1-0000-0000-C000-000000000046}";

  /**
   * Interface: ThemeColorScheme
   */
  public final static String ThemeColorScheme = "{000C03A2-0000-0000-C000-000000000046}";

  /**
   * Interface: ThemeEffectScheme
   */
  public final static String ThemeEffectScheme = "{000C03A6-0000-0000-C000-000000000046}";

  /**
   * Interface: ThemeFont
   */
  public final static String ThemeFont = "{000C03A3-0000-0000-C000-000000000046}";

  /**
   * Interface: ThemeFontScheme
   */
  public final static String ThemeFontScheme = "{000C03A5-0000-0000-C000-000000000046}";

  /**
   * Interface: ThemeFonts
   */
  public final static String ThemeFonts = "{000C03A4-0000-0000-C000-000000000046}";

  /**
   * Interface: ThreeDFormat
   */
  public final static String ThreeDFormat = "{000C0321-0000-0000-C000-000000000046}";

  /**
   * Interface: Trendlines
   */
  public final static String Trendlines = "{000C1722-0000-0000-C000-000000000046}";

  /**
   * Interface: UserPermission
   */
  public final static String UserPermission = "{000C0375-0000-0000-C000-000000000046}";

  /**
   * Interface: WebComponent
   */
  public final static String WebComponent = "{000CD100-0000-0000-C000-000000000046}";

  /**
   * Interface: WebComponentFormat
   */
  public final static String WebComponentFormat = "{000CD102-0000-0000-C000-000000000046}";

  /**
   * Interface: WebComponentProperties
   */
  public final static String WebComponentProperties = "{000C0373-0000-0000-C000-000000000046}";

  /**
   * Interface: WebComponentWindowExternal
   */
  public final static String WebComponentWindowExternal = "{000CD101-0000-0000-C000-000000000046}";

  /**
   * Interface: WebPageFont
   */
  public final static String WebPageFont = "{000C0913-0000-0000-C000-000000000046}";

  /**
   * Interface: WebPageFonts
   */
  public final static String WebPageFonts = "{000C0914-0000-0000-C000-000000000046}";

  /**
   * Interface: WorkflowTask
   */
  public final static String WorkflowTask = "{000CD900-0000-0000-C000-000000000046}";

  /**
   * Interface: WorkflowTasks
   */
  public final static String WorkflowTasks = "{000CD901-0000-0000-C000-000000000046}";

  /**
   * Interface: WorkflowTemplate
   */
  public final static String WorkflowTemplate = "{000CD902-0000-0000-C000-000000000046}";

  /**
   * Interface: WorkflowTemplates
   */
  public final static String WorkflowTemplates = "{000CD903-0000-0000-C000-000000000046}";

  /**
   * Interface: _CommandBarActiveX
   */
  public final static String _CommandBarActiveX = "{000C030D-0000-0000-C000-000000000046}";

  /**
   * Interface: _CommandBarButton
   */
  public final static String _CommandBarButton = "{000C030E-0000-0000-C000-000000000046}";

  /**
   * Interface: _CommandBarButtonEvents
   */
  public final static String _CommandBarButtonEvents = "{000C0351-0000-0000-C000-000000000046}";

  /**
   * Interface: _CommandBarComboBox
   */
  public final static String _CommandBarComboBox = "{000C030C-0000-0000-C000-000000000046}";

  /**
   * Interface: _CommandBarComboBoxEvents
   */
  public final static String _CommandBarComboBoxEvents = "{000C0354-0000-0000-C000-000000000046}";

  /**
   * Interface: _CommandBars
   */
  public final static String _CommandBars = "{000C0302-0000-0000-C000-000000000046}";

  /**
   * Interface: _CommandBarsEvents
   */
  public final static String _CommandBarsEvents = "{000C0352-0000-0000-C000-000000000046}";

  /**
   * Interface: _CustomTaskPane
   */
  public final static String _CustomTaskPane = "{000C033B-0000-0000-C000-000000000046}";

  /**
   * Interface: _CustomTaskPaneEvents
   */
  public final static String _CustomTaskPaneEvents = "{000C033C-0000-0000-C000-000000000046}";

  /**
   * Interface: _CustomXMLPart
   */
  public final static String _CustomXMLPart = "{000CDB05-0000-0000-C000-000000000046}";

  /**
   * Interface: _CustomXMLPartEvents
   */
  public final static String _CustomXMLPartEvents = "{000CDB07-0000-0000-C000-000000000046}";

  /**
   * Interface: _CustomXMLParts
   */
  public final static String _CustomXMLParts = "{000CDB09-0000-0000-C000-000000000046}";

  /**
   * Interface: _CustomXMLPartsEvents
   */
  public final static String _CustomXMLPartsEvents = "{000CDB0B-0000-0000-C000-000000000046}";

  /**
   * Interface: _CustomXMLSchemaCollection
   */
  public final static String _CustomXMLSchemaCollection = "{000CDB02-0000-0000-C000-000000000046}";

  /**
   * Interface: _IMsoDispObj
   */
  public final static String _IMsoDispObj = "{000C0300-0000-0000-C000-000000000046}";

  /**
   * Interface: _IMsoOleAccDispObj
   */
  public final static String _IMsoOleAccDispObj = "{000C0301-0000-0000-C000-000000000046}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map<String,String> interfaces;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Adjustments", Adjustments);
    v.put("AnswerWizard", AnswerWizard);
    v.put("AnswerWizardFiles", AnswerWizardFiles);
    v.put("Assistant", Assistant);
    v.put("Axes", Axes);
    v.put("Balloon", Balloon);
    v.put("BalloonCheckbox", BalloonCheckbox);
    v.put("BalloonCheckboxes", BalloonCheckboxes);
    v.put("BalloonLabel", BalloonLabel);
    v.put("BalloonLabels", BalloonLabels);
    v.put("BulletFormat2", BulletFormat2);
    v.put("COMAddIn", COMAddIn);
    v.put("COMAddIns", COMAddIns);
    v.put("CalloutFormat", CalloutFormat);
    v.put("CanvasShapes", CanvasShapes);
    v.put("ChartColorFormat", ChartColorFormat);
    v.put("ChartFillFormat", ChartFillFormat);
    v.put("ChartFont", ChartFont);
    v.put("ChartGroups", ChartGroups);
    v.put("ChartPoint", ChartPoint);
    v.put("ColorFormat", ColorFormat);
    v.put("CommandBar", CommandBar);
    v.put("CommandBarControl", CommandBarControl);
    v.put("CommandBarControls", CommandBarControls);
    v.put("CommandBarPopup", CommandBarPopup);
    v.put("ConnectorFormat", ConnectorFormat);
    v.put("CustomTaskPaneEvents", CustomTaskPaneEvents);
    v.put("CustomXMLNode", CustomXMLNode);
    v.put("CustomXMLNodes", CustomXMLNodes);
    v.put("CustomXMLPrefixMapping", CustomXMLPrefixMapping);
    v.put("CustomXMLPrefixMappings", CustomXMLPrefixMappings);
    v.put("CustomXMLSchema", CustomXMLSchema);
    v.put("CustomXMLValidationError", CustomXMLValidationError);
    v.put("CustomXMLValidationErrors", CustomXMLValidationErrors);
    v.put("DiagramNode", DiagramNode);
    v.put("DiagramNodeChildren", DiagramNodeChildren);
    v.put("DiagramNodes", DiagramNodes);
    v.put("DocumentInspector", DocumentInspector);
    v.put("DocumentInspectors", DocumentInspectors);
    v.put("DocumentLibraryVersion", DocumentLibraryVersion);
    v.put("DocumentLibraryVersions", DocumentLibraryVersions);
    v.put("DocumentProperties", DocumentProperties);
    v.put("DocumentProperty", DocumentProperty);
    v.put("EncryptionProvider", EncryptionProvider);
    v.put("FileDialog", FileDialog);
    v.put("FileDialogFilter", FileDialogFilter);
    v.put("FileDialogFilters", FileDialogFilters);
    v.put("FileDialogSelectedItems", FileDialogSelectedItems);
    v.put("FileSearch", FileSearch);
    v.put("FileTypes", FileTypes);
    v.put("FillFormat", FillFormat);
    v.put("Font2", Font2);
    v.put("FoundFiles", FoundFiles);
    v.put("FreeformBuilder", FreeformBuilder);
    v.put("GlowFormat", GlowFormat);
    v.put("GradientStop", GradientStop);
    v.put("GradientStops", GradientStops);
    v.put("GridLines", GridLines);
    v.put("GroupShapes", GroupShapes);
    v.put("HTMLProject", HTMLProject);
    v.put("HTMLProjectItem", HTMLProjectItem);
    v.put("HTMLProjectItems", HTMLProjectItems);
    v.put("IAccessible", IAccessible);
    v.put("IAssistance", IAssistance);
    v.put("IBlogExtensibility", IBlogExtensibility);
    v.put("IBlogPictureExtensibility", IBlogPictureExtensibility);
    v.put("ICTPFactory", ICTPFactory);
    v.put("ICommandBarButtonEvents", ICommandBarButtonEvents);
    v.put("ICommandBarComboBoxEvents", ICommandBarComboBoxEvents);
    v.put("ICommandBarsEvents", ICommandBarsEvents);
    v.put("ICustomTaskPaneConsumer", ICustomTaskPaneConsumer);
    v.put("ICustomXMLPartEvents", ICustomXMLPartEvents);
    v.put("ICustomXMLPartsEvents", ICustomXMLPartsEvents);
    v.put("IDocumentInspector", IDocumentInspector);
    v.put("IFind", IFind);
    v.put("IFoundFiles", IFoundFiles);
    v.put("ILicAgent", ILicAgent);
    v.put("ILicValidator", ILicValidator);
    v.put("ILicWizExternal", ILicWizExternal);
    v.put("IMsoAxis", IMsoAxis);
    v.put("IMsoAxisTitle", IMsoAxisTitle);
    v.put("IMsoBorder", IMsoBorder);
    v.put("IMsoCharacters", IMsoCharacters);
    v.put("IMsoChart", IMsoChart);
    v.put("IMsoChartArea", IMsoChartArea);
    v.put("IMsoChartData", IMsoChartData);
    v.put("IMsoChartFormat", IMsoChartFormat);
    v.put("IMsoChartGroup", IMsoChartGroup);
    v.put("IMsoChartTitle", IMsoChartTitle);
    v.put("IMsoCorners", IMsoCorners);
    v.put("IMsoDataLabel", IMsoDataLabel);
    v.put("IMsoDataLabels", IMsoDataLabels);
    v.put("IMsoDataTable", IMsoDataTable);
    v.put("IMsoDiagram", IMsoDiagram);
    v.put("IMsoDispCagNotifySink", IMsoDispCagNotifySink);
    v.put("IMsoDisplayUnitLabel", IMsoDisplayUnitLabel);
    v.put("IMsoDownBars", IMsoDownBars);
    v.put("IMsoDropLines", IMsoDropLines);
    v.put("IMsoEServicesDialog", IMsoEServicesDialog);
    v.put("IMsoEnvelopeVB", IMsoEnvelopeVB);
    v.put("IMsoEnvelopeVBEvents", IMsoEnvelopeVBEvents);
    v.put("IMsoErrorBars", IMsoErrorBars);
    v.put("IMsoFloor", IMsoFloor);
    v.put("IMsoHiLoLines", IMsoHiLoLines);
    v.put("IMsoHyperlinks", IMsoHyperlinks);
    v.put("IMsoInterior", IMsoInterior);
    v.put("IMsoLeaderLines", IMsoLeaderLines);
    v.put("IMsoLegend", IMsoLegend);
    v.put("IMsoLegendKey", IMsoLegendKey);
    v.put("IMsoPlotArea", IMsoPlotArea);
    v.put("IMsoSeries", IMsoSeries);
    v.put("IMsoSeriesLines", IMsoSeriesLines);
    v.put("IMsoTickLabels", IMsoTickLabels);
    v.put("IMsoTrendline", IMsoTrendline);
    v.put("IMsoUpBars", IMsoUpBars);
    v.put("IMsoWalls", IMsoWalls);
    v.put("IRibbonControl", IRibbonControl);
    v.put("IRibbonExtensibility", IRibbonExtensibility);
    v.put("IRibbonUI", IRibbonUI);
    v.put("LanguageSettings", LanguageSettings);
    v.put("LegendEntries", LegendEntries);
    v.put("LegendEntry", LegendEntry);
    v.put("LineFormat", LineFormat);
    v.put("MetaProperties", MetaProperties);
    v.put("MetaProperty", MetaProperty);
    v.put("MsoDebugOptions", MsoDebugOptions);
    v.put("MsoDebugOptions_UT", MsoDebugOptions_UT);
    v.put("MsoDebugOptions_UTManager", MsoDebugOptions_UTManager);
    v.put("MsoDebugOptions_UTRunResult", MsoDebugOptions_UTRunResult);
    v.put("MsoDebugOptions_UTs", MsoDebugOptions_UTs);
    v.put("NewFile", NewFile);
    v.put("ODSOColumn", ODSOColumn);
    v.put("ODSOColumns", ODSOColumns);
    v.put("ODSOFilter", ODSOFilter);
    v.put("ODSOFilters", ODSOFilters);
    v.put("OfficeDataSourceObject", OfficeDataSourceObject);
    v.put("OfficeTheme", OfficeTheme);
    v.put("ParagraphFormat2", ParagraphFormat2);
    v.put("Permission", Permission);
    v.put("PictureFormat", PictureFormat);
    v.put("Points", Points);
    v.put("PolicyItem", PolicyItem);
    v.put("PropertyTest", PropertyTest);
    v.put("PropertyTests", PropertyTests);
    v.put("ReflectionFormat", ReflectionFormat);
    v.put("Ruler2", Ruler2);
    v.put("RulerLevel2", RulerLevel2);
    v.put("RulerLevels2", RulerLevels2);
    v.put("ScopeFolder", ScopeFolder);
    v.put("ScopeFolders", ScopeFolders);
    v.put("Script", Script);
    v.put("Scripts", Scripts);
    v.put("SearchFolders", SearchFolders);
    v.put("SearchScope", SearchScope);
    v.put("SearchScopes", SearchScopes);
    v.put("SeriesCollection", SeriesCollection);
    v.put("ServerPolicy", ServerPolicy);
    v.put("ShadowFormat", ShadowFormat);
    v.put("Shape", Shape);
    v.put("ShapeNode", ShapeNode);
    v.put("ShapeNodes", ShapeNodes);
    v.put("ShapeRange", ShapeRange);
    v.put("Shapes", Shapes);
    v.put("SharedWorkspace", SharedWorkspace);
    v.put("SharedWorkspaceFile", SharedWorkspaceFile);
    v.put("SharedWorkspaceFiles", SharedWorkspaceFiles);
    v.put("SharedWorkspaceFolder", SharedWorkspaceFolder);
    v.put("SharedWorkspaceFolders", SharedWorkspaceFolders);
    v.put("SharedWorkspaceLink", SharedWorkspaceLink);
    v.put("SharedWorkspaceLinks", SharedWorkspaceLinks);
    v.put("SharedWorkspaceMember", SharedWorkspaceMember);
    v.put("SharedWorkspaceMembers", SharedWorkspaceMembers);
    v.put("SharedWorkspaceTask", SharedWorkspaceTask);
    v.put("SharedWorkspaceTasks", SharedWorkspaceTasks);
    v.put("Signature", Signature);
    v.put("SignatureInfo", SignatureInfo);
    v.put("SignatureProvider", SignatureProvider);
    v.put("SignatureSet", SignatureSet);
    v.put("SignatureSetup", SignatureSetup);
    v.put("SmartDocument", SmartDocument);
    v.put("SoftEdgeFormat", SoftEdgeFormat);
    v.put("Sync", Sync);
    v.put("TabStop2", TabStop2);
    v.put("TabStops2", TabStops2);
    v.put("TextColumn2", TextColumn2);
    v.put("TextEffectFormat", TextEffectFormat);
    v.put("TextFrame", TextFrame);
    v.put("TextFrame2", TextFrame2);
    v.put("TextRange2", TextRange2);
    v.put("ThemeColor", ThemeColor);
    v.put("ThemeColorScheme", ThemeColorScheme);
    v.put("ThemeEffectScheme", ThemeEffectScheme);
    v.put("ThemeFont", ThemeFont);
    v.put("ThemeFontScheme", ThemeFontScheme);
    v.put("ThemeFonts", ThemeFonts);
    v.put("ThreeDFormat", ThreeDFormat);
    v.put("Trendlines", Trendlines);
    v.put("UserPermission", UserPermission);
    v.put("WebComponent", WebComponent);
    v.put("WebComponentFormat", WebComponentFormat);
    v.put("WebComponentProperties", WebComponentProperties);
    v.put("WebComponentWindowExternal", WebComponentWindowExternal);
    v.put("WebPageFont", WebPageFont);
    v.put("WebPageFonts", WebPageFonts);
    v.put("WorkflowTask", WorkflowTask);
    v.put("WorkflowTasks", WorkflowTasks);
    v.put("WorkflowTemplate", WorkflowTemplate);
    v.put("WorkflowTemplates", WorkflowTemplates);
    v.put("_CommandBarActiveX", _CommandBarActiveX);
    v.put("_CommandBarButton", _CommandBarButton);
    v.put("_CommandBarButtonEvents", _CommandBarButtonEvents);
    v.put("_CommandBarComboBox", _CommandBarComboBox);
    v.put("_CommandBarComboBoxEvents", _CommandBarComboBoxEvents);
    v.put("_CommandBars", _CommandBars);
    v.put("_CommandBarsEvents", _CommandBarsEvents);
    v.put("_CustomTaskPane", _CustomTaskPane);
    v.put("_CustomTaskPaneEvents", _CustomTaskPaneEvents);
    v.put("_CustomXMLPart", _CustomXMLPart);
    v.put("_CustomXMLPartEvents", _CustomXMLPartEvents);
    v.put("_CustomXMLParts", _CustomXMLParts);
    v.put("_CustomXMLPartsEvents", _CustomXMLPartsEvents);
    v.put("_CustomXMLSchemaCollection", _CustomXMLSchemaCollection);
    v.put("_IMsoDispObj", _IMsoDispObj);
    v.put("_IMsoOleAccDispObj", _IMsoOleAccDispObj);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
