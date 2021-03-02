// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PhysicalAddress;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.AdministrativeUnit;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.models.extensions.EducationOrganization;
import com.microsoft.graph.requests.extensions.EducationClassCollectionPage;
import com.microsoft.graph.requests.extensions.EducationUserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School.
 */
public class EducationSchool extends EducationOrganization implements IJsonBackedObject {


    /**
     * The Address.
     * Address of the school.
     */
    @SerializedName(value = "address", alternate = {"Address"})
    @Expose
    public PhysicalAddress address;

    /**
     * The Created By.
     * Entity who created the school.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
    public IdentitySet createdBy;

    /**
     * The External Id.
     * ID of school in syncing system.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
    public String externalId;

    /**
     * The External Principal Id.
     * ID of principal in syncing system.
     */
    @SerializedName(value = "externalPrincipalId", alternate = {"ExternalPrincipalId"})
    @Expose
    public String externalPrincipalId;

    /**
     * The Fax.
     * 
     */
    @SerializedName(value = "fax", alternate = {"Fax"})
    @Expose
    public String fax;

    /**
     * The Highest Grade.
     * Highest grade taught.
     */
    @SerializedName(value = "highestGrade", alternate = {"HighestGrade"})
    @Expose
    public String highestGrade;

    /**
     * The Lowest Grade.
     * Lowest grade taught.
     */
    @SerializedName(value = "lowestGrade", alternate = {"LowestGrade"})
    @Expose
    public String lowestGrade;

    /**
     * The Phone.
     * Phone number of school.
     */
    @SerializedName(value = "phone", alternate = {"Phone"})
    @Expose
    public String phone;

    /**
     * The Principal Email.
     * Email address of the principal.
     */
    @SerializedName(value = "principalEmail", alternate = {"PrincipalEmail"})
    @Expose
    public String principalEmail;

    /**
     * The Principal Name.
     * Name of the principal.
     */
    @SerializedName(value = "principalName", alternate = {"PrincipalName"})
    @Expose
    public String principalName;

    /**
     * The School Number.
     * School Number.
     */
    @SerializedName(value = "schoolNumber", alternate = {"SchoolNumber"})
    @Expose
    public String schoolNumber;

    /**
     * The Administrative Unit.
     * 
     */
    @SerializedName(value = "administrativeUnit", alternate = {"AdministrativeUnit"})
    @Expose
    public AdministrativeUnit administrativeUnit;

    /**
     * The Classes.
     * Classes taught at the school. Nullable.
     */
    public EducationClassCollectionPage classes;

    /**
     * The Users.
     * Users in the school. Nullable.
     */
    public EducationUserCollectionPage users;


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


        if (json.has("classes")) {
            classes = serializer.deserializeObject(json.get("classes").toString(), EducationClassCollectionPage.class);
        }

        if (json.has("users")) {
            users = serializer.deserializeObject(json.get("users").toString(), EducationUserCollectionPage.class);
        }
    }
}
