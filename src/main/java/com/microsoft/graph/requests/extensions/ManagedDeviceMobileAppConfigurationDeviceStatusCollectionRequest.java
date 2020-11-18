// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfiguration;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Device Status Collection Request.
 */
public class ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest extends BaseCollectionRequest<ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse, ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage> {

    /**
     * The request builder for this collection of ManagedDeviceMobileAppConfigurationDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse.class, ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage.class);
    }

    public void get(@Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage> callback) {
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

    @Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage get() throws ClientException {
        final ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(@Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus newManagedDeviceMobileAppConfigurationDeviceStatus, @Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationDeviceStatus> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceMobileAppConfigurationDeviceStatus, callback);
    }

    @Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatus post(@Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatus newManagedDeviceMobileAppConfigurationDeviceStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceMobileAppConfigurationDeviceStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest expand(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest filter(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest orderBy(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest select(@Nonnull final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest)this;
    }
    @Nonnull
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage buildFromResponse(@Nonnull final ManagedDeviceMobileAppConfigurationDeviceStatusCollectionResponse response) {
        final ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage page = new ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
