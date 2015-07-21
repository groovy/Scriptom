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
 * Flags to pass to App.OnComponentEnterState method.
 * @author Jason Smith
 */
public final class VisOnComponentEnterCodes
{
  private VisOnComponentEnterCodes()
  {
  }

  /**
   * Tells App.OnComponentEnterState that component's modal state is changing.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visComponentStateModal = Integer.valueOf(1);

  /**
   * Include with visComponentStateModal to defer events while modal.<p>
   * Value is 65536 (0x10000)
   */
  public static final Integer visModalDeferEvents = Integer.valueOf(65536);

  /**
   * Include with visComponentStateModal to inhibit Before/AfterModal.<p>
   * Value is 131072 (0x20000)
   */
  public static final Integer visModalNoBeforeAfter = Integer.valueOf(131072);

  /**
   * Include with visComponentStateModal to prevent message filter from blocking.<p>
   * Value is 262144 (0x40000)
   */
  public static final Integer visModalDontBlockMessages = Integer.valueOf(262144);

  /**
   * Include with visComponentStateModal to force Visio's frame to disable.<p>
   * Value is 524288 (0x80000)
   */
  public static final Integer visModalDisableVisiosFrame = Integer.valueOf(524288);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visComponentStateModal", visComponentStateModal);
    v.put("visModalDeferEvents", visModalDeferEvents);
    v.put("visModalNoBeforeAfter", visModalNoBeforeAfter);
    v.put("visModalDontBlockMessages", visModalDontBlockMessages);
    v.put("visModalDisableVisiosFrame", visModalDisableVisiosFrame);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
