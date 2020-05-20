package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
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

public class DocumentsRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "")
  private List<String> documentIds = new ArrayList<>();
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

  public DocumentsRequestDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Get documentIds
   * @return documentIds
  **/
  @JsonProperty("documentIds")
  @NotNull
  public List<String> getDocumentIds() {
    return documentIds;
  }

  public void setDocumentIds(List<String> documentIds) {
    this.documentIds = documentIds;
  }

  public DocumentsRequestDTO documentIds(List<String> documentIds) {
    this.documentIds = documentIds;
    return this;
  }

  public DocumentsRequestDTO addDocumentIdsItem(String documentIdsItem) {
    this.documentIds.add(documentIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentsRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
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

