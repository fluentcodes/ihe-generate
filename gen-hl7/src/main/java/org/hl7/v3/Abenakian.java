
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Abenakian.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Abenakian"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="x-AAQ"/&gt;
 *     &lt;enumeration value="x-MAC"/&gt;
 *     &lt;enumeration value="x-ABE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Abenakian")
@XmlEnum
public enum Abenakian {

    @XmlEnumValue("x-AAQ")
    X_AAQ("x-AAQ"),
    @XmlEnumValue("x-MAC")
    X_MAC("x-MAC"),
    @XmlEnumValue("x-ABE")
    X_ABE("x-ABE");
    private final String value;

    Abenakian(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Abenakian fromValue(String v) {
        for (Abenakian c: Abenakian.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
