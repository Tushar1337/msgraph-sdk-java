// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Directory;
import com.microsoft.graph.models.extensions.AdministrativeUnit;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.AdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitCollectionRequest;
import com.microsoft.graph.requests.extensions.AdministrativeUnitDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Administrative Unit Collection Request Builder.
 */
public class AdministrativeUnitCollectionRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for this collection of Directory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AdministrativeUnitCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    @Nonnull
    public AdministrativeUnitCollectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    @Nonnull
    public AdministrativeUnitCollectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AdministrativeUnitCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    @Nonnull
    public AdministrativeUnitRequestBuilder byId(@Nonnull final String id) {
        return new AdministrativeUnitRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    @Nonnull
    public AdministrativeUnitDeltaCollectionRequestBuilder delta() {
        return new AdministrativeUnitDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

    @Nonnull
	public AdministrativeUnitDeltaCollectionRequestBuilder delta(@Nonnull final String deltaLink) {
        return new AdministrativeUnitDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}
