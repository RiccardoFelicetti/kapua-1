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
 *******************************************************************************/
package org.eclipse.kapua.service.device.management.packages.message.internal;

import org.eclipse.kapua.service.device.management.commons.message.request.KapuaRequestChannelImpl;

import java.util.Arrays;
import java.util.List;

/**
 * Package request message channel.
 *
 * @since 1.0
 */
public class PackageRequestChannel extends KapuaRequestChannelImpl {

    private PackageResource packageResource;

    /**
     * Get package resource
     *
     * @return
     */
    public PackageResource getResource() {
        return packageResource;
    }

    /**
     * Set package resource
     *
     * @param packageResource
     */
    public void setPackageResource(PackageResource packageResource) {
        this.packageResource = packageResource;
    }

    @Override
    public List<String> getSemanticParts() {
        return Arrays.asList(packageResource.name());
    }
}
