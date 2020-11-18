// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PlannerAppliedCategories;
import com.microsoft.graph.models.extensions.PlannerAssignments;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.generated.PlannerPreviewType;
import com.microsoft.graph.models.extensions.PlannerAssignedToTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.PlannerBucketTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.PlannerTaskDetails;
import com.microsoft.graph.models.extensions.PlannerProgressTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Task.
 */
public class PlannerTask extends Entity implements IJsonBackedObject {


    /**
     * The Active Checklist Item Count.
     * Number of checklist items with value set to false, representing incomplete items.
     */
    @SerializedName(value = "activeChecklistItemCount", alternate = {"ActiveChecklistItemCount"})
    @Expose
	@Nullable
    public Integer activeChecklistItemCount;

    /**
     * The Applied Categories.
     * The categories to which the task has been applied. See applied Categories for possible values.
     */
    @SerializedName(value = "appliedCategories", alternate = {"AppliedCategories"})
    @Expose
	@Nullable
    public PlannerAppliedCategories appliedCategories;

    /**
     * The Assignee Priority.
     * Hint used to order items of this type in a list view. The format is defined as outlined here.
     */
    @SerializedName(value = "assigneePriority", alternate = {"AssigneePriority"})
    @Expose
	@Nullable
    public String assigneePriority;

    /**
     * The Assignments.
     * The set of assignees the task is assigned to.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public PlannerAssignments assignments;

    /**
     * The Bucket Id.
     * Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long and case-sensitive. Format validation is done on the service.
     */
    @SerializedName(value = "bucketId", alternate = {"BucketId"})
    @Expose
	@Nullable
    public String bucketId;

    /**
     * The Checklist Item Count.
     * Number of checklist items that are present on the task.
     */
    @SerializedName(value = "checklistItemCount", alternate = {"ChecklistItemCount"})
    @Expose
	@Nullable
    public Integer checklistItemCount;

    /**
     * The Completed By.
     * Identity of the user that completed the task.
     */
    @SerializedName(value = "completedBy", alternate = {"CompletedBy"})
    @Expose
	@Nullable
    public IdentitySet completedBy;

    /**
     * The Completed Date Time.
     * Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "completedDateTime", alternate = {"CompletedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar completedDateTime;

    /**
     * The Conversation Thread Id.
     * Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
     */
    @SerializedName(value = "conversationThreadId", alternate = {"ConversationThreadId"})
    @Expose
	@Nullable
    public String conversationThreadId;

    /**
     * The Created By.
     * Identity of the user that created the task.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar createdDateTime;

    /**
     * The Due Date Time.
     * Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "dueDateTime", alternate = {"DueDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar dueDateTime;

    /**
     * The Has Description.
     * Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
     */
    @SerializedName(value = "hasDescription", alternate = {"HasDescription"})
    @Expose
	@Nullable
    public Boolean hasDescription;

    /**
     * The Order Hint.
     * Hint used to order items of this type in a list view. The format is defined as outlined here.
     */
    @SerializedName(value = "orderHint", alternate = {"OrderHint"})
    @Expose
	@Nullable
    public String orderHint;

    /**
     * The Percent Complete.
     * Percentage of task completion. When set to 100, the task is considered completed.
     */
    @SerializedName(value = "percentComplete", alternate = {"PercentComplete"})
    @Expose
	@Nullable
    public Integer percentComplete;

    /**
     * The Plan Id.
     * Plan ID to which the task belongs.
     */
    @SerializedName(value = "planId", alternate = {"PlanId"})
    @Expose
	@Nullable
    public String planId;

    /**
     * The Preview Type.
     * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference.
     */
    @SerializedName(value = "previewType", alternate = {"PreviewType"})
    @Expose
	@Nullable
    public PlannerPreviewType previewType;

    /**
     * The Reference Count.
     * Number of external references that exist on the task.
     */
    @SerializedName(value = "referenceCount", alternate = {"ReferenceCount"})
    @Expose
	@Nullable
    public Integer referenceCount;

    /**
     * The Start Date Time.
     * Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar startDateTime;

    /**
     * The Title.
     * Title of the task.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;

    /**
     * The Assigned To Task Board Format.
     * Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
     */
    @SerializedName(value = "assignedToTaskBoardFormat", alternate = {"AssignedToTaskBoardFormat"})
    @Expose
	@Nullable
    public PlannerAssignedToTaskBoardTaskFormat assignedToTaskBoardFormat;

    /**
     * The Bucket Task Board Format.
     * Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
     */
    @SerializedName(value = "bucketTaskBoardFormat", alternate = {"BucketTaskBoardFormat"})
    @Expose
	@Nullable
    public PlannerBucketTaskBoardTaskFormat bucketTaskBoardFormat;

    /**
     * The Details.
     * Read-only. Nullable. Additional details about the task.
     */
    @SerializedName(value = "details", alternate = {"Details"})
    @Expose
	@Nullable
    public PlannerTaskDetails details;

    /**
     * The Progress Task Board Format.
     * Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
     */
    @SerializedName(value = "progressTaskBoardFormat", alternate = {"ProgressTaskBoardFormat"})
    @Expose
	@Nullable
    public PlannerProgressTaskBoardTaskFormat progressTaskBoardFormat;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
