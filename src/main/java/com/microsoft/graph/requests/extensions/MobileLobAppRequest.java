// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.MobileLobApp;
import com.microsoft.graph.requests.extensions.MobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppContentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile Lob App Request.
 */
public class MobileLobAppRequest extends BaseRequest<MobileLobApp> {
	
    /**
     * The request for the MobileLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public MobileLobAppRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends MobileLobApp> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the MobileLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileLobAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileLobApp.class);
    }

    /**
     * Gets the MobileLobApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileLobApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the MobileLobApp from the service
     *
     * @return the MobileLobApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileLobApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileLobApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public MobileLobApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MobileLobApp with a source
     *
     * @param sourceMobileLobApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileLobApp> patchAsync(@Nonnull final MobileLobApp sourceMobileLobApp) {
        return sendAsync(HttpMethod.PATCH, sourceMobileLobApp);
    }

    /**
     * Patches this MobileLobApp with a source
     *
     * @param sourceMobileLobApp the source object with updates
     * @return the updated MobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileLobApp patch(@Nonnull final MobileLobApp sourceMobileLobApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileLobApp);
    }

    /**
     * Creates a MobileLobApp with a new object
     *
     * @param newMobileLobApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileLobApp> postAsync(@Nonnull final MobileLobApp newMobileLobApp) {
        return sendAsync(HttpMethod.POST, newMobileLobApp);
    }

    /**
     * Creates a MobileLobApp with a new object
     *
     * @param newMobileLobApp the new object to create
     * @return the created MobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileLobApp post(@Nonnull final MobileLobApp newMobileLobApp) throws ClientException {
        return send(HttpMethod.POST, newMobileLobApp);
    }

    /**
     * Creates a MobileLobApp with a new object
     *
     * @param newMobileLobApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileLobApp> putAsync(@Nonnull final MobileLobApp newMobileLobApp) {
        return sendAsync(HttpMethod.PUT, newMobileLobApp);
    }

    /**
     * Creates a MobileLobApp with a new object
     *
     * @param newMobileLobApp the object to create/update
     * @return the created MobileLobApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileLobApp put(@Nonnull final MobileLobApp newMobileLobApp) throws ClientException {
        return send(HttpMethod.PUT, newMobileLobApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MobileLobAppRequest select(@Nonnull final String value) {
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
     public MobileLobAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

