package com.microsoft.graph.users.item.outlook.supportedlanguages;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to call the supportedLanguages method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SupportedLanguagesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new SupportedLanguagesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SupportedLanguagesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/outlook/supportedLanguages(){?%24top,%24skip,%24search,%24filter,%24count}", pathParameters);
    }
    /**
     * Instantiates a new SupportedLanguagesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SupportedLanguagesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/outlook/supportedLanguages(){?%24top,%24skip,%24search,%24filter,%24count}", rawUrl);
    }
    /**
     * Get the list of locales and languages that are supported for the user, as configured on the user's mailbox server. When setting up an Outlook client, the user selects the preferred language from this supported list. You can subsequently get the preferred language bygetting the user's mailbox settings.
     * @return a SupportedLanguagesGetResponse
     * @see <a href="https://learn.microsoft.com/graph/api/outlookuser-supportedlanguages?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SupportedLanguagesGetResponse get() {
        return get(null);
    }
    /**
     * Get the list of locales and languages that are supported for the user, as configured on the user's mailbox server. When setting up an Outlook client, the user selects the preferred language from this supported list. You can subsequently get the preferred language bygetting the user's mailbox settings.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SupportedLanguagesGetResponse
     * @see <a href="https://learn.microsoft.com/graph/api/outlookuser-supportedlanguages?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SupportedLanguagesGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SupportedLanguagesGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Get the list of locales and languages that are supported for the user, as configured on the user's mailbox server. When setting up an Outlook client, the user selects the preferred language from this supported list. You can subsequently get the preferred language bygetting the user's mailbox settings.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the list of locales and languages that are supported for the user, as configured on the user's mailbox server. When setting up an Outlook client, the user selects the preferred language from this supported list. You can subsequently get the preferred language bygetting the user's mailbox settings.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SupportedLanguagesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SupportedLanguagesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SupportedLanguagesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the list of locales and languages that are supported for the user, as configured on the user's mailbox server. When setting up an Outlook client, the user selects the preferred language from this supported list. You can subsequently get the preferred language bygetting the user's mailbox settings.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            return allQueryParams;
        }
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
