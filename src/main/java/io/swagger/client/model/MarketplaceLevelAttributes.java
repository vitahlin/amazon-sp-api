/*
 * Selling Partner API for Sellers
 * The [Selling Partner API for Sellers](https://developer-docs.amazon.com/sp-api/docs/sellers-api-v1-reference) (Sellers API) provides essential information about seller accounts, such as:  - The marketplaces a seller can list in - The default language and currency of a marketplace - Whether the seller has suspended listings  Refer to the [Sellers API reference](https://developer-docs.amazon.com/sp-api/docs/sellers-api-v1-reference) for details about this API's operations, data types, and schemas.
 *
 * OpenAPI spec version: v1
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
import io.swagger.client.model.Marketplace;
import java.io.IOException;

/**
 * Attributes that define the seller&#39;s presence and status within a specific marketplace. These attributes include the marketplace details, store name, listing status, and the selling plan the seller is subscribed to.
 */
@ApiModel(description = "Attributes that define the seller's presence and status within a specific marketplace. These attributes include the marketplace details, store name, listing status, and the selling plan the seller is subscribed to.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:15:42.502+08:00")
public class MarketplaceLevelAttributes {
  @SerializedName("marketplace")
  private Marketplace marketplace = null;

  @SerializedName("storeName")
  private String storeName = null;

  /**
   * The current status of the seller&#39;s listings.
   */
  @JsonAdapter(ListingStatusEnum.Adapter.class)
  public enum ListingStatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    ListingStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ListingStatusEnum fromValue(String text) {
      for (ListingStatusEnum b : ListingStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ListingStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ListingStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ListingStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ListingStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("listingStatus")
  private ListingStatusEnum listingStatus = null;

  /**
   * The selling plan details.
   */
  @JsonAdapter(SellingPlanEnum.Adapter.class)
  public enum SellingPlanEnum {
    PROFESSIONAL("PROFESSIONAL"),
    
    INDIVIDUAL("INDIVIDUAL");

    private String value;

    SellingPlanEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SellingPlanEnum fromValue(String text) {
      for (SellingPlanEnum b : SellingPlanEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SellingPlanEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SellingPlanEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SellingPlanEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SellingPlanEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sellingPlan")
  private SellingPlanEnum sellingPlan = null;

  public MarketplaceLevelAttributes marketplace(Marketplace marketplace) {
    this.marketplace = marketplace;
    return this;
  }

   /**
   * Get marketplace
   * @return marketplace
  **/
  @ApiModelProperty(required = true, value = "")
  public Marketplace getMarketplace() {
    return marketplace;
  }

  public void setMarketplace(Marketplace marketplace) {
    this.marketplace = marketplace;
  }

  public MarketplaceLevelAttributes storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * The name of the seller&#39;s store as displayed in the marketplace.
   * @return storeName
  **/
  @ApiModelProperty(required = true, value = "The name of the seller's store as displayed in the marketplace.")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public MarketplaceLevelAttributes listingStatus(ListingStatusEnum listingStatus) {
    this.listingStatus = listingStatus;
    return this;
  }

   /**
   * The current status of the seller&#39;s listings.
   * @return listingStatus
  **/
  @ApiModelProperty(required = true, value = "The current status of the seller's listings.")
  public ListingStatusEnum getListingStatus() {
    return listingStatus;
  }

  public void setListingStatus(ListingStatusEnum listingStatus) {
    this.listingStatus = listingStatus;
  }

  public MarketplaceLevelAttributes sellingPlan(SellingPlanEnum sellingPlan) {
    this.sellingPlan = sellingPlan;
    return this;
  }

   /**
   * The selling plan details.
   * @return sellingPlan
  **/
  @ApiModelProperty(required = true, value = "The selling plan details.")
  public SellingPlanEnum getSellingPlan() {
    return sellingPlan;
  }

  public void setSellingPlan(SellingPlanEnum sellingPlan) {
    this.sellingPlan = sellingPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceLevelAttributes marketplaceLevelAttributes = (MarketplaceLevelAttributes) o;
    return Objects.equals(this.marketplace, marketplaceLevelAttributes.marketplace) &&
        Objects.equals(this.storeName, marketplaceLevelAttributes.storeName) &&
        Objects.equals(this.listingStatus, marketplaceLevelAttributes.listingStatus) &&
        Objects.equals(this.sellingPlan, marketplaceLevelAttributes.sellingPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplace, storeName, listingStatus, sellingPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceLevelAttributes {\n");
    
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    listingStatus: ").append(toIndentedString(listingStatus)).append("\n");
    sb.append("    sellingPlan: ").append(toIndentedString(sellingPlan)).append("\n");
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

