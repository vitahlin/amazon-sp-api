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
import java.io.IOException;

/**
 * Warning returned when the request is successful, but there are important callouts based on which API clients should take defined actions.
 */
@ApiModel(description = "Warning returned when the request is successful, but there are important callouts based on which API clients should take defined actions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:16:19.109+08:00")
public class Warning {
  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("details")
  private String details = null;

  public Warning code(String code) {
    this.code = code;
    return this;
  }

   /**
   * An warning code that identifies the type of warning that occurred.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "An warning code that identifies the type of warning that occurred.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Warning message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A message that describes the warning condition in a human-readable form.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A message that describes the warning condition in a human-readable form.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Warning details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Additional details that can help the caller understand or address the warning.
   * @return details
  **/
  @ApiModelProperty(value = "Additional details that can help the caller understand or address the warning.")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Warning warning = (Warning) o;
    return Objects.equals(this.code, warning.code) &&
        Objects.equals(this.message, warning.message) &&
        Objects.equals(this.details, warning.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warning {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
