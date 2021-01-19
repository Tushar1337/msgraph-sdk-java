// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Role Assignment Request.
 */
public class AppRoleAssignmentRequest extends BaseRequest<AppRoleAssignment> {
	
    /**
     * The request for the AppRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppRoleAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppRoleAssignment.class);
    }

    /**
     * Gets the AppRoleAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppRoleAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AppRoleAssignment from the service
     *
     * @return the AppRoleAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppRoleAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppRoleAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AppRoleAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AppRoleAssignment with a source
     *
     * @param sourceAppRoleAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppRoleAssignment> patchAsync(@Nonnull final AppRoleAssignment sourceAppRoleAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceAppRoleAssignment);
    }

    /**
     * Patches this AppRoleAssignment with a source
     *
     * @param sourceAppRoleAssignment the source object with updates
     * @return the updated AppRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppRoleAssignment patch(@Nonnull final AppRoleAssignment sourceAppRoleAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceAppRoleAssignment);
    }

    /**
     * Creates a AppRoleAssignment with a new object
     *
     * @param newAppRoleAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppRoleAssignment> postAsync(@Nonnull final AppRoleAssignment newAppRoleAssignment) {
        return sendAsync(HttpMethod.POST, newAppRoleAssignment);
    }

    /**
     * Creates a AppRoleAssignment with a new object
     *
     * @param newAppRoleAssignment the new object to create
     * @return the created AppRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppRoleAssignment post(@Nonnull final AppRoleAssignment newAppRoleAssignment) throws ClientException {
        return send(HttpMethod.POST, newAppRoleAssignment);
    }

    /**
     * Creates a AppRoleAssignment with a new object
     *
     * @param newAppRoleAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppRoleAssignment> putAsync(@Nonnull final AppRoleAssignment newAppRoleAssignment) {
        return sendAsync(HttpMethod.PUT, newAppRoleAssignment);
    }

    /**
     * Creates a AppRoleAssignment with a new object
     *
     * @param newAppRoleAssignment the object to create/update
     * @return the created AppRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppRoleAssignment put(@Nonnull final AppRoleAssignment newAppRoleAssignment) throws ClientException {
        return send(HttpMethod.PUT, newAppRoleAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AppRoleAssignmentRequest select(@Nonnull final String value) {
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
     public AppRoleAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

