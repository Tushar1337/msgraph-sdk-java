// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Definition With Reference Request.
 */
public class TeamsAppDefinitionWithReferenceRequest extends BaseRequest {

    /**
     * The request for the TeamsAppDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppDefinitionWithReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppDefinition.class);
    }

    public void post(@Nonnull final TeamsAppDefinition newTeamsAppDefinition, @Nullable final IJsonBackedObject payload, @Nonnull final ICallback<? super TeamsAppDefinition> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    @Nullable
    public TeamsAppDefinition post(@Nonnull final TeamsAppDefinition newTeamsAppDefinition, @Nullable final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newTeamsAppDefinition;
        }
        return null;
    }

    public void get(@Nonnull final ICallback<? super TeamsAppDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    @Nullable
    public TeamsAppDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(@Nonnull final ICallback<? super TeamsAppDefinition> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(@Nonnull final TeamsAppDefinition sourceTeamsAppDefinition, @Nonnull final ICallback<? super TeamsAppDefinition> callback) {
		send(HttpMethod.PATCH, callback, sourceTeamsAppDefinition);
	}

    @Nullable
	public TeamsAppDefinition patch(@Nonnull final TeamsAppDefinition sourceTeamsAppDefinition) throws ClientException {
		return send(HttpMethod.PATCH, sourceTeamsAppDefinition);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public TeamsAppDefinitionWithReferenceRequest select(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TeamsAppDefinitionWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public TeamsAppDefinitionWithReferenceRequest expand(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TeamsAppDefinitionWithReferenceRequest)this;
    }
}
