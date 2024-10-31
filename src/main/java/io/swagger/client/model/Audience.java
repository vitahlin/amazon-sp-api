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
 * Buyer segment or program this offer is applicable to.
 */
@ApiModel(description = "Buyer segment or program this offer is applicable to.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T21:00:15.620+08:00")
public class Audience {
  @SerializedName("value")
  private String value = null;

  @SerializedName("displayName")
  private String displayName = null;

  public Audience value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Name of the audience an offer is applicable to.   Common values:   * &#39;ALL&#39; - Standard offer audience for buyers on Amazon retail websites.   * &#39;B2B&#39; - Offer audience for Amazon Business website buyers.
   * @return value
  **/
  @ApiModelProperty(example = "ALL", value = "Name of the audience an offer is applicable to.   Common values:   * 'ALL' - Standard offer audience for buyers on Amazon retail websites.   * 'B2B' - Offer audience for Amazon Business website buyers.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Audience displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Localized display name for the audience.
   * @return displayName
  **/
  @ApiModelProperty(value = "Localized display name for the audience.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Audience audience = (Audience) o;
    return Objects.equals(this.value, audience.value) &&
        Objects.equals(this.displayName, audience.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audience {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

