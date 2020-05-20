
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MedicationObservationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicationObservationType"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="SPLCOATING"/&gt;
 *     &lt;enumeration value="SPLCOLOR"/&gt;
 *     &lt;enumeration value="SPLIMAGE"/&gt;
 *     &lt;enumeration value="SPLIMPRINT"/&gt;
 *     &lt;enumeration value="REP_HALF_LIFE"/&gt;
 *     &lt;enumeration value="SPLSCORING"/&gt;
 *     &lt;enumeration value="SPLSHAPE"/&gt;
 *     &lt;enumeration value="SPLSIZE"/&gt;
 *     &lt;enumeration value="SPLSYMBOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MedicationObservationType")
@XmlEnum
public enum MedicationObservationType {

    SPLCOATING,
    SPLCOLOR,
    SPLIMAGE,
    SPLIMPRINT,
    REP_HALF_LIFE,
    SPLSCORING,
    SPLSHAPE,
    SPLSIZE,
    SPLSYMBOL;

    public String value() {
        return name();
    }

    public static MedicationObservationType fromValue(String v) {
        return valueOf(v);
    }

}
