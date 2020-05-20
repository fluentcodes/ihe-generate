package org.fluentcodes.ihe.gematik.fdv.model;

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

public class PermissionEntry  {
  
  @ApiModelProperty(required = true, value = "Telematik-ID bzw. Versicherten-ID des Berechtigten")
 /**
   * Telematik-ID bzw. Versicherten-ID des Berechtigten
  **/
  private String telematikOrInsurantId;

  @ApiModelProperty(required = true, value = "Name des Berechtigten")
 /**
   * Name des Berechtigten
  **/
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private PermissionLeiProp permissionLeiProperties;
 /**
   * Telematik-ID bzw. Versicherten-ID des Berechtigten
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

  public PermissionEntry telematikOrInsurantId(String telematikOrInsurantId) {
    this.telematikOrInsurantId = telematikOrInsurantId;
    return this;
  }

 /**
   * Name des Berechtigten
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PermissionEntry name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get permissionLeiProperties
   * @return permissionLeiProperties
  **/
  @JsonProperty("permissionLeiProperties")
  public PermissionLeiProp getPermissionLeiProperties() {
    return permissionLeiProperties;
  }

  public void setPermissionLeiProperties(PermissionLeiProp permissionLeiProperties) {
    this.permissionLeiProperties = permissionLeiProperties;
  }

  public PermissionEntry permissionLeiProperties(PermissionLeiProp permissionLeiProperties) {
    this.permissionLeiProperties = permissionLeiProperties;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionEntry {\n");
    
    sb.append("    telematikOrInsurantId: ").append(toIndentedString(telematikOrInsurantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

