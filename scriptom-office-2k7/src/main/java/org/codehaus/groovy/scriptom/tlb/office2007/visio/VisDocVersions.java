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
 * Document version codes.
 * @author Jason Smith
 */
public final class VisDocVersions
{
  private VisDocVersions()
  {
  }

  /**
   * The version number of an unsaved document.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visVersionUnsaved = Integer.valueOf(0);

  /**
   * Visio 1.0 document.<p>
   * Value is 65571 (0x10023)
   */
  public static final Integer visVersion10 = Integer.valueOf(65571);

  /**
   * Visio 2.0 document.<p>
   * Value is 131072 (0x20000)
   */
  public static final Integer visVersion20 = Integer.valueOf(131072);

  /**
   * Visio 3.0 document.<p>
   * Value is 196611 (0x30003)
   */
  public static final Integer visVersion30 = Integer.valueOf(196611);

  /**
   * Visio 4.x document.<p>
   * Value is 262144 (0x40000)
   */
  public static final Integer visVersion40 = Integer.valueOf(262144);

  /**
   * Visio 5.0 document.<p>
   * Value is 327680 (0x50000)
   */
  public static final Integer visVersion50 = Integer.valueOf(327680);

  /**
   * Visio 2000/2002 document. (Same value as visVersion100)<p>
   * Value is 393216 (0x60000)
   */
  public static final Integer visVersion60 = Integer.valueOf(393216);

  /**
   * Visio 2000/2002 document. (Same value as visVersion60)<p>
   * Value is 393216 (0x60000)
   */
  public static final Integer visVersion100 = Integer.valueOf(393216);

  /**
   * Visio 2003/2007 document. (Same value as visVersion120)<p>
   * Value is 720896 (0xB0000)
   */
  public static final Integer visVersion110 = Integer.valueOf(720896);

  /**
   * Visio 2003/2007 document. (Same value as visVersion110)<p>
   * Value is 720896 (0xB0000)
   */
  public static final Integer visVersion120 = Integer.valueOf(720896);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visVersionUnsaved", visVersionUnsaved);
    v.put("visVersion10", visVersion10);
    v.put("visVersion20", visVersion20);
    v.put("visVersion30", visVersion30);
    v.put("visVersion40", visVersion40);
    v.put("visVersion50", visVersion50);
    v.put("visVersion60", visVersion60);
    v.put("visVersion100", visVersion100);
    v.put("visVersion110", visVersion110);
    v.put("visVersion120", visVersion120);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
