// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComplianceDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Device Status Request.
 */
public class DeviceComplianceDeviceStatusRequest extends BaseRequest {
	
    /**
     * The request for the DeviceComplianceDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceDeviceStatusRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceDeviceStatus.class);
    }

    /**
     * Gets the DeviceComplianceDeviceStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceComplianceDeviceStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceComplianceDeviceStatus from the service
     *
     * @return the DeviceComplianceDeviceStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceDeviceStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceComplianceDeviceStatus> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceComplianceDeviceStatus with a source
     *
     * @param sourceDeviceComplianceDeviceStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceComplianceDeviceStatus sourceDeviceComplianceDeviceStatus, final ICallback<? super DeviceComplianceDeviceStatus> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceComplianceDeviceStatus);
    }

    /**
     * Patches this DeviceComplianceDeviceStatus with a source
     *
     * @param sourceDeviceComplianceDeviceStatus the source object with updates
     * @return the updated DeviceComplianceDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceDeviceStatus patch(final DeviceComplianceDeviceStatus sourceDeviceComplianceDeviceStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceDeviceStatus);
    }

    /**
     * Creates a DeviceComplianceDeviceStatus with a new object
     *
     * @param newDeviceComplianceDeviceStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus, final ICallback<? super DeviceComplianceDeviceStatus> callback) {
        send(HttpMethod.POST, callback, newDeviceComplianceDeviceStatus);
    }

    /**
     * Creates a DeviceComplianceDeviceStatus with a new object
     *
     * @param newDeviceComplianceDeviceStatus the new object to create
     * @return the created DeviceComplianceDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceDeviceStatus post(final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceDeviceStatus);
    }

    /**
     * Creates a DeviceComplianceDeviceStatus with a new object
     *
     * @param newDeviceComplianceDeviceStatus the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus, final ICallback<? super DeviceComplianceDeviceStatus> callback) {
        send(HttpMethod.PUT, callback, newDeviceComplianceDeviceStatus);
    }

    /**
     * Creates a DeviceComplianceDeviceStatus with a new object
     *
     * @param newDeviceComplianceDeviceStatus the object to create/update
     * @return the created DeviceComplianceDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceDeviceStatus put(final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus) throws ClientException {
        return send(HttpMethod.PUT, newDeviceComplianceDeviceStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public DeviceComplianceDeviceStatusRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceComplianceDeviceStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public DeviceComplianceDeviceStatusRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceComplianceDeviceStatusRequest)this;
     }

}

