// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.OnlineMeetingPresenters;
import com.microsoft.graph.models.MeetingChatMode;
import com.microsoft.graph.models.AudioConferencing;
import com.microsoft.graph.models.ChatInfo;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.LobbyBypassSettings;
import com.microsoft.graph.models.MeetingParticipants;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting.
 */
public class OnlineMeeting extends Entity implements IJsonBackedObject {


    /**
     * The Allow Attendee To Enable Camera.
     * Indicates whether attendees can turn on their camera.
     */
    @SerializedName(value = "allowAttendeeToEnableCamera", alternate = {"AllowAttendeeToEnableCamera"})
    @Expose
	@Nullable
    public Boolean allowAttendeeToEnableCamera;

    /**
     * The Allow Attendee To Enable Mic.
     * Indicates whether attendees can turn on their microphone.
     */
    @SerializedName(value = "allowAttendeeToEnableMic", alternate = {"AllowAttendeeToEnableMic"})
    @Expose
	@Nullable
    public Boolean allowAttendeeToEnableMic;

    /**
     * The Allowed Presenters.
     * Specifies who can be a presenter in a meeting. Possible values are everyone, organization, roleIsPresenter, organizer, and unknownFutureValue.
     */
    @SerializedName(value = "allowedPresenters", alternate = {"AllowedPresenters"})
    @Expose
	@Nullable
    public OnlineMeetingPresenters allowedPresenters;

    /**
     * The Allow Meeting Chat.
     * Specifies the mode of meeting chat.
     */
    @SerializedName(value = "allowMeetingChat", alternate = {"AllowMeetingChat"})
    @Expose
	@Nullable
    public MeetingChatMode allowMeetingChat;

    /**
     * The Allow Teamwork Reactions.
     * Indicates if Teams reactions are enabled for the meeting.
     */
    @SerializedName(value = "allowTeamworkReactions", alternate = {"AllowTeamworkReactions"})
    @Expose
	@Nullable
    public Boolean allowTeamworkReactions;

    /**
     * The Audio Conferencing.
     * The phone access (dial-in) information for an online meeting. Read-only.
     */
    @SerializedName(value = "audioConferencing", alternate = {"AudioConferencing"})
    @Expose
	@Nullable
    public AudioConferencing audioConferencing;

    /**
     * The Chat Info.
     * The chat information associated with this online meeting.
     */
    @SerializedName(value = "chatInfo", alternate = {"ChatInfo"})
    @Expose
	@Nullable
    public ChatInfo chatInfo;

    /**
     * The Creation Date Time.
     * The meeting creation time in UTC. Read-only.
     */
    @SerializedName(value = "creationDateTime", alternate = {"CreationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime creationDateTime;

    /**
     * The End Date Time.
     * The meeting end time in UTC.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The External Id.
     * The external ID. A custom ID. Optional.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;

    /**
     * The Is Entry Exit Announced.
     * Indicates whether to announce when callers join or leave.
     */
    @SerializedName(value = "isEntryExitAnnounced", alternate = {"IsEntryExitAnnounced"})
    @Expose
	@Nullable
    public Boolean isEntryExitAnnounced;

    /**
     * The Join Information.
     * The join information in the language and locale variant specified in 'Accept-Language' request HTTP header. Read-only
     */
    @SerializedName(value = "joinInformation", alternate = {"JoinInformation"})
    @Expose
	@Nullable
    public ItemBody joinInformation;

    /**
     * The Join Web Url.
     * The join URL of the online meeting. Read-only.
     */
    @SerializedName(value = "joinWebUrl", alternate = {"JoinWebUrl"})
    @Expose
	@Nullable
    public String joinWebUrl;

    /**
     * The Lobby Bypass Settings.
     * Specifies which participants can bypass the meeting lobby.
     */
    @SerializedName(value = "lobbyBypassSettings", alternate = {"LobbyBypassSettings"})
    @Expose
	@Nullable
    public LobbyBypassSettings lobbyBypassSettings;

    /**
     * The Participants.
     * The participants associated with the online meeting. This includes the organizer and the attendees.
     */
    @SerializedName(value = "participants", alternate = {"Participants"})
    @Expose
	@Nullable
    public MeetingParticipants participants;

    /**
     * The Start Date Time.
     * The meeting start time in UTC.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Subject.
     * The subject of the online meeting.
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
	@Nullable
    public String subject;

    /**
     * The Video Teleconference Id.
     * The video teleconferencing ID. Read-only.
     */
    @SerializedName(value = "videoTeleconferenceId", alternate = {"VideoTeleconferenceId"})
    @Expose
	@Nullable
    public String videoTeleconferenceId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
