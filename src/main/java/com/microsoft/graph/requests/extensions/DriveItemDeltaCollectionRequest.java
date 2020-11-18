// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Delta Collection Request.
 */
public class DriveItemDeltaCollectionRequest extends BaseCollectionRequest<DriveItemDeltaCollectionResponse, DriveItemDeltaCollectionPage> {


    /**
     * The request for this DriveItemDelta
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemDeltaCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DriveItemDeltaCollectionResponse.class, DriveItemDeltaCollectionPage.class);
    }


    public void get(@Nonnull final ICallback<? super DriveItemDeltaCollectionPage> callback) {
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

    @Nullable
    public DriveItemDeltaCollectionPage get() throws ClientException {
        final DriveItemDeltaCollectionResponse response = send();
        return buildFromResponse(response);
    }


    @Nonnull
    public DriveItemDeltaCollectionPage buildFromResponse(@Nonnull final DriveItemDeltaCollectionResponse response) {
        final DriveItemDeltaCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DriveItemDeltaCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DriveItemDeltaCollectionPage page = new DriveItemDeltaCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public DriveItemDeltaCollectionRequest select(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DriveItemDeltaCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public DriveItemDeltaCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (DriveItemDeltaCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DriveItemDeltaCollectionRequest expand(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DriveItemDeltaCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public DriveItemDeltaCollectionRequest filter(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DriveItemDeltaCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public DriveItemDeltaCollectionRequest orderBy(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DriveItemDeltaCollectionRequest)this;
    }

}
