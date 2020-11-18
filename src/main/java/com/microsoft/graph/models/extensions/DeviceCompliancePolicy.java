// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.extensions.SettingStateDeviceSummary;
import com.microsoft.graph.models.extensions.DeviceComplianceDeviceStatus;
import com.microsoft.graph.models.extensions.DeviceComplianceDeviceOverview;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.models.extensions.DeviceComplianceUserStatus;
import com.microsoft.graph.models.extensions.DeviceComplianceUserOverview;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy.
 */
public class DeviceCompliancePolicy extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * DateTime the object was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Admin provided description of the Device Configuration.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Admin provided name of the device configuration.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * DateTime the object was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Version.
     * Version of the device configuration.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public Integer version;

    /**
     * The Assignments.
     * The collection of assignments for this compliance policy.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public DeviceCompliancePolicyAssignmentCollectionPage assignments;

    /**
     * The Device Setting State Summaries.
     * Compliance Setting State Device Summary
     */
    @SerializedName(value = "deviceSettingStateSummaries", alternate = {"DeviceSettingStateSummaries"})
    @Expose
	@Nullable
    public SettingStateDeviceSummaryCollectionPage deviceSettingStateSummaries;

    /**
     * The Device Statuses.
     * List of DeviceComplianceDeviceStatus.
     */
    @SerializedName(value = "deviceStatuses", alternate = {"DeviceStatuses"})
    @Expose
	@Nullable
    public DeviceComplianceDeviceStatusCollectionPage deviceStatuses;

    /**
     * The Device Status Overview.
     * Device compliance devices status overview
     */
    @SerializedName(value = "deviceStatusOverview", alternate = {"DeviceStatusOverview"})
    @Expose
	@Nullable
    public DeviceComplianceDeviceOverview deviceStatusOverview;

    /**
     * The Scheduled Actions For Rule.
     * The list of scheduled action for this rule
     */
    @SerializedName(value = "scheduledActionsForRule", alternate = {"ScheduledActionsForRule"})
    @Expose
	@Nullable
    public DeviceComplianceScheduledActionForRuleCollectionPage scheduledActionsForRule;

    /**
     * The User Statuses.
     * List of DeviceComplianceUserStatus.
     */
    @SerializedName(value = "userStatuses", alternate = {"UserStatuses"})
    @Expose
	@Nullable
    public DeviceComplianceUserStatusCollectionPage userStatuses;

    /**
     * The User Status Overview.
     * Device compliance users status overview
     */
    @SerializedName(value = "userStatusOverview", alternate = {"UserStatusOverview"})
    @Expose
	@Nullable
    public DeviceComplianceUserOverview userStatusOverview;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments").toString(), DeviceCompliancePolicyAssignmentCollectionPage.class);
        }

        if (json.has("deviceSettingStateSummaries")) {
            deviceSettingStateSummaries = serializer.deserializeObject(json.get("deviceSettingStateSummaries").toString(), SettingStateDeviceSummaryCollectionPage.class);
        }

        if (json.has("deviceStatuses")) {
            deviceStatuses = serializer.deserializeObject(json.get("deviceStatuses").toString(), DeviceComplianceDeviceStatusCollectionPage.class);
        }

        if (json.has("scheduledActionsForRule")) {
            scheduledActionsForRule = serializer.deserializeObject(json.get("scheduledActionsForRule").toString(), DeviceComplianceScheduledActionForRuleCollectionPage.class);
        }

        if (json.has("userStatuses")) {
            userStatuses = serializer.deserializeObject(json.get("userStatuses").toString(), DeviceComplianceUserStatusCollectionPage.class);
        }
    }
}
