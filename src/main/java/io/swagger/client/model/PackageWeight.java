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
import io.swagger.client.model.WeightUnitOfMeasurement;
import java.io.IOException;

/**
 * Represents the weight of the package with a unit of measurement.
 */
@ApiModel(description = "Represents the weight of the package with a unit of measurement.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-30T20:46:44.946+08:00")
public class PackageWeight {
  @SerializedName("unitOfMeasurement")
  private WeightUnitOfMeasurement unitOfMeasurement = null;

  @SerializedName("weight")
  private Double weight = null;

  public PackageWeight unitOfMeasurement(WeightUnitOfMeasurement unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
    return this;
  }

   /**
   * Unit of measurement for the package weight.
   * @return unitOfMeasurement
  **/
  @ApiModelProperty(required = true, value = "Unit of measurement for the package weight.")
  public WeightUnitOfMeasurement getUnitOfMeasurement() {
    return unitOfMeasurement;
  }

  public void setUnitOfMeasurement(WeightUnitOfMeasurement unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
  }

  public PackageWeight weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The package weight value.
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "The package weight value.")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
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
    PackageWeight packageWeight = (PackageWeight) o;
    return Objects.equals(this.unitOfMeasurement, packageWeight.unitOfMeasurement) &&
        Objects.equals(this.weight, packageWeight.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitOfMeasurement, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageWeight {\n");
    
    sb.append("    unitOfMeasurement: ").append(toIndentedString(unitOfMeasurement)).append("\n");
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

