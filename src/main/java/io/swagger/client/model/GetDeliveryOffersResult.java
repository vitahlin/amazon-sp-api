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
import io.swagger.client.model.DeliveryOffersList;
import java.io.IOException;

/**
 * A list of delivery offers, including offer expiration, earliest and latest date and time range, and the delivery offer policy.
 */
@ApiModel(description = "A list of delivery offers, including offer expiration, earliest and latest date and time range, and the delivery offer policy.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:59:58.801+08:00")
public class GetDeliveryOffersResult {
  @SerializedName("deliveryOffers")
  private DeliveryOffersList deliveryOffers = null;

  public GetDeliveryOffersResult deliveryOffers(DeliveryOffersList deliveryOffers) {
    this.deliveryOffers = deliveryOffers;
    return this;
  }

   /**
   * An array of delivery offers.
   * @return deliveryOffers
  **/
  @ApiModelProperty(value = "An array of delivery offers.")
  public DeliveryOffersList getDeliveryOffers() {
    return deliveryOffers;
  }

  public void setDeliveryOffers(DeliveryOffersList deliveryOffers) {
    this.deliveryOffers = deliveryOffers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDeliveryOffersResult getDeliveryOffersResult = (GetDeliveryOffersResult) o;
    return Objects.equals(this.deliveryOffers, getDeliveryOffersResult.deliveryOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryOffers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDeliveryOffersResult {\n");
    
    sb.append("    deliveryOffers: ").append(toIndentedString(deliveryOffers)).append("\n");
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
