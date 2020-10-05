// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantCollectionPage;
import com.microsoft.graph.requests.extensions.PermissionGrantCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Collection Page.
 */
public class PermissionGrantCollectionPage extends BaseCollectionPage<Permission, PermissionGrantCollectionRequestBuilder> {

    /**
     * A collection page for Permission.
     *
     * @param response The serialized PermissionGrantCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public PermissionGrantCollectionPage(final PermissionGrantCollectionResponse response, final PermissionGrantCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
