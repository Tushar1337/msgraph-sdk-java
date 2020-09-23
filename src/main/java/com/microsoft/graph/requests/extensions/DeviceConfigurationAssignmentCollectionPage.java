// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Assignment Collection Page.
 */
public class DeviceConfigurationAssignmentCollectionPage extends BaseCollectionPage<DeviceConfigurationAssignment, IDeviceConfigurationAssignmentCollectionRequestBuilder> implements IDeviceConfigurationAssignmentCollectionPage {

    /**
     * A collection page for DeviceConfigurationAssignment
     *
     * @param response the serialized DeviceConfigurationAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceConfigurationAssignmentCollectionPage(final DeviceConfigurationAssignmentCollectionResponse response, final IDeviceConfigurationAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
