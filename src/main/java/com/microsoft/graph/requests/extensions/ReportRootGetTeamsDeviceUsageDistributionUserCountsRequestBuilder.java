// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageDistributionUserCountsRequest;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Teams Device Usage Distribution User Counts Request Builder.
 */
public class ReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this ReportRootGetTeamsDeviceUsageDistributionUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the ReportRootGetTeamsDeviceUsageDistributionUserCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetTeamsDeviceUsageDistributionUserCountsRequest instance
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ReportRootGetTeamsDeviceUsageDistributionUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetTeamsDeviceUsageDistributionUserCountsRequest instance
     */
    @Nonnull
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetTeamsDeviceUsageDistributionUserCountsRequest request = new ReportRootGetTeamsDeviceUsageDistributionUserCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
