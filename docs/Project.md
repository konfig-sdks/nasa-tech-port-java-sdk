

# Project

Top-level TechPort object representing a NASA technology project and its associated data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title of the project. |  [optional] |
|**description** | **String** | A detailed description of the project. |  [optional] |
|**projectId** | **Long** | Unique identifier for the project. |  [optional] |
|**lastUpdated** | **LocalDate** | ISO 8601 full-date in the format YYYY-MM-DD describing the last time this project was updated. |  [optional] |
|**acronym** | **String** | Abbreviated name of the project. |  [optional] |
|**statusDescription** | **String** | Indicates whether the project is currently active, completed, or canceled. |  [optional] |
|**benefits** | **String** | Describes the benefits offered to NASA funded and planned missions, unfunded or planned missions, commercial space industry, and to the nation. |  [optional] |
|**startDateString** | **String** | The month and year the project was authorized to proceed. |  [optional] |
|**endDateString** | **String** | The month and year the project is expected to complete its work. |  [optional] |
|**startTrl** | **Long** | The technology maturity (technology readiness level) of the project at its beginning. |  [optional] |
|**currentTrl** | **Long** | The current technology maturity (technology readiness level) of the project. |  [optional] |
|**endTrl** | **Long** | The estimated technology maturity (technology readiness level) of the project at its end. |  [optional] |
|**primaryTaxonomyNodes** | [**List&lt;TaxonomyNode&gt;**](TaxonomyNode.md) | List of primary taxonomy nodes (from the NASA Technology Roadmap) associated with the project. |  [optional] |
|**additionalTaxonomyNodes** | [**List&lt;TaxonomyNode&gt;**](TaxonomyNode.md) | List of additional and cross-cutting taxonomy nodes associated with the project. |  [optional] |
|**destinations** | [**List&lt;LkuCode&gt;**](LkuCode.md) | List of the NASA destinations the technology on this project helps achieve. |  [optional] |
|**program** | **Program** |  |  [optional] |
|**responsibleMd** | **Program** |  |  [optional] |
|**leadOrganization** | **Organization** |  |  [optional] |
|**supportingOrganizations** | [**List&lt;Organization&gt;**](Organization.md) | The supporting organizations for this project that are conducting work on the project. |  [optional] |
|**coFundingPartners** | [**List&lt;Organization&gt;**](Organization.md) | Other government agencies, NASA Mission Directoratres, universities, or commercial entities performing contributing resources to this project. |  [optional] |
|**statesWithWork** | [**List&lt;Location&gt;**](Location.md) | States and territories with people performing work on this project. |  [optional] |
|**programDirectors** | [**List&lt;Contact&gt;**](Contact.md) | Names of the Program Directors responsible for the management of this project. |  [optional] |
|**programManagers** | [**List&lt;Contact&gt;**](Contact.md) | Names of the Program Managers responsible for the management of this project. |  [optional] |
|**projectManagers** | [**List&lt;Contact&gt;**](Contact.md) | Names of the Project Managers responsible for the management of this project. |  [optional] |
|**principalInvestigators** | [**List&lt;Contact&gt;**](Contact.md) | Names of the Principal Investigators who are the lead scientists or engineers for this project. |  [optional] |
|**coInvestigators** | [**List&lt;Contact&gt;**](Contact.md) | Names of the additional investigators who are scientists or engineers for this project. |  [optional] |
|**website** | **String** | The URL for the associated website. |  [optional] |
|**libraryItems** | [**List&lt;LibraryItem&gt;**](LibraryItem.md) | List of library items in the project library. |  [optional] |
|**stiDaas** | [**List&lt;LibraryItem&gt;**](LibraryItem.md) | List of STI DAAs in the project library. |  [optional] |
|**closeoutSummary** | **String** | The project closeout summary excerpt. |  [optional] |
|**closeoutDocuments** | [**List&lt;LibraryItem&gt;**](LibraryItem.md) | List of document files or links to the project final report closeout documentation. |  [optional] |
|**primaryImage** | **LibraryItem** |  |  [optional] |
|**viewCount** | **Long** | The number of views for the project. |  [optional] |



