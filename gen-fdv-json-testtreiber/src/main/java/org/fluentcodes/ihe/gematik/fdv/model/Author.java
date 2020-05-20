package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.AuthorInstitution;
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
  * Inhalte fuer Metadaten fuer author gemaess A_14760; entspricht fuer ein DocumentEntry dem Autor; entspricht fuer ein Submission Set der einstellenden Person oder einstellendem System
 **/
@ApiModel(description="Inhalte fuer Metadaten fuer author gemaess A_14760; entspricht fuer ein DocumentEntry dem Autor; entspricht fuer ein Submission Set der einstellenden Person oder einstellendem System")
public class Author  {
  
  @ApiModelProperty(example = "165746304", value = "authorPerson, fuer Leistungserbringer Lebenslange Identifikationsnummer eines Arztes, fuer Versicherte Versicherten-ID (unveraenderliche Teil der KVNR)")
 /**
   * authorPerson, fuer Leistungserbringer Lebenslange Identifikationsnummer eines Arztes, fuer Versicherte Versicherten-ID (unveraenderliche Teil der KVNR)
  **/
  private String identifier;

  @ApiModelProperty(example = "Weber", value = "authorPerson, Nachname")
 /**
   * authorPerson, Nachname
  **/
  private String familyName;

  @ApiModelProperty(example = "Thilo", value = "authorPerson, Vorname")
 /**
   * authorPerson, Vorname
  **/
  private String givenName;

  @ApiModelProperty(value = "authorPerson, weiterer Vorname")
 /**
   * authorPerson, weiterer Vorname
  **/
  private String otherName;

  @ApiModelProperty(value = "authorPerson, Nameszusatz")
 /**
   * authorPerson, Nameszusatz
  **/
  private String nameAffix;

  @ApiModelProperty(example = "Dr.", value = "authorPerson, Titel")
 /**
   * authorPerson, Titel
  **/
  private String title;

  @ApiModelProperty(value = "")
  @Valid
  private List<AuthorInstitution> authorInstitution = null;

  @ApiModelProperty(value = "")
  private List<String> authorRole = null;

  @ApiModelProperty(value = "")
  private List<String> authorSpecialty = null;

  @ApiModelProperty(value = "")
  private List<String> authorTelecommunication = null;
 /**
   * authorPerson, fuer Leistungserbringer Lebenslange Identifikationsnummer eines Arztes, fuer Versicherte Versicherten-ID (unveraenderliche Teil der KVNR)
   * @return identifier
  **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Author identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

 /**
   * authorPerson, Nachname
   * @return familyName
  **/
  @JsonProperty("familyName")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Author familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

 /**
   * authorPerson, Vorname
   * @return givenName
  **/
  @JsonProperty("givenName")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public Author givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

 /**
   * authorPerson, weiterer Vorname
   * @return otherName
  **/
  @JsonProperty("otherName")
  public String getOtherName() {
    return otherName;
  }

  public void setOtherName(String otherName) {
    this.otherName = otherName;
  }

  public Author otherName(String otherName) {
    this.otherName = otherName;
    return this;
  }

 /**
   * authorPerson, Nameszusatz
   * @return nameAffix
  **/
  @JsonProperty("nameAffix")
  public String getNameAffix() {
    return nameAffix;
  }

  public void setNameAffix(String nameAffix) {
    this.nameAffix = nameAffix;
  }

  public Author nameAffix(String nameAffix) {
    this.nameAffix = nameAffix;
    return this;
  }

 /**
   * authorPerson, Titel
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Author title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get authorInstitution
   * @return authorInstitution
  **/
  @JsonProperty("authorInstitution")
  public List<AuthorInstitution> getAuthorInstitution() {
    return authorInstitution;
  }

  public void setAuthorInstitution(List<AuthorInstitution> authorInstitution) {
    this.authorInstitution = authorInstitution;
  }

  public Author authorInstitution(List<AuthorInstitution> authorInstitution) {
    this.authorInstitution = authorInstitution;
    return this;
  }

  public Author addAuthorInstitutionItem(AuthorInstitution authorInstitutionItem) {
    this.authorInstitution.add(authorInstitutionItem);
    return this;
  }

 /**
   * Get authorRole
   * @return authorRole
  **/
  @JsonProperty("authorRole")
  public List<String> getAuthorRole() {
    return authorRole;
  }

  public void setAuthorRole(List<String> authorRole) {
    this.authorRole = authorRole;
  }

  public Author authorRole(List<String> authorRole) {
    this.authorRole = authorRole;
    return this;
  }

  public Author addAuthorRoleItem(String authorRoleItem) {
    this.authorRole.add(authorRoleItem);
    return this;
  }

 /**
   * Get authorSpecialty
   * @return authorSpecialty
  **/
  @JsonProperty("authorSpecialty")
  public List<String> getAuthorSpecialty() {
    return authorSpecialty;
  }

  public void setAuthorSpecialty(List<String> authorSpecialty) {
    this.authorSpecialty = authorSpecialty;
  }

  public Author authorSpecialty(List<String> authorSpecialty) {
    this.authorSpecialty = authorSpecialty;
    return this;
  }

  public Author addAuthorSpecialtyItem(String authorSpecialtyItem) {
    this.authorSpecialty.add(authorSpecialtyItem);
    return this;
  }

 /**
   * Get authorTelecommunication
   * @return authorTelecommunication
  **/
  @JsonProperty("authorTelecommunication")
  public List<String> getAuthorTelecommunication() {
    return authorTelecommunication;
  }

  public void setAuthorTelecommunication(List<String> authorTelecommunication) {
    this.authorTelecommunication = authorTelecommunication;
  }

  public Author authorTelecommunication(List<String> authorTelecommunication) {
    this.authorTelecommunication = authorTelecommunication;
    return this;
  }

  public Author addAuthorTelecommunicationItem(String authorTelecommunicationItem) {
    this.authorTelecommunication.add(authorTelecommunicationItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
    sb.append("    nameAffix: ").append(toIndentedString(nameAffix)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    authorInstitution: ").append(toIndentedString(authorInstitution)).append("\n");
    sb.append("    authorRole: ").append(toIndentedString(authorRole)).append("\n");
    sb.append("    authorSpecialty: ").append(toIndentedString(authorSpecialty)).append("\n");
    sb.append("    authorTelecommunication: ").append(toIndentedString(authorTelecommunication)).append("\n");
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

