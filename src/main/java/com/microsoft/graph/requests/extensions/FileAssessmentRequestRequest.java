// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.FileAssessmentRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Assessment Request Request.
 */
public class FileAssessmentRequestRequest extends BaseRequest {
	
    /**
     * The request for the FileAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FileAssessmentRequestRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, FileAssessmentRequest.class);
    }

    /**
     * Gets the FileAssessmentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super FileAssessmentRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the FileAssessmentRequest from the service
     *
     * @return the FileAssessmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public FileAssessmentRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super FileAssessmentRequest> callback) {
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
     * Patches this FileAssessmentRequest with a source
     *
     * @param sourceFileAssessmentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final FileAssessmentRequest sourceFileAssessmentRequest, @Nonnull final ICallback<? super FileAssessmentRequest> callback) {
        send(HttpMethod.PATCH, callback, sourceFileAssessmentRequest);
    }

    /**
     * Patches this FileAssessmentRequest with a source
     *
     * @param sourceFileAssessmentRequest the source object with updates
     * @return the updated FileAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public FileAssessmentRequest patch(@Nonnull final FileAssessmentRequest sourceFileAssessmentRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceFileAssessmentRequest);
    }

    /**
     * Creates a FileAssessmentRequest with a new object
     *
     * @param newFileAssessmentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final FileAssessmentRequest newFileAssessmentRequest, @Nonnull final ICallback<? super FileAssessmentRequest> callback) {
        send(HttpMethod.POST, callback, newFileAssessmentRequest);
    }

    /**
     * Creates a FileAssessmentRequest with a new object
     *
     * @param newFileAssessmentRequest the new object to create
     * @return the created FileAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public FileAssessmentRequest post(@Nonnull final FileAssessmentRequest newFileAssessmentRequest) throws ClientException {
        return send(HttpMethod.POST, newFileAssessmentRequest);
    }

    /**
     * Creates a FileAssessmentRequest with a new object
     *
     * @param newFileAssessmentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final FileAssessmentRequest newFileAssessmentRequest, @Nonnull final ICallback<? super FileAssessmentRequest> callback) {
        send(HttpMethod.PUT, callback, newFileAssessmentRequest);
    }

    /**
     * Creates a FileAssessmentRequest with a new object
     *
     * @param newFileAssessmentRequest the object to create/update
     * @return the created FileAssessmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public FileAssessmentRequest put(@Nonnull final FileAssessmentRequest newFileAssessmentRequest) throws ClientException {
        return send(HttpMethod.PUT, newFileAssessmentRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public FileAssessmentRequestRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (FileAssessmentRequestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public FileAssessmentRequestRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (FileAssessmentRequestRequest)this;
     }

}

