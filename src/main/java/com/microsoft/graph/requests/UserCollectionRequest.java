// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.graph.models.AttendeeBase;
import com.microsoft.graph.models.LocationConstraint;
import com.microsoft.graph.models.TimeConstraint;
import com.microsoft.graph.models.MeetingTimeSuggestionsResult;
import com.microsoft.graph.models.MailTipsType;
import com.microsoft.graph.models.MailTips;
import java.util.EnumSet;
import com.microsoft.graph.models.Message;
import com.microsoft.graph.models.ExchangeIdFormat;
import com.microsoft.graph.models.ConvertIdResult;
import com.microsoft.graph.models.Reminder;
import com.microsoft.graph.models.DeviceAndAppManagementData;
import com.microsoft.graph.models.ManagedAppDiagnosticStatus;
import com.microsoft.graph.models.ManagedAppPolicy;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.UserCollectionResponse;
import com.microsoft.graph.requests.UserCollectionRequestBuilder;
import com.microsoft.graph.requests.UserCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Collection Request.
 */
public class UserCollectionRequest extends BaseEntityCollectionRequest<User, UserCollectionResponse, UserCollectionPage> {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserCollectionResponse.class, UserCollectionPage.class, UserCollectionRequestBuilder.class);
    }

    /**
     * Creates a new User
     * @param newUser the User to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<User> postAsync(@Nonnull final User newUser) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newUser);
    }

    /**
     * Creates a new User
     * @param newUser the User to create
     * @return the newly created object
     */
    @Nonnull
    public User post(@Nonnull final User newUser) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUser);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public UserCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public UserCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public UserCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public UserCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public UserCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public UserCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public UserCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public UserCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public UserCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

