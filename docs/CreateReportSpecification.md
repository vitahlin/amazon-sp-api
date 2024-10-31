
# CreateReportSpecification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportOptions** | [**ReportOptions**](ReportOptions.md) |  |  [optional]
**reportType** | **String** | The report type. Refer to [Report Type Values](https://developer-docs.amazon.com/sp-api/docs/report-type-values) for more information. | 
**dataStartTime** | [**OffsetDateTime**](OffsetDateTime.md) | The start of a date and time range, in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; date time format, used for selecting the data to report. The default is now. The value must be prior to or equal to the current date and time. Not all report types make use of this. |  [optional]
**dataEndTime** | [**OffsetDateTime**](OffsetDateTime.md) | The end of a date and time range, in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; date time format, used for selecting the data to report. The default is now. The value must be prior to or equal to the current date and time. Not all report types make use of this. |  [optional]
**marketplaceIds** | **List&lt;String&gt;** | A list of marketplace identifiers. The report document&#39;s contents will contain data for all of the specified marketplaces, unless the report type indicates otherwise. | 



