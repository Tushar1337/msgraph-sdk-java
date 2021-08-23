// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.termstore.models.Relation;
import com.microsoft.graph.termstore.requests.TermWithReferenceRequestBuilder;
import com.microsoft.graph.termstore.requests.SetWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Relation Request Builder.
 */
public class RelationRequestBuilder extends BaseRequestBuilder<Relation> {

    /**
     * The request builder for the Relation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RelationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the RelationRequest instance
     */
    @Nonnull
    public RelationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the RelationRequest instance
     */
    @Nonnull
    public RelationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.termstore.requests.RelationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Term
     *
     * @return the TermWithReferenceRequestBuilder instance
     */
    @Nonnull
    public TermWithReferenceRequestBuilder fromTerm() {
        return new TermWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("fromTerm"), getClient(), null);
    }

    /**
     * Gets the request builder for Set
     *
     * @return the SetWithReferenceRequestBuilder instance
     */
    @Nonnull
    public SetWithReferenceRequestBuilder set() {
        return new SetWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("set"), getClient(), null);
    }

    /**
     * Gets the request builder for Term
     *
     * @return the TermWithReferenceRequestBuilder instance
     */
    @Nonnull
    public TermWithReferenceRequestBuilder toTerm() {
        return new TermWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("toTerm"), getClient(), null);
    }
}
