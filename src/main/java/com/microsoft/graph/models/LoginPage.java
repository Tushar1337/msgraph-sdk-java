// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.EmailIdentity;
import com.microsoft.graph.models.SimulationContentSource;
import com.microsoft.graph.models.SimulationContentStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Login Page.
 */
public class LoginPage extends Entity implements IJsonBackedObject {


    /**
     * The Content.
     * The HTML content of the login page.
     */
    @SerializedName(value = "content", alternate = {"Content"})
    @Expose
	@Nullable
    public String content;

    /**
     * The Created By.
     * Identity of the user who created the login page.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public EmailIdentity createdBy;

    /**
     * The Created Date Time.
     * Date and time when the login page was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * Description about the login page.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Display name of the login page.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Language.
     * The content language of the login page.
     */
    @SerializedName(value = "language", alternate = {"Language"})
    @Expose
	@Nullable
    public String language;

    /**
     * The Last Modified By.
     * Identity of the user who last modified the login page.
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
	@Nullable
    public EmailIdentity lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * Date and time when the login page was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Source.
     * The source of the content. Possible values are: unknown, global, tenant, unknownFutureValue.
     */
    @SerializedName(value = "source", alternate = {"Source"})
    @Expose
	@Nullable
    public SimulationContentSource source;

    /**
     * The Status.
     * The login page status. Possible values are: unknown, draft, ready, archive, delete, unknownFutureValue.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public SimulationContentStatus status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
