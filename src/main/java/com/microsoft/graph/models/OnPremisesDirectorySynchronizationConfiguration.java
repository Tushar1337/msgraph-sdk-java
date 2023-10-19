package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPremisesDirectorySynchronizationConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Contains the accidental deletion prevention configuration for a tenant.
     */
    private OnPremisesAccidentalDeletionPrevention accidentalDeletionPrevention;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new OnPremisesDirectorySynchronizationConfiguration and sets the default values.
     */
    public OnPremisesDirectorySynchronizationConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnPremisesDirectorySynchronizationConfiguration
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesDirectorySynchronizationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesDirectorySynchronizationConfiguration();
    }
    /**
     * Gets the accidentalDeletionPrevention property value. Contains the accidental deletion prevention configuration for a tenant.
     * @return a OnPremisesAccidentalDeletionPrevention
     */
    @jakarta.annotation.Nullable
    public OnPremisesAccidentalDeletionPrevention getAccidentalDeletionPrevention() {
        return this.accidentalDeletionPrevention;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("accidentalDeletionPrevention", (n) -> { this.setAccidentalDeletionPrevention(n.getObjectValue(OnPremisesAccidentalDeletionPrevention::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accidentalDeletionPrevention", this.getAccidentalDeletionPrevention());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accidentalDeletionPrevention property value. Contains the accidental deletion prevention configuration for a tenant.
     * @param value Value to set for the accidentalDeletionPrevention property.
     */
    public void setAccidentalDeletionPrevention(@jakarta.annotation.Nullable final OnPremisesAccidentalDeletionPrevention value) {
        this.accidentalDeletionPrevention = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
