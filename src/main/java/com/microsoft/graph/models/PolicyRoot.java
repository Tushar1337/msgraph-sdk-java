package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PolicyRoot extends Entity implements Parsable {
    /** The policy that controls the idle time out for web sessions for applications. */
    private java.util.List<ActivityBasedTimeoutPolicy> _activityBasedTimeoutPolicies;
    /** The policy by which consent requests are created and managed for the entire tenant. */
    private AdminConsentRequestPolicy _adminConsentRequestPolicy;
    /** The policy configuration of the self-service sign-up experience of external users. */
    private AuthenticationFlowsPolicy _authenticationFlowsPolicy;
    /** The authentication methods and the users that are allowed to use them to sign in and perform multi-factor authentication (MFA) in Azure Active Directory (Azure AD). */
    private AuthenticationMethodsPolicy _authenticationMethodsPolicy;
    /** The policy that controls Azure AD authorization settings. */
    private AuthorizationPolicy _authorizationPolicy;
    /** The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application. */
    private java.util.List<ClaimsMappingPolicy> _claimsMappingPolicies;
    /** The custom rules that define an access scenario. */
    private java.util.List<ConditionalAccessPolicy> _conditionalAccessPolicies;
    /** The custom rules that define an access scenario when interacting with external Azure AD tenants. */
    private CrossTenantAccessPolicy _crossTenantAccessPolicy;
    /** The feature rollout policy associated with a directory object. */
    private java.util.List<FeatureRolloutPolicy> _featureRolloutPolicies;
    /** The policy to control Azure AD authentication behavior for federated users. */
    private java.util.List<HomeRealmDiscoveryPolicy> _homeRealmDiscoveryPolicies;
    /** The policy that represents the security defaults that protect against common attacks. */
    private IdentitySecurityDefaultsEnforcementPolicy _identitySecurityDefaultsEnforcementPolicy;
    /** The policy that specifies the conditions under which consent can be granted. */
    private java.util.List<PermissionGrantPolicy> _permissionGrantPolicies;
    /** Represents the role management policies. */
    private java.util.List<UnifiedRoleManagementPolicy> _roleManagementPolicies;
    /** Represents the role management policy assignments. */
    private java.util.List<UnifiedRoleManagementPolicyAssignment> _roleManagementPolicyAssignments;
    /** The policy that specifies the characteristics of SAML tokens issued by Azure AD. */
    private java.util.List<TokenIssuancePolicy> _tokenIssuancePolicies;
    /** The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD. */
    private java.util.List<TokenLifetimePolicy> _tokenLifetimePolicies;
    /**
     * Instantiates a new PolicyRoot and sets the default values.
     * @return a void
     */
    public PolicyRoot() {
        super();
        this.setOdataType("#microsoft.graph.policyRoot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PolicyRoot
     */
    @javax.annotation.Nonnull
    public static PolicyRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyRoot();
    }
    /**
     * Gets the activityBasedTimeoutPolicies property value. The policy that controls the idle time out for web sessions for applications.
     * @return a activityBasedTimeoutPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ActivityBasedTimeoutPolicy> getActivityBasedTimeoutPolicies() {
        return this._activityBasedTimeoutPolicies;
    }
    /**
     * Gets the adminConsentRequestPolicy property value. The policy by which consent requests are created and managed for the entire tenant.
     * @return a adminConsentRequestPolicy
     */
    @javax.annotation.Nullable
    public AdminConsentRequestPolicy getAdminConsentRequestPolicy() {
        return this._adminConsentRequestPolicy;
    }
    /**
     * Gets the authenticationFlowsPolicy property value. The policy configuration of the self-service sign-up experience of external users.
     * @return a authenticationFlowsPolicy
     */
    @javax.annotation.Nullable
    public AuthenticationFlowsPolicy getAuthenticationFlowsPolicy() {
        return this._authenticationFlowsPolicy;
    }
    /**
     * Gets the authenticationMethodsPolicy property value. The authentication methods and the users that are allowed to use them to sign in and perform multi-factor authentication (MFA) in Azure Active Directory (Azure AD).
     * @return a authenticationMethodsPolicy
     */
    @javax.annotation.Nullable
    public AuthenticationMethodsPolicy getAuthenticationMethodsPolicy() {
        return this._authenticationMethodsPolicy;
    }
    /**
     * Gets the authorizationPolicy property value. The policy that controls Azure AD authorization settings.
     * @return a authorizationPolicy
     */
    @javax.annotation.Nullable
    public AuthorizationPolicy getAuthorizationPolicy() {
        return this._authorizationPolicy;
    }
    /**
     * Gets the claimsMappingPolicies property value. The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     * @return a claimsMappingPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ClaimsMappingPolicy> getClaimsMappingPolicies() {
        return this._claimsMappingPolicies;
    }
    /**
     * Gets the conditionalAccessPolicies property value. The custom rules that define an access scenario.
     * @return a conditionalAccessPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ConditionalAccessPolicy> getConditionalAccessPolicies() {
        return this._conditionalAccessPolicies;
    }
    /**
     * Gets the crossTenantAccessPolicy property value. The custom rules that define an access scenario when interacting with external Azure AD tenants.
     * @return a crossTenantAccessPolicy
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicy getCrossTenantAccessPolicy() {
        return this._crossTenantAccessPolicy;
    }
    /**
     * Gets the featureRolloutPolicies property value. The feature rollout policy associated with a directory object.
     * @return a featureRolloutPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<FeatureRolloutPolicy> getFeatureRolloutPolicies() {
        return this._featureRolloutPolicies;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PolicyRoot currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activityBasedTimeoutPolicies", (n) -> { currentObject.setActivityBasedTimeoutPolicies(n.getCollectionOfObjectValues(ActivityBasedTimeoutPolicy::createFromDiscriminatorValue)); });
            this.put("adminConsentRequestPolicy", (n) -> { currentObject.setAdminConsentRequestPolicy(n.getObjectValue(AdminConsentRequestPolicy::createFromDiscriminatorValue)); });
            this.put("authenticationFlowsPolicy", (n) -> { currentObject.setAuthenticationFlowsPolicy(n.getObjectValue(AuthenticationFlowsPolicy::createFromDiscriminatorValue)); });
            this.put("authenticationMethodsPolicy", (n) -> { currentObject.setAuthenticationMethodsPolicy(n.getObjectValue(AuthenticationMethodsPolicy::createFromDiscriminatorValue)); });
            this.put("authorizationPolicy", (n) -> { currentObject.setAuthorizationPolicy(n.getObjectValue(AuthorizationPolicy::createFromDiscriminatorValue)); });
            this.put("claimsMappingPolicies", (n) -> { currentObject.setClaimsMappingPolicies(n.getCollectionOfObjectValues(ClaimsMappingPolicy::createFromDiscriminatorValue)); });
            this.put("conditionalAccessPolicies", (n) -> { currentObject.setConditionalAccessPolicies(n.getCollectionOfObjectValues(ConditionalAccessPolicy::createFromDiscriminatorValue)); });
            this.put("crossTenantAccessPolicy", (n) -> { currentObject.setCrossTenantAccessPolicy(n.getObjectValue(CrossTenantAccessPolicy::createFromDiscriminatorValue)); });
            this.put("featureRolloutPolicies", (n) -> { currentObject.setFeatureRolloutPolicies(n.getCollectionOfObjectValues(FeatureRolloutPolicy::createFromDiscriminatorValue)); });
            this.put("homeRealmDiscoveryPolicies", (n) -> { currentObject.setHomeRealmDiscoveryPolicies(n.getCollectionOfObjectValues(HomeRealmDiscoveryPolicy::createFromDiscriminatorValue)); });
            this.put("identitySecurityDefaultsEnforcementPolicy", (n) -> { currentObject.setIdentitySecurityDefaultsEnforcementPolicy(n.getObjectValue(IdentitySecurityDefaultsEnforcementPolicy::createFromDiscriminatorValue)); });
            this.put("permissionGrantPolicies", (n) -> { currentObject.setPermissionGrantPolicies(n.getCollectionOfObjectValues(PermissionGrantPolicy::createFromDiscriminatorValue)); });
            this.put("roleManagementPolicies", (n) -> { currentObject.setRoleManagementPolicies(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicy::createFromDiscriminatorValue)); });
            this.put("roleManagementPolicyAssignments", (n) -> { currentObject.setRoleManagementPolicyAssignments(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicyAssignment::createFromDiscriminatorValue)); });
            this.put("tokenIssuancePolicies", (n) -> { currentObject.setTokenIssuancePolicies(n.getCollectionOfObjectValues(TokenIssuancePolicy::createFromDiscriminatorValue)); });
            this.put("tokenLifetimePolicies", (n) -> { currentObject.setTokenLifetimePolicies(n.getCollectionOfObjectValues(TokenLifetimePolicy::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The policy to control Azure AD authentication behavior for federated users.
     * @return a homeRealmDiscoveryPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this._homeRealmDiscoveryPolicies;
    }
    /**
     * Gets the identitySecurityDefaultsEnforcementPolicy property value. The policy that represents the security defaults that protect against common attacks.
     * @return a identitySecurityDefaultsEnforcementPolicy
     */
    @javax.annotation.Nullable
    public IdentitySecurityDefaultsEnforcementPolicy getIdentitySecurityDefaultsEnforcementPolicy() {
        return this._identitySecurityDefaultsEnforcementPolicy;
    }
    /**
     * Gets the permissionGrantPolicies property value. The policy that specifies the conditions under which consent can be granted.
     * @return a permissionGrantPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<PermissionGrantPolicy> getPermissionGrantPolicies() {
        return this._permissionGrantPolicies;
    }
    /**
     * Gets the roleManagementPolicies property value. Represents the role management policies.
     * @return a unifiedRoleManagementPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicy> getRoleManagementPolicies() {
        return this._roleManagementPolicies;
    }
    /**
     * Gets the roleManagementPolicyAssignments property value. Represents the role management policy assignments.
     * @return a unifiedRoleManagementPolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicyAssignment> getRoleManagementPolicyAssignments() {
        return this._roleManagementPolicyAssignments;
    }
    /**
     * Gets the tokenIssuancePolicies property value. The policy that specifies the characteristics of SAML tokens issued by Azure AD.
     * @return a tokenIssuancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this._tokenIssuancePolicies;
    }
    /**
     * Gets the tokenLifetimePolicies property value. The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
     * @return a tokenLifetimePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this._tokenLifetimePolicies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("activityBasedTimeoutPolicies", this.getActivityBasedTimeoutPolicies());
        writer.writeObjectValue("adminConsentRequestPolicy", this.getAdminConsentRequestPolicy());
        writer.writeObjectValue("authenticationFlowsPolicy", this.getAuthenticationFlowsPolicy());
        writer.writeObjectValue("authenticationMethodsPolicy", this.getAuthenticationMethodsPolicy());
        writer.writeObjectValue("authorizationPolicy", this.getAuthorizationPolicy());
        writer.writeCollectionOfObjectValues("claimsMappingPolicies", this.getClaimsMappingPolicies());
        writer.writeCollectionOfObjectValues("conditionalAccessPolicies", this.getConditionalAccessPolicies());
        writer.writeObjectValue("crossTenantAccessPolicy", this.getCrossTenantAccessPolicy());
        writer.writeCollectionOfObjectValues("featureRolloutPolicies", this.getFeatureRolloutPolicies());
        writer.writeCollectionOfObjectValues("homeRealmDiscoveryPolicies", this.getHomeRealmDiscoveryPolicies());
        writer.writeObjectValue("identitySecurityDefaultsEnforcementPolicy", this.getIdentitySecurityDefaultsEnforcementPolicy());
        writer.writeCollectionOfObjectValues("permissionGrantPolicies", this.getPermissionGrantPolicies());
        writer.writeCollectionOfObjectValues("roleManagementPolicies", this.getRoleManagementPolicies());
        writer.writeCollectionOfObjectValues("roleManagementPolicyAssignments", this.getRoleManagementPolicyAssignments());
        writer.writeCollectionOfObjectValues("tokenIssuancePolicies", this.getTokenIssuancePolicies());
        writer.writeCollectionOfObjectValues("tokenLifetimePolicies", this.getTokenLifetimePolicies());
    }
    /**
     * Sets the activityBasedTimeoutPolicies property value. The policy that controls the idle time out for web sessions for applications.
     * @param value Value to set for the activityBasedTimeoutPolicies property.
     * @return a void
     */
    public void setActivityBasedTimeoutPolicies(@javax.annotation.Nullable final java.util.List<ActivityBasedTimeoutPolicy> value) {
        this._activityBasedTimeoutPolicies = value;
    }
    /**
     * Sets the adminConsentRequestPolicy property value. The policy by which consent requests are created and managed for the entire tenant.
     * @param value Value to set for the adminConsentRequestPolicy property.
     * @return a void
     */
    public void setAdminConsentRequestPolicy(@javax.annotation.Nullable final AdminConsentRequestPolicy value) {
        this._adminConsentRequestPolicy = value;
    }
    /**
     * Sets the authenticationFlowsPolicy property value. The policy configuration of the self-service sign-up experience of external users.
     * @param value Value to set for the authenticationFlowsPolicy property.
     * @return a void
     */
    public void setAuthenticationFlowsPolicy(@javax.annotation.Nullable final AuthenticationFlowsPolicy value) {
        this._authenticationFlowsPolicy = value;
    }
    /**
     * Sets the authenticationMethodsPolicy property value. The authentication methods and the users that are allowed to use them to sign in and perform multi-factor authentication (MFA) in Azure Active Directory (Azure AD).
     * @param value Value to set for the authenticationMethodsPolicy property.
     * @return a void
     */
    public void setAuthenticationMethodsPolicy(@javax.annotation.Nullable final AuthenticationMethodsPolicy value) {
        this._authenticationMethodsPolicy = value;
    }
    /**
     * Sets the authorizationPolicy property value. The policy that controls Azure AD authorization settings.
     * @param value Value to set for the authorizationPolicy property.
     * @return a void
     */
    public void setAuthorizationPolicy(@javax.annotation.Nullable final AuthorizationPolicy value) {
        this._authorizationPolicy = value;
    }
    /**
     * Sets the claimsMappingPolicies property value. The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     * @param value Value to set for the claimsMappingPolicies property.
     * @return a void
     */
    public void setClaimsMappingPolicies(@javax.annotation.Nullable final java.util.List<ClaimsMappingPolicy> value) {
        this._claimsMappingPolicies = value;
    }
    /**
     * Sets the conditionalAccessPolicies property value. The custom rules that define an access scenario.
     * @param value Value to set for the conditionalAccessPolicies property.
     * @return a void
     */
    public void setConditionalAccessPolicies(@javax.annotation.Nullable final java.util.List<ConditionalAccessPolicy> value) {
        this._conditionalAccessPolicies = value;
    }
    /**
     * Sets the crossTenantAccessPolicy property value. The custom rules that define an access scenario when interacting with external Azure AD tenants.
     * @param value Value to set for the crossTenantAccessPolicy property.
     * @return a void
     */
    public void setCrossTenantAccessPolicy(@javax.annotation.Nullable final CrossTenantAccessPolicy value) {
        this._crossTenantAccessPolicy = value;
    }
    /**
     * Sets the featureRolloutPolicies property value. The feature rollout policy associated with a directory object.
     * @param value Value to set for the featureRolloutPolicies property.
     * @return a void
     */
    public void setFeatureRolloutPolicies(@javax.annotation.Nullable final java.util.List<FeatureRolloutPolicy> value) {
        this._featureRolloutPolicies = value;
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The policy to control Azure AD authentication behavior for federated users.
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     * @return a void
     */
    public void setHomeRealmDiscoveryPolicies(@javax.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this._homeRealmDiscoveryPolicies = value;
    }
    /**
     * Sets the identitySecurityDefaultsEnforcementPolicy property value. The policy that represents the security defaults that protect against common attacks.
     * @param value Value to set for the identitySecurityDefaultsEnforcementPolicy property.
     * @return a void
     */
    public void setIdentitySecurityDefaultsEnforcementPolicy(@javax.annotation.Nullable final IdentitySecurityDefaultsEnforcementPolicy value) {
        this._identitySecurityDefaultsEnforcementPolicy = value;
    }
    /**
     * Sets the permissionGrantPolicies property value. The policy that specifies the conditions under which consent can be granted.
     * @param value Value to set for the permissionGrantPolicies property.
     * @return a void
     */
    public void setPermissionGrantPolicies(@javax.annotation.Nullable final java.util.List<PermissionGrantPolicy> value) {
        this._permissionGrantPolicies = value;
    }
    /**
     * Sets the roleManagementPolicies property value. Represents the role management policies.
     * @param value Value to set for the roleManagementPolicies property.
     * @return a void
     */
    public void setRoleManagementPolicies(@javax.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicy> value) {
        this._roleManagementPolicies = value;
    }
    /**
     * Sets the roleManagementPolicyAssignments property value. Represents the role management policy assignments.
     * @param value Value to set for the roleManagementPolicyAssignments property.
     * @return a void
     */
    public void setRoleManagementPolicyAssignments(@javax.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicyAssignment> value) {
        this._roleManagementPolicyAssignments = value;
    }
    /**
     * Sets the tokenIssuancePolicies property value. The policy that specifies the characteristics of SAML tokens issued by Azure AD.
     * @param value Value to set for the tokenIssuancePolicies property.
     * @return a void
     */
    public void setTokenIssuancePolicies(@javax.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this._tokenIssuancePolicies = value;
    }
    /**
     * Sets the tokenLifetimePolicies property value. The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
     * @param value Value to set for the tokenLifetimePolicies property.
     * @return a void
     */
    public void setTokenLifetimePolicies(@javax.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this._tokenLifetimePolicies = value;
    }
}
