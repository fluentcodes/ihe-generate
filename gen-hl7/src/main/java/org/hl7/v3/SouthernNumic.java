
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SouthernNumic.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SouthernNumic"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="x-KAW"/&gt;
 *     &lt;enumeration value="x-UTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SouthernNumic")
@XmlEnum
public enum SouthernNumic {

    @XmlEnumValue("x-KAW")
    X_KAW("x-KAW"),
    @XmlEnumValue("x-UTE")
    X_UTE("x-UTE");
    private final String value;

    SouthernNumic(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SouthernNumic fromValue(String v) {
        for (SouthernNumic c: SouthernNumic.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
