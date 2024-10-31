
# ListOffersRequestFilters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketplaceId** | **String** | The marketplace identifier. The supported marketplaces for both sellers and vendors are US, CA, ES, UK, FR, IT, IN, DE and JP. The supported marketplaces for vendors only are BR, AU, MX, AE and NL.  Refer to [Marketplace IDs](https://developer-docs.amazon.com/sp-api/docs/marketplace-ids) to find the identifier for the marketplace. | 
**skus** | **List&lt;String&gt;** | A list of SKUs to filter. This filter is only supported for sellers and not for vendors. |  [optional]
**asins** | **List&lt;String&gt;** | A list of Amazon Standard Identification Numbers (ASINs). |  [optional]
**eligibilities** | [**List&lt;EligibilityStatus&gt;**](EligibilityStatus.md) | A list of eligibilities associated with an offer. |  [optional]
**preferences** | [**Preference**](Preference.md) | Offer preferences to include in the result filter criteria. |  [optional]
**promotions** | [**Promotion**](Promotion.md) | Offer promotions to include in the result filter criteria. |  [optional]
**programTypes** | [**ProgramTypes**](ProgramTypes.md) |  | 



