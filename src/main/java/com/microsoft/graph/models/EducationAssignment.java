package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationAssignment extends Entity implements Parsable {
    /**
     * Optional field to control the assignment behavior for students who are added after the assignment is published. If not specified, defaults to none. Supported values are: none, assignIfOpen. For example, a teacher can use assignIfOpen to indicate that an assignment should be assigned to any new student who joins the class while the assignment is still open, and none to indicate that an assignment should not be assigned to new students.
     */
    private EducationAddedStudentAction addedStudentAction;
    /**
     * Optional field to control the assignment behavior  for adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none.
     */
    private EducationAddToCalendarOptions addToCalendarAction;
    /**
     * Identifies whether students can submit after the due date. If this property isn't specified during create, it defaults to true.
     */
    private Boolean allowLateSubmissions;
    /**
     * Identifies whether students can add their own resources to a submission or if they can only modify resources added by the teacher.
     */
    private Boolean allowStudentsToAddResourcesToSubmission;
    /**
     * The date when the assignment should become active.  If in the future, the assignment isn't shown to the student until this date.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime assignDateTime;
    /**
     * The moment that the assignment was published to students and the assignment shows up on the students timeline.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime assignedDateTime;
    /**
     * Which users, or whole class should receive a submission object once the assignment is published.
     */
    private EducationAssignmentRecipient assignTo;
    /**
     * When set, enables users to easily find assignments of a given type.  Read-only. Nullable.
     */
    private java.util.List<EducationCategory> categories;
    /**
     * Class which this assignment belongs.
     */
    private String classId;
    /**
     * Date when the assignment will be closed for submissions. This is an optional field that can be null if the assignment does not allowLateSubmissions or when the closeDateTime is the same as the dueDateTime. But if specified, then the closeDateTime must be greater than or equal to the dueDateTime. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime closeDateTime;
    /**
     * Who created the assignment.
     */
    private IdentitySet createdBy;
    /**
     * Moment when the assignment was created.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime createdDateTime;
    /**
     * Name of the assignment.
     */
    private String displayName;
    /**
     * Date when the students assignment is due.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime dueDateTime;
    /**
     * Folder URL where all the feedback file resources for this assignment are stored.
     */
    private String feedbackResourcesFolderUrl;
    /**
     * How the assignment will be graded.
     */
    private EducationAssignmentGradeType grading;
    /**
     * Instructions for the assignment.  This along with the display name tell the student what to do.
     */
    private EducationItemBody instructions;
    /**
     * Who last modified the assignment.
     */
    private IdentitySet lastModifiedBy;
    /**
     * Moment when the assignment was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Optional field to specify the URL of the channel to post the assignment publish notification. If not specified or null, defaults to the General channel. This field only applies to assignments where the assignTo value is educationAssignmentClassRecipient. Updating the notificationChannelUrl isn't allowed after the assignment has been published.
     */
    private String notificationChannelUrl;
    /**
     * Learning objects that are associated with this assignment.  Only teachers can modify this list. Nullable.
     */
    private java.util.List<EducationAssignmentResource> resources;
    /**
     * Folder URL where all the file resources for this assignment are stored.
     */
    private String resourcesFolderUrl;
    /**
     * When set, the grading rubric attached to this assignment.
     */
    private EducationRubric rubric;
    /**
     * Status of the Assignment.  You can't PATCH this value.  Possible values are: draft, scheduled, published, assigned.
     */
    private EducationAssignmentStatus status;
    /**
     * Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable.
     */
    private java.util.List<EducationSubmission> submissions;
    /**
     * The deep link URL for the given assignment.
     */
    private String webUrl;
    /**
     * Instantiates a new EducationAssignment and sets the default values.
     */
    public EducationAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationAssignment
     */
    @jakarta.annotation.Nonnull
    public static EducationAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationAssignment();
    }
    /**
     * Gets the addedStudentAction property value. Optional field to control the assignment behavior for students who are added after the assignment is published. If not specified, defaults to none. Supported values are: none, assignIfOpen. For example, a teacher can use assignIfOpen to indicate that an assignment should be assigned to any new student who joins the class while the assignment is still open, and none to indicate that an assignment should not be assigned to new students.
     * @return a EducationAddedStudentAction
     */
    @jakarta.annotation.Nullable
    public EducationAddedStudentAction getAddedStudentAction() {
        return this.addedStudentAction;
    }
    /**
     * Gets the addToCalendarAction property value. Optional field to control the assignment behavior  for adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none.
     * @return a EducationAddToCalendarOptions
     */
    @jakarta.annotation.Nullable
    public EducationAddToCalendarOptions getAddToCalendarAction() {
        return this.addToCalendarAction;
    }
    /**
     * Gets the allowLateSubmissions property value. Identifies whether students can submit after the due date. If this property isn't specified during create, it defaults to true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowLateSubmissions() {
        return this.allowLateSubmissions;
    }
    /**
     * Gets the allowStudentsToAddResourcesToSubmission property value. Identifies whether students can add their own resources to a submission or if they can only modify resources added by the teacher.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowStudentsToAddResourcesToSubmission() {
        return this.allowStudentsToAddResourcesToSubmission;
    }
    /**
     * Gets the assignDateTime property value. The date when the assignment should become active.  If in the future, the assignment isn't shown to the student until this date.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAssignDateTime() {
        return this.assignDateTime;
    }
    /**
     * Gets the assignedDateTime property value. The moment that the assignment was published to students and the assignment shows up on the students timeline.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAssignedDateTime() {
        return this.assignedDateTime;
    }
    /**
     * Gets the assignTo property value. Which users, or whole class should receive a submission object once the assignment is published.
     * @return a EducationAssignmentRecipient
     */
    @jakarta.annotation.Nullable
    public EducationAssignmentRecipient getAssignTo() {
        return this.assignTo;
    }
    /**
     * Gets the categories property value. When set, enables users to easily find assignments of a given type.  Read-only. Nullable.
     * @return a java.util.List<EducationCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationCategory> getCategories() {
        return this.categories;
    }
    /**
     * Gets the classId property value. Class which this assignment belongs.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClassId() {
        return this.classId;
    }
    /**
     * Gets the closeDateTime property value. Date when the assignment will be closed for submissions. This is an optional field that can be null if the assignment does not allowLateSubmissions or when the closeDateTime is the same as the dueDateTime. But if specified, then the closeDateTime must be greater than or equal to the dueDateTime. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCloseDateTime() {
        return this.closeDateTime;
    }
    /**
     * Gets the createdBy property value. Who created the assignment.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Moment when the assignment was created.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the displayName property value. Name of the assignment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the dueDateTime property value. Date when the students assignment is due.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this.dueDateTime;
    }
    /**
     * Gets the feedbackResourcesFolderUrl property value. Folder URL where all the feedback file resources for this assignment are stored.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFeedbackResourcesFolderUrl() {
        return this.feedbackResourcesFolderUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addedStudentAction", (n) -> { this.setAddedStudentAction(n.getEnumValue(EducationAddedStudentAction.class)); });
        deserializerMap.put("addToCalendarAction", (n) -> { this.setAddToCalendarAction(n.getEnumValue(EducationAddToCalendarOptions.class)); });
        deserializerMap.put("allowLateSubmissions", (n) -> { this.setAllowLateSubmissions(n.getBooleanValue()); });
        deserializerMap.put("allowStudentsToAddResourcesToSubmission", (n) -> { this.setAllowStudentsToAddResourcesToSubmission(n.getBooleanValue()); });
        deserializerMap.put("assignDateTime", (n) -> { this.setAssignDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("assignedDateTime", (n) -> { this.setAssignedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("assignTo", (n) -> { this.setAssignTo(n.getObjectValue(EducationAssignmentRecipient::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfObjectValues(EducationCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("classId", (n) -> { this.setClassId(n.getStringValue()); });
        deserializerMap.put("closeDateTime", (n) -> { this.setCloseDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("feedbackResourcesFolderUrl", (n) -> { this.setFeedbackResourcesFolderUrl(n.getStringValue()); });
        deserializerMap.put("grading", (n) -> { this.setGrading(n.getObjectValue(EducationAssignmentGradeType::createFromDiscriminatorValue)); });
        deserializerMap.put("instructions", (n) -> { this.setInstructions(n.getObjectValue(EducationItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notificationChannelUrl", (n) -> { this.setNotificationChannelUrl(n.getStringValue()); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(EducationAssignmentResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourcesFolderUrl", (n) -> { this.setResourcesFolderUrl(n.getStringValue()); });
        deserializerMap.put("rubric", (n) -> { this.setRubric(n.getObjectValue(EducationRubric::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(EducationAssignmentStatus.class)); });
        deserializerMap.put("submissions", (n) -> { this.setSubmissions(n.getCollectionOfObjectValues(EducationSubmission::createFromDiscriminatorValue)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the grading property value. How the assignment will be graded.
     * @return a EducationAssignmentGradeType
     */
    @jakarta.annotation.Nullable
    public EducationAssignmentGradeType getGrading() {
        return this.grading;
    }
    /**
     * Gets the instructions property value. Instructions for the assignment.  This along with the display name tell the student what to do.
     * @return a EducationItemBody
     */
    @jakarta.annotation.Nullable
    public EducationItemBody getInstructions() {
        return this.instructions;
    }
    /**
     * Gets the lastModifiedBy property value. Who last modified the assignment.
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Moment when the assignment was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the notificationChannelUrl property value. Optional field to specify the URL of the channel to post the assignment publish notification. If not specified or null, defaults to the General channel. This field only applies to assignments where the assignTo value is educationAssignmentClassRecipient. Updating the notificationChannelUrl isn't allowed after the assignment has been published.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNotificationChannelUrl() {
        return this.notificationChannelUrl;
    }
    /**
     * Gets the resources property value. Learning objects that are associated with this assignment.  Only teachers can modify this list. Nullable.
     * @return a java.util.List<EducationAssignmentResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationAssignmentResource> getResources() {
        return this.resources;
    }
    /**
     * Gets the resourcesFolderUrl property value. Folder URL where all the file resources for this assignment are stored.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourcesFolderUrl() {
        return this.resourcesFolderUrl;
    }
    /**
     * Gets the rubric property value. When set, the grading rubric attached to this assignment.
     * @return a EducationRubric
     */
    @jakarta.annotation.Nullable
    public EducationRubric getRubric() {
        return this.rubric;
    }
    /**
     * Gets the status property value. Status of the Assignment.  You can't PATCH this value.  Possible values are: draft, scheduled, published, assigned.
     * @return a EducationAssignmentStatus
     */
    @jakarta.annotation.Nullable
    public EducationAssignmentStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the submissions property value. Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable.
     * @return a java.util.List<EducationSubmission>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationSubmission> getSubmissions() {
        return this.submissions;
    }
    /**
     * Gets the webUrl property value. The deep link URL for the given assignment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("addedStudentAction", this.getAddedStudentAction());
        writer.writeEnumValue("addToCalendarAction", this.getAddToCalendarAction());
        writer.writeBooleanValue("allowLateSubmissions", this.getAllowLateSubmissions());
        writer.writeBooleanValue("allowStudentsToAddResourcesToSubmission", this.getAllowStudentsToAddResourcesToSubmission());
        writer.writeObjectValue("assignTo", this.getAssignTo());
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeStringValue("classId", this.getClassId());
        writer.writeOffsetDateTimeValue("closeDateTime", this.getCloseDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("dueDateTime", this.getDueDateTime());
        writer.writeObjectValue("grading", this.getGrading());
        writer.writeObjectValue("instructions", this.getInstructions());
        writer.writeStringValue("notificationChannelUrl", this.getNotificationChannelUrl());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeObjectValue("rubric", this.getRubric());
        writer.writeCollectionOfObjectValues("submissions", this.getSubmissions());
    }
    /**
     * Sets the addedStudentAction property value. Optional field to control the assignment behavior for students who are added after the assignment is published. If not specified, defaults to none. Supported values are: none, assignIfOpen. For example, a teacher can use assignIfOpen to indicate that an assignment should be assigned to any new student who joins the class while the assignment is still open, and none to indicate that an assignment should not be assigned to new students.
     * @param value Value to set for the addedStudentAction property.
     */
    public void setAddedStudentAction(@jakarta.annotation.Nullable final EducationAddedStudentAction value) {
        this.addedStudentAction = value;
    }
    /**
     * Sets the addToCalendarAction property value. Optional field to control the assignment behavior  for adding assignments to students' and teachers' calendars when the assignment is published. The possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: studentsOnly. The default value is none.
     * @param value Value to set for the addToCalendarAction property.
     */
    public void setAddToCalendarAction(@jakarta.annotation.Nullable final EducationAddToCalendarOptions value) {
        this.addToCalendarAction = value;
    }
    /**
     * Sets the allowLateSubmissions property value. Identifies whether students can submit after the due date. If this property isn't specified during create, it defaults to true.
     * @param value Value to set for the allowLateSubmissions property.
     */
    public void setAllowLateSubmissions(@jakarta.annotation.Nullable final Boolean value) {
        this.allowLateSubmissions = value;
    }
    /**
     * Sets the allowStudentsToAddResourcesToSubmission property value. Identifies whether students can add their own resources to a submission or if they can only modify resources added by the teacher.
     * @param value Value to set for the allowStudentsToAddResourcesToSubmission property.
     */
    public void setAllowStudentsToAddResourcesToSubmission(@jakarta.annotation.Nullable final Boolean value) {
        this.allowStudentsToAddResourcesToSubmission = value;
    }
    /**
     * Sets the assignDateTime property value. The date when the assignment should become active.  If in the future, the assignment isn't shown to the student until this date.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the assignDateTime property.
     */
    public void setAssignDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.assignDateTime = value;
    }
    /**
     * Sets the assignedDateTime property value. The moment that the assignment was published to students and the assignment shows up on the students timeline.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the assignedDateTime property.
     */
    public void setAssignedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.assignedDateTime = value;
    }
    /**
     * Sets the assignTo property value. Which users, or whole class should receive a submission object once the assignment is published.
     * @param value Value to set for the assignTo property.
     */
    public void setAssignTo(@jakarta.annotation.Nullable final EducationAssignmentRecipient value) {
        this.assignTo = value;
    }
    /**
     * Sets the categories property value. When set, enables users to easily find assignments of a given type.  Read-only. Nullable.
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<EducationCategory> value) {
        this.categories = value;
    }
    /**
     * Sets the classId property value. Class which this assignment belongs.
     * @param value Value to set for the classId property.
     */
    public void setClassId(@jakarta.annotation.Nullable final String value) {
        this.classId = value;
    }
    /**
     * Sets the closeDateTime property value. Date when the assignment will be closed for submissions. This is an optional field that can be null if the assignment does not allowLateSubmissions or when the closeDateTime is the same as the dueDateTime. But if specified, then the closeDateTime must be greater than or equal to the dueDateTime. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the closeDateTime property.
     */
    public void setCloseDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.closeDateTime = value;
    }
    /**
     * Sets the createdBy property value. Who created the assignment.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Moment when the assignment was created.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the displayName property value. Name of the assignment.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the dueDateTime property value. Date when the students assignment is due.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dueDateTime = value;
    }
    /**
     * Sets the feedbackResourcesFolderUrl property value. Folder URL where all the feedback file resources for this assignment are stored.
     * @param value Value to set for the feedbackResourcesFolderUrl property.
     */
    public void setFeedbackResourcesFolderUrl(@jakarta.annotation.Nullable final String value) {
        this.feedbackResourcesFolderUrl = value;
    }
    /**
     * Sets the grading property value. How the assignment will be graded.
     * @param value Value to set for the grading property.
     */
    public void setGrading(@jakarta.annotation.Nullable final EducationAssignmentGradeType value) {
        this.grading = value;
    }
    /**
     * Sets the instructions property value. Instructions for the assignment.  This along with the display name tell the student what to do.
     * @param value Value to set for the instructions property.
     */
    public void setInstructions(@jakarta.annotation.Nullable final EducationItemBody value) {
        this.instructions = value;
    }
    /**
     * Sets the lastModifiedBy property value. Who last modified the assignment.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Moment when the assignment was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the notificationChannelUrl property value. Optional field to specify the URL of the channel to post the assignment publish notification. If not specified or null, defaults to the General channel. This field only applies to assignments where the assignTo value is educationAssignmentClassRecipient. Updating the notificationChannelUrl isn't allowed after the assignment has been published.
     * @param value Value to set for the notificationChannelUrl property.
     */
    public void setNotificationChannelUrl(@jakarta.annotation.Nullable final String value) {
        this.notificationChannelUrl = value;
    }
    /**
     * Sets the resources property value. Learning objects that are associated with this assignment.  Only teachers can modify this list. Nullable.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<EducationAssignmentResource> value) {
        this.resources = value;
    }
    /**
     * Sets the resourcesFolderUrl property value. Folder URL where all the file resources for this assignment are stored.
     * @param value Value to set for the resourcesFolderUrl property.
     */
    public void setResourcesFolderUrl(@jakarta.annotation.Nullable final String value) {
        this.resourcesFolderUrl = value;
    }
    /**
     * Sets the rubric property value. When set, the grading rubric attached to this assignment.
     * @param value Value to set for the rubric property.
     */
    public void setRubric(@jakarta.annotation.Nullable final EducationRubric value) {
        this.rubric = value;
    }
    /**
     * Sets the status property value. Status of the Assignment.  You can't PATCH this value.  Possible values are: draft, scheduled, published, assigned.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final EducationAssignmentStatus value) {
        this.status = value;
    }
    /**
     * Sets the submissions property value. Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable.
     * @param value Value to set for the submissions property.
     */
    public void setSubmissions(@jakarta.annotation.Nullable final java.util.List<EducationSubmission> value) {
        this.submissions = value;
    }
    /**
     * Sets the webUrl property value. The deep link URL for the given assignment.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}
