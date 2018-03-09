// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Apple Device Features Configuration Base Request.
 */
public interface IBaseAppleDeviceFeaturesConfigurationBaseRequest extends IHttpRequest {

    /**
     * Gets the AppleDeviceFeaturesConfigurationBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AppleDeviceFeaturesConfigurationBase> callback);

    /**
     * Gets the AppleDeviceFeaturesConfigurationBase from the service
     *
     * @return the AppleDeviceFeaturesConfigurationBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleDeviceFeaturesConfigurationBase get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AppleDeviceFeaturesConfigurationBase with a source
     *
     * @param sourceAppleDeviceFeaturesConfigurationBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AppleDeviceFeaturesConfigurationBase sourceAppleDeviceFeaturesConfigurationBase, final ICallback<AppleDeviceFeaturesConfigurationBase> callback);

    /**
     * Patches this AppleDeviceFeaturesConfigurationBase with a source
     *
     * @param sourceAppleDeviceFeaturesConfigurationBase the source object with updates
     * @return the updated AppleDeviceFeaturesConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleDeviceFeaturesConfigurationBase patch(final AppleDeviceFeaturesConfigurationBase sourceAppleDeviceFeaturesConfigurationBase) throws ClientException;

    /**
     * Posts a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase, final ICallback<AppleDeviceFeaturesConfigurationBase> callback);

    /**
     * Posts a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the new object to create
     * @return the created AppleDeviceFeaturesConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleDeviceFeaturesConfigurationBase post(final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseAppleDeviceFeaturesConfigurationBaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseAppleDeviceFeaturesConfigurationBaseRequest expand(final String value);

}

