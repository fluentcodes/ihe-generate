package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.DocumentWithMetadata;
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

public class StoreDocumentRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(value = "Titel des Submission Sets")
 /**
   * Titel des Submission Sets
  **/
  private String title;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<DocumentWithMetadata> docs = new ArrayList<>();
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

  public StoreDocumentRequestDTO account(Login account) {
    this.account = account;
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

  public StoreDocumentRequestDTO title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get docs
   * @return docs
  **/
  @JsonProperty("docs")
  @NotNull
  public List<DocumentWithMetadata> getDocs() {
    return docs;
  }

  public void setDocs(List<DocumentWithMetadata> docs) {
    this.docs = docs;
  }

  public StoreDocumentRequestDTO docs(List<DocumentWithMetadata> docs) {
    this.docs = docs;
    return this;
  }

  public StoreDocumentRequestDTO addDocsItem(DocumentWithMetadata docsItem) {
    this.docs.add(docsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDocumentRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

