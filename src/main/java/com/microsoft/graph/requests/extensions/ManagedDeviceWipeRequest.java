// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedDeviceWipeBody;
import com.microsoft.graph.requests.extensions.IManagedDeviceWipeRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceWipeRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Wipe Request.
 */
public class ManagedDeviceWipeRequest extends BaseRequest implements IManagedDeviceWipeRequest {
    protected final ManagedDeviceWipeBody body;

    /**
     * The request for this ManagedDeviceWipe
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceWipeRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
        body = new ManagedDeviceWipeBody();
    }

    public void post(final ICallback<Void> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public Void post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceWipeRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (ManagedDeviceWipeRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedDeviceWipeRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (ManagedDeviceWipeRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceWipeRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (ManagedDeviceWipeRequest)this;
    }

}
