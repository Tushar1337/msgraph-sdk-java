package com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentscheduleinstances.item;

import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentscheduleinstances.item.activatedusing.ActivatedUsingRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentscheduleinstances.item.group.GroupRequestBuilder;
import com.microsoft.graph.identitygovernance.privilegedaccess.group.assignmentscheduleinstances.item.principal.PrincipalRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PrivilegedAccessGroupAssignmentScheduleInstance;
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
 * Provides operations to manage the assignmentScheduleInstances property of the microsoft.graph.privilegedAccessGroup entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the activatedUsing property of the microsoft.graph.privilegedAccessGroupAssignmentScheduleInstance entity.
     * @return a {@link ActivatedUsingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivatedUsingRequestBuilder activatedUsing() {
        return new ActivatedUsingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the group property of the microsoft.graph.privilegedAccessGroupAssignmentScheduleInstance entity.
     * @return a {@link GroupRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupRequestBuilder group() {
        return new GroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the principal property of the microsoft.graph.privilegedAccessGroupAssignmentScheduleInstance entity.
     * @return a {@link PrincipalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrincipalRequestBuilder principal() {
        return new PrincipalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/privilegedAccess/group/assignmentScheduleInstances/{privilegedAccessGroupAssignmentScheduleInstance%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/privilegedAccess/group/assignmentScheduleInstances/{privilegedAccessGroupAssignmentScheduleInstance%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property assignmentScheduleInstances for identityGovernance
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property assignmentScheduleInstances for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read the properties and relationships of a privilegedAccessGroupAssignmentScheduleInstance object.
     * @return a {@link PrivilegedAccessGroupAssignmentScheduleInstance}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/privilegedaccessgroupassignmentscheduleinstance-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentScheduleInstance get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a privilegedAccessGroupAssignmentScheduleInstance object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PrivilegedAccessGroupAssignmentScheduleInstance}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/privilegedaccessgroupassignmentscheduleinstance-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentScheduleInstance get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedAccessGroupAssignmentScheduleInstance::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property assignmentScheduleInstances in identityGovernance
     * @param body The request body
     * @return a {@link PrivilegedAccessGroupAssignmentScheduleInstance}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentScheduleInstance patch(@jakarta.annotation.Nonnull final PrivilegedAccessGroupAssignmentScheduleInstance body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property assignmentScheduleInstances in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PrivilegedAccessGroupAssignmentScheduleInstance}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessGroupAssignmentScheduleInstance patch(@jakarta.annotation.Nonnull final PrivilegedAccessGroupAssignmentScheduleInstance body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedAccessGroupAssignmentScheduleInstance::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property assignmentScheduleInstances for identityGovernance
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property assignmentScheduleInstances for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/identityGovernance/privilegedAccess/group/assignmentScheduleInstances/{privilegedAccessGroupAssignmentScheduleInstance%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Read the properties and relationships of a privilegedAccessGroupAssignmentScheduleInstance object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a privilegedAccessGroupAssignmentScheduleInstance object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property assignmentScheduleInstances in identityGovernance
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PrivilegedAccessGroupAssignmentScheduleInstance body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property assignmentScheduleInstances in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PrivilegedAccessGroupAssignmentScheduleInstance body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/identityGovernance/privilegedAccess/group/assignmentScheduleInstances/{privilegedAccessGroupAssignmentScheduleInstance%2Did}", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PrivilegedAccessGroupAssignmentScheduleInstanceItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a privilegedAccessGroupAssignmentScheduleInstance object.
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
         * @return a {@link Map<String, Object>}
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
