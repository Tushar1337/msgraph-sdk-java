// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberObjectsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberObjectsCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberObjectsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Get Member Objects Collection Page.
 */
public class DirectoryObjectGetMemberObjectsCollectionPage extends BaseCollectionPage<String, DirectoryObjectGetMemberObjectsCollectionRequestBuilder> {

    /**
     * A collection page for String.
     *
     * @param response The serialized DirectoryObjectGetMemberObjectsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DirectoryObjectGetMemberObjectsCollectionPage(@Nonnull final DirectoryObjectGetMemberObjectsCollectionResponse response, @Nonnull final DirectoryObjectGetMemberObjectsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
