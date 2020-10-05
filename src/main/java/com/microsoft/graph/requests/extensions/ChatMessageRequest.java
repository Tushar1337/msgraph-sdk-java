// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.requests.extensions.ChatMessageHostedContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatMessageHostedContentRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatMessageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Request.
 */
public class ChatMessageRequest extends BaseRequest {
	
    /**
     * The request for the ChatMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatMessageRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChatMessage.class);
    }

    /**
     * Gets the ChatMessage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ChatMessage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ChatMessage from the service
     *
     * @return the ChatMessage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChatMessage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ChatMessage> callback) {
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
     * Patches this ChatMessage with a source
     *
     * @param sourceChatMessage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ChatMessage sourceChatMessage, final ICallback<? super ChatMessage> callback) {
        send(HttpMethod.PATCH, callback, sourceChatMessage);
    }

    /**
     * Patches this ChatMessage with a source
     *
     * @param sourceChatMessage the source object with updates
     * @return the updated ChatMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChatMessage patch(final ChatMessage sourceChatMessage) throws ClientException {
        return send(HttpMethod.PATCH, sourceChatMessage);
    }

    /**
     * Creates a ChatMessage with a new object
     *
     * @param newChatMessage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ChatMessage newChatMessage, final ICallback<? super ChatMessage> callback) {
        send(HttpMethod.POST, callback, newChatMessage);
    }

    /**
     * Creates a ChatMessage with a new object
     *
     * @param newChatMessage the new object to create
     * @return the created ChatMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChatMessage post(final ChatMessage newChatMessage) throws ClientException {
        return send(HttpMethod.POST, newChatMessage);
    }

    /**
     * Creates a ChatMessage with a new object
     *
     * @param newChatMessage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ChatMessage newChatMessage, final ICallback<? super ChatMessage> callback) {
        send(HttpMethod.PUT, callback, newChatMessage);
    }

    /**
     * Creates a ChatMessage with a new object
     *
     * @param newChatMessage the object to create/update
     * @return the created ChatMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChatMessage put(final ChatMessage newChatMessage) throws ClientException {
        return send(HttpMethod.PUT, newChatMessage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ChatMessageRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ChatMessageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ChatMessageRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ChatMessageRequest)this;
     }

}

