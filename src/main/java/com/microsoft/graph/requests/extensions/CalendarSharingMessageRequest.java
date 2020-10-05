// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CalendarSharingMessage;
import com.microsoft.graph.models.extensions.Calendar;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Sharing Message Request.
 */
public class CalendarSharingMessageRequest extends BaseRequest {
	
    /**
     * The request for the CalendarSharingMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarSharingMessageRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CalendarSharingMessage.class);
    }

    /**
     * Gets the CalendarSharingMessage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super CalendarSharingMessage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CalendarSharingMessage from the service
     *
     * @return the CalendarSharingMessage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CalendarSharingMessage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super CalendarSharingMessage> callback) {
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
     * Patches this CalendarSharingMessage with a source
     *
     * @param sourceCalendarSharingMessage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final CalendarSharingMessage sourceCalendarSharingMessage, final ICallback<? super CalendarSharingMessage> callback) {
        send(HttpMethod.PATCH, callback, sourceCalendarSharingMessage);
    }

    /**
     * Patches this CalendarSharingMessage with a source
     *
     * @param sourceCalendarSharingMessage the source object with updates
     * @return the updated CalendarSharingMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CalendarSharingMessage patch(final CalendarSharingMessage sourceCalendarSharingMessage) throws ClientException {
        return send(HttpMethod.PATCH, sourceCalendarSharingMessage);
    }

    /**
     * Creates a CalendarSharingMessage with a new object
     *
     * @param newCalendarSharingMessage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final CalendarSharingMessage newCalendarSharingMessage, final ICallback<? super CalendarSharingMessage> callback) {
        send(HttpMethod.POST, callback, newCalendarSharingMessage);
    }

    /**
     * Creates a CalendarSharingMessage with a new object
     *
     * @param newCalendarSharingMessage the new object to create
     * @return the created CalendarSharingMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CalendarSharingMessage post(final CalendarSharingMessage newCalendarSharingMessage) throws ClientException {
        return send(HttpMethod.POST, newCalendarSharingMessage);
    }

    /**
     * Creates a CalendarSharingMessage with a new object
     *
     * @param newCalendarSharingMessage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final CalendarSharingMessage newCalendarSharingMessage, final ICallback<? super CalendarSharingMessage> callback) {
        send(HttpMethod.PUT, callback, newCalendarSharingMessage);
    }

    /**
     * Creates a CalendarSharingMessage with a new object
     *
     * @param newCalendarSharingMessage the object to create/update
     * @return the created CalendarSharingMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CalendarSharingMessage put(final CalendarSharingMessage newCalendarSharingMessage) throws ClientException {
        return send(HttpMethod.PUT, newCalendarSharingMessage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public CalendarSharingMessageRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CalendarSharingMessageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public CalendarSharingMessageRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CalendarSharingMessageRequest)this;
     }

}

