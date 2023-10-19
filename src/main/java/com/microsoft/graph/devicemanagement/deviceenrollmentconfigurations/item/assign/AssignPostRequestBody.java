package com.microsoft.graph.devicemanagement.deviceenrollmentconfigurations.item.assign;

import com.microsoft.graph.models.EnrollmentConfigurationAssignment;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The enrollmentConfigurationAssignments property
     */
    private java.util.List<EnrollmentConfigurationAssignment> enrollmentConfigurationAssignments;
    /**
     * Instantiates a new AssignPostRequestBody and sets the default values.
     */
    public AssignPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssignPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AssignPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the enrollmentConfigurationAssignments property value. The enrollmentConfigurationAssignments property
     * @return a java.util.List<EnrollmentConfigurationAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EnrollmentConfigurationAssignment> getEnrollmentConfigurationAssignments() {
        return this.enrollmentConfigurationAssignments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("enrollmentConfigurationAssignments", (n) -> { this.setEnrollmentConfigurationAssignments(n.getCollectionOfObjectValues(EnrollmentConfigurationAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("enrollmentConfigurationAssignments", this.getEnrollmentConfigurationAssignments());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the enrollmentConfigurationAssignments property value. The enrollmentConfigurationAssignments property
     * @param value Value to set for the enrollmentConfigurationAssignments property.
     */
    public void setEnrollmentConfigurationAssignments(@jakarta.annotation.Nullable final java.util.List<EnrollmentConfigurationAssignment> value) {
        this.enrollmentConfigurationAssignments = value;
    }
}
