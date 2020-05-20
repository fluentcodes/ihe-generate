
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NebulizationInhalation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NebulizationInhalation"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="NEB"/&gt;
 *     &lt;enumeration value="NASNEB"/&gt;
 *     &lt;enumeration value="ORNEB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NebulizationInhalation")
@XmlEnum
public enum NebulizationInhalation {

    NEB,
    NASNEB,
    ORNEB;

    public String value() {
        return name();
    }

    public static NebulizationInhalation fromValue(String v) {
        return valueOf(v);
    }

}
