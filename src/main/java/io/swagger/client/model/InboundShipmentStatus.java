/*
 * The Selling Partner API for Amazon Warehousing and Distribution
 * The Selling Partner API for Amazon Warehousing and Distribution (AWD) provides programmatic access to information about AWD shipments and inventory. 
 *
 * OpenAPI spec version: 2024-05-09
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
 * Possible shipment statuses used by shipments.
 */
@JsonAdapter(InboundShipmentStatus.Adapter.class)
public enum InboundShipmentStatus {
  
  CREATED("CREATED"),
  
  SHIPPED("SHIPPED"),
  
  IN_TRANSIT("IN_TRANSIT"),
  
  RECEIVING("RECEIVING"),
  
  DELIVERED("DELIVERED"),
  
  CLOSED("CLOSED"),
  
  CANCELLED("CANCELLED");

  private String value;

  InboundShipmentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InboundShipmentStatus fromValue(String text) {
    for (InboundShipmentStatus b : InboundShipmentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<InboundShipmentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final InboundShipmentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InboundShipmentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InboundShipmentStatus.fromValue(String.valueOf(value));
    }
  }
}

