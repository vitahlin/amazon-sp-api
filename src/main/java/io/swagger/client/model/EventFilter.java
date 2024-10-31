/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, refer to the [Notifications Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/notifications-api-v1-use-case-guide).
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
import io.swagger.client.model.AggregationFilter;
import io.swagger.client.model.AggregationSettings;
import io.swagger.client.model.MarketplaceFilter;
import io.swagger.client.model.MarketplaceIds;
import io.swagger.client.model.OrderChangeTypeFilter;
import io.swagger.client.model.OrderChangeTypes;
import java.io.IOException;

/**
 * A &#x60;notificationType&#x60; specific filter. This object contains all of the currently available filters and properties that you can use to define a &#x60;notificationType&#x60; specific filter.
 */
@ApiModel(description = "A `notificationType` specific filter. This object contains all of the currently available filters and properties that you can use to define a `notificationType` specific filter.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:06:38.157+08:00")
public class EventFilter extends AggregationFilter {
  @SerializedName("marketplaceIds")
  private MarketplaceIds marketplaceIds = null;

  @SerializedName("orderChangeTypes")
  private OrderChangeTypes orderChangeTypes = null;

  /**
   * An &#x60;eventFilterType&#x60; value that is supported by the specific &#x60;notificationType&#x60;. This is used by the subscription service to determine the type of event filter. Refer to [Notification Type Values](https://developer-docs.amazon.com/sp-api/docs/notification-type-values) to determine if an &#x60;eventFilterType&#x60; is supported.
   */
  @JsonAdapter(EventFilterTypeEnum.Adapter.class)
  public enum EventFilterTypeEnum {
    ANY_OFFER_CHANGED("ANY_OFFER_CHANGED"),
    
    ORDER_CHANGE("ORDER_CHANGE");

    private String value;

    EventFilterTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventFilterTypeEnum fromValue(String text) {
      for (EventFilterTypeEnum b : EventFilterTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EventFilterTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventFilterTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventFilterTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EventFilterTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("eventFilterType")
  private EventFilterTypeEnum eventFilterType = null;

  public EventFilter marketplaceIds(MarketplaceIds marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
    return this;
  }

   /**
   * Get marketplaceIds
   * @return marketplaceIds
  **/
  @ApiModelProperty(value = "")
  public MarketplaceIds getMarketplaceIds() {
    return marketplaceIds;
  }

  public void setMarketplaceIds(MarketplaceIds marketplaceIds) {
    this.marketplaceIds = marketplaceIds;
  }

  public EventFilter orderChangeTypes(OrderChangeTypes orderChangeTypes) {
    this.orderChangeTypes = orderChangeTypes;
    return this;
  }

   /**
   * Get orderChangeTypes
   * @return orderChangeTypes
  **/
  @ApiModelProperty(value = "")
  public OrderChangeTypes getOrderChangeTypes() {
    return orderChangeTypes;
  }

  public void setOrderChangeTypes(OrderChangeTypes orderChangeTypes) {
    this.orderChangeTypes = orderChangeTypes;
  }

  public EventFilter eventFilterType(EventFilterTypeEnum eventFilterType) {
    this.eventFilterType = eventFilterType;
    return this;
  }

   /**
   * An &#x60;eventFilterType&#x60; value that is supported by the specific &#x60;notificationType&#x60;. This is used by the subscription service to determine the type of event filter. Refer to [Notification Type Values](https://developer-docs.amazon.com/sp-api/docs/notification-type-values) to determine if an &#x60;eventFilterType&#x60; is supported.
   * @return eventFilterType
  **/
  @ApiModelProperty(required = true, value = "An `eventFilterType` value that is supported by the specific `notificationType`. This is used by the subscription service to determine the type of event filter. Refer to [Notification Type Values](https://developer-docs.amazon.com/sp-api/docs/notification-type-values) to determine if an `eventFilterType` is supported.")
  public EventFilterTypeEnum getEventFilterType() {
    return eventFilterType;
  }

  public void setEventFilterType(EventFilterTypeEnum eventFilterType) {
    this.eventFilterType = eventFilterType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventFilter eventFilter = (EventFilter) o;
    return Objects.equals(this.marketplaceIds, eventFilter.marketplaceIds) &&
        Objects.equals(this.orderChangeTypes, eventFilter.orderChangeTypes) &&
        Objects.equals(this.eventFilterType, eventFilter.eventFilterType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceIds, orderChangeTypes, eventFilterType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    marketplaceIds: ").append(toIndentedString(marketplaceIds)).append("\n");
    sb.append("    orderChangeTypes: ").append(toIndentedString(orderChangeTypes)).append("\n");
    sb.append("    eventFilterType: ").append(toIndentedString(eventFilterType)).append("\n");
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
