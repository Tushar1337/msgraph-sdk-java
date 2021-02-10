// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Event;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.graph.requests.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AttachmentRequestBuilder;
import com.microsoft.graph.requests.CalendarRequestBuilder;
import com.microsoft.graph.requests.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionRequestBuilder;
import com.microsoft.graph.requests.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.EventRequestBuilder;
import com.microsoft.graph.requests.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Request.
 */
public class EventRequest extends BaseRequest<Event> {
	
    /**
     * The request for the Event
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Event.class);
    }

    /**
     * Gets the Event from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Event> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Event from the service
     *
     * @return the Event from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Event get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Event> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Event delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Event with a source
     *
     * @param sourceEvent the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Event> patchAsync(@Nonnull final Event sourceEvent) {
        return sendAsync(HttpMethod.PATCH, sourceEvent);
    }

    /**
     * Patches this Event with a source
     *
     * @param sourceEvent the source object with updates
     * @return the updated Event
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Event patch(@Nonnull final Event sourceEvent) throws ClientException {
        return send(HttpMethod.PATCH, sourceEvent);
    }

    /**
     * Creates a Event with a new object
     *
     * @param newEvent the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Event> postAsync(@Nonnull final Event newEvent) {
        return sendAsync(HttpMethod.POST, newEvent);
    }

    /**
     * Creates a Event with a new object
     *
     * @param newEvent the new object to create
     * @return the created Event
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Event post(@Nonnull final Event newEvent) throws ClientException {
        return send(HttpMethod.POST, newEvent);
    }

    /**
     * Creates a Event with a new object
     *
     * @param newEvent the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Event> putAsync(@Nonnull final Event newEvent) {
        return sendAsync(HttpMethod.PUT, newEvent);
    }

    /**
     * Creates a Event with a new object
     *
     * @param newEvent the object to create/update
     * @return the created Event
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Event put(@Nonnull final Event newEvent) throws ClientException {
        return send(HttpMethod.PUT, newEvent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EventRequest select(@Nonnull final String value) {
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
     public EventRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

