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
 * @author Jason Smith
 */
public final class tagVisFieldCodes
{
  private tagVisFieldCodes()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visFCodeCreateDate = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visFCodeCreateTime = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visFCodeCurrentDate = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visFCodeCurrentTime = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visFCodeEditDate = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visFCodeEditTime = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visFCodePrintDate = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visFCodePrintTime = Integer.valueOf(7);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visFCodeCreator = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visFCodeDescription = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visFCodeDirectory = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visFCodeFileName = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visFCodeKeyWords = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visFCodeSubject = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visFCodeTitle = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer visFCodeManager = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer visFCodeCompany = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer visFCodeCategory = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer visFCodeHyperlinkBase = Integer.valueOf(10);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visFCodeWidth = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visFCodeHeight = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visFCodeAngle = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visFCodeData1 = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visFCodeData2 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visFCodeData3 = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visFCodeObjectID = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer visFCodeMasterName = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer visFCodeObjectName = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer visFCodeObjectType = Integer.valueOf(6);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer visFCodeBackgroundName = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer visFCodePageName = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer visFCodeNumberOfPages = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer visFCodePageNumber = Integer.valueOf(3);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visFCodeCreateDate", visFCodeCreateDate);
    v.put("visFCodeCreateTime", visFCodeCreateTime);
    v.put("visFCodeCurrentDate", visFCodeCurrentDate);
    v.put("visFCodeCurrentTime", visFCodeCurrentTime);
    v.put("visFCodeEditDate", visFCodeEditDate);
    v.put("visFCodeEditTime", visFCodeEditTime);
    v.put("visFCodePrintDate", visFCodePrintDate);
    v.put("visFCodePrintTime", visFCodePrintTime);
    v.put("visFCodeCreator", visFCodeCreator);
    v.put("visFCodeDescription", visFCodeDescription);
    v.put("visFCodeDirectory", visFCodeDirectory);
    v.put("visFCodeFileName", visFCodeFileName);
    v.put("visFCodeKeyWords", visFCodeKeyWords);
    v.put("visFCodeSubject", visFCodeSubject);
    v.put("visFCodeTitle", visFCodeTitle);
    v.put("visFCodeManager", visFCodeManager);
    v.put("visFCodeCompany", visFCodeCompany);
    v.put("visFCodeCategory", visFCodeCategory);
    v.put("visFCodeHyperlinkBase", visFCodeHyperlinkBase);
    v.put("visFCodeWidth", visFCodeWidth);
    v.put("visFCodeHeight", visFCodeHeight);
    v.put("visFCodeAngle", visFCodeAngle);
    v.put("visFCodeData1", visFCodeData1);
    v.put("visFCodeData2", visFCodeData2);
    v.put("visFCodeData3", visFCodeData3);
    v.put("visFCodeObjectID", visFCodeObjectID);
    v.put("visFCodeMasterName", visFCodeMasterName);
    v.put("visFCodeObjectName", visFCodeObjectName);
    v.put("visFCodeObjectType", visFCodeObjectType);
    v.put("visFCodeBackgroundName", visFCodeBackgroundName);
    v.put("visFCodePageName", visFCodePageName);
    v.put("visFCodeNumberOfPages", visFCodeNumberOfPages);
    v.put("visFCodePageNumber", visFCodePageNumber);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
