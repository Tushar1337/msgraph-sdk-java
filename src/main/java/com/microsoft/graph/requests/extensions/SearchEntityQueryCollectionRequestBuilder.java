// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SearchRequest;
import com.microsoft.graph.models.extensions.SearchResponse;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.SearchEntityQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SearchEntityQueryCollectionRequest;
import com.microsoft.graph.requests.extensions.SearchEntityQueryCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Entity Query Collection Request Builder.
 */
public class SearchEntityQueryCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<SearchResponse, SearchEntityQueryCollectionRequestBuilder, SearchEntityQueryCollectionResponse, SearchEntityQueryCollectionPage, SearchEntityQueryCollectionRequest> {

    /**
     * The request builder for this collection of SearchEntity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param requests the requests
     */
    public SearchEntityQueryCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final java.util.List<SearchRequest> requests) {
        super(requestUrl, client, requestOptions, SearchEntityQueryCollectionRequestBuilder.class, SearchEntityQueryCollectionRequest.class);
  	 if(requests!=null){
			bodyParams.put("requests", requests);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SearchEntityQueryCollectionRequest instance
     */
    @Override
    @Nonnull
    public SearchEntityQueryCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SearchEntityQueryCollectionRequest request = super.buildRequest(requestOptions);

        if (hasParameter("requests")) {
            request.body.requests = getParameter("requests");
        }
  
        return request;
    }
}
