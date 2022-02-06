package org.fluentcodes.ihe.gematik.fdv.model;

import java.time.LocalDate;
import org.fluentcodes.ihe.gematik.fdv.model.Login;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(value = "")
  private Integer pageSize;

  @ApiModelProperty(value = "")
  private Integer pageNumber;

  @ApiModelProperty(example = "Thu Jul 01 02:00:00 CEST 2021", value = "")
  private LocalDate lastDay;
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

  public RequestDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Get pageSize
   * minimum: 1
   * @return pageSize
  **/
  @JsonProperty("pageSize")
 @Min(1)  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public RequestDTO pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

 /**
   * Get pageNumber
   * minimum: 1
   * @return pageNumber
  **/
  @JsonProperty("pageNumber")
 @Min(1)  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public RequestDTO pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

 /**
   * Get lastDay
   * @return lastDay
  **/
  @JsonProperty("lastDay")
  public LocalDate getLastDay() {
    return lastDay;
  }

  public void setLastDay(LocalDate lastDay) {
    this.lastDay = lastDay;
  }

  public RequestDTO lastDay(LocalDate lastDay) {
    this.lastDay = lastDay;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    lastDay: ").append(toIndentedString(lastDay)).append("\n");
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

