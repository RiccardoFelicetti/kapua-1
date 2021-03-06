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
package org.eclipse.kapua.commons.service.event.store.internal;

import org.eclipse.kapua.commons.model.query.AbstractKapuaQuery;
import org.eclipse.kapua.commons.service.event.store.api.EventStoreRecordQuery;
import org.eclipse.kapua.model.id.KapuaId;

public class EventStoreQueryImpl extends AbstractKapuaQuery implements EventStoreRecordQuery {

    /**
     * Constructor
     */
    public EventStoreQueryImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param scopeId
     */
    public EventStoreQueryImpl(KapuaId scopeId) {
        this();
        setScopeId(scopeId);
    }

}
