package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.DocumentWithMetadata;
import org.fluentcodes.ihe.gematik.fdv.model.Login;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplaceDocumentRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "EntryUUID eines zu ersetzenden Dokumentes")
 /**
   * EntryUUID eines zu ersetzenden Dokumentes
  **/
  private String documentEntryUUID;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private DocumentWithMetadata documentWithMetadata;
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

  public ReplaceDocumentRequestDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * EntryUUID eines zu ersetzenden Dokumentes
   * @return documentEntryUUID
  **/
  @JsonProperty("documentEntryUUID")
  @NotNull
  public String getDocumentEntryUUID() {
    return documentEntryUUID;
  }

  public void setDocumentEntryUUID(String documentEntryUUID) {
    this.documentEntryUUID = documentEntryUUID;
  }

  public ReplaceDocumentRequestDTO documentEntryUUID(String documentEntryUUID) {
    this.documentEntryUUID = documentEntryUUID;
    return this;
  }

 /**
   * Get documentWithMetadata
   * @return documentWithMetadata
  **/
  @JsonProperty("documentWithMetadata")
  @NotNull
  public DocumentWithMetadata getDocumentWithMetadata() {
    return documentWithMetadata;
  }

  public void setDocumentWithMetadata(DocumentWithMetadata documentWithMetadata) {
    this.documentWithMetadata = documentWithMetadata;
  }

  public ReplaceDocumentRequestDTO documentWithMetadata(DocumentWithMetadata documentWithMetadata) {
    this.documentWithMetadata = documentWithMetadata;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceDocumentRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    documentEntryUUID: ").append(toIndentedString(documentEntryUUID)).append("\n");
    sb.append("    documentWithMetadata: ").append(toIndentedString(documentWithMetadata)).append("\n");
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

