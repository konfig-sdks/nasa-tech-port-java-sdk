# ResourceApi

All URIs are relative to *https://techport.nasa.gov*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSpecification**](ResourceApi.md#getSpecification) | **GET** /api |  |


<a name="getSpecification"></a>
# **getSpecification**
> getSpecification().execute();



Returns the swagger specification for the API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.NasaTechPort;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ResourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://techport.nasa.gov";
    NasaTechPort client = new NasaTechPort(configuration);
    try {
      client
              .resource
              .getSpecification()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceApi#getSpecification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .resource
              .getSpecification()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourceApi#getSpecification");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Object not found. |  -  |

