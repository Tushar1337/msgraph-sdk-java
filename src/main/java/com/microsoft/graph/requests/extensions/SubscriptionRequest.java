// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Subscription;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscription Request.
 */
public class SubscriptionRequest extends BaseRequest<Subscription> {
	
    /**
     * The request for the Subscription
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SubscriptionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Subscription.class);
    }

    /**
     * Gets the Subscription from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Subscription> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Subscription from the service
     *
     * @return the Subscription from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Subscription get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Subscription> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Subscription delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Subscription with a source
     *
     * @param sourceSubscription the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Subscription> patchAsync(@Nonnull final Subscription sourceSubscription) {
        return sendAsync(HttpMethod.PATCH, sourceSubscription);
    }

    /**
     * Patches this Subscription with a source
     *
     * @param sourceSubscription the source object with updates
     * @return the updated Subscription
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Subscription patch(@Nonnull final Subscription sourceSubscription) throws ClientException {
        return send(HttpMethod.PATCH, sourceSubscription);
    }

    /**
     * Creates a Subscription with a new object
     *
     * @param newSubscription the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Subscription> postAsync(@Nonnull final Subscription newSubscription) {
        return sendAsync(HttpMethod.POST, newSubscription);
    }

    /**
     * Creates a Subscription with a new object
     *
     * @param newSubscription the new object to create
     * @return the created Subscription
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Subscription post(@Nonnull final Subscription newSubscription) throws ClientException {
        return send(HttpMethod.POST, newSubscription);
    }

    /**
     * Creates a Subscription with a new object
     *
     * @param newSubscription the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Subscription> putAsync(@Nonnull final Subscription newSubscription) {
        return sendAsync(HttpMethod.PUT, newSubscription);
    }

    /**
     * Creates a Subscription with a new object
     *
     * @param newSubscription the object to create/update
     * @return the created Subscription
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Subscription put(@Nonnull final Subscription newSubscription) throws ClientException {
        return send(HttpMethod.PUT, newSubscription);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SubscriptionRequest select(@Nonnull final String value) {
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
     public SubscriptionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

