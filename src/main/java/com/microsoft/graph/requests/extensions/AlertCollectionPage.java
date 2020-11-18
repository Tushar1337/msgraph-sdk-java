// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Alert;
import com.microsoft.graph.requests.extensions.AlertCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AlertCollectionPage;
import com.microsoft.graph.requests.extensions.AlertCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert Collection Page.
 */
public class AlertCollectionPage extends BaseCollectionPage<Alert, AlertCollectionRequestBuilder> {

    /**
     * A collection page for Alert
     *
     * @param response the serialized AlertCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AlertCollectionPage(@Nonnull final AlertCollectionResponse response, @Nonnull final AlertCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
