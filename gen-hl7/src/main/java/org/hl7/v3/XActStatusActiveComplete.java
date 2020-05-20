
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActStatusActiveComplete.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActStatusActiveComplete"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActStatusActiveComplete")
@XmlEnum
public enum XActStatusActiveComplete {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("completed")
    COMPLETED("completed");
    private final String value;

    XActStatusActiveComplete(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XActStatusActiveComplete fromValue(String v) {
        for (XActStatusActiveComplete c: XActStatusActiveComplete.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
