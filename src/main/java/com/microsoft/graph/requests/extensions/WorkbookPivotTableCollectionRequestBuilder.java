// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.WorkbookPivotTable;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.WorkbookPivotTableCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableRefreshAllRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Pivot Table Collection Request Builder.
 */
public class WorkbookPivotTableCollectionRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for this collection of WorkbookWorksheet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookPivotTableCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public WorkbookPivotTableCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public WorkbookPivotTableCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookPivotTableCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public WorkbookPivotTableRequestBuilder byId(final String id) {
        return new WorkbookPivotTableRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public WorkbookPivotTableRefreshAllRequestBuilder refreshAll() {
        return new WorkbookPivotTableRefreshAllRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.refreshAll"), getClient(), null);
    }
}
