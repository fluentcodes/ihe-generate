package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.Login;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PermissionsRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(value = "")
  private String documentEntryUUID;
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

  public PermissionsRequestDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Get documentEntryUUID
   * @return documentEntryUUID
  **/
  @JsonProperty("documentEntryUUID")
  public String getDocumentEntryUUID() {
    return documentEntryUUID;
  }

  public void setDocumentEntryUUID(String documentEntryUUID) {
    this.documentEntryUUID = documentEntryUUID;
  }

  public PermissionsRequestDTO documentEntryUUID(String documentEntryUUID) {
    this.documentEntryUUID = documentEntryUUID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    documentEntryUUID: ").append(toIndentedString(documentEntryUUID)).append("\n");
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

