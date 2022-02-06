package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Metadaten um einem bestehenden Ordner zu referenzieren
 **/
@ApiModel(description="Metadaten um einem bestehenden Ordner zu referenzieren")
public class FolderReference  {
  
  @ApiModelProperty(required = true, value = "Eindeutige Kennung des Ordner")
 /**
   * Eindeutige Kennung des Ordner
  **/
  private String entryUUID;
 /**
   * Eindeutige Kennung des Ordner
   * @return entryUUID
  **/
  @JsonProperty("entryUUID")
  @NotNull
  public String getEntryUUID() {
    return entryUUID;
  }

  public void setEntryUUID(String entryUUID) {
    this.entryUUID = entryUUID;
  }

  public FolderReference entryUUID(String entryUUID) {
    this.entryUUID = entryUUID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderReference {\n");
    
    sb.append("    entryUUID: ").append(toIndentedString(entryUUID)).append("\n");
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

