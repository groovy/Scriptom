package org.codehaus.groovy.modules.scriptom.test

import org.codehaus.groovy.scriptom.*;
import com.jacob.com.*;
import org.codehaus.groovy.scriptom.tlb.vbtests.ScriptomTestVB;

class TestTypesVB8 extends BaseJacobTest
{
  void testBoolean()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      assertTrue testObj.Invert(false) instanceof Boolean
      assertEquals testObj.Invert(true), false
      assertEquals testObj.Invert(false), true
    }
  }
  
  void testShort()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      assertTrue testObj.addShorts(1, 1) instanceof Short
      assertTrue testObj.addShorts(-1, -1) instanceof Short
      assertEquals testObj.addShorts((short)0x7FFE, 1), 0x7FFF
      assertEquals testObj.addShorts((short)-0x7FFF, -1), -0x8000
      shouldFail ComFailException.class, {testObj.addShorts((short)0x7FFF, 1)}
      shouldFail ComFailException.class, {testObj.addShorts((short)-0x8000, -1)}
    }  
  }
  
  void testUShort()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      assertTrue testObj.addUShorts(1, 1) instanceof Integer
      assertEquals testObj.addUShorts(0xFFFE, 1), 0xFFFF
      shouldFail ComFailException, {testObj.addUShorts(0xFFFF, 1)}
      shouldFail ComFailException, {testObj.addUShorts(-1, 0)}
    }
  }
  
  void testInteger()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      assertTrue testObj.addIntegers(1, 1) instanceof Integer
      assertTrue testObj.addIntegers(-1, -1) instanceof Integer
      assertEquals testObj.addIntegers(3, 4), 7
      assertEquals testObj.addIntegers(-10, 2), -8
      assertEquals testObj.addIntegers(0x7FFFFFFE, 1), 0x7FFFFFFF
      assertEquals testObj.addIntegers(-0x7FFFFFFF, -1), -0x80000000
      shouldFail ComFailException.class, {testObj.addIntegers(0x7FFFFFFF, 1)}
      shouldFail ComFailException.class, {testObj.addIntegers(0x80000000, 0)}
      shouldFail ComFailException.class, {testObj.addIntegers(-0x80000000, -1)}
      shouldFail ComFailException.class, {testObj.addIntegers(-0x80000001, 0)}
    }  
  }
  
  void testUInteger()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      assertTrue testObj.addUIntegers(1, 1) instanceof Long
      assertEquals testObj.addUIntegers(3, 4), 7
      assertEquals testObj.addUIntegers(0xFFFFFFFE, 1), 0xFFFFFFFF
      shouldFail ComFailException.class, {testObj.addUIntegers(0xFFFFFFFF, 1)}
      shouldFail ComFailException.class, {testObj.addUIntegers(0x100000000, 0)}
      
      //Note that COM does not appear to limit UIntegers to positive numbers!
      assertEquals testObj.addUIntegers(-0x1, 0), 0xFFFFFFFF
    }
  }
  
  /**
   * Maps to a Java Long.  COM takes care of bounds checking.
   */
  void testLong()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      assertTrue testObj.addLongs(0x200000000L, 0x200000000L) instanceof Long 
      assertEquals testObj.addLongs(0x200000000L, 0x200000000L), 0x400000000L
      assertEquals testObj.addLongs(-0x200000000L, -0x200000000L), -0x400000000L
      assertEquals testObj.addLongs(0x7FFFFFFFFFFFFFFEL, 0x1L), 0x7FFFFFFFFFFFFFFFL
      assertEquals testObj.addLongs(-0x7FFFFFFFFFFFFFFFL, -0x1L), -0x8000000000000000L
      shouldFail ComFailException.class, {testObj.addLongs(-0x8000000000000000L, -0x1L)}
      shouldFail ComFailException.class, {testObj.addLongs(0x7FFFFFFFFFFFFFFFL, 0x1L)}
      shouldFail ComFailException.class, {testObj.addLongs(0x8000000000000000, 0x0L)}
      shouldFail ComFailException.class, {testObj.addLongs(-0x8000000000000001, 0x0L)}
    }
  }
  
  /**
   * ULong is a 64-bit unsigned integer.  Since this won't fit into a Long without wrapping
   * into negative territory, it's always represented by a BigInteger in Java.
   * COM takes care of the bounds checking. 
   */
  void testULong()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      
      //ULong will be converted to Long if possible.  If too big, converted to BigInteger.
      assertTrue testObj.addULongs(0x200000000L, 0x200000000L) instanceof BigInteger //Long
      assertTrue testObj.addULongs(0x7FFFFFFFFFFFFFFEL, 0x1L) instanceof BigInteger //Long
      assertTrue testObj.addULongs(0x7FFFFFFFFFFFFFFFL, 0x1L) instanceof BigInteger
      assertTrue testObj.addULongs(0x200000000L, 0x200000000L) == 0x400000000L
      assertTrue testObj.addULongs(0x7FFFFFFFFFFFFFFFL, 0x1L) == 0x8000000000000000
      assertTrue testObj.addULongs(0xFFFFFFFFFFFFFFFE, 0x1) == 0xFFFFFFFFFFFFFFFF
      shouldFail ComFailException.class, {testObj.addULongs(0xFFFFFFFFFFFFFFFF, 0x1)}
      shouldFail ComFailException.class, {testObj.addULongs(0x10000000000000000, 0)}
      shouldFail ComFailException.class, {testObj.addULongs(-0x1, 0)}
    }
  }
  
  void testFloat()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      assertTrue testObj.AddSingles(1.0f, 1.0f) instanceof Float
      assertEquals testObj.AddSingles(1.0f, 0.1f), 1.1f
      assertEquals testObj.AddSingles(1234567890123456789012345678901234567.8D, 1111111111111111111111111111111111111.1D), 2.345679E36f 
    }
  }
  
  void testDouble()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      assertTrue testObj.AddDoubles(1.0D, 1.0D) instanceof Double
      assertEquals testObj.AddDoubles(1.0D, 0.1D), 1.1D
      assertEquals testObj.AddDoubles(1234567890123456789012345.6, 1111111111111111111111111.1), 2.345679001234568E24D   
    }
  }

  void testDecimal()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      assertTrue testObj.addDecimals(2, 2) instanceof BigDecimal
      assertTrue testObj.addDecimals(2, 2) == 4
      assertTrue testObj.addDecimals(-2.0, -2.0) == -4.0
      assertTrue testObj.addDecimals(79228162514264337593543950334.0,1.0) == 79228162514264337593543950335.0
      shouldFail ComFailException, {testObj.addDecimals(79228162514264337593543950335.0,1.0)}
      assertTrue testObj.addDecimals(-79228162514264337593543950334.0,-1.0) == -79228162514264337593543950335.0
      shouldFail ComFailException, {testObj.addDecimals(-79228162514264337593543950335.0,-1.0)}
      assertTrue testObj.addDecimals(7.9228162514264337593543950335999999999999999999, 0) == 7.922816251426433759354395034
      assertTrue testObj.addDecimals(0.0000000000000000000000000001, 0.0000000000000000000000000001) == 0.0000000000000000000000000002
      assertTrue testObj.addDecimals(0.00000000000000000000000000001, 0.00000000000000000000000000001) == 0.0
    }
  }
  
  void testObject()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      def comObject = new ActiveXObject(ScriptomTestVB.progIds.TestComObject).Init('Java')
      assertEquals comObject.Value, 'Java'
      assertEquals testObj.PassObject(comObject).Value, 'VB:Java'
    }
  }

  void testString()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      assertTrue testObj.PassString("Java") instanceof String
      assertEquals testObj.PassString("Java"), "VB:Java"
    }
  }
  
  void testDate()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestTypes)
      Date date = new Date()
      assertTrue testObj.PassDate(date) instanceof Date
      assertEquals testObj.PassDate(date), date
    }
  }
}
