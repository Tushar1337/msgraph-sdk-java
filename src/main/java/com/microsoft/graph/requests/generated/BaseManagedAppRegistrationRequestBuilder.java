// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationRequest;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppOperationRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed App Registration Request Builder.
 */
public class BaseManagedAppRegistrationRequestBuilder extends BaseRequestBuilder implements IBaseManagedAppRegistrationRequestBuilder {

    /**
     * The request builder for the ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedAppRegistrationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagedAppRegistrationRequest instance
     */
    public IManagedAppRegistrationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IManagedAppRegistrationRequest instance
     */
    public IManagedAppRegistrationRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ManagedAppRegistrationRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagedAppPolicyCollectionRequestBuilder appliedPolicies() {
        return new ManagedAppPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appliedPolicies"), getClient(), null);
    }

    public IManagedAppPolicyRequestBuilder appliedPolicies(final String id) {
        return new ManagedAppPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("appliedPolicies") + "/" + id, getClient(), null);
    }
    public IManagedAppPolicyCollectionRequestBuilder intendedPolicies() {
        return new ManagedAppPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("intendedPolicies"), getClient(), null);
    }

    public IManagedAppPolicyRequestBuilder intendedPolicies(final String id) {
        return new ManagedAppPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("intendedPolicies") + "/" + id, getClient(), null);
    }
    public IManagedAppOperationCollectionRequestBuilder operations() {
        return new ManagedAppOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    public IManagedAppOperationRequestBuilder operations(final String id) {
        return new ManagedAppOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
}
