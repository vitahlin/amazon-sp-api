
# FulfillmentPreview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shippingSpeedCategory** | [**ShippingSpeedCategory**](ShippingSpeedCategory.md) |  | 
**scheduledDeliveryInfo** | [**ScheduledDeliveryInfo**](ScheduledDeliveryInfo.md) |  |  [optional]
**isFulfillable** | **Boolean** | When true, this fulfillment order preview is fulfillable. | 
**isCODCapable** | **Boolean** | When true, this fulfillment order preview is for COD (Cash On Delivery). | 
**estimatedShippingWeight** | [**Weight**](Weight.md) | Estimated shipping weight for this fulfillment order preview. |  [optional]
**estimatedFees** | [**FeeList**](FeeList.md) | The estimated fulfillment fees for this fulfillment order preview, if applicable. The fees data will not be available for IN marketplace orders. |  [optional]
**fulfillmentPreviewShipments** | [**FulfillmentPreviewShipmentList**](FulfillmentPreviewShipmentList.md) |  |  [optional]
**unfulfillablePreviewItems** | [**UnfulfillablePreviewItemList**](UnfulfillablePreviewItemList.md) |  |  [optional]
**orderUnfulfillableReasons** | [**StringList**](StringList.md) | Error codes associated with the fulfillment order preview that indicate why the order is not fulfillable.  Error code examples:  &#x60;DeliverySLAUnavailable&#x60; &#x60;InvalidDestinationAddress&#x60; |  [optional]
**marketplaceId** | **String** | The marketplace the fulfillment order is placed against. | 
**featureConstraints** | [**List&lt;FeatureSettings&gt;**](FeatureSettings.md) | A list of features and their fulfillment policies to apply to the order. |  [optional]



