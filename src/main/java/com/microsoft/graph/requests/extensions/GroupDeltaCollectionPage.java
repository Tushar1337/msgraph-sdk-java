// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Group;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.GroupDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.GroupDeltaCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Delta Collection Page.
 */
public class GroupDeltaCollectionPage extends BaseCollectionPage<Group, GroupDeltaCollectionRequestBuilder> {

    /**
     * The opaque link to query delta after the 
     * initial request
     */
    @Nullable
    public String deltaLink;

    /**
     * A collection page for Group.
     *
     * @param response The serialized GroupDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public GroupDeltaCollectionPage(@Nonnull final GroupDeltaCollectionResponse response, @Nonnull final GroupDeltaCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());

        if (response.getRawObject().get("@odata.deltaLink") != null) {
            deltaLink = response.getRawObject().get("@odata.deltaLink").getAsString();
        } else {
            deltaLink = null;
        }
    }
    /**
     * The deltaLink to make future delta requests
     *
     * @return String The deltaLink URL
     */
    @Nullable
    public String deltaLink() {
        return deltaLink;
    }
}
