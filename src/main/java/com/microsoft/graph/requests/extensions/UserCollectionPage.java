// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.requests.extensions.UserCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserCollectionPage;
import com.microsoft.graph.requests.extensions.UserCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Collection Page.
 */
public class UserCollectionPage extends BaseCollectionPage<User, UserCollectionRequestBuilder> {

    /**
     * A collection page for User
     *
     * @param response the serialized UserCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserCollectionPage(@Nonnull final UserCollectionResponse response, @Nonnull final UserCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
