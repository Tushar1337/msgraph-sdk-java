package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TimeConstraint implements AdditionalDataHolder, Parsable {
    /**
     * The nature of the activity, optional. The possible values are: work, personal, unrestricted, or unknown.
     */
    private ActivityDomain activityDomain;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The timeSlots property
     */
    private java.util.List<TimeSlot> timeSlots;
    /**
     * Instantiates a new TimeConstraint and sets the default values.
     */
    public TimeConstraint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TimeConstraint
     */
    @jakarta.annotation.Nonnull
    public static TimeConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeConstraint();
    }
    /**
     * Gets the activityDomain property value. The nature of the activity, optional. The possible values are: work, personal, unrestricted, or unknown.
     * @return a ActivityDomain
     */
    @jakarta.annotation.Nullable
    public ActivityDomain getActivityDomain() {
        return this.activityDomain;
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
        deserializerMap.put("activityDomain", (n) -> { this.setActivityDomain(n.getEnumValue(ActivityDomain.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("timeSlots", (n) -> { this.setTimeSlots(n.getCollectionOfObjectValues(TimeSlot::createFromDiscriminatorValue)); });
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
     * Gets the timeSlots property value. The timeSlots property
     * @return a java.util.List<TimeSlot>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TimeSlot> getTimeSlots() {
        return this.timeSlots;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("activityDomain", this.getActivityDomain());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("timeSlots", this.getTimeSlots());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityDomain property value. The nature of the activity, optional. The possible values are: work, personal, unrestricted, or unknown.
     * @param value Value to set for the activityDomain property.
     */
    public void setActivityDomain(@jakarta.annotation.Nullable final ActivityDomain value) {
        this.activityDomain = value;
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
     * Sets the timeSlots property value. The timeSlots property
     * @param value Value to set for the timeSlots property.
     */
    public void setTimeSlots(@jakarta.annotation.Nullable final java.util.List<TimeSlot> value) {
        this.timeSlots = value;
    }
}
