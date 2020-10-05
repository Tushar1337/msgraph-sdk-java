// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsMinuteRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Minute Request Builder.
 */
public class WorkbookFunctionsMinuteRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMinute
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param serialNumber the serialNumber
     */
    public WorkbookFunctionsMinuteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement serialNumber) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("serialNumber", serialNumber);
    }

    /**
     * Creates the WorkbookFunctionsMinuteRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsMinuteRequest instance
     */
    public WorkbookFunctionsMinuteRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsMinuteRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsMinuteRequest instance
     */
    public WorkbookFunctionsMinuteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsMinuteRequest request = new WorkbookFunctionsMinuteRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("serialNumber")) {
            request.body.serialNumber = getParameter("serialNumber");
        }

        return request;
    }
}
