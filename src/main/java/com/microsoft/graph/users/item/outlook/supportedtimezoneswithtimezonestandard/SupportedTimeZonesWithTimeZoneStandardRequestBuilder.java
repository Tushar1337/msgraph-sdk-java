package com.microsoft.graph.users.item.outlook.supportedtimezoneswithtimezonestandard;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the supportedTimeZones method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SupportedTimeZonesWithTimeZoneStandardRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new SupportedTimeZonesWithTimeZoneStandardRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param TimeZoneStandard Usage: TimeZoneStandard='{TimeZoneStandard}'
     */
    public SupportedTimeZonesWithTimeZoneStandardRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String TimeZoneStandard) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/outlook/supportedTimeZones(TimeZoneStandard='{TimeZoneStandard}'){?%24top,%24skip,%24search,%24filter,%24count}", pathParameters);
        this.pathParameters.put("TimeZoneStandard", TimeZoneStandard);
    }
    /**
     * Instantiates a new SupportedTimeZonesWithTimeZoneStandardRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SupportedTimeZonesWithTimeZoneStandardRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/outlook/supportedTimeZones(TimeZoneStandard='{TimeZoneStandard}'){?%24top,%24skip,%24search,%24filter,%24count}", rawUrl);
    }
    /**
     * Invoke function supportedTimeZones
     * @return a CompletableFuture of SupportedTimeZonesWithTimeZoneStandardGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SupportedTimeZonesWithTimeZoneStandardGetResponse> get() {
        return get(null);
    }
    /**
     * Invoke function supportedTimeZones
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of SupportedTimeZonesWithTimeZoneStandardGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SupportedTimeZonesWithTimeZoneStandardGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, SupportedTimeZonesWithTimeZoneStandardGetResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Invoke function supportedTimeZones
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function supportedTimeZones
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SupportedTimeZonesWithTimeZoneStandardRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SupportedTimeZonesWithTimeZoneStandardRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SupportedTimeZonesWithTimeZoneStandardRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Invoke function supportedTimeZones
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
