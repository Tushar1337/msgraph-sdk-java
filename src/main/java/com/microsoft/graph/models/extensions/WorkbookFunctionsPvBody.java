// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Pv Body.
 */
public class WorkbookFunctionsPvBody {

    /**
     * The rate.
     * 
     */
    @SerializedName(value = "rate", alternate = {"Rate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement rate;

    /**
     * The nper.
     * 
     */
    @SerializedName(value = "nper", alternate = {"Nper"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement nper;

    /**
     * The pmt.
     * 
     */
    @SerializedName(value = "pmt", alternate = {"Pmt"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement pmt;

    /**
     * The fv.
     * 
     */
    @SerializedName(value = "fv", alternate = {"Fv"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement fv;

    /**
     * The type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement type;


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
