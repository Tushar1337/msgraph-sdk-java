// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest;
import com.microsoft.graph.models.ReportRoot;
import com.microsoft.graph.models.Report;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.ReportRootGetMailboxUsageQuotaStatusMailboxCountsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Mailbox Usage Quota Status Mailbox Counts Request Builder.
 */
public class ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder extends BaseFunctionRequestBuilder<Report> {

    /**
     * The request builder for this ReportRootGetMailboxUsageQuotaStatusMailboxCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetMailboxUsageQuotaStatusMailboxCountsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest instance
     */
    @Nonnull
    public ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest instance
     */
    @Nonnull
    public ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest request = new ReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
}
