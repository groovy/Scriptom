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
 * Defines the errors that may be returned by the WBEM Scripting library
 * @author Jason Smith
 */
public final class WbemErrorEnum
{
  private WbemErrorEnum()
  {
  }

  /**
   * Value is 0 (0x0)
   */
  public static final Integer wbemNoErr = Integer.valueOf(0);

  /**
   * Value is -2147217407 (0x80041001)
   */
  public static final Integer wbemErrFailed = Integer.valueOf(-2147217407);

  /**
   * Value is -2147217406 (0x80041002)
   */
  public static final Integer wbemErrNotFound = Integer.valueOf(-2147217406);

  /**
   * Value is -2147217405 (0x80041003)
   */
  public static final Integer wbemErrAccessDenied = Integer.valueOf(-2147217405);

  /**
   * Value is -2147217404 (0x80041004)
   */
  public static final Integer wbemErrProviderFailure = Integer.valueOf(-2147217404);

  /**
   * Value is -2147217403 (0x80041005)
   */
  public static final Integer wbemErrTypeMismatch = Integer.valueOf(-2147217403);

  /**
   * Value is -2147217402 (0x80041006)
   */
  public static final Integer wbemErrOutOfMemory = Integer.valueOf(-2147217402);

  /**
   * Value is -2147217401 (0x80041007)
   */
  public static final Integer wbemErrInvalidContext = Integer.valueOf(-2147217401);

  /**
   * Value is -2147217400 (0x80041008)
   */
  public static final Integer wbemErrInvalidParameter = Integer.valueOf(-2147217400);

  /**
   * Value is -2147217399 (0x80041009)
   */
  public static final Integer wbemErrNotAvailable = Integer.valueOf(-2147217399);

  /**
   * Value is -2147217398 (0x8004100A)
   */
  public static final Integer wbemErrCriticalError = Integer.valueOf(-2147217398);

  /**
   * Value is -2147217397 (0x8004100B)
   */
  public static final Integer wbemErrInvalidStream = Integer.valueOf(-2147217397);

  /**
   * Value is -2147217396 (0x8004100C)
   */
  public static final Integer wbemErrNotSupported = Integer.valueOf(-2147217396);

  /**
   * Value is -2147217395 (0x8004100D)
   */
  public static final Integer wbemErrInvalidSuperclass = Integer.valueOf(-2147217395);

  /**
   * Value is -2147217394 (0x8004100E)
   */
  public static final Integer wbemErrInvalidNamespace = Integer.valueOf(-2147217394);

  /**
   * Value is -2147217393 (0x8004100F)
   */
  public static final Integer wbemErrInvalidObject = Integer.valueOf(-2147217393);

  /**
   * Value is -2147217392 (0x80041010)
   */
  public static final Integer wbemErrInvalidClass = Integer.valueOf(-2147217392);

  /**
   * Value is -2147217391 (0x80041011)
   */
  public static final Integer wbemErrProviderNotFound = Integer.valueOf(-2147217391);

  /**
   * Value is -2147217390 (0x80041012)
   */
  public static final Integer wbemErrInvalidProviderRegistration = Integer.valueOf(-2147217390);

  /**
   * Value is -2147217389 (0x80041013)
   */
  public static final Integer wbemErrProviderLoadFailure = Integer.valueOf(-2147217389);

  /**
   * Value is -2147217388 (0x80041014)
   */
  public static final Integer wbemErrInitializationFailure = Integer.valueOf(-2147217388);

  /**
   * Value is -2147217387 (0x80041015)
   */
  public static final Integer wbemErrTransportFailure = Integer.valueOf(-2147217387);

  /**
   * Value is -2147217386 (0x80041016)
   */
  public static final Integer wbemErrInvalidOperation = Integer.valueOf(-2147217386);

  /**
   * Value is -2147217385 (0x80041017)
   */
  public static final Integer wbemErrInvalidQuery = Integer.valueOf(-2147217385);

  /**
   * Value is -2147217384 (0x80041018)
   */
  public static final Integer wbemErrInvalidQueryType = Integer.valueOf(-2147217384);

  /**
   * Value is -2147217383 (0x80041019)
   */
  public static final Integer wbemErrAlreadyExists = Integer.valueOf(-2147217383);

  /**
   * Value is -2147217382 (0x8004101A)
   */
  public static final Integer wbemErrOverrideNotAllowed = Integer.valueOf(-2147217382);

  /**
   * Value is -2147217381 (0x8004101B)
   */
  public static final Integer wbemErrPropagatedQualifier = Integer.valueOf(-2147217381);

  /**
   * Value is -2147217380 (0x8004101C)
   */
  public static final Integer wbemErrPropagatedProperty = Integer.valueOf(-2147217380);

  /**
   * Value is -2147217379 (0x8004101D)
   */
  public static final Integer wbemErrUnexpected = Integer.valueOf(-2147217379);

  /**
   * Value is -2147217378 (0x8004101E)
   */
  public static final Integer wbemErrIllegalOperation = Integer.valueOf(-2147217378);

  /**
   * Value is -2147217377 (0x8004101F)
   */
  public static final Integer wbemErrCannotBeKey = Integer.valueOf(-2147217377);

  /**
   * Value is -2147217376 (0x80041020)
   */
  public static final Integer wbemErrIncompleteClass = Integer.valueOf(-2147217376);

  /**
   * Value is -2147217375 (0x80041021)
   */
  public static final Integer wbemErrInvalidSyntax = Integer.valueOf(-2147217375);

  /**
   * Value is -2147217374 (0x80041022)
   */
  public static final Integer wbemErrNondecoratedObject = Integer.valueOf(-2147217374);

  /**
   * Value is -2147217373 (0x80041023)
   */
  public static final Integer wbemErrReadOnly = Integer.valueOf(-2147217373);

  /**
   * Value is -2147217372 (0x80041024)
   */
  public static final Integer wbemErrProviderNotCapable = Integer.valueOf(-2147217372);

  /**
   * Value is -2147217371 (0x80041025)
   */
  public static final Integer wbemErrClassHasChildren = Integer.valueOf(-2147217371);

  /**
   * Value is -2147217370 (0x80041026)
   */
  public static final Integer wbemErrClassHasInstances = Integer.valueOf(-2147217370);

  /**
   * Value is -2147217369 (0x80041027)
   */
  public static final Integer wbemErrQueryNotImplemented = Integer.valueOf(-2147217369);

  /**
   * Value is -2147217368 (0x80041028)
   */
  public static final Integer wbemErrIllegalNull = Integer.valueOf(-2147217368);

  /**
   * Value is -2147217367 (0x80041029)
   */
  public static final Integer wbemErrInvalidQualifierType = Integer.valueOf(-2147217367);

  /**
   * Value is -2147217366 (0x8004102A)
   */
  public static final Integer wbemErrInvalidPropertyType = Integer.valueOf(-2147217366);

  /**
   * Value is -2147217365 (0x8004102B)
   */
  public static final Integer wbemErrValueOutOfRange = Integer.valueOf(-2147217365);

  /**
   * Value is -2147217364 (0x8004102C)
   */
  public static final Integer wbemErrCannotBeSingleton = Integer.valueOf(-2147217364);

  /**
   * Value is -2147217363 (0x8004102D)
   */
  public static final Integer wbemErrInvalidCimType = Integer.valueOf(-2147217363);

  /**
   * Value is -2147217362 (0x8004102E)
   */
  public static final Integer wbemErrInvalidMethod = Integer.valueOf(-2147217362);

  /**
   * Value is -2147217361 (0x8004102F)
   */
  public static final Integer wbemErrInvalidMethodParameters = Integer.valueOf(-2147217361);

  /**
   * Value is -2147217360 (0x80041030)
   */
  public static final Integer wbemErrSystemProperty = Integer.valueOf(-2147217360);

  /**
   * Value is -2147217359 (0x80041031)
   */
  public static final Integer wbemErrInvalidProperty = Integer.valueOf(-2147217359);

  /**
   * Value is -2147217358 (0x80041032)
   */
  public static final Integer wbemErrCallCancelled = Integer.valueOf(-2147217358);

  /**
   * Value is -2147217357 (0x80041033)
   */
  public static final Integer wbemErrShuttingDown = Integer.valueOf(-2147217357);

  /**
   * Value is -2147217356 (0x80041034)
   */
  public static final Integer wbemErrPropagatedMethod = Integer.valueOf(-2147217356);

  /**
   * Value is -2147217355 (0x80041035)
   */
  public static final Integer wbemErrUnsupportedParameter = Integer.valueOf(-2147217355);

  /**
   * Value is -2147217354 (0x80041036)
   */
  public static final Integer wbemErrMissingParameter = Integer.valueOf(-2147217354);

  /**
   * Value is -2147217353 (0x80041037)
   */
  public static final Integer wbemErrInvalidParameterId = Integer.valueOf(-2147217353);

  /**
   * Value is -2147217352 (0x80041038)
   */
  public static final Integer wbemErrNonConsecutiveParameterIds = Integer.valueOf(-2147217352);

  /**
   * Value is -2147217351 (0x80041039)
   */
  public static final Integer wbemErrParameterIdOnRetval = Integer.valueOf(-2147217351);

  /**
   * Value is -2147217350 (0x8004103A)
   */
  public static final Integer wbemErrInvalidObjectPath = Integer.valueOf(-2147217350);

  /**
   * Value is -2147217349 (0x8004103B)
   */
  public static final Integer wbemErrOutOfDiskSpace = Integer.valueOf(-2147217349);

  /**
   * Value is -2147217348 (0x8004103C)
   */
  public static final Integer wbemErrBufferTooSmall = Integer.valueOf(-2147217348);

  /**
   * Value is -2147217347 (0x8004103D)
   */
  public static final Integer wbemErrUnsupportedPutExtension = Integer.valueOf(-2147217347);

  /**
   * Value is -2147217346 (0x8004103E)
   */
  public static final Integer wbemErrUnknownObjectType = Integer.valueOf(-2147217346);

  /**
   * Value is -2147217345 (0x8004103F)
   */
  public static final Integer wbemErrUnknownPacketType = Integer.valueOf(-2147217345);

  /**
   * Value is -2147217344 (0x80041040)
   */
  public static final Integer wbemErrMarshalVersionMismatch = Integer.valueOf(-2147217344);

  /**
   * Value is -2147217343 (0x80041041)
   */
  public static final Integer wbemErrMarshalInvalidSignature = Integer.valueOf(-2147217343);

  /**
   * Value is -2147217342 (0x80041042)
   */
  public static final Integer wbemErrInvalidQualifier = Integer.valueOf(-2147217342);

  /**
   * Value is -2147217341 (0x80041043)
   */
  public static final Integer wbemErrInvalidDuplicateParameter = Integer.valueOf(-2147217341);

  /**
   * Value is -2147217340 (0x80041044)
   */
  public static final Integer wbemErrTooMuchData = Integer.valueOf(-2147217340);

  /**
   * Value is -2147217339 (0x80041045)
   */
  public static final Integer wbemErrServerTooBusy = Integer.valueOf(-2147217339);

  /**
   * Value is -2147217338 (0x80041046)
   */
  public static final Integer wbemErrInvalidFlavor = Integer.valueOf(-2147217338);

  /**
   * Value is -2147217337 (0x80041047)
   */
  public static final Integer wbemErrCircularReference = Integer.valueOf(-2147217337);

  /**
   * Value is -2147217336 (0x80041048)
   */
  public static final Integer wbemErrUnsupportedClassUpdate = Integer.valueOf(-2147217336);

  /**
   * Value is -2147217335 (0x80041049)
   */
  public static final Integer wbemErrCannotChangeKeyInheritance = Integer.valueOf(-2147217335);

  /**
   * Value is -2147217328 (0x80041050)
   */
  public static final Integer wbemErrCannotChangeIndexInheritance = Integer.valueOf(-2147217328);

  /**
   * Value is -2147217327 (0x80041051)
   */
  public static final Integer wbemErrTooManyProperties = Integer.valueOf(-2147217327);

  /**
   * Value is -2147217326 (0x80041052)
   */
  public static final Integer wbemErrUpdateTypeMismatch = Integer.valueOf(-2147217326);

  /**
   * Value is -2147217325 (0x80041053)
   */
  public static final Integer wbemErrUpdateOverrideNotAllowed = Integer.valueOf(-2147217325);

  /**
   * Value is -2147217324 (0x80041054)
   */
  public static final Integer wbemErrUpdatePropagatedMethod = Integer.valueOf(-2147217324);

  /**
   * Value is -2147217323 (0x80041055)
   */
  public static final Integer wbemErrMethodNotImplemented = Integer.valueOf(-2147217323);

  /**
   * Value is -2147217322 (0x80041056)
   */
  public static final Integer wbemErrMethodDisabled = Integer.valueOf(-2147217322);

  /**
   * Value is -2147217321 (0x80041057)
   */
  public static final Integer wbemErrRefresherBusy = Integer.valueOf(-2147217321);

  /**
   * Value is -2147217320 (0x80041058)
   */
  public static final Integer wbemErrUnparsableQuery = Integer.valueOf(-2147217320);

  /**
   * Value is -2147217319 (0x80041059)
   */
  public static final Integer wbemErrNotEventClass = Integer.valueOf(-2147217319);

  /**
   * Value is -2147217318 (0x8004105A)
   */
  public static final Integer wbemErrMissingGroupWithin = Integer.valueOf(-2147217318);

  /**
   * Value is -2147217317 (0x8004105B)
   */
  public static final Integer wbemErrMissingAggregationList = Integer.valueOf(-2147217317);

  /**
   * Value is -2147217316 (0x8004105C)
   */
  public static final Integer wbemErrPropertyNotAnObject = Integer.valueOf(-2147217316);

  /**
   * Value is -2147217315 (0x8004105D)
   */
  public static final Integer wbemErrAggregatingByObject = Integer.valueOf(-2147217315);

  /**
   * Value is -2147217313 (0x8004105F)
   */
  public static final Integer wbemErrUninterpretableProviderQuery = Integer.valueOf(-2147217313);

  /**
   * Value is -2147217312 (0x80041060)
   */
  public static final Integer wbemErrBackupRestoreWinmgmtRunning = Integer.valueOf(-2147217312);

  /**
   * Value is -2147217311 (0x80041061)
   */
  public static final Integer wbemErrQueueOverflow = Integer.valueOf(-2147217311);

  /**
   * Value is -2147217310 (0x80041062)
   */
  public static final Integer wbemErrPrivilegeNotHeld = Integer.valueOf(-2147217310);

  /**
   * Value is -2147217309 (0x80041063)
   */
  public static final Integer wbemErrInvalidOperator = Integer.valueOf(-2147217309);

  /**
   * Value is -2147217308 (0x80041064)
   */
  public static final Integer wbemErrLocalCredentials = Integer.valueOf(-2147217308);

  /**
   * Value is -2147217307 (0x80041065)
   */
  public static final Integer wbemErrCannotBeAbstract = Integer.valueOf(-2147217307);

  /**
   * Value is -2147217306 (0x80041066)
   */
  public static final Integer wbemErrAmendedObject = Integer.valueOf(-2147217306);

  /**
   * Value is -2147217305 (0x80041067)
   */
  public static final Integer wbemErrClientTooSlow = Integer.valueOf(-2147217305);

  /**
   * Value is -2147217304 (0x80041068)
   */
  public static final Integer wbemErrNullSecurityDescriptor = Integer.valueOf(-2147217304);

  /**
   * Value is -2147217303 (0x80041069)
   */
  public static final Integer wbemErrTimeout = Integer.valueOf(-2147217303);

  /**
   * Value is -2147217302 (0x8004106A)
   */
  public static final Integer wbemErrInvalidAssociation = Integer.valueOf(-2147217302);

  /**
   * Value is -2147217301 (0x8004106B)
   */
  public static final Integer wbemErrAmbiguousOperation = Integer.valueOf(-2147217301);

  /**
   * Value is -2147217300 (0x8004106C)
   */
  public static final Integer wbemErrQuotaViolation = Integer.valueOf(-2147217300);

  /**
   * Value is -2147217299 (0x8004106D)
   */
  public static final Integer wbemErrTransactionConflict = Integer.valueOf(-2147217299);

  /**
   * Value is -2147217298 (0x8004106E)
   */
  public static final Integer wbemErrForcedRollback = Integer.valueOf(-2147217298);

  /**
   * Value is -2147217297 (0x8004106F)
   */
  public static final Integer wbemErrUnsupportedLocale = Integer.valueOf(-2147217297);

  /**
   * Value is -2147217296 (0x80041070)
   */
  public static final Integer wbemErrHandleOutOfDate = Integer.valueOf(-2147217296);

  /**
   * Value is -2147217295 (0x80041071)
   */
  public static final Integer wbemErrConnectionFailed = Integer.valueOf(-2147217295);

  /**
   * Value is -2147217294 (0x80041072)
   */
  public static final Integer wbemErrInvalidHandleRequest = Integer.valueOf(-2147217294);

  /**
   * Value is -2147217293 (0x80041073)
   */
  public static final Integer wbemErrPropertyNameTooWide = Integer.valueOf(-2147217293);

  /**
   * Value is -2147217292 (0x80041074)
   */
  public static final Integer wbemErrClassNameTooWide = Integer.valueOf(-2147217292);

  /**
   * Value is -2147217291 (0x80041075)
   */
  public static final Integer wbemErrMethodNameTooWide = Integer.valueOf(-2147217291);

  /**
   * Value is -2147217290 (0x80041076)
   */
  public static final Integer wbemErrQualifierNameTooWide = Integer.valueOf(-2147217290);

  /**
   * Value is -2147217289 (0x80041077)
   */
  public static final Integer wbemErrRerunCommand = Integer.valueOf(-2147217289);

  /**
   * Value is -2147217288 (0x80041078)
   */
  public static final Integer wbemErrDatabaseVerMismatch = Integer.valueOf(-2147217288);

  /**
   * Value is -2147217287 (0x80041079)
   */
  public static final Integer wbemErrVetoPut = Integer.valueOf(-2147217287);

  /**
   * Value is -2147217286 (0x8004107A)
   */
  public static final Integer wbemErrVetoDelete = Integer.valueOf(-2147217286);

  /**
   * Value is -2147217280 (0x80041080)
   */
  public static final Integer wbemErrInvalidLocale = Integer.valueOf(-2147217280);

  /**
   * Value is -2147217279 (0x80041081)
   */
  public static final Integer wbemErrProviderSuspended = Integer.valueOf(-2147217279);

  /**
   * Value is -2147217278 (0x80041082)
   */
  public static final Integer wbemErrSynchronizationRequired = Integer.valueOf(-2147217278);

  /**
   * Value is -2147217277 (0x80041083)
   */
  public static final Integer wbemErrNoSchema = Integer.valueOf(-2147217277);

  /**
   * Value is -2147217276 (0x80041084)
   */
  public static final Integer wbemErrProviderAlreadyRegistered = Integer.valueOf(-2147217276);

  /**
   * Value is -2147217275 (0x80041085)
   */
  public static final Integer wbemErrProviderNotRegistered = Integer.valueOf(-2147217275);

  /**
   * Value is -2147217274 (0x80041086)
   */
  public static final Integer wbemErrFatalTransportError = Integer.valueOf(-2147217274);

  /**
   * Value is -2147217273 (0x80041087)
   */
  public static final Integer wbemErrEncryptedConnectionRequired = Integer.valueOf(-2147217273);

  /**
   * Value is -2147213311 (0x80042001)
   */
  public static final Integer wbemErrRegistrationTooBroad = Integer.valueOf(-2147213311);

  /**
   * Value is -2147213310 (0x80042002)
   */
  public static final Integer wbemErrRegistrationTooPrecise = Integer.valueOf(-2147213310);

  /**
   * Value is -2147209215 (0x80043001)
   */
  public static final Integer wbemErrTimedout = Integer.valueOf(-2147209215);

  /**
   * Value is -2147209214 (0x80043002)
   */
  public static final Integer wbemErrResetToDefault = Integer.valueOf(-2147209214);

  /**
   * A {@code Map} of the symbolic names to constant values.
   */
  public static final Map values;
  static
  {
    TreeMap v = new TreeMap();
    v.put("wbemNoErr", wbemNoErr);
    v.put("wbemErrFailed", wbemErrFailed);
    v.put("wbemErrNotFound", wbemErrNotFound);
    v.put("wbemErrAccessDenied", wbemErrAccessDenied);
    v.put("wbemErrProviderFailure", wbemErrProviderFailure);
    v.put("wbemErrTypeMismatch", wbemErrTypeMismatch);
    v.put("wbemErrOutOfMemory", wbemErrOutOfMemory);
    v.put("wbemErrInvalidContext", wbemErrInvalidContext);
    v.put("wbemErrInvalidParameter", wbemErrInvalidParameter);
    v.put("wbemErrNotAvailable", wbemErrNotAvailable);
    v.put("wbemErrCriticalError", wbemErrCriticalError);
    v.put("wbemErrInvalidStream", wbemErrInvalidStream);
    v.put("wbemErrNotSupported", wbemErrNotSupported);
    v.put("wbemErrInvalidSuperclass", wbemErrInvalidSuperclass);
    v.put("wbemErrInvalidNamespace", wbemErrInvalidNamespace);
    v.put("wbemErrInvalidObject", wbemErrInvalidObject);
    v.put("wbemErrInvalidClass", wbemErrInvalidClass);
    v.put("wbemErrProviderNotFound", wbemErrProviderNotFound);
    v.put("wbemErrInvalidProviderRegistration", wbemErrInvalidProviderRegistration);
    v.put("wbemErrProviderLoadFailure", wbemErrProviderLoadFailure);
    v.put("wbemErrInitializationFailure", wbemErrInitializationFailure);
    v.put("wbemErrTransportFailure", wbemErrTransportFailure);
    v.put("wbemErrInvalidOperation", wbemErrInvalidOperation);
    v.put("wbemErrInvalidQuery", wbemErrInvalidQuery);
    v.put("wbemErrInvalidQueryType", wbemErrInvalidQueryType);
    v.put("wbemErrAlreadyExists", wbemErrAlreadyExists);
    v.put("wbemErrOverrideNotAllowed", wbemErrOverrideNotAllowed);
    v.put("wbemErrPropagatedQualifier", wbemErrPropagatedQualifier);
    v.put("wbemErrPropagatedProperty", wbemErrPropagatedProperty);
    v.put("wbemErrUnexpected", wbemErrUnexpected);
    v.put("wbemErrIllegalOperation", wbemErrIllegalOperation);
    v.put("wbemErrCannotBeKey", wbemErrCannotBeKey);
    v.put("wbemErrIncompleteClass", wbemErrIncompleteClass);
    v.put("wbemErrInvalidSyntax", wbemErrInvalidSyntax);
    v.put("wbemErrNondecoratedObject", wbemErrNondecoratedObject);
    v.put("wbemErrReadOnly", wbemErrReadOnly);
    v.put("wbemErrProviderNotCapable", wbemErrProviderNotCapable);
    v.put("wbemErrClassHasChildren", wbemErrClassHasChildren);
    v.put("wbemErrClassHasInstances", wbemErrClassHasInstances);
    v.put("wbemErrQueryNotImplemented", wbemErrQueryNotImplemented);
    v.put("wbemErrIllegalNull", wbemErrIllegalNull);
    v.put("wbemErrInvalidQualifierType", wbemErrInvalidQualifierType);
    v.put("wbemErrInvalidPropertyType", wbemErrInvalidPropertyType);
    v.put("wbemErrValueOutOfRange", wbemErrValueOutOfRange);
    v.put("wbemErrCannotBeSingleton", wbemErrCannotBeSingleton);
    v.put("wbemErrInvalidCimType", wbemErrInvalidCimType);
    v.put("wbemErrInvalidMethod", wbemErrInvalidMethod);
    v.put("wbemErrInvalidMethodParameters", wbemErrInvalidMethodParameters);
    v.put("wbemErrSystemProperty", wbemErrSystemProperty);
    v.put("wbemErrInvalidProperty", wbemErrInvalidProperty);
    v.put("wbemErrCallCancelled", wbemErrCallCancelled);
    v.put("wbemErrShuttingDown", wbemErrShuttingDown);
    v.put("wbemErrPropagatedMethod", wbemErrPropagatedMethod);
    v.put("wbemErrUnsupportedParameter", wbemErrUnsupportedParameter);
    v.put("wbemErrMissingParameter", wbemErrMissingParameter);
    v.put("wbemErrInvalidParameterId", wbemErrInvalidParameterId);
    v.put("wbemErrNonConsecutiveParameterIds", wbemErrNonConsecutiveParameterIds);
    v.put("wbemErrParameterIdOnRetval", wbemErrParameterIdOnRetval);
    v.put("wbemErrInvalidObjectPath", wbemErrInvalidObjectPath);
    v.put("wbemErrOutOfDiskSpace", wbemErrOutOfDiskSpace);
    v.put("wbemErrBufferTooSmall", wbemErrBufferTooSmall);
    v.put("wbemErrUnsupportedPutExtension", wbemErrUnsupportedPutExtension);
    v.put("wbemErrUnknownObjectType", wbemErrUnknownObjectType);
    v.put("wbemErrUnknownPacketType", wbemErrUnknownPacketType);
    v.put("wbemErrMarshalVersionMismatch", wbemErrMarshalVersionMismatch);
    v.put("wbemErrMarshalInvalidSignature", wbemErrMarshalInvalidSignature);
    v.put("wbemErrInvalidQualifier", wbemErrInvalidQualifier);
    v.put("wbemErrInvalidDuplicateParameter", wbemErrInvalidDuplicateParameter);
    v.put("wbemErrTooMuchData", wbemErrTooMuchData);
    v.put("wbemErrServerTooBusy", wbemErrServerTooBusy);
    v.put("wbemErrInvalidFlavor", wbemErrInvalidFlavor);
    v.put("wbemErrCircularReference", wbemErrCircularReference);
    v.put("wbemErrUnsupportedClassUpdate", wbemErrUnsupportedClassUpdate);
    v.put("wbemErrCannotChangeKeyInheritance", wbemErrCannotChangeKeyInheritance);
    v.put("wbemErrCannotChangeIndexInheritance", wbemErrCannotChangeIndexInheritance);
    v.put("wbemErrTooManyProperties", wbemErrTooManyProperties);
    v.put("wbemErrUpdateTypeMismatch", wbemErrUpdateTypeMismatch);
    v.put("wbemErrUpdateOverrideNotAllowed", wbemErrUpdateOverrideNotAllowed);
    v.put("wbemErrUpdatePropagatedMethod", wbemErrUpdatePropagatedMethod);
    v.put("wbemErrMethodNotImplemented", wbemErrMethodNotImplemented);
    v.put("wbemErrMethodDisabled", wbemErrMethodDisabled);
    v.put("wbemErrRefresherBusy", wbemErrRefresherBusy);
    v.put("wbemErrUnparsableQuery", wbemErrUnparsableQuery);
    v.put("wbemErrNotEventClass", wbemErrNotEventClass);
    v.put("wbemErrMissingGroupWithin", wbemErrMissingGroupWithin);
    v.put("wbemErrMissingAggregationList", wbemErrMissingAggregationList);
    v.put("wbemErrPropertyNotAnObject", wbemErrPropertyNotAnObject);
    v.put("wbemErrAggregatingByObject", wbemErrAggregatingByObject);
    v.put("wbemErrUninterpretableProviderQuery", wbemErrUninterpretableProviderQuery);
    v.put("wbemErrBackupRestoreWinmgmtRunning", wbemErrBackupRestoreWinmgmtRunning);
    v.put("wbemErrQueueOverflow", wbemErrQueueOverflow);
    v.put("wbemErrPrivilegeNotHeld", wbemErrPrivilegeNotHeld);
    v.put("wbemErrInvalidOperator", wbemErrInvalidOperator);
    v.put("wbemErrLocalCredentials", wbemErrLocalCredentials);
    v.put("wbemErrCannotBeAbstract", wbemErrCannotBeAbstract);
    v.put("wbemErrAmendedObject", wbemErrAmendedObject);
    v.put("wbemErrClientTooSlow", wbemErrClientTooSlow);
    v.put("wbemErrNullSecurityDescriptor", wbemErrNullSecurityDescriptor);
    v.put("wbemErrTimeout", wbemErrTimeout);
    v.put("wbemErrInvalidAssociation", wbemErrInvalidAssociation);
    v.put("wbemErrAmbiguousOperation", wbemErrAmbiguousOperation);
    v.put("wbemErrQuotaViolation", wbemErrQuotaViolation);
    v.put("wbemErrTransactionConflict", wbemErrTransactionConflict);
    v.put("wbemErrForcedRollback", wbemErrForcedRollback);
    v.put("wbemErrUnsupportedLocale", wbemErrUnsupportedLocale);
    v.put("wbemErrHandleOutOfDate", wbemErrHandleOutOfDate);
    v.put("wbemErrConnectionFailed", wbemErrConnectionFailed);
    v.put("wbemErrInvalidHandleRequest", wbemErrInvalidHandleRequest);
    v.put("wbemErrPropertyNameTooWide", wbemErrPropertyNameTooWide);
    v.put("wbemErrClassNameTooWide", wbemErrClassNameTooWide);
    v.put("wbemErrMethodNameTooWide", wbemErrMethodNameTooWide);
    v.put("wbemErrQualifierNameTooWide", wbemErrQualifierNameTooWide);
    v.put("wbemErrRerunCommand", wbemErrRerunCommand);
    v.put("wbemErrDatabaseVerMismatch", wbemErrDatabaseVerMismatch);
    v.put("wbemErrVetoPut", wbemErrVetoPut);
    v.put("wbemErrVetoDelete", wbemErrVetoDelete);
    v.put("wbemErrInvalidLocale", wbemErrInvalidLocale);
    v.put("wbemErrProviderSuspended", wbemErrProviderSuspended);
    v.put("wbemErrSynchronizationRequired", wbemErrSynchronizationRequired);
    v.put("wbemErrNoSchema", wbemErrNoSchema);
    v.put("wbemErrProviderAlreadyRegistered", wbemErrProviderAlreadyRegistered);
    v.put("wbemErrProviderNotRegistered", wbemErrProviderNotRegistered);
    v.put("wbemErrFatalTransportError", wbemErrFatalTransportError);
    v.put("wbemErrEncryptedConnectionRequired", wbemErrEncryptedConnectionRequired);
    v.put("wbemErrRegistrationTooBroad", wbemErrRegistrationTooBroad);
    v.put("wbemErrRegistrationTooPrecise", wbemErrRegistrationTooPrecise);
    v.put("wbemErrTimedout", wbemErrTimedout);
    v.put("wbemErrResetToDefault", wbemErrResetToDefault);
    values = Collections.synchronizedMap(Collections.unmodifiableMap(v));
  }
}
