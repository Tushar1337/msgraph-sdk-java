package com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.userprocessingresults.item;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.userprocessingresults.item.subject.SubjectRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.userprocessingresults.item.taskprocessingresults.TaskProcessingResultsRequestBuilder;
import com.microsoft.graph.models.identitygovernance.UserProcessingResult;
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
 * Provides operations to manage the userProcessingResults property of the microsoft.graph.identityGovernance.workflow entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserProcessingResultItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the subject property of the microsoft.graph.identityGovernance.userProcessingResult entity.
     */
    @jakarta.annotation.Nonnull
    public SubjectRequestBuilder subject() {
        return new SubjectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the taskProcessingResults property of the microsoft.graph.identityGovernance.userProcessingResult entity.
     */
    @jakarta.annotation.Nonnull
    public TaskProcessingResultsRequestBuilder taskProcessingResults() {
        return new TaskProcessingResultsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UserProcessingResultItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserProcessingResultItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/userProcessingResults/{userProcessingResult%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UserProcessingResultItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserProcessingResultItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/userProcessingResults/{userProcessingResult%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Per-user workflow execution results.
     * @return a CompletableFuture of userProcessingResult
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserProcessingResult> get() {
        return get(null);
    }
    /**
     * Per-user workflow execution results.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of userProcessingResult
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserProcessingResult> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UserProcessingResult::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Per-user workflow execution results.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Per-user workflow execution results.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a UserProcessingResultItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UserProcessingResultItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserProcessingResultItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Per-user workflow execution results.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
