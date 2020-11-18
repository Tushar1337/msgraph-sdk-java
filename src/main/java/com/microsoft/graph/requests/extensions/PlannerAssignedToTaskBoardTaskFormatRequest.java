// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerAssignedToTaskBoardTaskFormat;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Assigned To Task Board Task Format Request.
 */
public class PlannerAssignedToTaskBoardTaskFormatRequest extends BaseRequest {
	
    /**
     * The request for the PlannerAssignedToTaskBoardTaskFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerAssignedToTaskBoardTaskFormatRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerAssignedToTaskBoardTaskFormat.class);
    }

    /**
     * Gets the PlannerAssignedToTaskBoardTaskFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerAssignedToTaskBoardTaskFormat from the service
     *
     * @return the PlannerAssignedToTaskBoardTaskFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerAssignedToTaskBoardTaskFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback) {
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
     * Patches this PlannerAssignedToTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerAssignedToTaskBoardTaskFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final PlannerAssignedToTaskBoardTaskFormat sourcePlannerAssignedToTaskBoardTaskFormat, @Nonnull final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerAssignedToTaskBoardTaskFormat);
    }

    /**
     * Patches this PlannerAssignedToTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerAssignedToTaskBoardTaskFormat the source object with updates
     * @return the updated PlannerAssignedToTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerAssignedToTaskBoardTaskFormat patch(@Nonnull final PlannerAssignedToTaskBoardTaskFormat sourcePlannerAssignedToTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerAssignedToTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerAssignedToTaskBoardTaskFormat with a new object
     *
     * @param newPlannerAssignedToTaskBoardTaskFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat, @Nonnull final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback) {
        send(HttpMethod.POST, callback, newPlannerAssignedToTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerAssignedToTaskBoardTaskFormat with a new object
     *
     * @param newPlannerAssignedToTaskBoardTaskFormat the new object to create
     * @return the created PlannerAssignedToTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerAssignedToTaskBoardTaskFormat post(@Nonnull final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.POST, newPlannerAssignedToTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerAssignedToTaskBoardTaskFormat with a new object
     *
     * @param newPlannerAssignedToTaskBoardTaskFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat, @Nonnull final ICallback<? super PlannerAssignedToTaskBoardTaskFormat> callback) {
        send(HttpMethod.PUT, callback, newPlannerAssignedToTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerAssignedToTaskBoardTaskFormat with a new object
     *
     * @param newPlannerAssignedToTaskBoardTaskFormat the object to create/update
     * @return the created PlannerAssignedToTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerAssignedToTaskBoardTaskFormat put(@Nonnull final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.PUT, newPlannerAssignedToTaskBoardTaskFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PlannerAssignedToTaskBoardTaskFormatRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlannerAssignedToTaskBoardTaskFormatRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public PlannerAssignedToTaskBoardTaskFormatRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlannerAssignedToTaskBoardTaskFormatRequest)this;
     }

}

