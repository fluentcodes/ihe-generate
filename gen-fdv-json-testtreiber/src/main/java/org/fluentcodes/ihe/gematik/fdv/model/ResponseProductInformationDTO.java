package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
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

/**
  * Produktinformation gemaess A_17235
 **/
@ApiModel(description="Produktinformation gemaess A_17235")
public class ResponseProductInformationDTO  {
  
  @ApiModelProperty(required = true, value = "Hersteller-ID")
 /**
   * Hersteller-ID
  **/
  private String producerId;

  @ApiModelProperty(required = true, value = "Produktkuerzel")
 /**
   * Produktkuerzel
  **/
  private String code;

  @ApiModelProperty(example = "1.0.0-0", required = true, value = "Produktversion")
 /**
   * Produktversion
  **/
  private String version;
 /**
   * Hersteller-ID
   * @return producerId
  **/
  @JsonProperty("producerId")
  @NotNull
 @Size(max=5)  public String getProducerId() {
    return producerId;
  }

  public void setProducerId(String producerId) {
    this.producerId = producerId;
  }

  public ResponseProductInformationDTO producerId(String producerId) {
    this.producerId = producerId;
    return this;
  }

 /**
   * Produktkuerzel
   * @return code
  **/
  @JsonProperty("code")
  @NotNull
 @Size(max=8)  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ResponseProductInformationDTO code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Produktversion
   * @return version
  **/
  @JsonProperty("version")
  @NotNull
 @Size(max=12)  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ResponseProductInformationDTO version(String version) {
    this.version = version;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseProductInformationDTO {\n");
    
    sb.append("    producerId: ").append(toIndentedString(producerId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

