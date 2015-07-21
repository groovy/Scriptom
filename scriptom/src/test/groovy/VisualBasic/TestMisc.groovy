package org.codehaus.groovy.modules.scriptom.test

import groovy.util.GroovyTestCase
import org.codehaus.groovy.scriptom.*

/**
 * Various, uncategorized unit tests.
 * @author Jason Smith
 */
class TestMisc extends BaseJacobTest
{	 
	/**
	 * Tests Scriptom by calling the MS Speech API.
	 */
	void testSpeech()
	{
		Scriptom.inApartment
		{
		  def voice = new ActiveXObject('SAPI.SpVoice')
		  voice.speak "Testing, one... two... three..."
		}
	}
	
	/**
	 * Tests that the ActiveX Object supports one of the known interfaces.  This verifies that
	 * {@link ActiveXObject#supportsInterface} is working correctly.
	 * You can use import org.codehaus.groovy.scriptom.tlb.sapi.SpeechLib to find all the interface
	 * definitions for MS SAPI.  That library is a downstream dependency of Scriptom, so we can't use
	 * the library here.  Check out the SpeechInterfaces.groovy script in the Scriptom examples to
	 * find all the interfaces this object supports.
	 */
	void testSpeechObjectSupportsExpectedInterface()
	{
		Scriptom.inApartment
		{
		  def voice = new ActiveXObject('SAPI.SpVoice')
		  assert voice.supportsInterface('{6C44DF74-72B9-4992-A1EC-EF996E0422D4}'), "Object does not support SpeechLib.ISpVoice interface."
		}
	}
}
