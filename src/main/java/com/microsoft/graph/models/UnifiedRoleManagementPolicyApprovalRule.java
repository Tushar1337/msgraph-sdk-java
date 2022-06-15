package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyApprovalRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /** The settings for approval of the role assignment. */
    private ApprovalSettings _setting;
    /**
     * Instantiates a new UnifiedRoleManagementPolicyApprovalRule and sets the default values.
     * @return a void
     */
    public UnifiedRoleManagementPolicyApprovalRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleManagementPolicyApprovalRule
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementPolicyApprovalRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyApprovalRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleManagementPolicyApprovalRule currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("setting", (n) -> { currentObject.setSetting(n.getObjectValue(ApprovalSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the setting property value. The settings for approval of the role assignment.
     * @return a approvalSettings
     */
    @javax.annotation.Nullable
    public ApprovalSettings getSetting() {
        return this._setting;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("setting", this.getSetting());
    }
    /**
     * Sets the setting property value. The settings for approval of the role assignment.
     * @param value Value to set for the setting property.
     * @return a void
     */
    public void setSetting(@javax.annotation.Nullable final ApprovalSettings value) {
        this._setting = value;
    }
}
