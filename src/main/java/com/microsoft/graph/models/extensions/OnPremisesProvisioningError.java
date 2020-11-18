// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Provisioning Error.
 */
public class OnPremisesProvisioningError implements IJsonBackedObject {

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
     * The Category.
     * Category of the provisioning error. Note: Currently, there is only one possible value. Possible value: PropertyConflict - indicates a property value is not unique. Other objects contain the same value for the property.
     */
    @SerializedName(value = "category", alternate = {"Category"})
    @Expose
	@Nullable
    public String category;

    /**
     * The Occurred Date Time.
     * The date and time at which the error occurred.
     */
    @SerializedName(value = "occurredDateTime", alternate = {"OccurredDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar occurredDateTime;

    /**
     * The Property Causing Error.
     * Name of the directory property causing the error. Current possible values: UserPrincipalName or ProxyAddress
     */
    @SerializedName(value = "propertyCausingError", alternate = {"PropertyCausingError"})
    @Expose
	@Nullable
    public String propertyCausingError;

    /**
     * The Value.
     * Value of the property causing the error.
     */
    @SerializedName(value = "value", alternate = {"Value"})
    @Expose
	@Nullable
    public String value;


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
