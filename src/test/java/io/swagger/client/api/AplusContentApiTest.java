/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.GetContentDocumentResponse;
import io.swagger.client.model.ListContentDocumentAsinRelationsResponse;
import io.swagger.client.model.PostContentDocumentApprovalSubmissionResponse;
import io.swagger.client.model.PostContentDocumentAsinRelationsRequest;
import io.swagger.client.model.PostContentDocumentAsinRelationsResponse;
import io.swagger.client.model.PostContentDocumentRequest;
import io.swagger.client.model.PostContentDocumentResponse;
import io.swagger.client.model.PostContentDocumentSuspendSubmissionResponse;
import io.swagger.client.model.SearchContentDocumentsResponse;
import io.swagger.client.model.SearchContentPublishRecordsResponse;
import io.swagger.client.model.ValidateContentDocumentAsinRelationsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.amazon.SellingPartnerAPIAA.LWAException;

/**
* API tests for AplusContentApi
*/
@Ignore
public class AplusContentApiTest {

private final AplusContentApi api = new AplusContentApi();


/**
* 
*
* Creates a new A+ Content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void createContentDocumentTest() throws ApiException, LWAException {
    String marketplaceId = null;
    PostContentDocumentRequest postContentDocumentRequest = null;
PostContentDocumentResponse response = api.createContentDocument(marketplaceId, postContentDocumentRequest);

// TODO: test validations
}

/**
* 
*
* Returns an A+ Content document, if available.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void getContentDocumentTest() throws ApiException, LWAException {
    String contentReferenceKey = null;
    String marketplaceId = null;
    List<String> includedDataSet = null;
GetContentDocumentResponse response = api.getContentDocument(contentReferenceKey, marketplaceId, includedDataSet);

// TODO: test validations
}

/**
* 
*
* Returns a list of ASINs related to the specified A+ Content document, if available. If you do not include the asinSet parameter, the operation returns all ASINs related to the content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void listContentDocumentAsinRelationsTest() throws ApiException, LWAException {
    String contentReferenceKey = null;
    String marketplaceId = null;
    List<String> includedDataSet = null;
    List<String> asinSet = null;
    String pageToken = null;
ListContentDocumentAsinRelationsResponse response = api.listContentDocumentAsinRelations(contentReferenceKey, marketplaceId, includedDataSet, asinSet, pageToken);

// TODO: test validations
}

/**
* 
*
* Submits an A+ Content document for review, approval, and publishing.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void postContentDocumentApprovalSubmissionTest() throws ApiException, LWAException {
    String contentReferenceKey = null;
    String marketplaceId = null;
PostContentDocumentApprovalSubmissionResponse response = api.postContentDocumentApprovalSubmission(contentReferenceKey, marketplaceId);

// TODO: test validations
}

/**
* 
*
* Replaces all ASINs related to the specified A+ Content document, if available. This may add or remove ASINs, depending on the current set of related ASINs. Removing an ASIN has the side effect of suspending the content document from that ASIN.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void postContentDocumentAsinRelationsTest() throws ApiException, LWAException {
    String contentReferenceKey = null;
    String marketplaceId = null;
    PostContentDocumentAsinRelationsRequest postContentDocumentAsinRelationsRequest = null;
PostContentDocumentAsinRelationsResponse response = api.postContentDocumentAsinRelations(contentReferenceKey, marketplaceId, postContentDocumentAsinRelationsRequest);

// TODO: test validations
}

/**
* 
*
* Submits a request to suspend visible A+ Content. This neither deletes the content document nor the ASIN relations.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void postContentDocumentSuspendSubmissionTest() throws ApiException, LWAException {
    String contentReferenceKey = null;
    String marketplaceId = null;
PostContentDocumentSuspendSubmissionResponse response = api.postContentDocumentSuspendSubmission(contentReferenceKey, marketplaceId);

// TODO: test validations
}

/**
* 
*
* Returns a list of all A+ Content documents assigned to a selling partner. This operation returns only the metadata of the A+ Content documents. Call the getContentDocument operation to get the actual contents of the A+ Content documents.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void searchContentDocumentsTest() throws ApiException, LWAException {
    String marketplaceId = null;
    String pageToken = null;
SearchContentDocumentsResponse response = api.searchContentDocuments(marketplaceId, pageToken);

// TODO: test validations
}

/**
* 
*
* Searches for A+ Content publishing records, if available.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void searchContentPublishRecordsTest() throws ApiException, LWAException {
    String marketplaceId = null;
    String asin = null;
    String pageToken = null;
SearchContentPublishRecordsResponse response = api.searchContentPublishRecords(marketplaceId, asin, pageToken);

// TODO: test validations
}

/**
* 
*
* Updates an existing A+ Content document.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void updateContentDocumentTest() throws ApiException, LWAException {
    String contentReferenceKey = null;
    String marketplaceId = null;
    PostContentDocumentRequest postContentDocumentRequest = null;
PostContentDocumentResponse response = api.updateContentDocument(contentReferenceKey, marketplaceId, postContentDocumentRequest);

// TODO: test validations
}

/**
* 
*
* Checks if the A+ Content document is valid for use on a set of ASINs.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void validateContentDocumentAsinRelationsTest() throws ApiException, LWAException {
    String marketplaceId = null;
    PostContentDocumentRequest postContentDocumentRequest = null;
    List<String> asinSet = null;
ValidateContentDocumentAsinRelationsResponse response = api.validateContentDocumentAsinRelations(marketplaceId, postContentDocumentRequest, asinSet);

// TODO: test validations
}

}