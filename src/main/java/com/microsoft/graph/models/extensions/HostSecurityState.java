// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Security State.
 */
public class HostSecurityState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Fqdn.
     * Host FQDN (Fully Qualified Domain Name) (for example, machine.company.com).
     */
    @SerializedName("fqdn")
    @Expose
    public String fqdn;

    /**
     * The Is Azure Ad Joined.
     * 
     */
    @SerializedName("isAzureAdJoined")
    @Expose
    public Boolean isAzureAdJoined;

    /**
     * The Is Azure Ad Registered.
     * 
     */
    @SerializedName("isAzureAdRegistered")
    @Expose
    public Boolean isAzureAdRegistered;

    /**
     * The Is Hybrid Azure Domain Joined.
     * True if the host is domain joined to an on-premises Active Directory domain.
     */
    @SerializedName("isHybridAzureDomainJoined")
    @Expose
    public Boolean isHybridAzureDomainJoined;

    /**
     * The Net Bios Name.
     * The local host name, without the DNS domain name.
     */
    @SerializedName("netBiosName")
    @Expose
    public String netBiosName;

    /**
     * The Os.
     * Host Operating System. (For example, Windows10, MacOS, RHEL, etc.).
     */
    @SerializedName("os")
    @Expose
    public String os;

    /**
     * The Private Ip Address.
     * Private (not routable) IPv4 or IPv6 address (see RFC 1918) at the time of the alert.
     */
    @SerializedName("privateIpAddress")
    @Expose
    public String privateIpAddress;

    /**
     * The Public Ip Address.
     * Publicly routable IPv4 or IPv6 address (see RFC 1918) at time of the alert.
     */
    @SerializedName("publicIpAddress")
    @Expose
    public String publicIpAddress;

    /**
     * The Risk Score.
     * Provider-generated/calculated risk score of the host.  Recommended value range of 0-1, which equates to a percentage.
     */
    @SerializedName("riskScore")
    @Expose
    public String riskScore;


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

    }
}
