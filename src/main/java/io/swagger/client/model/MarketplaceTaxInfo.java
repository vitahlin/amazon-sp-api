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
import io.swagger.client.model.TaxClassification;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Tax information about the marketplace.
 */
@ApiModel(description = "Tax information about the marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:07:17.661+08:00")
public class MarketplaceTaxInfo {
  @SerializedName("TaxClassifications")
  private List<TaxClassification> taxClassifications = null;

  public MarketplaceTaxInfo taxClassifications(List<TaxClassification> taxClassifications) {
    this.taxClassifications = taxClassifications;
    return this;
  }

  public MarketplaceTaxInfo addTaxClassificationsItem(TaxClassification taxClassificationsItem) {
    if (this.taxClassifications == null) {
      this.taxClassifications = new ArrayList<TaxClassification>();
    }
    this.taxClassifications.add(taxClassificationsItem);
    return this;
  }

   /**
   * A list of tax classifications that apply to the order.
   * @return taxClassifications
  **/
  @ApiModelProperty(value = "A list of tax classifications that apply to the order.")
  public List<TaxClassification> getTaxClassifications() {
    return taxClassifications;
  }

  public void setTaxClassifications(List<TaxClassification> taxClassifications) {
    this.taxClassifications = taxClassifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketplaceTaxInfo marketplaceTaxInfo = (MarketplaceTaxInfo) o;
    return Objects.equals(this.taxClassifications, marketplaceTaxInfo.taxClassifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxClassifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketplaceTaxInfo {\n");
    
    sb.append("    taxClassifications: ").append(toIndentedString(taxClassifications)).append("\n");
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

