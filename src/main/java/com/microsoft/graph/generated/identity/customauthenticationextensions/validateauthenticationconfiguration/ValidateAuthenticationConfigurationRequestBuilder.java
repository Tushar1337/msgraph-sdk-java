package com.microsoft.graph.identity.customauthenticationextensions.validateauthenticationconfiguration;

import com.microsoft.graph.models.AuthenticationConfigurationValidation;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the validateAuthenticationConfiguration method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ValidateAuthenticationConfigurationRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ValidateAuthenticationConfigurationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ValidateAuthenticationConfigurationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/customAuthenticationExtensions/validateAuthenticationConfiguration", pathParameters);
    }
    /**
     * Instantiates a new {@link ValidateAuthenticationConfigurationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ValidateAuthenticationConfigurationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/customAuthenticationExtensions/validateAuthenticationConfiguration", rawUrl);
    }
    /**
     * Invoke action validateAuthenticationConfiguration
     * @param body The request body
     * @return a {@link AuthenticationConfigurationValidation}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuthenticationConfigurationValidation post(@jakarta.annotation.Nonnull final ValidateAuthenticationConfigurationPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Invoke action validateAuthenticationConfiguration
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AuthenticationConfigurationValidation}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuthenticationConfigurationValidation post(@jakarta.annotation.Nonnull final ValidateAuthenticationConfigurationPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AuthenticationConfigurationValidation::createFromDiscriminatorValue);
    }
    /**
     * Invoke action validateAuthenticationConfiguration
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ValidateAuthenticationConfigurationPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Invoke action validateAuthenticationConfiguration
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ValidateAuthenticationConfigurationPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ValidateAuthenticationConfigurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ValidateAuthenticationConfigurationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ValidateAuthenticationConfigurationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
