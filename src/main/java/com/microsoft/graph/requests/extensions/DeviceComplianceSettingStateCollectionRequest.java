// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingStateSummary;
import com.microsoft.graph.models.extensions.DeviceComplianceSettingState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Setting State Collection Request.
 */
public class DeviceComplianceSettingStateCollectionRequest extends BaseCollectionRequest<DeviceComplianceSettingStateCollectionResponse, DeviceComplianceSettingStateCollectionPage> {

    /**
     * The request builder for this collection of DeviceComplianceSettingState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceSettingStateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceSettingStateCollectionResponse.class, DeviceComplianceSettingStateCollectionPage.class);
    }

    public void get(final ICallback<? super DeviceComplianceSettingStateCollectionPage> callback) {
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

    public DeviceComplianceSettingStateCollectionPage get() throws ClientException {
        final DeviceComplianceSettingStateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceComplianceSettingState newDeviceComplianceSettingState, final ICallback<? super DeviceComplianceSettingState> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceComplianceSettingStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceComplianceSettingState, callback);
    }

    public DeviceComplianceSettingState post(final DeviceComplianceSettingState newDeviceComplianceSettingState) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceComplianceSettingStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceComplianceSettingState);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public DeviceComplianceSettingStateCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceComplianceSettingStateCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public DeviceComplianceSettingStateCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceComplianceSettingStateCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public DeviceComplianceSettingStateCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceComplianceSettingStateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public DeviceComplianceSettingStateCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceComplianceSettingStateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public DeviceComplianceSettingStateCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceComplianceSettingStateCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public DeviceComplianceSettingStateCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceComplianceSettingStateCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public DeviceComplianceSettingStateCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (DeviceComplianceSettingStateCollectionRequest)this;
    }
    public DeviceComplianceSettingStateCollectionPage buildFromResponse(final DeviceComplianceSettingStateCollectionResponse response) {
        final DeviceComplianceSettingStateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceComplianceSettingStateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceComplianceSettingStateCollectionPage page = new DeviceComplianceSettingStateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
