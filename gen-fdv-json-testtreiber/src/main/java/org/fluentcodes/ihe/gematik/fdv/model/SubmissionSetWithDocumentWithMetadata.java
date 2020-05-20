package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.DocumentWithMetadata;
import org.fluentcodes.ihe.gematik.fdv.model.SubmissionSetMetaData;
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

public class SubmissionSetWithDocumentWithMetadata  {
  
  @ApiModelProperty(value = "")
  @Valid
  private SubmissionSetMetaData submissionSet;

  @ApiModelProperty(value = "")
  @Valid
  private List<DocumentWithMetadata> documentMetadata = null;
 /**
   * Get submissionSet
   * @return submissionSet
  **/
  @JsonProperty("submissionSet")
  public SubmissionSetMetaData getSubmissionSet() {
    return submissionSet;
  }

  public void setSubmissionSet(SubmissionSetMetaData submissionSet) {
    this.submissionSet = submissionSet;
  }

  public SubmissionSetWithDocumentWithMetadata submissionSet(SubmissionSetMetaData submissionSet) {
    this.submissionSet = submissionSet;
    return this;
  }

 /**
   * Get documentMetadata
   * @return documentMetadata
  **/
  @JsonProperty("documentMetadata")
  public List<DocumentWithMetadata> getDocumentMetadata() {
    return documentMetadata;
  }

  public void setDocumentMetadata(List<DocumentWithMetadata> documentMetadata) {
    this.documentMetadata = documentMetadata;
  }

  public SubmissionSetWithDocumentWithMetadata documentMetadata(List<DocumentWithMetadata> documentMetadata) {
    this.documentMetadata = documentMetadata;
    return this;
  }

  public SubmissionSetWithDocumentWithMetadata addDocumentMetadataItem(DocumentWithMetadata documentMetadataItem) {
    this.documentMetadata.add(documentMetadataItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionSetWithDocumentWithMetadata {\n");
    
    sb.append("    submissionSet: ").append(toIndentedString(submissionSet)).append("\n");
    sb.append("    documentMetadata: ").append(toIndentedString(documentMetadata)).append("\n");
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

