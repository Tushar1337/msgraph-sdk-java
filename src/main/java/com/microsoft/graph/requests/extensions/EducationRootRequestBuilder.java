// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationRoot;
import com.microsoft.graph.requests.extensions.EducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Root Request Builder.
 */
public class EducationRootRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the EducationRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationRootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EducationRootRequest instance
     */
    @Nonnull
    public EducationRootRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EducationRootRequest instance
     */
    @Nonnull
    public EducationRootRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.EducationRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    @Nonnull
    public EducationClassCollectionRequestBuilder classes() {
        return new EducationClassCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("classes"), getClient(), null);
    }

    @Nonnull
    public EducationClassRequestBuilder classes(@Nonnull final String id) {
        return new EducationClassRequestBuilder(getRequestUrlWithAdditionalSegment("classes") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EducationUser
     *
     * @return the EducationUserRequestBuilder instance
     */
    @Nonnull
    public EducationUserRequestBuilder me() {
        return new EducationUserRequestBuilder(getRequestUrlWithAdditionalSegment("me"), getClient(), null);
    }
    @Nonnull
    public EducationSchoolCollectionRequestBuilder schools() {
        return new EducationSchoolCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("schools"), getClient(), null);
    }

    @Nonnull
    public EducationSchoolRequestBuilder schools(@Nonnull final String id) {
        return new EducationSchoolRequestBuilder(getRequestUrlWithAdditionalSegment("schools") + "/" + id, getClient(), null);
    }
    @Nonnull
    public EducationUserCollectionRequestBuilder users() {
        return new EducationUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("users"), getClient(), null);
    }

    @Nonnull
    public EducationUserRequestBuilder users(@Nonnull final String id) {
        return new EducationUserRequestBuilder(getRequestUrlWithAdditionalSegment("users") + "/" + id, getClient(), null);
    }
}
