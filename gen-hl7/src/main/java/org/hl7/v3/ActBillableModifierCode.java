
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActBillableModifierCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActBillableModifierCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CPTM"/&gt;
 *     &lt;enumeration value="HCPCSA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActBillableModifierCode")
@XmlEnum
public enum ActBillableModifierCode {

    CPTM,
    HCPCSA;

    public String value() {
        return name();
    }

    public static ActBillableModifierCode fromValue(String v) {
        return valueOf(v);
    }

}
