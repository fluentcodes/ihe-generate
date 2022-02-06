package org.fluentcodes.ihe.gematik.fdv.model;

import java.time.Instant;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateKeysResponseDTO  {
  
  @ApiModelProperty(required = true, value = "")
  private Boolean success;

  @ApiModelProperty(value = "")
  private String statusMessage;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Ende Zeitraum für die erfolgreiche Umschlüsselung, nach Ablauf wird die Umschlüsselung abgebrochen und die ursprünglichen Schlüssel bleiben weiterhin aktiv; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Ende Zeitraum für die erfolgreiche Umschlüsselung, nach Ablauf wird die Umschlüsselung abgebrochen und die ursprünglichen Schlüssel bleiben weiterhin aktiv; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant rollbackTime;
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

  public UpdateKeysResponseDTO success(Boolean success) {
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

  public UpdateKeysResponseDTO statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

 /**
   * Ende Zeitraum für die erfolgreiche Umschlüsselung, nach Ablauf wird die Umschlüsselung abgebrochen und die ursprünglichen Schlüssel bleiben weiterhin aktiv; date-time notation as defined by RFC 3339, section 5.6
   * @return rollbackTime
  **/
  @JsonProperty("rollbackTime")
  public Instant getRollbackTime() {
    return rollbackTime;
  }

  public void setRollbackTime(Instant rollbackTime) {
    this.rollbackTime = rollbackTime;
  }

  public UpdateKeysResponseDTO rollbackTime(Instant rollbackTime) {
    this.rollbackTime = rollbackTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateKeysResponseDTO {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    rollbackTime: ").append(toIndentedString(rollbackTime)).append("\n");
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

