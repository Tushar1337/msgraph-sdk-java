// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Drive Item Request.
 */
public class BaseDriveItemRequest extends BaseRequest implements IBaseDriveItemRequest {

    /**
     * The request for the DriveItem
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseDriveItemRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the DriveItem from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<DriveItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DriveItem from the service
     * @return The DriveItem from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DriveItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this DriveItem with a source
     * @param sourceDriveItem The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final DriveItem sourceDriveItem, final ICallback<DriveItem> callback) {
        send(HttpMethod.PATCH, callback, sourceDriveItem);
    }

    /**
     * Patches this DriveItem with a source
     * @param sourceDriveItem The source object with updates
     * @return The updated DriveItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DriveItem patch(final DriveItem sourceDriveItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceDriveItem);
    }

    /**
     * Creates a DriveItem with a new object
     * @param newDriveItem The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final DriveItem newDriveItem, final ICallback<DriveItem> callback) {
        send(HttpMethod.POST, callback, newDriveItem);
    }

    /**
     * Creates a DriveItem with a new object
     * @param newDriveItem The new object to create
     * @return The created DriveItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public DriveItem post(final DriveItem newDriveItem) throws ClientException {
        return send(HttpMethod.POST, newDriveItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IDriveItemRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DriveItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IDriveItemRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DriveItemRequest)this;
     }

}
