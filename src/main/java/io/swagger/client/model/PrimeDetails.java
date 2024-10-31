/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer pricing information for Amazon Marketplace products.  For more information, refer to the [Product Pricing v2022-05-01 Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/product-pricing-api-v2022-05-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-05-01
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
 * Amazon Prime details.
 */
@ApiModel(description = "Amazon Prime details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:08:31.630+08:00")
public class PrimeDetails {
  /**
   * Indicates whether the offer is an Amazon Prime offer.
   */
  @JsonAdapter(EligibilityEnum.Adapter.class)
  public enum EligibilityEnum {
    NATIONAL("NATIONAL"),
    
    REGIONAL("REGIONAL"),
    
    NONE("NONE");

    private String value;

    EligibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EligibilityEnum fromValue(String text) {
      for (EligibilityEnum b : EligibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EligibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EligibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EligibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EligibilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("eligibility")
  private EligibilityEnum eligibility = null;

  public PrimeDetails eligibility(EligibilityEnum eligibility) {
    this.eligibility = eligibility;
    return this;
  }

   /**
   * Indicates whether the offer is an Amazon Prime offer.
   * @return eligibility
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the offer is an Amazon Prime offer.")
  public EligibilityEnum getEligibility() {
    return eligibility;
  }

  public void setEligibility(EligibilityEnum eligibility) {
    this.eligibility = eligibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimeDetails primeDetails = (PrimeDetails) o;
    return Objects.equals(this.eligibility, primeDetails.eligibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimeDetails {\n");
    
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
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

