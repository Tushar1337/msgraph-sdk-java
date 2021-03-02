// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintService;
import com.microsoft.graph.requests.extensions.IPrintServiceEndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintServiceEndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintServiceEndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintServiceEndpointRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Service Request Builder.
 */
public class PrintServiceRequestBuilder extends BaseRequestBuilder implements IPrintServiceRequestBuilder {

    /**
     * The request builder for the PrintService
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintServiceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPrintServiceRequest instance
     */
    public IPrintServiceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPrintServiceRequest instance
     */
    public IPrintServiceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PrintServiceRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IPrintServiceEndpointCollectionRequestBuilder endpoints() {
        return new PrintServiceEndpointCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("endpoints"), getClient(), null);
    }

    public IPrintServiceEndpointRequestBuilder endpoints(final String id) {
        return new PrintServiceEndpointRequestBuilder(getRequestUrlWithAdditionalSegment("endpoints") + "/" + id, getClient(), null);
    }
}
