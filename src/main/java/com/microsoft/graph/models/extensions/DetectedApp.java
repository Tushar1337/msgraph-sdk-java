// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Detected App.
 */
public class DetectedApp extends Entity implements IJsonBackedObject {


    /**
     * The Device Count.
     * The number of devices that have installed this application
     */
    @SerializedName("deviceCount")
    @Expose
    public Integer deviceCount;

    /**
     * The Display Name.
     * Name of the discovered application. Read-only
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Size In Byte.
     * Discovered application size in bytes. Read-only
     */
    @SerializedName("sizeInByte")
    @Expose
    public Long sizeInByte;

    /**
     * The Version.
     * Version of the discovered application. Read-only
     */
    @SerializedName("version")
    @Expose
    public String version;

    /**
     * The Managed Devices.
     * The devices that have the discovered application installed
     */
    public ManagedDeviceCollectionPage managedDevices;


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


        if (json.has("managedDevices")) {
            final ManagedDeviceCollectionResponse response = new ManagedDeviceCollectionResponse();
            if (json.has("managedDevices@odata.nextLink")) {
                response.nextLink = json.get("managedDevices@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedDevices").toString(), JsonObject[].class);
            final ManagedDevice[] array = new ManagedDevice[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDevice.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedDevices = new ManagedDeviceCollectionPage(response, null);
        }
    }
}
