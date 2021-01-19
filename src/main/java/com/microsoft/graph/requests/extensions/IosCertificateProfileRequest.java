// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.IosCertificateProfile;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Certificate Profile Request.
 */
public class IosCertificateProfileRequest extends BaseRequest<IosCertificateProfile> {
	
    /**
     * The request for the IosCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosCertificateProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosCertificateProfile.class);
    }

    /**
     * Gets the IosCertificateProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCertificateProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IosCertificateProfile from the service
     *
     * @return the IosCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCertificateProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosCertificateProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosCertificateProfile with a source
     *
     * @param sourceIosCertificateProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCertificateProfile> patchAsync(@Nonnull final IosCertificateProfile sourceIosCertificateProfile) {
        return sendAsync(HttpMethod.PATCH, sourceIosCertificateProfile);
    }

    /**
     * Patches this IosCertificateProfile with a source
     *
     * @param sourceIosCertificateProfile the source object with updates
     * @return the updated IosCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCertificateProfile patch(@Nonnull final IosCertificateProfile sourceIosCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosCertificateProfile);
    }

    /**
     * Creates a IosCertificateProfile with a new object
     *
     * @param newIosCertificateProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCertificateProfile> postAsync(@Nonnull final IosCertificateProfile newIosCertificateProfile) {
        return sendAsync(HttpMethod.POST, newIosCertificateProfile);
    }

    /**
     * Creates a IosCertificateProfile with a new object
     *
     * @param newIosCertificateProfile the new object to create
     * @return the created IosCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCertificateProfile post(@Nonnull final IosCertificateProfile newIosCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newIosCertificateProfile);
    }

    /**
     * Creates a IosCertificateProfile with a new object
     *
     * @param newIosCertificateProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosCertificateProfile> putAsync(@Nonnull final IosCertificateProfile newIosCertificateProfile) {
        return sendAsync(HttpMethod.PUT, newIosCertificateProfile);
    }

    /**
     * Creates a IosCertificateProfile with a new object
     *
     * @param newIosCertificateProfile the object to create/update
     * @return the created IosCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosCertificateProfile put(@Nonnull final IosCertificateProfile newIosCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newIosCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosCertificateProfileRequest select(@Nonnull final String value) {
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
     public IosCertificateProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

