package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetNotificationInformationResponseDTO  {
  
  @ApiModelProperty(required = true, value = "")
  private Boolean success;

  @ApiModelProperty(value = "")
  private String statusMessage;

  @ApiModelProperty(required = true, value = "")
  private List<String> notificationInfoList = new ArrayList<>();
 /**
   * Get success
   * @return success
  **/
  @JsonProperty("success")
  @NotNull
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public GetNotificationInformationResponseDTO success(Boolean success) {
    this.success = success;
    return this;
  }

 /**
   * Get statusMessage
   * @return statusMessage
  **/
  @JsonProperty("statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public GetNotificationInformationResponseDTO statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

 /**
   * Get notificationInfoList
   * @return notificationInfoList
  **/
  @JsonProperty("notificationInfoList")
  @NotNull
  public List<String> getNotificationInfoList() {
    return notificationInfoList;
  }

  public void setNotificationInfoList(List<String> notificationInfoList) {
    this.notificationInfoList = notificationInfoList;
  }

  public GetNotificationInformationResponseDTO notificationInfoList(List<String> notificationInfoList) {
    this.notificationInfoList = notificationInfoList;
    return this;
  }

  public GetNotificationInformationResponseDTO addNotificationInfoListItem(String notificationInfoListItem) {
    this.notificationInfoList.add(notificationInfoListItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNotificationInformationResponseDTO {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    notificationInfoList: ").append(toIndentedString(notificationInfoList)).append("\n");
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

