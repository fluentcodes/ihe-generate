
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ActTaskClinicalNoteEntryCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ActTaskClinicalNoteEntryCode"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="CLINNOTEE"/&gt;
 *     &lt;enumeration value="DIAGLISTE"/&gt;
 *     &lt;enumeration value="DISCHSUME"/&gt;
 *     &lt;enumeration value="PATREPE"/&gt;
 *     &lt;enumeration value="PROBLISTE"/&gt;
 *     &lt;enumeration value="RADREPE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActTaskClinicalNoteEntryCode")
@XmlEnum
public enum ActTaskClinicalNoteEntryCode {

    CLINNOTEE,
    DIAGLISTE,
    DISCHSUME,
    PATREPE,
    PROBLISTE,
    RADREPE;

    public String value() {
        return name();
    }

    public static ActTaskClinicalNoteEntryCode fromValue(String v) {
        return valueOf(v);
    }

}
