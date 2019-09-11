// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsChiSq_DistRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Chi Sq_Dist Request Builder.
 */
public interface IWorkbookFunctionsChiSq_DistRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsChiSq_DistRequest
     *
     * @return the IWorkbookFunctionsChiSq_DistRequest instance
     */
    IWorkbookFunctionsChiSq_DistRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsChiSq_DistRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsChiSq_DistRequest instance
     */
    IWorkbookFunctionsChiSq_DistRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
