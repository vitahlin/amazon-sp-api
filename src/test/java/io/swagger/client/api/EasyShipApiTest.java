/*
 * Selling Partner API for Easy Ship
 * The Selling Partner API for Easy Ship helps you build applications that help sellers manage and ship Amazon Easy Ship orders.  Your Easy Ship applications can:  * Get available time slots for packages to be scheduled for delivery.  * Schedule, reschedule, and cancel Easy Ship orders.  * Print labels, invoices, and warranties.  See the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table) for the differences in Easy Ship operations by marketplace.
 *
 * OpenAPI spec version: 2022-03-23
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CreateScheduledPackageRequest;
import io.swagger.client.model.CreateScheduledPackagesRequest;
import io.swagger.client.model.CreateScheduledPackagesResponse;
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.ListHandoverSlotsRequest;
import io.swagger.client.model.ListHandoverSlotsResponse;
import io.swagger.client.model.ModelPackage;
import io.swagger.client.model.Packages;
import io.swagger.client.model.UpdateScheduledPackagesRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.amazon.SellingPartnerAPIAA.LWAException;

/**
* API tests for EasyShipApi
*/
@Ignore
public class EasyShipApiTest {

private final EasyShipApi api = new EasyShipApi();


/**
* 
*
* Schedules an Easy Ship order and returns the scheduled package information.  This operation does the following:  *  Specifies the time slot and handover method for the order to be scheduled for delivery.  * Updates the Easy Ship order status.  * Generates a shipping label and an invoice. Calling &#x60;createScheduledPackage&#x60; also generates a warranty document if you specify a &#x60;SerialNumber&#x60; value. To get these documents, see [How to get invoice, shipping label, and warranty documents](doc:easyship-api-v2022-03-23-use-case-guide).  * Shows the status of Easy Ship orders when you call the &#x60;getOrders&#x60; operation of the Selling Partner API for Orders and examine the &#x60;EasyShipShipmentStatus&#x60; property in the response body.  See the **Shipping Label**, **Invoice**, and **Warranty** columns in the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table) to see which documents are supported in each marketplace.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void createScheduledPackageTest() throws ApiException, LWAException {
    CreateScheduledPackageRequest createScheduledPackageRequest = null;
ModelPackage response = api.createScheduledPackage(createScheduledPackageRequest);

// TODO: test validations
}

/**
* 
*
* This operation automatically schedules a time slot for all the &#x60;amazonOrderId&#x60;s given as input, generating the associated shipping labels, along with other compliance documents according to the marketplace (refer to the [marketplace document support table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table)).  Developers calling this operation may optionally assign a &#x60;packageDetails&#x60; object, allowing them to input a preferred time slot for each order in ther request. In this case, Amazon will try to schedule the respective packages using their optional settings. On the other hand, *i.e.*, if the time slot is not provided, Amazon will then pick the earliest time slot possible.   Regarding the shipping label&#39;s file format, external developers are able to choose between PDF or ZPL, and Amazon will create the label accordingly.  This operation returns an array composed of the scheduled packages, and a short-lived URL pointing to a zip file containing the generated shipping labels and the other documents enabled for your marketplace. If at least an order couldn&#39;t be scheduled, then Amazon adds the &#x60;rejectedOrders&#x60; list into the response, which contains an entry for each order we couldn&#39;t process. Each entry is composed of an error message describing the reason of the failure, so that sellers can take action.  The table below displays the supported request and burst maximum rates:  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void createScheduledPackageBulkTest() throws ApiException, LWAException {
    CreateScheduledPackagesRequest createScheduledPackagesRequest = null;
CreateScheduledPackagesResponse response = api.createScheduledPackageBulk(createScheduledPackagesRequest);

// TODO: test validations
}

/**
* 
*
* Returns information about a package, including dimensions, weight, time slot information for handover, invoice and item information, and status.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getScheduledPackageTest() throws ApiException, LWAException {
    String amazonOrderId = null;
    String marketplaceId = null;
ModelPackage response = api.getScheduledPackage(amazonOrderId, marketplaceId);

// TODO: test validations
}

/**
* 
*
* Returns time slots available for Easy Ship orders to be scheduled based on the package weight and dimensions that the seller specifies.  This operation is available for scheduled and unscheduled orders based on marketplace support. See **Get Time Slots** in the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table).  This operation can return time slots that have either pickup or drop-off handover methods - see **Supported Handover Methods** in the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table).  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void listHandoverSlotsTest() throws ApiException, LWAException {
    ListHandoverSlotsRequest listHandoverSlotsRequest = null;
ListHandoverSlotsResponse response = api.listHandoverSlots(listHandoverSlotsRequest);

// TODO: test validations
}

/**
* 
*
* Updates the time slot for handing over the package indicated by the specified &#x60;scheduledPackageId&#x60;. You can get the new &#x60;slotId&#x60; value for the time slot by calling the &#x60;listHandoverSlots&#x60; operation before making another &#x60;patch&#x60; call.  See the **Update Package** column in the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table) to see which marketplaces this operation is supported in.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void updateScheduledPackagesTest() throws ApiException, LWAException {
    UpdateScheduledPackagesRequest updateScheduledPackagesRequest = null;
Packages response = api.updateScheduledPackages(updateScheduledPackagesRequest);

// TODO: test validations
}

}