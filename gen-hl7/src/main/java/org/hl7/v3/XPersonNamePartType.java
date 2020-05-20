
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_PersonNamePartType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_PersonNamePartType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DEL"/&gt;
 *     &lt;enumeration value="FAM"/&gt;
 *     &lt;enumeration value="GIV"/&gt;
 *     &lt;enumeration value="PFX"/&gt;
 *     &lt;enumeration value="SFX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_PersonNamePartType")
@XmlEnum
public enum XPersonNamePartType {

    DEL,
    FAM,
    GIV,
    PFX,
    SFX;

    public String value() {
        return name();
    }

    public static XPersonNamePartType fromValue(String v) {
        return valueOf(v);
    }

}
