# OrganizationApi

All URIs are relative to *https://techport.nasa.gov*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInformation**](OrganizationApi.md#getInformation) | **GET** /api/organizations/{organizationId} |  |
| [**getListByName**](OrganizationApi.md#getListByName) | **GET** /api/organizations |  |
| [**listTypes**](OrganizationApi.md#listTypes) | **GET** /api/organizations/types |  |


<a name="getInformation"></a>
# **getInformation**
> OrganizationGetInformationResponse getInformation(organizationId).execute();



Get an organization and its information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NasaTechPort;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://techport.nasa.gov";
    NasaTechPort client = new NasaTechPort(configuration);
    Long organizationId = 56L; // Organization Id.
    try {
      OrganizationGetInformationResponse result = client
              .organization
              .getInformation(organizationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrganization());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationGetInformationResponse> response = client
              .organization
              .getInformation(organizationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getInformation");
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
| **organizationId** | **Long**| Organization Id. | |

### Return type

[**OrganizationGetInformationResponse**](OrganizationGetInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. Organization detailed data. |  -  |
| **0** | Error. |  -  |

<a name="getListByName"></a>
# **getListByName**
> OrganizationGetListByNameResponse getListByName().name(name).execute();



Returns a list of organizations that match a given name.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NasaTechPort;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://techport.nasa.gov";
    NasaTechPort client = new NasaTechPort(configuration);
    String name = "name_example"; // Organization Name to filter on.
    try {
      OrganizationGetListByNameResponse result = client
              .organization
              .getListByName()
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrganizations());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getListByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationGetListByNameResponse> response = client
              .organization
              .getListByName()
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getListByName");
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
| **name** | **String**| Organization Name to filter on. | [optional] |

### Return type

[**OrganizationGetListByNameResponse**](OrganizationGetListByNameResponse.md)

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

<a name="listTypes"></a>
# **listTypes**
> OrganizationListTypesResponse listTypes().execute();



Returns a list of available organization types, including set-aside and MSI types.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NasaTechPort;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://techport.nasa.gov";
    NasaTechPort client = new NasaTechPort(configuration);
    try {
      OrganizationListTypesResponse result = client
              .organization
              .listTypes()
              .execute();
      System.out.println(result);
      System.out.println(result.getOrganizations());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#listTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationListTypesResponse> response = client
              .organization
              .listTypes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#listTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrganizationListTypesResponse**](OrganizationListTypesResponse.md)

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

