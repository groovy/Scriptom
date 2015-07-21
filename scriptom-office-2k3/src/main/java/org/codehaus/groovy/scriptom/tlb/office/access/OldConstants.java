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
package org.codehaus.groovy.scriptom.tlb.office.access;

import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

/**
 * @author Jason Smith
 */
public final class OldConstants
{
  private OldConstants()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer V_EMPTY = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer V_NULL = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer V_INTEGER = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer V_LONG = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer V_SINGLE = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer V_DOUBLE = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer V_CURRENCY = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer V_DATE = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer V_STRING = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer DB_BINARY = Integer.valueOf(9);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer DB_OLE = Integer.valueOf(11);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer DB_NONULLS = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_TABLE = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_QUERY = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_FORM = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer A_REPORT = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer A_MACRO = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer A_MODULE = Integer.valueOf(5);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_FORMBAR = Integer.valueOf(0);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_FILE = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_EDITMENU = Integer.valueOf(1);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer A_RECORDSMENU = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_NEW = Integer.valueOf(0);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_SAVEFORM = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer A_SAVEFORMAS = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer A_SAVERECORD = Integer.valueOf(4);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_UNDO = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_UNDOFIELD = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_CUT = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer A_COPY = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer A_PASTE = Integer.valueOf(4);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer A_DELETE = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer A_SELECTRECORD = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer A_SELECTALLRECORDS = Integer.valueOf(8);

  /**
   * Value is 14 (0xE)
   */
  public static final Integer A_OBJECT = Integer.valueOf(14);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_REFRESH = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_OBJECTVERB = Integer.valueOf(0);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer A_OBJECTUPDATE = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_ANYWHERE = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_ENTIRE = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_START = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_UP = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_DOWN = Integer.valueOf(1);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_CURRENT = Integer.valueOf(1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_ALL = Integer.valueOf(0);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_PREVIOUS = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_NEXT = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_FIRST = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer A_LAST = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer A_GOTO = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer A_NEWREC = Integer.valueOf(5);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_NORMAL = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_DESIGN = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_PREVIEW = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer A_FORMDS = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_ADD = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_EDIT = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_READONLY = Integer.valueOf(2);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_HIDDEN = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_ICON = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer A_DIALOG = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_PRINTALL = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_SELECTION = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_PAGES = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_HIGH = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_MEDIUM = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_LOW = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer A_DRAFT = Integer.valueOf(3);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_PROMPT = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_SAVE = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_EXIT = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_IMPORT = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_EXPORT = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_ATTACH = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_IMPORTDELIM = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_IMPORTFIXED = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_EXPORTDELIM = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer A_EXPORTFIXED = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer A_EXPORTMERGE = Integer.valueOf(4);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer OLE_CHANGED = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer OLE_SAVED = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer OLE_CLOSED = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer OLE_RENAMED = Integer.valueOf(3);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer OLE_RELEASE = Integer.valueOf(5);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer SHIFT_MASK = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer CTRL_MASK = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer ALT_MASK = Integer.valueOf(4);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer LEFT_BUTTON = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer RIGHT_BUTTON = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer MIDDLE_BUTTON = Integer.valueOf(4);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer DATA_ERRCONTINUE = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DATA_ERRDISPLAY = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DATA_ERRADDED = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer LB_INITIALIZE = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer LB_OPEN = Integer.valueOf(1);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer LB_GETROWCOUNT = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer LB_GETCOLUMNCOUNT = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer LB_GETCOLUMNWIDTH = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer LB_GETVALUE = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer LB_GETFORMAT = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer LB_CLOSE = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer LB_END = Integer.valueOf(9);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer SYSCMD_INITMETER = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer SYSCMD_UPDATEMETER = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer SYSCMD_REMOVEMETER = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer SYSCMD_SETSTATUS = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer SYSCMD_CLEARSTATUS = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer SYSCMD_RUNTIME = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer SYSCMD_ACCESSVER = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer SYSCMD_INIFILE = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer SYSCMD_ACCESSDIR = Integer.valueOf(9);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer SYSCMD_GETOBJECTSTATE = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer SYSCMD_CLEARHELPTOPIC = Integer.valueOf(11);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer OBJSTATE_OPEN = Integer.valueOf(1);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer OBJSTATE_NEW = Integer.valueOf(4);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer OBJSTATE_DIRTY = Integer.valueOf(2);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer A_DELETE_V2 = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer A_SELECTRECORD_V2 = Integer.valueOf(8);

  /**
   * Value is 9 (0x9)
   */
  public static final Integer A_SELECTALLRECORDS_V2 = Integer.valueOf(9);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer A_TOOLBAR_YES = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer A_TOOLBAR_WHERE_APPROP = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer A_TOOLBAR_NO = Integer.valueOf(2);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer DELETE_OK = Integer.valueOf(0);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DELETE_CANCEL = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DELETE_USER_CANCEL = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DB_SEC_FRMRPT_READDEF = Integer.valueOf(4);

  /**
   * Value is 65548 (0x1000C)
   */
  public static final Integer DB_SEC_FRMRPT_WRITEDEF = Integer.valueOf(65548);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer DB_SEC_FRMRPT_EXECUTE = Integer.valueOf(256);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer DB_SEC_MAC_READDEF = Integer.valueOf(10);

  /**
   * Value is 65542 (0x10006)
   */
  public static final Integer DB_SEC_MAC_WRITEDEF = Integer.valueOf(65542);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer DB_SEC_MAC_EXECUTE = Integer.valueOf(8);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DB_SEC_MOD_READDEF = Integer.valueOf(2);

  /**
   * Value is 65542 (0x10006)
   */
  public static final Integer DB_SEC_MOD_WRITEDEF = Integer.valueOf(65542);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer A_MENU_VER1X = Integer.valueOf(11);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer A_MENU_VER20 = Integer.valueOf(20);

  /**
   * Value is Rich Text Format (*.rtf) 
   */
  public static final String A_FORMATRTF = "Rich Text Format (*.rtf)";

  /**
   * Value is Microsoft Excel (*.xls) 
   */
  public static final String A_FORMATXLS = "Microsoft Excel (*.xls)";

  /**
   * Value is MS-DOS Text (*.txt) 
   */
  public static final String A_FORMATTXT = "MS-DOS Text (*.txt)";

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_OPEN_TABLE = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DB_OPEN_DYNASET = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DB_OPEN_SNAPSHOT = Integer.valueOf(4);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_DENYWRITE = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DB_DENYREAD = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DB_READONLY = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer DB_APPENDONLY = Integer.valueOf(8);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer DB_INCONSISTENT = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer DB_CONSISTENT = Integer.valueOf(32);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer DB_SQLPASSTHROUGH = Integer.valueOf(64);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer DB_FAILONERROR = Integer.valueOf(128);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer DB_FORWARDONLY = Integer.valueOf(256);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_OPTIONINIPATH = Integer.valueOf(1);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_FIXEDFIELD = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DB_VARIABLEFIELD = Integer.valueOf(2);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer DB_AUTOINCRFIELD = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer DB_UPDATABLEFIELD = Integer.valueOf(32);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_DESCENDING = Integer.valueOf(1);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_BOOLEAN = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DB_BYTE = Integer.valueOf(2);

  /**
   * Value is 3 (0x3)
   */
  public static final Integer DB_INTEGER = Integer.valueOf(3);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DB_LONG = Integer.valueOf(4);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer DB_CURRENCY = Integer.valueOf(5);

  /**
   * Value is 6 (0x6)
   */
  public static final Integer DB_SINGLE = Integer.valueOf(6);

  /**
   * Value is 7 (0x7)
   */
  public static final Integer DB_DOUBLE = Integer.valueOf(7);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer DB_DATE = Integer.valueOf(8);

  /**
   * Value is 10 (0xA)
   */
  public static final Integer DB_TEXT = Integer.valueOf(10);

  /**
   * Value is 11 (0xB)
   */
  public static final Integer DB_LONGBINARY = Integer.valueOf(11);

  /**
   * Value is 12 (0xC)
   */
  public static final Integer DB_MEMO = Integer.valueOf(12);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_RELATIONUNIQUE = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DB_RELATIONDONTENFORCE = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DB_RELATIONINHERITED = Integer.valueOf(4);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer DB_RELATIONUPDATECASCADE = Integer.valueOf(256);

  /**
   * Value is 4096 (0x1000)
   */
  public static final Integer DB_RELATIONDELETECASCADE = Integer.valueOf(4096);

  /**
   * Value is 16777216 (0x1000000)
   */
  public static final Integer DB_RELATIONLEFT = Integer.valueOf(16777216);

  /**
   * Value is 33554432 (0x2000000)
   */
  public static final Integer DB_RELATIONRIGHT = Integer.valueOf(33554432);

  /**
   * Value is 65536 (0x10000)
   */
  public static final Integer DB_ATTACHEXCLUSIVE = Integer.valueOf(65536);

  /**
   * Value is 131072 (0x20000)
   */
  public static final Integer DB_ATTACHSAVEPWD = Integer.valueOf(131072);

  /**
   * Value is -2147483646 (0x80000002)
   */
  public static final Integer DB_SYSTEMOBJECT = Integer.valueOf(-2147483646);

  /**
   * Value is 1073741824 (0x40000000)
   */
  public static final Integer DB_ATTACHEDTABLE = Integer.valueOf(1073741824);

  /**
   * Value is 536870912 (0x20000000)
   */
  public static final Integer DB_ATTACHEDODBC = Integer.valueOf(536870912);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_HIDDENOBJECT = Integer.valueOf(1);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_TABLE = Integer.valueOf(1);

  /**
   * Value is 5 (0x5)
   */
  public static final Integer DB_QUERYDEF = Integer.valueOf(5);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer DB_QSELECT = Integer.valueOf(0);

  /**
   * Value is 240 (0xF0)
   */
  public static final Integer DB_QACTION = Integer.valueOf(240);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer DB_QCROSSTAB = Integer.valueOf(16);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer DB_QDELETE = Integer.valueOf(32);

  /**
   * Value is 48 (0x30)
   */
  public static final Integer DB_QUPDATE = Integer.valueOf(48);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer DB_QAPPEND = Integer.valueOf(64);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer DB_QMAKETABLE = Integer.valueOf(80);

  /**
   * Value is 96 (0x60)
   */
  public static final Integer DB_QDDL = Integer.valueOf(96);

  /**
   * Value is 112 (0x70)
   */
  public static final Integer DB_QSQLPASSTHROUGH = Integer.valueOf(112);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer DB_QSETOPERATION = Integer.valueOf(128);

  /**
   * Value is 144 (0x90)
   */
  public static final Integer DB_QSPTBULK = Integer.valueOf(144);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_UNIQUE = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DB_PRIMARY = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DB_PROHIBITNULL = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer DB_IGNORENULL = Integer.valueOf(8);

  /**
   * Value is ;LANGID=0x0401;CP=1256;COUNTRY=0 
   */
  public static final String DB_LANG_ARABIC = ";LANGID=0x0401;CP=1256;COUNTRY=0";

  /**
   * Value is ;LANGID=0x0405;CP=1250;COUNTRY=0 
   */
  public static final String DB_LANG_CZECH = ";LANGID=0x0405;CP=1250;COUNTRY=0";

  /**
   * Value is ;LANGID=0x0413;CP=1252;COUNTRY=0 
   */
  public static final String DB_LANG_DUTCH = ";LANGID=0x0413;CP=1252;COUNTRY=0";

  /**
   * Value is ;LANGID=0x0409;CP=1252;COUNTRY=0 
   */
  public static final String DB_LANG_GENERAL = ";LANGID=0x0409;CP=1252;COUNTRY=0";

  /**
   * Value is ;LANGID=0x0408;CP=1253;COUNTRY=0 
   */
  public static final String DB_LANG_GREEK = ";LANGID=0x0408;CP=1253;COUNTRY=0";

  /**
   * Value is ;LANGID=0x040D;CP=1255;COUNTRY=0 
   */
  public static final String DB_LANG_HEBREW = ";LANGID=0x040D;CP=1255;COUNTRY=0";

  /**
   * Value is ;LANGID=0x040E;CP=1250;COUNTRY=0 
   */
  public static final String DB_LANG_HUNGARIAN = ";LANGID=0x040E;CP=1250;COUNTRY=0";

  /**
   * Value is ;LANGID=0x040F;CP=1252;COUNTRY=0 
   */
  public static final String DB_LANG_ICELANDIC = ";LANGID=0x040F;CP=1252;COUNTRY=0";

  /**
   * Value is ;LANGID=0x041D;CP=1252;COUNTRY=0 
   */
  public static final String DB_LANG_NORDIC = ";LANGID=0x041D;CP=1252;COUNTRY=0";

  /**
   * Value is ;LANGID=0x0414;CP=1252;COUNTRY=0 
   */
  public static final String DB_LANG_NORWDAN = ";LANGID=0x0414;CP=1252;COUNTRY=0";

  /**
   * Value is ;LANGID=0x0415;CP=1250;COUNTRY=0 
   */
  public static final String DB_LANG_POLISH = ";LANGID=0x0415;CP=1250;COUNTRY=0";

  /**
   * Value is ;LANGID=0x0419;CP=1251;COUNTRY=0 
   */
  public static final String DB_LANG_CYRILLIC = ";LANGID=0x0419;CP=1251;COUNTRY=0";

  /**
   * Value is ;LANGID=0x040A;CP=1252;COUNTRY=0 
   */
  public static final String DB_LANG_SPANISH = ";LANGID=0x040A;CP=1252;COUNTRY=0";

  /**
   * Value is ;LANGID=0x040B;CP=1252;COUNTRY=0 
   */
  public static final String DB_LANG_SWEDFIN = ";LANGID=0x040B;CP=1252;COUNTRY=0";

  /**
   * Value is ;LANGID=0x041F;CP=1254;COUNTRY=0 
   */
  public static final String DB_LANG_TURKISH = ";LANGID=0x041F;CP=1254;COUNTRY=0";

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_VERSION10 = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DB_ENCRYPT = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DB_DECRYPT = Integer.valueOf(4);

  /**
   * Value is 8 (0x8)
   */
  public static final Integer DB_VERSION11 = Integer.valueOf(8);

  /**
   * Value is 16 (0x10)
   */
  public static final Integer DB_VERSION20 = Integer.valueOf(16);

  /**
   * Value is 267 (0x10B)
   */
  public static final Integer DB_SORTARABIC = Integer.valueOf(267);

  /**
   * Value is 263 (0x107)
   */
  public static final Integer DB_SORTCYRILLIC = Integer.valueOf(263);

  /**
   * Value is 264 (0x108)
   */
  public static final Integer DB_SORTCZECH = Integer.valueOf(264);

  /**
   * Value is 259 (0x103)
   */
  public static final Integer DB_SORTDUTCH = Integer.valueOf(259);

  /**
   * Value is 256 (0x100)
   */
  public static final Integer DB_SORTGENERAL = Integer.valueOf(256);

  /**
   * Value is 269 (0x10D)
   */
  public static final Integer DB_SORTGREEK = Integer.valueOf(269);

  /**
   * Value is 268 (0x10C)
   */
  public static final Integer DB_SORTHEBREW = Integer.valueOf(268);

  /**
   * Value is 265 (0x109)
   */
  public static final Integer DB_SORTHUNGARIAN = Integer.valueOf(265);

  /**
   * Value is 262 (0x106)
   */
  public static final Integer DB_SORTICELANDIC = Integer.valueOf(262);

  /**
   * Value is 261 (0x105)
   */
  public static final Integer DB_SORTNORWDAN = Integer.valueOf(261);

  /**
   * Value is 4096 (0x1000)
   */
  public static final Integer DB_SORTPDXINTL = Integer.valueOf(4096);

  /**
   * Value is 4098 (0x1002)
   */
  public static final Integer DB_SORTPDXNOR = Integer.valueOf(4098);

  /**
   * Value is 4097 (0x1001)
   */
  public static final Integer DB_SORTPDXSWE = Integer.valueOf(4097);

  /**
   * Value is 266 (0x10A)
   */
  public static final Integer DB_SORTPOLISH = Integer.valueOf(266);

  /**
   * Value is 258 (0x102)
   */
  public static final Integer DB_SORTSPANISH = Integer.valueOf(258);

  /**
   * Value is 260 (0x104)
   */
  public static final Integer DB_SORTSWEDFIN = Integer.valueOf(260);

  /**
   * Value is 270 (0x10E)
   */
  public static final Integer DB_SORTTURKISH = Integer.valueOf(270);

  /**
   * Value is -1 (0xFFFFFFFF)
   */
  public static final Integer DB_SORTUNDEFINED = Integer.valueOf(-1);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_FREELOCKS = Integer.valueOf(1);

  /**
   * Value is 0 (0x0)
   */
  public static final Integer DB_SEC_NOACCESS = Integer.valueOf(0);

  /**
   * Value is 1048575 (0xFFFFF)
   */
  public static final Integer DB_SEC_FULLACCESS = Integer.valueOf(1048575);

  /**
   * Value is 65536 (0x10000)
   */
  public static final Integer DB_SEC_DELETE = Integer.valueOf(65536);

  /**
   * Value is 131072 (0x20000)
   */
  public static final Integer DB_SEC_READSEC = Integer.valueOf(131072);

  /**
   * Value is 262144 (0x40000)
   */
  public static final Integer DB_SEC_WRITESEC = Integer.valueOf(262144);

  /**
   * Value is 524288 (0x80000)
   */
  public static final Integer DB_SEC_WRITEOWNER = Integer.valueOf(524288);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_SEC_DBCREATE = Integer.valueOf(1);

  /**
   * Value is 2 (0x2)
   */
  public static final Integer DB_SEC_DBOPEN = Integer.valueOf(2);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DB_SEC_DBEXCLUSIVE = Integer.valueOf(4);

  /**
   * Value is 1 (0x1)
   */
  public static final Integer DB_SEC_CREATE = Integer.valueOf(1);

  /**
   * Value is 4 (0x4)
   */
  public static final Integer DB_SEC_READDEF = Integer.valueOf(4);

  /**
   * Value is 65548 (0x1000C)
   */
  public static final Integer DB_SEC_WRITEDEF = Integer.valueOf(65548);

  /**
   * Value is 20 (0x14)
   */
  public static final Integer DB_SEC_RETRIEVEDATA = Integer.valueOf(20);

  /**
   * Value is 32 (0x20)
   */
  public static final Integer DB_SEC_INSERTDATA = Integer.valueOf(32);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer DB_SEC_REPLACEDATA = Integer.valueOf(64);

  /**
   * Value is 128 (0x80)
   */
  public static final Integer DB_SEC_DELETEDATA = Integer.valueOf(128);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("V_EMPTY", V_EMPTY);
    v.put("V_NULL", V_NULL);
    v.put("V_INTEGER", V_INTEGER);
    v.put("V_LONG", V_LONG);
    v.put("V_SINGLE", V_SINGLE);
    v.put("V_DOUBLE", V_DOUBLE);
    v.put("V_CURRENCY", V_CURRENCY);
    v.put("V_DATE", V_DATE);
    v.put("V_STRING", V_STRING);
    v.put("DB_BINARY", DB_BINARY);
    v.put("DB_OLE", DB_OLE);
    v.put("DB_NONULLS", DB_NONULLS);
    v.put("A_TABLE", A_TABLE);
    v.put("A_QUERY", A_QUERY);
    v.put("A_FORM", A_FORM);
    v.put("A_REPORT", A_REPORT);
    v.put("A_MACRO", A_MACRO);
    v.put("A_MODULE", A_MODULE);
    v.put("A_FORMBAR", A_FORMBAR);
    v.put("A_FILE", A_FILE);
    v.put("A_EDITMENU", A_EDITMENU);
    v.put("A_RECORDSMENU", A_RECORDSMENU);
    v.put("A_NEW", A_NEW);
    v.put("A_SAVEFORM", A_SAVEFORM);
    v.put("A_SAVEFORMAS", A_SAVEFORMAS);
    v.put("A_SAVERECORD", A_SAVERECORD);
    v.put("A_UNDO", A_UNDO);
    v.put("A_UNDOFIELD", A_UNDOFIELD);
    v.put("A_CUT", A_CUT);
    v.put("A_COPY", A_COPY);
    v.put("A_PASTE", A_PASTE);
    v.put("A_DELETE", A_DELETE);
    v.put("A_SELECTRECORD", A_SELECTRECORD);
    v.put("A_SELECTALLRECORDS", A_SELECTALLRECORDS);
    v.put("A_OBJECT", A_OBJECT);
    v.put("A_REFRESH", A_REFRESH);
    v.put("A_OBJECTVERB", A_OBJECTVERB);
    v.put("A_OBJECTUPDATE", A_OBJECTUPDATE);
    v.put("A_ANYWHERE", A_ANYWHERE);
    v.put("A_ENTIRE", A_ENTIRE);
    v.put("A_START", A_START);
    v.put("A_UP", A_UP);
    v.put("A_DOWN", A_DOWN);
    v.put("A_CURRENT", A_CURRENT);
    v.put("A_ALL", A_ALL);
    v.put("A_PREVIOUS", A_PREVIOUS);
    v.put("A_NEXT", A_NEXT);
    v.put("A_FIRST", A_FIRST);
    v.put("A_LAST", A_LAST);
    v.put("A_GOTO", A_GOTO);
    v.put("A_NEWREC", A_NEWREC);
    v.put("A_NORMAL", A_NORMAL);
    v.put("A_DESIGN", A_DESIGN);
    v.put("A_PREVIEW", A_PREVIEW);
    v.put("A_FORMDS", A_FORMDS);
    v.put("A_ADD", A_ADD);
    v.put("A_EDIT", A_EDIT);
    v.put("A_READONLY", A_READONLY);
    v.put("A_HIDDEN", A_HIDDEN);
    v.put("A_ICON", A_ICON);
    v.put("A_DIALOG", A_DIALOG);
    v.put("A_PRINTALL", A_PRINTALL);
    v.put("A_SELECTION", A_SELECTION);
    v.put("A_PAGES", A_PAGES);
    v.put("A_HIGH", A_HIGH);
    v.put("A_MEDIUM", A_MEDIUM);
    v.put("A_LOW", A_LOW);
    v.put("A_DRAFT", A_DRAFT);
    v.put("A_PROMPT", A_PROMPT);
    v.put("A_SAVE", A_SAVE);
    v.put("A_EXIT", A_EXIT);
    v.put("A_IMPORT", A_IMPORT);
    v.put("A_EXPORT", A_EXPORT);
    v.put("A_ATTACH", A_ATTACH);
    v.put("A_IMPORTDELIM", A_IMPORTDELIM);
    v.put("A_IMPORTFIXED", A_IMPORTFIXED);
    v.put("A_EXPORTDELIM", A_EXPORTDELIM);
    v.put("A_EXPORTFIXED", A_EXPORTFIXED);
    v.put("A_EXPORTMERGE", A_EXPORTMERGE);
    v.put("OLE_CHANGED", OLE_CHANGED);
    v.put("OLE_SAVED", OLE_SAVED);
    v.put("OLE_CLOSED", OLE_CLOSED);
    v.put("OLE_RENAMED", OLE_RENAMED);
    v.put("OLE_RELEASE", OLE_RELEASE);
    v.put("SHIFT_MASK", SHIFT_MASK);
    v.put("CTRL_MASK", CTRL_MASK);
    v.put("ALT_MASK", ALT_MASK);
    v.put("LEFT_BUTTON", LEFT_BUTTON);
    v.put("RIGHT_BUTTON", RIGHT_BUTTON);
    v.put("MIDDLE_BUTTON", MIDDLE_BUTTON);
    v.put("DATA_ERRCONTINUE", DATA_ERRCONTINUE);
    v.put("DATA_ERRDISPLAY", DATA_ERRDISPLAY);
    v.put("DATA_ERRADDED", DATA_ERRADDED);
    v.put("LB_INITIALIZE", LB_INITIALIZE);
    v.put("LB_OPEN", LB_OPEN);
    v.put("LB_GETROWCOUNT", LB_GETROWCOUNT);
    v.put("LB_GETCOLUMNCOUNT", LB_GETCOLUMNCOUNT);
    v.put("LB_GETCOLUMNWIDTH", LB_GETCOLUMNWIDTH);
    v.put("LB_GETVALUE", LB_GETVALUE);
    v.put("LB_GETFORMAT", LB_GETFORMAT);
    v.put("LB_CLOSE", LB_CLOSE);
    v.put("LB_END", LB_END);
    v.put("SYSCMD_INITMETER", SYSCMD_INITMETER);
    v.put("SYSCMD_UPDATEMETER", SYSCMD_UPDATEMETER);
    v.put("SYSCMD_REMOVEMETER", SYSCMD_REMOVEMETER);
    v.put("SYSCMD_SETSTATUS", SYSCMD_SETSTATUS);
    v.put("SYSCMD_CLEARSTATUS", SYSCMD_CLEARSTATUS);
    v.put("SYSCMD_RUNTIME", SYSCMD_RUNTIME);
    v.put("SYSCMD_ACCESSVER", SYSCMD_ACCESSVER);
    v.put("SYSCMD_INIFILE", SYSCMD_INIFILE);
    v.put("SYSCMD_ACCESSDIR", SYSCMD_ACCESSDIR);
    v.put("SYSCMD_GETOBJECTSTATE", SYSCMD_GETOBJECTSTATE);
    v.put("SYSCMD_CLEARHELPTOPIC", SYSCMD_CLEARHELPTOPIC);
    v.put("OBJSTATE_OPEN", OBJSTATE_OPEN);
    v.put("OBJSTATE_NEW", OBJSTATE_NEW);
    v.put("OBJSTATE_DIRTY", OBJSTATE_DIRTY);
    v.put("A_DELETE_V2", A_DELETE_V2);
    v.put("A_SELECTRECORD_V2", A_SELECTRECORD_V2);
    v.put("A_SELECTALLRECORDS_V2", A_SELECTALLRECORDS_V2);
    v.put("A_TOOLBAR_YES", A_TOOLBAR_YES);
    v.put("A_TOOLBAR_WHERE_APPROP", A_TOOLBAR_WHERE_APPROP);
    v.put("A_TOOLBAR_NO", A_TOOLBAR_NO);
    v.put("DELETE_OK", DELETE_OK);
    v.put("DELETE_CANCEL", DELETE_CANCEL);
    v.put("DELETE_USER_CANCEL", DELETE_USER_CANCEL);
    v.put("DB_SEC_FRMRPT_READDEF", DB_SEC_FRMRPT_READDEF);
    v.put("DB_SEC_FRMRPT_WRITEDEF", DB_SEC_FRMRPT_WRITEDEF);
    v.put("DB_SEC_FRMRPT_EXECUTE", DB_SEC_FRMRPT_EXECUTE);
    v.put("DB_SEC_MAC_READDEF", DB_SEC_MAC_READDEF);
    v.put("DB_SEC_MAC_WRITEDEF", DB_SEC_MAC_WRITEDEF);
    v.put("DB_SEC_MAC_EXECUTE", DB_SEC_MAC_EXECUTE);
    v.put("DB_SEC_MOD_READDEF", DB_SEC_MOD_READDEF);
    v.put("DB_SEC_MOD_WRITEDEF", DB_SEC_MOD_WRITEDEF);
    v.put("A_MENU_VER1X", A_MENU_VER1X);
    v.put("A_MENU_VER20", A_MENU_VER20);
    v.put("A_FORMATRTF", A_FORMATRTF);
    v.put("A_FORMATXLS", A_FORMATXLS);
    v.put("A_FORMATTXT", A_FORMATTXT);
    v.put("DB_OPEN_TABLE", DB_OPEN_TABLE);
    v.put("DB_OPEN_DYNASET", DB_OPEN_DYNASET);
    v.put("DB_OPEN_SNAPSHOT", DB_OPEN_SNAPSHOT);
    v.put("DB_DENYWRITE", DB_DENYWRITE);
    v.put("DB_DENYREAD", DB_DENYREAD);
    v.put("DB_READONLY", DB_READONLY);
    v.put("DB_APPENDONLY", DB_APPENDONLY);
    v.put("DB_INCONSISTENT", DB_INCONSISTENT);
    v.put("DB_CONSISTENT", DB_CONSISTENT);
    v.put("DB_SQLPASSTHROUGH", DB_SQLPASSTHROUGH);
    v.put("DB_FAILONERROR", DB_FAILONERROR);
    v.put("DB_FORWARDONLY", DB_FORWARDONLY);
    v.put("DB_OPTIONINIPATH", DB_OPTIONINIPATH);
    v.put("DB_FIXEDFIELD", DB_FIXEDFIELD);
    v.put("DB_VARIABLEFIELD", DB_VARIABLEFIELD);
    v.put("DB_AUTOINCRFIELD", DB_AUTOINCRFIELD);
    v.put("DB_UPDATABLEFIELD", DB_UPDATABLEFIELD);
    v.put("DB_DESCENDING", DB_DESCENDING);
    v.put("DB_BOOLEAN", DB_BOOLEAN);
    v.put("DB_BYTE", DB_BYTE);
    v.put("DB_INTEGER", DB_INTEGER);
    v.put("DB_LONG", DB_LONG);
    v.put("DB_CURRENCY", DB_CURRENCY);
    v.put("DB_SINGLE", DB_SINGLE);
    v.put("DB_DOUBLE", DB_DOUBLE);
    v.put("DB_DATE", DB_DATE);
    v.put("DB_TEXT", DB_TEXT);
    v.put("DB_LONGBINARY", DB_LONGBINARY);
    v.put("DB_MEMO", DB_MEMO);
    v.put("DB_RELATIONUNIQUE", DB_RELATIONUNIQUE);
    v.put("DB_RELATIONDONTENFORCE", DB_RELATIONDONTENFORCE);
    v.put("DB_RELATIONINHERITED", DB_RELATIONINHERITED);
    v.put("DB_RELATIONUPDATECASCADE", DB_RELATIONUPDATECASCADE);
    v.put("DB_RELATIONDELETECASCADE", DB_RELATIONDELETECASCADE);
    v.put("DB_RELATIONLEFT", DB_RELATIONLEFT);
    v.put("DB_RELATIONRIGHT", DB_RELATIONRIGHT);
    v.put("DB_ATTACHEXCLUSIVE", DB_ATTACHEXCLUSIVE);
    v.put("DB_ATTACHSAVEPWD", DB_ATTACHSAVEPWD);
    v.put("DB_SYSTEMOBJECT", DB_SYSTEMOBJECT);
    v.put("DB_ATTACHEDTABLE", DB_ATTACHEDTABLE);
    v.put("DB_ATTACHEDODBC", DB_ATTACHEDODBC);
    v.put("DB_HIDDENOBJECT", DB_HIDDENOBJECT);
    v.put("DB_TABLE", DB_TABLE);
    v.put("DB_QUERYDEF", DB_QUERYDEF);
    v.put("DB_QSELECT", DB_QSELECT);
    v.put("DB_QACTION", DB_QACTION);
    v.put("DB_QCROSSTAB", DB_QCROSSTAB);
    v.put("DB_QDELETE", DB_QDELETE);
    v.put("DB_QUPDATE", DB_QUPDATE);
    v.put("DB_QAPPEND", DB_QAPPEND);
    v.put("DB_QMAKETABLE", DB_QMAKETABLE);
    v.put("DB_QDDL", DB_QDDL);
    v.put("DB_QSQLPASSTHROUGH", DB_QSQLPASSTHROUGH);
    v.put("DB_QSETOPERATION", DB_QSETOPERATION);
    v.put("DB_QSPTBULK", DB_QSPTBULK);
    v.put("DB_UNIQUE", DB_UNIQUE);
    v.put("DB_PRIMARY", DB_PRIMARY);
    v.put("DB_PROHIBITNULL", DB_PROHIBITNULL);
    v.put("DB_IGNORENULL", DB_IGNORENULL);
    v.put("DB_LANG_ARABIC", DB_LANG_ARABIC);
    v.put("DB_LANG_CZECH", DB_LANG_CZECH);
    v.put("DB_LANG_DUTCH", DB_LANG_DUTCH);
    v.put("DB_LANG_GENERAL", DB_LANG_GENERAL);
    v.put("DB_LANG_GREEK", DB_LANG_GREEK);
    v.put("DB_LANG_HEBREW", DB_LANG_HEBREW);
    v.put("DB_LANG_HUNGARIAN", DB_LANG_HUNGARIAN);
    v.put("DB_LANG_ICELANDIC", DB_LANG_ICELANDIC);
    v.put("DB_LANG_NORDIC", DB_LANG_NORDIC);
    v.put("DB_LANG_NORWDAN", DB_LANG_NORWDAN);
    v.put("DB_LANG_POLISH", DB_LANG_POLISH);
    v.put("DB_LANG_CYRILLIC", DB_LANG_CYRILLIC);
    v.put("DB_LANG_SPANISH", DB_LANG_SPANISH);
    v.put("DB_LANG_SWEDFIN", DB_LANG_SWEDFIN);
    v.put("DB_LANG_TURKISH", DB_LANG_TURKISH);
    v.put("DB_VERSION10", DB_VERSION10);
    v.put("DB_ENCRYPT", DB_ENCRYPT);
    v.put("DB_DECRYPT", DB_DECRYPT);
    v.put("DB_VERSION11", DB_VERSION11);
    v.put("DB_VERSION20", DB_VERSION20);
    v.put("DB_SORTARABIC", DB_SORTARABIC);
    v.put("DB_SORTCYRILLIC", DB_SORTCYRILLIC);
    v.put("DB_SORTCZECH", DB_SORTCZECH);
    v.put("DB_SORTDUTCH", DB_SORTDUTCH);
    v.put("DB_SORTGENERAL", DB_SORTGENERAL);
    v.put("DB_SORTGREEK", DB_SORTGREEK);
    v.put("DB_SORTHEBREW", DB_SORTHEBREW);
    v.put("DB_SORTHUNGARIAN", DB_SORTHUNGARIAN);
    v.put("DB_SORTICELANDIC", DB_SORTICELANDIC);
    v.put("DB_SORTNORWDAN", DB_SORTNORWDAN);
    v.put("DB_SORTPDXINTL", DB_SORTPDXINTL);
    v.put("DB_SORTPDXNOR", DB_SORTPDXNOR);
    v.put("DB_SORTPDXSWE", DB_SORTPDXSWE);
    v.put("DB_SORTPOLISH", DB_SORTPOLISH);
    v.put("DB_SORTSPANISH", DB_SORTSPANISH);
    v.put("DB_SORTSWEDFIN", DB_SORTSWEDFIN);
    v.put("DB_SORTTURKISH", DB_SORTTURKISH);
    v.put("DB_SORTUNDEFINED", DB_SORTUNDEFINED);
    v.put("DB_FREELOCKS", DB_FREELOCKS);
    v.put("DB_SEC_NOACCESS", DB_SEC_NOACCESS);
    v.put("DB_SEC_FULLACCESS", DB_SEC_FULLACCESS);
    v.put("DB_SEC_DELETE", DB_SEC_DELETE);
    v.put("DB_SEC_READSEC", DB_SEC_READSEC);
    v.put("DB_SEC_WRITESEC", DB_SEC_WRITESEC);
    v.put("DB_SEC_WRITEOWNER", DB_SEC_WRITEOWNER);
    v.put("DB_SEC_DBCREATE", DB_SEC_DBCREATE);
    v.put("DB_SEC_DBOPEN", DB_SEC_DBOPEN);
    v.put("DB_SEC_DBEXCLUSIVE", DB_SEC_DBEXCLUSIVE);
    v.put("DB_SEC_CREATE", DB_SEC_CREATE);
    v.put("DB_SEC_READDEF", DB_SEC_READDEF);
    v.put("DB_SEC_WRITEDEF", DB_SEC_WRITEDEF);
    v.put("DB_SEC_RETRIEVEDATA", DB_SEC_RETRIEVEDATA);
    v.put("DB_SEC_INSERTDATA", DB_SEC_INSERTDATA);
    v.put("DB_SEC_REPLACEDATA", DB_SEC_REPLACEDATA);
    v.put("DB_SEC_DELETEDATA", DB_SEC_DELETEDATA);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
