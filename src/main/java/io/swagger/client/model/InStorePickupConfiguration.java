/*
 * Selling Partner API for Supply Sources
 * Manage configurations and capabilities of seller supply sources.
 *
 * OpenAPI spec version: 2020-07-01
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
import io.swagger.client.model.ParkingConfiguration;
import java.io.IOException;

/**
 * The in-store pickup configuration of a supply source.
 */
@ApiModel(description = "The in-store pickup configuration of a supply source.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:19:44.003+08:00")
public class InStorePickupConfiguration {
  @SerializedName("isSupported")
  private Boolean isSupported = null;

  @SerializedName("parkingConfiguration")
  private ParkingConfiguration parkingConfiguration = null;

  public InStorePickupConfiguration isSupported(Boolean isSupported) {
    this.isSupported = isSupported;
    return this;
  }

   /**
   * When true, in-store pickup is supported by the supply source (default: &#x60;isSupported&#x60; value in &#x60;PickupChannel&#x60;).
   * @return isSupported
  **/
  @ApiModelProperty(value = "When true, in-store pickup is supported by the supply source (default: `isSupported` value in `PickupChannel`).")
  public Boolean isIsSupported() {
    return isSupported;
  }

  public void setIsSupported(Boolean isSupported) {
    this.isSupported = isSupported;
  }

  public InStorePickupConfiguration parkingConfiguration(ParkingConfiguration parkingConfiguration) {
    this.parkingConfiguration = parkingConfiguration;
    return this;
  }

   /**
   * The parking configuration for in-store pickup.
   * @return parkingConfiguration
  **/
  @ApiModelProperty(value = "The parking configuration for in-store pickup.")
  public ParkingConfiguration getParkingConfiguration() {
    return parkingConfiguration;
  }

  public void setParkingConfiguration(ParkingConfiguration parkingConfiguration) {
    this.parkingConfiguration = parkingConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InStorePickupConfiguration inStorePickupConfiguration = (InStorePickupConfiguration) o;
    return Objects.equals(this.isSupported, inStorePickupConfiguration.isSupported) &&
        Objects.equals(this.parkingConfiguration, inStorePickupConfiguration.parkingConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSupported, parkingConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InStorePickupConfiguration {\n");
    
    sb.append("    isSupported: ").append(toIndentedString(isSupported)).append("\n");
    sb.append("    parkingConfiguration: ").append(toIndentedString(parkingConfiguration)).append("\n");
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

