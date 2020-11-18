// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.UserSendMailRequest;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Send Mail Request Builder.
 */
public class UserSendMailRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserSendMail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param message the message
     * @param saveToSentItems the saveToSentItems
     */
    public UserSendMailRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final Message message, @Nullable final Boolean saveToSentItems) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("message", message);
        bodyParams.put("saveToSentItems", saveToSentItems);
    }

    /**
     * Creates the UserSendMailRequest
     *
     * @param requestOptions the options for the request
     * @return the UserSendMailRequest instance
     */
    @Nonnull
    public UserSendMailRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserSendMailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserSendMailRequest instance
     */
    @Nonnull
    public UserSendMailRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserSendMailRequest request = new UserSendMailRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("message")) {
            request.body.message = getParameter("message");
        }

        if (hasParameter("saveToSentItems")) {
            request.body.saveToSentItems = getParameter("saveToSentItems");
        }

        return request;
    }
}
