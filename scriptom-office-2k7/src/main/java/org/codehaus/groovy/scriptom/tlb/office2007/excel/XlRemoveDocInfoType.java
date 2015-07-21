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
public final class XlRemoveDocInfoType
{
  private XlRemoveDocInfoType()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer xlRDIComments = Integer.valueOf(1);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer xlRDIRemovePersonalInformation = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer xlRDIEmailHeader = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer xlRDIRoutingSlip = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer xlRDISendForReview = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer xlRDIDocumentProperties = Integer.valueOf(8);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer xlRDIDocumentWorkspace = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer xlRDIInkAnnotations = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer xlRDIScenarioComments = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer xlRDIPublishInfo = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer xlRDIDocumentServerProperties = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer xlRDIDocumentManagementPolicy = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer xlRDIContentType = Integer.valueOf(16);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer xlRDIDefinedNameComments = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer xlRDIInactiveDataConnections = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer xlRDIPrinterPath = Integer.valueOf(20);

  /**
   * Value is 99 (0x63)
   */
  public static final Integer xlRDIAll = Integer.valueOf(99);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("xlRDIComments", xlRDIComments);
    v.put("xlRDIRemovePersonalInformation", xlRDIRemovePersonalInformation);
    v.put("xlRDIEmailHeader", xlRDIEmailHeader);
    v.put("xlRDIRoutingSlip", xlRDIRoutingSlip);
    v.put("xlRDISendForReview", xlRDISendForReview);
    v.put("xlRDIDocumentProperties", xlRDIDocumentProperties);
    v.put("xlRDIDocumentWorkspace", xlRDIDocumentWorkspace);
    v.put("xlRDIInkAnnotations", xlRDIInkAnnotations);
    v.put("xlRDIScenarioComments", xlRDIScenarioComments);
    v.put("xlRDIPublishInfo", xlRDIPublishInfo);
    v.put("xlRDIDocumentServerProperties", xlRDIDocumentServerProperties);
    v.put("xlRDIDocumentManagementPolicy", xlRDIDocumentManagementPolicy);
    v.put("xlRDIContentType", xlRDIContentType);
    v.put("xlRDIDefinedNameComments", xlRDIDefinedNameComments);
    v.put("xlRDIInactiveDataConnections", xlRDIInactiveDataConnections);
    v.put("xlRDIPrinterPath", xlRDIPrinterPath);
    v.put("xlRDIAll", xlRDIAll);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
