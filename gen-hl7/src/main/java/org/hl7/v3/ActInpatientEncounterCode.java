
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActInpatientEncounterCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActInpatientEncounterCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="IMP"/&gt;
 *     &lt;enumeration value="ACUTE"/&gt;
 *     &lt;enumeration value="NONAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActInpatientEncounterCode")
@XmlEnum
public enum ActInpatientEncounterCode {

    IMP,
    ACUTE,
    NONAC;

    public String value() {
        return name();
    }

    public static ActInpatientEncounterCode fromValue(String v) {
        return valueOf(v);
    }

}
