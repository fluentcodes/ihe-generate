package org.fluentcodes.ihe.gematik.fdv.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.fluentcodes.ihe.gematik.fdv.model.Login;
import org.fluentcodes.ihe.gematik.fdv.model.QueryMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Die Parameter returnType (Werte sind \"LeafClass\" oder \"ObjectRef\"), startIndex und maxResults werden zum Gruppieren der Ergebnisse für das Blättern verwendet.
 **/
@ApiModel(description="Die Parameter returnType (Werte sind \"LeafClass\" oder \"ObjectRef\"), startIndex und maxResults werden zum Gruppieren der Ergebnisse für das Blättern verwendet.")
public class FindObjectsRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(value = "")
  @Valid
  private QueryMetadata queryMetadata;

public enum QueryEnum {

FINDDOCUMENTS(String.valueOf("FindDocuments")), FINDDOCUMENTSBYTITLE(String.valueOf("FindDocumentsByTitle")), FINDDOCUMENTSBYREFERENCEID(String.valueOf("FindDocumentsByReferenceId")), FINDSUBMISSIONSETS(String.valueOf("FindSubmissionSets")), FINDFOLDERS(String.valueOf("FindFolders")), GETALL(String.valueOf("GetAll")), GETDOCUMENTS(String.valueOf("GetDocuments")), GETSUBMISSIONSETS(String.valueOf("GetSubmissionSets")), GETSUBMISSIONSETANDCONTENTS(String.valueOf("GetSubmissionSetAndContents")), GETFOLDERSFORDOCUMENT(String.valueOf("GetFoldersForDocument")), GETFOLDERANDCONTENTS(String.valueOf("GetFolderAndContents"));


    private String value;

    QueryEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
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

public enum ReturnTypeEnum {

LEAFCLASS(String.valueOf("LeafClass")), OBJECTREF(String.valueOf("ObjectRef"));


    private String value;

    ReturnTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ReturnTypeEnum fromValue(String value) {
        for (ReturnTypeEnum b : ReturnTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private ReturnTypeEnum returnType = ReturnTypeEnum.LEAFCLASS;
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

  public FindObjectsRequestDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Get queryMetadata
   * @return queryMetadata
  **/
  @JsonProperty("queryMetadata")
  public QueryMetadata getQueryMetadata() {
    return queryMetadata;
  }

  public void setQueryMetadata(QueryMetadata queryMetadata) {
    this.queryMetadata = queryMetadata;
  }

  public FindObjectsRequestDTO queryMetadata(QueryMetadata queryMetadata) {
    this.queryMetadata = queryMetadata;
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

  public FindObjectsRequestDTO query(QueryEnum query) {
    this.query = query;
    return this;
  }

 /**
   * Get returnType
   * @return returnType
  **/
  @JsonProperty("returnType")
  public String getReturnType() {
    if (returnType == null) {
      return null;
    }
    return returnType.value();
  }

  public void setReturnType(ReturnTypeEnum returnType) {
    this.returnType = returnType;
  }

  public FindObjectsRequestDTO returnType(ReturnTypeEnum returnType) {
    this.returnType = returnType;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindObjectsRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    queryMetadata: ").append(toIndentedString(queryMetadata)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
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

