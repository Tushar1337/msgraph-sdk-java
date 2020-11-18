// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Collection Page.
 */
public class WorkbookChartCollectionPage extends BaseCollectionPage<WorkbookChart, WorkbookChartCollectionRequestBuilder> {

    /**
     * A collection page for WorkbookChart
     *
     * @param response the serialized WorkbookChartCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookChartCollectionPage(@Nonnull final WorkbookChartCollectionResponse response, @Nonnull final WorkbookChartCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
