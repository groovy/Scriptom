package org.codehaus.groovy.scriptom;

import com.jacob.com.Variant;

import groovy.lang.GroovyObjectSupport;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;


/**
 * {@code EventArguments} represents the arguments passed into an event as a Groovy collection.<p>
 * 
 * Arguments are indexed from 0 to n.  Arguments that are passed byref may be modified, and those
 * modifications will be passed to the calling scope.  
 */
public final class EventArguments extends GroovyObjectSupport
{
  private Variant[] variants;
  
  EventArguments(Variant[] variants)
  {
    this.variants = variants;
  }
  
  /**
   * Gets the value at the specified index.  The index is single-dimensional, starts at 0, and corresponds
   * to the event arguments in the order passed.
   * @param index The integer index.
   * @return The value of the argument.
   */
  public Object getAt(Object index)
  {
    if(!(index instanceof Number))
      throw new IllegalArgumentException("Invalid index type: " + index.getClass().getName());
    return VariantSupport.toObject(variants[((Number)index).intValue()]);
  }
  
  /**
   * Puts the value into the specified index. The index is single-dimensional, starts at 0, and corresponds
   * to the event arguments in the order passed. The value at the index must have been passed by-reference, or 
   * an exception occurs.  Variant-Arrays are not supported.
   * @param index The integer index.
   * @param value The value.
   */
  public void putAt(Object index, Object value)
  {
    //TODO: Write test cases specifically for this code. Can't reuse VariantSupport here!
    //TODO: Try to support for Long and Currency.
    if(!(index instanceof Number))
      throw new IllegalArgumentException("Invalid index type: " + index.getClass().getName());

    int iindex = ((Number)index).intValue();
    
    if(!isByref(iindex))
      throw new ReadOnlyException("The value at index " + iindex + " is not modifiable.");
  
    if((variants[iindex].getvt() & Variant.VariantArray) != 0)
      throw new UnsupportedOperationException("Variant-array modification is not supported.");
      
    if(value == null)
      throw new NullPointerException();

    int type = variants[iindex].getvt() & ~(Variant.VariantByref | Variant.VariantArray);
    
    if(Scriptom.debug()) 
    {
      System.err.println("EVENT write to EventArguments[" + index + "](" + type + "): " + value);    
    }
    
    switch(type)
    {
      case Variant.VariantEmpty:
        throw new UnsupportedOperationException("VariantEmpty modification not supported.");
      case Variant.VariantNull:
        throw new UnsupportedOperationException("VariantNull modification not supported.");
      case Variant.VariantShort:
        if(value instanceof Number)
        {
          variants[iindex].putShortRef(((Number)value).shortValue());
          break;
        }
        else
          throw new ConversionException(value.getClass().getName() + " could not be converted to VariantShort.");
      case Variant.VariantInt:
        if(value instanceof Number)
        {
          variants[iindex].putIntRef(((Number)value).intValue());
          break;
        }
        else
          throw new ConversionException(value.getClass().getName() + " could not be converted to VariantInt.");
      case Variant.VariantLongInt:
        //throw new UnsupportedVariantTypeException("Type Long not supported for byref modification.");
         if(value instanceof Number)
         {
           variants[iindex].putLongRef(((Number)value).longValue());
           break;
         }
         else
           throw new ConversionException(value.getClass().getName() + " could not be converted to VariantFloat.");
      case Variant.VariantFloat:
        if(value instanceof Number)
        {
          variants[iindex].putFloatRef(((Number)value).floatValue());
          break;
        }
        else
          throw new ConversionException(value.getClass().getName() + " could not be converted to VariantFloat.");
      case Variant.VariantDouble:
        if(value instanceof Number)
        {
          variants[iindex].putDoubleRef(((Number)value).doubleValue());
          break;
        }
        else
          throw new ConversionException(value.getClass().getName() + " could not be converted to VariantDouble.");
      case Variant.VariantDecimal:
        if(value instanceof Number)
        {
          if(value instanceof BigDecimal)
            variants[iindex].putDecimalRef(VariantSupport.roundToMsDecimal((BigDecimal)value));
          else if(value instanceof BigInteger)
            variants[iindex].putDecimalRef(new BigDecimal((BigInteger)value));
          else if(value instanceof Byte || value instanceof Short || value instanceof Integer || value instanceof Long)
            variants[iindex].putDecimalRef(new BigDecimal(((Number)value).longValue()));
          else 
            variants[iindex].putDecimalRef(new BigDecimal(((Number)value).doubleValue()));
          
          break;
        }
        else
          throw new ConversionException(value.getClass().getName() + " could not be converted to VariantDecimal.");
      case Variant.VariantCurrency:
        //TODO: Add currency support.
        throw new UnsupportedVariantTypeException("Type Currency not supported for byref modification.");
      case Variant.VariantDate:
        if(value instanceof Date)
        {
          variants[iindex].putDateRef((Date)value);
          break;
        }
        else
          throw new ConversionException(value.getClass().getName() + " could not be converted to VariantDate.");
      case Variant.VariantString:
        variants[iindex].putStringRef(value.toString());
        break;
      case Variant.VariantDispatch:
        if(value instanceof ActiveXObject)
        {
          variants[iindex].putDispatchRef(((ActiveXObject)value).activex);
          break;
        }
        else
          throw new ConversionException(value.getClass().getName() + " could not be converted to VariantDispatch.");
      case Variant.VariantError:
        if(value instanceof Number)
        {
          variants[iindex].putErrorRef(((Number)value).intValue());
          break;
        }
        else
          throw new ConversionException(value.getClass().getName() + " could not be converted to VariantError.");
      case Variant.VariantBoolean:
        if(value instanceof Boolean)
        {
          variants[iindex].putBooleanRef(((Boolean)value).booleanValue());
          break;
        }
        else
          throw new ConversionException(value.getClass().getName() + " could not be converted to VariantBoolean.");
      case Variant.VariantVariant:
        variants[iindex].putVariant(VariantSupport.toVariant(value, false));
      case Variant.VariantObject:
        throw new UnsupportedVariantTypeException("VariantObject");
      case Variant.VariantByte:
        if(value instanceof Number)
        {
          variants[iindex].putByteRef(((Number)value).byteValue());
          break;
        }
        else
          throw new ConversionException(value.getClass().getName() + " could not be converted to VariantByte.");
      case Variant.VariantTypeMask:
        throw new UnsupportedVariantTypeException("VariantTypeMask");
      default:
        throw new UnsupportedOperationException("Variant type " + type + ".");
    }
  }
  
  /**
   * Indicates whether or not a value is passed by reference.  Modifications to byref values will be reflected
   * in the calling scope.
   * @param index Index.
   * @return {@code true} if value at index is passed by reference.
   */
  public boolean isByref(int index)
  {
    return (variants[index].getvt() & Variant.VariantByref) != 0;  
  }
  
  /**
   * Size of the contained variant array.
   * @return Size of the contained variant array.
   */
  public int size()
  {
    return variants.length;
  }
  
  /**
   * The variant may not be modified.
   */
  public class ReadOnlyException extends UnsupportedOperationException
  {
	private static final long serialVersionUID = -1537821626558178917L;

	ReadOnlyException(String message)
    {
      super(message);
    }
  }
  
  /**
   * Object type could not be converted to a specific variant type.
   */
  public class ConversionException extends UnsupportedOperationException
  {
	private static final long serialVersionUID = -546990235383105577L;

	ConversionException(String message)
    {
      super(message);
    }
  }
  
  public String toString()
  {
    return "EventArgs" + VariantSupport.vArrToString(variants);
  }
}
