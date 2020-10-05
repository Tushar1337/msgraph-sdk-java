// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notification Message Template Collection Page.
 */
public class NotificationMessageTemplateCollectionPage extends BaseCollectionPage<NotificationMessageTemplate, NotificationMessageTemplateCollectionRequestBuilder> {

    /**
     * A collection page for NotificationMessageTemplate
     *
     * @param response the serialized NotificationMessageTemplateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public NotificationMessageTemplateCollectionPage(final NotificationMessageTemplateCollectionResponse response, final NotificationMessageTemplateCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
