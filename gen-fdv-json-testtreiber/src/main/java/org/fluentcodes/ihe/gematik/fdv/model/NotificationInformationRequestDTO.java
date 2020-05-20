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

public class NotificationInformationRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "Benachrichtigungsadresse (E-Mail) fuer die Geraeteautorisierung")
 /**
   * Benachrichtigungsadresse (E-Mail) fuer die Geraeteautorisierung
  **/
  private String notificationInformation;
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

  public NotificationInformationRequestDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Benachrichtigungsadresse (E-Mail) fuer die Geraeteautorisierung
   * @return notificationInformation
  **/
  @JsonProperty("notificationInformation")
  @NotNull
  public String getNotificationInformation() {
    return notificationInformation;
  }

  public void setNotificationInformation(String notificationInformation) {
    this.notificationInformation = notificationInformation;
  }

  public NotificationInformationRequestDTO notificationInformation(String notificationInformation) {
    this.notificationInformation = notificationInformation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationInformationRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    notificationInformation: ").append(toIndentedString(notificationInformation)).append("\n");
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

