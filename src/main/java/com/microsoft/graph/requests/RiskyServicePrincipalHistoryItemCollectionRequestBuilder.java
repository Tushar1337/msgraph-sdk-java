// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.RiskyServicePrincipal;
import com.microsoft.graph.models.RiskyServicePrincipalHistoryItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.RiskyServicePrincipalHistoryItemCollectionRequestBuilder;
import com.microsoft.graph.requests.RiskyServicePrincipalHistoryItemRequestBuilder;
import com.microsoft.graph.requests.RiskyServicePrincipalHistoryItemCollectionRequest;
import com.microsoft.graph.requests.RiskyServicePrincipalConfirmCompromisedRequestBuilder;
import com.microsoft.graph.requests.RiskyServicePrincipalDismissRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.RiskyServicePrincipalConfirmCompromisedParameterSet;
import com.microsoft.graph.models.RiskyServicePrincipalDismissParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Risky Service Principal History Item Collection Request Builder.
 */
public class RiskyServicePrincipalHistoryItemCollectionRequestBuilder extends BaseCollectionRequestBuilder<RiskyServicePrincipalHistoryItem, RiskyServicePrincipalHistoryItemRequestBuilder, RiskyServicePrincipalHistoryItemCollectionResponse, RiskyServicePrincipalHistoryItemCollectionPage, RiskyServicePrincipalHistoryItemCollectionRequest> {

    /**
     * The request builder for this collection of RiskyServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RiskyServicePrincipalHistoryItemCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RiskyServicePrincipalHistoryItemRequestBuilder.class, RiskyServicePrincipalHistoryItemCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public RiskyServicePrincipalConfirmCompromisedRequestBuilder confirmCompromised(@Nonnull final RiskyServicePrincipalConfirmCompromisedParameterSet parameters) {
        return new RiskyServicePrincipalConfirmCompromisedRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.confirmCompromised"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public RiskyServicePrincipalDismissRequestBuilder dismiss(@Nonnull final RiskyServicePrincipalDismissParameterSet parameters) {
        return new RiskyServicePrincipalDismissRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dismiss"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
