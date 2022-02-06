package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.DocumentMetadata;
import org.fluentcodes.ihe.gematik.fdv.model.FolderMetadata;
import org.fluentcodes.ihe.gematik.fdv.model.SubmissionSetMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectsMetadata  {
  
  @ApiModelProperty(value = "")
  @Valid
  private SubmissionSetMetadata submissionSetMetadata;

  @ApiModelProperty(value = "")
  @Valid
  private List<DocumentMetadata> documentsMetadata = null;

  @ApiModelProperty(value = "")
  @Valid
  private List<FolderMetadata> foldersMetadata = null;
 /**
   * Get submissionSetMetadata
   * @return submissionSetMetadata
  **/
  @JsonProperty("submissionSetMetadata")
  public SubmissionSetMetadata getSubmissionSetMetadata() {
    return submissionSetMetadata;
  }

  public void setSubmissionSetMetadata(SubmissionSetMetadata submissionSetMetadata) {
    this.submissionSetMetadata = submissionSetMetadata;
  }

  public ObjectsMetadata submissionSetMetadata(SubmissionSetMetadata submissionSetMetadata) {
    this.submissionSetMetadata = submissionSetMetadata;
    return this;
  }

 /**
   * Get documentsMetadata
   * @return documentsMetadata
  **/
  @JsonProperty("documentsMetadata")
  public List<DocumentMetadata> getDocumentsMetadata() {
    return documentsMetadata;
  }

  public void setDocumentsMetadata(List<DocumentMetadata> documentsMetadata) {
    this.documentsMetadata = documentsMetadata;
  }

  public ObjectsMetadata documentsMetadata(List<DocumentMetadata> documentsMetadata) {
    this.documentsMetadata = documentsMetadata;
    return this;
  }

  public ObjectsMetadata addDocumentsMetadataItem(DocumentMetadata documentsMetadataItem) {
    this.documentsMetadata.add(documentsMetadataItem);
    return this;
  }

 /**
   * Get foldersMetadata
   * @return foldersMetadata
  **/
  @JsonProperty("foldersMetadata")
  public List<FolderMetadata> getFoldersMetadata() {
    return foldersMetadata;
  }

  public void setFoldersMetadata(List<FolderMetadata> foldersMetadata) {
    this.foldersMetadata = foldersMetadata;
  }

  public ObjectsMetadata foldersMetadata(List<FolderMetadata> foldersMetadata) {
    this.foldersMetadata = foldersMetadata;
    return this;
  }

  public ObjectsMetadata addFoldersMetadataItem(FolderMetadata foldersMetadataItem) {
    this.foldersMetadata.add(foldersMetadataItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectsMetadata {\n");
    
    sb.append("    submissionSetMetadata: ").append(toIndentedString(submissionSetMetadata)).append("\n");
    sb.append("    documentsMetadata: ").append(toIndentedString(documentsMetadata)).append("\n");
    sb.append("    foldersMetadata: ").append(toIndentedString(foldersMetadata)).append("\n");
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

