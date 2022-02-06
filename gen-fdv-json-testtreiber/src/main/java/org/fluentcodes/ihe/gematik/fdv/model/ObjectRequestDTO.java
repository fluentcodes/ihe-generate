package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.Login;
import org.fluentcodes.ihe.gematik.fdv.model.ObjectDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectRequestDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Login account;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<ObjectDTO> objects = new ArrayList<>();
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

  public ObjectRequestDTO account(Login account) {
    this.account = account;
    return this;
  }

 /**
   * Get objects
   * @return objects
  **/
  @JsonProperty("objects")
  @NotNull
  public List<ObjectDTO> getObjects() {
    return objects;
  }

  public void setObjects(List<ObjectDTO> objects) {
    this.objects = objects;
  }

  public ObjectRequestDTO objects(List<ObjectDTO> objects) {
    this.objects = objects;
    return this;
  }

  public ObjectRequestDTO addObjectsItem(ObjectDTO objectsItem) {
    this.objects.add(objectsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectRequestDTO {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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

