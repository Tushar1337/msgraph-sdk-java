// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ActivityHistoryItem;
import com.microsoft.graph.requests.extensions.UserActivityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity History Item Request.
 */
public class ActivityHistoryItemRequest extends BaseRequest<ActivityHistoryItem> {
	
    /**
     * The request for the ActivityHistoryItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ActivityHistoryItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ActivityHistoryItem.class);
    }

    /**
     * Gets the ActivityHistoryItem from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ActivityHistoryItem> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ActivityHistoryItem from the service
     *
     * @return the ActivityHistoryItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityHistoryItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ActivityHistoryItem> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ActivityHistoryItem delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ActivityHistoryItem with a source
     *
     * @param sourceActivityHistoryItem the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ActivityHistoryItem> patchAsync(@Nonnull final ActivityHistoryItem sourceActivityHistoryItem) {
        return sendAsync(HttpMethod.PATCH, sourceActivityHistoryItem);
    }

    /**
     * Patches this ActivityHistoryItem with a source
     *
     * @param sourceActivityHistoryItem the source object with updates
     * @return the updated ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityHistoryItem patch(@Nonnull final ActivityHistoryItem sourceActivityHistoryItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ActivityHistoryItem> postAsync(@Nonnull final ActivityHistoryItem newActivityHistoryItem) {
        return sendAsync(HttpMethod.POST, newActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the new object to create
     * @return the created ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityHistoryItem post(@Nonnull final ActivityHistoryItem newActivityHistoryItem) throws ClientException {
        return send(HttpMethod.POST, newActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ActivityHistoryItem> putAsync(@Nonnull final ActivityHistoryItem newActivityHistoryItem) {
        return sendAsync(HttpMethod.PUT, newActivityHistoryItem);
    }

    /**
     * Creates a ActivityHistoryItem with a new object
     *
     * @param newActivityHistoryItem the object to create/update
     * @return the created ActivityHistoryItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ActivityHistoryItem put(@Nonnull final ActivityHistoryItem newActivityHistoryItem) throws ClientException {
        return send(HttpMethod.PUT, newActivityHistoryItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ActivityHistoryItemRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ActivityHistoryItemRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

