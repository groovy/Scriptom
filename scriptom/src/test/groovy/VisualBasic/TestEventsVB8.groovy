package org.codehaus.groovy.modules.scriptom.test

import org.codehaus.groovy.scriptom.*;
import org.codehaus.groovy.scriptom.tlb.vbtests.ScriptomTestVB;

class TestEventsVB8 extends BaseJacobTest
{
  void testBooleanByref()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestEvents)
      
      testObj.events.OnPassBooleanByref = {args -> args[0] = !args[0]}
      assert testObj.RaisePassBooleanByref(false) == true
    }
  }
  
  void testIntegerByref()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestEvents)
      
      assert testObj.RaisePassIntegerByref(0x1FFFF) == 0x1FFFF
      assert testObj.RaisePassIntegerByref(-10) == -10
      testObj.events.OnPassIntegerByref = {args -> args[0] = args[0] + 1}
      assert testObj.RaisePassIntegerByref(0x1FFFF) == 0x20000
      assert testObj.RaisePassIntegerByref(-10) == -9 
    }
  }
  
  void testStringByref()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestEvents)
      
      testObj.events.OnPassStringByref = {args -> args[0] = "${args[0]} and Event."}
      assert testObj.RaisePassStringByref("Original") == "Original and Event."      
    }  
  }
  
  void testDateByref()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject(ScriptomTestVB.progIds.TestEvents)
      
      //Note that for a Date, which is mutable, you have to actually create a new
      //Date object in the event handler in order for the changes to be registered in
      //the VB DLL.  It is not enough to set the time.  This is not a bug.
      Date date = new Date()
      testObj.events.OnPassDateByref = {args -> args[0] = new Date(args[0].time + 1000)}
      assert testObj.RaisePassDateByref(date).time == date.time + 1000
    }  
  }
}


  
  /*
   * This is broken. Reported as 1828498.
   */
  //println "Bug: Passing Decimal byref in an event handler does not work."
  //assert testObj.RaisePassDecimalByref(0x1FFFF) == 0x1FFFF
  //assert testObj.RaisePassDecimalByref(-10) == -10
  //testObj.events.OnPassDecimalByref = {args -> args[0] = args[0] + 1}
  //assert testObj.RaisePassDecimalByref(0x10) == 0x11
  //assert testObj.RaisePassDecimalByref(-10) == -9
  
  /*
   * Broken, still passing type Decimal.  Wait for resolution on 1828498.
   */
  //assert testObj.RaisePassLongByref(0x1FFFFFFFFL) == 0x1FFFFFFFFL
  //assert testObj.RaisePassLongByref(-10) == -10
  //testObj.events.OnPassLongByref = {args -> println "${args}"; args[0] = args[0] + 1}
  //assert testObj.RaisePassLongByref(0x1FFFFFFFFL) == 0x200000000L
  //assert testObj.RaisePassLongByref(-10) == -9
