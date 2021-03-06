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
package org.eclipse.kapua.service.datastore.internal.schema;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.kapua.commons.util.KapuaDateUtils;
import org.eclipse.kapua.service.datastore.model.ChannelInfo;
import org.eclipse.kapua.service.elasticsearch.client.SchemaKeys;
import org.eclipse.kapua.service.storable.exception.MappingException;
import org.eclipse.kapua.service.storable.model.utils.KeyValueEntry;
import org.eclipse.kapua.service.storable.model.utils.MappingUtils;

/**
 * {@link ChannelInfo} schema definition.
 *
 * @since 1.0.0
 */
public class ChannelInfoSchema {

    /**
     * @since 1.0.0
     */
    private ChannelInfoSchema() {
    }

    /**
     * Channel information schema name
     *
     * @since 1.0.0
     */
    public static final String CHANNEL_TYPE_NAME = "channel";
    /**
     * Channel information - channel
     *
     * @since 1.0.0
     */
    public static final String CHANNEL_NAME = "channel";
    /**
     * Channel information - client identifier
     *
     * @since 1.0.0
     */
    public static final String CHANNEL_CLIENT_ID = "client_id";
    /**
     * Channel information - scope id
     *
     * @since 1.0.0
     */
    public static final String CHANNEL_SCOPE_ID = "scope_id";
    /**
     * Channel information - message timestamp (of the first message published in this channel)
     *
     * @since 1.0.0
     */
    public static final String CHANNEL_TIMESTAMP = "timestamp";
    /**
     * Channel information - message identifier (of the first message published in this channel)
     *
     * @since 1.0.0
     */
    public static final String CHANNEL_MESSAGE_ID = "message_id";

    /**
     * Create and return the Json representation of the channel info schema
     *
     * @param allEnable
     * @param sourceEnable
     * @return
     * @throws MappingException
     * @since 1.0.0
     */
    public static JsonNode getChannelTypeSchema(boolean allEnable, boolean sourceEnable) throws MappingException {

        ObjectNode channelNode = MappingUtils.newObjectNode();
        {
            ObjectNode sourceChannel = MappingUtils.newObjectNode(new KeyValueEntry[]{new KeyValueEntry(SchemaKeys.KEY_ENABLED, sourceEnable)});
            channelNode.set(SchemaKeys.KEY_SOURCE, sourceChannel);

            ObjectNode allChannel = MappingUtils.newObjectNode(new KeyValueEntry[]{new KeyValueEntry(SchemaKeys.KEY_ENABLED, allEnable)});
            channelNode.set(SchemaKeys.KEY_ALL, allChannel);

            ObjectNode propertiesNode = MappingUtils.newObjectNode();
            {
                ObjectNode channelScopeId = MappingUtils.newObjectNode(new KeyValueEntry[]{new KeyValueEntry(SchemaKeys.KEY_TYPE, SchemaKeys.TYPE_KEYWORD), new KeyValueEntry(SchemaKeys.KEY_INDEX, SchemaKeys.VALUE_TRUE)});
                propertiesNode.set(CHANNEL_SCOPE_ID, channelScopeId);

                ObjectNode channelClientId = MappingUtils.newObjectNode(new KeyValueEntry[]{new KeyValueEntry(SchemaKeys.KEY_TYPE, SchemaKeys.TYPE_KEYWORD), new KeyValueEntry(SchemaKeys.KEY_INDEX, SchemaKeys.VALUE_TRUE)});
                propertiesNode.set(CHANNEL_CLIENT_ID, channelClientId);

                ObjectNode channelName = MappingUtils.newObjectNode(new KeyValueEntry[]{new KeyValueEntry(SchemaKeys.KEY_TYPE, SchemaKeys.TYPE_KEYWORD), new KeyValueEntry(SchemaKeys.KEY_INDEX, SchemaKeys.VALUE_TRUE)});
                propertiesNode.set(CHANNEL_NAME, channelName);

                ObjectNode channelTimestamp = MappingUtils.newObjectNode(new KeyValueEntry[]{new KeyValueEntry(SchemaKeys.KEY_TYPE, SchemaKeys.TYPE_DATE), new KeyValueEntry(SchemaKeys.KEY_FORMAT, KapuaDateUtils.ISO_DATE_PATTERN)});
                propertiesNode.set(CHANNEL_TIMESTAMP, channelTimestamp);

                ObjectNode channelMessageId = MappingUtils.newObjectNode(new KeyValueEntry[]{new KeyValueEntry(SchemaKeys.KEY_TYPE, SchemaKeys.TYPE_KEYWORD), new KeyValueEntry(SchemaKeys.KEY_INDEX, SchemaKeys.VALUE_TRUE)});
                propertiesNode.set(CHANNEL_MESSAGE_ID, channelMessageId);
            }
            channelNode.set("properties", propertiesNode);
        }

        ObjectNode rootNode = MappingUtils.newObjectNode();
        rootNode.set(CHANNEL_TYPE_NAME, channelNode);
        return rootNode;
    }

}
