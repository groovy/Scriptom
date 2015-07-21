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

/**
 * @author Jason Smith
 */
public final class MsoAnimationType
{
  private MsoAnimationType()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer msoAnimationIdle = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer msoAnimationGreeting = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer msoAnimationGoodbye = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer msoAnimationBeginSpeaking = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer msoAnimationRestPose = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer msoAnimationCharacterSuccessMajor = Integer.valueOf(6);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer msoAnimationGetAttentionMajor = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer msoAnimationGetAttentionMinor = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer msoAnimationSearching = Integer.valueOf(13);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer msoAnimationPrinting = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer msoAnimationGestureRight = Integer.valueOf(19);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer msoAnimationWritingNotingSomething = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer msoAnimationWorkingAtSomething = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer msoAnimationThinking = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer msoAnimationSendingMail = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer msoAnimationListensToComputer = Integer.valueOf(26);

  /**
   * Value is 31 (0x1F)
   */
  public static final Integer msoAnimationDisappear = Integer.valueOf(31);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer msoAnimationAppear = Integer.valueOf(32);

  /**
   * Value is 100 (0x64)
   */
  public static final Integer msoAnimationGetArtsy = Integer.valueOf(100);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer msoAnimationGetTechy = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer msoAnimationGetWizardy = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer msoAnimationCheckingSomething = Integer.valueOf(103);

  /**
   * Value is 104 (0x68)
   */
  public static final Integer msoAnimationLookDown = Integer.valueOf(104);

  /**
   * Value is 105 (0x69)
   */
  public static final Integer msoAnimationLookDownLeft = Integer.valueOf(105);

  /**
   * Value is 106 (0x6A)
   */
  public static final Integer msoAnimationLookDownRight = Integer.valueOf(106);

  /**
   * Value is 107 (0x6B)
   */
  public static final Integer msoAnimationLookLeft = Integer.valueOf(107);

  /**
   * Value is 108 (0x6C)
   */
  public static final Integer msoAnimationLookRight = Integer.valueOf(108);

  /**
   * Value is 109 (0x6D)
   */
  public static final Integer msoAnimationLookUp = Integer.valueOf(109);

  /**
   * Value is 110 (0x6E)
   */
  public static final Integer msoAnimationLookUpLeft = Integer.valueOf(110);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer msoAnimationLookUpRight = Integer.valueOf(111);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer msoAnimationSaving = Integer.valueOf(112);

  /**
   * Value is 113 (0x71)
   */
  public static final Integer msoAnimationGestureDown = Integer.valueOf(113);

  /**
   * Value is 114 (0x72)
   */
  public static final Integer msoAnimationGestureLeft = Integer.valueOf(114);

  /**
   * Value is 115 (0x73)
   */
  public static final Integer msoAnimationGestureUp = Integer.valueOf(115);

  /**
   * Value is 116 (0x74)
   */
  public static final Integer msoAnimationEmptyTrash = Integer.valueOf(116);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("msoAnimationIdle", msoAnimationIdle);
    v.put("msoAnimationGreeting", msoAnimationGreeting);
    v.put("msoAnimationGoodbye", msoAnimationGoodbye);
    v.put("msoAnimationBeginSpeaking", msoAnimationBeginSpeaking);
    v.put("msoAnimationRestPose", msoAnimationRestPose);
    v.put("msoAnimationCharacterSuccessMajor", msoAnimationCharacterSuccessMajor);
    v.put("msoAnimationGetAttentionMajor", msoAnimationGetAttentionMajor);
    v.put("msoAnimationGetAttentionMinor", msoAnimationGetAttentionMinor);
    v.put("msoAnimationSearching", msoAnimationSearching);
    v.put("msoAnimationPrinting", msoAnimationPrinting);
    v.put("msoAnimationGestureRight", msoAnimationGestureRight);
    v.put("msoAnimationWritingNotingSomething", msoAnimationWritingNotingSomething);
    v.put("msoAnimationWorkingAtSomething", msoAnimationWorkingAtSomething);
    v.put("msoAnimationThinking", msoAnimationThinking);
    v.put("msoAnimationSendingMail", msoAnimationSendingMail);
    v.put("msoAnimationListensToComputer", msoAnimationListensToComputer);
    v.put("msoAnimationDisappear", msoAnimationDisappear);
    v.put("msoAnimationAppear", msoAnimationAppear);
    v.put("msoAnimationGetArtsy", msoAnimationGetArtsy);
    v.put("msoAnimationGetTechy", msoAnimationGetTechy);
    v.put("msoAnimationGetWizardy", msoAnimationGetWizardy);
    v.put("msoAnimationCheckingSomething", msoAnimationCheckingSomething);
    v.put("msoAnimationLookDown", msoAnimationLookDown);
    v.put("msoAnimationLookDownLeft", msoAnimationLookDownLeft);
    v.put("msoAnimationLookDownRight", msoAnimationLookDownRight);
    v.put("msoAnimationLookLeft", msoAnimationLookLeft);
    v.put("msoAnimationLookRight", msoAnimationLookRight);
    v.put("msoAnimationLookUp", msoAnimationLookUp);
    v.put("msoAnimationLookUpLeft", msoAnimationLookUpLeft);
    v.put("msoAnimationLookUpRight", msoAnimationLookUpRight);
    v.put("msoAnimationSaving", msoAnimationSaving);
    v.put("msoAnimationGestureDown", msoAnimationGestureDown);
    v.put("msoAnimationGestureLeft", msoAnimationGestureLeft);
    v.put("msoAnimationGestureUp", msoAnimationGestureUp);
    v.put("msoAnimationEmptyTrash", msoAnimationEmptyTrash);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
