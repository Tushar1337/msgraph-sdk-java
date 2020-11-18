// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Category Collection Page.
 */
public class MobileAppCategoryCollectionPage extends BaseCollectionPage<MobileAppCategory, MobileAppCategoryCollectionRequestBuilder> {

    /**
     * A collection page for MobileAppCategory
     *
     * @param response the serialized MobileAppCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppCategoryCollectionPage(@Nonnull final MobileAppCategoryCollectionResponse response, @Nonnull final MobileAppCategoryCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
