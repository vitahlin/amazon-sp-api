
# FulfillmentShipment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazonShipmentId** | **String** | A shipment identifier assigned by Amazon. | 
**fulfillmentCenterId** | **String** | An identifier for the fulfillment center that the shipment will be sent from. | 
**fulfillmentShipmentStatus** | [**FulfillmentShipmentStatusEnum**](#FulfillmentShipmentStatusEnum) | The current status of the shipment. | 
**shippingDate** | **String** | The meaning of the &#x60;shippingDate&#x60; value depends on the current status of the shipment. If the current value of &#x60;FulfillmentShipmentStatus&#x60; is:  * Pending - &#x60;shippingDate&#x60; represents the estimated time that the shipment will leave the Amazon fulfillment center.  * Shipped - &#x60;shippingDate&#x60; represents the date that the shipment left the Amazon fulfillment center. If a shipment includes more than one package, &#x60;shippingDate&#x60; applies to all of the packages in the shipment. If the value of &#x60;FulfillmentShipmentStatus&#x60; is &#x60;CancelledByFulfiller&#x60; or &#x60;CancelledBySeller&#x60;, &#x60;shippingDate&#x60; is not returned. The value must be in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; format. |  [optional]
**estimatedArrivalDate** | **String** | The estimated arrival date and time of the shipment. Must be in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; format. Note that this value can change over time. If a shipment includes more than one package, &#x60;estimatedArrivalDate&#x60; applies to all of the packages in the shipment. If the shipment has been cancelled, &#x60;estimatedArrivalDate&#x60; is not returned. |  [optional]
**shippingNotes** | **List&lt;String&gt;** | Provides additional insight into shipment timeline. Primairly used to communicate that actual delivery dates aren&#39;t available. |  [optional]
**fulfillmentShipmentItem** | [**FulfillmentShipmentItemList**](FulfillmentShipmentItemList.md) |  | 
**fulfillmentShipmentPackage** | [**FulfillmentShipmentPackageList**](FulfillmentShipmentPackageList.md) |  |  [optional]


<a name="FulfillmentShipmentStatusEnum"></a>
## Enum: FulfillmentShipmentStatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
SHIPPED | &quot;SHIPPED&quot;
CANCELLED_BY_FULFILLER | &quot;CANCELLED_BY_FULFILLER&quot;
CANCELLED_BY_SELLER | &quot;CANCELLED_BY_SELLER&quot;



