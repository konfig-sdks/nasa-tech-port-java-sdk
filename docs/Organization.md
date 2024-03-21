

# Organization

A NASA center/facility associated with an project

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organizationId** | **Long** | Unique ID for this organization |  [optional] |
|**acronym** | **String** | The acronym of the organization |  [optional] |
|**fax** | **String** | Fax number of the organization |  [optional] |
|**isActive** | **Boolean** | True if the organization is an active organization |  [optional] |
|**location** | [**Location**](Location.md) |  |  [optional] |
|**locationId** | **Long** | Unique ID representing the organizations location |  [optional] |
|**organizationName** | **String** | The name of the organization |  [optional] |
|**organizationType** | [**LkuCode**](LkuCode.md) |  |  [optional] |
|**organizationTypeId** | **Long** | Unique ID for the lookup code representing the organization type |  [optional] |
|**parentOrganizationId** | **Long** | Unique ID for the parent organization |  [optional] |
|**phone** | **String** | The phone number for the organization |  [optional] |
|**replacementOrganizationId** | **Long** | Unique ID for the replacement organization |  [optional] |
|**url** | **String** | The URL for the organization |  [optional] |
|**naOrganization** | **Boolean** | True if the organization is in North America |  [optional] |
|**external** | **Boolean** | True if the organization is external to NASA |  [optional] |
|**linkCount** | **Long** | Amount of links this organization has |  [optional] |
|**murepUnitId** | **Long** | Unique identifier assigned to U.S. academic institutions by MUREP. |  [optional] |
|**ein** | **String** | The employer identification number (EIN) of the entity. |  [optional] |
|**uei** | **String** | The unique entity identifier (UEI) of the entity. |  [optional] |
|**dunsNumber** | **String** | The DUNS number assigned to the organization. |  [optional] |
|**msiData** | **Map&lt;String, List&lt;String&gt;&gt;** | A key/value pair of strings describing the organization MSI status by fiscal year. |  [optional] |
|**setAsideData** | **List&lt;String&gt;** | The organization set-aside types. |  [optional] |



