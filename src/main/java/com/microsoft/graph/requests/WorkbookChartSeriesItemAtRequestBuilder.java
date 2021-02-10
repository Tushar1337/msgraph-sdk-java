// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookChartSeriesItemAtRequest;
import com.microsoft.graph.models.WorkbookChartSeries;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.WorkbookChartSeriesItemAtParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Series Item At Request Builder.
 */
public class WorkbookChartSeriesItemAtRequestBuilder extends BaseFunctionRequestBuilder<WorkbookChartSeries> {

    /**
     * The request builder for this WorkbookChartSeriesItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookChartSeriesItemAtRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookChartSeriesItemAtParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the WorkbookChartSeriesItemAtRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartSeriesItemAtRequest instance
     */
    @Nonnull
    public WorkbookChartSeriesItemAtRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookChartSeriesItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartSeriesItemAtRequest instance
     */
    @Nonnull
    public WorkbookChartSeriesItemAtRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkbookChartSeriesItemAtRequest request = new WorkbookChartSeriesItemAtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }

    /**
     * Gets the request builder for WorkbookChartSeriesFormat
     *
     * @return the WorkbookChartSeriesFormatRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartSeriesFormatRequestBuilder format() {
        return new WorkbookChartSeriesFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }
    /**
     *  Gets a request builder for the WorkbookChartPoint collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WorkbookChartPointCollectionRequestBuilder points() {
        return new WorkbookChartPointCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("points"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookChartPoint item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WorkbookChartPointRequestBuilder points(@Nonnull final String id) {
        return new WorkbookChartPointRequestBuilder(getRequestUrlWithAdditionalSegment("points") + "/" + id, getClient(), null);
    }
}
