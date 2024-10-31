
# ListOffersResponseOffer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sku** | **String** | The SKU. This property is only supported for sellers and not for vendors. |  [optional]
**asin** | **String** | The Amazon Standard Identification Number (ASIN). |  [optional]
**marketplaceId** | **String** | The marketplace identifier. The supported marketplaces for both sellers and vendors are US, CA, ES, UK, FR, IT, IN, DE and JP. The supported marketplaces for vendors only are BR, AU, MX, AE and NL.  Refer to [Marketplace IDs](https://developer-docs.amazon.com/sp-api/docs/marketplace-ids) to find the identifier for the marketplace. |  [optional]
**eligibility** | [**EligibilityStatus**](EligibilityStatus.md) | The offer eligibility status. |  [optional]
**offerProgramConfiguration** | [**OfferProgramConfiguration**](OfferProgramConfiguration.md) |  |  [optional]
**programType** | [**ProgramType**](ProgramType.md) | The replenishment program for the offer. |  [optional]
**vendorCodes** | **List&lt;String&gt;** | A list of vendor codes associated with the offer. |  [optional]



