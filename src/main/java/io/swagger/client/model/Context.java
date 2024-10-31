/*
 * The Selling Partner API for Finances
 * The Selling Partner API for Finances provides financial information relevant to a seller's business. You can obtain financial events for a given order or date range without having to wait until a statement period closes.
 *
 * OpenAPI spec version: 2024-06-19
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
import io.swagger.client.model.AmazonPayContext;
import io.swagger.client.model.DeferredContext;
import io.swagger.client.model.PaymentsContext;
import io.swagger.client.model.ProductContext;
import java.io.IOException;

/**
 * Additional Information about the item.
 */
@ApiModel(description = "Additional Information about the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:54:45.982+08:00")
public class Context {
  @SerializedName("storeName")
  private String storeName = null;

  @SerializedName("orderType")
  private String orderType = null;

  @SerializedName("channel")
  private String channel = null;

  @SerializedName("asin")
  private String asin = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("quantityShipped")
  private Integer quantityShipped = null;

  @SerializedName("fulfillmentNetwork")
  private String fulfillmentNetwork = null;

  @SerializedName("paymentType")
  private String paymentType = null;

  @SerializedName("paymentMethod")
  private String paymentMethod = null;

  @SerializedName("paymentReference")
  private String paymentReference = null;

  @SerializedName("paymentDate")
  private String paymentDate = null;

  @SerializedName("deferralReason")
  private String deferralReason = null;

  @SerializedName("maturityDate")
  private String maturityDate = null;

  @SerializedName("deferralStatus")
  private String deferralStatus = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("endTime")
  private String endTime = null;

  public Context storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * The name of the store that is related to the transaction.
   * @return storeName
  **/
  @ApiModelProperty(value = "The name of the store that is related to the transaction.")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public Context orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * The transaction&#39;s order type.
   * @return orderType
  **/
  @ApiModelProperty(value = "The transaction's order type.")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public Context channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Channel details of related transaction.
   * @return channel
  **/
  @ApiModelProperty(value = "Channel details of related transaction.")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public Context asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return asin
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public Context sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The Stock Keeping Unit (SKU) of the item.
   * @return sku
  **/
  @ApiModelProperty(value = "The Stock Keeping Unit (SKU) of the item.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Context quantityShipped(Integer quantityShipped) {
    this.quantityShipped = quantityShipped;
    return this;
  }

   /**
   * The quantity of the item shipped.
   * @return quantityShipped
  **/
  @ApiModelProperty(value = "The quantity of the item shipped.")
  public Integer getQuantityShipped() {
    return quantityShipped;
  }

  public void setQuantityShipped(Integer quantityShipped) {
    this.quantityShipped = quantityShipped;
  }

  public Context fulfillmentNetwork(String fulfillmentNetwork) {
    this.fulfillmentNetwork = fulfillmentNetwork;
    return this;
  }

   /**
   * The fulfillment network of the item.
   * @return fulfillmentNetwork
  **/
  @ApiModelProperty(value = "The fulfillment network of the item.")
  public String getFulfillmentNetwork() {
    return fulfillmentNetwork;
  }

  public void setFulfillmentNetwork(String fulfillmentNetwork) {
    this.fulfillmentNetwork = fulfillmentNetwork;
  }

  public Context paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * The type of payment.
   * @return paymentType
  **/
  @ApiModelProperty(value = "The type of payment.")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public Context paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The method of payment.
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "The method of payment.")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Context paymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

   /**
   * The reference number of the payment.
   * @return paymentReference
  **/
  @ApiModelProperty(value = "The reference number of the payment.")
  public String getPaymentReference() {
    return paymentReference;
  }

  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }

  public Context paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * The date of the payment.
   * @return paymentDate
  **/
  @ApiModelProperty(value = "The date of the payment.")
  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public Context deferralReason(String deferralReason) {
    this.deferralReason = deferralReason;
    return this;
  }

   /**
   * Deferral policy applied on the transaction.  **Examples:** &#x60;B2B&#x60;,&#x60;DD7&#x60;
   * @return deferralReason
  **/
  @ApiModelProperty(value = "Deferral policy applied on the transaction.  **Examples:** `B2B`,`DD7`")
  public String getDeferralReason() {
    return deferralReason;
  }

  public void setDeferralReason(String deferralReason) {
    this.deferralReason = deferralReason;
  }

  public Context maturityDate(String maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * The release date of the transaction.
   * @return maturityDate
  **/
  @ApiModelProperty(value = "The release date of the transaction.")
  public String getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(String maturityDate) {
    this.maturityDate = maturityDate;
  }

  public Context deferralStatus(String deferralStatus) {
    this.deferralStatus = deferralStatus;
    return this;
  }

   /**
   * The status of the transaction. For example, &#x60;HOLD&#x60;,&#x60;RELEASE&#x60;.
   * @return deferralStatus
  **/
  @ApiModelProperty(value = "The status of the transaction. For example, `HOLD`,`RELEASE`.")
  public String getDeferralStatus() {
    return deferralStatus;
  }

  public void setDeferralStatus(String deferralStatus) {
    this.deferralStatus = deferralStatus;
  }

  public Context startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time of the transaction.
   * @return startTime
  **/
  @ApiModelProperty(value = "The start time of the transaction.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public Context endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end time of the transaction.
   * @return endTime
  **/
  @ApiModelProperty(value = "The end time of the transaction.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context context = (Context) o;
    return Objects.equals(this.storeName, context.storeName) &&
        Objects.equals(this.orderType, context.orderType) &&
        Objects.equals(this.channel, context.channel) &&
        Objects.equals(this.asin, context.asin) &&
        Objects.equals(this.sku, context.sku) &&
        Objects.equals(this.quantityShipped, context.quantityShipped) &&
        Objects.equals(this.fulfillmentNetwork, context.fulfillmentNetwork) &&
        Objects.equals(this.paymentType, context.paymentType) &&
        Objects.equals(this.paymentMethod, context.paymentMethod) &&
        Objects.equals(this.paymentReference, context.paymentReference) &&
        Objects.equals(this.paymentDate, context.paymentDate) &&
        Objects.equals(this.deferralReason, context.deferralReason) &&
        Objects.equals(this.maturityDate, context.maturityDate) &&
        Objects.equals(this.deferralStatus, context.deferralStatus) &&
        Objects.equals(this.startTime, context.startTime) &&
        Objects.equals(this.endTime, context.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeName, orderType, channel, asin, sku, quantityShipped, fulfillmentNetwork, paymentType, paymentMethod, paymentReference, paymentDate, deferralReason, maturityDate, deferralStatus, startTime, endTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    quantityShipped: ").append(toIndentedString(quantityShipped)).append("\n");
    sb.append("    fulfillmentNetwork: ").append(toIndentedString(fulfillmentNetwork)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    deferralReason: ").append(toIndentedString(deferralReason)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    deferralStatus: ").append(toIndentedString(deferralStatus)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

