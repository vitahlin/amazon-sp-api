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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ListOffersResponseOffer;
import io.swagger.client.model.PaginationResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The response schema for the &#x60;listOffers&#x60; operation.
 */
@ApiModel(description = "The response schema for the `listOffers` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:11:29.095+08:00")
public class ListOffersResponse {
  @SerializedName("offers")
  private List<ListOffersResponseOffer> offers = null;

  @SerializedName("pagination")
  private PaginationResponse pagination = null;

  public ListOffersResponse offers(List<ListOffersResponseOffer> offers) {
    this.offers = offers;
    return this;
  }

  public ListOffersResponse addOffersItem(ListOffersResponseOffer offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<ListOffersResponseOffer>();
    }
    this.offers.add(offersItem);
    return this;
  }

   /**
   * A list of offers.
   * @return offers
  **/
  @ApiModelProperty(value = "A list of offers.")
  public List<ListOffersResponseOffer> getOffers() {
    return offers;
  }

  public void setOffers(List<ListOffersResponseOffer> offers) {
    this.offers = offers;
  }

  public ListOffersResponse pagination(PaginationResponse pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Use these parameters to paginate through the response.
   * @return pagination
  **/
  @ApiModelProperty(value = "Use these parameters to paginate through the response.")
  public PaginationResponse getPagination() {
    return pagination;
  }

  public void setPagination(PaginationResponse pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOffersResponse listOffersResponse = (ListOffersResponse) o;
    return Objects.equals(this.offers, listOffersResponse.offers) &&
        Objects.equals(this.pagination, listOffersResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOffersResponse {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

