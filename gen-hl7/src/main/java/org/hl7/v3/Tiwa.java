
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Tiwa.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Tiwa"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="x-TAO"/&gt;
 *     &lt;enumeration value="x-TIX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Tiwa")
@XmlEnum
public enum Tiwa {

    @XmlEnumValue("x-TAO")
    X_TAO("x-TAO"),
    @XmlEnumValue("x-TIX")
    X_TIX("x-TIX");
    private final String value;

    Tiwa(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Tiwa fromValue(String v) {
        for (Tiwa c: Tiwa.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
