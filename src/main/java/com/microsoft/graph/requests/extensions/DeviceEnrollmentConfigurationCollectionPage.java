// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Collection Page.
 */
public class DeviceEnrollmentConfigurationCollectionPage extends BaseCollectionPage<DeviceEnrollmentConfiguration, IDeviceEnrollmentConfigurationCollectionRequestBuilder> implements IDeviceEnrollmentConfigurationCollectionPage {

    /**
     * A collection page for DeviceEnrollmentConfiguration
     *
     * @param response the serialized DeviceEnrollmentConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceEnrollmentConfigurationCollectionPage(final DeviceEnrollmentConfigurationCollectionResponse response, final IDeviceEnrollmentConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
