/*
 * The Selling Partner API for Invoices.
 * Use the Selling Partner API for Invoices to retrieve and manage invoice-related operations, which can help selling partners manage their bookkeeping processes.
 *
 * OpenAPI spec version: 2024-06-19
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
 * An object that contains the &#x60;documentId&#x60; and an S3 pre-signed URL that you can use to download the specified file.
 */
@ApiModel(description = "An object that contains the `documentId` and an S3 pre-signed URL that you can use to download the specified file.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-31T20:01:45.889+08:00")
public class InvoicesDocument {
  @SerializedName("invoicesDocumentId")
  private String invoicesDocumentId = null;

  @SerializedName("invoicesDocumentUrl")
  private String invoicesDocumentUrl = null;

  public InvoicesDocument invoicesDocumentId(String invoicesDocumentId) {
    this.invoicesDocumentId = invoicesDocumentId;
    return this;
  }

   /**
   * The identifier of the export document.
   * @return invoicesDocumentId
  **/
  @ApiModelProperty(value = "The identifier of the export document.")
  public String getInvoicesDocumentId() {
    return invoicesDocumentId;
  }

  public void setInvoicesDocumentId(String invoicesDocumentId) {
    this.invoicesDocumentId = invoicesDocumentId;
  }

  public InvoicesDocument invoicesDocumentUrl(String invoicesDocumentUrl) {
    this.invoicesDocumentUrl = invoicesDocumentUrl;
    return this;
  }

   /**
   * A pre-signed URL that you can use to download the invoices document in zip format. This URL expires after 30 seconds.
   * @return invoicesDocumentUrl
  **/
  @ApiModelProperty(value = "A pre-signed URL that you can use to download the invoices document in zip format. This URL expires after 30 seconds.")
  public String getInvoicesDocumentUrl() {
    return invoicesDocumentUrl;
  }

  public void setInvoicesDocumentUrl(String invoicesDocumentUrl) {
    this.invoicesDocumentUrl = invoicesDocumentUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicesDocument invoicesDocument = (InvoicesDocument) o;
    return Objects.equals(this.invoicesDocumentId, invoicesDocument.invoicesDocumentId) &&
        Objects.equals(this.invoicesDocumentUrl, invoicesDocument.invoicesDocumentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoicesDocumentId, invoicesDocumentUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicesDocument {\n");
    
    sb.append("    invoicesDocumentId: ").append(toIndentedString(invoicesDocumentId)).append("\n");
    sb.append("    invoicesDocumentUrl: ").append(toIndentedString(invoicesDocumentUrl)).append("\n");
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

