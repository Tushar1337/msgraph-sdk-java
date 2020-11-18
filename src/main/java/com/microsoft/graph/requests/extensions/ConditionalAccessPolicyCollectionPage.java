// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ConditionalAccessPolicy;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Policy Collection Page.
 */
public class ConditionalAccessPolicyCollectionPage extends BaseCollectionPage<ConditionalAccessPolicy, ConditionalAccessPolicyCollectionRequestBuilder> {

    /**
     * A collection page for ConditionalAccessPolicy
     *
     * @param response the serialized ConditionalAccessPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ConditionalAccessPolicyCollectionPage(@Nonnull final ConditionalAccessPolicyCollectionResponse response, @Nonnull final ConditionalAccessPolicyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
