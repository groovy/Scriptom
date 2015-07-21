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
import org.codehaus.groovy.scriptom.ActiveXObject;

/**
 * Interface constants for {@link ActiveXObject#toInterface} and {@link ActiveXObject#supportsInterface}.
 * @author Jason Smith
 */
public final class SpeechLib
{
  private SpeechLib()
  {
  }

  /**
   * CoClass: SpAudioFormat Class
   */
  public final static String SpAudioFormat = "{E6E9C590-3E18-40E3-8299-061F98BDE7C7}";

  /**
   * CoClass: SpCompressedLexicon Class
   */
  public final static String SpCompressedLexicon = "{DA41A7C2-5383-4DB2-916B-6C1719E3DB58}";

  /**
   * CoClass: SpCustomStream Class
   */
  public final static String SpCustomStream = "{1A9E9F4F-104F-4DB8-A115-EFD7FD0C97AE}";

  /**
   * CoClass: SpFileStream Class
   */
  public final static String SpFileStream = "{AF67F125-AB39-4E93-B4A2-CC2E66E182A7}";

  /**
   * CoClass: SpInProcRecoContext Class
   */
  public final static String SpInProcRecoContext = "{580AA49D-7E1E-4809-B8E2-57DA806104B8}";

  /**
   * CoClass: SpInprocRecognizer Class
   */
  public final static String SpInprocRecognizer = "{2D5F1C0C-BD75-4B08-9478-3B11FEA2586C}";

  /**
   * CoClass: SpLexicon Class
   */
  public final static String SpLexicon = "{3DA7627A-C7AE-4B23-8708-638C50362C25}";

  /**
   * CoClass: SpMMAudioEnum Class
   */
  public final static String SpMMAudioEnum = "{06B64F9E-7FDA-11D2-B4F2-00C04F797396}";

  /**
   * CoClass: SpMMAudioIn Class
   */
  public final static String SpMMAudioIn = "{3C76AF6D-1FD7-4831-81D1-3B71D5A13C44}";

  /**
   * CoClass: SpMMAudioOut Class
   */
  public final static String SpMMAudioOut = "{3C76AF6D-1FD7-4831-81D1-3B71D5A13C44}";

  /**
   * CoClass: SpMemoryStream Class
   */
  public final static String SpMemoryStream = "{EEB14B68-808B-4ABE-A5EA-B51DA7588008}";

  /**
   * CoClass: SpNotify
   */
  public final static String SpNotifyTranslator = "{ACA16614-5D3D-11D2-960E-00C04F8EE628}";

  /**
   * CoClass: SpNullPhoneConverter Class
   */
  public final static String SpNullPhoneConverter = "{8445C581-0CAC-4A38-ABFE-9B2CE2826455}";

  /**
   * CoClass: SpObjectToken Class
   */
  public final static String SpObjectToken = "{C74A3ADC-B727-4500-A84A-B526721C8B8C}";

  /**
   * CoClass: SpObjectTokenCategory Class
   */
  public final static String SpObjectTokenCategory = "{CA7EAC50-2D01-4145-86D4-5AE7D70F4469}";

  /**
   * CoClass: SpPhoneConverter Class
   */
  public final static String SpPhoneConverter = "{C3E4F353-433F-43D6-89A1-6A62A7054C3D}";

  /**
   * CoClass: SpPhraseInfoBuilder Class
   */
  public final static String SpPhraseInfoBuilder = "{3B151836-DF3A-4E0A-846C-D2ADC9334333}";

  /**
   * CoClass: SpRecPlayAudio Class
   */
  public final static String SpRecPlayAudio = "{5B559F40-E952-11D2-BB91-00C04F8EE6C0}";

  /**
   * CoClass: SpResourceManger
   */
  public final static String SpResourceManager = "{93384E18-5014-43D5-ADBB-A78E055926BD}";

  /**
   * CoClass: SpSharedRecoContext Class
   */
  public final static String SpSharedRecoContext = "{580AA49D-7E1E-4809-B8E2-57DA806104B8}";

  /**
   * CoClass: SpSharedRecognizer Class
   */
  public final static String SpSharedRecognizer = "{2D5F1C0C-BD75-4B08-9478-3B11FEA2586C}";

  /**
   * CoClass: SpStream Class
   */
  public final static String SpStream = "{12E3CCA9-7518-44C5-A5E7-BA5A79CB929E}";

  /**
   * CoClass: FormatConverter Class
   */
  public final static String SpStreamFormatConverter = "{678A932C-EA71-4446-9B41-78FDA6280A29}";

  /**
   * CoClass: SpTextSelectionInformation Class
   */
  public final static String SpTextSelectionInformation = "{3B9C7E7A-6EEE-4DED-9092-11657279ADBE}";

  /**
   * CoClass: SpUnCompressedLexicon Class
   */
  public final static String SpUnCompressedLexicon = "{3DA7627A-C7AE-4B23-8708-638C50362C25}";

  /**
   * CoClass: SpVoice Class
   */
  public final static String SpVoice = "{269316D8-57BD-11D2-9EEE-00C04F797396}";

  /**
   * CoClass: SpWaveFormatEx Class
   */
  public final static String SpWaveFormatEx = "{7A1EF0D5-1581-4741-88E4-209A49F11A10}";

  /**
   * A {@code Map} of CoClass names to default interface GUIDs for this type library.
   */
  public final static Map coClasses;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SpAudioFormat", SpAudioFormat);
    v.put("SpCompressedLexicon", SpCompressedLexicon);
    v.put("SpCustomStream", SpCustomStream);
    v.put("SpFileStream", SpFileStream);
    v.put("SpInProcRecoContext", SpInProcRecoContext);
    v.put("SpInprocRecognizer", SpInprocRecognizer);
    v.put("SpLexicon", SpLexicon);
    v.put("SpMMAudioEnum", SpMMAudioEnum);
    v.put("SpMMAudioIn", SpMMAudioIn);
    v.put("SpMMAudioOut", SpMMAudioOut);
    v.put("SpMemoryStream", SpMemoryStream);
    v.put("SpNotifyTranslator", SpNotifyTranslator);
    v.put("SpNullPhoneConverter", SpNullPhoneConverter);
    v.put("SpObjectToken", SpObjectToken);
    v.put("SpObjectTokenCategory", SpObjectTokenCategory);
    v.put("SpPhoneConverter", SpPhoneConverter);
    v.put("SpPhraseInfoBuilder", SpPhraseInfoBuilder);
    v.put("SpRecPlayAudio", SpRecPlayAudio);
    v.put("SpResourceManager", SpResourceManager);
    v.put("SpSharedRecoContext", SpSharedRecoContext);
    v.put("SpSharedRecognizer", SpSharedRecognizer);
    v.put("SpStream", SpStream);
    v.put("SpStreamFormatConverter", SpStreamFormatConverter);
    v.put("SpTextSelectionInformation", SpTextSelectionInformation);
    v.put("SpUnCompressedLexicon", SpUnCompressedLexicon);
    v.put("SpVoice", SpVoice);
    v.put("SpWaveFormatEx", SpWaveFormatEx);
    coClasses = Collections.synchronizedMap(Collections.unmodifiableMap(v));
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
   *   <li><b>SpAudioFormat</b> = SAPI.SpAudioFormat</li>
   *   <li><b>SpCompressedLexicon</b> = SAPI.SpCompressedLexicon</li>
   *   <li><b>SpCustomStream</b> = SAPI.SpCustomStream</li>
   *   <li><b>SpFileStream</b> = SAPI.SpFileStream</li>
   *   <li><b>SpInProcRecoContext</b> = SAPI.SpInProcRecoContext</li>
   *   <li><b>SpInprocRecognizer</b> = Sapi.SpInprocRecognizer</li>
   *   <li><b>SpLexicon</b> = SAPI.SpLexicon</li>
   *   <li><b>SpMMAudioEnum</b> = SAPI.SpMMAudioEnum</li>
   *   <li><b>SpMMAudioIn</b> = SAPI.SpMMAudioIn</li>
   *   <li><b>SpMMAudioOut</b> = SAPI.SpMMAudioOut</li>
   *   <li><b>SpMemoryStream</b> = SAPI.SpMemoryStream</li>
   *   <li><b>SpNotifyTranslator</b> = SAPI.SpNotifyTranslator</li>
   *   <li><b>SpNullPhoneConverter</b> = SAPI.SpNullPhoneConverter</li>
   *   <li><b>SpObjectToken</b> = SAPI.SpObjectToken</li>
   *   <li><b>SpObjectTokenCategory</b> = SAPI.SpObjectTokenCategory</li>
   *   <li><b>SpPhoneConverter</b> = SAPI.SpPhoneConverter</li>
   *   <li><b>SpPhraseInfoBuilder</b> = SAPI.SpPhraseInfoBuilder</li>
   *   <li><b>SpRecPlayAudio</b> = SAPI.SpRecPlayAudio</li>
   *   <li><b>SpResourceManager</b> = SAPI.SpResourceManager</li>
   *   <li><b>SpSharedRecoContext</b> = SAPI.SpSharedRecoContext</li>
   *   <li><b>SpSharedRecognizer</b> = Sapi.SpSharedRecognizer</li>
   *   <li><b>SpStream</b> = SAPI.SpStream</li>
   *   <li><b>SpStreamFormatConverter</b> = SAPI.SpStreamFormatConverter</li>
   *   <li><b>SpTextSelectionInformation</b> = SAPI.SpTextSelectionInformation</li>
   *   <li><b>SpUnCompressedLexicon</b> = SAPI.SpUncompressedLexicon</li>
   *   <li><b>SpVoice</b> = SAPI.SpVoice</li>
   *   <li><b>SpWaveFormatEx</b> = SAPI.SpWaveFormatEx</li>
   * </ul>
   */
  public final static Map progIds;
  static
  {
    TreeMap v = new TreeMap();
    v.put("SpAudioFormat", "SAPI.SpAudioFormat");
    v.put("SpCompressedLexicon", "SAPI.SpCompressedLexicon");
    v.put("SpCustomStream", "SAPI.SpCustomStream");
    v.put("SpFileStream", "SAPI.SpFileStream");
    v.put("SpInProcRecoContext", "SAPI.SpInProcRecoContext");
    v.put("SpInprocRecognizer", "Sapi.SpInprocRecognizer");
    v.put("SpLexicon", "SAPI.SpLexicon");
    v.put("SpMMAudioEnum", "SAPI.SpMMAudioEnum");
    v.put("SpMMAudioIn", "SAPI.SpMMAudioIn");
    v.put("SpMMAudioOut", "SAPI.SpMMAudioOut");
    v.put("SpMemoryStream", "SAPI.SpMemoryStream");
    v.put("SpNotifyTranslator", "SAPI.SpNotifyTranslator");
    v.put("SpNullPhoneConverter", "SAPI.SpNullPhoneConverter");
    v.put("SpObjectToken", "SAPI.SpObjectToken");
    v.put("SpObjectTokenCategory", "SAPI.SpObjectTokenCategory");
    v.put("SpPhoneConverter", "SAPI.SpPhoneConverter");
    v.put("SpPhraseInfoBuilder", "SAPI.SpPhraseInfoBuilder");
    v.put("SpRecPlayAudio", "SAPI.SpRecPlayAudio");
    v.put("SpResourceManager", "SAPI.SpResourceManager");
    v.put("SpSharedRecoContext", "SAPI.SpSharedRecoContext");
    v.put("SpSharedRecognizer", "Sapi.SpSharedRecognizer");
    v.put("SpStream", "SAPI.SpStream");
    v.put("SpStreamFormatConverter", "SAPI.SpStreamFormatConverter");
    v.put("SpTextSelectionInformation", "SAPI.SpTextSelectionInformation");
    v.put("SpUnCompressedLexicon", "SAPI.SpUncompressedLexicon");
    v.put("SpVoice", "SAPI.SpVoice");
    v.put("SpWaveFormatEx", "SAPI.SpWaveFormatEx");
    progIds = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }

  /**
   * Interface: IEnumSpObjectTokens Interface
   */
  public final static String IEnumSpObjectTokens = "{06B64F9E-7FDA-11D2-B4F2-00C04F797396}";

  /**
   * Interface: ISequentialStream
   */
  public final static String ISequentialStream = "{0C733A30-2A1C-11CE-ADE5-00AA0044773D}";

  /**
   * Interface: IServiceProvider
   */
  public final static String IServiceProvider = "{6D5140C1-7436-11CE-8034-00AA006009FA}";

  /**
   * Interface: ISpAudio Interface
   */
  public final static String ISpAudio = "{C05C768F-FAE8-4EC2-8E07-338321C12452}";

  /**
   * Interface: ISpDataKey Interface
   */
  public final static String ISpDataKey = "{14056581-E16C-11D2-BB90-00C04F8EE6C0}";

  /**
   * Interface: ISpEventSink Interface
   */
  public final static String ISpEventSink = "{BE7A9CC9-5F9E-11D2-960F-00C04F8EE628}";

  /**
   * Interface: ISpEventSource Interface
   */
  public final static String ISpEventSource = "{BE7A9CCE-5F9E-11D2-960F-00C04F8EE628}";

  /**
   * Interface: ISpGrammarBuilder Interface
   */
  public final static String ISpGrammarBuilder = "{8137828F-591A-4A42-BE58-49EA7EBAAC68}";

  /**
   * Interface: ISpLexicon Interface
   */
  public final static String ISpLexicon = "{DA41A7C2-5383-4DB2-916B-6C1719E3DB58}";

  /**
   * Interface: ISpMMSysAudio Interface
   */
  public final static String ISpMMSysAudio = "{15806F6E-1D70-4B48-98E6-3B1A007509AB}";

  /**
   * Interface: ISpNotifySink Interface
   */
  public final static String ISpNotifySink = "{259684DC-37C3-11D2-9603-00C04F8EE628}";

  /**
   * Interface: ISpNotifySource Interface
   */
  public final static String ISpNotifySource = "{5EFF4AEF-8487-11D2-961C-00C04F8EE628}";

  /**
   * Interface: ISpNotifyTranslator Interface
   */
  public final static String ISpNotifyTranslator = "{ACA16614-5D3D-11D2-960E-00C04F8EE628}";

  /**
   * Interface: ISpObjectToken Interface
   */
  public final static String ISpObjectToken = "{14056589-E16C-11D2-BB90-00C04F8EE6C0}";

  /**
   * Interface: ISpObjectTokenCategory
   */
  public final static String ISpObjectTokenCategory = "{2D3D3845-39AF-4850-BBF9-40B49780011D}";

  /**
   * Interface: ISpObjectWithToken Interface
   */
  public final static String ISpObjectWithToken = "{5B559F40-E952-11D2-BB91-00C04F8EE6C0}";

  /**
   * Interface: ISpPhoneConverter Interface
   */
  public final static String ISpPhoneConverter = "{8445C581-0CAC-4A38-ABFE-9B2CE2826455}";

  /**
   * Interface: ISpPhrase Interface
   */
  public final static String ISpPhrase = "{1A5C0354-B621-4B5A-8791-D306ED379E53}";

  /**
   * Interface: ISpPhraseAlt Interface
   */
  public final static String ISpPhraseAlt = "{8FCEBC98-4E49-4067-9C6C-D86A0E092E3D}";

  /**
   * Interface: ISpProperties Interface
   */
  public final static String ISpProperties = "{5B4FB971-B115-4DE1-AD97-E482E3BF6EE4}";

  /**
   * Interface: ISpRecoContext Interface
   */
  public final static String ISpRecoContext = "{F740A62F-7C15-489E-8234-940A33D9272D}";

  /**
   * Interface: ISpRecoGrammar Interface
   */
  public final static String ISpRecoGrammar = "{2177DB29-7F45-47D0-8554-067E91C80502}";

  /**
   * Interface: ISpRecoResult Interface
   */
  public final static String ISpRecoResult = "{20B053BE-E235-43CD-9A2A-8D17A48B7842}";

  /**
   * Interface: ISpRecognizer Interface
   */
  public final static String ISpRecognizer = "{C2B5F241-DAA0-4507-9E16-5A1EAA2B7A5C}";

  /**
   * Interface: ISpResourceManager Interface
   */
  public final static String ISpResourceManager = "{93384E18-5014-43D5-ADBB-A78E055926BD}";

  /**
   * Interface: ISpStream Interface
   */
  public final static String ISpStream = "{12E3CCA9-7518-44C5-A5E7-BA5A79CB929E}";

  /**
   * Interface: ISpStreamFormat Interface
   */
  public final static String ISpStreamFormat = "{BED530BE-2606-4F4D-A1C0-54C5CDA5566F}";

  /**
   * Interface: ISpStreamFormatConverter Interface
   */
  public final static String ISpStreamFormatConverter = "{678A932C-EA71-4446-9B41-78FDA6280A29}";

  /**
   * Interface: ISpVoice Interface
   */
  public final static String ISpVoice = "{6C44DF74-72B9-4992-A1EC-EF996E0422D4}";

  /**
   * Interface: ISpeechAudio Interface
   */
  public final static String ISpeechAudio = "{CFF8E175-019E-11D3-A08E-00C04F8EF9B5}";

  /**
   * Interface: ISpeechAudioBufferInfo Interface
   */
  public final static String ISpeechAudioBufferInfo = "{11B103D8-1142-4EDF-A093-82FB3915F8CC}";

  /**
   * Interface: ISpeechAudioFormat Interface
   */
  public final static String ISpeechAudioFormat = "{E6E9C590-3E18-40E3-8299-061F98BDE7C7}";

  /**
   * Interface: ISpeechAudioStatus Interface
   */
  public final static String ISpeechAudioStatus = "{C62D9C91-7458-47F6-862D-1EF86FB0B278}";

  /**
   * Interface: ISpeechBaseStream Interface
   */
  public final static String ISpeechBaseStream = "{6450336F-7D49-4CED-8097-49D6DEE37294}";

  /**
   * Interface: ISpeechCustomStream Interface
   */
  public final static String ISpeechCustomStream = "{1A9E9F4F-104F-4DB8-A115-EFD7FD0C97AE}";

  /**
   * Interface: ISpeechDataKey Interface
   */
  public final static String ISpeechDataKey = "{CE17C09B-4EFA-44D5-A4C9-59D9585AB0CD}";

  /**
   * Interface: ISpeechFileStream Interface
   */
  public final static String ISpeechFileStream = "{AF67F125-AB39-4E93-B4A2-CC2E66E182A7}";

  /**
   * Interface: ISpeechGrammarRule Interface
   */
  public final static String ISpeechGrammarRule = "{AFE719CF-5DD1-44F2-999C-7A399F1CFCCC}";

  /**
   * Interface: ISpeechGrammarRuleState Interface
   */
  public final static String ISpeechGrammarRuleState = "{D4286F2C-EE67-45AE-B928-28D695362EDA}";

  /**
   * Interface: ISpeechGrammarRuleStateTransition Interface
   */
  public final static String ISpeechGrammarRuleStateTransition = "{CAFD1DB1-41D1-4A06-9863-E2E81DA17A9A}";

  /**
   * Interface: ISpeechGrammarRuleStateTransitions Interface
   */
  public final static String ISpeechGrammarRuleStateTransitions = "{EABCE657-75BC-44A2-AA7F-C56476742963}";

  /**
   * Interface: ISpeechGrammarRules Interface
   */
  public final static String ISpeechGrammarRules = "{6FFA3B44-FC2D-40D1-8AFC-32911C7F1AD1}";

  /**
   * Interface: ISpeechLexicon Interface
   */
  public final static String ISpeechLexicon = "{3DA7627A-C7AE-4B23-8708-638C50362C25}";

  /**
   * Interface: ISpeechLexiconPronunciation Interface
   */
  public final static String ISpeechLexiconPronunciation = "{95252C5D-9E43-4F4A-9899-48EE73352F9F}";

  /**
   * Interface: ISpeechLexiconPronunciations Interface
   */
  public final static String ISpeechLexiconPronunciations = "{72829128-5682-4704-A0D4-3E2BB6F2EAD3}";

  /**
   * Interface: ISpeechLexiconWord Interface
   */
  public final static String ISpeechLexiconWord = "{4E5B933C-C9BE-48ED-8842-1EE51BB1D4FF}";

  /**
   * Interface: ISpeechLexiconWords Interface
   */
  public final static String ISpeechLexiconWords = "{8D199862-415E-47D5-AC4F-FAA608B424E6}";

  /**
   * Interface: ISpeechMMSysAudio Interface
   */
  public final static String ISpeechMMSysAudio = "{3C76AF6D-1FD7-4831-81D1-3B71D5A13C44}";

  /**
   * Interface: ISpeechMemoryStream Interface
   */
  public final static String ISpeechMemoryStream = "{EEB14B68-808B-4ABE-A5EA-B51DA7588008}";

  /**
   * Interface: ISpeechObjectToken Interface
   */
  public final static String ISpeechObjectToken = "{C74A3ADC-B727-4500-A84A-B526721C8B8C}";

  /**
   * Interface: ISpeechObjectTokenCategory Interface
   */
  public final static String ISpeechObjectTokenCategory = "{CA7EAC50-2D01-4145-86D4-5AE7D70F4469}";

  /**
   * Interface: ISpeechObjectTokens Interface
   */
  public final static String ISpeechObjectTokens = "{9285B776-2E7B-4BC0-B53E-580EB6FA967F}";

  /**
   * Interface: ISpeechPhoneConverter Interface
   */
  public final static String ISpeechPhoneConverter = "{C3E4F353-433F-43D6-89A1-6A62A7054C3D}";

  /**
   * Interface: ISpeechPhraseAlternate Interface
   */
  public final static String ISpeechPhraseAlternate = "{27864A2A-2B9F-4CB8-92D3-0D2722FD1E73}";

  /**
   * Interface: ISpeechPhraseAlternates Interface
   */
  public final static String ISpeechPhraseAlternates = "{B238B6D5-F276-4C3D-A6C1-2974801C3CC2}";

  /**
   * Interface: ISpeechPhraseElement Interface
   */
  public final static String ISpeechPhraseElement = "{E6176F96-E373-4801-B223-3B62C068C0B4}";

  /**
   * Interface: ISpeechPhraseElements Interface
   */
  public final static String ISpeechPhraseElements = "{0626B328-3478-467D-A0B3-D0853B93DDA3}";

  /**
   * Interface: ISpeechPhraseInfo Interface
   */
  public final static String ISpeechPhraseInfo = "{961559CF-4E67-4662-8BF0-D93F1FCD61B3}";

  /**
   * Interface: ISpeechPhraseInfoBuilder Interface
   */
  public final static String ISpeechPhraseInfoBuilder = "{3B151836-DF3A-4E0A-846C-D2ADC9334333}";

  /**
   * Interface: ISpeechPhraseProperties Interface
   */
  public final static String ISpeechPhraseProperties = "{08166B47-102E-4B23-A599-BDB98DBFD1F4}";

  /**
   * Interface: ISpeechPhraseProperty Interface
   */
  public final static String ISpeechPhraseProperty = "{CE563D48-961E-4732-A2E1-378A42B430BE}";

  /**
   * Interface: ISpeechPhraseReplacement Interface
   */
  public final static String ISpeechPhraseReplacement = "{2890A410-53A7-4FB5-94EC-06D4998E3D02}";

  /**
   * Interface: ISpeechPhraseReplacements Interface
   */
  public final static String ISpeechPhraseReplacements = "{38BC662F-2257-4525-959E-2069D2596C05}";

  /**
   * Interface: ISpeechPhraseRule Interface
   */
  public final static String ISpeechPhraseRule = "{A7BFE112-A4A0-48D9-B602-C313843F6964}";

  /**
   * Interface: ISpeechPhraseRules Interface
   */
  public final static String ISpeechPhraseRules = "{9047D593-01DD-4B72-81A3-E4A0CA69F407}";

  /**
   * Interface: ISpeechRecoContext Interface
   */
  public final static String ISpeechRecoContext = "{580AA49D-7E1E-4809-B8E2-57DA806104B8}";

  /**
   * Interface: ISpeechRecoGrammar Interface
   */
  public final static String ISpeechRecoGrammar = "{B6D6F79F-2158-4E50-B5BC-9A9CCD852A09}";

  /**
   * Interface: ISpeechRecoResult Interface
   */
  public final static String ISpeechRecoResult = "{ED2879CF-CED9-4EE6-A534-DE0191D5468D}";

  /**
   * Interface: ISpeechRecoResultTimes Interface
   */
  public final static String ISpeechRecoResultTimes = "{62B3B8FB-F6E7-41BE-BDCB-056B1C29EFC0}";

  /**
   * Interface: ISpeechRecognizer Interface
   */
  public final static String ISpeechRecognizer = "{2D5F1C0C-BD75-4B08-9478-3B11FEA2586C}";

  /**
   * Interface: ISpeechRecognizerStatus Interface
   */
  public final static String ISpeechRecognizerStatus = "{BFF9E781-53EC-484E-BB8A-0E1B5551E35C}";

  /**
   * Interface: ISpeechTextSelectionInformation Interface
   */
  public final static String ISpeechTextSelectionInformation = "{3B9C7E7A-6EEE-4DED-9092-11657279ADBE}";

  /**
   * Interface: ISpeechVoice Interface
   */
  public final static String ISpeechVoice = "{269316D8-57BD-11D2-9EEE-00C04F797396}";

  /**
   * Interface: ISpeechVoiceStatus Interface
   */
  public final static String ISpeechVoiceStatus = "{8BE47B07-57F6-11D2-9EEE-00C04F797396}";

  /**
   * Interface: ISpeechWaveFormatEx Interface
   */
  public final static String ISpeechWaveFormatEx = "{7A1EF0D5-1581-4741-88E4-209A49F11A10}";

  /**
   * Interface: IStream
   */
  public final static String IStream = "{0000000C-0000-0000-C000-000000000046}";

  /**
   * Interface: _ISpeechRecoContextEvents
   */
  public final static String _ISpeechRecoContextEvents = "{7B8FCB42-0E9D-4F00-A048-7B04D6179D3D}";

  /**
   * Interface: _ISpeechVoiceEvents
   */
  public final static String _ISpeechVoiceEvents = "{A372ACD1-3BEF-4BBD-8FFB-CB3E2B416AF8}";

  /**
   * A {@code Map} of interface names to GUIDs for this type library.
   */
  public final static Map interfaces;
  static
  {
    TreeMap v = new TreeMap();
    v.put("IEnumSpObjectTokens", IEnumSpObjectTokens);
    v.put("ISequentialStream", ISequentialStream);
    v.put("IServiceProvider", IServiceProvider);
    v.put("ISpAudio", ISpAudio);
    v.put("ISpDataKey", ISpDataKey);
    v.put("ISpEventSink", ISpEventSink);
    v.put("ISpEventSource", ISpEventSource);
    v.put("ISpGrammarBuilder", ISpGrammarBuilder);
    v.put("ISpLexicon", ISpLexicon);
    v.put("ISpMMSysAudio", ISpMMSysAudio);
    v.put("ISpNotifySink", ISpNotifySink);
    v.put("ISpNotifySource", ISpNotifySource);
    v.put("ISpNotifyTranslator", ISpNotifyTranslator);
    v.put("ISpObjectToken", ISpObjectToken);
    v.put("ISpObjectTokenCategory", ISpObjectTokenCategory);
    v.put("ISpObjectWithToken", ISpObjectWithToken);
    v.put("ISpPhoneConverter", ISpPhoneConverter);
    v.put("ISpPhrase", ISpPhrase);
    v.put("ISpPhraseAlt", ISpPhraseAlt);
    v.put("ISpProperties", ISpProperties);
    v.put("ISpRecoContext", ISpRecoContext);
    v.put("ISpRecoGrammar", ISpRecoGrammar);
    v.put("ISpRecoResult", ISpRecoResult);
    v.put("ISpRecognizer", ISpRecognizer);
    v.put("ISpResourceManager", ISpResourceManager);
    v.put("ISpStream", ISpStream);
    v.put("ISpStreamFormat", ISpStreamFormat);
    v.put("ISpStreamFormatConverter", ISpStreamFormatConverter);
    v.put("ISpVoice", ISpVoice);
    v.put("ISpeechAudio", ISpeechAudio);
    v.put("ISpeechAudioBufferInfo", ISpeechAudioBufferInfo);
    v.put("ISpeechAudioFormat", ISpeechAudioFormat);
    v.put("ISpeechAudioStatus", ISpeechAudioStatus);
    v.put("ISpeechBaseStream", ISpeechBaseStream);
    v.put("ISpeechCustomStream", ISpeechCustomStream);
    v.put("ISpeechDataKey", ISpeechDataKey);
    v.put("ISpeechFileStream", ISpeechFileStream);
    v.put("ISpeechGrammarRule", ISpeechGrammarRule);
    v.put("ISpeechGrammarRuleState", ISpeechGrammarRuleState);
    v.put("ISpeechGrammarRuleStateTransition", ISpeechGrammarRuleStateTransition);
    v.put("ISpeechGrammarRuleStateTransitions", ISpeechGrammarRuleStateTransitions);
    v.put("ISpeechGrammarRules", ISpeechGrammarRules);
    v.put("ISpeechLexicon", ISpeechLexicon);
    v.put("ISpeechLexiconPronunciation", ISpeechLexiconPronunciation);
    v.put("ISpeechLexiconPronunciations", ISpeechLexiconPronunciations);
    v.put("ISpeechLexiconWord", ISpeechLexiconWord);
    v.put("ISpeechLexiconWords", ISpeechLexiconWords);
    v.put("ISpeechMMSysAudio", ISpeechMMSysAudio);
    v.put("ISpeechMemoryStream", ISpeechMemoryStream);
    v.put("ISpeechObjectToken", ISpeechObjectToken);
    v.put("ISpeechObjectTokenCategory", ISpeechObjectTokenCategory);
    v.put("ISpeechObjectTokens", ISpeechObjectTokens);
    v.put("ISpeechPhoneConverter", ISpeechPhoneConverter);
    v.put("ISpeechPhraseAlternate", ISpeechPhraseAlternate);
    v.put("ISpeechPhraseAlternates", ISpeechPhraseAlternates);
    v.put("ISpeechPhraseElement", ISpeechPhraseElement);
    v.put("ISpeechPhraseElements", ISpeechPhraseElements);
    v.put("ISpeechPhraseInfo", ISpeechPhraseInfo);
    v.put("ISpeechPhraseInfoBuilder", ISpeechPhraseInfoBuilder);
    v.put("ISpeechPhraseProperties", ISpeechPhraseProperties);
    v.put("ISpeechPhraseProperty", ISpeechPhraseProperty);
    v.put("ISpeechPhraseReplacement", ISpeechPhraseReplacement);
    v.put("ISpeechPhraseReplacements", ISpeechPhraseReplacements);
    v.put("ISpeechPhraseRule", ISpeechPhraseRule);
    v.put("ISpeechPhraseRules", ISpeechPhraseRules);
    v.put("ISpeechRecoContext", ISpeechRecoContext);
    v.put("ISpeechRecoGrammar", ISpeechRecoGrammar);
    v.put("ISpeechRecoResult", ISpeechRecoResult);
    v.put("ISpeechRecoResultTimes", ISpeechRecoResultTimes);
    v.put("ISpeechRecognizer", ISpeechRecognizer);
    v.put("ISpeechRecognizerStatus", ISpeechRecognizerStatus);
    v.put("ISpeechTextSelectionInformation", ISpeechTextSelectionInformation);
    v.put("ISpeechVoice", ISpeechVoice);
    v.put("ISpeechVoiceStatus", ISpeechVoiceStatus);
    v.put("ISpeechWaveFormatEx", ISpeechWaveFormatEx);
    v.put("IStream", IStream);
    v.put("_ISpeechRecoContextEvents", _ISpeechRecoContextEvents);
    v.put("_ISpeechVoiceEvents", _ISpeechVoiceEvents);
    interfaces = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
