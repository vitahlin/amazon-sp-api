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
 * Contains the instructions about the fulfillment, such as the location from where you want the order filled.
 */
@ApiModel(description = "Contains the instructions about the fulfillment, such as the location from where you want the order filled.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:07:17.661+08:00")
public class FulfillmentInstruction {
  @SerializedName("FulfillmentSupplySourceId")
  private String fulfillmentSupplySourceId = null;

  public FulfillmentInstruction fulfillmentSupplySourceId(String fulfillmentSupplySourceId) {
    this.fulfillmentSupplySourceId = fulfillmentSupplySourceId;
    return this;
  }

   /**
   * The &#x60;sourceId&#x60; of the location from where you want the order fulfilled.
   * @return fulfillmentSupplySourceId
  **/
  @ApiModelProperty(value = "The `sourceId` of the location from where you want the order fulfilled.")
  public String getFulfillmentSupplySourceId() {
    return fulfillmentSupplySourceId;
  }

  public void setFulfillmentSupplySourceId(String fulfillmentSupplySourceId) {
    this.fulfillmentSupplySourceId = fulfillmentSupplySourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentInstruction fulfillmentInstruction = (FulfillmentInstruction) o;
    return Objects.equals(this.fulfillmentSupplySourceId, fulfillmentInstruction.fulfillmentSupplySourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentSupplySourceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentInstruction {\n");
    
    sb.append("    fulfillmentSupplySourceId: ").append(toIndentedString(fulfillmentSupplySourceId)).append("\n");
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

