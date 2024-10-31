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
import io.swagger.client.model.Box;
import io.swagger.client.model.Pagination;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The &#x60;listPackingGroupBoxes&#x60; response.
 */
@ApiModel(description = "The `listPackingGroupBoxes` response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:58:38.239+08:00")
public class ListPackingGroupBoxesResponse {
  @SerializedName("boxes")
  private List<Box> boxes = new ArrayList<Box>();

  @SerializedName("pagination")
  private Pagination pagination = null;

  public ListPackingGroupBoxesResponse boxes(List<Box> boxes) {
    this.boxes = boxes;
    return this;
  }

  public ListPackingGroupBoxesResponse addBoxesItem(Box boxesItem) {
    this.boxes.add(boxesItem);
    return this;
  }

   /**
   * Provides the information about the list of boxes in the packing group.
   * @return boxes
  **/
  @ApiModelProperty(required = true, value = "Provides the information about the list of boxes in the packing group.")
  public List<Box> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<Box> boxes) {
    this.boxes = boxes;
  }

  public ListPackingGroupBoxesResponse pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPackingGroupBoxesResponse listPackingGroupBoxesResponse = (ListPackingGroupBoxesResponse) o;
    return Objects.equals(this.boxes, listPackingGroupBoxesResponse.boxes) &&
        Objects.equals(this.pagination, listPackingGroupBoxesResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPackingGroupBoxesResponse {\n");
    
    sb.append("    boxes: ").append(toIndentedString(boxes)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

