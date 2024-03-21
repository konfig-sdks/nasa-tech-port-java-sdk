package com.konfigthis.client;

import com.konfigthis.client.api.OrganizationApi;
import com.konfigthis.client.api.ProjectApi;
import com.konfigthis.client.api.ResourceApi;

public class NasaTechPort {
    private ApiClient apiClient;
    public final OrganizationApi organization;
    public final ProjectApi project;
    public final ResourceApi resource;

    public NasaTechPort() {
        this(null);
    }

    public NasaTechPort(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.organization = new OrganizationApi(this.apiClient);
        this.project = new ProjectApi(this.apiClient);
        this.resource = new ResourceApi(this.apiClient);
    }

}
