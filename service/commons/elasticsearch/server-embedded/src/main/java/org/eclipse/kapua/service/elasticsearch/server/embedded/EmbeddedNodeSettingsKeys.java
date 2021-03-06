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
package org.eclipse.kapua.service.elasticsearch.server.embedded;

import org.eclipse.kapua.commons.setting.SettingKey;

/**
 * Elasticsearch embedded node {@link SettingKey}s.
 *
 * @since 1.0.0
 */
public enum EmbeddedNodeSettingsKeys implements SettingKey {

    /**
     * Elasticsearch cluster name.
     *
     * @since 1.0.0
     */
    ELASTICSEARCH_CLUSTER("datastore.elasticsearch.cluster"),

    /**
     * Elasticsearch transport node.
     *
     * @since 1.0.0
     */
    ELASTICSEARCH_TRANSPORT_NODE("datastore.elasticsearch.transport.node"),

    /**
     * Elasticsearch transport port.
     */
    ELASTICSEARCH_TRANSPORT_PORT("datastore.elasticsearch.transport.port"),

    /**
     * Elasticsearch rest node.
     *
     * @since 1.0.0
     */
    ELASTICSEARCH_REST_NODE("datastore.elasticsearch.rest.node"),

    /**
     * Elasticsearch rest port.
     *
     * @since 1.0.0
     */
    ELASTICSEARCH_REST_PORT("datastore.elasticsearch.rest.port");

    /**
     * The key value.
     *
     * @since 1.0.0
     */
    private String key;

    /**
     * Constructor.
     *
     * @param key The key value for the {@link SettingKey}.
     * @since 1.0.0
     */
    EmbeddedNodeSettingsKeys(String key) {
        this.key = key;
    }

    @Override
    public String key() {
        return key;
    }
}
