// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.TargetedManagedAppConfigurationTargetAppsRequest;
import com.microsoft.graph.models.TargetedManagedAppConfiguration;
import com.microsoft.graph.models.ManagedMobileApp;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.TargetedManagedAppConfigurationTargetAppsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Configuration Target Apps Request Builder.
 */
public class TargetedManagedAppConfigurationTargetAppsRequestBuilder extends BaseActionRequestBuilder<TargetedManagedAppConfiguration> {

    private TargetedManagedAppConfigurationTargetAppsParameterSet body;
    /**
     * The request builder for this TargetedManagedAppConfigurationTargetApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public TargetedManagedAppConfigurationTargetAppsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final TargetedManagedAppConfigurationTargetAppsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the TargetedManagedAppConfigurationTargetAppsRequest
     *
     * @param requestOptions the options for the request
     * @return the TargetedManagedAppConfigurationTargetAppsRequest instance
     */
    @Nonnull
    public TargetedManagedAppConfigurationTargetAppsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the TargetedManagedAppConfigurationTargetAppsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the TargetedManagedAppConfigurationTargetAppsRequest instance
     */
    @Nonnull
    public TargetedManagedAppConfigurationTargetAppsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final TargetedManagedAppConfigurationTargetAppsRequest request = new TargetedManagedAppConfigurationTargetAppsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
