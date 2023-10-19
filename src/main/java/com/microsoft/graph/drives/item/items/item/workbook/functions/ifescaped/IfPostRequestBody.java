package com.microsoft.graph.drives.item.items.item.workbook.functions.ifescaped;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IfPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The logicalTest property
     */
    private Json logicalTest;
    /**
     * The valueIfFalse property
     */
    private Json valueIfFalse;
    /**
     * The valueIfTrue property
     */
    private Json valueIfTrue;
    /**
     * Instantiates a new IfPostRequestBody and sets the default values.
     */
    public IfPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IfPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static IfPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IfPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("logicalTest", (n) -> { this.setLogicalTest(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("valueIfFalse", (n) -> { this.setValueIfFalse(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("valueIfTrue", (n) -> { this.setValueIfTrue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the logicalTest property value. The logicalTest property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getLogicalTest() {
        return this.logicalTest;
    }
    /**
     * Gets the valueIfFalse property value. The valueIfFalse property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getValueIfFalse() {
        return this.valueIfFalse;
    }
    /**
     * Gets the valueIfTrue property value. The valueIfTrue property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getValueIfTrue() {
        return this.valueIfTrue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("logicalTest", this.getLogicalTest());
        writer.writeObjectValue("valueIfFalse", this.getValueIfFalse());
        writer.writeObjectValue("valueIfTrue", this.getValueIfTrue());
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
     * Sets the logicalTest property value. The logicalTest property
     * @param value Value to set for the logicalTest property.
     */
    public void setLogicalTest(@jakarta.annotation.Nullable final Json value) {
        this.logicalTest = value;
    }
    /**
     * Sets the valueIfFalse property value. The valueIfFalse property
     * @param value Value to set for the valueIfFalse property.
     */
    public void setValueIfFalse(@jakarta.annotation.Nullable final Json value) {
        this.valueIfFalse = value;
    }
    /**
     * Sets the valueIfTrue property value. The valueIfTrue property
     * @param value Value to set for the valueIfTrue property.
     */
    public void setValueIfTrue(@jakarta.annotation.Nullable final Json value) {
        this.valueIfTrue = value;
    }
}
