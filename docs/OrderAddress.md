
# OrderAddress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazonOrderId** | **String** | An Amazon-defined order identifier, in 3-7-7 format. | 
**buyerCompanyName** | **String** | The company name of the contact buyer. For IBA orders, the buyer company must be Amazon entities. |  [optional]
**shippingAddress** | [**Address**](Address.md) | The shipping address for the order.  **Note**: &#x60;ShippingAddress&#x60; is only available for orders with the following status values: &#x60;Unshipped&#x60;, &#x60;PartiallyShipped&#x60;, &#x60;Shipped&#x60;, and &#x60;InvoiceUnconfirmed&#x60;. |  [optional]
**deliveryPreferences** | [**DeliveryPreferences**](DeliveryPreferences.md) |  |  [optional]



