// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.models.extensions.ManagedAppPolicyDeploymentSummary;
import com.microsoft.graph.models.extensions.TargetedManagedAppProtection;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed App Protection.
 */
public class AndroidManagedAppProtection extends TargetedManagedAppProtection implements IJsonBackedObject {


    /**
     * The Custom Browser Display Name.
     * Friendly name of the preferred custom browser to open weblink on Android. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     */
    @SerializedName(value = "customBrowserDisplayName", alternate = {"CustomBrowserDisplayName"})
    @Expose
	@Nullable
    public String customBrowserDisplayName;

    /**
     * The Custom Browser Package Id.
     * Unique identifier of the preferred custom browser to open weblink on Android. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.
     */
    @SerializedName(value = "customBrowserPackageId", alternate = {"CustomBrowserPackageId"})
    @Expose
	@Nullable
    public String customBrowserPackageId;

    /**
     * The Deployed App Count.
     * Count of apps to which the current policy is deployed.
     */
    @SerializedName(value = "deployedAppCount", alternate = {"DeployedAppCount"})
    @Expose
	@Nullable
    public Integer deployedAppCount;

    /**
     * The Disable App Encryption If Device Encryption Is Enabled.
     * When this setting is enabled, app level encryption is disabled if device level encryption is enabled
     */
    @SerializedName(value = "disableAppEncryptionIfDeviceEncryptionIsEnabled", alternate = {"DisableAppEncryptionIfDeviceEncryptionIsEnabled"})
    @Expose
	@Nullable
    public Boolean disableAppEncryptionIfDeviceEncryptionIsEnabled;

    /**
     * The Encrypt App Data.
     * Indicates whether application data for managed apps should be encrypted
     */
    @SerializedName(value = "encryptAppData", alternate = {"EncryptAppData"})
    @Expose
	@Nullable
    public Boolean encryptAppData;

    /**
     * The Minimum Required Patch Version.
     * Define the oldest required Android security patch level a user can have to gain secure access to the app.
     */
    @SerializedName(value = "minimumRequiredPatchVersion", alternate = {"MinimumRequiredPatchVersion"})
    @Expose
	@Nullable
    public String minimumRequiredPatchVersion;

    /**
     * The Minimum Warning Patch Version.
     * Define the oldest recommended Android security patch level a user can have for secure access to the app.
     */
    @SerializedName(value = "minimumWarningPatchVersion", alternate = {"MinimumWarningPatchVersion"})
    @Expose
	@Nullable
    public String minimumWarningPatchVersion;

    /**
     * The Screen Capture Blocked.
     * Indicates whether a managed user can take screen captures of managed apps
     */
    @SerializedName(value = "screenCaptureBlocked", alternate = {"ScreenCaptureBlocked"})
    @Expose
	@Nullable
    public Boolean screenCaptureBlocked;

    /**
     * The Apps.
     * List of apps to which the policy is deployed.
     */
    @SerializedName(value = "apps", alternate = {"Apps"})
    @Expose
	@Nullable
    public ManagedMobileAppCollectionPage apps;

    /**
     * The Deployment Summary.
     * Navigation property to deployment summary of the configuration.
     */
    @SerializedName(value = "deploymentSummary", alternate = {"DeploymentSummary"})
    @Expose
	@Nullable
    public ManagedAppPolicyDeploymentSummary deploymentSummary;


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


        if (json.has("apps")) {
            apps = serializer.deserializeObject(json.get("apps").toString(), ManagedMobileAppCollectionPage.class);
        }
    }
}
