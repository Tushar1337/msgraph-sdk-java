// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OrgContact;
import com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import com.microsoft.graph.requests.OrgContactRequestBuilder;
import com.microsoft.graph.requests.GroupRequestBuilder;
import com.microsoft.graph.requests.ApplicationRequestBuilder;
import com.microsoft.graph.requests.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.DeviceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact Request.
 */
public class OrgContactRequest extends BaseRequest<OrgContact> {
	
    /**
     * The request for the OrgContact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrgContactRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OrgContact.class);
    }

    /**
     * Gets the OrgContact from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OrgContact> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OrgContact from the service
     *
     * @return the OrgContact from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OrgContact get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OrgContact> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OrgContact delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OrgContact with a source
     *
     * @param sourceOrgContact the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OrgContact> patchAsync(@Nonnull final OrgContact sourceOrgContact) {
        return sendAsync(HttpMethod.PATCH, sourceOrgContact);
    }

    /**
     * Patches this OrgContact with a source
     *
     * @param sourceOrgContact the source object with updates
     * @return the updated OrgContact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OrgContact patch(@Nonnull final OrgContact sourceOrgContact) throws ClientException {
        return send(HttpMethod.PATCH, sourceOrgContact);
    }

    /**
     * Creates a OrgContact with a new object
     *
     * @param newOrgContact the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OrgContact> postAsync(@Nonnull final OrgContact newOrgContact) {
        return sendAsync(HttpMethod.POST, newOrgContact);
    }

    /**
     * Creates a OrgContact with a new object
     *
     * @param newOrgContact the new object to create
     * @return the created OrgContact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OrgContact post(@Nonnull final OrgContact newOrgContact) throws ClientException {
        return send(HttpMethod.POST, newOrgContact);
    }

    /**
     * Creates a OrgContact with a new object
     *
     * @param newOrgContact the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OrgContact> putAsync(@Nonnull final OrgContact newOrgContact) {
        return sendAsync(HttpMethod.PUT, newOrgContact);
    }

    /**
     * Creates a OrgContact with a new object
     *
     * @param newOrgContact the object to create/update
     * @return the created OrgContact
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OrgContact put(@Nonnull final OrgContact newOrgContact) throws ClientException {
        return send(HttpMethod.PUT, newOrgContact);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OrgContactRequest select(@Nonnull final String value) {
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
     public OrgContactRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

