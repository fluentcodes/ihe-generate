
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArapahoGrosVentre.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ArapahoGrosVentre"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="x-ARP"/&gt;
 *     &lt;enumeration value="x-ATS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ArapahoGrosVentre")
@XmlEnum
public enum ArapahoGrosVentre {

    @XmlEnumValue("x-ARP")
    X_ARP("x-ARP"),
    @XmlEnumValue("x-ATS")
    X_ATS("x-ATS");
    private final String value;

    ArapahoGrosVentre(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArapahoGrosVentre fromValue(String v) {
        for (ArapahoGrosVentre c: ArapahoGrosVentre.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
