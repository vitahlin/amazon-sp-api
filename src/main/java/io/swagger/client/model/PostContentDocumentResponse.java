/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
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
import io.swagger.client.model.AplusResponse;
import io.swagger.client.model.MessageSet;
import java.io.IOException;

/**
 * PostContentDocumentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:39:41.884+08:00")
public class PostContentDocumentResponse extends AplusResponse {
  @SerializedName("contentReferenceKey")
  private String contentReferenceKey = null;

  public PostContentDocumentResponse contentReferenceKey(String contentReferenceKey) {
    this.contentReferenceKey = contentReferenceKey;
    return this;
  }

   /**
   * Get contentReferenceKey
   * @return contentReferenceKey
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContentReferenceKey() {
    return contentReferenceKey;
  }

  public void setContentReferenceKey(String contentReferenceKey) {
    this.contentReferenceKey = contentReferenceKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostContentDocumentResponse postContentDocumentResponse = (PostContentDocumentResponse) o;
    return Objects.equals(this.contentReferenceKey, postContentDocumentResponse.contentReferenceKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentReferenceKey, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostContentDocumentResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contentReferenceKey: ").append(toIndentedString(contentReferenceKey)).append("\n");
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

