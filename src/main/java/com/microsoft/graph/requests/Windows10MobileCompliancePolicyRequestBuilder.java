// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Windows10MobileCompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Mobile Compliance Policy Request Builder.
 */
public class Windows10MobileCompliancePolicyRequestBuilder extends BaseRequestBuilder<Windows10MobileCompliancePolicy> {

    /**
     * The request builder for the Windows10MobileCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10MobileCompliancePolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the Windows10MobileCompliancePolicyRequest instance
     */
    @Nonnull
    public Windows10MobileCompliancePolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the Windows10MobileCompliancePolicyRequest instance
     */
    @Nonnull
    public Windows10MobileCompliancePolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.Windows10MobileCompliancePolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceCompliancePolicyAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequestBuilder assignments() {
        return new DeviceCompliancePolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCompliancePolicyAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new DeviceCompliancePolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SettingStateDeviceSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new SettingStateDeviceSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the SettingStateDeviceSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(@Nonnull final String id) {
        return new SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceComplianceDeviceStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceComplianceDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new DeviceComplianceDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceComplianceDeviceStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
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
    /**
     *  Gets a request builder for the DeviceComplianceScheduledActionForRule collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequestBuilder scheduledActionsForRule() {
        return new DeviceComplianceScheduledActionForRuleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionsForRule"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceComplianceScheduledActionForRule item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleRequestBuilder scheduledActionsForRule(@Nonnull final String id) {
        return new DeviceComplianceScheduledActionForRuleRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionsForRule") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceComplianceUserStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequestBuilder userStatuses() {
        return new DeviceComplianceUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceComplianceUserStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
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
