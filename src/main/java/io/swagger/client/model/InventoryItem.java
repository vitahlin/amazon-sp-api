/*
 * Selling Partner API for FBA Inventory
 * The Selling Partner API for FBA Inventory lets you programmatically retrieve information about inventory in Amazon's fulfillment network.
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
import java.io.IOException;

/**
 * An item in the list of inventory to be added.
 */
@ApiModel(description = "An item in the list of inventory to be added.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:51:37.362+08:00")
public class InventoryItem {
  @SerializedName("sellerSku")
  private String sellerSku = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public InventoryItem sellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
    return this;
  }

   /**
   * The seller SKU of the item.
   * @return sellerSku
  **/
  @ApiModelProperty(required = true, value = "The seller SKU of the item.")
  public String getSellerSku() {
    return sellerSku;
  }

  public void setSellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
  }

  public InventoryItem marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The marketplaceId.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "The marketplaceId.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public InventoryItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of item to add.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity of item to add.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryItem inventoryItem = (InventoryItem) o;
    return Objects.equals(this.sellerSku, inventoryItem.sellerSku) &&
        Objects.equals(this.marketplaceId, inventoryItem.marketplaceId) &&
        Objects.equals(this.quantity, inventoryItem.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSku, marketplaceId, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryItem {\n");
    
    sb.append("    sellerSku: ").append(toIndentedString(sellerSku)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
