package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.Login;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionProp;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PermissionHcpoDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(value = "Telematik-ID der Leistungserbringerinstitution (LEI)")
 /**
   * Telematik-ID der Leistungserbringerinstitution (LEI)
  **/
  private String hcpoTelematikId;

  @ApiModelProperty(value = "Name der LEI (Common Name aus dem VZD)")
 /**
   * Name der LEI (Common Name aus dem VZD)
  **/
  private String hcpoName;

  @ApiModelProperty(value = "")
  @Valid
  private PermissionProp permissionLeiProperties;
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

  public PermissionHcpoDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Telematik-ID der Leistungserbringerinstitution (LEI)
   * @return hcpoTelematikId
  **/
  @JsonProperty("hcpoTelematikId")
  public String getHcpoTelematikId() {
    return hcpoTelematikId;
  }

  public void setHcpoTelematikId(String hcpoTelematikId) {
    this.hcpoTelematikId = hcpoTelematikId;
  }

  public PermissionHcpoDTO hcpoTelematikId(String hcpoTelematikId) {
    this.hcpoTelematikId = hcpoTelematikId;
    return this;
  }

 /**
   * Name der LEI (Common Name aus dem VZD)
   * @return hcpoName
  **/
  @JsonProperty("hcpoName")
  public String getHcpoName() {
    return hcpoName;
  }

  public void setHcpoName(String hcpoName) {
    this.hcpoName = hcpoName;
  }

  public PermissionHcpoDTO hcpoName(String hcpoName) {
    this.hcpoName = hcpoName;
    return this;
  }

 /**
   * Get permissionLeiProperties
   * @return permissionLeiProperties
  **/
  @JsonProperty("permissionLeiProperties")
  public PermissionProp getPermissionLeiProperties() {
    return permissionLeiProperties;
  }

  public void setPermissionLeiProperties(PermissionProp permissionLeiProperties) {
    this.permissionLeiProperties = permissionLeiProperties;
  }

  public PermissionHcpoDTO permissionLeiProperties(PermissionProp permissionLeiProperties) {
    this.permissionLeiProperties = permissionLeiProperties;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionHcpoDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    hcpoTelematikId: ").append(toIndentedString(hcpoTelematikId)).append("\n");
    sb.append("    hcpoName: ").append(toIndentedString(hcpoName)).append("\n");
    sb.append("    permissionLeiProperties: ").append(toIndentedString(permissionLeiProperties)).append("\n");
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

