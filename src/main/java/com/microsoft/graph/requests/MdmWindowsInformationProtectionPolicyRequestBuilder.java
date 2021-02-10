// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MdmWindowsInformationProtectionPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mdm Windows Information Protection Policy Request Builder.
 */
public class MdmWindowsInformationProtectionPolicyRequestBuilder extends BaseRequestBuilder<MdmWindowsInformationProtectionPolicy> {

    /**
     * The request builder for the MdmWindowsInformationProtectionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MdmWindowsInformationProtectionPolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the MdmWindowsInformationProtectionPolicyRequest instance
     */
    @Nonnull
    public MdmWindowsInformationProtectionPolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the MdmWindowsInformationProtectionPolicyRequest instance
     */
    @Nonnull
    public MdmWindowsInformationProtectionPolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.MdmWindowsInformationProtectionPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the TargetedManagedAppPolicyAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments() {
        return new TargetedManagedAppPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the TargetedManagedAppPolicyAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TargetedManagedAppPolicyAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new TargetedManagedAppPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionAppLockerFile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsInformationProtectionAppLockerFileCollectionRequestBuilder exemptAppLockerFiles() {
        return new WindowsInformationProtectionAppLockerFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exemptAppLockerFiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionAppLockerFile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsInformationProtectionAppLockerFileRequestBuilder exemptAppLockerFiles(@Nonnull final String id) {
        return new WindowsInformationProtectionAppLockerFileRequestBuilder(getRequestUrlWithAdditionalSegment("exemptAppLockerFiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionAppLockerFile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsInformationProtectionAppLockerFileCollectionRequestBuilder protectedAppLockerFiles() {
        return new WindowsInformationProtectionAppLockerFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("protectedAppLockerFiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionAppLockerFile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsInformationProtectionAppLockerFileRequestBuilder protectedAppLockerFiles(@Nonnull final String id) {
        return new WindowsInformationProtectionAppLockerFileRequestBuilder(getRequestUrlWithAdditionalSegment("protectedAppLockerFiles") + "/" + id, getClient(), null);
    }
}
