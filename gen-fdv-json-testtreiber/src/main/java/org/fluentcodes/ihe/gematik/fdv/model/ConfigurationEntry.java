package org.fluentcodes.ihe.gematik.fdv.model;

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

public class ConfigurationEntry  {
  
@XmlType(name="ConfigurationEntryIdEnum")
@XmlEnum(String.class)
public enum ConfigurationEntryIdEnum {

@XmlEnumValue("OwnerInsurantId") OWNERINSURANTID(String.valueOf("OwnerInsurantId")), @XmlEnumValue("OwnerFqdnProvider") OWNERFQDNPROVIDER(String.valueOf("OwnerFqdnProvider")), @XmlEnumValue("OwnerDeviceName") OWNERDEVICENAME(String.valueOf("OwnerDeviceName")), @XmlEnumValue("Representation1Name") REPRESENTATION1NAME(String.valueOf("Representation1Name")), @XmlEnumValue("Representation1InsurantId") REPRESENTATION1INSURANTID(String.valueOf("Representation1InsurantId")), @XmlEnumValue("Representation1FqdnProvider") REPRESENTATION1FQDNPROVIDER(String.valueOf("Representation1FqdnProvider")), @XmlEnumValue("Representation2Name") REPRESENTATION2NAME(String.valueOf("Representation2Name")), @XmlEnumValue("Representation2InsurantId") REPRESENTATION2INSURANTID(String.valueOf("Representation2InsurantId")), @XmlEnumValue("Representation2FqdnProvider") REPRESENTATION2FQDNPROVIDER(String.valueOf("Representation2FqdnProvider")), @XmlEnumValue("Notifcation") NOTIFCATION(String.valueOf("Notifcation")), @XmlEnumValue("NotificationPeriod") NOTIFICATIONPERIOD(String.valueOf("NotificationPeriod")), @XmlEnumValue("ShowPermissionOnAddDocuments") SHOWPERMISSIONONADDDOCUMENTS(String.valueOf("ShowPermissionOnAddDocuments")), @XmlEnumValue("UseEGK") USEEGK(String.valueOf("UseEGK"));


    private String value;

    ConfigurationEntryIdEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConfigurationEntryIdEnum fromValue(String value) {
        for (ConfigurationEntryIdEnum b : ConfigurationEntryIdEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "Schluesselwerte fuer die in A_15292 definierten Parameter, die durch den Nutzer fuer die Konfiguration des FdV eingegeben werden.; OwnerInsurantId - Versicherten-ID des Aktenkontoinhabers, Teil der Akten-ID; OwnerFqdnProvider - FQDN Anbieter ePA-Aktensystem des Aktenkontoinhabers; OwnerDeviceName - Gerätename des GdV; In der Testtreiber-Konfiguration können 2 Vertretungen eingerichtet werden.; Representation1Name - Name des zu Vertretenden; Representation1InsurantId - Versicherten-ID des zu Vertretenden, Teil der Akten-ID; Representation1FqdnProvider - FQDN Anbieter ePA-Aktensystem des zu Vertretenden; Notifcation - Benachrichtigungen aktivieren; NotificationPeriod - Benachrichtigungszeitraum; ShowPermissionOnAddDocuments - Dokumente einstellen Berechtigte anzeigen; UseEGK (boolean) - gibt an, ob fuer die Authentisierung die eGK oder die alternative kryptographische Versichertenidentitaet genutzt wird.")
 /**
   * Schluesselwerte fuer die in A_15292 definierten Parameter, die durch den Nutzer fuer die Konfiguration des FdV eingegeben werden.; OwnerInsurantId - Versicherten-ID des Aktenkontoinhabers, Teil der Akten-ID; OwnerFqdnProvider - FQDN Anbieter ePA-Aktensystem des Aktenkontoinhabers; OwnerDeviceName - Gerätename des GdV; In der Testtreiber-Konfiguration können 2 Vertretungen eingerichtet werden.; Representation1Name - Name des zu Vertretenden; Representation1InsurantId - Versicherten-ID des zu Vertretenden, Teil der Akten-ID; Representation1FqdnProvider - FQDN Anbieter ePA-Aktensystem des zu Vertretenden; Notifcation - Benachrichtigungen aktivieren; NotificationPeriod - Benachrichtigungszeitraum; ShowPermissionOnAddDocuments - Dokumente einstellen Berechtigte anzeigen; UseEGK (boolean) - gibt an, ob fuer die Authentisierung die eGK oder die alternative kryptographische Versichertenidentitaet genutzt wird.
  **/
  private ConfigurationEntryIdEnum configurationEntryId;

  @ApiModelProperty(required = true, value = "Wert fuer den Konfigurationsparameter")
 /**
   * Wert fuer den Konfigurationsparameter
  **/
  private String configurationEntryValue;
 /**
   * Schluesselwerte fuer die in A_15292 definierten Parameter, die durch den Nutzer fuer die Konfiguration des FdV eingegeben werden.; OwnerInsurantId - Versicherten-ID des Aktenkontoinhabers, Teil der Akten-ID; OwnerFqdnProvider - FQDN Anbieter ePA-Aktensystem des Aktenkontoinhabers; OwnerDeviceName - Gerätename des GdV; In der Testtreiber-Konfiguration können 2 Vertretungen eingerichtet werden.; Representation1Name - Name des zu Vertretenden; Representation1InsurantId - Versicherten-ID des zu Vertretenden, Teil der Akten-ID; Representation1FqdnProvider - FQDN Anbieter ePA-Aktensystem des zu Vertretenden; Notifcation - Benachrichtigungen aktivieren; NotificationPeriod - Benachrichtigungszeitraum; ShowPermissionOnAddDocuments - Dokumente einstellen Berechtigte anzeigen; UseEGK (boolean) - gibt an, ob fuer die Authentisierung die eGK oder die alternative kryptographische Versichertenidentitaet genutzt wird.
   * @return configurationEntryId
  **/
  @JsonProperty("configurationEntryId")
  @NotNull
  public String getConfigurationEntryId() {
    if (configurationEntryId == null) {
      return null;
    }
    return configurationEntryId.value();
  }

  public void setConfigurationEntryId(ConfigurationEntryIdEnum configurationEntryId) {
    this.configurationEntryId = configurationEntryId;
  }

  public ConfigurationEntry configurationEntryId(ConfigurationEntryIdEnum configurationEntryId) {
    this.configurationEntryId = configurationEntryId;
    return this;
  }

 /**
   * Wert fuer den Konfigurationsparameter
   * @return configurationEntryValue
  **/
  @JsonProperty("configurationEntryValue")
  @NotNull
  public String getConfigurationEntryValue() {
    return configurationEntryValue;
  }

  public void setConfigurationEntryValue(String configurationEntryValue) {
    this.configurationEntryValue = configurationEntryValue;
  }

  public ConfigurationEntry configurationEntryValue(String configurationEntryValue) {
    this.configurationEntryValue = configurationEntryValue;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationEntry {\n");
    
    sb.append("    configurationEntryId: ").append(toIndentedString(configurationEntryId)).append("\n");
    sb.append("    configurationEntryValue: ").append(toIndentedString(configurationEntryValue)).append("\n");
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

