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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResourceApi
 */
@Disabled
public class ResourceApiTest {

    private static ResourceApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ResourceApi(apiClient);
    }

    /**
     * Returns the swagger specification for the API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificationTest() throws ApiException {
        api.getSpecification()
                .execute();
        // TODO: test validations
    }

}
