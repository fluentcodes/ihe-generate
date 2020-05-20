package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.SubmissionSetWithDocumentWithMetadata;
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

public class FindDocumentsResponseDTO  {
  
  @ApiModelProperty(required = true, value = "")
  private Boolean success;

  @ApiModelProperty(value = "")
  private String error;

  @ApiModelProperty(value = "")
  @Valid
  private List<SubmissionSetWithDocumentWithMetadata> docs = null;
 /**
   * Get success
   * @return success
  **/
  @JsonProperty("success")
  @NotNull
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public FindDocumentsResponseDTO success(Boolean success) {
    this.success = success;
    return this;
  }

 /**
   * Get error
   * @return error
  **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public FindDocumentsResponseDTO error(String error) {
    this.error = error;
    return this;
  }

 /**
   * Get docs
   * @return docs
  **/
  @JsonProperty("docs")
  public List<SubmissionSetWithDocumentWithMetadata> getDocs() {
    return docs;
  }

  public void setDocs(List<SubmissionSetWithDocumentWithMetadata> docs) {
    this.docs = docs;
  }

  public FindDocumentsResponseDTO docs(List<SubmissionSetWithDocumentWithMetadata> docs) {
    this.docs = docs;
    return this;
  }

  public FindDocumentsResponseDTO addDocsItem(SubmissionSetWithDocumentWithMetadata docsItem) {
    this.docs.add(docsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindDocumentsResponseDTO {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    docs: ").append(toIndentedString(docs)).append("\n");
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

