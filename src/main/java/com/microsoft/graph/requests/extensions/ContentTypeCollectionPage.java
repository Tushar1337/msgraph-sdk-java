// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionPage;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type Collection Page.
 */
public class ContentTypeCollectionPage extends BaseCollectionPage<ContentType, IContentTypeCollectionRequestBuilder> implements IContentTypeCollectionPage {

    /**
     * A collection page for ContentType
     *
     * @param response the serialized ContentTypeCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ContentTypeCollectionPage(final ContentTypeCollectionResponse response, final IContentTypeCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
