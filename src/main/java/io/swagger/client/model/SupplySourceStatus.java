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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The &#x60;SupplySource&#x60; status
 */
@JsonAdapter(SupplySourceStatus.Adapter.class)
public enum SupplySourceStatus {
  
  ACTIVE("Active"),
  
  INACTIVE("Inactive");

  private String value;

  SupplySourceStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SupplySourceStatus fromValue(String text) {
    for (SupplySourceStatus b : SupplySourceStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SupplySourceStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SupplySourceStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SupplySourceStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SupplySourceStatus.fromValue(String.valueOf(value));
    }
  }
}
