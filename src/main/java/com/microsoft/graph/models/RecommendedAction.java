package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecommendedAction implements AdditionalDataHolder, Parsable {
    /**
     * Web URL to the recommended action.
     */
    private String actionWebUrl;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Potential improvement in the tenant security score from the recommended action.
     */
    private Double potentialScoreImpact;
    /**
     * Title of the recommended action.
     */
    private String title;
    /**
     * Instantiates a new RecommendedAction and sets the default values.
     */
    public RecommendedAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RecommendedAction
     */
    @jakarta.annotation.Nonnull
    public static RecommendedAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecommendedAction();
    }
    /**
     * Gets the actionWebUrl property value. Web URL to the recommended action.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getActionWebUrl() {
        return this.actionWebUrl;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("actionWebUrl", (n) -> { this.setActionWebUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("potentialScoreImpact", (n) -> { this.setPotentialScoreImpact(n.getDoubleValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
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
     * Gets the potentialScoreImpact property value. Potential improvement in the tenant security score from the recommended action.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getPotentialScoreImpact() {
        return this.potentialScoreImpact;
    }
    /**
     * Gets the title property value. Title of the recommended action.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionWebUrl", this.getActionWebUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeDoubleValue("potentialScoreImpact", this.getPotentialScoreImpact());
        writer.writeStringValue("title", this.getTitle());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionWebUrl property value. Web URL to the recommended action.
     * @param value Value to set for the actionWebUrl property.
     */
    public void setActionWebUrl(@jakarta.annotation.Nullable final String value) {
        this.actionWebUrl = value;
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
    /**
     * Sets the potentialScoreImpact property value. Potential improvement in the tenant security score from the recommended action.
     * @param value Value to set for the potentialScoreImpact property.
     */
    public void setPotentialScoreImpact(@jakarta.annotation.Nullable final Double value) {
        this.potentialScoreImpact = value;
    }
    /**
     * Sets the title property value. Title of the recommended action.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
