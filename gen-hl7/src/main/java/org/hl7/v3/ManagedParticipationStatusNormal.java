
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ManagedParticipationStatusNormal.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ManagedParticipationStatusNormal"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *     &lt;enumeration value="pending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ManagedParticipationStatusNormal")
@XmlEnum
public enum ManagedParticipationStatusNormal {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("completed")
    COMPLETED("completed"),
    @XmlEnumValue("pending")
    PENDING("pending");
    private final String value;

    ManagedParticipationStatusNormal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManagedParticipationStatusNormal fromValue(String v) {
        for (ManagedParticipationStatusNormal c: ManagedParticipationStatusNormal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
