// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.models.Attachment;
import com.microsoft.graph.models.Extension;
import com.microsoft.graph.models.Post;
import com.microsoft.graph.models.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.OutlookItem;
import com.microsoft.graph.requests.AttachmentCollectionPage;
import com.microsoft.graph.requests.ExtensionCollectionPage;
import com.microsoft.graph.requests.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.SingleValueLegacyExtendedPropertyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Post.
 */
public class Post extends OutlookItem implements IJsonBackedObject {


    /**
     * The Body.
     * The contents of the post. This is a default property. This property can be null.
     */
    @SerializedName(value = "body", alternate = {"Body"})
    @Expose
	@Nullable
    public ItemBody body;

    /**
     * The Conversation Id.
     * Unique ID of the conversation. Read-only.
     */
    @SerializedName(value = "conversationId", alternate = {"ConversationId"})
    @Expose
	@Nullable
    public String conversationId;

    /**
     * The Conversation Thread Id.
     * Unique ID of the conversation thread. Read-only.
     */
    @SerializedName(value = "conversationThreadId", alternate = {"ConversationThreadId"})
    @Expose
	@Nullable
    public String conversationThreadId;

    /**
     * The From.
     * Used in delegate access scenarios. Indicates who posted the message on behalf of another user. This is a default property.
     */
    @SerializedName(value = "from", alternate = {"From"})
    @Expose
	@Nullable
    public Recipient from;

    /**
     * The Has Attachments.
     * Indicates whether the post has at least one attachment. This is a default property.
     */
    @SerializedName(value = "hasAttachments", alternate = {"HasAttachments"})
    @Expose
	@Nullable
    public Boolean hasAttachments;

    /**
     * The New Participants.
     * Conversation participants that were added to the thread as part of this post.
     */
    @SerializedName(value = "newParticipants", alternate = {"NewParticipants"})
    @Expose
	@Nullable
    public java.util.List<Recipient> newParticipants;

    /**
     * The Received Date Time.
     * Specifies when the post was received. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "receivedDateTime", alternate = {"ReceivedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime receivedDateTime;

    /**
     * The Sender.
     * Contains the address of the sender. The value of Sender is assumed to be the address of the authenticated user in the case when Sender is not specified. This is a default property.
     */
    @SerializedName(value = "sender", alternate = {"Sender"})
    @Expose
	@Nullable
    public Recipient sender;

    /**
     * The Attachments.
     * The collection of fileAttachment, itemAttachment, and referenceAttachment attachments for the post. Read-only. Nullable. Supports $expand.
     */
    @SerializedName(value = "attachments", alternate = {"Attachments"})
    @Expose
	@Nullable
    public AttachmentCollectionPage attachments;

    /**
     * The Extensions.
     * The collection of open extensions defined for the post. Read-only. Nullable. Supports $expand.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;

    /**
     * The In Reply To.
     * The earlier post that this post is replying to in the conversationThread. Read-only. Supports $expand.
     */
    @SerializedName(value = "inReplyTo", alternate = {"InReplyTo"})
    @Expose
	@Nullable
    public Post inReplyTo;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the post. Read-only. Nullable.
     */
    @SerializedName(value = "multiValueExtendedProperties", alternate = {"MultiValueExtendedProperties"})
    @Expose
	@Nullable
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the post. Read-only. Nullable.
     */
    @SerializedName(value = "singleValueExtendedProperties", alternate = {"SingleValueExtendedProperties"})
    @Expose
	@Nullable
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("attachments")) {
            attachments = serializer.deserializeObject(json.get("attachments"), AttachmentCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions"), ExtensionCollectionPage.class);
        }

        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties"), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties"), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }
    }
}
