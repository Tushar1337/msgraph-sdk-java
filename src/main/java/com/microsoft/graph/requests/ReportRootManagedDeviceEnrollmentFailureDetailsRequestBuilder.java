// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ReportRootManagedDeviceEnrollmentFailureDetailsRequest;
import com.microsoft.graph.models.ReportRoot;
import com.microsoft.graph.models.Report;
import com.microsoft.graph.models.Report;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.ReportRootManagedDeviceEnrollmentFailureDetailsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Managed Device Enrollment Failure Details Request Builder.
 */
public class ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder extends BaseFunctionRequestBuilder<Report> {

    /**
     * The request builder for this ReportRootManagedDeviceEnrollmentFailureDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this ReportRootManagedDeviceEnrollmentFailureDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootManagedDeviceEnrollmentFailureDetailsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the ReportRootManagedDeviceEnrollmentFailureDetailsRequest
     *
     * @param requestOptions the options for the request
     * @return the ReportRootManagedDeviceEnrollmentFailureDetailsRequest instance
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ReportRootManagedDeviceEnrollmentFailureDetailsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ReportRootManagedDeviceEnrollmentFailureDetailsRequest instance
     */
    @Nonnull
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootManagedDeviceEnrollmentFailureDetailsRequest request = new ReportRootManagedDeviceEnrollmentFailureDetailsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
