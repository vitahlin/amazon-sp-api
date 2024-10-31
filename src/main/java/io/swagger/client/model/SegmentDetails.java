/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer pricing information for Amazon Marketplace products.  For more information, refer to the [Product Pricing v2022-05-01 Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/product-pricing-api-v2022-05-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-05-01
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
import java.math.BigDecimal;

/**
 * The details about the segment.
 */
@ApiModel(description = "The details about the segment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:08:31.630+08:00")
public class SegmentDetails {
  @SerializedName("glanceViewWeightPercentage")
  private BigDecimal glanceViewWeightPercentage = null;

  public SegmentDetails glanceViewWeightPercentage(BigDecimal glanceViewWeightPercentage) {
    this.glanceViewWeightPercentage = glanceViewWeightPercentage;
    return this;
  }

   /**
   * Glance view weight percentage for this segment. The glance views for this segment as a percentage of total glance views across all segments on the ASIN. A higher percentage indicates more Amazon customers see this offer as the Featured Offer.
   * @return glanceViewWeightPercentage
  **/
  @ApiModelProperty(value = "Glance view weight percentage for this segment. The glance views for this segment as a percentage of total glance views across all segments on the ASIN. A higher percentage indicates more Amazon customers see this offer as the Featured Offer.")
  public BigDecimal getGlanceViewWeightPercentage() {
    return glanceViewWeightPercentage;
  }

  public void setGlanceViewWeightPercentage(BigDecimal glanceViewWeightPercentage) {
    this.glanceViewWeightPercentage = glanceViewWeightPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentDetails segmentDetails = (SegmentDetails) o;
    return Objects.equals(this.glanceViewWeightPercentage, segmentDetails.glanceViewWeightPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(glanceViewWeightPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentDetails {\n");
    
    sb.append("    glanceViewWeightPercentage: ").append(toIndentedString(glanceViewWeightPercentage)).append("\n");
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
