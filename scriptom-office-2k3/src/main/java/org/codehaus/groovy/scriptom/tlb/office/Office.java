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
   * Interface: FoundFiles
   */
  public final static String FoundFiles = "{000C0331-0000-0000-C000-000000000046}";

  /**
   * Interface: FreeformBuilder
   */
  public final static String FreeformBuilder = "{000C0315-0000-0000-C000-000000000046}";

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
   * Interface: IMsoDiagram
   */
  public final static String IMsoDiagram = "{000C036D-0000-0000-C000-000000000046}";

  /**
   * Interface: IMsoDispCagNotifySink
   */
  public final static String IMsoDispCagNotifySink = "{000C0359-0000-0000-C000-000000000046}";

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
   * Interface: LanguageSettings
   */
  public final static String LanguageSettings = "{000C0353-0000-0000-C000-000000000046}";

  /**
   * Interface: LineFormat
   */
  public final static String LineFormat = "{000C0317-0000-0000-C000-000000000046}";

  /**
   * Interface: MsoDebugOptions
   */
  public final static String MsoDebugOptions = "{000C035A-0000-0000-C000-000000000046}";

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
   * Interface: Permission
   */
  public final static String Permission = "{000C0376-0000-0000-C000-000000000046}";

  /**
   * Interface: PictureFormat
   */
  public final static String PictureFormat = "{000C031A-0000-0000-C000-000000000046}";

  /**
   * Interface: PropertyTest
   */
  public final static String PropertyTest = "{000C0333-0000-0000-C000-000000000046}";

  /**
   * Interface: PropertyTests
   */
  public final static String PropertyTests = "{000C0334-0000-0000-C000-000000000046}";

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
   * Interface: SignatureSet
   */
  public final static String SignatureSet = "{000C0410-0000-0000-C000-000000000046}";

  /**
   * Interface: SmartDocument
   */
  public final static String SmartDocument = "{000C0377-0000-0000-C000-000000000046}";

  /**
   * Interface: Sync
   */
  public final static String Sync = "{000C0386-0000-0000-C000-000000000046}";

  /**
   * Interface: TextEffectFormat
   */
  public final static String TextEffectFormat = "{000C031F-0000-0000-C000-000000000046}";

  /**
   * Interface: TextFrame
   */
  public final static String TextFrame = "{000C0320-0000-0000-C000-000000000046}";

  /**
   * Interface: ThreeDFormat
   */
  public final static String ThreeDFormat = "{000C0321-0000-0000-C000-000000000046}";

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
    v.put("Balloon", Balloon);
    v.put("BalloonCheckbox", BalloonCheckbox);
    v.put("BalloonCheckboxes", BalloonCheckboxes);
    v.put("BalloonLabel", BalloonLabel);
    v.put("BalloonLabels", BalloonLabels);
    v.put("COMAddIn", COMAddIn);
    v.put("COMAddIns", COMAddIns);
    v.put("CalloutFormat", CalloutFormat);
    v.put("CanvasShapes", CanvasShapes);
    v.put("ColorFormat", ColorFormat);
    v.put("CommandBar", CommandBar);
    v.put("CommandBarControl", CommandBarControl);
    v.put("CommandBarControls", CommandBarControls);
    v.put("CommandBarPopup", CommandBarPopup);
    v.put("ConnectorFormat", ConnectorFormat);
    v.put("DiagramNode", DiagramNode);
    v.put("DiagramNodeChildren", DiagramNodeChildren);
    v.put("DiagramNodes", DiagramNodes);
    v.put("DocumentLibraryVersion", DocumentLibraryVersion);
    v.put("DocumentLibraryVersions", DocumentLibraryVersions);
    v.put("DocumentProperties", DocumentProperties);
    v.put("DocumentProperty", DocumentProperty);
    v.put("FileDialog", FileDialog);
    v.put("FileDialogFilter", FileDialogFilter);
    v.put("FileDialogFilters", FileDialogFilters);
    v.put("FileDialogSelectedItems", FileDialogSelectedItems);
    v.put("FileSearch", FileSearch);
    v.put("FileTypes", FileTypes);
    v.put("FillFormat", FillFormat);
    v.put("FoundFiles", FoundFiles);
    v.put("FreeformBuilder", FreeformBuilder);
    v.put("GroupShapes", GroupShapes);
    v.put("HTMLProject", HTMLProject);
    v.put("HTMLProjectItem", HTMLProjectItem);
    v.put("HTMLProjectItems", HTMLProjectItems);
    v.put("IAccessible", IAccessible);
    v.put("ICommandBarButtonEvents", ICommandBarButtonEvents);
    v.put("ICommandBarComboBoxEvents", ICommandBarComboBoxEvents);
    v.put("ICommandBarsEvents", ICommandBarsEvents);
    v.put("IFind", IFind);
    v.put("IFoundFiles", IFoundFiles);
    v.put("ILicAgent", ILicAgent);
    v.put("ILicValidator", ILicValidator);
    v.put("ILicWizExternal", ILicWizExternal);
    v.put("IMsoDiagram", IMsoDiagram);
    v.put("IMsoDispCagNotifySink", IMsoDispCagNotifySink);
    v.put("IMsoEServicesDialog", IMsoEServicesDialog);
    v.put("IMsoEnvelopeVB", IMsoEnvelopeVB);
    v.put("IMsoEnvelopeVBEvents", IMsoEnvelopeVBEvents);
    v.put("LanguageSettings", LanguageSettings);
    v.put("LineFormat", LineFormat);
    v.put("MsoDebugOptions", MsoDebugOptions);
    v.put("NewFile", NewFile);
    v.put("ODSOColumn", ODSOColumn);
    v.put("ODSOColumns", ODSOColumns);
    v.put("ODSOFilter", ODSOFilter);
    v.put("ODSOFilters", ODSOFilters);
    v.put("OfficeDataSourceObject", OfficeDataSourceObject);
    v.put("Permission", Permission);
    v.put("PictureFormat", PictureFormat);
    v.put("PropertyTest", PropertyTest);
    v.put("PropertyTests", PropertyTests);
    v.put("ScopeFolder", ScopeFolder);
    v.put("ScopeFolders", ScopeFolders);
    v.put("Script", Script);
    v.put("Scripts", Scripts);
    v.put("SearchFolders", SearchFolders);
    v.put("SearchScope", SearchScope);
    v.put("SearchScopes", SearchScopes);
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
    v.put("SignatureSet", SignatureSet);
    v.put("SmartDocument", SmartDocument);
    v.put("Sync", Sync);
    v.put("TextEffectFormat", TextEffectFormat);
    v.put("TextFrame", TextFrame);
    v.put("ThreeDFormat", ThreeDFormat);
    v.put("UserPermission", UserPermission);
    v.put("WebComponent", WebComponent);
    v.put("WebComponentFormat", WebComponentFormat);
    v.put("WebComponentProperties", WebComponentProperties);
    v.put("WebComponentWindowExternal", WebComponentWindowExternal);
    v.put("WebPageFont", WebPageFont);
    v.put("WebPageFonts", WebPageFonts);
    v.put("_CommandBarActiveX", _CommandBarActiveX);
    v.put("_CommandBarButton", _CommandBarButton);
    v.put("_CommandBarButtonEvents", _CommandBarButtonEvents);
    v.put("_CommandBarComboBox", _CommandBarComboBox);
    v.put("_CommandBarComboBoxEvents", _CommandBarComboBoxEvents);
    v.put("_CommandBars", _CommandBars);
    v.put("_CommandBarsEvents", _CommandBarsEvents);
    v.put("_IMsoDispObj", _IMsoDispObj);
    v.put("_IMsoOleAccDispObj", _IMsoOleAccDispObj);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
