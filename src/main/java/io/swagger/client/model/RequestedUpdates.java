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
import io.swagger.client.model.BoxUpdateInput;
import io.swagger.client.model.ItemInput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Objects that were included in the update request.
 */
@ApiModel(description = "Objects that were included in the update request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:58:38.239+08:00")
public class RequestedUpdates {
  @SerializedName("boxes")
  private List<BoxUpdateInput> boxes = null;

  @SerializedName("items")
  private List<ItemInput> items = null;

  public RequestedUpdates boxes(List<BoxUpdateInput> boxes) {
    this.boxes = boxes;
    return this;
  }

  public RequestedUpdates addBoxesItem(BoxUpdateInput boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<BoxUpdateInput>();
    }
    this.boxes.add(boxesItem);
    return this;
  }

   /**
   * A list of boxes that will be present in the shipment after the update.
   * @return boxes
  **/
  @ApiModelProperty(value = "A list of boxes that will be present in the shipment after the update.")
  public List<BoxUpdateInput> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<BoxUpdateInput> boxes) {
    this.boxes = boxes;
  }

  public RequestedUpdates items(List<ItemInput> items) {
    this.items = items;
    return this;
  }

  public RequestedUpdates addItemsItem(ItemInput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemInput>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of all items that will be present in the shipment after the update.
   * @return items
  **/
  @ApiModelProperty(value = "A list of all items that will be present in the shipment after the update.")
  public List<ItemInput> getItems() {
    return items;
  }

  public void setItems(List<ItemInput> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestedUpdates requestedUpdates = (RequestedUpdates) o;
    return Objects.equals(this.boxes, requestedUpdates.boxes) &&
        Objects.equals(this.items, requestedUpdates.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedUpdates {\n");
    
    sb.append("    boxes: ").append(toIndentedString(boxes)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

