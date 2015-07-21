/*
 * Copyright 2009 (C) The Codehaus. All Rights Reserved.
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
package org.codehaus.groovy.scriptom.tlb.office2007.visio;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * Flags to use with App.TraceFlags.
 * @author Jason Smith
 */
public final class VisTraceFlags
{
  private VisTraceFlags()
  {
  }

  /**
   * Flag to log code of every Visio event occurrence.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visTraceEvents = Integer.valueOf(1);

  /**
   * Flag to log every call from Visio to an external event handler.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visTraceAdvises = Integer.valueOf(2);

  /**
   * Flag to log every attempt by Visio to invoke an Add-On.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visTraceAddonInvokes = Integer.valueOf(4);

  /**
   * Flag to log every attempt by Visio to invoke VBA code.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visTraceCallsToVBA = Integer.valueOf(8);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visTraceEvents", visTraceEvents);
    v.put("visTraceAdvises", visTraceAdvises);
    v.put("visTraceAddonInvokes", visTraceAddonInvokes);
    v.put("visTraceCallsToVBA", visTraceCallsToVBA);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
