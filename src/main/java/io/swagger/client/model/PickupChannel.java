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
import io.swagger.client.model.CurbsidePickupConfiguration;
import io.swagger.client.model.Duration;
import io.swagger.client.model.InStorePickupConfiguration;
import io.swagger.client.model.OperationalConfiguration;
import java.io.IOException;

/**
 * The pick up channel of a supply source.
 */
@ApiModel(description = "The pick up channel of a supply source.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:19:44.003+08:00")
public class PickupChannel {
  @SerializedName("inventoryHoldPeriod")
  private Duration inventoryHoldPeriod = null;

  @SerializedName("isSupported")
  private Boolean isSupported = null;

  @SerializedName("operationalConfiguration")
  private OperationalConfiguration operationalConfiguration = null;

  @SerializedName("inStorePickupConfiguration")
  private InStorePickupConfiguration inStorePickupConfiguration = null;

  @SerializedName("curbsidePickupConfiguration")
  private CurbsidePickupConfiguration curbsidePickupConfiguration = null;

  public PickupChannel inventoryHoldPeriod(Duration inventoryHoldPeriod) {
    this.inventoryHoldPeriod = inventoryHoldPeriod;
    return this;
  }

   /**
   * Get inventoryHoldPeriod
   * @return inventoryHoldPeriod
  **/
  @ApiModelProperty(value = "")
  public Duration getInventoryHoldPeriod() {
    return inventoryHoldPeriod;
  }

  public void setInventoryHoldPeriod(Duration inventoryHoldPeriod) {
    this.inventoryHoldPeriod = inventoryHoldPeriod;
  }

  public PickupChannel isSupported(Boolean isSupported) {
    this.isSupported = isSupported;
    return this;
  }

   /**
   * Get isSupported
   * @return isSupported
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSupported() {
    return isSupported;
  }

  public void setIsSupported(Boolean isSupported) {
    this.isSupported = isSupported;
  }

  public PickupChannel operationalConfiguration(OperationalConfiguration operationalConfiguration) {
    this.operationalConfiguration = operationalConfiguration;
    return this;
  }

   /**
   * Get operationalConfiguration
   * @return operationalConfiguration
  **/
  @ApiModelProperty(value = "")
  public OperationalConfiguration getOperationalConfiguration() {
    return operationalConfiguration;
  }

  public void setOperationalConfiguration(OperationalConfiguration operationalConfiguration) {
    this.operationalConfiguration = operationalConfiguration;
  }

  public PickupChannel inStorePickupConfiguration(InStorePickupConfiguration inStorePickupConfiguration) {
    this.inStorePickupConfiguration = inStorePickupConfiguration;
    return this;
  }

   /**
   * The configuration for supporting in-store pickup.
   * @return inStorePickupConfiguration
  **/
  @ApiModelProperty(value = "The configuration for supporting in-store pickup.")
  public InStorePickupConfiguration getInStorePickupConfiguration() {
    return inStorePickupConfiguration;
  }

  public void setInStorePickupConfiguration(InStorePickupConfiguration inStorePickupConfiguration) {
    this.inStorePickupConfiguration = inStorePickupConfiguration;
  }

  public PickupChannel curbsidePickupConfiguration(CurbsidePickupConfiguration curbsidePickupConfiguration) {
    this.curbsidePickupConfiguration = curbsidePickupConfiguration;
    return this;
  }

   /**
   * The configuration for supporting curbside pickup.
   * @return curbsidePickupConfiguration
  **/
  @ApiModelProperty(value = "The configuration for supporting curbside pickup.")
  public CurbsidePickupConfiguration getCurbsidePickupConfiguration() {
    return curbsidePickupConfiguration;
  }

  public void setCurbsidePickupConfiguration(CurbsidePickupConfiguration curbsidePickupConfiguration) {
    this.curbsidePickupConfiguration = curbsidePickupConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickupChannel pickupChannel = (PickupChannel) o;
    return Objects.equals(this.inventoryHoldPeriod, pickupChannel.inventoryHoldPeriod) &&
        Objects.equals(this.isSupported, pickupChannel.isSupported) &&
        Objects.equals(this.operationalConfiguration, pickupChannel.operationalConfiguration) &&
        Objects.equals(this.inStorePickupConfiguration, pickupChannel.inStorePickupConfiguration) &&
        Objects.equals(this.curbsidePickupConfiguration, pickupChannel.curbsidePickupConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryHoldPeriod, isSupported, operationalConfiguration, inStorePickupConfiguration, curbsidePickupConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickupChannel {\n");
    
    sb.append("    inventoryHoldPeriod: ").append(toIndentedString(inventoryHoldPeriod)).append("\n");
    sb.append("    isSupported: ").append(toIndentedString(isSupported)).append("\n");
    sb.append("    operationalConfiguration: ").append(toIndentedString(operationalConfiguration)).append("\n");
    sb.append("    inStorePickupConfiguration: ").append(toIndentedString(inStorePickupConfiguration)).append("\n");
    sb.append("    curbsidePickupConfiguration: ").append(toIndentedString(curbsidePickupConfiguration)).append("\n");
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

