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

import com.jacob.com.ComThread;

//import com.lilypepper.groovy.StackTraceUtils2;

import groovy.lang.Closure;

/**
 * Package constant definitions, helper methods, and simplified management
 * for apartment-threading models.<p>
 * 
 * You can freely use the Jacob COM management methods (see {@code com.jacob.com.ComThread})
 * in place of the simplified model presented here. 
 */
public class Scriptom
{
  //TODO: Not quite ready.  AUTOGC makes memory mangement a lot better, but still
  //      causes too many VM crashes.
  //static 
  //{
    //System.setProperty("com.jacob.autogc", "true");  
  //}
  //Slated for support in Groovy 1.2.  Will allow stack traces for Scriptom in
  //cases where the stack trace is sanitized.  Not supported in 1.1.
  //static
  //{
  //  StackTraceUtils2.addClassTest(ScriptomStackTraceSupport.getFilter());
  //}
  
  /**
   * Dummy method that forces Scriptom to load.
   */
  static void load()
  {
  }
  
  private static class IntThreadLocal extends ThreadLocal<Integer>
  {
    protected Integer initialValue()
    {
      return Integer.valueOf(0);
    }
  }
  
  private static class BooleanThreadLocal extends ThreadLocal<Boolean>
  {
    protected Boolean initialValue()
    {
      return Boolean.valueOf(false);
    }
  }
  
  private static ThreadLocal<Integer> countMTA = new IntThreadLocal();
  private static ThreadLocal<Integer> countSTA = new IntThreadLocal();
  
  private static ThreadLocal<Boolean> debug = new BooleanThreadLocal();
  
  /**
   * Value of the EMPTY variant type.
   */
  public static final Object EMPTY = null;
  
  /**
   * Value of the NULL variant type.
   */
  public static final VariantNull NULL = VariantNull.VARIANTNULL;
  
  /**
   * Represents a MISSING argument.
   */
  public static final VariantError MISSING = new VariantError(0x80020004);
  
  /**
   * Class-ID for {@code IProvideClassInfo}, which is an interface used in event handling.
   */
  public static final String IID_IProvideClassInfo = "{B196B283-BAB4-101A-B69C-00AA00341D07}";
  
  static
  {
    if(debug())
    {
      System.err.println("---> SCRIPTOM GLOBAL DEBUGGING IS ON <---");
    }
  }
  
  /**
   * Not creatable.
   */
  private Scriptom()
  {
  }
  
  /**
   * The version of Scriptom in <i>major.minor.sub.build</i> format.
   * @return The version of Scriptom in <i>major.minor.sub.build</i> format.
   */
  public static String getVersion()
  {
    String version = Package.getPackage("org.codehaus.groovy.scriptom").getImplementationVersion();
    return version == null ? "" : version;
  }
  
  /**
   * Call the closure in the context of an MTA.  Supports nesting 
   * {@code withMTA()} calls, but not {@link #withSTA}.
   * @param closure The closure to call.
   * @return The result of the closure.
   * @see #inApartment
   */
  public static Object withMTA(Closure closure)
  {
    initMTA();
    try
    {
      return closure.call();
    }
    finally
    {
      releaseMTA();
    }
  }
  
  /**
   * Call the closure in the context of an STA. Supports nesting 
   * {@code withSTA()} calls, but not {@link #withMTA}. The use of {@code withSTA()}
   * is discouraged, since it appears to cause JVM crashes in testing.
   * @param closure The closure to call.
   * @return The result of the closure.
   * @see #inApartment
   */
  public static Object withSTA(Closure closure)
  {
    initSTA();
    try
    {
      return closure.call();
    }
    finally
    {
      releaseSTA();
    }
  }
  
  /**
   * Call the closure in the context of the current apartment model, defaulting
   * to MTA (the more universally applicable threading model)if no apartment
   * model has been defined.<p>
   * 
   * This is the preferred way to wrap your code in an apartment context, since
   * it works with either STA or MTA models. If you need to specifically use
   * MTA or STA models, use the {@link #withMTA} or {@link #withSTA} methods.
   * Note that MTA and STA methods do not nest and may not be used together
   * in the same thread.
   * 
   * @param closure The closure to call.
   * @return The result of the closure.
   * @see #withMTA
   * @see #withSTA
   */
  public static Object inApartment(Closure closure)
  {
    if(((Number)countSTA.get()).intValue() > 0)
      return withSTA(closure);
    else
      return withMTA(closure);
  }
  
  /**
   * Immediately release current COM resources for this thread, with predjudice.<p>
   * 
   * You shouldn't use this with {@link #inApartment}, {@link #withSTA} or {@link #withMTA} COM 
   * thread management, since these methods take care of cleaning up 
   * after themselves.  Using this within MTA or STA scope will immediately
   * clean out all COM resources, and subsequent calls to existing 
   * {@link ActiveXObject} instances in the thread will result in various 
   * exceptions.<p>
   * 
   * This is intended to be used with Jacob automatic thread management,
   * which uses MTA.  In some cases, the JVM can close before everything is
   * cleaned up, which can leave automation servers 
   * (especially Excel) hanging.  Call this before your script exits
   * to get correct behavior from automation servers. <p>
   * 
   * Of course, it is groovier to use {@link #inApartment}.
   * 
   * @see #withMTA
   * @see #withSTA
   * @see #inApartment
   */
  public static void releaseApartment()
  {
    ComThread.Release();
  }
  
  /**
   * Initialize thread as an MTA (for compatibility with Java).  Calling multiple times nests the call - call 
   * the release method matching multiple times.  Cannot be used in conjunction with
   * STA thread.
   */
  public synchronized static void initMTA()
  {
    if(((Integer)countSTA.get()).intValue() > 0)
      throw new ApartmentStateException("Can't initialize MTA thread; current thread is STA.");
      
    if(((Integer)countMTA.get()).intValue() == 0)
      ComThread.InitMTA();
      
    countMTA.set(Integer.valueOf(((Integer)countMTA.get()).intValue() + 1));
  }
  
  /**
   * Releases the MTA thread (for compatibility with Java).  Called in conjunction with {@link #initMTA}.
   */
  public synchronized static void releaseMTA()
  {
    if(((Integer)countMTA.get()).intValue() == 0)
      throw new ApartmentStateException("Current thread is not MTA.");
      
    countMTA.set(Integer.valueOf(((Integer)countMTA.get()).intValue() - 1));
    
    if(((Integer)countMTA.get()).intValue() == 0)
      ComThread.Release();
  }
  
  /**
   * Initialize thread as an STA (for compatibility with Java).  Calling multiple times nests the call - call 
   * the release method matching multiple times.  Cannot be used in conjunction with
   * MTA thread.
   */
  synchronized static void initSTA()
  {
    if(((Integer)countMTA.get()).intValue() > 0)
      throw new ApartmentStateException("Can't initialize STA thread; current thread is MTA.");
      
    if(((Integer)countSTA.get()).intValue() == 0)
      ComThread.InitSTA();
      
    countSTA.set(Integer.valueOf(((Integer)countSTA.get()).intValue() + 1));
  }

  /**
   * Releases the STA thread (for compatibility with Java).  Called in conjunction with {@link #initSTA}.
   */
  synchronized static void releaseSTA()
  {
    if(((Integer)countSTA.get()).intValue() == 0)
      throw new ApartmentStateException("Current thread is not STA.");
    
    countSTA.set(Integer.valueOf(((Integer)countSTA.get()).intValue() - 1));
    
    if(((Integer)countSTA.get()).intValue() == 0)
      ComThread.Release();
  }
  
  
  /**
   * Apartment thread is in the wrong state for this function.
   */
  public static class ApartmentStateException extends RuntimeException
  {
	private static final long serialVersionUID = -6900255369764050739L;

	ApartmentStateException(String message)
    {
      super(message);
    }
  }
  
  /**
   * {@code true} if {@code org.codehaus.groovy.scriptom.debug} is defined or debug has been set {@code true} for the current thread.
   * @return {@code true} if {@code org.codehaus.groovy.scriptom.debug} is defined or debug has been set {@code true} for the current thread.
   * @see #setDebug
   */
  public static boolean debug()
  {
    return ((Boolean)debug.get()).booleanValue() || System.getProperty("org.codehaus.groovy.scriptom.debug", null) != null;
  }
  
  /**
   * Set the debug flag for the current thread.
   * @param value The new value of debug for the current thread.
   */
  public static void setDebug(boolean value)
  {
    debug.set(Boolean.valueOf(value)); 
  }
  
  /**
   * Returns {@code true} if the argument represents a missing parameter.<p>
   * 
   * This happens when an optional parameter has been defined, but there is no
   * default specified, and the caller does not define the argument.
   * 
   * @param argument The argument to test.
   * @return {@code true} if the argument represents a missing parameter.
   */
  public static boolean isMissing(Object argument)
  {
    return argument instanceof VariantError && ((VariantError)argument).intValue() == MISSING.intValue();
  }
  
  /**
   * Returns {@code true} if the argument represents empty.
   * 
   * @param argument The argument to test.
   * @return {@code true} if the argument represents empty.
   */
  public static boolean isEmpty(Object argument)
  {
    return argument == null;
  }
 
  /**
   * Returns {@code true} if the argument represents variant null.
   * 
   * @param argument The argument to test.
   * @return {@code true} if the argument represents variant null.
   */ 
  public static boolean isNull(Object argument)
  {
    return argument instanceof VariantNull;
  }
  
  /**
   * Allows the use of legacy garbage collection, which does not free Variant resources
   * until the COM resources are released manually.  This should be avoided in most cases,
   * since auto-GC fixes some memory management problems. Default value is {@code true}.
   */
  //TODO: This is still not quite ready.
  //public static void useAutoGC(boolean value)
  //{
  //  System.setProperty("com.jacob.autogc", Boolean.toString(value));
  //}
}