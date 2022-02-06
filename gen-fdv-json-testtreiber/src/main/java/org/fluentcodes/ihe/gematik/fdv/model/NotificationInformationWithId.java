package org.fluentcodes.ihe.gematik.fdv.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NotificationInformationWithId  {
  
  @ApiModelProperty(required = true, value = "Versicherten-ID (unveränderliche Teil der KVNR)")
 /**
   * Versicherten-ID (unveränderliche Teil der KVNR)
  **/
  private String insurantId;

  @ApiModelProperty(required = true, value = "Benachrichtigungsadresse (E-Mail) für die Geräteautorisierung")
 /**
   * Benachrichtigungsadresse (E-Mail) für die Geräteautorisierung
  **/
  private String notificationInformation;
 /**
   * Versicherten-ID (unveränderliche Teil der KVNR)
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
   * Benachrichtigungsadresse (E-Mail) für die Geräteautorisierung
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

