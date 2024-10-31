
# Offer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sellerId** | **String** | The seller identifier for the offer. | 
**condition** | [**Condition**](Condition.md) | Item Condition. | 
**subCondition** | [**SubConditionEnum**](#SubConditionEnum) | The item subcondition for the offer. |  [optional]
**fulfillmentType** | [**FulfillmentType**](FulfillmentType.md) | The fulfillment type for the offer. Possible values are AFN (Amazon Fulfillment Network) and MFN (Merchant Fulfillment Network). | 
**listingPrice** | [**MoneyType**](MoneyType.md) | Offer buying price. Does not include shipping, points, or applicable promotions. | 
**shippingOptions** | [**List&lt;ShippingOption&gt;**](ShippingOption.md) | A list of shipping options associated with this offer |  [optional]
**points** | [**Points**](Points.md) | The number of Amazon Points offered with the purchase of an item, and their monetary value. Note that the Points element is only returned in Japan (JP). |  [optional]
**primeDetails** | [**PrimeDetails**](PrimeDetails.md) | Amazon Prime details. |  [optional]


<a name="SubConditionEnum"></a>
## Enum: SubConditionEnum
Name | Value
---- | -----
NEW | &quot;New&quot;
MINT | &quot;Mint&quot;
VERYGOOD | &quot;VeryGood&quot;
GOOD | &quot;Good&quot;
ACCEPTABLE | &quot;Acceptable&quot;
POOR | &quot;Poor&quot;
CLUB | &quot;Club&quot;
OEM | &quot;OEM&quot;
WARRANTY | &quot;Warranty&quot;
REFURBISHEDWARRANTY | &quot;RefurbishedWarranty&quot;
REFURBISHED | &quot;Refurbished&quot;
OPENBOX | &quot;OpenBox&quot;
OTHER | &quot;Other&quot;



