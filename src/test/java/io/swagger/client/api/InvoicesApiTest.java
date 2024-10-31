/*
 * The Selling Partner API for Invoices.
 * Use the Selling Partner API for Invoices to retrieve and manage invoice-related operations, which can help selling partners manage their bookkeeping processes.
 *
 * OpenAPI spec version: 2024-06-19
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.ExportInvoicesRequest;
import io.swagger.client.model.ExportInvoicesResponse;
import io.swagger.client.model.GetInvoiceResponse;
import io.swagger.client.model.GetInvoicesAttributesResponse;
import io.swagger.client.model.GetInvoicesDocumentResponse;
import io.swagger.client.model.GetInvoicesExportResponse;
import io.swagger.client.model.GetInvoicesExportsResponse;
import io.swagger.client.model.GetInvoicesResponse;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.amazon.SellingPartnerAPIAA.LWAException;

/**
* API tests for InvoicesApi
*/
@Ignore
public class InvoicesApiTest {

private final InvoicesApi api = new InvoicesApi();


/**
* 
*
* Creates an invoice export request.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.167 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void createInvoicesExportTest() throws ApiException, LWAException {
    ExportInvoicesRequest body = null;
ExportInvoicesResponse response = api.createInvoicesExport(body);

// TODO: test validations
}

/**
* 
*
* Returns invoice data for the specified invoice. This operation returns only a subset of the invoices data; refer to the response definition to get all the possible attributes. To get the full invoice, use the &#x60;createInvoicesExport&#x60; operation to start an export request.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 15 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getInvoiceTest() throws ApiException, LWAException {
    String marketplaceId = null;
    String invoiceId = null;
GetInvoiceResponse response = api.getInvoice(marketplaceId, invoiceId);

// TODO: test validations
}

/**
* 
*
* Returns invoice details for the invoices that match the filters that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.1 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getInvoicesTest() throws ApiException, LWAException {
    String marketplaceId = null;
    String transactionIdentifierName = null;
    Integer pageSize = null;
    OffsetDateTime dateEnd = null;
    String transactionType = null;
    String transactionIdentifierId = null;
    OffsetDateTime dateStart = null;
    String series = null;
    String nextToken = null;
    String sortOrder = null;
    String invoiceType = null;
    List<String> statuses = null;
    String externalInvoiceId = null;
    String sortBy = null;
GetInvoicesResponse response = api.getInvoices(marketplaceId, transactionIdentifierName, pageSize, dateEnd, transactionType, transactionIdentifierId, dateStart, series, nextToken, sortOrder, invoiceType, statuses, externalInvoiceId, sortBy);

// TODO: test validations
}

/**
* 
*
* Returns marketplace-dependent schemas and their respective set of possible values.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getInvoicesAttributesTest() throws ApiException, LWAException {
    String marketplaceId = null;
GetInvoicesAttributesResponse response = api.getInvoicesAttributes(marketplaceId);

// TODO: test validations
}

/**
* 
*
* Returns the invoice document&#39;s ID and URL. Use the URL to download the ZIP file, which contains the invoices from the corresponding &#x60;createInvoicesExport&#x60; request.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0167 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getInvoicesDocumentTest() throws ApiException, LWAException {
    String invoicesDocumentId = null;
GetInvoicesDocumentResponse response = api.getInvoicesDocument(invoicesDocumentId);

// TODO: test validations
}

/**
* 
*
* Returns invoice export details (including the &#x60;exportDocumentId&#x60;, if available) for the export that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 15 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getInvoicesExportTest() throws ApiException, LWAException {
    String exportId = null;
GetInvoicesExportResponse response = api.getInvoicesExport(exportId);

// TODO: test validations
}

/**
* 
*
* Returns invoice exports details for exports that match the filters that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.1 | 20 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The preceding table indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may have higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getInvoicesExportsTest() throws ApiException, LWAException {
    String marketplaceId = null;
    OffsetDateTime dateStart = null;
    String nextToken = null;
    Integer pageSize = null;
    OffsetDateTime dateEnd = null;
    String status = null;
GetInvoicesExportsResponse response = api.getInvoicesExports(marketplaceId, dateStart, nextToken, pageSize, dateEnd, status);

// TODO: test validations
}

}