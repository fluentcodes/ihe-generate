package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.Author;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Inhalte für Metadaten für ein SubmissionSet
 **/
@ApiModel(description="Inhalte für Metadaten für ein SubmissionSet")
public class SubmissionSetMetadata  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Author author;

  @ApiModelProperty(value = "Ergänzende Hinweise zum Submission Set in Freitext")
 /**
   * Ergänzende Hinweise zum Submission Set in Freitext
  **/
  private String comments;

  @ApiModelProperty(value = "")
  private String contentTypeCode;

  @ApiModelProperty(value = "")
  private List<String> intendedRecipient = null;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "date-time notation as defined by RFC 3339, section 5.6")
 /**
   * date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant submissionTime;

  @ApiModelProperty(value = "Titel des Submission Sets")
 /**
   * Titel des Submission Sets
  **/
  private String title;

  @ApiModelProperty(value = "Eindeutige Kennung des Submission Sets")
 /**
   * Eindeutige Kennung des Submission Sets
  **/
  private String uniqueId;
 /**
   * Get author
   * @return author
  **/
  @JsonProperty("author")
  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public SubmissionSetMetadata author(Author author) {
    this.author = author;
    return this;
  }

 /**
   * Ergänzende Hinweise zum Submission Set in Freitext
   * @return comments
  **/
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public SubmissionSetMetadata comments(String comments) {
    this.comments = comments;
    return this;
  }

 /**
   * Get contentTypeCode
   * @return contentTypeCode
  **/
  @JsonProperty("contentTypeCode")
  public String getContentTypeCode() {
    return contentTypeCode;
  }

  public void setContentTypeCode(String contentTypeCode) {
    this.contentTypeCode = contentTypeCode;
  }

  public SubmissionSetMetadata contentTypeCode(String contentTypeCode) {
    this.contentTypeCode = contentTypeCode;
    return this;
  }

 /**
   * Get intendedRecipient
   * @return intendedRecipient
  **/
  @JsonProperty("intendedRecipient")
  public List<String> getIntendedRecipient() {
    return intendedRecipient;
  }

  public void setIntendedRecipient(List<String> intendedRecipient) {
    this.intendedRecipient = intendedRecipient;
  }

  public SubmissionSetMetadata intendedRecipient(List<String> intendedRecipient) {
    this.intendedRecipient = intendedRecipient;
    return this;
  }

  public SubmissionSetMetadata addIntendedRecipientItem(String intendedRecipientItem) {
    this.intendedRecipient.add(intendedRecipientItem);
    return this;
  }

 /**
   * date-time notation as defined by RFC 3339, section 5.6
   * @return submissionTime
  **/
  @JsonProperty("submissionTime")
  public Instant getSubmissionTime() {
    return submissionTime;
  }

  public void setSubmissionTime(Instant submissionTime) {
    this.submissionTime = submissionTime;
  }

  public SubmissionSetMetadata submissionTime(Instant submissionTime) {
    this.submissionTime = submissionTime;
    return this;
  }

 /**
   * Titel des Submission Sets
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SubmissionSetMetadata title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Eindeutige Kennung des Submission Sets
   * @return uniqueId
  **/
  @JsonProperty("uniqueId")
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public SubmissionSetMetadata uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionSetMetadata {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    contentTypeCode: ").append(toIndentedString(contentTypeCode)).append("\n");
    sb.append("    intendedRecipient: ").append(toIndentedString(intendedRecipient)).append("\n");
    sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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

