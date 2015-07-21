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
 * Indices of colors (in default palette).
 * @author Jason Smith
 */
public final class VisDefaultColors
{
  private VisDefaultColors()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visTransparent = Integer.valueOf(0);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visBlack = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visWhite = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visRed = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visGreen = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visBlue = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visYellow = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visMagenta = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visCyan = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visDarkRed = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visDarkGreen = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer visDarkBlue = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer visDarkYellow = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer visPurple = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer visDarkCyan = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer visGray = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer visGray10 = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer visGray20 = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer visGray30 = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer visGray40 = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer visDarkGray = Integer.valueOf(19);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer visGray50 = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer visGray60 = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer visGray70 = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer visGray80 = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer visGray90 = Integer.valueOf(23);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visTransparent", visTransparent);
    v.put("visBlack", visBlack);
    v.put("visWhite", visWhite);
    v.put("visRed", visRed);
    v.put("visGreen", visGreen);
    v.put("visBlue", visBlue);
    v.put("visYellow", visYellow);
    v.put("visMagenta", visMagenta);
    v.put("visCyan", visCyan);
    v.put("visDarkRed", visDarkRed);
    v.put("visDarkGreen", visDarkGreen);
    v.put("visDarkBlue", visDarkBlue);
    v.put("visDarkYellow", visDarkYellow);
    v.put("visPurple", visPurple);
    v.put("visDarkCyan", visDarkCyan);
    v.put("visGray", visGray);
    v.put("visGray10", visGray10);
    v.put("visGray20", visGray20);
    v.put("visGray30", visGray30);
    v.put("visGray40", visGray40);
    v.put("visDarkGray", visDarkGray);
    v.put("visGray50", visGray50);
    v.put("visGray60", visGray60);
    v.put("visGray70", visGray70);
    v.put("visGray80", visGray80);
    v.put("visGray90", visGray90);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
