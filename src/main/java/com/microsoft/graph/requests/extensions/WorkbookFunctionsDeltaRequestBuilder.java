// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDeltaRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Delta Request Builder.
 */
public class WorkbookFunctionsDeltaRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDelta
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number1 the number1
     * @param number2 the number2
     */
    public WorkbookFunctionsDeltaRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement number1, final com.google.gson.JsonElement number2) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number1", number1);
        bodyParams.put("number2", number2);
    }

    /**
     * Creates the WorkbookFunctionsDeltaRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsDeltaRequest instance
     */
    public WorkbookFunctionsDeltaRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsDeltaRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsDeltaRequest instance
     */
    public WorkbookFunctionsDeltaRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsDeltaRequest request = new WorkbookFunctionsDeltaRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number1")) {
            request.body.number1 = getParameter("number1");
        }

        if (hasParameter("number2")) {
            request.body.number2 = getParameter("number2");
        }

        return request;
    }
}
