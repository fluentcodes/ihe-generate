
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für x_ActEncounterReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActEncounterReason"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="MEDNEC"/&gt;
 *     &lt;enumeration value="PAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "x_ActEncounterReason")
@XmlEnum
public enum XActEncounterReason {

    MEDNEC,
    PAT;

    public String value() {
        return name();
    }

    public static XActEncounterReason fromValue(String v) {
        return valueOf(v);
    }

}
