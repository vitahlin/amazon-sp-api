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
import io.swagger.client.model.ImageCropSpecification;
import java.io.IOException;

/**
 * A reference to an image, hosted in the A+ Content media library.
 */
@ApiModel(description = "A reference to an image, hosted in the A+ Content media library.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:39:41.884+08:00")
public class ImageComponent {
  @SerializedName("uploadDestinationId")
  private String uploadDestinationId = null;

  @SerializedName("imageCropSpecification")
  private ImageCropSpecification imageCropSpecification = null;

  @SerializedName("altText")
  private String altText = null;

  public ImageComponent uploadDestinationId(String uploadDestinationId) {
    this.uploadDestinationId = uploadDestinationId;
    return this;
  }

   /**
   * This identifier is provided by the Selling Partner API for Uploads.
   * @return uploadDestinationId
  **/
  @ApiModelProperty(required = true, value = "This identifier is provided by the Selling Partner API for Uploads.")
  public String getUploadDestinationId() {
    return uploadDestinationId;
  }

  public void setUploadDestinationId(String uploadDestinationId) {
    this.uploadDestinationId = uploadDestinationId;
  }

  public ImageComponent imageCropSpecification(ImageCropSpecification imageCropSpecification) {
    this.imageCropSpecification = imageCropSpecification;
    return this;
  }

   /**
   * Get imageCropSpecification
   * @return imageCropSpecification
  **/
  @ApiModelProperty(required = true, value = "")
  public ImageCropSpecification getImageCropSpecification() {
    return imageCropSpecification;
  }

  public void setImageCropSpecification(ImageCropSpecification imageCropSpecification) {
    this.imageCropSpecification = imageCropSpecification;
  }

  public ImageComponent altText(String altText) {
    this.altText = altText;
    return this;
  }

   /**
   * The alternative text for the image.
   * @return altText
  **/
  @ApiModelProperty(required = true, value = "The alternative text for the image.")
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageComponent imageComponent = (ImageComponent) o;
    return Objects.equals(this.uploadDestinationId, imageComponent.uploadDestinationId) &&
        Objects.equals(this.imageCropSpecification, imageComponent.imageCropSpecification) &&
        Objects.equals(this.altText, imageComponent.altText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadDestinationId, imageCropSpecification, altText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageComponent {\n");
    
    sb.append("    uploadDestinationId: ").append(toIndentedString(uploadDestinationId)).append("\n");
    sb.append("    imageCropSpecification: ").append(toIndentedString(imageCropSpecification)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
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
