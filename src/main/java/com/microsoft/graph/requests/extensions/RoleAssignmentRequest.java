// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.RoleAssignment;
import com.microsoft.graph.requests.extensions.RoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Assignment Request.
 */
public class RoleAssignmentRequest extends BaseRequest<RoleAssignment> {
	
    /**
     * The request for the RoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public RoleAssignmentRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends RoleAssignment> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the RoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoleAssignment.class);
    }

    /**
     * Gets the RoleAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RoleAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the RoleAssignment from the service
     *
     * @return the RoleAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RoleAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RoleAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public RoleAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this RoleAssignment with a source
     *
     * @param sourceRoleAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RoleAssignment> patchAsync(@Nonnull final RoleAssignment sourceRoleAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceRoleAssignment);
    }

    /**
     * Patches this RoleAssignment with a source
     *
     * @param sourceRoleAssignment the source object with updates
     * @return the updated RoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RoleAssignment patch(@Nonnull final RoleAssignment sourceRoleAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceRoleAssignment);
    }

    /**
     * Creates a RoleAssignment with a new object
     *
     * @param newRoleAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RoleAssignment> postAsync(@Nonnull final RoleAssignment newRoleAssignment) {
        return sendAsync(HttpMethod.POST, newRoleAssignment);
    }

    /**
     * Creates a RoleAssignment with a new object
     *
     * @param newRoleAssignment the new object to create
     * @return the created RoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RoleAssignment post(@Nonnull final RoleAssignment newRoleAssignment) throws ClientException {
        return send(HttpMethod.POST, newRoleAssignment);
    }

    /**
     * Creates a RoleAssignment with a new object
     *
     * @param newRoleAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RoleAssignment> putAsync(@Nonnull final RoleAssignment newRoleAssignment) {
        return sendAsync(HttpMethod.PUT, newRoleAssignment);
    }

    /**
     * Creates a RoleAssignment with a new object
     *
     * @param newRoleAssignment the object to create/update
     * @return the created RoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RoleAssignment put(@Nonnull final RoleAssignment newRoleAssignment) throws ClientException {
        return send(HttpMethod.PUT, newRoleAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public RoleAssignmentRequest select(@Nonnull final String value) {
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
     public RoleAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

