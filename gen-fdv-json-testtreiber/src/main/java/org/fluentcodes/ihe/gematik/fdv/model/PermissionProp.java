package org.fluentcodes.ihe.gematik.fdv.model;

import io.swagger.annotations.ApiModel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.fluentcodes.ihe.gematik.fdv.model.PermissionAccessCategory;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Enthält alle Informationen, was genau berechtigt wurde, d.h. alle Details zur vergebenen grob-, mittel- und feingranularen Berechtigung.
 **/
@ApiModel(description="Enthält alle Informationen, was genau berechtigt wurde, d.h. alle Details zur vergebenen grob-, mittel- und feingranularen Berechtigung.")
public class PermissionProp  {
  
  @ApiModelProperty(value = "Liste von Kategorien mit Access Level Zuordnung")
  @Valid
 /**
   * Liste von Kategorien mit Access Level Zuordnung
  **/
  private List<PermissionAccessCategory> permissionAccessCategory = null;

  @ApiModelProperty(value = "Liste von EntryUUIDs von Objekten in Whitelist")
 /**
   * Liste von EntryUUIDs von Objekten in Whitelist
  **/
  private List<String> permissionAccessWhitelist = null;

  @ApiModelProperty(value = "Liste von EntryUUIDs von Objekten in Blacklist")
 /**
   * Liste von EntryUUIDs von Objekten in Blacklist
  **/
  private List<String> permissionAccessBlacklist = null;

  @ApiModelProperty(example = "Fri Jul 21 02:00:00 CEST 2017", value = "Zugriff gültig bis einschließlich; full-date notation as defined by RFC 3339, section 5.6. Wenn keine Datum definiert wird, wird die Policy zeitlich umbegrenzt.")
 /**
   * Zugriff gültig bis einschließlich; full-date notation as defined by RFC 3339, section 5.6. Wenn keine Datum definiert wird, wird die Policy zeitlich umbegrenzt.
  **/
  private LocalDate validThrough;
 /**
   * Liste von Kategorien mit Access Level Zuordnung
   * @return permissionAccessCategory
  **/
  @JsonProperty("permissionAccessCategory")
  public List<PermissionAccessCategory> getPermissionAccessCategory() {
    return permissionAccessCategory;
  }

  public void setPermissionAccessCategory(List<PermissionAccessCategory> permissionAccessCategory) {
    this.permissionAccessCategory = permissionAccessCategory;
  }

  public PermissionProp permissionAccessCategory(List<PermissionAccessCategory> permissionAccessCategory) {
    this.permissionAccessCategory = permissionAccessCategory;
    return this;
  }

  public PermissionProp addPermissionAccessCategoryItem(PermissionAccessCategory permissionAccessCategoryItem) {
    this.permissionAccessCategory.add(permissionAccessCategoryItem);
    return this;
  }

 /**
   * Liste von EntryUUIDs von Objekten in Whitelist
   * @return permissionAccessWhitelist
  **/
  @JsonProperty("permissionAccessWhitelist")
  public List<String> getPermissionAccessWhitelist() {
    return permissionAccessWhitelist;
  }

  public void setPermissionAccessWhitelist(List<String> permissionAccessWhitelist) {
    this.permissionAccessWhitelist = permissionAccessWhitelist;
  }

  public PermissionProp permissionAccessWhitelist(List<String> permissionAccessWhitelist) {
    this.permissionAccessWhitelist = permissionAccessWhitelist;
    return this;
  }

  public PermissionProp addPermissionAccessWhitelistItem(String permissionAccessWhitelistItem) {
    this.permissionAccessWhitelist.add(permissionAccessWhitelistItem);
    return this;
  }

 /**
   * Liste von EntryUUIDs von Objekten in Blacklist
   * @return permissionAccessBlacklist
  **/
  @JsonProperty("permissionAccessBlacklist")
  public List<String> getPermissionAccessBlacklist() {
    return permissionAccessBlacklist;
  }

  public void setPermissionAccessBlacklist(List<String> permissionAccessBlacklist) {
    this.permissionAccessBlacklist = permissionAccessBlacklist;
  }

  public PermissionProp permissionAccessBlacklist(List<String> permissionAccessBlacklist) {
    this.permissionAccessBlacklist = permissionAccessBlacklist;
    return this;
  }

  public PermissionProp addPermissionAccessBlacklistItem(String permissionAccessBlacklistItem) {
    this.permissionAccessBlacklist.add(permissionAccessBlacklistItem);
    return this;
  }

 /**
   * Zugriff gültig bis einschließlich; full-date notation as defined by RFC 3339, section 5.6. Wenn keine Datum definiert wird, wird die Policy zeitlich umbegrenzt.
   * @return validThrough
  **/
  @JsonProperty("validThrough")
  public LocalDate getValidThrough() {
    return validThrough;
  }

  public void setValidThrough(LocalDate validThrough) {
    this.validThrough = validThrough;
  }

  public PermissionProp validThrough(LocalDate validThrough) {
    this.validThrough = validThrough;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionProp {\n");
    
    sb.append("    permissionAccessCategory: ").append(toIndentedString(permissionAccessCategory)).append("\n");
    sb.append("    permissionAccessWhitelist: ").append(toIndentedString(permissionAccessWhitelist)).append("\n");
    sb.append("    permissionAccessBlacklist: ").append(toIndentedString(permissionAccessBlacklist)).append("\n");
    sb.append("    validThrough: ").append(toIndentedString(validThrough)).append("\n");
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

