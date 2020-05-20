package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.Author;
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
  * Metadaten zu einem Dokument gemaess A_14760
 **/
@ApiModel(description="Metadaten zu einem Dokument gemaess A_14760")
public class DocumentWithMetadata  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<Author> author = null;

  @ApiModelProperty(value = "Grobe Klassifizierung des Dokuments, einem Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.classCode")
 /**
   * Grobe Klassifizierung des Dokuments, einem Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.classCode
  **/
  private String classCode;

  @ApiModelProperty(value = "Ergaenzende Hinweise in Freitext")
 /**
   * Ergaenzende Hinweise in Freitext
  **/
  private String comments;

  @ApiModelProperty(value = "")
  private List<String> confidentialityCode = null;

  @ApiModelProperty(value = "Erstellungszeitpunkt des Dokuments; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z")
 /**
   * Erstellungszeitpunkt des Dokuments; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
  **/
  private Instant creationTime;

  @ApiModelProperty(value = "Ereignisse, die zur Erstellung des Dokuments geführt haben.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.eventCodeList oder aus der Tabelle in A_17540")
 /**
   * Ereignisse, die zur Erstellung des Dokuments geführt haben.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.eventCodeList oder aus der Tabelle in A_17540
  **/
  private List<String> eventCodeList = null;

  @ApiModelProperty(value = "Global eindeutiger Code fuer das Dokumentenformat; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.formatCode oder aus der Tabelle in A_14761")
 /**
   * Global eindeutiger Code fuer das Dokumentenformat; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.formatCode oder aus der Tabelle in A_14761
  **/
  private String formatCode;

  @ApiModelProperty(value = "")
  private String hash;

  @ApiModelProperty(value = "Art der Einrichtung, in der das dokumentierte Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.healthcareFacilityTypeCode")
 /**
   * Art der Einrichtung, in der das dokumentierte Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.healthcareFacilityTypeCode
  **/
  private String healthcareFacilityTypeCode;

  @ApiModelProperty(value = "Sprache, in der das Dokument abgefasst ist.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.languageCode")
 /**
   * Sprache, in der das Dokument abgefasst ist.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.languageCode
  **/
  private String languageCode;

  @ApiModelProperty(value = "Rechtlich Verantwortlicher fuer das Dokument")
 /**
   * Rechtlich Verantwortlicher fuer das Dokument
  **/
  private String legalAuthenticator;

@XmlType(name="MimeTypeEnum")
@XmlEnum(String.class)
public enum MimeTypeEnum {

@XmlEnumValue("application/pdf") APPLICATION_PDF(String.valueOf("application/pdf")), @XmlEnumValue("image/jpeg") IMAGE_JPEG(String.valueOf("image/jpeg")), @XmlEnumValue("image/tiff") IMAGE_TIFF(String.valueOf("image/tiff")), @XmlEnumValue("text/plain") TEXT_PLAIN(String.valueOf("text/plain")), @XmlEnumValue("text/rtf") TEXT_RTF(String.valueOf("text/rtf")), @XmlEnumValue("application/vnd.openxmlformats-officedocument.wordprocessingml.document") APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT(String.valueOf("application/vnd.openxmlformats-officedocument.wordprocessingml.document")), @XmlEnumValue("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet") APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET(String.valueOf("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")), @XmlEnumValue("application/vnd.oasis.opendocument.text") APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT(String.valueOf("application/vnd.oasis.opendocument.text")), @XmlEnumValue("application/vnd.oasis.opendocument.spreadsheet") APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET(String.valueOf("application/vnd.oasis.opendocument.spreadsheet")), @XmlEnumValue("application/xml") APPLICATION_XML(String.valueOf("application/xml")), @XmlEnumValue("application/hl7-v3") APPLICATION_HL7_V3(String.valueOf("application/hl7-v3"));


    private String value;

    MimeTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MimeTypeEnum fromValue(String value) {
        for (MimeTypeEnum b : MimeTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "MIME-Type des Dokuments")
 /**
   * MIME-Type des Dokuments
  **/
  private MimeTypeEnum mimeType;

  @ApiModelProperty(value = "Art der Fachrichtung der erstellenden Einrichtung, in der das dokumentiere Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.practiceSettingCode oder aus der Tabelle in A_16944")
 /**
   * Art der Fachrichtung der erstellenden Einrichtung, in der das dokumentiere Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.practiceSettingCode oder aus der Tabelle in A_16944
  **/
  private String practiceSettingCode;

  @ApiModelProperty(value = "Liste von IDs, mit denen das Dokument assoziiert wird")
 /**
   * Liste von IDs, mit denen das Dokument assoziiert wird
  **/
  private List<String> referenceIdList = null;

  @ApiModelProperty(value = "Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde.; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z")
 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde.; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
  **/
  private Instant serviceStartTime;

  @ApiModelProperty(value = "Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde.; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z")
 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde.; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
  **/
  private Instant serviceStopTime;

  @ApiModelProperty(value = "Groesse des Dokuments in Bytes")
 /**
   * Groesse des Dokuments in Bytes
  **/
  private Integer size;

  @ApiModelProperty(value = "Titel des Dokuments")
 /**
   * Titel des Dokuments
  **/
  private String title;

  @ApiModelProperty(value = "Art des Dokumentes; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.typeCode")
 /**
   * Art des Dokumentes; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.typeCode
  **/
  private String typeCode;

  @ApiModelProperty(value = "Eindeutige, aktenweite Kennung des Dokuments")
 /**
   * Eindeutige, aktenweite Kennung des Dokuments
  **/
  private String uniqueId;

  @ApiModelProperty(value = "Dateiname")
 /**
   * Dateiname
  **/
  private String uri;

  @ApiModelProperty(value = "Dokument (Base64 kodiert)")
 /**
   * Dokument (Base64 kodiert)
  **/
  private byte[] doc;
 /**
   * Get author
   * @return author
  **/
  @JsonProperty("author")
  public List<Author> getAuthor() {
    return author;
  }

  public void setAuthor(List<Author> author) {
    this.author = author;
  }

  public DocumentWithMetadata author(List<Author> author) {
    this.author = author;
    return this;
  }

  public DocumentWithMetadata addAuthorItem(Author authorItem) {
    this.author.add(authorItem);
    return this;
  }

 /**
   * Grobe Klassifizierung des Dokuments, einem Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.classCode
   * @return classCode
  **/
  @JsonProperty("classCode")
  public String getClassCode() {
    return classCode;
  }

  public void setClassCode(String classCode) {
    this.classCode = classCode;
  }

  public DocumentWithMetadata classCode(String classCode) {
    this.classCode = classCode;
    return this;
  }

 /**
   * Ergaenzende Hinweise in Freitext
   * @return comments
  **/
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public DocumentWithMetadata comments(String comments) {
    this.comments = comments;
    return this;
  }

 /**
   * Get confidentialityCode
   * @return confidentialityCode
  **/
  @JsonProperty("confidentialityCode")
  public List<String> getConfidentialityCode() {
    return confidentialityCode;
  }

  public void setConfidentialityCode(List<String> confidentialityCode) {
    this.confidentialityCode = confidentialityCode;
  }

  public DocumentWithMetadata confidentialityCode(List<String> confidentialityCode) {
    this.confidentialityCode = confidentialityCode;
    return this;
  }

  public DocumentWithMetadata addConfidentialityCodeItem(String confidentialityCodeItem) {
    this.confidentialityCode.add(confidentialityCodeItem);
    return this;
  }

 /**
   * Erstellungszeitpunkt des Dokuments; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
   * @return creationTime
  **/
  @JsonProperty("creationTime")
  public Instant getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Instant creationTime) {
    this.creationTime = creationTime;
  }

  public DocumentWithMetadata creationTime(Instant creationTime) {
    this.creationTime = creationTime;
    return this;
  }

 /**
   * Ereignisse, die zur Erstellung des Dokuments geführt haben.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.eventCodeList oder aus der Tabelle in A_17540
   * @return eventCodeList
  **/
  @JsonProperty("eventCodeList")
  public List<String> getEventCodeList() {
    return eventCodeList;
  }

  public void setEventCodeList(List<String> eventCodeList) {
    this.eventCodeList = eventCodeList;
  }

  public DocumentWithMetadata eventCodeList(List<String> eventCodeList) {
    this.eventCodeList = eventCodeList;
    return this;
  }

  public DocumentWithMetadata addEventCodeListItem(String eventCodeListItem) {
    this.eventCodeList.add(eventCodeListItem);
    return this;
  }

 /**
   * Global eindeutiger Code fuer das Dokumentenformat; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.formatCode oder aus der Tabelle in A_14761
   * @return formatCode
  **/
  @JsonProperty("formatCode")
  public String getFormatCode() {
    return formatCode;
  }

  public void setFormatCode(String formatCode) {
    this.formatCode = formatCode;
  }

  public DocumentWithMetadata formatCode(String formatCode) {
    this.formatCode = formatCode;
    return this;
  }

 /**
   * Get hash
   * @return hash
  **/
  @JsonProperty("hash")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public DocumentWithMetadata hash(String hash) {
    this.hash = hash;
    return this;
  }

 /**
   * Art der Einrichtung, in der das dokumentierte Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.healthcareFacilityTypeCode
   * @return healthcareFacilityTypeCode
  **/
  @JsonProperty("healthcareFacilityTypeCode")
  public String getHealthcareFacilityTypeCode() {
    return healthcareFacilityTypeCode;
  }

  public void setHealthcareFacilityTypeCode(String healthcareFacilityTypeCode) {
    this.healthcareFacilityTypeCode = healthcareFacilityTypeCode;
  }

  public DocumentWithMetadata healthcareFacilityTypeCode(String healthcareFacilityTypeCode) {
    this.healthcareFacilityTypeCode = healthcareFacilityTypeCode;
    return this;
  }

 /**
   * Sprache, in der das Dokument abgefasst ist.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.languageCode
   * @return languageCode
  **/
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public DocumentWithMetadata languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

 /**
   * Rechtlich Verantwortlicher fuer das Dokument
   * @return legalAuthenticator
  **/
  @JsonProperty("legalAuthenticator")
  public String getLegalAuthenticator() {
    return legalAuthenticator;
  }

  public void setLegalAuthenticator(String legalAuthenticator) {
    this.legalAuthenticator = legalAuthenticator;
  }

  public DocumentWithMetadata legalAuthenticator(String legalAuthenticator) {
    this.legalAuthenticator = legalAuthenticator;
    return this;
  }

 /**
   * MIME-Type des Dokuments
   * @return mimeType
  **/
  @JsonProperty("mimeType")
  public String getMimeType() {
    if (mimeType == null) {
      return null;
    }
    return mimeType.value();
  }

  public void setMimeType(MimeTypeEnum mimeType) {
    this.mimeType = mimeType;
  }

  public DocumentWithMetadata mimeType(MimeTypeEnum mimeType) {
    this.mimeType = mimeType;
    return this;
  }

 /**
   * Art der Fachrichtung der erstellenden Einrichtung, in der das dokumentiere Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.practiceSettingCode oder aus der Tabelle in A_16944
   * @return practiceSettingCode
  **/
  @JsonProperty("practiceSettingCode")
  public String getPracticeSettingCode() {
    return practiceSettingCode;
  }

  public void setPracticeSettingCode(String practiceSettingCode) {
    this.practiceSettingCode = practiceSettingCode;
  }

  public DocumentWithMetadata practiceSettingCode(String practiceSettingCode) {
    this.practiceSettingCode = practiceSettingCode;
    return this;
  }

 /**
   * Liste von IDs, mit denen das Dokument assoziiert wird
   * @return referenceIdList
  **/
  @JsonProperty("referenceIdList")
  public List<String> getReferenceIdList() {
    return referenceIdList;
  }

  public void setReferenceIdList(List<String> referenceIdList) {
    this.referenceIdList = referenceIdList;
  }

  public DocumentWithMetadata referenceIdList(List<String> referenceIdList) {
    this.referenceIdList = referenceIdList;
    return this;
  }

  public DocumentWithMetadata addReferenceIdListItem(String referenceIdListItem) {
    this.referenceIdList.add(referenceIdListItem);
    return this;
  }

 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde.; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
   * @return serviceStartTime
  **/
  @JsonProperty("serviceStartTime")
  public Instant getServiceStartTime() {
    return serviceStartTime;
  }

  public void setServiceStartTime(Instant serviceStartTime) {
    this.serviceStartTime = serviceStartTime;
  }

  public DocumentWithMetadata serviceStartTime(Instant serviceStartTime) {
    this.serviceStartTime = serviceStartTime;
    return this;
  }

 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde.; date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
   * @return serviceStopTime
  **/
  @JsonProperty("serviceStopTime")
  public Instant getServiceStopTime() {
    return serviceStopTime;
  }

  public void setServiceStopTime(Instant serviceStopTime) {
    this.serviceStopTime = serviceStopTime;
  }

  public DocumentWithMetadata serviceStopTime(Instant serviceStopTime) {
    this.serviceStopTime = serviceStopTime;
    return this;
  }

 /**
   * Groesse des Dokuments in Bytes
   * @return size
  **/
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public DocumentWithMetadata size(Integer size) {
    this.size = size;
    return this;
  }

 /**
   * Titel des Dokuments
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public DocumentWithMetadata title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Art des Dokumentes; ein Code des in [IHE-ITI-VS] definierten Value Sets fuer DocumentEntry.typeCode
   * @return typeCode
  **/
  @JsonProperty("typeCode")
  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public DocumentWithMetadata typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

 /**
   * Eindeutige, aktenweite Kennung des Dokuments
   * @return uniqueId
  **/
  @JsonProperty("uniqueId")
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public DocumentWithMetadata uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

 /**
   * Dateiname
   * @return uri
  **/
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public DocumentWithMetadata uri(String uri) {
    this.uri = uri;
    return this;
  }

 /**
   * Dokument (Base64 kodiert)
   * @return doc
  **/
  @JsonProperty("doc")
  public byte[] getDoc() {
    return doc;
  }

  public void setDoc(byte[] doc) {
    this.doc = doc;
  }

  public DocumentWithMetadata doc(byte[] doc) {
    this.doc = doc;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentWithMetadata {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    classCode: ").append(toIndentedString(classCode)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    confidentialityCode: ").append(toIndentedString(confidentialityCode)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    eventCodeList: ").append(toIndentedString(eventCodeList)).append("\n");
    sb.append("    formatCode: ").append(toIndentedString(formatCode)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    healthcareFacilityTypeCode: ").append(toIndentedString(healthcareFacilityTypeCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    legalAuthenticator: ").append(toIndentedString(legalAuthenticator)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    practiceSettingCode: ").append(toIndentedString(practiceSettingCode)).append("\n");
    sb.append("    referenceIdList: ").append(toIndentedString(referenceIdList)).append("\n");
    sb.append("    serviceStartTime: ").append(toIndentedString(serviceStartTime)).append("\n");
    sb.append("    serviceStopTime: ").append(toIndentedString(serviceStopTime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
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

