/*
 * The Selling Partner API for FBA inbound operations.
 * The Selling Partner API for Fulfillment By Amazon (FBA) Inbound. The FBA Inbound API enables building inbound workflows to create, manage, and send shipments into Amazon's fulfillment network. The API has interoperability with the Send-to-Amazon user interface.
 *
 * OpenAPI spec version: 2024-03-20
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
import io.swagger.client.model.ItemLabelPageType;
import io.swagger.client.model.LabelPrintType;
import io.swagger.client.model.MskuQuantity;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * The &#x60;createMarketplaceItemLabels&#x60; request.
 */
@ApiModel(description = "The `createMarketplaceItemLabels` request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:58:38.239+08:00")
public class CreateMarketplaceItemLabelsRequest {
  @SerializedName("height")
  private BigDecimal height = null;

  @SerializedName("labelType")
  private LabelPrintType labelType = null;

  @SerializedName("localeCode")
  private String localeCode = "en_US";

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("mskuQuantities")
  private List<MskuQuantity> mskuQuantities = new ArrayList<MskuQuantity>();

  @SerializedName("pageType")
  private ItemLabelPageType pageType = null;

  @SerializedName("width")
  private BigDecimal width = null;

  public CreateMarketplaceItemLabelsRequest height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the item label.
   * minimum: 25
   * maximum: 100
   * @return height
  **/
  @ApiModelProperty(value = "The height of the item label.")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public CreateMarketplaceItemLabelsRequest labelType(LabelPrintType labelType) {
    this.labelType = labelType;
    return this;
  }

   /**
   * Get labelType
   * @return labelType
  **/
  @ApiModelProperty(required = true, value = "")
  public LabelPrintType getLabelType() {
    return labelType;
  }

  public void setLabelType(LabelPrintType labelType) {
    this.labelType = labelType;
  }

  public CreateMarketplaceItemLabelsRequest localeCode(String localeCode) {
    this.localeCode = localeCode;
    return this;
  }

   /**
   * The locale code constructed from ISO 639 language code and ISO 3166-1 alpha-2 standard of country codes separated by an underscore character.
   * @return localeCode
  **/
  @ApiModelProperty(value = "The locale code constructed from ISO 639 language code and ISO 3166-1 alpha-2 standard of country codes separated by an underscore character.")
  public String getLocaleCode() {
    return localeCode;
  }

  public void setLocaleCode(String localeCode) {
    this.localeCode = localeCode;
  }

  public CreateMarketplaceItemLabelsRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The Marketplace ID. For a list of possible values, refer to [Marketplace IDs](https://developer-docs.amazon.com/sp-api/docs/marketplace-ids).
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "The Marketplace ID. For a list of possible values, refer to [Marketplace IDs](https://developer-docs.amazon.com/sp-api/docs/marketplace-ids).")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public CreateMarketplaceItemLabelsRequest mskuQuantities(List<MskuQuantity> mskuQuantities) {
    this.mskuQuantities = mskuQuantities;
    return this;
  }

  public CreateMarketplaceItemLabelsRequest addMskuQuantitiesItem(MskuQuantity mskuQuantitiesItem) {
    this.mskuQuantities.add(mskuQuantitiesItem);
    return this;
  }

   /**
   * Represents the quantity of an MSKU to print item labels for.
   * @return mskuQuantities
  **/
  @ApiModelProperty(required = true, value = "Represents the quantity of an MSKU to print item labels for.")
  public List<MskuQuantity> getMskuQuantities() {
    return mskuQuantities;
  }

  public void setMskuQuantities(List<MskuQuantity> mskuQuantities) {
    this.mskuQuantities = mskuQuantities;
  }

  public CreateMarketplaceItemLabelsRequest pageType(ItemLabelPageType pageType) {
    this.pageType = pageType;
    return this;
  }

   /**
   * Get pageType
   * @return pageType
  **/
  @ApiModelProperty(value = "")
  public ItemLabelPageType getPageType() {
    return pageType;
  }

  public void setPageType(ItemLabelPageType pageType) {
    this.pageType = pageType;
  }

  public CreateMarketplaceItemLabelsRequest width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the item label.
   * minimum: 25
   * maximum: 100
   * @return width
  **/
  @ApiModelProperty(value = "The width of the item label.")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMarketplaceItemLabelsRequest createMarketplaceItemLabelsRequest = (CreateMarketplaceItemLabelsRequest) o;
    return Objects.equals(this.height, createMarketplaceItemLabelsRequest.height) &&
        Objects.equals(this.labelType, createMarketplaceItemLabelsRequest.labelType) &&
        Objects.equals(this.localeCode, createMarketplaceItemLabelsRequest.localeCode) &&
        Objects.equals(this.marketplaceId, createMarketplaceItemLabelsRequest.marketplaceId) &&
        Objects.equals(this.mskuQuantities, createMarketplaceItemLabelsRequest.mskuQuantities) &&
        Objects.equals(this.pageType, createMarketplaceItemLabelsRequest.pageType) &&
        Objects.equals(this.width, createMarketplaceItemLabelsRequest.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, labelType, localeCode, marketplaceId, mskuQuantities, pageType, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMarketplaceItemLabelsRequest {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
    sb.append("    localeCode: ").append(toIndentedString(localeCode)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    mskuQuantities: ").append(toIndentedString(mskuQuantities)).append("\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
