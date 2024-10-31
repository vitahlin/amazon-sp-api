
# RegulatedInformationField

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldId** | **String** | The unique identifier of the field. | 
**fieldLabel** | **String** | The name of the field. | 
**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) | The type of field. | 
**fieldValue** | **String** | The content of the field as collected in regulatory form. Note that &#x60;FileAttachment&#x60; type fields contain a URL where you can download the attachment. | 


<a name="FieldTypeEnum"></a>
## Enum: FieldTypeEnum
Name | Value
---- | -----
TEXT | &quot;Text&quot;
FILEATTACHMENT | &quot;FileAttachment&quot;



