// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.BookingType;
import com.microsoft.graph.models.extensions.Place;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Room.
 */
public class Room extends Place implements IJsonBackedObject {


    /**
     * The Audio Device Name.
     * Specifies the name of the audio device in the room.
     */
    @SerializedName(value = "audioDeviceName", alternate = {"AudioDeviceName"})
    @Expose
	@Nullable
    public String audioDeviceName;

    /**
     * The Booking Type.
     * Type of room. Possible values are standard, and reserved.
     */
    @SerializedName(value = "bookingType", alternate = {"BookingType"})
    @Expose
	@Nullable
    public BookingType bookingType;

    /**
     * The Building.
     * Specifies the building name or building number that the room is in.
     */
    @SerializedName(value = "building", alternate = {"Building"})
    @Expose
	@Nullable
    public String building;

    /**
     * The Capacity.
     * Specifies the capacity of the room.
     */
    @SerializedName(value = "capacity", alternate = {"Capacity"})
    @Expose
	@Nullable
    public Integer capacity;

    /**
     * The Display Device Name.
     * Specifies the name of the display device in the room.
     */
    @SerializedName(value = "displayDeviceName", alternate = {"DisplayDeviceName"})
    @Expose
	@Nullable
    public String displayDeviceName;

    /**
     * The Email Address.
     * Email address of the room.
     */
    @SerializedName(value = "emailAddress", alternate = {"EmailAddress"})
    @Expose
	@Nullable
    public String emailAddress;

    /**
     * The Floor Label.
     * Specifies a descriptive label for the floor, for example, P.
     */
    @SerializedName(value = "floorLabel", alternate = {"FloorLabel"})
    @Expose
	@Nullable
    public String floorLabel;

    /**
     * The Floor Number.
     * Specifies the floor number that the room is on.
     */
    @SerializedName(value = "floorNumber", alternate = {"FloorNumber"})
    @Expose
	@Nullable
    public Integer floorNumber;

    /**
     * The Is Wheel Chair Accessible.
     * 
     */
    @SerializedName(value = "isWheelChairAccessible", alternate = {"IsWheelChairAccessible"})
    @Expose
	@Nullable
    public Boolean isWheelChairAccessible;

    /**
     * The Label.
     * Specifies a descriptive label for the room, for example, a number or name.
     */
    @SerializedName(value = "label", alternate = {"Label"})
    @Expose
	@Nullable
    public String label;

    /**
     * The Nickname.
     * Specifies a nickname for the room, for example, 'conf room'.
     */
    @SerializedName(value = "nickname", alternate = {"Nickname"})
    @Expose
	@Nullable
    public String nickname;

    /**
     * The Tags.
     * Specifies additional features of the room, for example, details like the type of view or furniture type.
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
	@Nullable
    public java.util.List<String> tags;

    /**
     * The Video Device Name.
     * Specifies the name of the video device in the room.
     */
    @SerializedName(value = "videoDeviceName", alternate = {"VideoDeviceName"})
    @Expose
	@Nullable
    public String videoDeviceName;


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
