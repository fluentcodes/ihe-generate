
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für KitEntityType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="KitEntityType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="KIT"/&gt;
 *     &lt;enumeration value="SYSTM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KitEntityType")
@XmlEnum
public enum KitEntityType {

    KIT,
    SYSTM;

    public String value() {
        return name();
    }

    public static KitEntityType fromValue(String v) {
        return valueOf(v);
    }

}
