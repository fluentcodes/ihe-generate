package org.fluentcodes.ihe.gematik.fdv.model;

import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.DirectoryEntry;
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

public class DirectoryEntryWithCertificates  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private DirectoryEntry directoryEntry;

  @ApiModelProperty(required = true, value = "")
  private List<byte[]> certificates = new ArrayList<>();
 /**
   * Get directoryEntry
   * @return directoryEntry
  **/
  @JsonProperty("directoryEntry")
  @NotNull
  public DirectoryEntry getDirectoryEntry() {
    return directoryEntry;
  }

  public void setDirectoryEntry(DirectoryEntry directoryEntry) {
    this.directoryEntry = directoryEntry;
  }

  public DirectoryEntryWithCertificates directoryEntry(DirectoryEntry directoryEntry) {
    this.directoryEntry = directoryEntry;
    return this;
  }

 /**
   * Get certificates
   * @return certificates
  **/
  @JsonProperty("certificates")
  @NotNull
 @Size(min=0,max=50)  public List<byte[]> getCertificates() {
    return certificates;
  }

  public void setCertificates(List<byte[]> certificates) {
    this.certificates = certificates;
  }

  public DirectoryEntryWithCertificates certificates(List<byte[]> certificates) {
    this.certificates = certificates;
    return this;
  }

  public DirectoryEntryWithCertificates addCertificatesItem(byte[] certificatesItem) {
    this.certificates.add(certificatesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectoryEntryWithCertificates {\n");
    
    sb.append("    directoryEntry: ").append(toIndentedString(directoryEntry)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
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

