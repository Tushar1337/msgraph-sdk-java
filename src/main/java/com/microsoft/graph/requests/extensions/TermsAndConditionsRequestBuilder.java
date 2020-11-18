// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Request Builder.
 */
public class TermsAndConditionsRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the TermsAndConditions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsAndConditionsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TermsAndConditionsRequest instance
     */
    @Nonnull
    public TermsAndConditionsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the TermsAndConditionsRequest instance
     */
    @Nonnull
    public TermsAndConditionsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.TermsAndConditionsRequest(getRequestUrl(), getClient(), requestOptions);
    }


    @Nonnull
    public TermsAndConditionsAcceptanceStatusCollectionRequestBuilder acceptanceStatuses() {
        return new TermsAndConditionsAcceptanceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("acceptanceStatuses"), getClient(), null);
    }

    @Nonnull
    public TermsAndConditionsAcceptanceStatusRequestBuilder acceptanceStatuses(@Nonnull final String id) {
        return new TermsAndConditionsAcceptanceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("acceptanceStatuses") + "/" + id, getClient(), null);
    }
    @Nonnull
    public TermsAndConditionsAssignmentCollectionRequestBuilder assignments() {
        return new TermsAndConditionsAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    @Nonnull
    public TermsAndConditionsAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new TermsAndConditionsAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
}
