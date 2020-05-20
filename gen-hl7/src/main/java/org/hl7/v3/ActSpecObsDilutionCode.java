
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActSpecObsDilutionCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSpecObsDilutionCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="DILUTION"/&gt;
 *     &lt;enumeration value="AUTO-HIGH"/&gt;
 *     &lt;enumeration value="AUTO-LOW"/&gt;
 *     &lt;enumeration value="PRE"/&gt;
 *     &lt;enumeration value="RERUN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActSpecObsDilutionCode")
@XmlEnum
public enum ActSpecObsDilutionCode {

    DILUTION("DILUTION"),
    @XmlEnumValue("AUTO-HIGH")
    AUTO_HIGH("AUTO-HIGH"),
    @XmlEnumValue("AUTO-LOW")
    AUTO_LOW("AUTO-LOW"),
    PRE("PRE"),
    RERUN("RERUN");
    private final String value;

    ActSpecObsDilutionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActSpecObsDilutionCode fromValue(String v) {
        for (ActSpecObsDilutionCode c: ActSpecObsDilutionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
