// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsOddFYieldRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Odd FYield Request Builder.
 */
public class WorkbookFunctionsOddFYieldRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsOddFYield
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param settlement the settlement
     * @param maturity the maturity
     * @param issue the issue
     * @param firstCoupon the firstCoupon
     * @param rate the rate
     * @param pr the pr
     * @param redemption the redemption
     * @param frequency the frequency
     * @param basis the basis
     */
    public WorkbookFunctionsOddFYieldRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement settlement, @Nullable final com.google.gson.JsonElement maturity, @Nullable final com.google.gson.JsonElement issue, @Nullable final com.google.gson.JsonElement firstCoupon, @Nullable final com.google.gson.JsonElement rate, @Nullable final com.google.gson.JsonElement pr, @Nullable final com.google.gson.JsonElement redemption, @Nullable final com.google.gson.JsonElement frequency, @Nullable final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("issue", issue);
        bodyParams.put("firstCoupon", firstCoupon);
        bodyParams.put("rate", rate);
        bodyParams.put("pr", pr);
        bodyParams.put("redemption", redemption);
        bodyParams.put("frequency", frequency);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the WorkbookFunctionsOddFYieldRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsOddFYieldRequest instance
     */
    @Nonnull
    public WorkbookFunctionsOddFYieldRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsOddFYieldRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsOddFYieldRequest instance
     */
    @Nonnull
    public WorkbookFunctionsOddFYieldRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsOddFYieldRequest request = new WorkbookFunctionsOddFYieldRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.body.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.body.maturity = getParameter("maturity");
        }

        if (hasParameter("issue")) {
            request.body.issue = getParameter("issue");
        }

        if (hasParameter("firstCoupon")) {
            request.body.firstCoupon = getParameter("firstCoupon");
        }

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("pr")) {
            request.body.pr = getParameter("pr");
        }

        if (hasParameter("redemption")) {
            request.body.redemption = getParameter("redemption");
        }

        if (hasParameter("frequency")) {
            request.body.frequency = getParameter("frequency");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
