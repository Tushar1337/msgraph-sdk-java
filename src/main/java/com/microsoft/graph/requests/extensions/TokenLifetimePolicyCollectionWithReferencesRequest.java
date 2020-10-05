// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.TokenLifetimePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Lifetime Policy Collection With References Request.
 */
public class TokenLifetimePolicyCollectionWithReferencesRequest extends BaseCollectionRequest<TokenLifetimePolicyCollectionResponse, TokenLifetimePolicyCollectionPage> {

    /**
     * The request builder for this collection of TokenLifetimePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenLifetimePolicyCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenLifetimePolicyCollectionResponse.class, TokenLifetimePolicyCollectionPage.class);
    }

    public void get(final ICallback<? super TokenLifetimePolicyCollectionWithReferencesPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public TokenLifetimePolicyCollectionWithReferencesPage get() throws ClientException {
        final TokenLifetimePolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public TokenLifetimePolicyCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    public TokenLifetimePolicyCollectionWithReferencesRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    public TokenLifetimePolicyCollectionWithReferencesRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    public TokenLifetimePolicyCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    public TokenLifetimePolicyCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    public TokenLifetimePolicyCollectionWithReferencesPage buildFromResponse(final TokenLifetimePolicyCollectionResponse response) {
        final TokenLifetimePolicyCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TokenLifetimePolicyCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TokenLifetimePolicyCollectionWithReferencesPage page = new TokenLifetimePolicyCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
