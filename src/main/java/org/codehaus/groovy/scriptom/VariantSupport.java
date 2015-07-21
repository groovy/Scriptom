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

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComFailException;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

import groovy.lang.GString;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.math.MathContext;

import java.util.Date;
/*
 * WHEN MODIFYING TYPE SUPPORT, REMEMBER TO CHECK THE FOLLOWING:
 *   ActiveXObject EventArguments
 *   VariantByref (should be automatic though)
 */
 
/**
 * Static support methods for converting to and from Variant values.
 * 
 * @author Guillaume Laforge
 * @author Dierk Koenig
 * @author Marc Guillemot
 * @author Jason Smith
 */
class VariantSupport
{
  //static final int VariantLong = 20;
  static final int VariantULong = 21;
  static final int VariantUInt = 19;
  static final int VariantUShort = 18;
  static final int VariantSByte = 16;
  
  static final BigInteger BI_MAX_LONG = new BigInteger(Long.toString(Long.MAX_VALUE));
  static final BigInteger BI_MIN_LONG = new BigInteger(Long.toString(Long.MIN_VALUE));
  
  /**
   * Return the real value wrapped inside a variant.
   *
   * @param v the variant to retrieve the real value from
   * @return the real value of the variant
   */
  protected static Object toObject(Variant v)
  {
    int type = v.getvt();
    if((type & Variant.VariantArray) != 0)
    {
      return new SafeArray(v.toSafeArray()); 
    }
    else
    {
      switch(type)
      {
        case Variant.VariantEmpty:
          return null;
        case Variant.VariantEmpty | Variant.VariantByref:
          return null;
        case Variant.VariantNull:
          return VariantNull.VARIANTNULL;
        case Variant.VariantNull | Variant.VariantByref:
          return VariantNull.VARIANTNULL;
        case Variant.VariantShort:
          return new Short(v.getShort());
        case Variant.VariantShort | Variant.VariantByref:
          return new Short(v.getShortRef());
        case VariantUShort:
        {
          v.changeType(Variant.VariantInt);
          return new Integer(v.getInt());
        }
        case VariantUShort | Variant.VariantByref:
        {
          v.changeType(Variant.VariantInt);
          return new Integer(v.getInt());
        }
        case Variant.VariantInt:
          return new Integer(v.getInt());
        case Variant.VariantInt | Variant.VariantByref:
          return new Integer(v.getIntRef());
        case VariantUInt:
        {
          v.changeType(Variant.VariantLongInt);
          return new Long(v.getLong());
        }
        case VariantUInt | Variant.VariantByref:
        {
          v.changeType(Variant.VariantLongInt);
          return new Long(v.getLong());
        }
        case Variant.VariantFloat:
          return new Float(v.getFloat());
        case Variant.VariantFloat | Variant.VariantByref:
          return new Float(v.getFloatRef());
        case Variant.VariantDouble:
          return new Double(v.getDouble());
        case Variant.VariantDouble | Variant.VariantByref:
          return new Double(v.getDoubleRef());
        case Variant.VariantDecimal:
          return v.getDecimal();
        case Variant.VariantDecimal | Variant.VariantByref:
          return v.getDecimalRef();
        case Variant.VariantCurrency:
        {
          v.changeType(Variant.VariantDecimal);
          return v.getDecimal(); 
        }
        case Variant.VariantCurrency | Variant.VariantByref:
        {
          v.changeType(Variant.VariantDecimal);
          return v.getDecimal();
        }
        case Variant.VariantLongInt:
        {
          //v.changeType(Variant.VariantDecimal);
          //BigDecimal bd = v.getDecimal();
          //return Long.valueOf(bd.longValue());
          return Long.valueOf(v.getLong());
        }
        case Variant.VariantLongInt | Variant.VariantByref:
        {
          //v.changeType(Variant.VariantDecimal);
          //BigDecimal bd = v.getDecimal();
          //return Long.valueOf(bd.longValue());
          return Long.valueOf(v.getLongRef());
        }
        case VariantULong:
        {
          v.changeType(Variant.VariantDecimal);
          BigDecimal bd = v.getDecimal();
          BigInteger bi = bd.toBigIntegerExact(); 
          //if(bi.compareTo(BI_MIN_LONG) < 0 || bi.compareTo(BI_MAX_LONG) > 0)
          //  return bi;
          //else
          //  return bi.longValue();
          return bi;
        }
        case VariantULong | Variant.VariantByref:
        {
          v.changeType(Variant.VariantDecimal);
          BigDecimal bd = v.getDecimal();
          BigInteger bi = bd.toBigIntegerExact(); 
          //if(bi.compareTo(BI_MIN_LONG) < 0 || bi.compareTo(BI_MAX_LONG) > 0)
          //  return bi;
          //else
          //  return bi.longValue();
          return bi;
        }
        case Variant.VariantDate:
          return v.getJavaDate();
        case Variant.VariantDate | Variant.VariantByref:
          return v.getJavaDateRef();
        case Variant.VariantString:
          return v.getString();
        case Variant.VariantString | Variant.VariantByref:
          return v.getStringRef();
        case Variant.VariantDispatch:
          return new ActiveXObject(new ActiveXComponent(v.getDispatch()));
        case Variant.VariantDispatch | Variant.VariantByref:
          return new ActiveXObject(new ActiveXComponent(v.getDispatchRef()));
        case Variant.VariantError:
          return new VariantError(v.getError());
        case Variant.VariantError | Variant.VariantByref:
          return new VariantError(v.getErrorRef());
        case Variant.VariantBoolean:
          return Boolean.valueOf(v.getBoolean());
        case Variant.VariantBoolean | Variant.VariantByref:
          return Boolean.valueOf(v.getBooleanRef());
        case Variant.VariantVariant:
          throw new UnsupportedVariantTypeException("VariantVariant");
        case Variant.VariantVariant | Variant.VariantByref:
          return v.getVariant();
          //throw new UnsupportedVariantTypeException("VariantVariant Byref");
        case Variant.VariantObject:
          throw new UnsupportedVariantTypeException("VariantObject");
        case Variant.VariantObject | Variant.VariantByref:
          throw new UnsupportedVariantTypeException("VariantObject Byref");
        case Variant.VariantByte:
          return new Byte(v.getByte());
        case Variant.VariantByte | Variant.VariantByref:
          return new Byte(v.getByteRef());
        case VariantSByte:
        {
          v.changeType(Variant.VariantByte);
          return new Byte(v.getByte());
        }
        case VariantSByte | Variant.VariantByref:
        {
          v.changeType(Variant.VariantByte);
          return new Byte(v.getByteRef());
        }
        case Variant.VariantTypeMask:
          throw new UnsupportedVariantTypeException("VariantTypeMask");
        case Variant.VariantTypeMask | Variant.VariantByref:
          throw new UnsupportedVariantTypeException("VariantTypeMask Byref");
        default:
          throw new UnsupportedOperationException("Variant type " + type + ".");
      }
    }
  }

  public static Variant toVariant(Object newValue, boolean byref)
  {
    //TODO: this may be too simple. Testing needed.
    // special case for Groovy's arithmetics:
    // BigInteger and BigDecimal aren't recognized by the Jacob library
    if(newValue == null)
      return new Variant(null, byref);
    
    if(newValue instanceof VariantNull)
    {
      Variant v = new Variant(null, byref);
      v.changeType(Variant.VariantNull);
      return v;
    }
    
    if(newValue instanceof VariantByref)
    {
      //Note that we are overriding the byref flag here by design.
      return ((VariantByref)newValue).value;
    }
    
    if(newValue instanceof VariantError)
    {
      //TODO: Jacob can't create any VariantError other than MISSING.
      if(Scriptom.isMissing(newValue))
        return Variant.VT_MISSING;
      else
        return new Variant(Integer.valueOf(((Number)newValue).intValue()), byref);
    }
    
    if(newValue instanceof GString)
      newValue = newValue.toString();
    else if(newValue instanceof ActiveXObject)
      newValue = ((ActiveXObject)newValue).activex;
    else if(newValue instanceof SafeArray)
      newValue = ((SafeArray)newValue).array; 
    else if(newValue instanceof BigInteger)
    {
      //newValue = Long.valueOf(((BigInteger)newValue).longValue());
      //JSS 11/21/2007:
      //By converting BigInteger to a BigDecimal, we cover the edge case for
      //ULong; can be > 0x7FFFFFFFFFFFFFFF.  Let COM handle the bounds checking.
      newValue = new BigDecimal((BigInteger)newValue);
    }
    
    if(newValue instanceof Short 
      || newValue instanceof Integer
      || newValue instanceof Float
      || newValue instanceof Double
      || newValue instanceof Long
      || newValue instanceof String 
      || newValue instanceof Date
      || newValue instanceof Boolean
      || newValue instanceof Byte
      || newValue instanceof com.jacob.com.SafeArray
      || newValue instanceof Dispatch)
    {
      //System.out.println("TYPE: " + newValue.getClass().getName());
      return new Variant(newValue, byref);
    }
    else if(newValue instanceof BigDecimal)
    {
      return new Variant(roundToMsDecimal((BigDecimal)newValue), byref);
    }
    //Add support for Java types to SafeArray. 
    else if(newValue instanceof String[])
      return toVariant(new SafeArray((String[])newValue), byref);
    else if(newValue instanceof boolean[])
      return toVariant(new SafeArray((boolean[])newValue), byref);    
    else if(newValue instanceof byte[])
      return toVariant(new SafeArray((byte[])newValue), byref);    
    else if(newValue instanceof short[])
      return toVariant(new SafeArray((short[])newValue), byref);    
    else if(newValue instanceof int[])
      return toVariant(new SafeArray((int[])newValue), byref);   
    //else if(newValue instanceof long[])
      //return toVariant(new SafeArray((long[])newValue), byref);
    else if(newValue instanceof float[])
      return toVariant(new SafeArray((float[])newValue), byref);     
    else if(newValue instanceof double[])
      return toVariant(new SafeArray((double[])newValue), byref);    
    else if(newValue instanceof Object[])
      return toVariant(new SafeArray((Object[])newValue), byref);    
    else
      throw new UnsupportedVariantTypeException(newValue.getClass().getName());
  }
  
  static String vtToString(int vt)
  {
    StringBuilder s = new StringBuilder();
    if((vt & Variant.VariantByref) != 0)
      s.append("Byref ");
    if((vt & Variant.VariantArray) != 0)
      s.append("Array ");
      
    vt = vt & ~(Variant.VariantArray | Variant.VariantByref);
    switch(vt)
    {
      case Variant.VariantBoolean:
        s.append("Bool"); break;
      case Variant.VariantByte:
        s.append("Byte"); break;
      case Variant.VariantCurrency:
        s.append("Curr"); break;
      case Variant.VariantDate:
        s.append("Date"); break;
      case Variant.VariantDispatch:
        s.append("ActiveX"); break;
      case Variant.VariantDouble:
        s.append("Dbl"); break;
      case Variant.VariantEmpty:
        s.append("Empty"); break;
      case Variant.VariantError:
        s.append("Err"); break;
      case Variant.VariantFloat:
        s.append("Flt"); break;
      case Variant.VariantInt:
        s.append("Int"); break;
      case Variant.VariantNull:
        s.append("Null"); break;
      case Variant.VariantObject:
        s.append("Obj"); break;
      case Variant.VariantShort:
        s.append("Short"); break;
      case Variant.VariantString:
        s.append("String"); break;
      case Variant.VariantTypeMask:
        s.append("TypeMask"); break;
      case Variant.VariantVariant:
        s.append("Variant"); break;
      case Variant.VariantDecimal:
        s.append("Decimal"); break;
      case Variant.VariantLongInt:
        s.append("Long"); break;
      case VariantULong:
        s.append("ULong"); break;
      case VariantUInt:
        s.append("UInt"); break;
      case VariantUShort:
        s.append("UShort"); break;
      case VariantSByte:
        s.append("SByte"); break;
      default:
        s.append("" + vt);
    }
    return s.toString();
  }
  
  public static String vToString(Variant v) 
  {
    StringBuffer s = new StringBuffer();
    
    Object o;
    try
    {
      o = toObject(v);
    }
    catch(Exception e)
    {
      o = "????";
    }
    
    s.append("[" + vtToString(v.getvt()) + "]");
    if(o instanceof String) s.append("'");
    s.append("" + o);
    if(o instanceof String) s.append("'");
  
    return s.toString();
  }
  
  public static String vArrToString(Variant[] v)
  {
    StringBuilder s = new StringBuilder();
    for(int i=0; i<v.length; i++)
    {
      if(i>0) s.append(", ");
      s.append(vToString(v[i]));
    }
    return "(" + s.toString() + ")";
  }
  
  public static Object readRegistry(String key)
  {
    ActiveXComponent wshShell = new ActiveXComponent("WScript.Shell");
    try
    {
      Variant v = wshShell.invoke("RegRead", key);
      return toObject(v);
    }
    catch(ComFailException e)
    {
      return null;
    }
    finally
    {
      wshShell.safeRelease();
    }
  }
  
  private static final BigDecimal LARGEST_DECIMAL = new BigDecimal(new BigInteger("ffffffffffffffffffffffff", 16));
  private static final BigDecimal SMALLIST_DECIMAL = new BigDecimal(new BigInteger("ffffffffffffffffffffffff", 16).negate());

  static BigDecimal roundToMsDecimal(BigDecimal value)
  {
    if (value == null)
      throw new IllegalArgumentException("null is not a supported Decimal value.");
    else if (LARGEST_DECIMAL.compareTo(value) < 0)
      throw new IllegalArgumentException("Value too large for VT_DECIMAL data type:" + value.toString());
    else if (SMALLIST_DECIMAL.compareTo(value) > 0)
      throw new IllegalArgumentException("Value too small for VT_DECIMAL data type:" + value.toString());
    
    // First limit the number of digits and then the precision.
    // Try and round to 29 digits because we can sometimes do that
    if (value.unscaledValue().bitLength() > 96) 
    {
      value = value.round(new MathContext(29));
      // see if 29 digits uses more than 96 bits
      if (value.unscaledValue().bitLength() > 96) 
      {
        // Dang. It was over 97 bits so shorten it one more digit to
        // stay <= 96 bits
        value = value.round(new MathContext(28));
      }
    }
    
    // round the scale to the max MS can support
    if (value.scale() > 28) value = value.setScale(28, BigDecimal.ROUND_HALF_UP);
    if (value.scale() < 0) value = value.setScale(0, BigDecimal.ROUND_HALF_UP);
    
    return value;
  }
}