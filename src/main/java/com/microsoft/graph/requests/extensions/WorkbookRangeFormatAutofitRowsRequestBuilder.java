// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookRangeFormatAutofitRowsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Format Autofit Rows Request Builder.
 */
public class WorkbookRangeFormatAutofitRowsRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeFormatAutofitRows
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeFormatAutofitRowsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the WorkbookRangeFormatAutofitRowsRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeFormatAutofitRowsRequest instance
     */
    @Nonnull
    public WorkbookRangeFormatAutofitRowsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookRangeFormatAutofitRowsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeFormatAutofitRowsRequest instance
     */
    @Nonnull
    public WorkbookRangeFormatAutofitRowsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookRangeFormatAutofitRowsRequest request = new WorkbookRangeFormatAutofitRowsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
