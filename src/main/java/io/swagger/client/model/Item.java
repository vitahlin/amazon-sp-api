/*
 * Amazon Shipping API
 * The Amazon Shipping API is designed to support outbound shipping use cases both for orders originating on Amazon-owned marketplaces as well as external channels/marketplaces. With these APIs, you can request shipping rates, create shipments, cancel shipments, and track shipments.
 *
 * OpenAPI spec version: v2
 * Contact: swa-api-core@amazon.com
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
import io.swagger.client.model.Currency;
import io.swagger.client.model.DangerousGoodsDetails;
import io.swagger.client.model.DirectFulfillmentItemIdentifiers;
import io.swagger.client.model.InvoiceDetails;
import io.swagger.client.model.LiquidVolume;
import io.swagger.client.model.Weight;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An item in a package.
 */
@ApiModel(description = "An item in a package.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:18:11.724+08:00")
public class Item {
  @SerializedName("itemValue")
  private Currency itemValue = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("itemIdentifier")
  private String itemIdentifier = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("weight")
  private Weight weight = null;

  @SerializedName("liquidVolume")
  private LiquidVolume liquidVolume = null;

  @SerializedName("isHazmat")
  private Boolean isHazmat = null;

  @SerializedName("dangerousGoodsDetails")
  private DangerousGoodsDetails dangerousGoodsDetails = null;

  @SerializedName("productType")
  private String productType = null;

  @SerializedName("invoiceDetails")
  private InvoiceDetails invoiceDetails = null;

  @SerializedName("serialNumbers")
  private List<String> serialNumbers = null;

  @SerializedName("directFulfillmentItemIdentifiers")
  private DirectFulfillmentItemIdentifiers directFulfillmentItemIdentifiers = null;

  public Item itemValue(Currency itemValue) {
    this.itemValue = itemValue;
    return this;
  }

   /**
   * Get itemValue
   * @return itemValue
  **/
  @ApiModelProperty(value = "")
  public Currency getItemValue() {
    return itemValue;
  }

  public void setItemValue(Currency itemValue) {
    this.itemValue = itemValue;
  }

  public Item description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The product description of the item.
   * @return description
  **/
  @ApiModelProperty(value = "The product description of the item.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Item itemIdentifier(String itemIdentifier) {
    this.itemIdentifier = itemIdentifier;
    return this;
  }

   /**
   * A unique identifier for an item provided by the client.
   * @return itemIdentifier
  **/
  @ApiModelProperty(value = "A unique identifier for an item provided by the client.")
  public String getItemIdentifier() {
    return itemIdentifier;
  }

  public void setItemIdentifier(String itemIdentifier) {
    this.itemIdentifier = itemIdentifier;
  }

  public Item quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of units. This value is required.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of units. This value is required.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Item weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  public Item liquidVolume(LiquidVolume liquidVolume) {
    this.liquidVolume = liquidVolume;
    return this;
  }

   /**
   * Get liquidVolume
   * @return liquidVolume
  **/
  @ApiModelProperty(value = "")
  public LiquidVolume getLiquidVolume() {
    return liquidVolume;
  }

  public void setLiquidVolume(LiquidVolume liquidVolume) {
    this.liquidVolume = liquidVolume;
  }

  public Item isHazmat(Boolean isHazmat) {
    this.isHazmat = isHazmat;
    return this;
  }

   /**
   * When true, the item qualifies as hazardous materials (hazmat). Defaults to false.
   * @return isHazmat
  **/
  @ApiModelProperty(value = "When true, the item qualifies as hazardous materials (hazmat). Defaults to false.")
  public Boolean isIsHazmat() {
    return isHazmat;
  }

  public void setIsHazmat(Boolean isHazmat) {
    this.isHazmat = isHazmat;
  }

  public Item dangerousGoodsDetails(DangerousGoodsDetails dangerousGoodsDetails) {
    this.dangerousGoodsDetails = dangerousGoodsDetails;
    return this;
  }

   /**
   * Get dangerousGoodsDetails
   * @return dangerousGoodsDetails
  **/
  @ApiModelProperty(value = "")
  public DangerousGoodsDetails getDangerousGoodsDetails() {
    return dangerousGoodsDetails;
  }

  public void setDangerousGoodsDetails(DangerousGoodsDetails dangerousGoodsDetails) {
    this.dangerousGoodsDetails = dangerousGoodsDetails;
  }

  public Item productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * The product type of the item.
   * @return productType
  **/
  @ApiModelProperty(value = "The product type of the item.")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public Item invoiceDetails(InvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
    return this;
  }

   /**
   * Get invoiceDetails
   * @return invoiceDetails
  **/
  @ApiModelProperty(value = "")
  public InvoiceDetails getInvoiceDetails() {
    return invoiceDetails;
  }

  public void setInvoiceDetails(InvoiceDetails invoiceDetails) {
    this.invoiceDetails = invoiceDetails;
  }

  public Item serialNumbers(List<String> serialNumbers) {
    this.serialNumbers = serialNumbers;
    return this;
  }

  public Item addSerialNumbersItem(String serialNumbersItem) {
    if (this.serialNumbers == null) {
      this.serialNumbers = new ArrayList<String>();
    }
    this.serialNumbers.add(serialNumbersItem);
    return this;
  }

   /**
   * A list of unique serial numbers in an Amazon package that can be used to guarantee non-fraudulent items. The number of serial numbers in the list must be less than or equal to the quantity of items being shipped. Only applicable when channel source is Amazon.
   * @return serialNumbers
  **/
  @ApiModelProperty(value = "A list of unique serial numbers in an Amazon package that can be used to guarantee non-fraudulent items. The number of serial numbers in the list must be less than or equal to the quantity of items being shipped. Only applicable when channel source is Amazon.")
  public List<String> getSerialNumbers() {
    return serialNumbers;
  }

  public void setSerialNumbers(List<String> serialNumbers) {
    this.serialNumbers = serialNumbers;
  }

  public Item directFulfillmentItemIdentifiers(DirectFulfillmentItemIdentifiers directFulfillmentItemIdentifiers) {
    this.directFulfillmentItemIdentifiers = directFulfillmentItemIdentifiers;
    return this;
  }

   /**
   * Get directFulfillmentItemIdentifiers
   * @return directFulfillmentItemIdentifiers
  **/
  @ApiModelProperty(value = "")
  public DirectFulfillmentItemIdentifiers getDirectFulfillmentItemIdentifiers() {
    return directFulfillmentItemIdentifiers;
  }

  public void setDirectFulfillmentItemIdentifiers(DirectFulfillmentItemIdentifiers directFulfillmentItemIdentifiers) {
    this.directFulfillmentItemIdentifiers = directFulfillmentItemIdentifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.itemValue, item.itemValue) &&
        Objects.equals(this.description, item.description) &&
        Objects.equals(this.itemIdentifier, item.itemIdentifier) &&
        Objects.equals(this.quantity, item.quantity) &&
        Objects.equals(this.weight, item.weight) &&
        Objects.equals(this.liquidVolume, item.liquidVolume) &&
        Objects.equals(this.isHazmat, item.isHazmat) &&
        Objects.equals(this.dangerousGoodsDetails, item.dangerousGoodsDetails) &&
        Objects.equals(this.productType, item.productType) &&
        Objects.equals(this.invoiceDetails, item.invoiceDetails) &&
        Objects.equals(this.serialNumbers, item.serialNumbers) &&
        Objects.equals(this.directFulfillmentItemIdentifiers, item.directFulfillmentItemIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemValue, description, itemIdentifier, quantity, weight, liquidVolume, isHazmat, dangerousGoodsDetails, productType, invoiceDetails, serialNumbers, directFulfillmentItemIdentifiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    itemValue: ").append(toIndentedString(itemValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    itemIdentifier: ").append(toIndentedString(itemIdentifier)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    liquidVolume: ").append(toIndentedString(liquidVolume)).append("\n");
    sb.append("    isHazmat: ").append(toIndentedString(isHazmat)).append("\n");
    sb.append("    dangerousGoodsDetails: ").append(toIndentedString(dangerousGoodsDetails)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    invoiceDetails: ").append(toIndentedString(invoiceDetails)).append("\n");
    sb.append("    serialNumbers: ").append(toIndentedString(serialNumbers)).append("\n");
    sb.append("    directFulfillmentItemIdentifiers: ").append(toIndentedString(directFulfillmentItemIdentifiers)).append("\n");
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

