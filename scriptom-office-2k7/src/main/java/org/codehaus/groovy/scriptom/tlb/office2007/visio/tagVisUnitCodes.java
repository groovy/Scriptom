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
public final class tagVisUnitCodes
{
  private tagVisUnitCodes()
  {
  }

  /**
   * Result expressed in internal units. (Inches for distances/positions.)<p>
   * Value is 32 (0x20)
   */
  public static final Integer visNumber = Integer.valueOf(32);

  /**
   * Value is 33 (0x21)
   */
  public static final Integer visPercent = Integer.valueOf(33);

  /**
   * Value is 36 (0x24)
   */
  public static final Integer visAcre = Integer.valueOf(36);

  /**
   * Value is 37 (0x25)
   */
  public static final Integer visHectare = Integer.valueOf(37);

  /**
   * Value is 40 (0x28)
   */
  public static final Integer visDate = Integer.valueOf(40);

  /**
   * Default duration units<p>
   * Value is 42 (0x2A)
   */
  public static final Integer visDurationUnits = Integer.valueOf(42);

  /**
   * Elapsed duration: week<p>
   * Value is 43 (0x2B)
   */
  public static final Integer visElapsedWeek = Integer.valueOf(43);

  /**
   * Elapsed duration: day<p>
   * Value is 44 (0x2C)
   */
  public static final Integer visElapsedDay = Integer.valueOf(44);

  /**
   * Elapsed duration: hour<p>
   * Value is 45 (0x2D)
   */
  public static final Integer visElapsedHour = Integer.valueOf(45);

  /**
   * Elapsed duration: minute<p>
   * Value is 46 (0x2E)
   */
  public static final Integer visElapsedMin = Integer.valueOf(46);

  /**
   * Elapsed duration: second<p>
   * Value is 47 (0x2F)
   */
  public static final Integer visElapsedSec = Integer.valueOf(47);

  /**
   * Specifies default text type units<p>
   * Value is 48 (0x30)
   */
  public static final Integer visTypeUnits = Integer.valueOf(48);

  /**
   * Value is 49 (0x31)
   */
  public static final Integer visPicasAndPoints = Integer.valueOf(49);

  /**
   * Value is 50 (0x32)
   */
  public static final Integer visPoints = Integer.valueOf(50);

  /**
   * Value is 51 (0x33)
   */
  public static final Integer visPicas = Integer.valueOf(51);

  /**
   * Value is 52 (0x34)
   */
  public static final Integer visCicerosAndDidots = Integer.valueOf(52);

  /**
   * Value is 53 (0x35)
   */
  public static final Integer visDidots = Integer.valueOf(53);

  /**
   * Value is 54 (0x36)
   */
  public static final Integer visCiceros = Integer.valueOf(54);

  /**
   * Value is 63 (0x3F)
   */
  public static final Integer visPageUnits = Integer.valueOf(63);

  /**
   * Value is 64 (0x40)
   */
  public static final Integer visDrawingUnits = Integer.valueOf(64);

  /**
   * Value is 65 (0x41)
   */
  public static final Integer visInches = Integer.valueOf(65);

  /**
   * Value is 66 (0x42)
   */
  public static final Integer visFeet = Integer.valueOf(66);

  /**
   * Value is 67 (0x43)
   */
  public static final Integer visFeetAndInches = Integer.valueOf(67);

  /**
   * Value is 68 (0x44)
   */
  public static final Integer visMiles = Integer.valueOf(68);

  /**
   * Value is 69 (0x45)
   */
  public static final Integer visCentimeters = Integer.valueOf(69);

  /**
   * Value is 70 (0x46)
   */
  public static final Integer visMillimeters = Integer.valueOf(70);

  /**
   * Value is 71 (0x47)
   */
  public static final Integer visMeters = Integer.valueOf(71);

  /**
   * Value is 72 (0x48)
   */
  public static final Integer visKilometers = Integer.valueOf(72);

  /**
   * Value is 73 (0x49)
   */
  public static final Integer visInchFrac = Integer.valueOf(73);

  /**
   * Value is 74 (0x4A)
   */
  public static final Integer visMileFrac = Integer.valueOf(74);

  /**
   * Value is 75 (0x4B)
   */
  public static final Integer visYards = Integer.valueOf(75);

  /**
   * Value is 76 (0x4C)
   */
  public static final Integer visNautMiles = Integer.valueOf(76);

  /**
   * Value is 80 (0x50)
   */
  public static final Integer visAngleUnits = Integer.valueOf(80);

  /**
   * Value is 81 (0x51)
   */
  public static final Integer visDegrees = Integer.valueOf(81);

  /**
   * Value is 82 (0x52)
   */
  public static final Integer visDegreeMinSec = Integer.valueOf(82);

  /**
   * Value is 83 (0x53)
   */
  public static final Integer visRadians = Integer.valueOf(83);

  /**
   * Value is 84 (0x54)
   */
  public static final Integer visMin = Integer.valueOf(84);

  /**
   * Value is 85 (0x55)
   */
  public static final Integer visSec = Integer.valueOf(85);

  /**
   * Value is 95 (0x5F)
   */
  public static final Integer visUnitsGUID = Integer.valueOf(95);

  /**
   * Value is 111 (0x6F)
   */
  public static final Integer visCurrency = Integer.valueOf(111);

  /**
   * Value is 138 (0x8A)
   */
  public static final Integer visUnitsNURBS = Integer.valueOf(138);

  /**
   * Value is 139 (0x8B)
   */
  public static final Integer visUnitsPolyline = Integer.valueOf(139);

  /**
   * Value is 225 (0xE1)
   */
  public static final Integer visUnitsPoint = Integer.valueOf(225);

  /**
   * Value is 231 (0xE7)
   */
  public static final Integer visUnitsString = Integer.valueOf(231);

  /**
   * Value is 251 (0xFB)
   */
  public static final Integer visUnitsColor = Integer.valueOf(251);

  /**
   * Value is 252 (0xFC)
   */
  public static final Integer visNoCast = Integer.valueOf(252);

  /**
   * Value is 255 (0xFF)
   */
  public static final Integer visUnitsInval = Integer.valueOf(255);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map<String,Object> values;
  static
  {
    TreeMap<String,Object> v = new TreeMap<String,Object>();
    v.put("visNumber", visNumber);
    v.put("visPercent", visPercent);
    v.put("visAcre", visAcre);
    v.put("visHectare", visHectare);
    v.put("visDate", visDate);
    v.put("visDurationUnits", visDurationUnits);
    v.put("visElapsedWeek", visElapsedWeek);
    v.put("visElapsedDay", visElapsedDay);
    v.put("visElapsedHour", visElapsedHour);
    v.put("visElapsedMin", visElapsedMin);
    v.put("visElapsedSec", visElapsedSec);
    v.put("visTypeUnits", visTypeUnits);
    v.put("visPicasAndPoints", visPicasAndPoints);
    v.put("visPoints", visPoints);
    v.put("visPicas", visPicas);
    v.put("visCicerosAndDidots", visCicerosAndDidots);
    v.put("visDidots", visDidots);
    v.put("visCiceros", visCiceros);
    v.put("visPageUnits", visPageUnits);
    v.put("visDrawingUnits", visDrawingUnits);
    v.put("visInches", visInches);
    v.put("visFeet", visFeet);
    v.put("visFeetAndInches", visFeetAndInches);
    v.put("visMiles", visMiles);
    v.put("visCentimeters", visCentimeters);
    v.put("visMillimeters", visMillimeters);
    v.put("visMeters", visMeters);
    v.put("visKilometers", visKilometers);
    v.put("visInchFrac", visInchFrac);
    v.put("visMileFrac", visMileFrac);
    v.put("visYards", visYards);
    v.put("visNautMiles", visNautMiles);
    v.put("visAngleUnits", visAngleUnits);
    v.put("visDegrees", visDegrees);
    v.put("visDegreeMinSec", visDegreeMinSec);
    v.put("visRadians", visRadians);
    v.put("visMin", visMin);
    v.put("visSec", visSec);
    v.put("visUnitsGUID", visUnitsGUID);
    v.put("visCurrency", visCurrency);
    v.put("visUnitsNURBS", visUnitsNURBS);
    v.put("visUnitsPolyline", visUnitsPolyline);
    v.put("visUnitsPoint", visUnitsPoint);
    v.put("visUnitsString", visUnitsString);
    v.put("visUnitsColor", visUnitsColor);
    v.put("visNoCast", visNoCast);
    v.put("visUnitsInval", visUnitsInval);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
