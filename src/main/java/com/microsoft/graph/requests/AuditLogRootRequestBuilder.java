// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AuditLogRoot;
import com.microsoft.graph.requests.DirectoryAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryAuditRequestBuilder;
import com.microsoft.graph.requests.RestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.requests.RestrictedSignInRequestBuilder;
import com.microsoft.graph.requests.SignInCollectionRequestBuilder;
import com.microsoft.graph.requests.SignInRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Log Root Request Builder.
 */
public class AuditLogRootRequestBuilder extends BaseRequestBuilder<AuditLogRoot> {

    /**
     * The request builder for the AuditLogRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuditLogRootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AuditLogRootRequest instance
     */
    @Nonnull
    public AuditLogRootRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AuditLogRootRequest instance
     */
    @Nonnull
    public AuditLogRootRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AuditLogRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DirectoryAudit collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DirectoryAuditCollectionRequestBuilder directoryAudits() {
        return new DirectoryAuditCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("directoryAudits"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryAudit item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DirectoryAuditRequestBuilder directoryAudits(@Nonnull final String id) {
        return new DirectoryAuditRequestBuilder(getRequestUrlWithAdditionalSegment("directoryAudits") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the RestrictedSignIn collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public RestrictedSignInCollectionRequestBuilder restrictedSignIns() {
        return new RestrictedSignInCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("restrictedSignIns"), getClient(), null);
    }

    /**
     * Gets a request builder for the RestrictedSignIn item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public RestrictedSignInRequestBuilder restrictedSignIns(@Nonnull final String id) {
        return new RestrictedSignInRequestBuilder(getRequestUrlWithAdditionalSegment("restrictedSignIns") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SignIn collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SignInCollectionRequestBuilder signIns() {
        return new SignInCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("signIns"), getClient(), null);
    }

    /**
     * Gets a request builder for the SignIn item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SignInRequestBuilder signIns(@Nonnull final String id) {
        return new SignInRequestBuilder(getRequestUrlWithAdditionalSegment("signIns") + "/" + id, getClient(), null);
    }
}
