// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Column Collection Page.
 */
public class WorkbookTableColumnCollectionPage extends BaseCollectionPage<WorkbookTableColumn, WorkbookTableColumnCollectionRequestBuilder> {

    /**
     * A collection page for WorkbookTableColumn
     *
     * @param response the serialized WorkbookTableColumnCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookTableColumnCollectionPage(final WorkbookTableColumnCollectionResponse response, final WorkbookTableColumnCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
