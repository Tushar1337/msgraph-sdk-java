// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.OrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactCollectionRequest;
import com.microsoft.graph.requests.extensions.OrgContactDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact Collection Request Builder.
 */
public class OrgContactCollectionRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for this collection of OrgContact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrgContactCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    @Nonnull
    public OrgContactCollectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    @Nonnull
    public OrgContactCollectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new OrgContactCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    @Nonnull
    public OrgContactRequestBuilder byId(@Nonnull final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    @Nonnull
    public OrgContactDeltaCollectionRequestBuilder delta() {
        return new OrgContactDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

    @Nonnull
	public OrgContactDeltaCollectionRequestBuilder delta(@Nonnull final String deltaLink) {
        return new OrgContactDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}
