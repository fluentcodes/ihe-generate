
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParticipationPhysicalPerformer.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationPhysicalPerformer"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="PRF"/&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="PPRF"/&gt;
 *     &lt;enumeration value="SPRF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationPhysicalPerformer")
@XmlEnum
public enum ParticipationPhysicalPerformer {

    PRF,
    DIST,
    PPRF,
    SPRF;

    public String value() {
        return name();
    }

    public static ParticipationPhysicalPerformer fromValue(String v) {
        return valueOf(v);
    }

}
