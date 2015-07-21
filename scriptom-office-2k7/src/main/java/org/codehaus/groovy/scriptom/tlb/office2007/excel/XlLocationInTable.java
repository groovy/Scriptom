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
package org.codehaus.groovy.scriptom.tlb.office2007.excel;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class XlLocationInTable
{
  private XlLocationInTable()
  {
  }

  /**
   * Value is -4110 (0xFFFFEFF2)
   */
  public static final Integer xlColumnHeader = Integer.valueOf(-4110);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlColumnItem = Integer.valueOf(5);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer xlDataHeader = Integer.valueOf(3);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlDataItem = Integer.valueOf(7);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer xlPageHeader = Integer.valueOf(2);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlPageItem = Integer.valueOf(6);

  /**
   * Value is -4153 (0xFFFFEFC7)
   */
  public static final Integer xlRowHeader = Integer.valueOf(-4153);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlRowItem = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlTableBody = Integer.valueOf(8);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlColumnHeader", xlColumnHeader);
    v.put("xlColumnItem", xlColumnItem);
    v.put("xlDataHeader", xlDataHeader);
    v.put("xlDataItem", xlDataItem);
    v.put("xlPageHeader", xlPageHeader);
    v.put("xlPageItem", xlPageItem);
    v.put("xlRowHeader", xlRowHeader);
    v.put("xlRowItem", xlRowItem);
    v.put("xlTableBody", xlTableBody);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
