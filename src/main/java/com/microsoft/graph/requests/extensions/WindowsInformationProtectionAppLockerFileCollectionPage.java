// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLockerFile;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection App Locker File Collection Page.
 */
public class WindowsInformationProtectionAppLockerFileCollectionPage extends BaseCollectionPage<WindowsInformationProtectionAppLockerFile, IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder> implements IWindowsInformationProtectionAppLockerFileCollectionPage {

    /**
     * A collection page for WindowsInformationProtectionAppLockerFile
     *
     * @param response the serialized WindowsInformationProtectionAppLockerFileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsInformationProtectionAppLockerFileCollectionPage(final WindowsInformationProtectionAppLockerFileCollectionResponse response, final IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
