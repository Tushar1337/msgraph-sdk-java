// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Request.
 */
public class OAuth2PermissionGrantRequest extends BaseRequest<OAuth2PermissionGrant> {
	
    /**
     * The request for the OAuth2PermissionGrant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OAuth2PermissionGrant.class);
    }

    /**
     * Gets the OAuth2PermissionGrant from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OAuth2PermissionGrant> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OAuth2PermissionGrant from the service
     *
     * @return the OAuth2PermissionGrant from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OAuth2PermissionGrant get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OAuth2PermissionGrant> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OAuth2PermissionGrant delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OAuth2PermissionGrant with a source
     *
     * @param sourceOAuth2PermissionGrant the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OAuth2PermissionGrant> patchAsync(@Nonnull final OAuth2PermissionGrant sourceOAuth2PermissionGrant) {
        return sendAsync(HttpMethod.PATCH, sourceOAuth2PermissionGrant);
    }

    /**
     * Patches this OAuth2PermissionGrant with a source
     *
     * @param sourceOAuth2PermissionGrant the source object with updates
     * @return the updated OAuth2PermissionGrant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OAuth2PermissionGrant patch(@Nonnull final OAuth2PermissionGrant sourceOAuth2PermissionGrant) throws ClientException {
        return send(HttpMethod.PATCH, sourceOAuth2PermissionGrant);
    }

    /**
     * Creates a OAuth2PermissionGrant with a new object
     *
     * @param newOAuth2PermissionGrant the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OAuth2PermissionGrant> postAsync(@Nonnull final OAuth2PermissionGrant newOAuth2PermissionGrant) {
        return sendAsync(HttpMethod.POST, newOAuth2PermissionGrant);
    }

    /**
     * Creates a OAuth2PermissionGrant with a new object
     *
     * @param newOAuth2PermissionGrant the new object to create
     * @return the created OAuth2PermissionGrant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OAuth2PermissionGrant post(@Nonnull final OAuth2PermissionGrant newOAuth2PermissionGrant) throws ClientException {
        return send(HttpMethod.POST, newOAuth2PermissionGrant);
    }

    /**
     * Creates a OAuth2PermissionGrant with a new object
     *
     * @param newOAuth2PermissionGrant the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OAuth2PermissionGrant> putAsync(@Nonnull final OAuth2PermissionGrant newOAuth2PermissionGrant) {
        return sendAsync(HttpMethod.PUT, newOAuth2PermissionGrant);
    }

    /**
     * Creates a OAuth2PermissionGrant with a new object
     *
     * @param newOAuth2PermissionGrant the object to create/update
     * @return the created OAuth2PermissionGrant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OAuth2PermissionGrant put(@Nonnull final OAuth2PermissionGrant newOAuth2PermissionGrant) throws ClientException {
        return send(HttpMethod.PUT, newOAuth2PermissionGrant);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OAuth2PermissionGrantRequest select(@Nonnull final String value) {
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
     public OAuth2PermissionGrantRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

