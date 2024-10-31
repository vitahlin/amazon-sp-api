/*
 * Selling Partner API for Orders
 * Use the Orders Selling Partner API to programmatically retrieve order information. With this API, you can develop fast, flexible, and custom applications to manage order synchronization, perform order research, and create demand-based decision support tools.   _Note:_ For the JP, AU, and SG marketplaces, the Orders API supports orders from 2016 onward. For all other marketplaces, the Orders API supports orders for the last two years (orders older than this don't show up in the response).
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ConfirmShipmentErrorResponse;
import io.swagger.client.model.ConfirmShipmentRequest;
import io.swagger.client.model.GetOrderAddressResponse;
import io.swagger.client.model.GetOrderBuyerInfoResponse;
import io.swagger.client.model.GetOrderItemsBuyerInfoResponse;
import io.swagger.client.model.GetOrderItemsResponse;
import io.swagger.client.model.GetOrderRegulatedInfoResponse;
import io.swagger.client.model.GetOrderResponse;
import io.swagger.client.model.GetOrdersResponse;
import io.swagger.client.model.UpdateVerificationStatusErrorResponse;
import io.swagger.client.model.UpdateVerificationStatusRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.amazon.SellingPartnerAPIAA.LWAException;

/**
* API tests for OrdersV0Api
*/
@Ignore
public class OrdersV0ApiTest {

private final OrdersV0Api api = new OrdersV0Api();


/**
* 
*
* Updates the shipment confirmation status for a specified order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table contains the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may receive higher rate and burst values then those shown here. For more information, refer to [Usage Plans and Rate Limits](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void confirmShipmentTest() throws ApiException, LWAException {
    String orderId = null;
    ConfirmShipmentRequest payload = null;
api.confirmShipment(orderId, payload);

// TODO: test validations
}

/**
* 
*
* Returns the order that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table contains the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may receive higher rate and burst values then those shown here. For more information, refer to [Usage Plans and Rate Limits](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getOrderTest() throws ApiException, LWAException {
    String orderId = null;
GetOrderResponse response = api.getOrder(orderId);

// TODO: test validations
}

/**
* 
*
* Returns the shipping address for the order that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table contains the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may receive higher rate and burst values then those shown here. For more information, refer to [Usage Plans and Rate Limits](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getOrderAddressTest() throws ApiException, LWAException {
    String orderId = null;
GetOrderAddressResponse response = api.getOrderAddress(orderId);

// TODO: test validations
}

/**
* 
*
* Returns buyer information for the order that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table contains the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may receive higher rate and burst values then those shown here. For more information, refer to [Usage Plans and Rate Limits](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getOrderBuyerInfoTest() throws ApiException, LWAException {
    String orderId = null;
GetOrderBuyerInfoResponse response = api.getOrderBuyerInfo(orderId);

// TODO: test validations
}

/**
* 
*
* Returns detailed order item information for the order that you specify. If &#x60;NextToken&#x60; is provided, it&#39;s used to retrieve the next page of order items.  __Note__: When an order is in the Pending state (the order has been placed but payment has not been authorized), the getOrderItems operation does not return information about pricing, taxes, shipping charges, gift status or promotions for the order items in the order. After an order leaves the Pending state (this occurs when payment has been authorized) and enters the Unshipped, Partially Shipped, or Shipped state, the getOrderItems operation returns information about pricing, taxes, shipping charges, gift status and promotions for the order items in the order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table contains the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may receive higher rate and burst values then those shown here. For more information, refer to [Usage Plans and Rate Limits](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getOrderItemsTest() throws ApiException, LWAException {
    String orderId = null;
    String nextToken = null;
GetOrderItemsResponse response = api.getOrderItems(orderId, nextToken);

// TODO: test validations
}

/**
* 
*
* Returns buyer information for the order items in the order that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table contains the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may receive higher rate and burst values then those shown here. For more information, refer to [Usage Plans and Rate Limits](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getOrderItemsBuyerInfoTest() throws ApiException, LWAException {
    String orderId = null;
    String nextToken = null;
GetOrderItemsBuyerInfoResponse response = api.getOrderItemsBuyerInfo(orderId, nextToken);

// TODO: test validations
}

/**
* 
*
* Returns regulated information for the order that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table contains the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may receive higher rate and burst values then those shown here. For more information, refer to [Usage Plans and Rate Limits](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getOrderRegulatedInfoTest() throws ApiException, LWAException {
    String orderId = null;
GetOrderRegulatedInfoResponse response = api.getOrderRegulatedInfo(orderId);

// TODO: test validations
}

/**
* 
*
* Returns orders that are created or updated during the specified time period. If you want to return specific types of orders, you can apply filters to your request. &#x60;NextToken&#x60; doesn&#39;t affect any filters that you include in your request; it only impacts the pagination for the filtered orders response.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0167 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that are applied to the requested operation, when available. The preceding table contains the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may receive higher rate and burst values then those shown here. For more information, refer to [Usage Plans and Rate Limits](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api) in the Selling Partner API documentation.
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getOrdersTest() throws ApiException, LWAException {
    List<String> marketplaceIds = null;
    String createdAfter = null;
    String createdBefore = null;
    String lastUpdatedAfter = null;
    String lastUpdatedBefore = null;
    List<String> orderStatuses = null;
    List<String> fulfillmentChannels = null;
    List<String> paymentMethods = null;
    String buyerEmail = null;
    String sellerOrderId = null;
    Integer maxResultsPerPage = null;
    List<String> easyShipShipmentStatuses = null;
    List<String> electronicInvoiceStatuses = null;
    String nextToken = null;
    List<String> amazonOrderIds = null;
    String actualFulfillmentSupplySourceId = null;
    Boolean isISPU = null;
    String storeChainStoreId = null;
    String earliestDeliveryDateBefore = null;
    String earliestDeliveryDateAfter = null;
    String latestDeliveryDateBefore = null;
    String latestDeliveryDateAfter = null;
GetOrdersResponse response = api.getOrders(marketplaceIds, createdAfter, createdBefore, lastUpdatedAfter, lastUpdatedBefore, orderStatuses, fulfillmentChannels, paymentMethods, buyerEmail, sellerOrderId, maxResultsPerPage, easyShipShipmentStatuses, electronicInvoiceStatuses, nextToken, amazonOrderIds, actualFulfillmentSupplySourceId, isISPU, storeChainStoreId, earliestDeliveryDateBefore, earliestDeliveryDateAfter, latestDeliveryDateBefore, latestDeliveryDateAfter);

// TODO: test validations
}

/**
* 
*
* Updates (approves or rejects) the verification status of an order containing regulated products.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table contains the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may receive higher rate and burst values then those shown here. For more information, refer to [Usage Plans and Rate Limits](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void updateVerificationStatusTest() throws ApiException, LWAException {
    String orderId = null;
    UpdateVerificationStatusRequest payload = null;
api.updateVerificationStatus(orderId, payload);

// TODO: test validations
}

}