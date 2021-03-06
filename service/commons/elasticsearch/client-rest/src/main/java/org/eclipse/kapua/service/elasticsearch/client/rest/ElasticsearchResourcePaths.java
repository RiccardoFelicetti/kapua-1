/*******************************************************************************
 * Copyright (c) 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.elasticsearch.client.rest;

import org.eclipse.kapua.service.elasticsearch.client.model.InsertRequest;
import org.eclipse.kapua.service.elasticsearch.client.model.TypeDescriptor;

import javax.validation.constraints.NotNull;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * {@link RestElasticsearchClient} resource paths.
 *
 * @since 1.3.0
 */
public class ElasticsearchResourcePaths {

    /**
     * Constructor.
     *
     * @since 1.3.0
     */
    private ElasticsearchResourcePaths() {
    }

    /**
     * @since 1.0.0
     */
    public static String getBulkPath() {
        return "/_bulk";
    }

    /**
     * @since 1.0.0
     */
    public static String deleteByQuery(@NotNull TypeDescriptor typeDescriptor) {
        return String.format("/%s/%s/_delete_by_query", typeDescriptor.getIndex(), typeDescriptor.getType());
    }

    /**
     * @since 1.0.0
     */
    public static String findIndex(String index) {
        return String.format("/_cat/indices?h=index&index=%s", index);
    }

    /**
     * @since 1.0.0
     */
    public static String id(@NotNull TypeDescriptor typeDescriptor, @NotNull String id) throws UnsupportedEncodingException {
        return String.format("/%s/%s/%s", typeDescriptor.getIndex(), typeDescriptor.getType(), URLEncoder.encode(id, "UTF-8"));
    }

    /**
     * @since 1.0.0
     */
    public static String index(String index) {
        return String.format("/%s", index);
    }

    /**
     * @since 1.0.0
     */
    public static String insertType(@NotNull InsertRequest request) {
        if (request.getId() != null) {
            return String.format("%s?id=%s&version=1&version_type=external", type(request.getTypeDescriptor()), request.getId());
        } else {
            return type(request.getTypeDescriptor());
        }
    }

    /**
     * @since 1.0.0
     */
    public static String mapping(@NotNull TypeDescriptor typeDescriptor) {
        return String.format("/%s/_mapping/%s", typeDescriptor.getIndex(), typeDescriptor.getType());
    }

    /**
     * @since 1.0.0
     */
    public static String search(@NotNull TypeDescriptor typeDescriptor) {
        return String.format("/%s/%s/_search", typeDescriptor.getIndex(), typeDescriptor.getType());
    }

    /**
     * @since 1.0.0
     */
    public static String refreshAllIndexes() {
        return "/_all/_refresh";
    }

    /**
     * @since 1.0.0
     */
    public static String type(@NotNull TypeDescriptor typeDescriptor) {
        return String.format("/%s/%s", typeDescriptor.getIndex(), typeDescriptor.getType());
    }

    /**
     * @since 1.0.0
     */
    public static String upsert(@NotNull TypeDescriptor typeDescriptor, @NotNull String id) throws UnsupportedEncodingException {
        return String.format("/%s/%s/%s/_update", typeDescriptor.getIndex(), typeDescriptor.getType(), URLEncoder.encode(id, "UTF-8"));
    }
}
