/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
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
import io.swagger.client.model.CapacityType;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Request schema for the &#x60;getFixedSlotCapacity&#x60; operation. This schema is used to define the time range, capacity types and slot duration which are being queried.
 */
@ApiModel(description = "Request schema for the `getFixedSlotCapacity` operation. This schema is used to define the time range, capacity types and slot duration which are being queried.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:16:19.109+08:00")
public class FixedSlotCapacityQuery {
  @SerializedName("capacityTypes")
  private List<CapacityType> capacityTypes = null;

  @SerializedName("slotDuration")
  private BigDecimal slotDuration = null;

  @SerializedName("startDateTime")
  private OffsetDateTime startDateTime = null;

  @SerializedName("endDateTime")
  private OffsetDateTime endDateTime = null;

  public FixedSlotCapacityQuery capacityTypes(List<CapacityType> capacityTypes) {
    this.capacityTypes = capacityTypes;
    return this;
  }

  public FixedSlotCapacityQuery addCapacityTypesItem(CapacityType capacityTypesItem) {
    if (this.capacityTypes == null) {
      this.capacityTypes = new ArrayList<CapacityType>();
    }
    this.capacityTypes.add(capacityTypesItem);
    return this;
  }

   /**
   * An array of capacity types which are being requested. Default value is &#x60;[SCHEDULED_CAPACITY]&#x60;.
   * @return capacityTypes
  **/
  @ApiModelProperty(value = "An array of capacity types which are being requested. Default value is `[SCHEDULED_CAPACITY]`.")
  public List<CapacityType> getCapacityTypes() {
    return capacityTypes;
  }

  public void setCapacityTypes(List<CapacityType> capacityTypes) {
    this.capacityTypes = capacityTypes;
  }

  public FixedSlotCapacityQuery slotDuration(BigDecimal slotDuration) {
    this.slotDuration = slotDuration;
    return this;
  }

   /**
   * Size in which slots are being requested. This value should be a multiple of 5 and fall in the range: 5 &lt;&#x3D; &#x60;slotDuration&#x60; &lt;&#x3D; 360.
   * @return slotDuration
  **/
  @ApiModelProperty(value = "Size in which slots are being requested. This value should be a multiple of 5 and fall in the range: 5 <= `slotDuration` <= 360.")
  public BigDecimal getSlotDuration() {
    return slotDuration;
  }

  public void setSlotDuration(BigDecimal slotDuration) {
    this.slotDuration = slotDuration;
  }

  public FixedSlotCapacityQuery startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Start date time from which the capacity slots are being requested in ISO 8601 format.
   * @return startDateTime
  **/
  @ApiModelProperty(required = true, value = "Start date time from which the capacity slots are being requested in ISO 8601 format.")
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public FixedSlotCapacityQuery endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * End date time up to which the capacity slots are being requested in ISO 8601 format.
   * @return endDateTime
  **/
  @ApiModelProperty(required = true, value = "End date time up to which the capacity slots are being requested in ISO 8601 format.")
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedSlotCapacityQuery fixedSlotCapacityQuery = (FixedSlotCapacityQuery) o;
    return Objects.equals(this.capacityTypes, fixedSlotCapacityQuery.capacityTypes) &&
        Objects.equals(this.slotDuration, fixedSlotCapacityQuery.slotDuration) &&
        Objects.equals(this.startDateTime, fixedSlotCapacityQuery.startDateTime) &&
        Objects.equals(this.endDateTime, fixedSlotCapacityQuery.endDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityTypes, slotDuration, startDateTime, endDateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedSlotCapacityQuery {\n");
    
    sb.append("    capacityTypes: ").append(toIndentedString(capacityTypes)).append("\n");
    sb.append("    slotDuration: ").append(toIndentedString(slotDuration)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
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

