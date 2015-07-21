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
package org.codehaus.groovy.scriptom.tlb.office.access;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class Access
{
  private Access()
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
   *   <li><b>Application</b> = Access.Application.11</li>
   * </ul>
   */
  public final static Map<String,String> progIds;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Application", "Access.Application.11");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

 /** GUID for this type library. */
  public static final String GUID = "{4AFFC9A0-5F99-101B-AF4E-00AA003F0F07}";

  /**
   * CoClass: AccessField
   */
  public final static String AccessField = "{B1C1EAC1-486F-11CE-A65D-00AA003F0F07}";

  /**
   * CoClass: AdditionalData
   */
  public final static String AdditionalData = "{DBC51762-A8ED-11D3-A0DD-00C04F68712B}";

  /**
   * CoClass: AllDataAccessPages
   */
  public final static String AllDataAccessPages = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * CoClass: AllDatabaseDiagrams
   */
  public final static String AllDatabaseDiagrams = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * CoClass: AllForms
   */
  public final static String AllForms = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * CoClass: AllFunctions
   */
  public final static String AllFunctions = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * CoClass: AllMacros
   */
  public final static String AllMacros = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * CoClass: AllModules
   */
  public final static String AllModules = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * CoClass: AllQueries
   */
  public final static String AllQueries = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * CoClass: AllReports
   */
  public final static String AllReports = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * CoClass: AllStoredProcedures
   */
  public final static String AllStoredProcedures = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * CoClass: AllTables
   */
  public final static String AllTables = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * CoClass: AllViews
   */
  public final static String AllViews = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * CoClass: Application
   */
  public final static String Application = "{68CCE6C0-6129-101B-AF4E-00AA003F0F07}";

  /**
   * CoClass: AutoCorrect
   */
  public final static String AutoCorrect = "{063A8DE5-E2C5-44EA-A90E-6D42207D25C8}";

  /**
   * CoClass: BoundObjectFrame
   */
  public final static String BoundObjectFrame = "{3B06E958-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: CheckBox
   */
  public final static String CheckBox = "{3B06E954-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: Class
   */
  public final static String Class = "{8B06E320-B23C-11CF-89A8-00A0C9054129}";

  /**
   * CoClass: CodeData
   */
  public final static String CodeData = "{9212BA73-3E79-11D1-98BD-006008197D41}";

  /**
   * CoClass: CodeProject
   */
  public final static String CodeProject = "{9212BA71-3E79-11D1-98BD-006008197D41}";

  /**
   * CoClass: ComboBox
   */
  public final static String ComboBox = "{3B06E95C-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: CommandButton
   */
  public final static String CommandButton = "{3B06E950-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: Control
   */
  public final static String Control = "{26B96540-8F8E-101B-AF4E-00AA003F0F07}";

  /**
   * CoClass: CurrentData
   */
  public final static String CurrentData = "{9212BA73-3E79-11D1-98BD-006008197D41}";

  /**
   * CoClass: CurrentProject
   */
  public final static String CurrentProject = "{9212BA71-3E79-11D1-98BD-006008197D41}";

  /**
   * CoClass: CustomControl
   */
  public final static String CustomControl = "{3B06E968-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: DataAccessPage
   */
  public final static String DataAccessPage = "{493D8A72-1DB1-11D1-98A2-006008197D41}";

  /**
   * CoClass: DefaultWebOptions
   */
  public final static String DefaultWebOptions = "{416ED4F0-AB31-11D1-BF72-0060083E43CF}";

  /**
   * CoClass: DependencyInfo
   */
  public final static String DependencyInfo = "{D05819C6-8859-418B-A82F-18B6CB743C8E}";

  /**
   * CoClass: DependencyObjects
   */
  public final static String DependencyObjects = "{79F41340-18C4-4AA1-86EE-5CDE9D2CE600}";

  /**
   * CoClass: Form
   */
  public final static String Form = "{3F4A878E-C395-11D3-8D1F-0050048383FB}";

  /**
   * CoClass: FormOld
   */
  public final static String FormOld = "{E5135D80-8F8D-101B-AF4E-00AA003F0F07}";

  /**
   * CoClass: FormatCondition
   */
  public final static String FormatCondition = "{E27A992C-A330-11D0-81DD-00C04FC2F51B}";

  /**
   * CoClass: GroupLevel
   */
  public final static String GroupLevel = "{331FDD27-CF31-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: Hyperlink
   */
  public final static String Hyperlink = "{50D56611-60AC-11CF-82C9-00AA004B9FE6}";

  /**
   * CoClass: Image
   */
  public final static String Image = "{3B06E94E-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: Label
   */
  public final static String Label = "{3B06E948-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: Line
   */
  public final static String Line = "{3B06E94C-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: ListBox
   */
  public final static String ListBox = "{3B06E95A-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: ObjectFrame
   */
  public final static String ObjectFrame = "{3B06E95E-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: OptionButton
   */
  public final static String OptionButton = "{3B06E952-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: OptionGroup
   */
  public final static String OptionGroup = "{3B06E956-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: Page
   */
  public final static String Page = "{3B06E974-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: PageBreak
   */
  public final static String PageBreak = "{3B06E960-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: PaletteButton
   */
  public final static String PaletteButton = "{9CD4A760-A6A9-11CE-A686-00AA003F0F07}";

  /**
   * CoClass: Printer
   */
  public final static String Printer = "{DBC5175F-A8ED-11D3-A0DD-00C04F68712B}";

  /**
   * CoClass: Rectangle
   */
  public final static String Rectangle = "{3B06E94A-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: References
   */
  public final static String References = "{EB106213-9C89-11CF-A2B3-00A0C90542FF}";

  /**
   * CoClass: Report
   */
  public final static String Report = "{32A1C62A-D374-11D3-8D21-0050048383FB}";

  /**
   * CoClass: ReportOld
   */
  public final static String ReportOld = "{3E8B6B00-91FF-101B-AF4E-00AA003F0F07}";

  /**
   * CoClass: Section
   */
  public final static String Section = "{331FDCFC-CF31-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: SmartTag
   */
  public final static String SmartTag = "{9D2AB5D3-CD72-4A9A-A72E-2B3492CBD0AE}";

  /**
   * CoClass: SmartTagAction
   */
  public final static String SmartTagAction = "{1560BE9F-0718-42BE-BB2B-D6706593AC40}";

  /**
   * CoClass: SmartTagActions
   */
  public final static String SmartTagActions = "{3836C9EC-E9CB-4817-A738-50B4DD3DDD8D}";

  /**
   * CoClass: SmartTagProperties
   */
  public final static String SmartTagProperties = "{3A6A13FF-1162-461D-899C-768D025119FB}";

  /**
   * CoClass: SmartTagProperty
   */
  public final static String SmartTagProperty = "{6A3308EA-73DF-436A-A826-41A1F02186C4}";

  /**
   * CoClass: SmartTags
   */
  public final static String SmartTags = "{B1F7DE76-AE97-48D9-A4FD-2C172B2BD7A9}";

  /**
   * CoClass: SubForm
   */
  public final static String SubForm = "{3B06E964-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: SubReport
   */
  public final static String SubReport = "{3B06E966-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: TabControl
   */
  public final static String TabControl = "{3B06E971-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: TextBox
   */
  public final static String TextBox = "{3B06E946-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: ToggleButton
   */
  public final static String ToggleButton = "{3B06E962-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: WebOptions
   */
  public final static String WebOptions = "{416ED4F6-AB31-11D1-BF72-0060083E43CF}";

  /**
   * CoClass: WizHook
   */
  public final static String WizHook = "{CB9D3171-4728-11D1-8334-006008197CC8}";

  /**
   * CoClass: _CheckBoxInOption
   */
  public final static String _CheckBoxInOption = "{3B06E954-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: _ChildLabel
   */
  public final static String _ChildLabel = "{3B06E948-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: _ControlInReportEvents
   */
  public final static String _ControlInReportEvents = "{26B96540-8F8E-101B-AF4E-00AA003F0F07}";

  /**
   * CoClass: _CustomControlInReport
   */
  public final static String _CustomControlInReport = "{3B06E968-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: _OptionButtonInOption
   */
  public final static String _OptionButtonInOption = "{3B06E952-E47C-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: _PageHdrFtrInReport
   */
  public final static String _PageHdrFtrInReport = "{331FDCFC-CF31-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: _SectionInReport
   */
  public final static String _SectionInReport = "{331FDCFC-CF31-11CD-8701-00AA003F0F07}";

  /**
   * CoClass: _ToggleButtonInOption
   */
  public final static String _ToggleButtonInOption = "{3B06E962-E47C-11CD-8701-00AA003F0F07}";

  /**
   * A {@code Map} of CoClass names to default interface GUIDs for this type library.
   */
  public final static Map<String,String> coClasses;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("AccessField", AccessField);
    v.put("AdditionalData", AdditionalData);
    v.put("AllDataAccessPages", AllDataAccessPages);
    v.put("AllDatabaseDiagrams", AllDatabaseDiagrams);
    v.put("AllForms", AllForms);
    v.put("AllFunctions", AllFunctions);
    v.put("AllMacros", AllMacros);
    v.put("AllModules", AllModules);
    v.put("AllQueries", AllQueries);
    v.put("AllReports", AllReports);
    v.put("AllStoredProcedures", AllStoredProcedures);
    v.put("AllTables", AllTables);
    v.put("AllViews", AllViews);
    v.put("Application", Application);
    v.put("AutoCorrect", AutoCorrect);
    v.put("BoundObjectFrame", BoundObjectFrame);
    v.put("CheckBox", CheckBox);
    v.put("Class", Class);
    v.put("CodeData", CodeData);
    v.put("CodeProject", CodeProject);
    v.put("ComboBox", ComboBox);
    v.put("CommandButton", CommandButton);
    v.put("Control", Control);
    v.put("CurrentData", CurrentData);
    v.put("CurrentProject", CurrentProject);
    v.put("CustomControl", CustomControl);
    v.put("DataAccessPage", DataAccessPage);
    v.put("DefaultWebOptions", DefaultWebOptions);
    v.put("DependencyInfo", DependencyInfo);
    v.put("DependencyObjects", DependencyObjects);
    v.put("Form", Form);
    v.put("FormOld", FormOld);
    v.put("FormatCondition", FormatCondition);
    v.put("GroupLevel", GroupLevel);
    v.put("Hyperlink", Hyperlink);
    v.put("Image", Image);
    v.put("Label", Label);
    v.put("Line", Line);
    v.put("ListBox", ListBox);
    v.put("ObjectFrame", ObjectFrame);
    v.put("OptionButton", OptionButton);
    v.put("OptionGroup", OptionGroup);
    v.put("Page", Page);
    v.put("PageBreak", PageBreak);
    v.put("PaletteButton", PaletteButton);
    v.put("Printer", Printer);
    v.put("Rectangle", Rectangle);
    v.put("References", References);
    v.put("Report", Report);
    v.put("ReportOld", ReportOld);
    v.put("Section", Section);
    v.put("SmartTag", SmartTag);
    v.put("SmartTagAction", SmartTagAction);
    v.put("SmartTagActions", SmartTagActions);
    v.put("SmartTagProperties", SmartTagProperties);
    v.put("SmartTagProperty", SmartTagProperty);
    v.put("SmartTags", SmartTags);
    v.put("SubForm", SubForm);
    v.put("SubReport", SubReport);
    v.put("TabControl", TabControl);
    v.put("TextBox", TextBox);
    v.put("ToggleButton", ToggleButton);
    v.put("WebOptions", WebOptions);
    v.put("WizHook", WizHook);
    v.put("_CheckBoxInOption", _CheckBoxInOption);
    v.put("_ChildLabel", _ChildLabel);
    v.put("_ControlInReportEvents", _ControlInReportEvents);
    v.put("_CustomControlInReport", _CustomControlInReport);
    v.put("_OptionButtonInOption", _OptionButtonInOption);
    v.put("_PageHdrFtrInReport", _PageHdrFtrInReport);
    v.put("_SectionInReport", _SectionInReport);
    v.put("_ToggleButtonInOption", _ToggleButtonInOption);
    coClasses = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: AccessObject
   */
  public final static String AccessObject = "{ABE316B1-3FF6-11D1-98BD-006008197D41}";

  /**
   * Interface: AccessObjectProperties
   */
  public final static String AccessObjectProperties = "{0921F331-A7C9-11D1-9944-006008197D41}";

  /**
   * Interface: AccessObjectProperty
   */
  public final static String AccessObjectProperty = "{1FE3E471-A7D0-11D1-9944-006008197D41}";

  /**
   * Interface: AllObjects
   */
  public final static String AllObjects = "{DDBD4001-44D5-11D1-98C0-006008197D41}";

  /**
   * Interface: Children
   */
  public final static String Children = "{3B06E977-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: Controls
   */
  public final static String Controls = "{5970C574-EB8C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: DataAccessPages
   */
  public final static String DataAccessPages = "{493D8A71-1DB1-11D1-98A2-006008197D41}";

  /**
   * Interface: DoCmd
   */
  public final static String DoCmd = "{C547E760-9658-101B-81EE-00AA004750E2}";

  /**
   * Interface: FormatConditions
   */
  public final static String FormatConditions = "{E27A992E-A330-11D0-81DD-00C04FC2F51B}";

  /**
   * Interface: Forms
   */
  public final static String Forms = "{B1BB0E80-6128-101B-AF4E-00AA003F0F07}";

  /**
   * Interface: Module
   */
  public final static String Module = "{331FDCFE-CF31-11CD-8701-00AA003F0F07}";

  /**
   * Interface: Modules
   */
  public final static String Modules = "{9DD0AF42-6E28-11CF-9008-00AA0042B7CE}";

  /**
   * Interface: Pages
   */
  public final static String Pages = "{3B06E978-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: Printers
   */
  public final static String Printers = "{DBC51760-A8ED-11D3-A0DD-00C04F68712B}";

  /**
   * Interface: Properties
   */
  public final static String Properties = "{331FDD02-CF31-11CD-8701-00AA003F0F07}";

  /**
   * Interface: Reference
   */
  public final static String Reference = "{EB106212-9C89-11CF-A2B3-00A0C90542FF}";

  /**
   * Interface: Reports
   */
  public final static String Reports = "{D1523700-6128-101B-AF4E-00AA003F0F07}";

  /**
   * Interface: Screen
   */
  public final static String Screen = "{DC6B66C0-6128-101B-AF4E-00AA003F0F07}";

  /**
   * Interface: _AccessField
   */
  public final static String _AccessField = "{B1C1EAC1-486F-11CE-A65D-00AA003F0F07}";

  /**
   * Interface: _AccessProperty
   */
  public final static String _AccessProperty = "{331FDD00-CF31-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _AdditionalData
   */
  public final static String _AdditionalData = "{DBC51762-A8ED-11D3-A0DD-00C04F68712B}";

  /**
   * Interface: _Application
   */
  public final static String _Application = "{68CCE6C0-6129-101B-AF4E-00AA003F0F07}";

  /**
   * Interface: _AutoCorrect
   */
  public final static String _AutoCorrect = "{063A8DE5-E2C5-44EA-A90E-6D42207D25C8}";

  /**
   * Interface: _BoundObjectFrame
   */
  public final static String _BoundObjectFrame = "{3B06E958-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _BoundObjectFrameEvents
   */
  public final static String _BoundObjectFrameEvents = "{BC9E4349-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _CheckBoxEvents
   */
  public final static String _CheckBoxEvents = "{BC9E4347-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _CheckBoxInOptionEvents
   */
  public final static String _CheckBoxInOptionEvents = "{BC9E435D-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _Checkbox
   */
  public final static String _Checkbox = "{3B06E954-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _ChildLabelEvents
   */
  public final static String _ChildLabelEvents = "{BC9E4358-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _ComboBoxEvents
   */
  public final static String _ComboBoxEvents = "{BC9E434C-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _Combobox
   */
  public final static String _Combobox = "{3B06E95C-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _CommandButton
   */
  public final static String _CommandButton = "{3B06E950-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _CommandButtonEvents
   */
  public final static String _CommandButtonEvents = "{BC9E4345-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _Control
   */
  public final static String _Control = "{26B96540-8F8E-101B-AF4E-00AA003F0F07}";

  /**
   * Interface: _CurrentData
   */
  public final static String _CurrentData = "{9212BA73-3E79-11D1-98BD-006008197D41}";

  /**
   * Interface: _CurrentProject
   */
  public final static String _CurrentProject = "{9212BA71-3E79-11D1-98BD-006008197D41}";

  /**
   * Interface: _CustomControl
   */
  public final static String _CustomControl = "{3B06E968-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _CustomControlEvents
   */
  public final static String _CustomControlEvents = "{BC9E4352-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _CustomControlInReportEvents
   */
  public final static String _CustomControlInReportEvents = "{300471E2-7426-11CE-AB64-00AA0042B7CE}";

  /**
   * Interface: _DataAccessPage
   */
  public final static String _DataAccessPage = "{493D8A72-1DB1-11D1-98A2-006008197D41}";

  /**
   * Interface: _DefaultWebOptions
   */
  public final static String _DefaultWebOptions = "{416ED4F0-AB31-11D1-BF72-0060083E43CF}";

  /**
   * Interface: _DependencyInfo
   */
  public final static String _DependencyInfo = "{D05819C6-8859-418B-A82F-18B6CB743C8E}";

  /**
   * Interface: _DependencyObjects
   */
  public final static String _DependencyObjects = "{79F41340-18C4-4AA1-86EE-5CDE9D2CE600}";

  /**
   * Interface: _Dummy
   */
  public final static String _Dummy = "{8B06E320-B23C-11CF-89A8-00A0C9054129}";

  /**
   * Interface: _DummyEvents
   */
  public final static String _DummyEvents = "{58BF3100-B580-11CF-89A8-00A0C9054129}";

  /**
   * Interface: _Form
   */
  public final static String _Form = "{E5135D80-8F8D-101B-AF4E-00AA003F0F07}";

  /**
   * Interface: _Form2
   */
  public final static String _Form2 = "{3F4A878E-C395-11D3-8D1F-0050048383FB}";

  /**
   * Interface: _FormEvents
   */
  public final static String _FormEvents = "{331FDCFB-CF31-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _FormatCondition
   */
  public final static String _FormatCondition = "{E27A992C-A330-11D0-81DD-00C04FC2F51B}";

  /**
   * Interface: _GroupLevel
   */
  public final static String _GroupLevel = "{331FDD27-CF31-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _Hyperlink
   */
  public final static String _Hyperlink = "{50D56611-60AC-11CF-82C9-00AA004B9FE6}";

  /**
   * Interface: _Image
   */
  public final static String _Image = "{3B06E94E-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _ImageEvents
   */
  public final static String _ImageEvents = "{BC9E4344-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _ItemsSelected
   */
  public final static String _ItemsSelected = "{31B09710-EADC-11CD-B9F7-00AA004753B5}";

  /**
   * Interface: _Label
   */
  public final static String _Label = "{3B06E948-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _LabelEvents
   */
  public final static String _LabelEvents = "{BC9E4341-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _Line
   */
  public final static String _Line = "{3B06E94C-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _LineEvents
   */
  public final static String _LineEvents = "{BC9E4343-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _ListBox
   */
  public final static String _ListBox = "{3B06E95A-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _ListBoxEvents
   */
  public final static String _ListBoxEvents = "{BC9E434B-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _ObjectFrame
   */
  public final static String _ObjectFrame = "{3B06E95E-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _ObjectFrameEvents
   */
  public final static String _ObjectFrameEvents = "{BC9E434D-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _OptionButton
   */
  public final static String _OptionButton = "{3B06E952-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _OptionButtonEvents
   */
  public final static String _OptionButtonEvents = "{BC9E4346-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _OptionButtonInOptionEvents
   */
  public final static String _OptionButtonInOptionEvents = "{BC9E435B-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _OptionGroup
   */
  public final static String _OptionGroup = "{3B06E956-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _OptionGroupEvents
   */
  public final static String _OptionGroupEvents = "{BC9E4348-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _Page
   */
  public final static String _Page = "{3B06E974-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _PageBreak
   */
  public final static String _PageBreak = "{3B06E960-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _PageBreakEvents
   */
  public final static String _PageBreakEvents = "{BC9E434E-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _PageEvents
   */
  public final static String _PageEvents = "{3B06E975-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _PageHdrFtrInReportEvents
   */
  public final static String _PageHdrFtrInReportEvents = "{7AD9E905-BAF8-11CE-A68A-00AA003F0F07}";

  /**
   * Interface: _PaletteButton
   */
  public final static String _PaletteButton = "{9CD4A760-A6A9-11CE-A686-00AA003F0F07}";

  /**
   * Interface: _PaletteButtonEvents
   */
  public final static String _PaletteButtonEvents = "{A843CCD0-6E2C-11CF-A219-00A0C90542FF}";

  /**
   * Interface: _Printer
   */
  public final static String _Printer = "{DBC5175F-A8ED-11D3-A0DD-00C04F68712B}";

  /**
   * Interface: _RecordsetEvents
   */
  public final static String _RecordsetEvents = "{45165490-EF32-11D0-86FB-006097C9818C}";

  /**
   * Interface: _Rectangle
   */
  public final static String _Rectangle = "{3B06E94A-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _RectangleEvents
   */
  public final static String _RectangleEvents = "{BC9E4342-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _References
   */
  public final static String _References = "{EB106213-9C89-11CF-A2B3-00A0C90542FF}";

  /**
   * Interface: _References_Events
   */
  public final static String _References_Events = "{F163F201-ADA2-11CF-89A9-00A0C9054129}";

  /**
   * Interface: _Report
   */
  public final static String _Report = "{3E8B6B00-91FF-101B-AF4E-00AA003F0F07}";

  /**
   * Interface: _Report2
   */
  public final static String _Report2 = "{32A1C62A-D374-11D3-8D21-0050048383FB}";

  /**
   * Interface: _ReportEvents
   */
  public final static String _ReportEvents = "{BC9E4357-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _Section
   */
  public final static String _Section = "{331FDCFC-CF31-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _SectionEvents
   */
  public final static String _SectionEvents = "{BC9E4353-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _SectionInReportEvents
   */
  public final static String _SectionInReportEvents = "{BC9E4361-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _SmartTag
   */
  public final static String _SmartTag = "{9D2AB5D3-CD72-4A9A-A72E-2B3492CBD0AE}";

  /**
   * Interface: _SmartTagAction
   */
  public final static String _SmartTagAction = "{1560BE9F-0718-42BE-BB2B-D6706593AC40}";

  /**
   * Interface: _SmartTagActions
   */
  public final static String _SmartTagActions = "{3836C9EC-E9CB-4817-A738-50B4DD3DDD8D}";

  /**
   * Interface: _SmartTagProperties
   */
  public final static String _SmartTagProperties = "{3A6A13FF-1162-461D-899C-768D025119FB}";

  /**
   * Interface: _SmartTagProperty
   */
  public final static String _SmartTagProperty = "{6A3308EA-73DF-436A-A826-41A1F02186C4}";

  /**
   * Interface: _SmartTags
   */
  public final static String _SmartTags = "{B1F7DE76-AE97-48D9-A4FD-2C172B2BD7A9}";

  /**
   * Interface: _SubForm
   */
  public final static String _SubForm = "{3B06E964-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _SubFormEvents
   */
  public final static String _SubFormEvents = "{BC9E4350-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _SubReport
   */
  public final static String _SubReport = "{3B06E966-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _SubReportEvents
   */
  public final static String _SubReportEvents = "{BC9E4351-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _TabControl
   */
  public final static String _TabControl = "{3B06E971-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _TabControlEvents
   */
  public final static String _TabControlEvents = "{3B06E972-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _TextBoxEvents
   */
  public final static String _TextBoxEvents = "{BC9E4340-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _Textbox
   */
  public final static String _Textbox = "{3B06E946-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _ToggleButton
   */
  public final static String _ToggleButton = "{3B06E962-E47C-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _ToggleButtonEvents
   */
  public final static String _ToggleButtonEvents = "{BC9E434F-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _ToggleButtonInOptionEvents
   */
  public final static String _ToggleButtonInOptionEvents = "{BC9E435F-F037-11CD-8701-00AA003F0F07}";

  /**
   * Interface: _WebOptions
   */
  public final static String _WebOptions = "{416ED4F6-AB31-11D1-BF72-0060083E43CF}";

  /**
   * Interface: _WizHook
   */
  public final static String _WizHook = "{CB9D3171-4728-11D1-8334-006008197CC8}";

  /**
   * Interface: __ControlInReportEvents
   */
  public final static String __ControlInReportEvents = "{90B322A5-F1D9-11CD-8701-00AA003F0F07}";

  /**
   * Interface: __Help
   */
  public final static String __Help = "{9CD4A761-A6A9-11CE-A686-00AA003F0F07}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map<String,String> interfaces;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("AccessObject", AccessObject);
    v.put("AccessObjectProperties", AccessObjectProperties);
    v.put("AccessObjectProperty", AccessObjectProperty);
    v.put("AllObjects", AllObjects);
    v.put("Children", Children);
    v.put("Controls", Controls);
    v.put("DataAccessPages", DataAccessPages);
    v.put("DoCmd", DoCmd);
    v.put("FormatConditions", FormatConditions);
    v.put("Forms", Forms);
    v.put("Module", Module);
    v.put("Modules", Modules);
    v.put("Pages", Pages);
    v.put("Printers", Printers);
    v.put("Properties", Properties);
    v.put("Reference", Reference);
    v.put("Reports", Reports);
    v.put("Screen", Screen);
    v.put("_AccessField", _AccessField);
    v.put("_AccessProperty", _AccessProperty);
    v.put("_AdditionalData", _AdditionalData);
    v.put("_Application", _Application);
    v.put("_AutoCorrect", _AutoCorrect);
    v.put("_BoundObjectFrame", _BoundObjectFrame);
    v.put("_BoundObjectFrameEvents", _BoundObjectFrameEvents);
    v.put("_CheckBoxEvents", _CheckBoxEvents);
    v.put("_CheckBoxInOptionEvents", _CheckBoxInOptionEvents);
    v.put("_Checkbox", _Checkbox);
    v.put("_ChildLabelEvents", _ChildLabelEvents);
    v.put("_ComboBoxEvents", _ComboBoxEvents);
    v.put("_Combobox", _Combobox);
    v.put("_CommandButton", _CommandButton);
    v.put("_CommandButtonEvents", _CommandButtonEvents);
    v.put("_Control", _Control);
    v.put("_CurrentData", _CurrentData);
    v.put("_CurrentProject", _CurrentProject);
    v.put("_CustomControl", _CustomControl);
    v.put("_CustomControlEvents", _CustomControlEvents);
    v.put("_CustomControlInReportEvents", _CustomControlInReportEvents);
    v.put("_DataAccessPage", _DataAccessPage);
    v.put("_DefaultWebOptions", _DefaultWebOptions);
    v.put("_DependencyInfo", _DependencyInfo);
    v.put("_DependencyObjects", _DependencyObjects);
    v.put("_Dummy", _Dummy);
    v.put("_DummyEvents", _DummyEvents);
    v.put("_Form", _Form);
    v.put("_Form2", _Form2);
    v.put("_FormEvents", _FormEvents);
    v.put("_FormatCondition", _FormatCondition);
    v.put("_GroupLevel", _GroupLevel);
    v.put("_Hyperlink", _Hyperlink);
    v.put("_Image", _Image);
    v.put("_ImageEvents", _ImageEvents);
    v.put("_ItemsSelected", _ItemsSelected);
    v.put("_Label", _Label);
    v.put("_LabelEvents", _LabelEvents);
    v.put("_Line", _Line);
    v.put("_LineEvents", _LineEvents);
    v.put("_ListBox", _ListBox);
    v.put("_ListBoxEvents", _ListBoxEvents);
    v.put("_ObjectFrame", _ObjectFrame);
    v.put("_ObjectFrameEvents", _ObjectFrameEvents);
    v.put("_OptionButton", _OptionButton);
    v.put("_OptionButtonEvents", _OptionButtonEvents);
    v.put("_OptionButtonInOptionEvents", _OptionButtonInOptionEvents);
    v.put("_OptionGroup", _OptionGroup);
    v.put("_OptionGroupEvents", _OptionGroupEvents);
    v.put("_Page", _Page);
    v.put("_PageBreak", _PageBreak);
    v.put("_PageBreakEvents", _PageBreakEvents);
    v.put("_PageEvents", _PageEvents);
    v.put("_PageHdrFtrInReportEvents", _PageHdrFtrInReportEvents);
    v.put("_PaletteButton", _PaletteButton);
    v.put("_PaletteButtonEvents", _PaletteButtonEvents);
    v.put("_Printer", _Printer);
    v.put("_RecordsetEvents", _RecordsetEvents);
    v.put("_Rectangle", _Rectangle);
    v.put("_RectangleEvents", _RectangleEvents);
    v.put("_References", _References);
    v.put("_References_Events", _References_Events);
    v.put("_Report", _Report);
    v.put("_Report2", _Report2);
    v.put("_ReportEvents", _ReportEvents);
    v.put("_Section", _Section);
    v.put("_SectionEvents", _SectionEvents);
    v.put("_SectionInReportEvents", _SectionInReportEvents);
    v.put("_SmartTag", _SmartTag);
    v.put("_SmartTagAction", _SmartTagAction);
    v.put("_SmartTagActions", _SmartTagActions);
    v.put("_SmartTagProperties", _SmartTagProperties);
    v.put("_SmartTagProperty", _SmartTagProperty);
    v.put("_SmartTags", _SmartTags);
    v.put("_SubForm", _SubForm);
    v.put("_SubFormEvents", _SubFormEvents);
    v.put("_SubReport", _SubReport);
    v.put("_SubReportEvents", _SubReportEvents);
    v.put("_TabControl", _TabControl);
    v.put("_TabControlEvents", _TabControlEvents);
    v.put("_TextBoxEvents", _TextBoxEvents);
    v.put("_Textbox", _Textbox);
    v.put("_ToggleButton", _ToggleButton);
    v.put("_ToggleButtonEvents", _ToggleButtonEvents);
    v.put("_ToggleButtonInOptionEvents", _ToggleButtonInOptionEvents);
    v.put("_WebOptions", _WebOptions);
    v.put("_WizHook", _WizHook);
    v.put("__ControlInReportEvents", __ControlInReportEvents);
    v.put("__Help", __Help);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
