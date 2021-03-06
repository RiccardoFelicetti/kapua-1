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
package org.eclipse.kapua.service.job;

import org.eclipse.kapua.KapuaException;
import org.eclipse.kapua.model.id.KapuaId;
import org.eclipse.kapua.model.query.KapuaQuery;
import org.eclipse.kapua.service.KapuaEntityService;
import org.eclipse.kapua.service.KapuaUpdatableEntityService;
import org.eclipse.kapua.service.config.KapuaConfigurableService;

/**
 * {@link JobService} exposes APIs to manage Job objects.<br>
 * It includes APIs to create, update, find, list and delete Jobs.<br>
 * Instances of the JobService can be acquired through the ServiceLocator object.
 *
 * @since 1.0
 */
public interface JobService extends KapuaEntityService<Job, JobCreator>,
        KapuaUpdatableEntityService<Job>,
        KapuaConfigurableService {

    /**
     * Returns the {@link JobListResult} with elements matching the provided query.
     *
     * @param query The {@link JobQuery} used to filter results.
     * @return The {@link JobListResult} with elements matching the query parameter.
     * @throws KapuaException
     * @since 1.0.0
     */
    @Override
    JobListResult query(KapuaQuery query) throws KapuaException;

    /**
     * Forcibly deletes a {@link Job} and all of its related data without checking for {@link org.eclipse.kapua.service.job.execution.JobExecution}s.
     *
     * @param scopeId The {@link KapuaId} scopeId of the {@link Job}.
     * @param jobId   The {@link KapuaId} of the {@link Job}.
     * @throws KapuaException
     * @since 1.1.0
     */
    void deleteForced(KapuaId scopeId, KapuaId jobId) throws KapuaException;

}
