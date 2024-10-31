/*
 * Selling Partner API for Orders
 * Use the Orders Selling Partner API to programmatically retrieve order information. With this API, you can develop fast, flexible, and custom applications to manage order synchronization, perform order research, and create demand-based decision support tools.   _Note:_ For the JP, AU, and SG marketplaces, the Orders API supports orders from 2016 onward. For all other marketplaces, the Orders API supports orders for the last two years (orders older than this don't show up in the response).
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
import java.io.IOException;

/**
 * Information about whether or not a buyer requested cancellation.
 */
@ApiModel(description = "Information about whether or not a buyer requested cancellation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:07:17.661+08:00")
public class BuyerRequestedCancel {
  @SerializedName("IsBuyerRequestedCancel")
  private String isBuyerRequestedCancel = null;

  @SerializedName("BuyerCancelReason")
  private String buyerCancelReason = null;

  public BuyerRequestedCancel isBuyerRequestedCancel(String isBuyerRequestedCancel) {
    this.isBuyerRequestedCancel = isBuyerRequestedCancel;
    return this;
  }

   /**
   * Indicate whether the buyer has requested cancellation.  **Possible Values**: &#x60;true&#x60;, &#x60;false&#x60;.
   * @return isBuyerRequestedCancel
  **/
  @ApiModelProperty(value = "Indicate whether the buyer has requested cancellation.  **Possible Values**: `true`, `false`.")
  public String getIsBuyerRequestedCancel() {
    return isBuyerRequestedCancel;
  }

  public void setIsBuyerRequestedCancel(String isBuyerRequestedCancel) {
    this.isBuyerRequestedCancel = isBuyerRequestedCancel;
  }

  public BuyerRequestedCancel buyerCancelReason(String buyerCancelReason) {
    this.buyerCancelReason = buyerCancelReason;
    return this;
  }

   /**
   * The reason that the buyer requested cancellation.
   * @return buyerCancelReason
  **/
  @ApiModelProperty(value = "The reason that the buyer requested cancellation.")
  public String getBuyerCancelReason() {
    return buyerCancelReason;
  }

  public void setBuyerCancelReason(String buyerCancelReason) {
    this.buyerCancelReason = buyerCancelReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerRequestedCancel buyerRequestedCancel = (BuyerRequestedCancel) o;
    return Objects.equals(this.isBuyerRequestedCancel, buyerRequestedCancel.isBuyerRequestedCancel) &&
        Objects.equals(this.buyerCancelReason, buyerRequestedCancel.buyerCancelReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBuyerRequestedCancel, buyerCancelReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerRequestedCancel {\n");
    
    sb.append("    isBuyerRequestedCancel: ").append(toIndentedString(isBuyerRequestedCancel)).append("\n");
    sb.append("    buyerCancelReason: ").append(toIndentedString(buyerCancelReason)).append("\n");
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

