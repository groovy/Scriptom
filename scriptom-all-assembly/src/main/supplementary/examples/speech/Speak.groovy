import org.codehaus.groovy.scriptom.*
import org.codehaus.groovy.scriptom.tlb.sapi.SpeechVoiceSpeakFlags;
import org.codehaus.groovy.scriptom.tlb.sapi.SpeechRunState;
import org.codehaus.groovy.scriptom.tlb.sapi.SpeechLib;
import org.codehaus.groovy.scriptom.tlb.sapi.SpeechVoiceEvents;

//Definitive proof that you CAN talk and chew gum at the same time.

//System.setProperty("org.codehaus.groovy.scriptom.debug", "true")

Scriptom.inApartment
{
  def voice = new ActiveXObject('SAPI.SpVoice')
  
  voice.speak 'GROOVY and SCRIPT um make com automation simple, fun, and groovy, man!', SpeechVoiceSpeakFlags.SVSFlagsAsync
  while(voice.Status.RunningState != SpeechRunState.SRSEDone)
  {
    println 'Chew gum...'
    sleep 1000
  }
  println 'Speaker is done.'
}