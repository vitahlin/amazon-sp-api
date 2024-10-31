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
import java.io.IOException;

/**
 * The attributes related to the payment made from customer to seller for this order.
 */
@ApiModel(description = "The attributes related to the payment made from customer to seller for this order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:59:58.801+08:00")
public class PaymentInformation {
  @SerializedName("paymentTransactionId")
  private String paymentTransactionId = null;

  @SerializedName("paymentMode")
  private String paymentMode = null;

  @SerializedName("paymentDate")
  private String paymentDate = null;

  public PaymentInformation paymentTransactionId(String paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
    return this;
  }

   /**
   * The transaction identifier of this payment.
   * @return paymentTransactionId
  **/
  @ApiModelProperty(required = true, value = "The transaction identifier of this payment.")
  public String getPaymentTransactionId() {
    return paymentTransactionId;
  }

  public void setPaymentTransactionId(String paymentTransactionId) {
    this.paymentTransactionId = paymentTransactionId;
  }

  public PaymentInformation paymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
    return this;
  }

   /**
   * The transaction mode of this payment.
   * @return paymentMode
  **/
  @ApiModelProperty(required = true, value = "The transaction mode of this payment.")
  public String getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
  }

  public PaymentInformation paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * The transaction date of this payment.
   * @return paymentDate
  **/
  @ApiModelProperty(required = true, value = "The transaction date of this payment.")
  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInformation paymentInformation = (PaymentInformation) o;
    return Objects.equals(this.paymentTransactionId, paymentInformation.paymentTransactionId) &&
        Objects.equals(this.paymentMode, paymentInformation.paymentMode) &&
        Objects.equals(this.paymentDate, paymentInformation.paymentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionId, paymentMode, paymentDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformation {\n");
    
    sb.append("    paymentTransactionId: ").append(toIndentedString(paymentTransactionId)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
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

