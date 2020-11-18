// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DriveItemPreviewRequest;
import com.microsoft.graph.models.extensions.ItemPreviewInfo;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Preview Request Builder.
 */
public class DriveItemPreviewRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this DriveItemPreview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param page the page
     * @param zoom the zoom
     */
    public DriveItemPreviewRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String page, @Nullable final Double zoom) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("page", page);
        bodyParams.put("zoom", zoom);
    }

    /**
     * Creates the DriveItemPreviewRequest
     *
     * @param requestOptions the options for the request
     * @return the DriveItemPreviewRequest instance
     */
    @Nonnull
    public DriveItemPreviewRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DriveItemPreviewRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DriveItemPreviewRequest instance
     */
    @Nonnull
    public DriveItemPreviewRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DriveItemPreviewRequest request = new DriveItemPreviewRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("page")) {
            request.body.page = getParameter("page");
        }

        if (hasParameter("zoom")) {
            request.body.zoom = getParameter("zoom");
        }

        return request;
    }
}
