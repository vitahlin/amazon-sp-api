/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer pricing information for Amazon Marketplace products.  For more information, refer to the [Product Pricing v2022-05-01 Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/product-pricing-api-v2022-05-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-05-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;
import io.swagger.client.StringUtil;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.CompetitiveSummaryBatchRequest;
import io.swagger.client.model.CompetitiveSummaryBatchResponse;
import io.swagger.client.model.Errors;
import io.swagger.client.model.GetFeaturedOfferExpectedPriceBatchRequest;
import io.swagger.client.model.GetFeaturedOfferExpectedPriceBatchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCache;
import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCacheImpl;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationSigner;
import com.amazon.SellingPartnerAPIAA.RateLimitConfiguration;
import com.amazon.SellingPartnerAPIAA.LWAException;

public class ProductPricingApi {
    private ApiClient apiClient;

    ProductPricingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductPricingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCompetitiveSummary
     * @param requests The batch of &#x60;getCompetitiveSummary&#x60; requests. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public com.squareup.okhttp.Call getCompetitiveSummaryCall(CompetitiveSummaryBatchRequest requests, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        Object localVarPostBody = requests;

        // create path and map variables
        String localVarPath = "/batches/products/pricing/2022-05-01/items/competitiveSummary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCompetitiveSummaryValidateBeforeCall(CompetitiveSummaryBatchRequest requests, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        
        // verify the required parameter 'requests' is set
        if (requests == null) {
            throw new ApiException("Missing the required parameter 'requests' when calling getCompetitiveSummary(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompetitiveSummaryCall(requests, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Returns the competitive summary response including featured buying options for the ASIN and &#x60;marketplaceId&#x60; combination.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.033 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     * @param requests The batch of &#x60;getCompetitiveSummary&#x60; requests. (required)
     * @return CompetitiveSummaryBatchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public CompetitiveSummaryBatchResponse getCompetitiveSummary(CompetitiveSummaryBatchRequest requests) throws ApiException,LWAException {
        ApiResponse<CompetitiveSummaryBatchResponse> resp = getCompetitiveSummaryWithHttpInfo(requests);
        return resp.getData();
    }

    /**
     * 
     * Returns the competitive summary response including featured buying options for the ASIN and &#x60;marketplaceId&#x60; combination.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.033 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     * @param requests The batch of &#x60;getCompetitiveSummary&#x60; requests. (required)
     * @return ApiResponse&lt;CompetitiveSummaryBatchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public ApiResponse<CompetitiveSummaryBatchResponse> getCompetitiveSummaryWithHttpInfo(CompetitiveSummaryBatchRequest requests) throws ApiException,LWAException {
        com.squareup.okhttp.Call call = getCompetitiveSummaryValidateBeforeCall(requests, null, null);
        Type localVarReturnType = new TypeToken<CompetitiveSummaryBatchResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns the competitive summary response including featured buying options for the ASIN and &#x60;marketplaceId&#x60; combination.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.033 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     * @param requests The batch of &#x60;getCompetitiveSummary&#x60; requests. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public com.squareup.okhttp.Call getCompetitiveSummaryAsync(CompetitiveSummaryBatchRequest requests, final ApiCallback<CompetitiveSummaryBatchResponse> callback) throws ApiException, LWAException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCompetitiveSummaryValidateBeforeCall(requests, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CompetitiveSummaryBatchResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFeaturedOfferExpectedPriceBatch
     * @param getFeaturedOfferExpectedPriceBatchRequestBody The batch of &#x60;getFeaturedOfferExpectedPrice&#x60; requests. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public com.squareup.okhttp.Call getFeaturedOfferExpectedPriceBatchCall(GetFeaturedOfferExpectedPriceBatchRequest getFeaturedOfferExpectedPriceBatchRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        Object localVarPostBody = getFeaturedOfferExpectedPriceBatchRequestBody;

        // create path and map variables
        String localVarPath = "/batches/products/pricing/2022-05-01/offer/featuredOfferExpectedPrice";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFeaturedOfferExpectedPriceBatchValidateBeforeCall(GetFeaturedOfferExpectedPriceBatchRequest getFeaturedOfferExpectedPriceBatchRequestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        
        // verify the required parameter 'getFeaturedOfferExpectedPriceBatchRequestBody' is set
        if (getFeaturedOfferExpectedPriceBatchRequestBody == null) {
            throw new ApiException("Missing the required parameter 'getFeaturedOfferExpectedPriceBatchRequestBody' when calling getFeaturedOfferExpectedPriceBatch(Async)");
        }
        

        com.squareup.okhttp.Call call = getFeaturedOfferExpectedPriceBatchCall(getFeaturedOfferExpectedPriceBatchRequestBody, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Returns the set of responses that correspond to the batched list of up to 40 requests defined in the request body. The response for each successful (HTTP status code 200) request in the set includes the computed listing price at or below which a seller can expect to become the featured offer (before applicable promotions). This is called the featured offer expected price (FOEP). Featured offer is not guaranteed, because competing offers may change, and different offers may be featured based on other factors, including fulfillment capabilities to a specific customer. The response to an unsuccessful request includes the available error text.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.033 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     * @param getFeaturedOfferExpectedPriceBatchRequestBody The batch of &#x60;getFeaturedOfferExpectedPrice&#x60; requests. (required)
     * @return GetFeaturedOfferExpectedPriceBatchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public GetFeaturedOfferExpectedPriceBatchResponse getFeaturedOfferExpectedPriceBatch(GetFeaturedOfferExpectedPriceBatchRequest getFeaturedOfferExpectedPriceBatchRequestBody) throws ApiException,LWAException {
        ApiResponse<GetFeaturedOfferExpectedPriceBatchResponse> resp = getFeaturedOfferExpectedPriceBatchWithHttpInfo(getFeaturedOfferExpectedPriceBatchRequestBody);
        return resp.getData();
    }

    /**
     * 
     * Returns the set of responses that correspond to the batched list of up to 40 requests defined in the request body. The response for each successful (HTTP status code 200) request in the set includes the computed listing price at or below which a seller can expect to become the featured offer (before applicable promotions). This is called the featured offer expected price (FOEP). Featured offer is not guaranteed, because competing offers may change, and different offers may be featured based on other factors, including fulfillment capabilities to a specific customer. The response to an unsuccessful request includes the available error text.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.033 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     * @param getFeaturedOfferExpectedPriceBatchRequestBody The batch of &#x60;getFeaturedOfferExpectedPrice&#x60; requests. (required)
     * @return ApiResponse&lt;GetFeaturedOfferExpectedPriceBatchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public ApiResponse<GetFeaturedOfferExpectedPriceBatchResponse> getFeaturedOfferExpectedPriceBatchWithHttpInfo(GetFeaturedOfferExpectedPriceBatchRequest getFeaturedOfferExpectedPriceBatchRequestBody) throws ApiException,LWAException {
        com.squareup.okhttp.Call call = getFeaturedOfferExpectedPriceBatchValidateBeforeCall(getFeaturedOfferExpectedPriceBatchRequestBody, null, null);
        Type localVarReturnType = new TypeToken<GetFeaturedOfferExpectedPriceBatchResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns the set of responses that correspond to the batched list of up to 40 requests defined in the request body. The response for each successful (HTTP status code 200) request in the set includes the computed listing price at or below which a seller can expect to become the featured offer (before applicable promotions). This is called the featured offer expected price (FOEP). Featured offer is not guaranteed, because competing offers may change, and different offers may be featured based on other factors, including fulfillment capabilities to a specific customer. The response to an unsuccessful request includes the available error text.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.033 | 1 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     * @param getFeaturedOfferExpectedPriceBatchRequestBody The batch of &#x60;getFeaturedOfferExpectedPrice&#x60; requests. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public com.squareup.okhttp.Call getFeaturedOfferExpectedPriceBatchAsync(GetFeaturedOfferExpectedPriceBatchRequest getFeaturedOfferExpectedPriceBatchRequestBody, final ApiCallback<GetFeaturedOfferExpectedPriceBatchResponse> callback) throws ApiException, LWAException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFeaturedOfferExpectedPriceBatchValidateBeforeCall(getFeaturedOfferExpectedPriceBatchRequestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetFeaturedOfferExpectedPriceBatchResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    public static class Builder {
        private LWAAuthorizationCredentials lwaAuthorizationCredentials;
        private String endpoint;
        private LWAAccessTokenCache lwaAccessTokenCache;
        private Boolean disableAccessTokenCache = false;
        private RateLimitConfiguration rateLimitConfiguration;


        public Builder lwaAuthorizationCredentials(LWAAuthorizationCredentials lwaAuthorizationCredentials) {
            this.lwaAuthorizationCredentials = lwaAuthorizationCredentials;
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        
        public Builder lwaAccessTokenCache(LWAAccessTokenCache lwaAccessTokenCache) {
            this.lwaAccessTokenCache = lwaAccessTokenCache;
            return this;
        }
		
	   public Builder disableAccessTokenCache() {
            this.disableAccessTokenCache = true;
            return this;
        }

        public Builder rateLimitConfigurationOnRequests(RateLimitConfiguration rateLimitConfiguration){
            this.rateLimitConfiguration = rateLimitConfiguration;
            return this;
        }
        
        public Builder disableRateLimitOnRequests() {
            this.rateLimitConfiguration = null;
            return this;
        }

        public ProductPricingApi build() {
            if (lwaAuthorizationCredentials == null) {
                throw new RuntimeException("LWAAuthorizationCredentials not set");
            }

            if (StringUtil.isEmpty(endpoint)) {
                throw new RuntimeException("Endpoint not set");
            }
            
            LWAAuthorizationSigner lwaAuthorizationSigner = null;            
            if (disableAccessTokenCache) {
                lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials);
            }
            else {
                if (lwaAccessTokenCache == null) {
                    lwaAccessTokenCache = new LWAAccessTokenCacheImpl();                  
                 }
                 lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials,lwaAccessTokenCache);
            }

            return new ProductPricingApi(new ApiClient()
                .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                .setBasePath(endpoint)
                .setRateLimiter(rateLimitConfiguration));
        }
    }
}
