/*******************************************************************************
 * Copyright (c) 2016, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *     Red Hat Inc
 *******************************************************************************/
package org.eclipse.kapua.service.datastore.internal.model;

import org.eclipse.kapua.message.KapuaPayload;
import org.eclipse.kapua.message.device.data.KapuaDataChannel;
import org.eclipse.kapua.message.internal.KapuaMessageImpl;
import org.eclipse.kapua.service.datastore.model.DatastoreMessage;
import org.eclipse.kapua.service.storable.model.id.StorableId;

import java.util.Date;

/**
 * {@link DatastoreMessage} implementation.
 *
 * @since 1.0.0
 */
public class DatastoreMessageImpl extends KapuaMessageImpl<KapuaDataChannel, KapuaPayload> implements DatastoreMessage {

    private static final long serialVersionUID = 1L;

    private StorableId datastoreId;
    private Date timestamp;

    @Override
    public StorableId getDatastoreId() {
        return datastoreId;
    }

    @Override
    public void setDatastoreId(StorableId id) {
        this.datastoreId = id;
    }

    @Override
    public Date getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

}
