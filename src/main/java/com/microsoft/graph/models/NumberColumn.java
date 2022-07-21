package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NumberColumn implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** How many decimal places to display. See below for information about the possible values. */
    private String _decimalPlaces;
    /** How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number. */
    private String _displayAs;
    /** The maximum permitted value. */
    private Double _maximum;
    /** The minimum permitted value. */
    private Double _minimum;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new numberColumn and sets the default values.
     * @return a void
     */
    public NumberColumn() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.numberColumn");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a numberColumn
     */
    @javax.annotation.Nonnull
    public static NumberColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NumberColumn();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the decimalPlaces property value. How many decimal places to display. See below for information about the possible values.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDecimalPlaces() {
        return this._decimalPlaces;
    }
    /**
     * Gets the displayAs property value. How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayAs() {
        return this._displayAs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final NumberColumn currentObject = this;
        return new HashMap<>(5) {{
            this.put("decimalPlaces", (n) -> { currentObject.setDecimalPlaces(n.getStringValue()); });
            this.put("displayAs", (n) -> { currentObject.setDisplayAs(n.getStringValue()); });
            this.put("maximum", (n) -> { currentObject.setMaximum(n.getDoubleValue()); });
            this.put("minimum", (n) -> { currentObject.setMinimum(n.getDoubleValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the maximum property value. The maximum permitted value.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMaximum() {
        return this._maximum;
    }
    /**
     * Gets the minimum property value. The minimum permitted value.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getMinimum() {
        return this._minimum;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("decimalPlaces", this.getDecimalPlaces());
        writer.writeStringValue("displayAs", this.getDisplayAs());
        writer.writeDoubleValue("maximum", this.getMaximum());
        writer.writeDoubleValue("minimum", this.getMinimum());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the decimalPlaces property value. How many decimal places to display. See below for information about the possible values.
     * @param value Value to set for the decimalPlaces property.
     * @return a void
     */
    public void setDecimalPlaces(@javax.annotation.Nullable final String value) {
        this._decimalPlaces = value;
    }
    /**
     * Sets the displayAs property value. How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number.
     * @param value Value to set for the displayAs property.
     * @return a void
     */
    public void setDisplayAs(@javax.annotation.Nullable final String value) {
        this._displayAs = value;
    }
    /**
     * Sets the maximum property value. The maximum permitted value.
     * @param value Value to set for the maximum property.
     * @return a void
     */
    public void setMaximum(@javax.annotation.Nullable final Double value) {
        this._maximum = value;
    }
    /**
     * Sets the minimum property value. The minimum permitted value.
     * @param value Value to set for the minimum property.
     * @return a void
     */
    public void setMinimum(@javax.annotation.Nullable final Double value) {
        this._minimum = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
