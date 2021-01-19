// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Request.
 */
public class TokenIssuancePolicyRequest extends BaseRequest<TokenIssuancePolicy> {
	
    /**
     * The request for the TokenIssuancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenIssuancePolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenIssuancePolicy.class);
    }

    /**
     * Gets the TokenIssuancePolicy from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TokenIssuancePolicy> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TokenIssuancePolicy from the service
     *
     * @return the TokenIssuancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TokenIssuancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TokenIssuancePolicy> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TokenIssuancePolicy delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TokenIssuancePolicy with a source
     *
     * @param sourceTokenIssuancePolicy the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TokenIssuancePolicy> patchAsync(@Nonnull final TokenIssuancePolicy sourceTokenIssuancePolicy) {
        return sendAsync(HttpMethod.PATCH, sourceTokenIssuancePolicy);
    }

    /**
     * Patches this TokenIssuancePolicy with a source
     *
     * @param sourceTokenIssuancePolicy the source object with updates
     * @return the updated TokenIssuancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TokenIssuancePolicy patch(@Nonnull final TokenIssuancePolicy sourceTokenIssuancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceTokenIssuancePolicy);
    }

    /**
     * Creates a TokenIssuancePolicy with a new object
     *
     * @param newTokenIssuancePolicy the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TokenIssuancePolicy> postAsync(@Nonnull final TokenIssuancePolicy newTokenIssuancePolicy) {
        return sendAsync(HttpMethod.POST, newTokenIssuancePolicy);
    }

    /**
     * Creates a TokenIssuancePolicy with a new object
     *
     * @param newTokenIssuancePolicy the new object to create
     * @return the created TokenIssuancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TokenIssuancePolicy post(@Nonnull final TokenIssuancePolicy newTokenIssuancePolicy) throws ClientException {
        return send(HttpMethod.POST, newTokenIssuancePolicy);
    }

    /**
     * Creates a TokenIssuancePolicy with a new object
     *
     * @param newTokenIssuancePolicy the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TokenIssuancePolicy> putAsync(@Nonnull final TokenIssuancePolicy newTokenIssuancePolicy) {
        return sendAsync(HttpMethod.PUT, newTokenIssuancePolicy);
    }

    /**
     * Creates a TokenIssuancePolicy with a new object
     *
     * @param newTokenIssuancePolicy the object to create/update
     * @return the created TokenIssuancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TokenIssuancePolicy put(@Nonnull final TokenIssuancePolicy newTokenIssuancePolicy) throws ClientException {
        return send(HttpMethod.PUT, newTokenIssuancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TokenIssuancePolicyRequest select(@Nonnull final String value) {
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
     public TokenIssuancePolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

