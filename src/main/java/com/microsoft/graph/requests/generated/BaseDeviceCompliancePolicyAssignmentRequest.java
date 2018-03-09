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
 * The class for the Base Device Compliance Policy Assignment Request.
 */
public class BaseDeviceCompliancePolicyAssignmentRequest extends BaseRequest implements IBaseDeviceCompliancePolicyAssignmentRequest {

    /**
     * The request for the DeviceCompliancePolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseDeviceCompliancePolicyAssignmentRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<DeviceCompliancePolicyAssignment> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DeviceCompliancePolicyAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceCompliancePolicyAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCompliancePolicyAssignment from the service
     *
     * @return the DeviceCompliancePolicyAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this DeviceCompliancePolicyAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceCompliancePolicyAssignment sourceDeviceCompliancePolicyAssignment, final ICallback<DeviceCompliancePolicyAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicyAssignment);
    }

    /**
     * Patches this DeviceCompliancePolicyAssignment with a source
     *
     * @param sourceDeviceCompliancePolicyAssignment the source object with updates
     * @return the updated DeviceCompliancePolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyAssignment patch(final DeviceCompliancePolicyAssignment sourceDeviceCompliancePolicyAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicyAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyAssignment with a new object
     *
     * @param newDeviceCompliancePolicyAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment, final ICallback<DeviceCompliancePolicyAssignment> callback) {
        send(HttpMethod.POST, callback, newDeviceCompliancePolicyAssignment);
    }

    /**
     * Creates a DeviceCompliancePolicyAssignment with a new object
     *
     * @param newDeviceCompliancePolicyAssignment the new object to create
     * @return the created DeviceCompliancePolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyAssignment post(final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicyAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyAssignmentRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceCompliancePolicyAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyAssignmentRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceCompliancePolicyAssignmentRequest)this;
     }

}

