// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

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
 * The class for the Base Managed Device Reference Request.
 */
public class BaseManagedDeviceReferenceRequest extends BaseRequest implements IBaseManagedDeviceReferenceRequest {

    /**
     * The request for the ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDevice.class);
    }

    public void delete(final ICallback<ManagedDevice> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ManagedDevice delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (ManagedDeviceReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (ManagedDeviceReferenceRequest)this;
    }
    /**
     * Puts the ManagedDevice
     *
     * @param srcManagedDevice the ManagedDevice reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagedDevice srcManagedDevice, final ICallback<ManagedDevice> callback) {
        send(HttpMethod.PUT, callback, srcManagedDevice);
    }

    /**
     * Puts the ManagedDevice
     *
     * @param srcManagedDevice the ManagedDevice reference to PUT
     * @return the ManagedDevice
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagedDevice put(ManagedDevice srcManagedDevice) throws ClientException {
        return send(HttpMethod.PUT, srcManagedDevice);
    }
}
