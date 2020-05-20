package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.Login;
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

public class PermissionInsuranceDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "Telematik-ID des Kostentraegers (KTR)")
 /**
   * Telematik-ID des Kostentraegers (KTR)
  **/
  private String insuranceTelematikId;

  @ApiModelProperty(required = true, value = "Name des KTR")
 /**
   * Name des KTR
  **/
  private String insuranceName;

  @ApiModelProperty(required = true, value = "aus dem Verzeichnisdienst ermittelte Zertifikat des KTR (Format DER, Base64 kodiert)")
 /**
   * aus dem Verzeichnisdienst ermittelte Zertifikat des KTR (Format DER, Base64 kodiert)
  **/
  private byte[] certificate;
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
   * Telematik-ID des Kostentraegers (KTR)
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

 /**
   * aus dem Verzeichnisdienst ermittelte Zertifikat des KTR (Format DER, Base64 kodiert)
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

  public PermissionInsuranceDTO certificate(byte[] certificate) {
    this.certificate = certificate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionInsuranceDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    insuranceTelematikId: ").append(toIndentedString(insuranceTelematikId)).append("\n");
    sb.append("    insuranceName: ").append(toIndentedString(insuranceName)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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

