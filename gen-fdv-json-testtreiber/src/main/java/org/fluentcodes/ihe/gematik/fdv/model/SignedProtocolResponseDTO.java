package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.Document;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SignedProtocolResponseDTO  {
  
  @ApiModelProperty(required = true, value = "")
  private Boolean success;

  @ApiModelProperty(value = "")
  private String statusMessage;

  @ApiModelProperty(value = "")
  @Valid
  private Document document;
 /**
   * Get success
   * @return success
  **/
  @JsonProperty("success")
  @NotNull
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public SignedProtocolResponseDTO success(Boolean success) {
    this.success = success;
    return this;
  }

 /**
   * Get statusMessage
   * @return statusMessage
  **/
  @JsonProperty("statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public SignedProtocolResponseDTO statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

 /**
   * Get document
   * @return document
  **/
  @JsonProperty("document")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public SignedProtocolResponseDTO document(Document document) {
    this.document = document;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignedProtocolResponseDTO {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

