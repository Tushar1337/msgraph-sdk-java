// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosCompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Compliance Policy Request Builder.
 */
public class IosCompliancePolicyRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the IosCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosCompliancePolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IosCompliancePolicyRequest instance
     */
    @Nonnull
    public IosCompliancePolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IosCompliancePolicyRequest instance
     */
    @Nonnull
    public IosCompliancePolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.IosCompliancePolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequestBuilder assignments() {
        return new DeviceCompliancePolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    @Nonnull
    public DeviceCompliancePolicyAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new DeviceCompliancePolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    @Nonnull
    public SettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new SettingStateDeviceSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    @Nonnull
    public SettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(@Nonnull final String id) {
        return new SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }
    @Nonnull
    public DeviceComplianceDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new DeviceComplianceDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    @Nonnull
    public DeviceComplianceDeviceStatusRequestBuilder deviceStatuses(@Nonnull final String id) {
        return new DeviceComplianceDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceComplianceDeviceOverview
     *
     * @return the DeviceComplianceDeviceOverviewRequestBuilder instance
     */
    @Nonnull
    public DeviceComplianceDeviceOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceComplianceDeviceOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusOverview"), getClient(), null);
    }
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequestBuilder scheduledActionsForRule() {
        return new DeviceComplianceScheduledActionForRuleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionsForRule"), getClient(), null);
    }

    @Nonnull
    public DeviceComplianceScheduledActionForRuleRequestBuilder scheduledActionsForRule(@Nonnull final String id) {
        return new DeviceComplianceScheduledActionForRuleRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionsForRule") + "/" + id, getClient(), null);
    }
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequestBuilder userStatuses() {
        return new DeviceComplianceUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    @Nonnull
    public DeviceComplianceUserStatusRequestBuilder userStatuses(@Nonnull final String id) {
        return new DeviceComplianceUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceComplianceUserOverview
     *
     * @return the DeviceComplianceUserOverviewRequestBuilder instance
     */
    @Nonnull
    public DeviceComplianceUserOverviewRequestBuilder userStatusOverview() {
        return new DeviceComplianceUserOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusOverview"), getClient(), null);
    }
}
