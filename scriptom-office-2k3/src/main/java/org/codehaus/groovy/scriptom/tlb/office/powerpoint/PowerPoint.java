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
package org.codehaus.groovy.scriptom.tlb.office.powerpoint;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class PowerPoint
{
  private PowerPoint()
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
   *   <li><b>Application</b> = PowerPoint.Application</li>
   * </ul>
   */
  public final static Map<String,String> progIds;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Application", "PowerPoint.Application");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

 /** GUID for this type library. */
  public static final String GUID = "{91493440-5A91-11CF-8700-00AA0060263B}";

  /**
   * CoClass: Application
   */
  public final static String Application = "{91493442-5A91-11CF-8700-00AA0060263B}";

  /**
   * CoClass: Global
   */
  public final static String Global = "{91493451-5A91-11CF-8700-00AA0060263B}";

  /**
   * CoClass: Master
   */
  public final static String Master = "{9149346C-5A91-11CF-8700-00AA0060263B}";

  /**
   * CoClass: OLEControl
   */
  public final static String OLEControl = "{914934C0-5A91-11CF-8700-00AA0060263B}";

  /**
   * CoClass: PowerRex
   */
  public final static String PowerRex = "{914934D3-5A91-11CF-8700-00AA0060263B}";

  /**
   * CoClass: Presentation
   */
  public final static String Presentation = "{9149349D-5A91-11CF-8700-00AA0060263B}";

  /**
   * CoClass: Slide
   */
  public final static String Slide = "{9149346A-5A91-11CF-8700-00AA0060263B}";

  /**
   * A {@code Map} of CoClass names to default interface GUIDs for this type library.
   */
  public final static Map<String,String> coClasses;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("Application", Application);
    v.put("Global", Global);
    v.put("Master", Master);
    v.put("OLEControl", OLEControl);
    v.put("PowerRex", PowerRex);
    v.put("Presentation", Presentation);
    v.put("Slide", Slide);
    coClasses = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: ActionSetting
   */
  public final static String ActionSetting = "{9149348D-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ActionSettings
   */
  public final static String ActionSettings = "{9149348C-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: AddIn
   */
  public final static String AddIn = "{91493461-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: AddIns
   */
  public final static String AddIns = "{91493460-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Adjustments
   */
  public final static String Adjustments = "{9149347C-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: AnimationBehavior
   */
  public final static String AnimationBehavior = "{914934E4-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: AnimationBehaviors
   */
  public final static String AnimationBehaviors = "{914934E3-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: AnimationPoint
   */
  public final static String AnimationPoint = "{914934EB-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: AnimationPoints
   */
  public final static String AnimationPoints = "{914934EA-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: AnimationSettings
   */
  public final static String AnimationSettings = "{9149348B-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: AutoCorrect
   */
  public final static String AutoCorrect = "{914934ED-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Borders
   */
  public final static String Borders = "{914934CA-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: BulletFormat
   */
  public final static String BulletFormat = "{91493497-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: CalloutFormat
   */
  public final static String CalloutFormat = "{91493485-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: CanvasShapes
   */
  public final static String CanvasShapes = "{914934EC-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Cell
   */
  public final static String Cell = "{914934C9-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: CellRange
   */
  public final static String CellRange = "{914934C8-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Collection
   */
  public final static String Collection = "{91493450-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ColorEffect
   */
  public final static String ColorEffect = "{914934E6-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ColorFormat
   */
  public final static String ColorFormat = "{91493452-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ColorScheme
   */
  public final static String ColorScheme = "{9149346F-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ColorSchemes
   */
  public final static String ColorSchemes = "{9149346E-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Column
   */
  public final static String Column = "{914934C5-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Columns
   */
  public final static String Columns = "{914934C4-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: CommandEffect
   */
  public final static String CommandEffect = "{914934EF-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Comment
   */
  public final static String Comment = "{914934D5-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Comments
   */
  public final static String Comments = "{914934D4-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ConnectorFormat
   */
  public final static String ConnectorFormat = "{91493481-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: DefaultWebOptions
   */
  public final static String DefaultWebOptions = "{914934CD-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Design
   */
  public final static String Design = "{914934D7-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Designs
   */
  public final static String Designs = "{914934D6-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Diagram
   */
  public final static String Diagram = "{914934DB-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: DiagramNode
   */
  public final static String DiagramNode = "{914934D8-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: DiagramNodeChildren
   */
  public final static String DiagramNodeChildren = "{914934D9-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: DiagramNodes
   */
  public final static String DiagramNodes = "{914934DA-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: DocumentWindow
   */
  public final static String DocumentWindow = "{91493457-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: DocumentWindows
   */
  public final static String DocumentWindows = "{91493455-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: EApplication
   */
  public final static String EApplication = "{914934C2-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Effect
   */
  public final static String Effect = "{914934DF-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: EffectInformation
   */
  public final static String EffectInformation = "{914934E2-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: EffectParameters
   */
  public final static String EffectParameters = "{914934E1-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ExtraColors
   */
  public final static String ExtraColors = "{91493468-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: FillFormat
   */
  public final static String FillFormat = "{9149347E-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: FilterEffect
   */
  public final static String FilterEffect = "{914934F0-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Font
   */
  public final static String Font = "{91493495-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Fonts
   */
  public final static String Fonts = "{91493467-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: FreeformBuilder
   */
  public final static String FreeformBuilder = "{91493478-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: GroupShapes
   */
  public final static String GroupShapes = "{9149347B-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: HeaderFooter
   */
  public final static String HeaderFooter = "{9149349C-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: HeadersFooters
   */
  public final static String HeadersFooters = "{91493474-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Hyperlink
   */
  public final static String Hyperlink = "{91493465-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Hyperlinks
   */
  public final static String Hyperlinks = "{91493464-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: LineFormat
   */
  public final static String LineFormat = "{9149347F-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: LinkFormat
   */
  public final static String LinkFormat = "{91493489-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: MasterEvents
   */
  public final static String MasterEvents = "{914934D2-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: MotionEffect
   */
  public final static String MotionEffect = "{914934E5-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: MouseDownHandler
   */
  public final static String MouseDownHandler = "{914934BF-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: MouseTracker
   */
  public final static String MouseTracker = "{914934BE-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: NamedSlideShow
   */
  public final static String NamedSlideShow = "{9149345C-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: NamedSlideShows
   */
  public final static String NamedSlideShows = "{9149345B-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: OCXExtender
   */
  public final static String OCXExtender = "{914934C0-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: OCXExtenderEvents
   */
  public final static String OCXExtenderEvents = "{914934C1-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: OLEFormat
   */
  public final static String OLEFormat = "{91493488-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ObjectVerbs
   */
  public final static String ObjectVerbs = "{9149348A-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Options
   */
  public final static String Options = "{914934EE-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: PageSetup
   */
  public final static String PageSetup = "{91493466-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Pane
   */
  public final static String Pane = "{914934CC-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Panes
   */
  public final static String Panes = "{914934CB-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ParagraphFormat
   */
  public final static String ParagraphFormat = "{91493496-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: PictureFormat
   */
  public final static String PictureFormat = "{9149347D-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: PlaceholderFormat
   */
  public final static String PlaceholderFormat = "{91493477-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Placeholders
   */
  public final static String Placeholders = "{91493476-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: PlaySettings
   */
  public final static String PlaySettings = "{9149348E-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: PresEvents
   */
  public final static String PresEvents = "{91493463-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Presentations
   */
  public final static String Presentations = "{91493462-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: PrintOptions
   */
  public final static String PrintOptions = "{9149345D-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: PrintRange
   */
  public final static String PrintRange = "{9149345F-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: PrintRanges
   */
  public final static String PrintRanges = "{9149345E-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: PropertyEffect
   */
  public final static String PropertyEffect = "{914934E9-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: PublishObject
   */
  public final static String PublishObject = "{914934D0-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: PublishObjects
   */
  public final static String PublishObjects = "{914934CF-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: RGBColor
   */
  public final static String RGBColor = "{91493470-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: RotationEffect
   */
  public final static String RotationEffect = "{914934E8-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Row
   */
  public final static String Row = "{914934C7-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Rows
   */
  public final static String Rows = "{914934C6-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Ruler
   */
  public final static String Ruler = "{91493490-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: RulerLevel
   */
  public final static String RulerLevel = "{91493492-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: RulerLevels
   */
  public final static String RulerLevels = "{91493491-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ScaleEffect
   */
  public final static String ScaleEffect = "{914934E7-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Selection
   */
  public final static String Selection = "{91493454-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Sequence
   */
  public final static String Sequence = "{914934DE-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Sequences
   */
  public final static String Sequences = "{914934DD-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: SetEffect
   */
  public final static String SetEffect = "{914934F1-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ShadowFormat
   */
  public final static String ShadowFormat = "{91493480-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Shape
   */
  public final static String Shape = "{91493479-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ShapeNode
   */
  public final static String ShapeNode = "{91493487-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ShapeNodes
   */
  public final static String ShapeNodes = "{91493486-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ShapeRange
   */
  public final static String ShapeRange = "{9149347A-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Shapes
   */
  public final static String Shapes = "{91493475-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: SldEvents
   */
  public final static String SldEvents = "{9149346D-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: SlideRange
   */
  public final static String SlideRange = "{9149346B-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: SlideShowSettings
   */
  public final static String SlideShowSettings = "{9149345A-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: SlideShowTransition
   */
  public final static String SlideShowTransition = "{91493471-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: SlideShowView
   */
  public final static String SlideShowView = "{91493459-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: SlideShowWindow
   */
  public final static String SlideShowWindow = "{91493453-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: SlideShowWindows
   */
  public final static String SlideShowWindows = "{91493456-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Slides
   */
  public final static String Slides = "{91493469-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: SoundEffect
   */
  public final static String SoundEffect = "{91493472-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: SoundFormat
   */
  public final static String SoundFormat = "{91493473-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: TabStop
   */
  public final static String TabStop = "{91493494-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: TabStops
   */
  public final static String TabStops = "{91493493-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Table
   */
  public final static String Table = "{914934C3-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Tags
   */
  public final static String Tags = "{914934B9-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: TextEffectFormat
   */
  public final static String TextEffectFormat = "{91493482-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: TextFrame
   */
  public final static String TextFrame = "{91493484-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: TextRange
   */
  public final static String TextRange = "{9149348F-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: TextStyle
   */
  public final static String TextStyle = "{91493499-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: TextStyleLevel
   */
  public final static String TextStyleLevel = "{9149349B-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: TextStyleLevels
   */
  public final static String TextStyleLevels = "{9149349A-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: TextStyles
   */
  public final static String TextStyles = "{91493498-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: ThreeDFormat
   */
  public final static String ThreeDFormat = "{91493483-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: TimeLine
   */
  public final static String TimeLine = "{914934DC-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: Timing
   */
  public final static String Timing = "{914934E0-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: View
   */
  public final static String View = "{91493458-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: WebOptions
   */
  public final static String WebOptions = "{914934CE-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: _Application
   */
  public final static String _Application = "{91493442-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: _Global
   */
  public final static String _Global = "{91493451-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: _Master
   */
  public final static String _Master = "{9149346C-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: _PowerRex
   */
  public final static String _PowerRex = "{914934D3-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: _Presentation
   */
  public final static String _Presentation = "{9149349D-5A91-11CF-8700-00AA0060263B}";

  /**
   * Interface: _Slide
   */
  public final static String _Slide = "{9149346A-5A91-11CF-8700-00AA0060263B}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map<String,String> interfaces;
  static
  {
    TreeMap<String,String> v = new TreeMap<String,String>();
    v.put("ActionSetting", ActionSetting);
    v.put("ActionSettings", ActionSettings);
    v.put("AddIn", AddIn);
    v.put("AddIns", AddIns);
    v.put("Adjustments", Adjustments);
    v.put("AnimationBehavior", AnimationBehavior);
    v.put("AnimationBehaviors", AnimationBehaviors);
    v.put("AnimationPoint", AnimationPoint);
    v.put("AnimationPoints", AnimationPoints);
    v.put("AnimationSettings", AnimationSettings);
    v.put("AutoCorrect", AutoCorrect);
    v.put("Borders", Borders);
    v.put("BulletFormat", BulletFormat);
    v.put("CalloutFormat", CalloutFormat);
    v.put("CanvasShapes", CanvasShapes);
    v.put("Cell", Cell);
    v.put("CellRange", CellRange);
    v.put("Collection", Collection);
    v.put("ColorEffect", ColorEffect);
    v.put("ColorFormat", ColorFormat);
    v.put("ColorScheme", ColorScheme);
    v.put("ColorSchemes", ColorSchemes);
    v.put("Column", Column);
    v.put("Columns", Columns);
    v.put("CommandEffect", CommandEffect);
    v.put("Comment", Comment);
    v.put("Comments", Comments);
    v.put("ConnectorFormat", ConnectorFormat);
    v.put("DefaultWebOptions", DefaultWebOptions);
    v.put("Design", Design);
    v.put("Designs", Designs);
    v.put("Diagram", Diagram);
    v.put("DiagramNode", DiagramNode);
    v.put("DiagramNodeChildren", DiagramNodeChildren);
    v.put("DiagramNodes", DiagramNodes);
    v.put("DocumentWindow", DocumentWindow);
    v.put("DocumentWindows", DocumentWindows);
    v.put("EApplication", EApplication);
    v.put("Effect", Effect);
    v.put("EffectInformation", EffectInformation);
    v.put("EffectParameters", EffectParameters);
    v.put("ExtraColors", ExtraColors);
    v.put("FillFormat", FillFormat);
    v.put("FilterEffect", FilterEffect);
    v.put("Font", Font);
    v.put("Fonts", Fonts);
    v.put("FreeformBuilder", FreeformBuilder);
    v.put("GroupShapes", GroupShapes);
    v.put("HeaderFooter", HeaderFooter);
    v.put("HeadersFooters", HeadersFooters);
    v.put("Hyperlink", Hyperlink);
    v.put("Hyperlinks", Hyperlinks);
    v.put("LineFormat", LineFormat);
    v.put("LinkFormat", LinkFormat);
    v.put("MasterEvents", MasterEvents);
    v.put("MotionEffect", MotionEffect);
    v.put("MouseDownHandler", MouseDownHandler);
    v.put("MouseTracker", MouseTracker);
    v.put("NamedSlideShow", NamedSlideShow);
    v.put("NamedSlideShows", NamedSlideShows);
    v.put("OCXExtender", OCXExtender);
    v.put("OCXExtenderEvents", OCXExtenderEvents);
    v.put("OLEFormat", OLEFormat);
    v.put("ObjectVerbs", ObjectVerbs);
    v.put("Options", Options);
    v.put("PageSetup", PageSetup);
    v.put("Pane", Pane);
    v.put("Panes", Panes);
    v.put("ParagraphFormat", ParagraphFormat);
    v.put("PictureFormat", PictureFormat);
    v.put("PlaceholderFormat", PlaceholderFormat);
    v.put("Placeholders", Placeholders);
    v.put("PlaySettings", PlaySettings);
    v.put("PresEvents", PresEvents);
    v.put("Presentations", Presentations);
    v.put("PrintOptions", PrintOptions);
    v.put("PrintRange", PrintRange);
    v.put("PrintRanges", PrintRanges);
    v.put("PropertyEffect", PropertyEffect);
    v.put("PublishObject", PublishObject);
    v.put("PublishObjects", PublishObjects);
    v.put("RGBColor", RGBColor);
    v.put("RotationEffect", RotationEffect);
    v.put("Row", Row);
    v.put("Rows", Rows);
    v.put("Ruler", Ruler);
    v.put("RulerLevel", RulerLevel);
    v.put("RulerLevels", RulerLevels);
    v.put("ScaleEffect", ScaleEffect);
    v.put("Selection", Selection);
    v.put("Sequence", Sequence);
    v.put("Sequences", Sequences);
    v.put("SetEffect", SetEffect);
    v.put("ShadowFormat", ShadowFormat);
    v.put("Shape", Shape);
    v.put("ShapeNode", ShapeNode);
    v.put("ShapeNodes", ShapeNodes);
    v.put("ShapeRange", ShapeRange);
    v.put("Shapes", Shapes);
    v.put("SldEvents", SldEvents);
    v.put("SlideRange", SlideRange);
    v.put("SlideShowSettings", SlideShowSettings);
    v.put("SlideShowTransition", SlideShowTransition);
    v.put("SlideShowView", SlideShowView);
    v.put("SlideShowWindow", SlideShowWindow);
    v.put("SlideShowWindows", SlideShowWindows);
    v.put("Slides", Slides);
    v.put("SoundEffect", SoundEffect);
    v.put("SoundFormat", SoundFormat);
    v.put("TabStop", TabStop);
    v.put("TabStops", TabStops);
    v.put("Table", Table);
    v.put("Tags", Tags);
    v.put("TextEffectFormat", TextEffectFormat);
    v.put("TextFrame", TextFrame);
    v.put("TextRange", TextRange);
    v.put("TextStyle", TextStyle);
    v.put("TextStyleLevel", TextStyleLevel);
    v.put("TextStyleLevels", TextStyleLevels);
    v.put("TextStyles", TextStyles);
    v.put("ThreeDFormat", ThreeDFormat);
    v.put("TimeLine", TimeLine);
    v.put("Timing", Timing);
    v.put("View", View);
    v.put("WebOptions", WebOptions);
    v.put("_Application", _Application);
    v.put("_Global", _Global);
    v.put("_Master", _Master);
    v.put("_PowerRex", _PowerRex);
    v.put("_Presentation", _Presentation);
    v.put("_Slide", _Slide);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
