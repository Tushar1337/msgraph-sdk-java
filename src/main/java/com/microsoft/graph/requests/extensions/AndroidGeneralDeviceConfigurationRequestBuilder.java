// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidGeneralDeviceConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android General Device Configuration Request Builder.
 */
public class AndroidGeneralDeviceConfigurationRequestBuilder extends BaseRequestBuilder {

    /**
     * The request builder for the AndroidGeneralDeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidGeneralDeviceConfigurationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AndroidGeneralDeviceConfigurationRequest instance
     */
    @Nonnull
    public AndroidGeneralDeviceConfigurationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AndroidGeneralDeviceConfigurationRequest instance
     */
    @Nonnull
    public AndroidGeneralDeviceConfigurationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AndroidGeneralDeviceConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    @Nonnull
    public DeviceConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new DeviceConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    @Nonnull
    public DeviceConfigurationAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new DeviceConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
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
    public DeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new DeviceConfigurationDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    @Nonnull
    public DeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(@Nonnull final String id) {
        return new DeviceConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the DeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    @Nonnull
    public DeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceConfigurationDeviceOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusOverview"), getClient(), null);
    }
    @Nonnull
    public DeviceConfigurationUserStatusCollectionRequestBuilder userStatuses() {
        return new DeviceConfigurationUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    @Nonnull
    public DeviceConfigurationUserStatusRequestBuilder userStatuses(@Nonnull final String id) {
        return new DeviceConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the DeviceConfigurationUserOverviewRequestBuilder instance
     */
    @Nonnull
    public DeviceConfigurationUserOverviewRequestBuilder userStatusOverview() {
        return new DeviceConfigurationUserOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusOverview"), getClient(), null);
    }
}
