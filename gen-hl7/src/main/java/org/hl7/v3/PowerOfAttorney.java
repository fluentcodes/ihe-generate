
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PowerOfAttorney.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PowerOfAttorney"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="POWATT"/&gt;
 *     &lt;enumeration value="DPOWATT"/&gt;
 *     &lt;enumeration value="HPOWATT"/&gt;
 *     &lt;enumeration value="SPOWATT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PowerOfAttorney")
@XmlEnum
public enum PowerOfAttorney {

    POWATT,
    DPOWATT,
    HPOWATT,
    SPOWATT;

    public String value() {
        return name();
    }

    public static PowerOfAttorney fromValue(String v) {
        return valueOf(v);
    }

}
