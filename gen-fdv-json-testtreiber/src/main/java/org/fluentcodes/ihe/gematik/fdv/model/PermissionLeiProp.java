package org.fluentcodes.ihe.gematik.fdv.model;

import java.time.LocalDate;
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

public class PermissionLeiProp  {
  
  @ApiModelProperty(value = "Option Zugriff auf durch LEI eingestellte Dokumente erlaubt")
 /**
   * Option Zugriff auf durch LEI eingestellte Dokumente erlaubt
  **/
  private Boolean permissionAccessHcpoDocuments;

  @ApiModelProperty(value = "Option Zugriff auf durch Kostentraeger eingestellte Dokumente erlaubt")
 /**
   * Option Zugriff auf durch Kostentraeger eingestellte Dokumente erlaubt
  **/
  private Boolean permissionAccessInsuranceDocuments;

  @ApiModelProperty(value = "Option Zugriff auf durch Versicherte eingestellte Dokumente erlaubt")
 /**
   * Option Zugriff auf durch Versicherte eingestellte Dokumente erlaubt
  **/
  private Boolean permissionAccessInsurantDocuments;

  @ApiModelProperty(value = "Zugriff gueltig bis; full-date notation as defined by RFC 3339, section 5.6, for example, 2017-07-21")
 /**
   * Zugriff gueltig bis; full-date notation as defined by RFC 3339, section 5.6, for example, 2017-07-21
  **/
  private LocalDate validity;
 /**
   * Option Zugriff auf durch LEI eingestellte Dokumente erlaubt
   * @return permissionAccessHcpoDocuments
  **/
  @JsonProperty("permissionAccessHcpoDocuments")
  public Boolean getPermissionAccessHcpoDocuments() {
    return permissionAccessHcpoDocuments;
  }

  public void setPermissionAccessHcpoDocuments(Boolean permissionAccessHcpoDocuments) {
    this.permissionAccessHcpoDocuments = permissionAccessHcpoDocuments;
  }

  public PermissionLeiProp permissionAccessHcpoDocuments(Boolean permissionAccessHcpoDocuments) {
    this.permissionAccessHcpoDocuments = permissionAccessHcpoDocuments;
    return this;
  }

 /**
   * Option Zugriff auf durch Kostentraeger eingestellte Dokumente erlaubt
   * @return permissionAccessInsuranceDocuments
  **/
  @JsonProperty("permissionAccessInsuranceDocuments")
  public Boolean getPermissionAccessInsuranceDocuments() {
    return permissionAccessInsuranceDocuments;
  }

  public void setPermissionAccessInsuranceDocuments(Boolean permissionAccessInsuranceDocuments) {
    this.permissionAccessInsuranceDocuments = permissionAccessInsuranceDocuments;
  }

  public PermissionLeiProp permissionAccessInsuranceDocuments(Boolean permissionAccessInsuranceDocuments) {
    this.permissionAccessInsuranceDocuments = permissionAccessInsuranceDocuments;
    return this;
  }

 /**
   * Option Zugriff auf durch Versicherte eingestellte Dokumente erlaubt
   * @return permissionAccessInsurantDocuments
  **/
  @JsonProperty("permissionAccessInsurantDocuments")
  public Boolean getPermissionAccessInsurantDocuments() {
    return permissionAccessInsurantDocuments;
  }

  public void setPermissionAccessInsurantDocuments(Boolean permissionAccessInsurantDocuments) {
    this.permissionAccessInsurantDocuments = permissionAccessInsurantDocuments;
  }

  public PermissionLeiProp permissionAccessInsurantDocuments(Boolean permissionAccessInsurantDocuments) {
    this.permissionAccessInsurantDocuments = permissionAccessInsurantDocuments;
    return this;
  }

 /**
   * Zugriff gueltig bis; full-date notation as defined by RFC 3339, section 5.6, for example, 2017-07-21
   * @return validity
  **/
  @JsonProperty("validity")
  public LocalDate getValidity() {
    return validity;
  }

  public void setValidity(LocalDate validity) {
    this.validity = validity;
  }

  public PermissionLeiProp validity(LocalDate validity) {
    this.validity = validity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionLeiProp {\n");
    
    sb.append("    permissionAccessHcpoDocuments: ").append(toIndentedString(permissionAccessHcpoDocuments)).append("\n");
    sb.append("    permissionAccessInsuranceDocuments: ").append(toIndentedString(permissionAccessInsuranceDocuments)).append("\n");
    sb.append("    permissionAccessInsurantDocuments: ").append(toIndentedString(permissionAccessInsurantDocuments)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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

