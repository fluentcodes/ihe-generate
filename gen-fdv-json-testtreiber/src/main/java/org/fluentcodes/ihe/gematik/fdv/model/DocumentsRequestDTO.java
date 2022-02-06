package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.Login;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentsRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "Liste von UniqueIDs von DocumentEntries")
 /**
   * Liste von UniqueIDs von DocumentEntries
  **/
  private List<String> documentUniqueIds = new ArrayList<>();
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
   * Liste von UniqueIDs von DocumentEntries
   * @return documentUniqueIds
  **/
  @JsonProperty("documentUniqueIds")
  @NotNull
  public List<String> getDocumentUniqueIds() {
    return documentUniqueIds;
  }

  public void setDocumentUniqueIds(List<String> documentUniqueIds) {
    this.documentUniqueIds = documentUniqueIds;
  }

  public DocumentsRequestDTO documentUniqueIds(List<String> documentUniqueIds) {
    this.documentUniqueIds = documentUniqueIds;
    return this;
  }

  public DocumentsRequestDTO addDocumentUniqueIdsItem(String documentUniqueIdsItem) {
    this.documentUniqueIds.add(documentUniqueIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentsRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    documentUniqueIds: ").append(toIndentedString(documentUniqueIds)).append("\n");
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

