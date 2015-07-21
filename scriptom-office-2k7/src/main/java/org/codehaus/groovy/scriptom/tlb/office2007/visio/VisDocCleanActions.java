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
 * Flags passed to Document.Clean indicating what to perform, report and fix.
 * @author Jason Smith
 */
public final class VisDocCleanActions
{
  private VisDocCleanActions()
  {
  }

  /**
   * Tells Document.Clean to detect 'meaningless' local overrides.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visDocCleanActLocalFormulas = Integer.valueOf(1);

  /**
   * Tells Document.Clean to detect 'empty' local rows and sections.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visDocCleanActEmptyRowsAndSects = Integer.valueOf(2);

  /**
   * Tells Document.Clean to detect non-default font settings.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visDocCleanActNonDefaultFonts = Integer.valueOf(4);

  /**
   * Tells Document.Clean to detect results that don't match formulas.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visDocCleanActStaleResults = Integer.valueOf(8);

  /**
   * Tells Document.Clean to detect missing subscriptions.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visDocCleanActMissingSubs = Integer.valueOf(16);

  /**
   * Tells Document.Clean to detect formulas that can be generated from result.<p>
   * Value is 32 (0x20)
   */
  public static final Integer visDocCleanActConstantFormulas = Integer.valueOf(32);

  /**
   * Tells Document.Clean to detect almost zero results and make them zero.<p>
   * Value is 64 (0x40)
   */
  public static final Integer visDocCleanActNearZero = Integer.valueOf(64);

  /**
   * Tells Document.Clean to detect duplicate subscriptions.<p>
   * Value is 128 (0x80)
   */
  public static final Integer visDocCleanActDuplicateSubs = Integer.valueOf(128);

  /**
   * Tells Document.Clean to detect invalid display list linkages.<p>
   * Value is 256 (0x100)
   */
  public static final Integer visDocCleanActBadDisplayLists = Integer.valueOf(256);

  /**
   * Obsolete starting with Visio 2003.<p>
   * Value is 512 (0x200)
   */
  public static final Integer visDocCleanActBadFieldCounts = Integer.valueOf(512);

  /**
   * Tells Document.Clean to detect deleted fields.<p>
   * Value is 1024 (0x400)
   */
  public static final Integer visDocCleanActDeletedFields = Integer.valueOf(1024);

  /**
   * Tells Document.Clean to detect fields with missing or non-standard formulas.<p>
   * Value is 2048 (0x800)
   */
  public static final Integer visDocCleanActBadFieldFormulas = Integer.valueOf(2048);

  /**
   * Tells Document.Clean to detect invalid mark to field correspondence.<p>
   * Value is 4096 (0x1000)
   */
  public static final Integer visDocCleanActBadFieldMarks = Integer.valueOf(4096);

  /**
   * Tells Document.Clean to detect formulas with #Ref() errors.<p>
   * Value is 8192 (0x2000)
   */
  public static final Integer visDocCleanActBadReferences = Integer.valueOf(8192);

  /**
   * Tells Document.Clean to perform all actions.<p>
   * Value is 16383 (0x3FFF)
   */
  public static final Integer visDocCleanActAll = Integer.valueOf(16383);

  /**
   * Problems that Document.Clean detects by default. [Default value for nActions]<p>
   * Value is 8152 (0x1FD8)
   */
  public static final Integer visDocCleanActDefault = Integer.valueOf(8152);

  /**
   * Problems that Document.Clean reports by default. [Default value for nAlerts]<p>
   * Value is 0 (0x0)
   */
  public static final Integer visDocCleanAlertDefault = Integer.valueOf(0);

  /**
   * Problems that Document.Clean fixes by default. [Default value for nFixes]<p>
   * Value is 984 (0x3D8)
   */
  public static final Integer visDocCleanFixDefault = Integer.valueOf(984);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visDocCleanActLocalFormulas", visDocCleanActLocalFormulas);
    v.put("visDocCleanActEmptyRowsAndSects", visDocCleanActEmptyRowsAndSects);
    v.put("visDocCleanActNonDefaultFonts", visDocCleanActNonDefaultFonts);
    v.put("visDocCleanActStaleResults", visDocCleanActStaleResults);
    v.put("visDocCleanActMissingSubs", visDocCleanActMissingSubs);
    v.put("visDocCleanActConstantFormulas", visDocCleanActConstantFormulas);
    v.put("visDocCleanActNearZero", visDocCleanActNearZero);
    v.put("visDocCleanActDuplicateSubs", visDocCleanActDuplicateSubs);
    v.put("visDocCleanActBadDisplayLists", visDocCleanActBadDisplayLists);
    v.put("visDocCleanActBadFieldCounts", visDocCleanActBadFieldCounts);
    v.put("visDocCleanActDeletedFields", visDocCleanActDeletedFields);
    v.put("visDocCleanActBadFieldFormulas", visDocCleanActBadFieldFormulas);
    v.put("visDocCleanActBadFieldMarks", visDocCleanActBadFieldMarks);
    v.put("visDocCleanActBadReferences", visDocCleanActBadReferences);
    v.put("visDocCleanActAll", visDocCleanActAll);
    v.put("visDocCleanActDefault", visDocCleanActDefault);
    v.put("visDocCleanAlertDefault", visDocCleanAlertDefault);
    v.put("visDocCleanFixDefault", visDocCleanFixDefault);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
