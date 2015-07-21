package org.codehaus.groovy.modules.scriptom.test

import groovy.util.GroovyTestCase
import org.codehaus.groovy.scriptom.*
import com.jacob.com.*
import org.codehaus.groovy.scriptom.tlb.csharptests.*

/**
 * Simple test of types.
 * @author Jason Smith
 */
class TestTypesCS extends BaseJacobTest
{	 
	/**
	 * Pass and receive a byte value, and verify that the
	 * returned value is a java.lang.Byte.
	 */
	void testByte()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
		  
		  assert types.MirrorByte(100) == 100
		  assert types.MirrorByte(100) instanceof Byte
		  assert types.MirrorByte(null) == 0
		}
	}
	
	/**
	 * Pass and receive a sbyte value, and verify that the
	 * returned value is a java.lang.Byte.
	 */
	void testSByte()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
		  
		  assert types.MirrorSByte(100) == 100
		  assert types.MirrorSByte(100) instanceof Byte
		  assert types.MirrorSByte(null) == 0
		}
	}
	
	/**
	 * Verify that the input value accepts values in the Byte range
	 * only.  Note that Java bytes range from -128 to 127.  However, 
	 * the "Byte" type in .NET is unsigned, so it ranges from 0 to 255.
	 * The Jacob library will correctly convert Java Byte values to 
	 * the correct .NET equivalent.
	 * To avoid confusion, you can convert to (byte)
	 * explicitly.  
	 */
	void testByteBounds()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
			
		  assert types.MirrorByte((byte)-128) == -128
		  assert types.MirrorByte((byte)-129) == 127
		  
		  assert types.MirrorByte((byte)127) == 127
		  assert types.MirrorByte((byte)128) == -128
		  
		  shouldFail ComFailException, {types.MirrorByte(-1)}
		  assert types.MirrorByte(0) == 0
		  assert types.MirrorByte(255) == -1
		  shouldFail ComFailException, {types.MirrorByte(256)}
		}
	}
	
	/**
	 * Verify that the input value accepts values in the SByte range
	 * only, which is the same as a Java byte. 
	 */
	void testSByteBounds()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
			
		  assert types.MirrorSByte((byte)-128) == -128
		  assert types.MirrorSByte((byte)-129) == 127
		  
		  assert types.MirrorSByte((byte)127) == 127
		  assert types.MirrorSByte((byte)128) == -128
		  
		  shouldFail ComFailException, {types.MirrorSByte((int)-129)}
		  assert types.MirrorSByte((int)-128) == -128
		  assert types.MirrorSByte((int)127) == 127
		  shouldFail ComFailException, {types.MirrorSByte((int)128)}
		}
	}

	
	/**
	 * Pass and receive an integer value, and verify that the
	 * returned value is a java.lang.Integer.
	 */
	void testInt()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
		  
		  assert types.MirrorInt(100) == 100
		  assert types.MirrorInt(100) instanceof Integer
		  assert types.MirrorInt(null) == 0
		}
	}
	
	/**
	 * Verify that the input value accepts values in the Integer range
	 * only (-0x80000000 through 0x7FFFFFFF).
	 */
	void testIntBounds()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
			
		  assert types.MirrorInt(0x7FFFFFFF) == 0x7FFFFFFF
		  shouldFail ComFailException, {types.MirrorInt(0x80000000)}
		  
		  assert types.MirrorInt(-0x80000000) == -0x80000000
		  shouldFail ComFailException, {types.MirrorInt(-0x80000001)} 
		}
	}
	
	/**
	 * Pass and receive an unsigned-integer value, and verify that the
	 * returned value is a java.lang.Long.
	 */
	void testUInt()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
		  
		  assert types.MirrorUInt(100) == 100
		  assert types.MirrorUInt(100) instanceof Long
		  assert types.MirrorUInt(null) == 0
		}
	}
	
	/**
	 * Verify that the input value accepts values in the Integer range
	 * only (-0x80000000 through 0x7FFFFFFF).
	 */
	void testUIntBounds()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
			
		  assert types.MirrorUInt(0xFFFFFFFF) == 0xFFFFFFFF
		  shouldFail ComFailException, {types.MirrorUInt(0x100000000)}
		  
		  assert types.MirrorUInt(0) == 0;
		}
	}
	
	/**
	 * Pass and receive a long value, and verify that the
	 * returned value is a java.lang.Long.
	 */
	void testLong()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
		  
		  assert types.MirrorLong(100) == 100
		  assert types.MirrorLong(100) instanceof Long
		  assert types.MirrorLong(null) == 0
		}
	}
	
	/**
	 * Verify that the input value accepts values in the Long range
	 * only.
	 */
	void testLongBounds()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
			
		  assert types.MirrorLong(Long.MAX_VALUE) == Long.MAX_VALUE
		  shouldFail ComFailException, {types.MirrorInt(new BigInteger(Long.MAX_VALUE)+1)}
		  
		  assert types.MirrorLong(Long.MIN_VALUE) == Long.MIN_VALUE
		  shouldFail ComFailException, {types.MirrorLong(new BigInteger(Long.MIN_VALUE)-1)} 
		}
	}
	
	/**
	 * Pass and receive a float value, and verify that the
	 * returned value is a java.lang.Float.
	 */
	void testFloat()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
		  
		  assert types.MirrorFloat(100f) == 100f
		  assert types.MirrorFloat(100f) instanceof Float
		  assert types.MirrorFloat(null) == 0f
		}
	}
	
	/**
	 * Pass and receive a double value, and verify that the
	 * returned value is a java.lang.Double.
	 */
	void testDouble()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
		  
		  assert types.MirrorDouble(100d) == 100d
		  assert types.MirrorDouble(100d) instanceof Double
		  assert types.MirrorDouble(null) == 0d
		}
	}

	/**
	 * Pass and receive a string value, and verify that the
	 * returned value is a java.lang.String.  Verify that it 
	 * works seamlessly with GStrings.
	 */
	void testString()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject("ScriptomTestCSharp.SimpleTypes")
		  
		  assert types.MirrorString('Hello, Scriptom.') == 'Hello, Scriptom.'
		  assert types.MirrorString("Hello, Scriptom. ${1+1}") == "Hello, Scriptom. 2"
		  assert types.MirrorString("Hello.") instanceof String
		  assert types.MirrorString(null) == null
		}		
	}
	
	/**
	 * Pass and receive a date value, verifying that the date passed is
	 * identical in milliseconds.  Verify that the the returned value
	 * is a java.util.Date.
	 */
	void testDate()
	{
		Scriptom.inApartment
		{
		  def types = new ActiveXObject(ScriptomTestCSharp.progIds.SimpleTypes)
		  
		  Date date = new Date();
		  
		  assert types.MirrorDate(date) instanceof Date
		  assert types.MirrorDate(date).time == date.time
		  assert types.MirrorDate(null) == null
		}		
	}
}
