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
 * Defines a privilege
 * @author Jason Smith
 */
public final class WbemPrivilegeEnum
{
  private WbemPrivilegeEnum()
  {
  }

  /**
   * Value is 1 (0x1)
   */
  public static final Integer wbemPrivilegeCreateToken = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer wbemPrivilegePrimaryToken = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer wbemPrivilegeLockMemory = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer wbemPrivilegeIncreaseQuota = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer wbemPrivilegeMachineAccount = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer wbemPrivilegeTcb = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer wbemPrivilegeSecurity = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer wbemPrivilegeTakeOwnership = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer wbemPrivilegeLoadDriver = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer wbemPrivilegeSystemProfile = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer wbemPrivilegeSystemtime = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer wbemPrivilegeProfileSingleProcess = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer wbemPrivilegeIncreaseBasePriority = Integer.valueOf(13);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer wbemPrivilegeCreatePagefile = Integer.valueOf(14);

  /**
   * Value is 15 (0xF)
   */
  public static final Integer wbemPrivilegeCreatePermanent = Integer.valueOf(15);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer wbemPrivilegeBackup = Integer.valueOf(16);

  /**
   * Value is 17 (0x11)
   */
  public static final Integer wbemPrivilegeRestore = Integer.valueOf(17);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer wbemPrivilegeShutdown = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer wbemPrivilegeDebug = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer wbemPrivilegeAudit = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer wbemPrivilegeSystemEnvironment = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer wbemPrivilegeChangeNotify = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer wbemPrivilegeRemoteShutdown = Integer.valueOf(23);

  /**
   * Value is 24 (0x18)
   */
  public static final Integer wbemPrivilegeUndock = Integer.valueOf(24);

  /**
   * Value is 25 (0x19)
   */
  public static final Integer wbemPrivilegeSyncAgent = Integer.valueOf(25);

  /**
   * Value is 26 (0x1A)
   */
  public static final Integer wbemPrivilegeEnableDelegation = Integer.valueOf(26);

  /**
   * Value is 27 (0x1B)
   */
  public static final Integer wbemPrivilegeManageVolume = Integer.valueOf(27);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("wbemPrivilegeCreateToken", wbemPrivilegeCreateToken);
    v.put("wbemPrivilegePrimaryToken", wbemPrivilegePrimaryToken);
    v.put("wbemPrivilegeLockMemory", wbemPrivilegeLockMemory);
    v.put("wbemPrivilegeIncreaseQuota", wbemPrivilegeIncreaseQuota);
    v.put("wbemPrivilegeMachineAccount", wbemPrivilegeMachineAccount);
    v.put("wbemPrivilegeTcb", wbemPrivilegeTcb);
    v.put("wbemPrivilegeSecurity", wbemPrivilegeSecurity);
    v.put("wbemPrivilegeTakeOwnership", wbemPrivilegeTakeOwnership);
    v.put("wbemPrivilegeLoadDriver", wbemPrivilegeLoadDriver);
    v.put("wbemPrivilegeSystemProfile", wbemPrivilegeSystemProfile);
    v.put("wbemPrivilegeSystemtime", wbemPrivilegeSystemtime);
    v.put("wbemPrivilegeProfileSingleProcess", wbemPrivilegeProfileSingleProcess);
    v.put("wbemPrivilegeIncreaseBasePriority", wbemPrivilegeIncreaseBasePriority);
    v.put("wbemPrivilegeCreatePagefile", wbemPrivilegeCreatePagefile);
    v.put("wbemPrivilegeCreatePermanent", wbemPrivilegeCreatePermanent);
    v.put("wbemPrivilegeBackup", wbemPrivilegeBackup);
    v.put("wbemPrivilegeRestore", wbemPrivilegeRestore);
    v.put("wbemPrivilegeShutdown", wbemPrivilegeShutdown);
    v.put("wbemPrivilegeDebug", wbemPrivilegeDebug);
    v.put("wbemPrivilegeAudit", wbemPrivilegeAudit);
    v.put("wbemPrivilegeSystemEnvironment", wbemPrivilegeSystemEnvironment);
    v.put("wbemPrivilegeChangeNotify", wbemPrivilegeChangeNotify);
    v.put("wbemPrivilegeRemoteShutdown", wbemPrivilegeRemoteShutdown);
    v.put("wbemPrivilegeUndock", wbemPrivilegeUndock);
    v.put("wbemPrivilegeSyncAgent", wbemPrivilegeSyncAgent);
    v.put("wbemPrivilegeEnableDelegation", wbemPrivilegeEnableDelegation);
    v.put("wbemPrivilegeManageVolume", wbemPrivilegeManageVolume);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
