package org.codehaus.groovy.modules.scriptom.test

import groovy.util.GroovyTestCase
import org.codehaus.groovy.scriptom.*
import com.jacob.com.*

/**
 * Verify and define the behavior of objects with multiple interfaces.
 */
public class TestMultipleInterfacesCS extends BaseJacobTest
{
	/**
	 * Verify that the object behaves like interface one by default.
	 */
	public void testDefaultInterface()
	{
		Scriptom.inApartment()
		{
			def clazz = new ActiveXObject("ScriptomTestCSharp.ClassWithTwoInterfaces")
			assert clazz.IAmNumberOne == 1
			shouldFail ComFailException, {clazz.IAmNumberTwo}
		}
	}
	
	/**
	 * Cast to second interface and verify it behaves like that type of an object.
	 */
	public void testSecondaryInterface()
	{
		Scriptom.inApartment()
		{
			def clazz = new ActiveXObject("ScriptomTestCSharp.ClassWithTwoInterfaces")
			assert clazz.supportsInterface("{3e8aa2b0-a2aa-4512-848b-f72f51a4dc25}")
			clazz = clazz.toInterface("{3e8aa2b0-a2aa-4512-848b-f72f51a4dc25}")
			assert clazz.IAmNumberTwo == 2
			shouldFail ComFailException, {clazz.IAmNumberOne}
		}
	}
	
	/**
	 * Shows the behavior of multiple interfaces in COM objects.  I can pass a COM
	 * object as an argument, and the receiver (C# side)will automatically pick the correct
	 * interface.  However, I then have to use the interface as cast.  If I use
	 * .mirrorTwo(), the One interface is not accessible.  This test shows that 
	 * you can pass a COM object as an argument, and shows the general behavior of
	 * interface resolution.
	 */
	public void testMirrorInterfaces()
	{
		Scriptom.inApartment()
		{
			def clazz = new ActiveXObject("ScriptomTestCSharp.ClassWithTwoInterfaces")
			def consumer = new ActiveXObject("ScriptomTestCSharp.ClassConsumer")
			assert consumer.mirrorOne(clazz).IAmNumberOne() == 1
			shouldFail ComFailException, {consumer.mirrorOne(clazz).IAmNumberTwo()}
			assert consumer.mirrorTwo(clazz).IAmNumberTwo() == 2
			shouldFail ComFailException, {consumer.mirrorTwo(clazz).IAmNumberOne()}			
		}
		
	}
}
