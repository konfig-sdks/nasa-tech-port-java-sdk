# ProjectApi

All URIs are relative to *https://techport.nasa.gov*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findMatchingProjects**](ProjectApi.md#findMatchingProjects) | **GET** /api/projects/search |  |
| [**getInfo**](ProjectApi.md#getInfo) | **GET** /api/projects/{projectId} |  |
| [**listAvailableIds**](ProjectApi.md#listAvailableIds) | **GET** /api/projects |  |


<a name="findMatchingProjects"></a>
# **findMatchingProjects**
> List&lt;ProjectFindMatchingProjectsResponseInner&gt; findMatchingProjects().projectId(projectId).searchQuery(searchQuery).missionDirectorate(missionDirectorate).program(program).titleSearch(titleSearch).execute();



Returns a list of projects matching the search term.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NasaTechPort;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://techport.nasa.gov";
    NasaTechPort client = new NasaTechPort(configuration);
    Long projectId = 56L; // The specific ID of the project requested.
    String searchQuery = "searchQuery_example"; // The term on which to search. Will check all project fields for the this term.
    String missionDirectorate = "missionDirectorate_example"; // The mission directorate acronym of the projects. Used to filter.
    String program = "program_example"; // The program acronym of the projects. Used to filter.
    String titleSearch = "titleSearch_example"; // The term on which to search. Will check only project titles for the this term.
    try {
      List<ProjectFindMatchingProjectsResponseInner> result = client
              .project
              .findMatchingProjects()
              .projectId(projectId)
              .searchQuery(searchQuery)
              .missionDirectorate(missionDirectorate)
              .program(program)
              .titleSearch(titleSearch)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#findMatchingProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ProjectFindMatchingProjectsResponseInner>> response = client
              .project
              .findMatchingProjects()
              .projectId(projectId)
              .searchQuery(searchQuery)
              .missionDirectorate(missionDirectorate)
              .program(program)
              .titleSearch(titleSearch)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#findMatchingProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Long**| The specific ID of the project requested. | [optional] |
| **searchQuery** | **String**| The term on which to search. Will check all project fields for the this term. | [optional] |
| **missionDirectorate** | **String**| The mission directorate acronym of the projects. Used to filter. | [optional] |
| **program** | **String**| The program acronym of the projects. Used to filter. | [optional] |
| **titleSearch** | **String**| The term on which to search. Will check only project titles for the this term. | [optional] |

### Return type

[**List&lt;ProjectFindMatchingProjectsResponseInner&gt;**](ProjectFindMatchingProjectsResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Object not found. |  -  |

<a name="getInfo"></a>
# **getInfo**
> Project getInfo(projectId).execute();



Returns information about a specific technology project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NasaTechPort;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://techport.nasa.gov";
    NasaTechPort client = new NasaTechPort(configuration);
    Long projectId = 56L; // ID of project to fetch
    try {
      Project result = client
              .project
              .getInfo(projectId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getProjectId());
      System.out.println(result.getLastUpdated());
      System.out.println(result.getAcronym());
      System.out.println(result.getStatusDescription());
      System.out.println(result.getBenefits());
      System.out.println(result.getStartDateString());
      System.out.println(result.getEndDateString());
      System.out.println(result.getStartTrl());
      System.out.println(result.getCurrentTrl());
      System.out.println(result.getEndTrl());
      System.out.println(result.getPrimaryTaxonomyNodes());
      System.out.println(result.getAdditionalTaxonomyNodes());
      System.out.println(result.getDestinations());
      System.out.println(result.getProgram());
      System.out.println(result.getResponsibleMd());
      System.out.println(result.getLeadOrganization());
      System.out.println(result.getSupportingOrganizations());
      System.out.println(result.getCoFundingPartners());
      System.out.println(result.getStatesWithWork());
      System.out.println(result.getProgramDirectors());
      System.out.println(result.getProgramManagers());
      System.out.println(result.getProjectManagers());
      System.out.println(result.getPrincipalInvestigators());
      System.out.println(result.getCoInvestigators());
      System.out.println(result.getWebsite());
      System.out.println(result.getLibraryItems());
      System.out.println(result.getStiDaas());
      System.out.println(result.getCloseoutSummary());
      System.out.println(result.getCloseoutDocuments());
      System.out.println(result.getPrimaryImage());
      System.out.println(result.getViewCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Project> response = client
              .project
              .getInfo(projectId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **projectId** | **Long**| ID of project to fetch | |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Object not found. |  -  |

<a name="listAvailableIds"></a>
# **listAvailableIds**
> ProjectListAvailableIdsResponse listAvailableIds(updatedSince).execute();



Returns a list of available technology project IDs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NasaTechPort;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://techport.nasa.gov";
    NasaTechPort client = new NasaTechPort(configuration);
    LocalDate updatedSince = LocalDate.now(); // ISO 8601 full-date in the format YYYY-MM-DD. Filters the list of available ID values by their lastUpdated parameter.
    try {
      ProjectListAvailableIdsResponse result = client
              .project
              .listAvailableIds(updatedSince)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getLastUpdated());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#listAvailableIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectListAvailableIdsResponse> response = client
              .project
              .listAvailableIds(updatedSince)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#listAvailableIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updatedSince** | **LocalDate**| ISO 8601 full-date in the format YYYY-MM-DD. Filters the list of available ID values by their lastUpdated parameter. | |

### Return type

[**ProjectListAvailableIdsResponse**](ProjectListAvailableIdsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Object not found. |  -  |

