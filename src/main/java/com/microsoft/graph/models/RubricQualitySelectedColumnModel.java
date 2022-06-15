package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RubricQualitySelectedColumnModel implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** ID of the selected level for this quality. */
    private String _columnId;
    /** ID of the associated quality. */
    private String _qualityId;
    /**
     * Instantiates a new rubricQualitySelectedColumnModel and sets the default values.
     * @return a void
     */
    public RubricQualitySelectedColumnModel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a rubricQualitySelectedColumnModel
     */
    @javax.annotation.Nonnull
    public static RubricQualitySelectedColumnModel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RubricQualitySelectedColumnModel();
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
     * Gets the columnId property value. ID of the selected level for this quality.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getColumnId() {
        return this._columnId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RubricQualitySelectedColumnModel currentObject = this;
        return new HashMap<>(2) {{
            this.put("columnId", (n) -> { currentObject.setColumnId(n.getStringValue()); });
            this.put("qualityId", (n) -> { currentObject.setQualityId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the qualityId property value. ID of the associated quality.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQualityId() {
        return this._qualityId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("columnId", this.getColumnId());
        writer.writeStringValue("qualityId", this.getQualityId());
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
     * Sets the columnId property value. ID of the selected level for this quality.
     * @param value Value to set for the columnId property.
     * @return a void
     */
    public void setColumnId(@javax.annotation.Nullable final String value) {
        this._columnId = value;
    }
    /**
     * Sets the qualityId property value. ID of the associated quality.
     * @param value Value to set for the qualityId property.
     * @return a void
     */
    public void setQualityId(@javax.annotation.Nullable final String value) {
        this._qualityId = value;
    }
}
