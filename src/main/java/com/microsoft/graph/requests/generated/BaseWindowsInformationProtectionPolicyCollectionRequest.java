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
 * The class for the Base Windows Information Protection Policy Collection Request.
 */
public class BaseWindowsInformationProtectionPolicyCollectionRequest extends BaseCollectionRequest<BaseWindowsInformationProtectionPolicyCollectionResponse, IWindowsInformationProtectionPolicyCollectionPage> implements IBaseWindowsInformationProtectionPolicyCollectionRequest {

    /**
     * The request builder for this collection of WindowsInformationProtectionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWindowsInformationProtectionPolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseWindowsInformationProtectionPolicyCollectionResponse.class, IWindowsInformationProtectionPolicyCollectionPage.class);
    }

    public void get(final ICallback<IWindowsInformationProtectionPolicyCollectionPage> callback) {
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

    public IWindowsInformationProtectionPolicyCollectionPage get() throws ClientException {
        final BaseWindowsInformationProtectionPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WindowsInformationProtectionPolicy newWindowsInformationProtectionPolicy, final ICallback<WindowsInformationProtectionPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WindowsInformationProtectionPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsInformationProtectionPolicy, callback);
    }

    public WindowsInformationProtectionPolicy post(final WindowsInformationProtectionPolicy newWindowsInformationProtectionPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WindowsInformationProtectionPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsInformationProtectionPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsInformationProtectionPolicyCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (WindowsInformationProtectionPolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsInformationProtectionPolicyCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (WindowsInformationProtectionPolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWindowsInformationProtectionPolicyCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (WindowsInformationProtectionPolicyCollectionRequest)this;
    }

    public IWindowsInformationProtectionPolicyCollectionPage buildFromResponse(final BaseWindowsInformationProtectionPolicyCollectionResponse response) {
        final IWindowsInformationProtectionPolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WindowsInformationProtectionPolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WindowsInformationProtectionPolicyCollectionPage page = new WindowsInformationProtectionPolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
