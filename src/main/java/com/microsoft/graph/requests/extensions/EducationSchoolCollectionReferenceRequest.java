// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.models.extensions.EducationSchool;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.EducationSchoolWithReferenceRequest;
import com.microsoft.graph.requests.extensions.EducationSchoolReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.EducationSchool;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School Collection Reference Request.
 */
public class EducationSchoolCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<EducationSchool, EducationSchoolWithReferenceRequest, EducationSchoolReferenceRequestBuilder, EducationSchoolWithReferenceRequestBuilder, EducationSchoolCollectionResponse, EducationSchoolCollectionWithReferencesPage, EducationSchoolCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSchoolCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSchoolCollectionResponse.class, EducationSchoolCollectionWithReferencesPage.class, EducationSchoolCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new EducationSchool
     * @param newEducationSchool the EducationSchool to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationSchool> postAsync(@Nonnull final EducationSchool newEducationSchool) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/education/schools/" + newEducationSchool.id);
        return new EducationSchoolWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newEducationSchool, body);
    }

    /**
     * Creates a new EducationSchool
     * @param newEducationSchool the EducationSchool to create
     * @return the newly created object
     */
    @Nonnull
    public EducationSchool post(@Nonnull final EducationSchool newEducationSchool) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/education/schools/" + newEducationSchool.id);
        return new EducationSchoolWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newEducationSchool, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public EducationSchoolCollectionReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public EducationSchoolCollectionReferenceRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    @Nonnull
    public EducationSchoolCollectionReferenceRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public EducationSchoolCollectionReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public EducationSchoolCollectionReferenceRequest top(final int value) {
        addTopOption(value);
        return this;
    }
    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public EducationSchoolCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public EducationSchoolCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
