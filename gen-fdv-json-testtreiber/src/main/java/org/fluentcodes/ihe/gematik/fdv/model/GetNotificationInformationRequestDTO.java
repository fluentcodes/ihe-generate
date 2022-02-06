package org.fluentcodes.ihe.gematik.fdv.model;

import org.fluentcodes.ihe.gematik.fdv.model.Login;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetNotificationInformationRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;
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

  public GetNotificationInformationRequestDTO account(Login account) {
    this.account = account;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNotificationInformationRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

