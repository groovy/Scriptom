package org.codehaus.groovy.modules.scriptom.test

import org.codehaus.groovy.scriptom.*;

class TestArraysVB8 extends BaseJacobTest
{
  void test1DString()
  {
    Scriptom.inApartment
    {
      def testObj = new ActiveXObject('ScriptomTestVB.TestArrays')
     
      SafeArray sA = new SafeArray(['a', 'b', 'c', 'd'] as String[])
      SafeArray sB = testObj.Pass1DStringArray(sA)
      assert sA.bounds[0] == sB.bounds[0]
      sA.bounds[0].each {index -> assert "VB:${sA[index]}" == sB[index]}  
    }
  }
}

  
  /*
   * This fails. Reported as 1828569.
   */
  //VariantByref v = new VariantByref(sA)
  //testObj.Pass1DStringArrayByref(v)
  //println "Made it this far."
  //SafeArray v2 = v.value
  //println "Made it a little further."
  //println v2[0]
  
