/*
 * Selling Partner API for FBA Inbound Eligibilty
 * With the FBA Inbound Eligibility API, you can build applications that let sellers get eligibility previews for items before shipping them to Amazon's fulfillment centers. With this API you can find out if an item is eligible for inbound shipment to Amazon's fulfillment centers in a specific marketplace. You can also find out if an item is eligible for using the manufacturer barcode for FBA inventory tracking. Sellers can use this information to inform their decisions about which items to ship Amazon's fulfillment centers.
 *
 * OpenAPI spec version: v1
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
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.ItemEligibilityPreview;
import java.io.IOException;

/**
 * The response schema for the getItemEligibilityPreview operation.
 */
@ApiModel(description = "The response schema for the getItemEligibilityPreview operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:50:36.090+08:00")
public class GetItemEligibilityPreviewResponse {
  @SerializedName("payload")
  private ItemEligibilityPreview payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetItemEligibilityPreviewResponse payload(ItemEligibilityPreview payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getItemEligibilityPreview operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getItemEligibilityPreview operation.")
  public ItemEligibilityPreview getPayload() {
    return payload;
  }

  public void setPayload(ItemEligibilityPreview payload) {
    this.payload = payload;
  }

  public GetItemEligibilityPreviewResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * An unexpected condition occurred during the GetItemEligibilityPreview operation.
   * @return errors
  **/
  @ApiModelProperty(value = "An unexpected condition occurred during the GetItemEligibilityPreview operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetItemEligibilityPreviewResponse getItemEligibilityPreviewResponse = (GetItemEligibilityPreviewResponse) o;
    return Objects.equals(this.payload, getItemEligibilityPreviewResponse.payload) &&
        Objects.equals(this.errors, getItemEligibilityPreviewResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetItemEligibilityPreviewResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

