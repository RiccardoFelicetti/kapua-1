/*******************************************************************************
 * Copyright (c) 2017, 2020 Red Hat Inc and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat Inc - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.client.gateway;

import java.util.concurrent.CompletionStage;

/**
 * An interface to publish data
 */
public interface Sender {

    public CompletionStage<?> send(Payload payload);

    public default CompletionStage<?> send(final Payload.Builder payload) {
        return send(payload.build());
    }
}
