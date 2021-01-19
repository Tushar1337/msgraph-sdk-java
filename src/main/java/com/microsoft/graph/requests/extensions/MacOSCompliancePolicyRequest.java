// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.MacOSCompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSCompliance Policy Request.
 */
public class MacOSCompliancePolicyRequest extends BaseRequest<MacOSCompliancePolicy> {
	
    /**
     * The request for the MacOSCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSCompliancePolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSCompliancePolicy.class);
    }

    /**
     * Gets the MacOSCompliancePolicy from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSCompliancePolicy> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the MacOSCompliancePolicy from the service
     *
     * @return the MacOSCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSCompliancePolicy> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public MacOSCompliancePolicy delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MacOSCompliancePolicy with a source
     *
     * @param sourceMacOSCompliancePolicy the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSCompliancePolicy> patchAsync(@Nonnull final MacOSCompliancePolicy sourceMacOSCompliancePolicy) {
        return sendAsync(HttpMethod.PATCH, sourceMacOSCompliancePolicy);
    }

    /**
     * Patches this MacOSCompliancePolicy with a source
     *
     * @param sourceMacOSCompliancePolicy the source object with updates
     * @return the updated MacOSCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSCompliancePolicy patch(@Nonnull final MacOSCompliancePolicy sourceMacOSCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSCompliancePolicy);
    }

    /**
     * Creates a MacOSCompliancePolicy with a new object
     *
     * @param newMacOSCompliancePolicy the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSCompliancePolicy> postAsync(@Nonnull final MacOSCompliancePolicy newMacOSCompliancePolicy) {
        return sendAsync(HttpMethod.POST, newMacOSCompliancePolicy);
    }

    /**
     * Creates a MacOSCompliancePolicy with a new object
     *
     * @param newMacOSCompliancePolicy the new object to create
     * @return the created MacOSCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSCompliancePolicy post(@Nonnull final MacOSCompliancePolicy newMacOSCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newMacOSCompliancePolicy);
    }

    /**
     * Creates a MacOSCompliancePolicy with a new object
     *
     * @param newMacOSCompliancePolicy the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSCompliancePolicy> putAsync(@Nonnull final MacOSCompliancePolicy newMacOSCompliancePolicy) {
        return sendAsync(HttpMethod.PUT, newMacOSCompliancePolicy);
    }

    /**
     * Creates a MacOSCompliancePolicy with a new object
     *
     * @param newMacOSCompliancePolicy the object to create/update
     * @return the created MacOSCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSCompliancePolicy put(@Nonnull final MacOSCompliancePolicy newMacOSCompliancePolicy) throws ClientException {
        return send(HttpMethod.PUT, newMacOSCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MacOSCompliancePolicyRequest select(@Nonnull final String value) {
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
     public MacOSCompliancePolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

