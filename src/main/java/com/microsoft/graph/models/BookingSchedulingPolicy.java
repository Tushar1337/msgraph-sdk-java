package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type represents the set of policies that dictate how bookings can be created in a Booking Calendar.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingSchedulingPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * True if to allow customers to choose a specific person for the booking.
     */
    private Boolean allowStaffSelection;
    /**
     * Maximum number of days in advance that a booking can be made. It follows the ISO 8601 format.
     */
    private PeriodAndDuration maximumAdvance;
    /**
     * The minimum amount of time before which bookings and cancellations must be made. It follows the ISO 8601 format.
     */
    private PeriodAndDuration minimumLeadTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * True to notify the business via email when a booking is created or changed. Use the email address specified in the email property of the bookingBusiness entity for the business.
     */
    private Boolean sendConfirmationsToOwner;
    /**
     * Duration of each time slot, denoted in ISO 8601 format.
     */
    private PeriodAndDuration timeSlotInterval;
    /**
     * Instantiates a new BookingSchedulingPolicy and sets the default values.
     */
    public BookingSchedulingPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingSchedulingPolicy
     */
    @jakarta.annotation.Nonnull
    public static BookingSchedulingPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingSchedulingPolicy();
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
     * Gets the allowStaffSelection property value. True if to allow customers to choose a specific person for the booking.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowStaffSelection() {
        return this.allowStaffSelection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowStaffSelection", (n) -> { this.setAllowStaffSelection(n.getBooleanValue()); });
        deserializerMap.put("maximumAdvance", (n) -> { this.setMaximumAdvance(n.getPeriodAndDurationValue()); });
        deserializerMap.put("minimumLeadTime", (n) -> { this.setMinimumLeadTime(n.getPeriodAndDurationValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sendConfirmationsToOwner", (n) -> { this.setSendConfirmationsToOwner(n.getBooleanValue()); });
        deserializerMap.put("timeSlotInterval", (n) -> { this.setTimeSlotInterval(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumAdvance property value. Maximum number of days in advance that a booking can be made. It follows the ISO 8601 format.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMaximumAdvance() {
        return this.maximumAdvance;
    }
    /**
     * Gets the minimumLeadTime property value. The minimum amount of time before which bookings and cancellations must be made. It follows the ISO 8601 format.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMinimumLeadTime() {
        return this.minimumLeadTime;
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
     * Gets the sendConfirmationsToOwner property value. True to notify the business via email when a booking is created or changed. Use the email address specified in the email property of the bookingBusiness entity for the business.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSendConfirmationsToOwner() {
        return this.sendConfirmationsToOwner;
    }
    /**
     * Gets the timeSlotInterval property value. Duration of each time slot, denoted in ISO 8601 format.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getTimeSlotInterval() {
        return this.timeSlotInterval;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowStaffSelection", this.getAllowStaffSelection());
        writer.writePeriodAndDurationValue("maximumAdvance", this.getMaximumAdvance());
        writer.writePeriodAndDurationValue("minimumLeadTime", this.getMinimumLeadTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("sendConfirmationsToOwner", this.getSendConfirmationsToOwner());
        writer.writePeriodAndDurationValue("timeSlotInterval", this.getTimeSlotInterval());
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
     * Sets the allowStaffSelection property value. True if to allow customers to choose a specific person for the booking.
     * @param value Value to set for the allowStaffSelection property.
     */
    public void setAllowStaffSelection(@jakarta.annotation.Nullable final Boolean value) {
        this.allowStaffSelection = value;
    }
    /**
     * Sets the maximumAdvance property value. Maximum number of days in advance that a booking can be made. It follows the ISO 8601 format.
     * @param value Value to set for the maximumAdvance property.
     */
    public void setMaximumAdvance(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.maximumAdvance = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the minimumLeadTime property value. The minimum amount of time before which bookings and cancellations must be made. It follows the ISO 8601 format.
     * @param value Value to set for the minimumLeadTime property.
     */
    public void setMinimumLeadTime(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.minimumLeadTime = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sendConfirmationsToOwner property value. True to notify the business via email when a booking is created or changed. Use the email address specified in the email property of the bookingBusiness entity for the business.
     * @param value Value to set for the sendConfirmationsToOwner property.
     */
    public void setSendConfirmationsToOwner(@jakarta.annotation.Nullable final Boolean value) {
        this.sendConfirmationsToOwner = value;
    }
    /**
     * Sets the timeSlotInterval property value. Duration of each time slot, denoted in ISO 8601 format.
     * @param value Value to set for the timeSlotInterval property.
     */
    public void setTimeSlotInterval(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.timeSlotInterval = PeriodAndDuration.ofPeriodAndDuration(value);
    }
}
