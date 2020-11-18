// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFisherInvRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Fisher Inv Request Builder.
 */
public class WorkbookFunctionsFisherInvRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFisherInv
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param y the y
     */
    public WorkbookFunctionsFisherInvRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement y) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("y", y);
    }

    /**
     * Creates the WorkbookFunctionsFisherInvRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsFisherInvRequest instance
     */
    @Nonnull
    public WorkbookFunctionsFisherInvRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsFisherInvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsFisherInvRequest instance
     */
    @Nonnull
    public WorkbookFunctionsFisherInvRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsFisherInvRequest request = new WorkbookFunctionsFisherInvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("y")) {
            request.body.y = getParameter("y");
        }

        return request;
    }
}
