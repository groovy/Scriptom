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
public final class SpeechStringConstants
{
  private SpeechStringConstants()
  {
  }

  /**
   * Value is HKEY_CURRENT_USER\SOFTWARE\Microsoft\Speech 
   */
  public static final String SpeechRegistryUserRoot = "HKEY_CURRENT_USER\\SOFTWARE\\Microsoft\\Speech";

  /**
   * Value is HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Speech 
   */
  public static final String SpeechRegistryLocalMachineRoot = "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Speech";

  /**
   * Value is HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Speech\AudioOutput 
   */
  public static final String SpeechCategoryAudioOut = "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Speech\\AudioOutput";

  /**
   * Value is HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Speech\AudioInput 
   */
  public static final String SpeechCategoryAudioIn = "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Speech\\AudioInput";

  /**
   * Value is HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Speech\Voices 
   */
  public static final String SpeechCategoryVoices = "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Speech\\Voices";

  /**
   * Value is HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Speech\Recognizers 
   */
  public static final String SpeechCategoryRecognizers = "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Speech\\Recognizers";

  /**
   * Value is HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Speech\AppLexicons 
   */
  public static final String SpeechCategoryAppLexicons = "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Speech\\AppLexicons";

  /**
   * Value is HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Speech\PhoneConverters 
   */
  public static final String SpeechCategoryPhoneConverters = "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Speech\\PhoneConverters";

  /**
   * Value is HKEY_CURRENT_USER\SOFTWARE\Microsoft\Speech\RecoProfiles 
   */
  public static final String SpeechCategoryRecoProfiles = "HKEY_CURRENT_USER\\SOFTWARE\\Microsoft\\Speech\\RecoProfiles";

  /**
   * Value is HKEY_CURRENT_USER\SOFTWARE\Microsoft\Speech\CurrentUserLexicon 
   */
  public static final String SpeechTokenIdUserLexicon = "HKEY_CURRENT_USER\\SOFTWARE\\Microsoft\\Speech\\CurrentUserLexicon";

  /**
   * Value is CLSID 
   */
  public static final String SpeechTokenValueCLSID = "CLSID";

  /**
   * Value is Files 
   */
  public static final String SpeechTokenKeyFiles = "Files";

  /**
   * Value is UI 
   */
  public static final String SpeechTokenKeyUI = "UI";

  /**
   * Value is Attributes 
   */
  public static final String SpeechTokenKeyAttributes = "Attributes";

  /**
   * Value is DefaultTTSRate 
   */
  public static final String SpeechVoiceCategoryTTSRate = "DefaultTTSRate";

  /**
   * Value is ResourceUsage 
   */
  public static final String SpeechPropertyResourceUsage = "ResourceUsage";

  /**
   * Value is HighConfidenceThreshold 
   */
  public static final String SpeechPropertyHighConfidenceThreshold = "HighConfidenceThreshold";

  /**
   * Value is NormalConfidenceThreshold 
   */
  public static final String SpeechPropertyNormalConfidenceThreshold = "NormalConfidenceThreshold";

  /**
   * Value is LowConfidenceThreshold 
   */
  public static final String SpeechPropertyLowConfidenceThreshold = "LowConfidenceThreshold";

  /**
   * Value is ResponseSpeed 
   */
  public static final String SpeechPropertyResponseSpeed = "ResponseSpeed";

  /**
   * Value is ComplexResponseSpeed 
   */
  public static final String SpeechPropertyComplexResponseSpeed = "ComplexResponseSpeed";

  /**
   * Value is AdaptationOn 
   */
  public static final String SpeechPropertyAdaptationOn = "AdaptationOn";

  /**
   * Value is Spelling 
   */
  public static final String SpeechDictationTopicSpelling = "Spelling";

  /**
   * Value is ... 
   */
  public static final String SpeechGrammarTagWildcard = "...";

  /**
   * Value is * 
   */
  public static final String SpeechGrammarTagDictation = "*";

  /**
   * Value is *+ 
   */
  public static final String SpeechGrammarTagUnlimitedDictation = "*+";

  /**
   * Value is EngineProperties 
   */
  public static final String SpeechEngineProperties = "EngineProperties";

  /**
   * Value is AddRemoveWord 
   */
  public static final String SpeechAddRemoveWord = "AddRemoveWord";

  /**
   * Value is UserTraining 
   */
  public static final String SpeechUserTraining = "UserTraining";

  /**
   * Value is MicTraining 
   */
  public static final String SpeechMicTraining = "MicTraining";

  /**
   * Value is RecoProfileProperties 
   */
  public static final String SpeechRecoProfileProperties = "RecoProfileProperties";

  /**
   * Value is AudioProperties 
   */
  public static final String SpeechAudioProperties = "AudioProperties";

  /**
   * Value is AudioVolume 
   */
  public static final String SpeechAudioVolume = "AudioVolume";

  /**
   * Value is Sentence 
   */
  public static final String SpeechVoiceSkipTypeSentence = "Sentence";

  /**
   * Value is {C31ADBAE-527F-4ff5-A230-F62BB61FF70C} 
   */
  public static final String SpeechAudioFormatGUIDWave = "{C31ADBAE-527F-4ff5-A230-F62BB61FF70C}";

  /**
   * Value is {7CEEF9F9-3D13-11d2-9EE7-00C04F797396} 
   */
  public static final String SpeechAudioFormatGUIDText = "{7CEEF9F9-3D13-11d2-9EE7-00C04F797396}";

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SpeechRegistryUserRoot", SpeechRegistryUserRoot);
    v.put("SpeechRegistryLocalMachineRoot", SpeechRegistryLocalMachineRoot);
    v.put("SpeechCategoryAudioOut", SpeechCategoryAudioOut);
    v.put("SpeechCategoryAudioIn", SpeechCategoryAudioIn);
    v.put("SpeechCategoryVoices", SpeechCategoryVoices);
    v.put("SpeechCategoryRecognizers", SpeechCategoryRecognizers);
    v.put("SpeechCategoryAppLexicons", SpeechCategoryAppLexicons);
    v.put("SpeechCategoryPhoneConverters", SpeechCategoryPhoneConverters);
    v.put("SpeechCategoryRecoProfiles", SpeechCategoryRecoProfiles);
    v.put("SpeechTokenIdUserLexicon", SpeechTokenIdUserLexicon);
    v.put("SpeechTokenValueCLSID", SpeechTokenValueCLSID);
    v.put("SpeechTokenKeyFiles", SpeechTokenKeyFiles);
    v.put("SpeechTokenKeyUI", SpeechTokenKeyUI);
    v.put("SpeechTokenKeyAttributes", SpeechTokenKeyAttributes);
    v.put("SpeechVoiceCategoryTTSRate", SpeechVoiceCategoryTTSRate);
    v.put("SpeechPropertyResourceUsage", SpeechPropertyResourceUsage);
    v.put("SpeechPropertyHighConfidenceThreshold", SpeechPropertyHighConfidenceThreshold);
    v.put("SpeechPropertyNormalConfidenceThreshold", SpeechPropertyNormalConfidenceThreshold);
    v.put("SpeechPropertyLowConfidenceThreshold", SpeechPropertyLowConfidenceThreshold);
    v.put("SpeechPropertyResponseSpeed", SpeechPropertyResponseSpeed);
    v.put("SpeechPropertyComplexResponseSpeed", SpeechPropertyComplexResponseSpeed);
    v.put("SpeechPropertyAdaptationOn", SpeechPropertyAdaptationOn);
    v.put("SpeechDictationTopicSpelling", SpeechDictationTopicSpelling);
    v.put("SpeechGrammarTagWildcard", SpeechGrammarTagWildcard);
    v.put("SpeechGrammarTagDictation", SpeechGrammarTagDictation);
    v.put("SpeechGrammarTagUnlimitedDictation", SpeechGrammarTagUnlimitedDictation);
    v.put("SpeechEngineProperties", SpeechEngineProperties);
    v.put("SpeechAddRemoveWord", SpeechAddRemoveWord);
    v.put("SpeechUserTraining", SpeechUserTraining);
    v.put("SpeechMicTraining", SpeechMicTraining);
    v.put("SpeechRecoProfileProperties", SpeechRecoProfileProperties);
    v.put("SpeechAudioProperties", SpeechAudioProperties);
    v.put("SpeechAudioVolume", SpeechAudioVolume);
    v.put("SpeechVoiceSkipTypeSentence", SpeechVoiceSkipTypeSentence);
    v.put("SpeechAudioFormatGUIDWave", SpeechAudioFormatGUIDWave);
    v.put("SpeechAudioFormatGUIDText", SpeechAudioFormatGUIDText);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
