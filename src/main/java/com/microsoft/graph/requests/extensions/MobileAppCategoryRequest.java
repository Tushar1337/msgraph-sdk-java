// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Category Request.
 */
public class MobileAppCategoryRequest extends BaseRequest<MobileAppCategory> {
	
    /**
     * The request for the MobileAppCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppCategoryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppCategory.class);
    }

    /**
     * Gets the MobileAppCategory from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppCategory> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the MobileAppCategory from the service
     *
     * @return the MobileAppCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppCategory> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public MobileAppCategory delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MobileAppCategory with a source
     *
     * @param sourceMobileAppCategory the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppCategory> patchAsync(@Nonnull final MobileAppCategory sourceMobileAppCategory) {
        return sendAsync(HttpMethod.PATCH, sourceMobileAppCategory);
    }

    /**
     * Patches this MobileAppCategory with a source
     *
     * @param sourceMobileAppCategory the source object with updates
     * @return the updated MobileAppCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppCategory patch(@Nonnull final MobileAppCategory sourceMobileAppCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppCategory);
    }

    /**
     * Creates a MobileAppCategory with a new object
     *
     * @param newMobileAppCategory the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppCategory> postAsync(@Nonnull final MobileAppCategory newMobileAppCategory) {
        return sendAsync(HttpMethod.POST, newMobileAppCategory);
    }

    /**
     * Creates a MobileAppCategory with a new object
     *
     * @param newMobileAppCategory the new object to create
     * @return the created MobileAppCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppCategory post(@Nonnull final MobileAppCategory newMobileAppCategory) throws ClientException {
        return send(HttpMethod.POST, newMobileAppCategory);
    }

    /**
     * Creates a MobileAppCategory with a new object
     *
     * @param newMobileAppCategory the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MobileAppCategory> putAsync(@Nonnull final MobileAppCategory newMobileAppCategory) {
        return sendAsync(HttpMethod.PUT, newMobileAppCategory);
    }

    /**
     * Creates a MobileAppCategory with a new object
     *
     * @param newMobileAppCategory the object to create/update
     * @return the created MobileAppCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppCategory put(@Nonnull final MobileAppCategory newMobileAppCategory) throws ClientException {
        return send(HttpMethod.PUT, newMobileAppCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppCategoryRequest select(@Nonnull final String value) {
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
     public MobileAppCategoryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

