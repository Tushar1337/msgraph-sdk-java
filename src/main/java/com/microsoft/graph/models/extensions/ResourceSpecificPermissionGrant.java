// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DirectoryObject;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Resource Specific Permission Grant.
 */
public class ResourceSpecificPermissionGrant extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Client App Id.
     * 
     */
    @SerializedName(value = "clientAppId", alternate = {"ClientAppId"})
    @Expose
	@Nullable
    public String clientAppId;

    /**
     * The Client Id.
     * 
     */
    @SerializedName(value = "clientId", alternate = {"ClientId"})
    @Expose
	@Nullable
    public String clientId;

    /**
     * The Permission.
     * 
     */
    @SerializedName(value = "permission", alternate = {"Permission"})
    @Expose
	@Nullable
    public String permission;

    /**
     * The Permission Type.
     * 
     */
    @SerializedName(value = "permissionType", alternate = {"PermissionType"})
    @Expose
	@Nullable
    public String permissionType;

    /**
     * The Resource App Id.
     * 
     */
    @SerializedName(value = "resourceAppId", alternate = {"ResourceAppId"})
    @Expose
	@Nullable
    public String resourceAppId;


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
	@Override
    @Nullable
    public ISerializer getSerializer() {
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
