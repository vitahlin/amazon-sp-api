/*
 * The Selling Partner API for Amazon Warehousing and Distribution
 * The Selling Partner API for Amazon Warehousing and Distribution (AWD) provides programmatic access to information about AWD shipments and inventory. 
 *
 * OpenAPI spec version: 2024-05-09
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
 * Additional inventory details. This object is only displayed if the details parameter in the request is set to &#x60;SHOW&#x60;.
 */
@ApiModel(description = "Additional inventory details. This object is only displayed if the details parameter in the request is set to `SHOW`.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-30T20:46:44.946+08:00")
public class InventoryDetails {
  @SerializedName("availableDistributableQuantity")
  private Long availableDistributableQuantity = null;

  @SerializedName("reservedDistributableQuantity")
  private Long reservedDistributableQuantity = null;

  public InventoryDetails availableDistributableQuantity(Long availableDistributableQuantity) {
    this.availableDistributableQuantity = availableDistributableQuantity;
    return this;
  }

   /**
   * Quantity that is available for downstream channel replenishment.
   * @return availableDistributableQuantity
  **/
  @ApiModelProperty(value = "Quantity that is available for downstream channel replenishment.")
  public Long getAvailableDistributableQuantity() {
    return availableDistributableQuantity;
  }

  public void setAvailableDistributableQuantity(Long availableDistributableQuantity) {
    this.availableDistributableQuantity = availableDistributableQuantity;
  }

  public InventoryDetails reservedDistributableQuantity(Long reservedDistributableQuantity) {
    this.reservedDistributableQuantity = reservedDistributableQuantity;
    return this;
  }

   /**
   * Quantity that is reserved for a downstream channel replenishment order that is being prepared for shipment.
   * @return reservedDistributableQuantity
  **/
  @ApiModelProperty(value = "Quantity that is reserved for a downstream channel replenishment order that is being prepared for shipment.")
  public Long getReservedDistributableQuantity() {
    return reservedDistributableQuantity;
  }

  public void setReservedDistributableQuantity(Long reservedDistributableQuantity) {
    this.reservedDistributableQuantity = reservedDistributableQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryDetails inventoryDetails = (InventoryDetails) o;
    return Objects.equals(this.availableDistributableQuantity, inventoryDetails.availableDistributableQuantity) &&
        Objects.equals(this.reservedDistributableQuantity, inventoryDetails.reservedDistributableQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableDistributableQuantity, reservedDistributableQuantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryDetails {\n");
    
    sb.append("    availableDistributableQuantity: ").append(toIndentedString(availableDistributableQuantity)).append("\n");
    sb.append("    reservedDistributableQuantity: ").append(toIndentedString(reservedDistributableQuantity)).append("\n");
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
