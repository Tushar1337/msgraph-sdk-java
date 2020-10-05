// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppDiagnosticStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedAppDiagnosticStatusesCollectionPage;
import com.microsoft.graph.requests.extensions.UserGetManagedAppDiagnosticStatusesCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Managed App Diagnostic Statuses Collection Page.
 */
public class UserGetManagedAppDiagnosticStatusesCollectionPage extends BaseCollectionPage<ManagedAppDiagnosticStatus, UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder> {

    /**
     * A collection page for ManagedAppDiagnosticStatus.
     *
     * @param response The serialized UserGetManagedAppDiagnosticStatusesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserGetManagedAppDiagnosticStatusesCollectionPage(final UserGetManagedAppDiagnosticStatusesCollectionResponse response, final UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
