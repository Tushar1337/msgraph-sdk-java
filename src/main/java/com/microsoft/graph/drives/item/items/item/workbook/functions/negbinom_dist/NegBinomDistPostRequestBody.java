package com.microsoft.graph.drives.item.items.item.workbook.functions.negbinom_dist;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NegBinomDistPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new NegBinomDistPostRequestBody and sets the default values.
     */
    public NegBinomDistPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NegBinomDistPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static NegBinomDistPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NegBinomDistPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the cumulative property value. The cumulative property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getCumulative() {
        return this.backingStore.get("cumulative");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cumulative", (n) -> { this.setCumulative(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("numberF", (n) -> { this.setNumberF(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("numberS", (n) -> { this.setNumberS(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("probabilityS", (n) -> { this.setProbabilityS(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the numberF property value. The numberF property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNumberF() {
        return this.backingStore.get("numberF");
    }
    /**
     * Gets the numberS property value. The numberS property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNumberS() {
        return this.backingStore.get("numberS");
    }
    /**
     * Gets the probabilityS property value. The probabilityS property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getProbabilityS() {
        return this.backingStore.get("probabilityS");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cumulative", this.getCumulative());
        writer.writeObjectValue("numberF", this.getNumberF());
        writer.writeObjectValue("numberS", this.getNumberS());
        writer.writeObjectValue("probabilityS", this.getProbabilityS());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the cumulative property value. The cumulative property
     * @param value Value to set for the cumulative property.
     */
    public void setCumulative(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("cumulative", value);
    }
    /**
     * Sets the numberF property value. The numberF property
     * @param value Value to set for the numberF property.
     */
    public void setNumberF(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("numberF", value);
    }
    /**
     * Sets the numberS property value. The numberS property
     * @param value Value to set for the numberS property.
     */
    public void setNumberS(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("numberS", value);
    }
    /**
     * Sets the probabilityS property value. The probabilityS property
     * @param value Value to set for the probabilityS property.
     */
    public void setProbabilityS(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("probabilityS", value);
    }
}
