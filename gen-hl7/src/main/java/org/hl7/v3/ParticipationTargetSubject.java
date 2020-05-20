
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParticipationTargetSubject.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationTargetSubject"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SBJ"/&gt;
 *     &lt;enumeration value="SPC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationTargetSubject")
@XmlEnum
public enum ParticipationTargetSubject {

    SBJ,
    SPC;

    public String value() {
        return name();
    }

    public static ParticipationTargetSubject fromValue(String v) {
        return valueOf(v);
    }

}
