
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_EncounterParticipant.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_EncounterParticipant"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="ADM"/&gt;
 *     &lt;enumeration value="ATND"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="REF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_EncounterParticipant")
@XmlEnum
public enum XEncounterParticipant {

    ADM,
    ATND,
    CON,
    DIS,
    REF;

    public String value() {
        return name();
    }

    public static XEncounterParticipant fromValue(String v) {
        return valueOf(v);
    }

}
