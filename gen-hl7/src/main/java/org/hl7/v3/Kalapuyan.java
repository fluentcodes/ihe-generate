
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Kalapuyan.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Kalapuyan"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="x-KAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Kalapuyan")
@XmlEnum
public enum Kalapuyan {

    @XmlEnumValue("x-KAL")
    X_KAL("x-KAL");
    private final String value;

    Kalapuyan(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Kalapuyan fromValue(String v) {
        for (Kalapuyan c: Kalapuyan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
