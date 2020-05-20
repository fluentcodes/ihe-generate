
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InuitInupiaq.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InuitInupiaq"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="x-ESI"/&gt;
 *     &lt;enumeration value="x-ESK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InuitInupiaq")
@XmlEnum
public enum InuitInupiaq {

    @XmlEnumValue("x-ESI")
    X_ESI("x-ESI"),
    @XmlEnumValue("x-ESK")
    X_ESK("x-ESK");
    private final String value;

    InuitInupiaq(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InuitInupiaq fromValue(String v) {
        for (InuitInupiaq c: InuitInupiaq.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
