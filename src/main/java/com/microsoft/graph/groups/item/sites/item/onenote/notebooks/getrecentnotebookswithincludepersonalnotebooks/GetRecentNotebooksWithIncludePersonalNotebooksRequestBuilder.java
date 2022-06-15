package microsoft.graph.groups.item.sites.item.onenote.notebooks.getrecentnotebookswithincludepersonalnotebooks;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to call the getRecentNotebooks method. */
public class GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilder {
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Instantiates a new GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilder and sets the default values.
     * @param includePersonalNotebooks Usage: includePersonalNotebooks={includePersonalNotebooks}
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter, @javax.annotation.Nullable final Boolean includePersonalNotebooks) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/onenote/notebooks/microsoft.graph.getRecentNotebooks(includePersonalNotebooks={includePersonalNotebooks})";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        urlTplParams.put("includePersonalNotebooks", includePersonalNotebooks);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/onenote/notebooks/microsoft.graph.getRecentNotebooks(includePersonalNotebooks={includePersonalNotebooks})";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Invoke function getRecentNotebooks
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Invoke function getRecentNotebooks
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilderGetRequestConfiguration requestConfig = new GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Invoke function getRecentNotebooks
     * @return a CompletableFuture of getRecentNotebooksWithIncludePersonalNotebooksResponse
     */
    public java.util.concurrent.CompletableFuture<GetRecentNotebooksWithIncludePersonalNotebooksResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, GetRecentNotebooksWithIncludePersonalNotebooksResponse::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function getRecentNotebooks
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of getRecentNotebooksWithIncludePersonalNotebooksResponse
     */
    public java.util.concurrent.CompletableFuture<GetRecentNotebooksWithIncludePersonalNotebooksResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, GetRecentNotebooksWithIncludePersonalNotebooksResponse::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Invoke function getRecentNotebooks
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of getRecentNotebooksWithIncludePersonalNotebooksResponse
     */
    public java.util.concurrent.CompletableFuture<GetRecentNotebooksWithIncludePersonalNotebooksResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, GetRecentNotebooksWithIncludePersonalNotebooksResponse::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new getRecentNotebooksWithIncludePersonalNotebooksRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public GetRecentNotebooksWithIncludePersonalNotebooksRequestBuilderGetRequestConfiguration() {
        }
    }
}
