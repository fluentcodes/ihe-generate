
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CodingRationale.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CodingRationale"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SH"/&gt;
 *     &lt;enumeration value="HL7"/&gt;
 *     &lt;enumeration value="SRC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CodingRationale")
@XmlEnum
public enum CodingRationale {

    SH("SH"),
    @XmlEnumValue("HL7")
    HL_7("HL7"),
    SRC("SRC");
    private final String value;

    CodingRationale(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodingRationale fromValue(String v) {
        for (CodingRationale c: CodingRationale.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
