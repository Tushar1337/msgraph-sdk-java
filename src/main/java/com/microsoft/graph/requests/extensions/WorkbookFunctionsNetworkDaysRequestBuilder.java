// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNetworkDaysRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Network Days Request Builder.
 */
public class WorkbookFunctionsNetworkDaysRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNetworkDays
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startDate the startDate
     * @param endDate the endDate
     * @param holidays the holidays
     */
    public WorkbookFunctionsNetworkDaysRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement holidays) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("startDate", startDate);
        bodyParams.put("endDate", endDate);
        bodyParams.put("holidays", holidays);
    }

    /**
     * Creates the WorkbookFunctionsNetworkDaysRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsNetworkDaysRequest instance
     */
    public WorkbookFunctionsNetworkDaysRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsNetworkDaysRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsNetworkDaysRequest instance
     */
    public WorkbookFunctionsNetworkDaysRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsNetworkDaysRequest request = new WorkbookFunctionsNetworkDaysRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.body.startDate = getParameter("startDate");
        }

        if (hasParameter("endDate")) {
            request.body.endDate = getParameter("endDate");
        }

        if (hasParameter("holidays")) {
            request.body.holidays = getParameter("holidays");
        }

        return request;
    }
}
