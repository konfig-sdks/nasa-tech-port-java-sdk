/*
 * TechPort
 * TechPort RESTful API
 *
 * The version of the OpenAPI document: 3.13.2
 * Contact: hq-techport@mail.nasa.gov
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.time.LocalDate;
import com.konfigthis.client.model.Project;
import com.konfigthis.client.model.ProjectFindMatchingProjectsResponseInner;
import com.konfigthis.client.model.ProjectListAvailableIdsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProjectApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProjectApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call findMatchingProjectsCall(Long projectId, String searchQuery, String missionDirectorate, String program, String titleSearch, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/projects/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (projectId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("projectId", projectId));
        }

        if (searchQuery != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchQuery", searchQuery));
        }

        if (missionDirectorate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("missionDirectorate", missionDirectorate));
        }

        if (program != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("program", program));
        }

        if (titleSearch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("titleSearch", titleSearch));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findMatchingProjectsValidateBeforeCall(Long projectId, String searchQuery, String missionDirectorate, String program, String titleSearch, final ApiCallback _callback) throws ApiException {
        return findMatchingProjectsCall(projectId, searchQuery, missionDirectorate, program, titleSearch, _callback);

    }


    private ApiResponse<List<ProjectFindMatchingProjectsResponseInner>> findMatchingProjectsWithHttpInfo(Long projectId, String searchQuery, String missionDirectorate, String program, String titleSearch) throws ApiException {
        okhttp3.Call localVarCall = findMatchingProjectsValidateBeforeCall(projectId, searchQuery, missionDirectorate, program, titleSearch, null);
        Type localVarReturnType = new TypeToken<List<ProjectFindMatchingProjectsResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call findMatchingProjectsAsync(Long projectId, String searchQuery, String missionDirectorate, String program, String titleSearch, final ApiCallback<List<ProjectFindMatchingProjectsResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = findMatchingProjectsValidateBeforeCall(projectId, searchQuery, missionDirectorate, program, titleSearch, _callback);
        Type localVarReturnType = new TypeToken<List<ProjectFindMatchingProjectsResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class FindMatchingProjectsRequestBuilder {
        private Long projectId;
        private String searchQuery;
        private String missionDirectorate;
        private String program;
        private String titleSearch;

        private FindMatchingProjectsRequestBuilder() {
        }

        /**
         * Set projectId
         * @param projectId The specific ID of the project requested. (optional)
         * @return FindMatchingProjectsRequestBuilder
         */
        public FindMatchingProjectsRequestBuilder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        
        /**
         * Set searchQuery
         * @param searchQuery The term on which to search. Will check all project fields for the this term. (optional)
         * @return FindMatchingProjectsRequestBuilder
         */
        public FindMatchingProjectsRequestBuilder searchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }
        
        /**
         * Set missionDirectorate
         * @param missionDirectorate The mission directorate acronym of the projects. Used to filter. (optional)
         * @return FindMatchingProjectsRequestBuilder
         */
        public FindMatchingProjectsRequestBuilder missionDirectorate(String missionDirectorate) {
            this.missionDirectorate = missionDirectorate;
            return this;
        }
        
        /**
         * Set program
         * @param program The program acronym of the projects. Used to filter. (optional)
         * @return FindMatchingProjectsRequestBuilder
         */
        public FindMatchingProjectsRequestBuilder program(String program) {
            this.program = program;
            return this;
        }
        
        /**
         * Set titleSearch
         * @param titleSearch The term on which to search. Will check only project titles for the this term. (optional)
         * @return FindMatchingProjectsRequestBuilder
         */
        public FindMatchingProjectsRequestBuilder titleSearch(String titleSearch) {
            this.titleSearch = titleSearch;
            return this;
        }
        
        /**
         * Build call for findMatchingProjects
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return findMatchingProjectsCall(projectId, searchQuery, missionDirectorate, program, titleSearch, _callback);
        }


        /**
         * Execute findMatchingProjects request
         * @return List&lt;ProjectFindMatchingProjectsResponseInner&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public List<ProjectFindMatchingProjectsResponseInner> execute() throws ApiException {
            ApiResponse<List<ProjectFindMatchingProjectsResponseInner>> localVarResp = findMatchingProjectsWithHttpInfo(projectId, searchQuery, missionDirectorate, program, titleSearch);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute findMatchingProjects request with HTTP info returned
         * @return ApiResponse&lt;List&lt;ProjectFindMatchingProjectsResponseInner&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<ProjectFindMatchingProjectsResponseInner>> executeWithHttpInfo() throws ApiException {
            return findMatchingProjectsWithHttpInfo(projectId, searchQuery, missionDirectorate, program, titleSearch);
        }

        /**
         * Execute findMatchingProjects request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<ProjectFindMatchingProjectsResponseInner>> _callback) throws ApiException {
            return findMatchingProjectsAsync(projectId, searchQuery, missionDirectorate, program, titleSearch, _callback);
        }
    }

    /**
     * 
     * Returns a list of projects matching the search term.
     * @return FindMatchingProjectsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
     </table>
     */
    public FindMatchingProjectsRequestBuilder findMatchingProjects() throws IllegalArgumentException {
        return new FindMatchingProjectsRequestBuilder();
    }
    private okhttp3.Call getInfoCall(Long projectId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/projects/{projectId}"
            .replace("{" + "projectId" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInfoValidateBeforeCall(Long projectId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getInfo(Async)");
        }

        return getInfoCall(projectId, _callback);

    }


    private ApiResponse<Project> getInfoWithHttpInfo(Long projectId) throws ApiException {
        okhttp3.Call localVarCall = getInfoValidateBeforeCall(projectId, null);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getInfoAsync(Long projectId, final ApiCallback<Project> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInfoValidateBeforeCall(projectId, _callback);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetInfoRequestBuilder {
        private final Long projectId;

        private GetInfoRequestBuilder(Long projectId) {
            this.projectId = projectId;
        }

        /**
         * Build call for getInfo
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getInfoCall(projectId, _callback);
        }


        /**
         * Execute getInfo request
         * @return Project
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public Project execute() throws ApiException {
            ApiResponse<Project> localVarResp = getInfoWithHttpInfo(projectId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getInfo request with HTTP info returned
         * @return ApiResponse&lt;Project&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Project> executeWithHttpInfo() throws ApiException {
            return getInfoWithHttpInfo(projectId);
        }

        /**
         * Execute getInfo request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Project> _callback) throws ApiException {
            return getInfoAsync(projectId, _callback);
        }
    }

    /**
     * 
     * Returns information about a specific technology project.
     * @param projectId ID of project to fetch (required)
     * @return GetInfoRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
     </table>
     */
    public GetInfoRequestBuilder getInfo(Long projectId) throws IllegalArgumentException {
        if (projectId == null) throw new IllegalArgumentException("\"projectId\" is required but got null");
        return new GetInfoRequestBuilder(projectId);
    }
    private okhttp3.Call listAvailableIdsCall(LocalDate updatedSince, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/projects";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (updatedSince != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("updatedSince", updatedSince));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAvailableIdsValidateBeforeCall(LocalDate updatedSince, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'updatedSince' is set
        if (updatedSince == null) {
            throw new ApiException("Missing the required parameter 'updatedSince' when calling listAvailableIds(Async)");
        }

        return listAvailableIdsCall(updatedSince, _callback);

    }


    private ApiResponse<ProjectListAvailableIdsResponse> listAvailableIdsWithHttpInfo(LocalDate updatedSince) throws ApiException {
        okhttp3.Call localVarCall = listAvailableIdsValidateBeforeCall(updatedSince, null);
        Type localVarReturnType = new TypeToken<ProjectListAvailableIdsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAvailableIdsAsync(LocalDate updatedSince, final ApiCallback<ProjectListAvailableIdsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAvailableIdsValidateBeforeCall(updatedSince, _callback);
        Type localVarReturnType = new TypeToken<ProjectListAvailableIdsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAvailableIdsRequestBuilder {
        private final LocalDate updatedSince;

        private ListAvailableIdsRequestBuilder(LocalDate updatedSince) {
            this.updatedSince = updatedSince;
        }

        /**
         * Build call for listAvailableIds
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listAvailableIdsCall(updatedSince, _callback);
        }


        /**
         * Execute listAvailableIds request
         * @return ProjectListAvailableIdsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public ProjectListAvailableIdsResponse execute() throws ApiException {
            ApiResponse<ProjectListAvailableIdsResponse> localVarResp = listAvailableIdsWithHttpInfo(updatedSince);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAvailableIds request with HTTP info returned
         * @return ApiResponse&lt;ProjectListAvailableIdsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ProjectListAvailableIdsResponse> executeWithHttpInfo() throws ApiException {
            return listAvailableIdsWithHttpInfo(updatedSince);
        }

        /**
         * Execute listAvailableIds request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ProjectListAvailableIdsResponse> _callback) throws ApiException {
            return listAvailableIdsAsync(updatedSince, _callback);
        }
    }

    /**
     * 
     * Returns a list of available technology project IDs.
     * @param updatedSince ISO 8601 full-date in the format YYYY-MM-DD. Filters the list of available ID values by their lastUpdated parameter. (required)
     * @return ListAvailableIdsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Object not found. </td><td>  -  </td></tr>
     </table>
     */
    public ListAvailableIdsRequestBuilder listAvailableIds(LocalDate updatedSince) throws IllegalArgumentException {
        if (updatedSince == null) throw new IllegalArgumentException("\"updatedSince\" is required but got null");
        return new ListAvailableIdsRequestBuilder(updatedSince);
    }
}
