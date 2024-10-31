/*
 * Selling Partner API for Orders
 * Use the Orders Selling Partner API to programmatically retrieve order information. With this API, you can develop fast, flexible, and custom applications to manage order synchronization, perform order research, and create demand-based decision support tools.   _Note:_ For the JP, AU, and SG marketplaces, the Orders API supports orders from 2016 onward. For all other marketplaces, the Orders API supports orders for the last two years (orders older than this don't show up in the response).
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RejectionReason;
import io.swagger.client.model.ValidVerificationDetail;
import io.swagger.client.model.VerificationStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The verification status of the order, along with associated approval or rejection metadata.
 */
@ApiModel(description = "The verification status of the order, along with associated approval or rejection metadata.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:07:17.661+08:00")
public class RegulatedOrderVerificationStatus {
  @SerializedName("Status")
  private VerificationStatus status = null;

  @SerializedName("RequiresMerchantAction")
  private Boolean requiresMerchantAction = null;

  @SerializedName("ValidRejectionReasons")
  private List<RejectionReason> validRejectionReasons = new ArrayList<RejectionReason>();

  @SerializedName("RejectionReason")
  private RejectionReason rejectionReason = null;

  @SerializedName("ReviewDate")
  private String reviewDate = null;

  @SerializedName("ExternalReviewerId")
  private String externalReviewerId = null;

  @SerializedName("ValidVerificationDetails")
  private List<ValidVerificationDetail> validVerificationDetails = null;

  public RegulatedOrderVerificationStatus status(VerificationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * The verification status of the order.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The verification status of the order.")
  public VerificationStatus getStatus() {
    return status;
  }

  public void setStatus(VerificationStatus status) {
    this.status = status;
  }

  public RegulatedOrderVerificationStatus requiresMerchantAction(Boolean requiresMerchantAction) {
    this.requiresMerchantAction = requiresMerchantAction;
    return this;
  }

   /**
   * When true, the regulated information provided in the order requires a review by the merchant.
   * @return requiresMerchantAction
  **/
  @ApiModelProperty(required = true, value = "When true, the regulated information provided in the order requires a review by the merchant.")
  public Boolean isRequiresMerchantAction() {
    return requiresMerchantAction;
  }

  public void setRequiresMerchantAction(Boolean requiresMerchantAction) {
    this.requiresMerchantAction = requiresMerchantAction;
  }

  public RegulatedOrderVerificationStatus validRejectionReasons(List<RejectionReason> validRejectionReasons) {
    this.validRejectionReasons = validRejectionReasons;
    return this;
  }

  public RegulatedOrderVerificationStatus addValidRejectionReasonsItem(RejectionReason validRejectionReasonsItem) {
    this.validRejectionReasons.add(validRejectionReasonsItem);
    return this;
  }

   /**
   * A list of valid rejection reasons that may be used to reject the order&#39;s regulated information.
   * @return validRejectionReasons
  **/
  @ApiModelProperty(required = true, value = "A list of valid rejection reasons that may be used to reject the order's regulated information.")
  public List<RejectionReason> getValidRejectionReasons() {
    return validRejectionReasons;
  }

  public void setValidRejectionReasons(List<RejectionReason> validRejectionReasons) {
    this.validRejectionReasons = validRejectionReasons;
  }

  public RegulatedOrderVerificationStatus rejectionReason(RejectionReason rejectionReason) {
    this.rejectionReason = rejectionReason;
    return this;
  }

   /**
   * The reason for rejecting the order&#39;s regulated information. Not present if the order isn&#39;t rejected.
   * @return rejectionReason
  **/
  @ApiModelProperty(value = "The reason for rejecting the order's regulated information. Not present if the order isn't rejected.")
  public RejectionReason getRejectionReason() {
    return rejectionReason;
  }

  public void setRejectionReason(RejectionReason rejectionReason) {
    this.rejectionReason = rejectionReason;
  }

  public RegulatedOrderVerificationStatus reviewDate(String reviewDate) {
    this.reviewDate = reviewDate;
    return this;
  }

   /**
   * The date the order was reviewed. In [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date time format.
   * @return reviewDate
  **/
  @ApiModelProperty(value = "The date the order was reviewed. In [ISO 8601](https://developer-docs.amazon.com/sp-api/docs/iso-8601) date time format.")
  public String getReviewDate() {
    return reviewDate;
  }

  public void setReviewDate(String reviewDate) {
    this.reviewDate = reviewDate;
  }

  public RegulatedOrderVerificationStatus externalReviewerId(String externalReviewerId) {
    this.externalReviewerId = externalReviewerId;
    return this;
  }

   /**
   * The identifier for the order&#39;s regulated information reviewer.
   * @return externalReviewerId
  **/
  @ApiModelProperty(value = "The identifier for the order's regulated information reviewer.")
  public String getExternalReviewerId() {
    return externalReviewerId;
  }

  public void setExternalReviewerId(String externalReviewerId) {
    this.externalReviewerId = externalReviewerId;
  }

  public RegulatedOrderVerificationStatus validVerificationDetails(List<ValidVerificationDetail> validVerificationDetails) {
    this.validVerificationDetails = validVerificationDetails;
    return this;
  }

  public RegulatedOrderVerificationStatus addValidVerificationDetailsItem(ValidVerificationDetail validVerificationDetailsItem) {
    if (this.validVerificationDetails == null) {
      this.validVerificationDetails = new ArrayList<ValidVerificationDetail>();
    }
    this.validVerificationDetails.add(validVerificationDetailsItem);
    return this;
  }

   /**
   * A list of valid verification details that may be provided and the criteria required for when the verification detail can be provided.
   * @return validVerificationDetails
  **/
  @ApiModelProperty(value = "A list of valid verification details that may be provided and the criteria required for when the verification detail can be provided.")
  public List<ValidVerificationDetail> getValidVerificationDetails() {
    return validVerificationDetails;
  }

  public void setValidVerificationDetails(List<ValidVerificationDetail> validVerificationDetails) {
    this.validVerificationDetails = validVerificationDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulatedOrderVerificationStatus regulatedOrderVerificationStatus = (RegulatedOrderVerificationStatus) o;
    return Objects.equals(this.status, regulatedOrderVerificationStatus.status) &&
        Objects.equals(this.requiresMerchantAction, regulatedOrderVerificationStatus.requiresMerchantAction) &&
        Objects.equals(this.validRejectionReasons, regulatedOrderVerificationStatus.validRejectionReasons) &&
        Objects.equals(this.rejectionReason, regulatedOrderVerificationStatus.rejectionReason) &&
        Objects.equals(this.reviewDate, regulatedOrderVerificationStatus.reviewDate) &&
        Objects.equals(this.externalReviewerId, regulatedOrderVerificationStatus.externalReviewerId) &&
        Objects.equals(this.validVerificationDetails, regulatedOrderVerificationStatus.validVerificationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, requiresMerchantAction, validRejectionReasons, rejectionReason, reviewDate, externalReviewerId, validVerificationDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatedOrderVerificationStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requiresMerchantAction: ").append(toIndentedString(requiresMerchantAction)).append("\n");
    sb.append("    validRejectionReasons: ").append(toIndentedString(validRejectionReasons)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
    sb.append("    reviewDate: ").append(toIndentedString(reviewDate)).append("\n");
    sb.append("    externalReviewerId: ").append(toIndentedString(externalReviewerId)).append("\n");
    sb.append("    validVerificationDetails: ").append(toIndentedString(validVerificationDetails)).append("\n");
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
