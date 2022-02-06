package org.fluentcodes.ihe.gematik.fdv.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.Author;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Metadaten zu einem Dokument
 **/
@ApiModel(description="Metadaten zu einem Dokument")
public class DocumentMetadata  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<Author> author = null;

  @ApiModelProperty(value = "Status eines Dokumentes")
 /**
   * Status eines Dokumentes
  **/
  private String availabilityStatus;

  @ApiModelProperty(value = "")
  private List<String> confidentialityCode = null;

  @ApiModelProperty(value = "Grobe Klassifizierung des Dokuments, einem Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.classCode")
 /**
   * Grobe Klassifizierung des Dokuments, einem Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.classCode
  **/
  private String classCode;

  @ApiModelProperty(value = "Ergänzende Hinweise in Freitext")
 /**
   * Ergänzende Hinweise in Freitext
  **/
  private String comments;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Erstellungszeitpunkt des Dokuments; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Erstellungszeitpunkt des Dokuments; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant creationTime;

  @ApiModelProperty(value = "EntryUUID eines Dokumentes")
 /**
   * EntryUUID eines Dokumentes
  **/
  private String entryUUID;

  @ApiModelProperty(value = "Ereignisse, die zur Erstellung des Dokuments geführt haben; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.eventCodeList oder aus der Tabelle in A_17540-XX")
 /**
   * Ereignisse, die zur Erstellung des Dokuments geführt haben; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.eventCodeList oder aus der Tabelle in A_17540-XX
  **/
  private List<String> eventCodeList = null;

  @ApiModelProperty(value = "Global eindeutiger Code für das Dokumentenformat; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.formatCode oder aus der Tabelle in A_14761-XX")
 /**
   * Global eindeutiger Code für das Dokumentenformat; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.formatCode oder aus der Tabelle in A_14761-XX
  **/
  private String formatCode;

  @ApiModelProperty(value = "")
  private String hash;

  @ApiModelProperty(value = "Art der Einrichtung, in der das dokumentierte Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.healthcareFacilityTypeCode")
 /**
   * Art der Einrichtung, in der das dokumentierte Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.healthcareFacilityTypeCode
  **/
  private String healthcareFacilityTypeCode;

  @ApiModelProperty(value = "Sprache, in der das Dokument abgefasst ist; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.languageCode")
 /**
   * Sprache, in der das Dokument abgefasst ist; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.languageCode
  **/
  private String languageCode;

  @ApiModelProperty(value = "Rechtlich Verantwortlicher für das Dokument")
 /**
   * Rechtlich Verantwortlicher für das Dokument
  **/
  private String legalAuthenticator;

public enum MimeTypeEnum {

APPLICATION_PDF(String.valueOf("application/pdf")), IMAGE_JPEG(String.valueOf("image/jpeg")), IMAGE_PNG(String.valueOf("image/png")), IMAGE_TIFF(String.valueOf("image/tiff")), TEXT_PLAIN(String.valueOf("text/plain")), TEXT_RTF(String.valueOf("text/rtf")), APPLICATION_XML(String.valueOf("application/xml")), APPLICATION_HL7_V3(String.valueOf("application/hl7-v3")), APPLICATION_PKCS7_MIME(String.valueOf("application/pkcs7-mime")), APPLICATION_FHIR_XML(String.valueOf("application/fhir+xml")), APPLICATION_XACML_XML(String.valueOf("application/xacml+xml"));


    private String value;

    MimeTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
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

  @ApiModelProperty(value = "Art der Fachrichtung der erstellenden Einrichtung, in der das dokumentiere Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.practiceSettingCode oder aus der Tabelle in A_16944-XX")
 /**
   * Art der Fachrichtung der erstellenden Einrichtung, in der das dokumentiere Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.practiceSettingCode oder aus der Tabelle in A_16944-XX
  **/
  private String practiceSettingCode;

  @ApiModelProperty(value = "Liste von IDs, mit denen das Dokument assoziiert wird")
 /**
   * Liste von IDs, mit denen das Dokument assoziiert wird
  **/
  private List<String> referenceIdList = null;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde.; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde.; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant serviceStartTime;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde.; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde.; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant serviceStopTime;

  @ApiModelProperty(value = "Grösse des Dokuments in Bytes")
 /**
   * Grösse des Dokuments in Bytes
  **/
  private Integer size;

  @ApiModelProperty(value = "Titel des Dokuments")
 /**
   * Titel des Dokuments
  **/
  private String title;

  @ApiModelProperty(value = "Art des Dokumentes; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.typeCode")
 /**
   * Art des Dokumentes; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.typeCode
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

  public DocumentMetadata author(List<Author> author) {
    this.author = author;
    return this;
  }

  public DocumentMetadata addAuthorItem(Author authorItem) {
    this.author.add(authorItem);
    return this;
  }

 /**
   * Status eines Dokumentes
   * @return availabilityStatus
  **/
  @JsonProperty("availabilityStatus")
  public String getAvailabilityStatus() {
    return availabilityStatus;
  }

  public void setAvailabilityStatus(String availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
  }

  public DocumentMetadata availabilityStatus(String availabilityStatus) {
    this.availabilityStatus = availabilityStatus;
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

  public DocumentMetadata confidentialityCode(List<String> confidentialityCode) {
    this.confidentialityCode = confidentialityCode;
    return this;
  }

  public DocumentMetadata addConfidentialityCodeItem(String confidentialityCodeItem) {
    this.confidentialityCode.add(confidentialityCodeItem);
    return this;
  }

 /**
   * Grobe Klassifizierung des Dokuments, einem Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.classCode
   * @return classCode
  **/
  @JsonProperty("classCode")
  public String getClassCode() {
    return classCode;
  }

  public void setClassCode(String classCode) {
    this.classCode = classCode;
  }

  public DocumentMetadata classCode(String classCode) {
    this.classCode = classCode;
    return this;
  }

 /**
   * Ergänzende Hinweise in Freitext
   * @return comments
  **/
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public DocumentMetadata comments(String comments) {
    this.comments = comments;
    return this;
  }

 /**
   * Erstellungszeitpunkt des Dokuments; date-time notation as defined by RFC 3339, section 5.6
   * @return creationTime
  **/
  @JsonProperty("creationTime")
  public Instant getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Instant creationTime) {
    this.creationTime = creationTime;
  }

  public DocumentMetadata creationTime(Instant creationTime) {
    this.creationTime = creationTime;
    return this;
  }

 /**
   * EntryUUID eines Dokumentes
   * @return entryUUID
  **/
  @JsonProperty("entryUUID")
  public String getEntryUUID() {
    return entryUUID;
  }

  public void setEntryUUID(String entryUUID) {
    this.entryUUID = entryUUID;
  }

  public DocumentMetadata entryUUID(String entryUUID) {
    this.entryUUID = entryUUID;
    return this;
  }

 /**
   * Ereignisse, die zur Erstellung des Dokuments geführt haben; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.eventCodeList oder aus der Tabelle in A_17540-XX
   * @return eventCodeList
  **/
  @JsonProperty("eventCodeList")
  public List<String> getEventCodeList() {
    return eventCodeList;
  }

  public void setEventCodeList(List<String> eventCodeList) {
    this.eventCodeList = eventCodeList;
  }

  public DocumentMetadata eventCodeList(List<String> eventCodeList) {
    this.eventCodeList = eventCodeList;
    return this;
  }

  public DocumentMetadata addEventCodeListItem(String eventCodeListItem) {
    this.eventCodeList.add(eventCodeListItem);
    return this;
  }

 /**
   * Global eindeutiger Code für das Dokumentenformat; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.formatCode oder aus der Tabelle in A_14761-XX
   * @return formatCode
  **/
  @JsonProperty("formatCode")
  public String getFormatCode() {
    return formatCode;
  }

  public void setFormatCode(String formatCode) {
    this.formatCode = formatCode;
  }

  public DocumentMetadata formatCode(String formatCode) {
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

  public DocumentMetadata hash(String hash) {
    this.hash = hash;
    return this;
  }

 /**
   * Art der Einrichtung, in der das dokumentierte Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.healthcareFacilityTypeCode
   * @return healthcareFacilityTypeCode
  **/
  @JsonProperty("healthcareFacilityTypeCode")
  public String getHealthcareFacilityTypeCode() {
    return healthcareFacilityTypeCode;
  }

  public void setHealthcareFacilityTypeCode(String healthcareFacilityTypeCode) {
    this.healthcareFacilityTypeCode = healthcareFacilityTypeCode;
  }

  public DocumentMetadata healthcareFacilityTypeCode(String healthcareFacilityTypeCode) {
    this.healthcareFacilityTypeCode = healthcareFacilityTypeCode;
    return this;
  }

 /**
   * Sprache, in der das Dokument abgefasst ist; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.languageCode
   * @return languageCode
  **/
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public DocumentMetadata languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

 /**
   * Rechtlich Verantwortlicher für das Dokument
   * @return legalAuthenticator
  **/
  @JsonProperty("legalAuthenticator")
  public String getLegalAuthenticator() {
    return legalAuthenticator;
  }

  public void setLegalAuthenticator(String legalAuthenticator) {
    this.legalAuthenticator = legalAuthenticator;
  }

  public DocumentMetadata legalAuthenticator(String legalAuthenticator) {
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

  public DocumentMetadata mimeType(MimeTypeEnum mimeType) {
    this.mimeType = mimeType;
    return this;
  }

 /**
   * Art der Fachrichtung der erstellenden Einrichtung, in der das dokumentiere Ereignis stattgefunden hat.; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.practiceSettingCode oder aus der Tabelle in A_16944-XX
   * @return practiceSettingCode
  **/
  @JsonProperty("practiceSettingCode")
  public String getPracticeSettingCode() {
    return practiceSettingCode;
  }

  public void setPracticeSettingCode(String practiceSettingCode) {
    this.practiceSettingCode = practiceSettingCode;
  }

  public DocumentMetadata practiceSettingCode(String practiceSettingCode) {
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

  public DocumentMetadata referenceIdList(List<String> referenceIdList) {
    this.referenceIdList = referenceIdList;
    return this;
  }

  public DocumentMetadata addReferenceIdListItem(String referenceIdListItem) {
    this.referenceIdList.add(referenceIdListItem);
    return this;
  }

 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde.; date-time notation as defined by RFC 3339, section 5.6
   * @return serviceStartTime
  **/
  @JsonProperty("serviceStartTime")
  public Instant getServiceStartTime() {
    return serviceStartTime;
  }

  public void setServiceStartTime(Instant serviceStartTime) {
    this.serviceStartTime = serviceStartTime;
  }

  public DocumentMetadata serviceStartTime(Instant serviceStartTime) {
    this.serviceStartTime = serviceStartTime;
    return this;
  }

 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde.; date-time notation as defined by RFC 3339, section 5.6
   * @return serviceStopTime
  **/
  @JsonProperty("serviceStopTime")
  public Instant getServiceStopTime() {
    return serviceStopTime;
  }

  public void setServiceStopTime(Instant serviceStopTime) {
    this.serviceStopTime = serviceStopTime;
  }

  public DocumentMetadata serviceStopTime(Instant serviceStopTime) {
    this.serviceStopTime = serviceStopTime;
    return this;
  }

 /**
   * Grösse des Dokuments in Bytes
   * @return size
  **/
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public DocumentMetadata size(Integer size) {
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

  public DocumentMetadata title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Art des Dokumentes; ein Code des in [IHE-ITI-VS] definierten Value Sets für DocumentEntry.typeCode
   * @return typeCode
  **/
  @JsonProperty("typeCode")
  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public DocumentMetadata typeCode(String typeCode) {
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

  public DocumentMetadata uniqueId(String uniqueId) {
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

  public DocumentMetadata uri(String uri) {
    this.uri = uri;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentMetadata {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    availabilityStatus: ").append(toIndentedString(availabilityStatus)).append("\n");
    sb.append("    confidentialityCode: ").append(toIndentedString(confidentialityCode)).append("\n");
    sb.append("    classCode: ").append(toIndentedString(classCode)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    entryUUID: ").append(toIndentedString(entryUUID)).append("\n");
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

