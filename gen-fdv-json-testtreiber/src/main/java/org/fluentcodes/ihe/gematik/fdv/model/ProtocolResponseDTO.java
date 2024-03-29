package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.ProtocolEntry;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProtocolResponseDTO  {
  
  @ApiModelProperty(required = true, value = "")
  private Boolean success;

  @ApiModelProperty(value = "")
  private String statusMessage;

  @ApiModelProperty(value = "")
  @Valid
  private List<ProtocolEntry> protocolEntries = null;
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

  public ProtocolResponseDTO success(Boolean success) {
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

  public ProtocolResponseDTO statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

 /**
   * Get protocolEntries
   * @return protocolEntries
  **/
  @JsonProperty("protocolEntries")
  public List<ProtocolEntry> getProtocolEntries() {
    return protocolEntries;
  }

  public void setProtocolEntries(List<ProtocolEntry> protocolEntries) {
    this.protocolEntries = protocolEntries;
  }

  public ProtocolResponseDTO protocolEntries(List<ProtocolEntry> protocolEntries) {
    this.protocolEntries = protocolEntries;
    return this;
  }

  public ProtocolResponseDTO addProtocolEntriesItem(ProtocolEntry protocolEntriesItem) {
    this.protocolEntries.add(protocolEntriesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtocolResponseDTO {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    protocolEntries: ").append(toIndentedString(protocolEntries)).append("\n");
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

