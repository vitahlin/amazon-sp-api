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


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CompetitiveSummaryResponseBody;
import io.swagger.client.model.HttpStatusLine;
import java.io.IOException;

/**
 * The response for the individual &#x60;competitiveSummary&#x60; request in the batch operation.
 */
@ApiModel(description = "The response for the individual `competitiveSummary` request in the batch operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:08:31.630+08:00")
public class CompetitiveSummaryResponse {
  @SerializedName("status")
  private HttpStatusLine status = null;

  @SerializedName("body")
  private CompetitiveSummaryResponseBody body = null;

  public CompetitiveSummaryResponse status(HttpStatusLine status) {
    this.status = status;
    return this;
  }

   /**
   * The HTTP status line associated with the response. For more information, refer to [RFC 2616](https://www.w3.org/Protocols/rfc2616/rfc2616-sec6.html).
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The HTTP status line associated with the response. For more information, refer to [RFC 2616](https://www.w3.org/Protocols/rfc2616/rfc2616-sec6.html).")
  public HttpStatusLine getStatus() {
    return status;
  }

  public void setStatus(HttpStatusLine status) {
    this.status = status;
  }

  public CompetitiveSummaryResponse body(CompetitiveSummaryResponseBody body) {
    this.body = body;
    return this;
  }

   /**
   * The &#x60;competitiveSummaryResponse&#x60; body for a requested ASIN and &#x60;marketplaceId&#x60;.
   * @return body
  **/
  @ApiModelProperty(required = true, value = "The `competitiveSummaryResponse` body for a requested ASIN and `marketplaceId`.")
  public CompetitiveSummaryResponseBody getBody() {
    return body;
  }

  public void setBody(CompetitiveSummaryResponseBody body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetitiveSummaryResponse competitiveSummaryResponse = (CompetitiveSummaryResponse) o;
    return Objects.equals(this.status, competitiveSummaryResponse.status) &&
        Objects.equals(this.body, competitiveSummaryResponse.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitiveSummaryResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

