package org.fluentcodes.ihe.gematik.fdv.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PermissionAccessCategory  {
  
public enum LevelEnum {

N(String.valueOf("N")), R(String.valueOf("R")), V(String.valueOf("V"));


    private String value;

    LevelEnum (String v) {
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
    public static LevelEnum fromValue(String value) {
        for (LevelEnum b : LevelEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "N", required = true, value = "Vertraulikeitscode (N oder R)")
 /**
   * Vertraulikeitscode (N oder R)
  **/
  private LevelEnum level = LevelEnum.N;

  @ApiModelProperty(required = true, value = "Folder Code (z.B. practitioner, patientdoc)")
 /**
   * Folder Code (z.B. practitioner, patientdoc)
  **/
  private String category;
 /**
   * Vertraulikeitscode (N oder R)
   * @return level
  **/
  @JsonProperty("level")
  @NotNull
  public String getLevel() {
    if (level == null) {
      return null;
    }
    return level.value();
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public PermissionAccessCategory level(LevelEnum level) {
    this.level = level;
    return this;
  }

 /**
   * Folder Code (z.B. practitioner, patientdoc)
   * @return category
  **/
  @JsonProperty("category")
  @NotNull
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public PermissionAccessCategory category(String category) {
    this.category = category;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionAccessCategory {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

