package org.codehaus.groovy.modules.scriptom.test

import org.codehaus.groovy.scriptom.*;
import com.jacob.com.ComFailException

class TestTypesByrefVB8 extends BaseJacobTest
{
  void testBoolean()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      def boolVar = new VariantByref(true)
      testObj.TestBoolean(boolVar)
      assertEquals boolVar.value, false
    }
  }
  
  void testByte()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      (-128..127).each
      {value ->
        def byteVar = new VariantByref((byte)value)
        testObj.TestByte(byteVar)
        assert byteVar.value == (value & 0xF)
      }
      
      //Conversions are automatically performed.  Values greater than max byte value
      //will be converted to a byte without an error.
      [-257L, 257L].each
      {value ->
        def byteVar = new VariantByref((byte)value)
        testObj.TestByte(byteVar)
        assert byteVar.value == (value & 0xF)
      }
    }
  }
  
  void testShort()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      [32766, -32768].each
      {value ->
        def shortVar = new VariantByref((short)value)
        testObj.TestShort(shortVar)
        assertEquals shortVar.value, value + 1
      }
      
      [32767, -32769].each
      {value ->
        def shortVar = new VariantByref((short)value)
        shouldFail ComFailException, {testObj.TestShort(shortVar)}
      }
    }
  }
  
  void testUShort()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      [(short)65530, (short)0].each
      {value ->
        def uShortVar = new VariantByref(value)
        testObj.TestShort(uShortVar, 1)
        assertEquals uShortVar.value, value + 1
      }
      
      println "BUGBUG: COM sees UShort value in as signed.  Actual range is -32768 to 32767." 
      [(int)65530].each
      {value ->
        def uShortVar = new VariantByref(value)
        shouldFail ComFailException, {testObj.TestShort(uShortVar, 1)}
      }
    }
  }
  
  void testInteger()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      def testIt = 
      {value, addend ->
        def intVar = new VariantByref(value)
        testObj.TestInteger(intVar, addend)
        assertEquals intVar.value, value + addend
      }
      
      testIt(0x7FFFFFFE, 1)
      testIt(-0x7FFFFFFF, -1)
      shouldFail ComFailException, {testIt(0x7FFFFFFF, 1)}
      shouldFail ComFailException, {testIt(-0x80000000, -1)}
    }
  }
  
  void testUInteger()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      def testIt = 
      {value, addend ->
        def intVar = new VariantByref(value)
        testObj.TestUInteger(intVar, addend)
        assertEquals intVar.value, value + addend
      }
      
      testIt(0xFFFFFFFE, 1)
      testIt(1, -1)
      shouldFail ComFailException, {testIt(0xFFFFFFFF, 1)}
      shouldFail ComFailException, {testIt(0, -1)}
    }
  }

  void testLong()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      def testIt = 
      {value, addend ->
        def longVar = new VariantByref(value)
        testObj.TestLong(longVar, addend)
        assertEquals longVar.value, value + addend
      }
      
      testIt(0x7FFFFFFFFFFFFFFE, 1)
      testIt(-0x7FFFFFFFFFFFFFFF, -1)
      shouldFail ComFailException, {testIt(0x7FFFFFFFFFFFFFFF, 1)}
      shouldFail ComFailException, {testIt(-0x8000000000000000, -1)}
    }
  }
  
  void testULong()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      def testIt = 
      {value, addend ->
        def longVar = new VariantByref(value)
        testObj.TestULong(longVar, addend)
        assertTrue longVar.value == value + addend
      }
      
      testIt(0xFFFFFFFFFFFFFFFE, 1)
      testIt(1, -1)
      shouldFail ComFailException, {testIt(0xFFFFFFFFFFFFFFFF, 1)}
      shouldFail ComFailException, {testIt(0, -1)}
    }
  }
  
  void testSingle()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      def testIt = 
      {value, addend ->
        def singleVar = new VariantByref(value)
        testObj.TestSingle(singleVar, addend)
        assertTrue singleVar.value == value + addend
      }
      
      testIt(1234567890123456789012345f, 1234567890123456789012345f)
    }
  }

  void testDouble()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      def testIt = 
      {value, addend ->
        def doubleVar = new VariantByref(value)
        testObj.TestDouble(doubleVar, addend)
        assertTrue doubleVar.value == value + addend
      }
      
      testIt(1234567890123456789012345678901234567890.1d, 1234567890123456789012345678901234567890.1d)
    }
  }
  
  void testDecimal()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      def testIt = 
      {value, addend, result ->
        def decVar = new VariantByref(value)
        testObj.TestDecimal(decVar, addend)
        assertTrue decVar.value == result
      }
      
      testIt(79228162514264337593543950334.0,1.0,79228162514264337593543950335.0)
      testIt(-79228162514264337593543950334.0,-1.0,-79228162514264337593543950335.0)
      testIt(7.9228162514264337593543950335999999999999999999, 0.0, 7.922816251426433759354395034)
      testIt(0.0000000000000000000000000001, 0.0000000000000000000000000001, 0.0000000000000000000000000002)
      testIt(0.00000000000000000000000000001, 0.00000000000000000000000000001, 0.0)
      shouldFail ComFailException, {testIt(79228162514264337593543950335.0, 1.0, 0.0)}
      shouldFail ComFailException, {testIt(-79228162514264337593543950335.0, -1.0, 0.0)}
    }
  }
  
  void testDate()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      def date = new Date()
      def dateVar = new VariantByref(date)
      testObj.TestDate(dateVar)
      assert dateVar.value.time == date.time + 24 * 60 * 60 * 1000
    }    
  }
  
  void testString()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      def stringVar = new VariantByref("Java")
      testObj.TestString(stringVar)
      assert stringVar.value == "VB:Java"
    }  
  }
  
  void testObject()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestTypesByref')
      
      def comObject = new ActiveXObject('ScriptomTestVB.TestComObject').init('Java')
      def comVar = new VariantByref(comObject)
      testObj.TestObject(comVar)
      //This is a bug.  The result should be 'VB:Java'.  This test will fail once
      //the bug is fixed.
      assert comVar.value.Value == 'Java'
      println "BUGBUG: Pass object byref does not work."
    }    
  }
}

