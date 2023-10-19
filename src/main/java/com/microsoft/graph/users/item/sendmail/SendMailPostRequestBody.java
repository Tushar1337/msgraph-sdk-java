package com.microsoft.graph.users.item.sendmail;

import com.microsoft.graph.models.Message;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendMailPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Message property
     */
    private Message message;
    /**
     * The SaveToSentItems property
     */
    private Boolean saveToSentItems;
    /**
     * Instantiates a new SendMailPostRequestBody and sets the default values.
     */
    public SendMailPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SendMailPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SendMailPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendMailPostRequestBody();
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
        deserializerMap.put("Message", (n) -> { this.setMessage(n.getObjectValue(Message::createFromDiscriminatorValue)); });
        deserializerMap.put("SaveToSentItems", (n) -> { this.setSaveToSentItems(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the Message property value. The Message property
     * @return a Message
     */
    @jakarta.annotation.Nullable
    public Message getMessage() {
        return this.message;
    }
    /**
     * Gets the SaveToSentItems property value. The SaveToSentItems property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSaveToSentItems() {
        return this.saveToSentItems;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("Message", this.getMessage());
        writer.writeBooleanValue("SaveToSentItems", this.getSaveToSentItems());
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
     * Sets the Message property value. The Message property
     * @param value Value to set for the Message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final Message value) {
        this.message = value;
    }
    /**
     * Sets the SaveToSentItems property value. The SaveToSentItems property
     * @param value Value to set for the SaveToSentItems property.
     */
    public void setSaveToSentItems(@jakarta.annotation.Nullable final Boolean value) {
        this.saveToSentItems = value;
    }
}
