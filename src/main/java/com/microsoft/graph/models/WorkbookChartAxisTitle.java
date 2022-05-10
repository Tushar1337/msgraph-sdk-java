package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartAxisTitle extends Entity implements Parsable {
    /** Represents the formatting of chart axis title. Read-only. */
    private WorkbookChartAxisTitleFormat _format;
    /** Represents the axis title. */
    private String _text;
    /** A boolean that specifies the visibility of an axis title. */
    private Boolean _visible;
    /**
     * Instantiates a new workbookChartAxisTitle and sets the default values.
     * @return a void
     */
    public WorkbookChartAxisTitle() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartAxisTitle
     */
    @javax.annotation.Nonnull
    public static WorkbookChartAxisTitle createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartAxisTitle();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartAxisTitle currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("format", (n) -> { currentObject.setFormat(n.getObjectValue(WorkbookChartAxisTitleFormat::createFromDiscriminatorValue)); });
            this.put("text", (n) -> { currentObject.setText(n.getStringValue()); });
            this.put("visible", (n) -> { currentObject.setVisible(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the format property value. Represents the formatting of chart axis title. Read-only.
     * @return a workbookChartAxisTitleFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartAxisTitleFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the text property value. Represents the axis title.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getText() {
        return this._text;
    }
    /**
     * Gets the visible property value. A boolean that specifies the visibility of an axis title.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVisible() {
        return this._visible;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("format", this.getFormat());
        writer.writeStringValue("text", this.getText());
        writer.writeBooleanValue("visible", this.getVisible());
    }
    /**
     * Sets the format property value. Represents the formatting of chart axis title. Read-only.
     * @param value Value to set for the format property.
     * @return a void
     */
    public void setFormat(@javax.annotation.Nullable final WorkbookChartAxisTitleFormat value) {
        this._format = value;
    }
    /**
     * Sets the text property value. Represents the axis title.
     * @param value Value to set for the text property.
     * @return a void
     */
    public void setText(@javax.annotation.Nullable final String value) {
        this._text = value;
    }
    /**
     * Sets the visible property value. A boolean that specifies the visibility of an axis title.
     * @param value Value to set for the visible property.
     * @return a void
     */
    public void setVisible(@javax.annotation.Nullable final Boolean value) {
        this._visible = value;
    }
}
