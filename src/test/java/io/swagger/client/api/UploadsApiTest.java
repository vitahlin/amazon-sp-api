/*
 * Selling Partner API for Uploads
 * The Uploads API lets you upload files that you can programmatically access using other Selling Partner APIs, such as the A+ Content API and the Messaging API.
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
import io.swagger.client.model.CreateUploadDestinationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.amazon.SellingPartnerAPIAA.LWAException;

/**
* API tests for UploadsApi
*/
@Ignore
public class UploadsApiTest {

private final UploadsApi api = new UploadsApi();


/**
* 
*
* Creates an upload destination, returning the information required to upload a file to the destination and to programmatically access the file.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void createUploadDestinationForResourceTest() throws ApiException, LWAException {
    List<String> marketplaceIds = null;
    String contentMD5 = null;
    String resource = null;
    String contentType = null;
CreateUploadDestinationResponse response = api.createUploadDestinationForResource(marketplaceIds, contentMD5, resource, contentType);

// TODO: test validations
}

}