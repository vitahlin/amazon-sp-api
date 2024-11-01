/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
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
import io.swagger.client.model.DateRange;
import io.swagger.client.model.DeliveryPolicy;
import java.io.IOException;

/**
 * An available offer for delivery of a product.
 */
@ApiModel(description = "An available offer for delivery of a product.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:59:58.801+08:00")
public class DeliveryOffer {
  @SerializedName("expiresAt")
  private String expiresAt = null;

  @SerializedName("dateRange")
  private DateRange dateRange = null;

  @SerializedName("policy")
  private DeliveryPolicy policy = null;

  public DeliveryOffer expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The timestamp at which a delivery offer expires.
   * @return expiresAt
  **/
  @ApiModelProperty(value = "The timestamp at which a delivery offer expires.")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public DeliveryOffer dateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

   /**
   * The range between which delivery is expected.
   * @return dateRange
  **/
  @ApiModelProperty(value = "The range between which delivery is expected.")
  public DateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
  }

  public DeliveryOffer policy(DeliveryPolicy policy) {
    this.policy = policy;
    return this;
  }

   /**
   * The policy for a delivery offer, including localized messaging.
   * @return policy
  **/
  @ApiModelProperty(value = "The policy for a delivery offer, including localized messaging.")
  public DeliveryPolicy getPolicy() {
    return policy;
  }

  public void setPolicy(DeliveryPolicy policy) {
    this.policy = policy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryOffer deliveryOffer = (DeliveryOffer) o;
    return Objects.equals(this.expiresAt, deliveryOffer.expiresAt) &&
        Objects.equals(this.dateRange, deliveryOffer.dateRange) &&
        Objects.equals(this.policy, deliveryOffer.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, dateRange, policy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryOffer {\n");
    
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

