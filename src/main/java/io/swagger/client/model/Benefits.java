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
import io.swagger.client.model.ExcludedBenefits;
import io.swagger.client.model.IncludedBenefits;
import java.io.IOException;

/**
 * Representing the included/excluded benefits that we offer for each ShippingOffering/Rate. Benefits being services provided by Amazon when sellers purchase shipping through Amazon.
 */
@ApiModel(description = "Representing the included/excluded benefits that we offer for each ShippingOffering/Rate. Benefits being services provided by Amazon when sellers purchase shipping through Amazon.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:18:11.724+08:00")
public class Benefits {
  @SerializedName("includedBenefits")
  private IncludedBenefits includedBenefits = null;

  @SerializedName("excludedBenefits")
  private ExcludedBenefits excludedBenefits = null;

  public Benefits includedBenefits(IncludedBenefits includedBenefits) {
    this.includedBenefits = includedBenefits;
    return this;
  }

   /**
   * Get includedBenefits
   * @return includedBenefits
  **/
  @ApiModelProperty(required = true, value = "")
  public IncludedBenefits getIncludedBenefits() {
    return includedBenefits;
  }

  public void setIncludedBenefits(IncludedBenefits includedBenefits) {
    this.includedBenefits = includedBenefits;
  }

  public Benefits excludedBenefits(ExcludedBenefits excludedBenefits) {
    this.excludedBenefits = excludedBenefits;
    return this;
  }

   /**
   * Get excludedBenefits
   * @return excludedBenefits
  **/
  @ApiModelProperty(required = true, value = "")
  public ExcludedBenefits getExcludedBenefits() {
    return excludedBenefits;
  }

  public void setExcludedBenefits(ExcludedBenefits excludedBenefits) {
    this.excludedBenefits = excludedBenefits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Benefits benefits = (Benefits) o;
    return Objects.equals(this.includedBenefits, benefits.includedBenefits) &&
        Objects.equals(this.excludedBenefits, benefits.excludedBenefits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includedBenefits, excludedBenefits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Benefits {\n");
    
    sb.append("    includedBenefits: ").append(toIndentedString(includedBenefits)).append("\n");
    sb.append("    excludedBenefits: ").append(toIndentedString(excludedBenefits)).append("\n");
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

