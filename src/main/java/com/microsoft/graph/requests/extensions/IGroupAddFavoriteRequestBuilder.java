// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupAddFavoriteRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Add Favorite Request Builder.
 */
public interface IGroupAddFavoriteRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IGroupAddFavoriteRequest
     *
     * @return the IGroupAddFavoriteRequest instance
     */
    IGroupAddFavoriteRequest buildRequest();

    /**
     * Creates the IGroupAddFavoriteRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IGroupAddFavoriteRequest instance
     */
    IGroupAddFavoriteRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
