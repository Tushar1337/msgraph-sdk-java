// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLearningSummary;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Windows Information Protection App Learning Summary Collection Page.
 */
public class BaseWindowsInformationProtectionAppLearningSummaryCollectionPage extends BaseCollectionPage<WindowsInformationProtectionAppLearningSummary, IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder> implements IBaseWindowsInformationProtectionAppLearningSummaryCollectionPage {

    /**
     * A collection page for WindowsInformationProtectionAppLearningSummary
     *
     * @param response the serialized BaseWindowsInformationProtectionAppLearningSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseWindowsInformationProtectionAppLearningSummaryCollectionPage(final BaseWindowsInformationProtectionAppLearningSummaryCollectionResponse response, final IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}