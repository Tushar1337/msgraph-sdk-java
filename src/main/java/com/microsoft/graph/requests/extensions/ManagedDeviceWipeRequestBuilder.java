// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ManagedDeviceWipeRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Wipe Request Builder.
 */
public class ManagedDeviceWipeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceWipe
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param keepEnrollmentData the keepEnrollmentData
     * @param keepUserData the keepUserData
     * @param macOsUnlockCode the macOsUnlockCode
     */
    public ManagedDeviceWipeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final Boolean keepEnrollmentData, @Nullable final Boolean keepUserData, @Nullable final String macOsUnlockCode) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("keepEnrollmentData", keepEnrollmentData);
        bodyParams.put("keepUserData", keepUserData);
        bodyParams.put("macOsUnlockCode", macOsUnlockCode);
    }

    /**
     * Creates the ManagedDeviceWipeRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceWipeRequest instance
     */
    @Nonnull
    public ManagedDeviceWipeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedDeviceWipeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceWipeRequest instance
     */
    @Nonnull
    public ManagedDeviceWipeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedDeviceWipeRequest request = new ManagedDeviceWipeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("keepEnrollmentData")) {
            request.body.keepEnrollmentData = getParameter("keepEnrollmentData");
        }

        if (hasParameter("keepUserData")) {
            request.body.keepUserData = getParameter("keepUserData");
        }

        if (hasParameter("macOsUnlockCode")) {
            request.body.macOsUnlockCode = getParameter("macOsUnlockCode");
        }

        return request;
    }
}
