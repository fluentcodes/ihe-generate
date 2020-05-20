package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.Login;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionLeiProp;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PermissionHcpoDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "Telematik-ID der Leistungserbringerinstitution (LEI)")
 /**
   * Telematik-ID der Leistungserbringerinstitution (LEI)
  **/
  private String hcpoTelematikId;

  @ApiModelProperty(required = true, value = "Name der LEI")
 /**
   * Name der LEI
  **/
  private String hcpoName;

  @ApiModelProperty(required = true, value = "aus dem Verzeichnisdienst ermittelte Zertifikat der LEI (Format DER, Base64 kodiert)")
 /**
   * aus dem Verzeichnisdienst ermittelte Zertifikat der LEI (Format DER, Base64 kodiert)
  **/
  private byte[] certificate;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PermissionLeiProp permissionLeiProperties;
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
  @NotNull
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
   * Name der LEI
   * @return hcpoName
  **/
  @JsonProperty("hcpoName")
  @NotNull
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
   * aus dem Verzeichnisdienst ermittelte Zertifikat der LEI (Format DER, Base64 kodiert)
   * @return certificate
  **/
  @JsonProperty("certificate")
  @NotNull
  public byte[] getCertificate() {
    return certificate;
  }

  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }

  public PermissionHcpoDTO certificate(byte[] certificate) {
    this.certificate = certificate;
    return this;
  }

 /**
   * Get permissionLeiProperties
   * @return permissionLeiProperties
  **/
  @JsonProperty("permissionLeiProperties")
  @NotNull
  public PermissionLeiProp getPermissionLeiProperties() {
    return permissionLeiProperties;
  }

  public void setPermissionLeiProperties(PermissionLeiProp permissionLeiProperties) {
    this.permissionLeiProperties = permissionLeiProperties;
  }

  public PermissionHcpoDTO permissionLeiProperties(PermissionLeiProp permissionLeiProperties) {
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
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    permissionLeiProperties: ").append(toIndentedString(permissionLeiProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

