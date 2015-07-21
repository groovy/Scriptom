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
package org.codehaus.groovy.scriptom.tlb.office2007.visio;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class Visio
{
  private Visio()
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
   *   <li><b>Application</b> = Visio.Application</li>
   *   <li><b>InvisibleApp</b> = Visio.InvisibleApp</li>
   * </ul>
   */
  public final static Map<String,String> progIds;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Application", "Visio.Application");
    v.put("InvisibleApp", "Visio.InvisibleApp");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

 /** GUID for this type library. */
  public static final String GUID = "{00021A98-0000-0000-C000-000000000046}";

  /**
   * CoClass: A map from a keystroke combination to an action such as invoking a Visio command.
   */
  public final static String AccelItem = "{000D0292-0000-0000-C000-000000000046}";

  /**
   * CoClass: The items of a Visio AccelTable. The first AccelItem in an AccelItems collection is item 0.
   */
  public final static String AccelItems = "{000D0295-0000-0000-C000-000000000046}";

  /**
   * CoClass: The AccelItems associated with an interactive state, such as drawing window active, etc.
   */
  public final static String AccelTable = "{000D02A2-0000-0000-C000-000000000046}";

  /**
   * CoClass: The accelerator tables associated with a Visio UIObject. The first AccelTable in an AccelTables collection is item 0.
   */
  public final static String AccelTables = "{000D02A5-0000-0000-C000-000000000046}";

  /**
   * CoClass: An operation implemented by an EXE or VSL that can be invoked from a Visio Application.
   */
  public final static String Addon = "{000D0718-0000-0000-C000-000000000046}";

  /**
   * CoClass: The add-ons available in a Visio Application. The first Addon in an Addons collection is item 1.
   */
  public final static String Addons = "{000D0719-0000-0000-C000-000000000046}";

  /**
   * CoClass: A running instance of Visio. ProgId: "Visio.Application"
   */
  public final static String Application = "{000D0700-0000-0000-C000-000000000046}";

  /**
   * CoClass: Setting Properties for the Application Object
   */
  public final static String ApplicationSettings = "{000D072D-0000-0000-C000-000000000046}";

  /**
   * CoClass: A formula that evaluates to a value. Represents a property of a Shape or Style.
   */
  public final static String Cell = "{000D0701-0000-0000-C000-000000000046}";

  /**
   * CoClass: Represents the text of a Shape in a Visio Document.
   */
  public final static String Characters = "{000D0702-0000-0000-C000-000000000046}";

  /**
   * CoClass: A color available for use by Shapes or Styles in a Visio Document.
   */
  public final static String Color = "{000D0716-0000-0000-C000-000000000046}";

  /**
   * CoClass: The colors in a Visio Document. The first Color in a Colors collection is item 0.
   */
  public final static String Colors = "{000D0717-0000-0000-C000-000000000046}";

  /**
   * CoClass: Represents a positional association from one Visio Shape to another.
   */
  public final static String Connect = "{000D0703-0000-0000-C000-000000000046}";

  /**
   * CoClass: The Connect objects associated with a Visio Shape, Page or Master. The first Connect in a Connects collection is item 1.
   */
  public final static String Connects = "{000D0704-0000-0000-C000-000000000046}";

  /**
   * CoClass: Geometric description of the stroke used to draw part of a Path of a Visio Shape.
   */
  public final static String Curve = "{000D0722-0000-0000-C000-000000000046}";

  /**
   * CoClass: Data Column of a Data Recordset
   */
  public final static String DataColumn = "{000D0732-0000-0000-C000-000000000046}";

  /**
   * CoClass: Data Columns collection in a Data Recordset
   */
  public final static String DataColumns = "{000D0731-0000-0000-C000-000000000046}";

  /**
   * CoClass: Data Connection oject
   */
  public final static String DataConnection = "{000D0730-0000-0000-C000-000000000046}";

  /**
   * CoClass: Data Recordset oject
   */
  public final static String DataRecordset = "{000D072F-0000-0000-C000-000000000046}";

  /**
   * CoClass: Data Recordset changed object
   */
  public final static String DataRecordsetChangedEvent = "{000D0733-0000-0000-C000-000000000046}";

  /**
   * CoClass: Data Recordsets collection in a Document
   */
  public final static String DataRecordsets = "{000D072E-0000-0000-C000-000000000046}";

  /**
   * CoClass: A document open in a Visio Application.
   */
  public final static String Document = "{000D0705-0000-0000-C000-000000000046}";

  /**
   * CoClass: The documents open in a Visio Application. The first Document in a Documents collection is item 1.
   */
  public final static String Documents = "{000D0706-0000-0000-C000-000000000046}";

  /**
   * CoClass: An item in a Visio object's EventList. An (Event,Action) pair indicating what causes it to fire and what it does when it does fire.
   */
  public final static String Event = "{000D071A-0000-0000-C000-000000000046}";

  /**
   * CoClass: The Event objects a Visio object is set up to fire as things happen to it. The first Event in an EventList is item 1.
   */
  public final static String EventList = "{000D071B-0000-0000-C000-000000000046}";

  /**
   * CoClass: Object that provides the extensions Visio gives to a control contained in a Visio Document.
   */
  public final static String Extender = "{000D0D0F-0000-0000-C000-000000000046}";

  /**
   * CoClass: Identifies a typeface available for use by Shapes or Styles in a Visio Document.
   */
  public final static String Font = "{000D0714-0000-0000-C000-000000000046}";

  /**
   * CoClass: The fonts in a Visio Document. The first Font in a Fonts collection is item 1.
   */
  public final static String Fonts = "{000D0715-0000-0000-C000-000000000046}";

  /**
   * CoClass: Properties provided by a Visio Application that are members of no class. Use these properties from code in a Visio Document's VBA project.
   */
  public final static String Global = "{000D071C-0000-0000-C000-000000000046}";

  /**
   * CoClass: Graphic Item object
   */
  public final static String GraphicItem = "{000D0735-0000-0000-C000-000000000046}";

  /**
   * CoClass: Grahic Items collection
   */
  public final static String GraphicItems = "{000D0734-0000-0000-C000-000000000046}";

  /**
   * CoClass: A navigable link from a Visio Shape to another Visio or non-Visio object.
   */
  public final static String Hyperlink = "{000D071D-0000-0000-C000-000000000046}";

  /**
   * CoClass: The hyperlinks of a Visio Shape. The first Hyperlink in a Hyperlinks collection is item 0.
   */
  public final static String Hyperlinks = "{000D0723-0000-0000-C000-000000000046}";

  /**
   * CoClass: The object to create to make an invisible Visio instance. ProgId: "Visio.InvisibleApp".
   */
  public final static String InvisibleApp = "{000D072C-0000-0000-C000-000000000046}";

  /**
   * CoClass: Object passed as subject of KeyDown, KeyPress and KeyUp events.
   */
  public final static String KeyboardEvent = "{000D072B-0000-0000-C000-000000000046}";

  /**
   * CoClass: A layer of a Visio Page or Master. Identifies a subset of the Page's or Master's shapes that are logically related.
   */
  public final static String Layer = "{000D0712-0000-0000-C000-000000000046}";

  /**
   * CoClass: The layers of a Visio Page or Master. The first Layer in a Layers collection is item 1.
   */
  public final static String Layers = "{000D0713-0000-0000-C000-000000000046}";

  /**
   * CoClass: Wraps the MSG structure used by Windows to pass messages to applications.
   */
  public final static String MSGWrap = "{000D0729-0000-0000-C000-000000000046}";

  /**
   * CoClass: A master in a Visio Document. A Master is a factory for Shape objects (its instances).
   */
  public final static String Master = "{000D0707-0000-0000-C000-000000000046}";

  /**
   * CoClass: A reference to a Visio Master that behaves like the master when operated on.
   */
  public final static String MasterShortcut = "{000D0727-0000-0000-C000-000000000046}";

  /**
   * CoClass: The master shortcuts in a Visio Document. The first MasterShortcut in a MasterShortcuts collection is item 1.
   */
  public final static String MasterShortcuts = "{000D0726-0000-0000-C000-000000000046}";

  /**
   * CoClass: The masters in a Visio Document. The first Master in a Masters collection is item 1.
   */
  public final static String Masters = "{000D0708-0000-0000-C000-000000000046}";

  /**
   * CoClass: The MenuItems constituting a menu.
   */
  public final static String Menu = "{000D0222-0000-0000-C000-000000000046}";

  /**
   * CoClass: An item in a Visio Menu.
   */
  public final static String MenuItem = "{000D0212-0000-0000-C000-000000000046}";

  /**
   * CoClass: The items of a Visio Menu or subitems of a MenuItem. The first MenuItem in a MenuItems collection is item 0.
   */
  public final static String MenuItems = "{000D0216-0000-0000-C000-000000000046}";

  /**
   * CoClass: A set of Menus associated with an interactive state, such as drawing window active, etc.
   */
  public final static String MenuSet = "{000D0232-0000-0000-C000-000000000046}";

  /**
   * CoClass: The menu sets associated with a Visio UIObject. The first MenuSet in a MenuSets collection is item 0.
   */
  public final static String MenuSets = "{000D0236-0000-0000-C000-000000000046}";

  /**
   * CoClass: The menus of a Visio MenuSet. The first Menu in a Menus collection is item 0.
   */
  public final static String Menus = "{000D0225-0000-0000-C000-000000000046}";

  /**
   * CoClass: Object passed as subject of MouseDown, MouseMove and MouseUp events.
   */
  public final static String MouseEvent = "{000D072A-0000-0000-C000-000000000046}";

  /**
   * CoClass: A control, object link or embedded object in a Visio Document.
   */
  public final static String OLEObject = "{000D071F-0000-0000-C000-000000000046}";

  /**
   * CoClass: The COM objects contained in or linked to a Visio Document, Page or Master. The first OLEObject in an OLEObjects collection is item 1.
   */
  public final static String OLEObjects = "{000D071E-0000-0000-C000-000000000046}";

  /**
   * CoClass: A page in a Visio Document. A page is a collection of Shape objects drawn and printed as a unit.
   */
  public final static String Page = "{000D0709-0000-0000-C000-000000000046}";

  /**
   * CoClass: The pages in a Visio Document. The first Page in a Pages collection is item 1.
   */
  public final static String Pages = "{000D070A-0000-0000-C000-000000000046}";

  /**
   * CoClass: A contiguous sequence of curves describing one path of a Shape's geometry. The first Curve in a Path is item 1.
   */
  public final static String Path = "{000D0721-0000-0000-C000-000000000046}";

  /**
   * CoClass: The paths described by a Visio Shape's geometry. The first Path in a Paths collection is item 1.
   */
  public final static String Paths = "{000D0720-0000-0000-C000-000000000046}";

  /**
   * CoClass: A group of related Cells in a Section that describe some of a Shape's attributes.
   */
  public final static String Row = "{000D0725-0000-0000-C000-000000000046}";

  /**
   * CoClass: A subset of a Visio Shape's Cells that are logically related.
   */
  public final static String Section = "{000D0724-0000-0000-C000-000000000046}";

  /**
   * CoClass: References to a subset of the shapes of a Page or Master. The first Shape in a Selection is item 1.
   */
  public final static String Selection = "{000D070B-0000-0000-C000-000000000046}";

  /**
   * CoClass: An object of a Visio Page or Master, a sub-shape of another Shape, the PageSheet of a Page or Master, or the DocumentSheet of a Document.
   */
  public final static String Shape = "{000D070C-0000-0000-C000-000000000046}";

  /**
   * CoClass: The shapes of a Visio Page or Master, or the sub-shapes of a Shape. The first Shape in a Shapes collection is item 1.
   */
  public final static String Shapes = "{000D070D-0000-0000-C000-000000000046}";

  /**
   * CoClass: StatusBar is obsolete as of Visio 2002.
   */
  public final static String StatusBar = "{000D0282-0000-0000-C000-000000000046}";

  /**
   * CoClass: StatusBarItem is obsolete as of Visio 2002.
   */
  public final static String StatusBarItem = "{000D0272-0000-0000-C000-000000000046}";

  /**
   * CoClass: StatusBarItems is obsolete as of Visio 2002. The first StatusBarItem in a StatusBarItems collection is item 0.
   */
  public final static String StatusBarItems = "{000D0275-0000-0000-C000-000000000046}";

  /**
   * CoClass: StatusBars is obsolete as of Visio 2002. The first StatusBar in a StatusBars collection is item 0.
   */
  public final static String StatusBars = "{000D0285-0000-0000-C000-000000000046}";

  /**
   * CoClass: A style in a Visio Document. A Style is a bundle of attributes that can be applied to Shape objects.
   */
  public final static String Style = "{000D070E-0000-0000-C000-000000000046}";

  /**
   * CoClass: The styles in a Visio Document. The first Style in a Styles collection is item 1.
   */
  public final static String Styles = "{000D070F-0000-0000-C000-000000000046}";

  /**
   * CoClass: The ToolbarItems constituting a toolbar.
   */
  public final static String Toolbar = "{000D0252-0000-0000-C000-000000000046}";

  /**
   * CoClass: An item such as a button in a Visio Toolbar.
   */
  public final static String ToolbarItem = "{000D0242-0000-0000-C000-000000000046}";

  /**
   * CoClass: The items of a Visio Toolbar or subitems of a ToolbarItem. The first ToolbarItem in a ToolbarItems collection is item 0.
   */
  public final static String ToolbarItems = "{000D0245-0000-0000-C000-000000000046}";

  /**
   * CoClass: A set of Toolbars associated with an interactive state, such as drawing window active, etc.
   */
  public final static String ToolbarSet = "{000D0262-0000-0000-C000-000000000046}";

  /**
   * CoClass: The toolbar sets associated with a Visio UIObject. The first ToolbarSet in a ToolbarSets collection is item 0.
   */
  public final static String ToolbarSets = "{000D0266-0000-0000-C000-000000000046}";

  /**
   * CoClass: The toolbars of a Visio ToolbarSet. The first Toolbar in a Toolbars collection is item 0.
   */
  public final static String Toolbars = "{000D0255-0000-0000-C000-000000000046}";

  /**
   * CoClass: The menus, toolbars and accelerators associated with a Visio Application or Document.
   */
  public final static String UIObject = "{000D0202-0000-0000-C000-000000000046}";

  /**
   * CoClass: A window open in a Visio Application.
   */
  public final static String Window = "{000D0710-0000-0000-C000-000000000046}";

  /**
   * CoClass: The windows open in a Visio Application or Window. The first Window in a Windows collection is item 1.
   */
  public final static String Windows = "{000D0711-0000-0000-C000-000000000046}";

  /**
   * A {@code Map} of CoClass names to default interface GUIDs for this type library.
   */
  public final static Map<String,String> coClasses;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("AccelItem", AccelItem);
    v.put("AccelItems", AccelItems);
    v.put("AccelTable", AccelTable);
    v.put("AccelTables", AccelTables);
    v.put("Addon", Addon);
    v.put("Addons", Addons);
    v.put("Application", Application);
    v.put("ApplicationSettings", ApplicationSettings);
    v.put("Cell", Cell);
    v.put("Characters", Characters);
    v.put("Color", Color);
    v.put("Colors", Colors);
    v.put("Connect", Connect);
    v.put("Connects", Connects);
    v.put("Curve", Curve);
    v.put("DataColumn", DataColumn);
    v.put("DataColumns", DataColumns);
    v.put("DataConnection", DataConnection);
    v.put("DataRecordset", DataRecordset);
    v.put("DataRecordsetChangedEvent", DataRecordsetChangedEvent);
    v.put("DataRecordsets", DataRecordsets);
    v.put("Document", Document);
    v.put("Documents", Documents);
    v.put("Event", Event);
    v.put("EventList", EventList);
    v.put("Extender", Extender);
    v.put("Font", Font);
    v.put("Fonts", Fonts);
    v.put("Global", Global);
    v.put("GraphicItem", GraphicItem);
    v.put("GraphicItems", GraphicItems);
    v.put("Hyperlink", Hyperlink);
    v.put("Hyperlinks", Hyperlinks);
    v.put("InvisibleApp", InvisibleApp);
    v.put("KeyboardEvent", KeyboardEvent);
    v.put("Layer", Layer);
    v.put("Layers", Layers);
    v.put("MSGWrap", MSGWrap);
    v.put("Master", Master);
    v.put("MasterShortcut", MasterShortcut);
    v.put("MasterShortcuts", MasterShortcuts);
    v.put("Masters", Masters);
    v.put("Menu", Menu);
    v.put("MenuItem", MenuItem);
    v.put("MenuItems", MenuItems);
    v.put("MenuSet", MenuSet);
    v.put("MenuSets", MenuSets);
    v.put("Menus", Menus);
    v.put("MouseEvent", MouseEvent);
    v.put("OLEObject", OLEObject);
    v.put("OLEObjects", OLEObjects);
    v.put("Page", Page);
    v.put("Pages", Pages);
    v.put("Path", Path);
    v.put("Paths", Paths);
    v.put("Row", Row);
    v.put("Section", Section);
    v.put("Selection", Selection);
    v.put("Shape", Shape);
    v.put("Shapes", Shapes);
    v.put("StatusBar", StatusBar);
    v.put("StatusBarItem", StatusBarItem);
    v.put("StatusBarItems", StatusBarItems);
    v.put("StatusBars", StatusBars);
    v.put("Style", Style);
    v.put("Styles", Styles);
    v.put("Toolbar", Toolbar);
    v.put("ToolbarItem", ToolbarItem);
    v.put("ToolbarItems", ToolbarItems);
    v.put("ToolbarSet", ToolbarSet);
    v.put("ToolbarSets", ToolbarSets);
    v.put("Toolbars", Toolbars);
    v.put("UIObject", UIObject);
    v.put("Window", Window);
    v.put("Windows", Windows);
    coClasses = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: Visio Application Event Interface
   */
  public final static String EApplication = "{000D0B00-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Cell Event Interface
   */
  public final static String ECell = "{000D0B0D-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Characters Event Interface
   */
  public final static String ECharacters = "{000D0B0C-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio DataRecordset Event Interface
   */
  public final static String EDataRecordset = "{000D0B11-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio DataRecordsets Event Interface
   */
  public final static String EDataRecordsets = "{000D0B10-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Document Event Interface
   */
  public final static String EDocument = "{000D0750-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Documents Event Interface
   */
  public final static String EDocuments = "{000D0B03-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Master Event Interface
   */
  public final static String EMaster = "{000D0B08-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Masters Event Interface
   */
  public final static String EMasters = "{000D0B07-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Page Event Interface
   */
  public final static String EPage = "{000D0B0A-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Pages Event Interface
   */
  public final static String EPages = "{000D0B09-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Row Event Interface
   */
  public final static String ERow = "{000D0B0F-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Section Event Interface
   */
  public final static String ESection = "{000D0B0E-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Shape Event Interface
   */
  public final static String EShape = "{000D0B0B-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Style Event Interface
   */
  public final static String EStyle = "{000D0B06-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Styles Event Interface
   */
  public final static String EStyles = "{000D0B05-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Window Event Interface
   */
  public final static String EWindow = "{000D0B02-0000-0000-C000-000000000046}";

  /**
   * Interface: Visio Windows Event Interface
   */
  public final static String EWindows = "{000D0B01-0000-0000-C000-000000000046}";

  /**
   * Interface: IEnumVAccelItem
   */
  public final static String IEnumVAccelItem = "{000D0293-0000-0000-C000-000000000046}";

  /**
   * Interface: IEnumVAccelTable
   */
  public final static String IEnumVAccelTable = "{000D02A3-0000-0000-C000-000000000046}";

  /**
   * Interface: IEnumVMenu
   */
  public final static String IEnumVMenu = "{000D0223-0000-0000-C000-000000000046}";

  /**
   * Interface: IEnumVMenuItem
   */
  public final static String IEnumVMenuItem = "{000D0213-0000-0000-C000-000000000046}";

  /**
   * Interface: IEnumVMenuSet
   */
  public final static String IEnumVMenuSet = "{000D0233-0000-0000-C000-000000000046}";

  /**
   * Interface: IEnumVStatusBar
   */
  public final static String IEnumVStatusBar = "{000D0283-0000-0000-C000-000000000046}";

  /**
   * Interface: IEnumVStatusBarItem
   */
  public final static String IEnumVStatusBarItem = "{000D0273-0000-0000-C000-000000000046}";

  /**
   * Interface: IEnumVToolbar
   */
  public final static String IEnumVToolbar = "{000D0253-0000-0000-C000-000000000046}";

  /**
   * Interface: IEnumVToolbarItem
   */
  public final static String IEnumVToolbarItem = "{000D0243-0000-0000-C000-000000000046}";

  /**
   * Interface: IEnumVToolbarSet
   */
  public final static String IEnumVToolbarSet = "{000D0263-0000-0000-C000-000000000046}";

  /**
   * Interface: IVAccelItem
   */
  public final static String IVAccelItem = "{000D0292-0000-0000-C000-000000000046}";

  /**
   * Interface: IVAccelItems
   */
  public final static String IVAccelItems = "{000D0295-0000-0000-C000-000000000046}";

  /**
   * Interface: IVAccelTable
   */
  public final static String IVAccelTable = "{000D02A2-0000-0000-C000-000000000046}";

  /**
   * Interface: IVAccelTables
   */
  public final static String IVAccelTables = "{000D02A5-0000-0000-C000-000000000046}";

  /**
   * Interface: IVAddon
   */
  public final static String IVAddon = "{000D0718-0000-0000-C000-000000000046}";

  /**
   * Interface: IVAddons
   */
  public final static String IVAddons = "{000D0719-0000-0000-C000-000000000046}";

  /**
   * Interface: Ambient properties a Visio control site provides to a control contained in a Visio Document.
   */
  public final static String IVAmbients = "{000D0D10-0000-0000-C000-000000000046}";

  /**
   * Interface: IVApplication
   */
  public final static String IVApplication = "{000D0700-0000-0000-C000-000000000046}";

  /**
   * Interface: Interface provides access  Global application settings
   */
  public final static String IVApplicationSettings = "{000D072D-0000-0000-C000-000000000046}";

  /**
   * Interface: VB Undo Manager - VB classes that implement IVBUndoUnit require this for their Do method.
   */
  public final static String IVBUndoManager = "{000D1306-0000-0000-C000-000000000046}";

  /**
   * Interface: VB-Implements-Capable undo unit interface definition. Use an object that implements this interface in AddUndoUnit calls.
   */
  public final static String IVBUndoUnit = "{000D1305-0000-0000-C000-000000000046}";

  /**
   * Interface: IVCell
   */
  public final static String IVCell = "{000D0701-0000-0000-C000-000000000046}";

  /**
   * Interface: IVCharacters
   */
  public final static String IVCharacters = "{000D0702-0000-0000-C000-000000000046}";

  /**
   * Interface: Interface provided to OLE embedded objects through the Visio IOleClientSite object.
   */
  public final static String IVClientSite = "{000D0D11-0000-0000-C000-000000000046}";

  /**
   * Interface: IVColor
   */
  public final static String IVColor = "{000D0716-0000-0000-C000-000000000046}";

  /**
   * Interface: IVColors
   */
  public final static String IVColors = "{000D0717-0000-0000-C000-000000000046}";

  /**
   * Interface: IVConnect
   */
  public final static String IVConnect = "{000D0703-0000-0000-C000-000000000046}";

  /**
   * Interface: IVConnects
   */
  public final static String IVConnects = "{000D0704-0000-0000-C000-000000000046}";

  /**
   * Interface: IVCurve
   */
  public final static String IVCurve = "{000D0722-0000-0000-C000-000000000046}";

  /**
   * Interface: IVDataColumn
   */
  public final static String IVDataColumn = "{000D0732-0000-0000-C000-000000000046}";

  /**
   * Interface: IVDataColumns
   */
  public final static String IVDataColumns = "{000D0731-0000-0000-C000-000000000046}";

  /**
   * Interface: IVDataConnection
   */
  public final static String IVDataConnection = "{000D0730-0000-0000-C000-000000000046}";

  /**
   * Interface: IVDataRecordset
   */
  public final static String IVDataRecordset = "{000D072F-0000-0000-C000-000000000046}";

  /**
   * Interface: IVDataRecordsetChangedEvent
   */
  public final static String IVDataRecordsetChangedEvent = "{000D0733-0000-0000-C000-000000000046}";

  /**
   * Interface: IVDataRecordsets
   */
  public final static String IVDataRecordsets = "{000D072E-0000-0000-C000-000000000046}";

  /**
   * Interface: Dispatch interface of extensions Visio gives to a control contained in a Visio Document.
   */
  public final static String IVDispExtender = "{000D0D0F-0000-0000-C000-000000000046}";

  /**
   * Interface: IVDocument
   */
  public final static String IVDocument = "{000D0705-0000-0000-C000-000000000046}";

  /**
   * Interface: IVDocuments
   */
  public final static String IVDocuments = "{000D0706-0000-0000-C000-000000000046}";

  /**
   * Interface: IVEvent
   */
  public final static String IVEvent = "{000D071A-0000-0000-C000-000000000046}";

  /**
   * Interface: IVEventList
   */
  public final static String IVEventList = "{000D071B-0000-0000-C000-000000000046}";

  /**
   * Interface: Dual interface of extensions Visio gives to a control contained in a Visio Document.
   */
  public final static String IVExtender = "{000D0D0E-0000-0000-C000-000000000046}";

  /**
   * Interface: IVFont
   */
  public final static String IVFont = "{000D0714-0000-0000-C000-000000000046}";

  /**
   * Interface: IVFonts
   */
  public final static String IVFonts = "{000D0715-0000-0000-C000-000000000046}";

  /**
   * Interface: IVGlobal
   */
  public final static String IVGlobal = "{000D071C-0000-0000-C000-000000000046}";

  /**
   * Interface: IVGraphicItem
   */
  public final static String IVGraphicItem = "{000D0735-0000-0000-C000-000000000046}";

  /**
   * Interface: IVGraphicItems
   */
  public final static String IVGraphicItems = "{000D0734-0000-0000-C000-000000000046}";

  /**
   * Interface: IVHyperlink
   */
  public final static String IVHyperlink = "{000D071D-0000-0000-C000-000000000046}";

  /**
   * Interface: IVHyperlinks
   */
  public final static String IVHyperlinks = "{000D0723-0000-0000-C000-000000000046}";

  /**
   * Interface: IVInvisibleApp
   */
  public final static String IVInvisibleApp = "{000D072C-0000-0000-C000-000000000046}";

  /**
   * Interface: Interface to enable passing relevant info about keyboard messages through Visio automation events.
   */
  public final static String IVKeyboardEvent = "{000D072B-0000-0000-C000-000000000046}";

  /**
   * Interface: IVLayer
   */
  public final static String IVLayer = "{000D0712-0000-0000-C000-000000000046}";

  /**
   * Interface: IVLayers
   */
  public final static String IVLayers = "{000D0713-0000-0000-C000-000000000046}";

  /**
   * Interface: IVMSGWrap
   */
  public final static String IVMSGWrap = "{000D0729-0000-0000-C000-000000000046}";

  /**
   * Interface: IVMaster
   */
  public final static String IVMaster = "{000D0707-0000-0000-C000-000000000046}";

  /**
   * Interface: IVMasterShortcut
   */
  public final static String IVMasterShortcut = "{000D0727-0000-0000-C000-000000000046}";

  /**
   * Interface: IVMasterShortcuts
   */
  public final static String IVMasterShortcuts = "{000D0726-0000-0000-C000-000000000046}";

  /**
   * Interface: IVMasters
   */
  public final static String IVMasters = "{000D0708-0000-0000-C000-000000000046}";

  /**
   * Interface: IVMenu
   */
  public final static String IVMenu = "{000D0222-0000-0000-C000-000000000046}";

  /**
   * Interface: IVMenuItem
   */
  public final static String IVMenuItem = "{000D0212-0000-0000-C000-000000000046}";

  /**
   * Interface: IVMenuItems
   */
  public final static String IVMenuItems = "{000D0216-0000-0000-C000-000000000046}";

  /**
   * Interface: IVMenuSet
   */
  public final static String IVMenuSet = "{000D0232-0000-0000-C000-000000000046}";

  /**
   * Interface: IVMenuSets
   */
  public final static String IVMenuSets = "{000D0236-0000-0000-C000-000000000046}";

  /**
   * Interface: IVMenus
   */
  public final static String IVMenus = "{000D0225-0000-0000-C000-000000000046}";

  /**
   * Interface: Interface to enable passing relevant info about mouse messages through Visio automation events.
   */
  public final static String IVMouseEvent = "{000D072A-0000-0000-C000-000000000046}";

  /**
   * Interface: IVOLEObject
   */
  public final static String IVOLEObject = "{000D071F-0000-0000-C000-000000000046}";

  /**
   * Interface: IVOLEObjects
   */
  public final static String IVOLEObjects = "{000D071E-0000-0000-C000-000000000046}";

  /**
   * Interface: IVPage
   */
  public final static String IVPage = "{000D0709-0000-0000-C000-000000000046}";

  /**
   * Interface: IVPages
   */
  public final static String IVPages = "{000D070A-0000-0000-C000-000000000046}";

  /**
   * Interface: IVPath
   */
  public final static String IVPath = "{000D0721-0000-0000-C000-000000000046}";

  /**
   * Interface: IVPaths
   */
  public final static String IVPaths = "{000D0720-0000-0000-C000-000000000046}";

  /**
   * Interface: IVRow
   */
  public final static String IVRow = "{000D0725-0000-0000-C000-000000000046}";

  /**
   * Interface: IVSection
   */
  public final static String IVSection = "{000D0724-0000-0000-C000-000000000046}";

  /**
   * Interface: IVSelection
   */
  public final static String IVSelection = "{000D070B-0000-0000-C000-000000000046}";

  /**
   * Interface: IVShape
   */
  public final static String IVShape = "{000D070C-0000-0000-C000-000000000046}";

  /**
   * Interface: IVShapes
   */
  public final static String IVShapes = "{000D070D-0000-0000-C000-000000000046}";

  /**
   * Interface: IVStatusBar
   */
  public final static String IVStatusBar = "{000D0282-0000-0000-C000-000000000046}";

  /**
   * Interface: IVStatusBarItem
   */
  public final static String IVStatusBarItem = "{000D0272-0000-0000-C000-000000000046}";

  /**
   * Interface: IVStatusBarItems
   */
  public final static String IVStatusBarItems = "{000D0275-0000-0000-C000-000000000046}";

  /**
   * Interface: IVStatusBars
   */
  public final static String IVStatusBars = "{000D0285-0000-0000-C000-000000000046}";

  /**
   * Interface: IVStyle
   */
  public final static String IVStyle = "{000D070E-0000-0000-C000-000000000046}";

  /**
   * Interface: IVStyles
   */
  public final static String IVStyles = "{000D070F-0000-0000-C000-000000000046}";

  /**
   * Interface: IVToolbar
   */
  public final static String IVToolbar = "{000D0252-0000-0000-C000-000000000046}";

  /**
   * Interface: IVToolbarItem
   */
  public final static String IVToolbarItem = "{000D0242-0000-0000-C000-000000000046}";

  /**
   * Interface: IVToolbarItems
   */
  public final static String IVToolbarItems = "{000D0245-0000-0000-C000-000000000046}";

  /**
   * Interface: IVToolbarSet
   */
  public final static String IVToolbarSet = "{000D0262-0000-0000-C000-000000000046}";

  /**
   * Interface: IVToolbarSets
   */
  public final static String IVToolbarSets = "{000D0266-0000-0000-C000-000000000046}";

  /**
   * Interface: IVToolbars
   */
  public final static String IVToolbars = "{000D0255-0000-0000-C000-000000000046}";

  /**
   * Interface: IVUIObject
   */
  public final static String IVUIObject = "{000D0202-0000-0000-C000-000000000046}";

  /**
   * Interface: IVWindow
   */
  public final static String IVWindow = "{000D0710-0000-0000-C000-000000000046}";

  /**
   * Interface: IVWindows
   */
  public final static String IVWindows = "{000D0711-0000-0000-C000-000000000046}";

  /**
   * Interface: VB-Implements-Capable Visio event sink interface definition. Use an object that implements this interface as the sink argument in AddAdvise calls.
   */
  public final static String IVisEventProc = "{000D0728-0000-0000-C000-000000000046}";

  /**
   * Interface: Interface to enable VisOcx.DrawingControl interactions with VisLib.
   */
  public final static String IVisLibOcxSupport = "{000D0D21-0000-0000-C000-000000000046}";

  /**
   * Interface: LPVISIOACCELITEM
   */
  public final static String LPVISIOACCELITEM = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOACCELITEMS
   */
  public final static String LPVISIOACCELITEMS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOACCELTABLE
   */
  public final static String LPVISIOACCELTABLE = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOACCELTABLES
   */
  public final static String LPVISIOACCELTABLES = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOADDON
   */
  public final static String LPVISIOADDON = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOADDONS
   */
  public final static String LPVISIOADDONS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOAPPLICATION
   */
  public final static String LPVISIOAPPLICATION = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOAPPSETTINGS
   */
  public final static String LPVISIOAPPSETTINGS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOCELL
   */
  public final static String LPVISIOCELL = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOCHARS
   */
  public final static String LPVISIOCHARS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOCOLOR
   */
  public final static String LPVISIOCOLOR = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOCOLORS
   */
  public final static String LPVISIOCOLORS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOCONNECT
   */
  public final static String LPVISIOCONNECT = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOCONNECTS
   */
  public final static String LPVISIOCONNECTS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOCURVE
   */
  public final static String LPVISIOCURVE = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIODATACOLUMN
   */
  public final static String LPVISIODATACOLUMN = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIODATACOLUMNS
   */
  public final static String LPVISIODATACOLUMNS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIODATACONNECTION
   */
  public final static String LPVISIODATACONNECTION = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIODATARECORDSET
   */
  public final static String LPVISIODATARECORDSET = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIODATARECORDSETCHANGEDEVENT
   */
  public final static String LPVISIODATARECORDSETCHANGEDEVENT = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIODATARECORDSETS
   */
  public final static String LPVISIODATARECORDSETS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIODOCUMENT
   */
  public final static String LPVISIODOCUMENT = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIODOCUMENTS
   */
  public final static String LPVISIODOCUMENTS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOENUMVACCELITEM
   */
  public final static String LPVISIOENUMVACCELITEM = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOENUMVACCELTABLE
   */
  public final static String LPVISIOENUMVACCELTABLE = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOENUMVMENU
   */
  public final static String LPVISIOENUMVMENU = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOENUMVMENUITEM
   */
  public final static String LPVISIOENUMVMENUITEM = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOENUMVMENUSET
   */
  public final static String LPVISIOENUMVMENUSET = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOENUMVSTATUSBAR
   */
  public final static String LPVISIOENUMVSTATUSBAR = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOENUMVSTATUSBARITEM
   */
  public final static String LPVISIOENUMVSTATUSBARITEM = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOENUMVTOOLBAR
   */
  public final static String LPVISIOENUMVTOOLBAR = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOENUMVTOOLBARITEM
   */
  public final static String LPVISIOENUMVTOOLBARITEM = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOENUMVTOOLBARSET
   */
  public final static String LPVISIOENUMVTOOLBARSET = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOEVENT
   */
  public final static String LPVISIOEVENT = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOEVENTS
   */
  public final static String LPVISIOEVENTS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOFONT
   */
  public final static String LPVISIOFONT = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOFONTS
   */
  public final static String LPVISIOFONTS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOGRAPHICITEM
   */
  public final static String LPVISIOGRAPHICITEM = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOGRAPHICITEMS
   */
  public final static String LPVISIOGRAPHICITEMS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOHYPERLINK
   */
  public final static String LPVISIOHYPERLINK = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOHYPERLINKS
   */
  public final static String LPVISIOHYPERLINKS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOLAYER
   */
  public final static String LPVISIOLAYER = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOLAYERS
   */
  public final static String LPVISIOLAYERS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOMASTER
   */
  public final static String LPVISIOMASTER = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOMASTERS
   */
  public final static String LPVISIOMASTERS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOMASTERSHORTCUT
   */
  public final static String LPVISIOMASTERSHORTCUT = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOMASTERSHORTCUTS
   */
  public final static String LPVISIOMASTERSHORTCUTS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOMENU
   */
  public final static String LPVISIOMENU = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOMENUITEM
   */
  public final static String LPVISIOMENUITEM = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOMENUITEMS
   */
  public final static String LPVISIOMENUITEMS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOMENUS
   */
  public final static String LPVISIOMENUS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOMENUSET
   */
  public final static String LPVISIOMENUSET = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOMENUSETS
   */
  public final static String LPVISIOMENUSETS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOMSGWRAP
   */
  public final static String LPVISIOMSGWRAP = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOOBJECT
   */
  public final static String LPVISIOOBJECT = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOOBJECTS
   */
  public final static String LPVISIOOBJECTS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOPAGE
   */
  public final static String LPVISIOPAGE = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOPAGES
   */
  public final static String LPVISIOPAGES = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOPATH
   */
  public final static String LPVISIOPATH = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOPATHS
   */
  public final static String LPVISIOPATHS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOROW
   */
  public final static String LPVISIOROW = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOSECTION
   */
  public final static String LPVISIOSECTION = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOSELECTION
   */
  public final static String LPVISIOSELECTION = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOSHAPE
   */
  public final static String LPVISIOSHAPE = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOSHAPES
   */
  public final static String LPVISIOSHAPES = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOSTATUSBAR
   */
  public final static String LPVISIOSTATUSBAR = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOSTATUSBARITEM
   */
  public final static String LPVISIOSTATUSBARITEM = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOSTATUSBARITEMS
   */
  public final static String LPVISIOSTATUSBARITEMS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOSTATUSBARS
   */
  public final static String LPVISIOSTATUSBARS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOSTYLE
   */
  public final static String LPVISIOSTYLE = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOSTYLES
   */
  public final static String LPVISIOSTYLES = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOTOOLBAR
   */
  public final static String LPVISIOTOOLBAR = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOTOOLBARITEM
   */
  public final static String LPVISIOTOOLBARITEM = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOTOOLBARITEMS
   */
  public final static String LPVISIOTOOLBARITEMS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOTOOLBARS
   */
  public final static String LPVISIOTOOLBARS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOTOOLBARSET
   */
  public final static String LPVISIOTOOLBARSET = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOTOOLBARSETS
   */
  public final static String LPVISIOTOOLBARSETS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOUIOBJECT
   */
  public final static String LPVISIOUIOBJECT = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOWINDOW
   */
  public final static String LPVISIOWINDOW = "{00000000-0000-0000-0000-000000000000}";

  /**
   * Interface: LPVISIOWINDOWS
   */
  public final static String LPVISIOWINDOWS = "{00000000-0000-0000-0000-000000000000}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map<String,String> interfaces;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("EApplication", EApplication);
    v.put("ECell", ECell);
    v.put("ECharacters", ECharacters);
    v.put("EDataRecordset", EDataRecordset);
    v.put("EDataRecordsets", EDataRecordsets);
    v.put("EDocument", EDocument);
    v.put("EDocuments", EDocuments);
    v.put("EMaster", EMaster);
    v.put("EMasters", EMasters);
    v.put("EPage", EPage);
    v.put("EPages", EPages);
    v.put("ERow", ERow);
    v.put("ESection", ESection);
    v.put("EShape", EShape);
    v.put("EStyle", EStyle);
    v.put("EStyles", EStyles);
    v.put("EWindow", EWindow);
    v.put("EWindows", EWindows);
    v.put("IEnumVAccelItem", IEnumVAccelItem);
    v.put("IEnumVAccelTable", IEnumVAccelTable);
    v.put("IEnumVMenu", IEnumVMenu);
    v.put("IEnumVMenuItem", IEnumVMenuItem);
    v.put("IEnumVMenuSet", IEnumVMenuSet);
    v.put("IEnumVStatusBar", IEnumVStatusBar);
    v.put("IEnumVStatusBarItem", IEnumVStatusBarItem);
    v.put("IEnumVToolbar", IEnumVToolbar);
    v.put("IEnumVToolbarItem", IEnumVToolbarItem);
    v.put("IEnumVToolbarSet", IEnumVToolbarSet);
    v.put("IVAccelItem", IVAccelItem);
    v.put("IVAccelItems", IVAccelItems);
    v.put("IVAccelTable", IVAccelTable);
    v.put("IVAccelTables", IVAccelTables);
    v.put("IVAddon", IVAddon);
    v.put("IVAddons", IVAddons);
    v.put("IVAmbients", IVAmbients);
    v.put("IVApplication", IVApplication);
    v.put("IVApplicationSettings", IVApplicationSettings);
    v.put("IVBUndoManager", IVBUndoManager);
    v.put("IVBUndoUnit", IVBUndoUnit);
    v.put("IVCell", IVCell);
    v.put("IVCharacters", IVCharacters);
    v.put("IVClientSite", IVClientSite);
    v.put("IVColor", IVColor);
    v.put("IVColors", IVColors);
    v.put("IVConnect", IVConnect);
    v.put("IVConnects", IVConnects);
    v.put("IVCurve", IVCurve);
    v.put("IVDataColumn", IVDataColumn);
    v.put("IVDataColumns", IVDataColumns);
    v.put("IVDataConnection", IVDataConnection);
    v.put("IVDataRecordset", IVDataRecordset);
    v.put("IVDataRecordsetChangedEvent", IVDataRecordsetChangedEvent);
    v.put("IVDataRecordsets", IVDataRecordsets);
    v.put("IVDispExtender", IVDispExtender);
    v.put("IVDocument", IVDocument);
    v.put("IVDocuments", IVDocuments);
    v.put("IVEvent", IVEvent);
    v.put("IVEventList", IVEventList);
    v.put("IVExtender", IVExtender);
    v.put("IVFont", IVFont);
    v.put("IVFonts", IVFonts);
    v.put("IVGlobal", IVGlobal);
    v.put("IVGraphicItem", IVGraphicItem);
    v.put("IVGraphicItems", IVGraphicItems);
    v.put("IVHyperlink", IVHyperlink);
    v.put("IVHyperlinks", IVHyperlinks);
    v.put("IVInvisibleApp", IVInvisibleApp);
    v.put("IVKeyboardEvent", IVKeyboardEvent);
    v.put("IVLayer", IVLayer);
    v.put("IVLayers", IVLayers);
    v.put("IVMSGWrap", IVMSGWrap);
    v.put("IVMaster", IVMaster);
    v.put("IVMasterShortcut", IVMasterShortcut);
    v.put("IVMasterShortcuts", IVMasterShortcuts);
    v.put("IVMasters", IVMasters);
    v.put("IVMenu", IVMenu);
    v.put("IVMenuItem", IVMenuItem);
    v.put("IVMenuItems", IVMenuItems);
    v.put("IVMenuSet", IVMenuSet);
    v.put("IVMenuSets", IVMenuSets);
    v.put("IVMenus", IVMenus);
    v.put("IVMouseEvent", IVMouseEvent);
    v.put("IVOLEObject", IVOLEObject);
    v.put("IVOLEObjects", IVOLEObjects);
    v.put("IVPage", IVPage);
    v.put("IVPages", IVPages);
    v.put("IVPath", IVPath);
    v.put("IVPaths", IVPaths);
    v.put("IVRow", IVRow);
    v.put("IVSection", IVSection);
    v.put("IVSelection", IVSelection);
    v.put("IVShape", IVShape);
    v.put("IVShapes", IVShapes);
    v.put("IVStatusBar", IVStatusBar);
    v.put("IVStatusBarItem", IVStatusBarItem);
    v.put("IVStatusBarItems", IVStatusBarItems);
    v.put("IVStatusBars", IVStatusBars);
    v.put("IVStyle", IVStyle);
    v.put("IVStyles", IVStyles);
    v.put("IVToolbar", IVToolbar);
    v.put("IVToolbarItem", IVToolbarItem);
    v.put("IVToolbarItems", IVToolbarItems);
    v.put("IVToolbarSet", IVToolbarSet);
    v.put("IVToolbarSets", IVToolbarSets);
    v.put("IVToolbars", IVToolbars);
    v.put("IVUIObject", IVUIObject);
    v.put("IVWindow", IVWindow);
    v.put("IVWindows", IVWindows);
    v.put("IVisEventProc", IVisEventProc);
    v.put("IVisLibOcxSupport", IVisLibOcxSupport);
    v.put("LPVISIOACCELITEM", LPVISIOACCELITEM);
    v.put("LPVISIOACCELITEMS", LPVISIOACCELITEMS);
    v.put("LPVISIOACCELTABLE", LPVISIOACCELTABLE);
    v.put("LPVISIOACCELTABLES", LPVISIOACCELTABLES);
    v.put("LPVISIOADDON", LPVISIOADDON);
    v.put("LPVISIOADDONS", LPVISIOADDONS);
    v.put("LPVISIOAPPLICATION", LPVISIOAPPLICATION);
    v.put("LPVISIOAPPSETTINGS", LPVISIOAPPSETTINGS);
    v.put("LPVISIOCELL", LPVISIOCELL);
    v.put("LPVISIOCHARS", LPVISIOCHARS);
    v.put("LPVISIOCOLOR", LPVISIOCOLOR);
    v.put("LPVISIOCOLORS", LPVISIOCOLORS);
    v.put("LPVISIOCONNECT", LPVISIOCONNECT);
    v.put("LPVISIOCONNECTS", LPVISIOCONNECTS);
    v.put("LPVISIOCURVE", LPVISIOCURVE);
    v.put("LPVISIODATACOLUMN", LPVISIODATACOLUMN);
    v.put("LPVISIODATACOLUMNS", LPVISIODATACOLUMNS);
    v.put("LPVISIODATACONNECTION", LPVISIODATACONNECTION);
    v.put("LPVISIODATARECORDSET", LPVISIODATARECORDSET);
    v.put("LPVISIODATARECORDSETCHANGEDEVENT", LPVISIODATARECORDSETCHANGEDEVENT);
    v.put("LPVISIODATARECORDSETS", LPVISIODATARECORDSETS);
    v.put("LPVISIODOCUMENT", LPVISIODOCUMENT);
    v.put("LPVISIODOCUMENTS", LPVISIODOCUMENTS);
    v.put("LPVISIOENUMVACCELITEM", LPVISIOENUMVACCELITEM);
    v.put("LPVISIOENUMVACCELTABLE", LPVISIOENUMVACCELTABLE);
    v.put("LPVISIOENUMVMENU", LPVISIOENUMVMENU);
    v.put("LPVISIOENUMVMENUITEM", LPVISIOENUMVMENUITEM);
    v.put("LPVISIOENUMVMENUSET", LPVISIOENUMVMENUSET);
    v.put("LPVISIOENUMVSTATUSBAR", LPVISIOENUMVSTATUSBAR);
    v.put("LPVISIOENUMVSTATUSBARITEM", LPVISIOENUMVSTATUSBARITEM);
    v.put("LPVISIOENUMVTOOLBAR", LPVISIOENUMVTOOLBAR);
    v.put("LPVISIOENUMVTOOLBARITEM", LPVISIOENUMVTOOLBARITEM);
    v.put("LPVISIOENUMVTOOLBARSET", LPVISIOENUMVTOOLBARSET);
    v.put("LPVISIOEVENT", LPVISIOEVENT);
    v.put("LPVISIOEVENTS", LPVISIOEVENTS);
    v.put("LPVISIOFONT", LPVISIOFONT);
    v.put("LPVISIOFONTS", LPVISIOFONTS);
    v.put("LPVISIOGRAPHICITEM", LPVISIOGRAPHICITEM);
    v.put("LPVISIOGRAPHICITEMS", LPVISIOGRAPHICITEMS);
    v.put("LPVISIOHYPERLINK", LPVISIOHYPERLINK);
    v.put("LPVISIOHYPERLINKS", LPVISIOHYPERLINKS);
    v.put("LPVISIOLAYER", LPVISIOLAYER);
    v.put("LPVISIOLAYERS", LPVISIOLAYERS);
    v.put("LPVISIOMASTER", LPVISIOMASTER);
    v.put("LPVISIOMASTERS", LPVISIOMASTERS);
    v.put("LPVISIOMASTERSHORTCUT", LPVISIOMASTERSHORTCUT);
    v.put("LPVISIOMASTERSHORTCUTS", LPVISIOMASTERSHORTCUTS);
    v.put("LPVISIOMENU", LPVISIOMENU);
    v.put("LPVISIOMENUITEM", LPVISIOMENUITEM);
    v.put("LPVISIOMENUITEMS", LPVISIOMENUITEMS);
    v.put("LPVISIOMENUS", LPVISIOMENUS);
    v.put("LPVISIOMENUSET", LPVISIOMENUSET);
    v.put("LPVISIOMENUSETS", LPVISIOMENUSETS);
    v.put("LPVISIOMSGWRAP", LPVISIOMSGWRAP);
    v.put("LPVISIOOBJECT", LPVISIOOBJECT);
    v.put("LPVISIOOBJECTS", LPVISIOOBJECTS);
    v.put("LPVISIOPAGE", LPVISIOPAGE);
    v.put("LPVISIOPAGES", LPVISIOPAGES);
    v.put("LPVISIOPATH", LPVISIOPATH);
    v.put("LPVISIOPATHS", LPVISIOPATHS);
    v.put("LPVISIOROW", LPVISIOROW);
    v.put("LPVISIOSECTION", LPVISIOSECTION);
    v.put("LPVISIOSELECTION", LPVISIOSELECTION);
    v.put("LPVISIOSHAPE", LPVISIOSHAPE);
    v.put("LPVISIOSHAPES", LPVISIOSHAPES);
    v.put("LPVISIOSTATUSBAR", LPVISIOSTATUSBAR);
    v.put("LPVISIOSTATUSBARITEM", LPVISIOSTATUSBARITEM);
    v.put("LPVISIOSTATUSBARITEMS", LPVISIOSTATUSBARITEMS);
    v.put("LPVISIOSTATUSBARS", LPVISIOSTATUSBARS);
    v.put("LPVISIOSTYLE", LPVISIOSTYLE);
    v.put("LPVISIOSTYLES", LPVISIOSTYLES);
    v.put("LPVISIOTOOLBAR", LPVISIOTOOLBAR);
    v.put("LPVISIOTOOLBARITEM", LPVISIOTOOLBARITEM);
    v.put("LPVISIOTOOLBARITEMS", LPVISIOTOOLBARITEMS);
    v.put("LPVISIOTOOLBARS", LPVISIOTOOLBARS);
    v.put("LPVISIOTOOLBARSET", LPVISIOTOOLBARSET);
    v.put("LPVISIOTOOLBARSETS", LPVISIOTOOLBARSETS);
    v.put("LPVISIOUIOBJECT", LPVISIOUIOBJECT);
    v.put("LPVISIOWINDOW", LPVISIOWINDOW);
    v.put("LPVISIOWINDOWS", LPVISIOWINDOWS);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
