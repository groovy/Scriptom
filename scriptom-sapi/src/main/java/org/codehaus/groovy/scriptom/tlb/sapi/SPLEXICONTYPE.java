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
package org.codehaus.groovy.scriptom.tlb.sapi;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class SPLEXICONTYPE
{
  private SPLEXICONTYPE()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer eLEXTYPE_USER = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer eLEXTYPE_APP = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer eLEXTYPE_RESERVED1 = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer eLEXTYPE_RESERVED2 = Integer.valueOf(8);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer eLEXTYPE_RESERVED3 = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer eLEXTYPE_RESERVED4 = Integer.valueOf(32);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer eLEXTYPE_RESERVED5 = Integer.valueOf(64);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer eLEXTYPE_RESERVED6 = Integer.valueOf(128);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer eLEXTYPE_RESERVED7 = Integer.valueOf(256);

  /**
   * Value is 512 (0x200)
   */
  public static final Integer eLEXTYPE_RESERVED8 = Integer.valueOf(512);

  /**
   * Value is 1024 (0x400)
   */
  public static final Integer eLEXTYPE_RESERVED9 = Integer.valueOf(1024);

  /**
   * Value is 2048 (0x800)
   */
  public static final Integer eLEXTYPE_RESERVED10 = Integer.valueOf(2048);

  /**
   * Value is 4096 (0x1000)
   */
  public static final Integer eLEXTYPE_PRIVATE1 = Integer.valueOf(4096);

  /**
   * Value is 8192 (0x2000)
   */
  public static final Integer eLEXTYPE_PRIVATE2 = Integer.valueOf(8192);

  /**
   * Value is 16384 (0x4000)
   */
  public static final Integer eLEXTYPE_PRIVATE3 = Integer.valueOf(16384);

  /**
   * Value is 32768 (0x8000)
   */
  public static final Integer eLEXTYPE_PRIVATE4 = Integer.valueOf(32768);

  /**
   * Value is 65536 (0x10000)
   */
  public static final Integer eLEXTYPE_PRIVATE5 = Integer.valueOf(65536);

  /**
   * Value is 131072 (0x20000)
   */
  public static final Integer eLEXTYPE_PRIVATE6 = Integer.valueOf(131072);

  /**
   * Value is 262144 (0x40000)
   */
  public static final Integer eLEXTYPE_PRIVATE7 = Integer.valueOf(262144);

  /**
   * Value is 524288 (0x80000)
   */
  public static final Integer eLEXTYPE_PRIVATE8 = Integer.valueOf(524288);

  /**
   * Value is 1048576 (0x100000)
   */
  public static final Integer eLEXTYPE_PRIVATE9 = Integer.valueOf(1048576);

  /**
   * Value is 2097152 (0x200000)
   */
  public static final Integer eLEXTYPE_PRIVATE10 = Integer.valueOf(2097152);

  /**
   * Value is 4194304 (0x400000)
   */
  public static final Integer eLEXTYPE_PRIVATE11 = Integer.valueOf(4194304);

  /**
   * Value is 8388608 (0x800000)
   */
  public static final Integer eLEXTYPE_PRIVATE12 = Integer.valueOf(8388608);

  /**
   * Value is 16777216 (0x1000000)
   */
  public static final Integer eLEXTYPE_PRIVATE13 = Integer.valueOf(16777216);

  /**
   * Value is 33554432 (0x2000000)
   */
  public static final Integer eLEXTYPE_PRIVATE14 = Integer.valueOf(33554432);

  /**
   * Value is 67108864 (0x4000000)
   */
  public static final Integer eLEXTYPE_PRIVATE15 = Integer.valueOf(67108864);

  /**
   * Value is 134217728 (0x8000000)
   */
  public static final Integer eLEXTYPE_PRIVATE16 = Integer.valueOf(134217728);

  /**
   * Value is 268435456 (0x10000000)
   */
  public static final Integer eLEXTYPE_PRIVATE17 = Integer.valueOf(268435456);

  /**
   * Value is 536870912 (0x20000000)
   */
  public static final Integer eLEXTYPE_PRIVATE18 = Integer.valueOf(536870912);

  /**
   * Value is 1073741824 (0x40000000)
   */
  public static final Integer eLEXTYPE_PRIVATE19 = Integer.valueOf(1073741824);

  /**
   * Value is -2147483648 (0x80000000)
   */
  public static final Integer eLEXTYPE_PRIVATE20 = Integer.valueOf(-2147483648);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("eLEXTYPE_USER", eLEXTYPE_USER);
    v.put("eLEXTYPE_APP", eLEXTYPE_APP);
    v.put("eLEXTYPE_RESERVED1", eLEXTYPE_RESERVED1);
    v.put("eLEXTYPE_RESERVED2", eLEXTYPE_RESERVED2);
    v.put("eLEXTYPE_RESERVED3", eLEXTYPE_RESERVED3);
    v.put("eLEXTYPE_RESERVED4", eLEXTYPE_RESERVED4);
    v.put("eLEXTYPE_RESERVED5", eLEXTYPE_RESERVED5);
    v.put("eLEXTYPE_RESERVED6", eLEXTYPE_RESERVED6);
    v.put("eLEXTYPE_RESERVED7", eLEXTYPE_RESERVED7);
    v.put("eLEXTYPE_RESERVED8", eLEXTYPE_RESERVED8);
    v.put("eLEXTYPE_RESERVED9", eLEXTYPE_RESERVED9);
    v.put("eLEXTYPE_RESERVED10", eLEXTYPE_RESERVED10);
    v.put("eLEXTYPE_PRIVATE1", eLEXTYPE_PRIVATE1);
    v.put("eLEXTYPE_PRIVATE2", eLEXTYPE_PRIVATE2);
    v.put("eLEXTYPE_PRIVATE3", eLEXTYPE_PRIVATE3);
    v.put("eLEXTYPE_PRIVATE4", eLEXTYPE_PRIVATE4);
    v.put("eLEXTYPE_PRIVATE5", eLEXTYPE_PRIVATE5);
    v.put("eLEXTYPE_PRIVATE6", eLEXTYPE_PRIVATE6);
    v.put("eLEXTYPE_PRIVATE7", eLEXTYPE_PRIVATE7);
    v.put("eLEXTYPE_PRIVATE8", eLEXTYPE_PRIVATE8);
    v.put("eLEXTYPE_PRIVATE9", eLEXTYPE_PRIVATE9);
    v.put("eLEXTYPE_PRIVATE10", eLEXTYPE_PRIVATE10);
    v.put("eLEXTYPE_PRIVATE11", eLEXTYPE_PRIVATE11);
    v.put("eLEXTYPE_PRIVATE12", eLEXTYPE_PRIVATE12);
    v.put("eLEXTYPE_PRIVATE13", eLEXTYPE_PRIVATE13);
    v.put("eLEXTYPE_PRIVATE14", eLEXTYPE_PRIVATE14);
    v.put("eLEXTYPE_PRIVATE15", eLEXTYPE_PRIVATE15);
    v.put("eLEXTYPE_PRIVATE16", eLEXTYPE_PRIVATE16);
    v.put("eLEXTYPE_PRIVATE17", eLEXTYPE_PRIVATE17);
    v.put("eLEXTYPE_PRIVATE18", eLEXTYPE_PRIVATE18);
    v.put("eLEXTYPE_PRIVATE19", eLEXTYPE_PRIVATE19);
    v.put("eLEXTYPE_PRIVATE20", eLEXTYPE_PRIVATE20);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
