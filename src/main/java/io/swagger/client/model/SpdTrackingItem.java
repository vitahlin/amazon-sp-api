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
import java.io.IOException;

/**
 * Contains information used to track and identify a Small Parcel Delivery (SPD) item.
 */
@ApiModel(description = "Contains information used to track and identify a Small Parcel Delivery (SPD) item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T19:58:38.239+08:00")
public class SpdTrackingItem {
  @SerializedName("boxId")
  private String boxId = null;

  @SerializedName("trackingId")
  private String trackingId = null;

  @SerializedName("trackingNumberValidationStatus")
  private String trackingNumberValidationStatus = null;

  public SpdTrackingItem boxId(String boxId) {
    this.boxId = boxId;
    return this;
  }

   /**
   * The ID provided by Amazon that identifies a given box. This ID is comprised of the external shipment ID (which is generated after transportation has been confirmed) and the index of the box.
   * @return boxId
  **/
  @ApiModelProperty(value = "The ID provided by Amazon that identifies a given box. This ID is comprised of the external shipment ID (which is generated after transportation has been confirmed) and the index of the box.")
  public String getBoxId() {
    return boxId;
  }

  public void setBoxId(String boxId) {
    this.boxId = boxId;
  }

  public SpdTrackingItem trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * The tracking ID associated with each box in a non-Amazon partnered Small Parcel Delivery (SPD) shipment.
   * @return trackingId
  **/
  @ApiModelProperty(value = "The tracking ID associated with each box in a non-Amazon partnered Small Parcel Delivery (SPD) shipment.")
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  public SpdTrackingItem trackingNumberValidationStatus(String trackingNumberValidationStatus) {
    this.trackingNumberValidationStatus = trackingNumberValidationStatus;
    return this;
  }

   /**
   * Whether or not Amazon has validated the tracking number. If more than 24 hours have passed and the status is not yet &#39;VALIDATED&#39;, please verify the number and update if necessary. Possible values: &#x60;VALIDATED&#x60;, &#x60;NOT_VALIDATED&#x60;.
   * @return trackingNumberValidationStatus
  **/
  @ApiModelProperty(value = "Whether or not Amazon has validated the tracking number. If more than 24 hours have passed and the status is not yet 'VALIDATED', please verify the number and update if necessary. Possible values: `VALIDATED`, `NOT_VALIDATED`.")
  public String getTrackingNumberValidationStatus() {
    return trackingNumberValidationStatus;
  }

  public void setTrackingNumberValidationStatus(String trackingNumberValidationStatus) {
    this.trackingNumberValidationStatus = trackingNumberValidationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpdTrackingItem spdTrackingItem = (SpdTrackingItem) o;
    return Objects.equals(this.boxId, spdTrackingItem.boxId) &&
        Objects.equals(this.trackingId, spdTrackingItem.trackingId) &&
        Objects.equals(this.trackingNumberValidationStatus, spdTrackingItem.trackingNumberValidationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxId, trackingId, trackingNumberValidationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpdTrackingItem {\n");
    
    sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    trackingNumberValidationStatus: ").append(toIndentedString(trackingNumberValidationStatus)).append("\n");
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

