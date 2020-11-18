// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceEnrollmentPlatformRestriction;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Platform Restrictions Configuration.
 */
public class DeviceEnrollmentPlatformRestrictionsConfiguration extends DeviceEnrollmentConfiguration implements IJsonBackedObject {


    /**
     * The Android Restriction.
     * Not yet documented
     */
    @SerializedName(value = "androidRestriction", alternate = {"AndroidRestriction"})
    @Expose
	@Nullable
    public DeviceEnrollmentPlatformRestriction androidRestriction;

    /**
     * The Ios Restriction.
     * Not yet documented
     */
    @SerializedName(value = "iosRestriction", alternate = {"IosRestriction"})
    @Expose
	@Nullable
    public DeviceEnrollmentPlatformRestriction iosRestriction;

    /**
     * The Mac OSRestriction.
     * Not yet documented
     */
    @SerializedName(value = "macOSRestriction", alternate = {"MacOSRestriction"})
    @Expose
	@Nullable
    public DeviceEnrollmentPlatformRestriction macOSRestriction;

    /**
     * The Windows Mobile Restriction.
     * Not yet documented
     */
    @SerializedName(value = "windowsMobileRestriction", alternate = {"WindowsMobileRestriction"})
    @Expose
	@Nullable
    public DeviceEnrollmentPlatformRestriction windowsMobileRestriction;

    /**
     * The Windows Restriction.
     * Not yet documented
     */
    @SerializedName(value = "windowsRestriction", alternate = {"WindowsRestriction"})
    @Expose
	@Nullable
    public DeviceEnrollmentPlatformRestriction windowsRestriction;


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
