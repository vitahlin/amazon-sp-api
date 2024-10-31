/*
 * Selling Partner API for Listings Items
 * The Selling Partner API for Listings Items (Listings Items API) provides programmatic access to selling partner listings on Amazon. Use this API in collaboration with the Selling Partner API for Product Type Definitions, which you use to retrieve the information about Amazon product types needed to use the Listings Items API.  For more information, see the [Listings Items API Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/listings-items-api-v2021-08-01-use-case-guide).
 *
 * OpenAPI spec version: 2021-08-01
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
 * The image for the listings item.
 */
@ApiModel(description = "The image for the listings item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T21:00:15.620+08:00")
public class ItemImage {
  @SerializedName("link")
  private String link = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("width")
  private Integer width = null;

  public ItemImage link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The link, or URL, to the image.
   * @return link
  **/
  @ApiModelProperty(required = true, value = "The link, or URL, to the image.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ItemImage height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the image in pixels.
   * @return height
  **/
  @ApiModelProperty(required = true, value = "The height of the image in pixels.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ItemImage width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the image in pixels.
   * @return width
  **/
  @ApiModelProperty(required = true, value = "The width of the image in pixels.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemImage itemImage = (ItemImage) o;
    return Objects.equals(this.link, itemImage.link) &&
        Objects.equals(this.height, itemImage.height) &&
        Objects.equals(this.width, itemImage.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, height, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemImage {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

