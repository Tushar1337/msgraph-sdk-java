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
 * The interface for the Base Apple Push Notification Certificate Request.
 */
public interface IBaseApplePushNotificationCertificateRequest extends IHttpRequest {

    /**
     * Gets the ApplePushNotificationCertificate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ApplePushNotificationCertificate> callback);

    /**
     * Gets the ApplePushNotificationCertificate from the service
     *
     * @return the ApplePushNotificationCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplePushNotificationCertificate get() throws ClientException;

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
     * Patches this ApplePushNotificationCertificate with a source
     *
     * @param sourceApplePushNotificationCertificate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ApplePushNotificationCertificate sourceApplePushNotificationCertificate, final ICallback<ApplePushNotificationCertificate> callback);

    /**
     * Patches this ApplePushNotificationCertificate with a source
     *
     * @param sourceApplePushNotificationCertificate the source object with updates
     * @return the updated ApplePushNotificationCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplePushNotificationCertificate patch(final ApplePushNotificationCertificate sourceApplePushNotificationCertificate) throws ClientException;

    /**
     * Posts a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ApplePushNotificationCertificate newApplePushNotificationCertificate, final ICallback<ApplePushNotificationCertificate> callback);

    /**
     * Posts a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the new object to create
     * @return the created ApplePushNotificationCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ApplePushNotificationCertificate post(final ApplePushNotificationCertificate newApplePushNotificationCertificate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseApplePushNotificationCertificateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseApplePushNotificationCertificateRequest expand(final String value);

}

