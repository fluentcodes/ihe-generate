package org.fluentcodes.ihe.gematik.fdv.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DirectoryEntry  {
  
  @ApiModelProperty(value = "commonName, vollstaendiger Name")
 /**
   * commonName, vollstaendiger Name
  **/
  private String cn;

  @ApiModelProperty(value = "Anzeigename")
 /**
   * Anzeigename
  **/
  private String displayName;

  @ApiModelProperty(example = "Friedrichstrasse 136", value = "Strasse und Hausnummer")
 /**
   * Strasse und Hausnummer
  **/
  private String streetAddress;

  @ApiModelProperty(example = "10117", value = "Postleitzahl")
 /**
   * Postleitzahl
  **/
  private String postalCode;

  @ApiModelProperty(example = "Berlin", value = "Ort")
 /**
   * Ort
  **/
  private String localityName;

  @ApiModelProperty(example = "Berlin", value = "Bundesland")
 /**
   * Bundesland
  **/
  private String stateOrProvinceName;

  @ApiModelProperty(value = "Institutionsname")
 /**
   * Institutionsname
  **/
  private String organization;

  @ApiModelProperty(value = "für LEI: Institution")
 /**
   * für LEI: Institution
  **/
  private String professionOID;

  @ApiModelProperty(value = "für LEI: Fachgebiet")
 /**
   * für LEI: Fachgebiet
  **/
  private String specialization;

  @ApiModelProperty(value = "für KTR: Kostenträgerkennung")
 /**
   * für KTR: Kostenträgerkennung
  **/
  private String domainID;

  @ApiModelProperty(value = "eindeutige ID der Institution in der TI")
 /**
   * eindeutige ID der Institution in der TI
  **/
  private String telematikId;
 /**
   * commonName, vollstaendiger Name
   * @return cn
  **/
  @JsonProperty("cn")
  public String getCn() {
    return cn;
  }

  public void setCn(String cn) {
    this.cn = cn;
  }

  public DirectoryEntry cn(String cn) {
    this.cn = cn;
    return this;
  }

 /**
   * Anzeigename
   * @return displayName
  **/
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public DirectoryEntry displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

 /**
   * Strasse und Hausnummer
   * @return streetAddress
  **/
  @JsonProperty("streetAddress")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public DirectoryEntry streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

 /**
   * Postleitzahl
   * @return postalCode
  **/
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public DirectoryEntry postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

 /**
   * Ort
   * @return localityName
  **/
  @JsonProperty("localityName")
  public String getLocalityName() {
    return localityName;
  }

  public void setLocalityName(String localityName) {
    this.localityName = localityName;
  }

  public DirectoryEntry localityName(String localityName) {
    this.localityName = localityName;
    return this;
  }

 /**
   * Bundesland
   * @return stateOrProvinceName
  **/
  @JsonProperty("stateOrProvinceName")
  public String getStateOrProvinceName() {
    return stateOrProvinceName;
  }

  public void setStateOrProvinceName(String stateOrProvinceName) {
    this.stateOrProvinceName = stateOrProvinceName;
  }

  public DirectoryEntry stateOrProvinceName(String stateOrProvinceName) {
    this.stateOrProvinceName = stateOrProvinceName;
    return this;
  }

 /**
   * Institutionsname
   * @return organization
  **/
  @JsonProperty("organization")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public DirectoryEntry organization(String organization) {
    this.organization = organization;
    return this;
  }

 /**
   * für LEI: Institution
   * @return professionOID
  **/
  @JsonProperty("professionOID")
  public String getProfessionOID() {
    return professionOID;
  }

  public void setProfessionOID(String professionOID) {
    this.professionOID = professionOID;
  }

  public DirectoryEntry professionOID(String professionOID) {
    this.professionOID = professionOID;
    return this;
  }

 /**
   * für LEI: Fachgebiet
   * @return specialization
  **/
  @JsonProperty("specialization")
  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public DirectoryEntry specialization(String specialization) {
    this.specialization = specialization;
    return this;
  }

 /**
   * für KTR: Kostenträgerkennung
   * @return domainID
  **/
  @JsonProperty("domainID")
  public String getDomainID() {
    return domainID;
  }

  public void setDomainID(String domainID) {
    this.domainID = domainID;
  }

  public DirectoryEntry domainID(String domainID) {
    this.domainID = domainID;
    return this;
  }

 /**
   * eindeutige ID der Institution in der TI
   * @return telematikId
  **/
  @JsonProperty("telematikId")
  public String getTelematikId() {
    return telematikId;
  }

  public void setTelematikId(String telematikId) {
    this.telematikId = telematikId;
  }

  public DirectoryEntry telematikId(String telematikId) {
    this.telematikId = telematikId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectoryEntry {\n");
    
    sb.append("    cn: ").append(toIndentedString(cn)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    localityName: ").append(toIndentedString(localityName)).append("\n");
    sb.append("    stateOrProvinceName: ").append(toIndentedString(stateOrProvinceName)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    professionOID: ").append(toIndentedString(professionOID)).append("\n");
    sb.append("    specialization: ").append(toIndentedString(specialization)).append("\n");
    sb.append("    domainID: ").append(toIndentedString(domainID)).append("\n");
    sb.append("    telematikId: ").append(toIndentedString(telematikId)).append("\n");
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

