// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ApplicationEnforcedRestrictionsSessionControl;
import com.microsoft.graph.models.extensions.CloudAppSecuritySessionControl;
import com.microsoft.graph.models.extensions.PersistentBrowserSessionControl;
import com.microsoft.graph.models.extensions.SignInFrequencySessionControl;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Session Controls.
 */
public class ConditionalAccessSessionControls implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Application Enforced Restrictions.
     * Session control to enforce application restrictions. Only Exchange Online and Sharepoint Online support this session control.
     */
    @SerializedName(value = "applicationEnforcedRestrictions", alternate = {"ApplicationEnforcedRestrictions"})
    @Expose
	@Nullable
    public ApplicationEnforcedRestrictionsSessionControl applicationEnforcedRestrictions;

    /**
     * The Cloud App Security.
     * Session control to apply cloud app security.
     */
    @SerializedName(value = "cloudAppSecurity", alternate = {"CloudAppSecurity"})
    @Expose
	@Nullable
    public CloudAppSecuritySessionControl cloudAppSecurity;

    /**
     * The Persistent Browser.
     * Session control to define whether to persist cookies or not. All apps should be selected for this session control to work correctly.
     */
    @SerializedName(value = "persistentBrowser", alternate = {"PersistentBrowser"})
    @Expose
	@Nullable
    public PersistentBrowserSessionControl persistentBrowser;

    /**
     * The Sign In Frequency.
     * Session control to enforce signin frequency.
     */
    @SerializedName(value = "signInFrequency", alternate = {"SignInFrequency"})
    @Expose
	@Nullable
    public SignInFrequencySessionControl signInFrequency;


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
