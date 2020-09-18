// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.MobileAppContentFileUploadState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content File.
 */
public class MobileAppContentFile extends Entity implements IJsonBackedObject {


    /**
     * The Azure Storage Uri.
     * The Azure Storage URI.
     */
    @SerializedName("azureStorageUri")
    @Expose
    public String azureStorageUri;

    /**
     * The Azure Storage Uri Expiration Date Time.
     * The time the Azure storage Uri expires.
     */
    @SerializedName("azureStorageUriExpirationDateTime")
    @Expose
    public java.util.Calendar azureStorageUriExpirationDateTime;

    /**
     * The Created Date Time.
     * The time the file was created.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Is Committed.
     * A value indicating whether the file is committed.
     */
    @SerializedName("isCommitted")
    @Expose
    public Boolean isCommitted;

    /**
     * The Manifest.
     * The manifest information.
     */
    @SerializedName("manifest")
    @Expose
    public byte[] manifest;

    /**
     * The Name.
     * the file name.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Size.
     * The size of the file prior to encryption.
     */
    @SerializedName("size")
    @Expose
    public Long size;

    /**
     * The Size Encrypted.
     * The size of the file after encryption.
     */
    @SerializedName("sizeEncrypted")
    @Expose
    public Long sizeEncrypted;

    /**
     * The Upload State.
     * The state of the current upload request. Possible values are: success, transientError, error, unknown, azureStorageUriRequestSuccess, azureStorageUriRequestPending, azureStorageUriRequestFailed, azureStorageUriRequestTimedOut, azureStorageUriRenewalSuccess, azureStorageUriRenewalPending, azureStorageUriRenewalFailed, azureStorageUriRenewalTimedOut, commitFileSuccess, commitFilePending, commitFileFailed, commitFileTimedOut.
     */
    @SerializedName("uploadState")
    @Expose
    public MobileAppContentFileUploadState uploadState;


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
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
