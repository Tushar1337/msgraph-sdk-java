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
import com.microsoft.graph.models.AddIn;
import com.microsoft.graph.models.ApiApplication;
import com.microsoft.graph.models.AppRole;
import com.microsoft.graph.models.Certification;
import com.microsoft.graph.models.InformationalUrl;
import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.OptionalClaims;
import com.microsoft.graph.models.ParentalControlSettings;
import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.graph.models.PublicClientApplication;
import com.microsoft.graph.models.RequestSignatureVerification;
import com.microsoft.graph.models.RequiredResourceAccess;
import com.microsoft.graph.models.SpaApplication;
import com.microsoft.graph.models.VerifiedPublisher;
import com.microsoft.graph.models.WebApplication;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.Synchronization;
import com.microsoft.graph.requests.AppManagementPolicyCollectionPage;
import com.microsoft.graph.requests.ExtensionPropertyCollectionPage;
import com.microsoft.graph.requests.FederatedIdentityCredentialCollectionPage;
import com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionPage;
import com.microsoft.graph.requests.TokenIssuancePolicyCollectionPage;
import com.microsoft.graph.requests.TokenLifetimePolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application.
 */
public class Application extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Add Ins.
     * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Office 365 call the application in the context of a document the user is working on.
     */
    @SerializedName(value = "addIns", alternate = {"AddIns"})
    @Expose
	@Nullable
    public java.util.List<AddIn> addIns;

    /**
     * The Api.
     * Specifies settings for an application that implements a web API.
     */
    @SerializedName(value = "api", alternate = {"Api"})
    @Expose
	@Nullable
    public ApiApplication api;

    /**
     * The App Id.
     * The unique identifier for the application that is assigned to an application by Azure AD. Not nullable. Read-only. Supports $filter (eq).
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
	@Nullable
    public String appId;

    /**
     * The Application Template Id.
     * Unique identifier of the applicationTemplate. Supports $filter (eq, not, ne).
     */
    @SerializedName(value = "applicationTemplateId", alternate = {"ApplicationTemplateId"})
    @Expose
	@Nullable
    public String applicationTemplateId;

    /**
     * The App Roles.
     * The collection of roles defined for the application. With app role assignments, these roles can be assigned to users, groups, or service principals associated with other applications. Not nullable.
     */
    @SerializedName(value = "appRoles", alternate = {"AppRoles"})
    @Expose
	@Nullable
    public java.util.List<AppRole> appRoles;

    /**
     * The Certification.
     * Specifies the certification status of the application.
     */
    @SerializedName(value = "certification", alternate = {"Certification"})
    @Expose
	@Nullable
    public Certification certification;

    /**
     * The Created Date Time.
     * The date and time the application was registered. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.  Supports $filter (eq, ne, not, ge, le, in, and eq on null values) and $orderBy.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Default Redirect Uri.
     * 
     */
    @SerializedName(value = "defaultRedirectUri", alternate = {"DefaultRedirectUri"})
    @Expose
	@Nullable
    public String defaultRedirectUri;

    /**
     * The Description.
     * Free text field to provide a description of the application object to end users. The maximum allowed size is 1024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Disabled By Microsoft Status.
     * Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     */
    @SerializedName(value = "disabledByMicrosoftStatus", alternate = {"DisabledByMicrosoftStatus"})
    @Expose
	@Nullable
    public String disabledByMicrosoftStatus;

    /**
     * The Display Name.
     * The display name for the application. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Group Membership Claims.
     * Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this attribute, use one of the following valid string values: None, SecurityGroup (for security groups and Azure AD roles), All (this gets all of the security groups, distribution groups, and Azure AD directory roles that the signed-in user is a member of).
     */
    @SerializedName(value = "groupMembershipClaims", alternate = {"GroupMembershipClaims"})
    @Expose
	@Nullable
    public String groupMembershipClaims;

    /**
     * The Identifier Uris.
     * Also known as App ID URI, this value is set when an application is used as a resource app. The identifierUris acts as the prefix for the scopes you'll reference in your API's code, and it must be globally unique. You can use the default value provided, which is in the form api://&amp;lt;application-client-id&amp;gt;, or specify a more readable URI like https://contoso.com/api. For more information on valid identifierUris patterns and best practices, see Azure AD application registration security best practices. Not nullable. Supports $filter (eq, ne, ge, le, startsWith).
     */
    @SerializedName(value = "identifierUris", alternate = {"IdentifierUris"})
    @Expose
	@Nullable
    public java.util.List<String> identifierUris;

    /**
     * The Info.
     * Basic profile information of the application such as  app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     */
    @SerializedName(value = "info", alternate = {"Info"})
    @Expose
	@Nullable
    public InformationalUrl info;

    /**
     * The Is Device Only Auth Supported.
     * Specifies whether this application supports device authentication without a user. The default is false.
     */
    @SerializedName(value = "isDeviceOnlyAuthSupported", alternate = {"IsDeviceOnlyAuthSupported"})
    @Expose
	@Nullable
    public Boolean isDeviceOnlyAuthSupported;

    /**
     * The Is Fallback Public Client.
     * Specifies the fallback application type as public client, such as an installed application running on a mobile device. The default value is false which means the fallback application type is confidential client such as a web app. There are certain scenarios where Azure AD cannot determine the client application type. For example, the ROPC flow where it is configured without specifying a redirect URI. In those cases Azure AD interprets the application type based on the value of this property.
     */
    @SerializedName(value = "isFallbackPublicClient", alternate = {"IsFallbackPublicClient"})
    @Expose
	@Nullable
    public Boolean isFallbackPublicClient;

    /**
     * The Key Credentials.
     * The collection of key credentials associated with the application. Not nullable. Supports $filter (eq, not, ge, le).
     */
    @SerializedName(value = "keyCredentials", alternate = {"KeyCredentials"})
    @Expose
	@Nullable
    public java.util.List<KeyCredential> keyCredentials;

    /**
     * The Notes.
     * Notes relevant for the management of the application.
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
	@Nullable
    public String notes;

    /**
     * The Oauth2Require Post Response.
     * 
     */
    @SerializedName(value = "oauth2RequirePostResponse", alternate = {"Oauth2RequirePostResponse"})
    @Expose
	@Nullable
    public Boolean oauth2RequirePostResponse;

    /**
     * The Optional Claims.
     * Application developers can configure optional claims in their Azure AD applications to specify the claims that are sent to their application by the Microsoft security token service. For more information, see How to: Provide optional claims to your app.
     */
    @SerializedName(value = "optionalClaims", alternate = {"OptionalClaims"})
    @Expose
	@Nullable
    public OptionalClaims optionalClaims;

    /**
     * The Parental Control Settings.
     * Specifies parental control settings for an application.
     */
    @SerializedName(value = "parentalControlSettings", alternate = {"ParentalControlSettings"})
    @Expose
	@Nullable
    public ParentalControlSettings parentalControlSettings;

    /**
     * The Password Credentials.
     * The collection of password credentials associated with the application. Not nullable.
     */
    @SerializedName(value = "passwordCredentials", alternate = {"PasswordCredentials"})
    @Expose
	@Nullable
    public java.util.List<PasswordCredential> passwordCredentials;

    /**
     * The Public Client.
     * Specifies settings for installed clients such as desktop or mobile devices.
     */
    @SerializedName(value = "publicClient", alternate = {"PublicClient"})
    @Expose
	@Nullable
    public PublicClientApplication publicClient;

    /**
     * The Publisher Domain.
     * The verified publisher domain for the application. Read-only. For more information, see How to: Configure an application's publisher domain. Supports $filter (eq, ne, ge, le, startsWith).
     */
    @SerializedName(value = "publisherDomain", alternate = {"PublisherDomain"})
    @Expose
	@Nullable
    public String publisherDomain;

    /**
     * The Request Signature Verification.
     * Specifies whether this application requires Azure AD to verify the signed authentication requests.
     */
    @SerializedName(value = "requestSignatureVerification", alternate = {"RequestSignatureVerification"})
    @Expose
	@Nullable
    public RequestSignatureVerification requestSignatureVerification;

    /**
     * The Required Resource Access.
     * Specifies the resources that the application needs to access. This property also specifies the set of delegated permissions and application roles that it needs for each of those resources. This configuration of access to the required resources drives the consent experience. No more than 50 resource services (APIs) can be configured. Beginning mid-October 2021, the total number of required permissions must not exceed 400. For more information, see Limits on requested permissions per app. Not nullable. Supports $filter (eq, not, ge, le).
     */
    @SerializedName(value = "requiredResourceAccess", alternate = {"RequiredResourceAccess"})
    @Expose
	@Nullable
    public java.util.List<RequiredResourceAccess> requiredResourceAccess;

    /**
     * The Saml Metadata Url.
     * The URL where the service exposes SAML metadata for federation. This property is valid only for single-tenant applications. Nullable.
     */
    @SerializedName(value = "samlMetadataUrl", alternate = {"SamlMetadataUrl"})
    @Expose
	@Nullable
    public String samlMetadataUrl;

    /**
     * The Service Management Reference.
     * References application or service contact information from a Service or Asset Management database. Nullable.
     */
    @SerializedName(value = "serviceManagementReference", alternate = {"ServiceManagementReference"})
    @Expose
	@Nullable
    public String serviceManagementReference;

    /**
     * The Sign In Audience.
     * Specifies the Microsoft accounts that are supported for the current application. The possible values are: AzureADMyOrg, AzureADMultipleOrgs, AzureADandPersonalMicrosoftAccount (default), and PersonalMicrosoftAccount. See more in the table. The value of this object also limits the number of permissions an app can request. For more information, see Limits on requested permissions per app. The value for this property has implications on other app object properties. As a result, if you change this property, you may need to change other properties first. For more information, see Validation differences for signInAudience.Supports $filter (eq, ne, not).
     */
    @SerializedName(value = "signInAudience", alternate = {"SignInAudience"})
    @Expose
	@Nullable
    public String signInAudience;

    /**
     * The Spa.
     * Specifies settings for a single-page application, including sign out URLs and redirect URIs for authorization codes and access tokens.
     */
    @SerializedName(value = "spa", alternate = {"Spa"})
    @Expose
	@Nullable
    public SpaApplication spa;

    /**
     * The Tags.
     * Custom strings that can be used to categorize and identify the application. Not nullable. Strings added here will also appear in the tags property of any associated service principals.Supports $filter (eq, not, ge, le, startsWith) and $search.
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
	@Nullable
    public java.util.List<String> tags;

    /**
     * The Token Encryption Key Id.
     * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the tokens it emits by using the key this property points to. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     */
    @SerializedName(value = "tokenEncryptionKeyId", alternate = {"TokenEncryptionKeyId"})
    @Expose
	@Nullable
    public java.util.UUID tokenEncryptionKeyId;

    /**
     * The Verified Publisher.
     * Specifies the verified publisher of the application. For more information about how publisher verification helps support application security, trustworthiness, and compliance, see Publisher verification.
     */
    @SerializedName(value = "verifiedPublisher", alternate = {"VerifiedPublisher"})
    @Expose
	@Nullable
    public VerifiedPublisher verifiedPublisher;

    /**
     * The Web.
     * Specifies settings for a web application.
     */
    @SerializedName(value = "web", alternate = {"Web"})
    @Expose
	@Nullable
    public WebApplication web;

    /**
     * The App Management Policies.
     * The appManagementPolicy applied to this application.
     */
	@Nullable
    public com.microsoft.graph.requests.AppManagementPolicyCollectionPage appManagementPolicies;

    /**
     * The Created On Behalf Of.
     * Supports $filter (/$count eq 0, /$count ne 0). Read-only.
     */
    @SerializedName(value = "createdOnBehalfOf", alternate = {"CreatedOnBehalfOf"})
    @Expose
	@Nullable
    public DirectoryObject createdOnBehalfOf;

    /**
     * The Extension Properties.
     * Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0).
     */
    @SerializedName(value = "extensionProperties", alternate = {"ExtensionProperties"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ExtensionPropertyCollectionPage extensionProperties;

    /**
     * The Federated Identity Credentials.
     * Federated identities for applications. Supports $expand and $filter (startsWith, /$count eq 0, /$count ne 0).
     */
    @SerializedName(value = "federatedIdentityCredentials", alternate = {"FederatedIdentityCredentials"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.FederatedIdentityCredentialCollectionPage federatedIdentityCredentials;

    /**
     * The Home Realm Discovery Policies.
     * 
     */
	@Nullable
    public com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionPage homeRealmDiscoveryPolicies;

    /**
     * The Owners.
     * Directory objects that are owners of the application. Read-only. Nullable. Supports $expand, $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1), and $select nested in $expand.
     */
	@Nullable
    public com.microsoft.graph.requests.DirectoryObjectCollectionPage owners;

    /**
     * The Token Issuance Policies.
     * 
     */
	@Nullable
    public com.microsoft.graph.requests.TokenIssuancePolicyCollectionPage tokenIssuancePolicies;

    /**
     * The Token Lifetime Policies.
     * 
     */
	@Nullable
    public com.microsoft.graph.requests.TokenLifetimePolicyCollectionPage tokenLifetimePolicies;

    /**
     * The Synchronization.
     * Represents the capability for Azure Active Directory (Azure AD) identity synchronization through the Microsoft Graph API.
     */
    @SerializedName(value = "synchronization", alternate = {"Synchronization"})
    @Expose
	@Nullable
    public Synchronization synchronization;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("appManagementPolicies")) {
            appManagementPolicies = serializer.deserializeObject(json.get("appManagementPolicies"), com.microsoft.graph.requests.AppManagementPolicyCollectionPage.class);
        }

        if (json.has("extensionProperties")) {
            extensionProperties = serializer.deserializeObject(json.get("extensionProperties"), com.microsoft.graph.requests.ExtensionPropertyCollectionPage.class);
        }

        if (json.has("federatedIdentityCredentials")) {
            federatedIdentityCredentials = serializer.deserializeObject(json.get("federatedIdentityCredentials"), com.microsoft.graph.requests.FederatedIdentityCredentialCollectionPage.class);
        }

        if (json.has("homeRealmDiscoveryPolicies")) {
            homeRealmDiscoveryPolicies = serializer.deserializeObject(json.get("homeRealmDiscoveryPolicies"), com.microsoft.graph.requests.HomeRealmDiscoveryPolicyCollectionPage.class);
        }

        if (json.has("owners")) {
            owners = serializer.deserializeObject(json.get("owners"), com.microsoft.graph.requests.DirectoryObjectCollectionPage.class);
        }

        if (json.has("tokenIssuancePolicies")) {
            tokenIssuancePolicies = serializer.deserializeObject(json.get("tokenIssuancePolicies"), com.microsoft.graph.requests.TokenIssuancePolicyCollectionPage.class);
        }

        if (json.has("tokenLifetimePolicies")) {
            tokenLifetimePolicies = serializer.deserializeObject(json.get("tokenLifetimePolicies"), com.microsoft.graph.requests.TokenLifetimePolicyCollectionPage.class);
        }
    }
}
