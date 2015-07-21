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

/**
 * @author Jason Smith
 */
public final class tagVisEventCodes
{
  private tagVisEventCodes()
  {
  }

  /**
   * The ID no Event object can have.<p>
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer visEvtIDInval = Integer.valueOf(-1);

  /**
   * The ID no Event scope can have.<p>
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer visScopeIDInval = Integer.valueOf(-1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visEvtCodeInval = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visEvtCodeDocCreate = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visEvtCodeDocOpen = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visEvtCodeDocSave = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visEvtCodeDocSaveAs = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visEvtCodeDocRunning = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visEvtCodeDocDesign = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visEvtCodeBefDocSave = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visEvtCodeBefDocSaveAs = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visEvtCodeQueryCancelDocClose = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer visEvtCodeCancelDocClose = Integer.valueOf(10);

  /**
   * Value is 200 (0xC8)
   */
  public static final Integer visEvtCodeBefForcedFlush = Integer.valueOf(200);

  /**
   * Value is 201 (0xC9)
   */
  public static final Integer visEvtCodeAfterForcedFlush = Integer.valueOf(201);

  /**
   * Value is 202 (0xCA)
   */
  public static final Integer visEvtCodeEnterScope = Integer.valueOf(202);

  /**
   * Value is 203 (0xCB)
   */
  public static final Integer visEvtCodeExitScope = Integer.valueOf(203);

  /**
   * Value is 204 (0xCC)
   */
  public static final Integer visEvtCodeQueryCancelQuit = Integer.valueOf(204);

  /**
   * Value is 205 (0xCD)
   */
  public static final Integer visEvtCodeCancelQuit = Integer.valueOf(205);

  /**
   * Value is 206 (0xCE)
   */
  public static final Integer visEvtCodeQueryCancelSuspend = Integer.valueOf(206);

  /**
   * Value is 207 (0xCF)
   */
  public static final Integer visEvtCodeCancelSuspend = Integer.valueOf(207);

  /**
   * Value is 208 (0xD0)
   */
  public static final Integer visEvtCodeBeforeSuspend = Integer.valueOf(208);

  /**
   * Value is 209 (0xD1)
   */
  public static final Integer visEvtCodeAfterResume = Integer.valueOf(209);

  /**
   * Value is 300 (0x12C)
   */
  public static final Integer visEvtCodeQueryCancelStyleDel = Integer.valueOf(300);

  /**
   * Value is 301 (0x12D)
   */
  public static final Integer visEvtCodeCancelStyleDel = Integer.valueOf(301);

  /**
   * Value is 400 (0x190)
   */
  public static final Integer visEvtCodeQueryCancelMasterDel = Integer.valueOf(400);

  /**
   * Value is 401 (0x191)
   */
  public static final Integer visEvtCodeCancelMasterDel = Integer.valueOf(401);

  /**
   * Value is 500 (0x1F4)
   */
  public static final Integer visEvtCodeQueryCancelPageDel = Integer.valueOf(500);

  /**
   * Value is 501 (0x1F5)
   */
  public static final Integer visEvtCodeCancelPageDel = Integer.valueOf(501);

  /**
   * Value is 701 (0x2BD)
   */
  public static final Integer visEvtCodeWinSelChange = Integer.valueOf(701);

  /**
   * Value is 702 (0x2BE)
   */
  public static final Integer visEvtCodeBefWinSelDel = Integer.valueOf(702);

  /**
   * Value is 703 (0x2BF)
   */
  public static final Integer visEvtCodeBefWinPageTurn = Integer.valueOf(703);

  /**
   * Value is 704 (0x2C0)
   */
  public static final Integer visEvtCodeWinPageTurn = Integer.valueOf(704);

  /**
   * Value is 705 (0x2C1)
   */
  public static final Integer visEvtCodeViewChanged = Integer.valueOf(705);

  /**
   * Value is 706 (0x2C2)
   */
  public static final Integer visEvtCodeQueryCancelWinClose = Integer.valueOf(706);

  /**
   * Value is 707 (0x2C3)
   */
  public static final Integer visEvtCodeCancelWinClose = Integer.valueOf(707);

  /**
   * Value is 708 (0x2C4)
   */
  public static final Integer visEvtCodeWinOnAddonKeyMSG = Integer.valueOf(708);

  /**
   * Value is 801 (0x321)
   */
  public static final Integer visEvtCodeShapeDelete = Integer.valueOf(801);

  /**
   * Value is 802 (0x322)
   */
  public static final Integer visEvtCodeShapeParentChange = Integer.valueOf(802);

  /**
   * Value is 803 (0x323)
   */
  public static final Integer visEvtCodeShapeBeforeTextEdit = Integer.valueOf(803);

  /**
   * Value is 804 (0x324)
   */
  public static final Integer visEvtCodeShapeExitTextEdit = Integer.valueOf(804);

  /**
   * Value is 901 (0x385)
   */
  public static final Integer visEvtCodeBefSelDel = Integer.valueOf(901);

  /**
   * Value is 902 (0x386)
   */
  public static final Integer visEvtCodeSelAdded = Integer.valueOf(902);

  /**
   * Value is 903 (0x387)
   */
  public static final Integer visEvtCodeQueryCancelSelDel = Integer.valueOf(903);

  /**
   * Value is 904 (0x388)
   */
  public static final Integer visEvtCodeCancelSelDel = Integer.valueOf(904);

  /**
   * Value is 905 (0x389)
   */
  public static final Integer visEvtCodeQueryCancelUngroup = Integer.valueOf(905);

  /**
   * Value is 906 (0x38A)
   */
  public static final Integer visEvtCodeCancelUngroup = Integer.valueOf(906);

  /**
   * Value is 907 (0x38B)
   */
  public static final Integer visEvtCodeQueryCancelConvertToGroup = Integer.valueOf(907);

  /**
   * Value is 908 (0x38C)
   */
  public static final Integer visEvtCodeCancelConvertToGroup = Integer.valueOf(908);

  /**
   * Value is 32768 (0x8000)
   */
  public static final Integer visEvtAdd = Integer.valueOf(32768);

  /**
   * Value is 16384 (0x4000)
   */
  public static final Integer visEvtDel = Integer.valueOf(16384);

  /**
   * Value is 8192 (0x2000)
   */
  public static final Integer visEvtMod = Integer.valueOf(8192);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visEvtWindow = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visEvtDoc = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visEvtStyle = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visEvtMaster = Integer.valueOf(8);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visEvtPage = Integer.valueOf(16);

  /**
   * Obsolete<p>
   * Value is 32 (0x20)
   */
  public static final Integer visEvtLayer = Integer.valueOf(32);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer visEvtShape = Integer.valueOf(64);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer visEvtText = Integer.valueOf(128);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer visEvtConnect = Integer.valueOf(256);

  /**
   * Value is 512 (0x200)
   */
  public static final Integer visEvtSection = Integer.valueOf(512);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer visEvtRow = Integer.valueOf(1024);

  /**
   * visEvtCell+visEvtMod fires when a cell's value changes.<p>
   * Value is 2048 (0x800)
   */
  public static final Integer visEvtCell = Integer.valueOf(2048);

  /**
   * visEvtFormula+visEvtMod fires when a cell's formula changes.<p>
   * Value is 4096 (0x1000)
   */
  public static final Integer visEvtFormula = Integer.valueOf(4096);

  /**
   * Value is 4096 (0x1000)
   */
  public static final Integer visEvtApp = Integer.valueOf(4096);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visEvtAppActivate = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visEvtAppDeactivate = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visEvtObjActivate = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visEvtObjDeactivate = Integer.valueOf(8);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visEvtBeforeQuit = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer visEvtBeforeModal = Integer.valueOf(32);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer visEvtAfterModal = Integer.valueOf(64);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer visEvtWinActivate = Integer.valueOf(128);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer visEvtMarker = Integer.valueOf(256);

  /**
   * Value is 512 (0x200)
   */
  public static final Integer visEvtNonePending = Integer.valueOf(512);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer visEvtIdle = Integer.valueOf(1024);

  /**
   * Obsolete as of Visio 4.1.<p>
   * Value is 28672 (0x7000)
   */
  public static final Integer visEvtCode1stUser = Integer.valueOf(28672);

  /**
   * Obsolete as of Visio 4.1.<p>
   * Value is 32767 (0x7FFF)
   */
  public static final Integer visEvtCodeLastUser = Integer.valueOf(32767);

  /**
   * Obsolete. Use visEvtCodeDocCreate instead.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visEvtCodeCreate = Integer.valueOf(1);

  /**
   * Obsolete. Use visEvtCodeDocOpen instead.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visEvtCodeOpen = Integer.valueOf(2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visActCodeRunAddon = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visActCodeAdvise = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visEvtIdMostRecent = Integer.valueOf(0);

  /**
   * Value is 709 (0x2C5)
   */
  public static final Integer visEvtCodeMouseDown = Integer.valueOf(709);

  /**
   * Value is 710 (0x2C6)
   */
  public static final Integer visEvtCodeMouseMove = Integer.valueOf(710);

  /**
   * Value is 711 (0x2C7)
   */
  public static final Integer visEvtCodeMouseUp = Integer.valueOf(711);

  /**
   * Value is 712 (0x2C8)
   */
  public static final Integer visEvtCodeKeyDown = Integer.valueOf(712);

  /**
   * Value is 713 (0x2C9)
   */
  public static final Integer visEvtCodeKeyPress = Integer.valueOf(713);

  /**
   * Value is 714 (0x2CA)
   */
  public static final Integer visEvtCodeKeyUp = Integer.valueOf(714);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer visEvtDataRecordset = Integer.valueOf(32);

  /**
   * Value is 805 (0x325)
   */
  public static final Integer visEvtShapeLinkAdded = Integer.valueOf(805);

  /**
   * Value is 806 (0x326)
   */
  public static final Integer visEvtShapeLinkDeleted = Integer.valueOf(806);

  /**
   * Value is 807 (0x327)
   */
  public static final Integer visEvtShapeDataGraphicChanged = Integer.valueOf(807);

  /**
   * Value is 909 (0x38D)
   */
  public static final Integer visEvtCodeQueryCancelSelGroup = Integer.valueOf(909);

  /**
   * Value is 910 (0x38E)
   */
  public static final Integer visEvtCodeCancelSelGroup = Integer.valueOf(910);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer visEvtRemoveHiddenInformation = Integer.valueOf(11);

  /**
   * Value is 210 (0xD2)
   */
  public static final Integer visEvtCodeQueryCancelSuspendEvents = Integer.valueOf(210);

  /**
   * Value is 211 (0xD3)
   */
  public static final Integer visEvtCodeCancelSuspendEvents = Integer.valueOf(211);

  /**
   * Value is 212 (0xD4)
   */
  public static final Integer visEvtCodeBeforeSuspendEvents = Integer.valueOf(212);

  /**
   * Value is 213 (0xD5)
   */
  public static final Integer visEvtCodeAfterResumeEvents = Integer.valueOf(213);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visEvtIDInval", visEvtIDInval);
    v.put("visScopeIDInval", visScopeIDInval);
    v.put("visEvtCodeInval", visEvtCodeInval);
    v.put("visEvtCodeDocCreate", visEvtCodeDocCreate);
    v.put("visEvtCodeDocOpen", visEvtCodeDocOpen);
    v.put("visEvtCodeDocSave", visEvtCodeDocSave);
    v.put("visEvtCodeDocSaveAs", visEvtCodeDocSaveAs);
    v.put("visEvtCodeDocRunning", visEvtCodeDocRunning);
    v.put("visEvtCodeDocDesign", visEvtCodeDocDesign);
    v.put("visEvtCodeBefDocSave", visEvtCodeBefDocSave);
    v.put("visEvtCodeBefDocSaveAs", visEvtCodeBefDocSaveAs);
    v.put("visEvtCodeQueryCancelDocClose", visEvtCodeQueryCancelDocClose);
    v.put("visEvtCodeCancelDocClose", visEvtCodeCancelDocClose);
    v.put("visEvtCodeBefForcedFlush", visEvtCodeBefForcedFlush);
    v.put("visEvtCodeAfterForcedFlush", visEvtCodeAfterForcedFlush);
    v.put("visEvtCodeEnterScope", visEvtCodeEnterScope);
    v.put("visEvtCodeExitScope", visEvtCodeExitScope);
    v.put("visEvtCodeQueryCancelQuit", visEvtCodeQueryCancelQuit);
    v.put("visEvtCodeCancelQuit", visEvtCodeCancelQuit);
    v.put("visEvtCodeQueryCancelSuspend", visEvtCodeQueryCancelSuspend);
    v.put("visEvtCodeCancelSuspend", visEvtCodeCancelSuspend);
    v.put("visEvtCodeBeforeSuspend", visEvtCodeBeforeSuspend);
    v.put("visEvtCodeAfterResume", visEvtCodeAfterResume);
    v.put("visEvtCodeQueryCancelStyleDel", visEvtCodeQueryCancelStyleDel);
    v.put("visEvtCodeCancelStyleDel", visEvtCodeCancelStyleDel);
    v.put("visEvtCodeQueryCancelMasterDel", visEvtCodeQueryCancelMasterDel);
    v.put("visEvtCodeCancelMasterDel", visEvtCodeCancelMasterDel);
    v.put("visEvtCodeQueryCancelPageDel", visEvtCodeQueryCancelPageDel);
    v.put("visEvtCodeCancelPageDel", visEvtCodeCancelPageDel);
    v.put("visEvtCodeWinSelChange", visEvtCodeWinSelChange);
    v.put("visEvtCodeBefWinSelDel", visEvtCodeBefWinSelDel);
    v.put("visEvtCodeBefWinPageTurn", visEvtCodeBefWinPageTurn);
    v.put("visEvtCodeWinPageTurn", visEvtCodeWinPageTurn);
    v.put("visEvtCodeViewChanged", visEvtCodeViewChanged);
    v.put("visEvtCodeQueryCancelWinClose", visEvtCodeQueryCancelWinClose);
    v.put("visEvtCodeCancelWinClose", visEvtCodeCancelWinClose);
    v.put("visEvtCodeWinOnAddonKeyMSG", visEvtCodeWinOnAddonKeyMSG);
    v.put("visEvtCodeShapeDelete", visEvtCodeShapeDelete);
    v.put("visEvtCodeShapeParentChange", visEvtCodeShapeParentChange);
    v.put("visEvtCodeShapeBeforeTextEdit", visEvtCodeShapeBeforeTextEdit);
    v.put("visEvtCodeShapeExitTextEdit", visEvtCodeShapeExitTextEdit);
    v.put("visEvtCodeBefSelDel", visEvtCodeBefSelDel);
    v.put("visEvtCodeSelAdded", visEvtCodeSelAdded);
    v.put("visEvtCodeQueryCancelSelDel", visEvtCodeQueryCancelSelDel);
    v.put("visEvtCodeCancelSelDel", visEvtCodeCancelSelDel);
    v.put("visEvtCodeQueryCancelUngroup", visEvtCodeQueryCancelUngroup);
    v.put("visEvtCodeCancelUngroup", visEvtCodeCancelUngroup);
    v.put("visEvtCodeQueryCancelConvertToGroup", visEvtCodeQueryCancelConvertToGroup);
    v.put("visEvtCodeCancelConvertToGroup", visEvtCodeCancelConvertToGroup);
    v.put("visEvtAdd", visEvtAdd);
    v.put("visEvtDel", visEvtDel);
    v.put("visEvtMod", visEvtMod);
    v.put("visEvtWindow", visEvtWindow);
    v.put("visEvtDoc", visEvtDoc);
    v.put("visEvtStyle", visEvtStyle);
    v.put("visEvtMaster", visEvtMaster);
    v.put("visEvtPage", visEvtPage);
    v.put("visEvtLayer", visEvtLayer);
    v.put("visEvtShape", visEvtShape);
    v.put("visEvtText", visEvtText);
    v.put("visEvtConnect", visEvtConnect);
    v.put("visEvtSection", visEvtSection);
    v.put("visEvtRow", visEvtRow);
    v.put("visEvtCell", visEvtCell);
    v.put("visEvtFormula", visEvtFormula);
    v.put("visEvtApp", visEvtApp);
    v.put("visEvtAppActivate", visEvtAppActivate);
    v.put("visEvtAppDeactivate", visEvtAppDeactivate);
    v.put("visEvtObjActivate", visEvtObjActivate);
    v.put("visEvtObjDeactivate", visEvtObjDeactivate);
    v.put("visEvtBeforeQuit", visEvtBeforeQuit);
    v.put("visEvtBeforeModal", visEvtBeforeModal);
    v.put("visEvtAfterModal", visEvtAfterModal);
    v.put("visEvtWinActivate", visEvtWinActivate);
    v.put("visEvtMarker", visEvtMarker);
    v.put("visEvtNonePending", visEvtNonePending);
    v.put("visEvtIdle", visEvtIdle);
    v.put("visEvtCode1stUser", visEvtCode1stUser);
    v.put("visEvtCodeLastUser", visEvtCodeLastUser);
    v.put("visEvtCodeCreate", visEvtCodeCreate);
    v.put("visEvtCodeOpen", visEvtCodeOpen);
    v.put("visActCodeRunAddon", visActCodeRunAddon);
    v.put("visActCodeAdvise", visActCodeAdvise);
    v.put("visEvtIdMostRecent", visEvtIdMostRecent);
    v.put("visEvtCodeMouseDown", visEvtCodeMouseDown);
    v.put("visEvtCodeMouseMove", visEvtCodeMouseMove);
    v.put("visEvtCodeMouseUp", visEvtCodeMouseUp);
    v.put("visEvtCodeKeyDown", visEvtCodeKeyDown);
    v.put("visEvtCodeKeyPress", visEvtCodeKeyPress);
    v.put("visEvtCodeKeyUp", visEvtCodeKeyUp);
    v.put("visEvtDataRecordset", visEvtDataRecordset);
    v.put("visEvtShapeLinkAdded", visEvtShapeLinkAdded);
    v.put("visEvtShapeLinkDeleted", visEvtShapeLinkDeleted);
    v.put("visEvtShapeDataGraphicChanged", visEvtShapeDataGraphicChanged);
    v.put("visEvtCodeQueryCancelSelGroup", visEvtCodeQueryCancelSelGroup);
    v.put("visEvtCodeCancelSelGroup", visEvtCodeCancelSelGroup);
    v.put("visEvtRemoveHiddenInformation", visEvtRemoveHiddenInformation);
    v.put("visEvtCodeQueryCancelSuspendEvents", visEvtCodeQueryCancelSuspendEvents);
    v.put("visEvtCodeCancelSuspendEvents", visEvtCodeCancelSuspendEvents);
    v.put("visEvtCodeBeforeSuspendEvents", visEvtCodeBeforeSuspendEvents);
    v.put("visEvtCodeAfterResumeEvents", visEvtCodeAfterResumeEvents);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
