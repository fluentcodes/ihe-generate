package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.Login;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeletePermissionDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "Versicherten-ID für Vertreter oder Telematik-ID für LEI bzw. KTR")
 /**
   * Versicherten-ID für Vertreter oder Telematik-ID für LEI bzw. KTR
  **/
  private String telematikOrInsurantId;
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

  public DeletePermissionDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Versicherten-ID für Vertreter oder Telematik-ID für LEI bzw. KTR
   * @return telematikOrInsurantId
  **/
  @JsonProperty("telematikOrInsurantId")
  @NotNull
  public String getTelematikOrInsurantId() {
    return telematikOrInsurantId;
  }

  public void setTelematikOrInsurantId(String telematikOrInsurantId) {
    this.telematikOrInsurantId = telematikOrInsurantId;
  }

  public DeletePermissionDTO telematikOrInsurantId(String telematikOrInsurantId) {
    this.telematikOrInsurantId = telematikOrInsurantId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePermissionDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    telematikOrInsurantId: ").append(toIndentedString(telematikOrInsurantId)).append("\n");
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

