
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParticipationTargetLocation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationTargetLocation"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="DST"/&gt;
 *     &lt;enumeration value="ELOC"/&gt;
 *     &lt;enumeration value="ORG"/&gt;
 *     &lt;enumeration value="RML"/&gt;
 *     &lt;enumeration value="VIA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationTargetLocation")
@XmlEnum
public enum ParticipationTargetLocation {

    LOC,
    DST,
    ELOC,
    ORG,
    RML,
    VIA;

    public String value() {
        return name();
    }

    public static ParticipationTargetLocation fromValue(String v) {
        return valueOf(v);
    }

}
