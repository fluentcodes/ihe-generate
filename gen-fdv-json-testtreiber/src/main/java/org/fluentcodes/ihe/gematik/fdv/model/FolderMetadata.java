package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Metadaten zu einem Ordner
 **/
@ApiModel(description="Metadaten zu einem Ordner")
public class FolderMetadata  {
  
  @ApiModelProperty(value = "Ergänzende Hinweise in Freitext")
 /**
   * Ergänzende Hinweise in Freitext
  **/
  private String comments;

  @ApiModelProperty(required = true, value = "Liste von Codes, die mit dem Ordner assoziiert werden.")
 /**
   * Liste von Codes, die mit dem Ordner assoziiert werden.
  **/
  private List<String> codeList = new ArrayList<>();

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", required = true, value = "Zeitstempel, an dem der Ordner das letzte mal geändert wurde; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Zeitstempel, an dem der Ordner das letzte mal geändert wurde; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant lastUpdateTime;

  @ApiModelProperty(required = true, value = "Titel des Ornder")
 /**
   * Titel des Ornder
  **/
  private String title;

  @ApiModelProperty(required = true, value = "Eindeutige Kennung des Ordner (von Client erzeugt)")
 /**
   * Eindeutige Kennung des Ordner (von Client erzeugt)
  **/
  private String uniqueId;

  @ApiModelProperty(example = "Folder-1", required = true, value = "Eindeutige Kennung des Ordner in der Registry (von Aktensystem gesetzt)")
 /**
   * Eindeutige Kennung des Ordner in der Registry (von Aktensystem gesetzt)
  **/
  private String entryUUID;

  @ApiModelProperty(example = "urn:oasis:names:tc:ebxml-regrep:StatusType:Approved, Approved", required = true, value = "Status der Ordner")
 /**
   * Status der Ordner
  **/
  private String availabilityStatus;
 /**
   * Ergänzende Hinweise in Freitext
   * @return comments
  **/
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public FolderMetadata comments(String comments) {
    this.comments = comments;
    return this;
  }

 /**
   * Liste von Codes, die mit dem Ordner assoziiert werden.
   * @return codeList
  **/
  @JsonProperty("codeList")
  @NotNull
  public List<String> getCodeList() {
    return codeList;
  }

  public void setCodeList(List<String> codeList) {
    this.codeList = codeList;
  }

  public FolderMetadata codeList(List<String> codeList) {
    this.codeList = codeList;
    return this;
  }

  public FolderMetadata addCodeListItem(String codeListItem) {
    this.codeList.add(codeListItem);
    return this;
  }

 /**
   * Zeitstempel, an dem der Ordner das letzte mal geändert wurde; date-time notation as defined by RFC 3339, section 5.6
   * @return lastUpdateTime
  **/
  @JsonProperty("lastUpdateTime")
  @NotNull
  public Instant getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(Instant lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public FolderMetadata lastUpdateTime(Instant lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

 /**
   * Titel des Ornder
   * @return title
  **/
  @JsonProperty("title")
  @NotNull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FolderMetadata title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Eindeutige Kennung des Ordner (von Client erzeugt)
   * @return uniqueId
  **/
  @JsonProperty("uniqueId")
  @NotNull
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public FolderMetadata uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

 /**
   * Eindeutige Kennung des Ordner in der Registry (von Aktensystem gesetzt)
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

  public FolderMetadata entryUUID(String entryUUID) {
    this.entryUUID = entryUUID;
    return this;
  }

 /**
   * Status der Ordner
   * @return availabilityStatus
  **/
  @JsonProperty("availabilityStatus")
  @NotNull
  public String getAvailabilityStatus() {
    return availabilityStatus;
  }

  public void setAvailabilityStatus(String availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
  }

  public FolderMetadata availabilityStatus(String availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderMetadata {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    codeList: ").append(toIndentedString(codeList)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    entryUUID: ").append(toIndentedString(entryUUID)).append("\n");
    sb.append("    availabilityStatus: ").append(toIndentedString(availabilityStatus)).append("\n");
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

