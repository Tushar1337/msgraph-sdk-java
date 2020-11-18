// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDollarFrRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Dollar Fr Request Builder.
 */
public class WorkbookFunctionsDollarFrRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDollarFr
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param decimalDollar the decimalDollar
     * @param fraction the fraction
     */
    public WorkbookFunctionsDollarFrRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement decimalDollar, @Nullable final com.google.gson.JsonElement fraction) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("decimalDollar", decimalDollar);
        bodyParams.put("fraction", fraction);
    }

    /**
     * Creates the WorkbookFunctionsDollarFrRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsDollarFrRequest instance
     */
    @Nonnull
    public WorkbookFunctionsDollarFrRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsDollarFrRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsDollarFrRequest instance
     */
    @Nonnull
    public WorkbookFunctionsDollarFrRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsDollarFrRequest request = new WorkbookFunctionsDollarFrRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("decimalDollar")) {
            request.body.decimalDollar = getParameter("decimalDollar");
        }

        if (hasParameter("fraction")) {
            request.body.fraction = getParameter("fraction");
        }

        return request;
    }
}
