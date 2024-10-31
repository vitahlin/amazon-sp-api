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
import io.swagger.client.model.ModelPackage;
import io.swagger.client.model.RejectedOrder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The response schema for the bulk scheduling API. It returns by the bulk scheduling API containing an array of the scheduled packtages, an optional list of orders we couldn&#39;t schedule with the reason, and a pre-signed URL for a ZIP file containing the associated shipping labels plus the documents enabled for your marketplace.
 */
@ApiModel(description = "The response schema for the bulk scheduling API. It returns by the bulk scheduling API containing an array of the scheduled packtages, an optional list of orders we couldn't schedule with the reason, and a pre-signed URL for a ZIP file containing the associated shipping labels plus the documents enabled for your marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:48:47.531+08:00")
public class CreateScheduledPackagesResponse {
  @SerializedName("scheduledPackages")
  private List<ModelPackage> scheduledPackages = null;

  @SerializedName("rejectedOrders")
  private List<RejectedOrder> rejectedOrders = null;

  @SerializedName("printableDocumentsUrl")
  private String printableDocumentsUrl = null;

  public CreateScheduledPackagesResponse scheduledPackages(List<ModelPackage> scheduledPackages) {
    this.scheduledPackages = scheduledPackages;
    return this;
  }

  public CreateScheduledPackagesResponse addScheduledPackagesItem(ModelPackage scheduledPackagesItem) {
    if (this.scheduledPackages == null) {
      this.scheduledPackages = new ArrayList<ModelPackage>();
    }
    this.scheduledPackages.add(scheduledPackagesItem);
    return this;
  }

   /**
   * A list of packages. Refer to the &#x60;Package&#x60; object.
   * @return scheduledPackages
  **/
  @ApiModelProperty(value = "A list of packages. Refer to the `Package` object.")
  public List<ModelPackage> getScheduledPackages() {
    return scheduledPackages;
  }

  public void setScheduledPackages(List<ModelPackage> scheduledPackages) {
    this.scheduledPackages = scheduledPackages;
  }

  public CreateScheduledPackagesResponse rejectedOrders(List<RejectedOrder> rejectedOrders) {
    this.rejectedOrders = rejectedOrders;
    return this;
  }

  public CreateScheduledPackagesResponse addRejectedOrdersItem(RejectedOrder rejectedOrdersItem) {
    if (this.rejectedOrders == null) {
      this.rejectedOrders = new ArrayList<RejectedOrder>();
    }
    this.rejectedOrders.add(rejectedOrdersItem);
    return this;
  }

   /**
   * A list of orders we couldn&#39;t scheduled on your behalf. Each element contains the reason and details on the error.
   * @return rejectedOrders
  **/
  @ApiModelProperty(value = "A list of orders we couldn't scheduled on your behalf. Each element contains the reason and details on the error.")
  public List<RejectedOrder> getRejectedOrders() {
    return rejectedOrders;
  }

  public void setRejectedOrders(List<RejectedOrder> rejectedOrders) {
    this.rejectedOrders = rejectedOrders;
  }

  public CreateScheduledPackagesResponse printableDocumentsUrl(String printableDocumentsUrl) {
    this.printableDocumentsUrl = printableDocumentsUrl;
    return this;
  }

   /**
   * Get printableDocumentsUrl
   * @return printableDocumentsUrl
  **/
  @ApiModelProperty(value = "")
  public String getPrintableDocumentsUrl() {
    return printableDocumentsUrl;
  }

  public void setPrintableDocumentsUrl(String printableDocumentsUrl) {
    this.printableDocumentsUrl = printableDocumentsUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateScheduledPackagesResponse createScheduledPackagesResponse = (CreateScheduledPackagesResponse) o;
    return Objects.equals(this.scheduledPackages, createScheduledPackagesResponse.scheduledPackages) &&
        Objects.equals(this.rejectedOrders, createScheduledPackagesResponse.rejectedOrders) &&
        Objects.equals(this.printableDocumentsUrl, createScheduledPackagesResponse.printableDocumentsUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledPackages, rejectedOrders, printableDocumentsUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateScheduledPackagesResponse {\n");
    
    sb.append("    scheduledPackages: ").append(toIndentedString(scheduledPackages)).append("\n");
    sb.append("    rejectedOrders: ").append(toIndentedString(rejectedOrders)).append("\n");
    sb.append("    printableDocumentsUrl: ").append(toIndentedString(printableDocumentsUrl)).append("\n");
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

