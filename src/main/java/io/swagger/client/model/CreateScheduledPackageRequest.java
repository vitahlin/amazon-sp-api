/*
 * Selling Partner API for Easy Ship
 * The Selling Partner API for Easy Ship helps you build applications that help sellers manage and ship Amazon Easy Ship orders.  Your Easy Ship applications can:  * Get available time slots for packages to be scheduled for delivery.  * Schedule, reschedule, and cancel Easy Ship orders.  * Print labels, invoices, and warranties.  See the [Marketplace Support Table](doc:easyship-api-v2022-03-23-use-case-guide#marketplace-support-table) for the differences in Easy Ship operations by marketplace.
 *
 * OpenAPI spec version: 2022-03-23
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
import io.swagger.client.model.PackageDetails;
import java.io.IOException;

/**
 * The request schema for the &#x60;createScheduledPackage&#x60; operation.
 */
@ApiModel(description = "The request schema for the `createScheduledPackage` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:48:47.531+08:00")
public class CreateScheduledPackageRequest {
  @SerializedName("amazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("packageDetails")
  private PackageDetails packageDetails = null;

  public CreateScheduledPackageRequest amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * Get amazonOrderId
   * @return amazonOrderId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public CreateScheduledPackageRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Get marketplaceId
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public CreateScheduledPackageRequest packageDetails(PackageDetails packageDetails) {
    this.packageDetails = packageDetails;
    return this;
  }

   /**
   * Get packageDetails
   * @return packageDetails
  **/
  @ApiModelProperty(required = true, value = "")
  public PackageDetails getPackageDetails() {
    return packageDetails;
  }

  public void setPackageDetails(PackageDetails packageDetails) {
    this.packageDetails = packageDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateScheduledPackageRequest createScheduledPackageRequest = (CreateScheduledPackageRequest) o;
    return Objects.equals(this.amazonOrderId, createScheduledPackageRequest.amazonOrderId) &&
        Objects.equals(this.marketplaceId, createScheduledPackageRequest.marketplaceId) &&
        Objects.equals(this.packageDetails, createScheduledPackageRequest.packageDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderId, marketplaceId, packageDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateScheduledPackageRequest {\n");
    
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    packageDetails: ").append(toIndentedString(packageDetails)).append("\n");
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

