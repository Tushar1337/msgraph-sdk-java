// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Application;
import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ExtensionPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionPropertyRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.EndpointRequestBuilder;
import com.microsoft.graph.requests.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.TokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.TokenLifetimePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.TokenLifetimePolicyWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Request.
 */
public class ApplicationRequest extends BaseRequest<Application> {
	
    /**
     * The request for the Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Application.class);
    }

    /**
     * Gets the Application from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Application> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Application from the service
     *
     * @return the Application from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Application get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Application> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Application delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Application with a source
     *
     * @param sourceApplication the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Application> patchAsync(@Nonnull final Application sourceApplication) {
        return sendAsync(HttpMethod.PATCH, sourceApplication);
    }

    /**
     * Patches this Application with a source
     *
     * @param sourceApplication the source object with updates
     * @return the updated Application
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Application patch(@Nonnull final Application sourceApplication) throws ClientException {
        return send(HttpMethod.PATCH, sourceApplication);
    }

    /**
     * Creates a Application with a new object
     *
     * @param newApplication the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Application> postAsync(@Nonnull final Application newApplication) {
        return sendAsync(HttpMethod.POST, newApplication);
    }

    /**
     * Creates a Application with a new object
     *
     * @param newApplication the new object to create
     * @return the created Application
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Application post(@Nonnull final Application newApplication) throws ClientException {
        return send(HttpMethod.POST, newApplication);
    }

    /**
     * Creates a Application with a new object
     *
     * @param newApplication the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Application> putAsync(@Nonnull final Application newApplication) {
        return sendAsync(HttpMethod.PUT, newApplication);
    }

    /**
     * Creates a Application with a new object
     *
     * @param newApplication the object to create/update
     * @return the created Application
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Application put(@Nonnull final Application newApplication) throws ClientException {
        return send(HttpMethod.PUT, newApplication);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ApplicationRequest select(@Nonnull final String value) {
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
     public ApplicationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

