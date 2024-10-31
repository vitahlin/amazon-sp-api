
# BuyerInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buyerEmail** | **String** | The anonymized email address of the buyer. |  [optional]
**buyerName** | **String** | The buyer name or the recipient name. |  [optional]
**buyerCounty** | **String** | The county of the buyer.  **Note**: This attribute is only available in the Brazil marketplace. |  [optional]
**buyerTaxInfo** | [**BuyerTaxInfo**](BuyerTaxInfo.md) | Tax information about the buyer. Sellers can use this data to issue electronic invoices for business orders.  **Note**: This attribute is only available for business orders in the Brazil, Mexico and India marketplaces. |  [optional]
**purchaseOrderNumber** | **String** | The purchase order (PO) number entered by the buyer at checkout. Only returned for orders where the buyer entered a PO number at checkout. |  [optional]



