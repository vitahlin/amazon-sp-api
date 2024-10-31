
# OrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ASIN** | **String** | The item&#39;s Amazon Standard Identification Number (ASIN). | 
**sellerSKU** | **String** | The item&#39;s seller stock keeping unit (SKU). |  [optional]
**orderItemId** | **String** | An Amazon-defined order item identifier. | 
**associatedItems** | [**List&lt;AssociatedItem&gt;**](AssociatedItem.md) | A list of associated items that a customer has purchased with a product. For example, a tire installation service purchased with tires. |  [optional]
**title** | **String** | The item&#39;s name. |  [optional]
**quantityOrdered** | **Integer** | The number of items in the order.  | 
**quantityShipped** | **Integer** | The number of items shipped. |  [optional]
**productInfo** | [**ProductInfoDetail**](ProductInfoDetail.md) | The item&#39;s product information. |  [optional]
**pointsGranted** | [**PointsGrantedDetail**](PointsGrantedDetail.md) | The number and value of Amazon Points granted with the purchase of an item. |  [optional]
**itemPrice** | [**Money**](Money.md) | The selling price of the order item. Note that an order item is an item and a quantity. This means that the value of &#x60;ItemPrice&#x60; is equal to the selling price of the item multiplied by the quantity ordered. &#x60;ItemPrice&#x60; excludes &#x60;ShippingPrice&#x60; and GiftWrapPrice. |  [optional]
**shippingPrice** | [**Money**](Money.md) | The item&#39;s shipping price. |  [optional]
**itemTax** | [**Money**](Money.md) | The tax on the item price. |  [optional]
**shippingTax** | [**Money**](Money.md) | The tax on the shipping price. |  [optional]
**shippingDiscount** | [**Money**](Money.md) | The discount on the shipping price. |  [optional]
**shippingDiscountTax** | [**Money**](Money.md) | The tax on the discount on the shipping price. |  [optional]
**promotionDiscount** | [**Money**](Money.md) | The total of all promotional discounts in the offer. |  [optional]
**promotionDiscountTax** | [**Money**](Money.md) | The tax on the total of all promotional discounts in the offer. |  [optional]
**promotionIds** | [**PromotionIdList**](PromotionIdList.md) |  |  [optional]
**coDFee** | [**Money**](Money.md) | The fee charged for COD service. |  [optional]
**coDFeeDiscount** | [**Money**](Money.md) | The discount on the COD fee. |  [optional]
**isGift** | **String** | Indicates whether the item is a gift.  **Possible values**: &#x60;true&#x60; and &#x60;false&#x60;. |  [optional]
**conditionNote** | **String** | The condition of the item, as described by the seller. |  [optional]
**conditionId** | **String** | The condition of the item.  **Possible values**: &#x60;New&#x60;, &#x60;Used&#x60;, &#x60;Collectible&#x60;, &#x60;Refurbished&#x60;, &#x60;Preorder&#x60;, and &#x60;Club&#x60;. |  [optional]
**conditionSubtypeId** | **String** | The subcondition of the item.  **Possible values**: &#x60;New&#x60;, &#x60;Mint&#x60;, &#x60;Very Good&#x60;, &#x60;Good&#x60;, &#x60;Acceptable&#x60;, &#x60;Poor&#x60;, &#x60;Club&#x60;, &#x60;OEM&#x60;, &#x60;Warranty&#x60;, &#x60;Refurbished Warranty&#x60;, &#x60;Refurbished&#x60;, &#x60;Open Box&#x60;, &#x60;Any&#x60;, and &#x60;Other&#x60;. |  [optional]
**scheduledDeliveryStartDate** | **String** | The start date of the scheduled delivery window in the time zone for the order destination. In [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date time format. |  [optional]
**scheduledDeliveryEndDate** | **String** | The end date of the scheduled delivery window in the time zone for the order destination. In [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date time format. |  [optional]
**priceDesignation** | **String** | Indicates that the selling price is a special price that is only available for Amazon Business orders. For more information about the Amazon Business Seller Program, refer to the [Amazon Business website](https://www.amazon.com/b2b/info/amazon-business).   **Possible values**: &#x60;BusinessPrice&#x60; |  [optional]
**taxCollection** | [**TaxCollection**](TaxCollection.md) | Information about withheld taxes. |  [optional]
**serialNumberRequired** | **Boolean** | When true, the product type for this item has a serial number.   Only returned for Amazon Easy Ship orders. |  [optional]
**isTransparency** | **Boolean** | When true, the ASIN is enrolled in Transparency. The Transparency serial number that you must submit is determined by:  **1D or 2D Barcode:** This has a **T** logo. Submit either the 29-character alpha-numeric identifier beginning with **AZ** or **ZA**, or the 38-character Serialized Global Trade Item Number (SGTIN). **2D Barcode SN:** Submit the 7- to 20-character serial number barcode, which likely has the prefix **SN**. The serial number is applied to the same side of the packaging as the GTIN (UPC/EAN/ISBN) barcode. **QR code SN:** Submit the URL that the QR code generates. |  [optional]
**iossNumber** | **String** | The IOSS number of the marketplace. Sellers shipping to the EU from outside the EU must provide this IOSS number to their carrier when Amazon has collected the VAT on the sale. |  [optional]
**storeChainStoreId** | **String** | The store chain store identifier. Linked to a specific store in a store chain. |  [optional]
**deemedResellerCategory** | [**DeemedResellerCategoryEnum**](#DeemedResellerCategoryEnum) | The category of deemed reseller. This applies to selling partners that are not based in the EU and is used to help them meet the VAT Deemed Reseller tax laws in the EU and UK. |  [optional]
**buyerInfo** | [**ItemBuyerInfo**](ItemBuyerInfo.md) | A single item&#39;s buyer information.  **Note**: The &#x60;BuyerInfo&#x60; contains restricted data. Use the Restricted Data Token (RDT) and restricted SPDS roles to access the restricted data in &#x60;BuyerInfo&#x60;. For example, &#x60;BuyerCustomizedInfo&#x60; and &#x60;GiftMessageText&#x60;. |  [optional]
**buyerRequestedCancel** | [**BuyerRequestedCancel**](BuyerRequestedCancel.md) | Information about whether or not a buyer requested cancellation. |  [optional]
**serialNumbers** | **List&lt;String&gt;** | A list of serial numbers for electronic products that are shipped to customers. Returned for FBA orders only. |  [optional]
**substitutionPreferences** | [**SubstitutionPreferences**](SubstitutionPreferences.md) | Substitution preferences for the order item. This is an optional field that is only present if a seller supports substitutions, as is the case with some grocery sellers. |  [optional]
**measurement** | [**Measurement**](Measurement.md) | Measurement information for the order item. |  [optional]
**shippingConstraints** | [**ShippingConstraints**](ShippingConstraints.md) | Shipping constraints applicable to this order. |  [optional]
**amazonPrograms** | [**AmazonPrograms**](AmazonPrograms.md) | Contains the list of programs that are associated with an item. |  [optional]


<a name="DeemedResellerCategoryEnum"></a>
## Enum: DeemedResellerCategoryEnum
Name | Value
---- | -----
IOSS | &quot;IOSS&quot;
UOSS | &quot;UOSS&quot;



