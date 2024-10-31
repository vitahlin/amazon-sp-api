
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazonOrderId** | **String** | An Amazon-defined order identifier, in 3-7-7 format. | 
**sellerOrderId** | **String** | A seller-defined order identifier. |  [optional]
**purchaseDate** | **String** | The date when the order was created. | 
**lastUpdateDate** | **String** | The date when the order was last updated.  __Note__: &#x60;LastUpdateDate&#x60; is returned with an incorrect date for orders that were last updated before 2009-04-01. | 
**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) | The current order status. | 
**fulfillmentChannel** | [**FulfillmentChannelEnum**](#FulfillmentChannelEnum) | Whether the order was fulfilled by Amazon (&#x60;AFN&#x60;) or by the seller (&#x60;MFN&#x60;). |  [optional]
**salesChannel** | **String** | The sales channel for the first item in the order. |  [optional]
**orderChannel** | **String** | The order channel for the first item in the order. |  [optional]
**shipServiceLevel** | **String** | The order&#39;s shipment service level. |  [optional]
**orderTotal** | [**Money**](Money.md) | The total charge for this order. |  [optional]
**numberOfItemsShipped** | **Integer** | The number of items shipped. |  [optional]
**numberOfItemsUnshipped** | **Integer** | The number of items unshipped. |  [optional]
**paymentExecutionDetail** | [**PaymentExecutionDetailItemList**](PaymentExecutionDetailItemList.md) | Information about sub-payment methods for a cash-on-delivery (COD) order.  __Note__: For a COD order that is paid for using one sub-payment method, one &#x60;PaymentExecutionDetailItem&#x60; object is returned, with &#x60;PaymentExecutionDetailItem&#x60;/&#x60;PaymentMethod &#x3D; COD&#x60;. For a COD order that is paid for using multiple sub-payment methods, two or more &#x60;PaymentExecutionDetailItem&#x60; objects are returned. |  [optional]
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | The payment method for the order. This property is limited to COD and CVS payment methods. Unless you need the specific COD payment information provided by the &#x60;PaymentExecutionDetailItem&#x60; object, we recommend using the &#x60;PaymentMethodDetails&#x60; property to get payment method information. |  [optional]
**paymentMethodDetails** | [**PaymentMethodDetailItemList**](PaymentMethodDetailItemList.md) | A list of payment methods for the order. |  [optional]
**marketplaceId** | **String** | The identifier for the marketplace where the order was placed. |  [optional]
**shipmentServiceLevelCategory** | **String** | The shipment service level category for the order.  **Possible values**: &#x60;Expedited&#x60;, &#x60;FreeEconomy&#x60;, &#x60;NextDay&#x60;, &#x60;Priority&#x60;, &#x60;SameDay&#x60;, &#x60;SecondDay&#x60;, &#x60;Scheduled&#x60;, and &#x60;Standard&#x60;. |  [optional]
**easyShipShipmentStatus** | [**EasyShipShipmentStatus**](EasyShipShipmentStatus.md) | The status of the Amazon Easy Ship order. This property is only included for Amazon Easy Ship orders. |  [optional]
**cbaDisplayableShippingLabel** | **String** | Custom ship label for Checkout by Amazon (CBA). |  [optional]
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | The order&#39;s type. |  [optional]
**earliestShipDate** | **String** | The start of the time period within which you have committed to ship the order. In [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date time format. Only returned for seller-fulfilled orders.  __Note__: &#x60;EarliestShipDate&#x60; might not be returned for orders placed before February 1, 2013. |  [optional]
**latestShipDate** | **String** | The end of the time period within which you have committed to ship the order. In [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date time format. Only returned for seller-fulfilled orders.  __Note__: &#x60;LatestShipDate&#x60; might not be returned for orders placed before February 1, 2013. |  [optional]
**earliestDeliveryDate** | **String** | The start of the time period within which you have committed to fulfill the order. In [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date time format. Only returned for seller-fulfilled orders. |  [optional]
**latestDeliveryDate** | **String** | The end of the time period within which you have committed to fulfill the order. In [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date time format. Only returned for seller-fulfilled orders that do not have a &#x60;PendingAvailability&#x60;, &#x60;Pending&#x60;, or &#x60;Canceled&#x60; status. |  [optional]
**isBusinessOrder** | **Boolean** | When true, the order is an Amazon Business order. An Amazon Business order is an order where the buyer is a Verified Business Buyer. |  [optional]
**isPrime** | **Boolean** | When true, the order is a seller-fulfilled Amazon Prime order. |  [optional]
**isPremiumOrder** | **Boolean** | When true, the order has a Premium Shipping Service Level Agreement. For more information about Premium Shipping orders, refer to \&quot;Premium Shipping Options\&quot; in the Seller Central Help for your marketplace. |  [optional]
**isGlobalExpressEnabled** | **Boolean** | When true, the order is a &#x60;GlobalExpress&#x60; order. |  [optional]
**replacedOrderId** | **String** | The order ID value for the order that is being replaced. Returned only if IsReplacementOrder &#x3D; true. |  [optional]
**isReplacementOrder** | **Boolean** | When true, this is a replacement order. |  [optional]
**promiseResponseDueDate** | **String** | Indicates the date by which the seller must respond to the buyer with an estimated ship date. Only returned for Sourcing on Demand orders. |  [optional]
**isEstimatedShipDateSet** | **Boolean** | When true, the estimated ship date is set for the order. Only returned for Sourcing on Demand orders. |  [optional]
**isSoldByAB** | **Boolean** | When true, the item within this order was bought and re-sold by Amazon Business EU SARL (ABEU). By buying and instantly re-selling your items, ABEU becomes the seller of record, making your inventory available for sale to customers who would not otherwise purchase from a third-party seller. |  [optional]
**isIBA** | **Boolean** | When true, the item within this order was bought and re-sold by Amazon Business EU SARL (ABEU). By buying and instantly re-selling your items, ABEU becomes the seller of record, making your inventory available for sale to customers who would not otherwise purchase from a third-party seller. |  [optional]
**defaultShipFromLocationAddress** | [**Address**](Address.md) | The recommended location for the seller to ship the items from. It is calculated at checkout. The seller may or may not choose to ship from this location. |  [optional]
**buyerInvoicePreference** | [**BuyerInvoicePreferenceEnum**](#BuyerInvoicePreferenceEnum) | The buyer&#39;s invoicing preference. Sellers can use this data to issue electronic invoices for orders in Turkey.  **Note**: This attribute is only available in the Turkey marketplace. |  [optional]
**buyerTaxInformation** | [**BuyerTaxInformation**](BuyerTaxInformation.md) | Contains the business invoice tax information. Sellers could use this data to issue electronic invoices for business orders in Turkey.  **Note**: 1. This attribute is only available in the Turkey marketplace for the orders that &#x60;BuyerInvoicePreference&#x60; is BUSINESS. 2. The &#x60;BuyerTaxInformation&#x60; is a restricted data. Use the Restricted Data Token (RDT) and restricted SPDS roles to access this restricted data. |  [optional]
**fulfillmentInstruction** | [**FulfillmentInstruction**](FulfillmentInstruction.md) | Contains the instructions about the fulfillment, such as the location from where you want the order filled. |  [optional]
**isISPU** | **Boolean** | When true, this order is marked to be picked up from a store rather than delivered. |  [optional]
**isAccessPointOrder** | **Boolean** | When true, this order is marked to be delivered to an Access Point. The access location is chosen by the customer. Access Points include Amazon Hub Lockers, Amazon Hub Counters, and pickup points operated by carriers. |  [optional]
**marketplaceTaxInfo** | [**MarketplaceTaxInfo**](MarketplaceTaxInfo.md) | Tax information about the marketplace where the sale took place. Sellers can use this data to issue electronic invoices for orders in Brazil.  **Note**: This attribute is only available in the Brazil marketplace for the orders with &#x60;Pending&#x60; or &#x60;Unshipped&#x60; status. |  [optional]
**sellerDisplayName** | **String** | The seller’s friendly name registered in the marketplace where the sale took place. Sellers can use this data to issue electronic invoices for orders in Brazil.  **Note**: This attribute is only available in the Brazil marketplace for the orders with &#x60;Pending&#x60; or &#x60;Unshipped&#x60; status. |  [optional]
**shippingAddress** | [**Address**](Address.md) | The shipping address for the order.  **Note**: 1. &#x60;ShippingAddress&#x60; is only available for orders with the following status values: Unshipped, &#x60;PartiallyShipped&#x60;, Shipped and &#x60;InvoiceUnconfirmed&#x60;. 2. The &#x60;ShippingAddress&#x60; contains restricted data. Use the Restricted Data Token (RDT) and restricted SPDS roles to access the restricted data in &#x60;ShippingAddress&#x60;. For example, &#x60;Name&#x60;, &#x60;AddressLine1&#x60;, &#x60;AddressLine2&#x60;, &#x60;AddressLine3&#x60;, &#x60;Phone&#x60;, &#x60;AddressType&#x60;, and &#x60;ExtendedFields&#x60;. |  [optional]
**buyerInfo** | [**BuyerInfo**](BuyerInfo.md) | Buyer information.  **Note**: The &#x60;BuyerInfo&#x60; contains restricted data. Use the Restricted Data Token (RDT) and restricted SPDS roles to access the restricted data in &#x60;BuyerInfo&#x60;. For example, &#x60;BuyerName&#x60;, &#x60;BuyerTaxInfo&#x60;, and &#x60;PurchaseOrderNumber&#x60;. |  [optional]
**automatedShippingSettings** | [**AutomatedShippingSettings**](AutomatedShippingSettings.md) | Contains information regarding the Shipping Settings Automaton program, such as whether the order&#39;s shipping settings were generated automatically, and what those settings are. |  [optional]
**hasRegulatedItems** | **Boolean** | Whether the order contains regulated items which may require additional approval steps before being fulfilled. |  [optional]
**electronicInvoiceStatus** | [**ElectronicInvoiceStatus**](ElectronicInvoiceStatus.md) | The status of the electronic invoice. |  [optional]


<a name="OrderStatusEnum"></a>
## Enum: OrderStatusEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
UNSHIPPED | &quot;Unshipped&quot;
PARTIALLYSHIPPED | &quot;PartiallyShipped&quot;
SHIPPED | &quot;Shipped&quot;
CANCELED | &quot;Canceled&quot;
UNFULFILLABLE | &quot;Unfulfillable&quot;
INVOICEUNCONFIRMED | &quot;InvoiceUnconfirmed&quot;
PENDINGAVAILABILITY | &quot;PendingAvailability&quot;


<a name="FulfillmentChannelEnum"></a>
## Enum: FulfillmentChannelEnum
Name | Value
---- | -----
MFN | &quot;MFN&quot;
AFN | &quot;AFN&quot;


<a name="PaymentMethodEnum"></a>
## Enum: PaymentMethodEnum
Name | Value
---- | -----
COD | &quot;COD&quot;
CVS | &quot;CVS&quot;
OTHER | &quot;Other&quot;


<a name="OrderTypeEnum"></a>
## Enum: OrderTypeEnum
Name | Value
---- | -----
STANDARDORDER | &quot;StandardOrder&quot;
LONGLEADTIMEORDER | &quot;LongLeadTimeOrder&quot;
PREORDER | &quot;Preorder&quot;
BACKORDER | &quot;BackOrder&quot;
SOURCINGONDEMANDORDER | &quot;SourcingOnDemandOrder&quot;


<a name="BuyerInvoicePreferenceEnum"></a>
## Enum: BuyerInvoicePreferenceEnum
Name | Value
---- | -----
INDIVIDUAL | &quot;INDIVIDUAL&quot;
BUSINESS | &quot;BUSINESS&quot;



