// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IdentitySet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Mention.
 */
public class ChatMessageMention implements IJsonBackedObject {

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
     * The Id.
     * Index of an entity being mentioned in the specified chatMessage. Matches the {index} value in the corresponding &amp;lt;at id='{index}'&amp;gt; tag in the message body.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public Integer id;

    /**
     * The Mentioned.
     * The entity (user, application, team, or channel) that was mentioned.  If it was a channel or team that was @mentioned, the identitySet contains a conversation property giving the ID of the team/channel, and a conversationIdentityType property that represents either the team or channel.
     */
    @SerializedName(value = "mentioned", alternate = {"Mentioned"})
    @Expose
	@Nullable
    public IdentitySet mentioned;

    /**
     * The Mention Text.
     * String used to represent the mention. For example, a user's display name, a team name.
     */
    @SerializedName(value = "mentionText", alternate = {"MentionText"})
    @Expose
	@Nullable
    public String mentionText;


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
