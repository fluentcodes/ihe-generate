package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.DocumentMetadata;
import org.fluentcodes.ihe.gematik.fdv.model.Login;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateMetadataRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(value = "")
  @Valid
  private DocumentMetadata documentMetadata;

  @ApiModelProperty(required = true, value = "Neue ConfidentialityCode eines Dokumentes oder Folder. Ersetzt die alten Codes.")
 /**
   * Neue ConfidentialityCode eines Dokumentes oder Folder. Ersetzt die alten Codes.
  **/
  private String newConfidentialityCode;
 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  @NotNull
  public Login getAccount() {
    return account;
  }

  public void setAccount(Login account) {
    this.account = account;
  }

  public UpdateMetadataRequestDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Get documentMetadata
   * @return documentMetadata
  **/
  @JsonProperty("documentMetadata")
  public DocumentMetadata getDocumentMetadata() {
    return documentMetadata;
  }

  public void setDocumentMetadata(DocumentMetadata documentMetadata) {
    this.documentMetadata = documentMetadata;
  }

  public UpdateMetadataRequestDTO documentMetadata(DocumentMetadata documentMetadata) {
    this.documentMetadata = documentMetadata;
    return this;
  }

 /**
   * Neue ConfidentialityCode eines Dokumentes oder Folder. Ersetzt die alten Codes.
   * @return newConfidentialityCode
  **/
  @JsonProperty("newConfidentialityCode")
  @NotNull
  public String getNewConfidentialityCode() {
    return newConfidentialityCode;
  }

  public void setNewConfidentialityCode(String newConfidentialityCode) {
    this.newConfidentialityCode = newConfidentialityCode;
  }

  public UpdateMetadataRequestDTO newConfidentialityCode(String newConfidentialityCode) {
    this.newConfidentialityCode = newConfidentialityCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMetadataRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    documentMetadata: ").append(toIndentedString(documentMetadata)).append("\n");
    sb.append("    newConfidentialityCode: ").append(toIndentedString(newConfidentialityCode)).append("\n");
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

