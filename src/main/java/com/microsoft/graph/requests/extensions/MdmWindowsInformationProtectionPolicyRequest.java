// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MdmWindowsInformationProtectionPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mdm Windows Information Protection Policy Request.
 */
public class MdmWindowsInformationProtectionPolicyRequest extends BaseRequest {
	
    /**
     * The request for the MdmWindowsInformationProtectionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MdmWindowsInformationProtectionPolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MdmWindowsInformationProtectionPolicy.class);
    }

    /**
     * Gets the MdmWindowsInformationProtectionPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MdmWindowsInformationProtectionPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MdmWindowsInformationProtectionPolicy from the service
     *
     * @return the MdmWindowsInformationProtectionPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MdmWindowsInformationProtectionPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MdmWindowsInformationProtectionPolicy> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MdmWindowsInformationProtectionPolicy with a source
     *
     * @param sourceMdmWindowsInformationProtectionPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MdmWindowsInformationProtectionPolicy sourceMdmWindowsInformationProtectionPolicy, @Nonnull final ICallback<? super MdmWindowsInformationProtectionPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceMdmWindowsInformationProtectionPolicy);
    }

    /**
     * Patches this MdmWindowsInformationProtectionPolicy with a source
     *
     * @param sourceMdmWindowsInformationProtectionPolicy the source object with updates
     * @return the updated MdmWindowsInformationProtectionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MdmWindowsInformationProtectionPolicy patch(@Nonnull final MdmWindowsInformationProtectionPolicy sourceMdmWindowsInformationProtectionPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceMdmWindowsInformationProtectionPolicy);
    }

    /**
     * Creates a MdmWindowsInformationProtectionPolicy with a new object
     *
     * @param newMdmWindowsInformationProtectionPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MdmWindowsInformationProtectionPolicy newMdmWindowsInformationProtectionPolicy, @Nonnull final ICallback<? super MdmWindowsInformationProtectionPolicy> callback) {
        send(HttpMethod.POST, callback, newMdmWindowsInformationProtectionPolicy);
    }

    /**
     * Creates a MdmWindowsInformationProtectionPolicy with a new object
     *
     * @param newMdmWindowsInformationProtectionPolicy the new object to create
     * @return the created MdmWindowsInformationProtectionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MdmWindowsInformationProtectionPolicy post(@Nonnull final MdmWindowsInformationProtectionPolicy newMdmWindowsInformationProtectionPolicy) throws ClientException {
        return send(HttpMethod.POST, newMdmWindowsInformationProtectionPolicy);
    }

    /**
     * Creates a MdmWindowsInformationProtectionPolicy with a new object
     *
     * @param newMdmWindowsInformationProtectionPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MdmWindowsInformationProtectionPolicy newMdmWindowsInformationProtectionPolicy, @Nonnull final ICallback<? super MdmWindowsInformationProtectionPolicy> callback) {
        send(HttpMethod.PUT, callback, newMdmWindowsInformationProtectionPolicy);
    }

    /**
     * Creates a MdmWindowsInformationProtectionPolicy with a new object
     *
     * @param newMdmWindowsInformationProtectionPolicy the object to create/update
     * @return the created MdmWindowsInformationProtectionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MdmWindowsInformationProtectionPolicy put(@Nonnull final MdmWindowsInformationProtectionPolicy newMdmWindowsInformationProtectionPolicy) throws ClientException {
        return send(HttpMethod.PUT, newMdmWindowsInformationProtectionPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MdmWindowsInformationProtectionPolicyRequest select(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MdmWindowsInformationProtectionPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public MdmWindowsInformationProtectionPolicyRequest expand(@Nonnull final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MdmWindowsInformationProtectionPolicyRequest)this;
     }

}

