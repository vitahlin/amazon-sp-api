# ListingsApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteListingsItem**](ListingsApi.md#deleteListingsItem) | **DELETE** /listings/2021-08-01/items/{sellerId}/{sku} | 
[**getListingsItem**](ListingsApi.md#getListingsItem) | **GET** /listings/2021-08-01/items/{sellerId}/{sku} | 
[**patchListingsItem**](ListingsApi.md#patchListingsItem) | **PATCH** /listings/2021-08-01/items/{sellerId}/{sku} | 
[**putListingsItem**](ListingsApi.md#putListingsItem) | **PUT** /listings/2021-08-01/items/{sellerId}/{sku} | 
[**searchListingsItems**](ListingsApi.md#searchListingsItems) | **GET** /listings/2021-08-01/items/{sellerId} | 


<a name="deleteListingsItem"></a>
# **deleteListingsItem**
> ListingsItemSubmissionResponse deleteListingsItem(sellerId, sku, marketplaceIds, issueLocale)



Delete a listings item for a selling partner.  **Note:** The parameters associated with this operation may contain special characters that must be encoded to successfully call the API. To avoid errors with SKUs when encoding URLs, refer to [URL Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
String sku = "sku_example"; // String | A selling partner provided identifier for an Amazon listing.
List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
String issueLocale = "en_US"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: `en_US`, `fr_CA`, `fr_FR`. Localized messages default to `en_US` when a localization is not available in the specified locale.
try {
    ListingsItemSubmissionResponse result = apiInstance.deleteListingsItem(sellerId, sku, marketplaceIds, issueLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#deleteListingsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **sku** | **String**| A selling partner provided identifier for an Amazon listing. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: &#x60;en_US&#x60;, &#x60;fr_CA&#x60;, &#x60;fr_FR&#x60;. Localized messages default to &#x60;en_US&#x60; when a localization is not available in the specified locale. | [optional]

### Return type

[**ListingsItemSubmissionResponse**](ListingsItemSubmissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getListingsItem"></a>
# **getListingsItem**
> Item getListingsItem(sellerId, sku, marketplaceIds, issueLocale, includedData)



Returns details about a listings item for a selling partner.  **Note:** The parameters associated with this operation may contain special characters that must be encoded to successfully call the API. To avoid errors with SKUs when encoding URLs, refer to [URL Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
String sku = "sku_example"; // String | A selling partner provided identifier for an Amazon listing.
List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
String issueLocale = "en_US"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: `en_US`, `fr_CA`, `fr_FR`. Localized messages default to `en_US` when a localization is not available in the specified locale.
List<String> includedData = Arrays.asList("[\"summaries\"]"); // List<String> | A comma-delimited list of data sets to include in the response. Default: `summaries`.
try {
    Item result = apiInstance.getListingsItem(sellerId, sku, marketplaceIds, issueLocale, includedData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#getListingsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **sku** | **String**| A selling partner provided identifier for an Amazon listing. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: &#x60;en_US&#x60;, &#x60;fr_CA&#x60;, &#x60;fr_FR&#x60;. Localized messages default to &#x60;en_US&#x60; when a localization is not available in the specified locale. | [optional]
 **includedData** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of data sets to include in the response. Default: &#x60;summaries&#x60;. | [optional] [default to [&quot;summaries&quot;]] [enum: summaries, attributes, issues, offers, fulfillmentAvailability, procurement]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchListingsItem"></a>
# **patchListingsItem**
> ListingsItemSubmissionResponse patchListingsItem(sellerId, sku, marketplaceIds, body, includedData, mode, issueLocale)



Partially update (patch) a listings item for a selling partner. Only top-level listings item attributes can be patched. Patching nested attributes is not supported.  **Note:** This operation has a throttling rate of one request per second when &#x60;mode&#x60; is &#x60;VALIDATION_PREVIEW&#x60;.  **Note:** The parameters associated with this operation may contain special characters that must be encoded to successfully call the API. To avoid errors with SKUs when encoding URLs, refer to [URL Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
String sku = "sku_example"; // String | A selling partner provided identifier for an Amazon listing.
List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
ListingsItemPatchRequest body = new ListingsItemPatchRequest(); // ListingsItemPatchRequest | The request body schema for the `patchListingsItem` operation.
List<String> includedData = Arrays.asList("[\"issues\"]"); // List<String> | A comma-delimited list of data sets to include in the response. Default: `issues`.
String mode = "VALIDATION_PREVIEW"; // String | The mode of operation for the request.
String issueLocale = "en_US"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: `en_US`, `fr_CA`, `fr_FR`. Localized messages default to `en_US` when a localization is not available in the specified locale.
try {
    ListingsItemSubmissionResponse result = apiInstance.patchListingsItem(sellerId, sku, marketplaceIds, body, includedData, mode, issueLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#patchListingsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **sku** | **String**| A selling partner provided identifier for an Amazon listing. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **body** | [**ListingsItemPatchRequest**](ListingsItemPatchRequest.md)| The request body schema for the &#x60;patchListingsItem&#x60; operation. |
 **includedData** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of data sets to include in the response. Default: &#x60;issues&#x60;. | [optional] [default to [&quot;issues&quot;]] [enum: identifiers, issues]
 **mode** | **String**| The mode of operation for the request. | [optional] [enum: VALIDATION_PREVIEW]
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: &#x60;en_US&#x60;, &#x60;fr_CA&#x60;, &#x60;fr_FR&#x60;. Localized messages default to &#x60;en_US&#x60; when a localization is not available in the specified locale. | [optional]

### Return type

[**ListingsItemSubmissionResponse**](ListingsItemSubmissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putListingsItem"></a>
# **putListingsItem**
> ListingsItemSubmissionResponse putListingsItem(sellerId, sku, marketplaceIds, body, includedData, mode, issueLocale)



Creates or fully updates an existing listings item for a selling partner.  **Note:** This operation has a throttling rate of one request per second when &#x60;mode&#x60; is &#x60;VALIDATION_PREVIEW&#x60;.  **Note:** The parameters associated with this operation may contain special characters that must be encoded to successfully call the API. To avoid errors with SKUs when encoding URLs, refer to [URL Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
String sku = "sku_example"; // String | A selling partner provided identifier for an Amazon listing.
List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
ListingsItemPutRequest body = new ListingsItemPutRequest(); // ListingsItemPutRequest | The request body schema for the `putListingsItem` operation.
List<String> includedData = Arrays.asList("[\"issues\"]"); // List<String> | A comma-delimited list of data sets to include in the response. Default: `issues`.
String mode = "VALIDATION_PREVIEW"; // String | The mode of operation for the request.
String issueLocale = "en_US"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: `en_US`, `fr_CA`, `fr_FR`. Localized messages default to `en_US` when a localization is not available in the specified locale.
try {
    ListingsItemSubmissionResponse result = apiInstance.putListingsItem(sellerId, sku, marketplaceIds, body, includedData, mode, issueLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#putListingsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **sku** | **String**| A selling partner provided identifier for an Amazon listing. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **body** | [**ListingsItemPutRequest**](ListingsItemPutRequest.md)| The request body schema for the &#x60;putListingsItem&#x60; operation. |
 **includedData** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of data sets to include in the response. Default: &#x60;issues&#x60;. | [optional] [default to [&quot;issues&quot;]] [enum: identifiers, issues]
 **mode** | **String**| The mode of operation for the request. | [optional] [enum: VALIDATION_PREVIEW]
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: &#x60;en_US&#x60;, &#x60;fr_CA&#x60;, &#x60;fr_FR&#x60;. Localized messages default to &#x60;en_US&#x60; when a localization is not available in the specified locale. | [optional]

### Return type

[**ListingsItemSubmissionResponse**](ListingsItemSubmissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchListingsItems"></a>
# **searchListingsItems**
> ItemSearchResults searchListingsItems(sellerId, marketplaceIds, identifiers, identifiersType, pageSize, pageToken, includedData, issueLocale)



Search for and return list of listings items and respective details for a selling partner.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
List<String> identifiers = Arrays.asList("GM-ZDPI-9B4E"); // List<String> | A comma-delimited list of product identifiers to search for listings items by.   **Note**:  1. Required when `identifiersType` is provided.
String identifiersType = "SKU"; // String | Type of product identifiers to search for listings items by.   **Note**:  1. Required when `identifiers` is provided.
Integer pageSize = 10; // Integer | Number of results to be returned per page.
String pageToken = "sdlkj234lkj234lksjdflkjwdflkjsfdlkj234234234234"; // String | A token to fetch a certain page when there are multiple pages worth of results.
List<String> includedData = Arrays.asList("[\"summaries\"]"); // List<String> | A comma-delimited list of data sets to include in the response. Default: summaries.
String issueLocale = "en_US"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \"en_US\", \"fr_CA\", \"fr_FR\". Localized messages default to \"en_US\" when a localization is not available in the specified locale.
try {
    ItemSearchResults result = apiInstance.searchListingsItems(sellerId, marketplaceIds, identifiers, identifiersType, pageSize, pageToken, includedData, issueLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#searchListingsItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **identifiers** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of product identifiers to search for listings items by.   **Note**:  1. Required when &#x60;identifiersType&#x60; is provided. | [optional]
 **identifiersType** | **String**| Type of product identifiers to search for listings items by.   **Note**:  1. Required when &#x60;identifiers&#x60; is provided. | [optional] [enum: ASIN, EAN, GTIN, ISBN, JAN, MINSAN, SKU, UPC]
 **pageSize** | **Integer**| Number of results to be returned per page. | [optional] [default to 10]
 **pageToken** | **String**| A token to fetch a certain page when there are multiple pages worth of results. | [optional]
 **includedData** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of data sets to include in the response. Default: summaries. | [optional] [default to [&quot;summaries&quot;]] [enum: summaries, attributes, issues, offers, fulfillmentAvailability, procurement]
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. | [optional]

### Return type

[**ItemSearchResults**](ItemSearchResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

