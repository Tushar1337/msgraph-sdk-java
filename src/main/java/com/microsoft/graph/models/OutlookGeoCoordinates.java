package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutlookGeoCoordinates implements AdditionalDataHolder, Parsable {
    /**
     * The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude and longitude are accurate to within 50 meters.
     */
    private Double accuracy;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The altitude of the location.
     */
    private Double altitude;
    /**
     * The accuracy of the altitude.
     */
    private Double altitudeAccuracy;
    /**
     * The latitude of the location.
     */
    private Double latitude;
    /**
     * The longitude of the location.
     */
    private Double longitude;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new OutlookGeoCoordinates and sets the default values.
     */
    public OutlookGeoCoordinates() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OutlookGeoCoordinates
     */
    @jakarta.annotation.Nonnull
    public static OutlookGeoCoordinates createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookGeoCoordinates();
    }
    /**
     * Gets the accuracy property value. The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude and longitude are accurate to within 50 meters.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getAccuracy() {
        return this.accuracy;
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
     * Gets the altitude property value. The altitude of the location.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getAltitude() {
        return this.altitude;
    }
    /**
     * Gets the altitudeAccuracy property value. The accuracy of the altitude.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getAltitudeAccuracy() {
        return this.altitudeAccuracy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("accuracy", (n) -> { this.setAccuracy(n.getDoubleValue()); });
        deserializerMap.put("altitude", (n) -> { this.setAltitude(n.getDoubleValue()); });
        deserializerMap.put("altitudeAccuracy", (n) -> { this.setAltitudeAccuracy(n.getDoubleValue()); });
        deserializerMap.put("latitude", (n) -> { this.setLatitude(n.getDoubleValue()); });
        deserializerMap.put("longitude", (n) -> { this.setLongitude(n.getDoubleValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the latitude property value. The latitude of the location.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getLatitude() {
        return this.latitude;
    }
    /**
     * Gets the longitude property value. The longitude of the location.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getLongitude() {
        return this.longitude;
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
        writer.writeDoubleValue("accuracy", this.getAccuracy());
        writer.writeDoubleValue("altitude", this.getAltitude());
        writer.writeDoubleValue("altitudeAccuracy", this.getAltitudeAccuracy());
        writer.writeDoubleValue("latitude", this.getLatitude());
        writer.writeDoubleValue("longitude", this.getLongitude());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accuracy property value. The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude and longitude are accurate to within 50 meters.
     * @param value Value to set for the accuracy property.
     */
    public void setAccuracy(@jakarta.annotation.Nullable final Double value) {
        this.accuracy = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the altitude property value. The altitude of the location.
     * @param value Value to set for the altitude property.
     */
    public void setAltitude(@jakarta.annotation.Nullable final Double value) {
        this.altitude = value;
    }
    /**
     * Sets the altitudeAccuracy property value. The accuracy of the altitude.
     * @param value Value to set for the altitudeAccuracy property.
     */
    public void setAltitudeAccuracy(@jakarta.annotation.Nullable final Double value) {
        this.altitudeAccuracy = value;
    }
    /**
     * Sets the latitude property value. The latitude of the location.
     * @param value Value to set for the latitude property.
     */
    public void setLatitude(@jakarta.annotation.Nullable final Double value) {
        this.latitude = value;
    }
    /**
     * Sets the longitude property value. The longitude of the location.
     * @param value Value to set for the longitude property.
     */
    public void setLongitude(@jakarta.annotation.Nullable final Double value) {
        this.longitude = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
