

# OrganizationType

A heirarchical representation of an organization type. Similar to the LkuCode type returned for organization.organizationType, but formatted in a parent/child relationship.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**organizationTypeId** | **Long** | Unique ID for this organization type. |  [optional] |
|**name** | **String** | The name of the organization type. |  [optional] |
|**hasChildren** | **Boolean** | Whether or not the type has child types. |  [optional] |
|**level** | **String** | The relative level of the organization type in the heirarchy. |  [optional] |
|**parentId** | **Long** | Unique ID for the parent type in the heriarchy. |  [optional] |



