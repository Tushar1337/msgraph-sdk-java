// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedAppStatus;
import com.microsoft.graph.requests.extensions.ManagedAppStatusCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppStatusCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppStatusCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Status Collection Page.
 */
public class ManagedAppStatusCollectionPage extends BaseCollectionPage<ManagedAppStatus, ManagedAppStatusCollectionRequestBuilder> {

    /**
     * A collection page for ManagedAppStatus
     *
     * @param response the serialized ManagedAppStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedAppStatusCollectionPage(final ManagedAppStatusCollectionResponse response, final ManagedAppStatusCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
