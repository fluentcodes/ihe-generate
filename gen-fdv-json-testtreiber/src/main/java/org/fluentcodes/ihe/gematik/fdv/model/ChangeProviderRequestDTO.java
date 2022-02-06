package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.Login;
import org.fluentcodes.ihe.gematik.fdv.model.NotificationInformationWithId;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangeProviderRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "FQDN des neuen Anbieters")
 /**
   * FQDN des neuen Anbieters
  **/
  private String fqdnNewProvider;

  @ApiModelProperty(value = "legt fest, ob die Berechtigungen mit übertragen werden sollen")
 /**
   * legt fest, ob die Berechtigungen mit übertragen werden sollen
  **/
  private Boolean transferPermission = true;

  @ApiModelProperty(value = "")
  @Valid
  private List<NotificationInformationWithId> representativeNotificationInfo = null;
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

  public ChangeProviderRequestDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * FQDN des neuen Anbieters
   * @return fqdnNewProvider
  **/
  @JsonProperty("fqdnNewProvider")
  @NotNull
  public String getFqdnNewProvider() {
    return fqdnNewProvider;
  }

  public void setFqdnNewProvider(String fqdnNewProvider) {
    this.fqdnNewProvider = fqdnNewProvider;
  }

  public ChangeProviderRequestDTO fqdnNewProvider(String fqdnNewProvider) {
    this.fqdnNewProvider = fqdnNewProvider;
    return this;
  }

 /**
   * legt fest, ob die Berechtigungen mit übertragen werden sollen
   * @return transferPermission
  **/
  @JsonProperty("transferPermission")
  public Boolean getTransferPermission() {
    return transferPermission;
  }

  public void setTransferPermission(Boolean transferPermission) {
    this.transferPermission = transferPermission;
  }

  public ChangeProviderRequestDTO transferPermission(Boolean transferPermission) {
    this.transferPermission = transferPermission;
    return this;
  }

 /**
   * Get representativeNotificationInfo
   * @return representativeNotificationInfo
  **/
  @JsonProperty("RepresentativeNotificationInfo")
  public List<NotificationInformationWithId> getRepresentativeNotificationInfo() {
    return representativeNotificationInfo;
  }

  public void setRepresentativeNotificationInfo(List<NotificationInformationWithId> representativeNotificationInfo) {
    this.representativeNotificationInfo = representativeNotificationInfo;
  }

  public ChangeProviderRequestDTO representativeNotificationInfo(List<NotificationInformationWithId> representativeNotificationInfo) {
    this.representativeNotificationInfo = representativeNotificationInfo;
    return this;
  }

  public ChangeProviderRequestDTO addRepresentativeNotificationInfoItem(NotificationInformationWithId representativeNotificationInfoItem) {
    this.representativeNotificationInfo.add(representativeNotificationInfoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeProviderRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    fqdnNewProvider: ").append(toIndentedString(fqdnNewProvider)).append("\n");
    sb.append("    transferPermission: ").append(toIndentedString(transferPermission)).append("\n");
    sb.append("    representativeNotificationInfo: ").append(toIndentedString(representativeNotificationInfo)).append("\n");
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

