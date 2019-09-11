// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedAppProtectionRequest;
import com.microsoft.graph.requests.extensions.ManagedAppProtectionRequest;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.requests.extensions.IManagedAppProtectionTargetAppsRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppProtectionTargetAppsRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Protection Request Builder.
 */
public class ManagedAppProtectionRequestBuilder extends BaseRequestBuilder implements IManagedAppProtectionRequestBuilder {

    /**
     * The request builder for the ManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppProtectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagedAppProtectionRequest instance
     */
    public IManagedAppProtectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IManagedAppProtectionRequest instance
     */
    public IManagedAppProtectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ManagedAppProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IManagedAppProtectionTargetAppsRequestBuilder targetApps(final java.util.List<ManagedMobileApp> apps) {
        return new ManagedAppProtectionTargetAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.targetApps"), getClient(), null, apps);
    }
}

