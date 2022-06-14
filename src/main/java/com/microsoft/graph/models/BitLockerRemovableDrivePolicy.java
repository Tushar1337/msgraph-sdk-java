package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** BitLocker Removable Drive Policies. */
public class BitLockerRemovableDrivePolicy implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** This policy setting determines whether BitLocker protection is required for removable data drives to be writable on a computer. */
    private Boolean _blockCrossOrganizationWriteAccess;
    /** Select the encryption method for removable  drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256. */
    private BitLockerEncryptionMethod _encryptionMethod;
    /** Indicates whether to block write access to devices configured in another organization.  If requireEncryptionForWriteAccess is false, this value does not affect. */
    private Boolean _requireEncryptionForWriteAccess;
    /**
     * Instantiates a new bitLockerRemovableDrivePolicy and sets the default values.
     * @return a void
     */
    public BitLockerRemovableDrivePolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bitLockerRemovableDrivePolicy
     */
    @javax.annotation.Nonnull
    public static BitLockerRemovableDrivePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BitLockerRemovableDrivePolicy();
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
     * Gets the blockCrossOrganizationWriteAccess property value. This policy setting determines whether BitLocker protection is required for removable data drives to be writable on a computer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockCrossOrganizationWriteAccess() {
        return this._blockCrossOrganizationWriteAccess;
    }
    /**
     * Gets the encryptionMethod property value. Select the encryption method for removable  drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     * @return a bitLockerEncryptionMethod
     */
    @javax.annotation.Nullable
    public BitLockerEncryptionMethod getEncryptionMethod() {
        return this._encryptionMethod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BitLockerRemovableDrivePolicy currentObject = this;
        return new HashMap<>(3) {{
            this.put("blockCrossOrganizationWriteAccess", (n) -> { currentObject.setBlockCrossOrganizationWriteAccess(n.getBooleanValue()); });
            this.put("encryptionMethod", (n) -> { currentObject.setEncryptionMethod(n.getEnumValue(BitLockerEncryptionMethod.class)); });
            this.put("requireEncryptionForWriteAccess", (n) -> { currentObject.setRequireEncryptionForWriteAccess(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the requireEncryptionForWriteAccess property value. Indicates whether to block write access to devices configured in another organization.  If requireEncryptionForWriteAccess is false, this value does not affect.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireEncryptionForWriteAccess() {
        return this._requireEncryptionForWriteAccess;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("blockCrossOrganizationWriteAccess", this.getBlockCrossOrganizationWriteAccess());
        writer.writeEnumValue("encryptionMethod", this.getEncryptionMethod());
        writer.writeBooleanValue("requireEncryptionForWriteAccess", this.getRequireEncryptionForWriteAccess());
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
     * Sets the blockCrossOrganizationWriteAccess property value. This policy setting determines whether BitLocker protection is required for removable data drives to be writable on a computer.
     * @param value Value to set for the blockCrossOrganizationWriteAccess property.
     * @return a void
     */
    public void setBlockCrossOrganizationWriteAccess(@javax.annotation.Nullable final Boolean value) {
        this._blockCrossOrganizationWriteAccess = value;
    }
    /**
     * Sets the encryptionMethod property value. Select the encryption method for removable  drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     * @param value Value to set for the encryptionMethod property.
     * @return a void
     */
    public void setEncryptionMethod(@javax.annotation.Nullable final BitLockerEncryptionMethod value) {
        this._encryptionMethod = value;
    }
    /**
     * Sets the requireEncryptionForWriteAccess property value. Indicates whether to block write access to devices configured in another organization.  If requireEncryptionForWriteAccess is false, this value does not affect.
     * @param value Value to set for the requireEncryptionForWriteAccess property.
     * @return a void
     */
    public void setRequireEncryptionForWriteAccess(@javax.annotation.Nullable final Boolean value) {
        this._requireEncryptionForWriteAccess = value;
    }
}
