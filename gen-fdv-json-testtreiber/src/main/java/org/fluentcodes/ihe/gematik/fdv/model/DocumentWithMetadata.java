package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.Document;
import org.fluentcodes.ihe.gematik.fdv.model.DocumentMetadata;
import org.fluentcodes.ihe.gematik.fdv.model.FolderReference;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentWithMetadata  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DocumentMetadata metadata;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Document document;

  @ApiModelProperty(value = "")
  @Valid
  private FolderReference folderReference;
 /**
   * Get metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  @NotNull
  public DocumentMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(DocumentMetadata metadata) {
    this.metadata = metadata;
  }

  public DocumentWithMetadata metadata(DocumentMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Get document
   * @return document
  **/
  @JsonProperty("document")
  @NotNull
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public DocumentWithMetadata document(Document document) {
    this.document = document;
    return this;
  }

 /**
   * Get folderReference
   * @return folderReference
  **/
  @JsonProperty("folder_reference")
  public FolderReference getFolderReference() {
    return folderReference;
  }

  public void setFolderReference(FolderReference folderReference) {
    this.folderReference = folderReference;
  }

  public DocumentWithMetadata folderReference(FolderReference folderReference) {
    this.folderReference = folderReference;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentWithMetadata {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    folderReference: ").append(toIndentedString(folderReference)).append("\n");
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

