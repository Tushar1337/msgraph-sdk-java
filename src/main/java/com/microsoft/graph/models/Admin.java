package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Admin implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A container for service communications resources. Read-only. */
    private ServiceAnnouncement _serviceAnnouncement;
    /**
     * Instantiates a new Admin and sets the default values.
     * @return a void
     */
    public Admin() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Admin
     */
    @javax.annotation.Nonnull
    public static Admin createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Admin();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Admin currentObject = this;
        return new HashMap<>(1) {{
            this.put("serviceAnnouncement", (n) -> { currentObject.setServiceAnnouncement(n.getObjectValue(ServiceAnnouncement::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @return a serviceAnnouncement
     */
    @javax.annotation.Nullable
    public ServiceAnnouncement getServiceAnnouncement() {
        return this._serviceAnnouncement;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("serviceAnnouncement", this.getServiceAnnouncement());
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
     * Sets the serviceAnnouncement property value. A container for service communications resources. Read-only.
     * @param value Value to set for the serviceAnnouncement property.
     * @return a void
     */
    public void setServiceAnnouncement(@javax.annotation.Nullable final ServiceAnnouncement value) {
        this._serviceAnnouncement = value;
    }
}
