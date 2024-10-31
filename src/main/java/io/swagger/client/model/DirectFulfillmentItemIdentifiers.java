/*
 * Amazon Shipping API
 * The Amazon Shipping API is designed to support outbound shipping use cases both for orders originating on Amazon-owned marketplaces as well as external channels/marketplaces. With these APIs, you can request shipping rates, create shipments, cancel shipments, and track shipments.
 *
 * OpenAPI spec version: v2
 * Contact: swa-api-core@amazon.com
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
import java.io.IOException;

/**
 * Item identifiers for an item in a direct fulfillment shipment.
 */
@ApiModel(description = "Item identifiers for an item in a direct fulfillment shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:18:11.724+08:00")
public class DirectFulfillmentItemIdentifiers {
  @SerializedName("lineItemID")
  private String lineItemID = null;

  @SerializedName("pieceNumber")
  private String pieceNumber = null;

  public DirectFulfillmentItemIdentifiers lineItemID(String lineItemID) {
    this.lineItemID = lineItemID;
    return this;
  }

   /**
   * A unique identifier for an item provided by the client for a direct fulfillment shipment. This is only populated for direct fulfillment multi-piece shipments. It is required if a vendor wants to change the configuration of the packages in which the purchase order is shipped.
   * @return lineItemID
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for an item provided by the client for a direct fulfillment shipment. This is only populated for direct fulfillment multi-piece shipments. It is required if a vendor wants to change the configuration of the packages in which the purchase order is shipped.")
  public String getLineItemID() {
    return lineItemID;
  }

  public void setLineItemID(String lineItemID) {
    this.lineItemID = lineItemID;
  }

  public DirectFulfillmentItemIdentifiers pieceNumber(String pieceNumber) {
    this.pieceNumber = pieceNumber;
    return this;
  }

   /**
   * A unique identifier for an item provided by the client for a direct fulfillment shipment. This is only populated if a single line item has multiple pieces. Defaults to 1.
   * @return pieceNumber
  **/
  @ApiModelProperty(value = "A unique identifier for an item provided by the client for a direct fulfillment shipment. This is only populated if a single line item has multiple pieces. Defaults to 1.")
  public String getPieceNumber() {
    return pieceNumber;
  }

  public void setPieceNumber(String pieceNumber) {
    this.pieceNumber = pieceNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectFulfillmentItemIdentifiers directFulfillmentItemIdentifiers = (DirectFulfillmentItemIdentifiers) o;
    return Objects.equals(this.lineItemID, directFulfillmentItemIdentifiers.lineItemID) &&
        Objects.equals(this.pieceNumber, directFulfillmentItemIdentifiers.pieceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItemID, pieceNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectFulfillmentItemIdentifiers {\n");
    
    sb.append("    lineItemID: ").append(toIndentedString(lineItemID)).append("\n");
    sb.append("    pieceNumber: ").append(toIndentedString(pieceNumber)).append("\n");
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

