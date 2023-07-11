// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UserExperienceAnalyticsHealthState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Model Scores.
 */
public class UserExperienceAnalyticsModelScores extends Entity implements IJsonBackedObject {


    /**
     * The App Reliability Score.
     * Indicates a score calculated from application health data to indicate when a device is having problems running one or more applications. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "appReliabilityScore", alternate = {"AppReliabilityScore"})
    @Expose
	@Nullable
    public Double appReliabilityScore;

    /**
     * The Battery Health Score.
     * Indicates a calulated score indicating the health of the device's battery. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "batteryHealthScore", alternate = {"BatteryHealthScore"})
    @Expose
	@Nullable
    public Double batteryHealthScore;

    /**
     * The Endpoint Analytics Score.
     * Indicates a weighted average of the various scores. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "endpointAnalyticsScore", alternate = {"EndpointAnalyticsScore"})
    @Expose
	@Nullable
    public Double endpointAnalyticsScore;

    /**
     * The Health Status.
     * The health status of the device. Possible values are: unknown, insufficientData, needsAttention, meetingGoals. Unknown by default. Supports: $filter, $select, $OrderBy. Read-only. Possible values are: unknown, insufficientData, needsAttention, meetingGoals, unknownFutureValue.
     */
    @SerializedName(value = "healthStatus", alternate = {"HealthStatus"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsHealthState healthStatus;

    /**
     * The Manufacturer.
     * The manufacturer name of the device. Examples: Microsoft Corporation, HP, Lenovo. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
	@Nullable
    public String manufacturer;

    /**
     * The Model.
     * The model name of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
	@Nullable
    public String model;

    /**
     * The Model Device Count.
     * Indicates unique devices count of given model in a consolidated report. Supports: $select, $OrderBy. Read-only. Valid values -9.22337203685478E+18 to 9.22337203685478E+18
     */
    @SerializedName(value = "modelDeviceCount", alternate = {"ModelDeviceCount"})
    @Expose
	@Nullable
    public Long modelDeviceCount;

    /**
     * The Startup Performance Score.
     * Indicates a weighted average of boot score and logon score used for measuring startup performance. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "startupPerformanceScore", alternate = {"StartupPerformanceScore"})
    @Expose
	@Nullable
    public Double startupPerformanceScore;

    /**
     * The Work From Anywhere Score.
     * Indicates a weighted score of the work from anywhere on a device level. Valid values range from 0-100. Value -1 means associated score is unavailable. A higher score indicates a healthier device. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "workFromAnywhereScore", alternate = {"WorkFromAnywhereScore"})
    @Expose
	@Nullable
    public Double workFromAnywhereScore;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
