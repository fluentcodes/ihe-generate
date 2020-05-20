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

public class PermissionRepresentativeDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "Versicherten-ID des Vertreters (unveraenderliche Teil der KVNR)")
 /**
   * Versicherten-ID des Vertreters (unveraenderliche Teil der KVNR)
  **/
  private String representativeInsurantId;

  @ApiModelProperty(required = true, value = "Name des Vertreters")
 /**
   * Name des Vertreters
  **/
  private String representativeName;

  @ApiModelProperty(required = true, value = "Benachrichtigungsadresse (E-Mail) fuer die Geraeteautorisierung")
 /**
   * Benachrichtigungsadresse (E-Mail) fuer die Geraeteautorisierung
  **/
  private String representativeNotificationInfo;
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

  public PermissionRepresentativeDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Versicherten-ID des Vertreters (unveraenderliche Teil der KVNR)
   * @return representativeInsurantId
  **/
  @JsonProperty("representativeInsurantId")
  @NotNull
 @Size(min=10,max=10)  public String getRepresentativeInsurantId() {
    return representativeInsurantId;
  }

  public void setRepresentativeInsurantId(String representativeInsurantId) {
    this.representativeInsurantId = representativeInsurantId;
  }

  public PermissionRepresentativeDTO representativeInsurantId(String representativeInsurantId) {
    this.representativeInsurantId = representativeInsurantId;
    return this;
  }

 /**
   * Name des Vertreters
   * @return representativeName
  **/
  @JsonProperty("representativeName")
  @NotNull
  public String getRepresentativeName() {
    return representativeName;
  }

  public void setRepresentativeName(String representativeName) {
    this.representativeName = representativeName;
  }

  public PermissionRepresentativeDTO representativeName(String representativeName) {
    this.representativeName = representativeName;
    return this;
  }

 /**
   * Benachrichtigungsadresse (E-Mail) fuer die Geraeteautorisierung
   * @return representativeNotificationInfo
  **/
  @JsonProperty("representativeNotificationInfo")
  @NotNull
  public String getRepresentativeNotificationInfo() {
    return representativeNotificationInfo;
  }

  public void setRepresentativeNotificationInfo(String representativeNotificationInfo) {
    this.representativeNotificationInfo = representativeNotificationInfo;
  }

  public PermissionRepresentativeDTO representativeNotificationInfo(String representativeNotificationInfo) {
    this.representativeNotificationInfo = representativeNotificationInfo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionRepresentativeDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    representativeInsurantId: ").append(toIndentedString(representativeInsurantId)).append("\n");
    sb.append("    representativeName: ").append(toIndentedString(representativeName)).append("\n");
    sb.append("    representativeNotificationInfo: ").append(toIndentedString(representativeNotificationInfo)).append("\n");
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

