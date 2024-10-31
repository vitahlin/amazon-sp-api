/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
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
import io.swagger.client.model.ExcludedBenefitReasonCodes;
import java.io.IOException;

/**
 * Object representing an excluded benefit that is excluded for a shipping offer or rate.
 */
@ApiModel(description = "Object representing an excluded benefit that is excluded for a shipping offer or rate.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:04:39.755+08:00")
public class ExcludedBenefit {
  @SerializedName("Benefit")
  private String benefit = null;

  @SerializedName("ReasonCodes")
  private ExcludedBenefitReasonCodes reasonCodes = null;

  public ExcludedBenefit benefit(String benefit) {
    this.benefit = benefit;
    return this;
  }

   /**
   * Benefit that is being excluded from a shipment.
   * @return benefit
  **/
  @ApiModelProperty(value = "Benefit that is being excluded from a shipment.")
  public String getBenefit() {
    return benefit;
  }

  public void setBenefit(String benefit) {
    this.benefit = benefit;
  }

  public ExcludedBenefit reasonCodes(ExcludedBenefitReasonCodes reasonCodes) {
    this.reasonCodes = reasonCodes;
    return this;
  }

   /**
   * Get reasonCodes
   * @return reasonCodes
  **/
  @ApiModelProperty(value = "")
  public ExcludedBenefitReasonCodes getReasonCodes() {
    return reasonCodes;
  }

  public void setReasonCodes(ExcludedBenefitReasonCodes reasonCodes) {
    this.reasonCodes = reasonCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcludedBenefit excludedBenefit = (ExcludedBenefit) o;
    return Objects.equals(this.benefit, excludedBenefit.benefit) &&
        Objects.equals(this.reasonCodes, excludedBenefit.reasonCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefit, reasonCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcludedBenefit {\n");
    
    sb.append("    benefit: ").append(toIndentedString(benefit)).append("\n");
    sb.append("    reasonCodes: ").append(toIndentedString(reasonCodes)).append("\n");
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
