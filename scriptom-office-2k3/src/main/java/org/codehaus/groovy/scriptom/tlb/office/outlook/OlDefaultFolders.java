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
package org.codehaus.groovy.scriptom.tlb.office.outlook;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class OlDefaultFolders
{
  private OlDefaultFolders()
  {
  }

  /**
   * Value is 3 (0x3)
   */
  public static final Integer olFolderDeletedItems = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer olFolderOutbox = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer olFolderSentMail = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer olFolderInbox = Integer.valueOf(6);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer olFolderCalendar = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer olFolderContacts = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer olFolderJournal = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer olFolderNotes = Integer.valueOf(12);

  /**
   * Value is 13 (0xD)
   */
  public static final Integer olFolderTasks = Integer.valueOf(13);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer olFolderDrafts = Integer.valueOf(16);

  /**
   * Value is 18 (0x12)
   */
  public static final Integer olPublicFoldersAllPublicFolders = Integer.valueOf(18);

  /**
   * Value is 19 (0x13)
   */
  public static final Integer olFolderConflicts = Integer.valueOf(19);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer olFolderSyncIssues = Integer.valueOf(20);

  /**
   * Value is 21 (0x15)
   */
  public static final Integer olFolderLocalFailures = Integer.valueOf(21);

  /**
   * Value is 22 (0x16)
   */
  public static final Integer olFolderServerFailures = Integer.valueOf(22);

  /**
   * Value is 23 (0x17)
   */
  public static final Integer olFolderJunk = Integer.valueOf(23);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("olFolderDeletedItems", olFolderDeletedItems);
    v.put("olFolderOutbox", olFolderOutbox);
    v.put("olFolderSentMail", olFolderSentMail);
    v.put("olFolderInbox", olFolderInbox);
    v.put("olFolderCalendar", olFolderCalendar);
    v.put("olFolderContacts", olFolderContacts);
    v.put("olFolderJournal", olFolderJournal);
    v.put("olFolderNotes", olFolderNotes);
    v.put("olFolderTasks", olFolderTasks);
    v.put("olFolderDrafts", olFolderDrafts);
    v.put("olPublicFoldersAllPublicFolders", olPublicFoldersAllPublicFolders);
    v.put("olFolderConflicts", olFolderConflicts);
    v.put("olFolderSyncIssues", olFolderSyncIssues);
    v.put("olFolderLocalFailures", olFolderLocalFailures);
    v.put("olFolderServerFailures", olFolderServerFailures);
    v.put("olFolderJunk", olFolderJunk);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
