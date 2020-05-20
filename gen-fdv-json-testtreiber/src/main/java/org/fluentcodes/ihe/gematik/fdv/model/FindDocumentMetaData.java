package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
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
  * Metadaten Parameter fuer die Suche nach SubmissionSets und Dokumenten
 **/
@ApiModel(description="Metadaten Parameter fuer die Suche nach SubmissionSets und Dokumenten")
public class FindDocumentMetaData  {
  
  @ApiModelProperty(value = "")
  private List<String> xdSSubmissionSetEntryUUID = null;

  @ApiModelProperty(value = "")
  private List<String> xdSSubmissionSetUniqueId = null;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant xdSSubmissionSetSubmissionTimeFrom;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "XDSDocumentEntryCreationTimeTo, Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * XDSDocumentEntryCreationTimeTo, Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant xdSSubmissionSetSubmissionTimeTo;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryEntryUUID = null;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryUniqueId = null;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryClassCode = null;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryPracticeSettingCode = null;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant xdSDocumentEntryCreationTimeFrom;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant xdSDocumentEntryCreationTimeTo;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde. Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde. Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant xdSDocumentEntryServiceStartTimeFrom;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde. Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde. Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant xdSDocumentEntryServiceStartTimeTo;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde. Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde. Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant xdSDocumentEntryServiceStopTimeFrom;

  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde. Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6")
 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde. Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
  **/
  private Instant xdSDocumentEntryServiceStopTimeTo;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryHealthcareFacilityTypeCode = null;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryEventCodeList = null;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryConfidentialityCode = null;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryAuthorPerson = null;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryFormatCode = null;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryTypeCode = null;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryTitle = null;

  @ApiModelProperty(value = "")
  private List<String> xdSDocumentEntryAuthorInstitution = null;
 /**
   * Get xdSSubmissionSetEntryUUID
   * @return xdSSubmissionSetEntryUUID
  **/
  @JsonProperty("XDSSubmissionSetEntryUUID")
  public List<String> getXdSSubmissionSetEntryUUID() {
    return xdSSubmissionSetEntryUUID;
  }

  public void setXdSSubmissionSetEntryUUID(List<String> xdSSubmissionSetEntryUUID) {
    this.xdSSubmissionSetEntryUUID = xdSSubmissionSetEntryUUID;
  }

  public FindDocumentMetaData xdSSubmissionSetEntryUUID(List<String> xdSSubmissionSetEntryUUID) {
    this.xdSSubmissionSetEntryUUID = xdSSubmissionSetEntryUUID;
    return this;
  }

  public FindDocumentMetaData addXdSSubmissionSetEntryUUIDItem(String xdSSubmissionSetEntryUUIDItem) {
    this.xdSSubmissionSetEntryUUID.add(xdSSubmissionSetEntryUUIDItem);
    return this;
  }

 /**
   * Get xdSSubmissionSetUniqueId
   * @return xdSSubmissionSetUniqueId
  **/
  @JsonProperty("XDSSubmissionSetUniqueId")
  public List<String> getXdSSubmissionSetUniqueId() {
    return xdSSubmissionSetUniqueId;
  }

  public void setXdSSubmissionSetUniqueId(List<String> xdSSubmissionSetUniqueId) {
    this.xdSSubmissionSetUniqueId = xdSSubmissionSetUniqueId;
  }

  public FindDocumentMetaData xdSSubmissionSetUniqueId(List<String> xdSSubmissionSetUniqueId) {
    this.xdSSubmissionSetUniqueId = xdSSubmissionSetUniqueId;
    return this;
  }

  public FindDocumentMetaData addXdSSubmissionSetUniqueIdItem(String xdSSubmissionSetUniqueIdItem) {
    this.xdSSubmissionSetUniqueId.add(xdSSubmissionSetUniqueIdItem);
    return this;
  }

 /**
   * Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
   * @return xdSSubmissionSetSubmissionTimeFrom
  **/
  @JsonProperty("XDSSubmissionSetSubmissionTimeFrom")
  public Instant getXdSSubmissionSetSubmissionTimeFrom() {
    return xdSSubmissionSetSubmissionTimeFrom;
  }

  public void setXdSSubmissionSetSubmissionTimeFrom(Instant xdSSubmissionSetSubmissionTimeFrom) {
    this.xdSSubmissionSetSubmissionTimeFrom = xdSSubmissionSetSubmissionTimeFrom;
  }

  public FindDocumentMetaData xdSSubmissionSetSubmissionTimeFrom(Instant xdSSubmissionSetSubmissionTimeFrom) {
    this.xdSSubmissionSetSubmissionTimeFrom = xdSSubmissionSetSubmissionTimeFrom;
    return this;
  }

 /**
   * XDSDocumentEntryCreationTimeTo, Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
   * @return xdSSubmissionSetSubmissionTimeTo
  **/
  @JsonProperty("XDSSubmissionSetSubmissionTimeTo")
  public Instant getXdSSubmissionSetSubmissionTimeTo() {
    return xdSSubmissionSetSubmissionTimeTo;
  }

  public void setXdSSubmissionSetSubmissionTimeTo(Instant xdSSubmissionSetSubmissionTimeTo) {
    this.xdSSubmissionSetSubmissionTimeTo = xdSSubmissionSetSubmissionTimeTo;
  }

  public FindDocumentMetaData xdSSubmissionSetSubmissionTimeTo(Instant xdSSubmissionSetSubmissionTimeTo) {
    this.xdSSubmissionSetSubmissionTimeTo = xdSSubmissionSetSubmissionTimeTo;
    return this;
  }

 /**
   * Get xdSDocumentEntryEntryUUID
   * @return xdSDocumentEntryEntryUUID
  **/
  @JsonProperty("XDSDocumentEntryEntryUUID")
  public List<String> getXdSDocumentEntryEntryUUID() {
    return xdSDocumentEntryEntryUUID;
  }

  public void setXdSDocumentEntryEntryUUID(List<String> xdSDocumentEntryEntryUUID) {
    this.xdSDocumentEntryEntryUUID = xdSDocumentEntryEntryUUID;
  }

  public FindDocumentMetaData xdSDocumentEntryEntryUUID(List<String> xdSDocumentEntryEntryUUID) {
    this.xdSDocumentEntryEntryUUID = xdSDocumentEntryEntryUUID;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryEntryUUIDItem(String xdSDocumentEntryEntryUUIDItem) {
    this.xdSDocumentEntryEntryUUID.add(xdSDocumentEntryEntryUUIDItem);
    return this;
  }

 /**
   * Get xdSDocumentEntryUniqueId
   * @return xdSDocumentEntryUniqueId
  **/
  @JsonProperty("XDSDocumentEntryUniqueId")
  public List<String> getXdSDocumentEntryUniqueId() {
    return xdSDocumentEntryUniqueId;
  }

  public void setXdSDocumentEntryUniqueId(List<String> xdSDocumentEntryUniqueId) {
    this.xdSDocumentEntryUniqueId = xdSDocumentEntryUniqueId;
  }

  public FindDocumentMetaData xdSDocumentEntryUniqueId(List<String> xdSDocumentEntryUniqueId) {
    this.xdSDocumentEntryUniqueId = xdSDocumentEntryUniqueId;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryUniqueIdItem(String xdSDocumentEntryUniqueIdItem) {
    this.xdSDocumentEntryUniqueId.add(xdSDocumentEntryUniqueIdItem);
    return this;
  }

 /**
   * Get xdSDocumentEntryClassCode
   * @return xdSDocumentEntryClassCode
  **/
  @JsonProperty("XDSDocumentEntryClassCode")
  public List<String> getXdSDocumentEntryClassCode() {
    return xdSDocumentEntryClassCode;
  }

  public void setXdSDocumentEntryClassCode(List<String> xdSDocumentEntryClassCode) {
    this.xdSDocumentEntryClassCode = xdSDocumentEntryClassCode;
  }

  public FindDocumentMetaData xdSDocumentEntryClassCode(List<String> xdSDocumentEntryClassCode) {
    this.xdSDocumentEntryClassCode = xdSDocumentEntryClassCode;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryClassCodeItem(String xdSDocumentEntryClassCodeItem) {
    this.xdSDocumentEntryClassCode.add(xdSDocumentEntryClassCodeItem);
    return this;
  }

 /**
   * Get xdSDocumentEntryPracticeSettingCode
   * @return xdSDocumentEntryPracticeSettingCode
  **/
  @JsonProperty("XDSDocumentEntryPracticeSettingCode")
  public List<String> getXdSDocumentEntryPracticeSettingCode() {
    return xdSDocumentEntryPracticeSettingCode;
  }

  public void setXdSDocumentEntryPracticeSettingCode(List<String> xdSDocumentEntryPracticeSettingCode) {
    this.xdSDocumentEntryPracticeSettingCode = xdSDocumentEntryPracticeSettingCode;
  }

  public FindDocumentMetaData xdSDocumentEntryPracticeSettingCode(List<String> xdSDocumentEntryPracticeSettingCode) {
    this.xdSDocumentEntryPracticeSettingCode = xdSDocumentEntryPracticeSettingCode;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryPracticeSettingCodeItem(String xdSDocumentEntryPracticeSettingCodeItem) {
    this.xdSDocumentEntryPracticeSettingCode.add(xdSDocumentEntryPracticeSettingCodeItem);
    return this;
  }

 /**
   * Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
   * @return xdSDocumentEntryCreationTimeFrom
  **/
  @JsonProperty("XDSDocumentEntryCreationTimeFrom")
  public Instant getXdSDocumentEntryCreationTimeFrom() {
    return xdSDocumentEntryCreationTimeFrom;
  }

  public void setXdSDocumentEntryCreationTimeFrom(Instant xdSDocumentEntryCreationTimeFrom) {
    this.xdSDocumentEntryCreationTimeFrom = xdSDocumentEntryCreationTimeFrom;
  }

  public FindDocumentMetaData xdSDocumentEntryCreationTimeFrom(Instant xdSDocumentEntryCreationTimeFrom) {
    this.xdSDocumentEntryCreationTimeFrom = xdSDocumentEntryCreationTimeFrom;
    return this;
  }

 /**
   * Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
   * @return xdSDocumentEntryCreationTimeTo
  **/
  @JsonProperty("XDSDocumentEntryCreationTimeTo")
  public Instant getXdSDocumentEntryCreationTimeTo() {
    return xdSDocumentEntryCreationTimeTo;
  }

  public void setXdSDocumentEntryCreationTimeTo(Instant xdSDocumentEntryCreationTimeTo) {
    this.xdSDocumentEntryCreationTimeTo = xdSDocumentEntryCreationTimeTo;
  }

  public FindDocumentMetaData xdSDocumentEntryCreationTimeTo(Instant xdSDocumentEntryCreationTimeTo) {
    this.xdSDocumentEntryCreationTimeTo = xdSDocumentEntryCreationTimeTo;
    return this;
  }

 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde. Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
   * @return xdSDocumentEntryServiceStartTimeFrom
  **/
  @JsonProperty("XDSDocumentEntryServiceStartTimeFrom")
  public Instant getXdSDocumentEntryServiceStartTimeFrom() {
    return xdSDocumentEntryServiceStartTimeFrom;
  }

  public void setXdSDocumentEntryServiceStartTimeFrom(Instant xdSDocumentEntryServiceStartTimeFrom) {
    this.xdSDocumentEntryServiceStartTimeFrom = xdSDocumentEntryServiceStartTimeFrom;
  }

  public FindDocumentMetaData xdSDocumentEntryServiceStartTimeFrom(Instant xdSDocumentEntryServiceStartTimeFrom) {
    this.xdSDocumentEntryServiceStartTimeFrom = xdSDocumentEntryServiceStartTimeFrom;
    return this;
  }

 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis begonnen wurde. Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
   * @return xdSDocumentEntryServiceStartTimeTo
  **/
  @JsonProperty("XDSDocumentEntryServiceStartTimeTo")
  public Instant getXdSDocumentEntryServiceStartTimeTo() {
    return xdSDocumentEntryServiceStartTimeTo;
  }

  public void setXdSDocumentEntryServiceStartTimeTo(Instant xdSDocumentEntryServiceStartTimeTo) {
    this.xdSDocumentEntryServiceStartTimeTo = xdSDocumentEntryServiceStartTimeTo;
  }

  public FindDocumentMetaData xdSDocumentEntryServiceStartTimeTo(Instant xdSDocumentEntryServiceStartTimeTo) {
    this.xdSDocumentEntryServiceStartTimeTo = xdSDocumentEntryServiceStartTimeTo;
    return this;
  }

 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde. Beginn Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
   * @return xdSDocumentEntryServiceStopTimeFrom
  **/
  @JsonProperty("XDSDocumentEntryServiceStopTimeFrom")
  public Instant getXdSDocumentEntryServiceStopTimeFrom() {
    return xdSDocumentEntryServiceStopTimeFrom;
  }

  public void setXdSDocumentEntryServiceStopTimeFrom(Instant xdSDocumentEntryServiceStopTimeFrom) {
    this.xdSDocumentEntryServiceStopTimeFrom = xdSDocumentEntryServiceStopTimeFrom;
  }

  public FindDocumentMetaData xdSDocumentEntryServiceStopTimeFrom(Instant xdSDocumentEntryServiceStopTimeFrom) {
    this.xdSDocumentEntryServiceStopTimeFrom = xdSDocumentEntryServiceStopTimeFrom;
    return this;
  }

 /**
   * Zeitpunkt, an dem das im Dokument dokumentierte (Behandlungs-)Ereignis beendet wurde. Ende Zeitraum fuer Suche; date-time notation as defined by RFC 3339, section 5.6
   * @return xdSDocumentEntryServiceStopTimeTo
  **/
  @JsonProperty("XDSDocumentEntryServiceStopTimeTo")
  public Instant getXdSDocumentEntryServiceStopTimeTo() {
    return xdSDocumentEntryServiceStopTimeTo;
  }

  public void setXdSDocumentEntryServiceStopTimeTo(Instant xdSDocumentEntryServiceStopTimeTo) {
    this.xdSDocumentEntryServiceStopTimeTo = xdSDocumentEntryServiceStopTimeTo;
  }

  public FindDocumentMetaData xdSDocumentEntryServiceStopTimeTo(Instant xdSDocumentEntryServiceStopTimeTo) {
    this.xdSDocumentEntryServiceStopTimeTo = xdSDocumentEntryServiceStopTimeTo;
    return this;
  }

 /**
   * Get xdSDocumentEntryHealthcareFacilityTypeCode
   * @return xdSDocumentEntryHealthcareFacilityTypeCode
  **/
  @JsonProperty("XDSDocumentEntryHealthcareFacilityTypeCode")
  public List<String> getXdSDocumentEntryHealthcareFacilityTypeCode() {
    return xdSDocumentEntryHealthcareFacilityTypeCode;
  }

  public void setXdSDocumentEntryHealthcareFacilityTypeCode(List<String> xdSDocumentEntryHealthcareFacilityTypeCode) {
    this.xdSDocumentEntryHealthcareFacilityTypeCode = xdSDocumentEntryHealthcareFacilityTypeCode;
  }

  public FindDocumentMetaData xdSDocumentEntryHealthcareFacilityTypeCode(List<String> xdSDocumentEntryHealthcareFacilityTypeCode) {
    this.xdSDocumentEntryHealthcareFacilityTypeCode = xdSDocumentEntryHealthcareFacilityTypeCode;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryHealthcareFacilityTypeCodeItem(String xdSDocumentEntryHealthcareFacilityTypeCodeItem) {
    this.xdSDocumentEntryHealthcareFacilityTypeCode.add(xdSDocumentEntryHealthcareFacilityTypeCodeItem);
    return this;
  }

 /**
   * Get xdSDocumentEntryEventCodeList
   * @return xdSDocumentEntryEventCodeList
  **/
  @JsonProperty("XDSDocumentEntryEventCodeList")
  public List<String> getXdSDocumentEntryEventCodeList() {
    return xdSDocumentEntryEventCodeList;
  }

  public void setXdSDocumentEntryEventCodeList(List<String> xdSDocumentEntryEventCodeList) {
    this.xdSDocumentEntryEventCodeList = xdSDocumentEntryEventCodeList;
  }

  public FindDocumentMetaData xdSDocumentEntryEventCodeList(List<String> xdSDocumentEntryEventCodeList) {
    this.xdSDocumentEntryEventCodeList = xdSDocumentEntryEventCodeList;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryEventCodeListItem(String xdSDocumentEntryEventCodeListItem) {
    this.xdSDocumentEntryEventCodeList.add(xdSDocumentEntryEventCodeListItem);
    return this;
  }

 /**
   * Get xdSDocumentEntryConfidentialityCode
   * @return xdSDocumentEntryConfidentialityCode
  **/
  @JsonProperty("XDSDocumentEntryConfidentialityCode")
  public List<String> getXdSDocumentEntryConfidentialityCode() {
    return xdSDocumentEntryConfidentialityCode;
  }

  public void setXdSDocumentEntryConfidentialityCode(List<String> xdSDocumentEntryConfidentialityCode) {
    this.xdSDocumentEntryConfidentialityCode = xdSDocumentEntryConfidentialityCode;
  }

  public FindDocumentMetaData xdSDocumentEntryConfidentialityCode(List<String> xdSDocumentEntryConfidentialityCode) {
    this.xdSDocumentEntryConfidentialityCode = xdSDocumentEntryConfidentialityCode;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryConfidentialityCodeItem(String xdSDocumentEntryConfidentialityCodeItem) {
    this.xdSDocumentEntryConfidentialityCode.add(xdSDocumentEntryConfidentialityCodeItem);
    return this;
  }

 /**
   * Get xdSDocumentEntryAuthorPerson
   * @return xdSDocumentEntryAuthorPerson
  **/
  @JsonProperty("XDSDocumentEntryAuthorPerson")
  public List<String> getXdSDocumentEntryAuthorPerson() {
    return xdSDocumentEntryAuthorPerson;
  }

  public void setXdSDocumentEntryAuthorPerson(List<String> xdSDocumentEntryAuthorPerson) {
    this.xdSDocumentEntryAuthorPerson = xdSDocumentEntryAuthorPerson;
  }

  public FindDocumentMetaData xdSDocumentEntryAuthorPerson(List<String> xdSDocumentEntryAuthorPerson) {
    this.xdSDocumentEntryAuthorPerson = xdSDocumentEntryAuthorPerson;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryAuthorPersonItem(String xdSDocumentEntryAuthorPersonItem) {
    this.xdSDocumentEntryAuthorPerson.add(xdSDocumentEntryAuthorPersonItem);
    return this;
  }

 /**
   * Get xdSDocumentEntryFormatCode
   * @return xdSDocumentEntryFormatCode
  **/
  @JsonProperty("XDSDocumentEntryFormatCode")
  public List<String> getXdSDocumentEntryFormatCode() {
    return xdSDocumentEntryFormatCode;
  }

  public void setXdSDocumentEntryFormatCode(List<String> xdSDocumentEntryFormatCode) {
    this.xdSDocumentEntryFormatCode = xdSDocumentEntryFormatCode;
  }

  public FindDocumentMetaData xdSDocumentEntryFormatCode(List<String> xdSDocumentEntryFormatCode) {
    this.xdSDocumentEntryFormatCode = xdSDocumentEntryFormatCode;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryFormatCodeItem(String xdSDocumentEntryFormatCodeItem) {
    this.xdSDocumentEntryFormatCode.add(xdSDocumentEntryFormatCodeItem);
    return this;
  }

 /**
   * Get xdSDocumentEntryTypeCode
   * @return xdSDocumentEntryTypeCode
  **/
  @JsonProperty("XDSDocumentEntryTypeCode")
  public List<String> getXdSDocumentEntryTypeCode() {
    return xdSDocumentEntryTypeCode;
  }

  public void setXdSDocumentEntryTypeCode(List<String> xdSDocumentEntryTypeCode) {
    this.xdSDocumentEntryTypeCode = xdSDocumentEntryTypeCode;
  }

  public FindDocumentMetaData xdSDocumentEntryTypeCode(List<String> xdSDocumentEntryTypeCode) {
    this.xdSDocumentEntryTypeCode = xdSDocumentEntryTypeCode;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryTypeCodeItem(String xdSDocumentEntryTypeCodeItem) {
    this.xdSDocumentEntryTypeCode.add(xdSDocumentEntryTypeCodeItem);
    return this;
  }

 /**
   * Get xdSDocumentEntryTitle
   * @return xdSDocumentEntryTitle
  **/
  @JsonProperty("XDSDocumentEntryTitle")
  public List<String> getXdSDocumentEntryTitle() {
    return xdSDocumentEntryTitle;
  }

  public void setXdSDocumentEntryTitle(List<String> xdSDocumentEntryTitle) {
    this.xdSDocumentEntryTitle = xdSDocumentEntryTitle;
  }

  public FindDocumentMetaData xdSDocumentEntryTitle(List<String> xdSDocumentEntryTitle) {
    this.xdSDocumentEntryTitle = xdSDocumentEntryTitle;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryTitleItem(String xdSDocumentEntryTitleItem) {
    this.xdSDocumentEntryTitle.add(xdSDocumentEntryTitleItem);
    return this;
  }

 /**
   * Get xdSDocumentEntryAuthorInstitution
   * @return xdSDocumentEntryAuthorInstitution
  **/
  @JsonProperty("XDSDocumentEntryAuthorInstitution")
  public List<String> getXdSDocumentEntryAuthorInstitution() {
    return xdSDocumentEntryAuthorInstitution;
  }

  public void setXdSDocumentEntryAuthorInstitution(List<String> xdSDocumentEntryAuthorInstitution) {
    this.xdSDocumentEntryAuthorInstitution = xdSDocumentEntryAuthorInstitution;
  }

  public FindDocumentMetaData xdSDocumentEntryAuthorInstitution(List<String> xdSDocumentEntryAuthorInstitution) {
    this.xdSDocumentEntryAuthorInstitution = xdSDocumentEntryAuthorInstitution;
    return this;
  }

  public FindDocumentMetaData addXdSDocumentEntryAuthorInstitutionItem(String xdSDocumentEntryAuthorInstitutionItem) {
    this.xdSDocumentEntryAuthorInstitution.add(xdSDocumentEntryAuthorInstitutionItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindDocumentMetaData {\n");
    
    sb.append("    xdSSubmissionSetEntryUUID: ").append(toIndentedString(xdSSubmissionSetEntryUUID)).append("\n");
    sb.append("    xdSSubmissionSetUniqueId: ").append(toIndentedString(xdSSubmissionSetUniqueId)).append("\n");
    sb.append("    xdSSubmissionSetSubmissionTimeFrom: ").append(toIndentedString(xdSSubmissionSetSubmissionTimeFrom)).append("\n");
    sb.append("    xdSSubmissionSetSubmissionTimeTo: ").append(toIndentedString(xdSSubmissionSetSubmissionTimeTo)).append("\n");
    sb.append("    xdSDocumentEntryEntryUUID: ").append(toIndentedString(xdSDocumentEntryEntryUUID)).append("\n");
    sb.append("    xdSDocumentEntryUniqueId: ").append(toIndentedString(xdSDocumentEntryUniqueId)).append("\n");
    sb.append("    xdSDocumentEntryClassCode: ").append(toIndentedString(xdSDocumentEntryClassCode)).append("\n");
    sb.append("    xdSDocumentEntryPracticeSettingCode: ").append(toIndentedString(xdSDocumentEntryPracticeSettingCode)).append("\n");
    sb.append("    xdSDocumentEntryCreationTimeFrom: ").append(toIndentedString(xdSDocumentEntryCreationTimeFrom)).append("\n");
    sb.append("    xdSDocumentEntryCreationTimeTo: ").append(toIndentedString(xdSDocumentEntryCreationTimeTo)).append("\n");
    sb.append("    xdSDocumentEntryServiceStartTimeFrom: ").append(toIndentedString(xdSDocumentEntryServiceStartTimeFrom)).append("\n");
    sb.append("    xdSDocumentEntryServiceStartTimeTo: ").append(toIndentedString(xdSDocumentEntryServiceStartTimeTo)).append("\n");
    sb.append("    xdSDocumentEntryServiceStopTimeFrom: ").append(toIndentedString(xdSDocumentEntryServiceStopTimeFrom)).append("\n");
    sb.append("    xdSDocumentEntryServiceStopTimeTo: ").append(toIndentedString(xdSDocumentEntryServiceStopTimeTo)).append("\n");
    sb.append("    xdSDocumentEntryHealthcareFacilityTypeCode: ").append(toIndentedString(xdSDocumentEntryHealthcareFacilityTypeCode)).append("\n");
    sb.append("    xdSDocumentEntryEventCodeList: ").append(toIndentedString(xdSDocumentEntryEventCodeList)).append("\n");
    sb.append("    xdSDocumentEntryConfidentialityCode: ").append(toIndentedString(xdSDocumentEntryConfidentialityCode)).append("\n");
    sb.append("    xdSDocumentEntryAuthorPerson: ").append(toIndentedString(xdSDocumentEntryAuthorPerson)).append("\n");
    sb.append("    xdSDocumentEntryFormatCode: ").append(toIndentedString(xdSDocumentEntryFormatCode)).append("\n");
    sb.append("    xdSDocumentEntryTypeCode: ").append(toIndentedString(xdSDocumentEntryTypeCode)).append("\n");
    sb.append("    xdSDocumentEntryTitle: ").append(toIndentedString(xdSDocumentEntryTitle)).append("\n");
    sb.append("    xdSDocumentEntryAuthorInstitution: ").append(toIndentedString(xdSDocumentEntryAuthorInstitution)).append("\n");
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

