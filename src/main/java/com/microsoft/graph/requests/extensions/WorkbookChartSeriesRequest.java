// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartSeries;
import com.microsoft.graph.requests.extensions.WorkbookChartPointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartPointRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartSeriesFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Series Request.
 */
public class WorkbookChartSeriesRequest extends BaseRequest {
	
    /**
     * The request for the WorkbookChartSeries
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartSeriesRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartSeries.class);
    }

    /**
     * Gets the WorkbookChartSeries from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartSeries> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartSeries from the service
     *
     * @return the WorkbookChartSeries from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartSeries get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartSeries> callback) {
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
     * Patches this WorkbookChartSeries with a source
     *
     * @param sourceWorkbookChartSeries the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartSeries sourceWorkbookChartSeries, final ICallback<? super WorkbookChartSeries> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartSeries);
    }

    /**
     * Patches this WorkbookChartSeries with a source
     *
     * @param sourceWorkbookChartSeries the source object with updates
     * @return the updated WorkbookChartSeries
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartSeries patch(final WorkbookChartSeries sourceWorkbookChartSeries) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartSeries);
    }

    /**
     * Creates a WorkbookChartSeries with a new object
     *
     * @param newWorkbookChartSeries the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartSeries newWorkbookChartSeries, final ICallback<? super WorkbookChartSeries> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartSeries);
    }

    /**
     * Creates a WorkbookChartSeries with a new object
     *
     * @param newWorkbookChartSeries the new object to create
     * @return the created WorkbookChartSeries
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartSeries post(final WorkbookChartSeries newWorkbookChartSeries) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartSeries);
    }

    /**
     * Creates a WorkbookChartSeries with a new object
     *
     * @param newWorkbookChartSeries the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartSeries newWorkbookChartSeries, final ICallback<? super WorkbookChartSeries> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartSeries);
    }

    /**
     * Creates a WorkbookChartSeries with a new object
     *
     * @param newWorkbookChartSeries the object to create/update
     * @return the created WorkbookChartSeries
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartSeries put(final WorkbookChartSeries newWorkbookChartSeries) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartSeries);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public WorkbookChartSeriesRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WorkbookChartSeriesRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public WorkbookChartSeriesRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WorkbookChartSeriesRequest)this;
     }

}

