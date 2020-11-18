// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.CalendarRoleType;
import com.microsoft.graph.models.extensions.EmailAddress;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Permission.
 */
public class CalendarPermission extends Entity implements IJsonBackedObject {


    /**
     * The Allowed Roles.
     * List of allowed sharing or delegating permission levels for the calendar. Possible values are: none, freeBusyRead, limitedRead, read, write, delegateWithoutPrivateEventAccess, delegateWithPrivateEventAccess, custom.
     */
    @SerializedName(value = "allowedRoles", alternate = {"AllowedRoles"})
    @Expose
	@Nullable
    public java.util.List<CalendarRoleType> allowedRoles;

    /**
     * The Email Address.
     * Represents a sharee or delegate who has access to the calendar. For the 'My Organization' sharee, the address property is null. Read-only.
     */
    @SerializedName(value = "emailAddress", alternate = {"EmailAddress"})
    @Expose
	@Nullable
    public EmailAddress emailAddress;

    /**
     * The Is Inside Organization.
     * True if the user in context (sharee or delegate) is inside the same organization as the calendar owner.
     */
    @SerializedName(value = "isInsideOrganization", alternate = {"IsInsideOrganization"})
    @Expose
	@Nullable
    public Boolean isInsideOrganization;

    /**
     * The Is Removable.
     * True if the user can be removed from the list of sharees or delegates for the specified calendar, false otherwise. The 'My organization' user determines the permissions other people within your organization have to the given calendar. You cannot remove 'My organization' as a sharee to a calendar.
     */
    @SerializedName(value = "isRemovable", alternate = {"IsRemovable"})
    @Expose
	@Nullable
    public Boolean isRemovable;

    /**
     * The Role.
     * Current permission level of the calendar sharee or delegate.
     */
    @SerializedName(value = "role", alternate = {"Role"})
    @Expose
	@Nullable
    public CalendarRoleType role;


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
