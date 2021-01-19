// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Permission;
import com.microsoft.graph.models.extensions.DriveRecipient;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Request.
 */
public class PermissionRequest extends BaseRequest<Permission> {
	
    /**
     * The request for the Permission
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PermissionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Permission.class);
    }

    /**
     * Gets the Permission from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Permission> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Permission from the service
     *
     * @return the Permission from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Permission get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Permission> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Permission delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Permission with a source
     *
     * @param sourcePermission the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Permission> patchAsync(@Nonnull final Permission sourcePermission) {
        return sendAsync(HttpMethod.PATCH, sourcePermission);
    }

    /**
     * Patches this Permission with a source
     *
     * @param sourcePermission the source object with updates
     * @return the updated Permission
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Permission patch(@Nonnull final Permission sourcePermission) throws ClientException {
        return send(HttpMethod.PATCH, sourcePermission);
    }

    /**
     * Creates a Permission with a new object
     *
     * @param newPermission the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Permission> postAsync(@Nonnull final Permission newPermission) {
        return sendAsync(HttpMethod.POST, newPermission);
    }

    /**
     * Creates a Permission with a new object
     *
     * @param newPermission the new object to create
     * @return the created Permission
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Permission post(@Nonnull final Permission newPermission) throws ClientException {
        return send(HttpMethod.POST, newPermission);
    }

    /**
     * Creates a Permission with a new object
     *
     * @param newPermission the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Permission> putAsync(@Nonnull final Permission newPermission) {
        return sendAsync(HttpMethod.PUT, newPermission);
    }

    /**
     * Creates a Permission with a new object
     *
     * @param newPermission the object to create/update
     * @return the created Permission
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Permission put(@Nonnull final Permission newPermission) throws ClientException {
        return send(HttpMethod.PUT, newPermission);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PermissionRequest select(@Nonnull final String value) {
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
     public PermissionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

