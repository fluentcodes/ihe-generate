
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für WesternMuskogean.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="WesternMuskogean"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="x-CIC"/&gt;
 *     &lt;enumeration value="x-CCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WesternMuskogean")
@XmlEnum
public enum WesternMuskogean {

    @XmlEnumValue("x-CIC")
    X_CIC("x-CIC"),
    @XmlEnumValue("x-CCT")
    X_CCT("x-CCT");
    private final String value;

    WesternMuskogean(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WesternMuskogean fromValue(String v) {
        for (WesternMuskogean c: WesternMuskogean.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
