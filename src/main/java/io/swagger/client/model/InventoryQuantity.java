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
import io.swagger.client.model.InventoryUnitOfMeasurement;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Quantity of inventory with an associated measurement unit context.
 */
@ApiModel(description = "Quantity of inventory with an associated measurement unit context.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-30T20:46:44.946+08:00")
public class InventoryQuantity {
  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("unitOfMeasurement")
  private InventoryUnitOfMeasurement unitOfMeasurement = null;

  public InventoryQuantity quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of the respective inventory.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Quantity of the respective inventory.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public InventoryQuantity unitOfMeasurement(InventoryUnitOfMeasurement unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
    return this;
  }

   /**
   * Unit of measurement for the inventory.
   * @return unitOfMeasurement
  **/
  @ApiModelProperty(required = true, value = "Unit of measurement for the inventory.")
  public InventoryUnitOfMeasurement getUnitOfMeasurement() {
    return unitOfMeasurement;
  }

  public void setUnitOfMeasurement(InventoryUnitOfMeasurement unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryQuantity inventoryQuantity = (InventoryQuantity) o;
    return Objects.equals(this.quantity, inventoryQuantity.quantity) &&
        Objects.equals(this.unitOfMeasurement, inventoryQuantity.unitOfMeasurement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, unitOfMeasurement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryQuantity {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitOfMeasurement: ").append(toIndentedString(unitOfMeasurement)).append("\n");
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

