/*
 * The Selling Partner API for FBA inbound operations.
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
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
import io.swagger.client.model.Dimensions;
import io.swagger.client.model.Stackability;
import io.swagger.client.model.Weight;
import java.io.IOException;

/**
 * Contains information about a pallet that is used in the inbound plan. The pallet is a container that holds multiple items or boxes.
 */
@ApiModel(description = "Contains information about a pallet that is used in the inbound plan. The pallet is a container that holds multiple items or boxes.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:58:38.239+08:00")
public class Pallet {
  @SerializedName("dimensions")
  private Dimensions dimensions = null;

  @SerializedName("packageId")
  private String packageId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("stackability")
  private Stackability stackability = null;

  @SerializedName("weight")
  private Weight weight = null;

  public Pallet dimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(value = "")
  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public Pallet packageId(String packageId) {
    this.packageId = packageId;
    return this;
  }

   /**
   * Primary key to uniquely identify a Package (Box or Pallet).
   * @return packageId
  **/
  @ApiModelProperty(required = true, value = "Primary key to uniquely identify a Package (Box or Pallet).")
  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public Pallet quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of containers where all other properties like weight or dimensions are identical.
   * minimum: 1
   * maximum: 10000
   * @return quantity
  **/
  @ApiModelProperty(value = "The number of containers where all other properties like weight or dimensions are identical.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Pallet stackability(Stackability stackability) {
    this.stackability = stackability;
    return this;
  }

   /**
   * Get stackability
   * @return stackability
  **/
  @ApiModelProperty(value = "")
  public Stackability getStackability() {
    return stackability;
  }

  public void setStackability(Stackability stackability) {
    this.stackability = stackability;
  }

  public Pallet weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pallet pallet = (Pallet) o;
    return Objects.equals(this.dimensions, pallet.dimensions) &&
        Objects.equals(this.packageId, pallet.packageId) &&
        Objects.equals(this.quantity, pallet.quantity) &&
        Objects.equals(this.stackability, pallet.stackability) &&
        Objects.equals(this.weight, pallet.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, packageId, quantity, stackability, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pallet {\n");
    
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    stackability: ").append(toIndentedString(stackability)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

