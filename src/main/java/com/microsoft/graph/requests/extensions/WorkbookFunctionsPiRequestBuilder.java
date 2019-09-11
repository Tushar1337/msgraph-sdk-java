// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsPiRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsPiRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Pi Request Builder.
 */
public class WorkbookFunctionsPiRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsPiRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPi
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsPiRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookFunctionsPiRequest
     *
     * @return the IWorkbookFunctionsPiRequest instance
     */
    public IWorkbookFunctionsPiRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPiRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsPiRequest instance
     */
    public IWorkbookFunctionsPiRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsPiRequest request = new WorkbookFunctionsPiRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
