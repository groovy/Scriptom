package org.codehaus.groovy.scriptom.util.wbemscripting;

import org.codehaus.groovy.scriptom.*;

/**
 * Utility methods for working with WBEM-formatted datetime strings.
 */
class WbemDateTime
{
  private WbemDateTime()
  {
  }
  
  /**
   * Converts a WBEM datetime in string format into a Java {@code Date}.
   * @param sWbemDateTime A WBEM-formatted datetime string.
   * @return A Java Date, in local time.
   */
  static Date toJavaDate(Object sWbemDateTime)
  {
    if(Scriptom.isEmpty(sWbemDateTime) || Scriptom.isNull(sWbemDateTime))
      return null
    else
    {
      return Scriptom.inApartment {
        def dt = new ActiveXObject('WbemScripting.SWbemDateTime')
        dt.Value = sWbemDateTime
        return dt.GetVarDate(true)
      }
    }
  }
  
  /** 
   * Converts a Java {@code Date} into a WBEM datetime in string format.
   * @param Date A Java {@code Date}.
   * @return The date formatted as a WBEM datetime string.
   */
  static Object toSWbemDateTime(Date date)
  {
    return Scriptom.inApartment {
      def dt = new ActiveXObject('WbemScripting.SWbemDateTime')
      dt.SetVarDate(date)
      return dt.Value
    }
  }
}