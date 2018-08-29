// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DeviceEnrollmentLimitConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Enrollment Limit Configuration Request.
 */
public interface IBaseDeviceEnrollmentLimitConfigurationRequest extends IHttpRequest {

    /**
     * Gets the DeviceEnrollmentLimitConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceEnrollmentLimitConfiguration> callback);

    /**
     * Gets the DeviceEnrollmentLimitConfiguration from the service
     *
     * @return the DeviceEnrollmentLimitConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceEnrollmentLimitConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceEnrollmentLimitConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceEnrollmentLimitConfiguration with a source
     *
     * @param sourceDeviceEnrollmentLimitConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceEnrollmentLimitConfiguration sourceDeviceEnrollmentLimitConfiguration, final ICallback<DeviceEnrollmentLimitConfiguration> callback);

    /**
     * Patches this DeviceEnrollmentLimitConfiguration with a source
     *
     * @param sourceDeviceEnrollmentLimitConfiguration the source object with updates
     * @return the updated DeviceEnrollmentLimitConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceEnrollmentLimitConfiguration patch(final DeviceEnrollmentLimitConfiguration sourceDeviceEnrollmentLimitConfiguration) throws ClientException;

    /**
     * Posts a DeviceEnrollmentLimitConfiguration with a new object
     *
     * @param newDeviceEnrollmentLimitConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration, final ICallback<DeviceEnrollmentLimitConfiguration> callback);

    /**
     * Posts a DeviceEnrollmentLimitConfiguration with a new object
     *
     * @param newDeviceEnrollmentLimitConfiguration the new object to create
     * @return the created DeviceEnrollmentLimitConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceEnrollmentLimitConfiguration post(final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseDeviceEnrollmentLimitConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseDeviceEnrollmentLimitConfigurationRequest expand(final String value);

}
