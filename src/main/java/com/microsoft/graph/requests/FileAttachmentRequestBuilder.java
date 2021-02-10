// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.FileAttachment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Attachment Request Builder.
 */
public class FileAttachmentRequestBuilder extends BaseRequestBuilder<FileAttachment> {

    /**
     * The request builder for the FileAttachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FileAttachmentRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the FileAttachmentRequest instance
     */
    @Nonnull
    public FileAttachmentRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the FileAttachmentRequest instance
     */
    @Nonnull
    public FileAttachmentRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.FileAttachmentRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a request builder to get the binary value of the object
     * @return the stream request builder
     */
    @Nonnull
    public FileAttachmentStreamRequestBuilder content() {
        return new FileAttachmentStreamRequestBuilder(getRequestUrlWithAdditionalSegment("$value"), getClient(), null);
    }
}
