// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookTableColumnTotalRowRangeRequest;
import com.microsoft.graph.models.WorkbookTableColumn;
import com.microsoft.graph.models.WorkbookRange;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Column Total Row Range Request Builder.
 */
public class WorkbookTableColumnTotalRowRangeRequestBuilder extends BaseFunctionRequestBuilder<WorkbookRange> {

    /**
     * The request builder for this WorkbookTableColumnTotalRowRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableColumnTotalRowRangeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the WorkbookTableColumnTotalRowRangeRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookTableColumnTotalRowRangeRequest instance
     */
    @Nonnull
    public WorkbookTableColumnTotalRowRangeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookTableColumnTotalRowRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookTableColumnTotalRowRangeRequest instance
     */
    @Nonnull
    public WorkbookTableColumnTotalRowRangeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkbookTableColumnTotalRowRangeRequest request = new WorkbookTableColumnTotalRowRangeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
