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
import com.jacob.com.ComException;
import com.jacob.com.ComFailException;
import com.jacob.com.Dispatch;
import com.jacob.com.DispatchEvents;
import com.jacob.com.EnumVariant;
import com.jacob.com.InvocationProxy;
import com.jacob.com.Variant;

import groovy.lang.Closure;
import groovy.lang.GString;
import groovy.lang.GroovyObjectSupport;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.codehaus.groovy.runtime.InvokerHelper;


/**
 * <p>Dynamic Groovy proxy around ActiveX COM components.</p>
 *
 * @author Guillaume Laforge
 * @author Dierk Koenig, adapted to Jacob 1.9
 * @author Marc Guillemot
 * @author Jason Smith
 */
public final class ActiveXObject extends GroovyObjectSupport implements Iterable
{
  static
  {
    Scriptom.load();
  }
  
  ActiveXComponent activex;
  EventSupport eventSupport = new EventSupport();
  private boolean released = false;
  private Map dispatchIds = new HashMap();
  private Map usePropertyAccessor = new HashMap();
  
  /**
   * Used by com.jacob.com.DispatchEvents to find the typelib associated with this object.
   */
  String eventsProgId = null;

  /**
   * <p>Build a GroovyObject proxy for an ActiveX component -
   * where the ActiveX component represents a new instance of
   * a COM automation server -
   * leveraging Groovy's metaprogramming facilities.</p>
   *
   * <p>Most code should use the standard {@code ActiveXObject(String)} contructor
   * and not this factory method.  This method exists for applications
   * that need special behavior.</p>
   *
   * @param clsId the name of the application or the Class ID of the component.
   */
  public static ActiveXObject createObject(final String clsId)
  {
    ActiveXObject axo = new ActiveXObject(ActiveXComponent.createNewInstance(clsId));
    axo.eventsProgId = clsId;
    return axo;
  }

  /**
   * <p>Build a GroovyObject proxy for an ActiveX component -
   * where the ActiveX component represents an existing instance of
   * a COM automation server -
   * leveraging Groovy's metaprogramming facilities.</p>
   *
   * <p>Most code should use the standard {@code ActiveXObject(String)} contructor
   * and not this factory method.  This method exists for applications
   * that need special behavior.</p>
   *
   * @param clsId the name of the application or the Class ID of the component.
   */
  public static ActiveXObject getObject(final String clsId)
  {
    ActiveXObject axo = new ActiveXObject(ActiveXComponent.connectToActiveInstance(clsId));
    axo.eventsProgId = clsId;
    return axo;
  }
  
  
  /**
   * <p>Build a GroovyObject proxy for an ActiveX component,
   * leveraging Groovy's metaprogramming facilities</p>
   *
   * <p>Example:</p>
   * <code>
   * excel = new ActiveXObject("Excel.Application")
   * explorer = new ActiveXObject("InternetExplorer.Application")
   * // call with Internet Explorer clsid
   * explorer = new ActiveXObject("clsid:{0002DF01-0000-0000-C000-000000000046}")
   * </code>
   *
   * @param clsId the name of the application or the Class ID of the component.
   */
  public ActiveXObject(final String clsId)
  {
    try
    {
      activex = new ActiveXComponent(clsId);  
      eventsProgId = clsId;
    }
    catch(ComFailException e)
    {
      throw new CreationException("Could not create ActiveX object: '" + clsId + "'; " + e.getMessage(), e);  
    }
  }
  
  /**
   * An error occurred creating the ActiveX object.
   */
  public class CreationException extends IllegalArgumentException
  {
	private static final long serialVersionUID = 1297102891963221428L;

	CreationException(String message, Throwable t)
    {
      super(message, t);
    }
  }

  /**
   * Constructs a new proxy from an existing ActiveX component.
   * @param activex The ActiveX component.
   */
  ActiveXObject(final ActiveXComponent activex)
  {
    this.eventsProgId = null;
    this.activex = activex;
  }
  
  /**
   * Return a different interface by IID (interface ID) string.<p>
   * 
   * Once you have an {@code ActiveXObject}, you can navigate to the other 
   * interfaces of a COM object by calling QueryInterface. 
   * The argument is an IID string in the format: 
   * "{9BF24410-B2E0-11D4-A695-00104BFF3241}". You typically get 
   * this string from the idl file (it's called uuid in there).
   * Scriptom includes IIDs of all the interfaces in select type libraries.<p>
   * 
   * Of course, the object must actually support the requested interface
   * or an exception is thrown.
   * 
   * @param iid The IID string in format "{9BF24410-B2E0-11D4-A695-00104BFF3241}".
   * @return The object, cast to a different interface.
   */
  public ActiveXObject toInterface(String iid)
  {
    ActiveXObject axo = new ActiveXObject(new ActiveXComponent(activex.QueryInterface(iid)));
    axo.eventsProgId = this.eventsProgId;
    return axo;
  }
  
  public boolean supportsInterface(String iid)
  {
    try
    {
      activex.QueryInterface(iid);
      return true;
    }
    catch(ComFailException e)
    {
      if(e.getMessage().equals("QI on IID from String Failed"))
        return false;
      else
        throw new IllegalArgumentException(e.getMessage() + " \"" + iid + "\"", e);
    }
  }

  /**
   * Overrides Groovy's {@code getProperty} behavior to pull from the ActiveX component.
   *
   * @param propName the name of the property
   * @return the value associated with the property name
   */
  public Object getProperty(final String propName)
  {
    checkReleased();
    
    if("events".equals(propName))
      return eventSupport;
    else if("class".equals(propName))
      return getClass();
    else
    {
      try
      {
        //usePropertyAccessor caches the result of the test to see if we want to
        //use a property accessor for this property.  The test involves throwing
        //an exception, so it's slow.  This speeds it up on subsequent calls.
        if(usePropertyAccessor.containsKey(propName))
        {
          return new PropertyAccessor(propName);
        }
        else
        {
          if(Scriptom.debug()) System.err.println("DEBUG PROP GET " + propName);
          return VariantSupport.toObject(activex.getProperty(propName));
        }
      }
      catch(ComException e)
      {
        if(e.getMessage().indexOf("Description: Parameter not optional.") >= 0
          || e.getMessage().indexOf("Description: Invalid number of parameters.") >= 0)
        {
          if(Scriptom.debug()) System.err.println("\tDEBUG switching to PropertyAccessor");
          usePropertyAccessor.put(propName, Boolean.valueOf(true));
          return new PropertyAccessor(propName);
        }
        else
        {
          throw e;
        }
      }
    }
  }
  
  /**
   * Provides get/set access to a property when the property has been determined
   * to have one or more indexers.  Note that due to syntax limitations, this will
   * <b>not</b> work if you are trying to access a property with indexers where
   * <b>all</b> of the accessors are optional.  For that case, use the method syntax
   * instead ({@code _set*} and {@code _get*}).
   */
  public final class PropertyAccessor extends GroovyObjectSupport
  {
    private String name;
    
    /**
     * Constructor.
     * @param propName The name (method name) of the property.
     */
    PropertyAccessor(String propName)
    {
      this.name = propName;
    }
    
    /**
     * If the index is a single String value, this gets called instead of {@code getAt},
     * consistent with Groovy specs.
     * @param index The single String index.
     * @return The value of the property.
     */
    public Object getProperty(String index)
    {
      return getAt(index);
    }
    
    /**
     * If the index is a single String value, this gets called instead of {@code putAt},
     * consistent with Groovy specs.
     * @param index The single String index.
     * @param value The value to set.
     */
    public void setProperty(String index, Object value)
    {
      putAt(index, value);  
    }
    
    /**
     * Handles all indexed gets.
     * @param index The index.
     * @return The value.
     */
    public Object getAt(Object index)
    {
      try
      {
        List indexes = null;
        if(!(index instanceof List))
          indexes = Arrays.asList(new Object[] {index});
        else
          indexes = (List)index;
          
        Variant[] variants = new Variant[indexes.size()];
        for(int i=0; i<indexes.size(); i++)
        {
          variants[i] = VariantSupport.toVariant(indexes.get(i), false);
        }
        
        if(Scriptom.debug())
        {
          StringBuffer s = new StringBuffer();
          for(int i=0; i<variants.length; i++)
          {
            if(i>=1) s.append(", ");
            s.append("[" + VariantSupport.vtToString(variants[i].getvt()) + "]" + VariantSupport.toObject(variants[i]).toString());
          }
          System.out.println("DEBUG ACCESSOR GET " + name + "(" + s.toString() + ")");
        }
        
        if(!dispatchIds.containsKey(name))
          dispatchIds.put(name, Integer.valueOf(Dispatch.getIDOfName(activex, name)));
        
        return VariantSupport.toObject(Dispatch.callN(activex, ((Integer)dispatchIds.get(name)).intValue(), variants));
      }
      catch(Throwable t)
      {
        Object[] objs = InvokerHelper.asArray(index);
        StringBuilder message = new StringBuilder(); 
        message.append(name + "(");
        for(int i=0; i<objs.length; i++)
        {
          if(i>0) message.append(",");
          if(objs[i] == null)
            message.append("null");
          else
            message.append(objs[i].getClass().getName());
        }
        message.append(")");
          
        throw new Error("Error getting property: " + message.toString(), t);    
      }
    }
    
    /**
     * Handles all indexed puts.
     * @param index The index.
     * @param value The value.
     */
    public void putAt(Object index, Object value)
    {
      try
      {
        List indexes = null;
        if(!(index instanceof List))
          indexes = Arrays.asList(new Object[] {index});
        else
          indexes = (List)index;
        
        Variant[] variants = new Variant[indexes.size() + 1];
        for(int i=0; i<indexes.size(); i++)
        {
          variants[i] = VariantSupport.toVariant(indexes.get(i), false);
        }
        variants[variants.length-1] = VariantSupport.toVariant(value, false);
  
        if(!dispatchIds.containsKey(name))
          dispatchIds.put(name, Integer.valueOf(Dispatch.getIDOfName(activex, name)));
        
        Dispatch.invoke(activex, ((Integer)dispatchIds.get(name)).intValue(), Dispatch.Put, variants, new int[variants.length]);
      }
      catch(Throwable t)
      {
        Object[] objs = InvokerHelper.asArray(index);
        StringBuilder message = new StringBuilder(); 
        message.append(name + "(");
        for(int i=0; i<objs.length; i++)
        {
          if(i>0) message.append(",");
          if(objs[i] == null)
            message.append("null");
          else
            message.append(objs[i].getClass().getName());
        }
        message.append("):");
        if(value == null)
          message.append("null");
        else
          message.append(value.getClass().getName());
          
        throw new Error("Error setting property: " + message.toString(), t);    
      }
    }
    
    /**
     * Wrapper for a {@code ComException} which includes more information about
     * the method call.
     */
    public class Error extends RuntimeException
    {
      Error(String message, Throwable t)
      {
        super(message, t);
      }
    }
  }

  /**
   * Overrides Groovy's {@code invokeMethod} behavior to 
   * invoke a method on an ActiveX component.
   *
   * @param methodName name of the method to call
   * @param parameters parameters of the method call
   * @return the value returned by the method call
   */
  public Object invokeMethod(String methodName, Object parameters)
  {
    checkReleased();
    
    if(methodName.equals("toInterface"))
    {
      if(parameters instanceof String || parameters instanceof GString)
        return toInterface(parameters.toString());
      else
        throw new IllegalArgumentException("toInterface() does not support argument type: " + parameters.getClass().getName());
    }
    else if(methodName.equals("supportsInterface"))
    {
      if(parameters instanceof String || parameters instanceof GString)
        return Boolean.valueOf(supportsInterface(parameters.toString()));
      else
        throw new IllegalArgumentException("supportsInterface() does not support argument type: " + parameters.getClass().getName());
    }
    else
    {
      Object[] objs = InvokerHelper.asArray(parameters);
      
      Variant[] variants = new Variant[objs.length];
      for(int i = 0; i < variants.length; i++)
      {
        variants[i] = VariantSupport.toVariant(objs[i], false);
      }
      
      if(methodName.startsWith("_set") || methodName.startsWith("_put"))
      {
        if(Scriptom.debug()) System.err.println("DEBUG SET/PUT " + methodName + VariantSupport.vArrToString(variants));
  
        methodName = methodName.substring(4); 
        
        if(variants.length == 0)
        {
          throw new IllegalArgumentException("Value is not defined.");
        }
        
        if(!dispatchIds.containsKey(methodName))
          dispatchIds.put(methodName, Integer.valueOf(Dispatch.getIDOfName(activex, methodName)));
        
        Dispatch.invoke(activex, ((Integer)dispatchIds.get(methodName)).intValue(), Dispatch.Put, variants, new int[variants.length]);
        return null;
      }
      else
      {
        if(Scriptom.debug()) System.out.println("DEBUG INVOKE/GET " + methodName + VariantSupport.vArrToString(variants));
  
        if(methodName.startsWith("_get"))
        {
          methodName = methodName.substring(4); 
        }
        
        if(!dispatchIds.containsKey(methodName))
          dispatchIds.put(methodName, Integer.valueOf(Dispatch.getIDOfName(activex, methodName)));
        Variant v = Dispatch.callN(activex, ((Integer)dispatchIds.get(methodName)).intValue(), variants);
        Object result = VariantSupport.toObject(v);
        if(Scriptom.debug() && result != null) System.out.println("\tDEBUG INVOKE/GET RESULT: " + result.toString());
        return result;
      }
    }
  }

  /**
   * Overrides Groovy's {@code setProperty} behavior to set the value on the
   * ActiveX component.
   *
   * @param propertyName name of the property to set
   * @param newValue     new value of the property
   */
  public void setProperty(String propertyName, Object newValue)
  {
    checkReleased();
    Variant v = VariantSupport.toVariant(newValue, false);
    if(Scriptom.debug()) System.err.println("DEBUG PROP SET " + propertyName + "(" + VariantSupport.vToString(v) + ")");
    activex.setProperty(propertyName, v);
  }

  /**
   * Checks if the object has already been released.
   * @throws IllegalStateException if already released
   */
  protected void checkReleased()
  {
    if(released)
    {
      throw new IllegalStateException("Object has already been released");
    }
  }

  /**
   * Frees the COM resources used by this proxy.
   * This method is called by {@link #finalize()} but it is safer to explicitely release
   * the associated resources in particular when used in a script as the JVM may decide that
   * it is not necessary to call {@link #finalize()}. 
   */
  public void safeRelease()
  {
    if(!released)
    {
      released = true;
      eventSupport.safeRelease();
      activex.safeRelease();
    }
  }

  /**
   * Called upon garbage collection.
   * @throws Throwable
   */
  protected void finalize()
    throws Throwable
  {
    try
    {
      safeRelease();
    }
    finally
    {
      super.finalize();
    }
  }

  /**
   * Returns an iterator based on {@code com.jacob.com.EnumVariant} for this
   * ActiveX component. Note that while this is always available, it will not
   * work unless the component supports COM enumeration.
   * 
   * @return An iterator.
   */
  public Iterator iterator()
  {
    return new VariantIterator();
  }
  
  //public String toString()
  //{
  //  return activex.toString();
  //}
  
  /**
   * Supports enumerating over the collection.  
   */
  private final class VariantIterator implements Iterator
  {
    EnumVariant enumerator = new EnumVariant(activex);
    
    public boolean hasNext()
    {
      return enumerator.hasMoreElements();
    }

    public Object next()
    {
      return VariantSupport.toObject((Variant)enumerator.nextElement());
    }

    public void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
  
  /**
   * Provides support for sinking COM events.<p>
   * 
   * Byref event parameters are not supported.  Return values are ignored.
   * Exceptions do not propagate beyond the thread boundary, though you can
   * specify an exception handler.
   */
  public final class EventSupport extends GroovyObjectSupport
  {
    Map/*<Closure>*/ events           = new HashMap();
    DispatchEvents   dispatchEvents   = null;
    Closure          exceptionHandler = null;

    /**
     * Sets or resets the prog-id for this object.  Allows you to set the prog-id so that
     * events can be supported, even for COM objects that do not support {@code IProvideClassInfo}.<p>
     * 
     * Note that this value must be set prior to defining the first event handler.
     * 
     * @param value The prog-id.
     */
    public void useProgId(String value)
    {
      eventsProgId = value;
    }
    
    /**
     * Groovy property support; maps event names to closures.
     * @param name Event Name.
     * @param value Closure to be executed when event is raised.
     */
    public synchronized void setProperty(final String name, final Object value) 
    {
      if(value == null)
        events.remove(name.toLowerCase());
      else if(value instanceof Closure)
        events.put(name.toLowerCase(), value); 
      else 
        throw new IllegalArgumentException("Event handler for '" + name + "'; " +
          "expected a " + Closure.class.getName() + " but got a " + value.getClass().getName() + ".");
        
      if(dispatchEvents == null && events.size() > 0)
      {
        if(ActiveXObject.this.supportsInterface(Scriptom.IID_IProvideClassInfo))
          dispatchEvents = new DispatchEvents(activex, new GroovyInvocationProxy());
        else
        {
          if(eventsProgId == null)
            throw new IllegalArgumentException("Object does not support IProvideClassInfo interface, and there is no prog-id associated with the object."); 
          else
          {
            Object clsId = VariantSupport.readRegistry("HKCR\\" + eventsProgId + "\\CLSID\\");
            if(clsId == null)
              throw new IllegalArgumentException("Prog-id '" + eventsProgId + "' not found.");
            
            Object localServer = VariantSupport.readRegistry("HKCR\\CLSID\\" + clsId.toString() + "\\LocalServer\\");
            
            if(localServer == null)
            {
              try
              {
                dispatchEvents = new DispatchEvents(activex, new GroovyInvocationProxy(), eventsProgId);
              }
              catch(ComFailException e)
              {
                throw new IllegalArgumentException(eventsProgId + "; " + e.getMessage(), e);
              }
            }
            else
            {
              String ls = null;
              try
              {
                ls = new File(localServer.toString()).getCanonicalPath();
              }
              catch(IOException e)
              {
                throw new RuntimeException(e);  
              }
              
              try
              {
                dispatchEvents = new DispatchEvents(activex, new GroovyInvocationProxy(), eventsProgId, ls);
              }
              catch(ComFailException e)
              {
                throw new IllegalArgumentException(eventsProgId + " (" + ls + "); " + e.getMessage(), e);
              }              
            }
          }
        }
      }
      else if(dispatchEvents != null && events.size() == 0)
        safeRelease(); 
    }
    
    /**
     * Groovy property support; maps event names to closures.
     * @param name Event name.
     * @return The associated closure, or {@code null}.
     */
    public synchronized Object getProperty(final String name)
    {
      if(events.containsKey(name.toLowerCase()))
        return events.get(name.toLowerCase());
      else
        return null;
    }
    
    /**
     * Called automatically when the parent object is released. 
     */
    synchronized void safeRelease()
    {
      if(dispatchEvents != null)
      {
        dispatchEvents.safeRelease();
        dispatchEvents = null;
      }
      events.clear();
    }
    
    /**
     * Clear all event handlers.
     */
    public void clear()
    {
      safeRelease();
    }
    
    /**
     * Allows you to trap and handle any exceptions that occur as the result of an 
     * event.  The closure takes one parameter, which is the {@code Throwable}
     * that occurred.
     * @param handler A closure that takes one argument - the {@code Throwable}.
     */
    public void setExceptionHandler(Closure handler)
    {
      this.exceptionHandler = handler;
    }
    
    /**
     * Invocation proxy for events that uses Groovy closures.
     * Legacy events do not accept a return value.  Putting in an invalid 
     * variant can actually cause a crash.  Since Groovy closures almost
     * always return something, and since that is likely to cause JVM blow-ups,
     * this does not support invocation methods that return values.<p>
     * 
     * Additionally, since Java passes everything by value, there is no
     * easy way to support by-ref parameter passing.  So there is currently
     * no support for passing values directly back to the caller.  However,
     * if the caller passes in a Variant that resolves to an ActiveXProxy, 
     * the values on that can be altered.<p>
     * 
     * This code is thread-safe.  The same event will not run on multiple 
     * threads at the same time.  However, you still need to synchronize with everything
     * else.<p>
     */
    final class GroovyInvocationProxy extends InvocationProxy
    {
      public Variant invoke(String eventName, Variant[] args)
      {
        if(Scriptom.debug()) System.err.println("EVENT {" + Thread.currentThread().getName() + "} " + eventName + VariantSupport.vArrToString(args));

        synchronized(EventSupport.this)
        {
          if(!events.containsKey(eventName.toLowerCase()))
            return null;
        }
        
        Closure handler;
        synchronized(EventSupport.this)
        {
          handler = (Closure)events.get(eventName.toLowerCase());
        }
        
        ClassLoader originalCL = Thread.currentThread().getContextClassLoader();
        try
        {
          synchronized(handler)
          {
            Thread.currentThread().setContextClassLoader(handler.getClass().getClassLoader());
            try
            {
              handler.call(new EventArguments(args));
            }
            catch(Throwable t)
            {
              if(exceptionHandler != null)
              {
                exceptionHandler.call(t);
              }
              else
              {
                throw new ComEventException(t.getMessage(), t);
              }
            }
          }
        }
        finally
        {
          Thread.currentThread().setContextClassLoader(originalCL);
        }
        
        //The return value has to be null or it blows up.
        return null;
      }
    }
   
    public final class ComEventException extends RuntimeException
    {
      ComEventException(String message, Throwable t)
      {
        super(message, t);
      }
    }
  }
}
