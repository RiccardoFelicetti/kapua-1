/*******************************************************************************
 * Copyright (c) 2017, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.device.management.registry.operation.notification.internal;

import org.eclipse.kapua.commons.model.query.AbstractKapuaQuery;
import org.eclipse.kapua.model.id.KapuaId;
import org.eclipse.kapua.service.device.management.registry.operation.notification.ManagementOperationNotificationQuery;

/**
 * {@link ManagementOperationNotificationQueryImpl} definition.
 *
 * @since 1.0
 */
public class ManagementOperationNotificationQueryImpl extends AbstractKapuaQuery implements ManagementOperationNotificationQuery {

    private ManagementOperationNotificationQueryImpl() {
        super();
    }

    public ManagementOperationNotificationQueryImpl(KapuaId scopeId) {
        this();

        setScopeId(scopeId);
    }

}
