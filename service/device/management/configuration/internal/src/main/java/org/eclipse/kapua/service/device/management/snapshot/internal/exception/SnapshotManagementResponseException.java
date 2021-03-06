/*******************************************************************************
 * Copyright (c) 2018, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.device.management.snapshot.internal.exception;

import org.eclipse.kapua.service.device.management.exception.DeviceManagementResponseException;
import org.eclipse.kapua.service.device.management.message.response.KapuaResponseCode;

public class SnapshotManagementResponseException extends DeviceManagementResponseException {

    private static final long serialVersionUID = 7013760152860211306L;

    public SnapshotManagementResponseException(SnapshotManagementResponseErrorCodes code, KapuaResponseCode responseCode, String exceptionMessage, String exceptionStack,
                                               Object... arguments) {
        super(code, responseCode, exceptionMessage, exceptionStack, arguments);
    }
}
