package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.FindDocumentMetaData;
import org.fluentcodes.ihe.gematik.fdv.model.Login;
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

public class FindDocumentsRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(value = "")
  @Valid
  private FindDocumentMetaData doc;

@XmlType(name="QueryEnum")
@XmlEnum(String.class)
public enum QueryEnum {

@XmlEnumValue("FindDocuments") FINDDOCUMENTS(String.valueOf("FindDocuments")), @XmlEnumValue("FindSubmissionSets") FINDSUBMISSIONSETS(String.valueOf("FindSubmissionSets")), @XmlEnumValue("FindDocumentsByTitle") FINDDOCUMENTSBYTITLE(String.valueOf("FindDocumentsByTitle")), @XmlEnumValue("GetAll") GETALL(String.valueOf("GetAll")), @XmlEnumValue("GetDocuments") GETDOCUMENTS(String.valueOf("GetDocuments")), @XmlEnumValue("GetSubmissionSets") GETSUBMISSIONSETS(String.valueOf("GetSubmissionSets")), @XmlEnumValue("GetSubmissionSetAndContents") GETSUBMISSIONSETANDCONTENTS(String.valueOf("GetSubmissionSetAndContents")), @XmlEnumValue("FindDocumentsByReferenceId") FINDDOCUMENTSBYREFERENCEID(String.valueOf("FindDocumentsByReferenceId"));


    private String value;

    QueryEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static QueryEnum fromValue(String value) {
        for (QueryEnum b : QueryEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "optional; falls angegeben, ist die entsprechende Stored Query anzuwenden; falls nicht angegeben, ist eine entsprechend der Suchparameter geeignete Stored Query anzuwenden")
 /**
   * optional; falls angegeben, ist die entsprechende Stored Query anzuwenden; falls nicht angegeben, ist eine entsprechend der Suchparameter geeignete Stored Query anzuwenden
  **/
  private QueryEnum query;
 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  @NotNull
  public Login getAccount() {
    return account;
  }

  public void setAccount(Login account) {
    this.account = account;
  }

  public FindDocumentsRequestDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Get doc
   * @return doc
  **/
  @JsonProperty("doc")
  public FindDocumentMetaData getDoc() {
    return doc;
  }

  public void setDoc(FindDocumentMetaData doc) {
    this.doc = doc;
  }

  public FindDocumentsRequestDTO doc(FindDocumentMetaData doc) {
    this.doc = doc;
    return this;
  }

 /**
   * optional; falls angegeben, ist die entsprechende Stored Query anzuwenden; falls nicht angegeben, ist eine entsprechend der Suchparameter geeignete Stored Query anzuwenden
   * @return query
  **/
  @JsonProperty("query")
  public String getQuery() {
    if (query == null) {
      return null;
    }
    return query.value();
  }

  public void setQuery(QueryEnum query) {
    this.query = query;
  }

  public FindDocumentsRequestDTO query(QueryEnum query) {
    this.query = query;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindDocumentsRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

