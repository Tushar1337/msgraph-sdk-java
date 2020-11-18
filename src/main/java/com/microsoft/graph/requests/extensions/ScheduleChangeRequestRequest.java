// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ScheduleChangeRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Change Request Request.
 */
public class ScheduleChangeRequestRequest extends BaseRequest {
	
    /**
     * The request for the ScheduleChangeRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ScheduleChangeRequestRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ScheduleChangeRequest> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ScheduleChangeRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ScheduleChangeRequestRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ScheduleChangeRequest.class);
    }

    /**
     * Gets the ScheduleChangeRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ScheduleChangeRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ScheduleChangeRequest from the service
     *
     * @return the ScheduleChangeRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ScheduleChangeRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ScheduleChangeRequest> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ScheduleChangeRequest with a source
     *
     * @param sourceScheduleChangeRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ScheduleChangeRequest sourceScheduleChangeRequest, @Nonnull final ICallback<? super ScheduleChangeRequest> callback) {
        send(HttpMethod.PATCH, callback, sourceScheduleChangeRequest);
    }

    /**
     * Patches this ScheduleChangeRequest with a source
     *
     * @param sourceScheduleChangeRequest the source object with updates
     * @return the updated ScheduleChangeRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ScheduleChangeRequest patch(@Nonnull final ScheduleChangeRequest sourceScheduleChangeRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceScheduleChangeRequest);
    }

    /**
     * Creates a ScheduleChangeRequest with a new object
     *
     * @param newScheduleChangeRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ScheduleChangeRequest newScheduleChangeRequest, @Nonnull final ICallback<? super ScheduleChangeRequest> callback) {
        send(HttpMethod.POST, callback, newScheduleChangeRequest);
    }

    /**
     * Creates a ScheduleChangeRequest with a new object
     *
     * @param newScheduleChangeRequest the new object to create
     * @return the created ScheduleChangeRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ScheduleChangeRequest post(@Nonnull final ScheduleChangeRequest newScheduleChangeRequest) throws ClientException {
        return send(HttpMethod.POST, newScheduleChangeRequest);
    }

    /**
     * Creates a ScheduleChangeRequest with a new object
     *
     * @param newScheduleChangeRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ScheduleChangeRequest newScheduleChangeRequest, @Nonnull final ICallback<? super ScheduleChangeRequest> callback) {
        send(HttpMethod.PUT, callback, newScheduleChangeRequest);
    }

    /**
     * Creates a ScheduleChangeRequest with a new object
     *
     * @param newScheduleChangeRequest the object to create/update
     * @return the created ScheduleChangeRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ScheduleChangeRequest put(@Nonnull final ScheduleChangeRequest newScheduleChangeRequest) throws ClientException {
        return send(HttpMethod.PUT, newScheduleChangeRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ScheduleChangeRequestRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ScheduleChangeRequestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ScheduleChangeRequestRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ScheduleChangeRequestRequest)this;
     }

}

