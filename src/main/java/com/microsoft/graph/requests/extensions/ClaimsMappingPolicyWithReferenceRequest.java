// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
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
 * The class for the Claims Mapping Policy With Reference Request.
 */
public class ClaimsMappingPolicyWithReferenceRequest extends BaseRequest {

    /**
     * The request for the ClaimsMappingPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ClaimsMappingPolicyWithReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ClaimsMappingPolicy.class);
    }

    public void post(@Nonnull final ClaimsMappingPolicy newClaimsMappingPolicy, @Nullable final IJsonBackedObject payload, @Nonnull final ICallback<? super ClaimsMappingPolicy> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    @Nullable
    public ClaimsMappingPolicy post(@Nonnull final ClaimsMappingPolicy newClaimsMappingPolicy, @Nullable final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newClaimsMappingPolicy;
        }
        return null;
    }

    public void get(@Nonnull final ICallback<? super ClaimsMappingPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    @Nullable
    public ClaimsMappingPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(@Nonnull final ICallback<? super ClaimsMappingPolicy> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(@Nonnull final ClaimsMappingPolicy sourceClaimsMappingPolicy, @Nonnull final ICallback<? super ClaimsMappingPolicy> callback) {
		send(HttpMethod.PATCH, callback, sourceClaimsMappingPolicy);
	}

    @Nullable
	public ClaimsMappingPolicy patch(@Nonnull final ClaimsMappingPolicy sourceClaimsMappingPolicy) throws ClientException {
		return send(HttpMethod.PATCH, sourceClaimsMappingPolicy);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ClaimsMappingPolicyWithReferenceRequest select(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ClaimsMappingPolicyWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ClaimsMappingPolicyWithReferenceRequest expand(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ClaimsMappingPolicyWithReferenceRequest)this;
    }
}
