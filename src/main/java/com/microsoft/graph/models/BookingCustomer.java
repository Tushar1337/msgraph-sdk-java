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
import com.microsoft.graph.models.PhysicalAddress;
import com.microsoft.graph.models.Phone;
import com.microsoft.graph.models.BookingCustomerBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Customer.
 */
public class BookingCustomer extends BookingCustomerBase implements IJsonBackedObject {


    /**
     * The Addresses.
     * Addresses associated with the customer, including home, business and other addresses.
     */
    @SerializedName(value = "addresses", alternate = {"Addresses"})
    @Expose
	@Nullable
    public java.util.List<PhysicalAddress> addresses;

    /**
     * The Display Name.
     * The display name is suitable for human-readable interfaces.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Email Address.
     * The SMTP address of the customer.
     */
    @SerializedName(value = "emailAddress", alternate = {"EmailAddress"})
    @Expose
	@Nullable
    public String emailAddress;

    /**
     * The Phones.
     * Phone numbers associated with the customer, including home, business and mobile numbers.
     */
    @SerializedName(value = "phones", alternate = {"Phones"})
    @Expose
	@Nullable
    public java.util.List<Phone> phones;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
