package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantAccessPolicyConfigurationPartner implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Determines the partner-specific configuration for automatic user consent settings. Unless specifically configured, the inboundAllowed and outboundAllowed properties are null and inherit from the default settings, which is always false.
     */
    private InboundOutboundPolicyConfiguration automaticUserConsentSettings;
    /**
     * Defines your partner-specific configuration for users from other organizations accessing your resources via Azure AD B2B collaboration.
     */
    private CrossTenantAccessPolicyB2BSetting b2bCollaborationInbound;
    /**
     * Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration.
     */
    private CrossTenantAccessPolicyB2BSetting b2bCollaborationOutbound;
    /**
     * Defines your partner-specific configuration for users from other organizations accessing your resources via Azure B2B direct connect.
     */
    private CrossTenantAccessPolicyB2BSetting b2bDirectConnectInbound;
    /**
     * Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect.
     */
    private CrossTenantAccessPolicyB2BSetting b2bDirectConnectOutbound;
    /**
     * Defines the cross-tenant policy for the synchronization of users from a partner tenant. Use this user synchronization policy to streamline collaboration between users in a multitenant organization by automating the creation, update, and deletion of users from one tenant to another.
     */
    private CrossTenantIdentitySyncPolicyPartner identitySynchronization;
    /**
     * Determines the partner-specific configuration for trusting other Conditional Access claims from external Azure AD organizations.
     */
    private CrossTenantAccessPolicyInboundTrust inboundTrust;
    /**
     * Identifies whether the partner-specific configuration is a Cloud Service Provider for your organization.
     */
    private Boolean isServiceProvider;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The tenant identifier for the partner Azure AD organization. Read-only. Key.
     */
    private String tenantId;
    /**
     * Instantiates a new CrossTenantAccessPolicyConfigurationPartner and sets the default values.
     */
    public CrossTenantAccessPolicyConfigurationPartner() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CrossTenantAccessPolicyConfigurationPartner
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantAccessPolicyConfigurationPartner createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyConfigurationPartner();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the automaticUserConsentSettings property value. Determines the partner-specific configuration for automatic user consent settings. Unless specifically configured, the inboundAllowed and outboundAllowed properties are null and inherit from the default settings, which is always false.
     * @return a InboundOutboundPolicyConfiguration
     */
    @jakarta.annotation.Nullable
    public InboundOutboundPolicyConfiguration getAutomaticUserConsentSettings() {
        return this.automaticUserConsentSettings;
    }
    /**
     * Gets the b2bCollaborationInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Azure AD B2B collaboration.
     * @return a CrossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationInbound() {
        return this.b2bCollaborationInbound;
    }
    /**
     * Gets the b2bCollaborationOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration.
     * @return a CrossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bCollaborationOutbound() {
        return this.b2bCollaborationOutbound;
    }
    /**
     * Gets the b2bDirectConnectInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Azure B2B direct connect.
     * @return a CrossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectInbound() {
        return this.b2bDirectConnectInbound;
    }
    /**
     * Gets the b2bDirectConnectOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect.
     * @return a CrossTenantAccessPolicyB2BSetting
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyB2BSetting getB2bDirectConnectOutbound() {
        return this.b2bDirectConnectOutbound;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("automaticUserConsentSettings", (n) -> { this.setAutomaticUserConsentSettings(n.getObjectValue(InboundOutboundPolicyConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bCollaborationInbound", (n) -> { this.setB2bCollaborationInbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bCollaborationOutbound", (n) -> { this.setB2bCollaborationOutbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bDirectConnectInbound", (n) -> { this.setB2bDirectConnectInbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("b2bDirectConnectOutbound", (n) -> { this.setB2bDirectConnectOutbound(n.getObjectValue(CrossTenantAccessPolicyB2BSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("identitySynchronization", (n) -> { this.setIdentitySynchronization(n.getObjectValue(CrossTenantIdentitySyncPolicyPartner::createFromDiscriminatorValue)); });
        deserializerMap.put("inboundTrust", (n) -> { this.setInboundTrust(n.getObjectValue(CrossTenantAccessPolicyInboundTrust::createFromDiscriminatorValue)); });
        deserializerMap.put("isServiceProvider", (n) -> { this.setIsServiceProvider(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identitySynchronization property value. Defines the cross-tenant policy for the synchronization of users from a partner tenant. Use this user synchronization policy to streamline collaboration between users in a multitenant organization by automating the creation, update, and deletion of users from one tenant to another.
     * @return a CrossTenantIdentitySyncPolicyPartner
     */
    @jakarta.annotation.Nullable
    public CrossTenantIdentitySyncPolicyPartner getIdentitySynchronization() {
        return this.identitySynchronization;
    }
    /**
     * Gets the inboundTrust property value. Determines the partner-specific configuration for trusting other Conditional Access claims from external Azure AD organizations.
     * @return a CrossTenantAccessPolicyInboundTrust
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicyInboundTrust getInboundTrust() {
        return this.inboundTrust;
    }
    /**
     * Gets the isServiceProvider property value. Identifies whether the partner-specific configuration is a Cloud Service Provider for your organization.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsServiceProvider() {
        return this.isServiceProvider;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the tenantId property value. The tenant identifier for the partner Azure AD organization. Read-only. Key.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("automaticUserConsentSettings", this.getAutomaticUserConsentSettings());
        writer.writeObjectValue("b2bCollaborationInbound", this.getB2bCollaborationInbound());
        writer.writeObjectValue("b2bCollaborationOutbound", this.getB2bCollaborationOutbound());
        writer.writeObjectValue("b2bDirectConnectInbound", this.getB2bDirectConnectInbound());
        writer.writeObjectValue("b2bDirectConnectOutbound", this.getB2bDirectConnectOutbound());
        writer.writeObjectValue("identitySynchronization", this.getIdentitySynchronization());
        writer.writeObjectValue("inboundTrust", this.getInboundTrust());
        writer.writeBooleanValue("isServiceProvider", this.getIsServiceProvider());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the automaticUserConsentSettings property value. Determines the partner-specific configuration for automatic user consent settings. Unless specifically configured, the inboundAllowed and outboundAllowed properties are null and inherit from the default settings, which is always false.
     * @param value Value to set for the automaticUserConsentSettings property.
     */
    public void setAutomaticUserConsentSettings(@jakarta.annotation.Nullable final InboundOutboundPolicyConfiguration value) {
        this.automaticUserConsentSettings = value;
    }
    /**
     * Sets the b2bCollaborationInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Azure AD B2B collaboration.
     * @param value Value to set for the b2bCollaborationInbound property.
     */
    public void setB2bCollaborationInbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bCollaborationInbound = value;
    }
    /**
     * Sets the b2bCollaborationOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration.
     * @param value Value to set for the b2bCollaborationOutbound property.
     */
    public void setB2bCollaborationOutbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bCollaborationOutbound = value;
    }
    /**
     * Sets the b2bDirectConnectInbound property value. Defines your partner-specific configuration for users from other organizations accessing your resources via Azure B2B direct connect.
     * @param value Value to set for the b2bDirectConnectInbound property.
     */
    public void setB2bDirectConnectInbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bDirectConnectInbound = value;
    }
    /**
     * Sets the b2bDirectConnectOutbound property value. Defines your partner-specific configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect.
     * @param value Value to set for the b2bDirectConnectOutbound property.
     */
    public void setB2bDirectConnectOutbound(@jakarta.annotation.Nullable final CrossTenantAccessPolicyB2BSetting value) {
        this.b2bDirectConnectOutbound = value;
    }
    /**
     * Sets the identitySynchronization property value. Defines the cross-tenant policy for the synchronization of users from a partner tenant. Use this user synchronization policy to streamline collaboration between users in a multitenant organization by automating the creation, update, and deletion of users from one tenant to another.
     * @param value Value to set for the identitySynchronization property.
     */
    public void setIdentitySynchronization(@jakarta.annotation.Nullable final CrossTenantIdentitySyncPolicyPartner value) {
        this.identitySynchronization = value;
    }
    /**
     * Sets the inboundTrust property value. Determines the partner-specific configuration for trusting other Conditional Access claims from external Azure AD organizations.
     * @param value Value to set for the inboundTrust property.
     */
    public void setInboundTrust(@jakarta.annotation.Nullable final CrossTenantAccessPolicyInboundTrust value) {
        this.inboundTrust = value;
    }
    /**
     * Sets the isServiceProvider property value. Identifies whether the partner-specific configuration is a Cloud Service Provider for your organization.
     * @param value Value to set for the isServiceProvider property.
     */
    public void setIsServiceProvider(@jakarta.annotation.Nullable final Boolean value) {
        this.isServiceProvider = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the tenantId property value. The tenant identifier for the partner Azure AD organization. Read-only. Key.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}
