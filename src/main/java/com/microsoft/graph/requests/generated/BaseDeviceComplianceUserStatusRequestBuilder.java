// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusRequest;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance User Status Request Builder.
 */
public class BaseDeviceComplianceUserStatusRequestBuilder extends BaseRequestBuilder implements IBaseDeviceComplianceUserStatusRequestBuilder {

    /**
     * The request builder for the DeviceComplianceUserStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceComplianceUserStatusRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceComplianceUserStatusRequest instance
     */
    public IDeviceComplianceUserStatusRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceComplianceUserStatusRequest instance
     */
    public IDeviceComplianceUserStatusRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DeviceComplianceUserStatusRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
