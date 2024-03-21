<div align="center">

[![Visit Nasa](./header.png)](https://techport.nasa.gov&#x2F;home)

# [Nasa](https://techport.nasa.gov&#x2F;home)

TechPort RESTful API

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=NASA&serviceName=TechPort&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>nasa-tech-port-java-sdk</artifactId>
  <version>3.13.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:nasa-tech-port-java-sdk:3.13.2"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/nasa-tech-port-java-sdk-3.13.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://techport.nasa.gov*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrganizationApi* | [**getInformation**](docs/OrganizationApi.md#getInformation) | **GET** /api/organizations/{organizationId} | 
*OrganizationApi* | [**getListByName**](docs/OrganizationApi.md#getListByName) | **GET** /api/organizations | 
*OrganizationApi* | [**listTypes**](docs/OrganizationApi.md#listTypes) | **GET** /api/organizations/types | 
*ProjectApi* | [**findMatchingProjects**](docs/ProjectApi.md#findMatchingProjects) | **GET** /api/projects/search | 
*ProjectApi* | [**getInfo**](docs/ProjectApi.md#getInfo) | **GET** /api/projects/{projectId} | 
*ProjectApi* | [**listAvailableIds**](docs/ProjectApi.md#listAvailableIds) | **GET** /api/projects | 
*ResourceApi* | [**getSpecification**](docs/ResourceApi.md#getSpecification) | **GET** /api | 


## Documentation for Models

 - [Contact](docs/Contact.md)
 - [LibraryItem](docs/LibraryItem.md)
 - [LkuCode](docs/LkuCode.md)
 - [LkuCodeType](docs/LkuCodeType.md)
 - [Location](docs/Location.md)
 - [ModelFile](docs/ModelFile.md)
 - [Organization](docs/Organization.md)
 - [OrganizationGetInformationResponse](docs/OrganizationGetInformationResponse.md)
 - [OrganizationGetListByNameResponse](docs/OrganizationGetListByNameResponse.md)
 - [OrganizationListTypesResponse](docs/OrganizationListTypesResponse.md)
 - [OrganizationType](docs/OrganizationType.md)
 - [Program](docs/Program.md)
 - [Project](docs/Project.md)
 - [ProjectFindMatchingProjectsResponseInner](docs/ProjectFindMatchingProjectsResponseInner.md)
 - [ProjectListAvailableIdsResponse](docs/ProjectListAvailableIdsResponse.md)
 - [Taxonomy](docs/Taxonomy.md)
 - [TaxonomyNode](docs/TaxonomyNode.md)
 - [TechnologyArea](docs/TechnologyArea.md)
 - [TreeNode](docs/TreeNode.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
