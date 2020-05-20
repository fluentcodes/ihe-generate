
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_EncounterAdmissionUrgency.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_EncounterAdmissionUrgency"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="EL"/&gt;
 *     &lt;enumeration value="EM"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="UR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_EncounterAdmissionUrgency")
@XmlEnum
public enum XEncounterAdmissionUrgency {

    EL,
    EM,
    R,
    UR;

    public String value() {
        return name();
    }

    public static XEncounterAdmissionUrgency fromValue(String v) {
        return valueOf(v);
    }

}
