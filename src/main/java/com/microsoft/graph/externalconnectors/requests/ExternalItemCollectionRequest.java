// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.externalconnectors.models.ExternalConnection;
import com.microsoft.graph.externalconnectors.models.ExternalItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.externalconnectors.requests.ExternalItemCollectionResponse;
import com.microsoft.graph.externalconnectors.requests.ExternalItemCollectionRequestBuilder;
import com.microsoft.graph.externalconnectors.requests.ExternalItemCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Item Collection Request.
 */
public class ExternalItemCollectionRequest extends BaseEntityCollectionRequest<ExternalItem, ExternalItemCollectionResponse, ExternalItemCollectionPage> {

    /**
     * The request builder for this collection of ExternalItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExternalItemCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExternalItemCollectionResponse.class, ExternalItemCollectionPage.class, ExternalItemCollectionRequestBuilder.class);
    }

    /**
     * Creates a new ExternalItem
     * @param newExternalItem the ExternalItem to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExternalItem> postAsync(@Nonnull final ExternalItem newExternalItem) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ExternalItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newExternalItem);
    }

    /**
     * Creates a new ExternalItem
     * @param newExternalItem the ExternalItem to create
     * @return the newly created object
     */
    @Nonnull
    public ExternalItem post(@Nonnull final ExternalItem newExternalItem) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ExternalItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newExternalItem);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ExternalItemCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public ExternalItemCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public ExternalItemCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ExternalItemCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public ExternalItemCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public ExternalItemCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ExternalItemCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public ExternalItemCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public ExternalItemCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

