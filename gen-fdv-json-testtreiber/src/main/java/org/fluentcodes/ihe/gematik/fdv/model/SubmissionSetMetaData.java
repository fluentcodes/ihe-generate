package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.Author;
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
  * Inhalte fuer Metadaten fuer ein SubmissionSet gemaess A_14760;
 **/
@ApiModel(description="Inhalte fuer Metadaten fuer ein SubmissionSet gemaess A_14760;")
public class SubmissionSetMetaData  {
  
  @ApiModelProperty(value = "")
  @Valid
  private Author author;

  @ApiModelProperty(value = "Ergaenzende Hinweise zum Submission Set in Freitext")
 /**
   * Ergaenzende Hinweise zum Submission Set in Freitext
  **/
  private String comments;

  @ApiModelProperty(value = "")
  private String contentTypeCode;

  @ApiModelProperty(value = "")
  private List<String> intendedRecipient = null;

  @ApiModelProperty(value = "date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z")
 /**
   * date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
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

  public SubmissionSetMetaData author(Author author) {
    this.author = author;
    return this;
  }

 /**
   * Ergaenzende Hinweise zum Submission Set in Freitext
   * @return comments
  **/
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public SubmissionSetMetaData comments(String comments) {
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

  public SubmissionSetMetaData contentTypeCode(String contentTypeCode) {
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

  public SubmissionSetMetaData intendedRecipient(List<String> intendedRecipient) {
    this.intendedRecipient = intendedRecipient;
    return this;
  }

  public SubmissionSetMetaData addIntendedRecipientItem(String intendedRecipientItem) {
    this.intendedRecipient.add(intendedRecipientItem);
    return this;
  }

 /**
   * date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
   * @return submissionTime
  **/
  @JsonProperty("submissionTime")
  public Instant getSubmissionTime() {
    return submissionTime;
  }

  public void setSubmissionTime(Instant submissionTime) {
    this.submissionTime = submissionTime;
  }

  public SubmissionSetMetaData submissionTime(Instant submissionTime) {
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

  public SubmissionSetMetaData title(String title) {
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

  public SubmissionSetMetaData uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionSetMetaData {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

