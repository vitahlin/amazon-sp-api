/*
 * Selling Partner API for Replenishment
 * The Selling Partner API for Replenishment (Replenishment API) provides programmatic access to replenishment program metrics and offers. These programs provide recurring delivery of any replenishable item at a frequency chosen by the customer.  The Replenishment API is available worldwide wherever Amazon Subscribe & Save is available or is supported. The API is available to vendors and FBA selling partners.
 *
 * OpenAPI spec version: 2022-11-07
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
 * The attribute to use to sort the results.
 */
@JsonAdapter(ListOfferMetricsSortKey.Adapter.class)
public enum ListOfferMetricsSortKey {
  
  SHIPPED_SUBSCRIPTION_UNITS("SHIPPED_SUBSCRIPTION_UNITS"),
  
  TOTAL_SUBSCRIPTIONS_REVENUE("TOTAL_SUBSCRIPTIONS_REVENUE"),
  
  ACTIVE_SUBSCRIPTIONS("ACTIVE_SUBSCRIPTIONS"),
  
  NEXT_90DAYS_SHIPPED_SUBSCRIPTION_UNITS("NEXT_90DAYS_SHIPPED_SUBSCRIPTION_UNITS"),
  
  NEXT_60DAYS_SHIPPED_SUBSCRIPTION_UNITS("NEXT_60DAYS_SHIPPED_SUBSCRIPTION_UNITS"),
  
  NEXT_30DAYS_SHIPPED_SUBSCRIPTION_UNITS("NEXT_30DAYS_SHIPPED_SUBSCRIPTION_UNITS"),
  
  NEXT_90DAYS_TOTAL_SUBSCRIPTIONS_REVENUE("NEXT_90DAYS_TOTAL_SUBSCRIPTIONS_REVENUE"),
  
  NEXT_60DAYS_TOTAL_SUBSCRIPTIONS_REVENUE("NEXT_60DAYS_TOTAL_SUBSCRIPTIONS_REVENUE"),
  
  NEXT_30DAYS_TOTAL_SUBSCRIPTIONS_REVENUE("NEXT_30DAYS_TOTAL_SUBSCRIPTIONS_REVENUE");

  private String value;

  ListOfferMetricsSortKey(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ListOfferMetricsSortKey fromValue(String text) {
    for (ListOfferMetricsSortKey b : ListOfferMetricsSortKey.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ListOfferMetricsSortKey> {
    @Override
    public void write(final JsonWriter jsonWriter, final ListOfferMetricsSortKey enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ListOfferMetricsSortKey read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ListOfferMetricsSortKey.fromValue(String.valueOf(value));
    }
  }
}

