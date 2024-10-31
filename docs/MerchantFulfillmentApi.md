# MerchantFulfillmentApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelShipment**](MerchantFulfillmentApi.md#cancelShipment) | **DELETE** /mfn/v0/shipments/{shipmentId} | 
[**createShipment**](MerchantFulfillmentApi.md#createShipment) | **POST** /mfn/v0/shipments | 
[**getAdditionalSellerInputs**](MerchantFulfillmentApi.md#getAdditionalSellerInputs) | **POST** /mfn/v0/additionalSellerInputs | 
[**getEligibleShipmentServices**](MerchantFulfillmentApi.md#getEligibleShipmentServices) | **POST** /mfn/v0/eligibleShippingServices | 
[**getShipment**](MerchantFulfillmentApi.md#getShipment) | **GET** /mfn/v0/shipments/{shipmentId} | 


<a name="cancelShipment"></a>
# **cancelShipment**
> CancelShipmentResponse cancelShipment(shipmentId)



Cancel the shipment indicated by the specified shipment identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MerchantFulfillmentApi;


MerchantFulfillmentApi apiInstance = new MerchantFulfillmentApi();
String shipmentId = "shipmentId_example"; // String | The Amazon-defined shipment identifier for the shipment to cancel.
try {
    CancelShipmentResponse result = apiInstance.cancelShipment(shipmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantFulfillmentApi#cancelShipment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **String**| The Amazon-defined shipment identifier for the shipment to cancel. |

### Return type

[**CancelShipmentResponse**](CancelShipmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createShipment"></a>
# **createShipment**
> CreateShipmentResponse createShipment(body)



Create a shipment with the information provided.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MerchantFulfillmentApi;


MerchantFulfillmentApi apiInstance = new MerchantFulfillmentApi();
CreateShipmentRequest body = new CreateShipmentRequest(); // CreateShipmentRequest | Request schema for CreateShipment operation.
try {
    CreateShipmentResponse result = apiInstance.createShipment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantFulfillmentApi#createShipment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateShipmentRequest**](CreateShipmentRequest.md)| Request schema for CreateShipment operation. |

### Return type

[**CreateShipmentResponse**](CreateShipmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAdditionalSellerInputs"></a>
# **getAdditionalSellerInputs**
> GetAdditionalSellerInputsResponse getAdditionalSellerInputs(body)



Gets a list of additional seller inputs required for a ship method. This is generally used for international shipping.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MerchantFulfillmentApi;


MerchantFulfillmentApi apiInstance = new MerchantFulfillmentApi();
GetAdditionalSellerInputsRequest body = new GetAdditionalSellerInputsRequest(); // GetAdditionalSellerInputsRequest | Request schema for GetAdditionalSellerInputs operation.
try {
    GetAdditionalSellerInputsResponse result = apiInstance.getAdditionalSellerInputs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantFulfillmentApi#getAdditionalSellerInputs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetAdditionalSellerInputsRequest**](GetAdditionalSellerInputsRequest.md)| Request schema for GetAdditionalSellerInputs operation. |

### Return type

[**GetAdditionalSellerInputsResponse**](GetAdditionalSellerInputsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEligibleShipmentServices"></a>
# **getEligibleShipmentServices**
> GetEligibleShipmentServicesResponse getEligibleShipmentServices(body)



Returns a list of shipping service offers that satisfy the specified shipment request details.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MerchantFulfillmentApi;


MerchantFulfillmentApi apiInstance = new MerchantFulfillmentApi();
GetEligibleShipmentServicesRequest body = new GetEligibleShipmentServicesRequest(); // GetEligibleShipmentServicesRequest | Request schema for GetEligibleShipmentServices operation.
try {
    GetEligibleShipmentServicesResponse result = apiInstance.getEligibleShipmentServices(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantFulfillmentApi#getEligibleShipmentServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetEligibleShipmentServicesRequest**](GetEligibleShipmentServicesRequest.md)| Request schema for GetEligibleShipmentServices operation. |

### Return type

[**GetEligibleShipmentServicesResponse**](GetEligibleShipmentServicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getShipment"></a>
# **getShipment**
> GetShipmentResponse getShipment(shipmentId)



Returns the shipment information for an existing shipment.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MerchantFulfillmentApi;


MerchantFulfillmentApi apiInstance = new MerchantFulfillmentApi();
String shipmentId = "shipmentId_example"; // String | The Amazon-defined shipment identifier for the shipment.
try {
    GetShipmentResponse result = apiInstance.getShipment(shipmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantFulfillmentApi#getShipment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shipmentId** | **String**| The Amazon-defined shipment identifier for the shipment. |

### Return type

[**GetShipmentResponse**](GetShipmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

