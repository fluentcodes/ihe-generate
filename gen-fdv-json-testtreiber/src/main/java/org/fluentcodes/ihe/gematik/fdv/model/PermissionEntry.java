package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.PermissionProp;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
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
  private PermissionProp permissionLeiProperties;
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
  public PermissionProp getPermissionLeiProperties() {
    return permissionLeiProperties;
  }

  public void setPermissionLeiProperties(PermissionProp permissionLeiProperties) {
    this.permissionLeiProperties = permissionLeiProperties;
  }

  public PermissionEntry permissionLeiProperties(PermissionProp permissionLeiProperties) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

