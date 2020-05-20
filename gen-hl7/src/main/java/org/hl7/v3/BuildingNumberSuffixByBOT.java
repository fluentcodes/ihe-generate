
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BuildingNumberSuffixByBOT.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BuildingNumberSuffixByBOT"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="BNS"/&gt;
 *     &lt;enumeration value="POB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BuildingNumberSuffixByBOT")
@XmlEnum
public enum BuildingNumberSuffixByBOT {

    BNS,
    POB;

    public String value() {
        return name();
    }

    public static BuildingNumberSuffixByBOT fromValue(String v) {
        return valueOf(v);
    }

}
