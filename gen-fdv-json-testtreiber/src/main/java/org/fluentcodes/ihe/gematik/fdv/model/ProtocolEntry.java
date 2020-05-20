package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
import java.time.Instant;
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

/**
  * Protokolleintrag gemaess A_14471
 **/
@ApiModel(description="Protokolleintrag gemaess A_14471")
public class ProtocolEntry  {
  
  @ApiModelProperty(required = true, value = "Aufgerufene Operation gemass A_14505")
 /**
   * Aufgerufene Operation gemass A_14505
  **/
  private String eventId;

  @ApiModelProperty(required = true, value = "Anzeigename der aufgerufenen Operation")
 /**
   * Anzeigename der aufgerufenen Operation
  **/
  private String eventDisplayName;

  @ApiModelProperty(required = true, value = "Datum und Uhrzeit des Zugriffs; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z")
 /**
   * Datum und Uhrzeit des Zugriffs; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
  **/
  private Instant eventDateTime;

  @ApiModelProperty(required = true, value = "Ergebnis der aufgerufenen Operation")
 /**
   * Ergebnis der aufgerufenen Operation
  **/
  private String eventResult;

  @ApiModelProperty(required = true, value = "")
  private String userId;

  @ApiModelProperty(required = true, value = "")
  private String userName;

  @ApiModelProperty(value = "")
  private String objectId;

  @ApiModelProperty(value = "")
  private String objectName;

  @ApiModelProperty(value = "Device-ID bei Zugriff durch Versicherte")
 /**
   * Device-ID bei Zugriff durch Versicherte
  **/
  private String deviceId;

  @ApiModelProperty(required = true, value = "Home-Community-ID des ePA-Aktensystems")
 /**
   * Home-Community-ID des ePA-Aktensystems
  **/
  private String providerId;

  @ApiModelProperty(required = true, value = "Name des Anbieters ePA-Aktensystem")
 /**
   * Name des Anbieters ePA-Aktensystem
  **/
  private String providerName;
 /**
   * Aufgerufene Operation gemass A_14505
   * @return eventId
  **/
  @JsonProperty("eventId")
  @NotNull
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ProtocolEntry eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * Anzeigename der aufgerufenen Operation
   * @return eventDisplayName
  **/
  @JsonProperty("eventDisplayName")
  @NotNull
  public String getEventDisplayName() {
    return eventDisplayName;
  }

  public void setEventDisplayName(String eventDisplayName) {
    this.eventDisplayName = eventDisplayName;
  }

  public ProtocolEntry eventDisplayName(String eventDisplayName) {
    this.eventDisplayName = eventDisplayName;
    return this;
  }

 /**
   * Datum und Uhrzeit des Zugriffs; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
   * @return eventDateTime
  **/
  @JsonProperty("eventDateTime")
  @NotNull
  public Instant getEventDateTime() {
    return eventDateTime;
  }

  public void setEventDateTime(Instant eventDateTime) {
    this.eventDateTime = eventDateTime;
  }

  public ProtocolEntry eventDateTime(Instant eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }

 /**
   * Ergebnis der aufgerufenen Operation
   * @return eventResult
  **/
  @JsonProperty("eventResult")
  @NotNull
  public String getEventResult() {
    return eventResult;
  }

  public void setEventResult(String eventResult) {
    this.eventResult = eventResult;
  }

  public ProtocolEntry eventResult(String eventResult) {
    this.eventResult = eventResult;
    return this;
  }

 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("userId")
  @NotNull
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ProtocolEntry userId(String userId) {
    this.userId = userId;
    return this;
  }

 /**
   * Get userName
   * @return userName
  **/
  @JsonProperty("userName")
  @NotNull
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ProtocolEntry userName(String userName) {
    this.userName = userName;
    return this;
  }

 /**
   * Get objectId
   * @return objectId
  **/
  @JsonProperty("objectId")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public ProtocolEntry objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

 /**
   * Get objectName
   * @return objectName
  **/
  @JsonProperty("objectName")
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public ProtocolEntry objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

 /**
   * Device-ID bei Zugriff durch Versicherte
   * @return deviceId
  **/
  @JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public ProtocolEntry deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

 /**
   * Home-Community-ID des ePA-Aktensystems
   * @return providerId
  **/
  @JsonProperty("providerId")
  @NotNull
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public ProtocolEntry providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

 /**
   * Name des Anbieters ePA-Aktensystem
   * @return providerName
  **/
  @JsonProperty("providerName")
  @NotNull
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public ProtocolEntry providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtocolEntry {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventDisplayName: ").append(toIndentedString(eventDisplayName)).append("\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    eventResult: ").append(toIndentedString(eventResult)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
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

