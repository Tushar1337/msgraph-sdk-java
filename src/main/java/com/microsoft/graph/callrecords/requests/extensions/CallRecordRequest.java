// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.callrecords.models.extensions.CallRecord;
import com.microsoft.graph.callrecords.requests.extensions.SessionCollectionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.SessionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Request.
 */
public class CallRecordRequest extends BaseRequest {
	
    /**
     * The request for the CallRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRecordRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CallRecord.class);
    }

    /**
     * Gets the CallRecord from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super CallRecord> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CallRecord from the service
     *
     * @return the CallRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CallRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super CallRecord> callback) {
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
     * Patches this CallRecord with a source
     *
     * @param sourceCallRecord the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final CallRecord sourceCallRecord, final ICallback<? super CallRecord> callback) {
        send(HttpMethod.PATCH, callback, sourceCallRecord);
    }

    /**
     * Patches this CallRecord with a source
     *
     * @param sourceCallRecord the source object with updates
     * @return the updated CallRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CallRecord patch(final CallRecord sourceCallRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceCallRecord);
    }

    /**
     * Creates a CallRecord with a new object
     *
     * @param newCallRecord the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final CallRecord newCallRecord, final ICallback<? super CallRecord> callback) {
        send(HttpMethod.POST, callback, newCallRecord);
    }

    /**
     * Creates a CallRecord with a new object
     *
     * @param newCallRecord the new object to create
     * @return the created CallRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CallRecord post(final CallRecord newCallRecord) throws ClientException {
        return send(HttpMethod.POST, newCallRecord);
    }

    /**
     * Creates a CallRecord with a new object
     *
     * @param newCallRecord the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final CallRecord newCallRecord, final ICallback<? super CallRecord> callback) {
        send(HttpMethod.PUT, callback, newCallRecord);
    }

    /**
     * Creates a CallRecord with a new object
     *
     * @param newCallRecord the object to create/update
     * @return the created CallRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CallRecord put(final CallRecord newCallRecord) throws ClientException {
        return send(HttpMethod.PUT, newCallRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public CallRecordRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CallRecordRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public CallRecordRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CallRecordRequest)this;
     }

}

