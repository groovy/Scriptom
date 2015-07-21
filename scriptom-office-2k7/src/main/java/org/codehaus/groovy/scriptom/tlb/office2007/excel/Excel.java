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
package org.codehaus.groovy.scriptom.tlb.office2007.excel;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class Excel
{
  private Excel()
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
   *   <li><b>Application</b> = Excel.Application</li>
   *   <li><b>Chart</b> = Excel.Chart</li>
   *   <li><b>Worksheet</b> = Excel.Sheet.8</li>
   * </ul>
   */
  public final static Map<String,String> progIds;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Application", "Excel.Application");
    v.put("Chart", "Excel.Chart");
    v.put("Worksheet", "Excel.Sheet.8");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

 /** GUID for this type library. */
  public static final String GUID = "{00020813-0000-0000-C000-000000000046}";

  /**
   * CoClass: Application
   */
  public final static String Application = "{000208D5-0000-0000-C000-000000000046}";

  /**
   * CoClass: Chart
   */
  public final static String Chart = "{000208D6-0000-0000-C000-000000000046}";

  /**
   * CoClass: Global
   */
  public final static String Global = "{000208D9-0000-0000-C000-000000000046}";

  /**
   * CoClass: OLEObject
   */
  public final static String OLEObject = "{000208A2-0000-0000-C000-000000000046}";

  /**
   * CoClass: QueryTable
   */
  public final static String QueryTable = "{00024428-0000-0000-C000-000000000046}";

  /**
   * CoClass: Workbook
   */
  public final static String Workbook = "{000208DA-0000-0000-C000-000000000046}";

  /**
   * CoClass: Worksheet
   */
  public final static String Worksheet = "{000208D8-0000-0000-C000-000000000046}";

  /**
   * A {@code Map} of CoClass names to default interface GUIDs for this type library.
   */
  public final static Map<String,String> coClasses;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Application", Application);
    v.put("Chart", Chart);
    v.put("Global", Global);
    v.put("OLEObject", OLEObject);
    v.put("QueryTable", QueryTable);
    v.put("Workbook", Workbook);
    v.put("Worksheet", Worksheet);
    coClasses = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: AboveAverage
   */
  public final static String AboveAverage = "{0002449E-0000-0000-C000-000000000046}";

  /**
   * Interface: Action
   */
  public final static String Action = "{0002448F-0000-0000-C000-000000000046}";

  /**
   * Interface: Actions
   */
  public final static String Actions = "{00024490-0000-0000-C000-000000000046}";

  /**
   * Interface: AddIn
   */
  public final static String AddIn = "{00020857-0000-0000-C000-000000000046}";

  /**
   * Interface: AddIns
   */
  public final static String AddIns = "{00020858-0000-0000-C000-000000000046}";

  /**
   * Interface: Adjustments
   */
  public final static String Adjustments = "{000C0310-0000-0000-C000-000000000046}";

  /**
   * Interface: AllowEditRange
   */
  public final static String AllowEditRange = "{0002446B-0000-0000-C000-000000000046}";

  /**
   * Interface: AllowEditRanges
   */
  public final static String AllowEditRanges = "{0002446A-0000-0000-C000-000000000046}";

  /**
   * Interface: AppEvents
   */
  public final static String AppEvents = "{00024413-0000-0000-C000-000000000046}";

  /**
   * Interface: Arc
   */
  public final static String Arc = "{000208A0-0000-0000-C000-000000000046}";

  /**
   * Interface: Arcs
   */
  public final static String Arcs = "{000208A1-0000-0000-C000-000000000046}";

  /**
   * Interface: Areas
   */
  public final static String Areas = "{00020860-0000-0000-C000-000000000046}";

  /**
   * Interface: AutoCorrect
   */
  public final static String AutoCorrect = "{000208D4-0000-0000-C000-000000000046}";

  /**
   * Interface: AutoFilter
   */
  public final static String AutoFilter = "{00024432-0000-0000-C000-000000000046}";

  /**
   * Interface: AutoRecover
   */
  public final static String AutoRecover = "{0002445A-0000-0000-C000-000000000046}";

  /**
   * Interface: Axes
   */
  public final static String Axes = "{0002085B-0000-0000-C000-000000000046}";

  /**
   * Interface: Axis
   */
  public final static String Axis = "{00020848-0000-0000-C000-000000000046}";

  /**
   * Interface: AxisTitle
   */
  public final static String AxisTitle = "{0002084A-0000-0000-C000-000000000046}";

  /**
   * Interface: Border
   */
  public final static String Border = "{00020854-0000-0000-C000-000000000046}";

  /**
   * Interface: Borders
   */
  public final static String Borders = "{00020855-0000-0000-C000-000000000046}";

  /**
   * Interface: Button
   */
  public final static String Button = "{0002087D-0000-0000-C000-000000000046}";

  /**
   * Interface: Buttons
   */
  public final static String Buttons = "{0002087E-0000-0000-C000-000000000046}";

  /**
   * Interface: CalculatedFields
   */
  public final static String CalculatedFields = "{00024420-0000-0000-C000-000000000046}";

  /**
   * Interface: CalculatedItems
   */
  public final static String CalculatedItems = "{00024421-0000-0000-C000-000000000046}";

  /**
   * Interface: CalculatedMember
   */
  public final static String CalculatedMember = "{00024455-0000-0000-C000-000000000046}";

  /**
   * Interface: CalculatedMembers
   */
  public final static String CalculatedMembers = "{00024454-0000-0000-C000-000000000046}";

  /**
   * Interface: CalloutFormat
   */
  public final static String CalloutFormat = "{000C0311-0000-0000-C000-000000000046}";

  /**
   * Interface: CellFormat
   */
  public final static String CellFormat = "{00024450-0000-0000-C000-000000000046}";

  /**
   * Interface: Characters
   */
  public final static String Characters = "{00020878-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartArea
   */
  public final static String ChartArea = "{000208CC-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartColorFormat
   */
  public final static String ChartColorFormat = "{00024436-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartEvents
   */
  public final static String ChartEvents = "{0002440F-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartFillFormat
   */
  public final static String ChartFillFormat = "{00024435-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartFormat
   */
  public final static String ChartFormat = "{000244B2-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartGroup
   */
  public final static String ChartGroup = "{00020859-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartGroups
   */
  public final static String ChartGroups = "{0002085A-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartObject
   */
  public final static String ChartObject = "{000208CF-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartObjects
   */
  public final static String ChartObjects = "{000208D0-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartTitle
   */
  public final static String ChartTitle = "{00020849-0000-0000-C000-000000000046}";

  /**
   * Interface: ChartView
   */
  public final static String ChartView = "{00024488-0000-0000-C000-000000000046}";

  /**
   * Interface: Charts
   */
  public final static String Charts = "{0002086D-0000-0000-C000-000000000046}";

  /**
   * Interface: CheckBox
   */
  public final static String CheckBox = "{0002087F-0000-0000-C000-000000000046}";

  /**
   * Interface: CheckBoxes
   */
  public final static String CheckBoxes = "{00020880-0000-0000-C000-000000000046}";

  /**
   * Interface: ColorFormat
   */
  public final static String ColorFormat = "{000C0312-0000-0000-C000-000000000046}";

  /**
   * Interface: ColorScale
   */
  public final static String ColorScale = "{00024493-0000-0000-C000-000000000046}";

  /**
   * Interface: ColorScaleCriteria
   */
  public final static String ColorScaleCriteria = "{00024494-0000-0000-C000-000000000046}";

  /**
   * Interface: ColorScaleCriterion
   */
  public final static String ColorScaleCriterion = "{00024495-0000-0000-C000-000000000046}";

  /**
   * Interface: ColorStop
   */
  public final static String ColorStop = "{000244AD-0000-0000-C000-000000000046}";

  /**
   * Interface: ColorStops
   */
  public final static String ColorStops = "{000244AE-0000-0000-C000-000000000046}";

  /**
   * Interface: Comment
   */
  public final static String Comment = "{00024427-0000-0000-C000-000000000046}";

  /**
   * Interface: Comments
   */
  public final static String Comments = "{00024426-0000-0000-C000-000000000046}";

  /**
   * Interface: ConditionValue
   */
  public final static String ConditionValue = "{00024492-0000-0000-C000-000000000046}";

  /**
   * Interface: Connections
   */
  public final static String Connections = "{00024486-0000-0000-C000-000000000046}";

  /**
   * Interface: ConnectorFormat
   */
  public final static String ConnectorFormat = "{0002443E-0000-0000-C000-000000000046}";

  /**
   * Interface: ControlFormat
   */
  public final static String ControlFormat = "{00024440-0000-0000-C000-000000000046}";

  /**
   * Interface: Corners
   */
  public final static String Corners = "{000208C0-0000-0000-C000-000000000046}";

  /**
   * Interface: CubeField
   */
  public final static String CubeField = "{0002444C-0000-0000-C000-000000000046}";

  /**
   * Interface: CubeFields
   */
  public final static String CubeFields = "{0002444D-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomProperties
   */
  public final static String CustomProperties = "{00024452-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomProperty
   */
  public final static String CustomProperty = "{00024453-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomView
   */
  public final static String CustomView = "{00024423-0000-0000-C000-000000000046}";

  /**
   * Interface: CustomViews
   */
  public final static String CustomViews = "{00024422-0000-0000-C000-000000000046}";

  /**
   * Interface: DataLabel
   */
  public final static String DataLabel = "{000208B2-0000-0000-C000-000000000046}";

  /**
   * Interface: DataLabels
   */
  public final static String DataLabels = "{000208B3-0000-0000-C000-000000000046}";

  /**
   * Interface: DataTable
   */
  public final static String DataTable = "{00020843-0000-0000-C000-000000000046}";

  /**
   * Interface: Databar
   */
  public final static String Databar = "{00024496-0000-0000-C000-000000000046}";

  /**
   * Interface: DefaultWebOptions
   */
  public final static String DefaultWebOptions = "{00024448-0000-0000-C000-000000000046}";

  /**
   * Interface: Diagram
   */
  public final static String Diagram = "{0002446F-0000-0000-C000-000000000046}";

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
   * Interface: Dialog
   */
  public final static String Dialog = "{0002087A-0000-0000-C000-000000000046}";

  /**
   * Interface: DialogFrame
   */
  public final static String DialogFrame = "{0002088F-0000-0000-C000-000000000046}";

  /**
   * Interface: DialogSheet
   */
  public final static String DialogSheet = "{000208AF-0000-0000-C000-000000000046}";

  /**
   * Interface: DialogSheetView
   */
  public final static String DialogSheetView = "{0002448A-0000-0000-C000-000000000046}";

  /**
   * Interface: DialogSheets
   */
  public final static String DialogSheets = "{000208B0-0000-0000-C000-000000000046}";

  /**
   * Interface: Dialogs
   */
  public final static String Dialogs = "{00020879-0000-0000-C000-000000000046}";

  /**
   * Interface: DisplayUnitLabel
   */
  public final static String DisplayUnitLabel = "{0002084C-0000-0000-C000-000000000046}";

  /**
   * Interface: DocEvents
   */
  public final static String DocEvents = "{00024411-0000-0000-C000-000000000046}";

  /**
   * Interface: DownBars
   */
  public final static String DownBars = "{000208C6-0000-0000-C000-000000000046}";

  /**
   * Interface: Drawing
   */
  public final static String Drawing = "{000208A8-0000-0000-C000-000000000046}";

  /**
   * Interface: DrawingObjects
   */
  public final static String DrawingObjects = "{0002086F-0000-0000-C000-000000000046}";

  /**
   * Interface: Drawings
   */
  public final static String Drawings = "{000208A9-0000-0000-C000-000000000046}";

  /**
   * Interface: DropDown
   */
  public final static String DropDown = "{0002088B-0000-0000-C000-000000000046}";

  /**
   * Interface: DropDowns
   */
  public final static String DropDowns = "{0002088C-0000-0000-C000-000000000046}";

  /**
   * Interface: DropLines
   */
  public final static String DropLines = "{000208C4-0000-0000-C000-000000000046}";

  /**
   * Interface: EditBox
   */
  public final static String EditBox = "{00020883-0000-0000-C000-000000000046}";

  /**
   * Interface: EditBoxes
   */
  public final static String EditBoxes = "{00020884-0000-0000-C000-000000000046}";

  /**
   * Interface: Error
   */
  public final static String Error = "{0002445D-0000-0000-C000-000000000046}";

  /**
   * Interface: ErrorBars
   */
  public final static String ErrorBars = "{000208CE-0000-0000-C000-000000000046}";

  /**
   * Interface: ErrorCheckingOptions
   */
  public final static String ErrorCheckingOptions = "{0002445B-0000-0000-C000-000000000046}";

  /**
   * Interface: Errors
   */
  public final static String Errors = "{0002445C-0000-0000-C000-000000000046}";

  /**
   * Interface: FillFormat
   */
  public final static String FillFormat = "{000C0314-0000-0000-C000-000000000046}";

  /**
   * Interface: Filter
   */
  public final static String Filter = "{00024434-0000-0000-C000-000000000046}";

  /**
   * Interface: Filters
   */
  public final static String Filters = "{00024433-0000-0000-C000-000000000046}";

  /**
   * Interface: Floor
   */
  public final static String Floor = "{000208C7-0000-0000-C000-000000000046}";

  /**
   * Interface: Font
   */
  public final static String Font = "{0002084D-0000-0000-C000-000000000046}";

  /**
   * Interface: FormatColor
   */
  public final static String FormatColor = "{00024491-0000-0000-C000-000000000046}";

  /**
   * Interface: FormatCondition
   */
  public final static String FormatCondition = "{00024425-0000-0000-C000-000000000046}";

  /**
   * Interface: FormatConditions
   */
  public final static String FormatConditions = "{00024424-0000-0000-C000-000000000046}";

  /**
   * Interface: FreeformBuilder
   */
  public final static String FreeformBuilder = "{0002443F-0000-0000-C000-000000000046}";

  /**
   * Interface: Graphic
   */
  public final static String Graphic = "{00024459-0000-0000-C000-000000000046}";

  /**
   * Interface: Gridlines
   */
  public final static String Gridlines = "{000208C3-0000-0000-C000-000000000046}";

  /**
   * Interface: GroupBox
   */
  public final static String GroupBox = "{00020889-0000-0000-C000-000000000046}";

  /**
   * Interface: GroupBoxes
   */
  public final static String GroupBoxes = "{0002088A-0000-0000-C000-000000000046}";

  /**
   * Interface: GroupObject
   */
  public final static String GroupObject = "{00020898-0000-0000-C000-000000000046}";

  /**
   * Interface: GroupObjects
   */
  public final static String GroupObjects = "{00020899-0000-0000-C000-000000000046}";

  /**
   * Interface: GroupShapes
   */
  public final static String GroupShapes = "{0002443C-0000-0000-C000-000000000046}";

  /**
   * Interface: HPageBreak
   */
  public final static String HPageBreak = "{00024401-0000-0000-C000-000000000046}";

  /**
   * Interface: HPageBreaks
   */
  public final static String HPageBreaks = "{00024404-0000-0000-C000-000000000046}";

  /**
   * Interface: HeaderFooter
   */
  public final static String HeaderFooter = "{000244A1-0000-0000-C000-000000000046}";

  /**
   * Interface: HiLoLines
   */
  public final static String HiLoLines = "{000208C2-0000-0000-C000-000000000046}";

  /**
   * Interface: Hyperlink
   */
  public final static String Hyperlink = "{00024431-0000-0000-C000-000000000046}";

  /**
   * Interface: Hyperlinks
   */
  public final static String Hyperlinks = "{00024430-0000-0000-C000-000000000046}";

  /**
   * Interface: IAboveAverage
   */
  public final static String IAboveAverage = "{0002449E-0001-0000-C000-000000000046}";

  /**
   * Interface: IAction
   */
  public final static String IAction = "{0002448F-0001-0000-C000-000000000046}";

  /**
   * Interface: IActions
   */
  public final static String IActions = "{00024490-0001-0000-C000-000000000046}";

  /**
   * Interface: IAddIn
   */
  public final static String IAddIn = "{00020857-0001-0000-C000-000000000046}";

  /**
   * Interface: IAddIns
   */
  public final static String IAddIns = "{00020858-0001-0000-C000-000000000046}";

  /**
   * Interface: IAllowEditRange
   */
  public final static String IAllowEditRange = "{0002446B-0001-0000-C000-000000000046}";

  /**
   * Interface: IAllowEditRanges
   */
  public final static String IAllowEditRanges = "{0002446A-0001-0000-C000-000000000046}";

  /**
   * Interface: IAppEvents
   */
  public final static String IAppEvents = "{00024413-0001-0000-C000-000000000046}";

  /**
   * Interface: IArc
   */
  public final static String IArc = "{000208A0-0001-0000-C000-000000000046}";

  /**
   * Interface: IArcs
   */
  public final static String IArcs = "{000208A1-0001-0000-C000-000000000046}";

  /**
   * Interface: IAreas
   */
  public final static String IAreas = "{00020860-0001-0000-C000-000000000046}";

  /**
   * Interface: IAutoCorrect
   */
  public final static String IAutoCorrect = "{000208D4-0001-0000-C000-000000000046}";

  /**
   * Interface: IAutoFilter
   */
  public final static String IAutoFilter = "{00024432-0001-0000-C000-000000000046}";

  /**
   * Interface: IAutoRecover
   */
  public final static String IAutoRecover = "{0002445A-0001-0000-C000-000000000046}";

  /**
   * Interface: IAxes
   */
  public final static String IAxes = "{0002085B-0001-0000-C000-000000000046}";

  /**
   * Interface: IAxis
   */
  public final static String IAxis = "{00020848-0001-0000-C000-000000000046}";

  /**
   * Interface: IAxisTitle
   */
  public final static String IAxisTitle = "{0002084A-0001-0000-C000-000000000046}";

  /**
   * Interface: IBorder
   */
  public final static String IBorder = "{00020854-0001-0000-C000-000000000046}";

  /**
   * Interface: IBorders
   */
  public final static String IBorders = "{00020855-0001-0000-C000-000000000046}";

  /**
   * Interface: IButton
   */
  public final static String IButton = "{0002087D-0001-0000-C000-000000000046}";

  /**
   * Interface: IButtons
   */
  public final static String IButtons = "{0002087E-0001-0000-C000-000000000046}";

  /**
   * Interface: ICalculatedFields
   */
  public final static String ICalculatedFields = "{00024420-0001-0000-C000-000000000046}";

  /**
   * Interface: ICalculatedItems
   */
  public final static String ICalculatedItems = "{00024421-0001-0000-C000-000000000046}";

  /**
   * Interface: ICalculatedMember
   */
  public final static String ICalculatedMember = "{00024455-0001-0000-C000-000000000046}";

  /**
   * Interface: ICalculatedMembers
   */
  public final static String ICalculatedMembers = "{00024454-0001-0000-C000-000000000046}";

  /**
   * Interface: ICanvasShapes
   */
  public final static String ICanvasShapes = "{0002444F-0001-0000-C000-000000000046}";

  /**
   * Interface: ICellFormat
   */
  public final static String ICellFormat = "{00024450-0001-0000-C000-000000000046}";

  /**
   * Interface: ICharacters
   */
  public final static String ICharacters = "{00020878-0001-0000-C000-000000000046}";

  /**
   * Interface: IChartArea
   */
  public final static String IChartArea = "{000208CC-0001-0000-C000-000000000046}";

  /**
   * Interface: IChartColorFormat
   */
  public final static String IChartColorFormat = "{00024436-0001-0000-C000-000000000046}";

  /**
   * Interface: IChartEvents
   */
  public final static String IChartEvents = "{0002440F-0001-0000-C000-000000000046}";

  /**
   * Interface: IChartFillFormat
   */
  public final static String IChartFillFormat = "{00024435-0001-0000-C000-000000000046}";

  /**
   * Interface: IChartFormat
   */
  public final static String IChartFormat = "{000244B2-0001-0000-C000-000000000046}";

  /**
   * Interface: IChartGroup
   */
  public final static String IChartGroup = "{00020859-0001-0000-C000-000000000046}";

  /**
   * Interface: IChartGroups
   */
  public final static String IChartGroups = "{0002085A-0001-0000-C000-000000000046}";

  /**
   * Interface: IChartObject
   */
  public final static String IChartObject = "{000208CF-0001-0000-C000-000000000046}";

  /**
   * Interface: IChartObjects
   */
  public final static String IChartObjects = "{000208D0-0001-0000-C000-000000000046}";

  /**
   * Interface: IChartTitle
   */
  public final static String IChartTitle = "{00020849-0001-0000-C000-000000000046}";

  /**
   * Interface: IChartView
   */
  public final static String IChartView = "{00024488-0001-0000-C000-000000000046}";

  /**
   * Interface: ICharts
   */
  public final static String ICharts = "{0002086D-0001-0000-C000-000000000046}";

  /**
   * Interface: ICheckBox
   */
  public final static String ICheckBox = "{0002087F-0001-0000-C000-000000000046}";

  /**
   * Interface: ICheckBoxes
   */
  public final static String ICheckBoxes = "{00020880-0001-0000-C000-000000000046}";

  /**
   * Interface: IColorScale
   */
  public final static String IColorScale = "{00024493-0001-0000-C000-000000000046}";

  /**
   * Interface: IColorScaleCriteria
   */
  public final static String IColorScaleCriteria = "{00024494-0001-0000-C000-000000000046}";

  /**
   * Interface: IColorScaleCriterion
   */
  public final static String IColorScaleCriterion = "{00024495-0001-0000-C000-000000000046}";

  /**
   * Interface: IColorStop
   */
  public final static String IColorStop = "{000244AD-0001-0000-C000-000000000046}";

  /**
   * Interface: IColorStops
   */
  public final static String IColorStops = "{000244AE-0001-0000-C000-000000000046}";

  /**
   * Interface: IComment
   */
  public final static String IComment = "{00024427-0001-0000-C000-000000000046}";

  /**
   * Interface: IComments
   */
  public final static String IComments = "{00024426-0001-0000-C000-000000000046}";

  /**
   * Interface: IConditionValue
   */
  public final static String IConditionValue = "{00024492-0001-0000-C000-000000000046}";

  /**
   * Interface: IConnections
   */
  public final static String IConnections = "{00024486-0001-0000-C000-000000000046}";

  /**
   * Interface: IConnectorFormat
   */
  public final static String IConnectorFormat = "{0002443E-0001-0000-C000-000000000046}";

  /**
   * Interface: IControlFormat
   */
  public final static String IControlFormat = "{00024440-0001-0000-C000-000000000046}";

  /**
   * Interface: ICorners
   */
  public final static String ICorners = "{000208C0-0001-0000-C000-000000000046}";

  /**
   * Interface: ICustomProperties
   */
  public final static String ICustomProperties = "{00024452-0001-0000-C000-000000000046}";

  /**
   * Interface: ICustomProperty
   */
  public final static String ICustomProperty = "{00024453-0001-0000-C000-000000000046}";

  /**
   * Interface: ICustomView
   */
  public final static String ICustomView = "{00024423-0001-0000-C000-000000000046}";

  /**
   * Interface: ICustomViews
   */
  public final static String ICustomViews = "{00024422-0001-0000-C000-000000000046}";

  /**
   * Interface: IDataLabel
   */
  public final static String IDataLabel = "{000208B2-0001-0000-C000-000000000046}";

  /**
   * Interface: IDataLabels
   */
  public final static String IDataLabels = "{000208B3-0001-0000-C000-000000000046}";

  /**
   * Interface: IDataTable
   */
  public final static String IDataTable = "{00020843-0001-0000-C000-000000000046}";

  /**
   * Interface: IDatabar
   */
  public final static String IDatabar = "{00024496-0001-0000-C000-000000000046}";

  /**
   * Interface: IDiagram
   */
  public final static String IDiagram = "{0002446F-0001-0000-C000-000000000046}";

  /**
   * Interface: IDialog
   */
  public final static String IDialog = "{0002087A-0001-0000-C000-000000000046}";

  /**
   * Interface: IDialogFrame
   */
  public final static String IDialogFrame = "{0002088F-0001-0000-C000-000000000046}";

  /**
   * Interface: IDialogSheet
   */
  public final static String IDialogSheet = "{000208AF-0001-0000-C000-000000000046}";

  /**
   * Interface: IDialogSheetView
   */
  public final static String IDialogSheetView = "{0002448A-0001-0000-C000-000000000046}";

  /**
   * Interface: IDialogSheets
   */
  public final static String IDialogSheets = "{000208B0-0001-0000-C000-000000000046}";

  /**
   * Interface: IDialogs
   */
  public final static String IDialogs = "{00020879-0001-0000-C000-000000000046}";

  /**
   * Interface: IDisplayUnitLabel
   */
  public final static String IDisplayUnitLabel = "{0002084C-0001-0000-C000-000000000046}";

  /**
   * Interface: IDocEvents
   */
  public final static String IDocEvents = "{00024411-0001-0000-C000-000000000046}";

  /**
   * Interface: IDownBars
   */
  public final static String IDownBars = "{000208C6-0001-0000-C000-000000000046}";

  /**
   * Interface: IDrawing
   */
  public final static String IDrawing = "{000208A8-0001-0000-C000-000000000046}";

  /**
   * Interface: IDrawingObjects
   */
  public final static String IDrawingObjects = "{0002086F-0001-0000-C000-000000000046}";

  /**
   * Interface: IDrawings
   */
  public final static String IDrawings = "{000208A9-0001-0000-C000-000000000046}";

  /**
   * Interface: IDropDown
   */
  public final static String IDropDown = "{0002088B-0001-0000-C000-000000000046}";

  /**
   * Interface: IDropDowns
   */
  public final static String IDropDowns = "{0002088C-0001-0000-C000-000000000046}";

  /**
   * Interface: IDropLines
   */
  public final static String IDropLines = "{000208C4-0001-0000-C000-000000000046}";

  /**
   * Interface: IDummy
   */
  public final static String IDummy = "{0002442E-0001-0000-C000-000000000046}";

  /**
   * Interface: IEditBox
   */
  public final static String IEditBox = "{00020883-0001-0000-C000-000000000046}";

  /**
   * Interface: IEditBoxes
   */
  public final static String IEditBoxes = "{00020884-0001-0000-C000-000000000046}";

  /**
   * Interface: IError
   */
  public final static String IError = "{0002445D-0001-0000-C000-000000000046}";

  /**
   * Interface: IErrorBars
   */
  public final static String IErrorBars = "{000208CE-0001-0000-C000-000000000046}";

  /**
   * Interface: IErrorCheckingOptions
   */
  public final static String IErrorCheckingOptions = "{0002445B-0001-0000-C000-000000000046}";

  /**
   * Interface: IErrors
   */
  public final static String IErrors = "{0002445C-0001-0000-C000-000000000046}";

  /**
   * Interface: IFilter
   */
  public final static String IFilter = "{00024434-0001-0000-C000-000000000046}";

  /**
   * Interface: IFilters
   */
  public final static String IFilters = "{00024433-0001-0000-C000-000000000046}";

  /**
   * Interface: IFloor
   */
  public final static String IFloor = "{000208C7-0001-0000-C000-000000000046}";

  /**
   * Interface: IFont
   */
  public final static String IFont = "{0002084D-0001-0000-C000-000000000046}";

  /**
   * Interface: IFormatColor
   */
  public final static String IFormatColor = "{00024491-0001-0000-C000-000000000046}";

  /**
   * Interface: IFormatCondition
   */
  public final static String IFormatCondition = "{00024425-0001-0000-C000-000000000046}";

  /**
   * Interface: IFormatConditions
   */
  public final static String IFormatConditions = "{00024424-0001-0000-C000-000000000046}";

  /**
   * Interface: IFreeformBuilder
   */
  public final static String IFreeformBuilder = "{0002443F-0001-0000-C000-000000000046}";

  /**
   * Interface: IGraphic
   */
  public final static String IGraphic = "{00024459-0001-0000-C000-000000000046}";

  /**
   * Interface: IGridlines
   */
  public final static String IGridlines = "{000208C3-0001-0000-C000-000000000046}";

  /**
   * Interface: IGroupBox
   */
  public final static String IGroupBox = "{00020889-0001-0000-C000-000000000046}";

  /**
   * Interface: IGroupBoxes
   */
  public final static String IGroupBoxes = "{0002088A-0001-0000-C000-000000000046}";

  /**
   * Interface: IGroupObject
   */
  public final static String IGroupObject = "{00020898-0001-0000-C000-000000000046}";

  /**
   * Interface: IGroupObjects
   */
  public final static String IGroupObjects = "{00020899-0001-0000-C000-000000000046}";

  /**
   * Interface: IGroupShapes
   */
  public final static String IGroupShapes = "{0002443C-0001-0000-C000-000000000046}";

  /**
   * Interface: IHPageBreak
   */
  public final static String IHPageBreak = "{00024401-0001-0000-C000-000000000046}";

  /**
   * Interface: IHPageBreaks
   */
  public final static String IHPageBreaks = "{00024404-0001-0000-C000-000000000046}";

  /**
   * Interface: IHeaderFooter
   */
  public final static String IHeaderFooter = "{000244A1-0001-0000-C000-000000000046}";

  /**
   * Interface: IHiLoLines
   */
  public final static String IHiLoLines = "{000208C2-0001-0000-C000-000000000046}";

  /**
   * Interface: IHyperlink
   */
  public final static String IHyperlink = "{00024431-0001-0000-C000-000000000046}";

  /**
   * Interface: IHyperlinks
   */
  public final static String IHyperlinks = "{00024430-0001-0000-C000-000000000046}";

  /**
   * Interface: IIcon
   */
  public final static String IIcon = "{0002449A-0001-0000-C000-000000000046}";

  /**
   * Interface: IIconCriteria
   */
  public final static String IIconCriteria = "{00024498-0001-0000-C000-000000000046}";

  /**
   * Interface: IIconCriterion
   */
  public final static String IIconCriterion = "{00024499-0001-0000-C000-000000000046}";

  /**
   * Interface: IIconSet
   */
  public final static String IIconSet = "{0002449B-0001-0000-C000-000000000046}";

  /**
   * Interface: IIconSetCondition
   */
  public final static String IIconSetCondition = "{00024497-0001-0000-C000-000000000046}";

  /**
   * Interface: IIconSets
   */
  public final static String IIconSets = "{0002449C-0001-0000-C000-000000000046}";

  /**
   * Interface: IInterior
   */
  public final static String IInterior = "{00020870-0001-0000-C000-000000000046}";

  /**
   * Interface: ILabel
   */
  public final static String ILabel = "{00020890-0001-0000-C000-000000000046}";

  /**
   * Interface: ILabels
   */
  public final static String ILabels = "{00020891-0001-0000-C000-000000000046}";

  /**
   * Interface: ILeaderLines
   */
  public final static String ILeaderLines = "{00024437-0001-0000-C000-000000000046}";

  /**
   * Interface: ILegend
   */
  public final static String ILegend = "{000208CD-0001-0000-C000-000000000046}";

  /**
   * Interface: ILegendEntries
   */
  public final static String ILegendEntries = "{000208BB-0001-0000-C000-000000000046}";

  /**
   * Interface: ILegendEntry
   */
  public final static String ILegendEntry = "{000208BA-0001-0000-C000-000000000046}";

  /**
   * Interface: ILegendKey
   */
  public final static String ILegendKey = "{000208BC-0001-0000-C000-000000000046}";

  /**
   * Interface: ILine
   */
  public final static String ILine = "{0002089A-0001-0000-C000-000000000046}";

  /**
   * Interface: ILinearGradient
   */
  public final static String ILinearGradient = "{000244AF-0001-0000-C000-000000000046}";

  /**
   * Interface: ILines
   */
  public final static String ILines = "{0002089B-0001-0000-C000-000000000046}";

  /**
   * Interface: ILinkFormat
   */
  public final static String ILinkFormat = "{00024442-0001-0000-C000-000000000046}";

  /**
   * Interface: IListBox
   */
  public final static String IListBox = "{00020887-0001-0000-C000-000000000046}";

  /**
   * Interface: IListBoxes
   */
  public final static String IListBoxes = "{00020888-0001-0000-C000-000000000046}";

  /**
   * Interface: IListColumn
   */
  public final static String IListColumn = "{00024473-0001-0000-C000-000000000046}";

  /**
   * Interface: IListColumns
   */
  public final static String IListColumns = "{00024472-0001-0000-C000-000000000046}";

  /**
   * Interface: IListDataFormat
   */
  public final static String IListDataFormat = "{0002447D-0001-0000-C000-000000000046}";

  /**
   * Interface: IListObject
   */
  public final static String IListObject = "{00024471-0001-0000-C000-000000000046}";

  /**
   * Interface: IListObjects
   */
  public final static String IListObjects = "{00024470-0001-0000-C000-000000000046}";

  /**
   * Interface: IListRow
   */
  public final static String IListRow = "{00024475-0001-0000-C000-000000000046}";

  /**
   * Interface: IListRows
   */
  public final static String IListRows = "{00024474-0001-0000-C000-000000000046}";

  /**
   * Interface: IMailer
   */
  public final static String IMailer = "{000208D1-0001-0000-C000-000000000046}";

  /**
   * Interface: IMenu
   */
  public final static String IMenu = "{00020866-0001-0000-C000-000000000046}";

  /**
   * Interface: IMenuBar
   */
  public final static String IMenuBar = "{00020864-0001-0000-C000-000000000046}";

  /**
   * Interface: IMenuBars
   */
  public final static String IMenuBars = "{00020863-0001-0000-C000-000000000046}";

  /**
   * Interface: IMenuItem
   */
  public final static String IMenuItem = "{00020868-0001-0000-C000-000000000046}";

  /**
   * Interface: IMenuItems
   */
  public final static String IMenuItems = "{00020867-0001-0000-C000-000000000046}";

  /**
   * Interface: IMenus
   */
  public final static String IMenus = "{00020865-0001-0000-C000-000000000046}";

  /**
   * Interface: IModule
   */
  public final static String IModule = "{000208AD-0001-0000-C000-000000000046}";

  /**
   * Interface: IModuleView
   */
  public final static String IModuleView = "{00024489-0001-0000-C000-000000000046}";

  /**
   * Interface: IModules
   */
  public final static String IModules = "{000208AE-0001-0000-C000-000000000046}";

  /**
   * Interface: IMultiThreadedCalculation
   */
  public final static String IMultiThreadedCalculation = "{000244B1-0001-0000-C000-000000000046}";

  /**
   * Interface: IName
   */
  public final static String IName = "{000208B9-0001-0000-C000-000000000046}";

  /**
   * Interface: INames
   */
  public final static String INames = "{000208B8-0001-0000-C000-000000000046}";

  /**
   * Interface: IODBCConnection
   */
  public final static String IODBCConnection = "{0002448E-0001-0000-C000-000000000046}";

  /**
   * Interface: IODBCError
   */
  public final static String IODBCError = "{0002442C-0001-0000-C000-000000000046}";

  /**
   * Interface: IODBCErrors
   */
  public final static String IODBCErrors = "{0002442D-0001-0000-C000-000000000046}";

  /**
   * Interface: IOLEDBConnection
   */
  public final static String IOLEDBConnection = "{0002448D-0001-0000-C000-000000000046}";

  /**
   * Interface: IOLEDBError
   */
  public final static String IOLEDBError = "{00024445-0001-0000-C000-000000000046}";

  /**
   * Interface: IOLEDBErrors
   */
  public final static String IOLEDBErrors = "{00024446-0001-0000-C000-000000000046}";

  /**
   * Interface: IOLEFormat
   */
  public final static String IOLEFormat = "{00024441-0001-0000-C000-000000000046}";

  /**
   * Interface: IOLEObjectEvents
   */
  public final static String IOLEObjectEvents = "{00024410-0001-0000-C000-000000000046}";

  /**
   * Interface: IOLEObjects
   */
  public final static String IOLEObjects = "{000208A3-0001-0000-C000-000000000046}";

  /**
   * Interface: IOptionButton
   */
  public final static String IOptionButton = "{00020881-0001-0000-C000-000000000046}";

  /**
   * Interface: IOptionButtons
   */
  public final static String IOptionButtons = "{00020882-0001-0000-C000-000000000046}";

  /**
   * Interface: IOutline
   */
  public final static String IOutline = "{000208AB-0001-0000-C000-000000000046}";

  /**
   * Interface: IOval
   */
  public final static String IOval = "{0002089E-0001-0000-C000-000000000046}";

  /**
   * Interface: IOvals
   */
  public final static String IOvals = "{0002089F-0001-0000-C000-000000000046}";

  /**
   * Interface: IPage
   */
  public final static String IPage = "{000244A2-0001-0000-C000-000000000046}";

  /**
   * Interface: IPageSetup
   */
  public final static String IPageSetup = "{000208B4-0001-0000-C000-000000000046}";

  /**
   * Interface: IPages
   */
  public final static String IPages = "{000244A3-0001-0000-C000-000000000046}";

  /**
   * Interface: IPane
   */
  public final static String IPane = "{00020895-0001-0000-C000-000000000046}";

  /**
   * Interface: IPanes
   */
  public final static String IPanes = "{00020894-0001-0000-C000-000000000046}";

  /**
   * Interface: IParameter
   */
  public final static String IParameter = "{0002442A-0001-0000-C000-000000000046}";

  /**
   * Interface: IParameters
   */
  public final static String IParameters = "{0002442B-0001-0000-C000-000000000046}";

  /**
   * Interface: IPhonetic
   */
  public final static String IPhonetic = "{00024438-0001-0000-C000-000000000046}";

  /**
   * Interface: IPhonetics
   */
  public final static String IPhonetics = "{00024447-0001-0000-C000-000000000046}";

  /**
   * Interface: IPicture
   */
  public final static String IPicture = "{000208A6-0001-0000-C000-000000000046}";

  /**
   * Interface: IPictures
   */
  public final static String IPictures = "{000208A7-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotAxis
   */
  public final static String IPivotAxis = "{00024482-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotCache
   */
  public final static String IPivotCache = "{0002441C-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotCaches
   */
  public final static String IPivotCaches = "{0002441D-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotCell
   */
  public final static String IPivotCell = "{00024458-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotField
   */
  public final static String IPivotField = "{00020874-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotFields
   */
  public final static String IPivotFields = "{00020875-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotFilter
   */
  public final static String IPivotFilter = "{00024483-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotFilters
   */
  public final static String IPivotFilters = "{00024484-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotFormula
   */
  public final static String IPivotFormula = "{0002441E-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotFormulas
   */
  public final static String IPivotFormulas = "{0002441F-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotItem
   */
  public final static String IPivotItem = "{00020876-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotItemList
   */
  public final static String IPivotItemList = "{00024468-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotItems
   */
  public final static String IPivotItems = "{00020877-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotLayout
   */
  public final static String IPivotLayout = "{0002444A-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotLine
   */
  public final static String IPivotLine = "{00024480-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotLineCells
   */
  public final static String IPivotLineCells = "{0002447F-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotLines
   */
  public final static String IPivotLines = "{00024481-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotTable
   */
  public final static String IPivotTable = "{00020872-0001-0000-C000-000000000046}";

  /**
   * Interface: IPivotTables
   */
  public final static String IPivotTables = "{00020873-0001-0000-C000-000000000046}";

  /**
   * Interface: IPlotArea
   */
  public final static String IPlotArea = "{000208CB-0001-0000-C000-000000000046}";

  /**
   * Interface: IPoint
   */
  public final static String IPoint = "{0002086A-0001-0000-C000-000000000046}";

  /**
   * Interface: IPoints
   */
  public final static String IPoints = "{00020869-0001-0000-C000-000000000046}";

  /**
   * Interface: IProtection
   */
  public final static String IProtection = "{00024467-0001-0000-C000-000000000046}";

  /**
   * Interface: IPublishObjects
   */
  public final static String IPublishObjects = "{00024443-0001-0000-C000-000000000046}";

  /**
   * Interface: IQueryTables
   */
  public final static String IQueryTables = "{00024429-0001-0000-C000-000000000046}";

  /**
   * Interface: IRTD
   */
  public final static String IRTD = "{0002446E-0001-0000-C000-000000000046}";

  /**
   * Interface: IRTDUpdateEvent
   */
  public final static String IRTDUpdateEvent = "{A43788C1-D91B-11D3-8F39-00C04F3651B8}";

  /**
   * Interface: IRange
   */
  public final static String IRange = "{00020846-0001-0000-C000-000000000046}";

  /**
   * Interface: IRanges
   */
  public final static String IRanges = "{000244A0-0001-0000-C000-000000000046}";

  /**
   * Interface: IRecentFile
   */
  public final static String IRecentFile = "{00024407-0001-0000-C000-000000000046}";

  /**
   * Interface: IRecentFiles
   */
  public final static String IRecentFiles = "{00024406-0001-0000-C000-000000000046}";

  /**
   * Interface: IRectangle
   */
  public final static String IRectangle = "{0002089C-0001-0000-C000-000000000046}";

  /**
   * Interface: IRectangles
   */
  public final static String IRectangles = "{0002089D-0001-0000-C000-000000000046}";

  /**
   * Interface: IRectangularGradient
   */
  public final static String IRectangularGradient = "{000244B0-0001-0000-C000-000000000046}";

  /**
   * Interface: IRefreshEvents
   */
  public final static String IRefreshEvents = "{0002441B-0001-0000-C000-000000000046}";

  /**
   * Interface: IResearch
   */
  public final static String IResearch = "{000244AC-0001-0000-C000-000000000046}";

  /**
   * Interface: IRoutingSlip
   */
  public final static String IRoutingSlip = "{000208AA-0001-0000-C000-000000000046}";

  /**
   * Interface: IRtdServer
   */
  public final static String IRtdServer = "{EC0E6191-DB51-11D3-8F3E-00C04F3651B8}";

  /**
   * Interface: IScenario
   */
  public final static String IScenario = "{00020897-0001-0000-C000-000000000046}";

  /**
   * Interface: IScenarios
   */
  public final static String IScenarios = "{00020896-0001-0000-C000-000000000046}";

  /**
   * Interface: IScrollBar
   */
  public final static String IScrollBar = "{00020885-0001-0000-C000-000000000046}";

  /**
   * Interface: IScrollBars
   */
  public final static String IScrollBars = "{00020886-0001-0000-C000-000000000046}";

  /**
   * Interface: ISeries
   */
  public final static String ISeries = "{0002086B-0001-0000-C000-000000000046}";

  /**
   * Interface: ISeriesCollection
   */
  public final static String ISeriesCollection = "{0002086C-0001-0000-C000-000000000046}";

  /**
   * Interface: ISeriesLines
   */
  public final static String ISeriesLines = "{000208C1-0001-0000-C000-000000000046}";

  /**
   * Interface: IServerViewableItems
   */
  public final static String IServerViewableItems = "{000244A4-0001-0000-C000-000000000046}";

  /**
   * Interface: IShape
   */
  public final static String IShape = "{00024439-0001-0000-C000-000000000046}";

  /**
   * Interface: IShapeRange
   */
  public final static String IShapeRange = "{0002443B-0001-0000-C000-000000000046}";

  /**
   * Interface: IShapes
   */
  public final static String IShapes = "{0002443A-0001-0000-C000-000000000046}";

  /**
   * Interface: ISheetViews
   */
  public final static String ISheetViews = "{0002448C-0001-0000-C000-000000000046}";

  /**
   * Interface: ISmartTag
   */
  public final static String ISmartTag = "{00024460-0001-0000-C000-000000000046}";

  /**
   * Interface: ISmartTagAction
   */
  public final static String ISmartTagAction = "{0002445E-0001-0000-C000-000000000046}";

  /**
   * Interface: ISmartTagActions
   */
  public final static String ISmartTagActions = "{0002445F-0001-0000-C000-000000000046}";

  /**
   * Interface: ISmartTagOptions
   */
  public final static String ISmartTagOptions = "{00024464-0001-0000-C000-000000000046}";

  /**
   * Interface: ISmartTagRecognizer
   */
  public final static String ISmartTagRecognizer = "{00024462-0001-0000-C000-000000000046}";

  /**
   * Interface: ISmartTagRecognizers
   */
  public final static String ISmartTagRecognizers = "{00024463-0001-0000-C000-000000000046}";

  /**
   * Interface: ISmartTags
   */
  public final static String ISmartTags = "{00024461-0001-0000-C000-000000000046}";

  /**
   * Interface: ISort
   */
  public final static String ISort = "{000244AB-0001-0000-C000-000000000046}";

  /**
   * Interface: ISortField
   */
  public final static String ISortField = "{000244A9-0001-0000-C000-000000000046}";

  /**
   * Interface: ISortFields
   */
  public final static String ISortFields = "{000244AA-0001-0000-C000-000000000046}";

  /**
   * Interface: ISoundNote
   */
  public final static String ISoundNote = "{0002087B-0001-0000-C000-000000000046}";

  /**
   * Interface: ISpeech
   */
  public final static String ISpeech = "{00024466-0001-0000-C000-000000000046}";

  /**
   * Interface: ISpellingOptions
   */
  public final static String ISpellingOptions = "{00024465-0001-0000-C000-000000000046}";

  /**
   * Interface: ISpinner
   */
  public final static String ISpinner = "{0002088D-0001-0000-C000-000000000046}";

  /**
   * Interface: ISpinners
   */
  public final static String ISpinners = "{0002088E-0001-0000-C000-000000000046}";

  /**
   * Interface: IStyle
   */
  public final static String IStyle = "{00020852-0001-0000-C000-000000000046}";

  /**
   * Interface: IStyles
   */
  public final static String IStyles = "{00020853-0001-0000-C000-000000000046}";

  /**
   * Interface: ITab
   */
  public final static String ITab = "{00024469-0001-0000-C000-000000000046}";

  /**
   * Interface: ITableStyle
   */
  public final static String ITableStyle = "{000244A7-0001-0000-C000-000000000046}";

  /**
   * Interface: ITableStyleElement
   */
  public final static String ITableStyleElement = "{000244A5-0001-0000-C000-000000000046}";

  /**
   * Interface: ITableStyleElements
   */
  public final static String ITableStyleElements = "{000244A6-0001-0000-C000-000000000046}";

  /**
   * Interface: ITableStyles
   */
  public final static String ITableStyles = "{000244A8-0001-0000-C000-000000000046}";

  /**
   * Interface: ITextBox
   */
  public final static String ITextBox = "{000208A4-0001-0000-C000-000000000046}";

  /**
   * Interface: ITextBoxes
   */
  public final static String ITextBoxes = "{000208A5-0001-0000-C000-000000000046}";

  /**
   * Interface: ITextFrame
   */
  public final static String ITextFrame = "{0002443D-0001-0000-C000-000000000046}";

  /**
   * Interface: ITickLabels
   */
  public final static String ITickLabels = "{000208C9-0001-0000-C000-000000000046}";

  /**
   * Interface: IToolbar
   */
  public final static String IToolbar = "{0002085C-0001-0000-C000-000000000046}";

  /**
   * Interface: IToolbarButton
   */
  public final static String IToolbarButton = "{0002085E-0001-0000-C000-000000000046}";

  /**
   * Interface: IToolbarButtons
   */
  public final static String IToolbarButtons = "{0002085F-0001-0000-C000-000000000046}";

  /**
   * Interface: IToolbars
   */
  public final static String IToolbars = "{0002085D-0001-0000-C000-000000000046}";

  /**
   * Interface: ITop10
   */
  public final static String ITop10 = "{0002449D-0001-0000-C000-000000000046}";

  /**
   * Interface: ITrendline
   */
  public final static String ITrendline = "{000208BE-0001-0000-C000-000000000046}";

  /**
   * Interface: ITrendlines
   */
  public final static String ITrendlines = "{000208BD-0001-0000-C000-000000000046}";

  /**
   * Interface: IUniqueValues
   */
  public final static String IUniqueValues = "{0002449F-0001-0000-C000-000000000046}";

  /**
   * Interface: IUpBars
   */
  public final static String IUpBars = "{000208C5-0001-0000-C000-000000000046}";

  /**
   * Interface: IUsedObjects
   */
  public final static String IUsedObjects = "{00024451-0001-0000-C000-000000000046}";

  /**
   * Interface: IUserAccess
   */
  public final static String IUserAccess = "{0002446D-0001-0000-C000-000000000046}";

  /**
   * Interface: IUserAccessList
   */
  public final static String IUserAccessList = "{0002446C-0001-0000-C000-000000000046}";

  /**
   * Interface: IVPageBreak
   */
  public final static String IVPageBreak = "{00024402-0001-0000-C000-000000000046}";

  /**
   * Interface: IVPageBreaks
   */
  public final static String IVPageBreaks = "{00024405-0001-0000-C000-000000000046}";

  /**
   * Interface: IValidation
   */
  public final static String IValidation = "{0002442F-0001-0000-C000-000000000046}";

  /**
   * Interface: IWalls
   */
  public final static String IWalls = "{000208C8-0001-0000-C000-000000000046}";

  /**
   * Interface: IWatch
   */
  public final static String IWatch = "{00024457-0001-0000-C000-000000000046}";

  /**
   * Interface: IWatches
   */
  public final static String IWatches = "{00024456-0001-0000-C000-000000000046}";

  /**
   * Interface: IWindow
   */
  public final static String IWindow = "{00020893-0001-0000-C000-000000000046}";

  /**
   * Interface: IWindows
   */
  public final static String IWindows = "{00020892-0001-0000-C000-000000000046}";

  /**
   * Interface: IWorkbookConnection
   */
  public final static String IWorkbookConnection = "{00024485-0001-0000-C000-000000000046}";

  /**
   * Interface: IWorkbookEvents
   */
  public final static String IWorkbookEvents = "{00024412-0001-0000-C000-000000000046}";

  /**
   * Interface: IWorksheetFunction
   */
  public final static String IWorksheetFunction = "{00020845-0001-0000-C000-000000000046}";

  /**
   * Interface: IWorksheetView
   */
  public final static String IWorksheetView = "{00024487-0001-0000-C000-000000000046}";

  /**
   * Interface: IWorksheets
   */
  public final static String IWorksheets = "{000208B1-0001-0000-C000-000000000046}";

  /**
   * Interface: IXPath
   */
  public final static String IXPath = "{0002447E-0001-0000-C000-000000000046}";

  /**
   * Interface: IXmlDataBinding
   */
  public final static String IXmlDataBinding = "{00024478-0001-0000-C000-000000000046}";

  /**
   * Interface: IXmlMap
   */
  public final static String IXmlMap = "{0002447B-0001-0000-C000-000000000046}";

  /**
   * Interface: IXmlMaps
   */
  public final static String IXmlMaps = "{0002447C-0001-0000-C000-000000000046}";

  /**
   * Interface: IXmlNamespace
   */
  public final static String IXmlNamespace = "{00024476-0001-0000-C000-000000000046}";

  /**
   * Interface: IXmlNamespaces
   */
  public final static String IXmlNamespaces = "{00024477-0001-0000-C000-000000000046}";

  /**
   * Interface: IXmlSchema
   */
  public final static String IXmlSchema = "{00024479-0001-0000-C000-000000000046}";

  /**
   * Interface: IXmlSchemas
   */
  public final static String IXmlSchemas = "{0002447A-0001-0000-C000-000000000046}";

  /**
   * Interface: Icon
   */
  public final static String Icon = "{0002449A-0000-0000-C000-000000000046}";

  /**
   * Interface: IconCriteria
   */
  public final static String IconCriteria = "{00024498-0000-0000-C000-000000000046}";

  /**
   * Interface: IconCriterion
   */
  public final static String IconCriterion = "{00024499-0000-0000-C000-000000000046}";

  /**
   * Interface: IconSet
   */
  public final static String IconSet = "{0002449B-0000-0000-C000-000000000046}";

  /**
   * Interface: IconSetCondition
   */
  public final static String IconSetCondition = "{00024497-0000-0000-C000-000000000046}";

  /**
   * Interface: IconSets
   */
  public final static String IconSets = "{0002449C-0000-0000-C000-000000000046}";

  /**
   * Interface: Interior
   */
  public final static String Interior = "{00020870-0000-0000-C000-000000000046}";

  /**
   * Interface: Label
   */
  public final static String Label = "{00020890-0000-0000-C000-000000000046}";

  /**
   * Interface: Labels
   */
  public final static String Labels = "{00020891-0000-0000-C000-000000000046}";

  /**
   * Interface: LeaderLines
   */
  public final static String LeaderLines = "{00024437-0000-0000-C000-000000000046}";

  /**
   * Interface: Legend
   */
  public final static String Legend = "{000208CD-0000-0000-C000-000000000046}";

  /**
   * Interface: LegendEntries
   */
  public final static String LegendEntries = "{000208BB-0000-0000-C000-000000000046}";

  /**
   * Interface: LegendEntry
   */
  public final static String LegendEntry = "{000208BA-0000-0000-C000-000000000046}";

  /**
   * Interface: LegendKey
   */
  public final static String LegendKey = "{000208BC-0000-0000-C000-000000000046}";

  /**
   * Interface: Line
   */
  public final static String Line = "{0002089A-0000-0000-C000-000000000046}";

  /**
   * Interface: LineFormat
   */
  public final static String LineFormat = "{000C0317-0000-0000-C000-000000000046}";

  /**
   * Interface: LinearGradient
   */
  public final static String LinearGradient = "{000244AF-0000-0000-C000-000000000046}";

  /**
   * Interface: Lines
   */
  public final static String Lines = "{0002089B-0000-0000-C000-000000000046}";

  /**
   * Interface: LinkFormat
   */
  public final static String LinkFormat = "{00024442-0000-0000-C000-000000000046}";

  /**
   * Interface: ListBox
   */
  public final static String ListBox = "{00020887-0000-0000-C000-000000000046}";

  /**
   * Interface: ListBoxes
   */
  public final static String ListBoxes = "{00020888-0000-0000-C000-000000000046}";

  /**
   * Interface: ListColumn
   */
  public final static String ListColumn = "{00024473-0000-0000-C000-000000000046}";

  /**
   * Interface: ListColumns
   */
  public final static String ListColumns = "{00024472-0000-0000-C000-000000000046}";

  /**
   * Interface: ListDataFormat
   */
  public final static String ListDataFormat = "{0002447D-0000-0000-C000-000000000046}";

  /**
   * Interface: ListObject
   */
  public final static String ListObject = "{00024471-0000-0000-C000-000000000046}";

  /**
   * Interface: ListObjects
   */
  public final static String ListObjects = "{00024470-0000-0000-C000-000000000046}";

  /**
   * Interface: ListRow
   */
  public final static String ListRow = "{00024475-0000-0000-C000-000000000046}";

  /**
   * Interface: ListRows
   */
  public final static String ListRows = "{00024474-0000-0000-C000-000000000046}";

  /**
   * Interface: Mailer
   */
  public final static String Mailer = "{000208D1-0000-0000-C000-000000000046}";

  /**
   * Interface: Menu
   */
  public final static String Menu = "{00020866-0000-0000-C000-000000000046}";

  /**
   * Interface: MenuBar
   */
  public final static String MenuBar = "{00020864-0000-0000-C000-000000000046}";

  /**
   * Interface: MenuBars
   */
  public final static String MenuBars = "{00020863-0000-0000-C000-000000000046}";

  /**
   * Interface: MenuItem
   */
  public final static String MenuItem = "{00020868-0000-0000-C000-000000000046}";

  /**
   * Interface: MenuItems
   */
  public final static String MenuItems = "{00020867-0000-0000-C000-000000000046}";

  /**
   * Interface: Menus
   */
  public final static String Menus = "{00020865-0000-0000-C000-000000000046}";

  /**
   * Interface: Module
   */
  public final static String Module = "{000208AD-0000-0000-C000-000000000046}";

  /**
   * Interface: ModuleView
   */
  public final static String ModuleView = "{00024489-0000-0000-C000-000000000046}";

  /**
   * Interface: Modules
   */
  public final static String Modules = "{000208AE-0000-0000-C000-000000000046}";

  /**
   * Interface: MultiThreadedCalculation
   */
  public final static String MultiThreadedCalculation = "{000244B1-0000-0000-C000-000000000046}";

  /**
   * Interface: Name
   */
  public final static String Name = "{000208B9-0000-0000-C000-000000000046}";

  /**
   * Interface: Names
   */
  public final static String Names = "{000208B8-0000-0000-C000-000000000046}";

  /**
   * Interface: ODBCConnection
   */
  public final static String ODBCConnection = "{0002448E-0000-0000-C000-000000000046}";

  /**
   * Interface: ODBCError
   */
  public final static String ODBCError = "{0002442C-0000-0000-C000-000000000046}";

  /**
   * Interface: ODBCErrors
   */
  public final static String ODBCErrors = "{0002442D-0000-0000-C000-000000000046}";

  /**
   * Interface: OLEDBConnection
   */
  public final static String OLEDBConnection = "{0002448D-0000-0000-C000-000000000046}";

  /**
   * Interface: OLEDBError
   */
  public final static String OLEDBError = "{00024445-0000-0000-C000-000000000046}";

  /**
   * Interface: OLEDBErrors
   */
  public final static String OLEDBErrors = "{00024446-0000-0000-C000-000000000046}";

  /**
   * Interface: OLEFormat
   */
  public final static String OLEFormat = "{00024441-0000-0000-C000-000000000046}";

  /**
   * Interface: OLEObjectEvents
   */
  public final static String OLEObjectEvents = "{00024410-0000-0000-C000-000000000046}";

  /**
   * Interface: OLEObjects
   */
  public final static String OLEObjects = "{000208A3-0000-0000-C000-000000000046}";

  /**
   * Interface: OptionButton
   */
  public final static String OptionButton = "{00020881-0000-0000-C000-000000000046}";

  /**
   * Interface: OptionButtons
   */
  public final static String OptionButtons = "{00020882-0000-0000-C000-000000000046}";

  /**
   * Interface: Outline
   */
  public final static String Outline = "{000208AB-0000-0000-C000-000000000046}";

  /**
   * Interface: Oval
   */
  public final static String Oval = "{0002089E-0000-0000-C000-000000000046}";

  /**
   * Interface: Ovals
   */
  public final static String Ovals = "{0002089F-0000-0000-C000-000000000046}";

  /**
   * Interface: Page
   */
  public final static String Page = "{000244A2-0000-0000-C000-000000000046}";

  /**
   * Interface: PageSetup
   */
  public final static String PageSetup = "{000208B4-0000-0000-C000-000000000046}";

  /**
   * Interface: Pages
   */
  public final static String Pages = "{000244A3-0000-0000-C000-000000000046}";

  /**
   * Interface: Pane
   */
  public final static String Pane = "{00020895-0000-0000-C000-000000000046}";

  /**
   * Interface: Panes
   */
  public final static String Panes = "{00020894-0000-0000-C000-000000000046}";

  /**
   * Interface: Parameter
   */
  public final static String Parameter = "{0002442A-0000-0000-C000-000000000046}";

  /**
   * Interface: Parameters
   */
  public final static String Parameters = "{0002442B-0000-0000-C000-000000000046}";

  /**
   * Interface: Phonetic
   */
  public final static String Phonetic = "{00024438-0000-0000-C000-000000000046}";

  /**
   * Interface: Phonetics
   */
  public final static String Phonetics = "{00024447-0000-0000-C000-000000000046}";

  /**
   * Interface: Picture
   */
  public final static String Picture = "{000208A6-0000-0000-C000-000000000046}";

  /**
   * Interface: PictureFormat
   */
  public final static String PictureFormat = "{000C031A-0000-0000-C000-000000000046}";

  /**
   * Interface: Pictures
   */
  public final static String Pictures = "{000208A7-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotAxis
   */
  public final static String PivotAxis = "{00024482-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotCache
   */
  public final static String PivotCache = "{0002441C-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotCaches
   */
  public final static String PivotCaches = "{0002441D-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotCell
   */
  public final static String PivotCell = "{00024458-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotField
   */
  public final static String PivotField = "{00020874-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotFields
   */
  public final static String PivotFields = "{00020875-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotFilter
   */
  public final static String PivotFilter = "{00024483-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotFilters
   */
  public final static String PivotFilters = "{00024484-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotFormula
   */
  public final static String PivotFormula = "{0002441E-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotFormulas
   */
  public final static String PivotFormulas = "{0002441F-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotItem
   */
  public final static String PivotItem = "{00020876-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotItemList
   */
  public final static String PivotItemList = "{00024468-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotItems
   */
  public final static String PivotItems = "{00020877-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotLayout
   */
  public final static String PivotLayout = "{0002444A-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotLine
   */
  public final static String PivotLine = "{00024480-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotLineCells
   */
  public final static String PivotLineCells = "{0002447F-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotLines
   */
  public final static String PivotLines = "{00024481-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotTable
   */
  public final static String PivotTable = "{00020872-0000-0000-C000-000000000046}";

  /**
   * Interface: PivotTables
   */
  public final static String PivotTables = "{00020873-0000-0000-C000-000000000046}";

  /**
   * Interface: PlotArea
   */
  public final static String PlotArea = "{000208CB-0000-0000-C000-000000000046}";

  /**
   * Interface: Point
   */
  public final static String Point = "{0002086A-0000-0000-C000-000000000046}";

  /**
   * Interface: Points
   */
  public final static String Points = "{00020869-0000-0000-C000-000000000046}";

  /**
   * Interface: Protection
   */
  public final static String Protection = "{00024467-0000-0000-C000-000000000046}";

  /**
   * Interface: PublishObject
   */
  public final static String PublishObject = "{00024444-0000-0000-C000-000000000046}";

  /**
   * Interface: PublishObjects
   */
  public final static String PublishObjects = "{00024443-0000-0000-C000-000000000046}";

  /**
   * Interface: QueryTables
   */
  public final static String QueryTables = "{00024429-0000-0000-C000-000000000046}";

  /**
   * Interface: RTD
   */
  public final static String RTD = "{0002446E-0000-0000-C000-000000000046}";

  /**
   * Interface: Range
   */
  public final static String Range = "{00020846-0000-0000-C000-000000000046}";

  /**
   * Interface: Ranges
   */
  public final static String Ranges = "{000244A0-0000-0000-C000-000000000046}";

  /**
   * Interface: RecentFile
   */
  public final static String RecentFile = "{00024407-0000-0000-C000-000000000046}";

  /**
   * Interface: RecentFiles
   */
  public final static String RecentFiles = "{00024406-0000-0000-C000-000000000046}";

  /**
   * Interface: Rectangle
   */
  public final static String Rectangle = "{0002089C-0000-0000-C000-000000000046}";

  /**
   * Interface: Rectangles
   */
  public final static String Rectangles = "{0002089D-0000-0000-C000-000000000046}";

  /**
   * Interface: RectangularGradient
   */
  public final static String RectangularGradient = "{000244B0-0000-0000-C000-000000000046}";

  /**
   * Interface: RefreshEvents
   */
  public final static String RefreshEvents = "{0002441B-0000-0000-C000-000000000046}";

  /**
   * Interface: Research
   */
  public final static String Research = "{000244AC-0000-0000-C000-000000000046}";

  /**
   * Interface: RoutingSlip
   */
  public final static String RoutingSlip = "{000208AA-0000-0000-C000-000000000046}";

  /**
   * Interface: Scenario
   */
  public final static String Scenario = "{00020897-0000-0000-C000-000000000046}";

  /**
   * Interface: Scenarios
   */
  public final static String Scenarios = "{00020896-0000-0000-C000-000000000046}";

  /**
   * Interface: ScrollBar
   */
  public final static String ScrollBar = "{00020885-0000-0000-C000-000000000046}";

  /**
   * Interface: ScrollBars
   */
  public final static String ScrollBars = "{00020886-0000-0000-C000-000000000046}";

  /**
   * Interface: Series
   */
  public final static String Series = "{0002086B-0000-0000-C000-000000000046}";

  /**
   * Interface: SeriesCollection
   */
  public final static String SeriesCollection = "{0002086C-0000-0000-C000-000000000046}";

  /**
   * Interface: SeriesLines
   */
  public final static String SeriesLines = "{000208C1-0000-0000-C000-000000000046}";

  /**
   * Interface: ServerViewableItems
   */
  public final static String ServerViewableItems = "{000244A4-0000-0000-C000-000000000046}";

  /**
   * Interface: ShadowFormat
   */
  public final static String ShadowFormat = "{000C031B-0000-0000-C000-000000000046}";

  /**
   * Interface: Shape
   */
  public final static String Shape = "{00024439-0000-0000-C000-000000000046}";

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
  public final static String ShapeRange = "{0002443B-0000-0000-C000-000000000046}";

  /**
   * Interface: Shapes
   */
  public final static String Shapes = "{0002443A-0000-0000-C000-000000000046}";

  /**
   * Interface: SheetViews
   */
  public final static String SheetViews = "{0002448C-0000-0000-C000-000000000046}";

  /**
   * Interface: Sheets
   */
  public final static String Sheets = "{000208D7-0000-0000-C000-000000000046}";

  /**
   * Interface: SmartTag
   */
  public final static String SmartTag = "{00024460-0000-0000-C000-000000000046}";

  /**
   * Interface: SmartTagAction
   */
  public final static String SmartTagAction = "{0002445E-0000-0000-C000-000000000046}";

  /**
   * Interface: SmartTagActions
   */
  public final static String SmartTagActions = "{0002445F-0000-0000-C000-000000000046}";

  /**
   * Interface: SmartTagOptions
   */
  public final static String SmartTagOptions = "{00024464-0000-0000-C000-000000000046}";

  /**
   * Interface: SmartTagRecognizer
   */
  public final static String SmartTagRecognizer = "{00024462-0000-0000-C000-000000000046}";

  /**
   * Interface: SmartTagRecognizers
   */
  public final static String SmartTagRecognizers = "{00024463-0000-0000-C000-000000000046}";

  /**
   * Interface: SmartTags
   */
  public final static String SmartTags = "{00024461-0000-0000-C000-000000000046}";

  /**
   * Interface: Sort
   */
  public final static String Sort = "{000244AB-0000-0000-C000-000000000046}";

  /**
   * Interface: SortField
   */
  public final static String SortField = "{000244A9-0000-0000-C000-000000000046}";

  /**
   * Interface: SortFields
   */
  public final static String SortFields = "{000244AA-0000-0000-C000-000000000046}";

  /**
   * Interface: SoundNote
   */
  public final static String SoundNote = "{0002087B-0000-0000-C000-000000000046}";

  /**
   * Interface: Speech
   */
  public final static String Speech = "{00024466-0000-0000-C000-000000000046}";

  /**
   * Interface: SpellingOptions
   */
  public final static String SpellingOptions = "{00024465-0000-0000-C000-000000000046}";

  /**
   * Interface: Spinner
   */
  public final static String Spinner = "{0002088D-0000-0000-C000-000000000046}";

  /**
   * Interface: Spinners
   */
  public final static String Spinners = "{0002088E-0000-0000-C000-000000000046}";

  /**
   * Interface: Style
   */
  public final static String Style = "{00020852-0000-0000-C000-000000000046}";

  /**
   * Interface: Styles
   */
  public final static String Styles = "{00020853-0000-0000-C000-000000000046}";

  /**
   * Interface: Tab
   */
  public final static String Tab = "{00024469-0000-0000-C000-000000000046}";

  /**
   * Interface: TableStyle
   */
  public final static String TableStyle = "{000244A7-0000-0000-C000-000000000046}";

  /**
   * Interface: TableStyleElement
   */
  public final static String TableStyleElement = "{000244A5-0000-0000-C000-000000000046}";

  /**
   * Interface: TableStyleElements
   */
  public final static String TableStyleElements = "{000244A6-0000-0000-C000-000000000046}";

  /**
   * Interface: TableStyles
   */
  public final static String TableStyles = "{000244A8-0000-0000-C000-000000000046}";

  /**
   * Interface: TextBox
   */
  public final static String TextBox = "{000208A4-0000-0000-C000-000000000046}";

  /**
   * Interface: TextBoxes
   */
  public final static String TextBoxes = "{000208A5-0000-0000-C000-000000000046}";

  /**
   * Interface: TextEffectFormat
   */
  public final static String TextEffectFormat = "{000C031F-0000-0000-C000-000000000046}";

  /**
   * Interface: TextFrame
   */
  public final static String TextFrame = "{0002443D-0000-0000-C000-000000000046}";

  /**
   * Interface: TextFrame2
   */
  public final static String TextFrame2 = "{000C0398-0000-0000-C000-000000000046}";

  /**
   * Interface: ThreeDFormat
   */
  public final static String ThreeDFormat = "{000C0321-0000-0000-C000-000000000046}";

  /**
   * Interface: TickLabels
   */
  public final static String TickLabels = "{000208C9-0000-0000-C000-000000000046}";

  /**
   * Interface: Toolbar
   */
  public final static String Toolbar = "{0002085C-0000-0000-C000-000000000046}";

  /**
   * Interface: ToolbarButton
   */
  public final static String ToolbarButton = "{0002085E-0000-0000-C000-000000000046}";

  /**
   * Interface: ToolbarButtons
   */
  public final static String ToolbarButtons = "{0002085F-0000-0000-C000-000000000046}";

  /**
   * Interface: Toolbars
   */
  public final static String Toolbars = "{0002085D-0000-0000-C000-000000000046}";

  /**
   * Interface: Top10
   */
  public final static String Top10 = "{0002449D-0000-0000-C000-000000000046}";

  /**
   * Interface: TreeviewControl
   */
  public final static String TreeviewControl = "{0002444B-0000-0000-C000-000000000046}";

  /**
   * Interface: Trendline
   */
  public final static String Trendline = "{000208BE-0000-0000-C000-000000000046}";

  /**
   * Interface: Trendlines
   */
  public final static String Trendlines = "{000208BD-0000-0000-C000-000000000046}";

  /**
   * Interface: UniqueValues
   */
  public final static String UniqueValues = "{0002449F-0000-0000-C000-000000000046}";

  /**
   * Interface: UpBars
   */
  public final static String UpBars = "{000208C5-0000-0000-C000-000000000046}";

  /**
   * Interface: UsedObjects
   */
  public final static String UsedObjects = "{00024451-0000-0000-C000-000000000046}";

  /**
   * Interface: UserAccess
   */
  public final static String UserAccess = "{0002446D-0000-0000-C000-000000000046}";

  /**
   * Interface: UserAccessList
   */
  public final static String UserAccessList = "{0002446C-0000-0000-C000-000000000046}";

  /**
   * Interface: VPageBreak
   */
  public final static String VPageBreak = "{00024402-0000-0000-C000-000000000046}";

  /**
   * Interface: VPageBreaks
   */
  public final static String VPageBreaks = "{00024405-0000-0000-C000-000000000046}";

  /**
   * Interface: Validation
   */
  public final static String Validation = "{0002442F-0000-0000-C000-000000000046}";

  /**
   * Interface: Walls
   */
  public final static String Walls = "{000208C8-0000-0000-C000-000000000046}";

  /**
   * Interface: Watch
   */
  public final static String Watch = "{00024457-0000-0000-C000-000000000046}";

  /**
   * Interface: Watches
   */
  public final static String Watches = "{00024456-0000-0000-C000-000000000046}";

  /**
   * Interface: WebOptions
   */
  public final static String WebOptions = "{00024449-0000-0000-C000-000000000046}";

  /**
   * Interface: Window
   */
  public final static String Window = "{00020893-0000-0000-C000-000000000046}";

  /**
   * Interface: Windows
   */
  public final static String Windows = "{00020892-0000-0000-C000-000000000046}";

  /**
   * Interface: WorkbookConnection
   */
  public final static String WorkbookConnection = "{00024485-0000-0000-C000-000000000046}";

  /**
   * Interface: WorkbookEvents
   */
  public final static String WorkbookEvents = "{00024412-0000-0000-C000-000000000046}";

  /**
   * Interface: Workbooks
   */
  public final static String Workbooks = "{000208DB-0000-0000-C000-000000000046}";

  /**
   * Interface: WorksheetFunction
   */
  public final static String WorksheetFunction = "{00020845-0000-0000-C000-000000000046}";

  /**
   * Interface: WorksheetView
   */
  public final static String WorksheetView = "{00024487-0000-0000-C000-000000000046}";

  /**
   * Interface: Worksheets
   */
  public final static String Worksheets = "{000208B1-0000-0000-C000-000000000046}";

  /**
   * Interface: XPath
   */
  public final static String XPath = "{0002447E-0000-0000-C000-000000000046}";

  /**
   * Interface: XmlDataBinding
   */
  public final static String XmlDataBinding = "{00024478-0000-0000-C000-000000000046}";

  /**
   * Interface: XmlMap
   */
  public final static String XmlMap = "{0002447B-0000-0000-C000-000000000046}";

  /**
   * Interface: XmlMaps
   */
  public final static String XmlMaps = "{0002447C-0000-0000-C000-000000000046}";

  /**
   * Interface: XmlNamespace
   */
  public final static String XmlNamespace = "{00024476-0000-0000-C000-000000000046}";

  /**
   * Interface: XmlNamespaces
   */
  public final static String XmlNamespaces = "{00024477-0000-0000-C000-000000000046}";

  /**
   * Interface: XmlSchema
   */
  public final static String XmlSchema = "{00024479-0000-0000-C000-000000000046}";

  /**
   * Interface: XmlSchemas
   */
  public final static String XmlSchemas = "{0002447A-0000-0000-C000-000000000046}";

  /**
   * Interface: _Application
   */
  public final static String _Application = "{000208D5-0000-0000-C000-000000000046}";

  /**
   * Interface: _Chart
   */
  public final static String _Chart = "{000208D6-0000-0000-C000-000000000046}";

  /**
   * Interface: _Global
   */
  public final static String _Global = "{000208D9-0000-0000-C000-000000000046}";

  /**
   * Interface: _IOLEObject
   */
  public final static String _IOLEObject = "{000208A2-0001-0000-C000-000000000046}";

  /**
   * Interface: _IQueryTable
   */
  public final static String _IQueryTable = "{00024428-0001-0000-C000-000000000046}";

  /**
   * Interface: _OLEObject
   */
  public final static String _OLEObject = "{000208A2-0000-0000-C000-000000000046}";

  /**
   * Interface: _QueryTable
   */
  public final static String _QueryTable = "{00024428-0000-0000-C000-000000000046}";

  /**
   * Interface: _Workbook
   */
  public final static String _Workbook = "{000208DA-0000-0000-C000-000000000046}";

  /**
   * Interface: _Worksheet
   */
  public final static String _Worksheet = "{000208D8-0000-0000-C000-000000000046}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map<String,String> interfaces;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("AboveAverage", AboveAverage);
    v.put("Action", Action);
    v.put("Actions", Actions);
    v.put("AddIn", AddIn);
    v.put("AddIns", AddIns);
    v.put("Adjustments", Adjustments);
    v.put("AllowEditRange", AllowEditRange);
    v.put("AllowEditRanges", AllowEditRanges);
    v.put("AppEvents", AppEvents);
    v.put("Arc", Arc);
    v.put("Arcs", Arcs);
    v.put("Areas", Areas);
    v.put("AutoCorrect", AutoCorrect);
    v.put("AutoFilter", AutoFilter);
    v.put("AutoRecover", AutoRecover);
    v.put("Axes", Axes);
    v.put("Axis", Axis);
    v.put("AxisTitle", AxisTitle);
    v.put("Border", Border);
    v.put("Borders", Borders);
    v.put("Button", Button);
    v.put("Buttons", Buttons);
    v.put("CalculatedFields", CalculatedFields);
    v.put("CalculatedItems", CalculatedItems);
    v.put("CalculatedMember", CalculatedMember);
    v.put("CalculatedMembers", CalculatedMembers);
    v.put("CalloutFormat", CalloutFormat);
    v.put("CellFormat", CellFormat);
    v.put("Characters", Characters);
    v.put("ChartArea", ChartArea);
    v.put("ChartColorFormat", ChartColorFormat);
    v.put("ChartEvents", ChartEvents);
    v.put("ChartFillFormat", ChartFillFormat);
    v.put("ChartFormat", ChartFormat);
    v.put("ChartGroup", ChartGroup);
    v.put("ChartGroups", ChartGroups);
    v.put("ChartObject", ChartObject);
    v.put("ChartObjects", ChartObjects);
    v.put("ChartTitle", ChartTitle);
    v.put("ChartView", ChartView);
    v.put("Charts", Charts);
    v.put("CheckBox", CheckBox);
    v.put("CheckBoxes", CheckBoxes);
    v.put("ColorFormat", ColorFormat);
    v.put("ColorScale", ColorScale);
    v.put("ColorScaleCriteria", ColorScaleCriteria);
    v.put("ColorScaleCriterion", ColorScaleCriterion);
    v.put("ColorStop", ColorStop);
    v.put("ColorStops", ColorStops);
    v.put("Comment", Comment);
    v.put("Comments", Comments);
    v.put("ConditionValue", ConditionValue);
    v.put("Connections", Connections);
    v.put("ConnectorFormat", ConnectorFormat);
    v.put("ControlFormat", ControlFormat);
    v.put("Corners", Corners);
    v.put("CubeField", CubeField);
    v.put("CubeFields", CubeFields);
    v.put("CustomProperties", CustomProperties);
    v.put("CustomProperty", CustomProperty);
    v.put("CustomView", CustomView);
    v.put("CustomViews", CustomViews);
    v.put("DataLabel", DataLabel);
    v.put("DataLabels", DataLabels);
    v.put("DataTable", DataTable);
    v.put("Databar", Databar);
    v.put("DefaultWebOptions", DefaultWebOptions);
    v.put("Diagram", Diagram);
    v.put("DiagramNode", DiagramNode);
    v.put("DiagramNodeChildren", DiagramNodeChildren);
    v.put("DiagramNodes", DiagramNodes);
    v.put("Dialog", Dialog);
    v.put("DialogFrame", DialogFrame);
    v.put("DialogSheet", DialogSheet);
    v.put("DialogSheetView", DialogSheetView);
    v.put("DialogSheets", DialogSheets);
    v.put("Dialogs", Dialogs);
    v.put("DisplayUnitLabel", DisplayUnitLabel);
    v.put("DocEvents", DocEvents);
    v.put("DownBars", DownBars);
    v.put("Drawing", Drawing);
    v.put("DrawingObjects", DrawingObjects);
    v.put("Drawings", Drawings);
    v.put("DropDown", DropDown);
    v.put("DropDowns", DropDowns);
    v.put("DropLines", DropLines);
    v.put("EditBox", EditBox);
    v.put("EditBoxes", EditBoxes);
    v.put("Error", Error);
    v.put("ErrorBars", ErrorBars);
    v.put("ErrorCheckingOptions", ErrorCheckingOptions);
    v.put("Errors", Errors);
    v.put("FillFormat", FillFormat);
    v.put("Filter", Filter);
    v.put("Filters", Filters);
    v.put("Floor", Floor);
    v.put("Font", Font);
    v.put("FormatColor", FormatColor);
    v.put("FormatCondition", FormatCondition);
    v.put("FormatConditions", FormatConditions);
    v.put("FreeformBuilder", FreeformBuilder);
    v.put("Graphic", Graphic);
    v.put("Gridlines", Gridlines);
    v.put("GroupBox", GroupBox);
    v.put("GroupBoxes", GroupBoxes);
    v.put("GroupObject", GroupObject);
    v.put("GroupObjects", GroupObjects);
    v.put("GroupShapes", GroupShapes);
    v.put("HPageBreak", HPageBreak);
    v.put("HPageBreaks", HPageBreaks);
    v.put("HeaderFooter", HeaderFooter);
    v.put("HiLoLines", HiLoLines);
    v.put("Hyperlink", Hyperlink);
    v.put("Hyperlinks", Hyperlinks);
    v.put("IAboveAverage", IAboveAverage);
    v.put("IAction", IAction);
    v.put("IActions", IActions);
    v.put("IAddIn", IAddIn);
    v.put("IAddIns", IAddIns);
    v.put("IAllowEditRange", IAllowEditRange);
    v.put("IAllowEditRanges", IAllowEditRanges);
    v.put("IAppEvents", IAppEvents);
    v.put("IArc", IArc);
    v.put("IArcs", IArcs);
    v.put("IAreas", IAreas);
    v.put("IAutoCorrect", IAutoCorrect);
    v.put("IAutoFilter", IAutoFilter);
    v.put("IAutoRecover", IAutoRecover);
    v.put("IAxes", IAxes);
    v.put("IAxis", IAxis);
    v.put("IAxisTitle", IAxisTitle);
    v.put("IBorder", IBorder);
    v.put("IBorders", IBorders);
    v.put("IButton", IButton);
    v.put("IButtons", IButtons);
    v.put("ICalculatedFields", ICalculatedFields);
    v.put("ICalculatedItems", ICalculatedItems);
    v.put("ICalculatedMember", ICalculatedMember);
    v.put("ICalculatedMembers", ICalculatedMembers);
    v.put("ICanvasShapes", ICanvasShapes);
    v.put("ICellFormat", ICellFormat);
    v.put("ICharacters", ICharacters);
    v.put("IChartArea", IChartArea);
    v.put("IChartColorFormat", IChartColorFormat);
    v.put("IChartEvents", IChartEvents);
    v.put("IChartFillFormat", IChartFillFormat);
    v.put("IChartFormat", IChartFormat);
    v.put("IChartGroup", IChartGroup);
    v.put("IChartGroups", IChartGroups);
    v.put("IChartObject", IChartObject);
    v.put("IChartObjects", IChartObjects);
    v.put("IChartTitle", IChartTitle);
    v.put("IChartView", IChartView);
    v.put("ICharts", ICharts);
    v.put("ICheckBox", ICheckBox);
    v.put("ICheckBoxes", ICheckBoxes);
    v.put("IColorScale", IColorScale);
    v.put("IColorScaleCriteria", IColorScaleCriteria);
    v.put("IColorScaleCriterion", IColorScaleCriterion);
    v.put("IColorStop", IColorStop);
    v.put("IColorStops", IColorStops);
    v.put("IComment", IComment);
    v.put("IComments", IComments);
    v.put("IConditionValue", IConditionValue);
    v.put("IConnections", IConnections);
    v.put("IConnectorFormat", IConnectorFormat);
    v.put("IControlFormat", IControlFormat);
    v.put("ICorners", ICorners);
    v.put("ICustomProperties", ICustomProperties);
    v.put("ICustomProperty", ICustomProperty);
    v.put("ICustomView", ICustomView);
    v.put("ICustomViews", ICustomViews);
    v.put("IDataLabel", IDataLabel);
    v.put("IDataLabels", IDataLabels);
    v.put("IDataTable", IDataTable);
    v.put("IDatabar", IDatabar);
    v.put("IDiagram", IDiagram);
    v.put("IDialog", IDialog);
    v.put("IDialogFrame", IDialogFrame);
    v.put("IDialogSheet", IDialogSheet);
    v.put("IDialogSheetView", IDialogSheetView);
    v.put("IDialogSheets", IDialogSheets);
    v.put("IDialogs", IDialogs);
    v.put("IDisplayUnitLabel", IDisplayUnitLabel);
    v.put("IDocEvents", IDocEvents);
    v.put("IDownBars", IDownBars);
    v.put("IDrawing", IDrawing);
    v.put("IDrawingObjects", IDrawingObjects);
    v.put("IDrawings", IDrawings);
    v.put("IDropDown", IDropDown);
    v.put("IDropDowns", IDropDowns);
    v.put("IDropLines", IDropLines);
    v.put("IDummy", IDummy);
    v.put("IEditBox", IEditBox);
    v.put("IEditBoxes", IEditBoxes);
    v.put("IError", IError);
    v.put("IErrorBars", IErrorBars);
    v.put("IErrorCheckingOptions", IErrorCheckingOptions);
    v.put("IErrors", IErrors);
    v.put("IFilter", IFilter);
    v.put("IFilters", IFilters);
    v.put("IFloor", IFloor);
    v.put("IFont", IFont);
    v.put("IFormatColor", IFormatColor);
    v.put("IFormatCondition", IFormatCondition);
    v.put("IFormatConditions", IFormatConditions);
    v.put("IFreeformBuilder", IFreeformBuilder);
    v.put("IGraphic", IGraphic);
    v.put("IGridlines", IGridlines);
    v.put("IGroupBox", IGroupBox);
    v.put("IGroupBoxes", IGroupBoxes);
    v.put("IGroupObject", IGroupObject);
    v.put("IGroupObjects", IGroupObjects);
    v.put("IGroupShapes", IGroupShapes);
    v.put("IHPageBreak", IHPageBreak);
    v.put("IHPageBreaks", IHPageBreaks);
    v.put("IHeaderFooter", IHeaderFooter);
    v.put("IHiLoLines", IHiLoLines);
    v.put("IHyperlink", IHyperlink);
    v.put("IHyperlinks", IHyperlinks);
    v.put("IIcon", IIcon);
    v.put("IIconCriteria", IIconCriteria);
    v.put("IIconCriterion", IIconCriterion);
    v.put("IIconSet", IIconSet);
    v.put("IIconSetCondition", IIconSetCondition);
    v.put("IIconSets", IIconSets);
    v.put("IInterior", IInterior);
    v.put("ILabel", ILabel);
    v.put("ILabels", ILabels);
    v.put("ILeaderLines", ILeaderLines);
    v.put("ILegend", ILegend);
    v.put("ILegendEntries", ILegendEntries);
    v.put("ILegendEntry", ILegendEntry);
    v.put("ILegendKey", ILegendKey);
    v.put("ILine", ILine);
    v.put("ILinearGradient", ILinearGradient);
    v.put("ILines", ILines);
    v.put("ILinkFormat", ILinkFormat);
    v.put("IListBox", IListBox);
    v.put("IListBoxes", IListBoxes);
    v.put("IListColumn", IListColumn);
    v.put("IListColumns", IListColumns);
    v.put("IListDataFormat", IListDataFormat);
    v.put("IListObject", IListObject);
    v.put("IListObjects", IListObjects);
    v.put("IListRow", IListRow);
    v.put("IListRows", IListRows);
    v.put("IMailer", IMailer);
    v.put("IMenu", IMenu);
    v.put("IMenuBar", IMenuBar);
    v.put("IMenuBars", IMenuBars);
    v.put("IMenuItem", IMenuItem);
    v.put("IMenuItems", IMenuItems);
    v.put("IMenus", IMenus);
    v.put("IModule", IModule);
    v.put("IModuleView", IModuleView);
    v.put("IModules", IModules);
    v.put("IMultiThreadedCalculation", IMultiThreadedCalculation);
    v.put("IName", IName);
    v.put("INames", INames);
    v.put("IODBCConnection", IODBCConnection);
    v.put("IODBCError", IODBCError);
    v.put("IODBCErrors", IODBCErrors);
    v.put("IOLEDBConnection", IOLEDBConnection);
    v.put("IOLEDBError", IOLEDBError);
    v.put("IOLEDBErrors", IOLEDBErrors);
    v.put("IOLEFormat", IOLEFormat);
    v.put("IOLEObjectEvents", IOLEObjectEvents);
    v.put("IOLEObjects", IOLEObjects);
    v.put("IOptionButton", IOptionButton);
    v.put("IOptionButtons", IOptionButtons);
    v.put("IOutline", IOutline);
    v.put("IOval", IOval);
    v.put("IOvals", IOvals);
    v.put("IPage", IPage);
    v.put("IPageSetup", IPageSetup);
    v.put("IPages", IPages);
    v.put("IPane", IPane);
    v.put("IPanes", IPanes);
    v.put("IParameter", IParameter);
    v.put("IParameters", IParameters);
    v.put("IPhonetic", IPhonetic);
    v.put("IPhonetics", IPhonetics);
    v.put("IPicture", IPicture);
    v.put("IPictures", IPictures);
    v.put("IPivotAxis", IPivotAxis);
    v.put("IPivotCache", IPivotCache);
    v.put("IPivotCaches", IPivotCaches);
    v.put("IPivotCell", IPivotCell);
    v.put("IPivotField", IPivotField);
    v.put("IPivotFields", IPivotFields);
    v.put("IPivotFilter", IPivotFilter);
    v.put("IPivotFilters", IPivotFilters);
    v.put("IPivotFormula", IPivotFormula);
    v.put("IPivotFormulas", IPivotFormulas);
    v.put("IPivotItem", IPivotItem);
    v.put("IPivotItemList", IPivotItemList);
    v.put("IPivotItems", IPivotItems);
    v.put("IPivotLayout", IPivotLayout);
    v.put("IPivotLine", IPivotLine);
    v.put("IPivotLineCells", IPivotLineCells);
    v.put("IPivotLines", IPivotLines);
    v.put("IPivotTable", IPivotTable);
    v.put("IPivotTables", IPivotTables);
    v.put("IPlotArea", IPlotArea);
    v.put("IPoint", IPoint);
    v.put("IPoints", IPoints);
    v.put("IProtection", IProtection);
    v.put("IPublishObjects", IPublishObjects);
    v.put("IQueryTables", IQueryTables);
    v.put("IRTD", IRTD);
    v.put("IRTDUpdateEvent", IRTDUpdateEvent);
    v.put("IRange", IRange);
    v.put("IRanges", IRanges);
    v.put("IRecentFile", IRecentFile);
    v.put("IRecentFiles", IRecentFiles);
    v.put("IRectangle", IRectangle);
    v.put("IRectangles", IRectangles);
    v.put("IRectangularGradient", IRectangularGradient);
    v.put("IRefreshEvents", IRefreshEvents);
    v.put("IResearch", IResearch);
    v.put("IRoutingSlip", IRoutingSlip);
    v.put("IRtdServer", IRtdServer);
    v.put("IScenario", IScenario);
    v.put("IScenarios", IScenarios);
    v.put("IScrollBar", IScrollBar);
    v.put("IScrollBars", IScrollBars);
    v.put("ISeries", ISeries);
    v.put("ISeriesCollection", ISeriesCollection);
    v.put("ISeriesLines", ISeriesLines);
    v.put("IServerViewableItems", IServerViewableItems);
    v.put("IShape", IShape);
    v.put("IShapeRange", IShapeRange);
    v.put("IShapes", IShapes);
    v.put("ISheetViews", ISheetViews);
    v.put("ISmartTag", ISmartTag);
    v.put("ISmartTagAction", ISmartTagAction);
    v.put("ISmartTagActions", ISmartTagActions);
    v.put("ISmartTagOptions", ISmartTagOptions);
    v.put("ISmartTagRecognizer", ISmartTagRecognizer);
    v.put("ISmartTagRecognizers", ISmartTagRecognizers);
    v.put("ISmartTags", ISmartTags);
    v.put("ISort", ISort);
    v.put("ISortField", ISortField);
    v.put("ISortFields", ISortFields);
    v.put("ISoundNote", ISoundNote);
    v.put("ISpeech", ISpeech);
    v.put("ISpellingOptions", ISpellingOptions);
    v.put("ISpinner", ISpinner);
    v.put("ISpinners", ISpinners);
    v.put("IStyle", IStyle);
    v.put("IStyles", IStyles);
    v.put("ITab", ITab);
    v.put("ITableStyle", ITableStyle);
    v.put("ITableStyleElement", ITableStyleElement);
    v.put("ITableStyleElements", ITableStyleElements);
    v.put("ITableStyles", ITableStyles);
    v.put("ITextBox", ITextBox);
    v.put("ITextBoxes", ITextBoxes);
    v.put("ITextFrame", ITextFrame);
    v.put("ITickLabels", ITickLabels);
    v.put("IToolbar", IToolbar);
    v.put("IToolbarButton", IToolbarButton);
    v.put("IToolbarButtons", IToolbarButtons);
    v.put("IToolbars", IToolbars);
    v.put("ITop10", ITop10);
    v.put("ITrendline", ITrendline);
    v.put("ITrendlines", ITrendlines);
    v.put("IUniqueValues", IUniqueValues);
    v.put("IUpBars", IUpBars);
    v.put("IUsedObjects", IUsedObjects);
    v.put("IUserAccess", IUserAccess);
    v.put("IUserAccessList", IUserAccessList);
    v.put("IVPageBreak", IVPageBreak);
    v.put("IVPageBreaks", IVPageBreaks);
    v.put("IValidation", IValidation);
    v.put("IWalls", IWalls);
    v.put("IWatch", IWatch);
    v.put("IWatches", IWatches);
    v.put("IWindow", IWindow);
    v.put("IWindows", IWindows);
    v.put("IWorkbookConnection", IWorkbookConnection);
    v.put("IWorkbookEvents", IWorkbookEvents);
    v.put("IWorksheetFunction", IWorksheetFunction);
    v.put("IWorksheetView", IWorksheetView);
    v.put("IWorksheets", IWorksheets);
    v.put("IXPath", IXPath);
    v.put("IXmlDataBinding", IXmlDataBinding);
    v.put("IXmlMap", IXmlMap);
    v.put("IXmlMaps", IXmlMaps);
    v.put("IXmlNamespace", IXmlNamespace);
    v.put("IXmlNamespaces", IXmlNamespaces);
    v.put("IXmlSchema", IXmlSchema);
    v.put("IXmlSchemas", IXmlSchemas);
    v.put("Icon", Icon);
    v.put("IconCriteria", IconCriteria);
    v.put("IconCriterion", IconCriterion);
    v.put("IconSet", IconSet);
    v.put("IconSetCondition", IconSetCondition);
    v.put("IconSets", IconSets);
    v.put("Interior", Interior);
    v.put("Label", Label);
    v.put("Labels", Labels);
    v.put("LeaderLines", LeaderLines);
    v.put("Legend", Legend);
    v.put("LegendEntries", LegendEntries);
    v.put("LegendEntry", LegendEntry);
    v.put("LegendKey", LegendKey);
    v.put("Line", Line);
    v.put("LineFormat", LineFormat);
    v.put("LinearGradient", LinearGradient);
    v.put("Lines", Lines);
    v.put("LinkFormat", LinkFormat);
    v.put("ListBox", ListBox);
    v.put("ListBoxes", ListBoxes);
    v.put("ListColumn", ListColumn);
    v.put("ListColumns", ListColumns);
    v.put("ListDataFormat", ListDataFormat);
    v.put("ListObject", ListObject);
    v.put("ListObjects", ListObjects);
    v.put("ListRow", ListRow);
    v.put("ListRows", ListRows);
    v.put("Mailer", Mailer);
    v.put("Menu", Menu);
    v.put("MenuBar", MenuBar);
    v.put("MenuBars", MenuBars);
    v.put("MenuItem", MenuItem);
    v.put("MenuItems", MenuItems);
    v.put("Menus", Menus);
    v.put("Module", Module);
    v.put("ModuleView", ModuleView);
    v.put("Modules", Modules);
    v.put("MultiThreadedCalculation", MultiThreadedCalculation);
    v.put("Name", Name);
    v.put("Names", Names);
    v.put("ODBCConnection", ODBCConnection);
    v.put("ODBCError", ODBCError);
    v.put("ODBCErrors", ODBCErrors);
    v.put("OLEDBConnection", OLEDBConnection);
    v.put("OLEDBError", OLEDBError);
    v.put("OLEDBErrors", OLEDBErrors);
    v.put("OLEFormat", OLEFormat);
    v.put("OLEObjectEvents", OLEObjectEvents);
    v.put("OLEObjects", OLEObjects);
    v.put("OptionButton", OptionButton);
    v.put("OptionButtons", OptionButtons);
    v.put("Outline", Outline);
    v.put("Oval", Oval);
    v.put("Ovals", Ovals);
    v.put("Page", Page);
    v.put("PageSetup", PageSetup);
    v.put("Pages", Pages);
    v.put("Pane", Pane);
    v.put("Panes", Panes);
    v.put("Parameter", Parameter);
    v.put("Parameters", Parameters);
    v.put("Phonetic", Phonetic);
    v.put("Phonetics", Phonetics);
    v.put("Picture", Picture);
    v.put("PictureFormat", PictureFormat);
    v.put("Pictures", Pictures);
    v.put("PivotAxis", PivotAxis);
    v.put("PivotCache", PivotCache);
    v.put("PivotCaches", PivotCaches);
    v.put("PivotCell", PivotCell);
    v.put("PivotField", PivotField);
    v.put("PivotFields", PivotFields);
    v.put("PivotFilter", PivotFilter);
    v.put("PivotFilters", PivotFilters);
    v.put("PivotFormula", PivotFormula);
    v.put("PivotFormulas", PivotFormulas);
    v.put("PivotItem", PivotItem);
    v.put("PivotItemList", PivotItemList);
    v.put("PivotItems", PivotItems);
    v.put("PivotLayout", PivotLayout);
    v.put("PivotLine", PivotLine);
    v.put("PivotLineCells", PivotLineCells);
    v.put("PivotLines", PivotLines);
    v.put("PivotTable", PivotTable);
    v.put("PivotTables", PivotTables);
    v.put("PlotArea", PlotArea);
    v.put("Point", Point);
    v.put("Points", Points);
    v.put("Protection", Protection);
    v.put("PublishObject", PublishObject);
    v.put("PublishObjects", PublishObjects);
    v.put("QueryTables", QueryTables);
    v.put("RTD", RTD);
    v.put("Range", Range);
    v.put("Ranges", Ranges);
    v.put("RecentFile", RecentFile);
    v.put("RecentFiles", RecentFiles);
    v.put("Rectangle", Rectangle);
    v.put("Rectangles", Rectangles);
    v.put("RectangularGradient", RectangularGradient);
    v.put("RefreshEvents", RefreshEvents);
    v.put("Research", Research);
    v.put("RoutingSlip", RoutingSlip);
    v.put("Scenario", Scenario);
    v.put("Scenarios", Scenarios);
    v.put("ScrollBar", ScrollBar);
    v.put("ScrollBars", ScrollBars);
    v.put("Series", Series);
    v.put("SeriesCollection", SeriesCollection);
    v.put("SeriesLines", SeriesLines);
    v.put("ServerViewableItems", ServerViewableItems);
    v.put("ShadowFormat", ShadowFormat);
    v.put("Shape", Shape);
    v.put("ShapeNode", ShapeNode);
    v.put("ShapeNodes", ShapeNodes);
    v.put("ShapeRange", ShapeRange);
    v.put("Shapes", Shapes);
    v.put("SheetViews", SheetViews);
    v.put("Sheets", Sheets);
    v.put("SmartTag", SmartTag);
    v.put("SmartTagAction", SmartTagAction);
    v.put("SmartTagActions", SmartTagActions);
    v.put("SmartTagOptions", SmartTagOptions);
    v.put("SmartTagRecognizer", SmartTagRecognizer);
    v.put("SmartTagRecognizers", SmartTagRecognizers);
    v.put("SmartTags", SmartTags);
    v.put("Sort", Sort);
    v.put("SortField", SortField);
    v.put("SortFields", SortFields);
    v.put("SoundNote", SoundNote);
    v.put("Speech", Speech);
    v.put("SpellingOptions", SpellingOptions);
    v.put("Spinner", Spinner);
    v.put("Spinners", Spinners);
    v.put("Style", Style);
    v.put("Styles", Styles);
    v.put("Tab", Tab);
    v.put("TableStyle", TableStyle);
    v.put("TableStyleElement", TableStyleElement);
    v.put("TableStyleElements", TableStyleElements);
    v.put("TableStyles", TableStyles);
    v.put("TextBox", TextBox);
    v.put("TextBoxes", TextBoxes);
    v.put("TextEffectFormat", TextEffectFormat);
    v.put("TextFrame", TextFrame);
    v.put("TextFrame2", TextFrame2);
    v.put("ThreeDFormat", ThreeDFormat);
    v.put("TickLabels", TickLabels);
    v.put("Toolbar", Toolbar);
    v.put("ToolbarButton", ToolbarButton);
    v.put("ToolbarButtons", ToolbarButtons);
    v.put("Toolbars", Toolbars);
    v.put("Top10", Top10);
    v.put("TreeviewControl", TreeviewControl);
    v.put("Trendline", Trendline);
    v.put("Trendlines", Trendlines);
    v.put("UniqueValues", UniqueValues);
    v.put("UpBars", UpBars);
    v.put("UsedObjects", UsedObjects);
    v.put("UserAccess", UserAccess);
    v.put("UserAccessList", UserAccessList);
    v.put("VPageBreak", VPageBreak);
    v.put("VPageBreaks", VPageBreaks);
    v.put("Validation", Validation);
    v.put("Walls", Walls);
    v.put("Watch", Watch);
    v.put("Watches", Watches);
    v.put("WebOptions", WebOptions);
    v.put("Window", Window);
    v.put("Windows", Windows);
    v.put("WorkbookConnection", WorkbookConnection);
    v.put("WorkbookEvents", WorkbookEvents);
    v.put("Workbooks", Workbooks);
    v.put("WorksheetFunction", WorksheetFunction);
    v.put("WorksheetView", WorksheetView);
    v.put("Worksheets", Worksheets);
    v.put("XPath", XPath);
    v.put("XmlDataBinding", XmlDataBinding);
    v.put("XmlMap", XmlMap);
    v.put("XmlMaps", XmlMaps);
    v.put("XmlNamespace", XmlNamespace);
    v.put("XmlNamespaces", XmlNamespaces);
    v.put("XmlSchema", XmlSchema);
    v.put("XmlSchemas", XmlSchemas);
    v.put("_Application", _Application);
    v.put("_Chart", _Chart);
    v.put("_Global", _Global);
    v.put("_IOLEObject", _IOLEObject);
    v.put("_IQueryTable", _IQueryTable);
    v.put("_OLEObject", _OLEObject);
    v.put("_QueryTable", _QueryTable);
    v.put("_Workbook", _Workbook);
    v.put("_Worksheet", _Worksheet);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
