// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Organization;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseCollectionReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Based Auth Configuration Collection Reference Request Builder.
 */
public class CertificateBasedAuthConfigurationCollectionReferenceRequestBuilder extends BaseCollectionReferenceRequestBuilder<CertificateBasedAuthConfiguration, CertificateBasedAuthConfigurationReferenceRequestBuilder, CertificateBasedAuthConfigurationCollectionResponse, CertificateBasedAuthConfigurationCollectionWithReferencesPage, CertificateBasedAuthConfigurationCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of CertificateBasedAuthConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CertificateBasedAuthConfigurationCollectionReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CertificateBasedAuthConfigurationReferenceRequestBuilder.class, CertificateBasedAuthConfigurationCollectionWithReferencesRequest.class);
    }
}
