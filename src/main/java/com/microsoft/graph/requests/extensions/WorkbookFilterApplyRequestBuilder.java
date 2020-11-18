// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyRequest;
import com.microsoft.graph.models.extensions.WorkbookFilterCriteria;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Request Builder.
 */
public class WorkbookFilterApplyRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param criteria the criteria
     */
    public WorkbookFilterApplyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final WorkbookFilterCriteria criteria) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("criteria", criteria);
    }

    /**
     * Creates the WorkbookFilterApplyRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFilterApplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFilterApplyRequest request = new WorkbookFilterApplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("criteria")) {
            request.body.criteria = getParameter("criteria");
        }

        return request;
    }
}
