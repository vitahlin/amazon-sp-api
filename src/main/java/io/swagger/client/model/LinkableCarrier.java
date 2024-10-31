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
import io.swagger.client.model.LinkableAccountTypeList;
import java.io.IOException;

/**
 * Info About Linkable Carrier
 */
@ApiModel(description = "Info About Linkable Carrier")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:18:11.724+08:00")
public class LinkableCarrier {
  @SerializedName("carrierId")
  private String carrierId = null;

  @SerializedName("linkableAccountTypes")
  private LinkableAccountTypeList linkableAccountTypes = null;

  public LinkableCarrier carrierId(String carrierId) {
    this.carrierId = carrierId;
    return this;
  }

   /**
   * Get carrierId
   * @return carrierId
  **/
  @ApiModelProperty(value = "")
  public String getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
  }

  public LinkableCarrier linkableAccountTypes(LinkableAccountTypeList linkableAccountTypes) {
    this.linkableAccountTypes = linkableAccountTypes;
    return this;
  }

   /**
   * Get linkableAccountTypes
   * @return linkableAccountTypes
  **/
  @ApiModelProperty(value = "")
  public LinkableAccountTypeList getLinkableAccountTypes() {
    return linkableAccountTypes;
  }

  public void setLinkableAccountTypes(LinkableAccountTypeList linkableAccountTypes) {
    this.linkableAccountTypes = linkableAccountTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkableCarrier linkableCarrier = (LinkableCarrier) o;
    return Objects.equals(this.carrierId, linkableCarrier.carrierId) &&
        Objects.equals(this.linkableAccountTypes, linkableCarrier.linkableAccountTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierId, linkableAccountTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkableCarrier {\n");
    
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    linkableAccountTypes: ").append(toIndentedString(linkableAccountTypes)).append("\n");
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
