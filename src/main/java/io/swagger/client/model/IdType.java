/*
 * Selling Partner API for Product Fees
 * The Selling Partner API for Product Fees lets you programmatically retrieve estimated fees for a product. You can then account for those fees in your pricing.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of product identifier used in a &#x60;FeesEstimateByIdRequest&#x60;.
 */
@JsonAdapter(IdType.Adapter.class)
public enum IdType {
  
  ASIN("ASIN"),
  
  SELLERSKU("SellerSKU");

  private String value;

  IdType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IdType fromValue(String text) {
    for (IdType b : IdType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<IdType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IdType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IdType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IdType.fromValue(String.valueOf(value));
    }
  }
}

