/*
 * Selling Partner API for Replenishment
 * The Selling Partner API for Replenishment (Replenishment API) provides programmatic access to replenishment program metrics and offers. These programs provide recurring delivery of any replenishable item at a frequency chosen by the customer.  The Replenishment API is available worldwide wherever Amazon Subscribe & Save is available or is supported. The API is available to vendors and FBA selling partners.
 *
 * OpenAPI spec version: 2022-11-07
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
import io.swagger.client.model.TimeInterval;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * An object which contains offer metrics.
 */
@ApiModel(description = "An object which contains offer metrics.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:11:29.095+08:00")
public class ListOfferMetricsResponseOffer {
  @SerializedName("asin")
  private String asin = null;

  @SerializedName("notDeliveredDueToOOS")
  private Double notDeliveredDueToOOS = null;

  @SerializedName("totalSubscriptionsRevenue")
  private Double totalSubscriptionsRevenue = null;

  @SerializedName("shippedSubscriptionUnits")
  private BigDecimal shippedSubscriptionUnits = null;

  @SerializedName("activeSubscriptions")
  private BigDecimal activeSubscriptions = null;

  @SerializedName("revenuePenetration")
  private Double revenuePenetration = null;

  @SerializedName("lostRevenueDueToOOS")
  private Double lostRevenueDueToOOS = null;

  @SerializedName("couponsRevenuePenetration")
  private Double couponsRevenuePenetration = null;

  @SerializedName("next30DayTotalSubscriptionsRevenue")
  private Double next30DayTotalSubscriptionsRevenue = null;

  @SerializedName("next60DayTotalSubscriptionsRevenue")
  private Double next60DayTotalSubscriptionsRevenue = null;

  @SerializedName("next90DayTotalSubscriptionsRevenue")
  private Double next90DayTotalSubscriptionsRevenue = null;

  @SerializedName("next30DayShippedSubscriptionUnits")
  private BigDecimal next30DayShippedSubscriptionUnits = null;

  @SerializedName("next60DayShippedSubscriptionUnits")
  private BigDecimal next60DayShippedSubscriptionUnits = null;

  @SerializedName("next90DayShippedSubscriptionUnits")
  private BigDecimal next90DayShippedSubscriptionUnits = null;

  @SerializedName("timeInterval")
  private TimeInterval timeInterval = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  public ListOfferMetricsResponseOffer asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN).
   * @return asin
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN).")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public ListOfferMetricsResponseOffer notDeliveredDueToOOS(Double notDeliveredDueToOOS) {
    this.notDeliveredDueToOOS = notDeliveredDueToOOS;
    return this;
  }

   /**
   * The percentage of items that were not shipped out of the total shipped units over a period of time due to being out of stock. Applicable only for the &#x60;PERFORMANCE&#x60; &#x60;timePeriodType&#x60;.
   * minimum: 0
   * maximum: 100
   * @return notDeliveredDueToOOS
  **/
  @ApiModelProperty(value = "The percentage of items that were not shipped out of the total shipped units over a period of time due to being out of stock. Applicable only for the `PERFORMANCE` `timePeriodType`.")
  public Double getNotDeliveredDueToOOS() {
    return notDeliveredDueToOOS;
  }

  public void setNotDeliveredDueToOOS(Double notDeliveredDueToOOS) {
    this.notDeliveredDueToOOS = notDeliveredDueToOOS;
  }

  public ListOfferMetricsResponseOffer totalSubscriptionsRevenue(Double totalSubscriptionsRevenue) {
    this.totalSubscriptionsRevenue = totalSubscriptionsRevenue;
    return this;
  }

   /**
   * The revenue generated from subscriptions over a period of time. Applicable only for the &#x60;PERFORMANCE&#x60; &#x60;timePeriodType&#x60;.
   * minimum: 0
   * @return totalSubscriptionsRevenue
  **/
  @ApiModelProperty(value = "The revenue generated from subscriptions over a period of time. Applicable only for the `PERFORMANCE` `timePeriodType`.")
  public Double getTotalSubscriptionsRevenue() {
    return totalSubscriptionsRevenue;
  }

  public void setTotalSubscriptionsRevenue(Double totalSubscriptionsRevenue) {
    this.totalSubscriptionsRevenue = totalSubscriptionsRevenue;
  }

  public ListOfferMetricsResponseOffer shippedSubscriptionUnits(BigDecimal shippedSubscriptionUnits) {
    this.shippedSubscriptionUnits = shippedSubscriptionUnits;
    return this;
  }

   /**
   * The number of units shipped to the subscribers over a period of time. Applicable only for the &#x60;PERFORMANCE&#x60; &#x60;timePeriodType&#x60;.
   * minimum: 0
   * @return shippedSubscriptionUnits
  **/
  @ApiModelProperty(value = "The number of units shipped to the subscribers over a period of time. Applicable only for the `PERFORMANCE` `timePeriodType`.")
  public BigDecimal getShippedSubscriptionUnits() {
    return shippedSubscriptionUnits;
  }

  public void setShippedSubscriptionUnits(BigDecimal shippedSubscriptionUnits) {
    this.shippedSubscriptionUnits = shippedSubscriptionUnits;
  }

  public ListOfferMetricsResponseOffer activeSubscriptions(BigDecimal activeSubscriptions) {
    this.activeSubscriptions = activeSubscriptions;
    return this;
  }

   /**
   * The number of active subscriptions present at the end of the period. Applicable only for the &#x60;PERFORMANCE&#x60; &#x60;timePeriodType&#x60;.
   * minimum: 0
   * @return activeSubscriptions
  **/
  @ApiModelProperty(value = "The number of active subscriptions present at the end of the period. Applicable only for the `PERFORMANCE` `timePeriodType`.")
  public BigDecimal getActiveSubscriptions() {
    return activeSubscriptions;
  }

  public void setActiveSubscriptions(BigDecimal activeSubscriptions) {
    this.activeSubscriptions = activeSubscriptions;
  }

  public ListOfferMetricsResponseOffer revenuePenetration(Double revenuePenetration) {
    this.revenuePenetration = revenuePenetration;
    return this;
  }

   /**
   * The percentage of total program revenue out of total product revenue. Applicable only for the &#x60;PERFORMANCE&#x60; &#x60;timePeriodType&#x60;.
   * minimum: 0
   * maximum: 100
   * @return revenuePenetration
  **/
  @ApiModelProperty(value = "The percentage of total program revenue out of total product revenue. Applicable only for the `PERFORMANCE` `timePeriodType`.")
  public Double getRevenuePenetration() {
    return revenuePenetration;
  }

  public void setRevenuePenetration(Double revenuePenetration) {
    this.revenuePenetration = revenuePenetration;
  }

  public ListOfferMetricsResponseOffer lostRevenueDueToOOS(Double lostRevenueDueToOOS) {
    this.lostRevenueDueToOOS = lostRevenueDueToOOS;
    return this;
  }

   /**
   * The revenue that would have been generated had there not been out of stock. Applicable only for the PERFORMANCE timePeriodType.
   * minimum: 0
   * @return lostRevenueDueToOOS
  **/
  @ApiModelProperty(value = "The revenue that would have been generated had there not been out of stock. Applicable only for the PERFORMANCE timePeriodType.")
  public Double getLostRevenueDueToOOS() {
    return lostRevenueDueToOOS;
  }

  public void setLostRevenueDueToOOS(Double lostRevenueDueToOOS) {
    this.lostRevenueDueToOOS = lostRevenueDueToOOS;
  }

  public ListOfferMetricsResponseOffer couponsRevenuePenetration(Double couponsRevenuePenetration) {
    this.couponsRevenuePenetration = couponsRevenuePenetration;
    return this;
  }

   /**
   * The percentage of revenue from ASINs with coupons out of total revenue from all ASINs. Applicable only for the PERFORMANCE timePeriodType.
   * minimum: 0
   * maximum: 100
   * @return couponsRevenuePenetration
  **/
  @ApiModelProperty(value = "The percentage of revenue from ASINs with coupons out of total revenue from all ASINs. Applicable only for the PERFORMANCE timePeriodType.")
  public Double getCouponsRevenuePenetration() {
    return couponsRevenuePenetration;
  }

  public void setCouponsRevenuePenetration(Double couponsRevenuePenetration) {
    this.couponsRevenuePenetration = couponsRevenuePenetration;
  }

  public ListOfferMetricsResponseOffer next30DayTotalSubscriptionsRevenue(Double next30DayTotalSubscriptionsRevenue) {
    this.next30DayTotalSubscriptionsRevenue = next30DayTotalSubscriptionsRevenue;
    return this;
  }

   /**
   * The forecasted total subscription revenue for the next 30 days. Applicable only for the &#x60;FORECAST&#x60; &#x60;timePeriodType&#x60;.
   * minimum: 0
   * @return next30DayTotalSubscriptionsRevenue
  **/
  @ApiModelProperty(value = "The forecasted total subscription revenue for the next 30 days. Applicable only for the `FORECAST` `timePeriodType`.")
  public Double getNext30DayTotalSubscriptionsRevenue() {
    return next30DayTotalSubscriptionsRevenue;
  }

  public void setNext30DayTotalSubscriptionsRevenue(Double next30DayTotalSubscriptionsRevenue) {
    this.next30DayTotalSubscriptionsRevenue = next30DayTotalSubscriptionsRevenue;
  }

  public ListOfferMetricsResponseOffer next60DayTotalSubscriptionsRevenue(Double next60DayTotalSubscriptionsRevenue) {
    this.next60DayTotalSubscriptionsRevenue = next60DayTotalSubscriptionsRevenue;
    return this;
  }

   /**
   * The forecasted total subscription revenue for the next 60 days. Applicable only for the &#x60;FORECAST&#x60; &#x60;timePeriodType&#x60;.
   * minimum: 0
   * @return next60DayTotalSubscriptionsRevenue
  **/
  @ApiModelProperty(value = "The forecasted total subscription revenue for the next 60 days. Applicable only for the `FORECAST` `timePeriodType`.")
  public Double getNext60DayTotalSubscriptionsRevenue() {
    return next60DayTotalSubscriptionsRevenue;
  }

  public void setNext60DayTotalSubscriptionsRevenue(Double next60DayTotalSubscriptionsRevenue) {
    this.next60DayTotalSubscriptionsRevenue = next60DayTotalSubscriptionsRevenue;
  }

  public ListOfferMetricsResponseOffer next90DayTotalSubscriptionsRevenue(Double next90DayTotalSubscriptionsRevenue) {
    this.next90DayTotalSubscriptionsRevenue = next90DayTotalSubscriptionsRevenue;
    return this;
  }

   /**
   * The forecasted total subscription revenue for the next 90 days. Applicable only for the &#x60;FORECAST&#x60; &#x60;timePeriodType&#x60;.
   * minimum: 0
   * @return next90DayTotalSubscriptionsRevenue
  **/
  @ApiModelProperty(value = "The forecasted total subscription revenue for the next 90 days. Applicable only for the `FORECAST` `timePeriodType`.")
  public Double getNext90DayTotalSubscriptionsRevenue() {
    return next90DayTotalSubscriptionsRevenue;
  }

  public void setNext90DayTotalSubscriptionsRevenue(Double next90DayTotalSubscriptionsRevenue) {
    this.next90DayTotalSubscriptionsRevenue = next90DayTotalSubscriptionsRevenue;
  }

  public ListOfferMetricsResponseOffer next30DayShippedSubscriptionUnits(BigDecimal next30DayShippedSubscriptionUnits) {
    this.next30DayShippedSubscriptionUnits = next30DayShippedSubscriptionUnits;
    return this;
  }

   /**
   * The forecasted shipped subscription units for the next 30 days. Applicable only for the &#x60;FORECAST&#x60; &#x60;timePeriodType&#x60;.
   * minimum: 0
   * @return next30DayShippedSubscriptionUnits
  **/
  @ApiModelProperty(value = "The forecasted shipped subscription units for the next 30 days. Applicable only for the `FORECAST` `timePeriodType`.")
  public BigDecimal getNext30DayShippedSubscriptionUnits() {
    return next30DayShippedSubscriptionUnits;
  }

  public void setNext30DayShippedSubscriptionUnits(BigDecimal next30DayShippedSubscriptionUnits) {
    this.next30DayShippedSubscriptionUnits = next30DayShippedSubscriptionUnits;
  }

  public ListOfferMetricsResponseOffer next60DayShippedSubscriptionUnits(BigDecimal next60DayShippedSubscriptionUnits) {
    this.next60DayShippedSubscriptionUnits = next60DayShippedSubscriptionUnits;
    return this;
  }

   /**
   * The forecasted shipped subscription units for the next 60 days. Applicable only for the &#x60;FORECAST&#x60; &#x60;timePeriodType&#x60;.
   * minimum: 0
   * @return next60DayShippedSubscriptionUnits
  **/
  @ApiModelProperty(value = "The forecasted shipped subscription units for the next 60 days. Applicable only for the `FORECAST` `timePeriodType`.")
  public BigDecimal getNext60DayShippedSubscriptionUnits() {
    return next60DayShippedSubscriptionUnits;
  }

  public void setNext60DayShippedSubscriptionUnits(BigDecimal next60DayShippedSubscriptionUnits) {
    this.next60DayShippedSubscriptionUnits = next60DayShippedSubscriptionUnits;
  }

  public ListOfferMetricsResponseOffer next90DayShippedSubscriptionUnits(BigDecimal next90DayShippedSubscriptionUnits) {
    this.next90DayShippedSubscriptionUnits = next90DayShippedSubscriptionUnits;
    return this;
  }

   /**
   * The forecasted shipped subscription units for the next 90 days. Applicable only for the &#x60;FORECAST&#x60; &#x60;timePeriodType&#x60;.
   * minimum: 0
   * @return next90DayShippedSubscriptionUnits
  **/
  @ApiModelProperty(value = "The forecasted shipped subscription units for the next 90 days. Applicable only for the `FORECAST` `timePeriodType`.")
  public BigDecimal getNext90DayShippedSubscriptionUnits() {
    return next90DayShippedSubscriptionUnits;
  }

  public void setNext90DayShippedSubscriptionUnits(BigDecimal next90DayShippedSubscriptionUnits) {
    this.next90DayShippedSubscriptionUnits = next90DayShippedSubscriptionUnits;
  }

  public ListOfferMetricsResponseOffer timeInterval(TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
    return this;
  }

   /**
   * A time interval used to compute metrics.
   * @return timeInterval
  **/
  @ApiModelProperty(value = "A time interval used to compute metrics.")
  public TimeInterval getTimeInterval() {
    return timeInterval;
  }

  public void setTimeInterval(TimeInterval timeInterval) {
    this.timeInterval = timeInterval;
  }

  public ListOfferMetricsResponseOffer currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code in ISO 4217 format.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency code in ISO 4217 format.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOfferMetricsResponseOffer listOfferMetricsResponseOffer = (ListOfferMetricsResponseOffer) o;
    return Objects.equals(this.asin, listOfferMetricsResponseOffer.asin) &&
        Objects.equals(this.notDeliveredDueToOOS, listOfferMetricsResponseOffer.notDeliveredDueToOOS) &&
        Objects.equals(this.totalSubscriptionsRevenue, listOfferMetricsResponseOffer.totalSubscriptionsRevenue) &&
        Objects.equals(this.shippedSubscriptionUnits, listOfferMetricsResponseOffer.shippedSubscriptionUnits) &&
        Objects.equals(this.activeSubscriptions, listOfferMetricsResponseOffer.activeSubscriptions) &&
        Objects.equals(this.revenuePenetration, listOfferMetricsResponseOffer.revenuePenetration) &&
        Objects.equals(this.lostRevenueDueToOOS, listOfferMetricsResponseOffer.lostRevenueDueToOOS) &&
        Objects.equals(this.couponsRevenuePenetration, listOfferMetricsResponseOffer.couponsRevenuePenetration) &&
        Objects.equals(this.next30DayTotalSubscriptionsRevenue, listOfferMetricsResponseOffer.next30DayTotalSubscriptionsRevenue) &&
        Objects.equals(this.next60DayTotalSubscriptionsRevenue, listOfferMetricsResponseOffer.next60DayTotalSubscriptionsRevenue) &&
        Objects.equals(this.next90DayTotalSubscriptionsRevenue, listOfferMetricsResponseOffer.next90DayTotalSubscriptionsRevenue) &&
        Objects.equals(this.next30DayShippedSubscriptionUnits, listOfferMetricsResponseOffer.next30DayShippedSubscriptionUnits) &&
        Objects.equals(this.next60DayShippedSubscriptionUnits, listOfferMetricsResponseOffer.next60DayShippedSubscriptionUnits) &&
        Objects.equals(this.next90DayShippedSubscriptionUnits, listOfferMetricsResponseOffer.next90DayShippedSubscriptionUnits) &&
        Objects.equals(this.timeInterval, listOfferMetricsResponseOffer.timeInterval) &&
        Objects.equals(this.currencyCode, listOfferMetricsResponseOffer.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asin, notDeliveredDueToOOS, totalSubscriptionsRevenue, shippedSubscriptionUnits, activeSubscriptions, revenuePenetration, lostRevenueDueToOOS, couponsRevenuePenetration, next30DayTotalSubscriptionsRevenue, next60DayTotalSubscriptionsRevenue, next90DayTotalSubscriptionsRevenue, next30DayShippedSubscriptionUnits, next60DayShippedSubscriptionUnits, next90DayShippedSubscriptionUnits, timeInterval, currencyCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOfferMetricsResponseOffer {\n");
    
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    notDeliveredDueToOOS: ").append(toIndentedString(notDeliveredDueToOOS)).append("\n");
    sb.append("    totalSubscriptionsRevenue: ").append(toIndentedString(totalSubscriptionsRevenue)).append("\n");
    sb.append("    shippedSubscriptionUnits: ").append(toIndentedString(shippedSubscriptionUnits)).append("\n");
    sb.append("    activeSubscriptions: ").append(toIndentedString(activeSubscriptions)).append("\n");
    sb.append("    revenuePenetration: ").append(toIndentedString(revenuePenetration)).append("\n");
    sb.append("    lostRevenueDueToOOS: ").append(toIndentedString(lostRevenueDueToOOS)).append("\n");
    sb.append("    couponsRevenuePenetration: ").append(toIndentedString(couponsRevenuePenetration)).append("\n");
    sb.append("    next30DayTotalSubscriptionsRevenue: ").append(toIndentedString(next30DayTotalSubscriptionsRevenue)).append("\n");
    sb.append("    next60DayTotalSubscriptionsRevenue: ").append(toIndentedString(next60DayTotalSubscriptionsRevenue)).append("\n");
    sb.append("    next90DayTotalSubscriptionsRevenue: ").append(toIndentedString(next90DayTotalSubscriptionsRevenue)).append("\n");
    sb.append("    next30DayShippedSubscriptionUnits: ").append(toIndentedString(next30DayShippedSubscriptionUnits)).append("\n");
    sb.append("    next60DayShippedSubscriptionUnits: ").append(toIndentedString(next60DayShippedSubscriptionUnits)).append("\n");
    sb.append("    next90DayShippedSubscriptionUnits: ").append(toIndentedString(next90DayShippedSubscriptionUnits)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

