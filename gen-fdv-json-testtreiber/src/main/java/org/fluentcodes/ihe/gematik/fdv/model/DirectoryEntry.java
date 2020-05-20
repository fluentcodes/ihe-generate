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

public class DirectoryEntry  {
  
  @ApiModelProperty(value = "commonName, vollstaendiger Name")
 /**
   * commonName, vollstaendiger Name
  **/
  private String cn;

  @ApiModelProperty(value = "Vorname, fuer LEI und KTR nicht verwendet")
 /**
   * Vorname, fuer LEI und KTR nicht verwendet
  **/
  private String givenName;

  @ApiModelProperty(value = "Nachname, fuer LEI und KTR nicht verwendet")
 /**
   * Nachname, fuer LEI und KTR nicht verwendet
  **/
  private String sn;

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
  private String stateOrProvienceName;

  @ApiModelProperty(value = "Titel, fuer LEI und KTR nicht verwendet")
 /**
   * Titel, fuer LEI und KTR nicht verwendet
  **/
  private String title;

  @ApiModelProperty(value = "Institutionsname")
 /**
   * Institutionsname
  **/
  private String organization;

  @ApiModelProperty(value = "Langname")
 /**
   * Langname
  **/
  private String otherName;

  @ApiModelProperty(value = "fuer LEI: Institution")
 /**
   * fuer LEI: Institution
  **/
  private String professionOID;

  @ApiModelProperty(value = "fuer LEI: Fachgebiet")
 /**
   * fuer LEI: Fachgebiet
  **/
  private String specialization;

  @ApiModelProperty(value = "fuer KTR: Kostentraegerkennung")
 /**
   * fuer KTR: Kostentraegerkennung
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
   * Vorname, fuer LEI und KTR nicht verwendet
   * @return givenName
  **/
  @JsonProperty("givenName")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public DirectoryEntry givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

 /**
   * Nachname, fuer LEI und KTR nicht verwendet
   * @return sn
  **/
  @JsonProperty("sn")
  public String getSn() {
    return sn;
  }

  public void setSn(String sn) {
    this.sn = sn;
  }

  public DirectoryEntry sn(String sn) {
    this.sn = sn;
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
   * @return stateOrProvienceName
  **/
  @JsonProperty("stateOrProvienceName")
  public String getStateOrProvienceName() {
    return stateOrProvienceName;
  }

  public void setStateOrProvienceName(String stateOrProvienceName) {
    this.stateOrProvienceName = stateOrProvienceName;
  }

  public DirectoryEntry stateOrProvienceName(String stateOrProvienceName) {
    this.stateOrProvienceName = stateOrProvienceName;
    return this;
  }

 /**
   * Titel, fuer LEI und KTR nicht verwendet
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DirectoryEntry title(String title) {
    this.title = title;
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
   * Langname
   * @return otherName
  **/
  @JsonProperty("otherName")
  public String getOtherName() {
    return otherName;
  }

  public void setOtherName(String otherName) {
    this.otherName = otherName;
  }

  public DirectoryEntry otherName(String otherName) {
    this.otherName = otherName;
    return this;
  }

 /**
   * fuer LEI: Institution
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
   * fuer LEI: Fachgebiet
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
   * fuer KTR: Kostentraegerkennung
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
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    localityName: ").append(toIndentedString(localityName)).append("\n");
    sb.append("    stateOrProvienceName: ").append(toIndentedString(stateOrProvienceName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

