// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ComplianceStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration User Status.
 */
public class DeviceConfigurationUserStatus extends Entity implements IJsonBackedObject {


    /**
     * The Devices Count.
     * Devices count for that user.
     */
    @SerializedName(value = "devicesCount", alternate = {"DevicesCount"})
    @Expose
	@Nullable
    public Integer devicesCount;

    /**
     * The Last Reported Date Time.
     * Last modified date time of the policy report.
     */
    @SerializedName(value = "lastReportedDateTime", alternate = {"LastReportedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastReportedDateTime;

    /**
     * The Status.
     * Compliance status of the policy report. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict, notAssigned.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public ComplianceStatus status;

    /**
     * The User Display Name.
     * User name of the DevicePolicyStatus.
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
	@Nullable
    public String userDisplayName;

    /**
     * The User Principal Name.
     * UserPrincipalName.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;


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

    }
}
