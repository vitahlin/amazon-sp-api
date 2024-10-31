/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
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
import io.swagger.client.model.ItemBrowseClassification;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classifications (browse nodes) associated with the item in the Amazon catalog for the indicated Amazon marketplace.
 */
@ApiModel(description = "Classifications (browse nodes) associated with the item in the Amazon catalog for the indicated Amazon marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:46:18.123+08:00")
public class ItemBrowseClassificationsByMarketplace {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("classifications")
  private List<ItemBrowseClassification> classifications = null;

  public ItemBrowseClassificationsByMarketplace marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Amazon marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "Amazon marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ItemBrowseClassificationsByMarketplace classifications(List<ItemBrowseClassification> classifications) {
    this.classifications = classifications;
    return this;
  }

  public ItemBrowseClassificationsByMarketplace addClassificationsItem(ItemBrowseClassification classificationsItem) {
    if (this.classifications == null) {
      this.classifications = new ArrayList<ItemBrowseClassification>();
    }
    this.classifications.add(classificationsItem);
    return this;
  }

   /**
   * Classifications (browse nodes) associated with the item in the Amazon catalog for the indicated Amazon marketplace.
   * @return classifications
  **/
  @ApiModelProperty(value = "Classifications (browse nodes) associated with the item in the Amazon catalog for the indicated Amazon marketplace.")
  public List<ItemBrowseClassification> getClassifications() {
    return classifications;
  }

  public void setClassifications(List<ItemBrowseClassification> classifications) {
    this.classifications = classifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemBrowseClassificationsByMarketplace itemBrowseClassificationsByMarketplace = (ItemBrowseClassificationsByMarketplace) o;
    return Objects.equals(this.marketplaceId, itemBrowseClassificationsByMarketplace.marketplaceId) &&
        Objects.equals(this.classifications, itemBrowseClassificationsByMarketplace.classifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, classifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemBrowseClassificationsByMarketplace {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
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

