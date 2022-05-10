package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleManagement implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Read-only. Nullable. */
    private RbacApplication _directory;
    /** Container for roles and assignments for entitlement management resources. */
    private RbacApplication _entitlementManagement;
    /**
     * Instantiates a new RoleManagement and sets the default values.
     * @return a void
     */
    public RoleManagement() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RoleManagement
     */
    @javax.annotation.Nonnull
    public static RoleManagement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleManagement();
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
     * Gets the directory property value. Read-only. Nullable.
     * @return a rbacApplication
     */
    @javax.annotation.Nullable
    public RbacApplication getDirectory() {
        return this._directory;
    }
    /**
     * Gets the entitlementManagement property value. Container for roles and assignments for entitlement management resources.
     * @return a rbacApplication
     */
    @javax.annotation.Nullable
    public RbacApplication getEntitlementManagement() {
        return this._entitlementManagement;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RoleManagement currentObject = this;
        return new HashMap<>(2) {{
            this.put("directory", (n) -> { currentObject.setDirectory(n.getObjectValue(RbacApplication::createFromDiscriminatorValue)); });
            this.put("entitlementManagement", (n) -> { currentObject.setEntitlementManagement(n.getObjectValue(RbacApplication::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("directory", this.getDirectory());
        writer.writeObjectValue("entitlementManagement", this.getEntitlementManagement());
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
     * Sets the directory property value. Read-only. Nullable.
     * @param value Value to set for the directory property.
     * @return a void
     */
    public void setDirectory(@javax.annotation.Nullable final RbacApplication value) {
        this._directory = value;
    }
    /**
     * Sets the entitlementManagement property value. Container for roles and assignments for entitlement management resources.
     * @param value Value to set for the entitlementManagement property.
     * @return a void
     */
    public void setEntitlementManagement(@javax.annotation.Nullable final RbacApplication value) {
        this._entitlementManagement = value;
    }
}
