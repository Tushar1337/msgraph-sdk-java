// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.requests.extensions.IOnenoteOperationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteOperationCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteOperationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Operation Collection Page.
 */
public class OnenoteOperationCollectionPage extends BaseCollectionPage<OnenoteOperation, IOnenoteOperationCollectionRequestBuilder> implements IOnenoteOperationCollectionPage {

    /**
     * A collection page for OnenoteOperation
     *
     * @param response the serialized OnenoteOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OnenoteOperationCollectionPage(final OnenoteOperationCollectionResponse response, final IOnenoteOperationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
