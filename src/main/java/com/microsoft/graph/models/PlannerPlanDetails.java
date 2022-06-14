package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of application entities. */
public class PlannerPlanDetails extends Entity implements Parsable {
    /** An object that specifies the descriptions of the 25 categories that can be associated with tasks in the plan */
    private PlannerCategoryDescriptions _categoryDescriptions;
    /** The set of user IDs that this plan is shared with. If you are using Microsoft 365 groups, use the groups API to manage group membership to share the group's plan. You can also add existing members of the group to this collection, although it is not required in order for them to access the plan owned by the group. */
    private PlannerUserIds _sharedWith;
    /**
     * Instantiates a new plannerPlanDetails and sets the default values.
     * @return a void
     */
    public PlannerPlanDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerPlanDetails
     */
    @javax.annotation.Nonnull
    public static PlannerPlanDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlanDetails();
    }
    /**
     * Gets the categoryDescriptions property value. An object that specifies the descriptions of the 25 categories that can be associated with tasks in the plan
     * @return a plannerCategoryDescriptions
     */
    @javax.annotation.Nullable
    public PlannerCategoryDescriptions getCategoryDescriptions() {
        return this._categoryDescriptions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerPlanDetails currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("categoryDescriptions", (n) -> { currentObject.setCategoryDescriptions(n.getObjectValue(PlannerCategoryDescriptions::createFromDiscriminatorValue)); });
            this.put("sharedWith", (n) -> { currentObject.setSharedWith(n.getObjectValue(PlannerUserIds::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the sharedWith property value. The set of user IDs that this plan is shared with. If you are using Microsoft 365 groups, use the groups API to manage group membership to share the group's plan. You can also add existing members of the group to this collection, although it is not required in order for them to access the plan owned by the group.
     * @return a plannerUserIds
     */
    @javax.annotation.Nullable
    public PlannerUserIds getSharedWith() {
        return this._sharedWith;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("categoryDescriptions", this.getCategoryDescriptions());
        writer.writeObjectValue("sharedWith", this.getSharedWith());
    }
    /**
     * Sets the categoryDescriptions property value. An object that specifies the descriptions of the 25 categories that can be associated with tasks in the plan
     * @param value Value to set for the categoryDescriptions property.
     * @return a void
     */
    public void setCategoryDescriptions(@javax.annotation.Nullable final PlannerCategoryDescriptions value) {
        this._categoryDescriptions = value;
    }
    /**
     * Sets the sharedWith property value. The set of user IDs that this plan is shared with. If you are using Microsoft 365 groups, use the groups API to manage group membership to share the group's plan. You can also add existing members of the group to this collection, although it is not required in order for them to access the plan owned by the group.
     * @param value Value to set for the sharedWith property.
     * @return a void
     */
    public void setSharedWith(@javax.annotation.Nullable final PlannerUserIds value) {
        this._sharedWith = value;
    }
}
