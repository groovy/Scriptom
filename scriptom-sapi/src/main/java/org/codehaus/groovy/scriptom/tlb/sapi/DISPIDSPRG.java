/*
 * Copyright 2007 (C) Guillaume Laforge. All Rights Reserved.
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
package org.codehaus.groovy.scriptom.tlb.sapi;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class DISPIDSPRG
{
  private DISPIDSPRG()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DISPID_SRGId = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DISPID_SRGRecoContext = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer DISPID_SRGState = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DISPID_SRGRules = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer DISPID_SRGReset = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer DISPID_SRGCommit = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer DISPID_SRGCmdLoadFromFile = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer DISPID_SRGCmdLoadFromObject = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer DISPID_SRGCmdLoadFromResource = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer DISPID_SRGCmdLoadFromMemory = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer DISPID_SRGCmdLoadFromProprietaryGrammar = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer DISPID_SRGCmdSetRuleState = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer DISPID_SRGCmdSetRuleIdState = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer DISPID_SRGDictationLoad = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer DISPID_SRGDictationUnload = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer DISPID_SRGDictationSetState = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer DISPID_SRGSetWordSequenceData = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer DISPID_SRGSetTextSelection = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer DISPID_SRGIsPronounceable = Integer.valueOf(19);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("DISPID_SRGId", DISPID_SRGId);
    v.put("DISPID_SRGRecoContext", DISPID_SRGRecoContext);
    v.put("DISPID_SRGState", DISPID_SRGState);
    v.put("DISPID_SRGRules", DISPID_SRGRules);
    v.put("DISPID_SRGReset", DISPID_SRGReset);
    v.put("DISPID_SRGCommit", DISPID_SRGCommit);
    v.put("DISPID_SRGCmdLoadFromFile", DISPID_SRGCmdLoadFromFile);
    v.put("DISPID_SRGCmdLoadFromObject", DISPID_SRGCmdLoadFromObject);
    v.put("DISPID_SRGCmdLoadFromResource", DISPID_SRGCmdLoadFromResource);
    v.put("DISPID_SRGCmdLoadFromMemory", DISPID_SRGCmdLoadFromMemory);
    v.put("DISPID_SRGCmdLoadFromProprietaryGrammar", DISPID_SRGCmdLoadFromProprietaryGrammar);
    v.put("DISPID_SRGCmdSetRuleState", DISPID_SRGCmdSetRuleState);
    v.put("DISPID_SRGCmdSetRuleIdState", DISPID_SRGCmdSetRuleIdState);
    v.put("DISPID_SRGDictationLoad", DISPID_SRGDictationLoad);
    v.put("DISPID_SRGDictationUnload", DISPID_SRGDictationUnload);
    v.put("DISPID_SRGDictationSetState", DISPID_SRGDictationSetState);
    v.put("DISPID_SRGSetWordSequenceData", DISPID_SRGSetWordSequenceData);
    v.put("DISPID_SRGSetTextSelection", DISPID_SRGSetTextSelection);
    v.put("DISPID_SRGIsPronounceable", DISPID_SRGIsPronounceable);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
