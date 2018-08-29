// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceOperatingSystemSummary;
import com.microsoft.graph.models.extensions.DeviceExchangeAccessStateSummary;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Device Overview.
 */
public class BaseManagedDeviceOverview extends Entity implements IJsonBackedObject {


    /**
     * The Enrolled Device Count.
     * Total enrolled device count. Does not include PC devices managed via Intune PC Agent
     */
    @SerializedName("enrolledDeviceCount")
    @Expose
    public Integer enrolledDeviceCount;

    /**
     * The Mdm Enrolled Count.
     * The number of devices enrolled in MDM
     */
    @SerializedName("mdmEnrolledCount")
    @Expose
    public Integer mdmEnrolledCount;

    /**
     * The Dual Enrolled Device Count.
     * The number of devices enrolled in both MDM and EAS
     */
    @SerializedName("dualEnrolledDeviceCount")
    @Expose
    public Integer dualEnrolledDeviceCount;

    /**
     * The Device Operating System Summary.
     * Device operating system summary.
     */
    @SerializedName("deviceOperatingSystemSummary")
    @Expose
    public DeviceOperatingSystemSummary deviceOperatingSystemSummary;

    /**
     * The Device Exchange Access State Summary.
     * Distribution of Exchange Access State in Intune
     */
    @SerializedName("deviceExchangeAccessStateSummary")
    @Expose
    public DeviceExchangeAccessStateSummary deviceExchangeAccessStateSummary;


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
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}