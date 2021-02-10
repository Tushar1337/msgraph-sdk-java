// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceComplianceDeviceOverview;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Device Overview Request.
 */
public class DeviceComplianceDeviceOverviewRequest extends BaseRequest<DeviceComplianceDeviceOverview> {
	
    /**
     * The request for the DeviceComplianceDeviceOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceDeviceOverviewRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceDeviceOverview.class);
    }

    /**
     * Gets the DeviceComplianceDeviceOverview from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceDeviceOverview> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceComplianceDeviceOverview from the service
     *
     * @return the DeviceComplianceDeviceOverview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceDeviceOverview get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceDeviceOverview> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceComplianceDeviceOverview delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceComplianceDeviceOverview with a source
     *
     * @param sourceDeviceComplianceDeviceOverview the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceDeviceOverview> patchAsync(@Nonnull final DeviceComplianceDeviceOverview sourceDeviceComplianceDeviceOverview) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceComplianceDeviceOverview);
    }

    /**
     * Patches this DeviceComplianceDeviceOverview with a source
     *
     * @param sourceDeviceComplianceDeviceOverview the source object with updates
     * @return the updated DeviceComplianceDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceDeviceOverview patch(@Nonnull final DeviceComplianceDeviceOverview sourceDeviceComplianceDeviceOverview) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceDeviceOverview);
    }

    /**
     * Creates a DeviceComplianceDeviceOverview with a new object
     *
     * @param newDeviceComplianceDeviceOverview the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceDeviceOverview> postAsync(@Nonnull final DeviceComplianceDeviceOverview newDeviceComplianceDeviceOverview) {
        return sendAsync(HttpMethod.POST, newDeviceComplianceDeviceOverview);
    }

    /**
     * Creates a DeviceComplianceDeviceOverview with a new object
     *
     * @param newDeviceComplianceDeviceOverview the new object to create
     * @return the created DeviceComplianceDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceDeviceOverview post(@Nonnull final DeviceComplianceDeviceOverview newDeviceComplianceDeviceOverview) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceDeviceOverview);
    }

    /**
     * Creates a DeviceComplianceDeviceOverview with a new object
     *
     * @param newDeviceComplianceDeviceOverview the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceDeviceOverview> putAsync(@Nonnull final DeviceComplianceDeviceOverview newDeviceComplianceDeviceOverview) {
        return sendAsync(HttpMethod.PUT, newDeviceComplianceDeviceOverview);
    }

    /**
     * Creates a DeviceComplianceDeviceOverview with a new object
     *
     * @param newDeviceComplianceDeviceOverview the object to create/update
     * @return the created DeviceComplianceDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceDeviceOverview put(@Nonnull final DeviceComplianceDeviceOverview newDeviceComplianceDeviceOverview) throws ClientException {
        return send(HttpMethod.PUT, newDeviceComplianceDeviceOverview);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceComplianceDeviceOverviewRequest select(@Nonnull final String value) {
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
     public DeviceComplianceDeviceOverviewRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

