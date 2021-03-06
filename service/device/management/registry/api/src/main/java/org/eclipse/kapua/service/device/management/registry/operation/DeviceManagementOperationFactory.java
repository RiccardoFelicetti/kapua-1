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
package org.eclipse.kapua.service.device.management.registry.operation;

import org.eclipse.kapua.model.KapuaEntityFactory;

/**
 * {@link DeviceManagementOperationFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
public interface DeviceManagementOperationFactory extends KapuaEntityFactory<DeviceManagementOperation, DeviceManagementOperationCreator, DeviceManagementOperationQuery, DeviceManagementOperationListResult> {

    /**
     * Instantiates a new {@link DeviceManagementOperationProperty}.
     *
     * @param name          The name to set in the {@link DeviceManagementOperationProperty}
     * @param propertyType  The property type to set in the {@link DeviceManagementOperationProperty}
     * @param propertyValue The property value to set in the {@link DeviceManagementOperationProperty}
     * @return The newly instantiated {@link DeviceManagementOperationProperty}
     * @since 1.0.0
     */
    DeviceManagementOperationProperty newStepProperty(String name, String propertyType, String propertyValue);
}
