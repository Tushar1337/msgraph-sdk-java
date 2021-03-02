// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AgreementAcceptance;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionPage;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement Acceptance Collection Page.
 */
public class AgreementAcceptanceCollectionPage extends BaseCollectionPage<AgreementAcceptance, IAgreementAcceptanceCollectionRequestBuilder> implements IAgreementAcceptanceCollectionPage {

    /**
     * A collection page for AgreementAcceptance
     *
     * @param response the serialized AgreementAcceptanceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AgreementAcceptanceCollectionPage(final AgreementAcceptanceCollectionResponse response, final IAgreementAcceptanceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
