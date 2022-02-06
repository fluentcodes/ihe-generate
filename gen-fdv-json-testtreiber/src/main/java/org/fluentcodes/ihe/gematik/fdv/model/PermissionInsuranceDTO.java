package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.Login;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PermissionInsuranceDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "Telematik-ID des Kostenträgers (KTR)")
 /**
   * Telematik-ID des Kostenträgers (KTR)
  **/
  private String insuranceTelematikId;

  @ApiModelProperty(required = true, value = "Name des KTR")
 /**
   * Name des KTR
  **/
  private String insuranceName;
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

  public PermissionInsuranceDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Telematik-ID des Kostenträgers (KTR)
   * @return insuranceTelematikId
  **/
  @JsonProperty("insuranceTelematikId")
  @NotNull
  public String getInsuranceTelematikId() {
    return insuranceTelematikId;
  }

  public void setInsuranceTelematikId(String insuranceTelematikId) {
    this.insuranceTelematikId = insuranceTelematikId;
  }

  public PermissionInsuranceDTO insuranceTelematikId(String insuranceTelematikId) {
    this.insuranceTelematikId = insuranceTelematikId;
    return this;
  }

 /**
   * Name des KTR
   * @return insuranceName
  **/
  @JsonProperty("insuranceName")
  @NotNull
  public String getInsuranceName() {
    return insuranceName;
  }

  public void setInsuranceName(String insuranceName) {
    this.insuranceName = insuranceName;
  }

  public PermissionInsuranceDTO insuranceName(String insuranceName) {
    this.insuranceName = insuranceName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionInsuranceDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    insuranceTelematikId: ").append(toIndentedString(insuranceTelematikId)).append("\n");
    sb.append("    insuranceName: ").append(toIndentedString(insuranceName)).append("\n");
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

