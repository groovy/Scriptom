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
package org.codehaus.groovy.scriptom.tlb.wbemscripting;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * Defines the valid CIM Types of a Property value
 * @author Jason Smith
 */
public final class WbemCimtypeEnum
{
  private WbemCimtypeEnum()
  {
  }

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wbemCimtypeSint8 = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wbemCimtypeUint8 = Integer.valueOf(17);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wbemCimtypeSint16 = Integer.valueOf(2);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wbemCimtypeUint16 = Integer.valueOf(18);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wbemCimtypeSint32 = Integer.valueOf(3);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wbemCimtypeUint32 = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wbemCimtypeSint64 = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wbemCimtypeUint64 = Integer.valueOf(21);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wbemCimtypeReal32 = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wbemCimtypeReal64 = Integer.valueOf(5);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wbemCimtypeBoolean = Integer.valueOf(11);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wbemCimtypeString = Integer.valueOf(8);

  /**
   * Value is 101 (0x65)
   */
  public static final Integer wbemCimtypeDatetime = Integer.valueOf(101);

  /**
   * Value is 102 (0x66)
   */
  public static final Integer wbemCimtypeReference = Integer.valueOf(102);

  /**
   * Value is 103 (0x67)
   */
  public static final Integer wbemCimtypeChar16 = Integer.valueOf(103);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wbemCimtypeObject = Integer.valueOf(13);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("wbemCimtypeSint8", wbemCimtypeSint8);
    v.put("wbemCimtypeUint8", wbemCimtypeUint8);
    v.put("wbemCimtypeSint16", wbemCimtypeSint16);
    v.put("wbemCimtypeUint16", wbemCimtypeUint16);
    v.put("wbemCimtypeSint32", wbemCimtypeSint32);
    v.put("wbemCimtypeUint32", wbemCimtypeUint32);
    v.put("wbemCimtypeSint64", wbemCimtypeSint64);
    v.put("wbemCimtypeUint64", wbemCimtypeUint64);
    v.put("wbemCimtypeReal32", wbemCimtypeReal32);
    v.put("wbemCimtypeReal64", wbemCimtypeReal64);
    v.put("wbemCimtypeBoolean", wbemCimtypeBoolean);
    v.put("wbemCimtypeString", wbemCimtypeString);
    v.put("wbemCimtypeDatetime", wbemCimtypeDatetime);
    v.put("wbemCimtypeReference", wbemCimtypeReference);
    v.put("wbemCimtypeChar16", wbemCimtypeChar16);
    v.put("wbemCimtypeObject", wbemCimtypeObject);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
