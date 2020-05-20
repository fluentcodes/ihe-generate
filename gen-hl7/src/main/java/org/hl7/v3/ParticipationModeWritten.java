
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParticipationModeWritten.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationModeWritten"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="WRITTEN"/&gt;
 *     &lt;enumeration value="EMAILWRIT"/&gt;
 *     &lt;enumeration value="HANDWRIT"/&gt;
 *     &lt;enumeration value="FAXWRIT"/&gt;
 *     &lt;enumeration value="TYPEWRIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipationModeWritten")
@XmlEnum
public enum ParticipationModeWritten {

    WRITTEN,
    EMAILWRIT,
    HANDWRIT,
    FAXWRIT,
    TYPEWRIT;

    public String value() {
        return name();
    }

    public static ParticipationModeWritten fromValue(String v) {
        return valueOf(v);
    }

}
