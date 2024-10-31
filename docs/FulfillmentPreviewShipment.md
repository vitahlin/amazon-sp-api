
# FulfillmentPreviewShipment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**earliestShipDate** | **String** | The earliest date that the shipment is expected to be sent from the fulfillment center. Must be in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; format. |  [optional]
**latestShipDate** | **String** | The latest date that the shipment is expected to be sent from the fulfillment center. Must be in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; format. |  [optional]
**earliestArrivalDate** | **String** | The earliest date that the shipment is expected to arrive at its destination. |  [optional]
**latestArrivalDate** | **String** | The latest date that the shipment is expected to arrive at its destination. Must be in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; format. |  [optional]
**shippingNotes** | **List&lt;String&gt;** | Provides additional insight into the shipment timeline when exact delivery dates are not able to be precomputed. |  [optional]
**fulfillmentPreviewItems** | [**FulfillmentPreviewItemList**](FulfillmentPreviewItemList.md) | Information about the items in the shipment. | 



