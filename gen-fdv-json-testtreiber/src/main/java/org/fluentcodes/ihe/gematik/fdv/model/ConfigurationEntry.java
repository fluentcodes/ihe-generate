package org.fluentcodes.ihe.gematik.fdv.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigurationEntry  {
  
public enum ConfigurationEntryIdEnum {

OWNERINSURANTID(String.valueOf("OwnerInsurantId")), OWNERFQDNPROVIDER(String.valueOf("OwnerFqdnProvider")), OWNERDEVICEID(String.valueOf("OwnerDeviceId")), OWNERDEVICENAME(String.valueOf("OwnerDeviceName")), OWNERLASTLOGINDATE(String.valueOf("OwnerLastLoginDate")), REPRESENTATION1NAME(String.valueOf("Representation1Name")), REPRESENTATION1INSURANTID(String.valueOf("Representation1InsurantId")), REPRESENTATION1FQDNPROVIDER(String.valueOf("Representation1FqdnProvider")), REPRESENTATION1DEVICEID(String.valueOf("Representation1DeviceId")), REPRESENTATION1LASTLOGINDATE(String.valueOf("Representation1LastLoginDate")), REPRESENTATION2NAME(String.valueOf("Representation2Name")), REPRESENTATION2INSURANTID(String.valueOf("Representation2InsurantId")), REPRESENTATION2FQDNPROVIDER(String.valueOf("Representation2FqdnProvider")), REPRESENTATION2DEVICEID(String.valueOf("Representation2DeviceId")), REPRESENTATION2LASTLOGINDATE(String.valueOf("Representation2LastLoginDate")), NOTIFICATION(String.valueOf("Notification")), NOTIFICATIONPERIOD(String.valueOf("NotificationPeriod")), SHOWPERMISSIONONADDDOCUMENTS(String.valueOf("ShowPermissionOnAddDocuments")), USEEGK(String.valueOf("UseEGK")), SIGNATURESERVICEURL(String.valueOf("SignatureServiceURL")), DEFAULTCONFIDENTIALITYCODE(String.valueOf("DefaultConfidentialityCode"));


    private String value;

    ConfigurationEntryIdEnum (String v) {
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
    public static ConfigurationEntryIdEnum fromValue(String value) {
        for (ConfigurationEntryIdEnum b : ConfigurationEntryIdEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "Schlüsselwerte für die in A_15292-XX definierten Parameter, die durch den Nutzer für die Konfiguration des FdV eingegeben werden.; OwnerInsurantId - Versicherten-ID des Aktenkontoinhabers, Teil der Akten-ID; OwnerFqdnProvider - FQDN Anbieter ePA-Aktensystem des Aktenkontoinhabers; OwnerDeviceName - Gerätename des GdV; In der Testtreiber-Konfiguration können 2 Vertretungen eingerichtet werden.; Representation1Name - Name des zu Vertretenden; Representation1InsurantId - Versicherten-ID des zu Vertretenden, Teil der Akten-ID; Representation1FqdnProvider - FQDN Anbieter ePA-Aktensystem des zu Vertretenden; Notifcation - Benachrichtigungen aktivieren; NotificationPeriod - Benachrichtigungszeitraum; ShowPermissionOnAddDocuments - Dokumente einstellen Berechtigte anzeigen; UseEGK (boolean) - gibt an, ob für die Authentisierung die eGK oder die alternative kryptographische Versichertenidentität genutzt wird.")
 /**
   * Schlüsselwerte für die in A_15292-XX definierten Parameter, die durch den Nutzer für die Konfiguration des FdV eingegeben werden.; OwnerInsurantId - Versicherten-ID des Aktenkontoinhabers, Teil der Akten-ID; OwnerFqdnProvider - FQDN Anbieter ePA-Aktensystem des Aktenkontoinhabers; OwnerDeviceName - Gerätename des GdV; In der Testtreiber-Konfiguration können 2 Vertretungen eingerichtet werden.; Representation1Name - Name des zu Vertretenden; Representation1InsurantId - Versicherten-ID des zu Vertretenden, Teil der Akten-ID; Representation1FqdnProvider - FQDN Anbieter ePA-Aktensystem des zu Vertretenden; Notifcation - Benachrichtigungen aktivieren; NotificationPeriod - Benachrichtigungszeitraum; ShowPermissionOnAddDocuments - Dokumente einstellen Berechtigte anzeigen; UseEGK (boolean) - gibt an, ob für die Authentisierung die eGK oder die alternative kryptographische Versichertenidentität genutzt wird.
  **/
  private ConfigurationEntryIdEnum configurationEntryId;

  @ApiModelProperty(required = true, value = "Wert für den Konfigurationsparameter. für die Parameter Notification, ShowPermissionOnAddDocuments und UseEGK sind nur die Werte \"ja\" und \"nein\" zulässig.")
 /**
   * Wert für den Konfigurationsparameter. für die Parameter Notification, ShowPermissionOnAddDocuments und UseEGK sind nur die Werte \"ja\" und \"nein\" zulässig.
  **/
  private String configurationEntryValue;
 /**
   * Schlüsselwerte für die in A_15292-XX definierten Parameter, die durch den Nutzer für die Konfiguration des FdV eingegeben werden.; OwnerInsurantId - Versicherten-ID des Aktenkontoinhabers, Teil der Akten-ID; OwnerFqdnProvider - FQDN Anbieter ePA-Aktensystem des Aktenkontoinhabers; OwnerDeviceName - Gerätename des GdV; In der Testtreiber-Konfiguration können 2 Vertretungen eingerichtet werden.; Representation1Name - Name des zu Vertretenden; Representation1InsurantId - Versicherten-ID des zu Vertretenden, Teil der Akten-ID; Representation1FqdnProvider - FQDN Anbieter ePA-Aktensystem des zu Vertretenden; Notifcation - Benachrichtigungen aktivieren; NotificationPeriod - Benachrichtigungszeitraum; ShowPermissionOnAddDocuments - Dokumente einstellen Berechtigte anzeigen; UseEGK (boolean) - gibt an, ob für die Authentisierung die eGK oder die alternative kryptographische Versichertenidentität genutzt wird.
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
   * Wert für den Konfigurationsparameter. für die Parameter Notification, ShowPermissionOnAddDocuments und UseEGK sind nur die Werte \&quot;ja\&quot; und \&quot;nein\&quot; zulässig.
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

