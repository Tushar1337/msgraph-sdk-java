// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Category Collection With References Request.
 */
public class MobileAppCategoryCollectionWithReferencesRequest extends BaseCollectionRequest<MobileAppCategoryCollectionResponse, IMobileAppCategoryCollectionPage> implements IMobileAppCategoryCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of MobileAppCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppCategoryCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppCategoryCollectionResponse.class, IMobileAppCategoryCollectionPage.class);
    }

    public void get(final ICallback<IMobileAppCategoryCollectionWithReferencesPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IMobileAppCategoryCollectionWithReferencesPage get() throws ClientException {
        final MobileAppCategoryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IMobileAppCategoryCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (MobileAppCategoryCollectionWithReferencesRequest)this;
    }

    public IMobileAppCategoryCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (MobileAppCategoryCollectionWithReferencesRequest)this;
    }

    public IMobileAppCategoryCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (MobileAppCategoryCollectionWithReferencesRequest)this;
    }

    public IMobileAppCategoryCollectionWithReferencesPage buildFromResponse(final MobileAppCategoryCollectionResponse response) {
        final IMobileAppCategoryCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MobileAppCategoryCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MobileAppCategoryCollectionWithReferencesPage page = new MobileAppCategoryCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
