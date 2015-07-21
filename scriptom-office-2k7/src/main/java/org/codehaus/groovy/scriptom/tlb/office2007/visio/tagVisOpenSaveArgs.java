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
public final class tagVisOpenSaveArgs
{
  private tagVisOpenSaveArgs()
  {
  }

  /**
   * Causes OpenEx to open copy of document.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visOpenCopy = Integer.valueOf(1);

  /**
   * Causes OpenEx to open document readonly.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visOpenRO = Integer.valueOf(2);

  /**
   * Causes OpenEx to open stencil in docked window.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visOpenDocked = Integer.valueOf(4);

  /**
   * Causes OpenEx not to put document in recently opened file list.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visOpenDontList = Integer.valueOf(8);

  /**
   * Causes OpenEx to open document in minimized window.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visOpenMinimized = Integer.valueOf(16);

  /**
   * Causes OpenEx to open document readwrite.<p>
   * Value is 32 (0x20)
   */
  public static final Integer visOpenRW = Integer.valueOf(32);

  /**
   * Causes OpenEx to open document in hidden window.<p>
   * Value is 64 (0x40)
   */
  public static final Integer visOpenHidden = Integer.valueOf(64);

  /**
   * Causes OpenEx to open document with macros disabled.<p>
   * Value is 128 (0x80)
   */
  public static final Integer visOpenMacrosDisabled = Integer.valueOf(128);

  /**
   * Causes OpenEx to open document with no workspace information.<p>
   * Value is 256 (0x100)
   */
  public static final Integer visOpenNoWorkspace = Integer.valueOf(256);

  /**
   * Causes OpenEx to open document without displaying Auto refresh dialog.<p>
   * Value is 1024 (0x400)
   */
  public static final Integer visOpenDeclineAutoRefresh = Integer.valueOf(1024);

  /**
   * Causes AddEx to add stencil in docked window.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visAddDocked = Integer.valueOf(4);

  /**
   * Causes AddEx to add document in minimized window.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visAddMinimized = Integer.valueOf(16);

  /**
   * Causes AddEx to add document in hidden window.<p>
   * Value is 64 (0x40)
   */
  public static final Integer visAddHidden = Integer.valueOf(64);

  /**
   * Causes AddEx to add document with macros disabled.<p>
   * Value is 128 (0x80)
   */
  public static final Integer visAddMacrosDisabled = Integer.valueOf(128);

  /**
   * Causes AddEx to add document with no workspace information.<p>
   * Value is 256 (0x100)
   */
  public static final Integer visAddNoWorkspace = Integer.valueOf(256);

  /**
   * Causes AddEx to create a stencil file.<p>
   * Value is 512 (0x200)
   */
  public static final Integer visAddStencil = Integer.valueOf(512);

  /**
   * Causes AddEx to add document without displaying Auto refresh dialog.<p>
   * Value is 1024 (0x400)
   */
  public static final Integer visAddDeclineAutoRefresh = Integer.valueOf(1024);

  /**
   * Causes SaveAsEx to save document readonly.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visSaveAsRO = Integer.valueOf(1);

  /**
   * Causes SaveAsEx to save workspace with document.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visSaveAsWS = Integer.valueOf(2);

  /**
   * Causes SaveAsEx to put document in recently opened file list.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visSaveAsListInMRU = Integer.valueOf(4);

  /**
   * Synonym of VisSavePreviewMode.visSavePreviewNone<p>
   * Value is 0 (0x0)
   */
  public static final Integer visSavePrevNone = Integer.valueOf(0);

  /**
   * Synonym of VisSavePreviewMode.visSavePreviewDraft1st<p>
   * Value is 1 (0x1)
   */
  public static final Integer visSavePrevDraft1st = Integer.valueOf(1);

  /**
   * Synonym of VisSavePreviewMode.visSavePreviewDetailed1st<p>
   * Value is 2 (0x2)
   */
  public static final Integer visSavePrevDetailed1st = Integer.valueOf(2);

  /**
   * Synonym of VisSavePreviewMode.visSavePreviewDraftAl<p>
   * Value is 4 (0x4)
   */
  public static final Integer visSavePrevDraftAll = Integer.valueOf(4);

  /**
   * Synonym of VisSavePreviewMode.visSavePreviewDetailedAl<p>
   * Value is 8 (0x8)
   */
  public static final Integer visSavePrevDetailedAll = Integer.valueOf(8);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visOpenCopy", visOpenCopy);
    v.put("visOpenRO", visOpenRO);
    v.put("visOpenDocked", visOpenDocked);
    v.put("visOpenDontList", visOpenDontList);
    v.put("visOpenMinimized", visOpenMinimized);
    v.put("visOpenRW", visOpenRW);
    v.put("visOpenHidden", visOpenHidden);
    v.put("visOpenMacrosDisabled", visOpenMacrosDisabled);
    v.put("visOpenNoWorkspace", visOpenNoWorkspace);
    v.put("visOpenDeclineAutoRefresh", visOpenDeclineAutoRefresh);
    v.put("visAddDocked", visAddDocked);
    v.put("visAddMinimized", visAddMinimized);
    v.put("visAddHidden", visAddHidden);
    v.put("visAddMacrosDisabled", visAddMacrosDisabled);
    v.put("visAddNoWorkspace", visAddNoWorkspace);
    v.put("visAddStencil", visAddStencil);
    v.put("visAddDeclineAutoRefresh", visAddDeclineAutoRefresh);
    v.put("visSaveAsRO", visSaveAsRO);
    v.put("visSaveAsWS", visSaveAsWS);
    v.put("visSaveAsListInMRU", visSaveAsListInMRU);
    v.put("visSavePrevNone", visSavePrevNone);
    v.put("visSavePrevDraft1st", visSavePrevDraft1st);
    v.put("visSavePrevDetailed1st", visSavePrevDetailed1st);
    v.put("visSavePrevDraftAll", visSavePrevDraftAll);
    v.put("visSavePrevDetailedAll", visSavePrevDetailedAll);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
