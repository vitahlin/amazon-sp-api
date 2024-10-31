/*
 * Selling Partner API for Sellers
 * The [Selling Partner API for Sellers](https://developer-docs.amazon.com/sp-api/docs/sellers-api-v1-reference) (Sellers API) provides essential information about seller accounts, such as:  - The marketplaces a seller can list in - The default language and currency of a marketplace - Whether the seller has suspended listings  Refer to the [Sellers API reference](https://developer-docs.amazon.com/sp-api/docs/sellers-api-v1-reference) for details about this API's operations, data types, and schemas.
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
import io.swagger.client.model.Business;
import io.swagger.client.model.MarketplaceLevelAttributes;
import io.swagger.client.model.PrimaryContact;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The response schema for the &#x60;getAccount&#x60; operation.
 */
@ApiModel(description = "The response schema for the `getAccount` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:15:42.502+08:00")
public class Account {
  @SerializedName("marketplaceLevelAttributes")
  private List<MarketplaceLevelAttributes> marketplaceLevelAttributes = new ArrayList<MarketplaceLevelAttributes>();

  /**
   * The type of business registered for the seller account.
   */
  @JsonAdapter(BusinessTypeEnum.Adapter.class)
  public enum BusinessTypeEnum {
    CHARITY("CHARITY"),
    
    CRAFTSMAN("CRAFTSMAN"),
    
    NATURAL_PERSON_COMPANY("NATURAL_PERSON_COMPANY"),
    
    PUBLIC_LISTED("PUBLIC_LISTED"),
    
    PRIVATE_LIMITED("PRIVATE_LIMITED"),
    
    SOLE_PROPRIETORSHIP("SOLE_PROPRIETORSHIP"),
    
    STATE_OWNED("STATE_OWNED"),
    
    INDIVIDUAL("INDIVIDUAL");

    private String value;

    BusinessTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BusinessTypeEnum fromValue(String text) {
      for (BusinessTypeEnum b : BusinessTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BusinessTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BusinessTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BusinessTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BusinessTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("businessType")
  private BusinessTypeEnum businessType = null;

  @SerializedName("business")
  private Business business = null;

  @SerializedName("primaryContact")
  private PrimaryContact primaryContact = null;

  public Account marketplaceLevelAttributes(List<MarketplaceLevelAttributes> marketplaceLevelAttributes) {
    this.marketplaceLevelAttributes = marketplaceLevelAttributes;
    return this;
  }

  public Account addMarketplaceLevelAttributesItem(MarketplaceLevelAttributes marketplaceLevelAttributesItem) {
    this.marketplaceLevelAttributes.add(marketplaceLevelAttributesItem);
    return this;
  }

   /**
   * A list of details of the marketplaces where the seller account is active.
   * @return marketplaceLevelAttributes
  **/
  @ApiModelProperty(required = true, value = "A list of details of the marketplaces where the seller account is active.")
  public List<MarketplaceLevelAttributes> getMarketplaceLevelAttributes() {
    return marketplaceLevelAttributes;
  }

  public void setMarketplaceLevelAttributes(List<MarketplaceLevelAttributes> marketplaceLevelAttributes) {
    this.marketplaceLevelAttributes = marketplaceLevelAttributes;
  }

  public Account businessType(BusinessTypeEnum businessType) {
    this.businessType = businessType;
    return this;
  }

   /**
   * The type of business registered for the seller account.
   * @return businessType
  **/
  @ApiModelProperty(required = true, value = "The type of business registered for the seller account.")
  public BusinessTypeEnum getBusinessType() {
    return businessType;
  }

  public void setBusinessType(BusinessTypeEnum businessType) {
    this.businessType = businessType;
  }

  public Account business(Business business) {
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  @ApiModelProperty(value = "")
  public Business getBusiness() {
    return business;
  }

  public void setBusiness(Business business) {
    this.business = business;
  }

  public Account primaryContact(PrimaryContact primaryContact) {
    this.primaryContact = primaryContact;
    return this;
  }

   /**
   * Get primaryContact
   * @return primaryContact
  **/
  @ApiModelProperty(value = "")
  public PrimaryContact getPrimaryContact() {
    return primaryContact;
  }

  public void setPrimaryContact(PrimaryContact primaryContact) {
    this.primaryContact = primaryContact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.marketplaceLevelAttributes, account.marketplaceLevelAttributes) &&
        Objects.equals(this.businessType, account.businessType) &&
        Objects.equals(this.business, account.business) &&
        Objects.equals(this.primaryContact, account.primaryContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceLevelAttributes, businessType, business, primaryContact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    marketplaceLevelAttributes: ").append(toIndentedString(marketplaceLevelAttributes)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    primaryContact: ").append(toIndentedString(primaryContact)).append("\n");
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

