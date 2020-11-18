// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsReplaceRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Replace Request Builder.
 */
public class WorkbookFunctionsReplaceRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsReplace
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param oldText the oldText
     * @param startNum the startNum
     * @param numChars the numChars
     * @param newText the newText
     */
    public WorkbookFunctionsReplaceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement oldText, @Nullable final com.google.gson.JsonElement startNum, @Nullable final com.google.gson.JsonElement numChars, @Nullable final com.google.gson.JsonElement newText) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("oldText", oldText);
        bodyParams.put("startNum", startNum);
        bodyParams.put("numChars", numChars);
        bodyParams.put("newText", newText);
    }

    /**
     * Creates the WorkbookFunctionsReplaceRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsReplaceRequest instance
     */
    @Nonnull
    public WorkbookFunctionsReplaceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsReplaceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsReplaceRequest instance
     */
    @Nonnull
    public WorkbookFunctionsReplaceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsReplaceRequest request = new WorkbookFunctionsReplaceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("oldText")) {
            request.body.oldText = getParameter("oldText");
        }

        if (hasParameter("startNum")) {
            request.body.startNum = getParameter("startNum");
        }

        if (hasParameter("numChars")) {
            request.body.numChars = getParameter("numChars");
        }

        if (hasParameter("newText")) {
            request.body.newText = getParameter("newText");
        }

        return request;
    }
}
