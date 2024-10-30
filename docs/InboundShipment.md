
# InboundShipment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**carrierCode** | [**CarrierCode**](CarrierCode.md) | The shipment carrier code. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the shipment was created. The date is returned in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; format. |  [optional]
**destinationAddress** | [**Address**](Address.md) | Destination address for this shipment. | 
**externalReferenceId** | **String** | Client-provided reference ID that can correlate this shipment to client resources. For example, to map this shipment to an internal bookkeeping order record. |  [optional]
**orderId** | **String** | The AWD inbound order ID that this inbound shipment belongs to. | 
**originAddress** | [**Address**](Address.md) | Origin address for this shipment. | 
**receivedQuantity** | [**List&lt;InventoryQuantity&gt;**](InventoryQuantity.md) | Quantity received (at the receiving end) as part of this shipment. |  [optional]
**shipBy** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the shipment will be shipped. |  [optional]
**shipmentContainerQuantities** | [**List&lt;DistributionPackageQuantity&gt;**](DistributionPackageQuantity.md) | Packages that are part of this shipment. | 
**shipmentId** | **String** | Unique shipment ID. | 
**shipmentSkuQuantities** | [**List&lt;SkuQuantity&gt;**](SkuQuantity.md) | Quantity details at SKU level for the shipment. This attribute will only appear if the skuQuantities parameter in the request is set to SHOW. |  [optional]
**shipmentStatus** | [**InboundShipmentStatus**](InboundShipmentStatus.md) | Current status of this shipment. | 
**trackingId** | **String** | Carrier-unique tracking ID for this shipment. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp when the shipment was updated. The date is returned in &lt;a href&#x3D;&#39;https://developer-docs.amazon.com/sp-api/docs/iso-8601&#39;&gt;ISO 8601&lt;/a&gt; format. |  [optional]
**warehouseReferenceId** | **String** | An AWD-provided reference ID that you can use to interact with the warehouse. For example, a carrier appointment booking. |  [optional]



