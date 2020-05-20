package org.fluentcodes.ihe.gematik.fdv.model;

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

public class NotificationInformationWithId  {
  
  @ApiModelProperty(required = true, value = "Versicherten-ID (unveraenderliche Teil der KVNR)")
 /**
   * Versicherten-ID (unveraenderliche Teil der KVNR)
  **/
  private String insurantId;

  @ApiModelProperty(required = true, value = "Benachrichtigungsadresse (E-Mail) fuer die Geraeteautorisierung")
 /**
   * Benachrichtigungsadresse (E-Mail) fuer die Geraeteautorisierung
  **/
  private String notificationInformation;
 /**
   * Versicherten-ID (unveraenderliche Teil der KVNR)
   * @return insurantId
  **/
  @JsonProperty("insurantId")
  @NotNull
 @Size(min=10,max=10)  public String getInsurantId() {
    return insurantId;
  }

  public void setInsurantId(String insurantId) {
    this.insurantId = insurantId;
  }

  public NotificationInformationWithId insurantId(String insurantId) {
    this.insurantId = insurantId;
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

  public NotificationInformationWithId notificationInformation(String notificationInformation) {
    this.notificationInformation = notificationInformation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationInformationWithId {\n");
    
    sb.append("    insurantId: ").append(toIndentedString(insurantId)).append("\n");
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

