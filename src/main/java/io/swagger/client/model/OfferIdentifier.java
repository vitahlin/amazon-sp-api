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
import io.swagger.client.model.FulfillmentType;
import java.io.IOException;

/**
 * Identifies an offer from a particular seller on an ASIN.
 */
@ApiModel(description = "Identifies an offer from a particular seller on an ASIN.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:08:31.630+08:00")
public class OfferIdentifier {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("sellerId")
  private String sellerId = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("asin")
  private String asin = null;

  @SerializedName("fulfillmentType")
  private FulfillmentType fulfillmentType = null;

  public OfferIdentifier marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * A marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "A marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public OfferIdentifier sellerId(String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

   /**
   * The seller identifier for the offer.
   * @return sellerId
  **/
  @ApiModelProperty(value = "The seller identifier for the offer.")
  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public OfferIdentifier sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The seller stock keeping unit (SKU) of the item. This will only be present for the target offer, which belongs to the requesting seller.
   * @return sku
  **/
  @ApiModelProperty(value = "The seller stock keeping unit (SKU) of the item. This will only be present for the target offer, which belongs to the requesting seller.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public OfferIdentifier asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * The Amazon identifier for the item.
   * @return asin
  **/
  @ApiModelProperty(required = true, value = "The Amazon identifier for the item.")
  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public OfferIdentifier fulfillmentType(FulfillmentType fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
    return this;
  }

   /**
   * The fulfillment type for the offer.
   * @return fulfillmentType
  **/
  @ApiModelProperty(value = "The fulfillment type for the offer.")
  public FulfillmentType getFulfillmentType() {
    return fulfillmentType;
  }

  public void setFulfillmentType(FulfillmentType fulfillmentType) {
    this.fulfillmentType = fulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferIdentifier offerIdentifier = (OfferIdentifier) o;
    return Objects.equals(this.marketplaceId, offerIdentifier.marketplaceId) &&
        Objects.equals(this.sellerId, offerIdentifier.sellerId) &&
        Objects.equals(this.sku, offerIdentifier.sku) &&
        Objects.equals(this.asin, offerIdentifier.asin) &&
        Objects.equals(this.fulfillmentType, offerIdentifier.fulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, sellerId, sku, asin, fulfillmentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferIdentifier {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    fulfillmentType: ").append(toIndentedString(fulfillmentType)).append("\n");
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

