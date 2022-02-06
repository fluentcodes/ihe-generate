package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Eingangsdaten für den Anwendungsfall Login sowie für das implizite Login vor weiteren Anwendungsfällen
 **/
@ApiModel(description="Eingangsdaten für den Anwendungsfall Login sowie für das implizite Login vor weiteren Anwendungsfällen")
public class Login  {
  
  @ApiModelProperty(required = true, value = "referenziert eine Aktensession, in der die Operation ausgeführt werden soll; Wenn keine Aktensession besteht, dann muss für dieses Aktenkonto (entspricht OwnerInsurantId oder RepresentationXInsurantId in der Konfiguration) eine Aktensession eröffnet werden (implizites Login).")
 /**
   * referenziert eine Aktensession, in der die Operation ausgeführt werden soll; Wenn keine Aktensession besteht, dann muss für dieses Aktenkonto (entspricht OwnerInsurantId oder RepresentationXInsurantId in der Konfiguration) eine Aktensession eröffnet werden (implizites Login).
  **/
  private String account;

  @ApiModelProperty(value = "Versicherten-ID des Nutzers (Aktenkontoinhaber oder Vertreter) des FdV; Wenn dieser Parameter gesetzt ist, dann wird für die Authentisierung entsprechend dem Konfigurationsparameter useEGK eine angebundene eGK oder der Signaturdienst genutzt.; Wenn  dieser Parameter gesetzt ist, dann werden die Parameter pkcs12, passwordPrivateKey und passwordKeyStore ignoriert.")
 /**
   * Versicherten-ID des Nutzers (Aktenkontoinhaber oder Vertreter) des FdV; Wenn dieser Parameter gesetzt ist, dann wird für die Authentisierung entsprechend dem Konfigurationsparameter useEGK eine angebundene eGK oder der Signaturdienst genutzt.; Wenn  dieser Parameter gesetzt ist, dann werden die Parameter pkcs12, passwordPrivateKey und passwordKeyStore ignoriert.
  **/
  private String insurantId;

  @ApiModelProperty(value = "C.CH.AUT-Zertifikat des Nutzers mit private Key im pkcs12 Format; Aus dem C.CH.AUT-Zertifikat wird die Versicherten-ID des Nutzers (Aktenkontoinhaber oder Vertreter) bestimmt.; Mit dem private Key werden die Signaturen bei der Authentisierung und der Schlüsselerzeugung (SGD) erstellt")
 /**
   * C.CH.AUT-Zertifikat des Nutzers mit private Key im pkcs12 Format; Aus dem C.CH.AUT-Zertifikat wird die Versicherten-ID des Nutzers (Aktenkontoinhaber oder Vertreter) bestimmt.; Mit dem private Key werden die Signaturen bei der Authentisierung und der Schlüsselerzeugung (SGD) erstellt
  **/
  private byte[] pkcs12;

  @ApiModelProperty(value = "Passwort für private Key in pkcs12")
 /**
   * Passwort für private Key in pkcs12
  **/
  private String passwordPrivateKey;

  @ApiModelProperty(value = "")
  private String passwordKeyStore;

  @ApiModelProperty(value = "Für die Verwendung einer eGK kann die zu verwendende PIN übergeben werden.")
 /**
   * Für die Verwendung einer eGK kann die zu verwendende PIN übergeben werden.
  **/
  private Integer pin;

  @ApiModelProperty(value = "Für die Verwendung einer eGK kann die zu verwendende CAN für NFC übergeben werden.")
 /**
   * Für die Verwendung einer eGK kann die zu verwendende CAN für NFC übergeben werden.
  **/
  private String can;

  @ApiModelProperty(value = "Für die Verwendung einer alvi-Identität kann der zu verwendende Authentisierungstoken übergeben werden.")
 /**
   * Für die Verwendung einer alvi-Identität kann der zu verwendende Authentisierungstoken übergeben werden.
  **/
  private String token;
 /**
   * referenziert eine Aktensession, in der die Operation ausgeführt werden soll; Wenn keine Aktensession besteht, dann muss für dieses Aktenkonto (entspricht OwnerInsurantId oder RepresentationXInsurantId in der Konfiguration) eine Aktensession eröffnet werden (implizites Login).
   * @return account
  **/
  @JsonProperty("account")
  @NotNull
 @Size(min=10,max=10)  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Login account(String account) {
    this.account = account;
    return this;
  }

 /**
   * Versicherten-ID des Nutzers (Aktenkontoinhaber oder Vertreter) des FdV; Wenn dieser Parameter gesetzt ist, dann wird für die Authentisierung entsprechend dem Konfigurationsparameter useEGK eine angebundene eGK oder der Signaturdienst genutzt.; Wenn  dieser Parameter gesetzt ist, dann werden die Parameter pkcs12, passwordPrivateKey und passwordKeyStore ignoriert.
   * @return insurantId
  **/
  @JsonProperty("insurantId")
 @Size(min=10,max=10)  public String getInsurantId() {
    return insurantId;
  }

  public void setInsurantId(String insurantId) {
    this.insurantId = insurantId;
  }

  public Login insurantId(String insurantId) {
    this.insurantId = insurantId;
    return this;
  }

 /**
   * C.CH.AUT-Zertifikat des Nutzers mit private Key im pkcs12 Format; Aus dem C.CH.AUT-Zertifikat wird die Versicherten-ID des Nutzers (Aktenkontoinhaber oder Vertreter) bestimmt.; Mit dem private Key werden die Signaturen bei der Authentisierung und der Schlüsselerzeugung (SGD) erstellt
   * @return pkcs12
  **/
  @JsonProperty("pkcs12")
  public byte[] getPkcs12() {
    return pkcs12;
  }

  public void setPkcs12(byte[] pkcs12) {
    this.pkcs12 = pkcs12;
  }

  public Login pkcs12(byte[] pkcs12) {
    this.pkcs12 = pkcs12;
    return this;
  }

 /**
   * Passwort für private Key in pkcs12
   * @return passwordPrivateKey
  **/
  @JsonProperty("passwordPrivateKey")
  public String getPasswordPrivateKey() {
    return passwordPrivateKey;
  }

  public void setPasswordPrivateKey(String passwordPrivateKey) {
    this.passwordPrivateKey = passwordPrivateKey;
  }

  public Login passwordPrivateKey(String passwordPrivateKey) {
    this.passwordPrivateKey = passwordPrivateKey;
    return this;
  }

 /**
   * Get passwordKeyStore
   * @return passwordKeyStore
  **/
  @JsonProperty("passwordKeyStore")
  public String getPasswordKeyStore() {
    return passwordKeyStore;
  }

  public void setPasswordKeyStore(String passwordKeyStore) {
    this.passwordKeyStore = passwordKeyStore;
  }

  public Login passwordKeyStore(String passwordKeyStore) {
    this.passwordKeyStore = passwordKeyStore;
    return this;
  }

 /**
   * Für die Verwendung einer eGK kann die zu verwendende PIN übergeben werden.
   * @return pin
  **/
  @JsonProperty("pin")
  public Integer getPin() {
    return pin;
  }

  public void setPin(Integer pin) {
    this.pin = pin;
  }

  public Login pin(Integer pin) {
    this.pin = pin;
    return this;
  }

 /**
   * Für die Verwendung einer eGK kann die zu verwendende CAN für NFC übergeben werden.
   * @return can
  **/
  @JsonProperty("can")
  public String getCan() {
    return can;
  }

  public void setCan(String can) {
    this.can = can;
  }

  public Login can(String can) {
    this.can = can;
    return this;
  }

 /**
   * Für die Verwendung einer alvi-Identität kann der zu verwendende Authentisierungstoken übergeben werden.
   * @return token
  **/
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Login token(String token) {
    this.token = token;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Login {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    insurantId: ").append(toIndentedString(insurantId)).append("\n");
    sb.append("    pkcs12: ").append(toIndentedString(pkcs12)).append("\n");
    sb.append("    passwordPrivateKey: ").append(toIndentedString(passwordPrivateKey)).append("\n");
    sb.append("    passwordKeyStore: ").append(toIndentedString(passwordKeyStore)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    can: ").append(toIndentedString(can)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

