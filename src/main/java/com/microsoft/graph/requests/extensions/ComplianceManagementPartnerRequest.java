// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ComplianceManagementPartner;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Compliance Management Partner Request.
 */
public class ComplianceManagementPartnerRequest extends BaseRequest<ComplianceManagementPartner> {
	
    /**
     * The request for the ComplianceManagementPartner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ComplianceManagementPartnerRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ComplianceManagementPartner.class);
    }

    /**
     * Gets the ComplianceManagementPartner from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ComplianceManagementPartner> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ComplianceManagementPartner from the service
     *
     * @return the ComplianceManagementPartner from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ComplianceManagementPartner get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ComplianceManagementPartner> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ComplianceManagementPartner delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ComplianceManagementPartner with a source
     *
     * @param sourceComplianceManagementPartner the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ComplianceManagementPartner> patchAsync(@Nonnull final ComplianceManagementPartner sourceComplianceManagementPartner) {
        return sendAsync(HttpMethod.PATCH, sourceComplianceManagementPartner);
    }

    /**
     * Patches this ComplianceManagementPartner with a source
     *
     * @param sourceComplianceManagementPartner the source object with updates
     * @return the updated ComplianceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ComplianceManagementPartner patch(@Nonnull final ComplianceManagementPartner sourceComplianceManagementPartner) throws ClientException {
        return send(HttpMethod.PATCH, sourceComplianceManagementPartner);
    }

    /**
     * Creates a ComplianceManagementPartner with a new object
     *
     * @param newComplianceManagementPartner the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ComplianceManagementPartner> postAsync(@Nonnull final ComplianceManagementPartner newComplianceManagementPartner) {
        return sendAsync(HttpMethod.POST, newComplianceManagementPartner);
    }

    /**
     * Creates a ComplianceManagementPartner with a new object
     *
     * @param newComplianceManagementPartner the new object to create
     * @return the created ComplianceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ComplianceManagementPartner post(@Nonnull final ComplianceManagementPartner newComplianceManagementPartner) throws ClientException {
        return send(HttpMethod.POST, newComplianceManagementPartner);
    }

    /**
     * Creates a ComplianceManagementPartner with a new object
     *
     * @param newComplianceManagementPartner the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ComplianceManagementPartner> putAsync(@Nonnull final ComplianceManagementPartner newComplianceManagementPartner) {
        return sendAsync(HttpMethod.PUT, newComplianceManagementPartner);
    }

    /**
     * Creates a ComplianceManagementPartner with a new object
     *
     * @param newComplianceManagementPartner the object to create/update
     * @return the created ComplianceManagementPartner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ComplianceManagementPartner put(@Nonnull final ComplianceManagementPartner newComplianceManagementPartner) throws ClientException {
        return send(HttpMethod.PUT, newComplianceManagementPartner);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ComplianceManagementPartnerRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ComplianceManagementPartnerRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

