// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookChart;
import com.microsoft.graph.requests.WorkbookChartAxesRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartDataLabelsRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartAreaFormatRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartLegendRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartSeriesCollectionRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartSeriesRequestBuilder;
import com.microsoft.graph.requests.WorkbookChartTitleRequestBuilder;
import com.microsoft.graph.requests.WorkbookWorksheetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.WorkbookChartSetDataParameterSet;
import com.microsoft.graph.models.WorkbookChartSetPositionParameterSet;
import com.microsoft.graph.models.WorkbookChartImageParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Request Builder.
 */
public class WorkbookChartRequestBuilder extends BaseRequestBuilder<WorkbookChart> {

    /**
     * The request builder for the WorkbookChart
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartRequest instance
     */
    @Nonnull
    public WorkbookChartRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartRequest instance
     */
    @Nonnull
    public WorkbookChartRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.WorkbookChartRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartAxes
     *
     * @return the WorkbookChartAxesRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartAxesRequestBuilder axes() {
        return new WorkbookChartAxesRequestBuilder(getRequestUrlWithAdditionalSegment("axes"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartDataLabels
     *
     * @return the WorkbookChartDataLabelsRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartDataLabelsRequestBuilder dataLabels() {
        return new WorkbookChartDataLabelsRequestBuilder(getRequestUrlWithAdditionalSegment("dataLabels"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartAreaFormat
     *
     * @return the WorkbookChartAreaFormatRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartAreaFormatRequestBuilder format() {
        return new WorkbookChartAreaFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartLegend
     *
     * @return the WorkbookChartLegendRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartLegendRequestBuilder legend() {
        return new WorkbookChartLegendRequestBuilder(getRequestUrlWithAdditionalSegment("legend"), getClient(), null);
    }
    /**
     *  Gets a request builder for the WorkbookChartSeries collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WorkbookChartSeriesCollectionRequestBuilder series() {
        return new WorkbookChartSeriesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("series"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookChartSeries item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WorkbookChartSeriesRequestBuilder series(@Nonnull final String id) {
        return new WorkbookChartSeriesRequestBuilder(getRequestUrlWithAdditionalSegment("series") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartTitle
     *
     * @return the WorkbookChartTitleRequestBuilder instance
     */
    @Nonnull
    public WorkbookChartTitleRequestBuilder title() {
        return new WorkbookChartTitleRequestBuilder(getRequestUrlWithAdditionalSegment("title"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the WorkbookWorksheetRequestBuilder instance
     */
    @Nonnull
    public WorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookChartSetDataRequestBuilder setData(@Nonnull final WorkbookChartSetDataParameterSet parameters) {
        return new WorkbookChartSetDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setData"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookChartSetPositionRequestBuilder setPosition(@Nonnull final WorkbookChartSetPositionParameterSet parameters) {
        return new WorkbookChartSetPositionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setPosition"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookChartImageRequestBuilder image() {
        return new WorkbookChartImageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.image"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookChartImageRequestBuilder image(@Nonnull final WorkbookChartImageParameterSet parameters) {
        return new WorkbookChartImageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.image"), getClient(), null, parameters);
    }
}
