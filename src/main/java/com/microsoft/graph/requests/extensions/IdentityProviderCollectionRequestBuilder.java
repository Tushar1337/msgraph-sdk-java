// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityProvider;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.IdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Provider Collection Request Builder.
 */
public class IdentityProviderCollectionRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for this collection of IdentityProvider
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityProviderCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    @Nonnull
    public IdentityProviderCollectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    @Nonnull
    public IdentityProviderCollectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new IdentityProviderCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    @Nonnull
    public IdentityProviderRequestBuilder byId(@Nonnull final String id) {
        return new IdentityProviderRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
