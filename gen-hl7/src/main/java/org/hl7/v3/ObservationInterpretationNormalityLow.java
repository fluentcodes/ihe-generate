
package org.hl7.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ObservationInterpretationNormalityLow.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ObservationInterpretationNormalityLow"&gt;
 *   &lt;restriction base="{urn:hl7-org:v3}cs"&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="LL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ObservationInterpretationNormalityLow")
@XmlEnum
public enum ObservationInterpretationNormalityLow {

    L,
    LL;

    public String value() {
        return name();
    }

    public static ObservationInterpretationNormalityLow fromValue(String v) {
        return valueOf(v);
    }

}
