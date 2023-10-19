package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Agreement extends Entity implements Parsable {
    /**
     * Read-only. Information about acceptances of this agreement.
     */
    private java.util.List<AgreementAcceptance> acceptances;
    /**
     * Display name of the agreement. The display name is used for internal tracking of the agreement but is not shown to end users who view the agreement. Supports $filter (eq).
     */
    private String displayName;
    /**
     * Default PDF linked to this agreement.
     */
    private AgreementFile file;
    /**
     * PDFs linked to this agreement. This property is in the process of being deprecated. Use the  file property instead. Supports $expand.
     */
    private java.util.List<AgreementFileLocalization> files;
    /**
     * Indicates whether end users are required to accept this agreement on every device that they access it from. The end user is required to register their device in Azure AD, if they haven't already done so. Supports $filter (eq).
     */
    private Boolean isPerDeviceAcceptanceRequired;
    /**
     * Indicates whether the user has to expand the agreement before accepting. Supports $filter (eq).
     */
    private Boolean isViewingBeforeAcceptanceRequired;
    /**
     * Expiration schedule and frequency of agreement for all users. Supports $filter (eq).
     */
    private TermsExpiration termsExpiration;
    /**
     * The duration after which the user must re-accept the terms of use. The value is represented in ISO 8601 format for durations. Supports $filter (eq).
     */
    private PeriodAndDuration userReacceptRequiredFrequency;
    /**
     * Instantiates a new Agreement and sets the default values.
     */
    public Agreement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Agreement
     */
    @jakarta.annotation.Nonnull
    public static Agreement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Agreement();
    }
    /**
     * Gets the acceptances property value. Read-only. Information about acceptances of this agreement.
     * @return a java.util.List<AgreementAcceptance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgreementAcceptance> getAcceptances() {
        return this.acceptances;
    }
    /**
     * Gets the displayName property value. Display name of the agreement. The display name is used for internal tracking of the agreement but is not shown to end users who view the agreement. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acceptances", (n) -> { this.setAcceptances(n.getCollectionOfObjectValues(AgreementAcceptance::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("file", (n) -> { this.setFile(n.getObjectValue(AgreementFile::createFromDiscriminatorValue)); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(AgreementFileLocalization::createFromDiscriminatorValue)); });
        deserializerMap.put("isPerDeviceAcceptanceRequired", (n) -> { this.setIsPerDeviceAcceptanceRequired(n.getBooleanValue()); });
        deserializerMap.put("isViewingBeforeAcceptanceRequired", (n) -> { this.setIsViewingBeforeAcceptanceRequired(n.getBooleanValue()); });
        deserializerMap.put("termsExpiration", (n) -> { this.setTermsExpiration(n.getObjectValue(TermsExpiration::createFromDiscriminatorValue)); });
        deserializerMap.put("userReacceptRequiredFrequency", (n) -> { this.setUserReacceptRequiredFrequency(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file property value. Default PDF linked to this agreement.
     * @return a AgreementFile
     */
    @jakarta.annotation.Nullable
    public AgreementFile getFile() {
        return this.file;
    }
    /**
     * Gets the files property value. PDFs linked to this agreement. This property is in the process of being deprecated. Use the  file property instead. Supports $expand.
     * @return a java.util.List<AgreementFileLocalization>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgreementFileLocalization> getFiles() {
        return this.files;
    }
    /**
     * Gets the isPerDeviceAcceptanceRequired property value. Indicates whether end users are required to accept this agreement on every device that they access it from. The end user is required to register their device in Azure AD, if they haven't already done so. Supports $filter (eq).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPerDeviceAcceptanceRequired() {
        return this.isPerDeviceAcceptanceRequired;
    }
    /**
     * Gets the isViewingBeforeAcceptanceRequired property value. Indicates whether the user has to expand the agreement before accepting. Supports $filter (eq).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsViewingBeforeAcceptanceRequired() {
        return this.isViewingBeforeAcceptanceRequired;
    }
    /**
     * Gets the termsExpiration property value. Expiration schedule and frequency of agreement for all users. Supports $filter (eq).
     * @return a TermsExpiration
     */
    @jakarta.annotation.Nullable
    public TermsExpiration getTermsExpiration() {
        return this.termsExpiration;
    }
    /**
     * Gets the userReacceptRequiredFrequency property value. The duration after which the user must re-accept the terms of use. The value is represented in ISO 8601 format for durations. Supports $filter (eq).
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getUserReacceptRequiredFrequency() {
        return this.userReacceptRequiredFrequency;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acceptances", this.getAcceptances());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("file", this.getFile());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeBooleanValue("isPerDeviceAcceptanceRequired", this.getIsPerDeviceAcceptanceRequired());
        writer.writeBooleanValue("isViewingBeforeAcceptanceRequired", this.getIsViewingBeforeAcceptanceRequired());
        writer.writeObjectValue("termsExpiration", this.getTermsExpiration());
        writer.writePeriodAndDurationValue("userReacceptRequiredFrequency", this.getUserReacceptRequiredFrequency());
    }
    /**
     * Sets the acceptances property value. Read-only. Information about acceptances of this agreement.
     * @param value Value to set for the acceptances property.
     */
    public void setAcceptances(@jakarta.annotation.Nullable final java.util.List<AgreementAcceptance> value) {
        this.acceptances = value;
    }
    /**
     * Sets the displayName property value. Display name of the agreement. The display name is used for internal tracking of the agreement but is not shown to end users who view the agreement. Supports $filter (eq).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the file property value. Default PDF linked to this agreement.
     * @param value Value to set for the file property.
     */
    public void setFile(@jakarta.annotation.Nullable final AgreementFile value) {
        this.file = value;
    }
    /**
     * Sets the files property value. PDFs linked to this agreement. This property is in the process of being deprecated. Use the  file property instead. Supports $expand.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<AgreementFileLocalization> value) {
        this.files = value;
    }
    /**
     * Sets the isPerDeviceAcceptanceRequired property value. Indicates whether end users are required to accept this agreement on every device that they access it from. The end user is required to register their device in Azure AD, if they haven't already done so. Supports $filter (eq).
     * @param value Value to set for the isPerDeviceAcceptanceRequired property.
     */
    public void setIsPerDeviceAcceptanceRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.isPerDeviceAcceptanceRequired = value;
    }
    /**
     * Sets the isViewingBeforeAcceptanceRequired property value. Indicates whether the user has to expand the agreement before accepting. Supports $filter (eq).
     * @param value Value to set for the isViewingBeforeAcceptanceRequired property.
     */
    public void setIsViewingBeforeAcceptanceRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.isViewingBeforeAcceptanceRequired = value;
    }
    /**
     * Sets the termsExpiration property value. Expiration schedule and frequency of agreement for all users. Supports $filter (eq).
     * @param value Value to set for the termsExpiration property.
     */
    public void setTermsExpiration(@jakarta.annotation.Nullable final TermsExpiration value) {
        this.termsExpiration = value;
    }
    /**
     * Sets the userReacceptRequiredFrequency property value. The duration after which the user must re-accept the terms of use. The value is represented in ISO 8601 format for durations. Supports $filter (eq).
     * @param value Value to set for the userReacceptRequiredFrequency property.
     */
    public void setUserReacceptRequiredFrequency(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.userReacceptRequiredFrequency = PeriodAndDuration.ofPeriodAndDuration(value);
    }
}
