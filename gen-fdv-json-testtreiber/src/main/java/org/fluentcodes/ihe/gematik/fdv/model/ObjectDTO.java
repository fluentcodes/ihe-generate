package org.fluentcodes.ihe.gematik.fdv.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectDTO  {
  
  @ApiModelProperty(value = "EntryUUID eines Dokumentes")
 /**
   * EntryUUID eines Dokumentes
  **/
  private String entryUUID;
 /**
   * EntryUUID eines Dokumentes
   * @return entryUUID
  **/
  @JsonProperty("entryUUID")
  public String getEntryUUID() {
    return entryUUID;
  }

  public void setEntryUUID(String entryUUID) {
    this.entryUUID = entryUUID;
  }

  public ObjectDTO entryUUID(String entryUUID) {
    this.entryUUID = entryUUID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectDTO {\n");
    
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

