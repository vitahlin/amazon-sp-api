/*
 * Selling Partner API for Messaging
 * With the Messaging API you can build applications that send messages to buyers. You can get a list of message types that are available for an order that you specify, then call an operation that sends a message to the buyer for that order. The Messaging API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
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
import io.swagger.client.model.LinkObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetMessagingActionsForOrderResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:05:26.886+08:00")
public class GetMessagingActionsForOrderResponseLinks {
  @SerializedName("self")
  private LinkObject self = null;

  @SerializedName("actions")
  private List<LinkObject> actions = new ArrayList<LinkObject>();

  public GetMessagingActionsForOrderResponseLinks self(LinkObject self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(required = true, value = "")
  public LinkObject getSelf() {
    return self;
  }

  public void setSelf(LinkObject self) {
    this.self = self;
  }

  public GetMessagingActionsForOrderResponseLinks actions(List<LinkObject> actions) {
    this.actions = actions;
    return this;
  }

  public GetMessagingActionsForOrderResponseLinks addActionsItem(LinkObject actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Eligible actions for the specified amazonOrderId.
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "Eligible actions for the specified amazonOrderId.")
  public List<LinkObject> getActions() {
    return actions;
  }

  public void setActions(List<LinkObject> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMessagingActionsForOrderResponseLinks getMessagingActionsForOrderResponseLinks = (GetMessagingActionsForOrderResponseLinks) o;
    return Objects.equals(this.self, getMessagingActionsForOrderResponseLinks.self) &&
        Objects.equals(this.actions, getMessagingActionsForOrderResponseLinks.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMessagingActionsForOrderResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

