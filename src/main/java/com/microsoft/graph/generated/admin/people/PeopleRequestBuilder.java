package com.microsoft.graph.admin.people;

import com.microsoft.graph.admin.people.profilecardproperties.ProfileCardPropertiesRequestBuilder;
import com.microsoft.graph.admin.people.pronouns.PronounsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PeopleAdminSettings;
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
 * Provides operations to manage the people property of the microsoft.graph.admin entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PeopleRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the profileCardProperties property of the microsoft.graph.peopleAdminSettings entity.
     */
    @jakarta.annotation.Nonnull
    public ProfileCardPropertiesRequestBuilder profileCardProperties() {
        return new ProfileCardPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the pronouns property of the microsoft.graph.peopleAdminSettings entity.
     */
    @jakarta.annotation.Nonnull
    public PronounsRequestBuilder pronouns() {
        return new PronounsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new PeopleRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PeopleRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/people{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PeopleRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PeopleRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/people{?%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve the properties and relationships of a peopleAdminSettings object.
     * @return a PeopleAdminSettings
     * @see <a href="https://learn.microsoft.com/graph/api/peopleadminsettings-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PeopleAdminSettings get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of a peopleAdminSettings object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PeopleAdminSettings
     * @see <a href="https://learn.microsoft.com/graph/api/peopleadminsettings-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PeopleAdminSettings get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PeopleAdminSettings::createFromDiscriminatorValue);
    }
    /**
     * Retrieve the properties and relationships of a peopleAdminSettings object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a peopleAdminSettings object.
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
     * @return a PeopleRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PeopleRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PeopleRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve the properties and relationships of a peopleAdminSettings object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
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
