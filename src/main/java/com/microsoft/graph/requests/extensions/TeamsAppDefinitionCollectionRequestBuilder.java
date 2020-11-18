// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsApp;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Definition Collection Request Builder.
 */
public class TeamsAppDefinitionCollectionRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for this collection of TeamsApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppDefinitionCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    @Nonnull
    public TeamsAppDefinitionCollectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    @Nonnull
    public TeamsAppDefinitionCollectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TeamsAppDefinitionCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    @Nonnull
    public TeamsAppDefinitionRequestBuilder byId(@Nonnull final String id) {
        return new TeamsAppDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
