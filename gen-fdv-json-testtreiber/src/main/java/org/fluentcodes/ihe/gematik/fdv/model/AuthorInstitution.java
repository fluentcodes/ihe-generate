package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Institution, die dem Autor zugeordnet ist
 **/
@ApiModel(description="Institution, die dem Autor zugeordnet ist")
public class AuthorInstitution  {
  
  @ApiModelProperty(value = "Name der Leistungserbringerinstitution oder Name des Kostenträgers")
 /**
   * Name der Leistungserbringerinstitution oder Name des Kostenträgers
  **/
  private String name;

  @ApiModelProperty(value = "Institutionskennzeichen der Leistungserbringerinstitution oder Betriebsnummer des Kostenträgers")
 /**
   * Institutionskennzeichen der Leistungserbringerinstitution oder Betriebsnummer des Kostenträgers
  **/
  private String identifier;
 /**
   * Name der Leistungserbringerinstitution oder Name des Kostenträgers
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuthorInstitution name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Institutionskennzeichen der Leistungserbringerinstitution oder Betriebsnummer des Kostenträgers
   * @return identifier
  **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public AuthorInstitution identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorInstitution {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

