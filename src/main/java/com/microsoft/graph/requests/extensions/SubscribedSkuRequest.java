// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SubscribedSku;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscribed Sku Request.
 */
public class SubscribedSkuRequest extends BaseRequest {
	
    /**
     * The request for the SubscribedSku
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SubscribedSkuRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SubscribedSku.class);
    }

    /**
     * Gets the SubscribedSku from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super SubscribedSku> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SubscribedSku from the service
     *
     * @return the SubscribedSku from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SubscribedSku get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super SubscribedSku> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SubscribedSku with a source
     *
     * @param sourceSubscribedSku the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final SubscribedSku sourceSubscribedSku, @Nonnull final ICallback<? super SubscribedSku> callback) {
        send(HttpMethod.PATCH, callback, sourceSubscribedSku);
    }

    /**
     * Patches this SubscribedSku with a source
     *
     * @param sourceSubscribedSku the source object with updates
     * @return the updated SubscribedSku
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SubscribedSku patch(@Nonnull final SubscribedSku sourceSubscribedSku) throws ClientException {
        return send(HttpMethod.PATCH, sourceSubscribedSku);
    }

    /**
     * Creates a SubscribedSku with a new object
     *
     * @param newSubscribedSku the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final SubscribedSku newSubscribedSku, @Nonnull final ICallback<? super SubscribedSku> callback) {
        send(HttpMethod.POST, callback, newSubscribedSku);
    }

    /**
     * Creates a SubscribedSku with a new object
     *
     * @param newSubscribedSku the new object to create
     * @return the created SubscribedSku
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SubscribedSku post(@Nonnull final SubscribedSku newSubscribedSku) throws ClientException {
        return send(HttpMethod.POST, newSubscribedSku);
    }

    /**
     * Creates a SubscribedSku with a new object
     *
     * @param newSubscribedSku the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final SubscribedSku newSubscribedSku, @Nonnull final ICallback<? super SubscribedSku> callback) {
        send(HttpMethod.PUT, callback, newSubscribedSku);
    }

    /**
     * Creates a SubscribedSku with a new object
     *
     * @param newSubscribedSku the object to create/update
     * @return the created SubscribedSku
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SubscribedSku put(@Nonnull final SubscribedSku newSubscribedSku) throws ClientException {
        return send(HttpMethod.PUT, newSubscribedSku);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SubscribedSkuRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SubscribedSkuRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public SubscribedSkuRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SubscribedSkuRequest)this;
     }

}

