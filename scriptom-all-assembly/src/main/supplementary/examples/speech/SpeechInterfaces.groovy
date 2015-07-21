import org.codehaus.groovy.scriptom.*;
import org.codehaus.groovy.scriptom.tlb.sapi.SpeechLib;

Scriptom.inApartment
{
  def voice = new ActiveXObject('SAPI.SpVoice')
  SpeechLib.interfaces.each {name, iid -> if(voice.supportsInterface(iid)) println "SpeechLib.$name - $iid"}
}