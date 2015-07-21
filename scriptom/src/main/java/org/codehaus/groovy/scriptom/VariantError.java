/*
 * Copyright 2007 (C) Guillaume Laforge. All Rights Reserved.
 *
 * Redistribution and use of this software and associated documentation
 * ("Software"), with or without modification, are permitted provided that the
 * following conditions are met:
 *  1. Redistributions of source code must retain copyright statements and
 * notices. Redistributions must also contain a copy of this document.
 *  2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *  3. The name "groovy" must not be used to endorse or promote products
 * derived from this Software without prior written permission of The Codehaus.
 * For written permission, please contact info@codehaus.org.
 *  4. Products derived from this Software may not be called "groovy" nor may
 * "groovy" appear in their names without prior written permission of The
 * Codehaus. "groovy" is a registered trademark of The Codehaus.
 *  5. Due credit should be given to The Codehaus - http://groovy.codehaus.org/
 *
 * THIS SOFTWARE IS PROVIDED BY THE CODEHAUS AND CONTRIBUTORS ``AS IS'' AND ANY
 * EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE CODEHAUS OR ITS CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 * DAMAGE.
 */
package org.codehaus.groovy.scriptom;

/**
 * Represents a Variant error.
 * 
 * @author Jason Smith
 */
public class VariantError extends Number implements Comparable
{
  private Integer value;
  
  /**
   * Construct a new error.
   * @param value Error value.
   */
  public VariantError(int value)
  {
    this.value = new Integer(value);
  }

  /**
   * The integer value.
   * @return The integer value.
   */
  public int intValue()
  {
    return value.intValue();
  }

  /**
   * The long value.
   * @return The long value.
   */
  public long longValue()
  {
    return value.longValue();
  }

  /**
   * The float value.
   * @return The float value.
   */
  public float floatValue()
  {
    return value.floatValue();
  }

  /**
   * The double value.
   * @return The double value.
   */
  public double doubleValue()
  {
    return value.doubleValue();
  }

  /**
   * The byte value.
   * @return The byte value.
   */
  public byte byteValue()
  {
    return value.byteValue();
  }

  /**
   * Compares this object to another for equality.
   * @param obj Object to compare.
   * @return Boolean indicating equality.
   */
  public boolean equals(Object obj)
  {
    if(obj instanceof Number)
    {
      return intValue() == ((Number)obj).intValue();
    }
    else
    {
      return false;
    }
  }

  /**
   * The hash code.
   * @return The hash code.
   */
  public int hashCode()
  {
    return value.hashCode();
  }

  /**
   * The short value.
   * @return The short value.
   */
  public short shortValue()
  {
    return value.shortValue();
  }

  /**
   * Error code as a string.
   * @return Error code as a string.
   */
  public String toString()
  {
    return value.toString() + "(" + Long.toString((value.longValue() & 0x00000000FFFFFFFFL), 16) + ")";
  }

  /**
   * Comparison operator.
   * @param o Object to compare to.
   * @return Int value indicating greater, equal, or less.
   */
  public int compareTo(Object o)
  {
    return value.compareTo(Integer.valueOf(((Number)o).intValue()));
  }
}
