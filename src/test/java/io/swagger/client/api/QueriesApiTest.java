/*
 * Selling Partner API for Data Kiosk
 * The Selling Partner API for Data Kiosk lets you submit GraphQL queries from a variety of schemas to help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2023-11-15
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CreateQueryResponse;
import io.swagger.client.model.CreateQuerySpecification;
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.GetDocumentResponse;
import io.swagger.client.model.GetQueriesResponse;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.Query;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.amazon.SellingPartnerAPIAA.LWAException;

/**
* API tests for QueriesApi
*/
@Ignore
public class QueriesApiTest {

private final QueriesApi api = new QueriesApi();


/**
* 
*
* Cancels the query specified by the &#x60;queryId&#x60; parameter. Only queries with a non-terminal &#x60;processingStatus&#x60; (&#x60;IN_QUEUE&#x60;, &#x60;IN_PROGRESS&#x60;) can be cancelled. Cancelling a query that already has a &#x60;processingStatus&#x60; of &#x60;CANCELLED&#x60; will no-op. Cancelled queries are returned in subsequent calls to the &#x60;getQuery&#x60; and &#x60;getQueries&#x60; operations.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void cancelQueryTest() throws ApiException, LWAException {
    String queryId = null;
api.cancelQuery(queryId);

// TODO: test validations
}

/**
* 
*
* Creates a Data Kiosk query request.  **Note:** The retention of a query varies based on the fields requested. Each field within a schema is annotated with a &#x60;@resultRetention&#x60; directive that defines how long a query containing that field will be retained. When a query contains multiple fields with different retentions, the shortest (minimum) retention is applied. The retention of a query&#39;s resulting documents always matches the retention of the query.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0167 | 15 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void createQueryTest() throws ApiException, LWAException {
    CreateQuerySpecification body = null;
CreateQueryResponse response = api.createQuery(body);

// TODO: test validations
}

/**
* 
*
* Returns the information required for retrieving a Data Kiosk document&#39;s contents. See the &#x60;createQuery&#x60; operation for details about document retention.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0167 | 15 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getDocumentTest() throws ApiException, LWAException {
    String documentId = null;
GetDocumentResponse response = api.getDocument(documentId);

// TODO: test validations
}

/**
* 
*
* Returns details for the Data Kiosk queries that match the specified filters. See the &#x60;createQuery&#x60; operation for details about query retention.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getQueriesTest() throws ApiException, LWAException {
    List<String> processingStatuses = null;
    Integer pageSize = null;
    OffsetDateTime createdSince = null;
    OffsetDateTime createdUntil = null;
    String paginationToken = null;
GetQueriesResponse response = api.getQueries(processingStatuses, pageSize, createdSince, createdUntil, paginationToken);

// TODO: test validations
}

/**
* 
*
* Returns query details for the query specified by the &#x60;queryId&#x60; parameter. See the &#x60;createQuery&#x60; operation for details about query retention.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2.0 | 15 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getQueryTest() throws ApiException, LWAException {
    String queryId = null;
Query response = api.getQuery(queryId);

// TODO: test validations
}

}