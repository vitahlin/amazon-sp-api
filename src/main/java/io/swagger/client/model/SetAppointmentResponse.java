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
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.WarningList;
import java.io.IOException;

/**
 * Response schema for the &#x60;addAppointmentForServiceJobByServiceJobId&#x60; and &#x60;rescheduleAppointmentForServiceJobByServiceJobId&#x60; operations.
 */
@ApiModel(description = "Response schema for the `addAppointmentForServiceJobByServiceJobId` and `rescheduleAppointmentForServiceJobByServiceJobId` operations.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:16:19.109+08:00")
public class SetAppointmentResponse {
  @SerializedName("appointmentId")
  private String appointmentId = null;

  @SerializedName("warnings")
  private WarningList warnings = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public SetAppointmentResponse appointmentId(String appointmentId) {
    this.appointmentId = appointmentId;
    return this;
  }

   /**
   * New appointment identifier generated during the &#x60;addAppointmentForServiceJobByServiceJobId&#x60; or &#x60;rescheduleAppointmentForServiceJobByServiceJobId&#x60; operations.
   * @return appointmentId
  **/
  @ApiModelProperty(value = "New appointment identifier generated during the `addAppointmentForServiceJobByServiceJobId` or `rescheduleAppointmentForServiceJobByServiceJobId` operations.")
  public String getAppointmentId() {
    return appointmentId;
  }

  public void setAppointmentId(String appointmentId) {
    this.appointmentId = appointmentId;
  }

  public SetAppointmentResponse warnings(WarningList warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Warnings generated during the &#x60;addAppointmentForServiceJobByServiceJobId&#x60; or &#x60;rescheduleAppointmentForServiceJobByServiceJobId&#x60; operations.
   * @return warnings
  **/
  @ApiModelProperty(value = "Warnings generated during the `addAppointmentForServiceJobByServiceJobId` or `rescheduleAppointmentForServiceJobByServiceJobId` operations.")
  public WarningList getWarnings() {
    return warnings;
  }

  public void setWarnings(WarningList warnings) {
    this.warnings = warnings;
  }

  public SetAppointmentResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Errors occurred during during the &#x60;addAppointmentForServiceJobByServiceJobId&#x60; or &#x60;rescheduleAppointmentForServiceJobByServiceJobId&#x60; operations.
   * @return errors
  **/
  @ApiModelProperty(value = "Errors occurred during during the `addAppointmentForServiceJobByServiceJobId` or `rescheduleAppointmentForServiceJobByServiceJobId` operations.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetAppointmentResponse setAppointmentResponse = (SetAppointmentResponse) o;
    return Objects.equals(this.appointmentId, setAppointmentResponse.appointmentId) &&
        Objects.equals(this.warnings, setAppointmentResponse.warnings) &&
        Objects.equals(this.errors, setAppointmentResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentId, warnings, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetAppointmentResponse {\n");
    
    sb.append("    appointmentId: ").append(toIndentedString(appointmentId)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
