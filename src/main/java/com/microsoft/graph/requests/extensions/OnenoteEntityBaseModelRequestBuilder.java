// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IOnenoteEntityBaseModelRequest;
import com.microsoft.graph.requests.extensions.OnenoteEntityBaseModelRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Entity Base Model Request Builder.
 */
public class OnenoteEntityBaseModelRequestBuilder extends BaseRequestBuilder implements IOnenoteEntityBaseModelRequestBuilder {

    /**
     * The request builder for the OnenoteEntityBaseModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteEntityBaseModelRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IOnenoteEntityBaseModelRequest instance
     */
    public IOnenoteEntityBaseModelRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOnenoteEntityBaseModelRequest instance
     */
    public IOnenoteEntityBaseModelRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new OnenoteEntityBaseModelRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

