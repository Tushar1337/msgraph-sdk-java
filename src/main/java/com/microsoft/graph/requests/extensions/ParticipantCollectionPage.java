// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Participant;
import com.microsoft.graph.requests.extensions.ParticipantCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ParticipantCollectionPage;
import com.microsoft.graph.requests.extensions.ParticipantCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Collection Page.
 */
public class ParticipantCollectionPage extends BaseCollectionPage<Participant, ParticipantCollectionRequestBuilder> {

    /**
     * A collection page for Participant
     *
     * @param response the serialized ParticipantCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ParticipantCollectionPage(@Nonnull final ParticipantCollectionResponse response, @Nonnull final ParticipantCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
