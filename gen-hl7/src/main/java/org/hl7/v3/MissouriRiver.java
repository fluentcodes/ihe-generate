
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MissouriRiver.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MissouriRiver"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="x-CRO"/&gt;
 *     &lt;enumeration value="x-HID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MissouriRiver")
@XmlEnum
public enum MissouriRiver {

    @XmlEnumValue("x-CRO")
    X_CRO("x-CRO"),
    @XmlEnumValue("x-HID")
    X_HID("x-HID");
    private final String value;

    MissouriRiver(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MissouriRiver fromValue(String v) {
        for (MissouriRiver c: MissouriRiver.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
