// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartDataLabelsRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartDataLabelsRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartDataLabelFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartDataLabelFormatRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Data Labels Request Builder.
 */
public class WorkbookChartDataLabelsRequestBuilder extends BaseRequestBuilder implements IWorkbookChartDataLabelsRequestBuilder {

    /**
     * The request builder for the WorkbookChartDataLabels
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartDataLabelsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookChartDataLabelsRequest instance
     */
    public IWorkbookChartDataLabelsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartDataLabelsRequest instance
     */
    public IWorkbookChartDataLabelsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookChartDataLabelsRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartDataLabelFormat
     *
     * @return the IWorkbookChartDataLabelFormatRequestBuilder instance
     */
    public IWorkbookChartDataLabelFormatRequestBuilder format() {
        return new WorkbookChartDataLabelFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }
}

