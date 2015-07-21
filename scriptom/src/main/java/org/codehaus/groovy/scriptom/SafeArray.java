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

import com.jacob.com.Variant;

import groovy.lang.GString;
import groovy.lang.GroovyObjectSupport;
import groovy.lang.IntRange;
import groovy.lang.Range;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * <p>Dynamic Groovy proxy around{@code com.jacob.com.SafeArray}instances.</p>
 * 
 * <p>This supports all the data types that are supported by the JACOB
 * {@code SafeArray}class. Note that{@code SafeArray}only supports a subset of the
 * available Variant types.</p>
 * 
 * <p>As an example, the following VB6 function is compiled into a DLL.
 * It returns a 2-D array of 32-bit integers, where the value
 * of each cell is <code>I + J</code>:</p>
 * 
 * <pre> Public Function GetArray() As Variant
 * Dim A As Variant
 * Dim I As Long
 * Dim J As Long
 * 
 * A = Array()
 * ReDim A(1 To 3, 1 To 3) As Long
 * 
 * For I = 1 To 3
 * For J = 1 To 3
 * A(I, J) = I + J
 * Next J
 * Next I
 * 
 * Get2DIntArray = A
 * End Function</pre>
 * 
 * <p>On the Groovier side of things, we create the ActiveX component using
 * {@link org.codehaus.groovy.scriptom.ActiveXObject}.
 * The data-type is <code>INTEGER</code>.
 * There are 2 dimensions.  The bounds are from
 * 1 to 3 on both dimensions.  And notice how you access each element
 * using multiple indexes, which is different from Java syntax.</p>
 * 
 * <pre> def iArr2D = new ActiveXProxy("ScriptomTest.TestArrays").GetArray()
 * def iArr2D = testObj.GetArray()
 * assert iArr2D.type == SafeArray.INTEGER
 * assert iArr2D.dimensions == 2
 * assert iArr2D.bounds[0] == 1..3
 * assert iArr2D.bounds[1] == 1..3
 * 
 * iArr2D.bounds[0].each {i->
 * iArr2D.bounds[1].each {j ->
 * assert <i><b>iArr2D[i, j]</b></i> == i + j
 * println "arr[$i, $j] == ${<i><b>iArr2D[i, j]</b></i>}"
 * }
 * }</pre>
 * 
 * <p>I'll bet you never thought that COM could be so groovy!</p>
 * 
 * 
 * @author Jason Smith
 */
public class SafeArray extends GroovyObjectSupport
{
  /** {@code SafeArray} contains {@code String} data. */
  public static final int STRING = Variant.VariantString;

  /** {@code SafeArray} contains {@code Boolean} data. */
  public static final int BOOLEAN = Variant.VariantBoolean;

  /** {@code SafeArray} contains {@code Byte} data. */
  public static final int BYTE = Variant.VariantByte;

  /** {@code SafeArray} contains {@code Double} data. */
  public static final int DOUBLE = Variant.VariantDouble;

  /** {@code SafeArray} contains {@code Float} data. */
  public static final int FLOAT = Variant.VariantFloat;

  /** {@code SafeArray} contains {@code Short} data. */
  public static final int SHORT = Variant.VariantShort;
  
  /** {@code SafeArray} contains {@code Integer} data. */
  public static final int INTEGER = Variant.VariantInt;
  
  /** {@code SafeArray} contains {@code Long} data. */
  //public static final int LONG = Variant.VariantLongInt;

  /** {@code SafeArray} contains {@code Variant} data; that is, 
   *  anything that can be contained in the {@code Variant} data type.
   *  {@code Variant} data is automatically marshalled to and from
   *  Java object types.
   */
  public static final int VARIANT = Variant.VariantVariant;

  com.jacob.com.SafeArray array = null;
  
  SafeArray(com.jacob.com.SafeArray array)
  {
    this.array = array;
  }
  
  /**
   * Creates a new n-dimensional {@code SafeArrayProxy}.
   * @param type Type code that defines what kind of data this array stores.
   * @param dimensions A list of {@code Integer} ranges, each specifying one dimension.
   * @throws IllegalArgumentException A range is empty, or the values in the range
   *           cannot be converted to an {@code Integer}.
   */
  public SafeArray(int type, Range[] dimensions)
  {
    if(!(type == STRING 
      || type == BOOLEAN 
      || type == BYTE 
      || type == DOUBLE 
      || type == FLOAT 
      || type == SHORT
      || type == INTEGER
      //|| type == LONG
      || type == VARIANT))
    {
      throw new UnsupportedVariantTypeException(type);
    }
    
    if(dimensions == null || dimensions.length == 0)
    {
      array = new com.jacob.com.SafeArray(type); 
    }
    else
    {
      int[] lbound = new int[dimensions.length];
      int[] length = new int[dimensions.length];
      for(int i=0; i<dimensions.length; i++)
      {
        Range range = dimensions[i];
        
        if(range.isEmpty())
        {
          throw new IllegalArgumentException("Range " + i + " is empty.");
        }
        
        if(!(range.get(0) instanceof Number))
        {
          throw new IllegalArgumentException("Range " + i + " is not numeric.");
        }
        
        int start = ((Number)range.get(0)).intValue();
        int end = ((Number)range.get(range.size()-1)).intValue();
        if(start > end)
        {
          int temp = start;
          start = end;
          end = temp;
        }
        
        lbound[i] = start;
        length[i] = end - start + 1;
      }
      this.array = new com.jacob.com.SafeArray(type, lbound, length);
    }
  }
  
  /**
   * Creates a new 1-D {@code SafeArrayProxy}.
   * @param type Type code that defines what kind of data this array stores.
   * @param dimension1 The range of the first dimension.
   */
  public SafeArray(int type, Range dimension1)
  {
    this(type, new Range[] {dimension1});
  }
  
  /**
   * Creates a new 2-D {@code SafeArrayProxy}.
   * @param type Type code that defines what kind of data this array stores.
   * @param dimension1 The range of the first dimension.
   * @param dimension2 The range of the second dimension.
   */
  public SafeArray(int type, Range dimension1, Range dimension2)
  {
    this(type, new Range[] {dimension1, dimension2});  
  }

  /**
   * Creates a new 3-D {@code SafeArrayProxy}.
   * @param type Type code that defines what kind of data this array stores.
   * @param dimension1 The range of the first dimension.
   * @param dimension2 The range of the second dimension.
   * @param dimension3 The range of the third dimension.
   */
  public SafeArray(int type, Range dimension1, Range dimension2, Range dimension3)
  {
    this(type, new Range[] {dimension1, dimension2, dimension3});  
  }
  
  
  /**
   * Initialize a 1-dimensional {@code SafeArray} with type {@code String}.
   * @param array The array.
   */
  public SafeArray(String[] array)
  {
    this(STRING, new IntRange(0, array.length-1));
    for(int i=0; i<array.length; i++)
    {
      putAt(Integer.valueOf(i), array[i]);
    }
  }

  /**
   * Initialize a 1-dimensional {@code SafeArray} with type {@code boolean}.
   * @param array The array.
   */  
  public SafeArray(boolean[] array)
  {
    this(BOOLEAN, new IntRange(0, array.length-1));
    for(int i=0; i<array.length; i++)
    {
      putAt(Integer.valueOf(i), Boolean.valueOf(array[i]));
    }
  }

  /**
   * Initialize a 1-dimensional {@code SafeArray} with type {@code byte}.
   * @param array The array.
   */  
  public SafeArray(byte[] array)
  {
    this(BYTE, new IntRange(0, array.length-1));
    for(int i=0; i<array.length; i++)
    {
      putAt(Integer.valueOf(i), Byte.valueOf(array[i]));
    }
  }
  
  /**
   * Initialize a 1-dimensional {@code SafeArray} with type {@code double}.
   * @param array The array.
   */  
  public SafeArray(double[] array)
  {
    this(DOUBLE, new IntRange(0, array.length-1));
    for(int i=0; i<array.length; i++)
    {
      putAt(Integer.valueOf(i), Double.valueOf(array[i]));
    }
  }

  /**
   * Initialize a 1-dimensional {@code SafeArray} with type {@code float}.
   * @param array The array.
   */    
  public SafeArray(float[] array)
  {
    this(FLOAT, new IntRange(0, array.length-1));
    for(int i=0; i<array.length; i++)
    {
      putAt(Integer.valueOf(i), Float.valueOf(array[i]));
    }
  }

  /**
   * Initialize a 1-dimensional {@code SafeArray} with type {@code short}.
   * @param array The array.
   */    
  public SafeArray(short[] array)
  {
    this(SHORT, new IntRange(0, array.length-1));
    for(int i=0; i<array.length; i++)
    {
      putAt(Integer.valueOf(i), Short.valueOf(array[i]));
    }
  }

  /**
   * Initialize a 1-dimensional {@code SafeArray} with type {@code int}.
   * @param array The array.
   */  
  public SafeArray(int[] array)
  {
    this(INTEGER, new IntRange(0, array.length-1));
    for(int i=0; i<array.length; i++)
    {
      putAt(Integer.valueOf(i), Integer.valueOf(array[i]));
    }
  }
  
  /**
   * Initialize a 1-dimensional {@code SafeArray} with type {@code long}.
   * @param array The array.
   */  
  //public SafeArray(long[] array)
  //{
  //  this(LONG, new IntRange(0, array.length-1));
  //  for(int i=0; i<array.length; i++)
  //  {
  //    putAt(Integer.valueOf(i), Long.valueOf(array[i]));
  //  }
  //}
  
  /**
   * Initialize a 1-dimensional {@code SafeArray} with type {@code Object}.
   * @param array The array.
   */  
  public SafeArray(Object[] array)
  {
    this(VARIANT, new IntRange(0, array.length-1));
    for(int i=0; i<array.length; i++)
    {
      putAt(Integer.valueOf(i), array[i]);
    }
  }
  
  /**
   * The type-code for this array.  Note that {@code SafeArrays} do not support
   * all the types that can be stored in a Variant.  
   * @return The type-code for this array.
   * @see #STRING
   * @see #BOOLEAN
   * @see #BYTE
   * @see #DOUBLE
   * @see #FLOAT
   * @see #SHORT
   * @see #VARIANT
   */
  public int getType()
  {
    return array.getvt();
  }
  
  /**
   * Indexed gettor which supports multiple-dimensioned {@code SafeArrays}.
   * @param index Either an {@code Integer} or a {@code java.util.List} of {@code Integers}.
   * @return The value within the array at the given index.
   */
  public Object getAt(Object index)
  {
    int vt = array.getvt();
    
    if(vt == STRING)
      return array.getString(indexToArray(index));
    else if(vt == BOOLEAN)
      return Boolean.valueOf(array.getBoolean(indexToArray(index)));
    else if(vt == BYTE)
      return Byte.valueOf(array.getByte(indexToArray(index)));
    else if(vt == DOUBLE)
      return Double.valueOf(array.getDouble(indexToArray(index)));
    else if(vt == FLOAT)
      return Float.valueOf(array.getFloat(indexToArray(index)));
    else if(vt == INTEGER)
      return Integer.valueOf(array.getInt(indexToArray(index)));
    //else if(vt == LONG)
    //  return Long.valueOf(array.getLong(indexToArray(index)));
    else if(vt == SHORT)
      return Short.valueOf(array.getShort(indexToArray(index)));
    else if(vt == VARIANT)
      return VariantSupport.toObject(array.getVariant(indexToArray(index)));  
    else
      throw new UnsupportedVariantTypeException(vt);
  }
  
  /**
   * Indexed settor which supports multiple-dimensioned {@code SafeArrays}.
   * @param index Either an {@code Integer} or a {@code java.util.List} of {@code Integers}.
   * @param value The value to put into the array at the given index.
   */
  public void putAt(Object index, Object value)
  {
    int vt = array.getvt();
    
    if(value instanceof GString)
      value = value.toString();
    
    if(vt == STRING)
      array.setString(indexToArray(index), value.toString());
    else if(vt == BOOLEAN)
    {
      boolean v = false;
      if(value instanceof Boolean)
        v = ((Boolean)value).booleanValue();
      else if(value instanceof Number)
        v = ((Number)value).intValue() != 0;
      else
        throw new ClassCastException("Type " + value.getClass().getName() + " cannot be converted to a Boolean.");
        
      array.setBoolean(indexToArray(index), v);  
    }
    else if(vt == BYTE)
      array.setByte(indexToArray(index), ((Number)value).byteValue());
    else if(vt == DOUBLE)
      array.setDouble(indexToArray(index), ((Number)value).doubleValue());
    else if(vt == FLOAT)
      array.setFloat(indexToArray(index), ((Number)value).floatValue());
    else if(vt == INTEGER)
      array.setInt(indexToArray(index), ((Number)value).intValue());
    //Include support for Long here.
    else if(vt == SHORT)
      array.setShort(indexToArray(index), ((Number)value).shortValue());
    else if(vt == VARIANT)
      array.setVariant(indexToArray(index), VariantSupport.toVariant(value, false));
    else
      throw new UnsupportedVariantTypeException(vt);
  }
  
  /**
   * The number of dimensions of the array.
   * @return The number of dimensions of the array.
   */
  public int getDimensions()
  {
    return array.getNumDim();
  }
  
  /**
   * The upper bound.
   * @param dimension The dimension.  First dimension is 0.
   * @return The upper bound for a given dimension.
   */
  public int getUpperBound(int dimension)
  {
    return array.getUBound(dimension + 1);
  }

  /**
   * The lower bound.
   * @param dimension The dimension.  First dimension is 0.
   * @return The lower bound for a given dimension.
   */  
  public int getLowerBound(int dimension)
  {
    return array.getLBound(dimension + 1);
  }
  
  /**
   * The upper bound for the first dimension.
   * @return The upper bound for the first dimension.
   */
  public int getUpperBound()
  {
    return getUpperBound(0);
  }

  /**
   * The lower bound for the first dimension.
   * @return The lower bound for the first dimension.
   */  
  public int getLowerBound()
  {
    return getLowerBound(0);
  }
  
  /**
   * The bounds as a {@code List} of Grovvy {@code Range} instances.
   * This is the most convenient way to get bounds information.
   * @return The bounds as a {@code List} of Grovvy {@code Range} instances.
   */
  public ArrayList<Range> getBounds()
  {
    ArrayList<Range> bounds = new ArrayList<Range>(getDimensions());
    for(int i=0; i<getDimensions(); i++)
    {
      bounds.add(new IntRange(getLowerBound(i), getUpperBound(i)));
    }
    return bounds;
  }
  
  /**
   * Converts the indexer(s) passed in to an {@code int[]}.<p>
   * 
   * The indexer can either be a standalone {@code Integer}, or a {@code List}
   * of {@code Integer} values.  Also, they don't strictly have to be {@code Integers}.
   * Any {@code Number} type is supported.  Floating point types will be converted
   * to integer types using the standard Java conversion (truncate the fractional
   * value).  We recommend that you only use integer types as array indexes.
   * 
   * @param index Either an {@code Integer} or a {@code java.util.List} of {@code Integers}.
   * @return The equivalent {@code int[]}.
   * @throws ClassCastException Something could not be converted to an {@code Integer}.
   */
  private int[] indexToArray(Object index)
  {
    List temp = null;
    if(index instanceof List)
    {
      temp = (List)index;
    }    
    else
    {
      temp = new ArrayList();
      temp.add(index);
    }
    
    int[] result = new int[temp.size()];
    int param = 0;
    for(Iterator i=temp.iterator(); i.hasNext(); )
    {
      Object o = i.next();
    
      if(o instanceof Integer)
      {
        result[param] = ((Integer)o).intValue();
      }
      if(o instanceof Number)
      {
        result[param] = ((Number)o).intValue();
      }
      else
      {
        throw new ClassCastException("Parameter " + param + "; " + o.getClass().getName() + " cannot be cast to Number."); 
      }
      param++;
    }
    
    if(result.length != getDimensions())
      throw new IndexOutOfBoundsException("Array has " + getDimensions() + " dimensions, not " + result.length + ".");
      
    for(int i=0; i<result.length; i++)
    {
      if(result[i] < getLowerBound(i) || result[i] > getUpperBound(i))
        throw new IndexOutOfBoundsException("Valid range of index " + i + " is " + getLowerBound(i) + ".." + getUpperBound(i) + ". Invalid index: " + result[i]);
    }
    
    return result;
  }
  
  /**
   * Releases the COM resources.
   * @throws Throwable
   */
  protected void finalize() throws Throwable
  {
    array.safeRelease();
    super.finalize();
  }
  
  public String toString()
  {
    StringBuffer s = new StringBuffer();
    for(Iterator i = getBounds().iterator(); i.hasNext(); )
    {
      Range range = (Range)i.next(); 
      if(s.length()>0) s.append(", ");
      s.append(range.get(0).toString() + ".." + range.get(range.size()-1).toString());
    }
    return "SafeArray-" + VariantSupport.vtToString(array.getvt()).toUpperCase() + "[" + s.toString() + "]{...}";
  }
  
  /**
   * The array as a list. Multi-dimensional arrays create a nested list structure.
   * @return The array as a list.
   */
  public ArrayList toList()
  {
    LinkedList bounds = new LinkedList(getBounds());
    if(bounds.size() < 1)
      return null;
    else
    {
      LinkedList indexes = new LinkedList();
      return (ArrayList)recToList(bounds, indexes);
    }
  }
  
  /**
   * {@code bounds} is deconstructed down the stack, and {@code indexes} is constructed.
   * @param bounds The dimensions of the array.
   * @param indexes A list of index values, one for each dimension.
   * @return An n-dimensional list.
   */
  private Object recToList(LinkedList bounds, LinkedList indexes)
  {
    if(bounds.size() == 0)
    {
      return getAt(indexes); 
    }
    else
    {
      Range bound = (Range)bounds.getFirst();
      ArrayList result = new ArrayList(bound.size());
      int first = ((Integer)bound.get(0)).intValue();
      int last = first + bound.size() - 1;
      for(int i=first; i<=last; i++)
      {
        LinkedList newIndexes = new LinkedList(indexes);
        newIndexes.add(Integer.valueOf(i));
        LinkedList newBounds = new LinkedList(bounds);
        newBounds.removeFirst();
        result.add(recToList(newBounds, newIndexes));  
      }
      return result;
    }      
  }
  
  /**
   * Returns the equivalent typed array.  The type of array can be String[], boolean[], byte[], double[], 
   * float[], short[], integer[] or Object[].  Only 1-dimensional arrays are supported.  Arrays are rebased
   * to 0.
   * @return The equivalent typed array.
   */
  public Object toArray()
  {
    if(getDimensions() != 1)
      throw new UnsupportedOperationException("Conversion to an array is only supported for 1-dimensional arrays.");
    
    int size = getUpperBound() - getLowerBound() + 1;
    switch(this.getType())
    {
      case STRING:
        return (String[])toList().toArray(new String[size]);
      case BOOLEAN:
      {
        boolean[] result = new boolean[size];
        ArrayList values = toList();
        for(int i=0; i<size; i++)
        {
          result[i] = ((Boolean)values.get(i)).booleanValue();
        }
        return result;
      }
      case BYTE:
      {
        byte[] result = new byte[size];
        ArrayList values = toList();
        for(int i=0; i<size; i++)
        {
          result[i] = ((Byte)values.get(i)).byteValue();
        }
        return result;
      }
      case DOUBLE:
      {
        double[] result = new double[size];
        ArrayList values = toList();
        for(int i=0; i<size; i++)
        {
          result[i] = ((Double)values.get(i)).doubleValue();
        }
        return result;
      }
      case FLOAT:
      {
        float[] result = new float[size];
        ArrayList values = toList();
        for(int i=0; i<size; i++)
        {
          result[i] = ((Float)values.get(i)).floatValue();
        }
        return result;
      }
      case SHORT:
      {
        short[] result = new short[size];
        ArrayList values = toList();
        for(int i=0; i<size; i++)
        {
          result[i] = ((Short)values.get(i)).shortValue();
        }
        return result;
      }
      case INTEGER:
      {
        int[] result = new int[size];
        ArrayList values = toList();
        for(int i=0; i<size; i++)
        {
          result[i] = ((Integer)values.get(i)).intValue();
        }
        return result;
      }
      //case LONG:
      //{
      // ...
      //}
      default:
      {
        Object[] result = new Object[size];
        ArrayList values = toList();
        for(int i=0; i<size; i++)
        {
          result[i] = values.get(i);
        }
        return result;
      }
    }
  }
}