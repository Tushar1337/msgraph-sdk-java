// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.Alert;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Alert Request.
 */
public interface IBaseAlertRequest extends IHttpRequest {

    /**
     * Gets the Alert from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Alert> callback);

    /**
     * Gets the Alert from the service
     *
     * @return the Alert from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Alert get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Alert> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Alert with a source
     *
     * @param sourceAlert the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Alert sourceAlert, final ICallback<Alert> callback);

    /**
     * Patches this Alert with a source
     *
     * @param sourceAlert the source object with updates
     * @return the updated Alert
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Alert patch(final Alert sourceAlert) throws ClientException;

    /**
     * Posts a Alert with a new object
     *
     * @param newAlert the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Alert newAlert, final ICallback<Alert> callback);

    /**
     * Posts a Alert with a new object
     *
     * @param newAlert the new object to create
     * @return the created Alert
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Alert post(final Alert newAlert) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseAlertRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseAlertRequest expand(final String value);

}

