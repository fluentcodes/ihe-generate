package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.DocumentWithMetadata;
import org.fluentcodes.ihe.gematik.fdv.model.Login;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StoreDocumentRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<DocumentWithMetadata> documentSets = new ArrayList<>();
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
   * Get documentSets
   * @return documentSets
  **/
  @JsonProperty("documentSets")
  @NotNull
  public List<DocumentWithMetadata> getDocumentSets() {
    return documentSets;
  }

  public void setDocumentSets(List<DocumentWithMetadata> documentSets) {
    this.documentSets = documentSets;
  }

  public StoreDocumentRequestDTO documentSets(List<DocumentWithMetadata> documentSets) {
    this.documentSets = documentSets;
    return this;
  }

  public StoreDocumentRequestDTO addDocumentSetsItem(DocumentWithMetadata documentSetsItem) {
    this.documentSets.add(documentSetsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDocumentRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    documentSets: ").append(toIndentedString(documentSets)).append("\n");
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

