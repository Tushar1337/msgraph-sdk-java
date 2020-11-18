// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.requests.extensions.SiteGetByPathRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Get By Path Request.
 */
public class SiteGetByPathRequest extends BaseRequest {

    /**
     * The request for this SiteGetByPath
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteGetByPathRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Site.class);
    }

    /**
     * Patches the SiteGetByPath
     * @param srcSite the Site with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull Site srcSite, @Nonnull final ICallback<? super Site> callback) {
        send(HttpMethod.PATCH, callback, srcSite);
    }

    /**
     * Patches the SiteGetByPath
     *
     * @param srcSite the Site with which to PATCH
     * @return the Site
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public Site patch(@Nonnull final Site srcSite) throws ClientException {
        return this.send(HttpMethod.PATCH, srcSite);
    }

    /**
     * Puts the SiteGetByPath
     *
     * @param srcSite the Site to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Site srcSite, @Nonnull final ICallback<? super Site> callback) {
        send(HttpMethod.PUT, callback, srcSite);
    }

    /**
     * Puts the SiteGetByPath
     *
     * @param srcSite the Site to PUT
     * @return the Site
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public Site put(@Nonnull final Site srcSite) throws ClientException {
        return this.send(HttpMethod.PUT, srcSite);
    }
    /**
     * Gets the Site
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Site> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Site
     *
     * @return the Site
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public Site get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public SiteGetByPathRequest select(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SiteGetByPathRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public SiteGetByPathRequest expand(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SiteGetByPathRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public SiteGetByPathRequest filter(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (SiteGetByPathRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public SiteGetByPathRequest orderBy(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (SiteGetByPathRequest)this;
    }

}
