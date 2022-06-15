package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of application entities. */
public class SharePointIdentity extends Identity implements Parsable {
    /** The sign in name of the SharePoint identity. */
    private String _loginName;
    /**
     * Instantiates a new sharePointIdentity and sets the default values.
     * @return a void
     */
    public SharePointIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharePointIdentity
     */
    @javax.annotation.Nonnull
    public static SharePointIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointIdentity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharePointIdentity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("loginName", (n) -> { currentObject.setLoginName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the loginName property value. The sign in name of the SharePoint identity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLoginName() {
        return this._loginName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("loginName", this.getLoginName());
    }
    /**
     * Sets the loginName property value. The sign in name of the SharePoint identity.
     * @param value Value to set for the loginName property.
     * @return a void
     */
    public void setLoginName(@javax.annotation.Nullable final String value) {
        this._loginName = value;
    }
}
