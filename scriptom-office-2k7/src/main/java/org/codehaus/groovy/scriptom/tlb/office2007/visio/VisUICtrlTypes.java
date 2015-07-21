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
 * Toolbar Bar constants for CtrlType property.
 * @author Jason Smith
 */
public final class VisUICtrlTypes
{
  private VisUICtrlTypes()
  {
  }

  /**
   * Push button.<p>
   * Value is 2 (0x2)
   */
  public static final Integer visCtrlTypeBUTTON = Integer.valueOf(2);

  /**
   * Owner draw push button.<p>
   * Value is 33 (0x21)
   */
  public static final Integer visCtrlTypeBUTTON_OWNERDRAW = Integer.valueOf(33);

  /**
   * Superseded by visCtrlTypeBUTTON_OWNERDRAW.<p>
   * Value is 33 (0x21)
   */
  public static final Integer visCtrlTypeOWNERDRAW_BUTTON = Integer.valueOf(33);

  /**
   * Split button.<p>
   * Value is 17 (0x11)
   */
  public static final Integer visCtrlTypeSPLITBUTTON = Integer.valueOf(17);

  /**
   * Superseded by visCtrlTypeSPLITBUTTON.<p>
   * Value is 17 (0x11)
   */
  public static final Integer visCtrlTypePALETTEBUTTONNOMRU = Integer.valueOf(17);

  /**
   * Split button, with MRU color behavior.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visCtrlTypeSPLITBUTTON_MRU_COLOR = Integer.valueOf(16);

  /**
   * Superseded by visCtrlTypeSPLITBUTTON_MRU_COLOR.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visCtrlTypePALETTEBUTTON = Integer.valueOf(16);

  /**
   * Superseded by visCtrlTypeSPLITBUTTON_MRU_COLOR.<p>
   * Value is 16 (0x10)
   */
  public static final Integer visCtrlTypeSPINBUTTON = Integer.valueOf(16);

  /**
   * Split button, with MRU command behavior.<p>
   * Value is 18 (0x12)
   */
  public static final Integer visCtrlTypeSPLITBUTTON_MRU_COMMAND = Integer.valueOf(18);

  /**
   * Superseded by visCtrlTypeSPLITBUTTON_MRU_COMMAND.<p>
   * Value is 18 (0x12)
   */
  public static final Integer visCtrlTypePALETTEBUTTONICON = Integer.valueOf(18);

  /**
   * Edit box.<p>
   * Value is 64 (0x40)
   */
  public static final Integer visCtrlTypeEDITBOX = Integer.valueOf(64);

  /**
   * Standard combobox.<p>
   * Value is 128 (0x80)
   */
  public static final Integer visCtrlTypeCOMBOBOX = Integer.valueOf(128);

  /**
   * Sorted combobox.<p>
   * Value is 129 (0x81)
   */
  public static final Integer visCtrlTypeCOMBOBOX_SORTED = Integer.valueOf(129);

  /**
   * Dropdown combobox.<p>
   * Value is 272 (0x110)
   */
  public static final Integer visCtrlTypeDROPDOWN = Integer.valueOf(272);

  /**
   * Sorted dropdown combobox.<p>
   * Value is 273 (0x111)
   */
  public static final Integer visCtrlTypeDROPDOWN_SORTED = Integer.valueOf(273);

  /**
   * Owner draw combobox.<p>
   * Value is 256 (0x100)
   */
  public static final Integer visCtrlTypeDROPDOWN_OWNERDRAW = Integer.valueOf(256);

  /**
   * Superseded by visCtrlTypeDROPDOWN_OWNERDRAW.<p>
   * Value is 256 (0x100)
   */
  public static final Integer visCtrlTypeCOMBODRAW = Integer.valueOf(256);

  /**
   * Owner draw sorted combobox.<p>
   * Value is 257 (0x101)
   */
  public static final Integer visCtrlTypeDROPDOWN_SORTED_OWNERDRAW = Integer.valueOf(257);

  /**
   * Text label - not a real control<p>
   * Value is 2048 (0x800)
   */
  public static final Integer visCtrlTypeLABEL = Integer.valueOf(2048);

  /**
   * Grid of sample patterns.<p>
   * Value is 32768 (0x8000)
   */
  public static final Integer visCtrlTypeSWATCH = Integer.valueOf(32768);

  /**
   * Grid of sample colors.<p>
   * Value is 32769 (0x8001)
   */
  public static final Integer visCtrlTypeSWATCH_COLORS = Integer.valueOf(32769);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 0 (0x0)
   */
  public static final Integer visCtrlTypeEND = Integer.valueOf(0);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 1 (0x1)
   */
  public static final Integer visCtrlTypeSTATE = Integer.valueOf(1);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 3 (0x3)
   */
  public static final Integer visCtrlTypeSTATE_BUTTON = Integer.valueOf(3);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 4 (0x4)
   */
  public static final Integer visCtrlTypeHIERBUTTON = Integer.valueOf(4);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 5 (0x5)
   */
  public static final Integer visCtrlTypeSTATE_HIERBUTTON = Integer.valueOf(5);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 8 (0x8)
   */
  public static final Integer visCtrlTypeDROPBUTTON = Integer.valueOf(8);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 9 (0x9)
   */
  public static final Integer visCtrlTypeSTATE_DROPBUTTON = Integer.valueOf(9);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 32 (0x20)
   */
  public static final Integer visCtrlTypePUSHBUTTON = Integer.valueOf(32);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 512 (0x200)
   */
  public static final Integer visCtrlTypeLISTBOX = Integer.valueOf(512);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 513 (0x201)
   */
  public static final Integer visCtrlTypeLISTBOXDRAW = Integer.valueOf(513);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 1024 (0x400)
   */
  public static final Integer visCtrlTypeCOLORBOX = Integer.valueOf(1024);

  /**
   * Obsolete as of Visio 2002.<p>
   * Value is 4096 (0x1000)
   */
  public static final Integer visCtrlTypeMESSAGE = Integer.valueOf(4096);

  /**
   * Obsolete as of Visio 2000.<p>
   * Value is 16384 (0x4000)
   */
  public static final Integer visCtrlTypeSPACER = Integer.valueOf(16384);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visCtrlTypeBUTTON", visCtrlTypeBUTTON);
    v.put("visCtrlTypeBUTTON_OWNERDRAW", visCtrlTypeBUTTON_OWNERDRAW);
    v.put("visCtrlTypeOWNERDRAW_BUTTON", visCtrlTypeOWNERDRAW_BUTTON);
    v.put("visCtrlTypeSPLITBUTTON", visCtrlTypeSPLITBUTTON);
    v.put("visCtrlTypePALETTEBUTTONNOMRU", visCtrlTypePALETTEBUTTONNOMRU);
    v.put("visCtrlTypeSPLITBUTTON_MRU_COLOR", visCtrlTypeSPLITBUTTON_MRU_COLOR);
    v.put("visCtrlTypePALETTEBUTTON", visCtrlTypePALETTEBUTTON);
    v.put("visCtrlTypeSPINBUTTON", visCtrlTypeSPINBUTTON);
    v.put("visCtrlTypeSPLITBUTTON_MRU_COMMAND", visCtrlTypeSPLITBUTTON_MRU_COMMAND);
    v.put("visCtrlTypePALETTEBUTTONICON", visCtrlTypePALETTEBUTTONICON);
    v.put("visCtrlTypeEDITBOX", visCtrlTypeEDITBOX);
    v.put("visCtrlTypeCOMBOBOX", visCtrlTypeCOMBOBOX);
    v.put("visCtrlTypeCOMBOBOX_SORTED", visCtrlTypeCOMBOBOX_SORTED);
    v.put("visCtrlTypeDROPDOWN", visCtrlTypeDROPDOWN);
    v.put("visCtrlTypeDROPDOWN_SORTED", visCtrlTypeDROPDOWN_SORTED);
    v.put("visCtrlTypeDROPDOWN_OWNERDRAW", visCtrlTypeDROPDOWN_OWNERDRAW);
    v.put("visCtrlTypeCOMBODRAW", visCtrlTypeCOMBODRAW);
    v.put("visCtrlTypeDROPDOWN_SORTED_OWNERDRAW", visCtrlTypeDROPDOWN_SORTED_OWNERDRAW);
    v.put("visCtrlTypeLABEL", visCtrlTypeLABEL);
    v.put("visCtrlTypeSWATCH", visCtrlTypeSWATCH);
    v.put("visCtrlTypeSWATCH_COLORS", visCtrlTypeSWATCH_COLORS);
    v.put("visCtrlTypeEND", visCtrlTypeEND);
    v.put("visCtrlTypeSTATE", visCtrlTypeSTATE);
    v.put("visCtrlTypeSTATE_BUTTON", visCtrlTypeSTATE_BUTTON);
    v.put("visCtrlTypeHIERBUTTON", visCtrlTypeHIERBUTTON);
    v.put("visCtrlTypeSTATE_HIERBUTTON", visCtrlTypeSTATE_HIERBUTTON);
    v.put("visCtrlTypeDROPBUTTON", visCtrlTypeDROPBUTTON);
    v.put("visCtrlTypeSTATE_DROPBUTTON", visCtrlTypeSTATE_DROPBUTTON);
    v.put("visCtrlTypePUSHBUTTON", visCtrlTypePUSHBUTTON);
    v.put("visCtrlTypeLISTBOX", visCtrlTypeLISTBOX);
    v.put("visCtrlTypeLISTBOXDRAW", visCtrlTypeLISTBOXDRAW);
    v.put("visCtrlTypeCOLORBOX", visCtrlTypeCOLORBOX);
    v.put("visCtrlTypeMESSAGE", visCtrlTypeMESSAGE);
    v.put("visCtrlTypeSPACER", visCtrlTypeSPACER);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
