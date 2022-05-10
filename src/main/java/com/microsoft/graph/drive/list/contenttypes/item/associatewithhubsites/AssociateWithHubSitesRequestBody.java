package microsoft.graph.drive.list.contenttypes.item.associatewithhubsites;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the associateWithHubSites method. */
public class AssociateWithHubSitesRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The hubSiteUrls property */
    private java.util.List<String> _hubSiteUrls;
    /** The propagateToExistingLists property */
    private Boolean _propagateToExistingLists;
    /**
     * Instantiates a new associateWithHubSitesRequestBody and sets the default values.
     * @return a void
     */
    public AssociateWithHubSitesRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a associateWithHubSitesRequestBody
     */
    @javax.annotation.Nonnull
    public static AssociateWithHubSitesRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssociateWithHubSitesRequestBody();
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
        final AssociateWithHubSitesRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("hubSiteUrls", (n) -> { currentObject.setHubSiteUrls(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("propagateToExistingLists", (n) -> { currentObject.setPropagateToExistingLists(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the hubSiteUrls property value. The hubSiteUrls property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getHubSiteUrls() {
        return this._hubSiteUrls;
    }
    /**
     * Gets the propagateToExistingLists property value. The propagateToExistingLists property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPropagateToExistingLists() {
        return this._propagateToExistingLists;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("hubSiteUrls", this.getHubSiteUrls());
        writer.writeBooleanValue("propagateToExistingLists", this.getPropagateToExistingLists());
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
     * Sets the hubSiteUrls property value. The hubSiteUrls property
     * @param value Value to set for the hubSiteUrls property.
     * @return a void
     */
    public void setHubSiteUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._hubSiteUrls = value;
    }
    /**
     * Sets the propagateToExistingLists property value. The propagateToExistingLists property
     * @param value Value to set for the propagateToExistingLists property.
     * @return a void
     */
    public void setPropagateToExistingLists(@javax.annotation.Nullable final Boolean value) {
        this._propagateToExistingLists = value;
    }
}
