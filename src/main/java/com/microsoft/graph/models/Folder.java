package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Folder implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Number of children contained immediately within this container. */
    private Integer _childCount;
    /** A collection of properties defining the recommended view for the folder. */
    private FolderView _view;
    /**
     * Instantiates a new folder and sets the default values.
     * @return a void
     */
    public Folder() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a folder
     */
    @javax.annotation.Nonnull
    public static Folder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Folder();
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
     * Gets the childCount property value. Number of children contained immediately within this container.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getChildCount() {
        return this._childCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Folder currentObject = this;
        return new HashMap<>(2) {{
            this.put("childCount", (n) -> { currentObject.setChildCount(n.getIntegerValue()); });
            this.put("view", (n) -> { currentObject.setView(n.getObjectValue(FolderView::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the view property value. A collection of properties defining the recommended view for the folder.
     * @return a folderView
     */
    @javax.annotation.Nullable
    public FolderView getView() {
        return this._view;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("childCount", this.getChildCount());
        writer.writeObjectValue("view", this.getView());
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
     * Sets the childCount property value. Number of children contained immediately within this container.
     * @param value Value to set for the childCount property.
     * @return a void
     */
    public void setChildCount(@javax.annotation.Nullable final Integer value) {
        this._childCount = value;
    }
    /**
     * Sets the view property value. A collection of properties defining the recommended view for the folder.
     * @param value Value to set for the view property.
     * @return a void
     */
    public void setView(@javax.annotation.Nullable final FolderView value) {
        this._view = value;
    }
}
