package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SolutionsRoot implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The bookingBusinesses property */
    private java.util.List<BookingBusiness> _bookingBusinesses;
    /** The bookingCurrencies property */
    private java.util.List<BookingCurrency> _bookingCurrencies;
    /**
     * Instantiates a new SolutionsRoot and sets the default values.
     * @return a void
     */
    public SolutionsRoot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SolutionsRoot
     */
    @javax.annotation.Nonnull
    public static SolutionsRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SolutionsRoot();
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
     * Gets the bookingBusinesses property value. The bookingBusinesses property
     * @return a bookingBusiness
     */
    @javax.annotation.Nullable
    public java.util.List<BookingBusiness> getBookingBusinesses() {
        return this._bookingBusinesses;
    }
    /**
     * Gets the bookingCurrencies property value. The bookingCurrencies property
     * @return a bookingCurrency
     */
    @javax.annotation.Nullable
    public java.util.List<BookingCurrency> getBookingCurrencies() {
        return this._bookingCurrencies;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SolutionsRoot currentObject = this;
        return new HashMap<>(2) {{
            this.put("bookingBusinesses", (n) -> { currentObject.setBookingBusinesses(n.getCollectionOfObjectValues(BookingBusiness::createFromDiscriminatorValue)); });
            this.put("bookingCurrencies", (n) -> { currentObject.setBookingCurrencies(n.getCollectionOfObjectValues(BookingCurrency::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("bookingBusinesses", this.getBookingBusinesses());
        writer.writeCollectionOfObjectValues("bookingCurrencies", this.getBookingCurrencies());
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
     * Sets the bookingBusinesses property value. The bookingBusinesses property
     * @param value Value to set for the bookingBusinesses property.
     * @return a void
     */
    public void setBookingBusinesses(@javax.annotation.Nullable final java.util.List<BookingBusiness> value) {
        this._bookingBusinesses = value;
    }
    /**
     * Sets the bookingCurrencies property value. The bookingCurrencies property
     * @param value Value to set for the bookingCurrencies property.
     * @return a void
     */
    public void setBookingCurrencies(@javax.annotation.Nullable final java.util.List<BookingCurrency> value) {
        this._bookingCurrencies = value;
    }
}
