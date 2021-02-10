// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.GroupLifecyclePolicyAddGroupRequest;
import com.microsoft.graph.models.GroupLifecyclePolicy;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.GroupLifecyclePolicyAddGroupParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Lifecycle Policy Add Group Request Builder.
 */
public class GroupLifecyclePolicyAddGroupRequestBuilder extends BaseActionRequestBuilder<Boolean> {

    private GroupLifecyclePolicyAddGroupParameterSet body;
    /**
     * The request builder for this GroupLifecyclePolicyAddGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public GroupLifecyclePolicyAddGroupRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final GroupLifecyclePolicyAddGroupParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the GroupLifecyclePolicyAddGroupRequest
     *
     * @param requestOptions the options for the request
     * @return the GroupLifecyclePolicyAddGroupRequest instance
     */
    @Nonnull
    public GroupLifecyclePolicyAddGroupRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the GroupLifecyclePolicyAddGroupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the GroupLifecyclePolicyAddGroupRequest instance
     */
    @Nonnull
    public GroupLifecyclePolicyAddGroupRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final GroupLifecyclePolicyAddGroupRequest request = new GroupLifecyclePolicyAddGroupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
