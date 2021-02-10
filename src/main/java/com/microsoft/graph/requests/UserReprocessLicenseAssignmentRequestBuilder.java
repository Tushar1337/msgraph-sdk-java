// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.UserReprocessLicenseAssignmentRequest;
import com.microsoft.graph.models.User;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Reprocess License Assignment Request Builder.
 */
public class UserReprocessLicenseAssignmentRequestBuilder extends BaseActionRequestBuilder<User> {

    /**
     * The request builder for this UserReprocessLicenseAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserReprocessLicenseAssignmentRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the UserReprocessLicenseAssignmentRequest
     *
     * @param requestOptions the options for the request
     * @return the UserReprocessLicenseAssignmentRequest instance
     */
    @Nonnull
    public UserReprocessLicenseAssignmentRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserReprocessLicenseAssignmentRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserReprocessLicenseAssignmentRequest instance
     */
    @Nonnull
    public UserReprocessLicenseAssignmentRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserReprocessLicenseAssignmentRequest request = new UserReprocessLicenseAssignmentRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
