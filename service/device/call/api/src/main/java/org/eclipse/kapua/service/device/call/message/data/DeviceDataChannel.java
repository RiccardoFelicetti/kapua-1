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
package org.eclipse.kapua.service.device.call.message.data;

import org.eclipse.kapua.service.device.call.message.DeviceChannel;

import java.util.List;

/**
 * {@link DeviceDataChannel} definition.
 *
 * @since 1.0.0
 */
public interface DeviceDataChannel extends DeviceChannel {

    /**
     * Gets the semantic parts.
     *
     * @return The semantic parts.
     * @since 1.2.0
     */
    List<String> getSemanticParts();

    /**
     * Sets the semantic parts.
     *
     * @param semanticParts The semantic parts.
     * @since 1.2.0
     */
    void setSemanticParts(List<String> semanticParts);
}
