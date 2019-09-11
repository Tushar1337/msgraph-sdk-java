// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesFormatRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Gridlines Request Builder.
 */
public interface IWorkbookChartGridlinesRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookChartGridlinesRequest instance
     */
    IWorkbookChartGridlinesRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartGridlinesRequest instance
     */
    IWorkbookChartGridlinesRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    /**
     * Gets the request builder for WorkbookChartGridlinesFormat
     *
     * @return the IWorkbookChartGridlinesFormatRequestBuilder instance
     */
    IWorkbookChartGridlinesFormatRequestBuilder format();

}
