/*
 * Selling Partner API for Supply Sources
 * Manage configurations and capabilities of seller supply sources.
 *
 * OpenAPI spec version: 2020-07-01
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
 * The result of creating a new supply source.
 */
@ApiModel(description = "The result of creating a new supply source.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:19:44.003+08:00")
public class CreateSupplySourceResponse {
  @SerializedName("supplySourceId")
  private String supplySourceId = null;

  @SerializedName("supplySourceCode")
  private String supplySourceCode = null;

  public CreateSupplySourceResponse supplySourceId(String supplySourceId) {
    this.supplySourceId = supplySourceId;
    return this;
  }

   /**
   * Get supplySourceId
   * @return supplySourceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSupplySourceId() {
    return supplySourceId;
  }

  public void setSupplySourceId(String supplySourceId) {
    this.supplySourceId = supplySourceId;
  }

  public CreateSupplySourceResponse supplySourceCode(String supplySourceCode) {
    this.supplySourceCode = supplySourceCode;
    return this;
  }

   /**
   * Get supplySourceCode
   * @return supplySourceCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSupplySourceCode() {
    return supplySourceCode;
  }

  public void setSupplySourceCode(String supplySourceCode) {
    this.supplySourceCode = supplySourceCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSupplySourceResponse createSupplySourceResponse = (CreateSupplySourceResponse) o;
    return Objects.equals(this.supplySourceId, createSupplySourceResponse.supplySourceId) &&
        Objects.equals(this.supplySourceCode, createSupplySourceResponse.supplySourceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplySourceId, supplySourceCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSupplySourceResponse {\n");
    
    sb.append("    supplySourceId: ").append(toIndentedString(supplySourceId)).append("\n");
    sb.append("    supplySourceCode: ").append(toIndentedString(supplySourceCode)).append("\n");
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

