// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Update Device Status Collection Request.
 */
public class BaseIosUpdateDeviceStatusCollectionRequest extends BaseCollectionRequest<BaseIosUpdateDeviceStatusCollectionResponse, IIosUpdateDeviceStatusCollectionPage> implements IBaseIosUpdateDeviceStatusCollectionRequest {

    /**
     * The request builder for this collection of IosUpdateDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseIosUpdateDeviceStatusCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseIosUpdateDeviceStatusCollectionResponse.class, IIosUpdateDeviceStatusCollectionPage.class);
    }

    public void get(final ICallback<IIosUpdateDeviceStatusCollectionPage> callback) {
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

    public IIosUpdateDeviceStatusCollectionPage get() throws ClientException {
        final BaseIosUpdateDeviceStatusCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final IosUpdateDeviceStatus newIosUpdateDeviceStatus, final ICallback<IosUpdateDeviceStatus> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new IosUpdateDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newIosUpdateDeviceStatus, callback);
    }

    public IosUpdateDeviceStatus post(final IosUpdateDeviceStatus newIosUpdateDeviceStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new IosUpdateDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newIosUpdateDeviceStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IIosUpdateDeviceStatusCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IosUpdateDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IIosUpdateDeviceStatusCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IosUpdateDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IIosUpdateDeviceStatusCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (IosUpdateDeviceStatusCollectionRequest)this;
    }

    public IIosUpdateDeviceStatusCollectionPage buildFromResponse(final BaseIosUpdateDeviceStatusCollectionResponse response) {
        final IIosUpdateDeviceStatusCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new IosUpdateDeviceStatusCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IosUpdateDeviceStatusCollectionPage page = new IosUpdateDeviceStatusCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
