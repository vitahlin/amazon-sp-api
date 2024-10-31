
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sellingPartnerMetadata** | [**SellingPartnerMetadata**](SellingPartnerMetadata.md) | Metadata that describes the seller. |  [optional]
**relatedIdentifiers** | [**RelatedIdentifiers**](RelatedIdentifiers.md) | Identifiers related to the transaction, such as order and shipment IDs. |  [optional]
**transactionType** | **String** | The type of transaction.  **Possible value:** &#x60;Shipment&#x60; |  [optional]
**transactionId** | **String** | The unique identifier of the transaction. |  [optional]
**transactionStatus** | **String** | The status of the transaction.   **Possible values:**  * &#x60;Deferred&#x60; * &#x60;Released&#x60; |  [optional]
**description** | **String** | Describes the reasons for the transaction.  **Example:** &#39;Order Payment&#39;, &#39;Refund Order&#39; |  [optional]
**postedDate** | **String** | The date and time when the transaction was posted. |  [optional]
**totalAmount** | [**Currency**](Currency.md) | The total amount of money in the transaction. |  [optional]
**marketplaceDetails** | [**MarketplaceDetails**](MarketplaceDetails.md) | Information about the marketplace where the transaction occurred. |  [optional]
**items** | [**Items**](Items.md) | Additional information about the items in the transaction. |  [optional]
**contexts** | [**Contexts**](Contexts.md) | Additional Information about the transaction. |  [optional]
**breakdowns** | [**Breakdowns**](Breakdowns.md) | A list of breakdowns that provide details on how the total amount is calculated for the transaction. |  [optional]



