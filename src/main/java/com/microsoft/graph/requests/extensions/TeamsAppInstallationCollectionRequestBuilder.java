// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Chat;
import com.microsoft.graph.models.extensions.TeamsAppInstallation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Installation Collection Request Builder.
 */
public class TeamsAppInstallationCollectionRequestBuilder extends BaseRequestBuilder implements ITeamsAppInstallationCollectionRequestBuilder {

    /**
     * The request builder for this collection of Chat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppInstallationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITeamsAppInstallationCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ITeamsAppInstallationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TeamsAppInstallationCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITeamsAppInstallationRequestBuilder byId(final String id) {
        return new TeamsAppInstallationRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
