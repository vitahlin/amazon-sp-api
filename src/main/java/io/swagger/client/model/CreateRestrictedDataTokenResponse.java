/*
 * Selling Partner API for Tokens 
 * The Selling Partner API for Tokens provides a secure way to access a customer's PII (Personally Identifiable Information). You can call the Tokens API to get a Restricted Data Token (RDT) for one or more restricted resources that you specify. The RDT authorizes subsequent calls to restricted operations that correspond to the restricted resources that you specified.  For more information, see the [Tokens API Use Case Guide](doc:tokens-api-use-case-guide).
 *
 * OpenAPI spec version: 2021-03-01
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
 * The response schema for the createRestrictedDataToken operation.
 */
@ApiModel(description = "The response schema for the createRestrictedDataToken operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:20:24.769+08:00")
public class CreateRestrictedDataTokenResponse {
  @SerializedName("restrictedDataToken")
  private String restrictedDataToken = null;

  @SerializedName("expiresIn")
  private Integer expiresIn = null;

  public CreateRestrictedDataTokenResponse restrictedDataToken(String restrictedDataToken) {
    this.restrictedDataToken = restrictedDataToken;
    return this;
  }

   /**
   * A Restricted Data Token (RDT). This is a short-lived access token that authorizes calls to restricted operations. Pass this value with the x-amz-access-token header when making subsequent calls to these restricted resources.
   * @return restrictedDataToken
  **/
  @ApiModelProperty(value = "A Restricted Data Token (RDT). This is a short-lived access token that authorizes calls to restricted operations. Pass this value with the x-amz-access-token header when making subsequent calls to these restricted resources.")
  public String getRestrictedDataToken() {
    return restrictedDataToken;
  }

  public void setRestrictedDataToken(String restrictedDataToken) {
    this.restrictedDataToken = restrictedDataToken;
  }

  public CreateRestrictedDataTokenResponse expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * The lifetime of the Restricted Data Token, in seconds.
   * @return expiresIn
  **/
  @ApiModelProperty(value = "The lifetime of the Restricted Data Token, in seconds.")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRestrictedDataTokenResponse createRestrictedDataTokenResponse = (CreateRestrictedDataTokenResponse) o;
    return Objects.equals(this.restrictedDataToken, createRestrictedDataTokenResponse.restrictedDataToken) &&
        Objects.equals(this.expiresIn, createRestrictedDataTokenResponse.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrictedDataToken, expiresIn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRestrictedDataTokenResponse {\n");
    
    sb.append("    restrictedDataToken: ").append(toIndentedString(restrictedDataToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

